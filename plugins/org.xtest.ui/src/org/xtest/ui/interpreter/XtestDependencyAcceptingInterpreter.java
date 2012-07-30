package org.xtest.ui.interpreter;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IStorage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.XExpression;
import org.xtest.interpreter.XTestInterpreter;
import org.xtest.runner.external.DependencyAcceptor;
import org.xtest.ui.resource.XtestDependencyAcceptingResource;
import org.xtest.xTest.XMethodDef;

import com.google.common.base.Optional;
import com.google.inject.Inject;

/**
 * Custom Xtest IDE interpreter that records xtest files as dependencies when this file invokes a
 * method defined in another other file.
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestDependencyAcceptingInterpreter extends XTestInterpreter {
    @Inject
    private IStorage2UriMapper mapper;

    @Override
    protected Object invokeXtestMethod(XMethodDef method, List<Object> argumentValues) {
        URI eResource = method.eResource().getURI();
        XExpression firstElement = getCallStack().firstElement();
        XtestDependencyAcceptingResource eResource2 = (XtestDependencyAcceptingResource) firstElement
                .eResource();
        Optional<DependencyAcceptor> acceptor = eResource2.getAcceptor();
        if (acceptor.isPresent()) {
            DependencyAcceptor dependencyAcceptor = acceptor.get();
            Iterable<Pair<IStorage, IProject>> storages = mapper.getStorages(eResource);
            for (Pair<IStorage, IProject> storage : storages) {
                IStorage first = storage.getFirst();
                if (first instanceof IFile) {
                    IFile file = (IFile) first;
                    java.net.URI uriForFile = org.xtest.runner.util.URIUtil.getURIForFile(file);
                    dependencyAcceptor.accept(uriForFile);
                }
            }
        }
        return super.invokeXtestMethod(method, argumentValues);
    }
}
