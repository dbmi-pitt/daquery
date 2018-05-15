// Generated from SQLite.g4 by ANTLR 4.7
package edu.pitt.dbmi.daquery.sql.parser.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, K_ABORT=25, 
		K_ACTION=26, K_ADD=27, K_AFTER=28, K_ALL=29, K_ALTER=30, K_ANALYZE=31, 
		K_AND=32, K_AS=33, K_ASC=34, K_ATTACH=35, K_AUTOINCREMENT=36, K_BEFORE=37, 
		K_BEGIN=38, K_BETWEEN=39, K_BY=40, K_CASCADE=41, K_CASE=42, K_CAST=43, 
		K_CHECK=44, K_COLLATE=45, K_COLUMN=46, K_COMMIT=47, K_CONFLICT=48, K_CONSTRAINT=49, 
		K_COUNT=50, K_CREATE=51, K_CROSS=52, K_CURRENT_DATE=53, K_CURRENT_TIME=54, 
		K_CURRENT_TIMESTAMP=55, K_DATABASE=56, K_DEFAULT=57, K_DEFERRABLE=58, 
		K_DEFERRED=59, K_DELETE=60, K_DESC=61, K_DETACH=62, K_DISTINCT=63, K_DROP=64, 
		K_EACH=65, K_ELSE=66, K_END=67, K_ESCAPE=68, K_EXCEPT=69, K_EXCLUSIVE=70, 
		K_EXISTS=71, K_EXPLAIN=72, K_FAIL=73, K_FOR=74, K_FOREIGN=75, K_FROM=76, 
		K_FULL=77, K_GLOB=78, K_GROUP=79, K_HAVING=80, K_IF=81, K_IGNORE=82, K_IMMEDIATE=83, 
		K_IN=84, K_INDEX=85, K_INDEXED=86, K_INITIALLY=87, K_INNER=88, K_INSERT=89, 
		K_INSTEAD=90, K_INTERSECT=91, K_INTO=92, K_IS=93, K_ISNULL=94, K_JOIN=95, 
		K_KEY=96, K_LEFT=97, K_LIKE=98, K_LIMIT=99, K_MATCH=100, K_NATURAL=101, 
		K_NO=102, K_NOT=103, K_NOTNULL=104, K_NULL=105, K_OF=106, K_OFFSET=107, 
		K_ON=108, K_OR=109, K_ORDER=110, K_OUTER=111, K_PLAN=112, K_PRAGMA=113, 
		K_PRIMARY=114, K_QUERY=115, K_RAISE=116, K_RECURSIVE=117, K_REFERENCES=118, 
		K_REGEXP=119, K_REINDEX=120, K_RELEASE=121, K_RENAME=122, K_REPLACE=123, 
		K_RESTRICT=124, K_RIGHT=125, K_ROLLBACK=126, K_ROW=127, K_SAVEPOINT=128, 
		K_SELECT=129, K_SET=130, K_TABLE=131, K_TEMP=132, K_TEMPORARY=133, K_THEN=134, 
		K_TO=135, K_TRANSACTION=136, K_TRIGGER=137, K_UNION=138, K_UNIQUE=139, 
		K_UPDATE=140, K_USING=141, K_VACUUM=142, K_VALUES=143, K_VIEW=144, K_VIRTUAL=145, 
		K_WHEN=146, K_WHERE=147, K_WITH=148, K_WITHOUT=149, IDENTIFIER=150, NUMERIC_LITERAL=151, 
		BIND_PARAMETER=152, STRING_LITERAL=153, BLOB_LITERAL=154, SINGLE_LINE_COMMENT=155, 
		MULTILINE_COMMENT=156, SPACES=157, UNEXPECTED_CHAR=158;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_end_of_select = 4, RULE_alter_table_stmt = 5, RULE_analyze_stmt = 6, 
		RULE_attach_stmt = 7, RULE_begin_stmt = 8, RULE_commit_stmt = 9, RULE_compound_select_stmt = 10, 
		RULE_create_index_stmt = 11, RULE_create_table_stmt = 12, RULE_create_trigger_stmt = 13, 
		RULE_create_view_stmt = 14, RULE_create_virtual_table_stmt = 15, RULE_delete_stmt = 16, 
		RULE_delete_stmt_limited = 17, RULE_single_from_clause = 18, RULE_detach_stmt = 19, 
		RULE_drop_index_stmt = 20, RULE_drop_table_stmt = 21, RULE_drop_trigger_stmt = 22, 
		RULE_drop_view_stmt = 23, RULE_factored_select_stmt = 24, RULE_insert_stmt = 25, 
		RULE_pragma_stmt = 26, RULE_reindex_stmt = 27, RULE_release_stmt = 28, 
		RULE_rollback_stmt = 29, RULE_savepoint_stmt = 30, RULE_simple_select_stmt = 31, 
		RULE_select_stmt = 32, RULE_select_or_values = 33, RULE_update_stmt = 34, 
		RULE_update_stmt_limited = 35, RULE_vacuum_stmt = 36, RULE_column_def = 37, 
		RULE_type_name = 38, RULE_column_constraint = 39, RULE_conflict_clause = 40, 
		RULE_expr = 41, RULE_dbColumnExpr = 42, RULE_comparison_operator = 43, 
		RULE_foreign_key_clause = 44, RULE_raise_function = 45, RULE_indexed_column = 46, 
		RULE_table_constraint = 47, RULE_with_clause = 48, RULE_qualified_table_name = 49, 
		RULE_ordering_term = 50, RULE_pragma_value = 51, RULE_common_table_expression = 52, 
		RULE_result_column = 53, RULE_table_or_subquery = 54, RULE_join_clause = 55, 
		RULE_join_operator = 56, RULE_join_constraint = 57, RULE_select_core = 58, 
		RULE_multi_from_clause = 59, RULE_compound_operator = 60, RULE_cte_table_name = 61, 
		RULE_signed_number = 62, RULE_literal_value = 63, RULE_unary_operator = 64, 
		RULE_error_message = 65, RULE_module_argument = 66, RULE_column_alias = 67, 
		RULE_keyword = 68, RULE_name = 69, RULE_count_function = 70, RULE_and_keyword = 71, 
		RULE_or_keyword = 72, RULE_and_or = 73, RULE_not_keyword = 74, RULE_in_keyword = 75, 
		RULE_like_keyword = 76, RULE_distinct_keyword = 77, RULE_function_name = 78, 
		RULE_database_name = 79, RULE_table_name = 80, RULE_table_or_index_name = 81, 
		RULE_new_table_name = 82, RULE_column_name = 83, RULE_collation_name = 84, 
		RULE_foreign_table = 85, RULE_index_name = 86, RULE_trigger_name = 87, 
		RULE_view_name = 88, RULE_module_name = 89, RULE_pragma_name = 90, RULE_savepoint_name = 91, 
		RULE_table_alias = 92, RULE_transaction_name = 93, RULE_any_name = 94;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "end_of_select", "alter_table_stmt", 
		"analyze_stmt", "attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", 
		"create_index_stmt", "create_table_stmt", "create_trigger_stmt", "create_view_stmt", 
		"create_virtual_table_stmt", "delete_stmt", "delete_stmt_limited", "single_from_clause", 
		"detach_stmt", "drop_index_stmt", "drop_table_stmt", "drop_trigger_stmt", 
		"drop_view_stmt", "factored_select_stmt", "insert_stmt", "pragma_stmt", 
		"reindex_stmt", "release_stmt", "rollback_stmt", "savepoint_stmt", "simple_select_stmt", 
		"select_stmt", "select_or_values", "update_stmt", "update_stmt_limited", 
		"vacuum_stmt", "column_def", "type_name", "column_constraint", "conflict_clause", 
		"expr", "dbColumnExpr", "comparison_operator", "foreign_key_clause", "raise_function", 
		"indexed_column", "table_constraint", "with_clause", "qualified_table_name", 
		"ordering_term", "pragma_value", "common_table_expression", "result_column", 
		"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
		"select_core", "multi_from_clause", "compound_operator", "cte_table_name", 
		"signed_number", "literal_value", "unary_operator", "error_message", "module_argument", 
		"column_alias", "keyword", "name", "count_function", "and_keyword", "or_keyword", 
		"and_or", "not_keyword", "in_keyword", "like_keyword", "distinct_keyword", 
		"function_name", "database_name", "table_name", "table_or_index_name", 
		"new_table_name", "column_name", "collation_name", "foreign_table", "index_name", 
		"trigger_name", "view_name", "module_name", "pragma_name", "savepoint_name", 
		"table_alias", "transaction_name", "any_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", "'~'", 
		"'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
		"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
		"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", 
		"K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", 
		"K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", 
		"K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", 
		"K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_COUNT", "K_CREATE", 
		"K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
		"K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", 
		"K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ESCAPE", 
		"K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", 
		"K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", 
		"K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", 
		"K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", 
		"K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", 
		"K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_OR", 
		"K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", 
		"K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", 
		"K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", 
		"K_SELECT", "K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", 
		"K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", 
		"K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", 
		"K_WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
		"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
		"UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "SQLite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLiteParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (K_ALTER - 30)) | (1L << (K_ANALYZE - 30)) | (1L << (K_ATTACH - 30)) | (1L << (K_BEGIN - 30)) | (1L << (K_COMMIT - 30)) | (1L << (K_CREATE - 30)) | (1L << (K_DELETE - 30)) | (1L << (K_DETACH - 30)) | (1L << (K_DROP - 30)) | (1L << (K_END - 30)) | (1L << (K_EXPLAIN - 30)) | (1L << (K_INSERT - 30)))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (K_PRAGMA - 113)) | (1L << (K_REINDEX - 113)) | (1L << (K_RELEASE - 113)) | (1L << (K_REPLACE - 113)) | (1L << (K_ROLLBACK - 113)) | (1L << (K_SAVEPOINT - 113)) | (1L << (K_SELECT - 113)) | (1L << (K_UPDATE - 113)) | (1L << (K_VACUUM - 113)) | (1L << (K_VALUES - 113)) | (1L << (K_WITH - 113)) | (1L << (UNEXPECTED_CHAR - 113)))) != 0)) {
				{
				setState(192);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_INSERT:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
					{
					setState(190);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(191);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLiteParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);
			 
			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null)); 
			   
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			sql_stmt();
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					sql_stmt();
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public End_of_selectContext end_of_select() {
			return getRuleContext(End_of_selectContext.class,0);
		}
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(209);
				match(K_EXPLAIN);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(210);
					match(K_QUERY);
					setState(211);
					match(K_PLAN);
					}
				}

				}
			}

			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(216);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(217);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(218);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(219);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(220);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(221);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(222);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(223);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(224);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(225);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(226);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(227);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(228);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(229);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(230);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(231);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(232);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(233);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(234);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(235);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(236);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(237);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(238);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(239);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(240);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(241);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(242);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(243);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(244);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(245);
				vacuum_stmt();
				}
				break;
			}
			setState(248);
			end_of_select();
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

	public static class End_of_selectContext extends ParserRuleContext {
		public End_of_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_of_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterEnd_of_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitEnd_of_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitEnd_of_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_of_selectContext end_of_select() throws RecognitionException {
		End_of_selectContext _localctx = new End_of_selectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_end_of_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(SCOL);
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

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(K_ALTER);
			setState(253);
			match(K_TABLE);
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(254);
				database_name();
				setState(255);
				match(DOT);
				}
				break;
			}
			setState(259);
			table_name();
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(260);
				match(K_RENAME);
				setState(261);
				match(K_TO);
				setState(262);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(263);
				match(K_ADD);
				setState(265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(264);
					match(K_COLUMN);
					}
					break;
				}
				setState(267);
				column_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAnalyze_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAnalyze_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(K_ANALYZE);
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(271);
				database_name();
				}
				break;
			case 2:
				{
				setState(272);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(273);
				database_name();
				setState(274);
				match(DOT);
				setState(275);
				table_or_index_name();
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

	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAttach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAttach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(K_ATTACH);
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(280);
				match(K_DATABASE);
				}
				break;
			}
			setState(283);
			expr(0);
			setState(284);
			match(K_AS);
			setState(285);
			database_name();
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

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitBegin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitBegin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(K_BEGIN);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (K_DEFERRED - 59)) | (1L << (K_EXCLUSIVE - 59)) | (1L << (K_IMMEDIATE - 59)))) != 0)) {
				{
				setState(288);
				_la = _input.LA(1);
				if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (K_DEFERRED - 59)) | (1L << (K_EXCLUSIVE - 59)) | (1L << (K_IMMEDIATE - 59)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(291);
				match(K_TRANSACTION);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH) | (1L << K_DISTINCT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RESTRICT - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_ROW - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(292);
					transaction_name();
					}
				}

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

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(298);
				match(K_TRANSACTION);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH) | (1L << K_DISTINCT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RESTRICT - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_ROW - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(299);
					transaction_name();
					}
				}

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

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(SQLiteParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(SQLiteParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(SQLiteParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(SQLiteParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(SQLiteParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(SQLiteParser.K_EXCEPT, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(SQLiteParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(SQLiteParser.K_ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(304);
				match(K_WITH);
				setState(306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(305);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(308);
				common_table_expression();
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(309);
					match(COMMA);
					setState(310);
					common_table_expression();
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(318);
			select_core();
			setState(328); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(325);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(319);
					match(K_UNION);
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(320);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(323);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(324);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(327);
				select_core();
				}
				}
				setState(330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(332);
				match(K_ORDER);
				setState(333);
				match(K_BY);
				setState(334);
				ordering_term();
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(335);
					match(COMMA);
					setState(336);
					ordering_term();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(344);
				match(K_LIMIT);
				setState(345);
				expr(0);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(346);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(347);
					expr(0);
					}
				}

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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(K_CREATE);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(353);
				match(K_UNIQUE);
				}
			}

			setState(356);
			match(K_INDEX);
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(357);
				match(K_IF);
				setState(358);
				match(K_NOT);
				setState(359);
				match(K_EXISTS);
				}
				break;
			}
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(362);
				database_name();
				setState(363);
				match(DOT);
				}
				break;
			}
			setState(367);
			index_name();
			setState(368);
			match(K_ON);
			setState(369);
			table_name();
			setState(370);
			match(OPEN_PAR);
			setState(371);
			indexed_column();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(372);
				match(COMMA);
				setState(373);
				indexed_column();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			match(CLOSE_PAR);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(380);
				match(K_WHERE);
				setState(381);
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(K_CREATE);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(385);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(388);
			match(K_TABLE);
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(389);
				match(K_IF);
				setState(390);
				match(K_NOT);
				setState(391);
				match(K_EXISTS);
				}
				break;
			}
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(394);
				database_name();
				setState(395);
				match(DOT);
				}
				break;
			}
			setState(399);
			table_name();
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(400);
				match(OPEN_PAR);
				setState(401);
				column_def();
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(402);
						match(COMMA);
						setState(403);
						column_def();
						}
						} 
					}
					setState(408);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(409);
					match(COMMA);
					setState(410);
					table_constraint();
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(416);
				match(CLOSE_PAR);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(417);
					match(K_WITHOUT);
					setState(418);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(421);
				match(K_AS);
				setState(422);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public List<TerminalNode> K_OF() { return getTokens(SQLiteParser.K_OF); }
		public TerminalNode K_OF(int i) {
			return getToken(SQLiteParser.K_OF, i);
		}
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(K_CREATE);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(426);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(429);
			match(K_TRIGGER);
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(430);
				match(K_IF);
				setState(431);
				match(K_NOT);
				setState(432);
				match(K_EXISTS);
				}
				break;
			}
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(435);
				database_name();
				setState(436);
				match(DOT);
				}
				break;
			}
			setState(440);
			trigger_name();
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(441);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(442);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(443);
				match(K_INSTEAD);
				setState(444);
				match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				break;
			}
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(447);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(448);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(449);
				match(K_UPDATE);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(450);
					match(K_OF);
					setState(451);
					column_name();
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(452);
						match(COMMA);
						setState(453);
						column_name();
						}
						}
						setState(458);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(463);
			match(K_ON);
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(464);
				database_name();
				setState(465);
				match(DOT);
				}
				break;
			}
			setState(469);
			table_name();
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(470);
				match(K_FOR);
				setState(471);
				match(K_EACH);
				setState(472);
				match(K_ROW);
				}
			}

			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(475);
				match(K_WHEN);
				setState(476);
				expr(0);
				}
			}

			setState(479);
			match(K_BEGIN);
			setState(488); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(480);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(481);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(482);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(483);
					select_stmt();
					}
					break;
				}
				setState(486);
				match(SCOL);
				}
				}
				setState(490); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INSERT - 89)) | (1L << (K_REPLACE - 89)) | (1L << (K_SELECT - 89)) | (1L << (K_UPDATE - 89)) | (1L << (K_VALUES - 89)) | (1L << (K_WITH - 89)))) != 0) );
			setState(492);
			match(K_END);
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

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(K_CREATE);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(495);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(498);
			match(K_VIEW);
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(499);
				match(K_IF);
				setState(500);
				match(K_NOT);
				setState(501);
				match(K_EXISTS);
				}
				break;
			}
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(504);
				database_name();
				setState(505);
				match(DOT);
				}
				break;
			}
			setState(509);
			view_name();
			setState(510);
			match(K_AS);
			setState(511);
			select_stmt();
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

	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_virtual_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_virtual_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(K_CREATE);
			setState(514);
			match(K_VIRTUAL);
			setState(515);
			match(K_TABLE);
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(516);
				match(K_IF);
				setState(517);
				match(K_NOT);
				setState(518);
				match(K_EXISTS);
				}
				break;
			}
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(521);
				database_name();
				setState(522);
				match(DOT);
				}
				break;
			}
			setState(526);
			table_name();
			setState(527);
			match(K_USING);
			setState(528);
			module_name();
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(529);
				match(OPEN_PAR);
				setState(530);
				module_argument();
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(531);
					match(COMMA);
					setState(532);
					module_argument();
					}
					}
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(538);
				match(CLOSE_PAR);
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public Single_from_clauseContext single_from_clause() {
			return getRuleContext(Single_from_clauseContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(542);
				with_clause();
				}
			}

			setState(545);
			match(K_DELETE);
			setState(546);
			single_from_clause();
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(547);
				match(K_WHERE);
				setState(548);
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

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public Single_from_clauseContext single_from_clause() {
			return getRuleContext(Single_from_clauseContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDelete_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDelete_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(551);
				with_clause();
				}
			}

			setState(554);
			match(K_DELETE);
			setState(555);
			single_from_clause();
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(556);
				match(K_WHERE);
				setState(557);
				expr(0);
				}
			}

			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(560);
					match(K_ORDER);
					setState(561);
					match(K_BY);
					setState(562);
					ordering_term();
					setState(567);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(563);
						match(COMMA);
						setState(564);
						ordering_term();
						}
						}
						setState(569);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(572);
				match(K_LIMIT);
				setState(573);
				expr(0);
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(574);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(575);
					expr(0);
					}
				}

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

	public static class Single_from_clauseContext extends ParserRuleContext {
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public Single_from_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSingle_from_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSingle_from_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSingle_from_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_from_clauseContext single_from_clause() throws RecognitionException {
		Single_from_clauseContext _localctx = new Single_from_clauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_single_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(K_FROM);
			setState(581);
			qualified_table_name();
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

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDetach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDetach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(K_DETACH);
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(584);
				match(K_DATABASE);
				}
				break;
			}
			setState(587);
			database_name();
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

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(K_DROP);
			setState(590);
			match(K_INDEX);
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(591);
				match(K_IF);
				setState(592);
				match(K_EXISTS);
				}
				break;
			}
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(595);
				database_name();
				setState(596);
				match(DOT);
				}
				break;
			}
			setState(600);
			index_name();
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

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(K_DROP);
			setState(603);
			match(K_TABLE);
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(604);
				match(K_IF);
				setState(605);
				match(K_EXISTS);
				}
				break;
			}
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(608);
				database_name();
				setState(609);
				match(DOT);
				}
				break;
			}
			setState(613);
			table_name();
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

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(K_DROP);
			setState(616);
			match(K_TRIGGER);
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(617);
				match(K_IF);
				setState(618);
				match(K_EXISTS);
				}
				break;
			}
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(621);
				database_name();
				setState(622);
				match(DOT);
				}
				break;
			}
			setState(626);
			trigger_name();
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

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(K_DROP);
			setState(629);
			match(K_VIEW);
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(630);
				match(K_IF);
				setState(631);
				match(K_EXISTS);
				}
				break;
			}
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(634);
				database_name();
				setState(635);
				match(DOT);
				}
				break;
			}
			setState(639);
			view_name();
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

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(641);
				match(K_WITH);
				setState(643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(642);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(645);
				common_table_expression();
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(646);
					match(COMMA);
					setState(647);
					common_table_expression();
					}
					}
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(655);
			select_core();
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(656);
				compound_operator();
				setState(657);
				select_core();
				}
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(664);
				match(K_ORDER);
				setState(665);
				match(K_BY);
				setState(666);
				ordering_term();
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(667);
					match(COMMA);
					setState(668);
					ordering_term();
					}
					}
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(676);
				match(K_LIMIT);
				setState(677);
				expr(0);
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(678);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(679);
					expr(0);
					}
				}

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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(684);
				with_clause();
				}
			}

			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(687);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(688);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(689);
				match(K_INSERT);
				setState(690);
				match(K_OR);
				setState(691);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(692);
				match(K_INSERT);
				setState(693);
				match(K_OR);
				setState(694);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(695);
				match(K_INSERT);
				setState(696);
				match(K_OR);
				setState(697);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(698);
				match(K_INSERT);
				setState(699);
				match(K_OR);
				setState(700);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(701);
				match(K_INSERT);
				setState(702);
				match(K_OR);
				setState(703);
				match(K_IGNORE);
				}
				break;
			}
			setState(706);
			match(K_INTO);
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(707);
				database_name();
				setState(708);
				match(DOT);
				}
				break;
			}
			setState(712);
			table_name();
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(713);
				match(OPEN_PAR);
				setState(714);
				column_name();
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(715);
					match(COMMA);
					setState(716);
					column_name();
					}
					}
					setState(721);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(722);
				match(CLOSE_PAR);
				}
			}

			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(726);
				match(K_VALUES);
				setState(727);
				match(OPEN_PAR);
				setState(728);
				expr(0);
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(729);
					match(COMMA);
					setState(730);
					expr(0);
					}
					}
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(736);
				match(CLOSE_PAR);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(737);
					match(COMMA);
					setState(738);
					match(OPEN_PAR);
					setState(739);
					expr(0);
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(740);
						match(COMMA);
						setState(741);
						expr(0);
						}
						}
						setState(746);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(747);
					match(CLOSE_PAR);
					}
					}
					setState(753);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(754);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(755);
				match(K_DEFAULT);
				setState(756);
				match(K_VALUES);
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

	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(K_PRAGMA);
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(760);
				database_name();
				setState(761);
				match(DOT);
				}
				break;
			}
			setState(765);
			pragma_name();
			setState(772);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(766);
				match(ASSIGN);
				setState(767);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(768);
				match(OPEN_PAR);
				setState(769);
				pragma_value();
				setState(770);
				match(CLOSE_PAR);
				}
				break;
			case SCOL:
				break;
			default:
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

	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitReindex_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitReindex_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(K_REINDEX);
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(775);
				collation_name();
				}
				break;
			case 2:
				{
				setState(779);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(776);
					database_name();
					setState(777);
					match(DOT);
					}
					break;
				}
				setState(783);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(781);
					table_name();
					}
					break;
				case 2:
					{
					setState(782);
					index_name();
					}
					break;
				}
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

	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRelease_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRelease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(K_RELEASE);
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(788);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(791);
			savepoint_name();
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

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(K_ROLLBACK);
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(794);
				match(K_TRANSACTION);
				setState(796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(795);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(800);
				match(K_TO);
				setState(802);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(801);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(804);
				savepoint_name();
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

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSavepoint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSavepoint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(K_SAVEPOINT);
			setState(808);
			savepoint_name();
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

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSimple_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(810);
				match(K_WITH);
				setState(812);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(811);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(814);
				common_table_expression();
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(815);
					match(COMMA);
					setState(816);
					common_table_expression();
					}
					}
					setState(821);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(824);
			select_core();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(825);
				match(K_ORDER);
				setState(826);
				match(K_BY);
				setState(827);
				ordering_term();
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(828);
					match(COMMA);
					setState(829);
					ordering_term();
					}
					}
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(837);
				match(K_LIMIT);
				setState(838);
				expr(0);
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(839);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(840);
					expr(0);
					}
				}

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

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(845);
				match(K_WITH);
				setState(847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(846);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(849);
				common_table_expression();
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(850);
					match(COMMA);
					setState(851);
					common_table_expression();
					}
					}
					setState(856);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(859);
			select_or_values();
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(860);
				compound_operator();
				setState(861);
				select_or_values();
				}
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(868);
				match(K_ORDER);
				setState(869);
				match(K_BY);
				setState(870);
				ordering_term();
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(871);
					match(COMMA);
					setState(872);
					ordering_term();
					}
					}
					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(880);
				match(K_LIMIT);
				setState(881);
				expr(0);
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(882);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(883);
					expr(0);
					}
				}

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

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public Multi_from_clauseContext multi_from_clause() {
			return getRuleContext(Multi_from_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_select_or_values);
		int _la;
		try {
			setState(951);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				match(K_SELECT);
				setState(890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(889);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(892);
				result_column();
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(893);
					match(COMMA);
					setState(894);
					result_column();
					}
					}
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(900);
					multi_from_clause();
					}
				}

				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(903);
					match(K_WHERE);
					setState(904);
					expr(0);
					}
				}

				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(907);
					match(K_GROUP);
					setState(908);
					match(K_BY);
					setState(909);
					expr(0);
					setState(914);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(910);
						match(COMMA);
						setState(911);
						expr(0);
						}
						}
						setState(916);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(919);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(917);
						match(K_HAVING);
						setState(918);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				match(K_VALUES);
				setState(924);
				match(OPEN_PAR);
				setState(925);
				expr(0);
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(926);
					match(COMMA);
					setState(927);
					expr(0);
					}
					}
					setState(932);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(933);
				match(CLOSE_PAR);
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(934);
					match(COMMA);
					setState(935);
					match(OPEN_PAR);
					setState(936);
					expr(0);
					setState(941);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(937);
						match(COMMA);
						setState(938);
						expr(0);
						}
						}
						setState(943);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(944);
					match(CLOSE_PAR);
					}
					}
					setState(950);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(953);
				with_clause();
				}
			}

			setState(956);
			match(K_UPDATE);
			setState(967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(957);
				match(K_OR);
				setState(958);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(959);
				match(K_OR);
				setState(960);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(961);
				match(K_OR);
				setState(962);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(963);
				match(K_OR);
				setState(964);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(965);
				match(K_OR);
				setState(966);
				match(K_IGNORE);
				}
				break;
			}
			setState(969);
			qualified_table_name();
			setState(970);
			match(K_SET);
			setState(971);
			column_name();
			setState(972);
			match(ASSIGN);
			setState(973);
			expr(0);
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(974);
				match(COMMA);
				setState(975);
				column_name();
				setState(976);
				match(ASSIGN);
				setState(977);
				expr(0);
				}
				}
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(984);
				match(K_WHERE);
				setState(985);
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

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUpdate_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUpdate_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(988);
				with_clause();
				}
			}

			setState(991);
			match(K_UPDATE);
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(992);
				match(K_OR);
				setState(993);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(994);
				match(K_OR);
				setState(995);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(996);
				match(K_OR);
				setState(997);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(998);
				match(K_OR);
				setState(999);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1000);
				match(K_OR);
				setState(1001);
				match(K_IGNORE);
				}
				break;
			}
			setState(1004);
			qualified_table_name();
			setState(1005);
			match(K_SET);
			setState(1006);
			column_name();
			setState(1007);
			match(ASSIGN);
			setState(1008);
			expr(0);
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1009);
				match(COMMA);
				setState(1010);
				column_name();
				setState(1011);
				match(ASSIGN);
				setState(1012);
				expr(0);
				}
				}
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1019);
				match(K_WHERE);
				setState(1020);
				expr(0);
				}
			}

			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1023);
					match(K_ORDER);
					setState(1024);
					match(K_BY);
					setState(1025);
					ordering_term();
					setState(1030);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1026);
						match(COMMA);
						setState(1027);
						ordering_term();
						}
						}
						setState(1032);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1035);
				match(K_LIMIT);
				setState(1036);
				expr(0);
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1037);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1038);
					expr(0);
					}
				}

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

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitVacuum_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			match(K_VACUUM);
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			column_name();
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1046);
				type_name();
				}
				break;
			}
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (K_NOT - 103)) | (1L << (K_NULL - 103)) | (1L << (K_PRIMARY - 103)) | (1L << (K_REFERENCES - 103)) | (1L << (K_UNIQUE - 103)))) != 0)) {
				{
				{
				setState(1049);
				column_constraint();
				}
				}
				setState(1054);
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

	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1056); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1055);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1058); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1060);
				match(OPEN_PAR);
				setState(1061);
				signed_number();
				setState(1062);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1064);
				match(OPEN_PAR);
				setState(1065);
				signed_number();
				setState(1066);
				match(COMMA);
				setState(1067);
				signed_number();
				setState(1068);
				match(CLOSE_PAR);
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

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1072);
				match(K_CONSTRAINT);
				setState(1073);
				name();
				}
			}

			setState(1109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1076);
				match(K_PRIMARY);
				setState(1077);
				match(K_KEY);
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1078);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1081);
				conflict_clause();
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1082);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1085);
					match(K_NOT);
					}
				}

				setState(1088);
				match(K_NULL);
				setState(1089);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1090);
				match(K_UNIQUE);
				setState(1091);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1092);
				match(K_CHECK);
				setState(1093);
				match(OPEN_PAR);
				setState(1094);
				expr(0);
				setState(1095);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1097);
				match(K_DEFAULT);
				setState(1104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1098);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1099);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1100);
					match(OPEN_PAR);
					setState(1101);
					expr(0);
					setState(1102);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1106);
				match(K_COLLATE);
				setState(1107);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1108);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1111);
				match(K_ON);
				setState(1112);
				match(K_CONFLICT);
				setState(1113);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (K_FAIL - 73)) | (1L << (K_IGNORE - 73)) | (1L << (K_REPLACE - 73)) | (1L << (K_ROLLBACK - 73)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SQLiteParser.BIND_PARAMETER, 0); }
		public DbColumnExprContext dbColumnExpr() {
			return getRuleContext(DbColumnExprContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Count_functionContext count_function() {
			return getRuleContext(Count_functionContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SQLiteParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(SQLiteParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(SQLiteParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(SQLiteParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public And_orContext and_or() {
			return getRuleContext(And_orContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1117);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1118);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1119);
				dbColumnExpr();
				}
				break;
			case 4:
				{
				setState(1120);
				unary_operator();
				setState(1121);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1123);
				count_function();
				}
				break;
			case 6:
				{
				setState(1124);
				function_name();
				setState(1125);
				match(OPEN_PAR);
				setState(1138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
					case 1:
						{
						setState(1126);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1129);
					expr(0);
					setState(1134);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1130);
						match(COMMA);
						setState(1131);
						expr(0);
						}
						}
						setState(1136);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1137);
					match(STAR);
					}
					break;
				}
				setState(1140);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1142);
				match(OPEN_PAR);
				setState(1143);
				expr(0);
				setState(1144);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1146);
				match(K_CAST);
				setState(1147);
				match(OPEN_PAR);
				setState(1148);
				expr(0);
				setState(1149);
				match(K_AS);
				setState(1150);
				type_name();
				setState(1151);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1154);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1153);
						match(K_NOT);
						}
					}

					setState(1156);
					match(K_EXISTS);
					}
				}

				setState(1159);
				match(OPEN_PAR);
				setState(1160);
				select_stmt();
				setState(1161);
				match(CLOSE_PAR);
				}
				break;
			case 10:
				{
				setState(1163);
				match(K_CASE);
				setState(1165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1164);
					expr(0);
					}
					break;
				}
				setState(1172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1167);
					match(K_WHEN);
					setState(1168);
					expr(0);
					setState(1169);
					match(K_THEN);
					setState(1170);
					expr(0);
					}
					}
					setState(1174); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1176);
					match(K_ELSE);
					setState(1177);
					expr(0);
					}
				}

				setState(1180);
				match(K_END);
				}
				break;
			case 11:
				{
				setState(1182);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1185);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1186);
						match(PIPE2);
						setState(1187);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1188);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1189);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1190);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1191);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1192);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1193);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1194);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1195);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1196);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1197);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1198);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1199);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1200);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						{
						setState(1201);
						comparison_operator();
						}
						setState(1202);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1204);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1205);
						and_or();
						setState(1206);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1208);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1209);
						match(K_IS);
						setState(1211);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
						case 1:
							{
							setState(1210);
							match(K_NOT);
							}
							break;
						}
						setState(1213);
						expr(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1214);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1216);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1215);
							match(K_NOT);
							}
						}

						setState(1218);
						match(K_BETWEEN);
						setState(1219);
						expr(0);
						setState(1220);
						match(K_AND);
						setState(1221);
						expr(6);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1223);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1224);
						match(K_COLLATE);
						setState(1225);
						collation_name();
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1226);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1228);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1227);
							match(K_NOT);
							}
						}

						setState(1230);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (K_GLOB - 78)) | (1L << (K_LIKE - 78)) | (1L << (K_MATCH - 78)) | (1L << (K_REGEXP - 78)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1231);
						expr(0);
						setState(1234);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
						case 1:
							{
							setState(1232);
							match(K_ESCAPE);
							setState(1233);
							expr(0);
							}
							break;
						}
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1236);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1241);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1237);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1238);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1239);
							match(K_NOT);
							setState(1240);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1243);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1245);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1244);
							match(K_NOT);
							}
						}

						setState(1247);
						match(K_IN);
						setState(1267);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
						case 1:
							{
							setState(1248);
							match(OPEN_PAR);
							setState(1258);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
							case 1:
								{
								setState(1249);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1250);
								expr(0);
								setState(1255);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1251);
									match(COMMA);
									setState(1252);
									expr(0);
									}
									}
									setState(1257);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1260);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1264);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
							case 1:
								{
								setState(1261);
								database_name();
								setState(1262);
								match(DOT);
								}
								break;
							}
							setState(1266);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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

	public static class DbColumnExprContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public DbColumnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbColumnExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDbColumnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDbColumnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDbColumnExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbColumnExprContext dbColumnExpr() throws RecognitionException {
		DbColumnExprContext _localctx = new DbColumnExprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dbColumnExpr);
		int _la;
		try {
			setState(1292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
					case 1:
						{
						setState(1275);
						database_name();
						setState(1276);
						match(DOT);
						}
						break;
					}
					setState(1280);
					table_name();
					setState(1281);
					match(DOT);
					}
					break;
				}
				setState(1285);
				column_name();
				setState(1290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1287);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1286);
						match(K_AS);
						}
					}

					setState(1289);
					column_alias();
					}
					break;
				}
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

	public static class Comparison_operatorContext extends ParserRuleContext {
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public In_keywordContext in_keyword() {
			return getRuleContext(In_keywordContext.class,0);
		}
		public Like_keywordContext like_keyword() {
			return getRuleContext(Like_keywordContext.class,0);
		}
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitComparison_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitComparison_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_comparison_operator);
		try {
			setState(1306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1294);
				match(ASSIGN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1295);
				match(EQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1296);
				match(NOT_EQ1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1297);
				match(NOT_EQ2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1298);
				match(K_IS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1299);
				match(K_IS);
				setState(1300);
				match(K_NOT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1301);
				in_keyword();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1302);
				like_keyword();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1303);
				match(K_GLOB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1304);
				match(K_MATCH);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1305);
				match(K_REGEXP);
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

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SQLiteParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SQLiteParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SQLiteParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SQLiteParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SQLiteParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SQLiteParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SQLiteParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SQLiteParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SQLiteParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SQLiteParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SQLiteParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SQLiteParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SQLiteParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SQLiteParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SQLiteParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SQLiteParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SQLiteParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SQLiteParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SQLiteParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SQLiteParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SQLiteParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SQLiteParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			match(K_REFERENCES);
			setState(1309);
			foreign_table();
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1310);
				match(OPEN_PAR);
				setState(1311);
				column_name();
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1312);
					match(COMMA);
					setState(1313);
					column_name();
					}
					}
					setState(1318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1319);
				match(CLOSE_PAR);
				}
			}

			setState(1341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1337);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1323);
					match(K_ON);
					setState(1324);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1333);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
					case 1:
						{
						setState(1325);
						match(K_SET);
						setState(1326);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1327);
						match(K_SET);
						setState(1328);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1329);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1330);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1331);
						match(K_NO);
						setState(1332);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1335);
					match(K_MATCH);
					setState(1336);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1344);
					match(K_NOT);
					}
				}

				setState(1347);
				match(K_DEFERRABLE);
				setState(1352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1348);
					match(K_INITIALLY);
					setState(1349);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1350);
					match(K_INITIALLY);
					setState(1351);
					match(K_IMMEDIATE);
					}
					break;
				}
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

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			match(K_RAISE);
			setState(1357);
			match(OPEN_PAR);
			setState(1362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1358);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1359);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1360);
				match(COMMA);
				setState(1361);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1364);
			match(CLOSE_PAR);
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

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			column_name();
			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1367);
				match(K_COLLATE);
				setState(1368);
				collation_name();
				}
			}

			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1371);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Table_constraintContext extends ParserRuleContext {
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1374);
				match(K_CONSTRAINT);
				setState(1375);
				name();
				}
			}

			setState(1414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1381);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1378);
					match(K_PRIMARY);
					setState(1379);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1380);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1383);
				match(OPEN_PAR);
				setState(1384);
				indexed_column();
				setState(1389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1385);
					match(COMMA);
					setState(1386);
					indexed_column();
					}
					}
					setState(1391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1392);
				match(CLOSE_PAR);
				setState(1393);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1395);
				match(K_CHECK);
				setState(1396);
				match(OPEN_PAR);
				setState(1397);
				expr(0);
				setState(1398);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1400);
				match(K_FOREIGN);
				setState(1401);
				match(K_KEY);
				setState(1402);
				match(OPEN_PAR);
				setState(1403);
				column_name();
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1404);
					match(COMMA);
					setState(1405);
					column_name();
					}
					}
					setState(1410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1411);
				match(CLOSE_PAR);
				setState(1412);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(SQLiteParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(SQLiteParser.K_AS, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			match(K_WITH);
			setState(1418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1417);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1420);
			cte_table_name();
			setState(1421);
			match(K_AS);
			setState(1422);
			match(OPEN_PAR);
			setState(1423);
			select_stmt();
			setState(1424);
			match(CLOSE_PAR);
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1425);
				match(COMMA);
				setState(1426);
				cte_table_name();
				setState(1427);
				match(K_AS);
				setState(1428);
				match(OPEN_PAR);
				setState(1429);
				select_stmt();
				setState(1430);
				match(CLOSE_PAR);
				}
				}
				setState(1436);
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

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1437);
				database_name();
				setState(1438);
				match(DOT);
				}
				break;
			}
			setState(1442);
			table_name();
			setState(1448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1443);
				match(K_INDEXED);
				setState(1444);
				match(K_BY);
				setState(1445);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1446);
				match(K_NOT);
				setState(1447);
				match(K_INDEXED);
				}
				break;
			case SCOL:
			case K_LIMIT:
			case K_ORDER:
			case K_SET:
			case K_WHERE:
				break;
			default:
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

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			expr(0);
			setState(1453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1451);
				match(K_COLLATE);
				setState(1452);
				collation_name();
				}
			}

			setState(1456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1455);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_pragma_value);
		try {
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1458);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1459);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1460);
				match(STRING_LITERAL);
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

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			table_name();
			setState(1475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1464);
				match(OPEN_PAR);
				setState(1465);
				column_name();
				setState(1470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1466);
					match(COMMA);
					setState(1467);
					column_name();
					}
					}
					setState(1472);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1473);
				match(CLOSE_PAR);
				}
			}

			setState(1477);
			match(K_AS);
			setState(1478);
			match(OPEN_PAR);
			setState(1479);
			select_stmt();
			setState(1480);
			match(CLOSE_PAR);
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

	public static class Result_columnContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public DbColumnExprContext dbColumnExpr() {
			return getRuleContext(DbColumnExprContext.class,0);
		}
		public Count_functionContext count_function() {
			return getRuleContext(Count_functionContext.class,0);
		}
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_result_column);
		try {
			setState(1489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1482);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1483);
				table_name();
				setState(1484);
				match(DOT);
				setState(1485);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1487);
				dbColumnExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1488);
				count_function();
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_table_or_subquery);
		int _la;
		try {
			setState(1538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1491);
					database_name();
					setState(1492);
					match(DOT);
					}
					break;
				}
				setState(1496);
				table_name();
				setState(1501);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1498);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
					case 1:
						{
						setState(1497);
						match(K_AS);
						}
						break;
					}
					setState(1500);
					table_alias();
					}
					break;
				}
				setState(1508);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1503);
					match(K_INDEXED);
					setState(1504);
					match(K_BY);
					setState(1505);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1506);
					match(K_NOT);
					setState(1507);
					match(K_INDEXED);
					}
					break;
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case K_CROSS:
				case K_EXCEPT:
				case K_GROUP:
				case K_INNER:
				case K_INTERSECT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_NATURAL:
				case K_ON:
				case K_ORDER:
				case K_UNION:
				case K_USING:
				case K_WHERE:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1510);
				match(OPEN_PAR);
				setState(1520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1511);
					table_or_subquery();
					setState(1516);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1512);
						match(COMMA);
						setState(1513);
						table_or_subquery();
						}
						}
						setState(1518);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1519);
					join_clause();
					}
					break;
				}
				setState(1522);
				match(CLOSE_PAR);
				setState(1527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1524);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
					case 1:
						{
						setState(1523);
						match(K_AS);
						}
						break;
					}
					setState(1526);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1529);
				match(OPEN_PAR);
				setState(1530);
				select_stmt();
				setState(1531);
				match(CLOSE_PAR);
				setState(1536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1533);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
					case 1:
						{
						setState(1532);
						match(K_AS);
						}
						break;
					}
					setState(1535);
					table_alias();
					}
					break;
				}
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

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			table_or_subquery();
			setState(1547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (K_INNER - 88)) | (1L << (K_JOIN - 88)) | (1L << (K_LEFT - 88)) | (1L << (K_NATURAL - 88)))) != 0)) {
				{
				{
				setState(1541);
				join_operator();
				setState(1542);
				table_or_subquery();
				setState(1543);
				join_constraint();
				}
				}
				setState(1549);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_join_operator);
		int _la;
		try {
			setState(1563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1550);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1551);
					match(K_NATURAL);
					}
				}

				setState(1560);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1554);
					match(K_LEFT);
					setState(1556);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1555);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1558);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1559);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1562);
				match(K_JOIN);
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

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1565);
				match(K_ON);
				setState(1566);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1567);
				match(K_USING);
				setState(1568);
				match(OPEN_PAR);
				setState(1569);
				column_name();
				setState(1574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1570);
					match(COMMA);
					setState(1571);
					column_name();
					}
					}
					setState(1576);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1577);
				match(CLOSE_PAR);
				}
				break;
			case SCOL:
			case CLOSE_PAR:
			case COMMA:
			case K_CROSS:
			case K_EXCEPT:
			case K_GROUP:
			case K_INNER:
			case K_INTERSECT:
			case K_JOIN:
			case K_LEFT:
			case K_LIMIT:
			case K_NATURAL:
			case K_ORDER:
			case K_UNION:
			case K_WHERE:
				break;
			default:
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

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public Multi_from_clauseContext multi_from_clause() {
			return getRuleContext(Multi_from_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_select_core);
		int _la;
		try {
			setState(1644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1581);
				match(K_SELECT);
				setState(1583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1582);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1585);
				result_column();
				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1586);
					match(COMMA);
					setState(1587);
					result_column();
					}
					}
					setState(1592);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1593);
					multi_from_clause();
					}
				}

				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1596);
					match(K_WHERE);
					setState(1597);
					expr(0);
					}
				}

				setState(1614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1600);
					match(K_GROUP);
					setState(1601);
					match(K_BY);
					setState(1602);
					expr(0);
					setState(1607);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1603);
						match(COMMA);
						setState(1604);
						expr(0);
						}
						}
						setState(1609);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1612);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1610);
						match(K_HAVING);
						setState(1611);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1616);
				match(K_VALUES);
				setState(1617);
				match(OPEN_PAR);
				setState(1618);
				expr(0);
				setState(1623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1619);
					match(COMMA);
					setState(1620);
					expr(0);
					}
					}
					setState(1625);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1626);
				match(CLOSE_PAR);
				setState(1641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1627);
					match(COMMA);
					setState(1628);
					match(OPEN_PAR);
					setState(1629);
					expr(0);
					setState(1634);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1630);
						match(COMMA);
						setState(1631);
						expr(0);
						}
						}
						setState(1636);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1637);
					match(CLOSE_PAR);
					}
					}
					setState(1643);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Multi_from_clauseContext extends ParserRuleContext {
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Multi_from_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterMulti_from_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitMulti_from_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitMulti_from_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_from_clauseContext multi_from_clause() throws RecognitionException {
		Multi_from_clauseContext _localctx = new Multi_from_clauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_multi_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			match(K_FROM);
			setState(1656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1647);
				table_or_subquery();
				setState(1652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1648);
					match(COMMA);
					setState(1649);
					table_or_subquery();
					}
					}
					setState(1654);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1655);
				join_clause();
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

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_compound_operator);
		try {
			setState(1663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1658);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1659);
				match(K_UNION);
				setState(1660);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1661);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1662);
				match(K_EXCEPT);
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

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			table_name();
			setState(1677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1666);
				match(OPEN_PAR);
				setState(1667);
				column_name();
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1668);
					match(COMMA);
					setState(1669);
					column_name();
					}
					}
					setState(1674);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1675);
				match(CLOSE_PAR);
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1679);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1682);
			match(NUMERIC_LITERAL);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLiteParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (K_NULL - 105)) | (1L << (NUMERIC_LITERAL - 105)) | (1L << (STRING_LITERAL - 105)) | (1L << (BLOB_LITERAL - 105)))) != 0)) ) {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
			match(STRING_LITERAL);
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

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_module_argument);
		try {
			setState(1692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1690);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1691);
				column_def();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLiteParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLiteParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLiteParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLiteParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLiteParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLiteParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLiteParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLiteParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (K_ABORT - 25)) | (1L << (K_ACTION - 25)) | (1L << (K_ADD - 25)) | (1L << (K_AFTER - 25)) | (1L << (K_ALL - 25)) | (1L << (K_ALTER - 25)) | (1L << (K_ANALYZE - 25)) | (1L << (K_AND - 25)) | (1L << (K_AS - 25)) | (1L << (K_ASC - 25)) | (1L << (K_ATTACH - 25)) | (1L << (K_AUTOINCREMENT - 25)) | (1L << (K_BEFORE - 25)) | (1L << (K_BEGIN - 25)) | (1L << (K_BETWEEN - 25)) | (1L << (K_BY - 25)) | (1L << (K_CASCADE - 25)) | (1L << (K_CASE - 25)) | (1L << (K_CAST - 25)) | (1L << (K_CHECK - 25)) | (1L << (K_COLLATE - 25)) | (1L << (K_COLUMN - 25)) | (1L << (K_COMMIT - 25)) | (1L << (K_CONFLICT - 25)) | (1L << (K_CONSTRAINT - 25)) | (1L << (K_CREATE - 25)) | (1L << (K_CROSS - 25)) | (1L << (K_CURRENT_DATE - 25)) | (1L << (K_CURRENT_TIME - 25)) | (1L << (K_CURRENT_TIMESTAMP - 25)) | (1L << (K_DATABASE - 25)) | (1L << (K_DEFAULT - 25)) | (1L << (K_DEFERRABLE - 25)) | (1L << (K_DEFERRED - 25)) | (1L << (K_DELETE - 25)) | (1L << (K_DESC - 25)) | (1L << (K_DETACH - 25)) | (1L << (K_DISTINCT - 25)) | (1L << (K_DROP - 25)) | (1L << (K_EACH - 25)) | (1L << (K_ELSE - 25)) | (1L << (K_END - 25)) | (1L << (K_ESCAPE - 25)) | (1L << (K_EXCEPT - 25)) | (1L << (K_EXCLUSIVE - 25)) | (1L << (K_EXISTS - 25)) | (1L << (K_EXPLAIN - 25)) | (1L << (K_FAIL - 25)) | (1L << (K_FOR - 25)) | (1L << (K_FOREIGN - 25)) | (1L << (K_FROM - 25)) | (1L << (K_FULL - 25)) | (1L << (K_GLOB - 25)) | (1L << (K_GROUP - 25)) | (1L << (K_HAVING - 25)) | (1L << (K_IF - 25)) | (1L << (K_IGNORE - 25)) | (1L << (K_IMMEDIATE - 25)) | (1L << (K_IN - 25)) | (1L << (K_INDEX - 25)) | (1L << (K_INDEXED - 25)) | (1L << (K_INITIALLY - 25)) | (1L << (K_INNER - 25)))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INSERT - 89)) | (1L << (K_INSTEAD - 89)) | (1L << (K_INTERSECT - 89)) | (1L << (K_INTO - 89)) | (1L << (K_IS - 89)) | (1L << (K_ISNULL - 89)) | (1L << (K_JOIN - 89)) | (1L << (K_KEY - 89)) | (1L << (K_LEFT - 89)) | (1L << (K_LIKE - 89)) | (1L << (K_LIMIT - 89)) | (1L << (K_MATCH - 89)) | (1L << (K_NATURAL - 89)) | (1L << (K_NO - 89)) | (1L << (K_NOT - 89)) | (1L << (K_NOTNULL - 89)) | (1L << (K_NULL - 89)) | (1L << (K_OF - 89)) | (1L << (K_OFFSET - 89)) | (1L << (K_ON - 89)) | (1L << (K_OR - 89)) | (1L << (K_ORDER - 89)) | (1L << (K_OUTER - 89)) | (1L << (K_PLAN - 89)) | (1L << (K_PRAGMA - 89)) | (1L << (K_PRIMARY - 89)) | (1L << (K_QUERY - 89)) | (1L << (K_RAISE - 89)) | (1L << (K_RECURSIVE - 89)) | (1L << (K_REFERENCES - 89)) | (1L << (K_REGEXP - 89)) | (1L << (K_REINDEX - 89)) | (1L << (K_RELEASE - 89)) | (1L << (K_RENAME - 89)) | (1L << (K_REPLACE - 89)) | (1L << (K_RESTRICT - 89)) | (1L << (K_RIGHT - 89)) | (1L << (K_ROLLBACK - 89)) | (1L << (K_ROW - 89)) | (1L << (K_SAVEPOINT - 89)) | (1L << (K_SELECT - 89)) | (1L << (K_SET - 89)) | (1L << (K_TABLE - 89)) | (1L << (K_TEMP - 89)) | (1L << (K_TEMPORARY - 89)) | (1L << (K_THEN - 89)) | (1L << (K_TO - 89)) | (1L << (K_TRANSACTION - 89)) | (1L << (K_TRIGGER - 89)) | (1L << (K_UNION - 89)) | (1L << (K_UNIQUE - 89)) | (1L << (K_UPDATE - 89)) | (1L << (K_USING - 89)) | (1L << (K_VACUUM - 89)) | (1L << (K_VALUES - 89)) | (1L << (K_VIEW - 89)) | (1L << (K_VIRTUAL - 89)) | (1L << (K_WHEN - 89)) | (1L << (K_WHERE - 89)) | (1L << (K_WITH - 89)) | (1L << (K_WITHOUT - 89)))) != 0)) ) {
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			any_name();
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

	public static class Count_functionContext extends ParserRuleContext {
		public TerminalNode K_COUNT() { return getToken(SQLiteParser.K_COUNT, 0); }
		public DbColumnExprContext dbColumnExpr() {
			return getRuleContext(DbColumnExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public Distinct_keywordContext distinct_keyword() {
			return getRuleContext(Distinct_keywordContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Count_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCount_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCount_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCount_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Count_functionContext count_function() throws RecognitionException {
		Count_functionContext _localctx = new Count_functionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_count_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			match(K_COUNT);
			setState(1701);
			match(OPEN_PAR);
			setState(1707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(1703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1702);
					distinct_keyword();
					}
					break;
				}
				setState(1705);
				dbColumnExpr();
				}
				break;
			case 2:
				{
				setState(1706);
				match(STAR);
				}
				break;
			}
			setState(1709);
			match(CLOSE_PAR);
			setState(1714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1710);
					match(K_AS);
					}
				}

				setState(1713);
				column_alias();
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

	public static class And_keywordContext extends ParserRuleContext {
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public And_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAnd_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAnd_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAnd_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_keywordContext and_keyword() throws RecognitionException {
		And_keywordContext _localctx = new And_keywordContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_and_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
			match(K_AND);
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

	public static class Or_keywordContext extends ParserRuleContext {
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public Or_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterOr_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitOr_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitOr_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_keywordContext or_keyword() throws RecognitionException {
		Or_keywordContext _localctx = new Or_keywordContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			match(K_OR);
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

	public static class And_orContext extends ParserRuleContext {
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public And_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAnd_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAnd_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAnd_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_orContext and_or() throws RecognitionException {
		And_orContext _localctx = new And_orContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_and_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			_la = _input.LA(1);
			if ( !(_la==K_AND || _la==K_OR) ) {
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

	public static class Not_keywordContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Not_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterNot_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitNot_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitNot_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_keywordContext not_keyword() throws RecognitionException {
		Not_keywordContext _localctx = new Not_keywordContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_not_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			match(K_NOT);
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

	public static class In_keywordContext extends ParserRuleContext {
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public In_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIn_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIn_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIn_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_keywordContext in_keyword() throws RecognitionException {
		In_keywordContext _localctx = new In_keywordContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_in_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			match(K_IN);
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

	public static class Like_keywordContext extends ParserRuleContext {
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public Like_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_like_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterLike_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitLike_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitLike_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Like_keywordContext like_keyword() throws RecognitionException {
		Like_keywordContext _localctx = new Like_keywordContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_like_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			match(K_LIKE);
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

	public static class Distinct_keywordContext extends ParserRuleContext {
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public Distinct_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDistinct_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDistinct_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDistinct_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Distinct_keywordContext distinct_keyword() throws RecognitionException {
		Distinct_keywordContext _localctx = new Distinct_keywordContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_distinct_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			match(K_DISTINCT);
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			any_name();
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
			any_name();
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

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			any_name();
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

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			any_name();
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

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			any_name();
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

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			any_name();
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

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			any_name();
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			any_name();
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

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			any_name();
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

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			any_name();
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

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			any_name();
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

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			any_name();
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

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_any_name);
		try {
			setState(1769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1762);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1763);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1764);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1765);
				match(OPEN_PAR);
				setState(1766);
				any_name();
				setState(1767);
				match(CLOSE_PAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 41:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a0\u06ee\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\3\2\3\2\7\2\u00c3\n\2\f\2\16\2\u00c6\13\2\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\7\4\u00cf\n\4\f\4\16\4\u00d2\13\4\3\5\3\5\3\5\5\5\u00d7\n\5\5\5\u00d9"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00f9\n\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0104\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u010c\n\7\3\7\5\7\u010f\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0118"+
		"\n\b\3\t\3\t\5\t\u011c\n\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u0124\n\n\3\n\3"+
		"\n\5\n\u0128\n\n\5\n\u012a\n\n\3\13\3\13\3\13\5\13\u012f\n\13\5\13\u0131"+
		"\n\13\3\f\3\f\5\f\u0135\n\f\3\f\3\f\3\f\7\f\u013a\n\f\f\f\16\f\u013d\13"+
		"\f\5\f\u013f\n\f\3\f\3\f\3\f\5\f\u0144\n\f\3\f\3\f\5\f\u0148\n\f\3\f\6"+
		"\f\u014b\n\f\r\f\16\f\u014c\3\f\3\f\3\f\3\f\3\f\7\f\u0154\n\f\f\f\16\f"+
		"\u0157\13\f\5\f\u0159\n\f\3\f\3\f\3\f\3\f\5\f\u015f\n\f\5\f\u0161\n\f"+
		"\3\r\3\r\5\r\u0165\n\r\3\r\3\r\3\r\3\r\5\r\u016b\n\r\3\r\3\r\3\r\5\r\u0170"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0179\n\r\f\r\16\r\u017c\13\r\3\r"+
		"\3\r\3\r\5\r\u0181\n\r\3\16\3\16\5\16\u0185\n\16\3\16\3\16\3\16\3\16\5"+
		"\16\u018b\n\16\3\16\3\16\3\16\5\16\u0190\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u0197\n\16\f\16\16\16\u019a\13\16\3\16\3\16\7\16\u019e\n\16\f\16"+
		"\16\16\u01a1\13\16\3\16\3\16\3\16\5\16\u01a6\n\16\3\16\3\16\5\16\u01aa"+
		"\n\16\3\17\3\17\5\17\u01ae\n\17\3\17\3\17\3\17\3\17\5\17\u01b4\n\17\3"+
		"\17\3\17\3\17\5\17\u01b9\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u01c0\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01c9\n\17\f\17\16\17\u01cc\13"+
		"\17\5\17\u01ce\n\17\5\17\u01d0\n\17\3\17\3\17\3\17\3\17\5\17\u01d6\n\17"+
		"\3\17\3\17\3\17\3\17\5\17\u01dc\n\17\3\17\3\17\5\17\u01e0\n\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u01e7\n\17\3\17\3\17\6\17\u01eb\n\17\r\17\16\17"+
		"\u01ec\3\17\3\17\3\20\3\20\5\20\u01f3\n\20\3\20\3\20\3\20\3\20\5\20\u01f9"+
		"\n\20\3\20\3\20\3\20\5\20\u01fe\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u020a\n\21\3\21\3\21\3\21\5\21\u020f\n\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\7\21\u0218\n\21\f\21\16\21\u021b\13\21\3"+
		"\21\3\21\5\21\u021f\n\21\3\22\5\22\u0222\n\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0228\n\22\3\23\5\23\u022b\n\23\3\23\3\23\3\23\3\23\5\23\u0231\n\23\3"+
		"\23\3\23\3\23\3\23\3\23\7\23\u0238\n\23\f\23\16\23\u023b\13\23\5\23\u023d"+
		"\n\23\3\23\3\23\3\23\3\23\5\23\u0243\n\23\5\23\u0245\n\23\3\24\3\24\3"+
		"\24\3\25\3\25\5\25\u024c\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0254"+
		"\n\26\3\26\3\26\3\26\5\26\u0259\n\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27"+
		"\u0261\n\27\3\27\3\27\3\27\5\27\u0266\n\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\5\30\u026e\n\30\3\30\3\30\3\30\5\30\u0273\n\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\5\31\u027b\n\31\3\31\3\31\3\31\5\31\u0280\n\31\3\31\3\31\3"+
		"\32\3\32\5\32\u0286\n\32\3\32\3\32\3\32\7\32\u028b\n\32\f\32\16\32\u028e"+
		"\13\32\5\32\u0290\n\32\3\32\3\32\3\32\3\32\7\32\u0296\n\32\f\32\16\32"+
		"\u0299\13\32\3\32\3\32\3\32\3\32\3\32\7\32\u02a0\n\32\f\32\16\32\u02a3"+
		"\13\32\5\32\u02a5\n\32\3\32\3\32\3\32\3\32\5\32\u02ab\n\32\5\32\u02ad"+
		"\n\32\3\33\5\33\u02b0\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02c3\n\33\3\33\3\33\3\33"+
		"\3\33\5\33\u02c9\n\33\3\33\3\33\3\33\3\33\3\33\7\33\u02d0\n\33\f\33\16"+
		"\33\u02d3\13\33\3\33\3\33\5\33\u02d7\n\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u02de\n\33\f\33\16\33\u02e1\13\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u02e9\n\33\f\33\16\33\u02ec\13\33\3\33\3\33\7\33\u02f0\n\33\f\33\16\33"+
		"\u02f3\13\33\3\33\3\33\3\33\5\33\u02f8\n\33\3\34\3\34\3\34\3\34\5\34\u02fe"+
		"\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0307\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u030e\n\35\3\35\3\35\5\35\u0312\n\35\5\35\u0314\n\35\3"+
		"\36\3\36\5\36\u0318\n\36\3\36\3\36\3\37\3\37\3\37\5\37\u031f\n\37\5\37"+
		"\u0321\n\37\3\37\3\37\5\37\u0325\n\37\3\37\5\37\u0328\n\37\3 \3 \3 \3"+
		"!\3!\5!\u032f\n!\3!\3!\3!\7!\u0334\n!\f!\16!\u0337\13!\5!\u0339\n!\3!"+
		"\3!\3!\3!\3!\3!\7!\u0341\n!\f!\16!\u0344\13!\5!\u0346\n!\3!\3!\3!\3!\5"+
		"!\u034c\n!\5!\u034e\n!\3\"\3\"\5\"\u0352\n\"\3\"\3\"\3\"\7\"\u0357\n\""+
		"\f\"\16\"\u035a\13\"\5\"\u035c\n\"\3\"\3\"\3\"\3\"\7\"\u0362\n\"\f\"\16"+
		"\"\u0365\13\"\3\"\3\"\3\"\3\"\3\"\7\"\u036c\n\"\f\"\16\"\u036f\13\"\5"+
		"\"\u0371\n\"\3\"\3\"\3\"\3\"\5\"\u0377\n\"\5\"\u0379\n\"\3#\3#\5#\u037d"+
		"\n#\3#\3#\3#\7#\u0382\n#\f#\16#\u0385\13#\3#\5#\u0388\n#\3#\3#\5#\u038c"+
		"\n#\3#\3#\3#\3#\3#\7#\u0393\n#\f#\16#\u0396\13#\3#\3#\5#\u039a\n#\5#\u039c"+
		"\n#\3#\3#\3#\3#\3#\7#\u03a3\n#\f#\16#\u03a6\13#\3#\3#\3#\3#\3#\3#\7#\u03ae"+
		"\n#\f#\16#\u03b1\13#\3#\3#\7#\u03b5\n#\f#\16#\u03b8\13#\5#\u03ba\n#\3"+
		"$\5$\u03bd\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u03ca\n$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\7$\u03d6\n$\f$\16$\u03d9\13$\3$\3$\5$\u03dd\n$\3%"+
		"\5%\u03e0\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u03ed\n%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\7%\u03f9\n%\f%\16%\u03fc\13%\3%\3%\5%\u0400\n%\3%\3"+
		"%\3%\3%\3%\7%\u0407\n%\f%\16%\u040a\13%\5%\u040c\n%\3%\3%\3%\3%\5%\u0412"+
		"\n%\5%\u0414\n%\3&\3&\3\'\3\'\5\'\u041a\n\'\3\'\7\'\u041d\n\'\f\'\16\'"+
		"\u0420\13\'\3(\6(\u0423\n(\r(\16(\u0424\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\5(\u0431\n(\3)\3)\5)\u0435\n)\3)\3)\3)\5)\u043a\n)\3)\3)\5)\u043e\n)"+
		"\3)\5)\u0441\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0453"+
		"\n)\3)\3)\3)\5)\u0458\n)\3*\3*\3*\5*\u045d\n*\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\5+\u046a\n+\3+\3+\3+\7+\u046f\n+\f+\16+\u0472\13+\3+\5+\u0475"+
		"\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0485\n+\3+\5+\u0488"+
		"\n+\3+\3+\3+\3+\3+\3+\5+\u0490\n+\3+\3+\3+\3+\3+\6+\u0497\n+\r+\16+\u0498"+
		"\3+\3+\5+\u049d\n+\3+\3+\3+\5+\u04a2\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u04be\n+\3+\3+\3+"+
		"\5+\u04c3\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u04cf\n+\3+\3+\3+\3+\5+"+
		"\u04d5\n+\3+\3+\3+\3+\3+\5+\u04dc\n+\3+\3+\5+\u04e0\n+\3+\3+\3+\3+\3+"+
		"\3+\7+\u04e8\n+\f+\16+\u04eb\13+\5+\u04ed\n+\3+\3+\3+\3+\5+\u04f3\n+\3"+
		"+\5+\u04f6\n+\7+\u04f8\n+\f+\16+\u04fb\13+\3,\3,\3,\3,\5,\u0501\n,\3,"+
		"\3,\3,\5,\u0506\n,\3,\3,\5,\u050a\n,\3,\5,\u050d\n,\5,\u050f\n,\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u051d\n-\3.\3.\3.\3.\3.\3.\7.\u0525"+
		"\n.\f.\16.\u0528\13.\3.\3.\5.\u052c\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5"+
		".\u0538\n.\3.\3.\5.\u053c\n.\7.\u053e\n.\f.\16.\u0541\13.\3.\5.\u0544"+
		"\n.\3.\3.\3.\3.\3.\5.\u054b\n.\5.\u054d\n.\3/\3/\3/\3/\3/\3/\5/\u0555"+
		"\n/\3/\3/\3\60\3\60\3\60\5\60\u055c\n\60\3\60\5\60\u055f\n\60\3\61\3\61"+
		"\5\61\u0563\n\61\3\61\3\61\3\61\5\61\u0568\n\61\3\61\3\61\3\61\3\61\7"+
		"\61\u056e\n\61\f\61\16\61\u0571\13\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0581\n\61\f\61\16\61\u0584"+
		"\13\61\3\61\3\61\3\61\5\61\u0589\n\61\3\62\3\62\5\62\u058d\n\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u059b\n\62"+
		"\f\62\16\62\u059e\13\62\3\63\3\63\3\63\5\63\u05a3\n\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u05ab\n\63\3\64\3\64\3\64\5\64\u05b0\n\64\3\64\5"+
		"\64\u05b3\n\64\3\65\3\65\3\65\5\65\u05b8\n\65\3\66\3\66\3\66\3\66\3\66"+
		"\7\66\u05bf\n\66\f\66\16\66\u05c2\13\66\3\66\3\66\5\66\u05c6\n\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u05d4\n\67"+
		"\38\38\38\58\u05d9\n8\38\38\58\u05dd\n8\38\58\u05e0\n8\38\38\38\38\38"+
		"\58\u05e7\n8\38\38\38\38\78\u05ed\n8\f8\168\u05f0\138\38\58\u05f3\n8\3"+
		"8\38\58\u05f7\n8\38\58\u05fa\n8\38\38\38\38\58\u0600\n8\38\58\u0603\n"+
		"8\58\u0605\n8\39\39\39\39\39\79\u060c\n9\f9\169\u060f\139\3:\3:\5:\u0613"+
		"\n:\3:\3:\5:\u0617\n:\3:\3:\5:\u061b\n:\3:\5:\u061e\n:\3;\3;\3;\3;\3;"+
		"\3;\3;\7;\u0627\n;\f;\16;\u062a\13;\3;\3;\5;\u062e\n;\3<\3<\5<\u0632\n"+
		"<\3<\3<\3<\7<\u0637\n<\f<\16<\u063a\13<\3<\5<\u063d\n<\3<\3<\5<\u0641"+
		"\n<\3<\3<\3<\3<\3<\7<\u0648\n<\f<\16<\u064b\13<\3<\3<\5<\u064f\n<\5<\u0651"+
		"\n<\3<\3<\3<\3<\3<\7<\u0658\n<\f<\16<\u065b\13<\3<\3<\3<\3<\3<\3<\7<\u0663"+
		"\n<\f<\16<\u0666\13<\3<\3<\7<\u066a\n<\f<\16<\u066d\13<\5<\u066f\n<\3"+
		"=\3=\3=\3=\7=\u0675\n=\f=\16=\u0678\13=\3=\5=\u067b\n=\3>\3>\3>\3>\3>"+
		"\5>\u0682\n>\3?\3?\3?\3?\3?\7?\u0689\n?\f?\16?\u068c\13?\3?\3?\5?\u0690"+
		"\n?\3@\5@\u0693\n@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\5D\u069f\nD\3E\3E\3F"+
		"\3F\3G\3G\3H\3H\3H\5H\u06aa\nH\3H\3H\5H\u06ae\nH\3H\3H\5H\u06b2\nH\3H"+
		"\5H\u06b5\nH\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R"+
		"\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3"+
		"]\3^\3^\3_\3_\3`\3`\3`\3`\3`\3`\3`\5`\u06ec\n`\3`\2\3Ta\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\2\25\5\2"+
		"==HHUU\4\2\61\61EE\4\2\7\7mm\3\2\u0086\u0087\4\2\37\37AA\4\2$$??\7\2\33"+
		"\33KKTT}}\u0080\u0080\4\2\t\t\16\17\3\2\n\13\3\2\20\23\3\2\24\27\6\2P"+
		"Pddffyy\4\2>>\u008e\u008e\5\2\33\33KK\u0080\u0080\6\2\679kk\u0099\u0099"+
		"\u009b\u009c\4\2\n\fii\4\2\u0098\u0098\u009b\u009b\4\2\33\63\65\u0097"+
		"\4\2\"\"oo\2\u07f0\2\u00c4\3\2\2\2\4\u00c9\3\2\2\2\6\u00cc\3\2\2\2\b\u00d8"+
		"\3\2\2\2\n\u00fc\3\2\2\2\f\u00fe\3\2\2\2\16\u0110\3\2\2\2\20\u0119\3\2"+
		"\2\2\22\u0121\3\2\2\2\24\u012b\3\2\2\2\26\u013e\3\2\2\2\30\u0162\3\2\2"+
		"\2\32\u0182\3\2\2\2\34\u01ab\3\2\2\2\36\u01f0\3\2\2\2 \u0203\3\2\2\2\""+
		"\u0221\3\2\2\2$\u022a\3\2\2\2&\u0246\3\2\2\2(\u0249\3\2\2\2*\u024f\3\2"+
		"\2\2,\u025c\3\2\2\2.\u0269\3\2\2\2\60\u0276\3\2\2\2\62\u028f\3\2\2\2\64"+
		"\u02af\3\2\2\2\66\u02f9\3\2\2\28\u0308\3\2\2\2:\u0315\3\2\2\2<\u031b\3"+
		"\2\2\2>\u0329\3\2\2\2@\u0338\3\2\2\2B\u035b\3\2\2\2D\u03b9\3\2\2\2F\u03bc"+
		"\3\2\2\2H\u03df\3\2\2\2J\u0415\3\2\2\2L\u0417\3\2\2\2N\u0422\3\2\2\2P"+
		"\u0434\3\2\2\2R\u045c\3\2\2\2T\u04a1\3\2\2\2V\u050e\3\2\2\2X\u051c\3\2"+
		"\2\2Z\u051e\3\2\2\2\\\u054e\3\2\2\2^\u0558\3\2\2\2`\u0562\3\2\2\2b\u058a"+
		"\3\2\2\2d\u05a2\3\2\2\2f\u05ac\3\2\2\2h\u05b7\3\2\2\2j\u05b9\3\2\2\2l"+
		"\u05d3\3\2\2\2n\u0604\3\2\2\2p\u0606\3\2\2\2r\u061d\3\2\2\2t\u062d\3\2"+
		"\2\2v\u066e\3\2\2\2x\u0670\3\2\2\2z\u0681\3\2\2\2|\u0683\3\2\2\2~\u0692"+
		"\3\2\2\2\u0080\u0696\3\2\2\2\u0082\u0698\3\2\2\2\u0084\u069a\3\2\2\2\u0086"+
		"\u069e\3\2\2\2\u0088\u06a0\3\2\2\2\u008a\u06a2\3\2\2\2\u008c\u06a4\3\2"+
		"\2\2\u008e\u06a6\3\2\2\2\u0090\u06b6\3\2\2\2\u0092\u06b8\3\2\2\2\u0094"+
		"\u06ba\3\2\2\2\u0096\u06bc\3\2\2\2\u0098\u06be\3\2\2\2\u009a\u06c0\3\2"+
		"\2\2\u009c\u06c2\3\2\2\2\u009e\u06c4\3\2\2\2\u00a0\u06c6\3\2\2\2\u00a2"+
		"\u06c8\3\2\2\2\u00a4\u06ca\3\2\2\2\u00a6\u06cc\3\2\2\2\u00a8\u06ce\3\2"+
		"\2\2\u00aa\u06d0\3\2\2\2\u00ac\u06d2\3\2\2\2\u00ae\u06d4\3\2\2\2\u00b0"+
		"\u06d6\3\2\2\2\u00b2\u06d8\3\2\2\2\u00b4\u06da\3\2\2\2\u00b6\u06dc\3\2"+
		"\2\2\u00b8\u06de\3\2\2\2\u00ba\u06e0\3\2\2\2\u00bc\u06e2\3\2\2\2\u00be"+
		"\u06eb\3\2\2\2\u00c0\u00c3\5\6\4\2\u00c1\u00c3\5\4\3\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\2"+
		"\2\3\u00c8\3\3\2\2\2\u00c9\u00ca\7\u00a0\2\2\u00ca\u00cb\b\3\1\2\u00cb"+
		"\5\3\2\2\2\u00cc\u00d0\5\b\5\2\u00cd\u00cf\5\b\5\2\u00ce\u00cd\3\2\2\2"+
		"\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\7\3"+
		"\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\7J\2\2\u00d4\u00d5\7u\2\2\u00d5"+
		"\u00d7\7r\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00f8\3\2\2\2\u00da"+
		"\u00f9\5\f\7\2\u00db\u00f9\5\16\b\2\u00dc\u00f9\5\20\t\2\u00dd\u00f9\5"+
		"\22\n\2\u00de\u00f9\5\24\13\2\u00df\u00f9\5\26\f\2\u00e0\u00f9\5\30\r"+
		"\2\u00e1\u00f9\5\32\16\2\u00e2\u00f9\5\34\17\2\u00e3\u00f9\5\36\20\2\u00e4"+
		"\u00f9\5 \21\2\u00e5\u00f9\5\"\22\2\u00e6\u00f9\5$\23\2\u00e7\u00f9\5"+
		"(\25\2\u00e8\u00f9\5*\26\2\u00e9\u00f9\5,\27\2\u00ea\u00f9\5.\30\2\u00eb"+
		"\u00f9\5\60\31\2\u00ec\u00f9\5\62\32\2\u00ed\u00f9\5\64\33\2\u00ee\u00f9"+
		"\5\66\34\2\u00ef\u00f9\58\35\2\u00f0\u00f9\5:\36\2\u00f1\u00f9\5<\37\2"+
		"\u00f2\u00f9\5> \2\u00f3\u00f9\5@!\2\u00f4\u00f9\5B\"\2\u00f5\u00f9\5"+
		"F$\2\u00f6\u00f9\5H%\2\u00f7\u00f9\5J&\2\u00f8\u00da\3\2\2\2\u00f8\u00db"+
		"\3\2\2\2\u00f8\u00dc\3\2\2\2\u00f8\u00dd\3\2\2\2\u00f8\u00de\3\2\2\2\u00f8"+
		"\u00df\3\2\2\2\u00f8\u00e0\3\2\2\2\u00f8\u00e1\3\2\2\2\u00f8\u00e2\3\2"+
		"\2\2\u00f8\u00e3\3\2\2\2\u00f8\u00e4\3\2\2\2\u00f8\u00e5\3\2\2\2\u00f8"+
		"\u00e6\3\2\2\2\u00f8\u00e7\3\2\2\2\u00f8\u00e8\3\2\2\2\u00f8\u00e9\3\2"+
		"\2\2\u00f8\u00ea\3\2\2\2\u00f8\u00eb\3\2\2\2\u00f8\u00ec\3\2\2\2\u00f8"+
		"\u00ed\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f8\u00f0\3\2"+
		"\2\2\u00f8\u00f1\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8"+
		"\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\5\n\6\2\u00fb\t\3\2\2\2\u00fc\u00fd"+
		"\7\3\2\2\u00fd\13\3\2\2\2\u00fe\u00ff\7 \2\2\u00ff\u0103\7\u0085\2\2\u0100"+
		"\u0101\5\u00a0Q\2\u0101\u0102\7\4\2\2\u0102\u0104\3\2\2\2\u0103\u0100"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010e\5\u00a2R"+
		"\2\u0106\u0107\7|\2\2\u0107\u0108\7\u0089\2\2\u0108\u010f\5\u00a6T\2\u0109"+
		"\u010b\7\35\2\2\u010a\u010c\7\60\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3"+
		"\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\5L\'\2\u010e\u0106\3\2\2\2\u010e"+
		"\u0109\3\2\2\2\u010f\r\3\2\2\2\u0110\u0117\7!\2\2\u0111\u0118\5\u00a0"+
		"Q\2\u0112\u0118\5\u00a4S\2\u0113\u0114\5\u00a0Q\2\u0114\u0115\7\4\2\2"+
		"\u0115\u0116\5\u00a4S\2\u0116\u0118\3\2\2\2\u0117\u0111\3\2\2\2\u0117"+
		"\u0112\3\2\2\2\u0117\u0113\3\2\2\2\u0117\u0118\3\2\2\2\u0118\17\3\2\2"+
		"\2\u0119\u011b\7%\2\2\u011a\u011c\7:\2\2\u011b\u011a\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\5T+\2\u011e\u011f\7#\2\2\u011f"+
		"\u0120\5\u00a0Q\2\u0120\21\3\2\2\2\u0121\u0123\7(\2\2\u0122\u0124\t\2"+
		"\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0129\3\2\2\2\u0125"+
		"\u0127\7\u008a\2\2\u0126\u0128\5\u00bc_\2\u0127\u0126\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0125\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\23\3\2\2\2\u012b\u0130\t\3\2\2\u012c\u012e\7\u008a\2\2\u012d\u012f\5"+
		"\u00bc_\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2"+
		"\u0130\u012c\3\2\2\2\u0130\u0131\3\2\2\2\u0131\25\3\2\2\2\u0132\u0134"+
		"\7\u0096\2\2\u0133\u0135\7w\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2"+
		"\2\u0135\u0136\3\2\2\2\u0136\u013b\5j\66\2\u0137\u0138\7\7\2\2\u0138\u013a"+
		"\5j\66\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0132\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u014a\5v<\2\u0141\u0143"+
		"\7\u008c\2\2\u0142\u0144\7\37\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0148\3\2\2\2\u0145\u0148\7]\2\2\u0146\u0148\7G\2\2\u0147\u0141"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014b\5v<\2\u014a\u0147\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2"+
		"\2\u014c\u014d\3\2\2\2\u014d\u0158\3\2\2\2\u014e\u014f\7p\2\2\u014f\u0150"+
		"\7*\2\2\u0150\u0155\5f\64\2\u0151\u0152\7\7\2\2\u0152\u0154\5f\64\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u014e\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u0160\3\2\2\2\u015a\u015b\7e\2\2\u015b\u015e\5T+"+
		"\2\u015c\u015d\t\4\2\2\u015d\u015f\5T+\2\u015e\u015c\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015a\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\27\3\2\2\2\u0162\u0164\7\65\2\2\u0163\u0165\7\u008d\2\2\u0164\u0163\3"+
		"\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016a\7W\2\2\u0167"+
		"\u0168\7S\2\2\u0168\u0169\7i\2\2\u0169\u016b\7I\2\2\u016a\u0167\3\2\2"+
		"\2\u016a\u016b\3\2\2\2\u016b\u016f\3\2\2\2\u016c\u016d\5\u00a0Q\2\u016d"+
		"\u016e\7\4\2\2\u016e\u0170\3\2\2\2\u016f\u016c\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0172\5\u00aeX\2\u0172\u0173\7n\2\2\u0173"+
		"\u0174\5\u00a2R\2\u0174\u0175\7\5\2\2\u0175\u017a\5^\60\2\u0176\u0177"+
		"\7\7\2\2\u0177\u0179\5^\60\2\u0178\u0176\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017d\u0180\7\6\2\2\u017e\u017f\7\u0095\2\2\u017f\u0181\5T+\2\u0180"+
		"\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\31\3\2\2\2\u0182\u0184\7\65\2"+
		"\2\u0183\u0185\t\5\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u018a\7\u0085\2\2\u0187\u0188\7S\2\2\u0188\u0189\7i\2\2"+
		"\u0189\u018b\7I\2\2\u018a\u0187\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018f"+
		"\3\2\2\2\u018c\u018d\5\u00a0Q\2\u018d\u018e\7\4\2\2\u018e\u0190\3\2\2"+
		"\2\u018f\u018c\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u01a9"+
		"\5\u00a2R\2\u0192\u0193\7\5\2\2\u0193\u0198\5L\'\2\u0194\u0195\7\7\2\2"+
		"\u0195\u0197\5L\'\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019f\3\2\2\2\u019a\u0198\3\2\2\2\u019b"+
		"\u019c\7\7\2\2\u019c\u019e\5`\61\2\u019d\u019b\3\2\2\2\u019e\u01a1\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a2\u01a5\7\6\2\2\u01a3\u01a4\7\u0097\2\2\u01a4\u01a6"+
		"\7\u0098\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01aa\3\2\2"+
		"\2\u01a7\u01a8\7#\2\2\u01a8\u01aa\5B\"\2\u01a9\u0192\3\2\2\2\u01a9\u01a7"+
		"\3\2\2\2\u01aa\33\3\2\2\2\u01ab\u01ad\7\65\2\2\u01ac\u01ae\t\5\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b3\7\u008b"+
		"\2\2\u01b0\u01b1\7S\2\2\u01b1\u01b2\7i\2\2\u01b2\u01b4\7I\2\2\u01b3\u01b0"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b8\3\2\2\2\u01b5\u01b6\5\u00a0Q"+
		"\2\u01b6\u01b7\7\4\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bf\5\u00b0Y\2\u01bb\u01c0\7\'\2"+
		"\2\u01bc\u01c0\7\36\2\2\u01bd\u01be\7\\\2\2\u01be\u01c0\7l\2\2\u01bf\u01bb"+
		"\3\2\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01cf\3\2\2\2\u01c1\u01d0\7>\2\2\u01c2\u01d0\7[\2\2\u01c3\u01cd\7\u008e"+
		"\2\2\u01c4\u01c5\7l\2\2\u01c5\u01ca\5\u00a8U\2\u01c6\u01c7\7\7\2\2\u01c7"+
		"\u01c9\5\u00a8U\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd"+
		"\u01c4\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01c1\3\2"+
		"\2\2\u01cf\u01c2\3\2\2\2\u01cf\u01c3\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d5\7n\2\2\u01d2\u01d3\5\u00a0Q\2\u01d3\u01d4\7\4\2\2\u01d4\u01d6\3"+
		"\2\2\2\u01d5\u01d2\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01db\5\u00a2R\2\u01d8\u01d9\7L\2\2\u01d9\u01da\7C\2\2\u01da\u01dc\7"+
		"\u0081\2\2\u01db\u01d8\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01df\3\2\2\2"+
		"\u01dd\u01de\7\u0094\2\2\u01de\u01e0\5T+\2\u01df\u01dd\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01ea\7(\2\2\u01e2\u01e7\5F$\2\u01e3"+
		"\u01e7\5\64\33\2\u01e4\u01e7\5\"\22\2\u01e5\u01e7\5B\"\2\u01e6\u01e2\3"+
		"\2\2\2\u01e6\u01e3\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e9\7\3\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e6\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01ef\7E\2\2\u01ef\35\3\2\2\2\u01f0\u01f2\7\65\2"+
		"\2\u01f1\u01f3\t\5\2\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4"+
		"\3\2\2\2\u01f4\u01f8\7\u0092\2\2\u01f5\u01f6\7S\2\2\u01f6\u01f7\7i\2\2"+
		"\u01f7\u01f9\7I\2\2\u01f8\u01f5\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fd"+
		"\3\2\2\2\u01fa\u01fb\5\u00a0Q\2\u01fb\u01fc\7\4\2\2\u01fc\u01fe\3\2\2"+
		"\2\u01fd\u01fa\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200"+
		"\5\u00b2Z\2\u0200\u0201\7#\2\2\u0201\u0202\5B\"\2\u0202\37\3\2\2\2\u0203"+
		"\u0204\7\65\2\2\u0204\u0205\7\u0093\2\2\u0205\u0209\7\u0085\2\2\u0206"+
		"\u0207\7S\2\2\u0207\u0208\7i\2\2\u0208\u020a\7I\2\2\u0209\u0206\3\2\2"+
		"\2\u0209\u020a\3\2\2\2\u020a\u020e\3\2\2\2\u020b\u020c\5\u00a0Q\2\u020c"+
		"\u020d\7\4\2\2\u020d\u020f\3\2\2\2\u020e\u020b\3\2\2\2\u020e\u020f\3\2"+
		"\2\2\u020f\u0210\3\2\2\2\u0210\u0211\5\u00a2R\2\u0211\u0212\7\u008f\2"+
		"\2\u0212\u021e\5\u00b4[\2\u0213\u0214\7\5\2\2\u0214\u0219\5\u0086D\2\u0215"+
		"\u0216\7\7\2\2\u0216\u0218\5\u0086D\2\u0217\u0215\3\2\2\2\u0218\u021b"+
		"\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021c\u021d\7\6\2\2\u021d\u021f\3\2\2\2\u021e\u0213\3\2"+
		"\2\2\u021e\u021f\3\2\2\2\u021f!\3\2\2\2\u0220\u0222\5b\62\2\u0221\u0220"+
		"\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\7>\2\2\u0224"+
		"\u0227\5&\24\2\u0225\u0226\7\u0095\2\2\u0226\u0228\5T+\2\u0227\u0225\3"+
		"\2\2\2\u0227\u0228\3\2\2\2\u0228#\3\2\2\2\u0229\u022b\5b\62\2\u022a\u0229"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\7>\2\2\u022d"+
		"\u0230\5&\24\2\u022e\u022f\7\u0095\2\2\u022f\u0231\5T+\2\u0230\u022e\3"+
		"\2\2\2\u0230\u0231\3\2\2\2\u0231\u0244\3\2\2\2\u0232\u0233\7p\2\2\u0233"+
		"\u0234\7*\2\2\u0234\u0239\5f\64\2\u0235\u0236\7\7\2\2\u0236\u0238\5f\64"+
		"\2\u0237\u0235\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a"+
		"\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u0232\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\7e\2\2\u023f\u0242\5T+"+
		"\2\u0240\u0241\t\4\2\2\u0241\u0243\5T+\2\u0242\u0240\3\2\2\2\u0242\u0243"+
		"\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u023c\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"%\3\2\2\2\u0246\u0247\7N\2\2\u0247\u0248\5d\63\2\u0248\'\3\2\2\2\u0249"+
		"\u024b\7@\2\2\u024a\u024c\7:\2\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2"+
		"\2\u024c\u024d\3\2\2\2\u024d\u024e\5\u00a0Q\2\u024e)\3\2\2\2\u024f\u0250"+
		"\7B\2\2\u0250\u0253\7W\2\2\u0251\u0252\7S\2\2\u0252\u0254\7I\2\2\u0253"+
		"\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0258\3\2\2\2\u0255\u0256\5\u00a0"+
		"Q\2\u0256\u0257\7\4\2\2\u0257\u0259\3\2\2\2\u0258\u0255\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\5\u00aeX\2\u025b+\3\2\2"+
		"\2\u025c\u025d\7B\2\2\u025d\u0260\7\u0085\2\2\u025e\u025f\7S\2\2\u025f"+
		"\u0261\7I\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0265\3\2"+
		"\2\2\u0262\u0263\5\u00a0Q\2\u0263\u0264\7\4\2\2\u0264\u0266\3\2\2\2\u0265"+
		"\u0262\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\5\u00a2"+
		"R\2\u0268-\3\2\2\2\u0269\u026a\7B\2\2\u026a\u026d\7\u008b\2\2\u026b\u026c"+
		"\7S\2\2\u026c\u026e\7I\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u0272\3\2\2\2\u026f\u0270\5\u00a0Q\2\u0270\u0271\7\4\2\2\u0271\u0273"+
		"\3\2\2\2\u0272\u026f\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\u0275\5\u00b0Y\2\u0275/\3\2\2\2\u0276\u0277\7B\2\2\u0277\u027a\7\u0092"+
		"\2\2\u0278\u0279\7S\2\2\u0279\u027b\7I\2\2\u027a\u0278\3\2\2\2\u027a\u027b"+
		"\3\2\2\2\u027b\u027f\3\2\2\2\u027c\u027d\5\u00a0Q\2\u027d\u027e\7\4\2"+
		"\2\u027e\u0280\3\2\2\2\u027f\u027c\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281"+
		"\3\2\2\2\u0281\u0282\5\u00b2Z\2\u0282\61\3\2\2\2\u0283\u0285\7\u0096\2"+
		"\2\u0284\u0286\7w\2\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287"+
		"\3\2\2\2\u0287\u028c\5j\66\2\u0288\u0289\7\7\2\2\u0289\u028b\5j\66\2\u028a"+
		"\u0288\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2"+
		"\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0283\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0297\5v<\2\u0292\u0293\5z>\2"+
		"\u0293\u0294\5v<\2\u0294\u0296\3\2\2\2\u0295\u0292\3\2\2\2\u0296\u0299"+
		"\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u02a4\3\2\2\2\u0299"+
		"\u0297\3\2\2\2\u029a\u029b\7p\2\2\u029b\u029c\7*\2\2\u029c\u02a1\5f\64"+
		"\2\u029d\u029e\7\7\2\2\u029e\u02a0\5f\64\2\u029f\u029d\3\2\2\2\u02a0\u02a3"+
		"\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3"+
		"\u02a1\3\2\2\2\u02a4\u029a\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02ac\3\2"+
		"\2\2\u02a6\u02a7\7e\2\2\u02a7\u02aa\5T+\2\u02a8\u02a9\t\4\2\2\u02a9\u02ab"+
		"\5T+\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac"+
		"\u02a6\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\63\3\2\2\2\u02ae\u02b0\5b\62"+
		"\2\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02c2\3\2\2\2\u02b1\u02c3"+
		"\7[\2\2\u02b2\u02c3\7}\2\2\u02b3\u02b4\7[\2\2\u02b4\u02b5\7o\2\2\u02b5"+
		"\u02c3\7}\2\2\u02b6\u02b7\7[\2\2\u02b7\u02b8\7o\2\2\u02b8\u02c3\7\u0080"+
		"\2\2\u02b9\u02ba\7[\2\2\u02ba\u02bb\7o\2\2\u02bb\u02c3\7\33\2\2\u02bc"+
		"\u02bd\7[\2\2\u02bd\u02be\7o\2\2\u02be\u02c3\7K\2\2\u02bf\u02c0\7[\2\2"+
		"\u02c0\u02c1\7o\2\2\u02c1\u02c3\7T\2\2\u02c2\u02b1\3\2\2\2\u02c2\u02b2"+
		"\3\2\2\2\u02c2\u02b3\3\2\2\2\u02c2\u02b6\3\2\2\2\u02c2\u02b9\3\2\2\2\u02c2"+
		"\u02bc\3\2\2\2\u02c2\u02bf\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c8\7^"+
		"\2\2\u02c5\u02c6\5\u00a0Q\2\u02c6\u02c7\7\4\2\2\u02c7\u02c9\3\2\2\2\u02c8"+
		"\u02c5\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02d6\5\u00a2"+
		"R\2\u02cb\u02cc\7\5\2\2\u02cc\u02d1\5\u00a8U\2\u02cd\u02ce\7\7\2\2\u02ce"+
		"\u02d0\5\u00a8U\2\u02cf\u02cd\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf"+
		"\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4"+
		"\u02d5\7\6\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02cb\3\2\2\2\u02d6\u02d7\3\2"+
		"\2\2\u02d7\u02f7\3\2\2\2\u02d8\u02d9\7\u0091\2\2\u02d9\u02da\7\5\2\2\u02da"+
		"\u02df\5T+\2\u02db\u02dc\7\7\2\2\u02dc\u02de\5T+\2\u02dd\u02db\3\2\2\2"+
		"\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e2"+
		"\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02f1\7\6\2\2\u02e3\u02e4\7\7\2\2\u02e4"+
		"\u02e5\7\5\2\2\u02e5\u02ea\5T+\2\u02e6\u02e7\7\7\2\2\u02e7\u02e9\5T+\2"+
		"\u02e8\u02e6\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb"+
		"\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02ee\7\6\2\2\u02ee"+
		"\u02f0\3\2\2\2\u02ef\u02e3\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2"+
		"\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f8\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4"+
		"\u02f8\5B\"\2\u02f5\u02f6\7;\2\2\u02f6\u02f8\7\u0091\2\2\u02f7\u02d8\3"+
		"\2\2\2\u02f7\u02f4\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\65\3\2\2\2\u02f9"+
		"\u02fd\7s\2\2\u02fa\u02fb\5\u00a0Q\2\u02fb\u02fc\7\4\2\2\u02fc\u02fe\3"+
		"\2\2\2\u02fd\u02fa\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff"+
		"\u0306\5\u00b6\\\2\u0300\u0301\7\b\2\2\u0301\u0307\5h\65\2\u0302\u0303"+
		"\7\5\2\2\u0303\u0304\5h\65\2\u0304\u0305\7\6\2\2\u0305\u0307\3\2\2\2\u0306"+
		"\u0300\3\2\2\2\u0306\u0302\3\2\2\2\u0306\u0307\3\2\2\2\u0307\67\3\2\2"+
		"\2\u0308\u0313\7z\2\2\u0309\u0314\5\u00aaV\2\u030a\u030b\5\u00a0Q\2\u030b"+
		"\u030c\7\4\2\2\u030c\u030e\3\2\2\2\u030d\u030a\3\2\2\2\u030d\u030e\3\2"+
		"\2\2\u030e\u0311\3\2\2\2\u030f\u0312\5\u00a2R\2\u0310\u0312\5\u00aeX\2"+
		"\u0311\u030f\3\2\2\2\u0311\u0310\3\2\2\2\u0312\u0314\3\2\2\2\u0313\u0309"+
		"\3\2\2\2\u0313\u030d\3\2\2\2\u0313\u0314\3\2\2\2\u03149\3\2\2\2\u0315"+
		"\u0317\7{\2\2\u0316\u0318\7\u0082\2\2\u0317\u0316\3\2\2\2\u0317\u0318"+
		"\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\5\u00b8]\2\u031a;\3\2\2\2\u031b"+
		"\u0320\7\u0080\2\2\u031c\u031e\7\u008a\2\2\u031d\u031f\5\u00bc_\2\u031e"+
		"\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0321\3\2\2\2\u0320\u031c\3\2"+
		"\2\2\u0320\u0321\3\2\2\2\u0321\u0327\3\2\2\2\u0322\u0324\7\u0089\2\2\u0323"+
		"\u0325\7\u0082\2\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326"+
		"\3\2\2\2\u0326\u0328\5\u00b8]\2\u0327\u0322\3\2\2\2\u0327\u0328\3\2\2"+
		"\2\u0328=\3\2\2\2\u0329\u032a\7\u0082\2\2\u032a\u032b\5\u00b8]\2\u032b"+
		"?\3\2\2\2\u032c\u032e\7\u0096\2\2\u032d\u032f\7w\2\2\u032e\u032d\3\2\2"+
		"\2\u032e\u032f\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0335\5j\66\2\u0331\u0332"+
		"\7\7\2\2\u0332\u0334\5j\66\2\u0333\u0331\3\2\2\2\u0334\u0337\3\2\2\2\u0335"+
		"\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2"+
		"\2\2\u0338\u032c\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033a\3\2\2\2\u033a"+
		"\u0345\5v<\2\u033b\u033c\7p\2\2\u033c\u033d\7*\2\2\u033d\u0342\5f\64\2"+
		"\u033e\u033f\7\7\2\2\u033f\u0341\5f\64\2\u0340\u033e\3\2\2\2\u0341\u0344"+
		"\3\2\2\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0346\3\2\2\2\u0344"+
		"\u0342\3\2\2\2\u0345\u033b\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u034d\3\2"+
		"\2\2\u0347\u0348\7e\2\2\u0348\u034b\5T+\2\u0349\u034a\t\4\2\2\u034a\u034c"+
		"\5T+\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d"+
		"\u0347\3\2\2\2\u034d\u034e\3\2\2\2\u034eA\3\2\2\2\u034f\u0351\7\u0096"+
		"\2\2\u0350\u0352\7w\2\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352"+
		"\u0353\3\2\2\2\u0353\u0358\5j\66\2\u0354\u0355\7\7\2\2\u0355\u0357\5j"+
		"\66\2\u0356\u0354\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358"+
		"\u0359\3\2\2\2\u0359\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035b\u034f\3\2"+
		"\2\2\u035b\u035c\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0363\5D#\2\u035e\u035f"+
		"\5z>\2\u035f\u0360\5D#\2\u0360\u0362\3\2\2\2\u0361\u035e\3\2\2\2\u0362"+
		"\u0365\3\2\2\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0370\3\2"+
		"\2\2\u0365\u0363\3\2\2\2\u0366\u0367\7p\2\2\u0367\u0368\7*\2\2\u0368\u036d"+
		"\5f\64\2\u0369\u036a\7\7\2\2\u036a\u036c\5f\64\2\u036b\u0369\3\2\2\2\u036c"+
		"\u036f\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0371\3\2"+
		"\2\2\u036f\u036d\3\2\2\2\u0370\u0366\3\2\2\2\u0370\u0371\3\2\2\2\u0371"+
		"\u0378\3\2\2\2\u0372\u0373\7e\2\2\u0373\u0376\5T+\2\u0374\u0375\t\4\2"+
		"\2\u0375\u0377\5T+\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0379"+
		"\3\2\2\2\u0378\u0372\3\2\2\2\u0378\u0379\3\2\2\2\u0379C\3\2\2\2\u037a"+
		"\u037c\7\u0083\2\2\u037b\u037d\t\6\2\2\u037c\u037b\3\2\2\2\u037c\u037d"+
		"\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0383\5l\67\2\u037f\u0380\7\7\2\2\u0380"+
		"\u0382\5l\67\2\u0381\u037f\3\2\2\2\u0382\u0385\3\2\2\2\u0383\u0381\3\2"+
		"\2\2\u0383\u0384\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0386"+
		"\u0388\5x=\2\u0387\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038b\3\2\2"+
		"\2\u0389\u038a\7\u0095\2\2\u038a\u038c\5T+\2\u038b\u0389\3\2\2\2\u038b"+
		"\u038c\3\2\2\2\u038c\u039b\3\2\2\2\u038d\u038e\7Q\2\2\u038e\u038f\7*\2"+
		"\2\u038f\u0394\5T+\2\u0390\u0391\7\7\2\2\u0391\u0393\5T+\2\u0392\u0390"+
		"\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u0399\3\2\2\2\u0396\u0394\3\2\2\2\u0397\u0398\7R\2\2\u0398\u039a\5T+"+
		"\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039c\3\2\2\2\u039b\u038d"+
		"\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u03ba\3\2\2\2\u039d\u039e\7\u0091\2"+
		"\2\u039e\u039f\7\5\2\2\u039f\u03a4\5T+\2\u03a0\u03a1\7\7\2\2\u03a1\u03a3"+
		"\5T+\2\u03a2\u03a0\3\2\2\2\u03a3\u03a6\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4"+
		"\u03a5\3\2\2\2\u03a5\u03a7\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a7\u03b6\7\6"+
		"\2\2\u03a8\u03a9\7\7\2\2\u03a9\u03aa\7\5\2\2\u03aa\u03af\5T+\2\u03ab\u03ac"+
		"\7\7\2\2\u03ac\u03ae\5T+\2\u03ad\u03ab\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af"+
		"\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b2\3\2\2\2\u03b1\u03af\3\2"+
		"\2\2\u03b2\u03b3\7\6\2\2\u03b3\u03b5\3\2\2\2\u03b4\u03a8\3\2\2\2\u03b5"+
		"\u03b8\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03ba\3\2"+
		"\2\2\u03b8\u03b6\3\2\2\2\u03b9\u037a\3\2\2\2\u03b9\u039d\3\2\2\2\u03ba"+
		"E\3\2\2\2\u03bb\u03bd\5b\62\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2"+
		"\u03bd\u03be\3\2\2\2\u03be\u03c9\7\u008e\2\2\u03bf\u03c0\7o\2\2\u03c0"+
		"\u03ca\7\u0080\2\2\u03c1\u03c2\7o\2\2\u03c2\u03ca\7\33\2\2\u03c3\u03c4"+
		"\7o\2\2\u03c4\u03ca\7}\2\2\u03c5\u03c6\7o\2\2\u03c6\u03ca\7K\2\2\u03c7"+
		"\u03c8\7o\2\2\u03c8\u03ca\7T\2\2\u03c9\u03bf\3\2\2\2\u03c9\u03c1\3\2\2"+
		"\2\u03c9\u03c3\3\2\2\2\u03c9\u03c5\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca"+
		"\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\5d\63\2\u03cc\u03cd\7\u0084\2"+
		"\2\u03cd\u03ce\5\u00a8U\2\u03ce\u03cf\7\b\2\2\u03cf\u03d7\5T+\2\u03d0"+
		"\u03d1\7\7\2\2\u03d1\u03d2\5\u00a8U\2\u03d2\u03d3\7\b\2\2\u03d3\u03d4"+
		"\5T+\2\u03d4\u03d6\3\2\2\2\u03d5\u03d0\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7"+
		"\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03dc\3\2\2\2\u03d9\u03d7\3\2"+
		"\2\2\u03da\u03db\7\u0095\2\2\u03db\u03dd\5T+\2\u03dc\u03da\3\2\2\2\u03dc"+
		"\u03dd\3\2\2\2\u03ddG\3\2\2\2\u03de\u03e0\5b\62\2\u03df\u03de\3\2\2\2"+
		"\u03df\u03e0\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03ec\7\u008e\2\2\u03e2"+
		"\u03e3\7o\2\2\u03e3\u03ed\7\u0080\2\2\u03e4\u03e5\7o\2\2\u03e5\u03ed\7"+
		"\33\2\2\u03e6\u03e7\7o\2\2\u03e7\u03ed\7}\2\2\u03e8\u03e9\7o\2\2\u03e9"+
		"\u03ed\7K\2\2\u03ea\u03eb\7o\2\2\u03eb\u03ed\7T\2\2\u03ec\u03e2\3\2\2"+
		"\2\u03ec\u03e4\3\2\2\2\u03ec\u03e6\3\2\2\2\u03ec\u03e8\3\2\2\2\u03ec\u03ea"+
		"\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\5d\63\2\u03ef"+
		"\u03f0\7\u0084\2\2\u03f0\u03f1\5\u00a8U\2\u03f1\u03f2\7\b\2\2\u03f2\u03fa"+
		"\5T+\2\u03f3\u03f4\7\7\2\2\u03f4\u03f5\5\u00a8U\2\u03f5\u03f6\7\b\2\2"+
		"\u03f6\u03f7\5T+\2\u03f7\u03f9\3\2\2\2\u03f8\u03f3\3\2\2\2\u03f9\u03fc"+
		"\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03ff\3\2\2\2\u03fc"+
		"\u03fa\3\2\2\2\u03fd\u03fe\7\u0095\2\2\u03fe\u0400\5T+\2\u03ff\u03fd\3"+
		"\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0413\3\2\2\2\u0401\u0402\7p\2\2\u0402"+
		"\u0403\7*\2\2\u0403\u0408\5f\64\2\u0404\u0405\7\7\2\2\u0405\u0407\5f\64"+
		"\2\u0406\u0404\3\2\2\2\u0407\u040a\3\2\2\2\u0408\u0406\3\2\2\2\u0408\u0409"+
		"\3\2\2\2\u0409\u040c\3\2\2\2\u040a\u0408\3\2\2\2\u040b\u0401\3\2\2\2\u040b"+
		"\u040c\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\7e\2\2\u040e\u0411\5T+"+
		"\2\u040f\u0410\t\4\2\2\u0410\u0412\5T+\2\u0411\u040f\3\2\2\2\u0411\u0412"+
		"\3\2\2\2\u0412\u0414\3\2\2\2\u0413\u040b\3\2\2\2\u0413\u0414\3\2\2\2\u0414"+
		"I\3\2\2\2\u0415\u0416\7\u0090\2\2\u0416K\3\2\2\2\u0417\u0419\5\u00a8U"+
		"\2\u0418\u041a\5N(\2\u0419\u0418\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041e"+
		"\3\2\2\2\u041b\u041d\5P)\2\u041c\u041b\3\2\2\2\u041d\u0420\3\2\2\2\u041e"+
		"\u041c\3\2\2\2\u041e\u041f\3\2\2\2\u041fM\3\2\2\2\u0420\u041e\3\2\2\2"+
		"\u0421\u0423\5\u008cG\2\u0422\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424"+
		"\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0430\3\2\2\2\u0426\u0427\7\5"+
		"\2\2\u0427\u0428\5~@\2\u0428\u0429\7\6\2\2\u0429\u0431\3\2\2\2\u042a\u042b"+
		"\7\5\2\2\u042b\u042c\5~@\2\u042c\u042d\7\7\2\2\u042d\u042e\5~@\2\u042e"+
		"\u042f\7\6\2\2\u042f\u0431\3\2\2\2\u0430\u0426\3\2\2\2\u0430\u042a\3\2"+
		"\2\2\u0430\u0431\3\2\2\2\u0431O\3\2\2\2\u0432\u0433\7\63\2\2\u0433\u0435"+
		"\5\u008cG\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0457\3\2\2"+
		"\2\u0436\u0437\7t\2\2\u0437\u0439\7b\2\2\u0438\u043a\t\7\2\2\u0439\u0438"+
		"\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043d\5R*\2\u043c"+
		"\u043e\7&\2\2\u043d\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u0458\3\2"+
		"\2\2\u043f\u0441\7i\2\2\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2\2\u0441"+
		"\u0442\3\2\2\2\u0442\u0443\7k\2\2\u0443\u0458\5R*\2\u0444\u0445\7\u008d"+
		"\2\2\u0445\u0458\5R*\2\u0446\u0447\7.\2\2\u0447\u0448\7\5\2\2\u0448\u0449"+
		"\5T+\2\u0449\u044a\7\6\2\2\u044a\u0458\3\2\2\2\u044b\u0452\7;\2\2\u044c"+
		"\u0453\5~@\2\u044d\u0453\5\u0080A\2\u044e\u044f\7\5\2\2\u044f\u0450\5"+
		"T+\2\u0450\u0451\7\6\2\2\u0451\u0453\3\2\2\2\u0452\u044c\3\2\2\2\u0452"+
		"\u044d\3\2\2\2\u0452\u044e\3\2\2\2\u0453\u0458\3\2\2\2\u0454\u0455\7/"+
		"\2\2\u0455\u0458\5\u00aaV\2\u0456\u0458\5Z.\2\u0457\u0436\3\2\2\2\u0457"+
		"\u0440\3\2\2\2\u0457\u0444\3\2\2\2\u0457\u0446\3\2\2\2\u0457\u044b\3\2"+
		"\2\2\u0457\u0454\3\2\2\2\u0457\u0456\3\2\2\2\u0458Q\3\2\2\2\u0459\u045a"+
		"\7n\2\2\u045a\u045b\7\62\2\2\u045b\u045d\t\b\2\2\u045c\u0459\3\2\2\2\u045c"+
		"\u045d\3\2\2\2\u045dS\3\2\2\2\u045e\u045f\b+\1\2\u045f\u04a2\5\u0080A"+
		"\2\u0460\u04a2\7\u009a\2\2\u0461\u04a2\5V,\2\u0462\u0463\5\u0082B\2\u0463"+
		"\u0464\5T+\27\u0464\u04a2\3\2\2\2\u0465\u04a2\5\u008eH\2\u0466\u0467\5"+
		"\u009eP\2\u0467\u0474\7\5\2\2\u0468\u046a\7A\2\2\u0469\u0468\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u0470\5T+\2\u046c\u046d\7\7\2"+
		"\2\u046d\u046f\5T+\2\u046e\u046c\3\2\2\2\u046f\u0472\3\2\2\2\u0470\u046e"+
		"\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0475\3\2\2\2\u0472\u0470\3\2\2\2\u0473"+
		"\u0475\7\t\2\2\u0474\u0469\3\2\2\2\u0474\u0473\3\2\2\2\u0474\u0475\3\2"+
		"\2\2\u0475\u0476\3\2\2\2\u0476\u0477\7\6\2\2\u0477\u04a2\3\2\2\2\u0478"+
		"\u0479\7\5\2\2\u0479\u047a\5T+\2\u047a\u047b\7\6\2\2\u047b\u04a2\3\2\2"+
		"\2\u047c\u047d\7-\2\2\u047d\u047e\7\5\2\2\u047e\u047f\5T+\2\u047f\u0480"+
		"\7#\2\2\u0480\u0481\5N(\2\u0481\u0482\7\6\2\2\u0482\u04a2\3\2\2\2\u0483"+
		"\u0485\7i\2\2\u0484\u0483\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\3\2"+
		"\2\2\u0486\u0488\7I\2\2\u0487\u0484\3\2\2\2\u0487\u0488\3\2\2\2\u0488"+
		"\u0489\3\2\2\2\u0489\u048a\7\5\2\2\u048a\u048b\5B\"\2\u048b\u048c\7\6"+
		"\2\2\u048c\u04a2\3\2\2\2\u048d\u048f\7,\2\2\u048e\u0490\5T+\2\u048f\u048e"+
		"\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0496\3\2\2\2\u0491\u0492\7\u0094\2"+
		"\2\u0492\u0493\5T+\2\u0493\u0494\7\u0088\2\2\u0494\u0495\5T+\2\u0495\u0497"+
		"\3\2\2\2\u0496\u0491\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0496\3\2\2\2\u0498"+
		"\u0499\3\2\2\2\u0499\u049c\3\2\2\2\u049a\u049b\7D\2\2\u049b\u049d\5T+"+
		"\2\u049c\u049a\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f"+
		"\7E\2\2\u049f\u04a2\3\2\2\2\u04a0\u04a2\5\\/\2\u04a1\u045e\3\2\2\2\u04a1"+
		"\u0460\3\2\2\2\u04a1\u0461\3\2\2\2\u04a1\u0462\3\2\2\2\u04a1\u0465\3\2"+
		"\2\2\u04a1\u0466\3\2\2\2\u04a1\u0478\3\2\2\2\u04a1\u047c\3\2\2\2\u04a1"+
		"\u0487\3\2\2\2\u04a1\u048d\3\2\2\2\u04a1\u04a0\3\2\2\2\u04a2\u04f9\3\2"+
		"\2\2\u04a3\u04a4\f\26\2\2\u04a4\u04a5\7\r\2\2\u04a5\u04f8\5T+\27\u04a6"+
		"\u04a7\f\25\2\2\u04a7\u04a8\t\t\2\2\u04a8\u04f8\5T+\26\u04a9\u04aa\f\24"+
		"\2\2\u04aa\u04ab\t\n\2\2\u04ab\u04f8\5T+\25\u04ac\u04ad\f\23\2\2\u04ad"+
		"\u04ae\t\13\2\2\u04ae\u04f8\5T+\24\u04af\u04b0\f\22\2\2\u04b0\u04b1\t"+
		"\f\2\2\u04b1\u04f8\5T+\23\u04b2\u04b3\f\21\2\2\u04b3\u04b4\5X-\2\u04b4"+
		"\u04b5\5T+\22\u04b5\u04f8\3\2\2\2\u04b6\u04b7\f\20\2\2\u04b7\u04b8\5\u0094"+
		"K\2\u04b8\u04b9\5T+\21\u04b9\u04f8\3\2\2\2\u04ba\u04bb\f\b\2\2\u04bb\u04bd"+
		"\7_\2\2\u04bc\u04be\7i\2\2\u04bd\u04bc\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u04bf\3\2\2\2\u04bf\u04f8\5T+\t\u04c0\u04c2\f\7\2\2\u04c1\u04c3\7i\2"+
		"\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5"+
		"\7)\2\2\u04c5\u04c6\5T+\2\u04c6\u04c7\7\"\2\2\u04c7\u04c8\5T+\b\u04c8"+
		"\u04f8\3\2\2\2\u04c9\u04ca\f\13\2\2\u04ca\u04cb\7/\2\2\u04cb\u04f8\5\u00aa"+
		"V\2\u04cc\u04ce\f\n\2\2\u04cd\u04cf\7i\2\2\u04ce\u04cd\3\2\2\2\u04ce\u04cf"+
		"\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\t\r\2\2\u04d1\u04d4\5T+\2\u04d2"+
		"\u04d3\7F\2\2\u04d3\u04d5\5T+\2\u04d4\u04d2\3\2\2\2\u04d4\u04d5\3\2\2"+
		"\2\u04d5\u04f8\3\2\2\2\u04d6\u04db\f\t\2\2\u04d7\u04dc\7`\2\2\u04d8\u04dc"+
		"\7j\2\2\u04d9\u04da\7i\2\2\u04da\u04dc\7k\2\2\u04db\u04d7\3\2\2\2\u04db"+
		"\u04d8\3\2\2\2\u04db\u04d9\3\2\2\2\u04dc\u04f8\3\2\2\2\u04dd\u04df\f\6"+
		"\2\2\u04de\u04e0\7i\2\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0"+
		"\u04e1\3\2\2\2\u04e1\u04f5\7V\2\2\u04e2\u04ec\7\5\2\2\u04e3\u04ed\5B\""+
		"\2\u04e4\u04e9\5T+\2\u04e5\u04e6\7\7\2\2\u04e6\u04e8\5T+\2\u04e7\u04e5"+
		"\3\2\2\2\u04e8\u04eb\3\2\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea"+
		"\u04ed\3\2\2\2\u04eb\u04e9\3\2\2\2\u04ec\u04e3\3\2\2\2\u04ec\u04e4\3\2"+
		"\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f6\7\6\2\2\u04ef"+
		"\u04f0\5\u00a0Q\2\u04f0\u04f1\7\4\2\2\u04f1\u04f3\3\2\2\2\u04f2\u04ef"+
		"\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f6\5\u00a2R"+
		"\2\u04f5\u04e2\3\2\2\2\u04f5\u04f2\3\2\2\2\u04f6\u04f8\3\2\2\2\u04f7\u04a3"+
		"\3\2\2\2\u04f7\u04a6\3\2\2\2\u04f7\u04a9\3\2\2\2\u04f7\u04ac\3\2\2\2\u04f7"+
		"\u04af\3\2\2\2\u04f7\u04b2\3\2\2\2\u04f7\u04b6\3\2\2\2\u04f7\u04ba\3\2"+
		"\2\2\u04f7\u04c0\3\2\2\2\u04f7\u04c9\3\2\2\2\u04f7\u04cc\3\2\2\2\u04f7"+
		"\u04d6\3\2\2\2\u04f7\u04dd\3\2\2\2\u04f8\u04fb\3\2\2\2\u04f9\u04f7\3\2"+
		"\2\2\u04f9\u04fa\3\2\2\2\u04faU\3\2\2\2\u04fb\u04f9\3\2\2\2\u04fc\u050f"+
		"\3\2\2\2\u04fd\u04fe\5\u00a0Q\2\u04fe\u04ff\7\4\2\2\u04ff\u0501\3\2\2"+
		"\2\u0500\u04fd\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0503"+
		"\5\u00a2R\2\u0503\u0504\7\4\2\2\u0504\u0506\3\2\2\2\u0505\u0500\3\2\2"+
		"\2\u0505\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u050c\5\u00a8U\2\u0508"+
		"\u050a\7#\2\2\u0509\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\3\2"+
		"\2\2\u050b\u050d\5\u0088E\2\u050c\u0509\3\2\2\2\u050c\u050d\3\2\2\2\u050d"+
		"\u050f\3\2\2\2\u050e\u04fc\3\2\2\2\u050e\u0505\3\2\2\2\u050fW\3\2\2\2"+
		"\u0510\u051d\7\b\2\2\u0511\u051d\7\30\2\2\u0512\u051d\7\31\2\2\u0513\u051d"+
		"\7\32\2\2\u0514\u051d\7_\2\2\u0515\u0516\7_\2\2\u0516\u051d\7i\2\2\u0517"+
		"\u051d\5\u0098M\2\u0518\u051d\5\u009aN\2\u0519\u051d\7P\2\2\u051a\u051d"+
		"\7f\2\2\u051b\u051d\7y\2\2\u051c\u0510\3\2\2\2\u051c\u0511\3\2\2\2\u051c"+
		"\u0512\3\2\2\2\u051c\u0513\3\2\2\2\u051c\u0514\3\2\2\2\u051c\u0515\3\2"+
		"\2\2\u051c\u0517\3\2\2\2\u051c\u0518\3\2\2\2\u051c\u0519\3\2\2\2\u051c"+
		"\u051a\3\2\2\2\u051c\u051b\3\2\2\2\u051dY\3\2\2\2\u051e\u051f\7x\2\2\u051f"+
		"\u052b\5\u00acW\2\u0520\u0521\7\5\2\2\u0521\u0526\5\u00a8U\2\u0522\u0523"+
		"\7\7\2\2\u0523\u0525\5\u00a8U\2\u0524\u0522\3\2\2\2\u0525\u0528\3\2\2"+
		"\2\u0526\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0529\3\2\2\2\u0528\u0526"+
		"\3\2\2\2\u0529\u052a\7\6\2\2\u052a\u052c\3\2\2\2\u052b\u0520\3\2\2\2\u052b"+
		"\u052c\3\2\2\2\u052c\u053f\3\2\2\2\u052d\u052e\7n\2\2\u052e\u0537\t\16"+
		"\2\2\u052f\u0530\7\u0084\2\2\u0530\u0538\7k\2\2\u0531\u0532\7\u0084\2"+
		"\2\u0532\u0538\7;\2\2\u0533\u0538\7+\2\2\u0534\u0538\7~\2\2\u0535\u0536"+
		"\7h\2\2\u0536\u0538\7\34\2\2\u0537\u052f\3\2\2\2\u0537\u0531\3\2\2\2\u0537"+
		"\u0533\3\2\2\2\u0537\u0534\3\2\2\2\u0537\u0535\3\2\2\2\u0538\u053c\3\2"+
		"\2\2\u0539\u053a\7f\2\2\u053a\u053c\5\u008cG\2\u053b\u052d\3\2\2\2\u053b"+
		"\u0539\3\2\2\2\u053c\u053e\3\2\2\2\u053d\u053b\3\2\2\2\u053e\u0541\3\2"+
		"\2\2\u053f\u053d\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u054c\3\2\2\2\u0541"+
		"\u053f\3\2\2\2\u0542\u0544\7i\2\2\u0543\u0542\3\2\2\2\u0543\u0544\3\2"+
		"\2\2\u0544\u0545\3\2\2\2\u0545\u054a\7<\2\2\u0546\u0547\7Y\2\2\u0547\u054b"+
		"\7=\2\2\u0548\u0549\7Y\2\2\u0549\u054b\7U\2\2\u054a\u0546\3\2\2\2\u054a"+
		"\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054d\3\2\2\2\u054c\u0543\3\2"+
		"\2\2\u054c\u054d\3\2\2\2\u054d[\3\2\2\2\u054e\u054f\7v\2\2\u054f\u0554"+
		"\7\5\2\2\u0550\u0555\7T\2\2\u0551\u0552\t\17\2\2\u0552\u0553\7\7\2\2\u0553"+
		"\u0555\5\u0084C\2\u0554\u0550\3\2\2\2\u0554\u0551\3\2\2\2\u0555\u0556"+
		"\3\2\2\2\u0556\u0557\7\6\2\2\u0557]\3\2\2\2\u0558\u055b\5\u00a8U\2\u0559"+
		"\u055a\7/\2\2\u055a\u055c\5\u00aaV\2\u055b\u0559\3\2\2\2\u055b\u055c\3"+
		"\2\2\2\u055c\u055e\3\2\2\2\u055d\u055f\t\7\2\2\u055e\u055d\3\2\2\2\u055e"+
		"\u055f\3\2\2\2\u055f_\3\2\2\2\u0560\u0561\7\63\2\2\u0561\u0563\5\u008c"+
		"G\2\u0562\u0560\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0588\3\2\2\2\u0564"+
		"\u0565\7t\2\2\u0565\u0568\7b\2\2\u0566\u0568\7\u008d\2\2\u0567\u0564\3"+
		"\2\2\2\u0567\u0566\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056a\7\5\2\2\u056a"+
		"\u056f\5^\60\2\u056b\u056c\7\7\2\2\u056c\u056e\5^\60\2\u056d\u056b\3\2"+
		"\2\2\u056e\u0571\3\2\2\2\u056f\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570"+
		"\u0572\3\2\2\2\u0571\u056f\3\2\2\2\u0572\u0573\7\6\2\2\u0573\u0574\5R"+
		"*\2\u0574\u0589\3\2\2\2\u0575\u0576\7.\2\2\u0576\u0577\7\5\2\2\u0577\u0578"+
		"\5T+\2\u0578\u0579\7\6\2\2\u0579\u0589\3\2\2\2\u057a\u057b\7M\2\2\u057b"+
		"\u057c\7b\2\2\u057c\u057d\7\5\2\2\u057d\u0582\5\u00a8U\2\u057e\u057f\7"+
		"\7\2\2\u057f\u0581\5\u00a8U\2\u0580\u057e\3\2\2\2\u0581\u0584\3\2\2\2"+
		"\u0582\u0580\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0585\3\2\2\2\u0584\u0582"+
		"\3\2\2\2\u0585\u0586\7\6\2\2\u0586\u0587\5Z.\2\u0587\u0589\3\2\2\2\u0588"+
		"\u0567\3\2\2\2\u0588\u0575\3\2\2\2\u0588\u057a\3\2\2\2\u0589a\3\2\2\2"+
		"\u058a\u058c\7\u0096\2\2\u058b\u058d\7w\2\2\u058c\u058b\3\2\2\2\u058c"+
		"\u058d\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f\5|?\2\u058f\u0590\7#\2"+
		"\2\u0590\u0591\7\5\2\2\u0591\u0592\5B\"\2\u0592\u059c\7\6\2\2\u0593\u0594"+
		"\7\7\2\2\u0594\u0595\5|?\2\u0595\u0596\7#\2\2\u0596\u0597\7\5\2\2\u0597"+
		"\u0598\5B\"\2\u0598\u0599\7\6\2\2\u0599\u059b\3\2\2\2\u059a\u0593\3\2"+
		"\2\2\u059b\u059e\3\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d"+
		"c\3\2\2\2\u059e\u059c\3\2\2\2\u059f\u05a0\5\u00a0Q\2\u05a0\u05a1\7\4\2"+
		"\2\u05a1\u05a3\3\2\2\2\u05a2\u059f\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4"+
		"\3\2\2\2\u05a4\u05aa\5\u00a2R\2\u05a5\u05a6\7X\2\2\u05a6\u05a7\7*\2\2"+
		"\u05a7\u05ab\5\u00aeX\2\u05a8\u05a9\7i\2\2\u05a9\u05ab\7X\2\2\u05aa\u05a5"+
		"\3\2\2\2\u05aa\u05a8\3\2\2\2\u05aa\u05ab\3\2\2\2\u05abe\3\2\2\2\u05ac"+
		"\u05af\5T+\2\u05ad\u05ae\7/\2\2\u05ae\u05b0\5\u00aaV\2\u05af\u05ad\3\2"+
		"\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b2\3\2\2\2\u05b1\u05b3\t\7\2\2\u05b2"+
		"\u05b1\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3g\3\2\2\2\u05b4\u05b8\5~@\2\u05b5"+
		"\u05b8\5\u008cG\2\u05b6\u05b8\7\u009b\2\2\u05b7\u05b4\3\2\2\2\u05b7\u05b5"+
		"\3\2\2\2\u05b7\u05b6\3\2\2\2\u05b8i\3\2\2\2\u05b9\u05c5\5\u00a2R\2\u05ba"+
		"\u05bb\7\5\2\2\u05bb\u05c0\5\u00a8U\2\u05bc\u05bd\7\7\2\2\u05bd\u05bf"+
		"\5\u00a8U\2\u05be\u05bc\3\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2\2"+
		"\2\u05c0\u05c1\3\2\2\2\u05c1\u05c3\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05c4"+
		"\7\6\2\2\u05c4\u05c6\3\2\2\2\u05c5\u05ba\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6"+
		"\u05c7\3\2\2\2\u05c7\u05c8\7#\2\2\u05c8\u05c9\7\5\2\2\u05c9\u05ca\5B\""+
		"\2\u05ca\u05cb\7\6\2\2\u05cbk\3\2\2\2\u05cc\u05d4\7\t\2\2\u05cd\u05ce"+
		"\5\u00a2R\2\u05ce\u05cf\7\4\2\2\u05cf\u05d0\7\t\2\2\u05d0\u05d4\3\2\2"+
		"\2\u05d1\u05d4\5V,\2\u05d2\u05d4\5\u008eH\2\u05d3\u05cc\3\2\2\2\u05d3"+
		"\u05cd\3\2\2\2\u05d3\u05d1\3\2\2\2\u05d3\u05d2\3\2\2\2\u05d4m\3\2\2\2"+
		"\u05d5\u05d6\5\u00a0Q\2\u05d6\u05d7\7\4\2\2\u05d7\u05d9\3\2\2\2\u05d8"+
		"\u05d5\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05df\5\u00a2"+
		"R\2\u05db\u05dd\7#\2\2\u05dc\u05db\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05de"+
		"\3\2\2\2\u05de\u05e0\5\u00ba^\2\u05df\u05dc\3\2\2\2\u05df\u05e0\3\2\2"+
		"\2\u05e0\u05e6\3\2\2\2\u05e1\u05e2\7X\2\2\u05e2\u05e3\7*\2\2\u05e3\u05e7"+
		"\5\u00aeX\2\u05e4\u05e5\7i\2\2\u05e5\u05e7\7X\2\2\u05e6\u05e1\3\2\2\2"+
		"\u05e6\u05e4\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u0605\3\2\2\2\u05e8\u05f2"+
		"\7\5\2\2\u05e9\u05ee\5n8\2\u05ea\u05eb\7\7\2\2\u05eb\u05ed\5n8\2\u05ec"+
		"\u05ea\3\2\2\2\u05ed\u05f0\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee\u05ef\3\2"+
		"\2\2\u05ef\u05f3\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f1\u05f3\5p9\2\u05f2\u05e9"+
		"\3\2\2\2\u05f2\u05f1\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f9\7\6\2\2\u05f5"+
		"\u05f7\7#\2\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\3\2"+
		"\2\2\u05f8\u05fa\5\u00ba^\2\u05f9\u05f6\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa"+
		"\u0605\3\2\2\2\u05fb\u05fc\7\5\2\2\u05fc\u05fd\5B\"\2\u05fd\u0602\7\6"+
		"\2\2\u05fe\u0600\7#\2\2\u05ff\u05fe\3\2\2\2\u05ff\u0600\3\2\2\2\u0600"+
		"\u0601\3\2\2\2\u0601\u0603\5\u00ba^\2\u0602\u05ff\3\2\2\2\u0602\u0603"+
		"\3\2\2\2\u0603\u0605\3\2\2\2\u0604\u05d8\3\2\2\2\u0604\u05e8\3\2\2\2\u0604"+
		"\u05fb\3\2\2\2\u0605o\3\2\2\2\u0606\u060d\5n8\2\u0607\u0608\5r:\2\u0608"+
		"\u0609\5n8\2\u0609\u060a\5t;\2\u060a\u060c\3\2\2\2\u060b\u0607\3\2\2\2"+
		"\u060c\u060f\3\2\2\2\u060d\u060b\3\2\2\2\u060d\u060e\3\2\2\2\u060eq\3"+
		"\2\2\2\u060f\u060d\3\2\2\2\u0610\u061e\7\7\2\2\u0611\u0613\7g\2\2\u0612"+
		"\u0611\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u061a\3\2\2\2\u0614\u0616\7c"+
		"\2\2\u0615\u0617\7q\2\2\u0616\u0615\3\2\2\2\u0616\u0617\3\2\2\2\u0617"+
		"\u061b\3\2\2\2\u0618\u061b\7Z\2\2\u0619\u061b\7\66\2\2\u061a\u0614\3\2"+
		"\2\2\u061a\u0618\3\2\2\2\u061a\u0619\3\2\2\2\u061a\u061b\3\2\2\2\u061b"+
		"\u061c\3\2\2\2\u061c\u061e\7a\2\2\u061d\u0610\3\2\2\2\u061d\u0612\3\2"+
		"\2\2\u061es\3\2\2\2\u061f\u0620\7n\2\2\u0620\u062e\5T+\2\u0621\u0622\7"+
		"\u008f\2\2\u0622\u0623\7\5\2\2\u0623\u0628\5\u00a8U\2\u0624\u0625\7\7"+
		"\2\2\u0625\u0627\5\u00a8U\2\u0626\u0624\3\2\2\2\u0627\u062a\3\2\2\2\u0628"+
		"\u0626\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062b\3\2\2\2\u062a\u0628\3\2"+
		"\2\2\u062b\u062c\7\6\2\2\u062c\u062e\3\2\2\2\u062d\u061f\3\2\2\2\u062d"+
		"\u0621\3\2\2\2\u062d\u062e\3\2\2\2\u062eu\3\2\2\2\u062f\u0631\7\u0083"+
		"\2\2\u0630\u0632\t\6\2\2\u0631\u0630\3\2\2\2\u0631\u0632\3\2\2\2\u0632"+
		"\u0633\3\2\2\2\u0633\u0638\5l\67\2\u0634\u0635\7\7\2\2\u0635\u0637\5l"+
		"\67\2\u0636\u0634\3\2\2\2\u0637\u063a\3\2\2\2\u0638\u0636\3\2\2\2\u0638"+
		"\u0639\3\2\2\2\u0639\u063c\3\2\2\2\u063a\u0638\3\2\2\2\u063b\u063d\5x"+
		"=\2\u063c\u063b\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u0640\3\2\2\2\u063e"+
		"\u063f\7\u0095\2\2\u063f\u0641\5T+\2\u0640\u063e\3\2\2\2\u0640\u0641\3"+
		"\2\2\2\u0641\u0650\3\2\2\2\u0642\u0643\7Q\2\2\u0643\u0644\7*\2\2\u0644"+
		"\u0649\5T+\2\u0645\u0646\7\7\2\2\u0646\u0648\5T+\2\u0647\u0645\3\2\2\2"+
		"\u0648\u064b\3\2\2\2\u0649\u0647\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064e"+
		"\3\2\2\2\u064b\u0649\3\2\2\2\u064c\u064d\7R\2\2\u064d\u064f\5T+\2\u064e"+
		"\u064c\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0651\3\2\2\2\u0650\u0642\3\2"+
		"\2\2\u0650\u0651\3\2\2\2\u0651\u066f\3\2\2\2\u0652\u0653\7\u0091\2\2\u0653"+
		"\u0654\7\5\2\2\u0654\u0659\5T+\2\u0655\u0656\7\7\2\2\u0656\u0658\5T+\2"+
		"\u0657\u0655\3\2\2\2\u0658\u065b\3\2\2\2\u0659\u0657\3\2\2\2\u0659\u065a"+
		"\3\2\2\2\u065a\u065c\3\2\2\2\u065b\u0659\3\2\2\2\u065c\u066b\7\6\2\2\u065d"+
		"\u065e\7\7\2\2\u065e\u065f\7\5\2\2\u065f\u0664\5T+\2\u0660\u0661\7\7\2"+
		"\2\u0661\u0663\5T+\2\u0662\u0660\3\2\2\2\u0663\u0666\3\2\2\2\u0664\u0662"+
		"\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0667\3\2\2\2\u0666\u0664\3\2\2\2\u0667"+
		"\u0668\7\6\2\2\u0668\u066a\3\2\2\2\u0669\u065d\3\2\2\2\u066a\u066d\3\2"+
		"\2\2\u066b\u0669\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066f\3\2\2\2\u066d"+
		"\u066b\3\2\2\2\u066e\u062f\3\2\2\2\u066e\u0652\3\2\2\2\u066fw\3\2\2\2"+
		"\u0670\u067a\7N\2\2\u0671\u0676\5n8\2\u0672\u0673\7\7\2\2\u0673\u0675"+
		"\5n8\2\u0674\u0672\3\2\2\2\u0675\u0678\3\2\2\2\u0676\u0674\3\2\2\2\u0676"+
		"\u0677\3\2\2\2\u0677\u067b\3\2\2\2\u0678\u0676\3\2\2\2\u0679\u067b\5p"+
		"9\2\u067a\u0671\3\2\2\2\u067a\u0679\3\2\2\2\u067by\3\2\2\2\u067c\u0682"+
		"\7\u008c\2\2\u067d\u067e\7\u008c\2\2\u067e\u0682\7\37\2\2\u067f\u0682"+
		"\7]\2\2\u0680\u0682\7G\2\2\u0681\u067c\3\2\2\2\u0681\u067d\3\2\2\2\u0681"+
		"\u067f\3\2\2\2\u0681\u0680\3\2\2\2\u0682{\3\2\2\2\u0683\u068f\5\u00a2"+
		"R\2\u0684\u0685\7\5\2\2\u0685\u068a\5\u00a8U\2\u0686\u0687\7\7\2\2\u0687"+
		"\u0689\5\u00a8U\2\u0688\u0686\3\2\2\2\u0689\u068c\3\2\2\2\u068a\u0688"+
		"\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068d\3\2\2\2\u068c\u068a\3\2\2\2\u068d"+
		"\u068e\7\6\2\2\u068e\u0690\3\2\2\2\u068f\u0684\3\2\2\2\u068f\u0690\3\2"+
		"\2\2\u0690}\3\2\2\2\u0691\u0693\t\n\2\2\u0692\u0691\3\2\2\2\u0692\u0693"+
		"\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0695\7\u0099\2\2\u0695\177\3\2\2\2"+
		"\u0696\u0697\t\20\2\2\u0697\u0081\3\2\2\2\u0698\u0699\t\21\2\2\u0699\u0083"+
		"\3\2\2\2\u069a\u069b\7\u009b\2\2\u069b\u0085\3\2\2\2\u069c\u069f\5T+\2"+
		"\u069d\u069f\5L\'\2\u069e\u069c\3\2\2\2\u069e\u069d\3\2\2\2\u069f\u0087"+
		"\3\2\2\2\u06a0\u06a1\t\22\2\2\u06a1\u0089\3\2\2\2\u06a2\u06a3\t\23\2\2"+
		"\u06a3\u008b\3\2\2\2\u06a4\u06a5\5\u00be`\2\u06a5\u008d\3\2\2\2\u06a6"+
		"\u06a7\7\64\2\2\u06a7\u06ad\7\5\2\2\u06a8\u06aa\5\u009cO\2\u06a9\u06a8"+
		"\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ae\5V,\2\u06ac"+
		"\u06ae\7\t\2\2\u06ad\u06a9\3\2\2\2\u06ad\u06ac\3\2\2\2\u06ad\u06ae\3\2"+
		"\2\2\u06ae\u06af\3\2\2\2\u06af\u06b4\7\6\2\2\u06b0\u06b2\7#\2\2\u06b1"+
		"\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b5\5\u0088"+
		"E\2\u06b4\u06b1\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u008f\3\2\2\2\u06b6"+
		"\u06b7\7\"\2\2\u06b7\u0091\3\2\2\2\u06b8\u06b9\7o\2\2\u06b9\u0093\3\2"+
		"\2\2\u06ba\u06bb\t\24\2\2\u06bb\u0095\3\2\2\2\u06bc\u06bd\7i\2\2\u06bd"+
		"\u0097\3\2\2\2\u06be\u06bf\7V\2\2\u06bf\u0099\3\2\2\2\u06c0\u06c1\7d\2"+
		"\2\u06c1\u009b\3\2\2\2\u06c2\u06c3\7A\2\2\u06c3\u009d\3\2\2\2\u06c4\u06c5"+
		"\5\u00be`\2\u06c5\u009f\3\2\2\2\u06c6\u06c7\5\u00be`\2\u06c7\u00a1\3\2"+
		"\2\2\u06c8\u06c9\5\u00be`\2\u06c9\u00a3\3\2\2\2\u06ca\u06cb\5\u00be`\2"+
		"\u06cb\u00a5\3\2\2\2\u06cc\u06cd\5\u00be`\2\u06cd\u00a7\3\2\2\2\u06ce"+
		"\u06cf\5\u00be`\2\u06cf\u00a9\3\2\2\2\u06d0\u06d1\5\u00be`\2\u06d1\u00ab"+
		"\3\2\2\2\u06d2\u06d3\5\u00be`\2\u06d3\u00ad\3\2\2\2\u06d4\u06d5\5\u00be"+
		"`\2\u06d5\u00af\3\2\2\2\u06d6\u06d7\5\u00be`\2\u06d7\u00b1\3\2\2\2\u06d8"+
		"\u06d9\5\u00be`\2\u06d9\u00b3\3\2\2\2\u06da\u06db\5\u00be`\2\u06db\u00b5"+
		"\3\2\2\2\u06dc\u06dd\5\u00be`\2\u06dd\u00b7\3\2\2\2\u06de\u06df\5\u00be"+
		"`\2\u06df\u00b9\3\2\2\2\u06e0\u06e1\5\u00be`\2\u06e1\u00bb\3\2\2\2\u06e2"+
		"\u06e3\5\u00be`\2\u06e3\u00bd\3\2\2\2\u06e4\u06ec\7\u0098\2\2\u06e5\u06ec"+
		"\5\u008aF\2\u06e6\u06ec\7\u009b\2\2\u06e7\u06e8\7\5\2\2\u06e8\u06e9\5"+
		"\u00be`\2\u06e9\u06ea\7\6\2\2\u06ea\u06ec\3\2\2\2\u06eb\u06e4\3\2\2\2"+
		"\u06eb\u06e5\3\2\2\2\u06eb\u06e6\3\2\2\2\u06eb\u06e7\3\2\2\2\u06ec\u00bf"+
		"\3\2\2\2\u00f6\u00c2\u00c4\u00d0\u00d6\u00d8\u00f8\u0103\u010b\u010e\u0117"+
		"\u011b\u0123\u0127\u0129\u012e\u0130\u0134\u013b\u013e\u0143\u0147\u014c"+
		"\u0155\u0158\u015e\u0160\u0164\u016a\u016f\u017a\u0180\u0184\u018a\u018f"+
		"\u0198\u019f\u01a5\u01a9\u01ad\u01b3\u01b8\u01bf\u01ca\u01cd\u01cf\u01d5"+
		"\u01db\u01df\u01e6\u01ec\u01f2\u01f8\u01fd\u0209\u020e\u0219\u021e\u0221"+
		"\u0227\u022a\u0230\u0239\u023c\u0242\u0244\u024b\u0253\u0258\u0260\u0265"+
		"\u026d\u0272\u027a\u027f\u0285\u028c\u028f\u0297\u02a1\u02a4\u02aa\u02ac"+
		"\u02af\u02c2\u02c8\u02d1\u02d6\u02df\u02ea\u02f1\u02f7\u02fd\u0306\u030d"+
		"\u0311\u0313\u0317\u031e\u0320\u0324\u0327\u032e\u0335\u0338\u0342\u0345"+
		"\u034b\u034d\u0351\u0358\u035b\u0363\u036d\u0370\u0376\u0378\u037c\u0383"+
		"\u0387\u038b\u0394\u0399\u039b\u03a4\u03af\u03b6\u03b9\u03bc\u03c9\u03d7"+
		"\u03dc\u03df\u03ec\u03fa\u03ff\u0408\u040b\u0411\u0413\u0419\u041e\u0424"+
		"\u0430\u0434\u0439\u043d\u0440\u0452\u0457\u045c\u0469\u0470\u0474\u0484"+
		"\u0487\u048f\u0498\u049c\u04a1\u04bd\u04c2\u04ce\u04d4\u04db\u04df\u04e9"+
		"\u04ec\u04f2\u04f5\u04f7\u04f9\u0500\u0505\u0509\u050c\u050e\u051c\u0526"+
		"\u052b\u0537\u053b\u053f\u0543\u054a\u054c\u0554\u055b\u055e\u0562\u0567"+
		"\u056f\u0582\u0588\u058c\u059c\u05a2\u05aa\u05af\u05b2\u05b7\u05c0\u05c5"+
		"\u05d3\u05d8\u05dc\u05df\u05e6\u05ee\u05f2\u05f6\u05f9\u05ff\u0602\u0604"+
		"\u060d\u0612\u0616\u061a\u061d\u0628\u062d\u0631\u0638\u063c\u0640\u0649"+
		"\u064e\u0650\u0659\u0664\u066b\u066e\u0676\u067a\u0681\u068a\u068f\u0692"+
		"\u069e\u06a9\u06ad\u06b1\u06b4\u06eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}