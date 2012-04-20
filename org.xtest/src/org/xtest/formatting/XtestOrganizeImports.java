package org.xtest.formatting;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.core.formatting.OrganizeImports;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.xtest.xTest.Body;
import org.xtest.xTest.XTestPackage;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Custom import organizer that organizes imports for Xtest files instead of Xtend files
 * 
 * Overridden methods borrowed from Xtend 2.3 implementation, with changes made specifically for
 * Xtest. Hopefully in subsequent versions of Xtend this could become more easily extensible
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestOrganizeImports extends OrganizeImports {

    @Inject
    private Provider<ReferenceAcceptor> referenceAcceptorProvider;

    @Override
    public void collectAllReferences(XtextResource resource, ReferenceAcceptor acceptor) {
        Body xtendFile = getXtestFile(resource);
        TreeIterator<EObject> contents = EcoreUtil.getAllContents(xtendFile, true);
        while (contents.hasNext()) {
            EObject next = contents.next();
            if (next instanceof JvmTypeReference) {
                acceptor.acceptType((JvmTypeReference) next);
            } else if (next instanceof XAnnotation) {
                acceptor.acceptType(((XAnnotation) next).getAnnotationType());
            } else if (next instanceof XInstanceOfExpression) {
                acceptor.acceptType(((XInstanceOfExpression) next).getType());
            } else if (next instanceof XConstructorCall) {
                acceptor.acceptType(((XConstructorCall) next).getConstructor().getDeclaringType());
            } else if (next instanceof XTypeLiteral) {
                acceptor.acceptType(((XTypeLiteral) next).getType());
            } else if (next instanceof XFeatureCall) {
                final XFeatureCall featureCall = (XFeatureCall) next;
                if (featureCall.getDeclaringType() == null) {
                    final JvmIdentifiableElement member = featureCall.getFeature();
                    if (member instanceof JvmOperation) {
                        if (((JvmOperation) member).isStatic()) {
                            acceptor.acceptStaticImport((JvmMember) member);
                        }
                    }
                    if (member instanceof JvmField) {
                        if (((JvmField) member).isStatic()) {
                            acceptor.acceptStaticImport((JvmMember) member);
                        }
                    }
                } else {
                    acceptor.acceptType(featureCall.getDeclaringType());
                }
            } else if (next instanceof XMemberFeatureCall || next instanceof XBinaryOperation
                    || next instanceof XUnaryOperation || next instanceof XAssignment) {
                final XAbstractFeatureCall featureCall = (XAbstractFeatureCall) next;
                final JvmIdentifiableElement member = featureCall.getFeature();
                if (member instanceof JvmOperation) {
                    if (((JvmOperation) member).isStatic()) {
                        acceptor.acceptStaticExtensionImport((JvmMember) member);
                    }
                }
                if (member instanceof JvmField) {
                    if (((JvmField) member).isStatic()) {
                        acceptor.acceptStaticExtensionImport((JvmMember) member);
                    }
                }
            }
        }
    }

    @Override
    public TextRegion computeRegion(XtextResource resource) {
        final Body xtestFile = getXtestFile(resource);
        if (xtestFile == null) {
            return null;
        }
        List<INode> fileparams = NodeModelUtils.findNodesForFeature(xtestFile,
                XTestPackage.Literals.BODY__FILEPARAM);
        int offset = 0;
        if (fileparams.size() >= 1) {
            INode last = Iterables.getLast(fileparams);
            offset = last.getTotalOffset() + last.getLength();
        }
        EList<XExpression> expressions = xtestFile.getExpressions();
        int length = NodeModelUtils.findActualNodeFor(xtestFile).getLength() - offset;
        if (expressions.size() > 0) {
            XExpression object = expressions.get(0);
            ICompositeNode node = NodeModelUtils.getNode(object);
            if (node == null) {
                throw new IllegalStateException("Cannot find node for clazz "
                        + xtestFile.getClass().getName());
            }
            length = node.getOffset() - offset;
        }
        return new TextRegion(offset, length);
    }

    @Override
    public String getOrganizedImportSection(XtextResource state) {
        String trim = super.getOrganizedImportSection(state).trim();
        if (!trim.isEmpty()) {
            trim += "\n\n";
        }
        final Body xtestFile = getXtestFile(state);
        List<INode> fileparams = NodeModelUtils.findNodesForFeature(xtestFile,
                XTestPackage.Literals.BODY__FILEPARAM);
        if (fileparams.size() >= 1) {
            trim = "\n" + trim;
        }
        return trim;
    }

    @Override
    public ReferenceAcceptor intitializeReferenceAcceptor(XtextResource state) {
        ReferenceAcceptor acceptor = referenceAcceptorProvider.get();
        final Body xtendFile = getXtestFile(state);
        if (xtendFile == null) {
            return null;
        }
        collectAllReferences(state, acceptor);
        acceptor.addImplicitlyImportedPackages(newArrayList("java.lang"));
        return acceptor;
    }

    private Body getXtestFile(XtextResource resource) {
        if (resource.getContents().isEmpty()) {
            return null;
        }
        final EObject eObject = resource.getContents().get(0);
        if (!(eObject instanceof Body)) {
            return null;
        }
        final Body xtendFile = (Body) eObject;
        return xtendFile;
    }
}
