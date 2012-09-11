package org.xtest.jvmmodel;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.jvmmodel.XtendJvmModelInferrer;
import org.eclipse.xtend.core.xtend.XtendParameter;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.xtest.xTest.XMethodDef;
import org.xtest.xTest.impl.BodyImplCustom;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * Infers a JVM Model (classes, methods, etc.) from the xtest model.
 * 
 * Each Xtest file is a class. Each method def is a method of that class. The rest is interpreted.
 */
@SuppressWarnings("all")
public class XTestJvmModelInferrer extends XtendJvmModelInferrer {
    @Inject
    private IJvmModelAssociator associator;
    @Inject
    private JvmTypesBuilder builder;
    @Inject
    private ITypeProvider computer;
    @Inject
    private TypesFactory factory;
    @Inject
    private TypeReferences typeRefs;

    @Override
    public void infer(EObject e, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
        if (e instanceof BodyImplCustom) {
            BodyImplCustom body = (BodyImplCustom) e;
            JvmGenericType type = factory.createJvmGenericType();
            type.setSimpleName(body.getTypeName());
            type.setVisibility(JvmVisibility.PUBLIC);
            associator.associatePrimary(body, type);
            acceptor.accept(type).initializeLater(typeBuilder(body));
        }
    }

    protected Iterable<XMethodDef> getMethodDefs(final BodyImplCustom body) {
        Iterable<EObject> contents = new Iterable<EObject>() {
            @Override
            public Iterator<EObject> iterator() {
                return body.eAllContents();
            }
        };
        Iterable<XMethodDef> defs = Iterables.filter(contents, XMethodDef.class);
        return defs;
    }

    protected void translate(JvmGenericType type, final XMethodDef def) {
        if (def.getName() != null) {
            JvmOperation op = factory.createJvmOperation();
            type.getMembers().add(op);
            op.setSimpleName(def.getName());
            op.setVisibility(JvmVisibility.PUBLIC);
            JvmTypeReference returnType = def.getReturnType();
            returnType = returnType == null ? getTypeProxy(op) : builder
                    .cloneWithProxies(returnType);
            op.setReturnType(returnType);
            op.setStatic(def.isStatic());
            String documentation = builder.getDocumentation(def);
            builder.setDocumentation(op, documentation);
            for (XtendParameter param : def.getParameters()) {
                translateParameter(op, param);
            }
            copyAndFixTypeParameters(def.getTypeParameters(), op);

            builder.setBody(op, def.getExpression());
            associator.associatePrimary(def, op);
        }
    }

    private void initializeType(final BodyImplCustom body, JvmGenericType type) {
        builder.setDocumentation(type, builder.getDocumentation(body));
        for (final XMethodDef def : getMethodDefs(body)) {
            translate(type, def);
        }
    }

    private void translate(JvmOperation op, JvmFormalParameter param) {
        op.getParameters().add(builder.cloneWithProxies(param));
        associator.associatePrimary(op, param);
    }

    private Procedure1<JvmGenericType> typeBuilder(final BodyImplCustom body) {
        return new Procedure1<JvmGenericType>() {
            public void apply(JvmGenericType type) {
                initializeType(body, type);
            }
        };
    };
}
