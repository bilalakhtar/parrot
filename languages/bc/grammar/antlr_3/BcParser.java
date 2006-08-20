// $ANTLR 3.0b3 grammar/antlr_3/bc.g 2006-08-20 13:02:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class BcParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "PRINT", "PROGRAM", "STMTS", "VAR", "NEWLINE", "STRING", "LETTER", "INTEGER", "NUMBER", "MINUS", "PLUS", "MUL_OP", "SEMICOLON", "ASSIGN_OP", "REL_OP", "INCR", "DECR", "Quit", "Define", "Auto", "If", "KEYWORDS", "ML_COMMENT", "WS", "'('", "')'"
    };
    public static final int LETTER=11;
    public static final int MINUS=14;
    public static final int INCR=20;
    public static final int ARRAY=4;
    public static final int If=25;
    public static final int WS=28;
    public static final int DECR=21;
    public static final int NUMBER=13;
    public static final int STRING=10;
    public static final int MUL_OP=16;
    public static final int Auto=24;
    public static final int Define=23;
    public static final int Quit=22;
    public static final int STMTS=7;
    public static final int PROGRAM=6;
    public static final int NEWLINE=9;
    public static final int VAR=8;
    public static final int KEYWORDS=26;
    public static final int INTEGER=12;
    public static final int ASSIGN_OP=18;
    public static final int PRINT=5;
    public static final int SEMICOLON=17;
    public static final int EOF=-1;
    public static final int REL_OP=19;
    public static final int ML_COMMENT=27;
    public static final int PLUS=15;

        public BcParser(TokenStream input) {
            super(input);
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "grammar/antlr_3/bc.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start program
    // grammar/antlr_3/bc.g:89:1: program : ( input_item )+ Quit NEWLINE -> ^( PROGRAM ^( ASSIGN_OP ^( VAR LETTER["a"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["b"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["c"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["d"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["e"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["f"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["g"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["h"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["i"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["j"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["k"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["l"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["m"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["n"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["o"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["p"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["q"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["r"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["s"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["t"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["u"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["v"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["w"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["x"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["y"] ) NUMBER["0"] ) ^( ASSIGN_OP ^( VAR LETTER["z"] ) NUMBER["0"] ) ( input_item )+ ) ;
    public program_return program() throws RecognitionException {   
        program_return retval = new program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Quit2=null;
        Token NEWLINE3=null;
        input_item_return input_item1 = null;

        List list_input_item=new ArrayList();
        List list_Quit=new ArrayList();
        List list_NEWLINE=new ArrayList();
        CommonTree Quit2_tree=null;
        CommonTree NEWLINE3_tree=null;

        try {
            // grammar/antlr_3/bc.g:90:5: ( ( input_item )+ Quit NEWLINE -> ^( PROGRAM ^( ASSIGN_OP ^( VAR LETTER[\"a\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"b\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"c\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"d\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"e\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"f\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"g\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"h\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"i\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"j\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"k\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"l\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"m\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"n\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"o\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"p\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"q\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"r\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"s\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"t\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"u\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"v\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"w\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"x\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"y\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"z\"] ) NUMBER[\"0\"] ) ( input_item )+ ) )
            // grammar/antlr_3/bc.g:90:5: ( input_item )+ Quit NEWLINE
            {
            // grammar/antlr_3/bc.g:90:5: ( input_item )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);
                if ( ((LA1_0>=NEWLINE && LA1_0<=LETTER)||(LA1_0>=NUMBER && LA1_0<=MINUS)||LA1_0==SEMICOLON||(LA1_0>=INCR && LA1_0<=DECR)||LA1_0==Define||LA1_0==If||LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // grammar/antlr_3/bc.g:90:5: input_item
            	    {
            	    pushFollow(FOLLOW_input_item_in_program557);
            	    input_item1=input_item();
            	    _fsp--;

            	    list_input_item.add(input_item1.tree);

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            Quit2=(Token)input.LT(1);
            match(input,Quit,FOLLOW_Quit_in_program560); 
            list_Quit.add(Quit2);

            NEWLINE3=(Token)input.LT(1);
            match(input,NEWLINE,FOLLOW_NEWLINE_in_program562); 
            list_NEWLINE.add(NEWLINE3);


            // AST REWRITE
            int i_0 = 0;
            retval.tree = root_0;
            root_0 = (CommonTree)adaptor.nil();
            // 90:30: -> ^( PROGRAM ^( ASSIGN_OP ^( VAR LETTER[\"a\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"b\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"c\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"d\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"e\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"f\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"g\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"h\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"i\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"j\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"k\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"l\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"m\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"n\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"o\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"p\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"q\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"r\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"s\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"t\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"u\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"v\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"w\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"x\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"y\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"z\"] ) NUMBER[\"0\"] ) ( input_item )+ )
            {
                // grammar/antlr_3/bc.g:90:33: ^( PROGRAM ^( ASSIGN_OP ^( VAR LETTER[\"a\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"b\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"c\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"d\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"e\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"f\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"g\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"h\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"i\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"j\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"k\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"l\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"m\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"n\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"o\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"p\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"q\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"r\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"s\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"t\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"u\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"v\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"w\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"x\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"y\"] ) NUMBER[\"0\"] ) ^( ASSIGN_OP ^( VAR LETTER[\"z\"] ) NUMBER[\"0\"] ) ( input_item )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(PROGRAM, "PROGRAM"), root_1);

                // grammar/antlr_3/bc.g:91:36: ^( ASSIGN_OP ^( VAR LETTER[\"a\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:91:49: ^( VAR LETTER[\"a\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "a"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:92:36: ^( ASSIGN_OP ^( VAR LETTER[\"b\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:92:49: ^( VAR LETTER[\"b\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "b"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:93:36: ^( ASSIGN_OP ^( VAR LETTER[\"c\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:93:49: ^( VAR LETTER[\"c\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "c"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:94:36: ^( ASSIGN_OP ^( VAR LETTER[\"d\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:94:49: ^( VAR LETTER[\"d\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "d"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:95:36: ^( ASSIGN_OP ^( VAR LETTER[\"e\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:95:49: ^( VAR LETTER[\"e\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "e"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:96:36: ^( ASSIGN_OP ^( VAR LETTER[\"f\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:96:49: ^( VAR LETTER[\"f\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "f"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:97:36: ^( ASSIGN_OP ^( VAR LETTER[\"g\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:97:49: ^( VAR LETTER[\"g\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "g"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:98:36: ^( ASSIGN_OP ^( VAR LETTER[\"h\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:98:49: ^( VAR LETTER[\"h\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "h"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:99:36: ^( ASSIGN_OP ^( VAR LETTER[\"i\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:99:49: ^( VAR LETTER[\"i\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "i"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:100:36: ^( ASSIGN_OP ^( VAR LETTER[\"j\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:100:49: ^( VAR LETTER[\"j\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "j"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:101:36: ^( ASSIGN_OP ^( VAR LETTER[\"k\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:101:49: ^( VAR LETTER[\"k\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "k"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:102:36: ^( ASSIGN_OP ^( VAR LETTER[\"l\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:102:49: ^( VAR LETTER[\"l\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "l"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:103:36: ^( ASSIGN_OP ^( VAR LETTER[\"m\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:103:49: ^( VAR LETTER[\"m\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "m"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:104:36: ^( ASSIGN_OP ^( VAR LETTER[\"n\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:104:49: ^( VAR LETTER[\"n\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "n"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:105:36: ^( ASSIGN_OP ^( VAR LETTER[\"o\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:105:49: ^( VAR LETTER[\"o\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "o"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:106:36: ^( ASSIGN_OP ^( VAR LETTER[\"p\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:106:49: ^( VAR LETTER[\"p\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "p"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:107:36: ^( ASSIGN_OP ^( VAR LETTER[\"q\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:107:49: ^( VAR LETTER[\"q\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "q"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:108:36: ^( ASSIGN_OP ^( VAR LETTER[\"r\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:108:49: ^( VAR LETTER[\"r\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "r"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:109:36: ^( ASSIGN_OP ^( VAR LETTER[\"s\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:109:49: ^( VAR LETTER[\"s\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "s"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:110:36: ^( ASSIGN_OP ^( VAR LETTER[\"t\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:110:49: ^( VAR LETTER[\"t\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "t"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:111:36: ^( ASSIGN_OP ^( VAR LETTER[\"u\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:111:49: ^( VAR LETTER[\"u\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "u"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:112:36: ^( ASSIGN_OP ^( VAR LETTER[\"v\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:112:49: ^( VAR LETTER[\"v\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "v"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:113:36: ^( ASSIGN_OP ^( VAR LETTER[\"w\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:113:49: ^( VAR LETTER[\"w\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "w"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:114:36: ^( ASSIGN_OP ^( VAR LETTER[\"x\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:114:49: ^( VAR LETTER[\"x\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "x"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:115:36: ^( ASSIGN_OP ^( VAR LETTER[\"y\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:115:49: ^( VAR LETTER[\"y\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "y"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:116:36: ^( ASSIGN_OP ^( VAR LETTER[\"z\"] ) NUMBER[\"0\"] )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_2);

                // grammar/antlr_3/bc.g:116:49: ^( VAR LETTER[\"z\"] )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                adaptor.addChild(root_3, adaptor.create(LETTER, "z"));

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, adaptor.create(NUMBER, "0"));

                adaptor.addChild(root_1, root_2);
                }
                // grammar/antlr_3/bc.g:117:36: ( input_item )+
                {
                int n_1 = list_input_item == null ? 0 : list_input_item.size();
                 


                if ( n_1==0 ) throw new RuntimeException("Must have more than one element for (...)+ loops");
                for (int i_1=0; i_1<n_1; i_1++) {
                    adaptor.addChild(root_1, list_input_item.get(i_1));

                }
                }

                adaptor.addChild(root_0, root_1);
                }

            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        return retval;
    }
    // $ANTLR end program

    public static class input_item_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start input_item
    // grammar/antlr_3/bc.g:121:1: input_item : ( semicolon_list NEWLINE! | function );
    public input_item_return input_item() throws RecognitionException {   
        input_item_return retval = new input_item_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEWLINE5=null;
        semicolon_list_return semicolon_list4 = null;

        function_return function6 = null;


        CommonTree NEWLINE5_tree=null;

        try {
            // grammar/antlr_3/bc.g:122:5: ( semicolon_list NEWLINE! | function )
            int alt2=2;
            int LA2_0 = input.LA(1);
            if ( ((LA2_0>=NEWLINE && LA2_0<=LETTER)||(LA2_0>=NUMBER && LA2_0<=MINUS)||LA2_0==SEMICOLON||(LA2_0>=INCR && LA2_0<=DECR)||LA2_0==If||LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==Define) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("121:1: input_item : ( semicolon_list NEWLINE! | function );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // grammar/antlr_3/bc.g:122:5: semicolon_list NEWLINE!
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_semicolon_list_in_input_item1981);
                    semicolon_list4=semicolon_list();
                    _fsp--;

                    adaptor.addChild(root_0, semicolon_list4.tree);
                    NEWLINE5=(Token)input.LT(1);
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_input_item1983); 

                    }
                    break;
                case 2 :
                    // grammar/antlr_3/bc.g:124:5: function
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_function_in_input_item1996);
                    function6=function();
                    _fsp--;

                    adaptor.addChild(root_0, function6.tree);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        return retval;
    }
    // $ANTLR end input_item

    public static class semicolon_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start semicolon_list
    // grammar/antlr_3/bc.g:127:1: semicolon_list : ( statement )? ( SEMICOLON! ( statement )? )* ;
    public semicolon_list_return semicolon_list() throws RecognitionException {   
        semicolon_list_return retval = new semicolon_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMICOLON8=null;
        statement_return statement7 = null;

        statement_return statement9 = null;


        CommonTree SEMICOLON8_tree=null;

        try {
            // grammar/antlr_3/bc.g:128:5: ( ( statement )? ( SEMICOLON! ( statement )? )* )
            // grammar/antlr_3/bc.g:128:5: ( statement )? ( SEMICOLON! ( statement )? )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // grammar/antlr_3/bc.g:128:5: ( statement )?
            int alt3=2;
            int LA3_0 = input.LA(1);
            if ( ((LA3_0>=STRING && LA3_0<=LETTER)||(LA3_0>=NUMBER && LA3_0<=MINUS)||(LA3_0>=INCR && LA3_0<=DECR)||LA3_0==If||LA3_0==29) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // grammar/antlr_3/bc.g:128:5: statement
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_semicolon_list2010);
                    statement7=statement();
                    _fsp--;

                    adaptor.addChild(root_1, statement7.tree);

                    adaptor.addChild(root_0, root_1);

                    }
                    break;

            }

            // grammar/antlr_3/bc.g:128:16: ( SEMICOLON! ( statement )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);
                if ( (LA5_0==SEMICOLON) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // grammar/antlr_3/bc.g:128:18: SEMICOLON! ( statement )?
            	    {
            	    CommonTree root_1 = (CommonTree)adaptor.nil();

            	    SEMICOLON8=(Token)input.LT(1);
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_semicolon_list2015); 
            	    // grammar/antlr_3/bc.g:128:29: ( statement )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);
            	    if ( ((LA4_0>=STRING && LA4_0<=LETTER)||(LA4_0>=NUMBER && LA4_0<=MINUS)||(LA4_0>=INCR && LA4_0<=DECR)||LA4_0==If||LA4_0==29) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // grammar/antlr_3/bc.g:128:29: statement
            	            {
            	            CommonTree root_2 = (CommonTree)adaptor.nil();

            	            pushFollow(FOLLOW_statement_in_semicolon_list2018);
            	            statement9=statement();
            	            _fsp--;

            	            adaptor.addChild(root_2, statement9.tree);

            	            adaptor.addChild(root_1, root_2);

            	            }
            	            break;

            	    }


            	    adaptor.addChild(root_0, root_1);

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        return retval;
    }
    // $ANTLR end semicolon_list

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start statement
    // grammar/antlr_3/bc.g:132:1: statement : ( named_expression ASSIGN_OP^^ expression | expression -> ^( PRINT expression ) ^( PRINT NEWLINE ) | STRING -> ^( PRINT STRING ) | If '(' relational_expression ')' statement -> ^( If relational_expression ^( STMTS statement ) ) );
    public statement_return statement() throws RecognitionException {   
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN_OP11=null;
        Token STRING14=null;
        Token If15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        named_expression_return named_expression10 = null;

        expression_return expression12 = null;

        expression_return expression13 = null;

        relational_expression_return relational_expression17 = null;

        statement_return statement19 = null;

        List list_statement=new ArrayList();
        List list_relational_expression=new ArrayList();
        List list_expression=new ArrayList();
        List list_29=new ArrayList();
        List list_30=new ArrayList();
        List list_If=new ArrayList();
        List list_STRING=new ArrayList();
        CommonTree ASSIGN_OP11_tree=null;
        CommonTree STRING14_tree=null;
        CommonTree If15_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree char_literal18_tree=null;

        try {
            // grammar/antlr_3/bc.g:133:5: ( named_expression ASSIGN_OP^^ expression | expression -> ^( PRINT expression ) ^( PRINT NEWLINE ) | STRING -> ^( PRINT STRING ) | If '(' relational_expression ')' statement -> ^( If relational_expression ^( STMTS statement ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case LETTER:
                int LA6_1 = input.LA(2);
                if ( (LA6_1==ASSIGN_OP) ) {
                    alt6=1;
                }
                else if ( (LA6_1==NEWLINE||(LA6_1>=MINUS && LA6_1<=SEMICOLON)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("132:1: statement : ( named_expression ASSIGN_OP^^ expression | expression -> ^( PRINT expression ) ^( PRINT NEWLINE ) | STRING -> ^( PRINT STRING ) | If '(' relational_expression ')' statement -> ^( If relational_expression ^( STMTS statement ) ) );", 6, 1, input);

                    throw nvae;
                }
                break;
            case NUMBER:
            case MINUS:
            case INCR:
            case DECR:
            case 29:
                alt6=2;
                break;
            case STRING:
                alt6=3;
                break;
            case If:
                alt6=4;
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("132:1: statement : ( named_expression ASSIGN_OP^^ expression | expression -> ^( PRINT expression ) ^( PRINT NEWLINE ) | STRING -> ^( PRINT STRING ) | If '(' relational_expression ')' statement -> ^( If relational_expression ^( STMTS statement ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // grammar/antlr_3/bc.g:133:5: named_expression ASSIGN_OP^^ expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_named_expression_in_statement2036);
                    named_expression10=named_expression();
                    _fsp--;

                    adaptor.addChild(root_0, named_expression10.tree);
                    ASSIGN_OP11=(Token)input.LT(1);
                    match(input,ASSIGN_OP,FOLLOW_ASSIGN_OP_in_statement2038); 
                    ASSIGN_OP11_tree = (CommonTree)adaptor.create(ASSIGN_OP11);
                    root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN_OP11_tree, root_0);

                    pushFollow(FOLLOW_expression_in_statement2041);
                    expression12=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression12.tree);

                    }
                    break;
                case 2 :
                    // grammar/antlr_3/bc.g:135:5: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement2053);
                    expression13=expression();
                    _fsp--;

                    list_expression.add(expression13.tree);

                    // AST REWRITE
                    int i_0 = 0;
                    retval.tree = root_0;
                    root_0 = (CommonTree)adaptor.nil();
                    // 135:16: -> ^( PRINT expression ) ^( PRINT NEWLINE )
                    {
                        // grammar/antlr_3/bc.g:135:19: ^( PRINT expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(PRINT, "PRINT"), root_1);

                        adaptor.addChild(root_1, list_expression.get(i_0));

                        adaptor.addChild(root_0, root_1);
                        }
                        // grammar/antlr_3/bc.g:135:41: ^( PRINT NEWLINE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(PRINT, "PRINT"), root_1);

                        adaptor.addChild(root_1, adaptor.create(NEWLINE, "NEWLINE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 3 :
                    // grammar/antlr_3/bc.g:137:5: STRING
                    {
                    STRING14=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_statement2083); 
                    list_STRING.add(STRING14);


                    // AST REWRITE
                    int i_0 = 0;
                    retval.tree = root_0;
                    root_0 = (CommonTree)adaptor.nil();
                    // 137:12: -> ^( PRINT STRING )
                    {
                        // grammar/antlr_3/bc.g:137:15: ^( PRINT STRING )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(PRINT, "PRINT"), root_1);

                        adaptor.addChild(root_1, (Token)list_STRING.get(i_0));

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 4 :
                    // grammar/antlr_3/bc.g:139:5: If '(' relational_expression ')' statement
                    {
                    If15=(Token)input.LT(1);
                    match(input,If,FOLLOW_If_in_statement2106); 
                    list_If.add(If15);

                    char_literal16=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_statement2108); 
                    list_29.add(char_literal16);

                    pushFollow(FOLLOW_relational_expression_in_statement2110);
                    relational_expression17=relational_expression();
                    _fsp--;

                    list_relational_expression.add(relational_expression17.tree);
                    char_literal18=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_statement2112); 
                    list_30.add(char_literal18);

                    pushFollow(FOLLOW_statement_in_statement2114);
                    statement19=statement();
                    _fsp--;

                    list_statement.add(statement19.tree);

                    // AST REWRITE
                    int i_0 = 0;
                    retval.tree = root_0;
                    root_0 = (CommonTree)adaptor.nil();
                    // 139:48: -> ^( If relational_expression ^( STMTS statement ) )
                    {
                        // grammar/antlr_3/bc.g:139:51: ^( If relational_expression ^( STMTS statement ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((Token)list_If.get(i_0), root_1);

                        adaptor.addChild(root_1, list_relational_expression.get(i_0));
                        // grammar/antlr_3/bc.g:139:79: ^( STMTS statement )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(STMTS, "STMTS"), root_2);

                        adaptor.addChild(root_2, list_statement.get(i_0));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        return retval;
    }
    // $ANTLR end statement

    public static class function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start function
    // grammar/antlr_3/bc.g:143:1: function : Define ;
    public function_return function() throws RecognitionException {   
        function_return retval = new function_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Define20=null;

        CommonTree Define20_tree=null;

        try {
            // grammar/antlr_3/bc.g:144:5: ( Define )
            // grammar/antlr_3/bc.g:144:5: Define
            {
            root_0 = (CommonTree)adaptor.nil();

            Define20=(Token)input.LT(1);
            match(input,Define,FOLLOW_Define_in_function2146); 
            Define20_tree = (CommonTree)adaptor.create(Define20);
            adaptor.addChild(root_0, Define20_tree);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        return retval;
    }
    // $ANTLR end function

    public static class relational_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relational_expression
    // grammar/antlr_3/bc.g:147:1: relational_expression : expression ( REL_OP expression )? ;
    public relational_expression_return relational_expression() throws RecognitionException {   
        relational_expression_return retval = new relational_expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token REL_OP22=null;
        expression_return expression21 = null;

        expression_return expression23 = null;


        CommonTree REL_OP22_tree=null;

        try {
            // grammar/antlr_3/bc.g:148:5: ( expression ( REL_OP expression )? )
            // grammar/antlr_3/bc.g:148:5: expression ( REL_OP expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_relational_expression2160);
            expression21=expression();
            _fsp--;

            adaptor.addChild(root_0, expression21.tree);
            // grammar/antlr_3/bc.g:148:16: ( REL_OP expression )?
            int alt7=2;
            int LA7_0 = input.LA(1);
            if ( (LA7_0==REL_OP) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // grammar/antlr_3/bc.g:148:18: REL_OP expression
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();

                    REL_OP22=(Token)input.LT(1);
                    match(input,REL_OP,FOLLOW_REL_OP_in_relational_expression2164); 
                    REL_OP22_tree = (CommonTree)adaptor.create(REL_OP22);
                    adaptor.addChild(root_1, REL_OP22_tree);

                    pushFollow(FOLLOW_expression_in_relational_expression2166);
                    expression23=expression();
                    _fsp--;

                    adaptor.addChild(root_1, expression23.tree);

                    adaptor.addChild(root_0, root_1);

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        return retval;
    }
    // $ANTLR end relational_expression

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expression
    // grammar/antlr_3/bc.g:151:1: expression : adding_expression ;
    public expression_return expression() throws RecognitionException {   
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        adding_expression_return adding_expression24 = null;



        try {
            // grammar/antlr_3/bc.g:152:5: ( adding_expression )
            // grammar/antlr_3/bc.g:152:5: adding_expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_adding_expression_in_expression2182);
            adding_expression24=adding_expression();
            _fsp--;

            adaptor.addChild(root_0, adding_expression24.tree);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        return retval;
    }
    // $ANTLR end expression

    public static class named_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start named_expression
    // grammar/antlr_3/bc.g:155:1: named_expression : LETTER -> ^( VAR LETTER ) ;
    public named_expression_return named_expression() throws RecognitionException {   
        named_expression_return retval = new named_expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LETTER25=null;
        List list_LETTER=new ArrayList();
        CommonTree LETTER25_tree=null;

        try {
            // grammar/antlr_3/bc.g:156:5: ( LETTER -> ^( VAR LETTER ) )
            // grammar/antlr_3/bc.g:156:5: LETTER
            {
            LETTER25=(Token)input.LT(1);
            match(input,LETTER,FOLLOW_LETTER_in_named_expression2195); 
            list_LETTER.add(LETTER25);


            // AST REWRITE
            int i_0 = 0;
            retval.tree = root_0;
            root_0 = (CommonTree)adaptor.nil();
            // 156:12: -> ^( VAR LETTER )
            {
                // grammar/antlr_3/bc.g:156:15: ^( VAR LETTER )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_1);

                adaptor.addChild(root_1, (Token)list_LETTER.get(i_0));

                adaptor.addChild(root_0, root_1);
                }

            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        return retval;
    }
    // $ANTLR end named_expression

    public static class adding_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start adding_expression
    // grammar/antlr_3/bc.g:160:1: adding_expression : multiplying_expression ( ( PLUS^^ | MINUS^^ ) multiplying_expression )* ;
    public adding_expression_return adding_expression() throws RecognitionException {   
        adding_expression_return retval = new adding_expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS27=null;
        Token MINUS28=null;
        multiplying_expression_return multiplying_expression26 = null;

        multiplying_expression_return multiplying_expression29 = null;


        CommonTree PLUS27_tree=null;
        CommonTree MINUS28_tree=null;

        try {
            // grammar/antlr_3/bc.g:161:5: ( multiplying_expression ( ( PLUS^^ | MINUS^^ ) multiplying_expression )* )
            // grammar/antlr_3/bc.g:161:5: multiplying_expression ( ( PLUS^^ | MINUS^^ ) multiplying_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplying_expression_in_adding_expression2220);
            multiplying_expression26=multiplying_expression();
            _fsp--;

            adaptor.addChild(root_0, multiplying_expression26.tree);
            // grammar/antlr_3/bc.g:161:28: ( ( PLUS^^ | MINUS^^ ) multiplying_expression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);
                if ( ((LA9_0>=MINUS && LA9_0<=PLUS)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // grammar/antlr_3/bc.g:161:30: ( PLUS^^ | MINUS^^ ) multiplying_expression
            	    {
            	    CommonTree root_1 = (CommonTree)adaptor.nil();

            	    // grammar/antlr_3/bc.g:161:30: ( PLUS^^ | MINUS^^ )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);
            	    if ( (LA8_0==PLUS) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==MINUS) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("161:30: ( PLUS^^ | MINUS^^ )", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // grammar/antlr_3/bc.g:161:32: PLUS^^
            	            {
            	            CommonTree root_2 = (CommonTree)adaptor.nil();

            	            PLUS27=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_adding_expression2226); 
            	            PLUS27_tree = (CommonTree)adaptor.create(PLUS27);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS27_tree, root_0);


            	            adaptor.addChild(root_1, root_2);

            	            }
            	            break;
            	        case 2 :
            	            // grammar/antlr_3/bc.g:161:41: MINUS^^
            	            {
            	            CommonTree root_2 = (CommonTree)adaptor.nil();

            	            MINUS28=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_adding_expression2231); 
            	            MINUS28_tree = (CommonTree)adaptor.create(MINUS28);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS28_tree, root_0);


            	            adaptor.addChild(root_1, root_2);

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplying_expression_in_adding_expression2236);
            	    multiplying_expression29=multiplying_expression();
            	    _fsp--;

            	    adaptor.addChild(root_1, multiplying_expression29.tree);

            	    adaptor.addChild(root_0, root_1);

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        return retval;
    }
    // $ANTLR end adding_expression

    public static class multiplying_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start multiplying_expression
    // grammar/antlr_3/bc.g:164:1: multiplying_expression : unary_expression ( MUL_OP^^ unary_expression )* ;
    public multiplying_expression_return multiplying_expression() throws RecognitionException {   
        multiplying_expression_return retval = new multiplying_expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MUL_OP31=null;
        unary_expression_return unary_expression30 = null;

        unary_expression_return unary_expression32 = null;


        CommonTree MUL_OP31_tree=null;

        try {
            // grammar/antlr_3/bc.g:165:5: ( unary_expression ( MUL_OP^^ unary_expression )* )
            // grammar/antlr_3/bc.g:165:5: unary_expression ( MUL_OP^^ unary_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_expression_in_multiplying_expression2253);
            unary_expression30=unary_expression();
            _fsp--;

            adaptor.addChild(root_0, unary_expression30.tree);
            // grammar/antlr_3/bc.g:165:22: ( MUL_OP^^ unary_expression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);
                if ( (LA10_0==MUL_OP) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // grammar/antlr_3/bc.g:165:24: MUL_OP^^ unary_expression
            	    {
            	    CommonTree root_1 = (CommonTree)adaptor.nil();

            	    MUL_OP31=(Token)input.LT(1);
            	    match(input,MUL_OP,FOLLOW_MUL_OP_in_multiplying_expression2257); 
            	    MUL_OP31_tree = (CommonTree)adaptor.create(MUL_OP31);
            	    root_0 = (CommonTree)adaptor.becomeRoot(MUL_OP31_tree, root_0);

            	    pushFollow(FOLLOW_unary_expression_in_multiplying_expression2260);
            	    unary_expression32=unary_expression();
            	    _fsp--;

            	    adaptor.addChild(root_1, unary_expression32.tree);

            	    adaptor.addChild(root_0, root_1);

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        return retval;
    }
    // $ANTLR end multiplying_expression

    public static class unary_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start unary_expression
    // grammar/antlr_3/bc.g:168:1: unary_expression : ( postfix_expression | MINUS postfix_expression -> ^( MUL_OP["*"] NUMBER["-1"] postfix_expression ) | INCR named_expression -> ^( ASSIGN_OP ^( VAR LETTER["a"] ) ^( PLUS["+"] ^( VAR LETTER["a"] ) NUMBER["1"] ) ) | DECR named_expression -> ^( ASSIGN_OP ^( VAR LETTER["a"] ) ^( MINUS["-"] ^( VAR LETTER["a"] ) NUMBER["1"] ) ) );
    public unary_expression_return unary_expression() throws RecognitionException {   
        unary_expression_return retval = new unary_expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS34=null;
        Token INCR36=null;
        Token DECR38=null;
        postfix_expression_return postfix_expression33 = null;

        postfix_expression_return postfix_expression35 = null;

        named_expression_return named_expression37 = null;

        named_expression_return named_expression39 = null;

        List list_named_expression=new ArrayList();
        List list_postfix_expression=new ArrayList();
        List list_MINUS=new ArrayList();
        List list_INCR=new ArrayList();
        List list_DECR=new ArrayList();
        CommonTree MINUS34_tree=null;
        CommonTree INCR36_tree=null;
        CommonTree DECR38_tree=null;

        try {
            // grammar/antlr_3/bc.g:169:5: ( postfix_expression | MINUS postfix_expression -> ^( MUL_OP[\"*\"] NUMBER[\"-1\"] postfix_expression ) | INCR named_expression -> ^( ASSIGN_OP ^( VAR LETTER[\"a\"] ) ^( PLUS[\"+\"] ^( VAR LETTER[\"a\"] ) NUMBER[\"1\"] ) ) | DECR named_expression -> ^( ASSIGN_OP ^( VAR LETTER[\"a\"] ) ^( MINUS[\"-\"] ^( VAR LETTER[\"a\"] ) NUMBER[\"1\"] ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case LETTER:
            case NUMBER:
            case 29:
                alt11=1;
                break;
            case MINUS:
                alt11=2;
                break;
            case INCR:
                alt11=3;
                break;
            case DECR:
                alt11=4;
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("168:1: unary_expression : ( postfix_expression | MINUS postfix_expression -> ^( MUL_OP[\"*\"] NUMBER[\"-1\"] postfix_expression ) | INCR named_expression -> ^( ASSIGN_OP ^( VAR LETTER[\"a\"] ) ^( PLUS[\"+\"] ^( VAR LETTER[\"a\"] ) NUMBER[\"1\"] ) ) | DECR named_expression -> ^( ASSIGN_OP ^( VAR LETTER[\"a\"] ) ^( MINUS[\"-\"] ^( VAR LETTER[\"a\"] ) NUMBER[\"1\"] ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // grammar/antlr_3/bc.g:169:5: postfix_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_postfix_expression_in_unary_expression2276);
                    postfix_expression33=postfix_expression();
                    _fsp--;

                    adaptor.addChild(root_0, postfix_expression33.tree);

                    }
                    break;
                case 2 :
                    // grammar/antlr_3/bc.g:171:5: MINUS postfix_expression
                    {
                    MINUS34=(Token)input.LT(1);
                    match(input,MINUS,FOLLOW_MINUS_in_unary_expression2288); 
                    list_MINUS.add(MINUS34);

                    pushFollow(FOLLOW_postfix_expression_in_unary_expression2290);
                    postfix_expression35=postfix_expression();
                    _fsp--;

                    list_postfix_expression.add(postfix_expression35.tree);

                    // AST REWRITE
                    int i_0 = 0;
                    retval.tree = root_0;
                    root_0 = (CommonTree)adaptor.nil();
                    // 171:30: -> ^( MUL_OP[\"*\"] NUMBER[\"-1\"] postfix_expression )
                    {
                        // grammar/antlr_3/bc.g:171:33: ^( MUL_OP[\"*\"] NUMBER[\"-1\"] postfix_expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(MUL_OP, "*"), root_1);

                        adaptor.addChild(root_1, adaptor.create(NUMBER, "-1"));
                        adaptor.addChild(root_1, list_postfix_expression.get(i_0));

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 3 :
                    // grammar/antlr_3/bc.g:173:5: INCR named_expression
                    {
                    INCR36=(Token)input.LT(1);
                    match(input,INCR,FOLLOW_INCR_in_unary_expression2316); 
                    list_INCR.add(INCR36);

                    pushFollow(FOLLOW_named_expression_in_unary_expression2318);
                    named_expression37=named_expression();
                    _fsp--;

                    list_named_expression.add(named_expression37.tree);

                    // AST REWRITE
                    int i_0 = 0;
                    retval.tree = root_0;
                    root_0 = (CommonTree)adaptor.nil();
                    // 173:27: -> ^( ASSIGN_OP ^( VAR LETTER[\"a\"] ) ^( PLUS[\"+\"] ^( VAR LETTER[\"a\"] ) NUMBER[\"1\"] ) )
                    {
                        // grammar/antlr_3/bc.g:173:30: ^( ASSIGN_OP ^( VAR LETTER[\"a\"] ) ^( PLUS[\"+\"] ^( VAR LETTER[\"a\"] ) NUMBER[\"1\"] ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_1);

                        // grammar/antlr_3/bc.g:173:43: ^( VAR LETTER[\"a\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_2);

                        adaptor.addChild(root_2, adaptor.create(LETTER, "a"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // grammar/antlr_3/bc.g:173:62: ^( PLUS[\"+\"] ^( VAR LETTER[\"a\"] ) NUMBER[\"1\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(PLUS, "+"), root_2);

                        // grammar/antlr_3/bc.g:173:75: ^( VAR LETTER[\"a\"] )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                        adaptor.addChild(root_3, adaptor.create(LETTER, "a"));

                        adaptor.addChild(root_2, root_3);
                        }
                        adaptor.addChild(root_2, adaptor.create(NUMBER, "1"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 4 :
                    // grammar/antlr_3/bc.g:175:5: DECR named_expression
                    {
                    DECR38=(Token)input.LT(1);
                    match(input,DECR,FOLLOW_DECR_in_unary_expression2362); 
                    list_DECR.add(DECR38);

                    pushFollow(FOLLOW_named_expression_in_unary_expression2364);
                    named_expression39=named_expression();
                    _fsp--;

                    list_named_expression.add(named_expression39.tree);

                    // AST REWRITE
                    int i_0 = 0;
                    retval.tree = root_0;
                    root_0 = (CommonTree)adaptor.nil();
                    // 175:27: -> ^( ASSIGN_OP ^( VAR LETTER[\"a\"] ) ^( MINUS[\"-\"] ^( VAR LETTER[\"a\"] ) NUMBER[\"1\"] ) )
                    {
                        // grammar/antlr_3/bc.g:175:30: ^( ASSIGN_OP ^( VAR LETTER[\"a\"] ) ^( MINUS[\"-\"] ^( VAR LETTER[\"a\"] ) NUMBER[\"1\"] ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(ASSIGN_OP, "ASSIGN_OP"), root_1);

                        // grammar/antlr_3/bc.g:175:43: ^( VAR LETTER[\"a\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_2);

                        adaptor.addChild(root_2, adaptor.create(LETTER, "a"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // grammar/antlr_3/bc.g:175:62: ^( MINUS[\"-\"] ^( VAR LETTER[\"a\"] ) NUMBER[\"1\"] )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(adaptor.create(MINUS, "-"), root_2);

                        // grammar/antlr_3/bc.g:175:76: ^( VAR LETTER[\"a\"] )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot(adaptor.create(VAR, "VAR"), root_3);

                        adaptor.addChild(root_3, adaptor.create(LETTER, "a"));

                        adaptor.addChild(root_2, root_3);
                        }
                        adaptor.addChild(root_2, adaptor.create(NUMBER, "1"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        return retval;
    }
    // $ANTLR end unary_expression

    public static class postfix_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start postfix_expression
    // grammar/antlr_3/bc.g:178:1: postfix_expression : ( NUMBER | named_expression | '(' expression ')' -> expression );
    public postfix_expression_return postfix_expression() throws RecognitionException {   
        postfix_expression_return retval = new postfix_expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NUMBER40=null;
        Token char_literal42=null;
        Token char_literal44=null;
        named_expression_return named_expression41 = null;

        expression_return expression43 = null;

        List list_expression=new ArrayList();
        List list_29=new ArrayList();
        List list_30=new ArrayList();
        CommonTree NUMBER40_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree char_literal44_tree=null;

        try {
            // grammar/antlr_3/bc.g:179:5: ( NUMBER | named_expression | '(' expression ')' -> expression )
            int alt12=3;
            switch ( input.LA(1) ) {
            case NUMBER:
                alt12=1;
                break;
            case LETTER:
                alt12=2;
                break;
            case 29:
                alt12=3;
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("178:1: postfix_expression : ( NUMBER | named_expression | '(' expression ')' -> expression );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // grammar/antlr_3/bc.g:179:5: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NUMBER40=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_postfix_expression2409); 
                    NUMBER40_tree = (CommonTree)adaptor.create(NUMBER40);
                    adaptor.addChild(root_0, NUMBER40_tree);


                    }
                    break;
                case 2 :
                    // grammar/antlr_3/bc.g:181:5: named_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_named_expression_in_postfix_expression2421);
                    named_expression41=named_expression();
                    _fsp--;

                    adaptor.addChild(root_0, named_expression41.tree);

                    }
                    break;
                case 3 :
                    // grammar/antlr_3/bc.g:183:5: '(' expression ')'
                    {
                    char_literal42=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_postfix_expression2438); 
                    list_29.add(char_literal42);

                    pushFollow(FOLLOW_expression_in_postfix_expression2440);
                    expression43=expression();
                    _fsp--;

                    list_expression.add(expression43.tree);
                    char_literal44=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_postfix_expression2442); 
                    list_30.add(char_literal44);


                    // AST REWRITE
                    int i_0 = 0;
                    retval.tree = root_0;
                    root_0 = (CommonTree)adaptor.nil();
                    // 183:24: -> expression
                    {
                        adaptor.addChild(root_0, list_expression.get(i_0));

                    }



                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            retval.stop = input.LT(-1);

                retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        return retval;
    }
    // $ANTLR end postfix_expression


 

    public static final BitSet FOLLOW_input_item_in_program557 = new BitSet(new long[]{0x0000000022F26E00L});
    public static final BitSet FOLLOW_Quit_in_program560 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_program562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_semicolon_list_in_input_item1981 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_input_item1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_input_item1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_semicolon_list2010 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_SEMICOLON_in_semicolon_list2015 = new BitSet(new long[]{0x0000000022326C02L});
    public static final BitSet FOLLOW_statement_in_semicolon_list2018 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_named_expression_in_statement2036 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ASSIGN_OP_in_statement2038 = new BitSet(new long[]{0x0000000020306800L});
    public static final BitSet FOLLOW_expression_in_statement2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_statement2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_statement2106 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement2108 = new BitSet(new long[]{0x0000000020306800L});
    public static final BitSet FOLLOW_relational_expression_in_statement2110 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement2112 = new BitSet(new long[]{0x0000000022306C00L});
    public static final BitSet FOLLOW_statement_in_statement2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Define_in_function2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_relational_expression2160 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_REL_OP_in_relational_expression2164 = new BitSet(new long[]{0x0000000020306800L});
    public static final BitSet FOLLOW_expression_in_relational_expression2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_adding_expression_in_expression2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_named_expression2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplying_expression_in_adding_expression2220 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_PLUS_in_adding_expression2226 = new BitSet(new long[]{0x0000000020306800L});
    public static final BitSet FOLLOW_MINUS_in_adding_expression2231 = new BitSet(new long[]{0x0000000020306800L});
    public static final BitSet FOLLOW_multiplying_expression_in_adding_expression2236 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_unary_expression_in_multiplying_expression2253 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_MUL_OP_in_multiplying_expression2257 = new BitSet(new long[]{0x0000000020306800L});
    public static final BitSet FOLLOW_unary_expression_in_multiplying_expression2260 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression2288 = new BitSet(new long[]{0x0000000020002800L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_unary_expression2316 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_named_expression_in_unary_expression2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_unary_expression2362 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_named_expression_in_unary_expression2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_postfix_expression2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_expression_in_postfix_expression2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_postfix_expression2438 = new BitSet(new long[]{0x0000000020306800L});
    public static final BitSet FOLLOW_expression_in_postfix_expression2440 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_postfix_expression2442 = new BitSet(new long[]{0x0000000000000002L});

}