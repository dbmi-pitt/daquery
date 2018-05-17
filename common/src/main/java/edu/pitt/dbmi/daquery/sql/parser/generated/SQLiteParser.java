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
		RULE_keyword = 68, RULE_name = 69, RULE_count_function = 70, RULE_any_function = 71, 
		RULE_and_keyword = 72, RULE_or_keyword = 73, RULE_and_or = 74, RULE_not_keyword = 75, 
		RULE_in_keyword = 76, RULE_like_keyword = 77, RULE_distinct_keyword = 78, 
		RULE_function_name = 79, RULE_database_name = 80, RULE_table_name = 81, 
		RULE_table_or_index_name = 82, RULE_new_table_name = 83, RULE_column_name = 84, 
		RULE_collation_name = 85, RULE_foreign_table = 86, RULE_index_name = 87, 
		RULE_trigger_name = 88, RULE_view_name = 89, RULE_module_name = 90, RULE_pragma_name = 91, 
		RULE_savepoint_name = 92, RULE_table_alias = 93, RULE_transaction_name = 94, 
		RULE_any_name = 95;
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
		"column_alias", "keyword", "name", "count_function", "any_function", "and_keyword", 
		"or_keyword", "and_or", "not_keyword", "in_keyword", "like_keyword", "distinct_keyword", 
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
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (K_ALTER - 30)) | (1L << (K_ANALYZE - 30)) | (1L << (K_ATTACH - 30)) | (1L << (K_BEGIN - 30)) | (1L << (K_COMMIT - 30)) | (1L << (K_CREATE - 30)) | (1L << (K_DELETE - 30)) | (1L << (K_DETACH - 30)) | (1L << (K_DROP - 30)) | (1L << (K_END - 30)) | (1L << (K_EXPLAIN - 30)) | (1L << (K_INSERT - 30)))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (K_PRAGMA - 113)) | (1L << (K_REINDEX - 113)) | (1L << (K_RELEASE - 113)) | (1L << (K_REPLACE - 113)) | (1L << (K_ROLLBACK - 113)) | (1L << (K_SAVEPOINT - 113)) | (1L << (K_SELECT - 113)) | (1L << (K_UPDATE - 113)) | (1L << (K_VACUUM - 113)) | (1L << (K_VALUES - 113)) | (1L << (K_WITH - 113)) | (1L << (UNEXPECTED_CHAR - 113)))) != 0)) {
				{
				setState(194);
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
					setState(192);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(193);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
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
			setState(201);
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
			setState(204);
			sql_stmt();
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					sql_stmt();
					}
					} 
				}
				setState(210);
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
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(211);
				match(K_EXPLAIN);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(212);
					match(K_QUERY);
					setState(213);
					match(K_PLAN);
					}
				}

				}
			}

			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(218);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(219);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(220);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(221);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(222);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(223);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(224);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(225);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(226);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(227);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(228);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(229);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(230);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(231);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(232);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(233);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(234);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(235);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(236);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(237);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(238);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(239);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(240);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(241);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(242);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(243);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(244);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(245);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(246);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(247);
				vacuum_stmt();
				}
				break;
			}
			setState(250);
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
			setState(252);
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
			setState(254);
			match(K_ALTER);
			setState(255);
			match(K_TABLE);
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(256);
				database_name();
				setState(257);
				match(DOT);
				}
				break;
			}
			setState(261);
			table_name();
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(262);
				match(K_RENAME);
				setState(263);
				match(K_TO);
				setState(264);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(265);
				match(K_ADD);
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(266);
					match(K_COLUMN);
					}
					break;
				}
				setState(269);
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
			setState(272);
			match(K_ANALYZE);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(273);
				database_name();
				}
				break;
			case 2:
				{
				setState(274);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(275);
				database_name();
				setState(276);
				match(DOT);
				setState(277);
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
			setState(281);
			match(K_ATTACH);
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(282);
				match(K_DATABASE);
				}
				break;
			}
			setState(285);
			expr(0);
			setState(286);
			match(K_AS);
			setState(287);
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
			setState(289);
			match(K_BEGIN);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (K_DEFERRED - 59)) | (1L << (K_EXCLUSIVE - 59)) | (1L << (K_IMMEDIATE - 59)))) != 0)) {
				{
				setState(290);
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

			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(293);
				match(K_TRANSACTION);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH) | (1L << K_DISTINCT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RESTRICT - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_ROW - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(294);
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
			setState(299);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(300);
				match(K_TRANSACTION);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH) | (1L << K_DISTINCT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RESTRICT - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_ROW - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(301);
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
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(306);
				match(K_WITH);
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(307);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(310);
				common_table_expression();
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(311);
					match(COMMA);
					setState(312);
					common_table_expression();
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(320);
			select_core();
			setState(330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(327);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(321);
					match(K_UNION);
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(322);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(325);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(326);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(329);
				select_core();
				}
				}
				setState(332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(334);
				match(K_ORDER);
				setState(335);
				match(K_BY);
				setState(336);
				ordering_term();
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(337);
					match(COMMA);
					setState(338);
					ordering_term();
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(346);
				match(K_LIMIT);
				setState(347);
				expr(0);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(348);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(349);
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
			setState(354);
			match(K_CREATE);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(355);
				match(K_UNIQUE);
				}
			}

			setState(358);
			match(K_INDEX);
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(359);
				match(K_IF);
				setState(360);
				match(K_NOT);
				setState(361);
				match(K_EXISTS);
				}
				break;
			}
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(364);
				database_name();
				setState(365);
				match(DOT);
				}
				break;
			}
			setState(369);
			index_name();
			setState(370);
			match(K_ON);
			setState(371);
			table_name();
			setState(372);
			match(OPEN_PAR);
			setState(373);
			indexed_column();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(374);
				match(COMMA);
				setState(375);
				indexed_column();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
			match(CLOSE_PAR);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(382);
				match(K_WHERE);
				setState(383);
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
			setState(386);
			match(K_CREATE);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(387);
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

			setState(390);
			match(K_TABLE);
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(391);
				match(K_IF);
				setState(392);
				match(K_NOT);
				setState(393);
				match(K_EXISTS);
				}
				break;
			}
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(396);
				database_name();
				setState(397);
				match(DOT);
				}
				break;
			}
			setState(401);
			table_name();
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(402);
				match(OPEN_PAR);
				setState(403);
				column_def();
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(404);
						match(COMMA);
						setState(405);
						column_def();
						}
						} 
					}
					setState(410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(411);
					match(COMMA);
					setState(412);
					table_constraint();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(418);
				match(CLOSE_PAR);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(419);
					match(K_WITHOUT);
					setState(420);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(423);
				match(K_AS);
				setState(424);
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
			setState(427);
			match(K_CREATE);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(428);
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

			setState(431);
			match(K_TRIGGER);
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(432);
				match(K_IF);
				setState(433);
				match(K_NOT);
				setState(434);
				match(K_EXISTS);
				}
				break;
			}
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(437);
				database_name();
				setState(438);
				match(DOT);
				}
				break;
			}
			setState(442);
			trigger_name();
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(443);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(444);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(445);
				match(K_INSTEAD);
				setState(446);
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
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(449);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(450);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(451);
				match(K_UPDATE);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(452);
					match(K_OF);
					setState(453);
					column_name();
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(454);
						match(COMMA);
						setState(455);
						column_name();
						}
						}
						setState(460);
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
			setState(465);
			match(K_ON);
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(466);
				database_name();
				setState(467);
				match(DOT);
				}
				break;
			}
			setState(471);
			table_name();
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(472);
				match(K_FOR);
				setState(473);
				match(K_EACH);
				setState(474);
				match(K_ROW);
				}
			}

			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(477);
				match(K_WHEN);
				setState(478);
				expr(0);
				}
			}

			setState(481);
			match(K_BEGIN);
			setState(490); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(482);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(483);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(484);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(485);
					select_stmt();
					}
					break;
				}
				setState(488);
				match(SCOL);
				}
				}
				setState(492); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INSERT - 89)) | (1L << (K_REPLACE - 89)) | (1L << (K_SELECT - 89)) | (1L << (K_UPDATE - 89)) | (1L << (K_VALUES - 89)) | (1L << (K_WITH - 89)))) != 0) );
			setState(494);
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
			setState(496);
			match(K_CREATE);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(497);
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

			setState(500);
			match(K_VIEW);
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(501);
				match(K_IF);
				setState(502);
				match(K_NOT);
				setState(503);
				match(K_EXISTS);
				}
				break;
			}
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(506);
				database_name();
				setState(507);
				match(DOT);
				}
				break;
			}
			setState(511);
			view_name();
			setState(512);
			match(K_AS);
			setState(513);
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
			setState(515);
			match(K_CREATE);
			setState(516);
			match(K_VIRTUAL);
			setState(517);
			match(K_TABLE);
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(518);
				match(K_IF);
				setState(519);
				match(K_NOT);
				setState(520);
				match(K_EXISTS);
				}
				break;
			}
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(523);
				database_name();
				setState(524);
				match(DOT);
				}
				break;
			}
			setState(528);
			table_name();
			setState(529);
			match(K_USING);
			setState(530);
			module_name();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(531);
				match(OPEN_PAR);
				setState(532);
				module_argument();
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(533);
					match(COMMA);
					setState(534);
					module_argument();
					}
					}
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(540);
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
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(544);
				with_clause();
				}
			}

			setState(547);
			match(K_DELETE);
			setState(548);
			single_from_clause();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(549);
				match(K_WHERE);
				setState(550);
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
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(553);
				with_clause();
				}
			}

			setState(556);
			match(K_DELETE);
			setState(557);
			single_from_clause();
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(558);
				match(K_WHERE);
				setState(559);
				expr(0);
				}
			}

			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(562);
					match(K_ORDER);
					setState(563);
					match(K_BY);
					setState(564);
					ordering_term();
					setState(569);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(565);
						match(COMMA);
						setState(566);
						ordering_term();
						}
						}
						setState(571);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(574);
				match(K_LIMIT);
				setState(575);
				expr(0);
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(576);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(577);
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
			setState(582);
			match(K_FROM);
			setState(583);
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
			setState(585);
			match(K_DETACH);
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(586);
				match(K_DATABASE);
				}
				break;
			}
			setState(589);
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
			setState(591);
			match(K_DROP);
			setState(592);
			match(K_INDEX);
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(593);
				match(K_IF);
				setState(594);
				match(K_EXISTS);
				}
				break;
			}
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(597);
				database_name();
				setState(598);
				match(DOT);
				}
				break;
			}
			setState(602);
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
			setState(604);
			match(K_DROP);
			setState(605);
			match(K_TABLE);
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(606);
				match(K_IF);
				setState(607);
				match(K_EXISTS);
				}
				break;
			}
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(610);
				database_name();
				setState(611);
				match(DOT);
				}
				break;
			}
			setState(615);
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
			setState(617);
			match(K_DROP);
			setState(618);
			match(K_TRIGGER);
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(619);
				match(K_IF);
				setState(620);
				match(K_EXISTS);
				}
				break;
			}
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(623);
				database_name();
				setState(624);
				match(DOT);
				}
				break;
			}
			setState(628);
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
			setState(630);
			match(K_DROP);
			setState(631);
			match(K_VIEW);
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(632);
				match(K_IF);
				setState(633);
				match(K_EXISTS);
				}
				break;
			}
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(636);
				database_name();
				setState(637);
				match(DOT);
				}
				break;
			}
			setState(641);
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
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(643);
				match(K_WITH);
				setState(645);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(644);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(647);
				common_table_expression();
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(648);
					match(COMMA);
					setState(649);
					common_table_expression();
					}
					}
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(657);
			select_core();
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(658);
				compound_operator();
				setState(659);
				select_core();
				}
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(666);
				match(K_ORDER);
				setState(667);
				match(K_BY);
				setState(668);
				ordering_term();
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(669);
					match(COMMA);
					setState(670);
					ordering_term();
					}
					}
					setState(675);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(678);
				match(K_LIMIT);
				setState(679);
				expr(0);
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(680);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(681);
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
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(686);
				with_clause();
				}
			}

			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(689);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(690);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(691);
				match(K_INSERT);
				setState(692);
				match(K_OR);
				setState(693);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(694);
				match(K_INSERT);
				setState(695);
				match(K_OR);
				setState(696);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(697);
				match(K_INSERT);
				setState(698);
				match(K_OR);
				setState(699);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(700);
				match(K_INSERT);
				setState(701);
				match(K_OR);
				setState(702);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(703);
				match(K_INSERT);
				setState(704);
				match(K_OR);
				setState(705);
				match(K_IGNORE);
				}
				break;
			}
			setState(708);
			match(K_INTO);
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(709);
				database_name();
				setState(710);
				match(DOT);
				}
				break;
			}
			setState(714);
			table_name();
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(715);
				match(OPEN_PAR);
				setState(716);
				column_name();
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(717);
					match(COMMA);
					setState(718);
					column_name();
					}
					}
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(724);
				match(CLOSE_PAR);
				}
			}

			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(728);
				match(K_VALUES);
				setState(729);
				match(OPEN_PAR);
				setState(730);
				expr(0);
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(731);
					match(COMMA);
					setState(732);
					expr(0);
					}
					}
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(738);
				match(CLOSE_PAR);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(739);
					match(COMMA);
					setState(740);
					match(OPEN_PAR);
					setState(741);
					expr(0);
					setState(746);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(742);
						match(COMMA);
						setState(743);
						expr(0);
						}
						}
						setState(748);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(749);
					match(CLOSE_PAR);
					}
					}
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(756);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(757);
				match(K_DEFAULT);
				setState(758);
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
			setState(761);
			match(K_PRAGMA);
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(762);
				database_name();
				setState(763);
				match(DOT);
				}
				break;
			}
			setState(767);
			pragma_name();
			setState(774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(768);
				match(ASSIGN);
				setState(769);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(770);
				match(OPEN_PAR);
				setState(771);
				pragma_value();
				setState(772);
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
			setState(776);
			match(K_REINDEX);
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(777);
				collation_name();
				}
				break;
			case 2:
				{
				setState(781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(778);
					database_name();
					setState(779);
					match(DOT);
					}
					break;
				}
				setState(785);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(783);
					table_name();
					}
					break;
				case 2:
					{
					setState(784);
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
			setState(789);
			match(K_RELEASE);
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(790);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(793);
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
			setState(795);
			match(K_ROLLBACK);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(796);
				match(K_TRANSACTION);
				setState(798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(797);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(802);
				match(K_TO);
				setState(804);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(803);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(806);
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
			setState(809);
			match(K_SAVEPOINT);
			setState(810);
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
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(812);
				match(K_WITH);
				setState(814);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(813);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(816);
				common_table_expression();
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(817);
					match(COMMA);
					setState(818);
					common_table_expression();
					}
					}
					setState(823);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(826);
			select_core();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(827);
				match(K_ORDER);
				setState(828);
				match(K_BY);
				setState(829);
				ordering_term();
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(830);
					match(COMMA);
					setState(831);
					ordering_term();
					}
					}
					setState(836);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(839);
				match(K_LIMIT);
				setState(840);
				expr(0);
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(841);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(842);
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
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(847);
				match(K_WITH);
				setState(849);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(848);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(851);
				common_table_expression();
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(852);
					match(COMMA);
					setState(853);
					common_table_expression();
					}
					}
					setState(858);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(861);
			select_or_values();
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(862);
				compound_operator();
				setState(863);
				select_or_values();
				}
				}
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(870);
				match(K_ORDER);
				setState(871);
				match(K_BY);
				setState(872);
				ordering_term();
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(873);
					match(COMMA);
					setState(874);
					ordering_term();
					}
					}
					setState(879);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(882);
				match(K_LIMIT);
				setState(883);
				expr(0);
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(884);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(885);
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
			setState(953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				match(K_SELECT);
				setState(892);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(891);
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
				setState(894);
				result_column();
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(895);
					match(COMMA);
					setState(896);
					result_column();
					}
					}
					setState(901);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(902);
					multi_from_clause();
					}
				}

				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(905);
					match(K_WHERE);
					setState(906);
					expr(0);
					}
				}

				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(909);
					match(K_GROUP);
					setState(910);
					match(K_BY);
					setState(911);
					expr(0);
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(912);
						match(COMMA);
						setState(913);
						expr(0);
						}
						}
						setState(918);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(921);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(919);
						match(K_HAVING);
						setState(920);
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
				setState(925);
				match(K_VALUES);
				setState(926);
				match(OPEN_PAR);
				setState(927);
				expr(0);
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(928);
					match(COMMA);
					setState(929);
					expr(0);
					}
					}
					setState(934);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(935);
				match(CLOSE_PAR);
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(936);
					match(COMMA);
					setState(937);
					match(OPEN_PAR);
					setState(938);
					expr(0);
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(939);
						match(COMMA);
						setState(940);
						expr(0);
						}
						}
						setState(945);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(946);
					match(CLOSE_PAR);
					}
					}
					setState(952);
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
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(955);
				with_clause();
				}
			}

			setState(958);
			match(K_UPDATE);
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(959);
				match(K_OR);
				setState(960);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(961);
				match(K_OR);
				setState(962);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(963);
				match(K_OR);
				setState(964);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(965);
				match(K_OR);
				setState(966);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(967);
				match(K_OR);
				setState(968);
				match(K_IGNORE);
				}
				break;
			}
			setState(971);
			qualified_table_name();
			setState(972);
			match(K_SET);
			setState(973);
			column_name();
			setState(974);
			match(ASSIGN);
			setState(975);
			expr(0);
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(976);
				match(COMMA);
				setState(977);
				column_name();
				setState(978);
				match(ASSIGN);
				setState(979);
				expr(0);
				}
				}
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(986);
				match(K_WHERE);
				setState(987);
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
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(990);
				with_clause();
				}
			}

			setState(993);
			match(K_UPDATE);
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(994);
				match(K_OR);
				setState(995);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(996);
				match(K_OR);
				setState(997);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(998);
				match(K_OR);
				setState(999);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1000);
				match(K_OR);
				setState(1001);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1002);
				match(K_OR);
				setState(1003);
				match(K_IGNORE);
				}
				break;
			}
			setState(1006);
			qualified_table_name();
			setState(1007);
			match(K_SET);
			setState(1008);
			column_name();
			setState(1009);
			match(ASSIGN);
			setState(1010);
			expr(0);
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1011);
				match(COMMA);
				setState(1012);
				column_name();
				setState(1013);
				match(ASSIGN);
				setState(1014);
				expr(0);
				}
				}
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1021);
				match(K_WHERE);
				setState(1022);
				expr(0);
				}
			}

			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1025);
					match(K_ORDER);
					setState(1026);
					match(K_BY);
					setState(1027);
					ordering_term();
					setState(1032);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1028);
						match(COMMA);
						setState(1029);
						ordering_term();
						}
						}
						setState(1034);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1037);
				match(K_LIMIT);
				setState(1038);
				expr(0);
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1039);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1040);
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
			setState(1045);
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
			setState(1047);
			column_name();
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1048);
				type_name();
				}
				break;
			}
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (K_NOT - 103)) | (1L << (K_NULL - 103)) | (1L << (K_PRIMARY - 103)) | (1L << (K_REFERENCES - 103)) | (1L << (K_UNIQUE - 103)))) != 0)) {
				{
				{
				setState(1051);
				column_constraint();
				}
				}
				setState(1056);
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
			setState(1058); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1057);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1060); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1062);
				match(OPEN_PAR);
				setState(1063);
				signed_number();
				setState(1064);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1066);
				match(OPEN_PAR);
				setState(1067);
				signed_number();
				setState(1068);
				match(COMMA);
				setState(1069);
				signed_number();
				setState(1070);
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
			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1074);
				match(K_CONSTRAINT);
				setState(1075);
				name();
				}
			}

			setState(1111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1078);
				match(K_PRIMARY);
				setState(1079);
				match(K_KEY);
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1080);
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

				setState(1083);
				conflict_clause();
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1084);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1087);
					match(K_NOT);
					}
				}

				setState(1090);
				match(K_NULL);
				setState(1091);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1092);
				match(K_UNIQUE);
				setState(1093);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1094);
				match(K_CHECK);
				setState(1095);
				match(OPEN_PAR);
				setState(1096);
				expr(0);
				setState(1097);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1099);
				match(K_DEFAULT);
				setState(1106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1100);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1101);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1102);
					match(OPEN_PAR);
					setState(1103);
					expr(0);
					setState(1104);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1108);
				match(K_COLLATE);
				setState(1109);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1110);
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
			setState(1116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1113);
				match(K_ON);
				setState(1114);
				match(K_CONFLICT);
				setState(1115);
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
		public Any_functionContext any_function() {
			return getRuleContext(Any_functionContext.class,0);
		}
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
			setState(1168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1119);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1120);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1121);
				dbColumnExpr();
				}
				break;
			case 4:
				{
				setState(1122);
				unary_operator();
				setState(1123);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1125);
				count_function();
				}
				break;
			case 6:
				{
				setState(1126);
				any_function();
				}
				break;
			case 7:
				{
				setState(1127);
				match(OPEN_PAR);
				setState(1128);
				expr(0);
				setState(1129);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1131);
				match(K_CAST);
				setState(1132);
				match(OPEN_PAR);
				setState(1133);
				expr(0);
				setState(1134);
				match(K_AS);
				setState(1135);
				type_name();
				setState(1136);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1139);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1138);
						match(K_NOT);
						}
					}

					setState(1141);
					match(K_EXISTS);
					}
				}

				setState(1144);
				match(OPEN_PAR);
				setState(1145);
				select_stmt();
				setState(1146);
				match(CLOSE_PAR);
				}
				break;
			case 10:
				{
				setState(1148);
				match(K_CASE);
				setState(1150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1149);
					expr(0);
					}
					break;
				}
				setState(1157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1152);
					match(K_WHEN);
					setState(1153);
					expr(0);
					setState(1154);
					match(K_THEN);
					setState(1155);
					expr(0);
					}
					}
					setState(1159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1161);
					match(K_ELSE);
					setState(1162);
					expr(0);
					}
				}

				setState(1165);
				match(K_END);
				}
				break;
			case 11:
				{
				setState(1167);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1170);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1171);
						match(PIPE2);
						setState(1172);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1173);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1174);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1175);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1176);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1177);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1178);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1179);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1180);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1181);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1182);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1183);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1184);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1185);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						{
						setState(1186);
						comparison_operator();
						}
						setState(1187);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1189);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1190);
						and_or();
						setState(1191);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1193);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1194);
						match(K_IS);
						setState(1196);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
						case 1:
							{
							setState(1195);
							match(K_NOT);
							}
							break;
						}
						setState(1198);
						expr(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1199);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1201);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1200);
							match(K_NOT);
							}
						}

						setState(1203);
						match(K_BETWEEN);
						setState(1204);
						expr(0);
						setState(1205);
						match(K_AND);
						setState(1206);
						expr(6);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1208);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1209);
						match(K_COLLATE);
						setState(1210);
						collation_name();
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1211);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1213);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1212);
							match(K_NOT);
							}
						}

						setState(1215);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (K_GLOB - 78)) | (1L << (K_LIKE - 78)) | (1L << (K_MATCH - 78)) | (1L << (K_REGEXP - 78)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1216);
						expr(0);
						setState(1219);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
						case 1:
							{
							setState(1217);
							match(K_ESCAPE);
							setState(1218);
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
						setState(1221);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1226);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1222);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1223);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1224);
							match(K_NOT);
							setState(1225);
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
						setState(1228);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1230);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1229);
							match(K_NOT);
							}
						}

						setState(1232);
						match(K_IN);
						setState(1252);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
						case 1:
							{
							setState(1233);
							match(OPEN_PAR);
							setState(1243);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
							case 1:
								{
								setState(1234);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1235);
								expr(0);
								setState(1240);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1236);
									match(COMMA);
									setState(1237);
									expr(0);
									}
									}
									setState(1242);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1245);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1249);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
							case 1:
								{
								setState(1246);
								database_name();
								setState(1247);
								match(DOT);
								}
								break;
							}
							setState(1251);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
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
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1263);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
					case 1:
						{
						setState(1260);
						database_name();
						setState(1261);
						match(DOT);
						}
						break;
					}
					setState(1265);
					table_name();
					setState(1266);
					match(DOT);
					}
					break;
				}
				setState(1270);
				column_name();
				setState(1275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1272);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1271);
						match(K_AS);
						}
					}

					setState(1274);
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
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1279);
				match(ASSIGN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1280);
				match(EQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1281);
				match(NOT_EQ1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1282);
				match(NOT_EQ2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1283);
				match(K_IS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1284);
				match(K_IS);
				setState(1285);
				match(K_NOT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1286);
				in_keyword();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1287);
				like_keyword();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1288);
				match(K_GLOB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1289);
				match(K_MATCH);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1290);
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
			setState(1293);
			match(K_REFERENCES);
			setState(1294);
			foreign_table();
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1295);
				match(OPEN_PAR);
				setState(1296);
				column_name();
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1297);
					match(COMMA);
					setState(1298);
					column_name();
					}
					}
					setState(1303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1304);
				match(CLOSE_PAR);
				}
			}

			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1322);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1308);
					match(K_ON);
					setState(1309);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1318);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						setState(1310);
						match(K_SET);
						setState(1311);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1312);
						match(K_SET);
						setState(1313);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1314);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1315);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1316);
						match(K_NO);
						setState(1317);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1320);
					match(K_MATCH);
					setState(1321);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1329);
					match(K_NOT);
					}
				}

				setState(1332);
				match(K_DEFERRABLE);
				setState(1337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1333);
					match(K_INITIALLY);
					setState(1334);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1335);
					match(K_INITIALLY);
					setState(1336);
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
			setState(1341);
			match(K_RAISE);
			setState(1342);
			match(OPEN_PAR);
			setState(1347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1343);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1344);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1345);
				match(COMMA);
				setState(1346);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1349);
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
			setState(1351);
			column_name();
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1352);
				match(K_COLLATE);
				setState(1353);
				collation_name();
				}
			}

			setState(1357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1356);
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
			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1359);
				match(K_CONSTRAINT);
				setState(1360);
				name();
				}
			}

			setState(1399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1366);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1363);
					match(K_PRIMARY);
					setState(1364);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1365);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1368);
				match(OPEN_PAR);
				setState(1369);
				indexed_column();
				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1370);
					match(COMMA);
					setState(1371);
					indexed_column();
					}
					}
					setState(1376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1377);
				match(CLOSE_PAR);
				setState(1378);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1380);
				match(K_CHECK);
				setState(1381);
				match(OPEN_PAR);
				setState(1382);
				expr(0);
				setState(1383);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1385);
				match(K_FOREIGN);
				setState(1386);
				match(K_KEY);
				setState(1387);
				match(OPEN_PAR);
				setState(1388);
				column_name();
				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1389);
					match(COMMA);
					setState(1390);
					column_name();
					}
					}
					setState(1395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1396);
				match(CLOSE_PAR);
				setState(1397);
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
			setState(1401);
			match(K_WITH);
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1402);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1405);
			cte_table_name();
			setState(1406);
			match(K_AS);
			setState(1407);
			match(OPEN_PAR);
			setState(1408);
			select_stmt();
			setState(1409);
			match(CLOSE_PAR);
			setState(1419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1410);
				match(COMMA);
				setState(1411);
				cte_table_name();
				setState(1412);
				match(K_AS);
				setState(1413);
				match(OPEN_PAR);
				setState(1414);
				select_stmt();
				setState(1415);
				match(CLOSE_PAR);
				}
				}
				setState(1421);
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
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1422);
				database_name();
				setState(1423);
				match(DOT);
				}
				break;
			}
			setState(1427);
			table_name();
			setState(1433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1428);
				match(K_INDEXED);
				setState(1429);
				match(K_BY);
				setState(1430);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1431);
				match(K_NOT);
				setState(1432);
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
			setState(1435);
			expr(0);
			setState(1438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1436);
				match(K_COLLATE);
				setState(1437);
				collation_name();
				}
			}

			setState(1441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1440);
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
			setState(1446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1443);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1444);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1445);
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
			setState(1448);
			table_name();
			setState(1460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1449);
				match(OPEN_PAR);
				setState(1450);
				column_name();
				setState(1455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1451);
					match(COMMA);
					setState(1452);
					column_name();
					}
					}
					setState(1457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1458);
				match(CLOSE_PAR);
				}
			}

			setState(1462);
			match(K_AS);
			setState(1463);
			match(OPEN_PAR);
			setState(1464);
			select_stmt();
			setState(1465);
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
		public Any_functionContext any_function() {
			return getRuleContext(Any_functionContext.class,0);
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
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1467);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1468);
				table_name();
				setState(1469);
				match(DOT);
				setState(1470);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1472);
				dbColumnExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1473);
				count_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1474);
				any_function();
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
			setState(1524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1477);
					database_name();
					setState(1478);
					match(DOT);
					}
					break;
				}
				setState(1482);
				table_name();
				setState(1487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1484);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
					case 1:
						{
						setState(1483);
						match(K_AS);
						}
						break;
					}
					setState(1486);
					table_alias();
					}
					break;
				}
				setState(1494);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1489);
					match(K_INDEXED);
					setState(1490);
					match(K_BY);
					setState(1491);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1492);
					match(K_NOT);
					setState(1493);
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
				setState(1496);
				match(OPEN_PAR);
				setState(1506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1497);
					table_or_subquery();
					setState(1502);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1498);
						match(COMMA);
						setState(1499);
						table_or_subquery();
						}
						}
						setState(1504);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1505);
					join_clause();
					}
					break;
				}
				setState(1508);
				match(CLOSE_PAR);
				setState(1513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1510);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
					case 1:
						{
						setState(1509);
						match(K_AS);
						}
						break;
					}
					setState(1512);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1515);
				match(OPEN_PAR);
				setState(1516);
				select_stmt();
				setState(1517);
				match(CLOSE_PAR);
				setState(1522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1519);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
					case 1:
						{
						setState(1518);
						match(K_AS);
						}
						break;
					}
					setState(1521);
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
			setState(1526);
			table_or_subquery();
			setState(1533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (K_INNER - 88)) | (1L << (K_JOIN - 88)) | (1L << (K_LEFT - 88)) | (1L << (K_NATURAL - 88)))) != 0)) {
				{
				{
				setState(1527);
				join_operator();
				setState(1528);
				table_or_subquery();
				setState(1529);
				join_constraint();
				}
				}
				setState(1535);
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
			setState(1549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1536);
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
				setState(1538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1537);
					match(K_NATURAL);
					}
				}

				setState(1546);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1540);
					match(K_LEFT);
					setState(1542);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1541);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1544);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1545);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1548);
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
			setState(1565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1551);
				match(K_ON);
				setState(1552);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1553);
				match(K_USING);
				setState(1554);
				match(OPEN_PAR);
				setState(1555);
				column_name();
				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1556);
					match(COMMA);
					setState(1557);
					column_name();
					}
					}
					setState(1562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1563);
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
			setState(1630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1567);
				match(K_SELECT);
				setState(1569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1568);
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
				setState(1571);
				result_column();
				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1572);
					match(COMMA);
					setState(1573);
					result_column();
					}
					}
					setState(1578);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1579);
					multi_from_clause();
					}
				}

				setState(1584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1582);
					match(K_WHERE);
					setState(1583);
					expr(0);
					}
				}

				setState(1600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1586);
					match(K_GROUP);
					setState(1587);
					match(K_BY);
					setState(1588);
					expr(0);
					setState(1593);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1589);
						match(COMMA);
						setState(1590);
						expr(0);
						}
						}
						setState(1595);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1598);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1596);
						match(K_HAVING);
						setState(1597);
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
				setState(1602);
				match(K_VALUES);
				setState(1603);
				match(OPEN_PAR);
				setState(1604);
				expr(0);
				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1605);
					match(COMMA);
					setState(1606);
					expr(0);
					}
					}
					setState(1611);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1612);
				match(CLOSE_PAR);
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1613);
					match(COMMA);
					setState(1614);
					match(OPEN_PAR);
					setState(1615);
					expr(0);
					setState(1620);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1616);
						match(COMMA);
						setState(1617);
						expr(0);
						}
						}
						setState(1622);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1623);
					match(CLOSE_PAR);
					}
					}
					setState(1629);
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
			setState(1632);
			match(K_FROM);
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1633);
				table_or_subquery();
				setState(1638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1634);
					match(COMMA);
					setState(1635);
					table_or_subquery();
					}
					}
					setState(1640);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1641);
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
			setState(1649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1644);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1645);
				match(K_UNION);
				setState(1646);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1647);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1648);
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
			setState(1651);
			table_name();
			setState(1663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1652);
				match(OPEN_PAR);
				setState(1653);
				column_name();
				setState(1658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1654);
					match(COMMA);
					setState(1655);
					column_name();
					}
					}
					setState(1660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1661);
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
			setState(1666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1665);
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

			setState(1668);
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
			setState(1670);
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
			setState(1672);
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
			setState(1674);
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
			setState(1678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1676);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1677);
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
			setState(1680);
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
			setState(1682);
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
			setState(1684);
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
		public Any_functionContext any_function() {
			return getRuleContext(Any_functionContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public Distinct_keywordContext distinct_keyword() {
			return getRuleContext(Distinct_keywordContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
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
			setState(1686);
			match(K_COUNT);
			setState(1687);
			match(OPEN_PAR);
			setState(1697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1688);
					distinct_keyword();
					}
					break;
				}
				setState(1691);
				dbColumnExpr();
				}
				break;
			case 2:
				{
				setState(1692);
				match(STAR);
				}
				break;
			case 3:
				{
				setState(1694);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1693);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1696);
				any_function();
				}
				break;
			}
			setState(1699);
			match(CLOSE_PAR);
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(1701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1700);
					match(K_AS);
					}
				}

				setState(1703);
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

	public static class Any_functionContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public Any_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAny_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAny_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAny_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_functionContext any_function() throws RecognitionException {
		Any_functionContext _localctx = new Any_functionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_any_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			function_name();
			setState(1707);
			match(OPEN_PAR);
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1709);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1708);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1711);
				expr(0);
				setState(1716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1712);
					match(COMMA);
					setState(1713);
					expr(0);
					}
					}
					setState(1718);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1719);
				match(STAR);
				}
				break;
			}
			setState(1722);
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
		enterRule(_localctx, 144, RULE_and_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
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
		enterRule(_localctx, 146, RULE_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
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
		enterRule(_localctx, 148, RULE_and_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
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
		enterRule(_localctx, 150, RULE_not_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
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
		enterRule(_localctx, 152, RULE_in_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
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
		enterRule(_localctx, 154, RULE_like_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
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
		enterRule(_localctx, 156, RULE_distinct_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
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
		enterRule(_localctx, 158, RULE_function_name);
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
		enterRule(_localctx, 160, RULE_database_name);
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
		enterRule(_localctx, 162, RULE_table_name);
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
		enterRule(_localctx, 164, RULE_table_or_index_name);
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
		enterRule(_localctx, 166, RULE_new_table_name);
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
		enterRule(_localctx, 168, RULE_column_name);
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
		enterRule(_localctx, 170, RULE_collation_name);
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
		enterRule(_localctx, 172, RULE_foreign_table);
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
		enterRule(_localctx, 174, RULE_index_name);
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
		enterRule(_localctx, 176, RULE_trigger_name);
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
		enterRule(_localctx, 178, RULE_view_name);
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
		enterRule(_localctx, 180, RULE_module_name);
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
		enterRule(_localctx, 182, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
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
		enterRule(_localctx, 184, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
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
		enterRule(_localctx, 186, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
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
		enterRule(_localctx, 188, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
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
		enterRule(_localctx, 190, RULE_any_name);
		try {
			setState(1777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
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
				setState(1771);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1772);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1773);
				match(OPEN_PAR);
				setState(1774);
				any_name();
				setState(1775);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a0\u06f6\4\2\t"+
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
		"`\t`\4a\ta\3\2\3\2\7\2\u00c5\n\2\f\2\16\2\u00c8\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\7\4\u00d1\n\4\f\4\16\4\u00d4\13\4\3\5\3\5\3\5\5\5\u00d9\n\5"+
		"\5\5\u00db\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00fb"+
		"\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0106\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u010e\n\7\3\7\5\7\u0111\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u011a\n\b\3\t\3\t\5\t\u011e\n\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u0126\n"+
		"\n\3\n\3\n\5\n\u012a\n\n\5\n\u012c\n\n\3\13\3\13\3\13\5\13\u0131\n\13"+
		"\5\13\u0133\n\13\3\f\3\f\5\f\u0137\n\f\3\f\3\f\3\f\7\f\u013c\n\f\f\f\16"+
		"\f\u013f\13\f\5\f\u0141\n\f\3\f\3\f\3\f\5\f\u0146\n\f\3\f\3\f\5\f\u014a"+
		"\n\f\3\f\6\f\u014d\n\f\r\f\16\f\u014e\3\f\3\f\3\f\3\f\3\f\7\f\u0156\n"+
		"\f\f\f\16\f\u0159\13\f\5\f\u015b\n\f\3\f\3\f\3\f\3\f\5\f\u0161\n\f\5\f"+
		"\u0163\n\f\3\r\3\r\5\r\u0167\n\r\3\r\3\r\3\r\3\r\5\r\u016d\n\r\3\r\3\r"+
		"\3\r\5\r\u0172\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u017b\n\r\f\r\16\r"+
		"\u017e\13\r\3\r\3\r\3\r\5\r\u0183\n\r\3\16\3\16\5\16\u0187\n\16\3\16\3"+
		"\16\3\16\3\16\5\16\u018d\n\16\3\16\3\16\3\16\5\16\u0192\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u0199\n\16\f\16\16\16\u019c\13\16\3\16\3\16\7\16"+
		"\u01a0\n\16\f\16\16\16\u01a3\13\16\3\16\3\16\3\16\5\16\u01a8\n\16\3\16"+
		"\3\16\5\16\u01ac\n\16\3\17\3\17\5\17\u01b0\n\17\3\17\3\17\3\17\3\17\5"+
		"\17\u01b6\n\17\3\17\3\17\3\17\5\17\u01bb\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u01c2\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01cb\n\17\f"+
		"\17\16\17\u01ce\13\17\5\17\u01d0\n\17\5\17\u01d2\n\17\3\17\3\17\3\17\3"+
		"\17\5\17\u01d8\n\17\3\17\3\17\3\17\3\17\5\17\u01de\n\17\3\17\3\17\5\17"+
		"\u01e2\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u01e9\n\17\3\17\3\17\6\17\u01ed"+
		"\n\17\r\17\16\17\u01ee\3\17\3\17\3\20\3\20\5\20\u01f5\n\20\3\20\3\20\3"+
		"\20\3\20\5\20\u01fb\n\20\3\20\3\20\3\20\5\20\u0200\n\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u020c\n\21\3\21\3\21\3\21\5\21"+
		"\u0211\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u021a\n\21\f\21\16"+
		"\21\u021d\13\21\3\21\3\21\5\21\u0221\n\21\3\22\5\22\u0224\n\22\3\22\3"+
		"\22\3\22\3\22\5\22\u022a\n\22\3\23\5\23\u022d\n\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0233\n\23\3\23\3\23\3\23\3\23\3\23\7\23\u023a\n\23\f\23\16\23\u023d"+
		"\13\23\5\23\u023f\n\23\3\23\3\23\3\23\3\23\5\23\u0245\n\23\5\23\u0247"+
		"\n\23\3\24\3\24\3\24\3\25\3\25\5\25\u024e\n\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\5\26\u0256\n\26\3\26\3\26\3\26\5\26\u025b\n\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\5\27\u0263\n\27\3\27\3\27\3\27\5\27\u0268\n\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\5\30\u0270\n\30\3\30\3\30\3\30\5\30\u0275\n\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\5\31\u027d\n\31\3\31\3\31\3\31\5\31\u0282"+
		"\n\31\3\31\3\31\3\32\3\32\5\32\u0288\n\32\3\32\3\32\3\32\7\32\u028d\n"+
		"\32\f\32\16\32\u0290\13\32\5\32\u0292\n\32\3\32\3\32\3\32\3\32\7\32\u0298"+
		"\n\32\f\32\16\32\u029b\13\32\3\32\3\32\3\32\3\32\3\32\7\32\u02a2\n\32"+
		"\f\32\16\32\u02a5\13\32\5\32\u02a7\n\32\3\32\3\32\3\32\3\32\5\32\u02ad"+
		"\n\32\5\32\u02af\n\32\3\33\5\33\u02b2\n\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02c5"+
		"\n\33\3\33\3\33\3\33\3\33\5\33\u02cb\n\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u02d2\n\33\f\33\16\33\u02d5\13\33\3\33\3\33\5\33\u02d9\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u02e0\n\33\f\33\16\33\u02e3\13\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u02eb\n\33\f\33\16\33\u02ee\13\33\3\33\3\33\7\33"+
		"\u02f2\n\33\f\33\16\33\u02f5\13\33\3\33\3\33\3\33\5\33\u02fa\n\33\3\34"+
		"\3\34\3\34\3\34\5\34\u0300\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0309\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0310\n\35\3\35\3\35\5\35\u0314"+
		"\n\35\5\35\u0316\n\35\3\36\3\36\5\36\u031a\n\36\3\36\3\36\3\37\3\37\3"+
		"\37\5\37\u0321\n\37\5\37\u0323\n\37\3\37\3\37\5\37\u0327\n\37\3\37\5\37"+
		"\u032a\n\37\3 \3 \3 \3!\3!\5!\u0331\n!\3!\3!\3!\7!\u0336\n!\f!\16!\u0339"+
		"\13!\5!\u033b\n!\3!\3!\3!\3!\3!\3!\7!\u0343\n!\f!\16!\u0346\13!\5!\u0348"+
		"\n!\3!\3!\3!\3!\5!\u034e\n!\5!\u0350\n!\3\"\3\"\5\"\u0354\n\"\3\"\3\""+
		"\3\"\7\"\u0359\n\"\f\"\16\"\u035c\13\"\5\"\u035e\n\"\3\"\3\"\3\"\3\"\7"+
		"\"\u0364\n\"\f\"\16\"\u0367\13\"\3\"\3\"\3\"\3\"\3\"\7\"\u036e\n\"\f\""+
		"\16\"\u0371\13\"\5\"\u0373\n\"\3\"\3\"\3\"\3\"\5\"\u0379\n\"\5\"\u037b"+
		"\n\"\3#\3#\5#\u037f\n#\3#\3#\3#\7#\u0384\n#\f#\16#\u0387\13#\3#\5#\u038a"+
		"\n#\3#\3#\5#\u038e\n#\3#\3#\3#\3#\3#\7#\u0395\n#\f#\16#\u0398\13#\3#\3"+
		"#\5#\u039c\n#\5#\u039e\n#\3#\3#\3#\3#\3#\7#\u03a5\n#\f#\16#\u03a8\13#"+
		"\3#\3#\3#\3#\3#\3#\7#\u03b0\n#\f#\16#\u03b3\13#\3#\3#\7#\u03b7\n#\f#\16"+
		"#\u03ba\13#\5#\u03bc\n#\3$\5$\u03bf\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\5$\u03cc\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u03d8\n$\f$\16$\u03db\13"+
		"$\3$\3$\5$\u03df\n$\3%\5%\u03e2\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5"+
		"%\u03ef\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u03fb\n%\f%\16%\u03fe\13%"+
		"\3%\3%\5%\u0402\n%\3%\3%\3%\3%\3%\7%\u0409\n%\f%\16%\u040c\13%\5%\u040e"+
		"\n%\3%\3%\3%\3%\5%\u0414\n%\5%\u0416\n%\3&\3&\3\'\3\'\5\'\u041c\n\'\3"+
		"\'\7\'\u041f\n\'\f\'\16\'\u0422\13\'\3(\6(\u0425\n(\r(\16(\u0426\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0433\n(\3)\3)\5)\u0437\n)\3)\3)\3)\5)\u043c"+
		"\n)\3)\3)\5)\u0440\n)\3)\5)\u0443\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\5)\u0455\n)\3)\3)\3)\5)\u045a\n)\3*\3*\3*\5*\u045f\n*"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0476"+
		"\n+\3+\5+\u0479\n+\3+\3+\3+\3+\3+\3+\5+\u0481\n+\3+\3+\3+\3+\3+\6+\u0488"+
		"\n+\r+\16+\u0489\3+\3+\5+\u048e\n+\3+\3+\3+\5+\u0493\n+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u04af"+
		"\n+\3+\3+\3+\5+\u04b4\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u04c0\n+\3+"+
		"\3+\3+\3+\5+\u04c6\n+\3+\3+\3+\3+\3+\5+\u04cd\n+\3+\3+\5+\u04d1\n+\3+"+
		"\3+\3+\3+\3+\3+\7+\u04d9\n+\f+\16+\u04dc\13+\5+\u04de\n+\3+\3+\3+\3+\5"+
		"+\u04e4\n+\3+\5+\u04e7\n+\7+\u04e9\n+\f+\16+\u04ec\13+\3,\3,\3,\3,\5,"+
		"\u04f2\n,\3,\3,\3,\5,\u04f7\n,\3,\3,\5,\u04fb\n,\3,\5,\u04fe\n,\5,\u0500"+
		"\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u050e\n-\3.\3.\3.\3.\3.\3."+
		"\7.\u0516\n.\f.\16.\u0519\13.\3.\3.\5.\u051d\n.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\5.\u0529\n.\3.\3.\5.\u052d\n.\7.\u052f\n.\f.\16.\u0532\13.\3."+
		"\5.\u0535\n.\3.\3.\3.\3.\3.\5.\u053c\n.\5.\u053e\n.\3/\3/\3/\3/\3/\3/"+
		"\5/\u0546\n/\3/\3/\3\60\3\60\3\60\5\60\u054d\n\60\3\60\5\60\u0550\n\60"+
		"\3\61\3\61\5\61\u0554\n\61\3\61\3\61\3\61\5\61\u0559\n\61\3\61\3\61\3"+
		"\61\3\61\7\61\u055f\n\61\f\61\16\61\u0562\13\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0572\n\61\f\61"+
		"\16\61\u0575\13\61\3\61\3\61\3\61\5\61\u057a\n\61\3\62\3\62\5\62\u057e"+
		"\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62"+
		"\u058c\n\62\f\62\16\62\u058f\13\62\3\63\3\63\3\63\5\63\u0594\n\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u059c\n\63\3\64\3\64\3\64\5\64\u05a1\n"+
		"\64\3\64\5\64\u05a4\n\64\3\65\3\65\3\65\5\65\u05a9\n\65\3\66\3\66\3\66"+
		"\3\66\3\66\7\66\u05b0\n\66\f\66\16\66\u05b3\13\66\3\66\3\66\5\66\u05b7"+
		"\n\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u05c6\n\67\38\38\38\58\u05cb\n8\38\38\58\u05cf\n8\38\58\u05d2\n"+
		"8\38\38\38\38\38\58\u05d9\n8\38\38\38\38\78\u05df\n8\f8\168\u05e2\138"+
		"\38\58\u05e5\n8\38\38\58\u05e9\n8\38\58\u05ec\n8\38\38\38\38\58\u05f2"+
		"\n8\38\58\u05f5\n8\58\u05f7\n8\39\39\39\39\39\79\u05fe\n9\f9\169\u0601"+
		"\139\3:\3:\5:\u0605\n:\3:\3:\5:\u0609\n:\3:\3:\5:\u060d\n:\3:\5:\u0610"+
		"\n:\3;\3;\3;\3;\3;\3;\3;\7;\u0619\n;\f;\16;\u061c\13;\3;\3;\5;\u0620\n"+
		";\3<\3<\5<\u0624\n<\3<\3<\3<\7<\u0629\n<\f<\16<\u062c\13<\3<\5<\u062f"+
		"\n<\3<\3<\5<\u0633\n<\3<\3<\3<\3<\3<\7<\u063a\n<\f<\16<\u063d\13<\3<\3"+
		"<\5<\u0641\n<\5<\u0643\n<\3<\3<\3<\3<\3<\7<\u064a\n<\f<\16<\u064d\13<"+
		"\3<\3<\3<\3<\3<\3<\7<\u0655\n<\f<\16<\u0658\13<\3<\3<\7<\u065c\n<\f<\16"+
		"<\u065f\13<\5<\u0661\n<\3=\3=\3=\3=\7=\u0667\n=\f=\16=\u066a\13=\3=\5"+
		"=\u066d\n=\3>\3>\3>\3>\3>\5>\u0674\n>\3?\3?\3?\3?\3?\7?\u067b\n?\f?\16"+
		"?\u067e\13?\3?\3?\5?\u0682\n?\3@\5@\u0685\n@\3@\3@\3A\3A\3B\3B\3C\3C\3"+
		"D\3D\5D\u0691\nD\3E\3E\3F\3F\3G\3G\3H\3H\3H\5H\u069c\nH\3H\3H\3H\5H\u06a1"+
		"\nH\3H\5H\u06a4\nH\3H\3H\5H\u06a8\nH\3H\5H\u06ab\nH\3I\3I\3I\5I\u06b0"+
		"\nI\3I\3I\3I\7I\u06b5\nI\fI\16I\u06b8\13I\3I\5I\u06bb\nI\3I\3I\3J\3J\3"+
		"K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3"+
		"V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a"+
		"\3a\3a\3a\3a\3a\5a\u06f4\na\3a\2\3Tb\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\2\25\5\2==HHUU\4\2\61"+
		"\61EE\4\2\7\7mm\3\2\u0086\u0087\4\2\37\37AA\4\2$$??\7\2\33\33KKTT}}\u0080"+
		"\u0080\4\2\t\t\16\17\3\2\n\13\3\2\20\23\3\2\24\27\6\2PPddffyy\4\2>>\u008e"+
		"\u008e\5\2\33\33KK\u0080\u0080\6\2\679kk\u0099\u0099\u009b\u009c\4\2\n"+
		"\fii\4\2\u0098\u0098\u009b\u009b\4\2\33\63\65\u0097\4\2\"\"oo\2\u07fa"+
		"\2\u00c6\3\2\2\2\4\u00cb\3\2\2\2\6\u00ce\3\2\2\2\b\u00da\3\2\2\2\n\u00fe"+
		"\3\2\2\2\f\u0100\3\2\2\2\16\u0112\3\2\2\2\20\u011b\3\2\2\2\22\u0123\3"+
		"\2\2\2\24\u012d\3\2\2\2\26\u0140\3\2\2\2\30\u0164\3\2\2\2\32\u0184\3\2"+
		"\2\2\34\u01ad\3\2\2\2\36\u01f2\3\2\2\2 \u0205\3\2\2\2\"\u0223\3\2\2\2"+
		"$\u022c\3\2\2\2&\u0248\3\2\2\2(\u024b\3\2\2\2*\u0251\3\2\2\2,\u025e\3"+
		"\2\2\2.\u026b\3\2\2\2\60\u0278\3\2\2\2\62\u0291\3\2\2\2\64\u02b1\3\2\2"+
		"\2\66\u02fb\3\2\2\28\u030a\3\2\2\2:\u0317\3\2\2\2<\u031d\3\2\2\2>\u032b"+
		"\3\2\2\2@\u033a\3\2\2\2B\u035d\3\2\2\2D\u03bb\3\2\2\2F\u03be\3\2\2\2H"+
		"\u03e1\3\2\2\2J\u0417\3\2\2\2L\u0419\3\2\2\2N\u0424\3\2\2\2P\u0436\3\2"+
		"\2\2R\u045e\3\2\2\2T\u0492\3\2\2\2V\u04ff\3\2\2\2X\u050d\3\2\2\2Z\u050f"+
		"\3\2\2\2\\\u053f\3\2\2\2^\u0549\3\2\2\2`\u0553\3\2\2\2b\u057b\3\2\2\2"+
		"d\u0593\3\2\2\2f\u059d\3\2\2\2h\u05a8\3\2\2\2j\u05aa\3\2\2\2l\u05c5\3"+
		"\2\2\2n\u05f6\3\2\2\2p\u05f8\3\2\2\2r\u060f\3\2\2\2t\u061f\3\2\2\2v\u0660"+
		"\3\2\2\2x\u0662\3\2\2\2z\u0673\3\2\2\2|\u0675\3\2\2\2~\u0684\3\2\2\2\u0080"+
		"\u0688\3\2\2\2\u0082\u068a\3\2\2\2\u0084\u068c\3\2\2\2\u0086\u0690\3\2"+
		"\2\2\u0088\u0692\3\2\2\2\u008a\u0694\3\2\2\2\u008c\u0696\3\2\2\2\u008e"+
		"\u0698\3\2\2\2\u0090\u06ac\3\2\2\2\u0092\u06be\3\2\2\2\u0094\u06c0\3\2"+
		"\2\2\u0096\u06c2\3\2\2\2\u0098\u06c4\3\2\2\2\u009a\u06c6\3\2\2\2\u009c"+
		"\u06c8\3\2\2\2\u009e\u06ca\3\2\2\2\u00a0\u06cc\3\2\2\2\u00a2\u06ce\3\2"+
		"\2\2\u00a4\u06d0\3\2\2\2\u00a6\u06d2\3\2\2\2\u00a8\u06d4\3\2\2\2\u00aa"+
		"\u06d6\3\2\2\2\u00ac\u06d8\3\2\2\2\u00ae\u06da\3\2\2\2\u00b0\u06dc\3\2"+
		"\2\2\u00b2\u06de\3\2\2\2\u00b4\u06e0\3\2\2\2\u00b6\u06e2\3\2\2\2\u00b8"+
		"\u06e4\3\2\2\2\u00ba\u06e6\3\2\2\2\u00bc\u06e8\3\2\2\2\u00be\u06ea\3\2"+
		"\2\2\u00c0\u06f3\3\2\2\2\u00c2\u00c5\5\6\4\2\u00c3\u00c5\5\4\3\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\7\2\2\3\u00ca\3\3\2\2\2\u00cb\u00cc\7\u00a0\2\2\u00cc\u00cd\b\3"+
		"\1\2\u00cd\5\3\2\2\2\u00ce\u00d2\5\b\5\2\u00cf\u00d1\5\b\5\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\7\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\7J\2\2\u00d6\u00d7\7u\2\2\u00d7"+
		"\u00d9\7r\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2"+
		"\2\2\u00da\u00d5\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00fa\3\2\2\2\u00dc"+
		"\u00fb\5\f\7\2\u00dd\u00fb\5\16\b\2\u00de\u00fb\5\20\t\2\u00df\u00fb\5"+
		"\22\n\2\u00e0\u00fb\5\24\13\2\u00e1\u00fb\5\26\f\2\u00e2\u00fb\5\30\r"+
		"\2\u00e3\u00fb\5\32\16\2\u00e4\u00fb\5\34\17\2\u00e5\u00fb\5\36\20\2\u00e6"+
		"\u00fb\5 \21\2\u00e7\u00fb\5\"\22\2\u00e8\u00fb\5$\23\2\u00e9\u00fb\5"+
		"(\25\2\u00ea\u00fb\5*\26\2\u00eb\u00fb\5,\27\2\u00ec\u00fb\5.\30\2\u00ed"+
		"\u00fb\5\60\31\2\u00ee\u00fb\5\62\32\2\u00ef\u00fb\5\64\33\2\u00f0\u00fb"+
		"\5\66\34\2\u00f1\u00fb\58\35\2\u00f2\u00fb\5:\36\2\u00f3\u00fb\5<\37\2"+
		"\u00f4\u00fb\5> \2\u00f5\u00fb\5@!\2\u00f6\u00fb\5B\"\2\u00f7\u00fb\5"+
		"F$\2\u00f8\u00fb\5H%\2\u00f9\u00fb\5J&\2\u00fa\u00dc\3\2\2\2\u00fa\u00dd"+
		"\3\2\2\2\u00fa\u00de\3\2\2\2\u00fa\u00df\3\2\2\2\u00fa\u00e0\3\2\2\2\u00fa"+
		"\u00e1\3\2\2\2\u00fa\u00e2\3\2\2\2\u00fa\u00e3\3\2\2\2\u00fa\u00e4\3\2"+
		"\2\2\u00fa\u00e5\3\2\2\2\u00fa\u00e6\3\2\2\2\u00fa\u00e7\3\2\2\2\u00fa"+
		"\u00e8\3\2\2\2\u00fa\u00e9\3\2\2\2\u00fa\u00ea\3\2\2\2\u00fa\u00eb\3\2"+
		"\2\2\u00fa\u00ec\3\2\2\2\u00fa\u00ed\3\2\2\2\u00fa\u00ee\3\2\2\2\u00fa"+
		"\u00ef\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f2\3\2"+
		"\2\2\u00fa\u00f3\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fa"+
		"\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\5\n\6\2\u00fd\t\3\2\2\2\u00fe\u00ff"+
		"\7\3\2\2\u00ff\13\3\2\2\2\u0100\u0101\7 \2\2\u0101\u0105\7\u0085\2\2\u0102"+
		"\u0103\5\u00a2R\2\u0103\u0104\7\4\2\2\u0104\u0106\3\2\2\2\u0105\u0102"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0110\5\u00a4S"+
		"\2\u0108\u0109\7|\2\2\u0109\u010a\7\u0089\2\2\u010a\u0111\5\u00a8U\2\u010b"+
		"\u010d\7\35\2\2\u010c\u010e\7\60\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3"+
		"\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\5L\'\2\u0110\u0108\3\2\2\2\u0110"+
		"\u010b\3\2\2\2\u0111\r\3\2\2\2\u0112\u0119\7!\2\2\u0113\u011a\5\u00a2"+
		"R\2\u0114\u011a\5\u00a6T\2\u0115\u0116\5\u00a2R\2\u0116\u0117\7\4\2\2"+
		"\u0117\u0118\5\u00a6T\2\u0118\u011a\3\2\2\2\u0119\u0113\3\2\2\2\u0119"+
		"\u0114\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u011a\3\2\2\2\u011a\17\3\2\2"+
		"\2\u011b\u011d\7%\2\2\u011c\u011e\7:\2\2\u011d\u011c\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\5T+\2\u0120\u0121\7#\2\2\u0121"+
		"\u0122\5\u00a2R\2\u0122\21\3\2\2\2\u0123\u0125\7(\2\2\u0124\u0126\t\2"+
		"\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012b\3\2\2\2\u0127"+
		"\u0129\7\u008a\2\2\u0128\u012a\5\u00be`\2\u0129\u0128\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\23\3\2\2\2\u012d\u0132\t\3\2\2\u012e\u0130\7\u008a\2\2\u012f\u0131\5"+
		"\u00be`\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2"+
		"\u0132\u012e\3\2\2\2\u0132\u0133\3\2\2\2\u0133\25\3\2\2\2\u0134\u0136"+
		"\7\u0096\2\2\u0135\u0137\7w\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2"+
		"\2\u0137\u0138\3\2\2\2\u0138\u013d\5j\66\2\u0139\u013a\7\7\2\2\u013a\u013c"+
		"\5j\66\2\u013b\u0139\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0134\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u014c\5v<\2\u0143\u0145"+
		"\7\u008c\2\2\u0144\u0146\7\37\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u014a\3\2\2\2\u0147\u014a\7]\2\2\u0148\u014a\7G\2\2\u0149\u0143"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014d\5v<\2\u014c\u0149\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2"+
		"\2\u014e\u014f\3\2\2\2\u014f\u015a\3\2\2\2\u0150\u0151\7p\2\2\u0151\u0152"+
		"\7*\2\2\u0152\u0157\5f\64\2\u0153\u0154\7\7\2\2\u0154\u0156\5f\64\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u0150\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u0162\3\2\2\2\u015c\u015d\7e\2\2\u015d\u0160\5T+"+
		"\2\u015e\u015f\t\4\2\2\u015f\u0161\5T+\2\u0160\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u015c\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\27\3\2\2\2\u0164\u0166\7\65\2\2\u0165\u0167\7\u008d\2\2\u0166\u0165\3"+
		"\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016c\7W\2\2\u0169"+
		"\u016a\7S\2\2\u016a\u016b\7i\2\2\u016b\u016d\7I\2\2\u016c\u0169\3\2\2"+
		"\2\u016c\u016d\3\2\2\2\u016d\u0171\3\2\2\2\u016e\u016f\5\u00a2R\2\u016f"+
		"\u0170\7\4\2\2\u0170\u0172\3\2\2\2\u0171\u016e\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\u0174\5\u00b0Y\2\u0174\u0175\7n\2\2\u0175"+
		"\u0176\5\u00a4S\2\u0176\u0177\7\5\2\2\u0177\u017c\5^\60\2\u0178\u0179"+
		"\7\7\2\2\u0179\u017b\5^\60\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2"+
		"\2\2\u017f\u0182\7\6\2\2\u0180\u0181\7\u0095\2\2\u0181\u0183\5T+\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\31\3\2\2\2\u0184\u0186\7\65\2"+
		"\2\u0185\u0187\t\5\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u018c\7\u0085\2\2\u0189\u018a\7S\2\2\u018a\u018b\7i\2\2"+
		"\u018b\u018d\7I\2\2\u018c\u0189\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0191"+
		"\3\2\2\2\u018e\u018f\5\u00a2R\2\u018f\u0190\7\4\2\2\u0190\u0192\3\2\2"+
		"\2\u0191\u018e\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u01ab"+
		"\5\u00a4S\2\u0194\u0195\7\5\2\2\u0195\u019a\5L\'\2\u0196\u0197\7\7\2\2"+
		"\u0197\u0199\5L\'\2\u0198\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01a1\3\2\2\2\u019c\u019a\3\2\2\2\u019d"+
		"\u019e\7\7\2\2\u019e\u01a0\5`\61\2\u019f\u019d\3\2\2\2\u01a0\u01a3\3\2"+
		"\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a4\u01a7\7\6\2\2\u01a5\u01a6\7\u0097\2\2\u01a6\u01a8"+
		"\7\u0098\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ac\3\2\2"+
		"\2\u01a9\u01aa\7#\2\2\u01aa\u01ac\5B\"\2\u01ab\u0194\3\2\2\2\u01ab\u01a9"+
		"\3\2\2\2\u01ac\33\3\2\2\2\u01ad\u01af\7\65\2\2\u01ae\u01b0\t\5\2\2\u01af"+
		"\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b5\7\u008b"+
		"\2\2\u01b2\u01b3\7S\2\2\u01b3\u01b4\7i\2\2\u01b4\u01b6\7I\2\2\u01b5\u01b2"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01ba\3\2\2\2\u01b7\u01b8\5\u00a2R"+
		"\2\u01b8\u01b9\7\4\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b7\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c1\5\u00b2Z\2\u01bd\u01c2\7\'\2"+
		"\2\u01be\u01c2\7\36\2\2\u01bf\u01c0\7\\\2\2\u01c0\u01c2\7l\2\2\u01c1\u01bd"+
		"\3\2\2\2\u01c1\u01be\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01d1\3\2\2\2\u01c3\u01d2\7>\2\2\u01c4\u01d2\7[\2\2\u01c5\u01cf\7\u008e"+
		"\2\2\u01c6\u01c7\7l\2\2\u01c7\u01cc\5\u00aaV\2\u01c8\u01c9\7\7\2\2\u01c9"+
		"\u01cb\5\u00aaV\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca"+
		"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf"+
		"\u01c6\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01c3\3\2"+
		"\2\2\u01d1\u01c4\3\2\2\2\u01d1\u01c5\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d7\7n\2\2\u01d4\u01d5\5\u00a2R\2\u01d5\u01d6\7\4\2\2\u01d6\u01d8\3"+
		"\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01dd\5\u00a4S\2\u01da\u01db\7L\2\2\u01db\u01dc\7C\2\2\u01dc\u01de\7"+
		"\u0081\2\2\u01dd\u01da\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e1\3\2\2\2"+
		"\u01df\u01e0\7\u0094\2\2\u01e0\u01e2\5T+\2\u01e1\u01df\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01ec\7(\2\2\u01e4\u01e9\5F$\2\u01e5"+
		"\u01e9\5\64\33\2\u01e6\u01e9\5\"\22\2\u01e7\u01e9\5B\"\2\u01e8\u01e4\3"+
		"\2\2\2\u01e8\u01e5\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01eb\7\3\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01e8\3\2"+
		"\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f1\7E\2\2\u01f1\35\3\2\2\2\u01f2\u01f4\7\65\2"+
		"\2\u01f3\u01f5\t\5\2\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01fa\7\u0092\2\2\u01f7\u01f8\7S\2\2\u01f8\u01f9\7i\2\2"+
		"\u01f9\u01fb\7I\2\2\u01fa\u01f7\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01ff"+
		"\3\2\2\2\u01fc\u01fd\5\u00a2R\2\u01fd\u01fe\7\4\2\2\u01fe\u0200\3\2\2"+
		"\2\u01ff\u01fc\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202"+
		"\5\u00b4[\2\u0202\u0203\7#\2\2\u0203\u0204\5B\"\2\u0204\37\3\2\2\2\u0205"+
		"\u0206\7\65\2\2\u0206\u0207\7\u0093\2\2\u0207\u020b\7\u0085\2\2\u0208"+
		"\u0209\7S\2\2\u0209\u020a\7i\2\2\u020a\u020c\7I\2\2\u020b\u0208\3\2\2"+
		"\2\u020b\u020c\3\2\2\2\u020c\u0210\3\2\2\2\u020d\u020e\5\u00a2R\2\u020e"+
		"\u020f\7\4\2\2\u020f\u0211\3\2\2\2\u0210\u020d\3\2\2\2\u0210\u0211\3\2"+
		"\2\2\u0211\u0212\3\2\2\2\u0212\u0213\5\u00a4S\2\u0213\u0214\7\u008f\2"+
		"\2\u0214\u0220\5\u00b6\\\2\u0215\u0216\7\5\2\2\u0216\u021b\5\u0086D\2"+
		"\u0217\u0218\7\7\2\2\u0218\u021a\5\u0086D\2\u0219\u0217\3\2\2\2\u021a"+
		"\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2"+
		"\2\2\u021d\u021b\3\2\2\2\u021e\u021f\7\6\2\2\u021f\u0221\3\2\2\2\u0220"+
		"\u0215\3\2\2\2\u0220\u0221\3\2\2\2\u0221!\3\2\2\2\u0222\u0224\5b\62\2"+
		"\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226"+
		"\7>\2\2\u0226\u0229\5&\24\2\u0227\u0228\7\u0095\2\2\u0228\u022a\5T+\2"+
		"\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a#\3\2\2\2\u022b\u022d\5"+
		"b\62\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u022f\7>\2\2\u022f\u0232\5&\24\2\u0230\u0231\7\u0095\2\2\u0231\u0233"+
		"\5T+\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0246\3\2\2\2\u0234"+
		"\u0235\7p\2\2\u0235\u0236\7*\2\2\u0236\u023b\5f\64\2\u0237\u0238\7\7\2"+
		"\2\u0238\u023a\5f\64\2\u0239\u0237\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239"+
		"\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023e"+
		"\u0234\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\7e"+
		"\2\2\u0241\u0244\5T+\2\u0242\u0243\t\4\2\2\u0243\u0245\5T+\2\u0244\u0242"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u023e\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247%\3\2\2\2\u0248\u0249\7N\2\2\u0249\u024a\5d\63\2\u024a"+
		"\'\3\2\2\2\u024b\u024d\7@\2\2\u024c\u024e\7:\2\2\u024d\u024c\3\2\2\2\u024d"+
		"\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\5\u00a2R\2\u0250)\3\2\2"+
		"\2\u0251\u0252\7B\2\2\u0252\u0255\7W\2\2\u0253\u0254\7S\2\2\u0254\u0256"+
		"\7I\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u025a\3\2\2\2\u0257"+
		"\u0258\5\u00a2R\2\u0258\u0259\7\4\2\2\u0259\u025b\3\2\2\2\u025a\u0257"+
		"\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\5\u00b0Y"+
		"\2\u025d+\3\2\2\2\u025e\u025f\7B\2\2\u025f\u0262\7\u0085\2\2\u0260\u0261"+
		"\7S\2\2\u0261\u0263\7I\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263"+
		"\u0267\3\2\2\2\u0264\u0265\5\u00a2R\2\u0265\u0266\7\4\2\2\u0266\u0268"+
		"\3\2\2\2\u0267\u0264\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u026a\5\u00a4S\2\u026a-\3\2\2\2\u026b\u026c\7B\2\2\u026c\u026f\7\u008b"+
		"\2\2\u026d\u026e\7S\2\2\u026e\u0270\7I\2\2\u026f\u026d\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\u0274\3\2\2\2\u0271\u0272\5\u00a2R\2\u0272\u0273\7\4\2"+
		"\2\u0273\u0275\3\2\2\2\u0274\u0271\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276"+
		"\3\2\2\2\u0276\u0277\5\u00b2Z\2\u0277/\3\2\2\2\u0278\u0279\7B\2\2\u0279"+
		"\u027c\7\u0092\2\2\u027a\u027b\7S\2\2\u027b\u027d\7I\2\2\u027c\u027a\3"+
		"\2\2\2\u027c\u027d\3\2\2\2\u027d\u0281\3\2\2\2\u027e\u027f\5\u00a2R\2"+
		"\u027f\u0280\7\4\2\2\u0280\u0282\3\2\2\2\u0281\u027e\3\2\2\2\u0281\u0282"+
		"\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\5\u00b4[\2\u0284\61\3\2\2\2\u0285"+
		"\u0287\7\u0096\2\2\u0286\u0288\7w\2\2\u0287\u0286\3\2\2\2\u0287\u0288"+
		"\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028e\5j\66\2\u028a\u028b\7\7\2\2\u028b"+
		"\u028d\5j\66\2\u028c\u028a\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2"+
		"\2\2\u028e\u028f\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0291"+
		"\u0285\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0299\5v"+
		"<\2\u0294\u0295\5z>\2\u0295\u0296\5v<\2\u0296\u0298\3\2\2\2\u0297\u0294"+
		"\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u02a6\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029d\7p\2\2\u029d\u029e\7*\2"+
		"\2\u029e\u02a3\5f\64\2\u029f\u02a0\7\7\2\2\u02a0\u02a2\5f\64\2\u02a1\u029f"+
		"\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u029c\3\2\2\2\u02a6\u02a7\3\2"+
		"\2\2\u02a7\u02ae\3\2\2\2\u02a8\u02a9\7e\2\2\u02a9\u02ac\5T+\2\u02aa\u02ab"+
		"\t\4\2\2\u02ab\u02ad\5T+\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad"+
		"\u02af\3\2\2\2\u02ae\u02a8\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\63\3\2\2"+
		"\2\u02b0\u02b2\5b\62\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02c4"+
		"\3\2\2\2\u02b3\u02c5\7[\2\2\u02b4\u02c5\7}\2\2\u02b5\u02b6\7[\2\2\u02b6"+
		"\u02b7\7o\2\2\u02b7\u02c5\7}\2\2\u02b8\u02b9\7[\2\2\u02b9\u02ba\7o\2\2"+
		"\u02ba\u02c5\7\u0080\2\2\u02bb\u02bc\7[\2\2\u02bc\u02bd\7o\2\2\u02bd\u02c5"+
		"\7\33\2\2\u02be\u02bf\7[\2\2\u02bf\u02c0\7o\2\2\u02c0\u02c5\7K\2\2\u02c1"+
		"\u02c2\7[\2\2\u02c2\u02c3\7o\2\2\u02c3\u02c5\7T\2\2\u02c4\u02b3\3\2\2"+
		"\2\u02c4\u02b4\3\2\2\2\u02c4\u02b5\3\2\2\2\u02c4\u02b8\3\2\2\2\u02c4\u02bb"+
		"\3\2\2\2\u02c4\u02be\3\2\2\2\u02c4\u02c1\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6"+
		"\u02ca\7^\2\2\u02c7\u02c8\5\u00a2R\2\u02c8\u02c9\7\4\2\2\u02c9\u02cb\3"+
		"\2\2\2\u02ca\u02c7\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02d8\5\u00a4S\2\u02cd\u02ce\7\5\2\2\u02ce\u02d3\5\u00aaV\2\u02cf\u02d0"+
		"\7\7\2\2\u02d0\u02d2\5\u00aaV\2\u02d1\u02cf\3\2\2\2\u02d2\u02d5\3\2\2"+
		"\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02d3"+
		"\3\2\2\2\u02d6\u02d7\7\6\2\2\u02d7\u02d9\3\2\2\2\u02d8\u02cd\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9\u02f9\3\2\2\2\u02da\u02db\7\u0091\2\2\u02db\u02dc"+
		"\7\5\2\2\u02dc\u02e1\5T+\2\u02dd\u02de\7\7\2\2\u02de\u02e0\5T+\2\u02df"+
		"\u02dd\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2"+
		"\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4\u02f3\7\6\2\2\u02e5"+
		"\u02e6\7\7\2\2\u02e6\u02e7\7\5\2\2\u02e7\u02ec\5T+\2\u02e8\u02e9\7\7\2"+
		"\2\u02e9\u02eb\5T+\2\u02ea\u02e8\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea"+
		"\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ef"+
		"\u02f0\7\6\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02e5\3\2\2\2\u02f2\u02f5\3\2"+
		"\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02fa\3\2\2\2\u02f5"+
		"\u02f3\3\2\2\2\u02f6\u02fa\5B\"\2\u02f7\u02f8\7;\2\2\u02f8\u02fa\7\u0091"+
		"\2\2\u02f9\u02da\3\2\2\2\u02f9\u02f6\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa"+
		"\65\3\2\2\2\u02fb\u02ff\7s\2\2\u02fc\u02fd\5\u00a2R\2\u02fd\u02fe\7\4"+
		"\2\2\u02fe\u0300\3\2\2\2\u02ff\u02fc\3\2\2\2\u02ff\u0300\3\2\2\2\u0300"+
		"\u0301\3\2\2\2\u0301\u0308\5\u00b8]\2\u0302\u0303\7\b\2\2\u0303\u0309"+
		"\5h\65\2\u0304\u0305\7\5\2\2\u0305\u0306\5h\65\2\u0306\u0307\7\6\2\2\u0307"+
		"\u0309\3\2\2\2\u0308\u0302\3\2\2\2\u0308\u0304\3\2\2\2\u0308\u0309\3\2"+
		"\2\2\u0309\67\3\2\2\2\u030a\u0315\7z\2\2\u030b\u0316\5\u00acW\2\u030c"+
		"\u030d\5\u00a2R\2\u030d\u030e\7\4\2\2\u030e\u0310\3\2\2\2\u030f\u030c"+
		"\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u0314\5\u00a4S"+
		"\2\u0312\u0314\5\u00b0Y\2\u0313\u0311\3\2\2\2\u0313\u0312\3\2\2\2\u0314"+
		"\u0316\3\2\2\2\u0315\u030b\3\2\2\2\u0315\u030f\3\2\2\2\u0315\u0316\3\2"+
		"\2\2\u03169\3\2\2\2\u0317\u0319\7{\2\2\u0318\u031a\7\u0082\2\2\u0319\u0318"+
		"\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\5\u00ba^"+
		"\2\u031c;\3\2\2\2\u031d\u0322\7\u0080\2\2\u031e\u0320\7\u008a\2\2\u031f"+
		"\u0321\5\u00be`\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0323"+
		"\3\2\2\2\u0322\u031e\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0329\3\2\2\2\u0324"+
		"\u0326\7\u0089\2\2\u0325\u0327\7\u0082\2\2\u0326\u0325\3\2\2\2\u0326\u0327"+
		"\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032a\5\u00ba^\2\u0329\u0324\3\2\2"+
		"\2\u0329\u032a\3\2\2\2\u032a=\3\2\2\2\u032b\u032c\7\u0082\2\2\u032c\u032d"+
		"\5\u00ba^\2\u032d?\3\2\2\2\u032e\u0330\7\u0096\2\2\u032f\u0331\7w\2\2"+
		"\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0337"+
		"\5j\66\2\u0333\u0334\7\7\2\2\u0334\u0336\5j\66\2\u0335\u0333\3\2\2\2\u0336"+
		"\u0339\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033b\3\2"+
		"\2\2\u0339\u0337\3\2\2\2\u033a\u032e\3\2\2\2\u033a\u033b\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u0347\5v<\2\u033d\u033e\7p\2\2\u033e\u033f\7*\2\2"+
		"\u033f\u0344\5f\64\2\u0340\u0341\7\7\2\2\u0341\u0343\5f\64\2\u0342\u0340"+
		"\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345"+
		"\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0347\u033d\3\2\2\2\u0347\u0348\3\2"+
		"\2\2\u0348\u034f\3\2\2\2\u0349\u034a\7e\2\2\u034a\u034d\5T+\2\u034b\u034c"+
		"\t\4\2\2\u034c\u034e\5T+\2\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e"+
		"\u0350\3\2\2\2\u034f\u0349\3\2\2\2\u034f\u0350\3\2\2\2\u0350A\3\2\2\2"+
		"\u0351\u0353\7\u0096\2\2\u0352\u0354\7w\2\2\u0353\u0352\3\2\2\2\u0353"+
		"\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u035a\5j\66\2\u0356\u0357\7\7"+
		"\2\2\u0357\u0359\5j\66\2\u0358\u0356\3\2\2\2\u0359\u035c\3\2\2\2\u035a"+
		"\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2"+
		"\2\2\u035d\u0351\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\3\2\2\2\u035f"+
		"\u0365\5D#\2\u0360\u0361\5z>\2\u0361\u0362\5D#\2\u0362\u0364\3\2\2\2\u0363"+
		"\u0360\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2"+
		"\2\2\u0366\u0372\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u0369\7p\2\2\u0369"+
		"\u036a\7*\2\2\u036a\u036f\5f\64\2\u036b\u036c\7\7\2\2\u036c\u036e\5f\64"+
		"\2\u036d\u036b\3\2\2\2\u036e\u0371\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370"+
		"\3\2\2\2\u0370\u0373\3\2\2\2\u0371\u036f\3\2\2\2\u0372\u0368\3\2\2\2\u0372"+
		"\u0373\3\2\2\2\u0373\u037a\3\2\2\2\u0374\u0375\7e\2\2\u0375\u0378\5T+"+
		"\2\u0376\u0377\t\4\2\2\u0377\u0379\5T+\2\u0378\u0376\3\2\2\2\u0378\u0379"+
		"\3\2\2\2\u0379\u037b\3\2\2\2\u037a\u0374\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"C\3\2\2\2\u037c\u037e\7\u0083\2\2\u037d\u037f\t\6\2\2\u037e\u037d\3\2"+
		"\2\2\u037e\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0385\5l\67\2\u0381"+
		"\u0382\7\7\2\2\u0382\u0384\5l\67\2\u0383\u0381\3\2\2\2\u0384\u0387\3\2"+
		"\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0389\3\2\2\2\u0387"+
		"\u0385\3\2\2\2\u0388\u038a\5x=\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2"+
		"\2\u038a\u038d\3\2\2\2\u038b\u038c\7\u0095\2\2\u038c\u038e\5T+\2\u038d"+
		"\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u039d\3\2\2\2\u038f\u0390\7Q"+
		"\2\2\u0390\u0391\7*\2\2\u0391\u0396\5T+\2\u0392\u0393\7\7\2\2\u0393\u0395"+
		"\5T+\2\u0394\u0392\3\2\2\2\u0395\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0396"+
		"\u0397\3\2\2\2\u0397\u039b\3\2\2\2\u0398\u0396\3\2\2\2\u0399\u039a\7R"+
		"\2\2\u039a\u039c\5T+\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e"+
		"\3\2\2\2\u039d\u038f\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03bc\3\2\2\2\u039f"+
		"\u03a0\7\u0091\2\2\u03a0\u03a1\7\5\2\2\u03a1\u03a6\5T+\2\u03a2\u03a3\7"+
		"\7\2\2\u03a3\u03a5\5T+\2\u03a4\u03a2\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6"+
		"\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a6\3\2"+
		"\2\2\u03a9\u03b8\7\6\2\2\u03aa\u03ab\7\7\2\2\u03ab\u03ac\7\5\2\2\u03ac"+
		"\u03b1\5T+\2\u03ad\u03ae\7\7\2\2\u03ae\u03b0\5T+\2\u03af\u03ad\3\2\2\2"+
		"\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b4"+
		"\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03b5\7\6\2\2\u03b5\u03b7\3\2\2\2\u03b6"+
		"\u03aa\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2"+
		"\2\2\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb\u037c\3\2\2\2\u03bb"+
		"\u039f\3\2\2\2\u03bcE\3\2\2\2\u03bd\u03bf\5b\62\2\u03be\u03bd\3\2\2\2"+
		"\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03cb\7\u008e\2\2\u03c1"+
		"\u03c2\7o\2\2\u03c2\u03cc\7\u0080\2\2\u03c3\u03c4\7o\2\2\u03c4\u03cc\7"+
		"\33\2\2\u03c5\u03c6\7o\2\2\u03c6\u03cc\7}\2\2\u03c7\u03c8\7o\2\2\u03c8"+
		"\u03cc\7K\2\2\u03c9\u03ca\7o\2\2\u03ca\u03cc\7T\2\2\u03cb\u03c1\3\2\2"+
		"\2\u03cb\u03c3\3\2\2\2\u03cb\u03c5\3\2\2\2\u03cb\u03c7\3\2\2\2\u03cb\u03c9"+
		"\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\5d\63\2\u03ce"+
		"\u03cf\7\u0084\2\2\u03cf\u03d0\5\u00aaV\2\u03d0\u03d1\7\b\2\2\u03d1\u03d9"+
		"\5T+\2\u03d2\u03d3\7\7\2\2\u03d3\u03d4\5\u00aaV\2\u03d4\u03d5\7\b\2\2"+
		"\u03d5\u03d6\5T+\2\u03d6\u03d8\3\2\2\2\u03d7\u03d2\3\2\2\2\u03d8\u03db"+
		"\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03de\3\2\2\2\u03db"+
		"\u03d9\3\2\2\2\u03dc\u03dd\7\u0095\2\2\u03dd\u03df\5T+\2\u03de\u03dc\3"+
		"\2\2\2\u03de\u03df\3\2\2\2\u03dfG\3\2\2\2\u03e0\u03e2\5b\62\2\u03e1\u03e0"+
		"\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03ee\7\u008e\2"+
		"\2\u03e4\u03e5\7o\2\2\u03e5\u03ef\7\u0080\2\2\u03e6\u03e7\7o\2\2\u03e7"+
		"\u03ef\7\33\2\2\u03e8\u03e9\7o\2\2\u03e9\u03ef\7}\2\2\u03ea\u03eb\7o\2"+
		"\2\u03eb\u03ef\7K\2\2\u03ec\u03ed\7o\2\2\u03ed\u03ef\7T\2\2\u03ee\u03e4"+
		"\3\2\2\2\u03ee\u03e6\3\2\2\2\u03ee\u03e8\3\2\2\2\u03ee\u03ea\3\2\2\2\u03ee"+
		"\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\5d"+
		"\63\2\u03f1\u03f2\7\u0084\2\2\u03f2\u03f3\5\u00aaV\2\u03f3\u03f4\7\b\2"+
		"\2\u03f4\u03fc\5T+\2\u03f5\u03f6\7\7\2\2\u03f6\u03f7\5\u00aaV\2\u03f7"+
		"\u03f8\7\b\2\2\u03f8\u03f9\5T+\2\u03f9\u03fb\3\2\2\2\u03fa\u03f5\3\2\2"+
		"\2\u03fb\u03fe\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u0401"+
		"\3\2\2\2\u03fe\u03fc\3\2\2\2\u03ff\u0400\7\u0095\2\2\u0400\u0402\5T+\2"+
		"\u0401\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0415\3\2\2\2\u0403\u0404"+
		"\7p\2\2\u0404\u0405\7*\2\2\u0405\u040a\5f\64\2\u0406\u0407\7\7\2\2\u0407"+
		"\u0409\5f\64\2\u0408\u0406\3\2\2\2\u0409\u040c\3\2\2\2\u040a\u0408\3\2"+
		"\2\2\u040a\u040b\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040a\3\2\2\2\u040d"+
		"\u0403\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\7e"+
		"\2\2\u0410\u0413\5T+\2\u0411\u0412\t\4\2\2\u0412\u0414\5T+\2\u0413\u0411"+
		"\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0416\3\2\2\2\u0415\u040d\3\2\2\2\u0415"+
		"\u0416\3\2\2\2\u0416I\3\2\2\2\u0417\u0418\7\u0090\2\2\u0418K\3\2\2\2\u0419"+
		"\u041b\5\u00aaV\2\u041a\u041c\5N(\2\u041b\u041a\3\2\2\2\u041b\u041c\3"+
		"\2\2\2\u041c\u0420\3\2\2\2\u041d\u041f\5P)\2\u041e\u041d\3\2\2\2\u041f"+
		"\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421M\3\2\2\2"+
		"\u0422\u0420\3\2\2\2\u0423\u0425\5\u008cG\2\u0424\u0423\3\2\2\2\u0425"+
		"\u0426\3\2\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0432\3\2"+
		"\2\2\u0428\u0429\7\5\2\2\u0429\u042a\5~@\2\u042a\u042b\7\6\2\2\u042b\u0433"+
		"\3\2\2\2\u042c\u042d\7\5\2\2\u042d\u042e\5~@\2\u042e\u042f\7\7\2\2\u042f"+
		"\u0430\5~@\2\u0430\u0431\7\6\2\2\u0431\u0433\3\2\2\2\u0432\u0428\3\2\2"+
		"\2\u0432\u042c\3\2\2\2\u0432\u0433\3\2\2\2\u0433O\3\2\2\2\u0434\u0435"+
		"\7\63\2\2\u0435\u0437\5\u008cG\2\u0436\u0434\3\2\2\2\u0436\u0437\3\2\2"+
		"\2\u0437\u0459\3\2\2\2\u0438\u0439\7t\2\2\u0439\u043b\7b\2\2\u043a\u043c"+
		"\t\7\2\2\u043b\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\3\2\2\2\u043d"+
		"\u043f\5R*\2\u043e\u0440\7&\2\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2"+
		"\2\u0440\u045a\3\2\2\2\u0441\u0443\7i\2\2\u0442\u0441\3\2\2\2\u0442\u0443"+
		"\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445\7k\2\2\u0445\u045a\5R*\2\u0446"+
		"\u0447\7\u008d\2\2\u0447\u045a\5R*\2\u0448\u0449\7.\2\2\u0449\u044a\7"+
		"\5\2\2\u044a\u044b\5T+\2\u044b\u044c\7\6\2\2\u044c\u045a\3\2\2\2\u044d"+
		"\u0454\7;\2\2\u044e\u0455\5~@\2\u044f\u0455\5\u0080A\2\u0450\u0451\7\5"+
		"\2\2\u0451\u0452\5T+\2\u0452\u0453\7\6\2\2\u0453\u0455\3\2\2\2\u0454\u044e"+
		"\3\2\2\2\u0454\u044f\3\2\2\2\u0454\u0450\3\2\2\2\u0455\u045a\3\2\2\2\u0456"+
		"\u0457\7/\2\2\u0457\u045a\5\u00acW\2\u0458\u045a\5Z.\2\u0459\u0438\3\2"+
		"\2\2\u0459\u0442\3\2\2\2\u0459\u0446\3\2\2\2\u0459\u0448\3\2\2\2\u0459"+
		"\u044d\3\2\2\2\u0459\u0456\3\2\2\2\u0459\u0458\3\2\2\2\u045aQ\3\2\2\2"+
		"\u045b\u045c\7n\2\2\u045c\u045d\7\62\2\2\u045d\u045f\t\b\2\2\u045e\u045b"+
		"\3\2\2\2\u045e\u045f\3\2\2\2\u045fS\3\2\2\2\u0460\u0461\b+\1\2\u0461\u0493"+
		"\5\u0080A\2\u0462\u0493\7\u009a\2\2\u0463\u0493\5V,\2\u0464\u0465\5\u0082"+
		"B\2\u0465\u0466\5T+\27\u0466\u0493\3\2\2\2\u0467\u0493\5\u008eH\2\u0468"+
		"\u0493\5\u0090I\2\u0469\u046a\7\5\2\2\u046a\u046b\5T+\2\u046b\u046c\7"+
		"\6\2\2\u046c\u0493\3\2\2\2\u046d\u046e\7-\2\2\u046e\u046f\7\5\2\2\u046f"+
		"\u0470\5T+\2\u0470\u0471\7#\2\2\u0471\u0472\5N(\2\u0472\u0473\7\6\2\2"+
		"\u0473\u0493\3\2\2\2\u0474\u0476\7i\2\2\u0475\u0474\3\2\2\2\u0475\u0476"+
		"\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0479\7I\2\2\u0478\u0475\3\2\2\2\u0478"+
		"\u0479\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\7\5\2\2\u047b\u047c\5B"+
		"\"\2\u047c\u047d\7\6\2\2\u047d\u0493\3\2\2\2\u047e\u0480\7,\2\2\u047f"+
		"\u0481\5T+\2\u0480\u047f\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0487\3\2\2"+
		"\2\u0482\u0483\7\u0094\2\2\u0483\u0484\5T+\2\u0484\u0485\7\u0088\2\2\u0485"+
		"\u0486\5T+\2\u0486\u0488\3\2\2\2\u0487\u0482\3\2\2\2\u0488\u0489\3\2\2"+
		"\2\u0489\u0487\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048d\3\2\2\2\u048b\u048c"+
		"\7D\2\2\u048c\u048e\5T+\2\u048d\u048b\3\2\2\2\u048d\u048e\3\2\2\2\u048e"+
		"\u048f\3\2\2\2\u048f\u0490\7E\2\2\u0490\u0493\3\2\2\2\u0491\u0493\5\\"+
		"/\2\u0492\u0460\3\2\2\2\u0492\u0462\3\2\2\2\u0492\u0463\3\2\2\2\u0492"+
		"\u0464\3\2\2\2\u0492\u0467\3\2\2\2\u0492\u0468\3\2\2\2\u0492\u0469\3\2"+
		"\2\2\u0492\u046d\3\2\2\2\u0492\u0478\3\2\2\2\u0492\u047e\3\2\2\2\u0492"+
		"\u0491\3\2\2\2\u0493\u04ea\3\2\2\2\u0494\u0495\f\26\2\2\u0495\u0496\7"+
		"\r\2\2\u0496\u04e9\5T+\27\u0497\u0498\f\25\2\2\u0498\u0499\t\t\2\2\u0499"+
		"\u04e9\5T+\26\u049a\u049b\f\24\2\2\u049b\u049c\t\n\2\2\u049c\u04e9\5T"+
		"+\25\u049d\u049e\f\23\2\2\u049e\u049f\t\13\2\2\u049f\u04e9\5T+\24\u04a0"+
		"\u04a1\f\22\2\2\u04a1\u04a2\t\f\2\2\u04a2\u04e9\5T+\23\u04a3\u04a4\f\21"+
		"\2\2\u04a4\u04a5\5X-\2\u04a5\u04a6\5T+\22\u04a6\u04e9\3\2\2\2\u04a7\u04a8"+
		"\f\20\2\2\u04a8\u04a9\5\u0096L\2\u04a9\u04aa\5T+\21\u04aa\u04e9\3\2\2"+
		"\2\u04ab\u04ac\f\b\2\2\u04ac\u04ae\7_\2\2\u04ad\u04af\7i\2\2\u04ae\u04ad"+
		"\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04e9\5T+\t\u04b1"+
		"\u04b3\f\7\2\2\u04b2\u04b4\7i\2\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3\2"+
		"\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\7)\2\2\u04b6\u04b7\5T+\2\u04b7\u04b8"+
		"\7\"\2\2\u04b8\u04b9\5T+\b\u04b9\u04e9\3\2\2\2\u04ba\u04bb\f\13\2\2\u04bb"+
		"\u04bc\7/\2\2\u04bc\u04e9\5\u00acW\2\u04bd\u04bf\f\n\2\2\u04be\u04c0\7"+
		"i\2\2\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1"+
		"\u04c2\t\r\2\2\u04c2\u04c5\5T+\2\u04c3\u04c4\7F\2\2\u04c4\u04c6\5T+\2"+
		"\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04e9\3\2\2\2\u04c7\u04cc"+
		"\f\t\2\2\u04c8\u04cd\7`\2\2\u04c9\u04cd\7j\2\2\u04ca\u04cb\7i\2\2\u04cb"+
		"\u04cd\7k\2\2\u04cc\u04c8\3\2\2\2\u04cc\u04c9\3\2\2\2\u04cc\u04ca\3\2"+
		"\2\2\u04cd\u04e9\3\2\2\2\u04ce\u04d0\f\6\2\2\u04cf\u04d1\7i\2\2\u04d0"+
		"\u04cf\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04e6\7V"+
		"\2\2\u04d3\u04dd\7\5\2\2\u04d4\u04de\5B\"\2\u04d5\u04da\5T+\2\u04d6\u04d7"+
		"\7\7\2\2\u04d7\u04d9\5T+\2\u04d8\u04d6\3\2\2\2\u04d9\u04dc\3\2\2\2\u04da"+
		"\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04de\3\2\2\2\u04dc\u04da\3\2"+
		"\2\2\u04dd\u04d4\3\2\2\2\u04dd\u04d5\3\2\2\2\u04dd\u04de\3\2\2\2\u04de"+
		"\u04df\3\2\2\2\u04df\u04e7\7\6\2\2\u04e0\u04e1\5\u00a2R\2\u04e1\u04e2"+
		"\7\4\2\2\u04e2\u04e4\3\2\2\2\u04e3\u04e0\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4"+
		"\u04e5\3\2\2\2\u04e5\u04e7\5\u00a4S\2\u04e6\u04d3\3\2\2\2\u04e6\u04e3"+
		"\3\2\2\2\u04e7\u04e9\3\2\2\2\u04e8\u0494\3\2\2\2\u04e8\u0497\3\2\2\2\u04e8"+
		"\u049a\3\2\2\2\u04e8\u049d\3\2\2\2\u04e8\u04a0\3\2\2\2\u04e8\u04a3\3\2"+
		"\2\2\u04e8\u04a7\3\2\2\2\u04e8\u04ab\3\2\2\2\u04e8\u04b1\3\2\2\2\u04e8"+
		"\u04ba\3\2\2\2\u04e8\u04bd\3\2\2\2\u04e8\u04c7\3\2\2\2\u04e8\u04ce\3\2"+
		"\2\2\u04e9\u04ec\3\2\2\2\u04ea\u04e8\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb"+
		"U\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ed\u0500\3\2\2\2\u04ee\u04ef\5\u00a2"+
		"R\2\u04ef\u04f0\7\4\2\2\u04f0\u04f2\3\2\2\2\u04f1\u04ee\3\2\2\2\u04f1"+
		"\u04f2\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\5\u00a4S\2\u04f4\u04f5"+
		"\7\4\2\2\u04f5\u04f7\3\2\2\2\u04f6\u04f1\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7"+
		"\u04f8\3\2\2\2\u04f8\u04fd\5\u00aaV\2\u04f9\u04fb\7#\2\2\u04fa\u04f9\3"+
		"\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\5\u0088E\2"+
		"\u04fd\u04fa\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0500\3\2\2\2\u04ff\u04ed"+
		"\3\2\2\2\u04ff\u04f6\3\2\2\2\u0500W\3\2\2\2\u0501\u050e\7\b\2\2\u0502"+
		"\u050e\7\30\2\2\u0503\u050e\7\31\2\2\u0504\u050e\7\32\2\2\u0505\u050e"+
		"\7_\2\2\u0506\u0507\7_\2\2\u0507\u050e\7i\2\2\u0508\u050e\5\u009aN\2\u0509"+
		"\u050e\5\u009cO\2\u050a\u050e\7P\2\2\u050b\u050e\7f\2\2\u050c\u050e\7"+
		"y\2\2\u050d\u0501\3\2\2\2\u050d\u0502\3\2\2\2\u050d\u0503\3\2\2\2\u050d"+
		"\u0504\3\2\2\2\u050d\u0505\3\2\2\2\u050d\u0506\3\2\2\2\u050d\u0508\3\2"+
		"\2\2\u050d\u0509\3\2\2\2\u050d\u050a\3\2\2\2\u050d\u050b\3\2\2\2\u050d"+
		"\u050c\3\2\2\2\u050eY\3\2\2\2\u050f\u0510\7x\2\2\u0510\u051c\5\u00aeX"+
		"\2\u0511\u0512\7\5\2\2\u0512\u0517\5\u00aaV\2\u0513\u0514\7\7\2\2\u0514"+
		"\u0516\5\u00aaV\2\u0515\u0513\3\2\2\2\u0516\u0519\3\2\2\2\u0517\u0515"+
		"\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051a\3\2\2\2\u0519\u0517\3\2\2\2\u051a"+
		"\u051b\7\6\2\2\u051b\u051d\3\2\2\2\u051c\u0511\3\2\2\2\u051c\u051d\3\2"+
		"\2\2\u051d\u0530\3\2\2\2\u051e\u051f\7n\2\2\u051f\u0528\t\16\2\2\u0520"+
		"\u0521\7\u0084\2\2\u0521\u0529\7k\2\2\u0522\u0523\7\u0084\2\2\u0523\u0529"+
		"\7;\2\2\u0524\u0529\7+\2\2\u0525\u0529\7~\2\2\u0526\u0527\7h\2\2\u0527"+
		"\u0529\7\34\2\2\u0528\u0520\3\2\2\2\u0528\u0522\3\2\2\2\u0528\u0524\3"+
		"\2\2\2\u0528\u0525\3\2\2\2\u0528\u0526\3\2\2\2\u0529\u052d\3\2\2\2\u052a"+
		"\u052b\7f\2\2\u052b\u052d\5\u008cG\2\u052c\u051e\3\2\2\2\u052c\u052a\3"+
		"\2\2\2\u052d\u052f\3\2\2\2\u052e\u052c\3\2\2\2\u052f\u0532\3\2\2\2\u0530"+
		"\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u053d\3\2\2\2\u0532\u0530\3\2"+
		"\2\2\u0533\u0535\7i\2\2\u0534\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0536\3\2\2\2\u0536\u053b\7<\2\2\u0537\u0538\7Y\2\2\u0538\u053c\7=\2"+
		"\2\u0539\u053a\7Y\2\2\u053a\u053c\7U\2\2\u053b\u0537\3\2\2\2\u053b\u0539"+
		"\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053e\3\2\2\2\u053d\u0534\3\2\2\2\u053d"+
		"\u053e\3\2\2\2\u053e[\3\2\2\2\u053f\u0540\7v\2\2\u0540\u0545\7\5\2\2\u0541"+
		"\u0546\7T\2\2\u0542\u0543\t\17\2\2\u0543\u0544\7\7\2\2\u0544\u0546\5\u0084"+
		"C\2\u0545\u0541\3\2\2\2\u0545\u0542\3\2\2\2\u0546\u0547\3\2\2\2\u0547"+
		"\u0548\7\6\2\2\u0548]\3\2\2\2\u0549\u054c\5\u00aaV\2\u054a\u054b\7/\2"+
		"\2\u054b\u054d\5\u00acW\2\u054c\u054a\3\2\2\2\u054c\u054d\3\2\2\2\u054d"+
		"\u054f\3\2\2\2\u054e\u0550\t\7\2\2\u054f\u054e\3\2\2\2\u054f\u0550\3\2"+
		"\2\2\u0550_\3\2\2\2\u0551\u0552\7\63\2\2\u0552\u0554\5\u008cG\2\u0553"+
		"\u0551\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0579\3\2\2\2\u0555\u0556\7t"+
		"\2\2\u0556\u0559\7b\2\2\u0557\u0559\7\u008d\2\2\u0558\u0555\3\2\2\2\u0558"+
		"\u0557\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055b\7\5\2\2\u055b\u0560\5^"+
		"\60\2\u055c\u055d\7\7\2\2\u055d\u055f\5^\60\2\u055e\u055c\3\2\2\2\u055f"+
		"\u0562\3\2\2\2\u0560\u055e\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0563\3\2"+
		"\2\2\u0562\u0560\3\2\2\2\u0563\u0564\7\6\2\2\u0564\u0565\5R*\2\u0565\u057a"+
		"\3\2\2\2\u0566\u0567\7.\2\2\u0567\u0568\7\5\2\2\u0568\u0569\5T+\2\u0569"+
		"\u056a\7\6\2\2\u056a\u057a\3\2\2\2\u056b\u056c\7M\2\2\u056c\u056d\7b\2"+
		"\2\u056d\u056e\7\5\2\2\u056e\u0573\5\u00aaV\2\u056f\u0570\7\7\2\2\u0570"+
		"\u0572\5\u00aaV\2\u0571\u056f\3\2\2\2\u0572\u0575\3\2\2\2\u0573\u0571"+
		"\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0576\3\2\2\2\u0575\u0573\3\2\2\2\u0576"+
		"\u0577\7\6\2\2\u0577\u0578\5Z.\2\u0578\u057a\3\2\2\2\u0579\u0558\3\2\2"+
		"\2\u0579\u0566\3\2\2\2\u0579\u056b\3\2\2\2\u057aa\3\2\2\2\u057b\u057d"+
		"\7\u0096\2\2\u057c\u057e\7w\2\2\u057d\u057c\3\2\2\2\u057d\u057e\3\2\2"+
		"\2\u057e\u057f\3\2\2\2\u057f\u0580\5|?\2\u0580\u0581\7#\2\2\u0581\u0582"+
		"\7\5\2\2\u0582\u0583\5B\"\2\u0583\u058d\7\6\2\2\u0584\u0585\7\7\2\2\u0585"+
		"\u0586\5|?\2\u0586\u0587\7#\2\2\u0587\u0588\7\5\2\2\u0588\u0589\5B\"\2"+
		"\u0589\u058a\7\6\2\2\u058a\u058c\3\2\2\2\u058b\u0584\3\2\2\2\u058c\u058f"+
		"\3\2\2\2\u058d\u058b\3\2\2\2\u058d\u058e\3\2\2\2\u058ec\3\2\2\2\u058f"+
		"\u058d\3\2\2\2\u0590\u0591\5\u00a2R\2\u0591\u0592\7\4\2\2\u0592\u0594"+
		"\3\2\2\2\u0593\u0590\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0595\3\2\2\2\u0595"+
		"\u059b\5\u00a4S\2\u0596\u0597\7X\2\2\u0597\u0598\7*\2\2\u0598\u059c\5"+
		"\u00b0Y\2\u0599\u059a\7i\2\2\u059a\u059c\7X\2\2\u059b\u0596\3\2\2\2\u059b"+
		"\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059ce\3\2\2\2\u059d\u05a0\5T+\2\u059e"+
		"\u059f\7/\2\2\u059f\u05a1\5\u00acW\2\u05a0\u059e\3\2\2\2\u05a0\u05a1\3"+
		"\2\2\2\u05a1\u05a3\3\2\2\2\u05a2\u05a4\t\7\2\2\u05a3\u05a2\3\2\2\2\u05a3"+
		"\u05a4\3\2\2\2\u05a4g\3\2\2\2\u05a5\u05a9\5~@\2\u05a6\u05a9\5\u008cG\2"+
		"\u05a7\u05a9\7\u009b\2\2\u05a8\u05a5\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a8"+
		"\u05a7\3\2\2\2\u05a9i\3\2\2\2\u05aa\u05b6\5\u00a4S\2\u05ab\u05ac\7\5\2"+
		"\2\u05ac\u05b1\5\u00aaV\2\u05ad\u05ae\7\7\2\2\u05ae\u05b0\5\u00aaV\2\u05af"+
		"\u05ad\3\2\2\2\u05b0\u05b3\3\2\2\2\u05b1\u05af\3\2\2\2\u05b1\u05b2\3\2"+
		"\2\2\u05b2\u05b4\3\2\2\2\u05b3\u05b1\3\2\2\2\u05b4\u05b5\7\6\2\2\u05b5"+
		"\u05b7\3\2\2\2\u05b6\u05ab\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b8\3\2"+
		"\2\2\u05b8\u05b9\7#\2\2\u05b9\u05ba\7\5\2\2\u05ba\u05bb\5B\"\2\u05bb\u05bc"+
		"\7\6\2\2\u05bck\3\2\2\2\u05bd\u05c6\7\t\2\2\u05be\u05bf\5\u00a4S\2\u05bf"+
		"\u05c0\7\4\2\2\u05c0\u05c1\7\t\2\2\u05c1\u05c6\3\2\2\2\u05c2\u05c6\5V"+
		",\2\u05c3\u05c6\5\u008eH\2\u05c4\u05c6\5\u0090I\2\u05c5\u05bd\3\2\2\2"+
		"\u05c5\u05be\3\2\2\2\u05c5\u05c2\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c5\u05c4"+
		"\3\2\2\2\u05c6m\3\2\2\2\u05c7\u05c8\5\u00a2R\2\u05c8\u05c9\7\4\2\2\u05c9"+
		"\u05cb\3\2\2\2\u05ca\u05c7\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\3\2"+
		"\2\2\u05cc\u05d1\5\u00a4S\2\u05cd\u05cf\7#\2\2\u05ce\u05cd\3\2\2\2\u05ce"+
		"\u05cf\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d2\5\u00bc_\2\u05d1\u05ce"+
		"\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d8\3\2\2\2\u05d3\u05d4\7X\2\2\u05d4"+
		"\u05d5\7*\2\2\u05d5\u05d9\5\u00b0Y\2\u05d6\u05d7\7i\2\2\u05d7\u05d9\7"+
		"X\2\2\u05d8\u05d3\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9"+
		"\u05f7\3\2\2\2\u05da\u05e4\7\5\2\2\u05db\u05e0\5n8\2\u05dc\u05dd\7\7\2"+
		"\2\u05dd\u05df\5n8\2\u05de\u05dc\3\2\2\2\u05df\u05e2\3\2\2\2\u05e0\u05de"+
		"\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e5\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e3"+
		"\u05e5\5p9\2\u05e4\u05db\3\2\2\2\u05e4\u05e3\3\2\2\2\u05e5\u05e6\3\2\2"+
		"\2\u05e6\u05eb\7\6\2\2\u05e7\u05e9\7#\2\2\u05e8\u05e7\3\2\2\2\u05e8\u05e9"+
		"\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05ec\5\u00bc_\2\u05eb\u05e8\3\2\2"+
		"\2\u05eb\u05ec\3\2\2\2\u05ec\u05f7\3\2\2\2\u05ed\u05ee\7\5\2\2\u05ee\u05ef"+
		"\5B\"\2\u05ef\u05f4\7\6\2\2\u05f0\u05f2\7#\2\2\u05f1\u05f0\3\2\2\2\u05f1"+
		"\u05f2\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f5\5\u00bc_\2\u05f4\u05f1"+
		"\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f7\3\2\2\2\u05f6\u05ca\3\2\2\2\u05f6"+
		"\u05da\3\2\2\2\u05f6\u05ed\3\2\2\2\u05f7o\3\2\2\2\u05f8\u05ff\5n8\2\u05f9"+
		"\u05fa\5r:\2\u05fa\u05fb\5n8\2\u05fb\u05fc\5t;\2\u05fc\u05fe\3\2\2\2\u05fd"+
		"\u05f9\3\2\2\2\u05fe\u0601\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff\u0600\3\2"+
		"\2\2\u0600q\3\2\2\2\u0601\u05ff\3\2\2\2\u0602\u0610\7\7\2\2\u0603\u0605"+
		"\7g\2\2\u0604\u0603\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u060c\3\2\2\2\u0606"+
		"\u0608\7c\2\2\u0607\u0609\7q\2\2\u0608\u0607\3\2\2\2\u0608\u0609\3\2\2"+
		"\2\u0609\u060d\3\2\2\2\u060a\u060d\7Z\2\2\u060b\u060d\7\66\2\2\u060c\u0606"+
		"\3\2\2\2\u060c\u060a\3\2\2\2\u060c\u060b\3\2\2\2\u060c\u060d\3\2\2\2\u060d"+
		"\u060e\3\2\2\2\u060e\u0610\7a\2\2\u060f\u0602\3\2\2\2\u060f\u0604\3\2"+
		"\2\2\u0610s\3\2\2\2\u0611\u0612\7n\2\2\u0612\u0620\5T+\2\u0613\u0614\7"+
		"\u008f\2\2\u0614\u0615\7\5\2\2\u0615\u061a\5\u00aaV\2\u0616\u0617\7\7"+
		"\2\2\u0617\u0619\5\u00aaV\2\u0618\u0616\3\2\2\2\u0619\u061c\3\2\2\2\u061a"+
		"\u0618\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061d\3\2\2\2\u061c\u061a\3\2"+
		"\2\2\u061d\u061e\7\6\2\2\u061e\u0620\3\2\2\2\u061f\u0611\3\2\2\2\u061f"+
		"\u0613\3\2\2\2\u061f\u0620\3\2\2\2\u0620u\3\2\2\2\u0621\u0623\7\u0083"+
		"\2\2\u0622\u0624\t\6\2\2\u0623\u0622\3\2\2\2\u0623\u0624\3\2\2\2\u0624"+
		"\u0625\3\2\2\2\u0625\u062a\5l\67\2\u0626\u0627\7\7\2\2\u0627\u0629\5l"+
		"\67\2\u0628\u0626\3\2\2\2\u0629\u062c\3\2\2\2\u062a\u0628\3\2\2\2\u062a"+
		"\u062b\3\2\2\2\u062b\u062e\3\2\2\2\u062c\u062a\3\2\2\2\u062d\u062f\5x"+
		"=\2\u062e\u062d\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0632\3\2\2\2\u0630"+
		"\u0631\7\u0095\2\2\u0631\u0633\5T+\2\u0632\u0630\3\2\2\2\u0632\u0633\3"+
		"\2\2\2\u0633\u0642\3\2\2\2\u0634\u0635\7Q\2\2\u0635\u0636\7*\2\2\u0636"+
		"\u063b\5T+\2\u0637\u0638\7\7\2\2\u0638\u063a\5T+\2\u0639\u0637\3\2\2\2"+
		"\u063a\u063d\3\2\2\2\u063b\u0639\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u0640"+
		"\3\2\2\2\u063d\u063b\3\2\2\2\u063e\u063f\7R\2\2\u063f\u0641\5T+\2\u0640"+
		"\u063e\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0643\3\2\2\2\u0642\u0634\3\2"+
		"\2\2\u0642\u0643\3\2\2\2\u0643\u0661\3\2\2\2\u0644\u0645\7\u0091\2\2\u0645"+
		"\u0646\7\5\2\2\u0646\u064b\5T+\2\u0647\u0648\7\7\2\2\u0648\u064a\5T+\2"+
		"\u0649\u0647\3\2\2\2\u064a\u064d\3\2\2\2\u064b\u0649\3\2\2\2\u064b\u064c"+
		"\3\2\2\2\u064c\u064e\3\2\2\2\u064d\u064b\3\2\2\2\u064e\u065d\7\6\2\2\u064f"+
		"\u0650\7\7\2\2\u0650\u0651\7\5\2\2\u0651\u0656\5T+\2\u0652\u0653\7\7\2"+
		"\2\u0653\u0655\5T+\2\u0654\u0652\3\2\2\2\u0655\u0658\3\2\2\2\u0656\u0654"+
		"\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0659\3\2\2\2\u0658\u0656\3\2\2\2\u0659"+
		"\u065a\7\6\2\2\u065a\u065c\3\2\2\2\u065b\u064f\3\2\2\2\u065c\u065f\3\2"+
		"\2\2\u065d\u065b\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0661\3\2\2\2\u065f"+
		"\u065d\3\2\2\2\u0660\u0621\3\2\2\2\u0660\u0644\3\2\2\2\u0661w\3\2\2\2"+
		"\u0662\u066c\7N\2\2\u0663\u0668\5n8\2\u0664\u0665\7\7\2\2\u0665\u0667"+
		"\5n8\2\u0666\u0664\3\2\2\2\u0667\u066a\3\2\2\2\u0668\u0666\3\2\2\2\u0668"+
		"\u0669\3\2\2\2\u0669\u066d\3\2\2\2\u066a\u0668\3\2\2\2\u066b\u066d\5p"+
		"9\2\u066c\u0663\3\2\2\2\u066c\u066b\3\2\2\2\u066dy\3\2\2\2\u066e\u0674"+
		"\7\u008c\2\2\u066f\u0670\7\u008c\2\2\u0670\u0674\7\37\2\2\u0671\u0674"+
		"\7]\2\2\u0672\u0674\7G\2\2\u0673\u066e\3\2\2\2\u0673\u066f\3\2\2\2\u0673"+
		"\u0671\3\2\2\2\u0673\u0672\3\2\2\2\u0674{\3\2\2\2\u0675\u0681\5\u00a4"+
		"S\2\u0676\u0677\7\5\2\2\u0677\u067c\5\u00aaV\2\u0678\u0679\7\7\2\2\u0679"+
		"\u067b\5\u00aaV\2\u067a\u0678\3\2\2\2\u067b\u067e\3\2\2\2\u067c\u067a"+
		"\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067f\3\2\2\2\u067e\u067c\3\2\2\2\u067f"+
		"\u0680\7\6\2\2\u0680\u0682\3\2\2\2\u0681\u0676\3\2\2\2\u0681\u0682\3\2"+
		"\2\2\u0682}\3\2\2\2\u0683\u0685\t\n\2\2\u0684\u0683\3\2\2\2\u0684\u0685"+
		"\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0687\7\u0099\2\2\u0687\177\3\2\2\2"+
		"\u0688\u0689\t\20\2\2\u0689\u0081\3\2\2\2\u068a\u068b\t\21\2\2\u068b\u0083"+
		"\3\2\2\2\u068c\u068d\7\u009b\2\2\u068d\u0085\3\2\2\2\u068e\u0691\5T+\2"+
		"\u068f\u0691\5L\'\2\u0690\u068e\3\2\2\2\u0690\u068f\3\2\2\2\u0691\u0087"+
		"\3\2\2\2\u0692\u0693\t\22\2\2\u0693\u0089\3\2\2\2\u0694\u0695\t\23\2\2"+
		"\u0695\u008b\3\2\2\2\u0696\u0697\5\u00c0a\2\u0697\u008d\3\2\2\2\u0698"+
		"\u0699\7\64\2\2\u0699\u06a3\7\5\2\2\u069a\u069c\5\u009eP\2\u069b\u069a"+
		"\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u06a4\5V,\2\u069e"+
		"\u06a4\7\t\2\2\u069f\u06a1\7A\2\2\u06a0\u069f\3\2\2\2\u06a0\u06a1\3\2"+
		"\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a4\5\u0090I\2\u06a3\u069b\3\2\2\2\u06a3"+
		"\u069e\3\2\2\2\u06a3\u06a0\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a5\3\2"+
		"\2\2\u06a5\u06aa\7\6\2\2\u06a6\u06a8\7#\2\2\u06a7\u06a6\3\2\2\2\u06a7"+
		"\u06a8\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab\5\u0088E\2\u06aa\u06a7"+
		"\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u008f\3\2\2\2\u06ac\u06ad\5\u00a0Q"+
		"\2\u06ad\u06ba\7\5\2\2\u06ae\u06b0\7A\2\2\u06af\u06ae\3\2\2\2\u06af\u06b0"+
		"\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b6\5T+\2\u06b2\u06b3\7\7\2\2\u06b3"+
		"\u06b5\5T+\2\u06b4\u06b2\3\2\2\2\u06b5\u06b8\3\2\2\2\u06b6\u06b4\3\2\2"+
		"\2\u06b6\u06b7\3\2\2\2\u06b7\u06bb\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b9\u06bb"+
		"\7\t\2\2\u06ba\u06af\3\2\2\2\u06ba\u06b9\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb"+
		"\u06bc\3\2\2\2\u06bc\u06bd\7\6\2\2\u06bd\u0091\3\2\2\2\u06be\u06bf\7\""+
		"\2\2\u06bf\u0093\3\2\2\2\u06c0\u06c1\7o\2\2\u06c1\u0095\3\2\2\2\u06c2"+
		"\u06c3\t\24\2\2\u06c3\u0097\3\2\2\2\u06c4\u06c5\7i\2\2\u06c5\u0099\3\2"+
		"\2\2\u06c6\u06c7\7V\2\2\u06c7\u009b\3\2\2\2\u06c8\u06c9\7d\2\2\u06c9\u009d"+
		"\3\2\2\2\u06ca\u06cb\7A\2\2\u06cb\u009f\3\2\2\2\u06cc\u06cd\5\u00c0a\2"+
		"\u06cd\u00a1\3\2\2\2\u06ce\u06cf\5\u00c0a\2\u06cf\u00a3\3\2\2\2\u06d0"+
		"\u06d1\5\u00c0a\2\u06d1\u00a5\3\2\2\2\u06d2\u06d3\5\u00c0a\2\u06d3\u00a7"+
		"\3\2\2\2\u06d4\u06d5\5\u00c0a\2\u06d5\u00a9\3\2\2\2\u06d6\u06d7\5\u00c0"+
		"a\2\u06d7\u00ab\3\2\2\2\u06d8\u06d9\5\u00c0a\2\u06d9\u00ad\3\2\2\2\u06da"+
		"\u06db\5\u00c0a\2\u06db\u00af\3\2\2\2\u06dc\u06dd\5\u00c0a\2\u06dd\u00b1"+
		"\3\2\2\2\u06de\u06df\5\u00c0a\2\u06df\u00b3\3\2\2\2\u06e0\u06e1\5\u00c0"+
		"a\2\u06e1\u00b5\3\2\2\2\u06e2\u06e3\5\u00c0a\2\u06e3\u00b7\3\2\2\2\u06e4"+
		"\u06e5\5\u00c0a\2\u06e5\u00b9\3\2\2\2\u06e6\u06e7\5\u00c0a\2\u06e7\u00bb"+
		"\3\2\2\2\u06e8\u06e9\5\u00c0a\2\u06e9\u00bd\3\2\2\2\u06ea\u06eb\5\u00c0"+
		"a\2\u06eb\u00bf\3\2\2\2\u06ec\u06f4\7\u0098\2\2\u06ed\u06f4\5\u008aF\2"+
		"\u06ee\u06f4\7\u009b\2\2\u06ef\u06f0\7\5\2\2\u06f0\u06f1\5\u00c0a\2\u06f1"+
		"\u06f2\7\6\2\2\u06f2\u06f4\3\2\2\2\u06f3\u06ec\3\2\2\2\u06f3\u06ed\3\2"+
		"\2\2\u06f3\u06ee\3\2\2\2\u06f3\u06ef\3\2\2\2\u06f4\u00c1\3\2\2\2\u00f7"+
		"\u00c4\u00c6\u00d2\u00d8\u00da\u00fa\u0105\u010d\u0110\u0119\u011d\u0125"+
		"\u0129\u012b\u0130\u0132\u0136\u013d\u0140\u0145\u0149\u014e\u0157\u015a"+
		"\u0160\u0162\u0166\u016c\u0171\u017c\u0182\u0186\u018c\u0191\u019a\u01a1"+
		"\u01a7\u01ab\u01af\u01b5\u01ba\u01c1\u01cc\u01cf\u01d1\u01d7\u01dd\u01e1"+
		"\u01e8\u01ee\u01f4\u01fa\u01ff\u020b\u0210\u021b\u0220\u0223\u0229\u022c"+
		"\u0232\u023b\u023e\u0244\u0246\u024d\u0255\u025a\u0262\u0267\u026f\u0274"+
		"\u027c\u0281\u0287\u028e\u0291\u0299\u02a3\u02a6\u02ac\u02ae\u02b1\u02c4"+
		"\u02ca\u02d3\u02d8\u02e1\u02ec\u02f3\u02f9\u02ff\u0308\u030f\u0313\u0315"+
		"\u0319\u0320\u0322\u0326\u0329\u0330\u0337\u033a\u0344\u0347\u034d\u034f"+
		"\u0353\u035a\u035d\u0365\u036f\u0372\u0378\u037a\u037e\u0385\u0389\u038d"+
		"\u0396\u039b\u039d\u03a6\u03b1\u03b8\u03bb\u03be\u03cb\u03d9\u03de\u03e1"+
		"\u03ee\u03fc\u0401\u040a\u040d\u0413\u0415\u041b\u0420\u0426\u0432\u0436"+
		"\u043b\u043f\u0442\u0454\u0459\u045e\u0475\u0478\u0480\u0489\u048d\u0492"+
		"\u04ae\u04b3\u04bf\u04c5\u04cc\u04d0\u04da\u04dd\u04e3\u04e6\u04e8\u04ea"+
		"\u04f1\u04f6\u04fa\u04fd\u04ff\u050d\u0517\u051c\u0528\u052c\u0530\u0534"+
		"\u053b\u053d\u0545\u054c\u054f\u0553\u0558\u0560\u0573\u0579\u057d\u058d"+
		"\u0593\u059b\u05a0\u05a3\u05a8\u05b1\u05b6\u05c5\u05ca\u05ce\u05d1\u05d8"+
		"\u05e0\u05e4\u05e8\u05eb\u05f1\u05f4\u05f6\u05ff\u0604\u0608\u060c\u060f"+
		"\u061a\u061f\u0623\u062a\u062e\u0632\u063b\u0640\u0642\u064b\u0656\u065d"+
		"\u0660\u0668\u066c\u0673\u067c\u0681\u0684\u0690\u069b\u06a0\u06a3\u06a7"+
		"\u06aa\u06af\u06b6\u06ba\u06f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}