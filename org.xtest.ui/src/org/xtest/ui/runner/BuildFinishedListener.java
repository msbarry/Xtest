package org.xtest.ui.runner;

import java.util.Set;

import org.eclipse.core.resources.IFile;
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
        runAll.setPriority(Job.BUILD);
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

    private void build(IResourceChangeEvent event) {
        Set<IFile> changedFiles = collectDeltas(event);
        Set<IFile> affected = getTestAffectedBy(changedFiles);
        if (!changedFiles.isEmpty()) {
            runAll.addPendingTests(affected);
            System.err.println("Built " + changedFiles);
            start();
        }
    }

    private void cancel() {
        System.err.println("Cancel");
        runAll.cancel();
    }

    private void clean(IResourceChangeEvent event) {
        // TODO clear markers from each cleaned project
        System.err.println("Clean");
        cancel();
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

    private boolean deltaAffectsTest(IFile delta, IFile xtestFile) {
        try {
            Object sessionProperty = xtestFile.getSessionProperty(new QualifiedName("org.xtest",
                    "affectedBy"));
            if (sessionProperty == null) {
                return true;
            } else if (sessionProperty instanceof Set) {
                return ((Set<?>) sessionProperty).contains(delta.getFullPath().toString());
            }
        } catch (CoreException e) {
        }
        return false;
    }

    private Set<IFile> getTestAffectedBy(Set<IFile> changedFiles) {
        Set<IFile> xtestFiles = collectXtestFiles();
        Set<IFile> result = Sets.newHashSet();
        for (IFile delta : changedFiles) {
            for (IFile xtestFile : xtestFiles) {
                if (deltaAffectsTest(delta, xtestFile)) {
                    result.add(xtestFile);
                }
            }
            xtestFiles.removeAll(result);
        }
        return result;
    }

    private void preBuild(IResourceChangeEvent event) {
        Set<IFile> collectDeltas = collectDeltas(event);
        if (!collectDeltas.isEmpty()) {
            cancel();
        }
    }

    private void start() {
        if (runAll.getState() != Job.RUNNING) {
            System.err.println("Starting");
            runAll.schedule();
        }
    }
}
