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
		RULE_block = 33, RULE_assign_stmt = 34, RULE_ternary_stmt = 35, RULE_compound_assign_stmt = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "primitiv_type", "type", "expr", "id", "ids", 
			"subscript", "func_call", "actual_parameter_list", "constant", "variable_decl", 
			"const_variable_decl", "list_decl", "list_initialize", "struct_decl", 
			"struct_member", "enum_decl", "enum_member", "function_decl", "return_type", 
			"formal_parameter", "stmt", "jump_stmt", "return_stmt", "switch_stmt", 
			"switch_case", "switch_case_default", "if_else_stmt", "else_if_stmt", 
			"else_stmt", "while_stmt", "foreach_stmt", "block", "assign_stmt", "ternary_stmt", 
			"compound_assign_stmt"
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
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				{
				setState(74);
				declaration();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				function_decl();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				struct_decl();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				enum_decl();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
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
			setState(88);
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				primitiv_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(LIST);
				setState(92);
				match(T__3);
				setState(93);
				primitiv_type();
				setState(94);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(LIST);
				setState(97);
				match(T__3);
				setState(98);
				match(IDENTIFIER);
				setState(99);
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new IdentifierCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103);
				id(0);
				}
				break;
			case 2:
				{
				_localctx = new ConstantLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				constant();
				}
				break;
			case 3:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				func_call();
				}
				break;
			case 4:
				{
				_localctx = new NaNExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				((NaNExprContext)_localctx).NaN = match(NAN);
				}
				break;
			case 5:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(T__5);
				setState(108);
				expr(0);
				setState(109);
				match(T__6);
				}
				break;
			case 6:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(T__5);
				setState(112);
				((UnaryExprContext)_localctx).op = match(T__7);
				setState(113);
				expr(0);
				setState(114);
				match(T__6);
				}
				break;
			case 7:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				((UnaryExprContext)_localctx).op = match(T__17);
				setState(117);
				expr(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(121);
						((InfixExprContext)_localctx).op = match(T__8);
						setState(122);
						((InfixExprContext)_localctx).right = expr(7);
						}
						break;
					case 2:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(124);
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
						setState(125);
						((InfixExprContext)_localctx).right = expr(6);
						}
						break;
					case 3:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(127);
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
						setState(128);
						((InfixExprContext)_localctx).right = expr(5);
						}
						break;
					case 4:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(130);
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
						setState(131);
						((InfixExprContext)_localctx).right = expr(4);
						}
						break;
					case 5:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(133);
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
						setState(134);
						((InfixExprContext)_localctx).right = expr(2);
						}
						break;
					}
					} 
				}
				setState(139);
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
			setState(141);
			ids();
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
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
					setState(143);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(144);
					match(T__20);
					setState(145);
					ids();
					}
					} 
				}
				setState(150);
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				func_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
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
			setState(156);
			match(IDENTIFIER);
			setState(157);
			match(T__21);
			setState(158);
			expr(0);
			setState(159);
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
			setState(161);
			match(IDENTIFIER);
			setState(162);
			match(T__5);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__17) | (1L << NUMBER) | (1L << TEXT) | (1L << BOOlEAN) | (1L << NAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(163);
				actual_parameter_list();
				}
			}

			setState(166);
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
			setState(168);
			expr(0);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(169);
				match(T__23);
				setState(170);
				expr(0);
				}
				}
				setState(175);
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
			setState(176);
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
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				{
				setState(178);
				primitiv_type();
				}
				break;
			case IDENTIFIER:
				{
				setState(179);
				((Variable_declContext)_localctx).userDefinedType = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182);
			((Variable_declContext)_localctx).vName = match(IDENTIFIER);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(183);
				match(T__24);
				setState(184);
				expr(0);
				}
			}

			setState(187);
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
			setState(189);
			match(T__25);
			setState(190);
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
			setState(192);
			match(LIST);
			setState(193);
			match(T__3);
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				{
				setState(194);
				primitiv_type();
				}
				break;
			case IDENTIFIER:
				{
				setState(195);
				((List_declContext)_localctx).innerType = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(198);
			match(T__4);
			setState(199);
			((List_declContext)_localctx).vName = match(IDENTIFIER);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(200);
				match(T__24);
				setState(203);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__26:
					{
					setState(201);
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
					setState(202);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(207);
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
			setState(209);
			match(T__26);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__17) | (1L << NUMBER) | (1L << TEXT) | (1L << BOOlEAN) | (1L << NAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(210);
				expr(0);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(211);
					match(T__23);
					setState(212);
					expr(0);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(220);
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
			setState(222);
			match(T__28);
			setState(223);
			match(IDENTIFIER);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(224);
				match(NEWLINE);
				}
			}

			setState(227);
			match(T__26);
			setState(228);
			match(NEWLINE);
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(229);
				struct_member();
				}
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << LIST))) != 0) );
			setState(234);
			match(T__27);
			setState(235);
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
			setState(237);
			type();
			setState(238);
			match(IDENTIFIER);
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
			setState(241);
			match(T__29);
			setState(242);
			match(IDENTIFIER);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(243);
				match(NEWLINE);
				}
			}

			setState(246);
			match(T__26);
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
			enum_member();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(251);
				match(T__23);
				setState(252);
				enum_member();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(T__27);
			setState(259);
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
			setState(261);
			match(IDENTIFIER);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(262);
				match(T__24);
				setState(263);
				match(NUMBER);
				}
			}

			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(266);
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
			setState(269);
			match(T__30);
			setState(270);
			((Function_declContext)_localctx).returnType = return_type();
			setState(271);
			((Function_declContext)_localctx).name = match(IDENTIFIER);
			setState(272);
			match(T__5);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << LIST))) != 0)) {
				{
				setState(273);
				formal_parameter();
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(274);
					match(T__23);
					setState(275);
					formal_parameter();
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(283);
			match(T__6);
			setState(284);
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
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case LIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(VOID);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
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
			setState(291);
			type();
			setState(292);
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
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				if_else_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				switch_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				while_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				foreach_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				variable_decl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(299);
				list_decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(300);
				const_variable_decl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(301);
				jump_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(302);
				expr(0);
				setState(303);
				match(NEWLINE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(305);
				assign_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(306);
				compound_assign_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(307);
				ternary_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(308);
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
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				{
				setState(311);
				return_stmt();
				}
				break;
			case T__31:
			case T__32:
				{
				setState(312);
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
			setState(315);
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
			setState(317);
			match(T__33);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__17) | (1L << NUMBER) | (1L << TEXT) | (1L << BOOlEAN) | (1L << NAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(318);
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
			setState(321);
			match(T__34);
			setState(322);
			expr(0);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(323);
				match(NEWLINE);
				}
			}

			setState(326);
			match(T__26);
			setState(327);
			match(NEWLINE);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(328);
				switch_case();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(334);
				switch_case_default();
				}
			}

			setState(337);
			match(T__27);
			setState(338);
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
			setState(344); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(340);
				match(T__35);
				setState(341);
				expr(0);
				setState(342);
				match(T__36);
				}
				}
				setState(346); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__35 );
			setState(348);
			match(NEWLINE);
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(349);
					stmt();
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(355);
			match(T__31);
			setState(356);
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
			setState(358);
			match(T__37);
			setState(359);
			match(NEWLINE);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360);
					stmt();
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(366);
			match(T__31);
			setState(367);
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
			setState(369);
			match(T__38);
			setState(370);
			expr(0);
			setState(371);
			block();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(372);
				else_if_stmt();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(378);
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
			setState(381);
			match(T__39);
			setState(382);
			expr(0);
			setState(383);
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
			setState(385);
			match(T__40);
			setState(386);
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
			setState(388);
			match(T__41);
			setState(389);
			expr(0);
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
			setState(392);
			match(T__42);
			setState(393);
			type();
			setState(394);
			((Foreach_stmtContext)_localctx).element = match(IDENTIFIER);
			setState(395);
			match(T__43);
			setState(396);
			id(0);
			setState(397);
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
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(399);
				match(NEWLINE);
				}
			}

			setState(402);
			match(T__26);
			setState(403);
			match(NEWLINE);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__17) | (1L << T__25) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__38) | (1L << T__41) | (1L << T__42) | (1L << LIST) | (1L << NEWLINE) | (1L << NUMBER) | (1L << TEXT) | (1L << BOOlEAN) | (1L << NAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(404);
				stmt();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			match(T__27);
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(411);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
			setState(414);
			id(0);
			setState(415);
			match(T__24);
			setState(416);
			expr(0);
			setState(417);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
			setState(419);
			id(0);
			setState(420);
			match(T__24);
			setState(421);
			((Ternary_stmtContext)_localctx).ifExpr = expr(0);
			setState(422);
			match(T__38);
			setState(423);
			((Ternary_stmtContext)_localctx).cond = expr(0);
			setState(424);
			match(T__40);
			setState(425);
			((Ternary_stmtContext)_localctx).elseExpr = expr(0);
			setState(426);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
			setState(428);
			id(0);
			setState(429);
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
			setState(430);
			expr(0);
			setState(431);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 5:
			return id_sempred((IdContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u01b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\5\3Y\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5g\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6y\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6\u008a\n\6\f\6\16\6\u008d\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7\u0095\n\7\f\7\16\7\u0098\13\7\3\b\3\b\3\b\5\b\u009d\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\5\n\u00a7\n\n\3\n\3\n\3\13\3\13\3\13\7\13\u00ae\n"+
		"\13\f\13\16\13\u00b1\13\13\3\f\3\f\3\r\3\r\5\r\u00b7\n\r\3\r\3\r\3\r\5"+
		"\r\u00bc\n\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00c7\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00ce\n\17\5\17\u00d0\n\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\7\20\u00d8\n\20\f\20\16\20\u00db\13\20\5\20\u00dd\n"+
		"\20\3\20\3\20\3\21\3\21\3\21\5\21\u00e4\n\21\3\21\3\21\3\21\6\21\u00e9"+
		"\n\21\r\21\16\21\u00ea\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\5\23\u00f7\n\23\3\23\3\23\5\23\u00fb\n\23\3\23\3\23\3\23\7\23\u0100"+
		"\n\23\f\23\16\23\u0103\13\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u010b"+
		"\n\24\3\24\5\24\u010e\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0117"+
		"\n\25\f\25\16\25\u011a\13\25\5\25\u011c\n\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\5\26\u0124\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0138\n\30\3\31\3\31\5\31"+
		"\u013c\n\31\3\31\3\31\3\32\3\32\5\32\u0142\n\32\3\33\3\33\3\33\5\33\u0147"+
		"\n\33\3\33\3\33\3\33\7\33\u014c\n\33\f\33\16\33\u014f\13\33\3\33\5\33"+
		"\u0152\n\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\6\34\u015b\n\34\r\34\16"+
		"\34\u015c\3\34\3\34\7\34\u0161\n\34\f\34\16\34\u0164\13\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\7\35\u016c\n\35\f\35\16\35\u016f\13\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\7\36\u0178\n\36\f\36\16\36\u017b\13\36\3\36\5"+
		"\36\u017e\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\5#\u0193\n#\3#\3#\3#\7#\u0198\n#\f#\16#\u019b\13#\3"+
		"#\3#\5#\u019f\n#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\2\4\n\f\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJ\2\n\3\2\3\5\3\2\f\16\4\2\n\n\17\17\4\2\6\7\20\23\3\2"+
		"\25\26\3\2:<\3\2\"#\3\2/\62\2\u01cf\2O\3\2\2\2\4X\3\2\2\2\6Z\3\2\2\2\b"+
		"f\3\2\2\2\nx\3\2\2\2\f\u008e\3\2\2\2\16\u009c\3\2\2\2\20\u009e\3\2\2\2"+
		"\22\u00a3\3\2\2\2\24\u00aa\3\2\2\2\26\u00b2\3\2\2\2\30\u00b6\3\2\2\2\32"+
		"\u00bf\3\2\2\2\34\u00c2\3\2\2\2\36\u00d3\3\2\2\2 \u00e0\3\2\2\2\"\u00ef"+
		"\3\2\2\2$\u00f3\3\2\2\2&\u0107\3\2\2\2(\u010f\3\2\2\2*\u0123\3\2\2\2,"+
		"\u0125\3\2\2\2.\u0137\3\2\2\2\60\u013b\3\2\2\2\62\u013f\3\2\2\2\64\u0143"+
		"\3\2\2\2\66\u015a\3\2\2\28\u0168\3\2\2\2:\u0173\3\2\2\2<\u017f\3\2\2\2"+
		">\u0183\3\2\2\2@\u0186\3\2\2\2B\u018a\3\2\2\2D\u0192\3\2\2\2F\u01a0\3"+
		"\2\2\2H\u01a5\3\2\2\2J\u01ae\3\2\2\2LN\5\4\3\2ML\3\2\2\2NQ\3\2\2\2OM\3"+
		"\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\2\2\3S\3\3\2\2\2TY\5(\25\2UY"+
		"\5 \21\2VY\5$\23\2WY\5\32\16\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2"+
		"Y\5\3\2\2\2Z[\t\2\2\2[\7\3\2\2\2\\g\5\6\4\2]^\7\63\2\2^_\7\6\2\2_`\5\6"+
		"\4\2`a\7\7\2\2ag\3\2\2\2bc\7\63\2\2cd\7\6\2\2de\7>\2\2eg\7\7\2\2f\\\3"+
		"\2\2\2f]\3\2\2\2fb\3\2\2\2g\t\3\2\2\2hi\b\6\1\2iy\5\f\7\2jy\5\26\f\2k"+
		"y\5\22\n\2ly\7=\2\2mn\7\b\2\2no\5\n\6\2op\7\t\2\2py\3\2\2\2qr\7\b\2\2"+
		"rs\7\n\2\2st\5\n\6\2tu\7\t\2\2uy\3\2\2\2vw\7\24\2\2wy\5\n\6\4xh\3\2\2"+
		"\2xj\3\2\2\2xk\3\2\2\2xl\3\2\2\2xm\3\2\2\2xq\3\2\2\2xv\3\2\2\2y\u008b"+
		"\3\2\2\2z{\f\b\2\2{|\7\13\2\2|\u008a\5\n\6\t}~\f\7\2\2~\177\t\3\2\2\177"+
		"\u008a\5\n\6\b\u0080\u0081\f\6\2\2\u0081\u0082\t\4\2\2\u0082\u008a\5\n"+
		"\6\7\u0083\u0084\f\5\2\2\u0084\u0085\t\5\2\2\u0085\u008a\5\n\6\6\u0086"+
		"\u0087\f\3\2\2\u0087\u0088\t\6\2\2\u0088\u008a\5\n\6\4\u0089z\3\2\2\2"+
		"\u0089}\3\2\2\2\u0089\u0080\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0086\3"+
		"\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\13\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\b\7\1\2\u008f\u0090\5\16\b"+
		"\2\u0090\u0096\3\2\2\2\u0091\u0092\f\4\2\2\u0092\u0093\7\27\2\2\u0093"+
		"\u0095\5\16\b\2\u0094\u0091\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\r\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009d"+
		"\7>\2\2\u009a\u009d\5\22\n\2\u009b\u009d\5\20\t\2\u009c\u0099\3\2\2\2"+
		"\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\17\3\2\2\2\u009e\u009f"+
		"\7>\2\2\u009f\u00a0\7\30\2\2\u00a0\u00a1\5\n\6\2\u00a1\u00a2\7\31\2\2"+
		"\u00a2\21\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4\u00a6\7\b\2\2\u00a5\u00a7\5"+
		"\24\13\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\7\t\2\2\u00a9\23\3\2\2\2\u00aa\u00af\5\n\6\2\u00ab\u00ac\7\32\2"+
		"\2\u00ac\u00ae\5\n\6\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\25\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b3\t\7\2\2\u00b3\27\3\2\2\2\u00b4\u00b7\5\6\4\2\u00b5\u00b7\7>\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb"+
		"\7>\2\2\u00b9\u00ba\7\33\2\2\u00ba\u00bc\5\n\6\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\66\2\2\u00be\31\3\2\2"+
		"\2\u00bf\u00c0\7\34\2\2\u00c0\u00c1\5\30\r\2\u00c1\33\3\2\2\2\u00c2\u00c3"+
		"\7\63\2\2\u00c3\u00c6\7\6\2\2\u00c4\u00c7\5\6\4\2\u00c5\u00c7\7>\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\7"+
		"\2\2\u00c9\u00cf\7>\2\2\u00ca\u00cd\7\33\2\2\u00cb\u00ce\5\36\20\2\u00cc"+
		"\u00ce\5\n\6\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\7\66\2\2\u00d2\35\3\2\2\2\u00d3\u00dc\7\35\2\2\u00d4\u00d9\5\n"+
		"\6\2\u00d5\u00d6\7\32\2\2\u00d6\u00d8\5\n\6\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\7\36\2\2\u00df\37\3\2\2\2\u00e0\u00e1\7\37"+
		"\2\2\u00e1\u00e3\7>\2\2\u00e2\u00e4\7\66\2\2\u00e3\u00e2\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\35\2\2\u00e6\u00e8\7"+
		"\66\2\2\u00e7\u00e9\5\"\22\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7\36"+
		"\2\2\u00ed\u00ee\7\66\2\2\u00ee!\3\2\2\2\u00ef\u00f0\5\b\5\2\u00f0\u00f1"+
		"\7>\2\2\u00f1\u00f2\7\66\2\2\u00f2#\3\2\2\2\u00f3\u00f4\7 \2\2\u00f4\u00f6"+
		"\7>\2\2\u00f5\u00f7\7\66\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fa\7\35\2\2\u00f9\u00fb\7\66\2\2\u00fa\u00f9\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0101\5&\24\2\u00fd"+
		"\u00fe\7\32\2\2\u00fe\u0100\5&\24\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3"+
		"\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0105\7\36\2\2\u0105\u0106\7\66\2\2\u0106%\3\2\2"+
		"\2\u0107\u010a\7>\2\2\u0108\u0109\7\33\2\2\u0109\u010b\7:\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010e\7\66\2\2"+
		"\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\'\3\2\2\2\u010f\u0110\7"+
		"!\2\2\u0110\u0111\5*\26\2\u0111\u0112\7>\2\2\u0112\u011b\7\b\2\2\u0113"+
		"\u0118\5,\27\2\u0114\u0115\7\32\2\2\u0115\u0117\5,\27\2\u0116\u0114\3"+
		"\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0113\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\t\2\2\u011e\u011f\5D#\2\u011f)"+
		"\3\2\2\2\u0120\u0124\5\b\5\2\u0121\u0124\7\64\2\2\u0122\u0124\7>\2\2\u0123"+
		"\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124+\3\2\2\2"+
		"\u0125\u0126\5\b\5\2\u0126\u0127\7>\2\2\u0127-\3\2\2\2\u0128\u0138\5:"+
		"\36\2\u0129\u0138\5\64\33\2\u012a\u0138\5@!\2\u012b\u0138\5B\"\2\u012c"+
		"\u0138\5\30\r\2\u012d\u0138\5\34\17\2\u012e\u0138\5\32\16\2\u012f\u0138"+
		"\5\60\31\2\u0130\u0131\5\n\6\2\u0131\u0132\7\66\2\2\u0132\u0138\3\2\2"+
		"\2\u0133\u0138\5F$\2\u0134\u0138\5J&\2\u0135\u0138\5H%\2\u0136\u0138\5"+
		"D#\2\u0137\u0128\3\2\2\2\u0137\u0129\3\2\2\2\u0137\u012a\3\2\2\2\u0137"+
		"\u012b\3\2\2\2\u0137\u012c\3\2\2\2\u0137\u012d\3\2\2\2\u0137\u012e\3\2"+
		"\2\2\u0137\u012f\3\2\2\2\u0137\u0130\3\2\2\2\u0137\u0133\3\2\2\2\u0137"+
		"\u0134\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138/\3\2\2\2"+
		"\u0139\u013c\5\62\32\2\u013a\u013c\t\b\2\2\u013b\u0139\3\2\2\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7\66\2\2\u013e\61\3\2\2\2\u013f"+
		"\u0141\7$\2\2\u0140\u0142\5\n\6\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\63\3\2\2\2\u0143\u0144\7%\2\2\u0144\u0146\5\n\6\2\u0145\u0147"+
		"\7\66\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2"+
		"\u0148\u0149\7\35\2\2\u0149\u014d\7\66\2\2\u014a\u014c\5\66\34\2\u014b"+
		"\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0152\58\35\2\u0151"+
		"\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7\36"+
		"\2\2\u0154\u0155\7\66\2\2\u0155\65\3\2\2\2\u0156\u0157\7&\2\2\u0157\u0158"+
		"\5\n\6\2\u0158\u0159\7\'\2\2\u0159\u015b\3\2\2\2\u015a\u0156\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u0162\7\66\2\2\u015f\u0161\5.\30\2\u0160\u015f\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7\"\2\2\u0166\u0167\7\66\2\2\u0167"+
		"\67\3\2\2\2\u0168\u0169\7(\2\2\u0169\u016d\7\66\2\2\u016a\u016c\5.\30"+
		"\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\"\2\2\u0171"+
		"\u0172\7\66\2\2\u01729\3\2\2\2\u0173\u0174\7)\2\2\u0174\u0175\5\n\6\2"+
		"\u0175\u0179\5D#\2\u0176\u0178\5<\37\2\u0177\u0176\3\2\2\2\u0178\u017b"+
		"\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017d\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017c\u017e\5> \2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2"+
		"\2\u017e;\3\2\2\2\u017f\u0180\7*\2\2\u0180\u0181\5\n\6\2\u0181\u0182\5"+
		"D#\2\u0182=\3\2\2\2\u0183\u0184\7+\2\2\u0184\u0185\5D#\2\u0185?\3\2\2"+
		"\2\u0186\u0187\7,\2\2\u0187\u0188\5\n\6\2\u0188\u0189\5D#\2\u0189A\3\2"+
		"\2\2\u018a\u018b\7-\2\2\u018b\u018c\5\b\5\2\u018c\u018d\7>\2\2\u018d\u018e"+
		"\7.\2\2\u018e\u018f\5\f\7\2\u018f\u0190\5D#\2\u0190C\3\2\2\2\u0191\u0193"+
		"\7\66\2\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2"+
		"\u0194\u0195\7\35\2\2\u0195\u0199\7\66\2\2\u0196\u0198\5.\30\2\u0197\u0196"+
		"\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019e\7\36\2\2\u019d\u019f\7"+
		"\66\2\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019fE\3\2\2\2\u01a0\u01a1"+
		"\5\f\7\2\u01a1\u01a2\7\33\2\2\u01a2\u01a3\5\n\6\2\u01a3\u01a4\7\66\2\2"+
		"\u01a4G\3\2\2\2\u01a5\u01a6\5\f\7\2\u01a6\u01a7\7\33\2\2\u01a7\u01a8\5"+
		"\n\6\2\u01a8\u01a9\7)\2\2\u01a9\u01aa\5\n\6\2\u01aa\u01ab\7+\2\2\u01ab"+
		"\u01ac\5\n\6\2\u01ac\u01ad\7\66\2\2\u01adI\3\2\2\2\u01ae\u01af\5\f\7\2"+
		"\u01af\u01b0\t\t\2\2\u01b0\u01b1\5\n\6\2\u01b1\u01b2\7\66\2\2\u01b2K\3"+
		"\2\2\2+OXfx\u0089\u008b\u0096\u009c\u00a6\u00af\u00b6\u00bb\u00c6\u00cd"+
		"\u00cf\u00d9\u00dc\u00e3\u00ea\u00f6\u00fa\u0101\u010a\u010d\u0118\u011b"+
		"\u0123\u0137\u013b\u0141\u0146\u014d\u0151\u015c\u0162\u016d\u0179\u017d"+
		"\u0192\u0199\u019e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}