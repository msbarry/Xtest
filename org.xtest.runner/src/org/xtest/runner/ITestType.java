package org.xtest.runner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.SubMonitor;

public interface ITestType {

    TestResult run(IFile fFile, SubMonitor convert, DependencyAcceptor acceptor);

    boolean supports(IFile file);

}
