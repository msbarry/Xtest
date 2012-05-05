package org.xtest.ui.runner;

import java.util.Collections;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.jobs.Job;

import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class BuildFinishedListener implements IResourceChangeListener {
    private final RunAllJob runAll;

    @Inject
    public BuildFinishedListener(RunAllJob runAll) {
        this.runAll = runAll;
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        workspace.addResourceChangeListener(this, IResourceChangeEvent.POST_BUILD
                | IResourceChangeEvent.PRE_BUILD);
        runAll.setPriority(Job.LONG);
    }

    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        if ((event.getType() & IResourceChangeEvent.POST_BUILD) > 0
                && event.getBuildKind() == IncrementalProjectBuilder.CLEAN_BUILD) {
            clean(event);
        } else if ((event.getType() & (IResourceChangeEvent.POST_BUILD | IResourceChangeEvent.POST_CHANGE)) > 0) {
            build(event);
        }
    }

    public void schedule(IFile file) {
        runAll.addPendingTests(Collections.singleton(file));
    }

    private void build(IResourceChangeEvent event) {
        Set<IFile> changedFiles = collectDeltas(event);
        Set<IFile> affected = getTestAffectedBy(changedFiles);
        if (!affected.isEmpty()) {
            runAll.addPendingTests(affected);
            System.err.println("Built " + changedFiles);
            cancel();
            start();
        }
    }

    private void cancel() {
        System.err.println("Cancel");
        runAll.cancel();
    }

    private void clean(IResourceChangeEvent event) {
        // TODO clear markers from each cleaned project
        cancel();

        if (event.getResource() instanceof IProject) {
            System.err.println("Clean " + event.getResource());
        }
        Set<IFile> xtestFiles = collectXtestFiles();
        for (IFile file : xtestFiles) {
            clearXtestFile(file);
        }
    }

    private void clearXtestFile(IFile file) {
        try {
            file.deleteMarkers("org.xtest.runner", true, IResource.DEPTH_INFINITE);
        } catch (CoreException e) {
        }
    }

    private Set<IFile> collectDeltas(IResourceChangeEvent event) {
        final Set<IFile> changedFiles = Sets.newHashSet();
        try {
            event.getDelta().accept(new IResourceDeltaVisitor() {

                @Override
                public boolean visit(IResourceDelta delta) throws CoreException {
                    if (delta.getResource() instanceof IFile
                            && (delta.getFlags() & (IResourceDelta.CONTENT
                                    | IResourceDelta.MOVED_FROM | IResourceDelta.MOVED_TO
                                    | IResourceDelta.ADDED | IResourceDelta.REMOVED | IResourceDelta.LOCAL_CHANGED)) > 0) {
                        changedFiles.add((IFile) delta.getResource());
                    }
                    return true;
                }
            });
        } catch (CoreException e) {
        }
        return changedFiles;
    }

    private Set<IFile> collectXtestFiles() {
        final Set<IFile> xtestFiles = Sets.newHashSet();
        try {
            ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {
                @Override
                public boolean visit(IResource resource) throws CoreException {
                    String fileExtension = resource.getFileExtension();
                    if (fileExtension != null && fileExtension.equals("xtest")
                            && resource instanceof IFile && !resource.isDerived()) {
                        xtestFiles.add((IFile) resource);
                    }
                    return true;
                }
            });
        } catch (CoreException e) {
        }
        return xtestFiles;
    }

    private boolean deltaAffectsTest(Set<IFile> deltas, IFile xtestFile) {
        Object sessionProperty = null;
        try {
            sessionProperty = xtestFile.getSessionProperty(new QualifiedName("org.xtest",
                    "affectedBy"));
        } catch (CoreException e) {
        }
        if (sessionProperty == null) {
            // Test not run yet, need to run
            return true;
        } else if (sessionProperty instanceof Set) {
            for (IFile delta : deltas) {
                Set<?> property = (Set<?>) sessionProperty;
                if (delta.getLocationURI().equals(xtestFile.getLocationURI())) {
                    // Test affects itself
                    return true;
                } else if (delta.getFileExtension() != null
                        && delta.getFileExtension().equalsIgnoreCase("class")) {
                    return property.contains(delta.getLocationURI().toString());
                }
            }
        }
        return false;
    }

    private Set<IFile> getTestAffectedBy(Set<IFile> changedFiles) {
        Set<IFile> xtestFiles = collectXtestFiles();
        Set<IFile> result = Sets.newHashSet();
        for (IFile xtestFile : xtestFiles) {
            if (deltaAffectsTest(changedFiles, xtestFile)) {
                result.add(xtestFile);
            }
        }
        return result;
    }

    private void start() {
        System.err.println("Starting");
        runAll.schedule();
    }
}
