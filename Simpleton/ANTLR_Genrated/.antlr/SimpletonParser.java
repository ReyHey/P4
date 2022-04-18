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
		T__45=46, T__46=47, T__47=48, LIST=49, VOID=50, WS=51, NEWLINE=52, NUMBER=53, 
		TEXT=54, BOOlEAN=55, NAN=56, IDENTIFIER=57;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_primitiv_type = 2, RULE_type = 3, 
		RULE_expr = 4, RULE_member = 5, RULE_subscript = 6, RULE_constant = 7, 
		RULE_variable_decl = 8, RULE_const_variable_decl = 9, RULE_list_decl = 10, 
		RULE_list_initialize = 11, RULE_struct_decl = 12, RULE_struct_member = 13, 
		RULE_enum_decl = 14, RULE_enum_member = 15, RULE_function_decl = 16, RULE_return_type = 17, 
		RULE_formal_parameter = 18, RULE_stmt = 19, RULE_jump_stmt = 20, RULE_return_stmt = 21, 
		RULE_switch_stmt = 22, RULE_switch_case = 23, RULE_switch_case_default = 24, 
		RULE_if_else_stmt = 25, RULE_else_if_stmt = 26, RULE_else_stmt = 27, RULE_while_stmt = 28, 
		RULE_foreach_stmt = 29, RULE_block = 30, RULE_assign_stmt = 31, RULE_ternary_stmt = 32, 
		RULE_compound_assign_stmt = 33, RULE_func_call = 34, RULE_actual_parameter_list = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "primitiv_type", "type", "expr", "member", 
			"subscript", "constant", "variable_decl", "const_variable_decl", "list_decl", 
			"list_initialize", "struct_decl", "struct_member", "enum_decl", "enum_member", 
			"function_decl", "return_type", "formal_parameter", "stmt", "jump_stmt", 
			"return_stmt", "switch_stmt", "switch_case", "switch_case_default", "if_else_stmt", 
			"else_if_stmt", "else_stmt", "while_stmt", "foreach_stmt", "block", "assign_stmt", 
			"ternary_stmt", "compound_assign_stmt", "func_call", "actual_parameter_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'number'", "'text'", "'boolean'", "'<'", "'>'", "'['", "']'", 
			"'('", "')'", "'-'", "'^'", "'/'", "'mod'", "'*'", "'+'", "'=='", "'!='", 
			"'>='", "'<='", "'!'", "'and'", "'or'", "'.'", "'='", "'constant'", "'{'", 
			"','", "'}'", "'struct'", "'enum'", "'function'", "'break'", "'continue'", 
			"'return'", "'switch'", "'case'", "':'", "'default:'", "'if'", "'else if'", 
			"'else'", "'while'", "'foreach'", "'in'", "'+='", "'-='", "'*='", "'/='", 
			"'list'", "'void'", null, null, null, null, null, "'NaN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "LIST", "VOID", "WS", "NEWLINE", "NUMBER", "TEXT", "BOOlEAN", "NAN", 
			"IDENTIFIER"
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				{
				setState(72);
				declaration();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				function_decl();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				struct_decl();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				enum_decl();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
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
			setState(86);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				primitiv_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(LIST);
				setState(90);
				match(T__3);
				setState(91);
				primitiv_type();
				setState(92);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(LIST);
				setState(95);
				match(T__3);
				setState(96);
				match(IDENTIFIER);
				setState(97);
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
	public static class FuncCallContext extends ExprContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public FuncCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IdentifierContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpletonParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(101);
				match(IDENTIFIER);
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(102);
					match(T__5);
					setState(103);
					expr(0);
					setState(104);
					match(T__6);
					}
					break;
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(108);
						member();
						}
						} 
					}
					setState(113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case 2:
				{
				_localctx = new ConstantLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				constant();
				}
				break;
			case 3:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				func_call();
				}
				break;
			case 4:
				{
				_localctx = new NaNExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				((NaNExprContext)_localctx).NaN = match(NAN);
				}
				break;
			case 5:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(T__7);
				setState(118);
				expr(0);
				setState(119);
				match(T__8);
				}
				break;
			case 6:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				((UnaryExprContext)_localctx).op = match(T__9);
				setState(122);
				expr(7);
				}
				break;
			case 7:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				((UnaryExprContext)_localctx).op = match(T__19);
				setState(124);
				expr(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(127);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(128);
						((InfixExprContext)_localctx).op = match(T__10);
						setState(129);
						((InfixExprContext)_localctx).right = expr(7);
						}
						break;
					case 2:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(131);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						((InfixExprContext)_localctx).right = expr(6);
						}
						break;
					case 3:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(134);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__14) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(135);
						((InfixExprContext)_localctx).right = expr(5);
						}
						break;
					case 4:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(137);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(138);
						((InfixExprContext)_localctx).right = expr(4);
						}
						break;
					case 5:
						{
						_localctx = new InfixExprContext(new ExprContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(140);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(141);
						((InfixExprContext)_localctx).right = expr(2);
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class MemberContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpletonParser.IDENTIFIER, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public SubscriptContext subscript() {
			return getRuleContext(SubscriptContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(147);
			match(T__22);
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(148);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(149);
				func_call();
				}
				break;
			case 3:
				{
				setState(150);
				subscript();
				}
				break;
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
		enterRule(_localctx, 12, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IDENTIFIER);
			setState(154);
			match(T__5);
			setState(155);
			expr(0);
			setState(156);
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
		enterRule(_localctx, 14, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		enterRule(_localctx, 16, RULE_variable_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				{
				setState(160);
				primitiv_type();
				}
				break;
			case IDENTIFIER:
				{
				setState(161);
				((Variable_declContext)_localctx).userDefinedType = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(164);
			((Variable_declContext)_localctx).vName = match(IDENTIFIER);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(165);
				match(T__23);
				setState(166);
				expr(0);
				}
			}

			setState(169);
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
		enterRule(_localctx, 18, RULE_const_variable_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__24);
			setState(172);
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
		enterRule(_localctx, 20, RULE_list_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(LIST);
			setState(175);
			match(T__3);
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				{
				setState(176);
				primitiv_type();
				}
				break;
			case IDENTIFIER:
				{
				setState(177);
				((List_declContext)_localctx).innerType = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(180);
			match(T__4);
			setState(181);
			((List_declContext)_localctx).vName = match(IDENTIFIER);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(182);
				match(T__23);
				setState(185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__25:
					{
					setState(183);
					list_initialize();
					}
					break;
				case T__7:
				case T__9:
				case T__19:
				case NUMBER:
				case TEXT:
				case BOOlEAN:
				case NAN:
				case IDENTIFIER:
					{
					setState(184);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(189);
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
		enterRule(_localctx, 22, RULE_list_initialize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__25);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__9) | (1L << T__19) | (1L << NUMBER) | (1L << TEXT) | (1L << BOOlEAN) | (1L << NAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(192);
				expr(0);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__26) {
					{
					{
					setState(193);
					match(T__26);
					setState(194);
					expr(0);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(202);
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
		enterRule(_localctx, 24, RULE_struct_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__28);
			setState(205);
			match(IDENTIFIER);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(206);
				match(NEWLINE);
				}
			}

			setState(209);
			match(T__25);
			setState(210);
			match(NEWLINE);
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				struct_member();
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << LIST))) != 0) );
			setState(216);
			match(T__27);
			setState(217);
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
		enterRule(_localctx, 26, RULE_struct_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			type();
			setState(220);
			match(IDENTIFIER);
			setState(221);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpletonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpletonParser.NEWLINE, i);
		}
		public List<Enum_memberContext> enum_member() {
			return getRuleContexts(Enum_memberContext.class);
		}
		public Enum_memberContext enum_member(int i) {
			return getRuleContext(Enum_memberContext.class,i);
		}
		public Enum_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_decl; }
	}

	public final Enum_declContext enum_decl() throws RecognitionException {
		Enum_declContext _localctx = new Enum_declContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enum_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__29);
			setState(224);
			match(IDENTIFIER);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(225);
				match(NEWLINE);
				}
			}

			setState(228);
			match(T__25);
			setState(229);
			match(NEWLINE);
			setState(231); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230);
				enum_member();
				}
				}
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(235);
			match(T__27);
			setState(236);
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
		public TerminalNode NEWLINE() { return getToken(SimpletonParser.NEWLINE, 0); }
		public TerminalNode NUMBER() { return getToken(SimpletonParser.NUMBER, 0); }
		public Enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_member; }
	}

	public final Enum_memberContext enum_member() throws RecognitionException {
		Enum_memberContext _localctx = new Enum_memberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enum_member);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(IDENTIFIER);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(239);
				match(T__23);
				setState(240);
				match(NUMBER);
				}
			}

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
		enterRule(_localctx, 32, RULE_function_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__30);
			setState(246);
			((Function_declContext)_localctx).returnType = return_type();
			setState(247);
			((Function_declContext)_localctx).name = match(IDENTIFIER);
			setState(248);
			match(T__7);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << LIST))) != 0)) {
				{
				setState(249);
				formal_parameter();
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__26) {
					{
					{
					setState(250);
					match(T__26);
					setState(251);
					formal_parameter();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(259);
			match(T__8);
			setState(260);
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
		enterRule(_localctx, 34, RULE_return_type);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case LIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(VOID);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
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
		enterRule(_localctx, 36, RULE_formal_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			type();
			setState(268);
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
		enterRule(_localctx, 38, RULE_stmt);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				if_else_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				switch_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				while_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				foreach_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				variable_decl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				list_decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				const_variable_decl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(277);
				jump_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(278);
				expr(0);
				setState(279);
				match(NEWLINE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(281);
				assign_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(282);
				compound_assign_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(283);
				ternary_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(284);
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
		enterRule(_localctx, 40, RULE_jump_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				{
				setState(287);
				return_stmt();
				}
				break;
			case T__31:
			case T__32:
				{
				setState(288);
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
			setState(291);
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
		enterRule(_localctx, 42, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__33);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__9) | (1L << T__19) | (1L << NUMBER) | (1L << TEXT) | (1L << BOOlEAN) | (1L << NAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(294);
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
		enterRule(_localctx, 44, RULE_switch_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__34);
			setState(298);
			expr(0);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(299);
				match(NEWLINE);
				}
			}

			setState(302);
			match(T__25);
			setState(303);
			match(NEWLINE);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(304);
				switch_case();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(310);
				switch_case_default();
				}
			}

			setState(313);
			match(T__27);
			setState(314);
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
		enterRule(_localctx, 46, RULE_switch_case);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(316);
				match(T__35);
				setState(317);
				expr(0);
				setState(318);
				match(T__36);
				}
				}
				setState(322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__35 );
			setState(324);
			match(NEWLINE);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(325);
					stmt();
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(331);
			match(T__31);
			setState(332);
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
		enterRule(_localctx, 48, RULE_switch_case_default);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__37);
			setState(335);
			match(NEWLINE);
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(336);
					stmt();
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(342);
			match(T__31);
			setState(343);
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
		enterRule(_localctx, 50, RULE_if_else_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__38);
			setState(346);
			expr(0);
			setState(347);
			block();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(348);
				else_if_stmt();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(354);
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
		enterRule(_localctx, 52, RULE_else_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__39);
			setState(358);
			expr(0);
			setState(359);
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
		enterRule(_localctx, 54, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__40);
			setState(362);
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
		enterRule(_localctx, 56, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__41);
			setState(365);
			expr(0);
			setState(366);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(SimpletonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SimpletonParser.IDENTIFIER, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Foreach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_stmt; }
	}

	public final Foreach_stmtContext foreach_stmt() throws RecognitionException {
		Foreach_stmtContext _localctx = new Foreach_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_foreach_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__42);
			setState(369);
			type();
			setState(370);
			((Foreach_stmtContext)_localctx).element = match(IDENTIFIER);
			setState(371);
			match(T__43);
			setState(372);
			match(IDENTIFIER);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(373);
				match(T__22);
				setState(374);
				match(IDENTIFIER);
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
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
		enterRule(_localctx, 60, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(382);
				match(NEWLINE);
				}
			}

			setState(385);
			match(T__25);
			setState(386);
			match(NEWLINE);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__7) | (1L << T__9) | (1L << T__19) | (1L << T__24) | (1L << T__25) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__38) | (1L << T__41) | (1L << T__42) | (1L << LIST) | (1L << NEWLINE) | (1L << NUMBER) | (1L << TEXT) | (1L << BOOlEAN) | (1L << NAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(387);
				stmt();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
			match(T__27);
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(394);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(SimpletonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SimpletonParser.IDENTIFIER, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SimpletonParser.NEWLINE, 0); }
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_assign_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(IDENTIFIER);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(398);
				match(T__22);
				setState(401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(399);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(400);
					subscript();
					}
					break;
				}
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			match(T__23);
			setState(409);
			expr(0);
			setState(410);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(SimpletonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SimpletonParser.IDENTIFIER, i);
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
		enterRule(_localctx, 64, RULE_ternary_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(IDENTIFIER);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(413);
				match(T__22);
				setState(414);
				match(IDENTIFIER);
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
			match(T__23);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(SimpletonParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SimpletonParser.IDENTIFIER, i);
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
		enterRule(_localctx, 66, RULE_compound_assign_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(IDENTIFIER);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(429);
				match(T__22);
				setState(430);
				match(IDENTIFIER);
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(436);
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
			setState(437);
			expr(0);
			setState(438);
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
		enterRule(_localctx, 68, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(IDENTIFIER);
			setState(441);
			match(T__7);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__9) | (1L << T__19) | (1L << NUMBER) | (1L << TEXT) | (1L << BOOlEAN) | (1L << NAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(442);
				actual_parameter_list();
				}
			}

			setState(445);
			match(T__8);
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
		enterRule(_localctx, 70, RULE_actual_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			expr(0);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(448);
				match(T__26);
				setState(449);
				expr(0);
				}
				}
				setState(454);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u01ca\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\5\3W\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\6\7\6p\n\6\f\6\16\6s\13\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0080\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0091\n\6\f\6\16"+
		"\6\u0094\13\6\3\7\3\7\3\7\3\7\5\7\u009a\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\5\n\u00a5\n\n\3\n\3\n\3\n\5\n\u00aa\n\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\5\f\u00b5\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bc\n\f\5"+
		"\f\u00be\n\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00c6\n\r\f\r\16\r\u00c9\13\r"+
		"\5\r\u00cb\n\r\3\r\3\r\3\16\3\16\3\16\5\16\u00d2\n\16\3\16\3\16\3\16\6"+
		"\16\u00d7\n\16\r\16\16\16\u00d8\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\5\20\u00e5\n\20\3\20\3\20\3\20\6\20\u00ea\n\20\r\20\16\20\u00eb"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00f4\n\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u00ff\n\22\f\22\16\22\u0102\13\22\5\22\u0104"+
		"\n\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u010c\n\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0120\n\25\3\26\3\26\5\26\u0124\n\26\3\26\3\26\3\27\3\27\5\27\u012a"+
		"\n\27\3\30\3\30\3\30\5\30\u012f\n\30\3\30\3\30\3\30\7\30\u0134\n\30\f"+
		"\30\16\30\u0137\13\30\3\30\5\30\u013a\n\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\6\31\u0143\n\31\r\31\16\31\u0144\3\31\3\31\7\31\u0149\n\31\f"+
		"\31\16\31\u014c\13\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u0154\n\32\f"+
		"\32\16\32\u0157\13\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u0160\n"+
		"\33\f\33\16\33\u0163\13\33\3\33\5\33\u0166\n\33\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7"+
		"\37\u017a\n\37\f\37\16\37\u017d\13\37\3\37\3\37\3 \5 \u0182\n \3 \3 \3"+
		" \7 \u0187\n \f \16 \u018a\13 \3 \3 \5 \u018e\n \3!\3!\3!\3!\5!\u0194"+
		"\n!\7!\u0196\n!\f!\16!\u0199\13!\3!\3!\3!\3!\3\"\3\"\3\"\7\"\u01a2\n\""+
		"\f\"\16\"\u01a5\13\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\7#\u01b2"+
		"\n#\f#\16#\u01b5\13#\3#\3#\3#\3#\3$\3$\3$\5$\u01be\n$\3$\3$\3%\3%\3%\7"+
		"%\u01c5\n%\f%\16%\u01c8\13%\3%\2\3\n&\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\n\3\2\3\5\3\2\16\20\4\2\f\f\21"+
		"\21\4\2\6\7\22\25\3\2\27\30\3\2\679\3\2\"#\3\2/\62\2\u01ea\2M\3\2\2\2"+
		"\4V\3\2\2\2\6X\3\2\2\2\bd\3\2\2\2\n\177\3\2\2\2\f\u0095\3\2\2\2\16\u009b"+
		"\3\2\2\2\20\u00a0\3\2\2\2\22\u00a4\3\2\2\2\24\u00ad\3\2\2\2\26\u00b0\3"+
		"\2\2\2\30\u00c1\3\2\2\2\32\u00ce\3\2\2\2\34\u00dd\3\2\2\2\36\u00e1\3\2"+
		"\2\2 \u00f0\3\2\2\2\"\u00f7\3\2\2\2$\u010b\3\2\2\2&\u010d\3\2\2\2(\u011f"+
		"\3\2\2\2*\u0123\3\2\2\2,\u0127\3\2\2\2.\u012b\3\2\2\2\60\u0142\3\2\2\2"+
		"\62\u0150\3\2\2\2\64\u015b\3\2\2\2\66\u0167\3\2\2\28\u016b\3\2\2\2:\u016e"+
		"\3\2\2\2<\u0172\3\2\2\2>\u0181\3\2\2\2@\u018f\3\2\2\2B\u019e\3\2\2\2D"+
		"\u01ae\3\2\2\2F\u01ba\3\2\2\2H\u01c1\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2"+
		"\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\2\2\3Q\3\3\2\2\2RW\5"+
		"\"\22\2SW\5\32\16\2TW\5\36\20\2UW\5\24\13\2VR\3\2\2\2VS\3\2\2\2VT\3\2"+
		"\2\2VU\3\2\2\2W\5\3\2\2\2XY\t\2\2\2Y\7\3\2\2\2Ze\5\6\4\2[\\\7\63\2\2\\"+
		"]\7\6\2\2]^\5\6\4\2^_\7\7\2\2_e\3\2\2\2`a\7\63\2\2ab\7\6\2\2bc\7;\2\2"+
		"ce\7\7\2\2dZ\3\2\2\2d[\3\2\2\2d`\3\2\2\2e\t\3\2\2\2fg\b\6\1\2gl\7;\2\2"+
		"hi\7\b\2\2ij\5\n\6\2jk\7\t\2\2km\3\2\2\2lh\3\2\2\2lm\3\2\2\2mq\3\2\2\2"+
		"np\5\f\7\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\u0080\3\2\2\2sq\3"+
		"\2\2\2t\u0080\5\20\t\2u\u0080\5F$\2v\u0080\7:\2\2wx\7\n\2\2xy\5\n\6\2"+
		"yz\7\13\2\2z\u0080\3\2\2\2{|\7\f\2\2|\u0080\5\n\6\t}~\7\26\2\2~\u0080"+
		"\5\n\6\4\177f\3\2\2\2\177t\3\2\2\2\177u\3\2\2\2\177v\3\2\2\2\177w\3\2"+
		"\2\2\177{\3\2\2\2\177}\3\2\2\2\u0080\u0092\3\2\2\2\u0081\u0082\f\b\2\2"+
		"\u0082\u0083\7\r\2\2\u0083\u0091\5\n\6\t\u0084\u0085\f\7\2\2\u0085\u0086"+
		"\t\3\2\2\u0086\u0091\5\n\6\b\u0087\u0088\f\6\2\2\u0088\u0089\t\4\2\2\u0089"+
		"\u0091\5\n\6\7\u008a\u008b\f\5\2\2\u008b\u008c\t\5\2\2\u008c\u0091\5\n"+
		"\6\6\u008d\u008e\f\3\2\2\u008e\u008f\t\6\2\2\u008f\u0091\5\n\6\4\u0090"+
		"\u0081\3\2\2\2\u0090\u0084\3\2\2\2\u0090\u0087\3\2\2\2\u0090\u008a\3\2"+
		"\2\2\u0090\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\13\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0099\7\31\2"+
		"\2\u0096\u009a\7;\2\2\u0097\u009a\5F$\2\u0098\u009a\5\16\b\2\u0099\u0096"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\r\3\2\2\2\u009b"+
		"\u009c\7;\2\2\u009c\u009d\7\b\2\2\u009d\u009e\5\n\6\2\u009e\u009f\7\t"+
		"\2\2\u009f\17\3\2\2\2\u00a0\u00a1\t\7\2\2\u00a1\21\3\2\2\2\u00a2\u00a5"+
		"\5\6\4\2\u00a3\u00a5\7;\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a9\7;\2\2\u00a7\u00a8\7\32\2\2\u00a8\u00aa\5\n"+
		"\6\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\7\66\2\2\u00ac\23\3\2\2\2\u00ad\u00ae\7\33\2\2\u00ae\u00af\5\22"+
		"\n\2\u00af\25\3\2\2\2\u00b0\u00b1\7\63\2\2\u00b1\u00b4\7\6\2\2\u00b2\u00b5"+
		"\5\6\4\2\u00b3\u00b5\7;\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00bd\7;\2\2\u00b8\u00bb\7\32"+
		"\2\2\u00b9\u00bc\5\30\r\2\u00ba\u00bc\5\n\6\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\66\2\2\u00c0\27\3\2\2\2\u00c1\u00ca"+
		"\7\34\2\2\u00c2\u00c7\5\n\6\2\u00c3\u00c4\7\35\2\2\u00c4\u00c6\5\n\6\2"+
		"\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\36\2\2\u00cd\31\3\2\2"+
		"\2\u00ce\u00cf\7\37\2\2\u00cf\u00d1\7;\2\2\u00d0\u00d2\7\66\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\34"+
		"\2\2\u00d4\u00d6\7\66\2\2\u00d5\u00d7\5\34\17\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00db\7\36\2\2\u00db\u00dc\7\66\2\2\u00dc\33\3\2\2\2\u00dd"+
		"\u00de\5\b\5\2\u00de\u00df\7;\2\2\u00df\u00e0\7\66\2\2\u00e0\35\3\2\2"+
		"\2\u00e1\u00e2\7 \2\2\u00e2\u00e4\7;\2\2\u00e3\u00e5\7\66\2\2\u00e4\u00e3"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\34\2\2"+
		"\u00e7\u00e9\7\66\2\2\u00e8\u00ea\5 \21\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\7\36\2\2\u00ee\u00ef\7\66\2\2\u00ef\37\3\2\2\2\u00f0\u00f3\7;\2"+
		"\2\u00f1\u00f2\7\32\2\2\u00f2\u00f4\7\67\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7\66\2\2\u00f6!\3\2\2\2"+
		"\u00f7\u00f8\7!\2\2\u00f8\u00f9\5$\23\2\u00f9\u00fa\7;\2\2\u00fa\u0103"+
		"\7\n\2\2\u00fb\u0100\5&\24\2\u00fc\u00fd\7\35\2\2\u00fd\u00ff\5&\24\2"+
		"\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u00fb\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7\13\2\2\u0106\u0107\5"+
		"> \2\u0107#\3\2\2\2\u0108\u010c\5\b\5\2\u0109\u010c\7\64\2\2\u010a\u010c"+
		"\7;\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c"+
		"%\3\2\2\2\u010d\u010e\5\b\5\2\u010e\u010f\7;\2\2\u010f\'\3\2\2\2\u0110"+
		"\u0120\5\64\33\2\u0111\u0120\5.\30\2\u0112\u0120\5:\36\2\u0113\u0120\5"+
		"<\37\2\u0114\u0120\5\22\n\2\u0115\u0120\5\26\f\2\u0116\u0120\5\24\13\2"+
		"\u0117\u0120\5*\26\2\u0118\u0119\5\n\6\2\u0119\u011a\7\66\2\2\u011a\u0120"+
		"\3\2\2\2\u011b\u0120\5@!\2\u011c\u0120\5D#\2\u011d\u0120\5B\"\2\u011e"+
		"\u0120\5> \2\u011f\u0110\3\2\2\2\u011f\u0111\3\2\2\2\u011f\u0112\3\2\2"+
		"\2\u011f\u0113\3\2\2\2\u011f\u0114\3\2\2\2\u011f\u0115\3\2\2\2\u011f\u0116"+
		"\3\2\2\2\u011f\u0117\3\2\2\2\u011f\u0118\3\2\2\2\u011f\u011b\3\2\2\2\u011f"+
		"\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120)\3\2\2\2"+
		"\u0121\u0124\5,\27\2\u0122\u0124\t\b\2\2\u0123\u0121\3\2\2\2\u0123\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7\66\2\2\u0126+\3\2\2\2\u0127"+
		"\u0129\7$\2\2\u0128\u012a\5\n\6\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a-\3\2\2\2\u012b\u012c\7%\2\2\u012c\u012e\5\n\6\2\u012d\u012f"+
		"\7\66\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2"+
		"\u0130\u0131\7\34\2\2\u0131\u0135\7\66\2\2\u0132\u0134\5\60\31\2\u0133"+
		"\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\5\62\32\2\u0139"+
		"\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\36"+
		"\2\2\u013c\u013d\7\66\2\2\u013d/\3\2\2\2\u013e\u013f\7&\2\2\u013f\u0140"+
		"\5\n\6\2\u0140\u0141\7\'\2\2\u0141\u0143\3\2\2\2\u0142\u013e\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u014a\7\66\2\2\u0147\u0149\5(\25\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\"\2\2\u014e\u014f\7\66\2\2\u014f"+
		"\61\3\2\2\2\u0150\u0151\7(\2\2\u0151\u0155\7\66\2\2\u0152\u0154\5(\25"+
		"\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\"\2\2\u0159"+
		"\u015a\7\66\2\2\u015a\63\3\2\2\2\u015b\u015c\7)\2\2\u015c\u015d\5\n\6"+
		"\2\u015d\u0161\5> \2\u015e\u0160\5\66\34\2\u015f\u015e\3\2\2\2\u0160\u0163"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0165\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0166\58\35\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\65\3\2\2\2\u0167\u0168\7*\2\2\u0168\u0169\5\n\6\2\u0169\u016a"+
		"\5> \2\u016a\67\3\2\2\2\u016b\u016c\7+\2\2\u016c\u016d\5> \2\u016d9\3"+
		"\2\2\2\u016e\u016f\7,\2\2\u016f\u0170\5\n\6\2\u0170\u0171\5> \2\u0171"+
		";\3\2\2\2\u0172\u0173\7-\2\2\u0173\u0174\5\b\5\2\u0174\u0175\7;\2\2\u0175"+
		"\u0176\7.\2\2\u0176\u017b\7;\2\2\u0177\u0178\7\31\2\2\u0178\u017a\7;\2"+
		"\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\5> \2\u017f"+
		"=\3\2\2\2\u0180\u0182\7\66\2\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2"+
		"\u0182\u0183\3\2\2\2\u0183\u0184\7\34\2\2\u0184\u0188\7\66\2\2\u0185\u0187"+
		"\5(\25\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018d\7\36"+
		"\2\2\u018c\u018e\7\66\2\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"?\3\2\2\2\u018f\u0197\7;\2\2\u0190\u0193\7\31\2\2\u0191\u0194\7;\2\2\u0192"+
		"\u0194\5\16\b\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194\u0196\3"+
		"\2\2\2\u0195\u0190\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7\32"+
		"\2\2\u019b\u019c\5\n\6\2\u019c\u019d\7\66\2\2\u019dA\3\2\2\2\u019e\u01a3"+
		"\7;\2\2\u019f\u01a0\7\31\2\2\u01a0\u01a2\7;\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2"+
		"\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\7\32\2\2\u01a7\u01a8\5\n\6\2\u01a8"+
		"\u01a9\7)\2\2\u01a9\u01aa\5\n\6\2\u01aa\u01ab\7+\2\2\u01ab\u01ac\5\n\6"+
		"\2\u01ac\u01ad\7\66\2\2\u01adC\3\2\2\2\u01ae\u01b3\7;\2\2\u01af\u01b0"+
		"\7\31\2\2\u01b0\u01b2\7;\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b6\u01b7\t\t\2\2\u01b7\u01b8\5\n\6\2\u01b8\u01b9\7\66\2\2\u01b9"+
		"E\3\2\2\2\u01ba\u01bb\7;\2\2\u01bb\u01bd\7\n\2\2\u01bc\u01be\5H%\2\u01bd"+
		"\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\7\13"+
		"\2\2\u01c0G\3\2\2\2\u01c1\u01c6\5\n\6\2\u01c2\u01c3\7\35\2\2\u01c3\u01c5"+
		"\5\n\6\2\u01c4\u01c2\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7I\3\2\2\2\u01c8\u01c6\3\2\2\2/MVdlq\177\u0090\u0092"+
		"\u0099\u00a4\u00a9\u00b4\u00bb\u00bd\u00c7\u00ca\u00d1\u00d8\u00e4\u00eb"+
		"\u00f3\u0100\u0103\u010b\u011f\u0123\u0129\u012e\u0135\u0139\u0144\u014a"+
		"\u0155\u0161\u0165\u017b\u0181\u0188\u018d\u0193\u0197\u01a3\u01b3\u01bd"+
		"\u01c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}