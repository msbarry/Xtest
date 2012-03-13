package org.xtest.generator.contentassist;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.generator.contentAssist.JavaBasedContentAssistFragment;

import com.google.common.collect.Lists;

/**
 * Custom content assist fragment that has additional dontOverrideMethods field that when set to
 * true stops the generator from creating methods in the abstract content assist proposal provider
 * that would override those from a superclass.
 * 
 * @author Michael Barry
 */
public class XtestContentAssistFragment extends JavaBasedContentAssistFragment {
    private static final Logger logger = Logger.getLogger(XtestContentAssistFragment.class);

    private boolean dontOverrideMethods = false;

    @Override
    public void generate(Grammar grammar, XpandExecutionContext ctx) {
        if (dontOverrideMethods) {
            Grammar grammar2 = EcoreUtil2.clone(grammar);
            List<AbstractRule> toRemove = Lists.newArrayList();

            for (Grammar other : grammar2.getUsedGrammars()) {
                for (AbstractRule rule : other.getRules()) {
                    for (AbstractRule rule2 : grammar2.getRules()) {
                        if (rule2.getName().equals(rule.getName())) {
                            toRemove.add(rule2);
                            logger.info("Skipping content assist generation for " + rule.getName());
                        }
                    }
                }
            }
            grammar2.getRules().removeAll(toRemove);
            grammar = grammar2;
        }
        super.generate(grammar, ctx);
    }

    /**
     * Returns the value of the don't override flag
     * 
     * @return The value of the don't override flag
     */
    public boolean isDontOverrideMethods() {
        return dontOverrideMethods;
    }

    /**
     * Sets the don't override flag that stops the generator from creating methods in the abstract
     * content assist proposal provider that would override those from a superclass. <br>
     * <br>
     * This flag is false by default.
     * 
     * @param dontOverrideMethods
     *            The new value for the don't override flag
     */
    public void setDontOverrideMethods(boolean dontOverrideMethods) {
        this.dontOverrideMethods = dontOverrideMethods;
    }

    @Override
    protected String getTemplate() {
        return JavaBasedContentAssistFragment.class.getName().replaceAll("\\.", "::");
    }
}
