package org.xtest.preferences;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.xtest.xTest.Body;
import org.xtest.xTest.FileParam;

import com.google.inject.Inject;

/**
 * Provider for the actual value of a preference to use at runtime for a particular file. Overrides
 * defaults with customized per-file settings
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class PerFilePreferenceProvider {
    @Inject
    private DefaultPreferenceProvider provider;

    /**
     * Returns the actual value of {@code pref} for the xtest file contained in {@code main}
     * 
     * @param main
     *            The {@link Body} of the xtest file
     * @param pref
     *            The {@link RuntimePref} preference to get the actual value for
     * @return The actual value of {@code pref} for {@code main}
     */
    public boolean get(Body main, RuntimePref pref) {
        boolean result = provider.getDefault(pref);
        EList<FileParam> fileparams = main.getFileparam();
        for (FileParam param : fileparams) {
            JvmEnumerationLiteral feature = param.getFeature();
            if (feature != null && pref.toString().equals(feature.getSimpleName())) {
                result = ((XBooleanLiteral) param.getValue()).isIsTrue();
            }
        }
        return result;
    }
}
