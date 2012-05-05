package org.xtest.ui.runner;

import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.ui.validation.DefaultResourceUIValidatorExtension;
import org.eclipse.xtext.validation.CheckMode;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.inject.Inject;

public class RunAllJob extends Job {
    private final PriorityBlockingQueue<FileWrapper> files = new PriorityBlockingQueue<FileWrapper>();

    @Inject
    private IStorage2UriMapper mapper;
    @Inject
    private IResourceSetProvider resourceSetProvider;

    @Inject
    private DefaultResourceUIValidatorExtension validator;

    public RunAllJob() {
        super("Xtest");
        // TODO need persistent thread draining events from the queue
    }

    public void addPendingTests(Set<IFile> affected) {
        for (IFile file : affected) {
            try {
                FileWrapper fileWrapper = new FileWrapper(file, mapper.getUri(file));
                if (!files.contains(fileWrapper)) {
                    files.offer(fileWrapper);
                }
            } catch (CoreException e) {
            }
        }
    }

    @Override
    protected void canceling() {
        super.canceling();
        getThread().interrupt();
    }

    @Override
    protected IStatus run(final IProgressMonitor monitor) {
        // Wait for builds to finish
        try {
            getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD,
                    new SubProgressMonitor(monitor, 1));
            getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD,
                    new SubProgressMonitor(monitor, 1));
        } catch (OperationCanceledException e) {
        } catch (InterruptedException e) {
        }
        Cache<IProject, ResourceSet> cache = CacheBuilder.newBuilder().build(
                new CacheLoader<IProject, ResourceSet>() {
                    @Override
                    public ResourceSet load(IProject key) throws Exception {
                        return resourceSetProvider.get(key);
                    }
                });
        SubMonitor convert = SubMonitor.convert(monitor, "Running Tests", files.size());
        System.err.println("run " + files.size());
        while (!monitor.isCanceled() && !files.isEmpty()) {
            FileWrapper peek = files.peek();
            URI uri = mapper.getUri(peek.file);
            ResourceSet resourceSet = cache.getUnchecked(peek.file.getProject());
            Resource resource = resourceSet.getResource(uri, true);
            convert.subTask(uri.lastSegment().replaceFirst("\\." + uri.fileExtension() + "$", ""));
            long start = System.nanoTime();
            validator.updateValidationMarkers(peek.file, resource, CheckMode.EXPENSIVE_ONLY,
                    convert.newChild(1));
            long end = System.nanoTime();
            try {
                peek.file.setPersistentProperty(new QualifiedName("org.xtest", "time"),
                        Long.toString(end - start));
            } catch (CoreException e) {
            }
            files.remove(peek);
        }
        monitor.done();
        return Status.OK_STATUS;
    }

    private class FileWrapper implements Comparable<FileWrapper> {
        private final IFile file;
        private final URI uri;
        private Long weight;

        public FileWrapper(IFile file, URI uri) throws CoreException {
            this.file = file;
            this.uri = uri;
            String persistentProperty = file.getPersistentProperty(new QualifiedName("org.xtest",
                    "time"));
            try {
                weight = Long.valueOf(persistentProperty);
            } catch (NumberFormatException e) {
                weight = 0L;
            }

        }

        @Override
        public int compareTo(FileWrapper arg0) {
            return weight.compareTo(arg0.weight);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            FileWrapper other = (FileWrapper) obj;
            if (!getOuterType().equals(other.getOuterType())) {
                return false;
            }
            if (uri == null) {
                if (other.uri != null) {
                    return false;
                }
            } else if (!uri.equals(other.uri)) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getOuterType().hashCode();
            result = prime * result + (uri == null ? 0 : uri.hashCode());
            return result;
        }

        private RunAllJob getOuterType() {
            return RunAllJob.this;
        }
    }

}
