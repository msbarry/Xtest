package org.xtest.compiler;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;

/**
 * Dummy compiler for now, maybe implement something later
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestJvmModelGenerator extends JvmModelGenerator {
    @Override
    public void doGenerate(Resource input, IFileSystemAccess fsa) {
        // TODO Do nothing for now
    }
}
