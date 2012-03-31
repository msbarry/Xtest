package org.xtest.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtest.services.XTestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalXTestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'import'", "'static'", "'.'", "'*'", "'xsuite'", "'xtest'", "'assert'", "'throws'", "':='", "'<'", "','", "'>'", "'class'", "'('", "')'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=6;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_DECIMAL=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalXTestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXTestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXTestParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g"; }



     	private XTestGrammarAccess grammarAccess;
     	
        public InternalXTestParser(TokenStream input, XTestGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Body";	
       	}
       	
       	@Override
       	protected XTestGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBody"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:67:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:68:2: (iv_ruleBody= ruleBody EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:69:2: iv_ruleBody= ruleBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBodyRule()); 
            }
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody75);
            iv_ruleBody=ruleBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:76:1: ruleBody returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_imports_1_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:79:28: ( ( () ( (lv_imports_1_0= ruleImport ) )* ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:80:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:80:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:80:2: () ( (lv_imports_1_0= ruleImport ) )* ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:80:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:81:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBodyAccess().getBodyAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:86:2: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:87:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:87:1: (lv_imports_1_0= ruleImport )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:88:3: lv_imports_1_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBodyAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleBody140);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_1_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:104:3: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_DECIMAL)||(LA3_0>=18 && LA3_0<=20)||LA3_0==23||(LA3_0>=26 && LA3_0<=27)||(LA3_0>=40 && LA3_0<=41)||LA3_0==45||LA3_0==49||LA3_0==52||LA3_0==54||LA3_0==56||(LA3_0>=60 && LA3_0<=65)||(LA3_0>=67 && LA3_0<=74)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:104:4: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:104:4: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:105:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:105:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:106:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBodyAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleBody163);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:122:2: (otherlv_3= ';' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==13) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:122:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleBody176); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleImport"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:134:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:135:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:136:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport216);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport226); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:143:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( ( ruleQualifiedName ) ) otherlv_3= '.' otherlv_4= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_6_0= ruleQualifiedNamespaceWithWildcard ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:146:28: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( ( ruleQualifiedName ) ) otherlv_3= '.' otherlv_4= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_6_0= ruleQualifiedNamespaceWithWildcard ) ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:147:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( ( ruleQualifiedName ) ) otherlv_3= '.' otherlv_4= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_6_0= ruleQualifiedNamespaceWithWildcard ) ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:147:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( ( ruleQualifiedName ) ) otherlv_3= '.' otherlv_4= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_6_0= ruleQualifiedNamespaceWithWildcard ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:147:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( ( ruleQualifiedName ) ) otherlv_3= '.' otherlv_4= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_6_0= ruleQualifiedNamespaceWithWildcard ) ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:151:1: ( ( ( (lv_static_1_0= 'static' ) ) ( ( ruleQualifiedName ) ) otherlv_3= '.' otherlv_4= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_6_0= ruleQualifiedNamespaceWithWildcard ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:151:2: ( ( (lv_static_1_0= 'static' ) ) ( ( ruleQualifiedName ) ) otherlv_3= '.' otherlv_4= '*' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:151:2: ( ( (lv_static_1_0= 'static' ) ) ( ( ruleQualifiedName ) ) otherlv_3= '.' otherlv_4= '*' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:151:3: ( (lv_static_1_0= 'static' ) ) ( ( ruleQualifiedName ) ) otherlv_3= '.' otherlv_4= '*'
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:151:3: ( (lv_static_1_0= 'static' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:152:1: (lv_static_1_0= 'static' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:152:1: (lv_static_1_0= 'static' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:153:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,15,FOLLOW_15_in_ruleImport283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_1_0, grammarAccess.getImportAccess().getStaticStaticKeyword_1_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getImportRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:166:2: ( ( ruleQualifiedName ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:167:1: ( ruleQualifiedName )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:167:1: ( ruleQualifiedName )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:168:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getImportRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getStaticImportJvmTypeCrossReference_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport319);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleImport331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getImportAccess().getFullStopKeyword_1_0_2());
                          
                    }
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleImport343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getImportAccess().getAsteriskKeyword_1_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:190:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:190:6: ( ( ruleQualifiedName ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:191:1: ( ruleQualifiedName )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:191:1: ( ruleQualifiedName )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:192:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getImportRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getTypeImportJvmTypeCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport373);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:206:6: ( (lv_importedNamespace_6_0= ruleQualifiedNamespaceWithWildcard ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:206:6: ( (lv_importedNamespace_6_0= ruleQualifiedNamespaceWithWildcard ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:207:1: (lv_importedNamespace_6_0= ruleQualifiedNamespaceWithWildcard )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:207:1: (lv_importedNamespace_6_0= ruleQualifiedNamespaceWithWildcard )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:208:3: lv_importedNamespace_6_0= ruleQualifiedNamespaceWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNamespaceWithWildcardParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNamespaceWithWildcard_in_ruleImport400);
                    lv_importedNamespace_6_0=ruleQualifiedNamespaceWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportRule());
                      	        }
                             		set(
                             			current, 
                             			"importedNamespace",
                              		lv_importedNamespace_6_0, 
                              		"QualifiedNamespaceWithWildcard");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNamespaceWithWildcard"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:232:1: entryRuleQualifiedNamespaceWithWildcard returns [String current=null] : iv_ruleQualifiedNamespaceWithWildcard= ruleQualifiedNamespaceWithWildcard EOF ;
    public final String entryRuleQualifiedNamespaceWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNamespaceWithWildcard = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:233:2: (iv_ruleQualifiedNamespaceWithWildcard= ruleQualifiedNamespaceWithWildcard EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:234:2: iv_ruleQualifiedNamespaceWithWildcard= ruleQualifiedNamespaceWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNamespaceWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNamespaceWithWildcard_in_entryRuleQualifiedNamespaceWithWildcard438);
            iv_ruleQualifiedNamespaceWithWildcard=ruleQualifiedNamespaceWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNamespaceWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNamespaceWithWildcard449); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNamespaceWithWildcard"


    // $ANTLR start "ruleQualifiedNamespaceWithWildcard"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:241:1: ruleQualifiedNamespaceWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNamespaceWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:244:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:245:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:245:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:246:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNamespaceWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNamespaceWithWildcard496);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNamespaceWithWildcard514); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNamespaceWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedNamespaceWithWildcard527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNamespaceWithWildcardAccess().getAsteriskKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNamespaceWithWildcard"


    // $ANTLR start "entryRuleUniqueName"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:276:1: entryRuleUniqueName returns [EObject current=null] : iv_ruleUniqueName= ruleUniqueName EOF ;
    public final EObject entryRuleUniqueName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueName = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:277:2: (iv_ruleUniqueName= ruleUniqueName EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:278:2: iv_ruleUniqueName= ruleUniqueName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniqueNameRule()); 
            }
            pushFollow(FOLLOW_ruleUniqueName_in_entryRuleUniqueName567);
            iv_ruleUniqueName=ruleUniqueName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniqueName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueName577); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUniqueName"


    // $ANTLR start "ruleUniqueName"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:285:1: ruleUniqueName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_identifier_1_0= ruleXParenthesizedExpression ) )? ) ;
    public final EObject ruleUniqueName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_identifier_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:288:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_identifier_1_0= ruleXParenthesizedExpression ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:289:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_identifier_1_0= ruleXParenthesizedExpression ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:289:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_identifier_1_0= ruleXParenthesizedExpression ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:289:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_identifier_1_0= ruleXParenthesizedExpression ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:289:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:290:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:290:1: (lv_name_0_0= RULE_ID )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:291:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueName619); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getUniqueNameAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUniqueNameRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:307:2: ( (lv_identifier_1_0= ruleXParenthesizedExpression ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:308:1: (lv_identifier_1_0= ruleXParenthesizedExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:308:1: (lv_identifier_1_0= ruleXParenthesizedExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:309:3: lv_identifier_1_0= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUniqueNameAccess().getIdentifierXParenthesizedExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleUniqueName645);
                    lv_identifier_1_0=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUniqueNameRule());
                      	        }
                             		set(
                             			current, 
                             			"identifier",
                              		lv_identifier_1_0, 
                              		"XParenthesizedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUniqueName"


    // $ANTLR start "entryRuleXTestExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:333:1: entryRuleXTestExpression returns [EObject current=null] : iv_ruleXTestExpression= ruleXTestExpression EOF ;
    public final EObject entryRuleXTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTestExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:334:2: (iv_ruleXTestExpression= ruleXTestExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:335:2: iv_ruleXTestExpression= ruleXTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTestExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTestExpression_in_entryRuleXTestExpression682);
            iv_ruleXTestExpression=ruleXTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTestExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTestExpression692); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTestExpression"


    // $ANTLR start "ruleXTestExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:342:1: ruleXTestExpression returns [EObject current=null] : ( () (otherlv_1= 'xsuite' | otherlv_2= 'xtest' ) ( (lv_name_3_0= ruleUniqueName ) ) ( (lv_expression_4_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleXTestExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_name_3_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:345:28: ( ( () (otherlv_1= 'xsuite' | otherlv_2= 'xtest' ) ( (lv_name_3_0= ruleUniqueName ) ) ( (lv_expression_4_0= ruleXBlockExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:346:1: ( () (otherlv_1= 'xsuite' | otherlv_2= 'xtest' ) ( (lv_name_3_0= ruleUniqueName ) ) ( (lv_expression_4_0= ruleXBlockExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:346:1: ( () (otherlv_1= 'xsuite' | otherlv_2= 'xtest' ) ( (lv_name_3_0= ruleUniqueName ) ) ( (lv_expression_4_0= ruleXBlockExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:346:2: () (otherlv_1= 'xsuite' | otherlv_2= 'xtest' ) ( (lv_name_3_0= ruleUniqueName ) ) ( (lv_expression_4_0= ruleXBlockExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:346:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:347:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTestExpressionAccess().getXTestExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:352:2: (otherlv_1= 'xsuite' | otherlv_2= 'xtest' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:352:4: otherlv_1= 'xsuite'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleXTestExpression739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXTestExpressionAccess().getXsuiteKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:357:7: otherlv_2= 'xtest'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXTestExpression757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXTestExpressionAccess().getXtestKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:361:2: ( (lv_name_3_0= ruleUniqueName ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:362:1: (lv_name_3_0= ruleUniqueName )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:362:1: (lv_name_3_0= ruleUniqueName )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:363:3: lv_name_3_0= ruleUniqueName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTestExpressionAccess().getNameUniqueNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUniqueName_in_ruleXTestExpression779);
            lv_name_3_0=ruleUniqueName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTestExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"UniqueName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:379:2: ( (lv_expression_4_0= ruleXBlockExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:380:1: (lv_expression_4_0= ruleXBlockExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:380:1: (lv_expression_4_0= ruleXBlockExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:381:3: lv_expression_4_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTestExpressionAccess().getExpressionXBlockExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXTestExpression800);
            lv_expression_4_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTestExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XBlockExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTestExpression"


    // $ANTLR start "entryRuleXAssertExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:405:1: entryRuleXAssertExpression returns [EObject current=null] : iv_ruleXAssertExpression= ruleXAssertExpression EOF ;
    public final EObject entryRuleXAssertExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssertExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:406:2: (iv_ruleXAssertExpression= ruleXAssertExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:407:2: iv_ruleXAssertExpression= ruleXAssertExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssertExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAssertExpression_in_entryRuleXAssertExpression836);
            iv_ruleXAssertExpression=ruleXAssertExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssertExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssertExpression846); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssertExpression"


    // $ANTLR start "ruleXAssertExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:414:1: ruleXAssertExpression returns [EObject current=null] : ( () otherlv_1= 'assert' ( (lv_actual_2_0= ruleXExpression ) ) ( ( ( 'throws' )=>otherlv_3= 'throws' ) ( (lv_throws_4_0= ruleJvmTypeReference ) ) )? ) ;
    public final EObject ruleXAssertExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_actual_2_0 = null;

        EObject lv_throws_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:417:28: ( ( () otherlv_1= 'assert' ( (lv_actual_2_0= ruleXExpression ) ) ( ( ( 'throws' )=>otherlv_3= 'throws' ) ( (lv_throws_4_0= ruleJvmTypeReference ) ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:418:1: ( () otherlv_1= 'assert' ( (lv_actual_2_0= ruleXExpression ) ) ( ( ( 'throws' )=>otherlv_3= 'throws' ) ( (lv_throws_4_0= ruleJvmTypeReference ) ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:418:1: ( () otherlv_1= 'assert' ( (lv_actual_2_0= ruleXExpression ) ) ( ( ( 'throws' )=>otherlv_3= 'throws' ) ( (lv_throws_4_0= ruleJvmTypeReference ) ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:418:2: () otherlv_1= 'assert' ( (lv_actual_2_0= ruleXExpression ) ) ( ( ( 'throws' )=>otherlv_3= 'throws' ) ( (lv_throws_4_0= ruleJvmTypeReference ) ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:418:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:419:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXAssertExpressionAccess().getXAssertExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleXAssertExpression892); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXAssertExpressionAccess().getAssertKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:428:1: ( (lv_actual_2_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:429:1: (lv_actual_2_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:429:1: (lv_actual_2_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:430:3: lv_actual_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAssertExpressionAccess().getActualXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXAssertExpression913);
            lv_actual_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXAssertExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"actual",
                      		lv_actual_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:446:2: ( ( ( 'throws' )=>otherlv_3= 'throws' ) ( (lv_throws_4_0= ruleJvmTypeReference ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred1_InternalXTest()) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:446:3: ( ( 'throws' )=>otherlv_3= 'throws' ) ( (lv_throws_4_0= ruleJvmTypeReference ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:446:3: ( ( 'throws' )=>otherlv_3= 'throws' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:446:4: ( 'throws' )=>otherlv_3= 'throws'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXAssertExpression934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXAssertExpressionAccess().getThrowsKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:451:2: ( (lv_throws_4_0= ruleJvmTypeReference ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:452:1: (lv_throws_4_0= ruleJvmTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:452:1: (lv_throws_4_0= ruleJvmTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:453:3: lv_throws_4_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssertExpressionAccess().getThrowsJvmTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXAssertExpression956);
                    lv_throws_4_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssertExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"throws",
                              		lv_throws_4_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssertExpression"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:477:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:478:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:479:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression994);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression1004); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:486:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XTestExpression_13= ruleXTestExpression | this_XAssertExpression_14= ruleXAssertExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;

        EObject this_XTestExpression_13 = null;

        EObject this_XAssertExpression_14 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:489:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XTestExpression_13= ruleXTestExpression | this_XAssertExpression_14= ruleXAssertExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:490:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XTestExpression_13= ruleXTestExpression | this_XAssertExpression_14= ruleXAssertExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:490:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XTestExpression_13= ruleXTestExpression | this_XAssertExpression_14= ruleXAssertExpression )
            int alt8=15;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt8=1;
                }
                break;
            case 56:
                {
                alt8=2;
                }
                break;
            case 54:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
            case 23:
            case 26:
            case 65:
                {
                alt8=4;
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 49:
            case 68:
            case 69:
            case 70:
            case 71:
                {
                alt8=5;
                }
                break;
            case 52:
                {
                alt8=6;
                }
                break;
            case 60:
                {
                alt8=7;
                }
                break;
            case 61:
                {
                alt8=8;
                }
                break;
            case 62:
                {
                alt8=9;
                }
                break;
            case 72:
                {
                alt8=10;
                }
                break;
            case 73:
                {
                alt8=11;
                }
                break;
            case 74:
                {
                alt8=12;
                }
                break;
            case 27:
                {
                alt8=13;
                }
                break;
            case 18:
            case 19:
                {
                alt8=14;
                }
                break;
            case 20:
                {
                alt8=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:491:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression1051);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:501:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression1078);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:511:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression1105);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:521:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression1132);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:531:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression1159);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:541:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression1186);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:551:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression1213);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:561:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression1240);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:571:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression1267);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:581:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression1294);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:591:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression1321);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:601:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression1348);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:611:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression1375);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:621:5: this_XTestExpression_13= ruleXTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTestExpressionParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTestExpression_in_ruleXPrimaryExpression1402);
                    this_XTestExpression_13=ruleXTestExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTestExpression_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:631:5: this_XAssertExpression_14= ruleXAssertExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXAssertExpressionParserRuleCall_14()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXAssertExpression_in_ruleXPrimaryExpression1429);
                    this_XAssertExpression_14=ruleXAssertExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XAssertExpression_14; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleStaticEquals"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:647:1: entryRuleStaticEquals returns [String current=null] : iv_ruleStaticEquals= ruleStaticEquals EOF ;
    public final String entryRuleStaticEquals() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticEquals = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:648:2: (iv_ruleStaticEquals= ruleStaticEquals EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:649:2: iv_ruleStaticEquals= ruleStaticEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleStaticEquals_in_entryRuleStaticEquals1465);
            iv_ruleStaticEquals=ruleStaticEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticEquals.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticEquals1476); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticEquals"


    // $ANTLR start "ruleStaticEquals"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:656:1: ruleStaticEquals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleStaticEquals() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:659:28: (kw= ':=' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:661:2: kw= ':='
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleStaticEquals1513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getStaticEqualsAccess().getColonEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticEquals"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:674:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:675:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:676:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall1552);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall1562); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:683:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ( ruleIdOrSuper ) ) | otherlv_8= 'class' ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure ) )? ( () ruleStaticEquals ( (lv_value_18_0= ruleXAssignment ) ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_explicitOperationCall_9_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_11_0 = null;

        EObject lv_featureCallArguments_13_0 = null;

        EObject lv_featureCallArguments_15_0 = null;

        EObject lv_value_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:686:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ( ruleIdOrSuper ) ) | otherlv_8= 'class' ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure ) )? ( () ruleStaticEquals ( (lv_value_18_0= ruleXAssignment ) ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:687:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ( ruleIdOrSuper ) ) | otherlv_8= 'class' ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure ) )? ( () ruleStaticEquals ( (lv_value_18_0= ruleXAssignment ) ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:687:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ( ruleIdOrSuper ) ) | otherlv_8= 'class' ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure ) )? ( () ruleStaticEquals ( (lv_value_18_0= ruleXAssignment ) ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:687:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ( ruleIdOrSuper ) ) | otherlv_8= 'class' ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure ) )? ( () ruleStaticEquals ( (lv_value_18_0= ruleXAssignment ) ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:687:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:688:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:693:2: ( ( ruleStaticQualifier ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==66) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:694:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:694:1: ( ruleStaticQualifier )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:695:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall1619);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:708:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:708:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXFeatureCall1633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:712:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:713:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:713:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:714:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall1654);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:730:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==24) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:730:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall1667); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:734:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:735:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:735:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:736:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall1688);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall1702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:756:3: ( ( ( ruleIdOrSuper ) ) | otherlv_8= 'class' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==65) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:756:4: ( ( ruleIdOrSuper ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:756:4: ( ( ruleIdOrSuper ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:757:1: ( ruleIdOrSuper )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:757:1: ( ruleIdOrSuper )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:758:3: ruleIdOrSuper
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall1728);
                    ruleIdOrSuper();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:772:7: otherlv_8= 'class'
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall1746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXFeatureCallAccess().getClassKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:776:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')' )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:776:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')'
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:776:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:776:4: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:783:1: (lv_explicitOperationCall_9_0= '(' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:784:3: lv_explicitOperationCall_9_0= '('
                    {
                    lv_explicitOperationCall_9_0=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall1781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_9_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:797:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )?
                    int alt14=3;
                    alt14 = dfa14.predict(input);
                    switch (alt14) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:797:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:797:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:797:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:814:1: (lv_featureCallArguments_10_0= ruleXShortClosure )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:815:3: lv_featureCallArguments_10_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall1866);
                            lv_featureCallArguments_10_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:832:6: ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:832:6: ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:832:7: ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:832:7: ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:833:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:833:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:834:3: lv_featureCallArguments_11_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall1894);
                            lv_featureCallArguments_11_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_11_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:850:2: (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==24) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:850:4: otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) )
                            	    {
                            	    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall1907); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_12, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:854:1: ( (lv_featureCallArguments_13_0= ruleXExpression ) )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:855:1: (lv_featureCallArguments_13_0= ruleXExpression )
                            	    {
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:855:1: (lv_featureCallArguments_13_0= ruleXExpression )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:856:3: lv_featureCallArguments_13_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall1928);
                            	    lv_featureCallArguments_13_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_13_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop13;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall1945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:876:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure ) )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:876:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:881:1: (lv_featureCallArguments_15_0= ruleXClosure )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:882:3: lv_featureCallArguments_15_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall1978);
                    lv_featureCallArguments_15_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_15_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:898:3: ( () ruleStaticEquals ( (lv_value_18_0= ruleXAssignment ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:898:4: () ruleStaticEquals ( (lv_value_18_0= ruleXAssignment ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:898:4: ()
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:899:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getXFeatureCallAccess().getXAssignmentAssignableAction_6_0(),
                                  current);
                          
                    }

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXFeatureCallAccess().getStaticEqualsParserRuleCall_6_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStaticEquals_in_ruleXFeatureCall2005);
                    ruleStaticEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:912:1: ( (lv_value_18_0= ruleXAssignment ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:913:1: (lv_value_18_0= ruleXAssignment )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:913:1: (lv_value_18_0= ruleXAssignment )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:914:3: lv_value_18_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getValueXAssignmentParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXFeatureCall2025);
                    lv_value_18_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_18_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:938:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:939:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:940:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression2063);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression2073); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:947:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:950:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:952:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression2119);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:968:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:969:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:970:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment2153);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment2163); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:977:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:980:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:981:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:981:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==EOF||(LA19_1>=RULE_ID && LA19_1<=RULE_DECIMAL)||LA19_1==13||(LA19_1>=16 && LA19_1<=28)||(LA19_1>=30 && LA19_1<=49)||(LA19_1>=51 && LA19_1<=77)) ) {
                    alt19=2;
                }
                else if ( (LA19_1==29) ) {
                    alt19=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_DECIMAL)||(LA19_0>=18 && LA19_0<=20)||LA19_0==23||(LA19_0>=26 && LA19_0<=27)||(LA19_0>=40 && LA19_0<=41)||LA19_0==45||LA19_0==49||LA19_0==52||LA19_0==54||LA19_0==56||(LA19_0>=60 && LA19_0<=62)||LA19_0==65||(LA19_0>=67 && LA19_0<=74)) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:981:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:981:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:981:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:981:3: ()
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:982:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:987:2: ( ( ruleValidID ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:988:1: ( ruleValidID )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:988:1: ( ruleValidID )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:989:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment2221);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2237);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1010:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1011:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1011:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1012:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2257);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1029:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1029:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1030:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2287);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1038:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==30) ) {
                        int LA18_1 = input.LA(2);

                        if ( (synpred5_InternalXTest()) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1038:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1038:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1038:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1043:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1043:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1043:7: ()
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1044:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1049:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1050:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1050:1: ( ruleOpMultiAssign )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1051:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2340);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1064:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1065:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1065:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1066:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2363);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1090:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1091:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1092:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2403);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign2414); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1099:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1102:28: (kw= '=' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1104:2: kw= '='
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpSingleAssign2451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1117:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1118:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1119:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2491);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2502); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1126:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1129:28: (kw= '+=' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1131:2: kw= '+='
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleOpMultiAssign2539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1144:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1145:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1146:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2578);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2588); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1153:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1156:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1157:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1157:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1158:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2635);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1166:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred6_InternalXTest()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1166:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1166:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1166:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1171:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1171:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1171:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1172:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1177:2: ( ( ruleOpOr ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1178:1: ( ruleOpOr )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1178:1: ( ruleOpOr )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1179:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2688);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1192:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1193:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1193:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1194:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2711);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1218:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1219:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1220:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2750);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2761); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1227:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1230:28: (kw= '||' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1232:2: kw= '||'
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOr2798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1245:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1246:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1247:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2837);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2847); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1254:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1257:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1258:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1258:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1259:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2894);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1267:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred7_InternalXTest()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1267:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1267:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1267:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1272:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1272:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1272:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1273:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1278:2: ( ( ruleOpAnd ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1279:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1279:1: ( ruleOpAnd )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1280:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2947);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1293:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1294:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1294:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1295:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2970);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1319:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1320:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1321:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd3009);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd3020); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1328:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1331:28: (kw= '&&' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1333:2: kw= '&&'
            {
            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAnd3057); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1346:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1347:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1348:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3096);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression3106); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1355:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1358:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1359:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1359:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1360:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3153);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1368:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred8_InternalXTest()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==34) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred8_InternalXTest()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1368:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1368:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1368:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1373:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1373:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1373:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1374:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1379:2: ( ( ruleOpEquality ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1380:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1380:1: ( ruleOpEquality )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1381:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3206);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1394:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1395:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1395:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1396:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3229);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1420:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1421:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1422:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality3268);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality3279); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1429:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1432:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1433:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1433:1: (kw= '==' | kw= '!=' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            else if ( (LA23_0==34) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1434:2: kw= '=='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpEquality3317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1441:2: kw= '!='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpEquality3336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1454:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1455:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1456:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3376);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression3386); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1463:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1466:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1467:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1467:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1468:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3433);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1476:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop24:
            do {
                int alt24=3;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred9_InternalXTest()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred10_InternalXTest()) ) {
                        alt24=2;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred10_InternalXTest()) ) {
                        alt24=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred10_InternalXTest()) ) {
                        alt24=2;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA24_6 = input.LA(2);

                    if ( (synpred10_InternalXTest()) ) {
                        alt24=2;
                    }


                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1476:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1476:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1476:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1476:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1476:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1478:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1478:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1478:6: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1479:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleXRelationalExpression3469); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1488:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1489:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1489:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1490:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3492);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1507:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1507:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1507:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1507:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1507:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1512:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1512:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1512:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1513:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1518:2: ( ( ruleOpCompare ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1519:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1519:1: ( ruleOpCompare )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1520:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3553);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1533:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1534:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1534:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1535:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3576);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1559:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1560:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1561:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3616);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3627); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1568:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1571:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1572:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1572:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt25=1;
                }
                break;
            case 37:
                {
                alt25=2;
                }
                break;
            case 25:
                {
                alt25=3;
                }
                break;
            case 23:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1573:2: kw= '>='
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpCompare3665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1580:2: kw= '<='
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpCompare3684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1587:2: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare3703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1594:2: kw= '<'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpCompare3722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1607:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1608:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1609:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3762);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3772); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1616:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1619:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1620:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1620:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1621:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3819);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1629:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==38) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred11_InternalXTest()) ) {
                        alt26=1;
                    }


                }
                else if ( (LA26_0==39) ) {
                    int LA26_3 = input.LA(2);

                    if ( (synpred11_InternalXTest()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1629:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1629:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1629:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1634:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1634:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1634:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1635:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1640:2: ( ( ruleOpOther ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1641:1: ( ruleOpOther )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1641:1: ( ruleOpOther )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1642:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3872);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1655:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1656:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1656:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1657:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3895);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1681:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1682:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1683:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3934);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3945); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1690:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1693:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1694:1: (kw= '->' | kw= '..' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1694:1: (kw= '->' | kw= '..' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            else if ( (LA27_0==39) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1695:2: kw= '->'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther3983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1702:2: kw= '..'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpOther4002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1715:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1716:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1717:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4042);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression4052); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1724:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1727:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1728:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1728:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1729:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4099);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1737:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==40) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred12_InternalXTest()) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==41) ) {
                    int LA28_3 = input.LA(2);

                    if ( (synpred12_InternalXTest()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1737:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1737:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1737:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1742:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1742:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1742:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1743:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1748:2: ( ( ruleOpAdd ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1749:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1749:1: ( ruleOpAdd )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1750:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4152);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1763:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1764:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1764:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1765:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4175);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1789:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1790:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1791:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd4214);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd4225); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1798:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1801:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1802:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1802:1: (kw= '+' | kw= '-' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            else if ( (LA29_0==41) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1803:2: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpAdd4263); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1810:2: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpAdd4282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1823:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1824:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1825:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4322);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4332); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1832:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1835:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1836:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1836:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1837:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4379);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1845:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop30:
            do {
                int alt30=2;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (synpred13_InternalXTest()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (synpred13_InternalXTest()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA30_4 = input.LA(2);

                    if ( (synpred13_InternalXTest()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA30_5 = input.LA(2);

                    if ( (synpred13_InternalXTest()) ) {
                        alt30=1;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1845:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1845:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1845:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1850:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1850:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1850:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1851:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1856:2: ( ( ruleOpMulti ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1857:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1857:1: ( ruleOpMulti )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1858:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4432);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1871:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1872:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1872:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1873:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4455);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1897:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1898:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1899:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4494);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4505); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1906:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1909:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1910:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1910:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt31=1;
                }
                break;
            case 42:
                {
                alt31=2;
                }
                break;
            case 43:
                {
                alt31=3;
                }
                break;
            case 44:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1911:2: kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleOpMulti4543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1918:2: kw= '**'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti4562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1925:2: kw= '/'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpMulti4581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1932:2: kw= '%'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpMulti4600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1945:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1946:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1947:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4640);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4650); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1954:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1957:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1958:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1958:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=40 && LA32_0<=41)||LA32_0==45) ) {
                alt32=1;
            }
            else if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_DECIMAL)||(LA32_0>=18 && LA32_0<=20)||LA32_0==23||(LA32_0>=26 && LA32_0<=27)||LA32_0==49||LA32_0==52||LA32_0==54||LA32_0==56||(LA32_0>=60 && LA32_0<=62)||LA32_0==65||(LA32_0>=67 && LA32_0<=74)) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1958:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1958:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1958:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1958:3: ()
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1959:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1964:2: ( ( ruleOpUnary ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1965:1: ( ruleOpUnary )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1965:1: ( ruleOpUnary )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1966:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4708);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1979:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1980:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1980:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1981:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4729);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1999:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4758);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2015:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2016:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2017:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4794);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4805); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2024:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2027:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2028:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2028:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt33=1;
                }
                break;
            case 41:
                {
                alt33=2;
                }
                break;
            case 40:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2029:2: kw= '!'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpUnary4843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2036:2: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpUnary4862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2043:2: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpUnary4881); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2056:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2057:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2058:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4921);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4931); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2065:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2068:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2069:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2069:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2070:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4978);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2078:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==46) ) {
                    int LA34_2 = input.LA(2);

                    if ( (synpred14_InternalXTest()) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2078:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2078:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2078:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2080:5: ( () otherlv_2= 'as' )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2080:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2080:6: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2081:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXCastedExpression5013); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2090:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2091:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2091:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2092:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5036);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2116:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2117:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2118:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5074);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall5084); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2125:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2128:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2129:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2129:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2130:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5131);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2138:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop42:
            do {
                int alt42=3;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    int LA42_2 = input.LA(2);

                    if ( (synpred15_InternalXTest()) ) {
                        alt42=1;
                    }
                    else if ( (synpred16_InternalXTest()) ) {
                        alt42=2;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA42_3 = input.LA(2);

                    if ( (synpred16_InternalXTest()) ) {
                        alt42=2;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA42_4 = input.LA(2);

                    if ( (synpred16_InternalXTest()) ) {
                        alt42=2;
                    }


                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2138:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2138:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2138:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2138:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2138:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2144:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2144:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2144:26: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2145:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall5180); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2154:1: ( ( ruleValidID ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2155:1: ( ruleValidID )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2155:1: ( ruleValidID )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2156:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5203);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5219);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2177:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2178:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2178:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2179:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5241);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2196:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2196:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2196:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2196:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2196:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2212:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2212:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2212:8: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2213:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2218:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt35=3;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt35=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt35=2;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt35=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt35) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2218:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall5327); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2223:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2223:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2224:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2224:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2225:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall5351); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2239:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2239:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2240:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2240:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2241:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall5388); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2254:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==23) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2254:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleXMemberFeatureCall5417); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2258:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2259:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2259:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2260:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5438);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2276:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop36:
            	            do {
            	                int alt36=2;
            	                int LA36_0 = input.LA(1);

            	                if ( (LA36_0==24) ) {
            	                    alt36=1;
            	                }


            	                switch (alt36) {
            	            	case 1 :
            	            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2276:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall5451); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2280:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2281:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2281:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2282:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5472);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop36;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall5486); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2302:3: ( ( ruleValidID ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2303:1: ( ruleValidID )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2303:1: ( ruleValidID )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2304:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5511);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2317:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt40=2;
            	    alt40 = dfa40.predict(input);
            	    switch (alt40) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2317:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2317:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2317:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2324:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2325:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall5545); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2338:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt39=3;
            	            alt39 = dfa39.predict(input);
            	            switch (alt39) {
            	                case 1 :
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2338:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2338:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2338:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2355:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2356:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5630);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2373:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2373:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2373:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2373:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2374:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2374:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2375:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5658);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2391:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop38:
            	                    do {
            	                        int alt38=2;
            	                        int LA38_0 = input.LA(1);

            	                        if ( (LA38_0==24) ) {
            	                            alt38=1;
            	                        }


            	                        switch (alt38) {
            	                    	case 1 :
            	                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2391:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall5671); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2395:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2396:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2396:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2397:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5692);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop38;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall5709); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2417:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt41=2;
            	    alt41 = dfa41.predict(input);
            	    switch (alt41) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2417:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2422:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2423:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5742);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2447:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2448:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2449:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5782);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5792); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2456:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2459:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2460:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2460:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt43=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt43=1;
                }
                break;
            case 68:
            case 69:
                {
                alt43=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt43=3;
                }
                break;
            case 70:
                {
                alt43=4;
                }
                break;
            case RULE_STRING:
                {
                alt43=5;
                }
                break;
            case 71:
                {
                alt43=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2461:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5839);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2471:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5866);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2481:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5893);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2491:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5920);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2501:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5947);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2511:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5974);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2527:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2528:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2529:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6009);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6019); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2536:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2539:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2540:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2540:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2540:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2540:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2541:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXClosure6065); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2550:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2550:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2565:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2565:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2565:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_ID||LA45_0==27||LA45_0==77) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2565:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2565:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2566:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2566:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2567:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6136);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2583:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==24) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2583:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXClosure6149); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2587:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2588:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2588:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2589:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6170);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop44;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2605:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2606:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2606:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2607:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,50,FOLLOW_50_in_ruleXClosure6192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_2_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2620:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2621:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2621:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2622:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6229);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXClosure6241); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2650:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2651:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2652:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6277);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6287); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2659:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2662:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2663:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2663:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2663:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2663:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2664:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2669:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_DECIMAL)||(LA48_0>=18 && LA48_0<=20)||LA48_0==23||(LA48_0>=26 && LA48_0<=27)||(LA48_0>=40 && LA48_0<=41)||LA48_0==45||LA48_0==49||LA48_0==52||LA48_0==54||LA48_0==56||(LA48_0>=60 && LA48_0<=65)||(LA48_0>=67 && LA48_0<=74)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2669:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2669:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2670:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2670:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2671:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6343);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2687:2: (otherlv_2= ';' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==13) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2687:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXExpressionInClosure6356); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2699:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2700:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2701:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6396);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6406); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2708:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2711:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2712:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2712:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2712:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2712:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2712:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2728:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2728:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2728:7: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2729:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2734:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID||LA50_0==27||LA50_0==77) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2734:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2734:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2735:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2735:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2736:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6514);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2752:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==24) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2752:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXShortClosure6527); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2756:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2757:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2757:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2758:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6548);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2774:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2775:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2775:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2776:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,50,FOLLOW_50_in_ruleXShortClosure6570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2789:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2790:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2790:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2791:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6606);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2815:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2816:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2817:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6642);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6652); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2824:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2827:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2828:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2828:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2828:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleXParenthesizedExpression6689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6711);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXParenthesizedExpression6722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2853:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2854:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2855:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6758);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6768); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2862:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2865:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2866:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2866:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2866:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2866:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2867:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXIfExpression6814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXIfExpression6826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2880:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2881:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2881:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2882:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6847);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXIfExpression6859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2902:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2903:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2903:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2904:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6880);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2920:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==53) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred22_InternalXTest()) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2920:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2920:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2920:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleXIfExpression6901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2925:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2926:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2926:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2927:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6923);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2951:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2952:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2953:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6961);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6971); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2960:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2963:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2964:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2964:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2964:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2964:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2965:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression7017); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2974:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_DECIMAL)||(LA53_0>=18 && LA53_0<=20)||LA53_0==23||LA53_0==26||(LA53_0>=40 && LA53_0<=41)||LA53_0==45||LA53_0==49||LA53_0==52||LA53_0==54||LA53_0==56||(LA53_0>=60 && LA53_0<=62)||LA53_0==65||(LA53_0>=67 && LA53_0<=74)) ) {
                alt53=1;
            }
            else if ( (LA53_0==27) ) {
                int LA53_2 = input.LA(2);

                if ( (LA53_2==RULE_ID) ) {
                    int LA53_3 = input.LA(3);

                    if ( (LA53_3==55) && (synpred24_InternalXTest())) {
                        alt53=2;
                    }
                    else if ( ((LA53_3>=16 && LA53_3<=17)||(LA53_3>=22 && LA53_3<=23)||LA53_3==25||(LA53_3>=27 && LA53_3<=44)||(LA53_3>=46 && LA53_3<=49)||LA53_3==66) ) {
                        alt53=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA53_2>=RULE_STRING && LA53_2<=RULE_DECIMAL)||(LA53_2>=18 && LA53_2<=20)||LA53_2==23||(LA53_2>=26 && LA53_2<=27)||(LA53_2>=40 && LA53_2<=41)||LA53_2==45||LA53_2==49||LA53_2==52||LA53_2==54||LA53_2==56||(LA53_2>=60 && LA53_2<=62)||LA53_2==65||(LA53_2>=67 && LA53_2<=74)) ) {
                    alt53=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2974:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2974:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2974:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2974:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_ID) ) {
                        int LA52_1 = input.LA(2);

                        if ( (LA52_1==55) && (synpred23_InternalXTest())) {
                            alt52=1;
                        }
                    }
                    switch (alt52) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2974:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2979:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2979:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2979:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2980:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2980:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2981:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7060);
                            lv_localVarName_2_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"localVarName",
                                      		lv_localVarName_2_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression7072); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3001:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3002:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3002:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3003:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7096);
                    lv_switch_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_4_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3020:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3020:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3020:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3020:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3020:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3026:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3026:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleXSwitchExpression7140); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3030:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3031:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3031:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3032:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7161);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression7173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3052:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3053:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3053:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3054:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7196);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleXSwitchExpression7208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression7222); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3078:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID||LA54_0==27||LA54_0==55||LA54_0==59||LA54_0==77) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3079:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3079:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3080:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7243);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3096:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==57) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3096:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression7257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression7269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3104:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3105:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3105:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3106:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7290);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression7304); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3134:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3135:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3136:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7340);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7350); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3143:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3146:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3147:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3147:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3147:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3147:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID||LA56_0==27||LA56_0==77) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3148:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3148:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3149:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7396);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3165:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==59) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3165:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXCasePart7410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3169:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3170:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3170:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3171:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7431);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleXCasePart7445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3191:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3192:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3192:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3193:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7466);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3217:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3218:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3219:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7502);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7512); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3226:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3229:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3230:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3230:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3230:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3230:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3231:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXForLoopExpression7558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXForLoopExpression7570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3244:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3245:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3245:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3246:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7591);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleXForLoopExpression7603); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3266:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3267:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3267:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3268:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7624);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleXForLoopExpression7636); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3288:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3289:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3289:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3290:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7657);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3314:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3315:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3316:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7693);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7703); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3323:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3326:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3327:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3327:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3327:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3327:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3328:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXWhileExpression7749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXWhileExpression7761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3341:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3342:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3342:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3343:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7782);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXWhileExpression7794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3363:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3364:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3364:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3365:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7815);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3389:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3390:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3391:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7851);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7861); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3398:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3401:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3402:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3402:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3402:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3402:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3403:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXDoWhileExpression7907); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3412:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3413:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3413:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3414:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7928);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleXDoWhileExpression7940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleXDoWhileExpression7952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3438:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3439:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3439:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3440:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7973);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleXDoWhileExpression7985); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3468:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3469:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3470:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8021);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8031); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3477:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3480:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3481:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3481:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3481:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3481:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3482:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXBlockExpression8077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3491:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_DECIMAL)||(LA59_0>=18 && LA59_0<=20)||LA59_0==23||(LA59_0>=26 && LA59_0<=27)||(LA59_0>=40 && LA59_0<=41)||LA59_0==45||LA59_0==49||LA59_0==52||LA59_0==54||LA59_0==56||(LA59_0>=60 && LA59_0<=65)||(LA59_0>=67 && LA59_0<=74)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3491:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3491:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3492:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3492:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3493:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8099);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3509:2: (otherlv_3= ';' )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==13) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3509:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression8112); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleXBlockExpression8128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3525:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3526:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3527:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8164);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8174); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3534:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3537:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3538:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3538:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=63 && LA60_0<=64)) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_DECIMAL)||(LA60_0>=18 && LA60_0<=20)||LA60_0==23||(LA60_0>=26 && LA60_0<=27)||(LA60_0>=40 && LA60_0<=41)||LA60_0==45||LA60_0==49||LA60_0==52||LA60_0==54||LA60_0==56||(LA60_0>=60 && LA60_0<=62)||LA60_0==65||(LA60_0>=67 && LA60_0<=74)) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3539:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8221);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3549:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8248);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3565:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3566:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3567:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8283);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8293); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3574:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3577:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3578:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3578:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3578:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3578:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3579:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3584:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==63) ) {
                alt61=1;
            }
            else if ( (LA61_0==64) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3584:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3584:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3585:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3585:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3586:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,63,FOLLOW_63_in_ruleXVariableDeclaration8346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3600:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleXVariableDeclaration8377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3604:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                int LA62_1 = input.LA(2);

                if ( (synpred25_InternalXTest()) ) {
                    alt62=1;
                }
                else if ( (true) ) {
                    alt62=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA62_0==27) && (synpred25_InternalXTest())) {
                alt62=1;
            }
            else if ( (LA62_0==77) && (synpred25_InternalXTest())) {
                alt62=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3604:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3604:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3604:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3612:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3612:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3612:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3613:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3613:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3614:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8425);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3630:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3631:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3631:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3632:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8446);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3649:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3649:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3650:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3650:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3651:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8475);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3667:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==29) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3667:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleXVariableDeclaration8489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3671:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3672:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3672:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3673:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8510);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3697:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3698:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3699:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8548);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8558); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3706:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3709:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3710:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3710:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3710:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3710:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID) ) {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==RULE_ID||LA64_1==16||LA64_1==23||LA64_1==49) ) {
                    alt64=1;
                }
            }
            else if ( (LA64_0==27||LA64_0==77) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3711:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3711:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3712:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8604);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3728:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3729:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3729:1: (lv_name_1_0= ruleValidID )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3730:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8626);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3754:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3755:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3756:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8662);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8672); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3763:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3766:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3767:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3767:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3767:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3767:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3768:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3768:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3769:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8718);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3785:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3786:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3786:1: (lv_name_1_0= ruleValidID )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3787:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8739);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3811:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3812:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3813:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8776);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8787); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3820:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3823:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3824:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3824:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                alt65=1;
            }
            else if ( (LA65_0==65) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3825:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8834);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3837:2: kw= 'super'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleIdOrSuper8858); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3850:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3851:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3852:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8899);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8910); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3859:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3862:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3863:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3863:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_ID) ) {
                    int LA66_2 = input.LA(2);

                    if ( (LA66_2==66) ) {
                        alt66=1;
                    }


                }


                switch (alt66) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3864:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8957);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,66,FOLLOW_66_in_ruleStaticQualifier8975); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3888:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3889:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3890:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9016);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9026); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3897:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3900:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3901:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3901:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3901:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3901:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3902:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXConstructorCall9072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3911:1: ( ( ruleQualifiedName ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3912:1: ( ruleQualifiedName )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3912:1: ( ruleQualifiedName )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3913:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9095);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3926:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3926:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3926:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3926:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleXConstructorCall9116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3931:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3932:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3932:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3933:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9138);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3949:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==24) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3949:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall9151); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3953:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3954:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3954:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3955:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9172);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall9186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3975:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3975:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3975:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3975:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall9209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3980:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt70=3;
                    alt70 = dfa70.predict(input);
                    switch (alt70) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3980:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3980:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3980:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3997:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3998:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9282);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4015:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4015:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4015:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4015:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4016:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4016:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4017:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9310);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4033:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop69:
                            do {
                                int alt69=2;
                                int LA69_0 = input.LA(1);

                                if ( (LA69_0==24) ) {
                                    alt69=1;
                                }


                                switch (alt69) {
                            	case 1 :
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4033:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall9323); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4037:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4038:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4038:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4039:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9344);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop69;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall9361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4059:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4059:4: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4064:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4065:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9394);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4089:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4090:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4091:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9431);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9441); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4098:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4101:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4102:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4102:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4102:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4102:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4103:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4108:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==68) ) {
                alt73=1;
            }
            else if ( (LA73_0==69) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4108:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXBooleanLiteral9488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4113:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4113:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4114:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4114:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4115:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,69,FOLLOW_69_in_ruleXBooleanLiteral9512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4136:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4137:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4138:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9562);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9572); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4145:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4148:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4149:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4149:1: ( () otherlv_1= 'null' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4149:2: () otherlv_1= 'null'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4149:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4150:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXNullLiteral9618); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4167:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4168:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4169:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9654);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9664); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4176:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4179:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4180:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4180:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4180:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4180:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4181:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4186:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4187:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4187:1: (lv_value_1_0= ruleNumber )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4188:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9719);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4212:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4213:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4214:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9755);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9765); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4221:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4224:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4225:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4225:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4225:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4225:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4226:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4231:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4232:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4232:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4233:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9816); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4257:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4258:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4259:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9857);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9867); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4266:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4269:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4270:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4270:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4270:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4270:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4271:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXTypeLiteral9913); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXTypeLiteral9925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4284:1: ( ( ruleQualifiedName ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4285:1: ( ruleQualifiedName )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4285:1: ( ruleQualifiedName )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4286:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9948);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXTypeLiteral9960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4311:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4312:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4313:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9996);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10006); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4320:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4323:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4324:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4324:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4324:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4324:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4325:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXThrowExpression10052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4334:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4335:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4335:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4336:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10073);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4360:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4361:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4362:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10109);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10119); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4369:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4372:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4373:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4373:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4373:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4373:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4374:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXReturnExpression10165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4383:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4383:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4388:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4389:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10196);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4413:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4414:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4415:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10233);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10243); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4422:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4425:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4426:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4426:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4426:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4426:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4427:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression10289); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4436:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4437:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4437:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4438:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10310);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4454:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==76) ) {
                alt77=1;
            }
            else if ( (LA77_0==75) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4454:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4454:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4454:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4454:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==76) ) {
                            int LA75_2 = input.LA(2);

                            if ( (synpred31_InternalXTest()) ) {
                                alt75=1;
                            }


                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4454:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4456:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4457:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10340);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt75 >= 1 ) break loop75;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
                    } while (true);

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4473:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==75) ) {
                        int LA76_1 = input.LA(2);

                        if ( (synpred32_InternalXTest()) ) {
                            alt76=1;
                        }
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4473:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4473:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4473:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,75,FOLLOW_75_in_ruleXTryCatchFinallyExpression10362); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4478:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4479:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4479:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4480:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10384);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4497:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4497:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4497:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,75,FOLLOW_75_in_ruleXTryCatchFinallyExpression10406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4501:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4502:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4502:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4503:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10427);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4527:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4528:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4529:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10465);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10475); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4536:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4539:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4540:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4540:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4540:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4540:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4540:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleXCatchClause10520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleXCatchClause10533); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4549:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4550:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4550:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4551:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10554);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXCatchClause10566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4571:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4572:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4572:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4573:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10587);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4597:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4598:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4599:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10624);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10635); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4606:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4609:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4610:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4610:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4611:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10682);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4621:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==16) ) {
                    int LA78_1 = input.LA(2);

                    if ( (LA78_1==RULE_ID) ) {
                        int LA78_3 = input.LA(3);

                        if ( (synpred34_InternalXTest()) ) {
                            alt78=1;
                        }


                    }


                }


                switch (alt78) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4621:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4621:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4621:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName10710); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10733);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4648:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4652:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4653:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10787);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10798); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4663:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4667:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4668:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4668:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_HEX) ) {
                alt82=1;
            }
            else if ( ((LA82_0>=RULE_INT && LA82_0<=RULE_DECIMAL)) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4668:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4676:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4676:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4676:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4676:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==RULE_INT) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==RULE_DECIMAL) ) {
                        alt79=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4676:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10870); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4684:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10896); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4691:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==16) ) {
                        int LA81_1 = input.LA(2);

                        if ( ((LA81_1>=RULE_INT && LA81_1<=RULE_DECIMAL)) ) {
                            alt81=1;
                        }
                    }
                    switch (alt81) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4692:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,16,FOLLOW_16_in_ruleNumber10916); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4697:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt80=2;
                            int LA80_0 = input.LA(1);

                            if ( (LA80_0==RULE_INT) ) {
                                alt80=1;
                            }
                            else if ( (LA80_0==RULE_DECIMAL) ) {
                                alt80=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 80, 0, input);

                                throw nvae;
                            }
                            switch (alt80) {
                                case 1 :
                                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4697:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10932); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4705:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10958); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4723:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4724:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4725:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11011);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11021); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4732:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4735:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4736:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4736:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID) ) {
                alt84=1;
            }
            else if ( (LA84_0==27||LA84_0==77) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4736:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4736:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4737:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11069);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4745:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==49) ) {
                            int LA83_2 = input.LA(2);

                            if ( (LA83_2==51) ) {
                                int LA83_3 = input.LA(3);

                                if ( (synpred35_InternalXTest()) ) {
                                    alt83=1;
                                }


                            }


                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4745:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4748:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4748:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4748:6: ()
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4749:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleJvmTypeReference11107); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleJvmTypeReference11119); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4764:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11151);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4780:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4781:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4782:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11186);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11196); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4789:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4792:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4793:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4793:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4793:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4793:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==27) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4793:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleXFunctionTypeRef11234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4797:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==RULE_ID||LA86_0==27||LA86_0==77) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4797:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4797:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4798:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4798:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4799:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11256);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4815:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop85:
                            do {
                                int alt85=2;
                                int LA85_0 = input.LA(1);

                                if ( (LA85_0==24) ) {
                                    alt85=1;
                                }


                                switch (alt85) {
                            	case 1 :
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4815:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXFunctionTypeRef11269); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4819:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4820:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4820:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4821:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11290);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop85;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXFunctionTypeRef11306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,77,FOLLOW_77_in_ruleXFunctionTypeRef11320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4845:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4846:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4846:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4847:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11341);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4871:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4872:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4873:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11377);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11387); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4880:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4883:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4884:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4884:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4884:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4884:2: ( ( ruleQualifiedName ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4885:1: ( ruleQualifiedName )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4885:1: ( ruleQualifiedName )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4886:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11435);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4899:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt89=2;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4899:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4899:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4899:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleJvmParameterizedTypeReference11456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4904:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4905:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4905:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4906:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11478);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4922:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==24) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4922:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleJvmParameterizedTypeReference11491); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4926:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4927:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4927:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4928:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11512);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleJvmParameterizedTypeReference11526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4956:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4957:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4958:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11564);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11574); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4965:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4968:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4969:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4969:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_ID||LA90_0==27||LA90_0==77) ) {
                alt90=1;
            }
            else if ( (LA90_0==78) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4970:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11621);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4980:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11648);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4996:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4997:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4998:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11683);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11693); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5005:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5008:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5009:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5009:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5009:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5009:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5010:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleJvmWildcardTypeReference11739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5019:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt91=3;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==79) ) {
                alt91=1;
            }
            else if ( (LA91_0==65) ) {
                alt91=2;
            }
            switch (alt91) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5019:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5019:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5020:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5020:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5021:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11761);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5038:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5038:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5039:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5039:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5040:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11788);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5064:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5065:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5066:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11826);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11836); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5073:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5076:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5077:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5077:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5077:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleJvmUpperBound11873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5081:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5082:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5082:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5083:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11894);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5107:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5108:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5109:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11930);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11940); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5116:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5119:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5120:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5120:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5120:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleJvmUpperBoundAnded11977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5124:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5125:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5125:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5126:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11998);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5150:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5151:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5152:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12034);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12044); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5159:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5162:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5163:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5163:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5163:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleJvmLowerBound12081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5167:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5168:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5168:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5169:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12102);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5195:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5196:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5197:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12141);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12152); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5204:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5207:28: (this_ID_0= RULE_ID )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5208:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalXTest
    public final void synpred1_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:446:4: ( 'throws' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:446:6: 'throws'
        {
        match(input,21,FOLLOW_21_in_synpred1_InternalXTest926); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalXTest

    // $ANTLR start synpred2_InternalXTest
    public final void synpred2_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:776:4: ( ( '(' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:777:1: ( '(' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:777:1: ( '(' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:778:2: '('
        {
        match(input,27,FOLLOW_27_in_synpred2_InternalXTest1763); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalXTest

    // $ANTLR start synpred3_InternalXTest
    public final void synpred3_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:797:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:797:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:797:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:797:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:797:6: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:798:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:798:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==RULE_ID||LA93_0==27||LA93_0==77) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:798:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:798:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:799:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:799:1: ( ruleJvmFormalParameter )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:800:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred3_InternalXTest1815);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:802:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==24) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:802:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,24,FOLLOW_24_in_synpred3_InternalXTest1822); if (state.failed) return ;
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:803:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:804:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:804:1: ( ruleJvmFormalParameter )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:805:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred3_InternalXTest1829);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop92;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:807:6: ( ( '|' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:808:1: ( '|' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:808:1: ( '|' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:809:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred3_InternalXTest1843); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalXTest

    // $ANTLR start synpred4_InternalXTest
    public final void synpred4_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:876:4: ( ( ruleXClosure ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:877:1: ( ruleXClosure )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:877:1: ( ruleXClosure )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:878:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred4_InternalXTest1961);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalXTest

    // $ANTLR start synpred5_InternalXTest
    public final void synpred5_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1038:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1038:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1038:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1038:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1038:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1039:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1039:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1040:1: ( ruleOpMultiAssign )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1040:1: ( ruleOpMultiAssign )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1041:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred5_InternalXTest2308);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalXTest

    // $ANTLR start synpred6_InternalXTest
    public final void synpred6_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1166:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1166:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1166:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1166:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1166:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1167:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1167:2: ( ( ruleOpOr ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1168:1: ( ruleOpOr )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1168:1: ( ruleOpOr )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1169:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred6_InternalXTest2656);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalXTest

    // $ANTLR start synpred7_InternalXTest
    public final void synpred7_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1267:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1267:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1267:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1267:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1267:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1268:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1268:2: ( ( ruleOpAnd ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1269:1: ( ruleOpAnd )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1269:1: ( ruleOpAnd )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1270:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred7_InternalXTest2915);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalXTest

    // $ANTLR start synpred8_InternalXTest
    public final void synpred8_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1368:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1368:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1368:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1368:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1368:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1369:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1369:2: ( ( ruleOpEquality ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1370:1: ( ruleOpEquality )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1370:1: ( ruleOpEquality )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1371:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred8_InternalXTest3174);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalXTest

    // $ANTLR start synpred9_InternalXTest
    public final void synpred9_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1476:4: ( ( () 'instanceof' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1476:5: ( () 'instanceof' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1476:5: ( () 'instanceof' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1476:6: () 'instanceof'
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1476:6: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1477:1: 
        {
        }

        match(input,35,FOLLOW_35_in_synpred9_InternalXTest3450); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalXTest

    // $ANTLR start synpred10_InternalXTest
    public final void synpred10_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1507:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1507:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1507:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1507:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1507:10: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1508:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1508:2: ( ( ruleOpCompare ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1509:1: ( ruleOpCompare )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1509:1: ( ruleOpCompare )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1510:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred10_InternalXTest3521);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalXTest

    // $ANTLR start synpred11_InternalXTest
    public final void synpred11_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1629:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1629:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1629:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1629:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1629:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1630:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1630:2: ( ( ruleOpOther ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1631:1: ( ruleOpOther )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1631:1: ( ruleOpOther )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1632:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred11_InternalXTest3840);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalXTest

    // $ANTLR start synpred12_InternalXTest
    public final void synpred12_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1737:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1737:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1737:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1737:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1737:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1738:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1738:2: ( ( ruleOpAdd ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1739:1: ( ruleOpAdd )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1739:1: ( ruleOpAdd )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1740:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred12_InternalXTest4120);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalXTest

    // $ANTLR start synpred13_InternalXTest
    public final void synpred13_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1845:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1845:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1845:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1845:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1845:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1846:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1846:2: ( ( ruleOpMulti ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1847:1: ( ruleOpMulti )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1847:1: ( ruleOpMulti )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1848:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred13_InternalXTest4400);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalXTest

    // $ANTLR start synpred14_InternalXTest
    public final void synpred14_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2078:3: ( ( () 'as' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2078:4: ( () 'as' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2078:4: ( () 'as' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2078:5: () 'as'
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2078:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2079:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred14_InternalXTest4994); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalXTest

    // $ANTLR start synpred15_InternalXTest
    public final void synpred15_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2138:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2138:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2138:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2138:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2138:6: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2139:1: 
        {
        }

        match(input,16,FOLLOW_16_in_synpred15_InternalXTest5148); if (state.failed) return ;
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2140:1: ( ( ruleValidID ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2141:1: ( ruleValidID )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2141:1: ( ruleValidID )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2142:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred15_InternalXTest5157);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred15_InternalXTest5163);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalXTest

    // $ANTLR start synpred16_InternalXTest
    public final void synpred16_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2196:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2196:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2196:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2196:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2196:10: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2197:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2197:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt94=3;
        switch ( input.LA(1) ) {
        case 16:
            {
            alt94=1;
            }
            break;
        case 47:
            {
            alt94=2;
            }
            break;
        case 48:
            {
            alt94=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 94, 0, input);

            throw nvae;
        }

        switch (alt94) {
            case 1 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2197:4: '.'
                {
                match(input,16,FOLLOW_16_in_synpred16_InternalXTest5266); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2199:6: ( ( '?.' ) )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2199:6: ( ( '?.' ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2200:1: ( '?.' )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2200:1: ( '?.' )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2201:2: '?.'
                {
                match(input,47,FOLLOW_47_in_synpred16_InternalXTest5280); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2206:6: ( ( '*.' ) )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2206:6: ( ( '*.' ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2207:1: ( '*.' )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2207:1: ( '*.' )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2208:2: '*.'
                {
                match(input,48,FOLLOW_48_in_synpred16_InternalXTest5300); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred16_InternalXTest

    // $ANTLR start synpred17_InternalXTest
    public final void synpred17_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2317:4: ( ( '(' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2318:1: ( '(' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2318:1: ( '(' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2319:2: '('
        {
        match(input,27,FOLLOW_27_in_synpred17_InternalXTest5527); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalXTest

    // $ANTLR start synpred18_InternalXTest
    public final void synpred18_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2338:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2338:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2338:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2338:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2338:6: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2339:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2339:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==27||LA96_0==77) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2339:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2339:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2340:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2340:1: ( ruleJvmFormalParameter )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2341:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalXTest5579);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2343:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==24) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2343:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,24,FOLLOW_24_in_synpred18_InternalXTest5586); if (state.failed) return ;
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2344:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2345:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2345:1: ( ruleJvmFormalParameter )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2346:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalXTest5593);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop95;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2348:6: ( ( '|' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2349:1: ( '|' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2349:1: ( '|' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2350:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred18_InternalXTest5607); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred18_InternalXTest

    // $ANTLR start synpred19_InternalXTest
    public final void synpred19_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2417:4: ( ( ruleXClosure ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2418:1: ( ruleXClosure )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2418:1: ( ruleXClosure )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2419:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred19_InternalXTest5725);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalXTest

    // $ANTLR start synpred20_InternalXTest
    public final void synpred20_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2550:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2550:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2550:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2550:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2550:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==27||LA98_0==77) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2550:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2550:5: ( ( ruleJvmFormalParameter ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2551:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2551:1: ( ruleJvmFormalParameter )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2552:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXTest6082);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2554:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==24) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2554:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,24,FOLLOW_24_in_synpred20_InternalXTest6089); if (state.failed) return ;
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2555:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2556:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2556:1: ( ruleJvmFormalParameter )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2557:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXTest6096);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop97;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2559:6: ( ( '|' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2560:1: ( '|' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2560:1: ( '|' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2561:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred20_InternalXTest6110); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalXTest

    // $ANTLR start synpred22_InternalXTest
    public final void synpred22_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2920:4: ( 'else' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2920:6: 'else'
        {
        match(input,53,FOLLOW_53_in_synpred22_InternalXTest6893); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalXTest

    // $ANTLR start synpred23_InternalXTest
    public final void synpred23_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2974:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2974:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2974:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2974:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2974:6: ( ( ruleValidID ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2975:1: ( ruleValidID )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2975:1: ( ruleValidID )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2976:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalXTest7035);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,55,FOLLOW_55_in_synpred23_InternalXTest7041); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalXTest

    // $ANTLR start synpred24_InternalXTest
    public final void synpred24_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3020:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3020:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3020:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3020:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,27,FOLLOW_27_in_synpred24_InternalXTest7117); if (state.failed) return ;
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3021:1: ( ( ruleValidID ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3022:1: ( ruleValidID )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3022:1: ( ruleValidID )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3023:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalXTest7124);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,55,FOLLOW_55_in_synpred24_InternalXTest7130); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalXTest

    // $ANTLR start synpred25_InternalXTest
    public final void synpred25_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3604:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3604:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3604:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3604:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3604:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3605:1: ( ruleJvmTypeReference )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3605:1: ( ruleJvmTypeReference )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3606:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalXTest8395);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3608:2: ( ( ruleValidID ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3609:1: ( ruleValidID )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3609:1: ( ruleValidID )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3610:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalXTest8404);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalXTest

    // $ANTLR start synpred26_InternalXTest
    public final void synpred26_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3926:4: ( '<' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3926:6: '<'
        {
        match(input,23,FOLLOW_23_in_synpred26_InternalXTest9108); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalXTest

    // $ANTLR start synpred27_InternalXTest
    public final void synpred27_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3975:5: ( '(' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3975:7: '('
        {
        match(input,27,FOLLOW_27_in_synpred27_InternalXTest9201); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalXTest

    // $ANTLR start synpred28_InternalXTest
    public final void synpred28_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3980:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3980:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3980:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3980:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3980:6: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3981:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3981:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==RULE_ID||LA102_0==27||LA102_0==77) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3981:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3981:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3982:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3982:1: ( ruleJvmFormalParameter )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3983:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalXTest9231);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3985:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop101:
                do {
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==24) ) {
                        alt101=1;
                    }


                    switch (alt101) {
                	case 1 :
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3985:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,24,FOLLOW_24_in_synpred28_InternalXTest9238); if (state.failed) return ;
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3986:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3987:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3987:1: ( ruleJvmFormalParameter )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3988:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalXTest9245);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop101;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3990:6: ( ( '|' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3991:1: ( '|' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3991:1: ( '|' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3992:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred28_InternalXTest9259); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred28_InternalXTest

    // $ANTLR start synpred29_InternalXTest
    public final void synpred29_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4059:4: ( ( ruleXClosure ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4060:1: ( ruleXClosure )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4060:1: ( ruleXClosure )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4061:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred29_InternalXTest9377);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalXTest

    // $ANTLR start synpred30_InternalXTest
    public final void synpred30_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4383:2: ( ( ruleXExpression ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4384:1: ( ruleXExpression )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4384:1: ( ruleXExpression )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4385:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred30_InternalXTest10179);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred30_InternalXTest

    // $ANTLR start synpred31_InternalXTest
    public final void synpred31_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4454:5: ( 'catch' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4454:7: 'catch'
        {
        match(input,76,FOLLOW_76_in_synpred31_InternalXTest10324); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalXTest

    // $ANTLR start synpred32_InternalXTest
    public final void synpred32_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4473:5: ( 'finally' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4473:7: 'finally'
        {
        match(input,75,FOLLOW_75_in_synpred32_InternalXTest10354); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalXTest

    // $ANTLR start synpred34_InternalXTest
    public final void synpred34_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4621:3: ( '.' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4622:2: '.'
        {
        match(input,16,FOLLOW_16_in_synpred34_InternalXTest10701); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalXTest

    // $ANTLR start synpred35_InternalXTest
    public final void synpred35_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4745:2: ( ( () '[' ']' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4745:3: ( () '[' ']' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4745:3: ( () '[' ']' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4745:4: () '[' ']'
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4745:4: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4746:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred35_InternalXTest11084); if (state.failed) return ;
        match(input,51,FOLLOW_51_in_synpred35_InternalXTest11088); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred35_InternalXTest

    // $ANTLR start synpred36_InternalXTest
    public final void synpred36_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4899:4: ( '<' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4899:6: '<'
        {
        match(input,23,FOLLOW_23_in_synpred36_InternalXTest11448); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalXTest

    // Delegated rules

    public final boolean synpred11_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalXTest_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA89 dfa89 = new DFA89(this);
    static final String DFA4_eotS =
        "\7\uffff";
    static final String DFA4_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA4_minS =
        "\1\4\1\uffff\2\4\2\uffff\1\4";
    static final String DFA4_maxS =
        "\1\17\1\uffff\1\112\1\21\2\uffff\1\112";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String DFA4_specialS =
        "\7\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\12\uffff\1\1",
            "",
            "\5\4\5\uffff\1\4\1\uffff\1\3\1\uffff\3\4\2\uffff\1\4\2\uffff"+
            "\2\4\14\uffff\2\4\3\uffff\1\4\3\uffff\1\4\2\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\3\uffff\6\4\1\uffff\10\4",
            "\1\6\14\uffff\1\5",
            "",
            "",
            "\5\4\5\uffff\1\4\1\uffff\1\3\1\uffff\3\4\2\uffff\1\4\2\uffff"+
            "\2\4\14\uffff\2\4\3\uffff\1\4\3\uffff\1\4\2\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\3\uffff\6\4\1\uffff\10\4"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "151:1: ( ( ( (lv_static_1_0= 'static' ) ) ( ( ruleQualifiedName ) ) otherlv_3= '.' otherlv_4= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_6_0= ruleQualifiedNamespaceWithWildcard ) ) )";
        }
    }
    static final String DFA15_eotS =
        "\104\uffff";
    static final String DFA15_eofS =
        "\1\2\103\uffff";
    static final String DFA15_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA15_maxS =
        "\1\115\1\0\102\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA15_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA15_transitionS = {
            "\5\2\4\uffff\1\2\2\uffff\13\2\1\1\1\2\1\uffff\24\2\1\uffff"+
            "\17\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "776:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalXTest()) ) {s = 67;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA14_eotS =
        "\42\uffff";
    static final String DFA14_eofS =
        "\42\uffff";
    static final String DFA14_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA14_maxS =
        "\1\115\2\0\37\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\2\1\1\2\33\uffff\1\3";
    static final String DFA14_specialS =
        "\1\0\1\1\1\2\37\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\4\5\11\uffff\3\5\2\uffff\1\5\2\uffff\1\5\1\2\1\41\13\uffff"+
            "\2\5\3\uffff\1\5\3\uffff\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "797:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                         
                        int index14_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_0==RULE_ID) ) {s = 1;}

                        else if ( (LA14_0==27) ) {s = 2;}

                        else if ( (LA14_0==77) && (synpred3_InternalXTest())) {s = 3;}

                        else if ( (LA14_0==50) && (synpred3_InternalXTest())) {s = 4;}

                        else if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_DECIMAL)||(LA14_0>=18 && LA14_0<=20)||LA14_0==23||LA14_0==26||(LA14_0>=40 && LA14_0<=41)||LA14_0==45||LA14_0==49||LA14_0==52||LA14_0==54||LA14_0==56||(LA14_0>=60 && LA14_0<=62)||LA14_0==65||(LA14_0>=67 && LA14_0<=74)) ) {s = 5;}

                        else if ( (LA14_0==28) ) {s = 33;}

                         
                        input.seek(index14_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\104\uffff";
    static final String DFA16_eofS =
        "\1\2\103\uffff";
    static final String DFA16_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA16_maxS =
        "\1\115\1\0\102\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA16_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA16_transitionS = {
            "\5\2\4\uffff\1\2\2\uffff\15\2\1\uffff\23\2\1\1\1\uffff\17\2"+
            "\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "876:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalXTest()) ) {s = 67;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA40_eotS =
        "\103\uffff";
    static final String DFA40_eofS =
        "\1\2\102\uffff";
    static final String DFA40_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA40_maxS =
        "\1\115\1\0\101\uffff";
    static final String DFA40_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA40_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA40_transitionS = {
            "\5\2\4\uffff\1\2\2\uffff\6\2\1\uffff\4\2\1\1\1\2\1\uffff\24"+
            "\2\1\uffff\17\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "2317:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_1 = input.LA(1);

                         
                        int index40_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index40_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\42\uffff";
    static final String DFA39_eofS =
        "\42\uffff";
    static final String DFA39_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA39_maxS =
        "\1\115\2\0\37\uffff";
    static final String DFA39_acceptS =
        "\3\uffff\2\1\1\2\33\uffff\1\3";
    static final String DFA39_specialS =
        "\1\0\1\1\1\2\37\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\1\4\5\11\uffff\3\5\2\uffff\1\5\2\uffff\1\5\1\2\1\41\13\uffff"+
            "\2\5\3\uffff\1\5\3\uffff\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "2338:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_0 = input.LA(1);

                         
                        int index39_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA39_0==RULE_ID) ) {s = 1;}

                        else if ( (LA39_0==27) ) {s = 2;}

                        else if ( (LA39_0==77) && (synpred18_InternalXTest())) {s = 3;}

                        else if ( (LA39_0==50) && (synpred18_InternalXTest())) {s = 4;}

                        else if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_DECIMAL)||(LA39_0>=18 && LA39_0<=20)||LA39_0==23||LA39_0==26||(LA39_0>=40 && LA39_0<=41)||LA39_0==45||LA39_0==49||LA39_0==52||LA39_0==54||LA39_0==56||(LA39_0>=60 && LA39_0<=62)||LA39_0==65||(LA39_0>=67 && LA39_0<=74)) ) {s = 5;}

                        else if ( (LA39_0==28) ) {s = 33;}

                         
                        input.seek(index39_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_1 = input.LA(1);

                         
                        int index39_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index39_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_2 = input.LA(1);

                         
                        int index39_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index39_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA41_eotS =
        "\103\uffff";
    static final String DFA41_eofS =
        "\1\2\102\uffff";
    static final String DFA41_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA41_maxS =
        "\1\115\1\0\101\uffff";
    static final String DFA41_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA41_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA41_transitionS = {
            "\5\2\4\uffff\1\2\2\uffff\6\2\1\uffff\6\2\1\uffff\23\2\1\1\1"+
            "\uffff\17\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "2417:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\44\uffff";
    static final String DFA46_eofS =
        "\44\uffff";
    static final String DFA46_minS =
        "\1\4\2\0\41\uffff";
    static final String DFA46_maxS =
        "\1\115\2\0\41\uffff";
    static final String DFA46_acceptS =
        "\3\uffff\2\1\1\2\36\uffff";
    static final String DFA46_specialS =
        "\1\0\1\1\1\2\41\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\1\4\5\11\uffff\3\5\2\uffff\1\5\2\uffff\1\5\1\2\14\uffff"+
            "\2\5\3\uffff\1\5\3\uffff\1\5\1\4\2\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\6\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "2550:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_0 = input.LA(1);

                         
                        int index46_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA46_0==RULE_ID) ) {s = 1;}

                        else if ( (LA46_0==27) ) {s = 2;}

                        else if ( (LA46_0==77) && (synpred20_InternalXTest())) {s = 3;}

                        else if ( (LA46_0==50) && (synpred20_InternalXTest())) {s = 4;}

                        else if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_DECIMAL)||(LA46_0>=18 && LA46_0<=20)||LA46_0==23||LA46_0==26||(LA46_0>=40 && LA46_0<=41)||LA46_0==45||LA46_0==49||(LA46_0>=51 && LA46_0<=52)||LA46_0==54||LA46_0==56||(LA46_0>=60 && LA46_0<=65)||(LA46_0>=67 && LA46_0<=74)) ) {s = 5;}

                         
                        input.seek(index46_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_1 = input.LA(1);

                         
                        int index46_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index46_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA46_2 = input.LA(1);

                         
                        int index46_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index46_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\103\uffff";
    static final String DFA68_eofS =
        "\1\2\102\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA68_maxS =
        "\1\115\1\0\101\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA68_transitionS = {
            "\5\2\4\uffff\1\2\2\uffff\6\2\1\uffff\1\1\5\2\1\uffff\24\2\1"+
            "\uffff\17\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "3926:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\103\uffff";
    static final String DFA71_eofS =
        "\1\2\102\uffff";
    static final String DFA71_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA71_maxS =
        "\1\115\1\0\101\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA71_transitionS = {
            "\5\2\4\uffff\1\2\2\uffff\6\2\1\uffff\4\2\1\1\1\2\1\uffff\24"+
            "\2\1\uffff\17\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "3975:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\42\uffff";
    static final String DFA70_eofS =
        "\42\uffff";
    static final String DFA70_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA70_maxS =
        "\1\115\2\0\37\uffff";
    static final String DFA70_acceptS =
        "\3\uffff\2\1\1\2\33\uffff\1\3";
    static final String DFA70_specialS =
        "\1\0\1\1\1\2\37\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\1\4\5\11\uffff\3\5\2\uffff\1\5\2\uffff\1\5\1\2\1\41\13\uffff"+
            "\2\5\3\uffff\1\5\3\uffff\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "3980:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_0 = input.LA(1);

                         
                        int index70_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA70_0==RULE_ID) ) {s = 1;}

                        else if ( (LA70_0==27) ) {s = 2;}

                        else if ( (LA70_0==77) && (synpred28_InternalXTest())) {s = 3;}

                        else if ( (LA70_0==50) && (synpred28_InternalXTest())) {s = 4;}

                        else if ( ((LA70_0>=RULE_STRING && LA70_0<=RULE_DECIMAL)||(LA70_0>=18 && LA70_0<=20)||LA70_0==23||LA70_0==26||(LA70_0>=40 && LA70_0<=41)||LA70_0==45||LA70_0==49||LA70_0==52||LA70_0==54||LA70_0==56||(LA70_0>=60 && LA70_0<=62)||LA70_0==65||(LA70_0>=67 && LA70_0<=74)) ) {s = 5;}

                        else if ( (LA70_0==28) ) {s = 33;}

                         
                        input.seek(index70_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\103\uffff";
    static final String DFA72_eofS =
        "\1\2\102\uffff";
    static final String DFA72_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA72_maxS =
        "\1\115\1\0\101\uffff";
    static final String DFA72_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA72_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA72_transitionS = {
            "\5\2\4\uffff\1\2\2\uffff\6\2\1\uffff\6\2\1\uffff\23\2\1\1\1"+
            "\uffff\17\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "4059:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\103\uffff";
    static final String DFA74_eofS =
        "\1\37\102\uffff";
    static final String DFA74_minS =
        "\1\4\36\0\44\uffff";
    static final String DFA74_maxS =
        "\1\115\36\0\44\uffff";
    static final String DFA74_acceptS =
        "\37\uffff\1\2\42\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\44\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\1\1\22\1\16\1\17\1\20\4\uffff\1\37\2\uffff\2\37\1\34\1\35"+
            "\1\36\1\37\1\uffff\1\10\2\37\1\12\1\33\1\37\1\uffff\12\37\1"+
            "\4\1\3\3\37\1\2\3\37\1\13\1\uffff\1\37\1\24\1\37\1\7\1\37\1"+
            "\6\3\37\1\25\1\26\1\27\2\37\1\11\1\uffff\1\5\1\14\1\15\1\21"+
            "\1\23\1\30\1\31\1\32\3\37",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "4383:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_3 = input.LA(1);

                         
                        int index74_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA74_4 = input.LA(1);

                         
                        int index74_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA74_5 = input.LA(1);

                         
                        int index74_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA74_6 = input.LA(1);

                         
                        int index74_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA74_7 = input.LA(1);

                         
                        int index74_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA74_8 = input.LA(1);

                         
                        int index74_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA74_9 = input.LA(1);

                         
                        int index74_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA74_10 = input.LA(1);

                         
                        int index74_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA74_11 = input.LA(1);

                         
                        int index74_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA74_12 = input.LA(1);

                         
                        int index74_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA74_13 = input.LA(1);

                         
                        int index74_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA74_14 = input.LA(1);

                         
                        int index74_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA74_15 = input.LA(1);

                         
                        int index74_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA74_16 = input.LA(1);

                         
                        int index74_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA74_17 = input.LA(1);

                         
                        int index74_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA74_18 = input.LA(1);

                         
                        int index74_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA74_19 = input.LA(1);

                         
                        int index74_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA74_20 = input.LA(1);

                         
                        int index74_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA74_21 = input.LA(1);

                         
                        int index74_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA74_22 = input.LA(1);

                         
                        int index74_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA74_23 = input.LA(1);

                         
                        int index74_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA74_24 = input.LA(1);

                         
                        int index74_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA74_25 = input.LA(1);

                         
                        int index74_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA74_26 = input.LA(1);

                         
                        int index74_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA74_27 = input.LA(1);

                         
                        int index74_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA74_28 = input.LA(1);

                         
                        int index74_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA74_29 = input.LA(1);

                         
                        int index74_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA74_30 = input.LA(1);

                         
                        int index74_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA89_eotS =
        "\103\uffff";
    static final String DFA89_eofS =
        "\1\2\102\uffff";
    static final String DFA89_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA89_maxS =
        "\1\115\1\0\101\uffff";
    static final String DFA89_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA89_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA89_transitionS = {
            "\5\2\4\uffff\1\2\2\uffff\6\2\1\uffff\1\1\5\2\1\uffff\24\2\1"+
            "\uffff\17\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA89_eot = DFA.unpackEncodedString(DFA89_eotS);
    static final short[] DFA89_eof = DFA.unpackEncodedString(DFA89_eofS);
    static final char[] DFA89_min = DFA.unpackEncodedStringToUnsignedChars(DFA89_minS);
    static final char[] DFA89_max = DFA.unpackEncodedStringToUnsignedChars(DFA89_maxS);
    static final short[] DFA89_accept = DFA.unpackEncodedString(DFA89_acceptS);
    static final short[] DFA89_special = DFA.unpackEncodedString(DFA89_specialS);
    static final short[][] DFA89_transition;

    static {
        int numStates = DFA89_transitionS.length;
        DFA89_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA89_transition[i] = DFA.unpackEncodedString(DFA89_transitionS[i]);
        }
    }

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = DFA89_eot;
            this.eof = DFA89_eof;
            this.min = DFA89_min;
            this.max = DFA89_max;
            this.accept = DFA89_accept;
            this.special = DFA89_special;
            this.transition = DFA89_transition;
        }
        public String getDescription() {
            return "4899:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA89_1 = input.LA(1);

                         
                        int index89_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index89_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 89, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleBody140 = new BitSet(new long[]{0xF15223000C9C41F2L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleBody163 = new BitSet(new long[]{0xF15223000C9C21F2L,0x00000000000007FBL});
    public static final BitSet FOLLOW_13_in_ruleBody176 = new BitSet(new long[]{0xF15223000C9C01F2L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport263 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleImport283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport319 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleImport331 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleImport343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceWithWildcard_in_ruleImport400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceWithWildcard_in_entryRuleQualifiedNamespaceWithWildcard438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNamespaceWithWildcard449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNamespaceWithWildcard496 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNamespaceWithWildcard514 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedNamespaceWithWildcard527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueName_in_entryRuleUniqueName567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueName577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueName619 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleUniqueName645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTestExpression_in_entryRuleXTestExpression682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTestExpression692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleXTestExpression739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19_in_ruleXTestExpression757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUniqueName_in_ruleXTestExpression779 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXTestExpression800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssertExpression_in_entryRuleXAssertExpression836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssertExpression846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleXAssertExpression892 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXAssertExpression913 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleXAssertExpression934 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXAssertExpression956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTestExpression_in_ruleXPrimaryExpression1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssertExpression_in_ruleXPrimaryExpression1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticEquals_in_entryRuleStaticEquals1465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticEquals1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleStaticEquals1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall1552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall1619 = new BitSet(new long[]{0x0000000004800010L,0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleXFeatureCall1633 = new BitSet(new long[]{0x0000000008000010L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall1654 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall1667 = new BitSet(new long[]{0x0000000008000010L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall1688 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall1702 = new BitSet(new long[]{0x0000000004000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall1728 = new BitSet(new long[]{0x0002000008400002L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall1746 = new BitSet(new long[]{0x0002000008400002L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall1781 = new BitSet(new long[]{0xF15623001C9C01F0L,0x00000000000027FBL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall1866 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall1894 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall1907 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall1928 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall1945 = new BitSet(new long[]{0x0002000000400002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall1978 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleStaticEquals_in_ruleXFeatureCall2005 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXFeatureCall2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression2063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment2153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment2221 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2237 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2287 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2340 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpSingleAssign2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpMultiAssign2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2635 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2688 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2711 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOr2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2894 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2947 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2970 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd3009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAnd3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3153 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3206 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3229 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality3268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpEquality3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpEquality3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3433 = new BitSet(new long[]{0x0000003802800002L});
    public static final BitSet FOLLOW_35_in_ruleXRelationalExpression3469 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3492 = new BitSet(new long[]{0x0000003802800002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3553 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3576 = new BitSet(new long[]{0x0000003802800002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpCompare3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpCompare3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3819 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3872 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3895 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpOther4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4099 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4152 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4175 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd4214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpAdd4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpAdd4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4379 = new BitSet(new long[]{0x00001C0000020002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4432 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4455 = new BitSet(new long[]{0x00001C0000020002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpMulti4543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpMulti4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpMulti4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4708 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpUnary4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpUnary4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpUnary4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4978 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXCastedExpression5013 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5036 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5131 = new BitSet(new long[]{0x0001800000010002L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall5180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5203 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5219 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5241 = new BitSet(new long[]{0x0001800000010002L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall5327 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall5351 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall5388 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleXMemberFeatureCall5417 = new BitSet(new long[]{0x0000000008000010L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5438 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall5451 = new BitSet(new long[]{0x0000000008000010L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5472 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall5486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5511 = new BitSet(new long[]{0x0003800008010002L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall5545 = new BitSet(new long[]{0xF15623001C9C01F0L,0x00000000000027FBL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5630 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5658 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall5671 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5692 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall5709 = new BitSet(new long[]{0x0003800000010002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5742 = new BitSet(new long[]{0x0001800000010002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXClosure6065 = new BitSet(new long[]{0xF15E23000C9C01F0L,0x00000000000027FBL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6136 = new BitSet(new long[]{0x0004000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXClosure6149 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6170 = new BitSet(new long[]{0x0004000001000000L});
    public static final BitSet FOLLOW_50_in_ruleXClosure6192 = new BitSet(new long[]{0xF15A23000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6229 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXClosure6241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6343 = new BitSet(new long[]{0xF15223000C9C21F2L,0x00000000000007FBL});
    public static final BitSet FOLLOW_13_in_ruleXExpressionInClosure6356 = new BitSet(new long[]{0xF15223000C9C01F2L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6514 = new BitSet(new long[]{0x0004000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXShortClosure6527 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6548 = new BitSet(new long[]{0x0004000001000000L});
    public static final BitSet FOLLOW_50_in_ruleXShortClosure6570 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleXParenthesizedExpression6689 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6711 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXParenthesizedExpression6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXIfExpression6814 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXIfExpression6826 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6847 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXIfExpression6859 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6880 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXIfExpression6901 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression7017 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7060 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression7072 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7096 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_27_in_ruleXSwitchExpression7140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7161 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression7173 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7196 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXSwitchExpression7208 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression7222 = new BitSet(new long[]{0x0880000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7243 = new BitSet(new long[]{0x0E80000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression7257 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression7269 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7290 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression7304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7396 = new BitSet(new long[]{0x0880000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXCasePart7410 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7431 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXCasePart7445 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXForLoopExpression7558 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXForLoopExpression7570 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7591 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXForLoopExpression7603 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7624 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXForLoopExpression7636 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXWhileExpression7749 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXWhileExpression7761 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7782 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXWhileExpression7794 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXDoWhileExpression7907 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7928 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleXDoWhileExpression7940 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXDoWhileExpression7952 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7973 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXDoWhileExpression7985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXBlockExpression8077 = new BitSet(new long[]{0xF55223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8099 = new BitSet(new long[]{0xF55223000C9C21F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression8112 = new BitSet(new long[]{0xF55223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_58_in_ruleXBlockExpression8128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXVariableDeclaration8346 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_64_in_ruleXVariableDeclaration8377 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8446 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8475 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleXVariableDeclaration8489 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleIdOrSuper8858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleStaticQualifier8975 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXConstructorCall9072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9095 = new BitSet(new long[]{0x0002000008800002L});
    public static final BitSet FOLLOW_23_in_ruleXConstructorCall9116 = new BitSet(new long[]{0x0000000008000010L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9138 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall9151 = new BitSet(new long[]{0x0000000008000010L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9172 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall9186 = new BitSet(new long[]{0x0002000008000002L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall9209 = new BitSet(new long[]{0xF15623001C9C01F0L,0x00000000000027FBL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9282 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9310 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall9323 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9344 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall9361 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXBooleanLiteral9488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXBooleanLiteral9512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXNullLiteral9618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTypeLiteral9913 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXTypeLiteral9925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9948 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXTypeLiteral9960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXThrowExpression10052 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXReturnExpression10165 = new BitSet(new long[]{0xF15223000C9C01F2L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression10289 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10340 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_ruleXTryCatchFinallyExpression10362 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXTryCatchFinallyExpression10406 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXCatchClause10520 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXCatchClause10533 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10554 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXCatchClause10566 = new BitSet(new long[]{0xF15223000C9C01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10682 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName10710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10733 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10870 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10896 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleNumber10916 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11069 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleJvmTypeReference11107 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleJvmTypeReference11119 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleXFunctionTypeRef11234 = new BitSet(new long[]{0x0000000018000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11256 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_24_in_ruleXFunctionTypeRef11269 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11290 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_28_in_ruleXFunctionTypeRef11306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleXFunctionTypeRef11320 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11435 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleJvmParameterizedTypeReference11456 = new BitSet(new long[]{0x0000000008000010L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11478 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleJvmParameterizedTypeReference11491 = new BitSet(new long[]{0x0000000008000010L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11512 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleJvmParameterizedTypeReference11526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmWildcardTypeReference11739 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmUpperBound11873 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmUpperBoundAnded11977 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleJvmLowerBound12081 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred1_InternalXTest926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred2_InternalXTest1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred3_InternalXTest1815 = new BitSet(new long[]{0x0004000001000000L});
    public static final BitSet FOLLOW_24_in_synpred3_InternalXTest1822 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred3_InternalXTest1829 = new BitSet(new long[]{0x0004000001000000L});
    public static final BitSet FOLLOW_50_in_synpred3_InternalXTest1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred4_InternalXTest1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred5_InternalXTest2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred6_InternalXTest2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred7_InternalXTest2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred8_InternalXTest3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred9_InternalXTest3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred10_InternalXTest3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred11_InternalXTest3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred12_InternalXTest4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred13_InternalXTest4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred14_InternalXTest4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred15_InternalXTest5148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred15_InternalXTest5157 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred15_InternalXTest5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred16_InternalXTest5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred16_InternalXTest5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred16_InternalXTest5300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred17_InternalXTest5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalXTest5579 = new BitSet(new long[]{0x0004000001000000L});
    public static final BitSet FOLLOW_24_in_synpred18_InternalXTest5586 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalXTest5593 = new BitSet(new long[]{0x0004000001000000L});
    public static final BitSet FOLLOW_50_in_synpred18_InternalXTest5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred19_InternalXTest5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXTest6082 = new BitSet(new long[]{0x0004000001000000L});
    public static final BitSet FOLLOW_24_in_synpred20_InternalXTest6089 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXTest6096 = new BitSet(new long[]{0x0004000001000000L});
    public static final BitSet FOLLOW_50_in_synpred20_InternalXTest6110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred22_InternalXTest6893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalXTest7035 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred23_InternalXTest7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred24_InternalXTest7117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalXTest7124 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred24_InternalXTest7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalXTest8395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalXTest8404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred26_InternalXTest9108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred27_InternalXTest9201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalXTest9231 = new BitSet(new long[]{0x0004000001000000L});
    public static final BitSet FOLLOW_24_in_synpred28_InternalXTest9238 = new BitSet(new long[]{0x0000000008000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalXTest9245 = new BitSet(new long[]{0x0004000001000000L});
    public static final BitSet FOLLOW_50_in_synpred28_InternalXTest9259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred29_InternalXTest9377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred30_InternalXTest10179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred31_InternalXTest10324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred32_InternalXTest10354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred34_InternalXTest10701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred35_InternalXTest11084 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred35_InternalXTest11088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred36_InternalXTest11448 = new BitSet(new long[]{0x0000000000000002L});

}