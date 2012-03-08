package org.xtest.ui;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.xtext.common.types.xtext.ui.JdtValidationJobScheduler;
import org.eclipse.xtext.ui.editor.model.XtextDocument;

/**
 * Custom validation job scheduler for XTest documents that schedules a refresh whenever a document
 * opens
 * 
 * @author Michael Barry
 */
public class XtestValidationJobScheduler extends JdtValidationJobScheduler {
    @Override
    protected void doScheduleInitialValidation(XtextDocument document) {
        Job validationJob = document.getValidationJob();
        if (validationJob != null) {
            validationJob.cancel();
            validationJob.schedule();
        }
    }
}
