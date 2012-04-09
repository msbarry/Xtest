package org.xtest.ui.mediator;

import org.xtest.results.XTestResult;

public interface IXtestListener {

    void validationFinished(XTestResult result);

    void validationStarted();

}
