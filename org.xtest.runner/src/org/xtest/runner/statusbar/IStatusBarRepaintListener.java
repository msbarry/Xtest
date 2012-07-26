package org.xtest.runner.statusbar;

/**
 * Interface for something that listens on status bar notifications
 * 
 * @author Michael Barry
 */
public interface IStatusBarRepaintListener {

    /**
     * Notify this listener that it needs to repaint
     */
    void schedulePaint();

}
