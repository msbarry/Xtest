package org.xtest.runner;

import org.eclipse.core.resources.IFile;

public interface ITestType {
    ITestRunner provideNewRunner();

    boolean supports(IFile file);

}
