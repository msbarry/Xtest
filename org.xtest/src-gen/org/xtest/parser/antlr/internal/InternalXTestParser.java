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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'import'", "'static'", "'extension'", "'.'", "'*'", "':'", "'xsuite'", "'xtest'", "'assert'", "'?'", "'throws'", "':='", "'<'", "','", "'>'", "'class'", "'('", "')'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'extends'", "'&'"
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
    public static final int T__81=81;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:76:1: ruleBody returns [EObject current=null] : ( () ( ( ( ( RULE_ID ) )=> (lv_fileparam_1_0= ruleFileParam ) ) (otherlv_2= ';' )? )* ( ( (lv_imports_3_0= ruleImport ) ) (otherlv_4= ';' )? )* ( ( (lv_expressions_5_0= ruleXExpressionInsideBlock ) ) (otherlv_6= ';' )? )* ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_fileparam_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_expressions_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:79:28: ( ( () ( ( ( ( RULE_ID ) )=> (lv_fileparam_1_0= ruleFileParam ) ) (otherlv_2= ';' )? )* ( ( (lv_imports_3_0= ruleImport ) ) (otherlv_4= ';' )? )* ( ( (lv_expressions_5_0= ruleXExpressionInsideBlock ) ) (otherlv_6= ';' )? )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:80:1: ( () ( ( ( ( RULE_ID ) )=> (lv_fileparam_1_0= ruleFileParam ) ) (otherlv_2= ';' )? )* ( ( (lv_imports_3_0= ruleImport ) ) (otherlv_4= ';' )? )* ( ( (lv_expressions_5_0= ruleXExpressionInsideBlock ) ) (otherlv_6= ';' )? )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:80:1: ( () ( ( ( ( RULE_ID ) )=> (lv_fileparam_1_0= ruleFileParam ) ) (otherlv_2= ';' )? )* ( ( (lv_imports_3_0= ruleImport ) ) (otherlv_4= ';' )? )* ( ( (lv_expressions_5_0= ruleXExpressionInsideBlock ) ) (otherlv_6= ';' )? )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:80:2: () ( ( ( ( RULE_ID ) )=> (lv_fileparam_1_0= ruleFileParam ) ) (otherlv_2= ';' )? )* ( ( (lv_imports_3_0= ruleImport ) ) (otherlv_4= ';' )? )* ( ( (lv_expressions_5_0= ruleXExpressionInsideBlock ) ) (otherlv_6= ';' )? )*
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:86:2: ( ( ( ( RULE_ID ) )=> (lv_fileparam_1_0= ruleFileParam ) ) (otherlv_2= ';' )? )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==19) && (synpred1_InternalXTest())) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:86:3: ( ( ( RULE_ID ) )=> (lv_fileparam_1_0= ruleFileParam ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:86:3: ( ( ( RULE_ID ) )=> (lv_fileparam_1_0= ruleFileParam ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:86:4: ( ( RULE_ID ) )=> (lv_fileparam_1_0= ruleFileParam )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:92:1: (lv_fileparam_1_0= ruleFileParam )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:93:3: lv_fileparam_1_0= ruleFileParam
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBodyAccess().getFileparamFileParamParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFileParam_in_ruleBody153);
            	    lv_fileparam_1_0=ruleFileParam();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fileparam",
            	              		lv_fileparam_1_0, 
            	              		"FileParam");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:109:2: (otherlv_2= ';' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==13) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:109:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleBody166); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:113:5: ( ( (lv_imports_3_0= ruleImport ) ) (otherlv_4= ';' )? )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:113:6: ( (lv_imports_3_0= ruleImport ) ) (otherlv_4= ';' )?
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:113:6: ( (lv_imports_3_0= ruleImport ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:114:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:114:1: (lv_imports_3_0= ruleImport )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:115:3: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBodyAccess().getImportsImportParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleBody192);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_3_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:131:2: (otherlv_4= ';' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==13) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:131:4: otherlv_4= ';'
            	            {
            	            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleBody205); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:135:5: ( ( (lv_expressions_5_0= ruleXExpressionInsideBlock ) ) (otherlv_6= ';' )? )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_DECIMAL)||(LA6_0>=20 && LA6_0<=22)||LA6_0==26||(LA6_0>=29 && LA6_0<=30)||(LA6_0>=43 && LA6_0<=44)||LA6_0==48||LA6_0==52||LA6_0==55||(LA6_0>=57 && LA6_0<=58)||(LA6_0>=62 && LA6_0<=67)||(LA6_0>=69 && LA6_0<=76)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:135:6: ( (lv_expressions_5_0= ruleXExpressionInsideBlock ) ) (otherlv_6= ';' )?
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:135:6: ( (lv_expressions_5_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:136:1: (lv_expressions_5_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:136:1: (lv_expressions_5_0= ruleXExpressionInsideBlock )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:137:3: lv_expressions_5_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBodyAccess().getExpressionsXExpressionInsideBlockParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleBody231);
            	    lv_expressions_5_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_5_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:153:2: (otherlv_6= ';' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==13) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:153:4: otherlv_6= ';'
            	            {
            	            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleBody244); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getBodyAccess().getSemicolonKeyword_3_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:165:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:166:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:167:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport284);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport294); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:174:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNamespaceWithWildcard ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_importedNamespace_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:177:28: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNamespaceWithWildcard ) ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:178:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNamespaceWithWildcard ) ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:178:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNamespaceWithWildcard ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:178:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNamespaceWithWildcard ) ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport331); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:182:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNamespaceWithWildcard ) ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:182:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:182:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:182:3: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*'
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:182:3: ( (lv_static_1_0= 'static' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:183:1: (lv_static_1_0= 'static' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:183:1: (lv_static_1_0= 'static' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:184:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,15,FOLLOW_15_in_ruleImport351); if (state.failed) return current;
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

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:197:2: ( (lv_extension_2_0= 'extension' ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==16) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:198:1: (lv_extension_2_0= 'extension' )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:198:1: (lv_extension_2_0= 'extension' )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:199:3: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,16,FOLLOW_16_in_ruleImport382); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_extension_2_0, grammarAccess.getImportAccess().getExtensionExtensionKeyword_1_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getImportRule());
                              	        }
                                     		setWithLastConsumed(current, "extension", true, "extension");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:212:3: ( ( ruleQualifiedName ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:213:1: ( ruleQualifiedName )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:213:1: ( ruleQualifiedName )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:214:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getImportRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedTypeJvmTypeCrossReference_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport419);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleImport431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getImportAccess().getFullStopKeyword_1_0_3());
                          
                    }
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleImport443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getImportAccess().getAsteriskKeyword_1_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:236:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:236:6: ( ( ruleQualifiedName ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:237:1: ( ruleQualifiedName )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:237:1: ( ruleQualifiedName )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:238:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getImportRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedTypeJvmTypeCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport473);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:252:6: ( (lv_importedNamespace_7_0= ruleQualifiedNamespaceWithWildcard ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:252:6: ( (lv_importedNamespace_7_0= ruleQualifiedNamespaceWithWildcard ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:253:1: (lv_importedNamespace_7_0= ruleQualifiedNamespaceWithWildcard )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:253:1: (lv_importedNamespace_7_0= ruleQualifiedNamespaceWithWildcard )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:254:3: lv_importedNamespace_7_0= ruleQualifiedNamespaceWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNamespaceWithWildcardParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNamespaceWithWildcard_in_ruleImport500);
                    lv_importedNamespace_7_0=ruleQualifiedNamespaceWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportRule());
                      	        }
                             		set(
                             			current, 
                             			"importedNamespace",
                              		lv_importedNamespace_7_0, 
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:278:1: entryRuleQualifiedNamespaceWithWildcard returns [String current=null] : iv_ruleQualifiedNamespaceWithWildcard= ruleQualifiedNamespaceWithWildcard EOF ;
    public final String entryRuleQualifiedNamespaceWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNamespaceWithWildcard = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:279:2: (iv_ruleQualifiedNamespaceWithWildcard= ruleQualifiedNamespaceWithWildcard EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:280:2: iv_ruleQualifiedNamespaceWithWildcard= ruleQualifiedNamespaceWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNamespaceWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNamespaceWithWildcard_in_entryRuleQualifiedNamespaceWithWildcard538);
            iv_ruleQualifiedNamespaceWithWildcard=ruleQualifiedNamespaceWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNamespaceWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNamespaceWithWildcard549); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:287:1: ruleQualifiedNamespaceWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNamespaceWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:290:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:291:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:291:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:292:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNamespaceWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNamespaceWithWildcard596);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedNamespaceWithWildcard614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNamespaceWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedNamespaceWithWildcard627); if (state.failed) return current;
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


    // $ANTLR start "entryRuleFileParam"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:322:1: entryRuleFileParam returns [EObject current=null] : iv_ruleFileParam= ruleFileParam EOF ;
    public final EObject entryRuleFileParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileParam = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:323:2: (iv_ruleFileParam= ruleFileParam EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:324:2: iv_ruleFileParam= ruleFileParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileParamRule()); 
            }
            pushFollow(FOLLOW_ruleFileParam_in_entryRuleFileParam667);
            iv_ruleFileParam=ruleFileParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileParam677); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFileParam"


    // $ANTLR start "ruleFileParam"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:331:1: ruleFileParam returns [EObject current=null] : ( ( ( ( RULE_ID ) )=> (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleXBooleanLiteral ) ) ) ;
    public final EObject ruleFileParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:334:28: ( ( ( ( ( RULE_ID ) )=> (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleXBooleanLiteral ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:335:1: ( ( ( ( RULE_ID ) )=> (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleXBooleanLiteral ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:335:1: ( ( ( ( RULE_ID ) )=> (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleXBooleanLiteral ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:335:2: ( ( ( RULE_ID ) )=> (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleXBooleanLiteral ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:335:2: ( ( ( RULE_ID ) )=> (otherlv_0= RULE_ID ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:335:3: ( ( RULE_ID ) )=> (otherlv_0= RULE_ID )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:341:1: (otherlv_0= RULE_ID )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:342:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFileParamRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileParam734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getFileParamAccess().getFeatureJvmEnumerationLiteralCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleFileParam746); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFileParamAccess().getColonKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:357:1: ( (lv_value_2_0= ruleXBooleanLiteral ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:358:1: (lv_value_2_0= ruleXBooleanLiteral )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:358:1: (lv_value_2_0= ruleXBooleanLiteral )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:359:3: lv_value_2_0= ruleXBooleanLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFileParamAccess().getValueXBooleanLiteralParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleFileParam767);
            lv_value_2_0=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFileParamRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"XBooleanLiteral");
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
    // $ANTLR end "ruleFileParam"


    // $ANTLR start "entryRuleUniqueName"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:383:1: entryRuleUniqueName returns [EObject current=null] : iv_ruleUniqueName= ruleUniqueName EOF ;
    public final EObject entryRuleUniqueName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueName = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:384:2: (iv_ruleUniqueName= ruleUniqueName EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:385:2: iv_ruleUniqueName= ruleUniqueName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniqueNameRule()); 
            }
            pushFollow(FOLLOW_ruleUniqueName_in_entryRuleUniqueName803);
            iv_ruleUniqueName=ruleUniqueName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniqueName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueName813); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:392:1: ruleUniqueName returns [EObject current=null] : ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) )? ( (lv_identifier_2_0= ruleXParenthesizedExpression ) )? ) ;
    public final EObject ruleUniqueName() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        EObject lv_identifier_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:395:28: ( ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) )? ( (lv_identifier_2_0= ruleXParenthesizedExpression ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:396:1: ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) )? ( (lv_identifier_2_0= ruleXParenthesizedExpression ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:396:1: ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) )? ( (lv_identifier_2_0= ruleXParenthesizedExpression ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:396:2: () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) )? ( (lv_identifier_2_0= ruleXParenthesizedExpression ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:396:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:397:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUniqueNameAccess().getUniqueNameAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:402:2: ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:403:1: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:403:1: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:404:1: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:404:1: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_STRING) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==RULE_ID) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:405:3: lv_name_1_1= RULE_STRING
                            {
                            lv_name_1_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUniqueName866); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_1_1, grammarAccess.getUniqueNameAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getUniqueNameRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_1_1, 
                                      		"STRING");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:420:8: lv_name_1_2= RULE_ID
                            {
                            lv_name_1_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueName886); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_1_2, grammarAccess.getUniqueNameAccess().getNameIDTerminalRuleCall_1_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getUniqueNameRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_1_2, 
                                      		"ID");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:438:3: ( (lv_identifier_2_0= ruleXParenthesizedExpression ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:439:1: (lv_identifier_2_0= ruleXParenthesizedExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:439:1: (lv_identifier_2_0= ruleXParenthesizedExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:440:3: lv_identifier_2_0= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUniqueNameAccess().getIdentifierXParenthesizedExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleUniqueName916);
                    lv_identifier_2_0=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUniqueNameRule());
                      	        }
                             		set(
                             			current, 
                             			"identifier",
                              		lv_identifier_2_0, 
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:464:1: entryRuleXTestExpression returns [EObject current=null] : iv_ruleXTestExpression= ruleXTestExpression EOF ;
    public final EObject entryRuleXTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTestExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:465:2: (iv_ruleXTestExpression= ruleXTestExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:466:2: iv_ruleXTestExpression= ruleXTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTestExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTestExpression_in_entryRuleXTestExpression953);
            iv_ruleXTestExpression=ruleXTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTestExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTestExpression963); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:473:1: ruleXTestExpression returns [EObject current=null] : ( () (otherlv_1= 'xsuite' | otherlv_2= 'xtest' ) ( (lv_name_3_0= ruleUniqueName ) ) ( (lv_expression_4_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleXTestExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_name_3_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:476:28: ( ( () (otherlv_1= 'xsuite' | otherlv_2= 'xtest' ) ( (lv_name_3_0= ruleUniqueName ) ) ( (lv_expression_4_0= ruleXBlockExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:477:1: ( () (otherlv_1= 'xsuite' | otherlv_2= 'xtest' ) ( (lv_name_3_0= ruleUniqueName ) ) ( (lv_expression_4_0= ruleXBlockExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:477:1: ( () (otherlv_1= 'xsuite' | otherlv_2= 'xtest' ) ( (lv_name_3_0= ruleUniqueName ) ) ( (lv_expression_4_0= ruleXBlockExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:477:2: () (otherlv_1= 'xsuite' | otherlv_2= 'xtest' ) ( (lv_name_3_0= ruleUniqueName ) ) ( (lv_expression_4_0= ruleXBlockExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:477:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:478:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTestExpressionAccess().getXTestExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:483:2: (otherlv_1= 'xsuite' | otherlv_2= 'xtest' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            else if ( (LA12_0==21) ) {
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:483:4: otherlv_1= 'xsuite'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleXTestExpression1010); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXTestExpressionAccess().getXsuiteKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:488:7: otherlv_2= 'xtest'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXTestExpression1028); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXTestExpressionAccess().getXtestKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:492:2: ( (lv_name_3_0= ruleUniqueName ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:493:1: (lv_name_3_0= ruleUniqueName )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:493:1: (lv_name_3_0= ruleUniqueName )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:494:3: lv_name_3_0= ruleUniqueName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTestExpressionAccess().getNameUniqueNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUniqueName_in_ruleXTestExpression1050);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:510:2: ( (lv_expression_4_0= ruleXBlockExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:511:1: (lv_expression_4_0= ruleXBlockExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:511:1: (lv_expression_4_0= ruleXBlockExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:512:3: lv_expression_4_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTestExpressionAccess().getExpressionXBlockExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXTestExpression1071);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:536:1: entryRuleXAssertExpression returns [EObject current=null] : iv_ruleXAssertExpression= ruleXAssertExpression EOF ;
    public final EObject entryRuleXAssertExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssertExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:537:2: (iv_ruleXAssertExpression= ruleXAssertExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:538:2: iv_ruleXAssertExpression= ruleXAssertExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssertExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAssertExpression_in_entryRuleXAssertExpression1107);
            iv_ruleXAssertExpression=ruleXAssertExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssertExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssertExpression1117); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:545:1: ruleXAssertExpression returns [EObject current=null] : ( () otherlv_1= 'assert' ( (lv_keepGoing_2_0= '?' ) )? ( (lv_actual_3_0= ruleXExpression ) ) ( ( ( 'throws' )=>otherlv_4= 'throws' ) ( (lv_throws_5_0= ruleJvmTypeReference ) ) )? ) ;
    public final EObject ruleXAssertExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_keepGoing_2_0=null;
        Token otherlv_4=null;
        EObject lv_actual_3_0 = null;

        EObject lv_throws_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:548:28: ( ( () otherlv_1= 'assert' ( (lv_keepGoing_2_0= '?' ) )? ( (lv_actual_3_0= ruleXExpression ) ) ( ( ( 'throws' )=>otherlv_4= 'throws' ) ( (lv_throws_5_0= ruleJvmTypeReference ) ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:549:1: ( () otherlv_1= 'assert' ( (lv_keepGoing_2_0= '?' ) )? ( (lv_actual_3_0= ruleXExpression ) ) ( ( ( 'throws' )=>otherlv_4= 'throws' ) ( (lv_throws_5_0= ruleJvmTypeReference ) ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:549:1: ( () otherlv_1= 'assert' ( (lv_keepGoing_2_0= '?' ) )? ( (lv_actual_3_0= ruleXExpression ) ) ( ( ( 'throws' )=>otherlv_4= 'throws' ) ( (lv_throws_5_0= ruleJvmTypeReference ) ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:549:2: () otherlv_1= 'assert' ( (lv_keepGoing_2_0= '?' ) )? ( (lv_actual_3_0= ruleXExpression ) ) ( ( ( 'throws' )=>otherlv_4= 'throws' ) ( (lv_throws_5_0= ruleJvmTypeReference ) ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:549:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:550:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXAssertExpressionAccess().getXAssertExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleXAssertExpression1163); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXAssertExpressionAccess().getAssertKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:559:1: ( (lv_keepGoing_2_0= '?' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:560:1: (lv_keepGoing_2_0= '?' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:560:1: (lv_keepGoing_2_0= '?' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:561:3: lv_keepGoing_2_0= '?'
                    {
                    lv_keepGoing_2_0=(Token)match(input,23,FOLLOW_23_in_ruleXAssertExpression1181); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_keepGoing_2_0, grammarAccess.getXAssertExpressionAccess().getKeepGoingQuestionMarkKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssertExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "keepGoing", true, "?");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:574:3: ( (lv_actual_3_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:575:1: (lv_actual_3_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:575:1: (lv_actual_3_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:576:3: lv_actual_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAssertExpressionAccess().getActualXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXAssertExpression1216);
            lv_actual_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXAssertExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"actual",
                      		lv_actual_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:592:2: ( ( ( 'throws' )=>otherlv_4= 'throws' ) ( (lv_throws_5_0= ruleJvmTypeReference ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred3_InternalXTest()) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:592:3: ( ( 'throws' )=>otherlv_4= 'throws' ) ( (lv_throws_5_0= ruleJvmTypeReference ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:592:3: ( ( 'throws' )=>otherlv_4= 'throws' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:592:4: ( 'throws' )=>otherlv_4= 'throws'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleXAssertExpression1237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXAssertExpressionAccess().getThrowsKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:597:2: ( (lv_throws_5_0= ruleJvmTypeReference ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:598:1: (lv_throws_5_0= ruleJvmTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:598:1: (lv_throws_5_0= ruleJvmTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:599:3: lv_throws_5_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssertExpressionAccess().getThrowsJvmTypeReferenceParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXAssertExpression1259);
                    lv_throws_5_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssertExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"throws",
                              		lv_throws_5_0, 
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:623:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:624:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:625:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression1297);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression1307); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:632:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XTestExpression_13= ruleXTestExpression | this_XAssertExpression_14= ruleXAssertExpression ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:635:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XTestExpression_13= ruleXTestExpression | this_XAssertExpression_14= ruleXAssertExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:636:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XTestExpression_13= ruleXTestExpression | this_XAssertExpression_14= ruleXAssertExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:636:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XTestExpression_13= ruleXTestExpression | this_XAssertExpression_14= ruleXAssertExpression )
            int alt15=15;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt15=1;
                }
                break;
            case 58:
                {
                alt15=2;
                }
                break;
            case 57:
                {
                alt15=3;
                }
                break;
            case RULE_ID:
            case 26:
            case 29:
            case 67:
                {
                alt15=4;
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 52:
            case 70:
            case 71:
            case 72:
            case 73:
                {
                alt15=5;
                }
                break;
            case 55:
                {
                alt15=6;
                }
                break;
            case 62:
                {
                alt15=7;
                }
                break;
            case 63:
                {
                alt15=8;
                }
                break;
            case 64:
                {
                alt15=9;
                }
                break;
            case 74:
                {
                alt15=10;
                }
                break;
            case 75:
                {
                alt15=11;
                }
                break;
            case 76:
                {
                alt15=12;
                }
                break;
            case 30:
                {
                alt15=13;
                }
                break;
            case 20:
            case 21:
                {
                alt15=14;
                }
                break;
            case 22:
                {
                alt15=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:637:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression1354);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:647:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression1381);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:657:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression1408);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:667:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression1435);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:677:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression1462);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:687:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression1489);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:697:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression1516);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:707:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression1543);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:717:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression1570);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:727:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression1597);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:737:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression1624);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:747:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression1651);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:757:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression1678);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:767:5: this_XTestExpression_13= ruleXTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTestExpressionParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTestExpression_in_ruleXPrimaryExpression1705);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:777:5: this_XAssertExpression_14= ruleXAssertExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXAssertExpressionParserRuleCall_14()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXAssertExpression_in_ruleXPrimaryExpression1732);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:793:1: entryRuleStaticEquals returns [String current=null] : iv_ruleStaticEquals= ruleStaticEquals EOF ;
    public final String entryRuleStaticEquals() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticEquals = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:794:2: (iv_ruleStaticEquals= ruleStaticEquals EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:795:2: iv_ruleStaticEquals= ruleStaticEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleStaticEquals_in_entryRuleStaticEquals1768);
            iv_ruleStaticEquals=ruleStaticEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticEquals.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticEquals1779); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:802:1: ruleStaticEquals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleStaticEquals() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:805:28: (kw= ':=' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:807:2: kw= ':='
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleStaticEquals1816); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:820:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:821:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:822:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall1855);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall1865); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:829:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ( ruleIdOrSuper ) ) | otherlv_8= 'class' ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure ) )? ( () ruleStaticEquals ( (lv_value_18_0= ruleXAssignment ) ) )? ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:832:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ( ruleIdOrSuper ) ) | otherlv_8= 'class' ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure ) )? ( () ruleStaticEquals ( (lv_value_18_0= ruleXAssignment ) ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:833:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ( ruleIdOrSuper ) ) | otherlv_8= 'class' ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure ) )? ( () ruleStaticEquals ( (lv_value_18_0= ruleXAssignment ) ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:833:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ( ruleIdOrSuper ) ) | otherlv_8= 'class' ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure ) )? ( () ruleStaticEquals ( (lv_value_18_0= ruleXAssignment ) ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:833:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ( ruleIdOrSuper ) ) | otherlv_8= 'class' ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure ) )? ( () ruleStaticEquals ( (lv_value_18_0= ruleXAssignment ) ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:833:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:834:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:839:2: ( ( ruleStaticQualifier ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==68) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:840:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:840:1: ( ruleStaticQualifier )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:841:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall1922);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:854:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:854:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall1936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:858:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:859:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:859:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:860:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall1957);
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

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:876:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==27) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:876:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall1970); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:880:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:881:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:881:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:882:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall1991);
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
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall2005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:902:3: ( ( ( ruleIdOrSuper ) ) | otherlv_8= 'class' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==67) ) {
                alt19=1;
            }
            else if ( (LA19_0==29) ) {
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:902:4: ( ( ruleIdOrSuper ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:902:4: ( ( ruleIdOrSuper ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:903:1: ( ruleIdOrSuper )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:903:1: ( ruleIdOrSuper )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:904:3: ruleIdOrSuper
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall2031);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:918:7: otherlv_8= 'class'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleXFeatureCall2049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXFeatureCallAccess().getClassKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:922:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')' )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:922:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')'
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:922:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:922:4: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:929:1: (lv_explicitOperationCall_9_0= '(' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:930:3: lv_explicitOperationCall_9_0= '('
                    {
                    lv_explicitOperationCall_9_0=(Token)match(input,30,FOLLOW_30_in_ruleXFeatureCall2084); if (state.failed) return current;
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

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:943:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )?
                    int alt21=3;
                    alt21 = dfa21.predict(input);
                    switch (alt21) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:943:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:943:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:943:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:960:1: (lv_featureCallArguments_10_0= ruleXShortClosure )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:961:3: lv_featureCallArguments_10_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall2169);
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
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:978:6: ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:978:6: ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:978:7: ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:978:7: ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:979:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:979:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:980:3: lv_featureCallArguments_11_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall2197);
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

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:996:2: (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==27) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:996:4: otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) )
                            	    {
                            	    otherlv_12=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall2210); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_12, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1000:1: ( (lv_featureCallArguments_13_0= ruleXExpression ) )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1001:1: (lv_featureCallArguments_13_0= ruleXExpression )
                            	    {
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1001:1: (lv_featureCallArguments_13_0= ruleXExpression )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1002:3: lv_featureCallArguments_13_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall2231);
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
                            	    break loop20;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,31,FOLLOW_31_in_ruleXFeatureCall2248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1022:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure ) )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1022:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1027:1: (lv_featureCallArguments_15_0= ruleXClosure )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1028:3: lv_featureCallArguments_15_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall2281);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1044:3: ( () ruleStaticEquals ( (lv_value_18_0= ruleXAssignment ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1044:4: () ruleStaticEquals ( (lv_value_18_0= ruleXAssignment ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1044:4: ()
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1045:5: 
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
                    pushFollow(FOLLOW_ruleStaticEquals_in_ruleXFeatureCall2308);
                    ruleStaticEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1058:1: ( (lv_value_18_0= ruleXAssignment ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1059:1: (lv_value_18_0= ruleXAssignment )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1059:1: (lv_value_18_0= ruleXAssignment )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1060:3: lv_value_18_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getValueXAssignmentParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXFeatureCall2328);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1084:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1085:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1086:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression2366);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression2376); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1093:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1096:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1098:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression2422);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1114:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1115:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1116:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment2456);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment2466); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1123:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1126:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1127:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1127:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==EOF||(LA26_1>=RULE_ID && LA26_1<=RULE_DECIMAL)||LA26_1==13||(LA26_1>=17 && LA26_1<=22)||(LA26_1>=24 && LA26_1<=31)||(LA26_1>=33 && LA26_1<=52)||(LA26_1>=54 && LA26_1<=79)) ) {
                    alt26=2;
                }
                else if ( (LA26_1==32) ) {
                    alt26=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_DECIMAL)||(LA26_0>=20 && LA26_0<=22)||LA26_0==26||(LA26_0>=29 && LA26_0<=30)||(LA26_0>=43 && LA26_0<=44)||LA26_0==48||LA26_0==52||LA26_0==55||(LA26_0>=57 && LA26_0<=58)||(LA26_0>=62 && LA26_0<=64)||LA26_0==67||(LA26_0>=69 && LA26_0<=76)) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1127:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1127:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1127:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1127:3: ()
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1128:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1133:2: ( ( ruleValidID ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1134:1: ( ruleValidID )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1134:1: ( ruleValidID )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1135:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment2524);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2540);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1156:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1157:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1157:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1158:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2560);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1175:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1175:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1176:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2590);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1184:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==33) ) {
                        int LA25_1 = input.LA(2);

                        if ( (synpred7_InternalXTest()) ) {
                            alt25=1;
                        }
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1184:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1184:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1184:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1189:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1189:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1189:7: ()
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1190:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1195:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1196:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1196:1: ( ruleOpMultiAssign )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1197:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2643);
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

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1210:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1211:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1211:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1212:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2666);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1236:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1237:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1238:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2706);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign2717); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1245:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1248:28: (kw= '=' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1250:2: kw= '='
            {
            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpSingleAssign2754); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1263:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1264:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1265:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2794);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2805); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1272:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1275:28: (kw= '+=' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1277:2: kw= '+='
            {
            kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMultiAssign2842); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1290:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1291:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1292:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2881);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2891); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1299:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1302:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1303:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1303:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1304:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2938);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1312:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==34) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred8_InternalXTest()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1312:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1312:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1312:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1317:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1317:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1317:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1318:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1323:2: ( ( ruleOpOr ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1324:1: ( ruleOpOr )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1324:1: ( ruleOpOr )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1325:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2991);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1338:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1339:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1339:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1340:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3014);
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
            	    break loop27;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1364:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1365:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1366:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr3053);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr3064); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1373:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1376:28: (kw= '||' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1378:2: kw= '||'
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOr3101); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1391:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1392:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1393:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression3140);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression3150); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1400:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1403:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1404:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1404:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1405:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3197);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1413:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==35) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred9_InternalXTest()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1413:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1413:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1413:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1418:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1418:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1418:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1419:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1424:2: ( ( ruleOpAnd ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1425:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1425:1: ( ruleOpAnd )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1426:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression3250);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1439:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1440:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1440:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1441:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3273);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1465:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1466:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1467:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd3312);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd3323); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1474:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1477:28: (kw= '&&' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1479:2: kw= '&&'
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAnd3360); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1492:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1493:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1494:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3399);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression3409); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1501:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1504:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1505:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1505:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1506:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3456);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1514:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==36) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred10_InternalXTest()) ) {
                        alt29=1;
                    }


                }
                else if ( (LA29_0==37) ) {
                    int LA29_3 = input.LA(2);

                    if ( (synpred10_InternalXTest()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1514:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1514:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1514:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1519:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1519:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1519:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1520:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1525:2: ( ( ruleOpEquality ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1526:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1526:1: ( ruleOpEquality )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1527:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3509);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1540:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1541:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1541:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1542:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3532);
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
            	    break loop29;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1566:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1567:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1568:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality3571);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality3582); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1575:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1578:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1579:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1579:1: (kw= '==' | kw= '!=' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            else if ( (LA30_0==37) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1580:2: kw= '=='
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpEquality3620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1587:2: kw= '!='
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpEquality3639); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1600:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1601:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1602:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3679);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression3689); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1609:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1612:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1613:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1613:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1614:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3736);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1622:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop31:
            do {
                int alt31=3;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred11_InternalXTest()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred12_InternalXTest()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred12_InternalXTest()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA31_5 = input.LA(2);

                    if ( (synpred12_InternalXTest()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA31_6 = input.LA(2);

                    if ( (synpred12_InternalXTest()) ) {
                        alt31=2;
                    }


                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1622:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1622:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1622:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1622:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1622:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1624:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1624:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1624:6: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1625:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXRelationalExpression3772); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1634:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1635:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1635:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1636:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3795);
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
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1653:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1653:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1653:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1653:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1653:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1658:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1658:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1658:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1659:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1664:2: ( ( ruleOpCompare ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1665:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1665:1: ( ruleOpCompare )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1666:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3856);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1679:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1680:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1680:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1681:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3879);
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
            	    break loop31;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1705:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1706:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1707:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3919);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3930); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1714:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1717:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1718:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1718:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt32=1;
                }
                break;
            case 40:
                {
                alt32=2;
                }
                break;
            case 28:
                {
                alt32=3;
                }
                break;
            case 26:
                {
                alt32=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1719:2: kw= '>='
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpCompare3968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1726:2: kw= '<='
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpCompare3987); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1733:2: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare4006); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1740:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare4025); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1753:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1754:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1755:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4065);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression4075); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1762:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1765:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1766:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1766:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1767:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4122);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1775:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==41) ) {
                    int LA33_2 = input.LA(2);

                    if ( (synpred13_InternalXTest()) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==42) ) {
                    int LA33_3 = input.LA(2);

                    if ( (synpred13_InternalXTest()) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1775:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1775:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1775:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1780:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1780:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1780:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1781:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1786:2: ( ( ruleOpOther ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1787:1: ( ruleOpOther )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1787:1: ( ruleOpOther )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1788:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression4175);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1801:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1802:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1802:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1803:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4198);
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
            	    break loop33;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1827:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1828:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1829:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther4237);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther4248); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1836:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1839:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1840:1: (kw= '->' | kw= '..' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1840:1: (kw= '->' | kw= '..' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            else if ( (LA34_0==42) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1841:2: kw= '->'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpOther4286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1848:2: kw= '..'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpOther4305); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1861:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1862:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1863:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4345);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression4355); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1870:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1873:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1874:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1874:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1875:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4402);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1883:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==43) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred14_InternalXTest()) ) {
                        alt35=1;
                    }


                }
                else if ( (LA35_0==44) ) {
                    int LA35_3 = input.LA(2);

                    if ( (synpred14_InternalXTest()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1883:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1883:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1883:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1888:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1888:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1888:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1889:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1894:2: ( ( ruleOpAdd ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1895:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1895:1: ( ruleOpAdd )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1896:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4455);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1909:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1910:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1910:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1911:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4478);
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
            	    break loop35;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1935:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1936:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1937:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd4517);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd4528); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1944:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1947:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1948:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1948:1: (kw= '+' | kw= '-' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==43) ) {
                alt36=1;
            }
            else if ( (LA36_0==44) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1949:2: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpAdd4566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1956:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpAdd4585); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1969:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1970:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1971:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4625);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4635); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1978:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1981:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1982:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1982:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1983:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4682);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1991:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop37:
            do {
                int alt37=2;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    int LA37_2 = input.LA(2);

                    if ( (synpred15_InternalXTest()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA37_3 = input.LA(2);

                    if ( (synpred15_InternalXTest()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA37_4 = input.LA(2);

                    if ( (synpred15_InternalXTest()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA37_5 = input.LA(2);

                    if ( (synpred15_InternalXTest()) ) {
                        alt37=1;
                    }


                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1991:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1991:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1991:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1996:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1996:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1996:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1997:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2002:2: ( ( ruleOpMulti ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2003:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2003:1: ( ruleOpMulti )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2004:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4735);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2017:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2018:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2018:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2019:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4758);
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
            	    break loop37;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2043:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2044:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2045:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4797);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4808); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2052:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2055:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2056:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2056:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt38=1;
                }
                break;
            case 45:
                {
                alt38=2;
                }
                break;
            case 46:
                {
                alt38=3;
                }
                break;
            case 47:
                {
                alt38=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2057:2: kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleOpMulti4846); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2064:2: kw= '**'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpMulti4865); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2071:2: kw= '/'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpMulti4884); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2078:2: kw= '%'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpMulti4903); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2091:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2092:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2093:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4943);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4953); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2100:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2103:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2104:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2104:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=43 && LA39_0<=44)||LA39_0==48) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_DECIMAL)||(LA39_0>=20 && LA39_0<=22)||LA39_0==26||(LA39_0>=29 && LA39_0<=30)||LA39_0==52||LA39_0==55||(LA39_0>=57 && LA39_0<=58)||(LA39_0>=62 && LA39_0<=64)||LA39_0==67||(LA39_0>=69 && LA39_0<=76)) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2104:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2104:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2104:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2104:3: ()
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2105:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2110:2: ( ( ruleOpUnary ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2111:1: ( ruleOpUnary )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2111:1: ( ruleOpUnary )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2112:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5011);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2125:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2126:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2126:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2127:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5032);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2145:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5061);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2161:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2162:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2163:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary5097);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary5108); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2170:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2173:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2174:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2174:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt40=1;
                }
                break;
            case 44:
                {
                alt40=2;
                }
                break;
            case 43:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2175:2: kw= '!'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpUnary5146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2182:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpUnary5165); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2189:2: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary5184); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2202:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2203:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2204:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5224);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression5234); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2211:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2214:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2215:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2215:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2216:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5281);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2224:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==49) ) {
                    int LA41_2 = input.LA(2);

                    if ( (synpred16_InternalXTest()) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2224:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2224:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2224:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2226:5: ( () otherlv_2= 'as' )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2226:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2226:6: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2227:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXCastedExpression5316); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2236:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2237:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2237:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2238:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5339);
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
            	    break loop41;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2262:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2263:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2264:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5377);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall5387); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2271:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2274:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2275:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2275:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2276:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5434);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2284:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop49:
            do {
                int alt49=3;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA49_2 = input.LA(2);

                    if ( (synpred17_InternalXTest()) ) {
                        alt49=1;
                    }
                    else if ( (synpred18_InternalXTest()) ) {
                        alt49=2;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA49_3 = input.LA(2);

                    if ( (synpred18_InternalXTest()) ) {
                        alt49=2;
                    }


                    }
                    break;
                case 51:
                    {
                    int LA49_4 = input.LA(2);

                    if ( (synpred18_InternalXTest()) ) {
                        alt49=2;
                    }


                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2284:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2284:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2284:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2284:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2284:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2290:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2290:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2290:26: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2291:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall5483); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2300:1: ( ( ruleValidID ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2301:1: ( ruleValidID )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2301:1: ( ruleValidID )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2302:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5506);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5522);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2323:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2324:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2324:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2325:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5544);
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
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2342:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2342:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2342:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2342:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2342:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2358:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2358:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2358:8: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2359:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2364:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt42=3;
            	    switch ( input.LA(1) ) {
            	    case 17:
            	        {
            	        alt42=1;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt42=2;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt42=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt42) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2364:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall5630); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2369:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2369:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2370:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2370:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2371:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,50,FOLLOW_50_in_ruleXMemberFeatureCall5654); if (state.failed) return current;
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
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2385:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2385:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2386:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2386:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2387:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,51,FOLLOW_51_in_ruleXMemberFeatureCall5691); if (state.failed) return current;
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2400:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==26) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2400:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall5720); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2404:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2405:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2405:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2406:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5741);
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

            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2422:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop43:
            	            do {
            	                int alt43=2;
            	                int LA43_0 = input.LA(1);

            	                if ( (LA43_0==27) ) {
            	                    alt43=1;
            	                }


            	                switch (alt43) {
            	            	case 1 :
            	            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2422:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall5754); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2426:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2427:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2427:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2428:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5775);
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
            	            	    break loop43;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall5789); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2448:3: ( ( ruleValidID ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2449:1: ( ruleValidID )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2449:1: ( ruleValidID )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2450:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5814);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2463:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt47=2;
            	    alt47 = dfa47.predict(input);
            	    switch (alt47) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2463:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2463:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2463:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2470:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2471:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,30,FOLLOW_30_in_ruleXMemberFeatureCall5848); if (state.failed) return current;
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

            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2484:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt46=3;
            	            alt46 = dfa46.predict(input);
            	            switch (alt46) {
            	                case 1 :
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2484:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2484:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2484:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2501:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2502:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5933);
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
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2519:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2519:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2519:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2519:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2520:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2520:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2521:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5961);
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

            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2537:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop45:
            	                    do {
            	                        int alt45=2;
            	                        int LA45_0 = input.LA(1);

            	                        if ( (LA45_0==27) ) {
            	                            alt45=1;
            	                        }


            	                        switch (alt45) {
            	                    	case 1 :
            	                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2537:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall5974); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2541:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2542:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2542:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2543:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5995);
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
            	                    	    break loop45;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,31,FOLLOW_31_in_ruleXMemberFeatureCall6012); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2563:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt48=2;
            	    alt48 = dfa48.predict(input);
            	    switch (alt48) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2563:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2568:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2569:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall6045);
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
            	    break loop49;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2593:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2594:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2595:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral6085);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral6095); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2602:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2605:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2606:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2606:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt50=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt50=1;
                }
                break;
            case 70:
            case 71:
                {
                alt50=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt50=3;
                }
                break;
            case 72:
                {
                alt50=4;
                }
                break;
            case RULE_STRING:
                {
                alt50=5;
                }
                break;
            case 73:
                {
                alt50=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2607:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral6142);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2617:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6169);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2627:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral6196);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2637:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral6223);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2647:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral6250);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2657:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6277);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2673:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2674:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2675:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6312);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6322); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2682:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2685:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2686:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2686:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2686:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2686:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2687:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXClosure6368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2696:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2696:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2711:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2711:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2711:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_ID||LA52_0==30||LA52_0==79) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2711:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2711:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2712:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2712:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2713:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6439);
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

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2729:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==27) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2729:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleXClosure6452); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2733:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2734:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2734:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2735:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6473);
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
                            	    break loop51;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2751:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2752:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2752:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2753:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,53,FOLLOW_53_in_ruleXClosure6495); if (state.failed) return current;
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2766:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2767:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2767:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2768:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6532);
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

            otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleXClosure6544); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2796:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2797:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2798:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6580);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6590); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2805:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2808:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2809:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2809:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2809:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2809:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2810:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2815:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_DECIMAL)||(LA55_0>=20 && LA55_0<=22)||LA55_0==26||(LA55_0>=29 && LA55_0<=30)||(LA55_0>=43 && LA55_0<=44)||LA55_0==48||LA55_0==52||LA55_0==55||(LA55_0>=57 && LA55_0<=58)||(LA55_0>=62 && LA55_0<=67)||(LA55_0>=69 && LA55_0<=76)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2815:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2815:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2816:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2816:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2817:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6646);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2833:2: (otherlv_2= ';' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==13) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2833:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXExpressionInClosure6659); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2845:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2846:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2847:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6699);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6709); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2854:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2857:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2858:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2858:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2858:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2858:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2858:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2874:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2874:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2874:7: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2875:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2880:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID||LA57_0==30||LA57_0==79) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2880:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2880:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2881:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2881:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2882:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6817);
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

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2898:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==27) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2898:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXShortClosure6830); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2902:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2903:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2903:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2904:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6851);
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
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2920:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2921:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2921:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2922:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,53,FOLLOW_53_in_ruleXShortClosure6873); if (state.failed) return current;
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2935:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2936:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2936:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2937:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6909);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2961:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2962:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2963:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6945);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6955); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2970:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2973:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2974:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2974:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2974:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleXParenthesizedExpression6992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7014);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleXParenthesizedExpression7025); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2999:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3000:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3001:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7061);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression7071); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3008:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3011:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3012:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3012:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3012:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3012:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3013:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXIfExpression7117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleXIfExpression7129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3026:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3027:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3027:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3028:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7150);
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

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleXIfExpression7162); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3048:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3049:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3049:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3050:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7183);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3066:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==56) ) {
                int LA58_1 = input.LA(2);

                if ( (synpred24_InternalXTest()) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3066:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3066:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3066:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleXIfExpression7204); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3071:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3072:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3072:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3073:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7226);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3097:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3098:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3099:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7264);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression7274); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3106:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3109:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3110:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3110:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3110:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3110:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3111:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression7320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3120:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_DECIMAL)||(LA60_0>=20 && LA60_0<=22)||LA60_0==26||LA60_0==29||(LA60_0>=43 && LA60_0<=44)||LA60_0==48||LA60_0==52||LA60_0==55||(LA60_0>=57 && LA60_0<=58)||(LA60_0>=62 && LA60_0<=64)||LA60_0==67||(LA60_0>=69 && LA60_0<=76)) ) {
                alt60=1;
            }
            else if ( (LA60_0==30) ) {
                int LA60_2 = input.LA(2);

                if ( (LA60_2==RULE_ID) ) {
                    int LA60_3 = input.LA(3);

                    if ( ((LA60_3>=17 && LA60_3<=18)||(LA60_3>=25 && LA60_3<=26)||LA60_3==28||(LA60_3>=30 && LA60_3<=47)||(LA60_3>=49 && LA60_3<=52)||LA60_3==68) ) {
                        alt60=1;
                    }
                    else if ( (LA60_3==19) && (synpred26_InternalXTest())) {
                        alt60=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA60_2>=RULE_STRING && LA60_2<=RULE_DECIMAL)||(LA60_2>=20 && LA60_2<=22)||LA60_2==26||(LA60_2>=29 && LA60_2<=30)||(LA60_2>=43 && LA60_2<=44)||LA60_2==48||LA60_2==52||LA60_2==55||(LA60_2>=57 && LA60_2<=58)||(LA60_2>=62 && LA60_2<=64)||LA60_2==67||(LA60_2>=69 && LA60_2<=76)) ) {
                    alt60=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3120:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3120:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3120:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3120:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==RULE_ID) ) {
                        int LA59_1 = input.LA(2);

                        if ( (LA59_1==19) && (synpred25_InternalXTest())) {
                            alt59=1;
                        }
                    }
                    switch (alt59) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3120:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3125:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3125:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3125:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3126:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3126:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3127:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7363);
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

                            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleXSwitchExpression7375); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3147:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3148:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3148:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3149:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7399);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3166:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3166:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3166:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3166:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3166:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3172:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3172:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleXSwitchExpression7443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3176:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3177:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3177:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3178:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7464);
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

                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleXSwitchExpression7476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3198:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3199:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3199:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3200:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7499);
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

                    otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleXSwitchExpression7511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression7525); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3224:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_ID||LA61_0==19||LA61_0==30||LA61_0==61||LA61_0==79) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3225:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3225:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3226:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7546);
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
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3242:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==59) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3242:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,59,FOLLOW_59_in_ruleXSwitchExpression7560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,19,FOLLOW_19_in_ruleXSwitchExpression7572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3250:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3251:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3251:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3252:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7593);
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

            otherlv_15=(Token)match(input,60,FOLLOW_60_in_ruleXSwitchExpression7607); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3280:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3281:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3282:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7643);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7653); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3289:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3292:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3293:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3293:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3293:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3293:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID||LA63_0==30||LA63_0==79) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3294:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3294:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3295:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7699);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3311:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==61) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3311:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXCasePart7713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3315:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3316:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3316:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3317:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7734);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleXCasePart7748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3337:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3338:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3338:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3339:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7769);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3363:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3364:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3365:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7805);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7815); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3372:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3375:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3376:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3376:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3376:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3376:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3377:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXForLoopExpression7861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleXForLoopExpression7873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3390:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3391:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3391:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3392:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7894);
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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleXForLoopExpression7906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3412:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3413:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3413:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3414:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7927);
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

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleXForLoopExpression7939); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3434:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3435:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3435:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3436:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7960);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3460:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3461:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3462:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7996);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression8006); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3469:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3472:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3473:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3473:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3473:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3473:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3474:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXWhileExpression8052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleXWhileExpression8064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3487:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3488:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3488:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3489:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8085);
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

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleXWhileExpression8097); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3509:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3510:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3510:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3511:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8118);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3535:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3536:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3537:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8154);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression8164); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3544:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3547:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3548:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3548:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3548:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3548:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3549:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXDoWhileExpression8210); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3558:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3559:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3559:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3560:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8231);
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

            otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleXDoWhileExpression8243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleXDoWhileExpression8255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3584:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3585:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3585:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3586:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8276);
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

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleXDoWhileExpression8288); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3614:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3615:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3616:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8324);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8334); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3623:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3626:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3627:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3627:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3627:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3627:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3628:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXBlockExpression8380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3637:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=RULE_ID && LA66_0<=RULE_DECIMAL)||(LA66_0>=20 && LA66_0<=22)||LA66_0==26||(LA66_0>=29 && LA66_0<=30)||(LA66_0>=43 && LA66_0<=44)||LA66_0==48||LA66_0==52||LA66_0==55||(LA66_0>=57 && LA66_0<=58)||(LA66_0>=62 && LA66_0<=67)||(LA66_0>=69 && LA66_0<=76)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3637:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3637:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3638:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3638:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3639:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8402);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3655:2: (otherlv_3= ';' )?
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==13) ) {
            	        alt65=1;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3655:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression8415); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleXBlockExpression8431); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3671:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3672:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3673:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8467);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8477); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3680:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3683:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3684:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3684:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=65 && LA67_0<=66)) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=RULE_ID && LA67_0<=RULE_DECIMAL)||(LA67_0>=20 && LA67_0<=22)||LA67_0==26||(LA67_0>=29 && LA67_0<=30)||(LA67_0>=43 && LA67_0<=44)||LA67_0==48||LA67_0==52||LA67_0==55||(LA67_0>=57 && LA67_0<=58)||(LA67_0>=62 && LA67_0<=64)||LA67_0==67||(LA67_0>=69 && LA67_0<=76)) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3685:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8524);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3695:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8551);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3711:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3712:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3713:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8586);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8596); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3720:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3723:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3724:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3724:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3724:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3724:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3725:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3730:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==65) ) {
                alt68=1;
            }
            else if ( (LA68_0==66) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3730:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3730:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3731:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3731:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3732:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,65,FOLLOW_65_in_ruleXVariableDeclaration8649); if (state.failed) return current;
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3746:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleXVariableDeclaration8680); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3750:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                int LA69_1 = input.LA(2);

                if ( (synpred27_InternalXTest()) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA69_0==30) && (synpred27_InternalXTest())) {
                alt69=1;
            }
            else if ( (LA69_0==79) && (synpred27_InternalXTest())) {
                alt69=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3750:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3750:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3750:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3758:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3758:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3758:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3759:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3759:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3760:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8728);
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

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3776:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3777:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3777:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3778:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8749);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3795:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3795:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3796:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3796:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3797:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8778);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3813:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==32) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3813:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleXVariableDeclaration8792); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3817:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3818:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3818:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3819:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8813);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3843:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3844:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3845:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8851);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8861); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3852:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3855:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3856:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3856:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3856:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3856:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==RULE_ID||LA71_1==17||LA71_1==26||LA71_1==52) ) {
                    alt71=1;
                }
            }
            else if ( (LA71_0==30||LA71_0==79) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3857:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3857:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3858:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8907);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3874:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3875:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3875:1: (lv_name_1_0= ruleValidID )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3876:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8929);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3900:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3901:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3902:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8965);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8975); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3909:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3912:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3913:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3913:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3913:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3913:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3914:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3914:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3915:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter9021);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3931:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3932:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3932:1: (lv_name_1_0= ruleValidID )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3933:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter9042);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3957:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3958:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3959:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9079);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9090); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3966:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3969:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3970:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3970:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID) ) {
                alt72=1;
            }
            else if ( (LA72_0==67) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3971:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper9137);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3983:2: kw= 'super'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleIdOrSuper9161); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3996:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3997:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3998:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9202);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9213); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4005:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4008:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4009:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4009:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_ID) ) {
                    int LA73_2 = input.LA(2);

                    if ( (LA73_2==68) ) {
                        alt73=1;
                    }


                }


                switch (alt73) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4010:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9260);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,68,FOLLOW_68_in_ruleStaticQualifier9278); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt73 >= 1 ) break loop73;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4034:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4035:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4036:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9319);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9329); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4043:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4046:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4047:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4047:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4047:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4047:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4048:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXConstructorCall9375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4057:1: ( ( ruleQualifiedName ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4058:1: ( ruleQualifiedName )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4058:1: ( ruleQualifiedName )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4059:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9398);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4072:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4072:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4072:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4072:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall9419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4077:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4078:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4078:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4079:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9441);
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

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4095:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==27) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4095:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall9454); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4099:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4100:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4100:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4101:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9475);
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
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall9489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4121:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4121:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4121:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4121:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleXConstructorCall9512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4126:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt77=3;
                    alt77 = dfa77.predict(input);
                    switch (alt77) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4126:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4126:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4126:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4143:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4144:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9585);
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
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4161:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4161:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4161:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4161:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4162:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4162:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4163:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9613);
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

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4179:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop76:
                            do {
                                int alt76=2;
                                int LA76_0 = input.LA(1);

                                if ( (LA76_0==27) ) {
                                    alt76=1;
                                }


                                switch (alt76) {
                            	case 1 :
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4179:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall9626); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4183:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4184:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4184:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4185:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9647);
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
                            	    break loop76;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,31,FOLLOW_31_in_ruleXConstructorCall9664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4205:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4205:4: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4210:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4211:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9697);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4235:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4236:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4237:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9734);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9744); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4244:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4247:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4248:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4248:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4248:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4248:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4249:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4254:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==70) ) {
                alt80=1;
            }
            else if ( (LA80_0==71) ) {
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4254:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXBooleanLiteral9791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4259:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4259:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4260:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4260:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4261:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,71,FOLLOW_71_in_ruleXBooleanLiteral9815); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4282:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4283:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4284:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9865);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9875); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4291:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4294:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4295:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4295:1: ( () otherlv_1= 'null' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4295:2: () otherlv_1= 'null'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4295:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4296:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXNullLiteral9921); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4313:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4314:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4315:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9957);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9967); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4322:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4325:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4326:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4326:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4326:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4326:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4327:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4332:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4333:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4333:1: (lv_value_1_0= ruleNumber )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4334:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral10022);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4358:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4359:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4360:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10058);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral10068); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4367:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4370:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4371:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4371:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4371:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4371:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4372:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4377:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4378:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4378:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4379:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10119); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4403:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4404:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4405:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10160);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10170); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4412:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4415:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4416:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4416:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4416:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4416:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4417:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTypeLiteral10216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleXTypeLiteral10228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4430:1: ( ( ruleQualifiedName ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4431:1: ( ruleQualifiedName )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4431:1: ( ruleQualifiedName )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4432:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10251);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleXTypeLiteral10263); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4457:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4458:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4459:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10299);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10309); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4466:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4469:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4470:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4470:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4470:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4470:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4471:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXThrowExpression10355); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4480:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4481:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4481:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4482:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10376);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4506:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4507:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4508:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10412);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10422); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4515:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4518:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4519:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4519:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4519:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4519:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4520:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXReturnExpression10468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4529:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt81=2;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4529:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4534:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4535:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10499);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4559:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4560:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4561:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10536);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10546); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4568:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4571:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4572:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4572:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4572:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4572:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4573:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4582:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4583:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4583:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4584:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10613);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4600:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==78) ) {
                alt84=1;
            }
            else if ( (LA84_0==77) ) {
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4600:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4600:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4600:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4600:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt82=0;
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==78) ) {
                            int LA82_2 = input.LA(2);

                            if ( (synpred33_InternalXTest()) ) {
                                alt82=1;
                            }


                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4600:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4602:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4603:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10643);
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
                    	    if ( cnt82 >= 1 ) break loop82;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(82, input);
                                throw eee;
                        }
                        cnt82++;
                    } while (true);

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4619:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==77) ) {
                        int LA83_1 = input.LA(2);

                        if ( (synpred34_InternalXTest()) ) {
                            alt83=1;
                        }
                    }
                    switch (alt83) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4619:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4619:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4619:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10665); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4624:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4625:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4625:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4626:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10687);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4643:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4643:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4643:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4647:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4648:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4648:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4649:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10730);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4673:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4674:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4675:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10768);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10778); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4682:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4685:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4686:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4686:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4686:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4686:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4686:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleXCatchClause10823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleXCatchClause10836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4695:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4696:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4696:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4697:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10857);
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

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleXCatchClause10869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4717:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4718:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4718:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4719:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10890);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4743:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4744:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4745:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10927);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10938); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4752:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4755:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4756:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4756:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4757:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10985);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4767:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==17) ) {
                    int LA85_1 = input.LA(2);

                    if ( (LA85_1==RULE_ID) ) {
                        int LA85_3 = input.LA(3);

                        if ( (synpred36_InternalXTest()) ) {
                            alt85=1;
                        }


                    }


                }


                switch (alt85) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4767:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4767:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4767:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedName11013); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11036);
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
            	    break loop85;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4794:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4798:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4799:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber11090);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber11101); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4809:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4813:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4814:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4814:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_HEX) ) {
                alt89=1;
            }
            else if ( ((LA89_0>=RULE_INT && LA89_0<=RULE_DECIMAL)) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4814:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber11145); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4822:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4822:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4822:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4822:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==RULE_INT) ) {
                        alt86=1;
                    }
                    else if ( (LA86_0==RULE_DECIMAL) ) {
                        alt86=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 0, input);

                        throw nvae;
                    }
                    switch (alt86) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4822:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11173); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4830:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11199); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4837:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==17) ) {
                        int LA88_1 = input.LA(2);

                        if ( ((LA88_1>=RULE_INT && LA88_1<=RULE_DECIMAL)) ) {
                            alt88=1;
                        }
                    }
                    switch (alt88) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4838:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,17,FOLLOW_17_in_ruleNumber11219); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4843:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==RULE_INT) ) {
                                alt87=1;
                            }
                            else if ( (LA87_0==RULE_DECIMAL) ) {
                                alt87=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 87, 0, input);

                                throw nvae;
                            }
                            switch (alt87) {
                                case 1 :
                                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4843:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11235); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4851:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11261); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4869:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4870:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4871:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11314);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11324); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4878:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4881:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4882:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4882:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_ID) ) {
                alt91=1;
            }
            else if ( (LA91_0==30||LA91_0==79) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4882:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4882:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4883:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11372);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4891:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==52) ) {
                            int LA90_2 = input.LA(2);

                            if ( (LA90_2==54) ) {
                                int LA90_3 = input.LA(3);

                                if ( (synpred37_InternalXTest()) ) {
                                    alt90=1;
                                }


                            }


                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4891:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4894:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4894:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4894:6: ()
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4895:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleJvmTypeReference11410); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleJvmTypeReference11422); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4910:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11454);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4926:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4927:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4928:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11489);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11499); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4935:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4938:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4939:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4939:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4939:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4939:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==30) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4939:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleXFunctionTypeRef11537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4943:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==RULE_ID||LA93_0==30||LA93_0==79) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4943:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4943:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4944:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4944:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4945:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11559);
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

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4961:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( (LA92_0==27) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4961:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXFunctionTypeRef11572); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4965:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4966:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4966:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4967:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11593);
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
                            	    break loop92;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleXFunctionTypeRef11609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,79,FOLLOW_79_in_ruleXFunctionTypeRef11623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4991:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4992:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4992:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4993:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11644);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5017:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5018:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5019:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11680);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11690); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5026:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5029:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5030:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5030:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5030:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5030:2: ( ( ruleQualifiedName ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5031:1: ( ruleQualifiedName )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5031:1: ( ruleQualifiedName )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5032:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11738);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5045:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt96=2;
            alt96 = dfa96.predict(input);
            switch (alt96) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5045:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5045:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5045:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleJvmParameterizedTypeReference11759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5050:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5051:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5051:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5052:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11781);
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

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5068:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==27) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5068:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleJvmParameterizedTypeReference11794); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5072:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5073:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5073:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5074:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11815);
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
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference11829); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5102:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5103:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5104:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11867);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11877); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5111:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5114:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5115:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5115:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_ID||LA97_0==30||LA97_0==79) ) {
                alt97=1;
            }
            else if ( (LA97_0==23) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5116:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11924);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5126:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11951);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5142:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5143:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5144:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11986);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11996); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5151:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5154:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5155:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5155:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5155:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5155:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5156:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleJvmWildcardTypeReference12042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5165:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt98=3;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==80) ) {
                alt98=1;
            }
            else if ( (LA98_0==67) ) {
                alt98=2;
            }
            switch (alt98) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5165:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5165:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5166:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5166:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5167:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12064);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5184:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5184:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5185:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5185:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5186:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12091);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5210:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5211:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5212:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12129);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12139); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5219:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5222:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5223:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5223:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5223:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleJvmUpperBound12176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5227:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5228:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5228:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5229:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12197);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5253:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5254:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5255:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12233);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12243); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5262:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5265:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5266:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5266:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5266:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleJvmUpperBoundAnded12280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5270:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5271:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5271:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5272:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12301);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5296:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5297:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5298:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12337);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12347); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5305:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5308:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5309:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5309:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5309:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleJvmLowerBound12384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5313:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5314:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5314:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5315:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12405);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5341:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5342:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5343:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12444);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12455); if (state.failed) return current;

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5350:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5353:28: (this_ID_0= RULE_ID )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5354:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12494); if (state.failed) return current;
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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:86:4: ( ( RULE_ID ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:87:1: ( RULE_ID )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:87:1: ( RULE_ID )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:88:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalXTest135); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalXTest

    // $ANTLR start synpred3_InternalXTest
    public final void synpred3_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:592:4: ( 'throws' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:592:6: 'throws'
        {
        match(input,24,FOLLOW_24_in_synpred3_InternalXTest1229); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalXTest

    // $ANTLR start synpred4_InternalXTest
    public final void synpred4_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:922:4: ( ( '(' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:923:1: ( '(' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:923:1: ( '(' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:924:2: '('
        {
        match(input,30,FOLLOW_30_in_synpred4_InternalXTest2066); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalXTest

    // $ANTLR start synpred5_InternalXTest
    public final void synpred5_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:943:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:943:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:943:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:943:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:943:6: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:944:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:944:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt100=2;
        int LA100_0 = input.LA(1);

        if ( (LA100_0==RULE_ID||LA100_0==30||LA100_0==79) ) {
            alt100=1;
        }
        switch (alt100) {
            case 1 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:944:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:944:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:945:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:945:1: ( ruleJvmFormalParameter )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:946:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred5_InternalXTest2118);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:948:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop99:
                do {
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==27) ) {
                        alt99=1;
                    }


                    switch (alt99) {
                	case 1 :
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:948:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,27,FOLLOW_27_in_synpred5_InternalXTest2125); if (state.failed) return ;
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:949:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:950:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:950:1: ( ruleJvmFormalParameter )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:951:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred5_InternalXTest2132);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop99;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:953:6: ( ( '|' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:954:1: ( '|' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:954:1: ( '|' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:955:2: '|'
        {
        match(input,53,FOLLOW_53_in_synpred5_InternalXTest2146); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalXTest

    // $ANTLR start synpred6_InternalXTest
    public final void synpred6_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1022:4: ( ( ruleXClosure ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1023:1: ( ruleXClosure )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1023:1: ( ruleXClosure )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1024:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred6_InternalXTest2264);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalXTest

    // $ANTLR start synpred7_InternalXTest
    public final void synpred7_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1184:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1184:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1184:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1184:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1184:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1185:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1185:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1186:1: ( ruleOpMultiAssign )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1186:1: ( ruleOpMultiAssign )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1187:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred7_InternalXTest2611);
        ruleOpMultiAssign();

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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1312:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1312:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1312:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1312:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1312:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1313:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1313:2: ( ( ruleOpOr ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1314:1: ( ruleOpOr )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1314:1: ( ruleOpOr )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1315:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred8_InternalXTest2959);
        ruleOpOr();

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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1413:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1413:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1413:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1413:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1413:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1414:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1414:2: ( ( ruleOpAnd ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1415:1: ( ruleOpAnd )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1415:1: ( ruleOpAnd )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1416:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred9_InternalXTest3218);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalXTest

    // $ANTLR start synpred10_InternalXTest
    public final void synpred10_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1514:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1514:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1514:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1514:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1514:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1515:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1515:2: ( ( ruleOpEquality ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1516:1: ( ruleOpEquality )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1516:1: ( ruleOpEquality )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1517:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred10_InternalXTest3477);
        ruleOpEquality();

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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1622:4: ( ( () 'instanceof' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1622:5: ( () 'instanceof' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1622:5: ( () 'instanceof' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1622:6: () 'instanceof'
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1622:6: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1623:1: 
        {
        }

        match(input,38,FOLLOW_38_in_synpred11_InternalXTest3753); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalXTest

    // $ANTLR start synpred12_InternalXTest
    public final void synpred12_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1653:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1653:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1653:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1653:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1653:10: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1654:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1654:2: ( ( ruleOpCompare ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1655:1: ( ruleOpCompare )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1655:1: ( ruleOpCompare )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1656:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred12_InternalXTest3824);
        ruleOpCompare();

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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1775:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1775:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1775:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1775:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1775:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1776:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1776:2: ( ( ruleOpOther ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1777:1: ( ruleOpOther )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1777:1: ( ruleOpOther )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1778:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred13_InternalXTest4143);
        ruleOpOther();

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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1883:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1883:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1883:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1883:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1883:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1884:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1884:2: ( ( ruleOpAdd ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1885:1: ( ruleOpAdd )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1885:1: ( ruleOpAdd )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1886:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred14_InternalXTest4423);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalXTest

    // $ANTLR start synpred15_InternalXTest
    public final void synpred15_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1991:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1991:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1991:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1991:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1991:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1992:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1992:2: ( ( ruleOpMulti ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1993:1: ( ruleOpMulti )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1993:1: ( ruleOpMulti )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1994:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred15_InternalXTest4703);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred15_InternalXTest

    // $ANTLR start synpred16_InternalXTest
    public final void synpred16_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2224:3: ( ( () 'as' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2224:4: ( () 'as' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2224:4: ( () 'as' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2224:5: () 'as'
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2224:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2225:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred16_InternalXTest5297); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalXTest

    // $ANTLR start synpred17_InternalXTest
    public final void synpred17_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2284:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2284:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2284:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2284:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2284:6: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2285:1: 
        {
        }

        match(input,17,FOLLOW_17_in_synpred17_InternalXTest5451); if (state.failed) return ;
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2286:1: ( ( ruleValidID ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2287:1: ( ruleValidID )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2287:1: ( ruleValidID )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2288:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred17_InternalXTest5460);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred17_InternalXTest5466);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalXTest

    // $ANTLR start synpred18_InternalXTest
    public final void synpred18_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2342:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2342:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2342:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2342:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2342:10: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2343:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2343:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt101=3;
        switch ( input.LA(1) ) {
        case 17:
            {
            alt101=1;
            }
            break;
        case 50:
            {
            alt101=2;
            }
            break;
        case 51:
            {
            alt101=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 101, 0, input);

            throw nvae;
        }

        switch (alt101) {
            case 1 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2343:4: '.'
                {
                match(input,17,FOLLOW_17_in_synpred18_InternalXTest5569); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2345:6: ( ( '?.' ) )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2345:6: ( ( '?.' ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2346:1: ( '?.' )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2346:1: ( '?.' )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2347:2: '?.'
                {
                match(input,50,FOLLOW_50_in_synpred18_InternalXTest5583); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2352:6: ( ( '*.' ) )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2352:6: ( ( '*.' ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2353:1: ( '*.' )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2353:1: ( '*.' )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2354:2: '*.'
                {
                match(input,51,FOLLOW_51_in_synpred18_InternalXTest5603); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalXTest

    // $ANTLR start synpred19_InternalXTest
    public final void synpred19_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2463:4: ( ( '(' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2464:1: ( '(' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2464:1: ( '(' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2465:2: '('
        {
        match(input,30,FOLLOW_30_in_synpred19_InternalXTest5830); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalXTest

    // $ANTLR start synpred20_InternalXTest
    public final void synpred20_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2484:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2484:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2484:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2484:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2484:6: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2485:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2485:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt103=2;
        int LA103_0 = input.LA(1);

        if ( (LA103_0==RULE_ID||LA103_0==30||LA103_0==79) ) {
            alt103=1;
        }
        switch (alt103) {
            case 1 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2485:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2485:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2486:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2486:1: ( ruleJvmFormalParameter )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2487:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXTest5882);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2489:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop102:
                do {
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==27) ) {
                        alt102=1;
                    }


                    switch (alt102) {
                	case 1 :
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2489:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,27,FOLLOW_27_in_synpred20_InternalXTest5889); if (state.failed) return ;
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2490:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2491:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2491:1: ( ruleJvmFormalParameter )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2492:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXTest5896);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop102;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2494:6: ( ( '|' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2495:1: ( '|' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2495:1: ( '|' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2496:2: '|'
        {
        match(input,53,FOLLOW_53_in_synpred20_InternalXTest5910); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalXTest

    // $ANTLR start synpred21_InternalXTest
    public final void synpred21_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2563:4: ( ( ruleXClosure ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2564:1: ( ruleXClosure )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2564:1: ( ruleXClosure )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2565:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred21_InternalXTest6028);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalXTest

    // $ANTLR start synpred22_InternalXTest
    public final void synpred22_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2696:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2696:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2696:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2696:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2696:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt105=2;
        int LA105_0 = input.LA(1);

        if ( (LA105_0==RULE_ID||LA105_0==30||LA105_0==79) ) {
            alt105=1;
        }
        switch (alt105) {
            case 1 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2696:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2696:5: ( ( ruleJvmFormalParameter ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2697:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2697:1: ( ruleJvmFormalParameter )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2698:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalXTest6385);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2700:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop104:
                do {
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==27) ) {
                        alt104=1;
                    }


                    switch (alt104) {
                	case 1 :
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2700:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,27,FOLLOW_27_in_synpred22_InternalXTest6392); if (state.failed) return ;
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2701:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2702:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2702:1: ( ruleJvmFormalParameter )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2703:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalXTest6399);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop104;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2705:6: ( ( '|' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2706:1: ( '|' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2706:1: ( '|' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2707:2: '|'
        {
        match(input,53,FOLLOW_53_in_synpred22_InternalXTest6413); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalXTest

    // $ANTLR start synpred24_InternalXTest
    public final void synpred24_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3066:4: ( 'else' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3066:6: 'else'
        {
        match(input,56,FOLLOW_56_in_synpred24_InternalXTest7196); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalXTest

    // $ANTLR start synpred25_InternalXTest
    public final void synpred25_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3120:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3120:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3120:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3120:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3120:6: ( ( ruleValidID ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3121:1: ( ruleValidID )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3121:1: ( ruleValidID )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3122:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalXTest7338);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,19,FOLLOW_19_in_synpred25_InternalXTest7344); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalXTest

    // $ANTLR start synpred26_InternalXTest
    public final void synpred26_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3166:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3166:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3166:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3166:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,30,FOLLOW_30_in_synpred26_InternalXTest7420); if (state.failed) return ;
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3167:1: ( ( ruleValidID ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3168:1: ( ruleValidID )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3168:1: ( ruleValidID )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3169:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred26_InternalXTest7427);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,19,FOLLOW_19_in_synpred26_InternalXTest7433); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalXTest

    // $ANTLR start synpred27_InternalXTest
    public final void synpred27_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3750:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3750:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3750:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3750:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3750:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3751:1: ( ruleJvmTypeReference )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3751:1: ( ruleJvmTypeReference )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3752:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred27_InternalXTest8698);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3754:2: ( ( ruleValidID ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3755:1: ( ruleValidID )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3755:1: ( ruleValidID )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3756:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred27_InternalXTest8707);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalXTest

    // $ANTLR start synpred28_InternalXTest
    public final void synpred28_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4072:4: ( '<' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4072:6: '<'
        {
        match(input,26,FOLLOW_26_in_synpred28_InternalXTest9411); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalXTest

    // $ANTLR start synpred29_InternalXTest
    public final void synpred29_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4121:5: ( '(' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4121:7: '('
        {
        match(input,30,FOLLOW_30_in_synpred29_InternalXTest9504); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalXTest

    // $ANTLR start synpred30_InternalXTest
    public final void synpred30_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4126:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4126:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4126:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4126:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4126:6: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4127:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4127:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt109=2;
        int LA109_0 = input.LA(1);

        if ( (LA109_0==RULE_ID||LA109_0==30||LA109_0==79) ) {
            alt109=1;
        }
        switch (alt109) {
            case 1 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4127:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4127:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4128:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4128:1: ( ruleJvmFormalParameter )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4129:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred30_InternalXTest9534);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4131:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop108:
                do {
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==27) ) {
                        alt108=1;
                    }


                    switch (alt108) {
                	case 1 :
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4131:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,27,FOLLOW_27_in_synpred30_InternalXTest9541); if (state.failed) return ;
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4132:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4133:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4133:1: ( ruleJvmFormalParameter )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4134:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred30_InternalXTest9548);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop108;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4136:6: ( ( '|' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4137:1: ( '|' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4137:1: ( '|' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4138:2: '|'
        {
        match(input,53,FOLLOW_53_in_synpred30_InternalXTest9562); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred30_InternalXTest

    // $ANTLR start synpred31_InternalXTest
    public final void synpred31_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4205:4: ( ( ruleXClosure ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4206:1: ( ruleXClosure )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4206:1: ( ruleXClosure )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4207:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred31_InternalXTest9680);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalXTest

    // $ANTLR start synpred32_InternalXTest
    public final void synpred32_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4529:2: ( ( ruleXExpression ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4530:1: ( ruleXExpression )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4530:1: ( ruleXExpression )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4531:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred32_InternalXTest10482);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalXTest

    // $ANTLR start synpred33_InternalXTest
    public final void synpred33_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4600:5: ( 'catch' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4600:7: 'catch'
        {
        match(input,78,FOLLOW_78_in_synpred33_InternalXTest10627); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalXTest

    // $ANTLR start synpred34_InternalXTest
    public final void synpred34_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4619:5: ( 'finally' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4619:7: 'finally'
        {
        match(input,77,FOLLOW_77_in_synpred34_InternalXTest10657); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalXTest

    // $ANTLR start synpred36_InternalXTest
    public final void synpred36_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4767:3: ( '.' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4768:2: '.'
        {
        match(input,17,FOLLOW_17_in_synpred36_InternalXTest11004); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalXTest

    // $ANTLR start synpred37_InternalXTest
    public final void synpred37_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4891:2: ( ( () '[' ']' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4891:3: ( () '[' ']' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4891:3: ( () '[' ']' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4891:4: () '[' ']'
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4891:4: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4892:1: 
        {
        }

        match(input,52,FOLLOW_52_in_synpred37_InternalXTest11387); if (state.failed) return ;
        match(input,54,FOLLOW_54_in_synpred37_InternalXTest11391); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred37_InternalXTest

    // $ANTLR start synpred38_InternalXTest
    public final void synpred38_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5045:4: ( '<' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5045:6: '<'
        {
        match(input,26,FOLLOW_26_in_synpred38_InternalXTest11751); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalXTest

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
    public final boolean synpred33_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalXTest_fragment(); // can never throw exception
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
    public final boolean synpred21_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalXTest_fragment(); // can never throw exception
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
    public final boolean synpred37_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalXTest_fragment(); // can never throw exception
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
    public final boolean synpred38_InternalXTest() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalXTest_fragment(); // can never throw exception
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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA96 dfa96 = new DFA96(this);
    static final String DFA8_eotS =
        "\7\uffff";
    static final String DFA8_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA8_minS =
        "\1\4\1\uffff\2\4\2\uffff\1\4";
    static final String DFA8_maxS =
        "\1\17\1\uffff\1\114\1\22\2\uffff\1\114";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String DFA8_specialS =
        "\7\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\12\uffff\1\1",
            "",
            "\5\4\4\uffff\2\4\2\uffff\1\3\2\uffff\3\4\3\uffff\1\4\2\uffff"+
            "\2\4\14\uffff\2\4\3\uffff\1\4\3\uffff\1\4\2\uffff\1\4\1\uffff"+
            "\2\4\3\uffff\6\4\1\uffff\10\4",
            "\1\6\15\uffff\1\5",
            "",
            "",
            "\5\4\4\uffff\2\4\2\uffff\1\3\2\uffff\3\4\3\uffff\1\4\2\uffff"+
            "\2\4\14\uffff\2\4\3\uffff\1\4\3\uffff\1\4\2\uffff\1\4\1\uffff"+
            "\2\4\3\uffff\6\4\1\uffff\10\4"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "182:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNamespaceWithWildcard ) ) )";
        }
    }
    static final String DFA22_eotS =
        "\104\uffff";
    static final String DFA22_eofS =
        "\1\2\103\uffff";
    static final String DFA22_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA22_maxS =
        "\1\117\1\0\102\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA22_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA22_transitionS = {
            "\5\2\4\uffff\1\2\3\uffff\6\2\1\uffff\6\2\1\1\1\2\1\uffff\24"+
            "\2\1\uffff\16\2\1\uffff\13\2",
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "922:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )? otherlv_14= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalXTest()) ) {s = 67;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\42\uffff";
    static final String DFA21_eofS =
        "\42\uffff";
    static final String DFA21_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA21_maxS =
        "\1\117\2\0\37\uffff";
    static final String DFA21_acceptS =
        "\3\uffff\2\1\1\2\33\uffff\1\3";
    static final String DFA21_specialS =
        "\1\0\1\1\1\2\37\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\4\5\13\uffff\3\5\3\uffff\1\5\2\uffff\1\5\1\2\1\41\13\uffff"+
            "\2\5\3\uffff\1\5\3\uffff\1\5\1\4\1\uffff\1\5\1\uffff\2\5\3\uffff"+
            "\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "943:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_10_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_11_0= ruleXExpression ) ) (otherlv_12= ',' ( (lv_featureCallArguments_13_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                         
                        int index21_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_0==RULE_ID) ) {s = 1;}

                        else if ( (LA21_0==30) ) {s = 2;}

                        else if ( (LA21_0==79) && (synpred5_InternalXTest())) {s = 3;}

                        else if ( (LA21_0==53) && (synpred5_InternalXTest())) {s = 4;}

                        else if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_DECIMAL)||(LA21_0>=20 && LA21_0<=22)||LA21_0==26||LA21_0==29||(LA21_0>=43 && LA21_0<=44)||LA21_0==48||LA21_0==52||LA21_0==55||(LA21_0>=57 && LA21_0<=58)||(LA21_0>=62 && LA21_0<=64)||LA21_0==67||(LA21_0>=69 && LA21_0<=76)) ) {s = 5;}

                        else if ( (LA21_0==31) ) {s = 33;}

                         
                        input.seek(index21_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_1 = input.LA(1);

                         
                        int index21_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_2 = input.LA(1);

                         
                        int index21_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index21_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\104\uffff";
    static final String DFA23_eofS =
        "\1\2\103\uffff";
    static final String DFA23_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA23_maxS =
        "\1\117\1\0\102\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA23_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA23_transitionS = {
            "\5\2\4\uffff\1\2\3\uffff\6\2\1\uffff\10\2\1\uffff\23\2\1\1"+
            "\1\uffff\16\2\1\uffff\13\2",
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1022:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_15_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalXTest()) ) {s = 67;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\103\uffff";
    static final String DFA47_eofS =
        "\1\2\102\uffff";
    static final String DFA47_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA47_maxS =
        "\1\117\1\0\101\uffff";
    static final String DFA47_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA47_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA47_transitionS = {
            "\5\2\4\uffff\1\2\3\uffff\6\2\1\uffff\1\2\1\uffff\4\2\1\1\1"+
            "\2\1\uffff\24\2\1\uffff\16\2\1\uffff\13\2",
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

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "2463:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_1 = input.LA(1);

                         
                        int index47_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index47_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\42\uffff";
    static final String DFA46_eofS =
        "\42\uffff";
    static final String DFA46_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA46_maxS =
        "\1\117\2\0\37\uffff";
    static final String DFA46_acceptS =
        "\3\uffff\2\1\1\2\33\uffff\1\3";
    static final String DFA46_specialS =
        "\1\0\1\1\1\2\37\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\1\4\5\13\uffff\3\5\3\uffff\1\5\2\uffff\1\5\1\2\1\41\13\uffff"+
            "\2\5\3\uffff\1\5\3\uffff\1\5\1\4\1\uffff\1\5\1\uffff\2\5\3\uffff"+
            "\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "2484:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA46_0==30) ) {s = 2;}

                        else if ( (LA46_0==79) && (synpred20_InternalXTest())) {s = 3;}

                        else if ( (LA46_0==53) && (synpred20_InternalXTest())) {s = 4;}

                        else if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_DECIMAL)||(LA46_0>=20 && LA46_0<=22)||LA46_0==26||LA46_0==29||(LA46_0>=43 && LA46_0<=44)||LA46_0==48||LA46_0==52||LA46_0==55||(LA46_0>=57 && LA46_0<=58)||(LA46_0>=62 && LA46_0<=64)||LA46_0==67||(LA46_0>=69 && LA46_0<=76)) ) {s = 5;}

                        else if ( (LA46_0==31) ) {s = 33;}

                         
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
    static final String DFA48_eotS =
        "\103\uffff";
    static final String DFA48_eofS =
        "\1\2\102\uffff";
    static final String DFA48_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA48_maxS =
        "\1\117\1\0\101\uffff";
    static final String DFA48_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA48_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA48_transitionS = {
            "\5\2\4\uffff\1\2\3\uffff\6\2\1\uffff\1\2\1\uffff\6\2\1\uffff"+
            "\23\2\1\1\1\uffff\16\2\1\uffff\13\2",
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

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "2563:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_1 = input.LA(1);

                         
                        int index48_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index48_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\44\uffff";
    static final String DFA53_eofS =
        "\44\uffff";
    static final String DFA53_minS =
        "\1\4\2\0\41\uffff";
    static final String DFA53_maxS =
        "\1\117\2\0\41\uffff";
    static final String DFA53_acceptS =
        "\3\uffff\2\1\1\2\36\uffff";
    static final String DFA53_specialS =
        "\1\0\1\1\1\2\41\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1\4\5\13\uffff\3\5\3\uffff\1\5\2\uffff\1\5\1\2\14\uffff"+
            "\2\5\3\uffff\1\5\3\uffff\1\5\1\4\2\5\1\uffff\2\5\3\uffff\6\5"+
            "\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "2696:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==RULE_ID) ) {s = 1;}

                        else if ( (LA53_0==30) ) {s = 2;}

                        else if ( (LA53_0==79) && (synpred22_InternalXTest())) {s = 3;}

                        else if ( (LA53_0==53) && (synpred22_InternalXTest())) {s = 4;}

                        else if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_DECIMAL)||(LA53_0>=20 && LA53_0<=22)||LA53_0==26||LA53_0==29||(LA53_0>=43 && LA53_0<=44)||LA53_0==48||LA53_0==52||(LA53_0>=54 && LA53_0<=55)||(LA53_0>=57 && LA53_0<=58)||(LA53_0>=62 && LA53_0<=67)||(LA53_0>=69 && LA53_0<=76)) ) {s = 5;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_1 = input.LA(1);

                         
                        int index53_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index53_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_2 = input.LA(1);

                         
                        int index53_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index53_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA75_eotS =
        "\103\uffff";
    static final String DFA75_eofS =
        "\1\2\102\uffff";
    static final String DFA75_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA75_maxS =
        "\1\117\1\0\101\uffff";
    static final String DFA75_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA75_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA75_transitionS = {
            "\5\2\4\uffff\1\2\3\uffff\6\2\1\uffff\1\2\1\uffff\1\1\5\2\1"+
            "\uffff\24\2\1\uffff\16\2\1\uffff\13\2",
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

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "4072:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_1 = input.LA(1);

                         
                        int index75_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index75_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\103\uffff";
    static final String DFA78_eofS =
        "\1\2\102\uffff";
    static final String DFA78_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA78_maxS =
        "\1\117\1\0\101\uffff";
    static final String DFA78_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA78_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA78_transitionS = {
            "\5\2\4\uffff\1\2\3\uffff\6\2\1\uffff\1\2\1\uffff\4\2\1\1\1"+
            "\2\1\uffff\24\2\1\uffff\16\2\1\uffff\13\2",
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

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "4121:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_1 = input.LA(1);

                         
                        int index78_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index78_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA77_eotS =
        "\42\uffff";
    static final String DFA77_eofS =
        "\42\uffff";
    static final String DFA77_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA77_maxS =
        "\1\117\2\0\37\uffff";
    static final String DFA77_acceptS =
        "\3\uffff\2\1\1\2\33\uffff\1\3";
    static final String DFA77_specialS =
        "\1\0\1\1\1\2\37\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\1\4\5\13\uffff\3\5\3\uffff\1\5\2\uffff\1\5\1\2\1\41\13\uffff"+
            "\2\5\3\uffff\1\5\3\uffff\1\5\1\4\1\uffff\1\5\1\uffff\2\5\3\uffff"+
            "\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "4126:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_0 = input.LA(1);

                         
                        int index77_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA77_0==RULE_ID) ) {s = 1;}

                        else if ( (LA77_0==30) ) {s = 2;}

                        else if ( (LA77_0==79) && (synpred30_InternalXTest())) {s = 3;}

                        else if ( (LA77_0==53) && (synpred30_InternalXTest())) {s = 4;}

                        else if ( ((LA77_0>=RULE_STRING && LA77_0<=RULE_DECIMAL)||(LA77_0>=20 && LA77_0<=22)||LA77_0==26||LA77_0==29||(LA77_0>=43 && LA77_0<=44)||LA77_0==48||LA77_0==52||LA77_0==55||(LA77_0>=57 && LA77_0<=58)||(LA77_0>=62 && LA77_0<=64)||LA77_0==67||(LA77_0>=69 && LA77_0<=76)) ) {s = 5;}

                        else if ( (LA77_0==31) ) {s = 33;}

                         
                        input.seek(index77_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA77_2 = input.LA(1);

                         
                        int index77_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index77_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA79_eotS =
        "\103\uffff";
    static final String DFA79_eofS =
        "\1\2\102\uffff";
    static final String DFA79_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA79_maxS =
        "\1\117\1\0\101\uffff";
    static final String DFA79_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA79_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA79_transitionS = {
            "\5\2\4\uffff\1\2\3\uffff\6\2\1\uffff\1\2\1\uffff\6\2\1\uffff"+
            "\23\2\1\1\1\uffff\16\2\1\uffff\13\2",
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

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "4205:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\103\uffff";
    static final String DFA81_eofS =
        "\1\37\102\uffff";
    static final String DFA81_minS =
        "\1\4\36\0\44\uffff";
    static final String DFA81_maxS =
        "\1\117\36\0\44\uffff";
    static final String DFA81_acceptS =
        "\37\uffff\1\2\42\uffff\1\1";
    static final String DFA81_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\44\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\1\1\22\1\16\1\17\1\20\4\uffff\1\37\3\uffff\3\37\1\34\1\35"+
            "\1\36\1\uffff\1\37\1\uffff\1\10\2\37\1\12\1\33\1\37\1\uffff"+
            "\12\37\1\4\1\3\3\37\1\2\3\37\1\13\1\uffff\1\37\1\24\1\37\1\7"+
            "\1\6\3\37\1\25\1\26\1\27\2\37\1\11\1\uffff\1\5\1\14\1\15\1\21"+
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

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "4529:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_1 = input.LA(1);

                         
                        int index81_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_2 = input.LA(1);

                         
                        int index81_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_3 = input.LA(1);

                         
                        int index81_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA81_4 = input.LA(1);

                         
                        int index81_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA81_5 = input.LA(1);

                         
                        int index81_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA81_6 = input.LA(1);

                         
                        int index81_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA81_7 = input.LA(1);

                         
                        int index81_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA81_8 = input.LA(1);

                         
                        int index81_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA81_9 = input.LA(1);

                         
                        int index81_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA81_10 = input.LA(1);

                         
                        int index81_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA81_11 = input.LA(1);

                         
                        int index81_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA81_12 = input.LA(1);

                         
                        int index81_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA81_13 = input.LA(1);

                         
                        int index81_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA81_14 = input.LA(1);

                         
                        int index81_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA81_15 = input.LA(1);

                         
                        int index81_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA81_16 = input.LA(1);

                         
                        int index81_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA81_17 = input.LA(1);

                         
                        int index81_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA81_18 = input.LA(1);

                         
                        int index81_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA81_19 = input.LA(1);

                         
                        int index81_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA81_20 = input.LA(1);

                         
                        int index81_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA81_21 = input.LA(1);

                         
                        int index81_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA81_22 = input.LA(1);

                         
                        int index81_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA81_23 = input.LA(1);

                         
                        int index81_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA81_24 = input.LA(1);

                         
                        int index81_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA81_25 = input.LA(1);

                         
                        int index81_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA81_26 = input.LA(1);

                         
                        int index81_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA81_27 = input.LA(1);

                         
                        int index81_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA81_28 = input.LA(1);

                         
                        int index81_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA81_29 = input.LA(1);

                         
                        int index81_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA81_30 = input.LA(1);

                         
                        int index81_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index81_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA96_eotS =
        "\103\uffff";
    static final String DFA96_eofS =
        "\1\2\102\uffff";
    static final String DFA96_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA96_maxS =
        "\1\117\1\0\101\uffff";
    static final String DFA96_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA96_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA96_transitionS = {
            "\5\2\4\uffff\1\2\3\uffff\6\2\1\uffff\1\2\1\uffff\1\1\5\2\1"+
            "\uffff\24\2\1\uffff\16\2\1\uffff\13\2",
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

    static final short[] DFA96_eot = DFA.unpackEncodedString(DFA96_eotS);
    static final short[] DFA96_eof = DFA.unpackEncodedString(DFA96_eofS);
    static final char[] DFA96_min = DFA.unpackEncodedStringToUnsignedChars(DFA96_minS);
    static final char[] DFA96_max = DFA.unpackEncodedStringToUnsignedChars(DFA96_maxS);
    static final short[] DFA96_accept = DFA.unpackEncodedString(DFA96_acceptS);
    static final short[] DFA96_special = DFA.unpackEncodedString(DFA96_specialS);
    static final short[][] DFA96_transition;

    static {
        int numStates = DFA96_transitionS.length;
        DFA96_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA96_transition[i] = DFA.unpackEncodedString(DFA96_transitionS[i]);
        }
    }

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = DFA96_eot;
            this.eof = DFA96_eof;
            this.min = DFA96_min;
            this.max = DFA96_max;
            this.accept = DFA96_accept;
            this.special = DFA96_special;
            this.transition = DFA96_transition;
        }
        public String getDescription() {
            return "5045:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA96_1 = input.LA(1);

                         
                        int index96_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalXTest()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index96_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 96, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileParam_in_ruleBody153 = new BitSet(new long[]{0xC6911800647061F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_13_in_ruleBody166 = new BitSet(new long[]{0xC6911800647061F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleImport_in_ruleBody192 = new BitSet(new long[]{0xC6911800647061F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_13_in_ruleBody205 = new BitSet(new long[]{0xC6911800647041F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleBody231 = new BitSet(new long[]{0xC6911800647021F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_13_in_ruleBody244 = new BitSet(new long[]{0xC6911800647001F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport331 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleImport351 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleImport382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport419 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleImport431 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleImport443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceWithWildcard_in_ruleImport500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceWithWildcard_in_entryRuleQualifiedNamespaceWithWildcard538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNamespaceWithWildcard549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNamespaceWithWildcard596 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedNamespaceWithWildcard614 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedNamespaceWithWildcard627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileParam_in_entryRuleFileParam667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileParam677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileParam734 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFileParam746 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleFileParam767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueName_in_entryRuleUniqueName803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueName813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUniqueName866 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueName886 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleUniqueName916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTestExpression_in_entryRuleXTestExpression953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTestExpression963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleXTestExpression1010 = new BitSet(new long[]{0x0400000040000030L});
    public static final BitSet FOLLOW_21_in_ruleXTestExpression1028 = new BitSet(new long[]{0x0400000040000030L});
    public static final BitSet FOLLOW_ruleUniqueName_in_ruleXTestExpression1050 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXTestExpression1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssertExpression_in_entryRuleXAssertExpression1107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssertExpression1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleXAssertExpression1163 = new BitSet(new long[]{0xC691180064F001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_23_in_ruleXAssertExpression1181 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXAssertExpression1216 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleXAssertExpression1237 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXAssertExpression1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression1297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTestExpression_in_ruleXPrimaryExpression1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssertExpression_in_ruleXPrimaryExpression1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticEquals_in_entryRuleStaticEquals1768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticEquals1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStaticEquals1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall1855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall1922 = new BitSet(new long[]{0x0000000024000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall1936 = new BitSet(new long[]{0x0000000040800010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall1957 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall1970 = new BitSet(new long[]{0x0000000040800010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall1991 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall2005 = new BitSet(new long[]{0x0000000020000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall2031 = new BitSet(new long[]{0x0010000042000002L});
    public static final BitSet FOLLOW_29_in_ruleXFeatureCall2049 = new BitSet(new long[]{0x0010000042000002L});
    public static final BitSet FOLLOW_30_in_ruleXFeatureCall2084 = new BitSet(new long[]{0xC6B11800E47001F0L,0x0000000000009FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall2169 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall2197 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall2210 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall2231 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_31_in_ruleXFeatureCall2248 = new BitSet(new long[]{0x0010000002000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall2281 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleStaticEquals_in_ruleXFeatureCall2308 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXFeatureCall2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression2366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment2456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment2524 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2540 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2590 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2643 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpSingleAssign2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMultiAssign2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2938 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2991 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3014 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr3053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOr3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression3140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3197 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression3250 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3273 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd3312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAnd3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3456 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3509 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3532 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality3571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpEquality3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpEquality3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3736 = new BitSet(new long[]{0x000001C014000002L});
    public static final BitSet FOLLOW_38_in_ruleXRelationalExpression3772 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3795 = new BitSet(new long[]{0x000001C014000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3856 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3879 = new BitSet(new long[]{0x000001C014000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpCompare3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpCompare3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4122 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression4175 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4198 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther4237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpOther4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpOther4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4402 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4455 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4478 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd4517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpAdd4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpAdd4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4682 = new BitSet(new long[]{0x0000E00000040002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4735 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4758 = new BitSet(new long[]{0x0000E00000040002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpMulti4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpMulti4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpMulti4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpMulti4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5011 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary5097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpUnary5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpUnary5165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5281 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXCastedExpression5316 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5339 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5434 = new BitSet(new long[]{0x000C000000020002L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall5483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5506 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5522 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5544 = new BitSet(new long[]{0x000C000000020002L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall5630 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_50_in_ruleXMemberFeatureCall5654 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_51_in_ruleXMemberFeatureCall5691 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall5720 = new BitSet(new long[]{0x0000000040800010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5741 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall5754 = new BitSet(new long[]{0x0000000040800010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5775 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall5789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5814 = new BitSet(new long[]{0x001C000040020002L});
    public static final BitSet FOLLOW_30_in_ruleXMemberFeatureCall5848 = new BitSet(new long[]{0xC6B11800E47001F0L,0x0000000000009FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5933 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5961 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall5974 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5995 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_31_in_ruleXMemberFeatureCall6012 = new BitSet(new long[]{0x001C000000020002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall6045 = new BitSet(new long[]{0x000C000000020002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral6085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral6095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXClosure6368 = new BitSet(new long[]{0xC6F11800647001F0L,0x0000000000009FEFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6439 = new BitSet(new long[]{0x0020000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXClosure6452 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6473 = new BitSet(new long[]{0x0020000008000000L});
    public static final BitSet FOLLOW_53_in_ruleXClosure6495 = new BitSet(new long[]{0xC6D11800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6532 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXClosure6544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6646 = new BitSet(new long[]{0xC6911800647021F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_13_in_ruleXExpressionInClosure6659 = new BitSet(new long[]{0xC6911800647001F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6817 = new BitSet(new long[]{0x0020000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXShortClosure6830 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6851 = new BitSet(new long[]{0x0020000008000000L});
    public static final BitSet FOLLOW_53_in_ruleXShortClosure6873 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleXParenthesizedExpression6992 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7014 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXParenthesizedExpression7025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXIfExpression7117 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXIfExpression7129 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7150 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXIfExpression7162 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7183 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXIfExpression7204 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression7320 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7363 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXSwitchExpression7375 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7399 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_30_in_ruleXSwitchExpression7443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7464 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXSwitchExpression7476 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7499 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXSwitchExpression7511 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression7525 = new BitSet(new long[]{0x2000000040080010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7546 = new BitSet(new long[]{0x3800000040080010L,0x0000000000008000L});
    public static final BitSet FOLLOW_59_in_ruleXSwitchExpression7560 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXSwitchExpression7572 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7593 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXSwitchExpression7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7699 = new BitSet(new long[]{0x2000000000080000L});
    public static final BitSet FOLLOW_61_in_ruleXCasePart7713 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7734 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXCasePart7748 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXForLoopExpression7861 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXForLoopExpression7873 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7894 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXForLoopExpression7906 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7927 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXForLoopExpression7939 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXWhileExpression8052 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXWhileExpression8064 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8085 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXWhileExpression8097 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression8164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXDoWhileExpression8210 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8231 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleXDoWhileExpression8243 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXDoWhileExpression8255 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8276 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXDoWhileExpression8288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXBlockExpression8380 = new BitSet(new long[]{0xD6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8402 = new BitSet(new long[]{0xD6911800647021F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression8415 = new BitSet(new long[]{0xD6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_60_in_ruleXBlockExpression8431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXVariableDeclaration8649 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_66_in_ruleXVariableDeclaration8680 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8749 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8778 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleXVariableDeclaration8792 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter9021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter9042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper9137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleIdOrSuper9161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStaticQualifier9278 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXConstructorCall9375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9398 = new BitSet(new long[]{0x0010000044000002L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall9419 = new BitSet(new long[]{0x0000000040800010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9441 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall9454 = new BitSet(new long[]{0x0000000040800010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9475 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall9489 = new BitSet(new long[]{0x0010000040000002L});
    public static final BitSet FOLLOW_30_in_ruleXConstructorCall9512 = new BitSet(new long[]{0xC6B11800E47001F0L,0x0000000000009FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9585 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9613 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall9626 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9647 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_31_in_ruleXConstructorCall9664 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXBooleanLiteral9791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXBooleanLiteral9815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXNullLiteral9921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral10022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral10068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTypeLiteral10216 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXTypeLiteral10228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10251 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXTypeLiteral10263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXThrowExpression10355 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXReturnExpression10468 = new BitSet(new long[]{0xC6911800647001F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10592 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10643 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10665 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10709 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXCatchClause10823 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXCatchClause10836 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10857 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXCatchClause10869 = new BitSet(new long[]{0xC6911800647001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10985 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedName11013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11036 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber11090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber11101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber11145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11173 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11199 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleNumber11219 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11372 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleJvmTypeReference11410 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleJvmTypeReference11422 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleXFunctionTypeRef11537 = new BitSet(new long[]{0x00000000C0000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11559 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_27_in_ruleXFunctionTypeRef11572 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11593 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_31_in_ruleXFunctionTypeRef11609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleXFunctionTypeRef11623 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11738 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleJvmParameterizedTypeReference11759 = new BitSet(new long[]{0x0000000040800010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11781 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleJvmParameterizedTypeReference11794 = new BitSet(new long[]{0x0000000040800010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11815 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference11829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleJvmWildcardTypeReference12042 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010008L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmUpperBound12176 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleJvmUpperBoundAnded12280 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleJvmLowerBound12384 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalXTest135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred3_InternalXTest1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred4_InternalXTest2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred5_InternalXTest2118 = new BitSet(new long[]{0x0020000008000000L});
    public static final BitSet FOLLOW_27_in_synpred5_InternalXTest2125 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred5_InternalXTest2132 = new BitSet(new long[]{0x0020000008000000L});
    public static final BitSet FOLLOW_53_in_synpred5_InternalXTest2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred6_InternalXTest2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred7_InternalXTest2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred8_InternalXTest2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred9_InternalXTest3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred10_InternalXTest3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred11_InternalXTest3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred12_InternalXTest3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred13_InternalXTest4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred14_InternalXTest4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred15_InternalXTest4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred16_InternalXTest5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred17_InternalXTest5451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred17_InternalXTest5460 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred17_InternalXTest5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred18_InternalXTest5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred18_InternalXTest5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred18_InternalXTest5603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred19_InternalXTest5830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXTest5882 = new BitSet(new long[]{0x0020000008000000L});
    public static final BitSet FOLLOW_27_in_synpred20_InternalXTest5889 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXTest5896 = new BitSet(new long[]{0x0020000008000000L});
    public static final BitSet FOLLOW_53_in_synpred20_InternalXTest5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred21_InternalXTest6028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalXTest6385 = new BitSet(new long[]{0x0020000008000000L});
    public static final BitSet FOLLOW_27_in_synpred22_InternalXTest6392 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalXTest6399 = new BitSet(new long[]{0x0020000008000000L});
    public static final BitSet FOLLOW_53_in_synpred22_InternalXTest6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred24_InternalXTest7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalXTest7338 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_synpred25_InternalXTest7344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred26_InternalXTest7420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred26_InternalXTest7427 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_synpred26_InternalXTest7433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred27_InternalXTest8698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred27_InternalXTest8707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred28_InternalXTest9411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred29_InternalXTest9504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred30_InternalXTest9534 = new BitSet(new long[]{0x0020000008000000L});
    public static final BitSet FOLLOW_27_in_synpred30_InternalXTest9541 = new BitSet(new long[]{0x0000000040000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred30_InternalXTest9548 = new BitSet(new long[]{0x0020000008000000L});
    public static final BitSet FOLLOW_53_in_synpred30_InternalXTest9562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred31_InternalXTest9680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred32_InternalXTest10482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred33_InternalXTest10627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred34_InternalXTest10657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred36_InternalXTest11004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred37_InternalXTest11387 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_synpred37_InternalXTest11391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred38_InternalXTest11751 = new BitSet(new long[]{0x0000000000000002L});

}