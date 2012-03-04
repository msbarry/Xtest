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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'import'", "'static'", "'.'", "'*'", "'xsuite'", "'xtest'", "'assert'", "'throws'", "':='", "'<'", "','", "'>'", "'('", "')'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
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
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
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
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
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

                if ( (LA1_0==12) ) {
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

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)||(LA3_0>=16 && LA3_0<=18)||LA3_0==21||LA3_0==24||(LA3_0>=37 && LA3_0<=38)||LA3_0==42||LA3_0==46||LA3_0==49||LA3_0==51||LA3_0==53||(LA3_0>=57 && LA3_0<=62)||(LA3_0>=64 && LA3_0<=71)) ) {
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

            	    if ( (LA2_0==11) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:122:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleBody176); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport263); if (state.failed) return current;
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
                    lv_static_1_0=(Token)match(input,13,FOLLOW_13_in_ruleImport283); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleImport331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getImportAccess().getFullStopKeyword_1_0_2());
                          
                    }
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleImport343); if (state.failed) return current;
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
            kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNamespaceWithWildcard514); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNamespaceWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNamespaceWithWildcard527); if (state.failed) return current;
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

            if ( (LA5_0==24) ) {
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


    // $ANTLR start "entryRuleXTestSuite"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:333:1: entryRuleXTestSuite returns [EObject current=null] : iv_ruleXTestSuite= ruleXTestSuite EOF ;
    public final EObject entryRuleXTestSuite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTestSuite = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:334:2: (iv_ruleXTestSuite= ruleXTestSuite EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:335:2: iv_ruleXTestSuite= ruleXTestSuite EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTestSuiteRule()); 
            }
            pushFollow(FOLLOW_ruleXTestSuite_in_entryRuleXTestSuite682);
            iv_ruleXTestSuite=ruleXTestSuite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTestSuite; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTestSuite692); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTestSuite"


    // $ANTLR start "ruleXTestSuite"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:342:1: ruleXTestSuite returns [EObject current=null] : ( () otherlv_1= 'xsuite' ( (lv_name_2_0= ruleUniqueName ) ) ( (lv_expression_3_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleXTestSuite() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:345:28: ( ( () otherlv_1= 'xsuite' ( (lv_name_2_0= ruleUniqueName ) ) ( (lv_expression_3_0= ruleXBlockExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:346:1: ( () otherlv_1= 'xsuite' ( (lv_name_2_0= ruleUniqueName ) ) ( (lv_expression_3_0= ruleXBlockExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:346:1: ( () otherlv_1= 'xsuite' ( (lv_name_2_0= ruleUniqueName ) ) ( (lv_expression_3_0= ruleXBlockExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:346:2: () otherlv_1= 'xsuite' ( (lv_name_2_0= ruleUniqueName ) ) ( (lv_expression_3_0= ruleXBlockExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:346:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:347:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTestSuiteAccess().getXTestSuiteAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleXTestSuite738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTestSuiteAccess().getXsuiteKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:356:1: ( (lv_name_2_0= ruleUniqueName ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:357:1: (lv_name_2_0= ruleUniqueName )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:357:1: (lv_name_2_0= ruleUniqueName )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:358:3: lv_name_2_0= ruleUniqueName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTestSuiteAccess().getNameUniqueNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUniqueName_in_ruleXTestSuite759);
            lv_name_2_0=ruleUniqueName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTestSuiteRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"UniqueName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:374:2: ( (lv_expression_3_0= ruleXBlockExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:375:1: (lv_expression_3_0= ruleXBlockExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:375:1: (lv_expression_3_0= ruleXBlockExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:376:3: lv_expression_3_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTestSuiteAccess().getExpressionXBlockExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXTestSuite780);
            lv_expression_3_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTestSuiteRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
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
    // $ANTLR end "ruleXTestSuite"


    // $ANTLR start "entryRuleXTestCase"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:400:1: entryRuleXTestCase returns [EObject current=null] : iv_ruleXTestCase= ruleXTestCase EOF ;
    public final EObject entryRuleXTestCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTestCase = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:401:2: (iv_ruleXTestCase= ruleXTestCase EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:402:2: iv_ruleXTestCase= ruleXTestCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTestCaseRule()); 
            }
            pushFollow(FOLLOW_ruleXTestCase_in_entryRuleXTestCase816);
            iv_ruleXTestCase=ruleXTestCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTestCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTestCase826); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTestCase"


    // $ANTLR start "ruleXTestCase"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:409:1: ruleXTestCase returns [EObject current=null] : ( () otherlv_1= 'xtest' ( (lv_name_2_0= ruleUniqueName ) ) ( (lv_expression_3_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleXTestCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:412:28: ( ( () otherlv_1= 'xtest' ( (lv_name_2_0= ruleUniqueName ) ) ( (lv_expression_3_0= ruleXBlockExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:413:1: ( () otherlv_1= 'xtest' ( (lv_name_2_0= ruleUniqueName ) ) ( (lv_expression_3_0= ruleXBlockExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:413:1: ( () otherlv_1= 'xtest' ( (lv_name_2_0= ruleUniqueName ) ) ( (lv_expression_3_0= ruleXBlockExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:413:2: () otherlv_1= 'xtest' ( (lv_name_2_0= ruleUniqueName ) ) ( (lv_expression_3_0= ruleXBlockExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:413:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:414:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTestCaseAccess().getXTestCaseAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleXTestCase872); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTestCaseAccess().getXtestKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:423:1: ( (lv_name_2_0= ruleUniqueName ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:424:1: (lv_name_2_0= ruleUniqueName )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:424:1: (lv_name_2_0= ruleUniqueName )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:425:3: lv_name_2_0= ruleUniqueName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTestCaseAccess().getNameUniqueNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUniqueName_in_ruleXTestCase893);
            lv_name_2_0=ruleUniqueName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTestCaseRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"UniqueName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:441:2: ( (lv_expression_3_0= ruleXBlockExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:442:1: (lv_expression_3_0= ruleXBlockExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:442:1: (lv_expression_3_0= ruleXBlockExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:443:3: lv_expression_3_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTestCaseAccess().getExpressionXBlockExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXTestCase914);
            lv_expression_3_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTestCaseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
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
    // $ANTLR end "ruleXTestCase"


    // $ANTLR start "entryRuleXAssertExpression"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:467:1: entryRuleXAssertExpression returns [EObject current=null] : iv_ruleXAssertExpression= ruleXAssertExpression EOF ;
    public final EObject entryRuleXAssertExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssertExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:468:2: (iv_ruleXAssertExpression= ruleXAssertExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:469:2: iv_ruleXAssertExpression= ruleXAssertExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssertExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAssertExpression_in_entryRuleXAssertExpression950);
            iv_ruleXAssertExpression=ruleXAssertExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssertExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssertExpression960); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:476:1: ruleXAssertExpression returns [EObject current=null] : ( () otherlv_1= 'assert' ( (lv_actual_2_0= ruleXExpression ) ) ( ( ( 'throws' )=>otherlv_3= 'throws' ) ( (lv_throws_4_0= ruleJvmTypeReference ) ) )? ) ;
    public final EObject ruleXAssertExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_actual_2_0 = null;

        EObject lv_throws_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:479:28: ( ( () otherlv_1= 'assert' ( (lv_actual_2_0= ruleXExpression ) ) ( ( ( 'throws' )=>otherlv_3= 'throws' ) ( (lv_throws_4_0= ruleJvmTypeReference ) ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:480:1: ( () otherlv_1= 'assert' ( (lv_actual_2_0= ruleXExpression ) ) ( ( ( 'throws' )=>otherlv_3= 'throws' ) ( (lv_throws_4_0= ruleJvmTypeReference ) ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:480:1: ( () otherlv_1= 'assert' ( (lv_actual_2_0= ruleXExpression ) ) ( ( ( 'throws' )=>otherlv_3= 'throws' ) ( (lv_throws_4_0= ruleJvmTypeReference ) ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:480:2: () otherlv_1= 'assert' ( (lv_actual_2_0= ruleXExpression ) ) ( ( ( 'throws' )=>otherlv_3= 'throws' ) ( (lv_throws_4_0= ruleJvmTypeReference ) ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:480:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:481:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXAssertExpressionAccess().getXAssertExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleXAssertExpression1006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXAssertExpressionAccess().getAssertKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:490:1: ( (lv_actual_2_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:491:1: (lv_actual_2_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:491:1: (lv_actual_2_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:492:3: lv_actual_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAssertExpressionAccess().getActualXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXAssertExpression1027);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:508:2: ( ( ( 'throws' )=>otherlv_3= 'throws' ) ( (lv_throws_4_0= ruleJvmTypeReference ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred1_InternalXTest()) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:508:3: ( ( 'throws' )=>otherlv_3= 'throws' ) ( (lv_throws_4_0= ruleJvmTypeReference ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:508:3: ( ( 'throws' )=>otherlv_3= 'throws' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:508:4: ( 'throws' )=>otherlv_3= 'throws'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleXAssertExpression1048); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXAssertExpressionAccess().getThrowsKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:513:2: ( (lv_throws_4_0= ruleJvmTypeReference ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:514:1: (lv_throws_4_0= ruleJvmTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:514:1: (lv_throws_4_0= ruleJvmTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:515:3: lv_throws_4_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssertExpressionAccess().getThrowsJvmTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXAssertExpression1070);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:539:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:540:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:541:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression1108);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression1118); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:548:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XTestSuite_13= ruleXTestSuite | this_XTestCase_14= ruleXTestCase | this_XAssertExpression_15= ruleXAssertExpression ) ;
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

        EObject this_XTestSuite_13 = null;

        EObject this_XTestCase_14 = null;

        EObject this_XAssertExpression_15 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:551:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XTestSuite_13= ruleXTestSuite | this_XTestCase_14= ruleXTestCase | this_XAssertExpression_15= ruleXAssertExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:552:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XTestSuite_13= ruleXTestSuite | this_XTestCase_14= ruleXTestCase | this_XAssertExpression_15= ruleXAssertExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:552:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression | this_XTestSuite_13= ruleXTestSuite | this_XTestCase_14= ruleXTestCase | this_XAssertExpression_15= ruleXAssertExpression )
            int alt7=16;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt7=1;
                }
                break;
            case 53:
                {
                alt7=2;
                }
                break;
            case 51:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
            case 21:
            case 62:
                {
                alt7=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 46:
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt7=5;
                }
                break;
            case 49:
                {
                alt7=6;
                }
                break;
            case 57:
                {
                alt7=7;
                }
                break;
            case 58:
                {
                alt7=8;
                }
                break;
            case 59:
                {
                alt7=9;
                }
                break;
            case 69:
                {
                alt7=10;
                }
                break;
            case 70:
                {
                alt7=11;
                }
                break;
            case 71:
                {
                alt7=12;
                }
                break;
            case 24:
                {
                alt7=13;
                }
                break;
            case 16:
                {
                alt7=14;
                }
                break;
            case 17:
                {
                alt7=15;
                }
                break;
            case 18:
                {
                alt7=16;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:553:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression1165);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:563:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression1192);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:573:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression1219);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:583:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression1246);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:593:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression1273);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:603:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression1300);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:613:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression1327);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:623:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression1354);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:633:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression1381);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:643:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression1408);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:653:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression1435);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:663:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression1462);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:673:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression1489);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:683:5: this_XTestSuite_13= ruleXTestSuite
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTestSuiteParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTestSuite_in_ruleXPrimaryExpression1516);
                    this_XTestSuite_13=ruleXTestSuite();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTestSuite_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:693:5: this_XTestCase_14= ruleXTestCase
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTestCaseParserRuleCall_14()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTestCase_in_ruleXPrimaryExpression1543);
                    this_XTestCase_14=ruleXTestCase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTestCase_14; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:703:5: this_XAssertExpression_15= ruleXAssertExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXAssertExpressionParserRuleCall_15()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXAssertExpression_in_ruleXPrimaryExpression1570);
                    this_XAssertExpression_15=ruleXAssertExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XAssertExpression_15; 
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:719:1: entryRuleStaticEquals returns [String current=null] : iv_ruleStaticEquals= ruleStaticEquals EOF ;
    public final String entryRuleStaticEquals() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticEquals = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:720:2: (iv_ruleStaticEquals= ruleStaticEquals EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:721:2: iv_ruleStaticEquals= ruleStaticEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleStaticEquals_in_entryRuleStaticEquals1606);
            iv_ruleStaticEquals=ruleStaticEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticEquals.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticEquals1617); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:728:1: ruleStaticEquals returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleStaticEquals() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:731:28: (kw= ':=' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:733:2: kw= ':='
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleStaticEquals1654); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:746:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:747:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:748:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall1693);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall1703); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:755:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ( () ruleStaticEquals ( (lv_value_17_0= ruleXAssignment ) ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;

        EObject lv_value_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:758:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ( () ruleStaticEquals ( (lv_value_17_0= ruleXAssignment ) ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:759:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ( () ruleStaticEquals ( (lv_value_17_0= ruleXAssignment ) ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:759:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ( () ruleStaticEquals ( (lv_value_17_0= ruleXAssignment ) ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:759:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ( () ruleStaticEquals ( (lv_value_17_0= ruleXAssignment ) ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:759:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:760:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:765:2: ( ( ruleStaticQualifier ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==63) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:766:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:766:1: ( ruleStaticQualifier )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:767:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall1760);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:780:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:780:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXFeatureCall1774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:784:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:785:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:785:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:786:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall1795);
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

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:802:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:802:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleXFeatureCall1808); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:806:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:807:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:807:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:808:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall1829);
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
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXFeatureCall1843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:828:3: ( ( ruleIdOrSuper ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:829:1: ( ruleIdOrSuper )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:829:1: ( ruleIdOrSuper )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:830:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall1868);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:843:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:843:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:843:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:843:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:850:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:851:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall1902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:864:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt12=3;
                    alt12 = dfa12.predict(input);
                    switch (alt12) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:864:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:864:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:864:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:881:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:882:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall1987);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:899:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:899:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:899:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:899:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:900:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:900:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:901:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall2015);
                            lv_featureCallArguments_10_0=ruleXExpression();

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
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:917:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==22) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:917:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleXFeatureCall2028); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:921:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:922:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:922:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:923:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall2049);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop11;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall2066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:943:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:943:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:948:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:949:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall2099);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:965:3: ( () ruleStaticEquals ( (lv_value_17_0= ruleXAssignment ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:965:4: () ruleStaticEquals ( (lv_value_17_0= ruleXAssignment ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:965:4: ()
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:966:5: 
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
                    pushFollow(FOLLOW_ruleStaticEquals_in_ruleXFeatureCall2126);
                    ruleStaticEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:979:1: ( (lv_value_17_0= ruleXAssignment ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:980:1: (lv_value_17_0= ruleXAssignment )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:980:1: (lv_value_17_0= ruleXAssignment )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:981:3: lv_value_17_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getValueXAssignmentParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXFeatureCall2146);
                    lv_value_17_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_17_0, 
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1005:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1006:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1007:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression2184);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression2194); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1014:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1017:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1019:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression2240);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1035:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1036:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1037:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment2274);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment2284); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1044:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1047:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1048:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1048:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==26) ) {
                    alt17=1;
                }
                else if ( (LA17_1==EOF||(LA17_1>=RULE_ID && LA17_1<=RULE_STRING)||LA17_1==11||(LA17_1>=14 && LA17_1<=25)||(LA17_1>=27 && LA17_1<=46)||(LA17_1>=48 && LA17_1<=74)) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA17_0>=RULE_INT && LA17_0<=RULE_STRING)||(LA17_0>=16 && LA17_0<=18)||LA17_0==21||LA17_0==24||(LA17_0>=37 && LA17_0<=38)||LA17_0==42||LA17_0==46||LA17_0==49||LA17_0==51||LA17_0==53||(LA17_0>=57 && LA17_0<=59)||LA17_0==62||(LA17_0>=64 && LA17_0<=71)) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1048:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1048:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1048:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1048:3: ()
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1049:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1054:2: ( ( ruleValidID ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1055:1: ( ruleValidID )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1055:1: ( ruleValidID )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1056:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment2342);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2358);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1077:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1078:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1078:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1079:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2378);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1096:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1096:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1097:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2408);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1105:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==27) ) {
                        int LA16_1 = input.LA(2);

                        if ( (synpred5_InternalXTest()) ) {
                            alt16=1;
                        }
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1105:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1105:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1105:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1110:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1110:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1110:7: ()
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1111:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1116:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1117:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1117:1: ( ruleOpMultiAssign )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1118:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2461);
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

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1131:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1132:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1132:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1133:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2484);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1157:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1158:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1159:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2524);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign2535); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1166:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1169:28: (kw= '=' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1171:2: kw= '='
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpSingleAssign2572); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1184:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1185:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1186:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2612);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2623); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1193:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1196:28: (kw= '+=' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1198:2: kw= '+='
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpMultiAssign2660); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1211:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1212:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1213:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2699);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2709); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1220:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1223:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1224:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1224:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1225:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2756);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1233:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred6_InternalXTest()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1233:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1233:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1233:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1238:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1238:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1238:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1239:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1244:2: ( ( ruleOpOr ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1245:1: ( ruleOpOr )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1245:1: ( ruleOpOr )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1246:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2809);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1259:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1260:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1260:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1261:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2832);
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
            	    break loop18;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1285:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1286:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1287:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2871);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2882); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1294:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1297:28: (kw= '||' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1299:2: kw= '||'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOr2919); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1312:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1313:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1314:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2958);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2968); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1321:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1324:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1325:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1325:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1326:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3015);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1334:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred7_InternalXTest()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1334:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1334:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1334:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1339:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1339:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1339:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1340:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1345:2: ( ( ruleOpAnd ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1346:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1346:1: ( ruleOpAnd )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1347:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression3068);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1360:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1361:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1361:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1362:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3091);
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
            	    break loop19;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1386:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1387:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1388:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd3130);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd3141); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1395:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1398:28: (kw= '&&' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1400:2: kw= '&&'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpAnd3178); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1413:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1414:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1415:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3217);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression3227); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1422:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1425:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1426:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1426:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1427:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3274);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1435:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred8_InternalXTest()) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==31) ) {
                    int LA20_3 = input.LA(2);

                    if ( (synpred8_InternalXTest()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1435:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1435:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1435:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1440:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1440:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1440:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1441:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1446:2: ( ( ruleOpEquality ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1447:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1447:1: ( ruleOpEquality )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1448:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3327);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1461:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1462:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1462:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1463:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3350);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1487:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1488:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1489:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality3389);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality3400); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1496:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1499:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1500:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1500:1: (kw= '==' | kw= '!=' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            else if ( (LA21_0==31) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1501:2: kw= '=='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpEquality3438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1508:2: kw= '!='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpEquality3457); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1521:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1522:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1523:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3497);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression3507); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1530:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1533:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1534:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1534:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1535:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3554);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1543:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop22:
            do {
                int alt22=3;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    int LA22_2 = input.LA(2);

                    if ( (synpred9_InternalXTest()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA22_3 = input.LA(2);

                    if ( (synpred10_InternalXTest()) ) {
                        alt22=2;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA22_4 = input.LA(2);

                    if ( (synpred10_InternalXTest()) ) {
                        alt22=2;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA22_5 = input.LA(2);

                    if ( (synpred10_InternalXTest()) ) {
                        alt22=2;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA22_6 = input.LA(2);

                    if ( (synpred10_InternalXTest()) ) {
                        alt22=2;
                    }


                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1543:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1543:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1543:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1543:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1543:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1545:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1545:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1545:6: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1546:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXRelationalExpression3590); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1555:3: ( ( ruleQualifiedName ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1556:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1556:1: ( ruleQualifiedName )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1557:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3615);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1571:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1571:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1571:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1571:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1571:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1576:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1576:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1576:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1577:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1582:2: ( ( ruleOpCompare ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1583:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1583:1: ( ruleOpCompare )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1584:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3676);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1597:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1598:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1598:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1599:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3699);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1623:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1624:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1625:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3739);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3750); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1632:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1635:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1636:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1636:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt23=1;
                }
                break;
            case 34:
                {
                alt23=2;
                }
                break;
            case 23:
                {
                alt23=3;
                }
                break;
            case 21:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1637:2: kw= '>='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpCompare3788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1644:2: kw= '<='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpCompare3807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1651:2: kw= '>'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpCompare3826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1658:2: kw= '<'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpCompare3845); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1671:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1672:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1673:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3885);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3895); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1680:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1683:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1684:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1684:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1685:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3942);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1693:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred11_InternalXTest()) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==36) ) {
                    int LA24_3 = input.LA(2);

                    if ( (synpred11_InternalXTest()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1693:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1693:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1693:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1698:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1698:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1698:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1699:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1704:2: ( ( ruleOpOther ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1705:1: ( ruleOpOther )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1705:1: ( ruleOpOther )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1706:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3995);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1719:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1720:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1720:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1721:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4018);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1745:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1746:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1747:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther4057);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther4068); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1754:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1757:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1758:1: (kw= '->' | kw= '..' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1758:1: (kw= '->' | kw= '..' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            else if ( (LA25_0==36) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1759:2: kw= '->'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther4106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1766:2: kw= '..'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther4125); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1779:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1780:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1781:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4165);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression4175); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1788:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1791:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1792:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1792:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1793:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4222);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1801:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred12_InternalXTest()) ) {
                        alt26=1;
                    }


                }
                else if ( (LA26_0==38) ) {
                    int LA26_3 = input.LA(2);

                    if ( (synpred12_InternalXTest()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1801:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1801:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1801:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1806:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1806:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1806:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1807:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1812:2: ( ( ruleOpAdd ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1813:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1813:1: ( ruleOpAdd )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1814:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4275);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1827:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1828:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1828:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1829:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4298);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1853:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1854:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1855:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd4337);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd4348); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1862:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1865:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1866:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1866:1: (kw= '+' | kw= '-' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            else if ( (LA27_0==38) ) {
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1867:2: kw= '+'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpAdd4386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1874:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpAdd4405); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1887:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1888:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1889:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4445);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4455); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1896:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1899:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1900:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1900:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1901:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4502);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1909:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop28:
            do {
                int alt28=2;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (synpred13_InternalXTest()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (synpred13_InternalXTest()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA28_4 = input.LA(2);

                    if ( (synpred13_InternalXTest()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA28_5 = input.LA(2);

                    if ( (synpred13_InternalXTest()) ) {
                        alt28=1;
                    }


                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1909:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1909:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1909:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1914:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1914:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1914:7: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1915:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1920:2: ( ( ruleOpMulti ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1921:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1921:1: ( ruleOpMulti )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1922:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4555);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1935:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1936:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1936:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1937:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4578);
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1961:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1962:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1963:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4617);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4628); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1970:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1973:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1974:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1974:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt29=1;
                }
                break;
            case 39:
                {
                alt29=2;
                }
                break;
            case 40:
                {
                alt29=3;
                }
                break;
            case 41:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1975:2: kw= '*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleOpMulti4666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1982:2: kw= '**'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti4685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1989:2: kw= '/'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMulti4704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1996:2: kw= '%'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpMulti4723); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2009:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2010:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2011:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4763);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4773); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2018:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2021:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2022:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2022:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=37 && LA30_0<=38)||LA30_0==42) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_STRING)||(LA30_0>=16 && LA30_0<=18)||LA30_0==21||LA30_0==24||LA30_0==46||LA30_0==49||LA30_0==51||LA30_0==53||(LA30_0>=57 && LA30_0<=59)||LA30_0==62||(LA30_0>=64 && LA30_0<=71)) ) {
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2022:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2022:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2022:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2022:3: ()
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2023:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2028:2: ( ( ruleOpUnary ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2029:1: ( ruleOpUnary )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2029:1: ( ruleOpUnary )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2030:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4831);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2043:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2044:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2044:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2045:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4852);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2063:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4881);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2079:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2080:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2081:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4917);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4928); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2088:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2091:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2092:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2092:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt31=1;
                }
                break;
            case 38:
                {
                alt31=2;
                }
                break;
            case 37:
                {
                alt31=3;
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2093:2: kw= '!'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpUnary4966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2100:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpUnary4985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2107:2: kw= '+'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpUnary5004); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2120:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2121:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2122:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5044);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression5054); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2129:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2132:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2133:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2133:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2134:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5101);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2142:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==43) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred14_InternalXTest()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2142:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2142:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2142:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2144:5: ( () otherlv_2= 'as' )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2144:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2144:6: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2145:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXCastedExpression5136); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2154:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2155:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2155:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2156:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5159);
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
            	    break loop32;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2180:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2181:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2182:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5197);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall5207); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2189:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2192:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2193:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2193:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2194:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5254);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2202:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop40:
            do {
                int alt40=3;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA40_2 = input.LA(2);

                    if ( (synpred15_InternalXTest()) ) {
                        alt40=1;
                    }
                    else if ( (synpred16_InternalXTest()) ) {
                        alt40=2;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA40_3 = input.LA(2);

                    if ( (synpred16_InternalXTest()) ) {
                        alt40=2;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA40_4 = input.LA(2);

                    if ( (synpred16_InternalXTest()) ) {
                        alt40=2;
                    }


                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2202:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2202:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2202:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2202:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2202:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2208:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2208:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2208:26: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2209:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall5303); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2218:1: ( ( ruleValidID ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2219:1: ( ruleValidID )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2219:1: ( ruleValidID )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2220:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5326);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5342);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2241:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2242:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2242:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2243:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5364);
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
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2260:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2260:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2260:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2260:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2260:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2276:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2276:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2276:8: ()
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2277:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2282:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt33=3;
            	    switch ( input.LA(1) ) {
            	    case 14:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case 45:
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
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2282:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall5450); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2287:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2287:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2288:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2288:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2289:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall5474); if (state.failed) return current;
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
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2303:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2303:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2304:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2304:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2305:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall5511); if (state.failed) return current;
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2318:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==21) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2318:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleXMemberFeatureCall5540); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2322:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2323:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2323:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2324:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5561);
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

            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2340:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop34:
            	            do {
            	                int alt34=2;
            	                int LA34_0 = input.LA(1);

            	                if ( (LA34_0==22) ) {
            	                    alt34=1;
            	                }


            	                switch (alt34) {
            	            	case 1 :
            	            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2340:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall5574); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2344:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2345:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2345:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2346:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5595);
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
            	            	    break loop34;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleXMemberFeatureCall5609); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2366:3: ( ( ruleValidID ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2367:1: ( ruleValidID )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2367:1: ( ruleValidID )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2368:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5634);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2381:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt38=2;
            	    alt38 = dfa38.predict(input);
            	    switch (alt38) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2381:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2381:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2381:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2388:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2389:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall5668); if (state.failed) return current;
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

            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2402:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt37=3;
            	            alt37 = dfa37.predict(input);
            	            switch (alt37) {
            	                case 1 :
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2402:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2402:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2402:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2419:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2420:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5753);
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
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2437:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2437:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2437:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2437:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2438:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2438:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2439:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5781);
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

            	                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2455:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop36:
            	                    do {
            	                        int alt36=2;
            	                        int LA36_0 = input.LA(1);

            	                        if ( (LA36_0==22) ) {
            	                            alt36=1;
            	                        }


            	                        switch (alt36) {
            	                    	case 1 :
            	                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2455:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall5794); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2459:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2460:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2460:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2461:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5815);
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
            	                    	    break loop36;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall5832); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2481:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt39=2;
            	    alt39 = dfa39.predict(input);
            	    switch (alt39) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2481:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2486:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2487:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5865);
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
            	    break loop40;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2511:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2512:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2513:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5905);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5915); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2520:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2523:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2524:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2524:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt41=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt41=1;
                }
                break;
            case 65:
            case 66:
                {
                alt41=2;
                }
                break;
            case RULE_INT:
                {
                alt41=3;
                }
                break;
            case 67:
                {
                alt41=4;
                }
                break;
            case RULE_STRING:
                {
                alt41=5;
                }
                break;
            case 68:
                {
                alt41=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2525:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5962);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2535:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5989);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2545:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral6016);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2555:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral6043);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2565:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral6070);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2575:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6097);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2591:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2592:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2593:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6132);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6142); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2600:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2603:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2604:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2604:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2604:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2604:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2605:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXClosure6188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2614:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2614:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2629:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2629:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2629:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_ID||LA43_0==24||LA43_0==74) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2629:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2629:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2630:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2630:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2631:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6259);
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

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2647:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==22) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2647:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleXClosure6272); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2651:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2652:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2652:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2653:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6293);
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
                            	    break loop42;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2669:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2670:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2670:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2671:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,47,FOLLOW_47_in_ruleXClosure6315); if (state.failed) return current;
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2684:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2685:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2685:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2686:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6352);
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

            otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleXClosure6364); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2714:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2715:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2716:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6400);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6410); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2723:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2726:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2727:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2727:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2727:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2727:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2728:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2733:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_STRING)||(LA46_0>=16 && LA46_0<=18)||LA46_0==21||LA46_0==24||(LA46_0>=37 && LA46_0<=38)||LA46_0==42||LA46_0==46||LA46_0==49||LA46_0==51||LA46_0==53||(LA46_0>=57 && LA46_0<=62)||(LA46_0>=64 && LA46_0<=71)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2733:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2733:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2734:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2734:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2735:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6466);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2751:2: (otherlv_2= ';' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==11) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2751:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleXExpressionInClosure6479); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2763:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2764:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2765:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6519);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6529); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2772:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2775:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2776:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2776:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2776:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2776:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2776:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2792:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2792:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2792:7: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2793:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2798:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==24||LA48_0==74) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2798:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2798:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2799:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2799:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2800:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6637);
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

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2816:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==22) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2816:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXShortClosure6650); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2820:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2821:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2821:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2822:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6671);
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
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2838:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2839:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2839:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2840:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,47,FOLLOW_47_in_ruleXShortClosure6693); if (state.failed) return current;
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2853:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2854:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2854:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2855:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6729);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2879:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2880:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2881:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6765);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6775); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2888:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2891:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2892:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2892:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2892:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleXParenthesizedExpression6812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6834);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXParenthesizedExpression6845); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2917:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2918:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2919:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6881);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6891); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2926:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2929:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2930:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2930:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2930:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2930:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2931:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression6937); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXIfExpression6949); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2944:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2945:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2945:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2946:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6970);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXIfExpression6982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2966:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2967:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2967:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2968:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7003);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2984:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==50) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred22_InternalXTest()) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2984:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2984:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2984:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression7024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2989:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2990:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2990:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2991:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7046);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3015:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3016:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3017:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7084);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression7094); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3024:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3027:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3028:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3028:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3028:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3028:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3029:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression7140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3038:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==52) && (synpred23_InternalXTest())) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3038:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3043:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3043:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3043:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3044:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3044:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3045:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7181);
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

                    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression7193); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3065:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3066:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3066:1: (lv_switch_4_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3067:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7217);
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

            otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression7229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3087:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID||LA51_0==24||LA51_0==52||LA51_0==56||LA51_0==74) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3088:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3088:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3089:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7250);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3105:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==54) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3105:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression7264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression7276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3113:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3114:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3114:1: (lv_default_9_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3115:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7297);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression7311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3143:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3144:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3145:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7347);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7357); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3152:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3155:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3156:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3156:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3156:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3156:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID||LA53_0==24||LA53_0==74) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3157:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3157:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3158:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7403);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3174:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==56) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3174:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart7417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3178:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3179:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3179:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3180:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7438);
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

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXCasePart7452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3200:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3201:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3201:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3202:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7473);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3226:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3227:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3228:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7509);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7519); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3235:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3238:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3239:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3239:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3239:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3239:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3240:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXForLoopExpression7565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXForLoopExpression7577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3253:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3254:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3254:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3255:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7598);
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

            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleXForLoopExpression7610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3275:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3276:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3276:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3277:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7631);
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

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXForLoopExpression7643); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3297:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3298:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3298:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3299:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7664);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3323:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3324:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3325:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7700);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7710); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3332:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3335:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3336:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3336:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3336:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3336:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3337:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXWhileExpression7756); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXWhileExpression7768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3350:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3351:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3351:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3352:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7789);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXWhileExpression7801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3372:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3373:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3373:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3374:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7822);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3398:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3399:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3400:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7858);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7868); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3407:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3410:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3411:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3411:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3411:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3411:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3412:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXDoWhileExpression7914); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3421:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3422:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3422:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3423:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7935);
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

            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression7947); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleXDoWhileExpression7959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3447:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3448:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3448:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3449:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7980);
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

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXDoWhileExpression7992); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3477:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3478:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3479:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8028);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8038); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3486:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3489:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3490:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3490:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3490:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3490:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3491:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXBlockExpression8084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3500:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_STRING)||(LA56_0>=16 && LA56_0<=18)||LA56_0==21||LA56_0==24||(LA56_0>=37 && LA56_0<=38)||LA56_0==42||LA56_0==46||LA56_0==49||LA56_0==51||LA56_0==53||(LA56_0>=57 && LA56_0<=62)||(LA56_0>=64 && LA56_0<=71)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3500:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3500:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3501:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3501:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3502:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8106);
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

            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3518:2: (otherlv_3= ';' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==11) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3518:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleXBlockExpression8119); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleXBlockExpression8135); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3534:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3535:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3536:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8171);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8181); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3543:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3546:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3547:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3547:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=60 && LA57_0<=61)) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||(LA57_0>=16 && LA57_0<=18)||LA57_0==21||LA57_0==24||(LA57_0>=37 && LA57_0<=38)||LA57_0==42||LA57_0==46||LA57_0==49||LA57_0==51||LA57_0==53||(LA57_0>=57 && LA57_0<=59)||LA57_0==62||(LA57_0>=64 && LA57_0<=71)) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3548:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8228);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3558:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8255);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3574:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3575:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3576:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8290);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8300); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3583:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3586:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3587:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3587:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3587:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3587:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3588:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3593:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==60) ) {
                alt58=1;
            }
            else if ( (LA58_0==61) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3593:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3593:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3594:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3594:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3595:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,60,FOLLOW_60_in_ruleXVariableDeclaration8353); if (state.failed) return current;
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3609:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleXVariableDeclaration8384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3613:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (synpred24_InternalXTest()) ) {
                    alt59=1;
                }
                else if ( (true) ) {
                    alt59=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA59_0==24) && (synpred24_InternalXTest())) {
                alt59=1;
            }
            else if ( (LA59_0==74) && (synpred24_InternalXTest())) {
                alt59=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3613:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3613:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3613:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3621:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3621:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3621:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3622:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3622:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3623:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8432);
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

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3639:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3640:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3640:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3641:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8453);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3658:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3658:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3659:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3659:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3660:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8482);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3676:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==26) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3676:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXVariableDeclaration8496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3680:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3681:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3681:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3682:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8517);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3706:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3707:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3708:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8555);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8565); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3715:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3718:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3719:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3719:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3719:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3719:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==RULE_ID||LA61_1==14||LA61_1==21||LA61_1==46) ) {
                    alt61=1;
                }
            }
            else if ( (LA61_0==24||LA61_0==74) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3720:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3720:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3721:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8611);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3737:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3738:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3738:1: (lv_name_1_0= ruleValidID )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3739:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8633);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3763:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3764:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3765:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8669);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8679); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3772:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3775:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3776:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3776:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3776:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3776:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3777:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3777:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3778:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8725);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3794:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3795:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3795:1: (lv_name_1_0= ruleValidID )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3796:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8746);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3820:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3821:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3822:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8783);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8794); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3829:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3832:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3833:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3833:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            else if ( (LA62_0==62) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3834:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8841);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3846:2: kw= 'super'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleIdOrSuper8865); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3859:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3860:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3861:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8906);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8917); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3868:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3871:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3872:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3872:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID) ) {
                    int LA63_2 = input.LA(2);

                    if ( (LA63_2==63) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3873:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8964);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,63,FOLLOW_63_in_ruleStaticQualifier8982); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3897:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3898:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3899:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9023);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9033); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3906:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3909:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3910:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3910:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3910:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3910:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3911:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXConstructorCall9079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3920:1: ( ( ruleQualifiedName ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3921:1: ( ruleQualifiedName )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3921:1: ( ruleQualifiedName )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3922:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9102);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3935:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==21) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3935:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXConstructorCall9115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3939:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3940:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3940:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3941:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9136);
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

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3957:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==22) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3957:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleXConstructorCall9149); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3961:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3962:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3962:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3963:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9170);
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
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleXConstructorCall9184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall9198); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3987:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt67=3;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3987:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3987:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3987:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4004:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4005:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9270);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4022:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4022:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4022:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4022:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4023:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4023:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4024:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9298);
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

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4040:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==22) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4040:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleXConstructorCall9311); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4044:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4045:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4045:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4046:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9332);
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
                    	    break loop66;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall9349); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4066:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4066:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4071:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4072:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9380);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4096:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4097:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4098:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9417);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9427); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4105:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4108:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4109:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4109:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4109:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4109:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4110:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4115:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==65) ) {
                alt69=1;
            }
            else if ( (LA69_0==66) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4115:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXBooleanLiteral9474); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4120:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4120:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4121:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4121:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4122:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,66,FOLLOW_66_in_ruleXBooleanLiteral9498); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4143:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4144:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4145:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9548);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9558); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4152:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4155:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4156:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4156:1: ( () otherlv_1= 'null' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4156:2: () otherlv_1= 'null'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4156:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4157:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXNullLiteral9604); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXIntLiteral"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4174:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4175:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4176:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9640);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral9650); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4183:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4186:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4187:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4187:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4187:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4187:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4188:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4193:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4194:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4194:1: (lv_value_1_0= RULE_INT )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4195:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral9701); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
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
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4219:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4220:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4221:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9742);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9752); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4228:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4231:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4232:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4232:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4232:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4232:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4233:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4238:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4239:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4239:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4240:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9803); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4264:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4265:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4266:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9844);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9854); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4273:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4276:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4277:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4277:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4277:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4277:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4278:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXTypeLiteral9900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXTypeLiteral9912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4291:1: ( ( ruleQualifiedName ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4292:1: ( ruleQualifiedName )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4292:1: ( ruleQualifiedName )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4293:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9935);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXTypeLiteral9947); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4318:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4319:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4320:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9983);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9993); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4327:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4330:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4331:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4331:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4331:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4331:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4332:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXThrowExpression10039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4341:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4342:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4342:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4343:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10060);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4367:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4368:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4369:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10096);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10106); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4376:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4379:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4380:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4380:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4380:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4380:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4381:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXReturnExpression10152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4390:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4390:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4395:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4396:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10183);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4420:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4421:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4422:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10220);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10230); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4429:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4432:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4433:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4433:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4433:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4433:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4434:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression10276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4443:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4444:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4444:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4445:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10297);
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

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4461:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==73) ) {
                alt73=1;
            }
            else if ( (LA73_0==72) ) {
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4461:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4461:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4461:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4461:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt71=0;
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==73) ) {
                            int LA71_2 = input.LA(2);

                            if ( (synpred28_InternalXTest()) ) {
                                alt71=1;
                            }


                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4461:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4463:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4464:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10327);
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
                    	    if ( cnt71 >= 1 ) break loop71;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(71, input);
                                throw eee;
                        }
                        cnt71++;
                    } while (true);

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4480:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==72) ) {
                        int LA72_1 = input.LA(2);

                        if ( (synpred29_InternalXTest()) ) {
                            alt72=1;
                        }
                    }
                    switch (alt72) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4480:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4480:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4480:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression10349); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4485:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4486:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4486:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4487:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10371);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4504:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4504:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4504:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression10393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4508:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4509:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4509:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4510:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10414);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4534:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4535:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4536:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10452);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10462); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4543:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4546:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4547:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4547:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4547:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4547:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4547:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleXCatchClause10507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleXCatchClause10520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4556:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4557:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4557:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4558:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10541);
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

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleXCatchClause10553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4578:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4579:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4579:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4580:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10574);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4604:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4605:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4606:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10611);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10622); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4613:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4616:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4617:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4617:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4618:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10669);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4628:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==14) ) {
                    int LA74_1 = input.LA(2);

                    if ( (LA74_1==RULE_ID) ) {
                        int LA74_3 = input.LA(3);

                        if ( (synpred31_InternalXTest()) ) {
                            alt74=1;
                        }


                    }


                }


                switch (alt74) {
            	case 1 :
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4628:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4628:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4628:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName10697); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10720);
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
            	    break loop74;
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


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4655:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4656:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4657:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10767);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10777); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4664:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4667:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4668:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4668:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                alt76=1;
            }
            else if ( (LA76_0==24||LA76_0==74) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4668:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4668:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4669:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10825);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4677:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==46) ) {
                            int LA75_2 = input.LA(2);

                            if ( (LA75_2==48) ) {
                                int LA75_3 = input.LA(3);

                                if ( (synpred32_InternalXTest()) ) {
                                    alt75=1;
                                }


                            }


                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4677:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4680:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4680:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4680:6: ()
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4681:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleJvmTypeReference10863); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleJvmTypeReference10875); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4696:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10907);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4712:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4713:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4714:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10942);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10952); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4721:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4724:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4725:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4725:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4725:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4725:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==24) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4725:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleXFunctionTypeRef10990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4729:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==RULE_ID||LA78_0==24||LA78_0==74) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4729:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4729:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4730:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4730:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4731:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11012);
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

                            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4747:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop77:
                            do {
                                int alt77=2;
                                int LA77_0 = input.LA(1);

                                if ( (LA77_0==22) ) {
                                    alt77=1;
                                }


                                switch (alt77) {
                            	case 1 :
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4747:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXFunctionTypeRef11025); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4751:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4752:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4752:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4753:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11046);
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
                            	    break loop77;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXFunctionTypeRef11062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,74,FOLLOW_74_in_ruleXFunctionTypeRef11076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4777:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4778:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4778:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4779:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11097);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4803:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4804:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4805:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11133);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11143); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4812:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4815:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4816:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4816:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4816:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4816:2: ( ( ruleQualifiedName ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4817:1: ( ruleQualifiedName )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4817:1: ( ruleQualifiedName )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4818:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11191);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4831:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt81=2;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4831:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4831:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4831:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleJvmParameterizedTypeReference11212); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4836:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4837:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4837:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4838:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11234);
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

                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4854:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==22) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4854:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleJvmParameterizedTypeReference11247); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4858:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4859:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4859:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4860:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11268);
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
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleJvmParameterizedTypeReference11282); if (state.failed) return current;
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4888:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4889:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4890:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11320);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11330); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4897:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4900:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4901:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4901:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID||LA82_0==24||LA82_0==74) ) {
                alt82=1;
            }
            else if ( (LA82_0==75) ) {
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4902:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11377);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4912:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11404);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4928:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4929:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4930:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11439);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11449); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4937:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4940:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4941:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4941:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4941:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4941:2: ()
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4942:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleJvmWildcardTypeReference11495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4951:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt83=3;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==76) ) {
                alt83=1;
            }
            else if ( (LA83_0==62) ) {
                alt83=2;
            }
            switch (alt83) {
                case 1 :
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4951:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4951:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4952:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4952:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4953:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11517);
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
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4970:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4970:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4971:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4971:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4972:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11544);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4996:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4997:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4998:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11582);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11592); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5005:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5008:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5009:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5009:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5009:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleJvmUpperBound11629); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5013:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5014:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5014:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5015:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11650);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5039:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5040:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5041:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11686);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11696); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5048:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5051:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5052:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5052:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5052:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleJvmUpperBoundAnded11733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5056:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5057:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5057:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5058:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11754);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5082:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5083:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5084:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11790);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11800); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5091:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5094:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5095:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5095:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5095:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleJvmLowerBound11837); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5099:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5100:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5100:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5101:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11858);
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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5127:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5128:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5129:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11897);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11908); if (state.failed) return current;

            }

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
    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5136:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5139:28: (this_ID_0= RULE_ID )
            // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:5140:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11947); if (state.failed) return current;
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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:508:4: ( 'throws' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:508:6: 'throws'
        {
        match(input,19,FOLLOW_19_in_synpred1_InternalXTest1040); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalXTest

    // $ANTLR start synpred2_InternalXTest
    public final void synpred2_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:843:4: ( ( '(' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:844:1: ( '(' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:844:1: ( '(' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:845:2: '('
        {
        match(input,24,FOLLOW_24_in_synpred2_InternalXTest1884); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalXTest

    // $ANTLR start synpred3_InternalXTest
    public final void synpred3_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:864:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:864:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:864:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:864:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:864:6: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:865:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:865:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt85=2;
        int LA85_0 = input.LA(1);

        if ( (LA85_0==RULE_ID||LA85_0==24||LA85_0==74) ) {
            alt85=1;
        }
        switch (alt85) {
            case 1 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:865:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:865:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:866:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:866:1: ( ruleJvmFormalParameter )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:867:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred3_InternalXTest1936);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:869:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop84:
                do {
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==22) ) {
                        alt84=1;
                    }


                    switch (alt84) {
                	case 1 :
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:869:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred3_InternalXTest1943); if (state.failed) return ;
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:870:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:871:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:871:1: ( ruleJvmFormalParameter )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:872:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred3_InternalXTest1950);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop84;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:874:6: ( ( '|' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:875:1: ( '|' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:875:1: ( '|' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:876:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred3_InternalXTest1964); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalXTest

    // $ANTLR start synpred4_InternalXTest
    public final void synpred4_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:943:4: ( ( ruleXClosure ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:944:1: ( ruleXClosure )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:944:1: ( ruleXClosure )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:945:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred4_InternalXTest2082);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalXTest

    // $ANTLR start synpred5_InternalXTest
    public final void synpred5_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1105:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1105:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1105:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1105:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1105:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1106:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1106:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1107:1: ( ruleOpMultiAssign )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1107:1: ( ruleOpMultiAssign )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1108:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred5_InternalXTest2429);
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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1233:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1233:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1233:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1233:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1233:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1234:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1234:2: ( ( ruleOpOr ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1235:1: ( ruleOpOr )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1235:1: ( ruleOpOr )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1236:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred6_InternalXTest2777);
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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1334:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1334:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1334:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1334:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1334:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1335:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1335:2: ( ( ruleOpAnd ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1336:1: ( ruleOpAnd )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1336:1: ( ruleOpAnd )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1337:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred7_InternalXTest3036);
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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1435:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1435:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1435:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1435:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1435:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1436:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1436:2: ( ( ruleOpEquality ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1437:1: ( ruleOpEquality )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1437:1: ( ruleOpEquality )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1438:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred8_InternalXTest3295);
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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1543:4: ( ( () 'instanceof' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1543:5: ( () 'instanceof' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1543:5: ( () 'instanceof' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1543:6: () 'instanceof'
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1543:6: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1544:1: 
        {
        }

        match(input,32,FOLLOW_32_in_synpred9_InternalXTest3571); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalXTest

    // $ANTLR start synpred10_InternalXTest
    public final void synpred10_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1571:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1571:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1571:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1571:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1571:10: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1572:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1572:2: ( ( ruleOpCompare ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1573:1: ( ruleOpCompare )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1573:1: ( ruleOpCompare )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1574:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred10_InternalXTest3644);
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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1693:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1693:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1693:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1693:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1693:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1694:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1694:2: ( ( ruleOpOther ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1695:1: ( ruleOpOther )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1695:1: ( ruleOpOther )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1696:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred11_InternalXTest3963);
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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1801:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1801:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1801:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1801:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1801:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1802:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1802:2: ( ( ruleOpAdd ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1803:1: ( ruleOpAdd )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1803:1: ( ruleOpAdd )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1804:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred12_InternalXTest4243);
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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1909:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1909:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1909:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1909:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1909:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1910:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1910:2: ( ( ruleOpMulti ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1911:1: ( ruleOpMulti )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1911:1: ( ruleOpMulti )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:1912:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred13_InternalXTest4523);
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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2142:3: ( ( () 'as' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2142:4: ( () 'as' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2142:4: ( () 'as' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2142:5: () 'as'
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2142:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2143:1: 
        {
        }

        match(input,43,FOLLOW_43_in_synpred14_InternalXTest5117); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalXTest

    // $ANTLR start synpred15_InternalXTest
    public final void synpred15_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2202:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2202:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2202:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2202:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2202:6: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2203:1: 
        {
        }

        match(input,14,FOLLOW_14_in_synpred15_InternalXTest5271); if (state.failed) return ;
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2204:1: ( ( ruleValidID ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2205:1: ( ruleValidID )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2205:1: ( ruleValidID )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2206:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred15_InternalXTest5280);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred15_InternalXTest5286);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalXTest

    // $ANTLR start synpred16_InternalXTest
    public final void synpred16_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2260:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2260:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2260:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2260:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2260:10: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2261:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2261:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt86=3;
        switch ( input.LA(1) ) {
        case 14:
            {
            alt86=1;
            }
            break;
        case 44:
            {
            alt86=2;
            }
            break;
        case 45:
            {
            alt86=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 86, 0, input);

            throw nvae;
        }

        switch (alt86) {
            case 1 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2261:4: '.'
                {
                match(input,14,FOLLOW_14_in_synpred16_InternalXTest5389); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2263:6: ( ( '?.' ) )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2263:6: ( ( '?.' ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2264:1: ( '?.' )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2264:1: ( '?.' )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2265:2: '?.'
                {
                match(input,44,FOLLOW_44_in_synpred16_InternalXTest5403); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2270:6: ( ( '*.' ) )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2270:6: ( ( '*.' ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2271:1: ( '*.' )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2271:1: ( '*.' )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2272:2: '*.'
                {
                match(input,45,FOLLOW_45_in_synpred16_InternalXTest5423); if (state.failed) return ;

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
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2381:4: ( ( '(' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2382:1: ( '(' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2382:1: ( '(' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2383:2: '('
        {
        match(input,24,FOLLOW_24_in_synpred17_InternalXTest5650); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalXTest

    // $ANTLR start synpred18_InternalXTest
    public final void synpred18_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2402:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2402:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2402:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2402:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2402:6: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2403:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2403:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==RULE_ID||LA88_0==24||LA88_0==74) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2403:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2403:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2404:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2404:1: ( ruleJvmFormalParameter )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2405:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalXTest5702);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2407:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==22) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2407:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred18_InternalXTest5709); if (state.failed) return ;
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2408:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2409:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2409:1: ( ruleJvmFormalParameter )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2410:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalXTest5716);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop87;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2412:6: ( ( '|' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2413:1: ( '|' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2413:1: ( '|' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2414:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred18_InternalXTest5730); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred18_InternalXTest

    // $ANTLR start synpred19_InternalXTest
    public final void synpred19_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2481:4: ( ( ruleXClosure ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2482:1: ( ruleXClosure )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2482:1: ( ruleXClosure )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2483:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred19_InternalXTest5848);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalXTest

    // $ANTLR start synpred20_InternalXTest
    public final void synpred20_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2614:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2614:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2614:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2614:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2614:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==24||LA90_0==74) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2614:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2614:5: ( ( ruleJvmFormalParameter ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2615:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2615:1: ( ruleJvmFormalParameter )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2616:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXTest6205);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2618:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==22) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2618:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred20_InternalXTest6212); if (state.failed) return ;
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2619:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2620:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2620:1: ( ruleJvmFormalParameter )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2621:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXTest6219);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop89;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2623:6: ( ( '|' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2624:1: ( '|' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2624:1: ( '|' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2625:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred20_InternalXTest6233); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalXTest

    // $ANTLR start synpred22_InternalXTest
    public final void synpred22_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2984:4: ( 'else' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:2984:6: 'else'
        {
        match(input,50,FOLLOW_50_in_synpred22_InternalXTest7016); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalXTest

    // $ANTLR start synpred23_InternalXTest
    public final void synpred23_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3038:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3038:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3038:3: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3038:4: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3038:4: ( ( ruleValidID ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3039:1: ( ruleValidID )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3039:1: ( ruleValidID )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3040:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalXTest7156);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,52,FOLLOW_52_in_synpred23_InternalXTest7162); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalXTest

    // $ANTLR start synpred24_InternalXTest
    public final void synpred24_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3613:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3613:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3613:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3613:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3613:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3614:1: ( ruleJvmTypeReference )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3614:1: ( ruleJvmTypeReference )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3615:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred24_InternalXTest8402);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3617:2: ( ( ruleValidID ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3618:1: ( ruleValidID )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3618:1: ( ruleValidID )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3619:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalXTest8411);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalXTest

    // $ANTLR start synpred25_InternalXTest
    public final void synpred25_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3987:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3987:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3987:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3987:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3987:5: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3988:1: 
        {
        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3988:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( (LA94_0==RULE_ID||LA94_0==24||LA94_0==74) ) {
            alt94=1;
        }
        switch (alt94) {
            case 1 :
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3988:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3988:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3989:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3989:1: ( ruleJvmFormalParameter )
                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3990:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalXTest9219);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3992:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop93:
                do {
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==22) ) {
                        alt93=1;
                    }


                    switch (alt93) {
                	case 1 :
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3992:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred25_InternalXTest9226); if (state.failed) return ;
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3993:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3994:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3994:1: ( ruleJvmFormalParameter )
                	    // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3995:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalXTest9233);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop93;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3997:6: ( ( '|' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3998:1: ( '|' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3998:1: ( '|' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:3999:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred25_InternalXTest9247); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalXTest

    // $ANTLR start synpred26_InternalXTest
    public final void synpred26_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4066:2: ( ( ruleXClosure ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4067:1: ( ruleXClosure )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4067:1: ( ruleXClosure )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4068:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred26_InternalXTest9363);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalXTest

    // $ANTLR start synpred27_InternalXTest
    public final void synpred27_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4390:2: ( ( ruleXExpression ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4391:1: ( ruleXExpression )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4391:1: ( ruleXExpression )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4392:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred27_InternalXTest10166);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred27_InternalXTest

    // $ANTLR start synpred28_InternalXTest
    public final void synpred28_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4461:5: ( 'catch' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4461:7: 'catch'
        {
        match(input,73,FOLLOW_73_in_synpred28_InternalXTest10311); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalXTest

    // $ANTLR start synpred29_InternalXTest
    public final void synpred29_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4480:5: ( 'finally' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4480:7: 'finally'
        {
        match(input,72,FOLLOW_72_in_synpred29_InternalXTest10341); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalXTest

    // $ANTLR start synpred31_InternalXTest
    public final void synpred31_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4628:3: ( '.' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4629:2: '.'
        {
        match(input,14,FOLLOW_14_in_synpred31_InternalXTest10688); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalXTest

    // $ANTLR start synpred32_InternalXTest
    public final void synpred32_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4677:2: ( ( () '[' ']' ) )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4677:3: ( () '[' ']' )
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4677:3: ( () '[' ']' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4677:4: () '[' ']'
        {
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4677:4: ()
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4678:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred32_InternalXTest10840); if (state.failed) return ;
        match(input,48,FOLLOW_48_in_synpred32_InternalXTest10844); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalXTest

    // $ANTLR start synpred33_InternalXTest
    public final void synpred33_InternalXTest_fragment() throws RecognitionException {   
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4831:4: ( '<' )
        // ../org.xtest/src-gen/org/xtest/parser/antlr/internal/InternalXTest.g:4831:6: '<'
        {
        match(input,21,FOLLOW_21_in_synpred33_InternalXTest11204); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalXTest

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
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA81 dfa81 = new DFA81(this);
    static final String DFA4_eotS =
        "\7\uffff";
    static final String DFA4_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA4_minS =
        "\1\4\1\uffff\2\4\2\uffff\1\4";
    static final String DFA4_maxS =
        "\1\15\1\uffff\1\107\1\17\2\uffff\1\107";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String DFA4_specialS =
        "\7\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\10\uffff\1\1",
            "",
            "\3\4\5\uffff\1\4\1\uffff\1\3\1\uffff\3\4\2\uffff\1\4\2\uffff"+
            "\1\4\14\uffff\2\4\3\uffff\1\4\3\uffff\1\4\2\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\3\uffff\6\4\1\uffff\10\4",
            "\1\6\12\uffff\1\5",
            "",
            "",
            "\3\4\5\uffff\1\4\1\uffff\1\3\1\uffff\3\4\2\uffff\1\4\2\uffff"+
            "\1\4\14\uffff\2\4\3\uffff\1\4\3\uffff\1\4\2\uffff\1\4\1\uffff"+
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
    static final String DFA13_eotS =
        "\101\uffff";
    static final String DFA13_eofS =
        "\1\2\100\uffff";
    static final String DFA13_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA13_maxS =
        "\1\112\1\0\77\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA13_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA13_transitionS = {
            "\3\2\4\uffff\1\2\2\uffff\12\2\1\1\1\2\1\uffff\24\2\1\uffff"+
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
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "843:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_1 = input.LA(1);

                         
                        int index13_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalXTest()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index13_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA12_eotS =
        "\37\uffff";
    static final String DFA12_eofS =
        "\37\uffff";
    static final String DFA12_minS =
        "\1\4\2\0\34\uffff";
    static final String DFA12_maxS =
        "\1\112\2\0\34\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\2\1\1\2\30\uffff\1\3";
    static final String DFA12_specialS =
        "\1\0\1\1\1\2\34\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\2\5\11\uffff\3\5\2\uffff\1\5\2\uffff\1\2\1\36\13\uffff"+
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
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "864:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                         
                        int index12_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_0==RULE_ID) ) {s = 1;}

                        else if ( (LA12_0==24) ) {s = 2;}

                        else if ( (LA12_0==74) && (synpred3_InternalXTest())) {s = 3;}

                        else if ( (LA12_0==47) && (synpred3_InternalXTest())) {s = 4;}

                        else if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_STRING)||(LA12_0>=16 && LA12_0<=18)||LA12_0==21||(LA12_0>=37 && LA12_0<=38)||LA12_0==42||LA12_0==46||LA12_0==49||LA12_0==51||LA12_0==53||(LA12_0>=57 && LA12_0<=59)||LA12_0==62||(LA12_0>=64 && LA12_0<=71)) ) {s = 5;}

                        else if ( (LA12_0==25) ) {s = 30;}

                         
                        input.seek(index12_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA14_eotS =
        "\101\uffff";
    static final String DFA14_eofS =
        "\1\2\100\uffff";
    static final String DFA14_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA14_maxS =
        "\1\112\1\0\77\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA14_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA14_transitionS = {
            "\3\2\4\uffff\1\2\2\uffff\14\2\1\uffff\23\2\1\1\1\uffff\17\2"+
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
            return "943:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalXTest()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index14_1);
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
    static final String DFA38_eotS =
        "\100\uffff";
    static final String DFA38_eofS =
        "\1\2\77\uffff";
    static final String DFA38_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA38_maxS =
        "\1\112\1\0\76\uffff";
    static final String DFA38_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA38_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA38_transitionS = {
            "\3\2\4\uffff\1\2\2\uffff\6\2\1\uffff\3\2\1\1\1\2\1\uffff\24"+
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
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "2381:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_1 = input.LA(1);

                         
                        int index38_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\37\uffff";
    static final String DFA37_eofS =
        "\37\uffff";
    static final String DFA37_minS =
        "\1\4\2\0\34\uffff";
    static final String DFA37_maxS =
        "\1\112\2\0\34\uffff";
    static final String DFA37_acceptS =
        "\3\uffff\2\1\1\2\30\uffff\1\3";
    static final String DFA37_specialS =
        "\1\0\1\1\1\2\34\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\1\2\5\11\uffff\3\5\2\uffff\1\5\2\uffff\1\2\1\36\13\uffff"+
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
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "2402:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_0 = input.LA(1);

                         
                        int index37_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA37_0==RULE_ID) ) {s = 1;}

                        else if ( (LA37_0==24) ) {s = 2;}

                        else if ( (LA37_0==74) && (synpred18_InternalXTest())) {s = 3;}

                        else if ( (LA37_0==47) && (synpred18_InternalXTest())) {s = 4;}

                        else if ( ((LA37_0>=RULE_INT && LA37_0<=RULE_STRING)||(LA37_0>=16 && LA37_0<=18)||LA37_0==21||(LA37_0>=37 && LA37_0<=38)||LA37_0==42||LA37_0==46||LA37_0==49||LA37_0==51||LA37_0==53||(LA37_0>=57 && LA37_0<=59)||LA37_0==62||(LA37_0>=64 && LA37_0<=71)) ) {s = 5;}

                        else if ( (LA37_0==25) ) {s = 30;}

                         
                        input.seek(index37_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_2 = input.LA(1);

                         
                        int index37_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index37_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\100\uffff";
    static final String DFA39_eofS =
        "\1\2\77\uffff";
    static final String DFA39_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA39_maxS =
        "\1\112\1\0\76\uffff";
    static final String DFA39_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA39_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA39_transitionS = {
            "\3\2\4\uffff\1\2\2\uffff\6\2\1\uffff\5\2\1\uffff\23\2\1\1\1"+
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
            return "2481:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_1 = input.LA(1);

                         
                        int index39_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index39_1);
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
    static final String DFA44_eotS =
        "\41\uffff";
    static final String DFA44_eofS =
        "\41\uffff";
    static final String DFA44_minS =
        "\1\4\2\0\36\uffff";
    static final String DFA44_maxS =
        "\1\112\2\0\36\uffff";
    static final String DFA44_acceptS =
        "\3\uffff\2\1\1\2\33\uffff";
    static final String DFA44_specialS =
        "\1\0\1\1\1\2\36\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\1\2\5\11\uffff\3\5\2\uffff\1\5\2\uffff\1\2\14\uffff\2\5"+
            "\3\uffff\1\5\3\uffff\1\5\1\4\2\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\6\5\1\uffff\10\5\2\uffff\1\3",
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
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "2614:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_0 = input.LA(1);

                         
                        int index44_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA44_0==RULE_ID) ) {s = 1;}

                        else if ( (LA44_0==24) ) {s = 2;}

                        else if ( (LA44_0==74) && (synpred20_InternalXTest())) {s = 3;}

                        else if ( (LA44_0==47) && (synpred20_InternalXTest())) {s = 4;}

                        else if ( ((LA44_0>=RULE_INT && LA44_0<=RULE_STRING)||(LA44_0>=16 && LA44_0<=18)||LA44_0==21||(LA44_0>=37 && LA44_0<=38)||LA44_0==42||LA44_0==46||(LA44_0>=48 && LA44_0<=49)||LA44_0==51||LA44_0==53||(LA44_0>=57 && LA44_0<=62)||(LA44_0>=64 && LA44_0<=71)) ) {s = 5;}

                         
                        input.seek(index44_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA44_2 = input.LA(1);

                         
                        int index44_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index44_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\37\uffff";
    static final String DFA67_eofS =
        "\37\uffff";
    static final String DFA67_minS =
        "\1\4\2\0\34\uffff";
    static final String DFA67_maxS =
        "\1\112\2\0\34\uffff";
    static final String DFA67_acceptS =
        "\3\uffff\2\1\1\2\30\uffff\1\3";
    static final String DFA67_specialS =
        "\1\0\1\1\1\2\34\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\1\2\5\11\uffff\3\5\2\uffff\1\5\2\uffff\1\2\1\36\13\uffff"+
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
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3987:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_0 = input.LA(1);

                         
                        int index67_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_0==RULE_ID) ) {s = 1;}

                        else if ( (LA67_0==24) ) {s = 2;}

                        else if ( (LA67_0==74) && (synpred25_InternalXTest())) {s = 3;}

                        else if ( (LA67_0==47) && (synpred25_InternalXTest())) {s = 4;}

                        else if ( ((LA67_0>=RULE_INT && LA67_0<=RULE_STRING)||(LA67_0>=16 && LA67_0<=18)||LA67_0==21||(LA67_0>=37 && LA67_0<=38)||LA67_0==42||LA67_0==46||LA67_0==49||LA67_0==51||LA67_0==53||(LA67_0>=57 && LA67_0<=59)||LA67_0==62||(LA67_0>=64 && LA67_0<=71)) ) {s = 5;}

                        else if ( (LA67_0==25) ) {s = 30;}

                         
                        input.seek(index67_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalXTest()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\100\uffff";
    static final String DFA68_eofS =
        "\1\2\77\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA68_maxS =
        "\1\112\1\0\76\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA68_transitionS = {
            "\3\2\4\uffff\1\2\2\uffff\6\2\1\uffff\5\2\1\uffff\23\2\1\1\1"+
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
            return "4066:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred26_InternalXTest()) ) {s = 63;}

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
    static final String DFA70_eotS =
        "\100\uffff";
    static final String DFA70_eofS =
        "\1\34\77\uffff";
    static final String DFA70_minS =
        "\1\4\33\0\44\uffff";
    static final String DFA70_maxS =
        "\1\112\33\0\44\uffff";
    static final String DFA70_acceptS =
        "\34\uffff\1\2\42\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\44\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\1\1\15\1\17\4\uffff\1\34\2\uffff\2\34\1\31\1\32\1\33\1\34"+
            "\1\uffff\1\10\2\34\1\30\1\34\1\uffff\12\34\1\4\1\3\3\34\1\2"+
            "\3\34\1\12\1\uffff\1\34\1\21\1\34\1\7\1\34\1\6\3\34\1\22\1\23"+
            "\1\24\2\34\1\11\1\uffff\1\5\1\13\1\14\1\16\1\20\1\25\1\26\1"+
            "\27\3\34",
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
            return "4390:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_3 = input.LA(1);

                         
                        int index70_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA70_4 = input.LA(1);

                         
                        int index70_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA70_5 = input.LA(1);

                         
                        int index70_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA70_6 = input.LA(1);

                         
                        int index70_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA70_7 = input.LA(1);

                         
                        int index70_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA70_8 = input.LA(1);

                         
                        int index70_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA70_9 = input.LA(1);

                         
                        int index70_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA70_10 = input.LA(1);

                         
                        int index70_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA70_11 = input.LA(1);

                         
                        int index70_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA70_12 = input.LA(1);

                         
                        int index70_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA70_13 = input.LA(1);

                         
                        int index70_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA70_14 = input.LA(1);

                         
                        int index70_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA70_15 = input.LA(1);

                         
                        int index70_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA70_16 = input.LA(1);

                         
                        int index70_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA70_17 = input.LA(1);

                         
                        int index70_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA70_18 = input.LA(1);

                         
                        int index70_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA70_19 = input.LA(1);

                         
                        int index70_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA70_20 = input.LA(1);

                         
                        int index70_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA70_21 = input.LA(1);

                         
                        int index70_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA70_22 = input.LA(1);

                         
                        int index70_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA70_23 = input.LA(1);

                         
                        int index70_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA70_24 = input.LA(1);

                         
                        int index70_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA70_25 = input.LA(1);

                         
                        int index70_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA70_26 = input.LA(1);

                         
                        int index70_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA70_27 = input.LA(1);

                         
                        int index70_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index70_27);
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
    static final String DFA81_eotS =
        "\100\uffff";
    static final String DFA81_eofS =
        "\1\2\77\uffff";
    static final String DFA81_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA81_maxS =
        "\1\112\1\0\76\uffff";
    static final String DFA81_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA81_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA81_transitionS = {
            "\3\2\4\uffff\1\2\2\uffff\6\2\1\uffff\1\1\4\2\1\uffff\24\2\1"+
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
            return "4831:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
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
                        if ( (synpred33_InternalXTest()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index81_1);
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
 

    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleBody140 = new BitSet(new long[]{0x7E2A446001271072L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleBody163 = new BitSet(new long[]{0x7E2A446001270872L,0x00000000000000FFL});
    public static final BitSet FOLLOW_11_in_ruleBody176 = new BitSet(new long[]{0x7E2A446001270072L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport263 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleImport283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport319 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImport331 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImport343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceWithWildcard_in_ruleImport400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceWithWildcard_in_entryRuleQualifiedNamespaceWithWildcard438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNamespaceWithWildcard449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNamespaceWithWildcard496 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNamespaceWithWildcard514 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNamespaceWithWildcard527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueName_in_entryRuleUniqueName567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueName577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueName619 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleUniqueName645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTestSuite_in_entryRuleXTestSuite682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTestSuite692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleXTestSuite738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUniqueName_in_ruleXTestSuite759 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXTestSuite780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTestCase_in_entryRuleXTestCase816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTestCase826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleXTestCase872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUniqueName_in_ruleXTestCase893 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXTestCase914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssertExpression_in_entryRuleXAssertExpression950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssertExpression960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleXAssertExpression1006 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXAssertExpression1027 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXAssertExpression1048 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXAssertExpression1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression1108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTestSuite_in_ruleXPrimaryExpression1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTestCase_in_ruleXPrimaryExpression1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssertExpression_in_ruleXPrimaryExpression1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticEquals_in_entryRuleStaticEquals1606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticEquals1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleStaticEquals1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall1693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall1760 = new BitSet(new long[]{0x4000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleXFeatureCall1774 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall1795 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleXFeatureCall1808 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall1829 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleXFeatureCall1843 = new BitSet(new long[]{0x4000000000200010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall1868 = new BitSet(new long[]{0x0000400001100002L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall1902 = new BitSet(new long[]{0x7E2AC46003270070L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall1987 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall2015 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleXFeatureCall2028 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall2049 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall2066 = new BitSet(new long[]{0x0000400000100002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall2099 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleStaticEquals_in_ruleXFeatureCall2126 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXFeatureCall2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression2184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment2274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment2342 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2358 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2408 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2461 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpSingleAssign2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpMultiAssign2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2756 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2809 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2832 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOr2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3015 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression3068 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3091 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd3130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpAnd3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3274 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3327 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3350 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality3389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpEquality3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpEquality3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3554 = new BitSet(new long[]{0x0000000700A00002L});
    public static final BitSet FOLLOW_32_in_ruleXRelationalExpression3590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3615 = new BitSet(new long[]{0x0000000700A00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3676 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3699 = new BitSet(new long[]{0x0000000700A00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpCompare3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpCompare3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpCompare3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3942 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3995 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4018 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther4057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4222 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4275 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4298 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd4337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpAdd4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpAdd4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4502 = new BitSet(new long[]{0x0000038000008002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4555 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4578 = new BitSet(new long[]{0x0000038000008002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpMulti4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMulti4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpMulti4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4831 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpUnary4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpUnary4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpUnary5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5101 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleXCastedExpression5136 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5159 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5254 = new BitSet(new long[]{0x0000300000004002L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall5303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5326 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5342 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5364 = new BitSet(new long[]{0x0000300000004002L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall5450 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall5474 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall5511 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleXMemberFeatureCall5540 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5561 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall5574 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5595 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleXMemberFeatureCall5609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5634 = new BitSet(new long[]{0x0000700001004002L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall5668 = new BitSet(new long[]{0x7E2AC46003270070L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5753 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5781 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall5794 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5815 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall5832 = new BitSet(new long[]{0x0000700000004002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5865 = new BitSet(new long[]{0x0000300000004002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXClosure6188 = new BitSet(new long[]{0x7E2BC46001270070L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6259 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_22_in_ruleXClosure6272 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6293 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure6315 = new BitSet(new long[]{0x7E2B446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6352 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6466 = new BitSet(new long[]{0x7E2A446001270872L,0x00000000000000FFL});
    public static final BitSet FOLLOW_11_in_ruleXExpressionInClosure6479 = new BitSet(new long[]{0x7E2A446001270072L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6637 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_22_in_ruleXShortClosure6650 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6671 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_47_in_ruleXShortClosure6693 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleXParenthesizedExpression6812 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6834 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXParenthesizedExpression6845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression6937 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXIfExpression6949 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6970 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXIfExpression6982 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7003 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression7024 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression7140 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7181 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression7193 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7217 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression7229 = new BitSet(new long[]{0x0110000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7250 = new BitSet(new long[]{0x01D0000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression7264 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression7276 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7297 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7403 = new BitSet(new long[]{0x0110000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart7417 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7438 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXCasePart7452 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXForLoopExpression7565 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXForLoopExpression7577 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7598 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXForLoopExpression7610 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7631 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXForLoopExpression7643 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXWhileExpression7756 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXWhileExpression7768 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7789 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXWhileExpression7801 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXDoWhileExpression7914 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7935 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression7947 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXDoWhileExpression7959 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7980 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXDoWhileExpression7992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXBlockExpression8084 = new BitSet(new long[]{0x7EAA446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8106 = new BitSet(new long[]{0x7EAA446001270870L,0x00000000000000FFL});
    public static final BitSet FOLLOW_11_in_ruleXBlockExpression8119 = new BitSet(new long[]{0x7EAA446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_55_in_ruleXBlockExpression8135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXVariableDeclaration8353 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_61_in_ruleXVariableDeclaration8384 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8453 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8482 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleXVariableDeclaration8496 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleIdOrSuper8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8964 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleStaticQualifier8982 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXConstructorCall9079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9102 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_ruleXConstructorCall9115 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9136 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleXConstructorCall9149 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9170 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleXConstructorCall9184 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall9198 = new BitSet(new long[]{0x7E2AC46003270070L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9270 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9298 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleXConstructorCall9311 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9332 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall9349 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXBooleanLiteral9474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXBooleanLiteral9498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXNullLiteral9604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral9650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral9701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTypeLiteral9900 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXTypeLiteral9912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9935 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXTypeLiteral9947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXThrowExpression10039 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXReturnExpression10152 = new BitSet(new long[]{0x7E2A446001270072L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression10276 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression10349 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression10393 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXCatchClause10507 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXCatchClause10520 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10541 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXCatchClause10553 = new BitSet(new long[]{0x7E2A446001270070L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10669 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName10697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10720 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10825 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleJvmTypeReference10863 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleJvmTypeReference10875 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleXFunctionTypeRef10990 = new BitSet(new long[]{0x0000000003000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11012 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleXFunctionTypeRef11025 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11046 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleXFunctionTypeRef11062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleXFunctionTypeRef11076 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11191 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleJvmParameterizedTypeReference11212 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11234 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleJvmParameterizedTypeReference11247 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11268 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleJvmParameterizedTypeReference11282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmWildcardTypeReference11495 = new BitSet(new long[]{0x4000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmUpperBound11629 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmUpperBoundAnded11733 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleJvmLowerBound11837 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred1_InternalXTest1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred2_InternalXTest1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred3_InternalXTest1936 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_22_in_synpred3_InternalXTest1943 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred3_InternalXTest1950 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_47_in_synpred3_InternalXTest1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred4_InternalXTest2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred5_InternalXTest2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred6_InternalXTest2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred7_InternalXTest3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred8_InternalXTest3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred9_InternalXTest3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred10_InternalXTest3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred11_InternalXTest3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred12_InternalXTest4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred13_InternalXTest4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalXTest5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred15_InternalXTest5271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred15_InternalXTest5280 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred15_InternalXTest5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred16_InternalXTest5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred16_InternalXTest5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred16_InternalXTest5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred17_InternalXTest5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalXTest5702 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_22_in_synpred18_InternalXTest5709 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalXTest5716 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_47_in_synpred18_InternalXTest5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred19_InternalXTest5848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXTest6205 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_22_in_synpred20_InternalXTest6212 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalXTest6219 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_47_in_synpred20_InternalXTest6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred22_InternalXTest7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalXTest7156 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred23_InternalXTest7162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred24_InternalXTest8402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalXTest8411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalXTest9219 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_22_in_synpred25_InternalXTest9226 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalXTest9233 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_47_in_synpred25_InternalXTest9247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred26_InternalXTest9363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred27_InternalXTest10166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred28_InternalXTest10311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred29_InternalXTest10341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred31_InternalXTest10688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred32_InternalXTest10840 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_synpred32_InternalXTest10844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred33_InternalXTest11204 = new BitSet(new long[]{0x0000000000000002L});

}