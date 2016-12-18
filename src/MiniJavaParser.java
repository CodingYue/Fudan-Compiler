// Generated from ./src/MiniJava.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, Identifier=36, Alphabet=37, Lowercase=38, 
		Uppercase=39, Digit=40, WS=41, LineComment=42;
	public static final int
		RULE_goal = 0, RULE_program = 1, RULE_mainClass = 2, RULE_classDeclaration = 3, 
		RULE_varDeclaration = 4, RULE_methodDeclaration = 5, RULE_parameter = 6, 
		RULE_type = 7, RULE_statement = 8, RULE_expression = 9;
	public static final String[] ruleNames = {
		"goal", "program", "mainClass", "classDeclaration", "varDeclaration", 
		"methodDeclaration", "parameter", "type", "statement", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
		"'String'", "'['", "']'", "')'", "'}'", "'extends'", "';'", "'return'", 
		"','", "'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
		"'='", "'&&'", "'<'", "'+'", "'-'", "'*'", "'.'", "'length'", "'true'", 
		"'false'", "'this'", "'new'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Identifier", "Alphabet", "Lowercase", "Uppercase", "Digit", "WS", "LineComment"
	};
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
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			program();
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

	public static class ProgramContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniJavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			mainClass();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(23);
				classDeclaration();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
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

	public static class MainClassContext extends ParserRuleContext {
		public Token name;
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaParser.Identifier, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__0);
			setState(32);
			((MainClassContext)_localctx).name = match(Identifier);
			setState(33);
			match(T__1);
			setState(34);
			match(T__2);
			setState(35);
			match(T__3);
			setState(36);
			match(T__4);
			setState(37);
			match(T__5);
			setState(38);
			match(T__6);
			setState(39);
			match(T__7);
			setState(40);
			match(T__8);
			setState(41);
			match(T__9);
			setState(42);
			match(Identifier);
			setState(43);
			match(T__10);
			setState(44);
			match(T__1);
			setState(45);
			statement();
			setState(46);
			match(T__11);
			setState(47);
			match(T__11);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token name;
		public Token ext;
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaParser.Identifier, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__0);
			setState(50);
			((ClassDeclarationContext)_localctx).name = match(Identifier);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(51);
				match(T__12);
				setState(52);
				((ClassDeclarationContext)_localctx).ext = match(Identifier);
				}
			}

			setState(55);
			match(T__1);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << Identifier))) != 0)) {
				{
				{
				setState(56);
				varDeclaration();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(62);
				methodDeclaration();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__11);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public Token name;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			type();
			setState(71);
			((VarDeclarationContext)_localctx).name = match(Identifier);
			setState(72);
			match(T__13);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext returnType;
		public Token name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__2);
			setState(75);
			((MethodDeclarationContext)_localctx).returnType = type();
			setState(76);
			((MethodDeclarationContext)_localctx).name = match(Identifier);
			setState(77);
			match(T__6);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << Identifier))) != 0)) {
				{
				setState(78);
				parameter();
				}
			}

			setState(81);
			match(T__10);
			setState(82);
			match(T__1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83);
					varDeclaration();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
				{
				{
				setState(89);
				statement();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(T__14);
			setState(96);
			expression(0);
			setState(97);
			match(T__13);
			setState(98);
			match(T__11);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext parameterType;
		public Token name;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				((ParameterContext)_localctx).parameterType = type();
				setState(101);
				((ParameterContext)_localctx).name = match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				((ParameterContext)_localctx).parameterType = type();
				setState(104);
				((ParameterContext)_localctx).name = match(Identifier);
				setState(105);
				match(T__15);
				setState(106);
				parameter();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__16);
				setState(111);
				match(T__8);
				setState(112);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(Identifier);
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

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(T__1);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
					{
					{
					setState(119);
					statement();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__18);
				setState(127);
				match(T__6);
				setState(128);
				expression(0);
				setState(129);
				match(T__10);
				setState(130);
				statement();
				setState(131);
				match(T__19);
				setState(132);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(T__20);
				setState(135);
				match(T__6);
				setState(136);
				expression(0);
				setState(137);
				match(T__10);
				setState(138);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(T__21);
				setState(141);
				match(T__6);
				setState(142);
				expression(0);
				setState(143);
				match(T__10);
				setState(144);
				match(T__13);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(Identifier);
				setState(147);
				match(T__22);
				setState(148);
				expression(0);
				setState(149);
				match(T__13);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				match(Identifier);
				setState(152);
				match(T__8);
				setState(153);
				expression(0);
				setState(154);
				match(T__9);
				setState(155);
				match(T__22);
				setState(156);
				expression(0);
				setState(157);
				match(T__13);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> Digit() { return getTokens(MiniJavaParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(MiniJavaParser.Digit, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(163); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(162);
						match(Digit);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(165); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(167);
				match(T__30);
				}
				break;
			case 3:
				{
				setState(168);
				match(T__31);
				}
				break;
			case 4:
				{
				setState(169);
				match(T__32);
				}
				break;
			case 5:
				{
				setState(170);
				match(T__33);
				setState(171);
				match(T__16);
				setState(172);
				match(T__8);
				setState(173);
				expression(0);
				setState(174);
				match(T__9);
				}
				break;
			case 6:
				{
				setState(176);
				match(T__33);
				setState(177);
				match(Identifier);
				setState(178);
				match(T__6);
				setState(179);
				match(T__10);
				}
				break;
			case 7:
				{
				setState(180);
				match(T__34);
				setState(181);
				expression(3);
				}
				break;
			case 8:
				{
				setState(182);
				match(T__6);
				setState(183);
				expression(0);
				setState(184);
				match(T__10);
				}
				break;
			case 9:
				{
				setState(186);
				match(Identifier);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(190);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(191);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(193);
						match(T__8);
						setState(194);
						expression(0);
						setState(195);
						match(T__9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(198);
						match(T__28);
						setState(199);
						match(T__29);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(201);
						match(T__28);
						setState(202);
						match(Identifier);
						setState(203);
						match(T__6);
						setState(212);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << Identifier) | (1L << Digit))) != 0)) {
							{
							setState(204);
							expression(0);
							setState(209);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__15) {
								{
								{
								setState(205);
								match(T__15);
								setState(206);
								expression(0);
								}
								}
								setState(211);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(214);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u00df\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\5\58\n\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\7\5B\n\5\f\5\16\5E\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7R\n\7\3\7\3\7\3\7\7"+
		"\7W\n\7\f\7\16\7Z\13\7\3\7\7\7]\n\7\f\7\16\7`\13\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"w\n\t\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a2\n\n\3\13\3\13\6\13\u00a6"+
		"\n\13\r\13\16\13\u00a7\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00be\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00d2\n\13\f\13\16\13\u00d5\13\13\5\13\u00d7"+
		"\n\13\3\13\7\13\u00da\n\13\f\13\16\13\u00dd\13\13\3\13\2\3\24\f\2\4\6"+
		"\b\n\f\16\20\22\24\2\3\3\2\32\36\u00f4\2\26\3\2\2\2\4\30\3\2\2\2\6!\3"+
		"\2\2\2\b\63\3\2\2\2\nH\3\2\2\2\fL\3\2\2\2\16n\3\2\2\2\20v\3\2\2\2\22\u00a1"+
		"\3\2\2\2\24\u00bd\3\2\2\2\26\27\5\4\3\2\27\3\3\2\2\2\30\34\5\6\4\2\31"+
		"\33\5\b\5\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35"+
		"\37\3\2\2\2\36\34\3\2\2\2\37 \7\2\2\3 \5\3\2\2\2!\"\7\3\2\2\"#\7&\2\2"+
		"#$\7\4\2\2$%\7\5\2\2%&\7\6\2\2&\'\7\7\2\2\'(\7\b\2\2()\7\t\2\2)*\7\n\2"+
		"\2*+\7\13\2\2+,\7\f\2\2,-\7&\2\2-.\7\r\2\2./\7\4\2\2/\60\5\22\n\2\60\61"+
		"\7\16\2\2\61\62\7\16\2\2\62\7\3\2\2\2\63\64\7\3\2\2\64\67\7&\2\2\65\66"+
		"\7\17\2\2\668\7&\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29=\7\4\2\2:<\5"+
		"\n\6\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>C\3\2\2\2?=\3\2\2\2@B\5"+
		"\f\7\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7"+
		"\16\2\2G\t\3\2\2\2HI\5\20\t\2IJ\7&\2\2JK\7\20\2\2K\13\3\2\2\2LM\7\5\2"+
		"\2MN\5\20\t\2NO\7&\2\2OQ\7\t\2\2PR\5\16\b\2QP\3\2\2\2QR\3\2\2\2RS\3\2"+
		"\2\2ST\7\r\2\2TX\7\4\2\2UW\5\n\6\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2"+
		"\2\2Y^\3\2\2\2ZX\3\2\2\2[]\5\22\n\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_"+
		"\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\21\2\2bc\5\24\13\2cd\7\20\2\2de\7\16"+
		"\2\2e\r\3\2\2\2fg\5\20\t\2gh\7&\2\2ho\3\2\2\2ij\5\20\t\2jk\7&\2\2kl\7"+
		"\22\2\2lm\5\16\b\2mo\3\2\2\2nf\3\2\2\2ni\3\2\2\2o\17\3\2\2\2pq\7\23\2"+
		"\2qr\7\13\2\2rw\7\f\2\2sw\7\24\2\2tw\7\23\2\2uw\7&\2\2vp\3\2\2\2vs\3\2"+
		"\2\2vt\3\2\2\2vu\3\2\2\2w\21\3\2\2\2x|\7\4\2\2y{\5\22\n\2zy\3\2\2\2{~"+
		"\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u00a2\7\16\2\2"+
		"\u0080\u0081\7\25\2\2\u0081\u0082\7\t\2\2\u0082\u0083\5\24\13\2\u0083"+
		"\u0084\7\r\2\2\u0084\u0085\5\22\n\2\u0085\u0086\7\26\2\2\u0086\u0087\5"+
		"\22\n\2\u0087\u00a2\3\2\2\2\u0088\u0089\7\27\2\2\u0089\u008a\7\t\2\2\u008a"+
		"\u008b\5\24\13\2\u008b\u008c\7\r\2\2\u008c\u008d\5\22\n\2\u008d\u00a2"+
		"\3\2\2\2\u008e\u008f\7\30\2\2\u008f\u0090\7\t\2\2\u0090\u0091\5\24\13"+
		"\2\u0091\u0092\7\r\2\2\u0092\u0093\7\20\2\2\u0093\u00a2\3\2\2\2\u0094"+
		"\u0095\7&\2\2\u0095\u0096\7\31\2\2\u0096\u0097\5\24\13\2\u0097\u0098\7"+
		"\20\2\2\u0098\u00a2\3\2\2\2\u0099\u009a\7&\2\2\u009a\u009b\7\13\2\2\u009b"+
		"\u009c\5\24\13\2\u009c\u009d\7\f\2\2\u009d\u009e\7\31\2\2\u009e\u009f"+
		"\5\24\13\2\u009f\u00a0\7\20\2\2\u00a0\u00a2\3\2\2\2\u00a1x\3\2\2\2\u00a1"+
		"\u0080\3\2\2\2\u00a1\u0088\3\2\2\2\u00a1\u008e\3\2\2\2\u00a1\u0094\3\2"+
		"\2\2\u00a1\u0099\3\2\2\2\u00a2\23\3\2\2\2\u00a3\u00a5\b\13\1\2\u00a4\u00a6"+
		"\7*\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00be\3\2\2\2\u00a9\u00be\7!\2\2\u00aa\u00be\7\""+
		"\2\2\u00ab\u00be\7#\2\2\u00ac\u00ad\7$\2\2\u00ad\u00ae\7\23\2\2\u00ae"+
		"\u00af\7\13\2\2\u00af\u00b0\5\24\13\2\u00b0\u00b1\7\f\2\2\u00b1\u00be"+
		"\3\2\2\2\u00b2\u00b3\7$\2\2\u00b3\u00b4\7&\2\2\u00b4\u00b5\7\t\2\2\u00b5"+
		"\u00be\7\r\2\2\u00b6\u00b7\7%\2\2\u00b7\u00be\5\24\13\5\u00b8\u00b9\7"+
		"\t\2\2\u00b9\u00ba\5\24\13\2\u00ba\u00bb\7\r\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00be\7&\2\2\u00bd\u00a3\3\2\2\2\u00bd\u00a9\3\2\2\2\u00bd\u00aa\3\2"+
		"\2\2\u00bd\u00ab\3\2\2\2\u00bd\u00ac\3\2\2\2\u00bd\u00b2\3\2\2\2\u00bd"+
		"\u00b6\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00db\3\2"+
		"\2\2\u00bf\u00c0\f\17\2\2\u00c0\u00c1\t\2\2\2\u00c1\u00da\5\24\13\20\u00c2"+
		"\u00c3\f\16\2\2\u00c3\u00c4\7\13\2\2\u00c4\u00c5\5\24\13\2\u00c5\u00c6"+
		"\7\f\2\2\u00c6\u00da\3\2\2\2\u00c7\u00c8\f\r\2\2\u00c8\u00c9\7\37\2\2"+
		"\u00c9\u00da\7 \2\2\u00ca\u00cb\f\f\2\2\u00cb\u00cc\7\37\2\2\u00cc\u00cd"+
		"\7&\2\2\u00cd\u00d6\7\t\2\2\u00ce\u00d3\5\24\13\2\u00cf\u00d0\7\22\2\2"+
		"\u00d0\u00d2\5\24\13\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00ce\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\7\r"+
		"\2\2\u00d9\u00bf\3\2\2\2\u00d9\u00c2\3\2\2\2\u00d9\u00c7\3\2\2\2\u00d9"+
		"\u00ca\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\25\3\2\2\2\u00dd\u00db\3\2\2\2\23\34\67=CQX^nv|\u00a1\u00a7"+
		"\u00bd\u00d3\u00d6\u00d9\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}