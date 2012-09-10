package org.xtest.ui.editor;

import java.util.List;

import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.DocumentTokenSource;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.ITextEditComposer;

import com.google.common.collect.Lists;
import com.google.common.eventbus.EventBus;
import com.google.inject.Inject;

/**
 * Custom Xtext Document that allows objects to ask to be unregistered from the event bus when the
 * document is disposed.
 * 
 * @author Michael Barry
 */
public class XtestDocument extends XtextDocument {
    @Inject
    private EventBus bus;
    private XtextResource resource;
    private final List<Object> toUnregister = Lists.newArrayList();

    @Inject
    public XtestDocument(DocumentTokenSource tokenSource, ITextEditComposer composer) {
        super(tokenSource, composer);
    }

    @Override
    public void disposeInput() {
        super.disposeInput();
        for (Object obj : toUnregister) {
            bus.unregister(obj);
        }
    }

    public XtextResource getResource() {
        return resource;
    }

    @Override
    public void setInput(XtextResource resource) {
        this.resource = resource;
        super.setInput(resource);
    }

    /**
     * Adds the object to the list of objects that will be unregistered from the event bus on
     * dispose
     * 
     * @param object
     *            The object to unregister on dispose
     */
    public void unregisterOnDispose(Object object) {
        toUnregister.add(object);
    }
}
