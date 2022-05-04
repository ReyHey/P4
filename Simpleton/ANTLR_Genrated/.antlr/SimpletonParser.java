// Generated from /Users/puvikaransanthirasegaram/Documents/GitHub/P4/Simpleton/ANTLR_Genrated/Simpleton.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpletonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, LIST=49, VOID=50, WS=51, NEWLINE=52, COMMENT=53, 
		MULTI_COMMENT=54, LINE_COMMENT=55, NUMBER=56, TEXT=57, BOOlEAN=58, NAN=59, 
		IDENTIFIER=60;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_primitiv_type = 2, RULE_type = 3, 
		RULE_expr = 4, RULE_id = 5, RULE_ids = 6, RULE_subscript = 7, RULE_func_call = 8, 
		RULE_actual_parameter_list = 9, RULE_constant = 10, RULE_variable_decl = 11, 
		RULE_const_variable_decl = 12, RULE_list_decl = 13, RULE_list_initialize = 14, 
		RULE_struct_decl = 15, RULE_struct_member = 16, RULE_enum_decl = 17, RULE_enum_member = 18, 
		RULE_function_decl = 19, RULE_return_type = 20, RULE_formal_parameter = 21, 
		RULE_stmt = 22, RULE_jump_stmt = 23, RULE_return_stmt = 24, RULE_switch_stmt = 25, 
		RULE_switch_case = 26, RULE_switch_case_default = 27, RULE_if_else_stmt = 28, 
		RULE_else_if_stmt = 29, RULE_else_stmt = 30, RULE_while_stmt = 31, RULE_foreach_stmt = 32, 
		RULE_block = 33, RULE_assign_stmt = 34, RULE_ternary_stmt = 35, RULE_compound_assign_stmt = 36, 
		RULE_id_assign = 37, RULE_ids_assign = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "primitiv_type", "type", "expr", "id", "ids", 
			"subscript", "func_call", "actual_parameter_list", "constant", "variable_decl", 
			"const_variable_decl", "list_decl", "list_initialize", "struct_decl", 
			"struct_member", "enum_decl", "enum_member", "function_decl", "return_type", 
			"formal_parameter", "stmt", "jump_stmt", "return_stmt", "switch_stmt", 
			"switch_case", "switch_case_default", "if_else_stmt", "else_if_stmt", 
			"else_stmt", "while_stmt", "foreach_stmt", "block", "assign_stmt", "ternary_stmt", 
			"compound_assign_stmt", "id_assign", "ids_assign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'number'", "'text'", "'boolean'", "'<'", "'>'", "'('", "')'", 
			"'-'", "'^'", "'/'", "'mod'", "'*'", "'+'", "'=='", "'!='", "'>='", "'<='", 
			"'!'", "'and'", "'or'", "'.'", "'['", "']'", "','", "'='", "'constant'", 
			"'{'", "'}'", "'struct'", "'enum'", "'function'", "'break'", "'continue'", 
			"'return'", "'switch'", "'case'", "':'", "'default:'", "'if'", "'else if'", 
			"'else'", "'while'", "'foreach'", "'in'", "'+='", "'-='", "'*='", "'/='", 
			"'list'", "'void'", null, null, null, null, null, null, null, null, "'NaN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "LIST", "VOID", "WS", "NEWLINE", "COMMENT", "MULTI_COMMENT", "LINE_COMMENT", 
			"NUMBER", "TEXT", "BOOlEAN", "NAN", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Simpleton.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpletonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpletonParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				{
				setState(78);
				declaration();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Function_declContext function_decl() {
			return getRuleContext(Function_declContext.class,0);
		}
		public Struct_declContext struct_decl() {
			return getRuleContext(Struct_declContext.class,0);
		}
		public Enum_declContext enum_decl() {
			return getRuleContext(Enum_declContext.class,0);
		}
		public Const_variable_declContext const_variable_decl() {
			return getRuleContext(Const_variable_declContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				function_decl();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				struct_decl();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				enum_decl();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				const_variable_decl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primitiv_typeContext extends ParserRuleContext {
		public Token primitivtType;
		public Primitiv_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiv_type; }
	}

	public final Primitiv_typeContext primitiv_type() throws RecognitionException {
		Primitiv_typeContext _localctx = new Primitiv_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiv_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((Primitiv_typeContext)_localctx).primitivtType = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
				((Primitiv_typeContext)_localctx).primitivtType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Primitiv_typeContext primitiv_type() {
			return getRuleContext(Primitiv_typeContext.class,0);
		}
		public TerminalNode LIST() { return getToken(SimpletonParser.LIST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SimpletonParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				primitiv_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(LIST);
				setState(96);
				match(T__3);
				setState(97);
				primitiv_type();
				setState(98);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(LIST);
				setState(101);
				match(T__3);
				setState(102);
				match(IDENTIFIER);
				setState(103);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierCallContext extends ExprContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IdentifierCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FuncCallContext extends ExprContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public FuncCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ConstantLiteralContext extends ExprContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NaNExprContext extends ExprContext {
		public Token NaN;
		public TerminalNode NAN() { return getToken(SimpletonParser.NAN, 0); }
		public NaNExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParensExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class InfixExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InfixExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new IdentifierCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(107);
				id(0);
				}
				break;
			case 2:
				{
				_localctx = new ConstantLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				constant();
				}
				break;
			case 3:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				func_call();
				}
				break;
			case 4:
				{
				_localctx = new NaNExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				((NaNExprContext)_localctx).NaN = match(NAN);
				}
				break;
			case 5:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(T__5);
				setState(112);
				expr(0);
				setState(113);
				match(T__6);
				}
				break;
			case 6:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(T__5);
				setState(116);
				((UnaryExprContext)_localctx).op = match(T__7);
				setState(117);
				expr(0);
				setState(118);
				match(T__6);
				}
				break;
			case 7:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				((UnaryExprContext)_localctx).op = match(T__17);
				setState(121);
				expr(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(124);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(125);
						((InfixExprContext)_localctx).op = match(T__8);
						setState(126);
						((InfixExprContext)_localctx).right = expr(7);
						}
						break;
					case 2:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(127);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(128);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(129);
						((InfixExprContext)_localctx).right = expr(6);
						}
						break;
					case 3:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(131);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__12) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						((InfixExprContext)_localctx).right = expr(5);
						}
						break;
					case 4:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(134);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(135);
						((InfixExprContext)_localctx).right = expr(4);
						}
						break;
					case 5:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(137);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(138);
						((InfixExprContext)_localctx).right = expr(2);
						}
						break;
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		return id(0);
	}

	private IdContext id(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdContext _localctx = new IdContext(_ctx, _parentState);
		IdContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_id, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(145);
			ids();
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id);
					setState(147);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(148);
					match(T__20);
					setState(149);
					ids();
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpletonParser.IDENTIFIER, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public SubscriptContext subscript() {
			return getRuleContext(SubscriptContext.class,0);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ids);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				func_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				subscript();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpletonParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IDENTIFIER);
			setState(161);
			match(T__21);
			setState(162);
			expr(0);
			setState(163);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpletonParser.IDENTIFIER, 0); }
		public Actual_parameter_listContext actual_parameter_list() {
			return getRuleContext(Actual_parameter_listContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(IDENTIFIER);
			setState(166);
			match(T__5);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__17) | (1L << NUMBER) | (1L << TEXT) | (1L << BOOlEAN) | (1L << NAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(167);
				actual_parameter_list();
				}
			}

			setState(170);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_parameter_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Actual_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_parameter_list; }
	}

	public final Actual_parameter_listContext actual_parameter_list() throws RecognitionException {
		Actual_parameter_listContext _localctx = new Actual_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_actual_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			expr(0);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(173);
				match(T__23);
				setState(174);
				expr(0);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SimpletonParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(SimpletonParser.TEXT, 0); }
		public TerminalNode BOOlEAN() { return getToken(SimpletonParser.BOOlEAN, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOlEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declContext extends ParserRuleContext {
		public Token userDefinedType;
		public Token vName;
		public TerminalNode NEWLINE() { return getToken(SimpletonParser.NEWLINE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SimpletonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SimpletonParser.IDENTIFIER, i);
		}
		public Primitiv_typeContext primitiv_type() {
			return getRuleContext(Primitiv_typeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Variable_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_decl; }
	}

	public final Variable_declContext variable_decl() throws RecognitionException {
		Variable_declContext _localctx = new Variable_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				{
				setState(182);
				primitiv_type();
				}
				break;
			case IDENTIFIER:
				{
				setState(183);
				((Variable_declContext)_localctx).userDefinedType = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(186);
			((Variable_declContext)_localctx).vName = match(IDENTIFIER);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(187);
				match(T__24);
				setState(188);
				expr(0);
				}
			}

			setState(191);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_variable_declContext extends ParserRuleContext {
		public Variable_declContext variable_decl() {
			return getRuleContext(Variable_declContext.class,0);
		}
		public Const_variable_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_variable_decl; }
	}

	public final Const_variable_declContext const_variable_decl() throws RecognitionException {
		Const_variable_declContext _localctx = new Const_variable_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_const_variable_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__25);
			setState(194);
			variable_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_declContext extends ParserRuleContext {
		public Token innerType;
		public Token vName;
		public TerminalNode LIST() { return getToken(SimpletonParser.LIST, 0); }
		public TerminalNode NEWLINE() { return getToken(SimpletonParser.NEWLINE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SimpletonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SimpletonParser.IDENTIFIER, i);
		}
		public Primitiv_typeContext primitiv_type() {
			return getRuleContext(Primitiv_typeContext.class,0);
		}
		public List_initializeContext list_initialize() {
			return getRuleContext(List_initializeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_decl; }
	}

	public final List_declContext list_decl() throws RecognitionException {
		List_declContext _localctx = new List_declContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_list_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(LIST);
			setState(197);
			match(T__3);
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				{
				setState(198);
				primitiv_type();
				}
				break;
			case IDENTIFIER:
				{
				setState(199);
				((List_declContext)_localctx).innerType = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(202);
			match(T__4);
			setState(203);
			((List_declContext)_localctx).vName = match(IDENTIFIER);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(204);
				match(T__24);
				setState(207);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__26:
					{
					setState(205);
					list_initialize();
					}
					break;
				case T__5:
				case T__17:
				case NUMBER:
				case TEXT:
				case BOOlEAN:
				case NAN:
				case IDENTIFIER:
					{
					setState(206);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(211);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_initializeContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List_initializeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_initialize; }
	}

	public final List_initializeContext list_initialize() throws RecognitionException {
		List_initializeContext _localctx = new List_initializeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_list_initialize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__26);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__17) | (1L << NUMBER) | (1L << TEXT) | (1L << BOOlEAN) | (1L << NAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(214);
				expr(0);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(215);
					match(T__23);
					setState(216);
					expr(0);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(224);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpletonParser.IDENTIFIER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(SimpletonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpletonParser.NEWLINE, i);
		}
		public List<Struct_memberContext> struct_member() {
			return getRuleContexts(Struct_memberContext.class);
		}
		public Struct_memberContext struct_member(int i) {
			return getRuleContext(Struct_memberContext.class,i);
		}
		public Struct_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_decl; }
	}

	public final Struct_declContext struct_decl() throws RecognitionException {
		Struct_declContext _localctx = new Struct_declContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_struct_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__28);
			setState(227);
			match(IDENTIFIER);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(228);
				match(NEWLINE);
				}
			}

			setState(231);
			match(T__26);
			setState(232);
			match(NEWLINE);
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(233);
				struct_member();
				}
				}
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << LIST))) != 0) );
			setState(238);
			match(T__27);
			setState(239);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_memberContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SimpletonParser.IDENTIFIER, 0); }
		public TerminalNode NEWLINE() { return getToken(SimpletonParser.NEWLINE, 0); }
		public Struct_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_member; }
	}

	public final Struct_memberContext struct_member() throws RecognitionException {
		Struct_memberContext _localctx = new Struct_memberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_struct_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			type();
			setState(242);
			match(IDENTIFIER);
			setState(243);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_declContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpletonParser.IDENTIFIER, 0); }
		public List<Enum_memberContext> enum_member() {
			return getRuleContexts(Enum_memberContext.class);
		}
		public Enum_memberContext enum_member(int i) {
			return getRuleContext(Enum_memberContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpletonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpletonParser.NEWLINE, i);
		}
		public Enum_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_decl; }
	}

	public final Enum_declContext enum_decl() throws RecognitionException {
		Enum_declContext _localctx = new Enum_declContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enum_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__29);
			setState(246);
			match(IDENTIFIER);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(247);
				match(NEWLINE);
				}
			}

			setState(250);
			match(T__26);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(251);
				match(NEWLINE);
				}
			}

			setState(254);
			enum_member();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(255);
				match(T__23);
				setState(256);
				enum_member();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(T__27);
			setState(263);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_memberContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpletonParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(SimpletonParser.NUMBER, 0); }
		public TerminalNode NEWLINE() { return getToken(SimpletonParser.NEWLINE, 0); }
		public Enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_member; }
	}

	public final Enum_memberContext enum_member() throws RecognitionException {
		Enum_memberContext _localctx = new Enum_memberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enum_member);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(IDENTIFIER);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(266);
				match(T__24);
				setState(267);
				match(NUMBER);
				}
			}

			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(270);
				match(NEWLINE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declContext extends ParserRuleContext {
		public Return_typeContext returnType;
		public Token name;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SimpletonParser.IDENTIFIER, 0); }
		public List<Formal_parameterContext> formal_parameter() {
			return getRuleContexts(Formal_parameterContext.class);
		}
		public Formal_parameterContext formal_parameter(int i) {
			return getRuleContext(Formal_parameterContext.class,i);
		}
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__30);
			setState(274);
			((Function_declContext)_localctx).returnType = return_type();
			setState(275);
			((Function_declContext)_localctx).name = match(IDENTIFIER);
			setState(276);
			match(T__5);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << LIST))) != 0)) {
				{
				setState(277);
				formal_parameter();
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(278);
					match(T__23);
					setState(279);
					formal_parameter();
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(287);
			match(T__6);
			setState(288);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SimpletonParser.VOID, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SimpletonParser.IDENTIFIER, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_return_type);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case LIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(VOID);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_parameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SimpletonParser.IDENTIFIER, 0); }
		public Formal_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter; }
	}

	public final Formal_parameterContext formal_parameter() throws RecognitionException {
		Formal_parameterContext _localctx = new Formal_parameterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formal_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			type();
			setState(296);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public If_else_stmtContext if_else_stmt() {
			return getRuleContext(If_else_stmtContext.class,0);
		}
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Foreach_stmtContext foreach_stmt() {
			return getRuleContext(Foreach_stmtContext.class,0);
		}
		public Variable_declContext variable_decl() {
			return getRuleContext(Variable_declContext.class,0);
		}
		public List_declContext list_decl() {
			return getRuleContext(List_declContext.class,0);
		}
		public Const_variable_declContext const_variable_decl() {
			return getRuleContext(Const_variable_declContext.class,0);
		}
		public Jump_stmtContext jump_stmt() {
			return getRuleContext(Jump_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SimpletonParser.NEWLINE, 0); }
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Compound_assign_stmtContext compound_assign_stmt() {
			return getRuleContext(Compound_assign_stmtContext.class,0);
		}
		public Ternary_stmtContext ternary_stmt() {
			return getRuleContext(Ternary_stmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stmt);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				if_else_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				switch_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				while_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				foreach_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				variable_decl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				list_decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(304);
				const_variable_decl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(305);
				jump_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(306);
				expr(0);
				setState(307);
				match(NEWLINE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(309);
				assign_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(310);
				compound_assign_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(311);
				ternary_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(312);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jump_stmtContext extends ParserRuleContext {
		public Token jump;
		public TerminalNode NEWLINE() { return getToken(SimpletonParser.NEWLINE, 0); }
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Jump_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_stmt; }
	}

	public final Jump_stmtContext jump_stmt() throws RecognitionException {
		Jump_stmtContext _localctx = new Jump_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_jump_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				{
				setState(315);
				return_stmt();
				}
				break;
			case T__31:
			case T__32:
				{
				setState(316);
				((Jump_stmtContext)_localctx).jump = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
					((Jump_stmtContext)_localctx).jump = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(319);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__33);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__17) | (1L << NUMBER) | (1L << TEXT) | (1L << BOOlEAN) | (1L << NAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(322);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpletonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpletonParser.NEWLINE, i);
		}
		public List<Switch_caseContext> switch_case() {
			return getRuleContexts(Switch_caseContext.class);
		}
		public Switch_caseContext switch_case(int i) {
			return getRuleContext(Switch_caseContext.class,i);
		}
		public Switch_case_defaultContext switch_case_default() {
			return getRuleContext(Switch_case_defaultContext.class,0);
		}
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_switch_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__34);
			setState(326);
			expr(0);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(327);
				match(NEWLINE);
				}
			}

			setState(330);
			match(T__26);
			setState(331);
			match(NEWLINE);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(332);
				switch_case();
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(338);
				switch_case_default();
				}
			}

			setState(341);
			match(T__27);
			setState(342);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_caseContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(SimpletonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpletonParser.NEWLINE, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switch_case);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(344);
				match(T__35);
				setState(345);
				expr(0);
				setState(346);
				match(T__36);
				}
				}
				setState(350); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__35 );
			setState(352);
			match(NEWLINE);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(353);
					stmt();
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(359);
			match(T__31);
			setState(360);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_case_defaultContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(SimpletonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpletonParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Switch_case_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case_default; }
	}

	public final Switch_case_defaultContext switch_case_default() throws RecognitionException {
		Switch_case_defaultContext _localctx = new Switch_case_defaultContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switch_case_default);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(T__37);
			setState(363);
			match(NEWLINE);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(364);
					stmt();
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(370);
			match(T__31);
			setState(371);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_else_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Else_if_stmtContext> else_if_stmt() {
			return getRuleContexts(Else_if_stmtContext.class);
		}
		public Else_if_stmtContext else_if_stmt(int i) {
			return getRuleContext(Else_if_stmtContext.class,i);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public If_else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_stmt; }
	}

	public final If_else_stmtContext if_else_stmt() throws RecognitionException {
		If_else_stmtContext _localctx = new If_else_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_else_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(T__38);
			setState(374);
			expr(0);
			setState(375);
			block();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(376);
				else_if_stmt();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(382);
				else_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_if_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_stmt; }
	}

	public final Else_if_stmtContext else_if_stmt() throws RecognitionException {
		Else_if_stmtContext _localctx = new Else_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_else_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(T__39);
			setState(386);
			expr(0);
			setState(387);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_stmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(T__40);
			setState(390);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(T__41);
			setState(393);
			expr(0);
			setState(394);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreach_stmtContext extends ParserRuleContext {
		public Token element;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SimpletonParser.IDENTIFIER, 0); }
		public Foreach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_stmt; }
	}

	public final Foreach_stmtContext foreach_stmt() throws RecognitionException {
		Foreach_stmtContext _localctx = new Foreach_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_foreach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__42);
			setState(397);
			type();
			setState(398);
			((Foreach_stmtContext)_localctx).element = match(IDENTIFIER);
			setState(399);
			match(T__43);
			setState(400);
			id(0);
			setState(401);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(SimpletonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpletonParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(403);
				match(NEWLINE);
				}
			}

			setState(406);
			match(T__26);
			setState(407);
			match(NEWLINE);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__17) | (1L << T__25) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__38) | (1L << T__41) | (1L << T__42) | (1L << LIST) | (1L << NEWLINE) | (1L << NUMBER) | (1L << TEXT) | (1L << BOOlEAN) | (1L << NAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(408);
				stmt();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			match(T__27);
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(415);
				match(NEWLINE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_stmtContext extends ParserRuleContext {
		public Id_assignContext id_assign() {
			return getRuleContext(Id_assignContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SimpletonParser.NEWLINE, 0); }
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			id_assign(0);
			setState(419);
			match(T__24);
			setState(420);
			expr(0);
			setState(421);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ternary_stmtContext extends ParserRuleContext {
		public ExprContext ifExpr;
		public ExprContext cond;
		public ExprContext elseExpr;
		public Id_assignContext id_assign() {
			return getRuleContext(Id_assignContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SimpletonParser.NEWLINE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Ternary_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary_stmt; }
	}

	public final Ternary_stmtContext ternary_stmt() throws RecognitionException {
		Ternary_stmtContext _localctx = new Ternary_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ternary_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			id_assign(0);
			setState(424);
			match(T__24);
			setState(425);
			((Ternary_stmtContext)_localctx).ifExpr = expr(0);
			setState(426);
			match(T__38);
			setState(427);
			((Ternary_stmtContext)_localctx).cond = expr(0);
			setState(428);
			match(T__40);
			setState(429);
			((Ternary_stmtContext)_localctx).elseExpr = expr(0);
			setState(430);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_assign_stmtContext extends ParserRuleContext {
		public Token compoundOP;
		public Id_assignContext id_assign() {
			return getRuleContext(Id_assignContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SimpletonParser.NEWLINE, 0); }
		public Compound_assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_assign_stmt; }
	}

	public final Compound_assign_stmtContext compound_assign_stmt() throws RecognitionException {
		Compound_assign_stmtContext _localctx = new Compound_assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_compound_assign_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			id_assign(0);
			setState(433);
			((Compound_assign_stmtContext)_localctx).compoundOP = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
				((Compound_assign_stmtContext)_localctx).compoundOP = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(434);
			expr(0);
			setState(435);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_assignContext extends ParserRuleContext {
		public Ids_assignContext ids_assign() {
			return getRuleContext(Ids_assignContext.class,0);
		}
		public Id_assignContext id_assign() {
			return getRuleContext(Id_assignContext.class,0);
		}
		public Id_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_assign; }
	}

	public final Id_assignContext id_assign() throws RecognitionException {
		return id_assign(0);
	}

	private Id_assignContext id_assign(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Id_assignContext _localctx = new Id_assignContext(_ctx, _parentState);
		Id_assignContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_id_assign, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(438);
			ids_assign();
			}
			_ctx.stop = _input.LT(-1);
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_assignContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_assign);
					setState(440);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(441);
					match(T__20);
					setState(442);
					ids_assign();
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Ids_assignContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpletonParser.IDENTIFIER, 0); }
		public SubscriptContext subscript() {
			return getRuleContext(SubscriptContext.class,0);
		}
		public Ids_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids_assign; }
	}

	public final Ids_assignContext ids_assign() throws RecognitionException {
		Ids_assignContext _localctx = new Ids_assignContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ids_assign);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				subscript();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 5:
			return id_sempred((IdContext)_localctx, predIndex);
		case 37:
			return id_assign_sempred((Id_assignContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean id_sempred(IdContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean id_assign_sempred(Id_assignContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u01c7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3]\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6}\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008e\n\6\f\6\16\6\u0091\13\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7\u0099\n\7\f\7\16\7\u009c\13\7\3\b\3\b\3\b\5\b\u00a1\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u00ab\n\n\3\n\3\n\3\13\3\13\3\13"+
		"\7\13\u00b2\n\13\f\13\16\13\u00b5\13\13\3\f\3\f\3\r\3\r\5\r\u00bb\n\r"+
		"\3\r\3\r\3\r\5\r\u00c0\n\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\5\17\u00cb\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d2\n\17\5\17\u00d4\n"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00dc\n\20\f\20\16\20\u00df\13"+
		"\20\5\20\u00e1\n\20\3\20\3\20\3\21\3\21\3\21\5\21\u00e8\n\21\3\21\3\21"+
		"\3\21\6\21\u00ed\n\21\r\21\16\21\u00ee\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\5\23\u00fb\n\23\3\23\3\23\5\23\u00ff\n\23\3\23\3\23"+
		"\3\23\7\23\u0104\n\23\f\23\16\23\u0107\13\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\5\24\u010f\n\24\3\24\5\24\u0112\n\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\7\25\u011b\n\25\f\25\16\25\u011e\13\25\5\25\u0120\n\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\5\26\u0128\n\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013c"+
		"\n\30\3\31\3\31\5\31\u0140\n\31\3\31\3\31\3\32\3\32\5\32\u0146\n\32\3"+
		"\33\3\33\3\33\5\33\u014b\n\33\3\33\3\33\3\33\7\33\u0150\n\33\f\33\16\33"+
		"\u0153\13\33\3\33\5\33\u0156\n\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\6"+
		"\34\u015f\n\34\r\34\16\34\u0160\3\34\3\34\7\34\u0165\n\34\f\34\16\34\u0168"+
		"\13\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u0170\n\35\f\35\16\35\u0173"+
		"\13\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u017c\n\36\f\36\16\36\u017f"+
		"\13\36\3\36\5\36\u0182\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\5#\u0197\n#\3#\3#\3#\7#\u019c\n#\f#\16#"+
		"\u019f\13#\3#\3#\5#\u01a3\n#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01be\n\'\f\'\16\'\u01c1"+
		"\13\'\3(\3(\5(\u01c5\n(\3(\2\5\n\fL)\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\n\3\2\3\5\3\2\f\16\4\2\n\n\17"+
		"\17\4\2\6\7\20\23\3\2\25\26\3\2:<\3\2\"#\3\2/\62\2\u01e2\2S\3\2\2\2\4"+
		"\\\3\2\2\2\6^\3\2\2\2\bj\3\2\2\2\n|\3\2\2\2\f\u0092\3\2\2\2\16\u00a0\3"+
		"\2\2\2\20\u00a2\3\2\2\2\22\u00a7\3\2\2\2\24\u00ae\3\2\2\2\26\u00b6\3\2"+
		"\2\2\30\u00ba\3\2\2\2\32\u00c3\3\2\2\2\34\u00c6\3\2\2\2\36\u00d7\3\2\2"+
		"\2 \u00e4\3\2\2\2\"\u00f3\3\2\2\2$\u00f7\3\2\2\2&\u010b\3\2\2\2(\u0113"+
		"\3\2\2\2*\u0127\3\2\2\2,\u0129\3\2\2\2.\u013b\3\2\2\2\60\u013f\3\2\2\2"+
		"\62\u0143\3\2\2\2\64\u0147\3\2\2\2\66\u015e\3\2\2\28\u016c\3\2\2\2:\u0177"+
		"\3\2\2\2<\u0183\3\2\2\2>\u0187\3\2\2\2@\u018a\3\2\2\2B\u018e\3\2\2\2D"+
		"\u0196\3\2\2\2F\u01a4\3\2\2\2H\u01a9\3\2\2\2J\u01b2\3\2\2\2L\u01b7\3\2"+
		"\2\2N\u01c4\3\2\2\2PR\5\4\3\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TV\3\2\2\2US\3\2\2\2VW\7\2\2\3W\3\3\2\2\2X]\5(\25\2Y]\5 \21\2Z]\5$\23"+
		"\2[]\5\32\16\2\\X\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\5\3\2\2\2"+
		"^_\t\2\2\2_\7\3\2\2\2`k\5\6\4\2ab\7\63\2\2bc\7\6\2\2cd\5\6\4\2de\7\7\2"+
		"\2ek\3\2\2\2fg\7\63\2\2gh\7\6\2\2hi\7>\2\2ik\7\7\2\2j`\3\2\2\2ja\3\2\2"+
		"\2jf\3\2\2\2k\t\3\2\2\2lm\b\6\1\2m}\5\f\7\2n}\5\26\f\2o}\5\22\n\2p}\7"+
		"=\2\2qr\7\b\2\2rs\5\n\6\2st\7\t\2\2t}\3\2\2\2uv\7\b\2\2vw\7\n\2\2wx\5"+
		"\n\6\2xy\7\t\2\2y}\3\2\2\2z{\7\24\2\2{}\5\n\6\4|l\3\2\2\2|n\3\2\2\2|o"+
		"\3\2\2\2|p\3\2\2\2|q\3\2\2\2|u\3\2\2\2|z\3\2\2\2}\u008f\3\2\2\2~\177\f"+
		"\b\2\2\177\u0080\7\13\2\2\u0080\u008e\5\n\6\t\u0081\u0082\f\7\2\2\u0082"+
		"\u0083\t\3\2\2\u0083\u008e\5\n\6\b\u0084\u0085\f\6\2\2\u0085\u0086\t\4"+
		"\2\2\u0086\u008e\5\n\6\7\u0087\u0088\f\5\2\2\u0088\u0089\t\5\2\2\u0089"+
		"\u008e\5\n\6\6\u008a\u008b\f\3\2\2\u008b\u008c\t\6\2\2\u008c\u008e\5\n"+
		"\6\4\u008d~\3\2\2\2\u008d\u0081\3\2\2\2\u008d\u0084\3\2\2\2\u008d\u0087"+
		"\3\2\2\2\u008d\u008a\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\13\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\b\7\1"+
		"\2\u0093\u0094\5\16\b\2\u0094\u009a\3\2\2\2\u0095\u0096\f\4\2\2\u0096"+
		"\u0097\7\27\2\2\u0097\u0099\5\16\b\2\u0098\u0095\3\2\2\2\u0099\u009c\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\r\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009d\u00a1\7>\2\2\u009e\u00a1\5\22\n\2\u009f\u00a1\5\20\t\2"+
		"\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\17"+
		"\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a4\7\30\2\2\u00a4\u00a5\5\n\6\2\u00a5"+
		"\u00a6\7\31\2\2\u00a6\21\3\2\2\2\u00a7\u00a8\7>\2\2\u00a8\u00aa\7\b\2"+
		"\2\u00a9\u00ab\5\24\13\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\7\t\2\2\u00ad\23\3\2\2\2\u00ae\u00b3\5\n\6"+
		"\2\u00af\u00b0\7\32\2\2\u00b0\u00b2\5\n\6\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\25\3\2\2"+
		"\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\t\7\2\2\u00b7\27\3\2\2\2\u00b8\u00bb"+
		"\5\6\4\2\u00b9\u00bb\7>\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bf\7>\2\2\u00bd\u00be\7\33\2\2\u00be\u00c0\5\n"+
		"\6\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\7\66\2\2\u00c2\31\3\2\2\2\u00c3\u00c4\7\34\2\2\u00c4\u00c5\5\30"+
		"\r\2\u00c5\33\3\2\2\2\u00c6\u00c7\7\63\2\2\u00c7\u00ca\7\6\2\2\u00c8\u00cb"+
		"\5\6\4\2\u00c9\u00cb\7>\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\7\7\2\2\u00cd\u00d3\7>\2\2\u00ce\u00d1\7\33"+
		"\2\2\u00cf\u00d2\5\36\20\2\u00d0\u00d2\5\n\6\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\66\2\2\u00d6\35\3\2\2\2\u00d7\u00e0"+
		"\7\35\2\2\u00d8\u00dd\5\n\6\2\u00d9\u00da\7\32\2\2\u00da\u00dc\5\n\6\2"+
		"\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\36\2\2\u00e3\37\3\2\2"+
		"\2\u00e4\u00e5\7\37\2\2\u00e5\u00e7\7>\2\2\u00e6\u00e8\7\66\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\35"+
		"\2\2\u00ea\u00ec\7\66\2\2\u00eb\u00ed\5\"\22\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\7\36\2\2\u00f1\u00f2\7\66\2\2\u00f2!\3\2\2\2\u00f3\u00f4"+
		"\5\b\5\2\u00f4\u00f5\7>\2\2\u00f5\u00f6\7\66\2\2\u00f6#\3\2\2\2\u00f7"+
		"\u00f8\7 \2\2\u00f8\u00fa\7>\2\2\u00f9\u00fb\7\66\2\2\u00fa\u00f9\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\7\35\2\2\u00fd"+
		"\u00ff\7\66\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u0100\u0105\5&\24\2\u0101\u0102\7\32\2\2\u0102\u0104\5&\24\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\36\2\2\u0109"+
		"\u010a\7\66\2\2\u010a%\3\2\2\2\u010b\u010e\7>\2\2\u010c\u010d\7\33\2\2"+
		"\u010d\u010f\7:\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111"+
		"\3\2\2\2\u0110\u0112\7\66\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2"+
		"\u0112\'\3\2\2\2\u0113\u0114\7!\2\2\u0114\u0115\5*\26\2\u0115\u0116\7"+
		">\2\2\u0116\u011f\7\b\2\2\u0117\u011c\5,\27\2\u0118\u0119\7\32\2\2\u0119"+
		"\u011b\5,\27\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0117\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7\t"+
		"\2\2\u0122\u0123\5D#\2\u0123)\3\2\2\2\u0124\u0128\5\b\5\2\u0125\u0128"+
		"\7\64\2\2\u0126\u0128\7>\2\2\u0127\u0124\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0126\3\2\2\2\u0128+\3\2\2\2\u0129\u012a\5\b\5\2\u012a\u012b\7>\2\2\u012b"+
		"-\3\2\2\2\u012c\u013c\5:\36\2\u012d\u013c\5\64\33\2\u012e\u013c\5@!\2"+
		"\u012f\u013c\5B\"\2\u0130\u013c\5\30\r\2\u0131\u013c\5\34\17\2\u0132\u013c"+
		"\5\32\16\2\u0133\u013c\5\60\31\2\u0134\u0135\5\n\6\2\u0135\u0136\7\66"+
		"\2\2\u0136\u013c\3\2\2\2\u0137\u013c\5F$\2\u0138\u013c\5J&\2\u0139\u013c"+
		"\5H%\2\u013a\u013c\5D#\2\u013b\u012c\3\2\2\2\u013b\u012d\3\2\2\2\u013b"+
		"\u012e\3\2\2\2\u013b\u012f\3\2\2\2\u013b\u0130\3\2\2\2\u013b\u0131\3\2"+
		"\2\2\u013b\u0132\3\2\2\2\u013b\u0133\3\2\2\2\u013b\u0134\3\2\2\2\u013b"+
		"\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2"+
		"\2\2\u013c/\3\2\2\2\u013d\u0140\5\62\32\2\u013e\u0140\t\b\2\2\u013f\u013d"+
		"\3\2\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7\66\2\2"+
		"\u0142\61\3\2\2\2\u0143\u0145\7$\2\2\u0144\u0146\5\n\6\2\u0145\u0144\3"+
		"\2\2\2\u0145\u0146\3\2\2\2\u0146\63\3\2\2\2\u0147\u0148\7%\2\2\u0148\u014a"+
		"\5\n\6\2\u0149\u014b\7\66\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2"+
		"\u014b\u014c\3\2\2\2\u014c\u014d\7\35\2\2\u014d\u0151\7\66\2\2\u014e\u0150"+
		"\5\66\34\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2"+
		"\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156"+
		"\58\35\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\7\36\2\2\u0158\u0159\7\66\2\2\u0159\65\3\2\2\2\u015a\u015b\7&\2"+
		"\2\u015b\u015c\5\n\6\2\u015c\u015d\7\'\2\2\u015d\u015f\3\2\2\2\u015e\u015a"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0166\7\66\2\2\u0163\u0165\5.\30\2\u0164\u0163\3"+
		"\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7\"\2\2\u016a\u016b\7\66"+
		"\2\2\u016b\67\3\2\2\2\u016c\u016d\7(\2\2\u016d\u0171\7\66\2\2\u016e\u0170"+
		"\5.\30\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\7\""+
		"\2\2\u0175\u0176\7\66\2\2\u01769\3\2\2\2\u0177\u0178\7)\2\2\u0178\u0179"+
		"\5\n\6\2\u0179\u017d\5D#\2\u017a\u017c\5<\37\2\u017b\u017a\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0181\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u0180\u0182\5> \2\u0181\u0180\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182;\3\2\2\2\u0183\u0184\7*\2\2\u0184\u0185\5\n\6\2\u0185\u0186"+
		"\5D#\2\u0186=\3\2\2\2\u0187\u0188\7+\2\2\u0188\u0189\5D#\2\u0189?\3\2"+
		"\2\2\u018a\u018b\7,\2\2\u018b\u018c\5\n\6\2\u018c\u018d\5D#\2\u018dA\3"+
		"\2\2\2\u018e\u018f\7-\2\2\u018f\u0190\5\b\5\2\u0190\u0191\7>\2\2\u0191"+
		"\u0192\7.\2\2\u0192\u0193\5\f\7\2\u0193\u0194\5D#\2\u0194C\3\2\2\2\u0195"+
		"\u0197\7\66\2\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3"+
		"\2\2\2\u0198\u0199\7\35\2\2\u0199\u019d\7\66\2\2\u019a\u019c\5.\30\2\u019b"+
		"\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a2\7\36\2\2\u01a1"+
		"\u01a3\7\66\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3E\3\2\2\2"+
		"\u01a4\u01a5\5L\'\2\u01a5\u01a6\7\33\2\2\u01a6\u01a7\5\n\6\2\u01a7\u01a8"+
		"\7\66\2\2\u01a8G\3\2\2\2\u01a9\u01aa\5L\'\2\u01aa\u01ab\7\33\2\2\u01ab"+
		"\u01ac\5\n\6\2\u01ac\u01ad\7)\2\2\u01ad\u01ae\5\n\6\2\u01ae\u01af\7+\2"+
		"\2\u01af\u01b0\5\n\6\2\u01b0\u01b1\7\66\2\2\u01b1I\3\2\2\2\u01b2\u01b3"+
		"\5L\'\2\u01b3\u01b4\t\t\2\2\u01b4\u01b5\5\n\6\2\u01b5\u01b6\7\66\2\2\u01b6"+
		"K\3\2\2\2\u01b7\u01b8\b\'\1\2\u01b8\u01b9\5N(\2\u01b9\u01bf\3\2\2\2\u01ba"+
		"\u01bb\f\4\2\2\u01bb\u01bc\7\27\2\2\u01bc\u01be\5N(\2\u01bd\u01ba\3\2"+
		"\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"M\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\7>\2\2\u01c3\u01c5\5\20\t\2"+
		"\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5O\3\2\2\2-S\\j|\u008d\u008f"+
		"\u009a\u00a0\u00aa\u00b3\u00ba\u00bf\u00ca\u00d1\u00d3\u00dd\u00e0\u00e7"+
		"\u00ee\u00fa\u00fe\u0105\u010e\u0111\u011c\u011f\u0127\u013b\u013f\u0145"+
		"\u014a\u0151\u0155\u0160\u0166\u0171\u017d\u0181\u0196\u019d\u01a2\u01bf"+
		"\u01c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}