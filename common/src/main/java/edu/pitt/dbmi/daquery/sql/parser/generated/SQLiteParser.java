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
		K_CURRENT_TIMESTAMP=55, K_DATABASE=56, K_DATESHIFT=57, K_DEFAULT=58, K_DEFERRABLE=59, 
		K_DEFERRED=60, K_DELETE=61, K_DESC=62, K_DETACH=63, K_DISTINCT=64, K_DROP=65, 
		K_EACH=66, K_ELSE=67, K_END=68, K_ESCAPE=69, K_EXCEPT=70, K_EXCLUSIVE=71, 
		K_EXISTS=72, K_EXPLAIN=73, K_FALSE=74, K_FAIL=75, K_FOR=76, K_FOREIGN=77, 
		K_FROM=78, K_FULL=79, K_GLOB=80, K_GROUP=81, K_HAVING=82, K_IF=83, K_IDENTIFIABLE=84, 
		K_IGNORE=85, K_IMMEDIATE=86, K_IN=87, K_INDEX=88, K_INDEXED=89, K_INITIALLY=90, 
		K_INNER=91, K_INSERT=92, K_INSTEAD=93, K_INTERSECT=94, K_INTO=95, K_IS=96, 
		K_ISID=97, K_ISNULL=98, K_JOIN=99, K_KEY=100, K_LEFT=101, K_LIKE=102, 
		K_LIMIT=103, K_MATCH=104, K_MINUS=105, K_NATURAL=106, K_NO=107, K_NOT=108, 
		K_NOTNULL=109, K_NULL=110, K_OF=111, K_OFFSET=112, K_OBFUSCATE=113, K_ON=114, 
		K_OR=115, K_ORDER=116, K_OUTER=117, K_PLAN=118, K_PRAGMA=119, K_PRIMARY=120, 
		K_QUERY=121, K_RAISE=122, K_RECURSIVE=123, K_REFERENCES=124, K_REGEXP=125, 
		K_REINDEX=126, K_RELEASE=127, K_RENAME=128, K_REPLACE=129, K_RESTRICT=130, 
		K_RIGHT=131, K_ROLLBACK=132, K_ROW=133, K_SAVEPOINT=134, K_SELECT=135, 
		K_SET=136, K_TABLE=137, K_TEMP=138, K_TEMPORARY=139, K_THEN=140, K_TO=141, 
		K_TRACKED=142, K_TRANSACTION=143, K_TRIGGER=144, K_TRUE=145, K_UNION=146, 
		K_UNIQUE=147, K_UPDATE=148, K_USING=149, K_VACUUM=150, K_VALUES=151, K_VIEW=152, 
		K_VIRTUAL=153, K_WHEN=154, K_WHERE=155, K_WITH=156, K_WITHOUT=157, IDENTIFIER=158, 
		NUMERIC_LITERAL=159, BIND_PARAMETER=160, STRING_LITERAL=161, BLOB_LITERAL=162, 
		SINGLE_LINE_COMMENT=163, MULTILINE_COMMENT=164, SPACES=165, UNEXPECTED_CHAR=166, 
		K_OFFUSCATE=167;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_end_of_select = 4, RULE_alter_table_stmt = 5, RULE_analyze_stmt = 6, 
		RULE_attach_stmt = 7, RULE_begin_stmt = 8, RULE_commit_stmt = 9, RULE_select_set = 10, 
		RULE_create_index_stmt = 11, RULE_create_table_stmt = 12, RULE_create_trigger_stmt = 13, 
		RULE_create_view_stmt = 14, RULE_create_virtual_table_stmt = 15, RULE_delete_stmt = 16, 
		RULE_delete_stmt_limited = 17, RULE_single_from_clause = 18, RULE_detach_stmt = 19, 
		RULE_drop_index_stmt = 20, RULE_drop_table_stmt = 21, RULE_drop_trigger_stmt = 22, 
		RULE_drop_view_stmt = 23, RULE_insert_stmt = 24, RULE_pragma_stmt = 25, 
		RULE_reindex_stmt = 26, RULE_release_stmt = 27, RULE_rollback_stmt = 28, 
		RULE_savepoint_stmt = 29, RULE_with_select_stmt = 30, RULE_select_stmt = 31, 
		RULE_update_stmt = 32, RULE_update_stmt_limited = 33, RULE_vacuum_stmt = 34, 
		RULE_column_def = 35, RULE_type_name = 36, RULE_column_constraint = 37, 
		RULE_conflict_clause = 38, RULE_expr = 39, RULE_dbColumnExpr = 40, RULE_result_column_expr = 41, 
		RULE_tracking_column_expr = 42, RULE_comparison_operator = 43, RULE_foreign_key_clause = 44, 
		RULE_raise_function = 45, RULE_indexed_column = 46, RULE_table_constraint = 47, 
		RULE_with_clause = 48, RULE_qualified_table_name = 49, RULE_ordering_term = 50, 
		RULE_pragma_value = 51, RULE_common_table_expression = 52, RULE_result_column = 53, 
		RULE_deid_tag = 54, RULE_ident_prop = 55, RULE_id_field_prop = 56, RULE_date_shift_field_prop = 57, 
		RULE_obfuscate_field_prop = 58, RULE_from_table_spec = 59, RULE_table_or_subquery = 60, 
		RULE_join_clause = 61, RULE_join_operator = 62, RULE_join_constraint = 63, 
		RULE_select_core = 64, RULE_multi_from_clause = 65, RULE_set_operator = 66, 
		RULE_cte_table_name = 67, RULE_signed_number = 68, RULE_literal_value = 69, 
		RULE_unary_operator = 70, RULE_error_message = 71, RULE_module_argument = 72, 
		RULE_column_alias = 73, RULE_keyword = 74, RULE_name = 75, RULE_count_function = 76, 
		RULE_any_function = 77, RULE_and_keyword = 78, RULE_or_keyword = 79, RULE_and_or = 80, 
		RULE_not_keyword = 81, RULE_in_keyword = 82, RULE_like_keyword = 83, RULE_distinct_keyword = 84, 
		RULE_function_name = 85, RULE_database_name = 86, RULE_table_name = 87, 
		RULE_table_or_index_name = 88, RULE_new_table_name = 89, RULE_column_name = 90, 
		RULE_collation_name = 91, RULE_foreign_table = 92, RULE_index_name = 93, 
		RULE_trigger_name = 94, RULE_view_name = 95, RULE_module_name = 96, RULE_pragma_name = 97, 
		RULE_savepoint_name = 98, RULE_table_alias = 99, RULE_transaction_name = 100, 
		RULE_any_name = 101, RULE_anything_at_all = 102;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "end_of_select", "alter_table_stmt", 
		"analyze_stmt", "attach_stmt", "begin_stmt", "commit_stmt", "select_set", 
		"create_index_stmt", "create_table_stmt", "create_trigger_stmt", "create_view_stmt", 
		"create_virtual_table_stmt", "delete_stmt", "delete_stmt_limited", "single_from_clause", 
		"detach_stmt", "drop_index_stmt", "drop_table_stmt", "drop_trigger_stmt", 
		"drop_view_stmt", "insert_stmt", "pragma_stmt", "reindex_stmt", "release_stmt", 
		"rollback_stmt", "savepoint_stmt", "with_select_stmt", "select_stmt", 
		"update_stmt", "update_stmt_limited", "vacuum_stmt", "column_def", "type_name", 
		"column_constraint", "conflict_clause", "expr", "dbColumnExpr", "result_column_expr", 
		"tracking_column_expr", "comparison_operator", "foreign_key_clause", "raise_function", 
		"indexed_column", "table_constraint", "with_clause", "qualified_table_name", 
		"ordering_term", "pragma_value", "common_table_expression", "result_column", 
		"deid_tag", "ident_prop", "id_field_prop", "date_shift_field_prop", "obfuscate_field_prop", 
		"from_table_spec", "table_or_subquery", "join_clause", "join_operator", 
		"join_constraint", "select_core", "multi_from_clause", "set_operator", 
		"cte_table_name", "signed_number", "literal_value", "unary_operator", 
		"error_message", "module_argument", "column_alias", "keyword", "name", 
		"count_function", "any_function", "and_keyword", "or_keyword", "and_or", 
		"not_keyword", "in_keyword", "like_keyword", "distinct_keyword", "function_name", 
		"database_name", "table_name", "table_or_index_name", "new_table_name", 
		"column_name", "collation_name", "foreign_table", "index_name", "trigger_name", 
		"view_name", "module_name", "pragma_name", "savepoint_name", "table_alias", 
		"transaction_name", "any_name", "anything_at_all"
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
		"K_DATABASE", "K_DATESHIFT", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", 
		"K_DELETE", "K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", 
		"K_END", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", 
		"K_FALSE", "K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", 
		"K_GROUP", "K_HAVING", "K_IF", "K_IDENTIFIABLE", "K_IGNORE", "K_IMMEDIATE", 
		"K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", "K_INSERT", 
		"K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISID", "K_ISNULL", "K_JOIN", 
		"K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_MINUS", "K_NATURAL", 
		"K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_OBFUSCATE", 
		"K_ON", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", 
		"K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", 
		"K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", 
		"K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", 
		"K_THEN", "K_TO", "K_TRACKED", "K_TRANSACTION", "K_TRIGGER", "K_TRUE", 
		"K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", 
		"K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "IDENTIFIER", 
		"NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", 
		"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR", 
		"K_OFFUSCATE"
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
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (K_ALTER - 30)) | (1L << (K_ANALYZE - 30)) | (1L << (K_ATTACH - 30)) | (1L << (K_BEGIN - 30)) | (1L << (K_COMMIT - 30)) | (1L << (K_CREATE - 30)) | (1L << (K_DELETE - 30)) | (1L << (K_DETACH - 30)) | (1L << (K_DROP - 30)) | (1L << (K_END - 30)) | (1L << (K_EXPLAIN - 30)) | (1L << (K_INSERT - 30)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (K_PRAGMA - 119)) | (1L << (K_REINDEX - 119)) | (1L << (K_RELEASE - 119)) | (1L << (K_REPLACE - 119)) | (1L << (K_ROLLBACK - 119)) | (1L << (K_SAVEPOINT - 119)) | (1L << (K_SELECT - 119)) | (1L << (K_UPDATE - 119)) | (1L << (K_VACUUM - 119)) | (1L << (K_VALUES - 119)) | (1L << (K_WITH - 119)) | (1L << (UNEXPECTED_CHAR - 119)))) != 0)) {
				{
				setState(208);
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
					setState(206);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(207);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
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
			setState(215);
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
		public List<Anything_at_allContext> anything_at_all() {
			return getRuleContexts(Anything_at_allContext.class);
		}
		public Anything_at_allContext anything_at_all(int i) {
			return getRuleContext(Anything_at_allContext.class,i);
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
			setState(218);
			sql_stmt();
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(219);
					sql_stmt();
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					anything_at_all();
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public Select_setContext select_set() {
			return getRuleContext(Select_setContext.class,0);
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
		public With_select_stmtContext with_select_stmt() {
			return getRuleContext(With_select_stmtContext.class,0);
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
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(231);
				match(K_EXPLAIN);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(232);
					match(K_QUERY);
					setState(233);
					match(K_PLAN);
					}
				}

				}
			}

			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(238);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(239);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(240);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(241);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(242);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(243);
				create_index_stmt();
				}
				break;
			case 7:
				{
				setState(244);
				create_table_stmt();
				}
				break;
			case 8:
				{
				setState(245);
				create_trigger_stmt();
				}
				break;
			case 9:
				{
				setState(246);
				create_view_stmt();
				}
				break;
			case 10:
				{
				setState(247);
				create_virtual_table_stmt();
				}
				break;
			case 11:
				{
				setState(248);
				delete_stmt();
				}
				break;
			case 12:
				{
				setState(249);
				delete_stmt_limited();
				}
				break;
			case 13:
				{
				setState(250);
				detach_stmt();
				}
				break;
			case 14:
				{
				setState(251);
				drop_index_stmt();
				}
				break;
			case 15:
				{
				setState(252);
				drop_table_stmt();
				}
				break;
			case 16:
				{
				setState(253);
				drop_trigger_stmt();
				}
				break;
			case 17:
				{
				setState(254);
				drop_view_stmt();
				}
				break;
			case 18:
				{
				setState(255);
				insert_stmt();
				}
				break;
			case 19:
				{
				setState(256);
				pragma_stmt();
				}
				break;
			case 20:
				{
				setState(257);
				reindex_stmt();
				}
				break;
			case 21:
				{
				setState(258);
				release_stmt();
				}
				break;
			case 22:
				{
				setState(259);
				rollback_stmt();
				}
				break;
			case 23:
				{
				setState(260);
				savepoint_stmt();
				}
				break;
			case 24:
				{
				setState(261);
				select_set();
				}
				break;
			case 25:
				{
				setState(262);
				select_stmt();
				}
				break;
			case 26:
				{
				setState(263);
				update_stmt();
				}
				break;
			case 27:
				{
				setState(264);
				update_stmt_limited();
				}
				break;
			case 28:
				{
				setState(265);
				vacuum_stmt();
				}
				break;
			case 29:
				{
				setState(266);
				with_select_stmt();
				}
				break;
			}
			setState(269);
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
			setState(271);
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
			setState(273);
			match(K_ALTER);
			setState(274);
			match(K_TABLE);
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(275);
				database_name();
				setState(276);
				match(DOT);
				}
				break;
			}
			setState(280);
			table_name();
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(281);
				match(K_RENAME);
				setState(282);
				match(K_TO);
				setState(283);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(284);
				match(K_ADD);
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(285);
					match(K_COLUMN);
					}
					break;
				}
				setState(288);
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
			setState(291);
			match(K_ANALYZE);
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(292);
				database_name();
				}
				break;
			case 2:
				{
				setState(293);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(294);
				database_name();
				setState(295);
				match(DOT);
				setState(296);
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
			setState(300);
			match(K_ATTACH);
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(301);
				match(K_DATABASE);
				}
				break;
			}
			setState(304);
			expr(0);
			setState(305);
			match(K_AS);
			setState(306);
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
			setState(308);
			match(K_BEGIN);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (K_DEFERRED - 60)) | (1L << (K_EXCLUSIVE - 60)) | (1L << (K_IMMEDIATE - 60)))) != 0)) {
				{
				setState(309);
				_la = _input.LA(1);
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (K_DEFERRED - 60)) | (1L << (K_EXCLUSIVE - 60)) | (1L << (K_IMMEDIATE - 60)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(312);
				match(K_TRANSACTION);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRACKED - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) {
					{
					setState(313);
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
			setState(318);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(319);
				match(K_TRANSACTION);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRACKED - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) {
					{
					setState(320);
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

	public static class Select_setContext extends ParserRuleContext {
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
		public List<Set_operatorContext> set_operator() {
			return getRuleContexts(Set_operatorContext.class);
		}
		public Set_operatorContext set_operator(int i) {
			return getRuleContext(Set_operatorContext.class,i);
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
		public Select_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_setContext select_set() throws RecognitionException {
		Select_setContext _localctx = new Select_setContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_select_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(325);
				match(K_WITH);
				setState(327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(326);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(329);
				common_table_expression();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(330);
					match(COMMA);
					setState(331);
					common_table_expression();
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(339);
			select_core();
			setState(343); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(340);
				set_operator();
				setState(341);
				select_core();
				}
				}
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_EXCEPT - 70)) | (1L << (K_INTERSECT - 70)) | (1L << (K_MINUS - 70)))) != 0) || _la==K_UNION );
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(347);
				match(K_ORDER);
				setState(348);
				match(K_BY);
				setState(349);
				ordering_term();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(350);
					match(COMMA);
					setState(351);
					ordering_term();
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(359);
				match(K_LIMIT);
				setState(360);
				expr(0);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(361);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(362);
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
			setState(367);
			match(K_CREATE);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(368);
				match(K_UNIQUE);
				}
			}

			setState(371);
			match(K_INDEX);
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(372);
				match(K_IF);
				setState(373);
				match(K_NOT);
				setState(374);
				match(K_EXISTS);
				}
				break;
			}
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(377);
				database_name();
				setState(378);
				match(DOT);
				}
				break;
			}
			setState(382);
			index_name();
			setState(383);
			match(K_ON);
			setState(384);
			table_name();
			setState(385);
			match(OPEN_PAR);
			setState(386);
			indexed_column();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(387);
				match(COMMA);
				setState(388);
				indexed_column();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(CLOSE_PAR);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(395);
				match(K_WHERE);
				setState(396);
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
			setState(399);
			match(K_CREATE);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(400);
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

			setState(403);
			match(K_TABLE);
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(404);
				match(K_IF);
				setState(405);
				match(K_NOT);
				setState(406);
				match(K_EXISTS);
				}
				break;
			}
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(409);
				database_name();
				setState(410);
				match(DOT);
				}
				break;
			}
			setState(414);
			table_name();
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(415);
				match(OPEN_PAR);
				setState(416);
				column_def();
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(417);
						match(COMMA);
						setState(418);
						column_def();
						}
						} 
					}
					setState(423);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(424);
					match(COMMA);
					setState(425);
					table_constraint();
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(431);
				match(CLOSE_PAR);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(432);
					match(K_WITHOUT);
					setState(433);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(436);
				match(K_AS);
				setState(437);
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
			setState(440);
			match(K_CREATE);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(441);
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

			setState(444);
			match(K_TRIGGER);
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(445);
				match(K_IF);
				setState(446);
				match(K_NOT);
				setState(447);
				match(K_EXISTS);
				}
				break;
			}
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(450);
				database_name();
				setState(451);
				match(DOT);
				}
				break;
			}
			setState(455);
			trigger_name();
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(456);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(457);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(458);
				match(K_INSTEAD);
				setState(459);
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
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(462);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(463);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(464);
				match(K_UPDATE);
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(465);
					match(K_OF);
					setState(466);
					column_name();
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(467);
						match(COMMA);
						setState(468);
						column_name();
						}
						}
						setState(473);
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
			setState(478);
			match(K_ON);
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(479);
				database_name();
				setState(480);
				match(DOT);
				}
				break;
			}
			setState(484);
			table_name();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(485);
				match(K_FOR);
				setState(486);
				match(K_EACH);
				setState(487);
				match(K_ROW);
				}
			}

			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(490);
				match(K_WHEN);
				setState(491);
				expr(0);
				}
			}

			setState(494);
			match(K_BEGIN);
			setState(503); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(495);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(496);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(497);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(498);
					select_stmt();
					}
					break;
				}
				setState(501);
				match(SCOL);
				}
				}
				setState(505); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || _la==K_INSERT || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (K_REPLACE - 129)) | (1L << (K_SELECT - 129)) | (1L << (K_UPDATE - 129)) | (1L << (K_VALUES - 129)) | (1L << (K_WITH - 129)))) != 0) );
			setState(507);
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
			setState(509);
			match(K_CREATE);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(510);
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

			setState(513);
			match(K_VIEW);
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(514);
				match(K_IF);
				setState(515);
				match(K_NOT);
				setState(516);
				match(K_EXISTS);
				}
				break;
			}
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(519);
				database_name();
				setState(520);
				match(DOT);
				}
				break;
			}
			setState(524);
			view_name();
			setState(525);
			match(K_AS);
			setState(526);
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
			setState(528);
			match(K_CREATE);
			setState(529);
			match(K_VIRTUAL);
			setState(530);
			match(K_TABLE);
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(531);
				match(K_IF);
				setState(532);
				match(K_NOT);
				setState(533);
				match(K_EXISTS);
				}
				break;
			}
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(536);
				database_name();
				setState(537);
				match(DOT);
				}
				break;
			}
			setState(541);
			table_name();
			setState(542);
			match(K_USING);
			setState(543);
			module_name();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(544);
				match(OPEN_PAR);
				setState(545);
				module_argument();
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(546);
					match(COMMA);
					setState(547);
					module_argument();
					}
					}
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(553);
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
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(557);
				with_clause();
				}
			}

			setState(560);
			match(K_DELETE);
			setState(561);
			single_from_clause();
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(562);
				match(K_WHERE);
				setState(563);
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
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(566);
				with_clause();
				}
			}

			setState(569);
			match(K_DELETE);
			setState(570);
			single_from_clause();
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(571);
				match(K_WHERE);
				setState(572);
				expr(0);
				}
			}

			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(575);
					match(K_ORDER);
					setState(576);
					match(K_BY);
					setState(577);
					ordering_term();
					setState(582);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(578);
						match(COMMA);
						setState(579);
						ordering_term();
						}
						}
						setState(584);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(587);
				match(K_LIMIT);
				setState(588);
				expr(0);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(589);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(590);
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
			setState(595);
			match(K_FROM);
			setState(596);
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
			setState(598);
			match(K_DETACH);
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(599);
				match(K_DATABASE);
				}
				break;
			}
			setState(602);
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
			setState(604);
			match(K_DROP);
			setState(605);
			match(K_INDEX);
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
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
			setState(617);
			match(K_DROP);
			setState(618);
			match(K_TABLE);
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
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
			setState(630);
			match(K_DROP);
			setState(631);
			match(K_TRIGGER);
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
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
			setState(643);
			match(K_DROP);
			setState(644);
			match(K_VIEW);
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(645);
				match(K_IF);
				setState(646);
				match(K_EXISTS);
				}
				break;
			}
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(649);
				database_name();
				setState(650);
				match(DOT);
				}
				break;
			}
			setState(654);
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
		enterRule(_localctx, 48, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(656);
				with_clause();
				}
			}

			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(659);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(660);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(661);
				match(K_INSERT);
				setState(662);
				match(K_OR);
				setState(663);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(664);
				match(K_INSERT);
				setState(665);
				match(K_OR);
				setState(666);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(667);
				match(K_INSERT);
				setState(668);
				match(K_OR);
				setState(669);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(670);
				match(K_INSERT);
				setState(671);
				match(K_OR);
				setState(672);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(673);
				match(K_INSERT);
				setState(674);
				match(K_OR);
				setState(675);
				match(K_IGNORE);
				}
				break;
			}
			setState(678);
			match(K_INTO);
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(679);
				database_name();
				setState(680);
				match(DOT);
				}
				break;
			}
			setState(684);
			table_name();
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(685);
				match(OPEN_PAR);
				setState(686);
				column_name();
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(687);
					match(COMMA);
					setState(688);
					column_name();
					}
					}
					setState(693);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(694);
				match(CLOSE_PAR);
				}
			}

			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(698);
				match(K_VALUES);
				setState(699);
				match(OPEN_PAR);
				setState(700);
				expr(0);
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(701);
					match(COMMA);
					setState(702);
					expr(0);
					}
					}
					setState(707);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(708);
				match(CLOSE_PAR);
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(709);
					match(COMMA);
					setState(710);
					match(OPEN_PAR);
					setState(711);
					expr(0);
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(712);
						match(COMMA);
						setState(713);
						expr(0);
						}
						}
						setState(718);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(719);
					match(CLOSE_PAR);
					}
					}
					setState(725);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(726);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(727);
				match(K_DEFAULT);
				setState(728);
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
		enterRule(_localctx, 50, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(K_PRAGMA);
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(732);
				database_name();
				setState(733);
				match(DOT);
				}
				break;
			}
			setState(737);
			pragma_name();
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(738);
				match(ASSIGN);
				setState(739);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(740);
				match(OPEN_PAR);
				setState(741);
				pragma_value();
				setState(742);
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
		enterRule(_localctx, 52, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(K_REINDEX);
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(747);
				collation_name();
				}
				break;
			case 2:
				{
				setState(751);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(748);
					database_name();
					setState(749);
					match(DOT);
					}
					break;
				}
				setState(755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(753);
					table_name();
					}
					break;
				case 2:
					{
					setState(754);
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
		enterRule(_localctx, 54, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(K_RELEASE);
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(760);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(763);
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
		enterRule(_localctx, 56, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(K_ROLLBACK);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(766);
				match(K_TRANSACTION);
				setState(768);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(767);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(772);
				match(K_TO);
				setState(774);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(773);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(776);
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
		enterRule(_localctx, 58, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(K_SAVEPOINT);
			setState(780);
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

	public static class With_select_stmtContext extends ParserRuleContext {
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
		public With_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterWith_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitWith_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitWith_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_select_stmtContext with_select_stmt() throws RecognitionException {
		With_select_stmtContext _localctx = new With_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_with_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(782);
				match(K_WITH);
				setState(784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(783);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(786);
				common_table_expression();
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(787);
					match(COMMA);
					setState(788);
					common_table_expression();
					}
					}
					setState(793);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(796);
			select_core();
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(797);
				match(K_ORDER);
				setState(798);
				match(K_BY);
				setState(799);
				ordering_term();
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(800);
					match(COMMA);
					setState(801);
					ordering_term();
					}
					}
					setState(806);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(809);
				match(K_LIMIT);
				setState(810);
				expr(0);
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(811);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(812);
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
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
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
		enterRule(_localctx, 62, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			select_core();
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(818);
				match(K_ORDER);
				setState(819);
				match(K_BY);
				setState(820);
				ordering_term();
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(821);
					match(COMMA);
					setState(822);
					ordering_term();
					}
					}
					setState(827);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(830);
				match(K_LIMIT);
				setState(831);
				expr(0);
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(832);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(833);
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
		enterRule(_localctx, 64, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(838);
				with_clause();
				}
			}

			setState(841);
			match(K_UPDATE);
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(842);
				match(K_OR);
				setState(843);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(844);
				match(K_OR);
				setState(845);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(846);
				match(K_OR);
				setState(847);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(848);
				match(K_OR);
				setState(849);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(850);
				match(K_OR);
				setState(851);
				match(K_IGNORE);
				}
				break;
			}
			setState(854);
			qualified_table_name();
			setState(855);
			match(K_SET);
			setState(856);
			column_name();
			setState(857);
			match(ASSIGN);
			setState(858);
			expr(0);
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(859);
				match(COMMA);
				setState(860);
				column_name();
				setState(861);
				match(ASSIGN);
				setState(862);
				expr(0);
				}
				}
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(869);
				match(K_WHERE);
				setState(870);
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
		enterRule(_localctx, 66, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(873);
				with_clause();
				}
			}

			setState(876);
			match(K_UPDATE);
			setState(887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(877);
				match(K_OR);
				setState(878);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(879);
				match(K_OR);
				setState(880);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(881);
				match(K_OR);
				setState(882);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(883);
				match(K_OR);
				setState(884);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(885);
				match(K_OR);
				setState(886);
				match(K_IGNORE);
				}
				break;
			}
			setState(889);
			qualified_table_name();
			setState(890);
			match(K_SET);
			setState(891);
			column_name();
			setState(892);
			match(ASSIGN);
			setState(893);
			expr(0);
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(894);
				match(COMMA);
				setState(895);
				column_name();
				setState(896);
				match(ASSIGN);
				setState(897);
				expr(0);
				}
				}
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(904);
				match(K_WHERE);
				setState(905);
				expr(0);
				}
			}

			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(908);
					match(K_ORDER);
					setState(909);
					match(K_BY);
					setState(910);
					ordering_term();
					setState(915);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(911);
						match(COMMA);
						setState(912);
						ordering_term();
						}
						}
						setState(917);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(920);
				match(K_LIMIT);
				setState(921);
				expr(0);
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(922);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(923);
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
		enterRule(_localctx, 68, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
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
		enterRule(_localctx, 70, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			column_name();
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(931);
				type_name();
				}
				break;
			}
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (K_NOT - 108)) | (1L << (K_NULL - 108)) | (1L << (K_PRIMARY - 108)) | (1L << (K_REFERENCES - 108)) | (1L << (K_UNIQUE - 108)))) != 0)) {
				{
				{
				setState(934);
				column_constraint();
				}
				}
				setState(939);
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
		enterRule(_localctx, 72, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(941); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(940);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(943); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(945);
				match(OPEN_PAR);
				setState(946);
				signed_number();
				setState(947);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(949);
				match(OPEN_PAR);
				setState(950);
				signed_number();
				setState(951);
				match(COMMA);
				setState(952);
				signed_number();
				setState(953);
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
		enterRule(_localctx, 74, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(957);
				match(K_CONSTRAINT);
				setState(958);
				name();
				}
			}

			setState(994);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(961);
				match(K_PRIMARY);
				setState(962);
				match(K_KEY);
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(963);
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

				setState(966);
				conflict_clause();
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(967);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(970);
					match(K_NOT);
					}
				}

				setState(973);
				match(K_NULL);
				setState(974);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(975);
				match(K_UNIQUE);
				setState(976);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(977);
				match(K_CHECK);
				setState(978);
				match(OPEN_PAR);
				setState(979);
				expr(0);
				setState(980);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(982);
				match(K_DEFAULT);
				setState(989);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(983);
					signed_number();
					}
					break;
				case 2:
					{
					setState(984);
					literal_value();
					}
					break;
				case 3:
					{
					setState(985);
					match(OPEN_PAR);
					setState(986);
					expr(0);
					setState(987);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(991);
				match(K_COLLATE);
				setState(992);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(993);
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
		enterRule(_localctx, 76, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(996);
				match(K_ON);
				setState(997);
				match(K_CONFLICT);
				setState(998);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (K_FAIL - 75)) | (1L << (K_IGNORE - 75)) | (1L << (K_REPLACE - 75)) | (1L << (K_ROLLBACK - 75)))) != 0)) ) {
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1002);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1003);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1004);
				dbColumnExpr();
				}
				break;
			case 4:
				{
				setState(1005);
				unary_operator();
				setState(1006);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1008);
				count_function();
				}
				break;
			case 6:
				{
				setState(1009);
				any_function();
				}
				break;
			case 7:
				{
				setState(1010);
				match(OPEN_PAR);
				setState(1011);
				expr(0);
				setState(1012);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1014);
				match(K_CAST);
				setState(1015);
				match(OPEN_PAR);
				setState(1016);
				expr(0);
				setState(1017);
				match(K_AS);
				setState(1018);
				type_name();
				setState(1019);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1022);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1021);
						match(K_NOT);
						}
					}

					setState(1024);
					match(K_EXISTS);
					}
				}

				setState(1027);
				match(OPEN_PAR);
				setState(1028);
				select_stmt();
				setState(1029);
				match(CLOSE_PAR);
				}
				break;
			case 10:
				{
				setState(1031);
				match(K_CASE);
				setState(1033);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1032);
					expr(0);
					}
					break;
				}
				setState(1040); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1035);
					match(K_WHEN);
					setState(1036);
					expr(0);
					setState(1037);
					match(K_THEN);
					setState(1038);
					expr(0);
					}
					}
					setState(1042); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1044);
					match(K_ELSE);
					setState(1045);
					expr(0);
					}
				}

				setState(1048);
				match(K_END);
				}
				break;
			case 11:
				{
				setState(1050);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1053);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1054);
						match(PIPE2);
						setState(1055);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1056);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1057);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1058);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1059);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1060);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1061);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1062);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1063);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1064);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1065);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1066);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1067);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1068);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						{
						setState(1069);
						comparison_operator();
						}
						setState(1070);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1072);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1073);
						and_or();
						setState(1074);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1076);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1077);
						match(K_IS);
						setState(1079);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
						case 1:
							{
							setState(1078);
							match(K_NOT);
							}
							break;
						}
						setState(1081);
						expr(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1082);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1084);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1083);
							match(K_NOT);
							}
						}

						setState(1086);
						match(K_BETWEEN);
						setState(1087);
						expr(0);
						setState(1088);
						match(K_AND);
						setState(1089);
						expr(6);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1091);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1092);
						match(K_COLLATE);
						setState(1093);
						collation_name();
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1094);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1096);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1095);
							match(K_NOT);
							}
						}

						setState(1098);
						_la = _input.LA(1);
						if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (K_GLOB - 80)) | (1L << (K_LIKE - 80)) | (1L << (K_MATCH - 80)) | (1L << (K_REGEXP - 80)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1099);
						expr(0);
						setState(1102);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
						case 1:
							{
							setState(1100);
							match(K_ESCAPE);
							setState(1101);
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
						setState(1104);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1109);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1105);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1106);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1107);
							match(K_NOT);
							setState(1108);
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
						setState(1111);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1113);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1112);
							match(K_NOT);
							}
						}

						setState(1115);
						match(K_IN);
						setState(1135);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
						case 1:
							{
							setState(1116);
							match(OPEN_PAR);
							setState(1126);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
							case 1:
								{
								setState(1117);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1118);
								expr(0);
								setState(1123);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1119);
									match(COMMA);
									setState(1120);
									expr(0);
									}
									}
									setState(1125);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1128);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1132);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
							case 1:
								{
								setState(1129);
								database_name();
								setState(1130);
								match(DOT);
								}
								break;
							}
							setState(1134);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
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
		enterRule(_localctx, 80, RULE_dbColumnExpr);
		int _la;
		try {
			setState(1160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
					case 1:
						{
						setState(1143);
						database_name();
						setState(1144);
						match(DOT);
						}
						break;
					}
					setState(1148);
					table_name();
					setState(1149);
					match(DOT);
					}
					break;
				}
				setState(1153);
				column_name();
				setState(1158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1154);
						match(K_AS);
						}
					}

					setState(1157);
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

	public static class Result_column_exprContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Deid_tagContext deid_tag() {
			return getRuleContext(Deid_tagContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Result_column_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterResult_column_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitResult_column_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitResult_column_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_column_exprContext result_column_expr() throws RecognitionException {
		Result_column_exprContext _localctx = new Result_column_exprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_result_column_expr);
		int _la;
		try {
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1166);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
					case 1:
						{
						setState(1163);
						database_name();
						setState(1164);
						match(DOT);
						}
						break;
					}
					setState(1168);
					table_name();
					setState(1169);
					match(DOT);
					}
					break;
				}
				setState(1173);
				column_name();
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1174);
					deid_tag();
					}
				}

				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1177);
						match(K_AS);
						}
					}

					setState(1180);
					column_alias();
					}
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

	public static class Tracking_column_exprContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Tracking_column_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tracking_column_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTracking_column_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTracking_column_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTracking_column_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tracking_column_exprContext tracking_column_expr() throws RecognitionException {
		Tracking_column_exprContext _localctx = new Tracking_column_exprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tracking_column_expr);
		try {
			setState(1197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT:
			case K_OBFUSCATE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case OPEN_PAR:
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
			case K_DATESHIFT:
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
			case K_FALSE:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IDENTIFIABLE:
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
			case K_ISID:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_MINUS:
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
			case K_TRACKED:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_TRUE:
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
			case IDENTIFIER:
			case STRING_LITERAL:
			case K_OFFUSCATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
					case 1:
						{
						setState(1186);
						database_name();
						setState(1187);
						match(DOT);
						}
						break;
					}
					setState(1191);
					table_name();
					setState(1192);
					match(DOT);
					}
					break;
				}
				setState(1196);
				column_name();
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
			setState(1211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1199);
				match(ASSIGN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1200);
				match(EQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1201);
				match(NOT_EQ1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1202);
				match(NOT_EQ2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1203);
				match(K_IS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1204);
				match(K_IS);
				setState(1205);
				match(K_NOT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1206);
				in_keyword();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1207);
				like_keyword();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1208);
				match(K_GLOB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1209);
				match(K_MATCH);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1210);
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
			setState(1213);
			match(K_REFERENCES);
			setState(1214);
			foreign_table();
			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1215);
				match(OPEN_PAR);
				setState(1216);
				column_name();
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1217);
					match(COMMA);
					setState(1218);
					column_name();
					}
					}
					setState(1223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1224);
				match(CLOSE_PAR);
				}
			}

			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1242);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1228);
					match(K_ON);
					setState(1229);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1238);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
					case 1:
						{
						setState(1230);
						match(K_SET);
						setState(1231);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1232);
						match(K_SET);
						setState(1233);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1234);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1235);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1236);
						match(K_NO);
						setState(1237);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1240);
					match(K_MATCH);
					setState(1241);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1249);
					match(K_NOT);
					}
				}

				setState(1252);
				match(K_DEFERRABLE);
				setState(1257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1253);
					match(K_INITIALLY);
					setState(1254);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1255);
					match(K_INITIALLY);
					setState(1256);
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
			setState(1261);
			match(K_RAISE);
			setState(1262);
			match(OPEN_PAR);
			setState(1267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1263);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1264);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1265);
				match(COMMA);
				setState(1266);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1269);
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
			setState(1271);
			column_name();
			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1272);
				match(K_COLLATE);
				setState(1273);
				collation_name();
				}
			}

			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1276);
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
			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1279);
				match(K_CONSTRAINT);
				setState(1280);
				name();
				}
			}

			setState(1319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1286);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1283);
					match(K_PRIMARY);
					setState(1284);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1285);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1288);
				match(OPEN_PAR);
				setState(1289);
				indexed_column();
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1290);
					match(COMMA);
					setState(1291);
					indexed_column();
					}
					}
					setState(1296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1297);
				match(CLOSE_PAR);
				setState(1298);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1300);
				match(K_CHECK);
				setState(1301);
				match(OPEN_PAR);
				setState(1302);
				expr(0);
				setState(1303);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1305);
				match(K_FOREIGN);
				setState(1306);
				match(K_KEY);
				setState(1307);
				match(OPEN_PAR);
				setState(1308);
				column_name();
				setState(1313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1309);
					match(COMMA);
					setState(1310);
					column_name();
					}
					}
					setState(1315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1316);
				match(CLOSE_PAR);
				setState(1317);
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
			setState(1321);
			match(K_WITH);
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1322);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1325);
			cte_table_name();
			setState(1326);
			match(K_AS);
			setState(1327);
			match(OPEN_PAR);
			setState(1328);
			select_stmt();
			setState(1329);
			match(CLOSE_PAR);
			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1330);
				match(COMMA);
				setState(1331);
				cte_table_name();
				setState(1332);
				match(K_AS);
				setState(1333);
				match(OPEN_PAR);
				setState(1334);
				select_stmt();
				setState(1335);
				match(CLOSE_PAR);
				}
				}
				setState(1341);
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
			setState(1345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1342);
				database_name();
				setState(1343);
				match(DOT);
				}
				break;
			}
			setState(1347);
			table_name();
			setState(1353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1348);
				match(K_INDEXED);
				setState(1349);
				match(K_BY);
				setState(1350);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1351);
				match(K_NOT);
				setState(1352);
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
			setState(1355);
			expr(0);
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1356);
				match(K_COLLATE);
				setState(1357);
				collation_name();
				}
			}

			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1360);
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
			setState(1366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1363);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1364);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1365);
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
			setState(1368);
			table_name();
			setState(1380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1369);
				match(OPEN_PAR);
				setState(1370);
				column_name();
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1371);
					match(COMMA);
					setState(1372);
					column_name();
					}
					}
					setState(1377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1378);
				match(CLOSE_PAR);
				}
			}

			setState(1382);
			match(K_AS);
			setState(1383);
			match(OPEN_PAR);
			setState(1384);
			select_stmt();
			setState(1385);
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
		public Result_column_exprContext result_column_expr() {
			return getRuleContext(Result_column_exprContext.class,0);
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
			setState(1395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1387);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1388);
				table_name();
				setState(1389);
				match(DOT);
				setState(1390);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1392);
				result_column_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1393);
				count_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1394);
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

	public static class Deid_tagContext extends ParserRuleContext {
		public TerminalNode K_IDENTIFIABLE() { return getToken(SQLiteParser.K_IDENTIFIABLE, 0); }
		public Ident_propContext ident_prop() {
			return getRuleContext(Ident_propContext.class,0);
		}
		public Deid_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deid_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDeid_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDeid_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDeid_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deid_tagContext deid_tag() throws RecognitionException {
		Deid_tagContext _localctx = new Deid_tagContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_deid_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			match(LT);
			setState(1398);
			match(K_IDENTIFIABLE);
			setState(1400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1399);
				ident_prop();
				}
				break;
			}
			setState(1402);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ident_propContext extends ParserRuleContext {
		public Id_field_propContext id_field_prop() {
			return getRuleContext(Id_field_propContext.class,0);
		}
		public Date_shift_field_propContext date_shift_field_prop() {
			return getRuleContext(Date_shift_field_propContext.class,0);
		}
		public Obfuscate_field_propContext obfuscate_field_prop() {
			return getRuleContext(Obfuscate_field_propContext.class,0);
		}
		public Ident_propContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIdent_prop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIdent_prop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIdent_prop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ident_propContext ident_prop() throws RecognitionException {
		Ident_propContext _localctx = new Ident_propContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_ident_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ISID) {
				{
				setState(1404);
				id_field_prop();
				}
			}

			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DATESHIFT) {
				{
				setState(1407);
				date_shift_field_prop();
				}
			}

			setState(1411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OBFUSCATE) {
				{
				setState(1410);
				obfuscate_field_prop();
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

	public static class Id_field_propContext extends ParserRuleContext {
		public TerminalNode K_ISID() { return getToken(SQLiteParser.K_ISID, 0); }
		public TerminalNode K_TRUE() { return getToken(SQLiteParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SQLiteParser.K_FALSE, 0); }
		public Id_field_propContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_field_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterId_field_prop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitId_field_prop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitId_field_prop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_field_propContext id_field_prop() throws RecognitionException {
		Id_field_propContext _localctx = new Id_field_propContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_id_field_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			match(K_ISID);
			setState(1414);
			match(ASSIGN);
			setState(1415);
			_la = _input.LA(1);
			if ( !(_la==K_FALSE || _la==K_TRUE) ) {
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

	public static class Date_shift_field_propContext extends ParserRuleContext {
		public TerminalNode K_DATESHIFT() { return getToken(SQLiteParser.K_DATESHIFT, 0); }
		public TerminalNode K_TRACKED() { return getToken(SQLiteParser.K_TRACKED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Tracking_column_exprContext tracking_column_expr() {
			return getRuleContext(Tracking_column_exprContext.class,0);
		}
		public Date_shift_field_propContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_shift_field_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDate_shift_field_prop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDate_shift_field_prop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDate_shift_field_prop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_shift_field_propContext date_shift_field_prop() throws RecognitionException {
		Date_shift_field_propContext _localctx = new Date_shift_field_propContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_date_shift_field_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			match(K_DATESHIFT);
			setState(1418);
			match(K_TRACKED);
			setState(1419);
			match(K_BY);
			setState(1420);
			tracking_column_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Obfuscate_field_propContext extends ParserRuleContext {
		public TerminalNode K_OBFUSCATE() { return getToken(SQLiteParser.K_OBFUSCATE, 0); }
		public TerminalNode K_TRUE() { return getToken(SQLiteParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SQLiteParser.K_FALSE, 0); }
		public Obfuscate_field_propContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obfuscate_field_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterObfuscate_field_prop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitObfuscate_field_prop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitObfuscate_field_prop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Obfuscate_field_propContext obfuscate_field_prop() throws RecognitionException {
		Obfuscate_field_propContext _localctx = new Obfuscate_field_propContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_obfuscate_field_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			match(K_OBFUSCATE);
			setState(1423);
			match(ASSIGN);
			setState(1424);
			_la = _input.LA(1);
			if ( !(_la==K_FALSE || _la==K_TRUE) ) {
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

	public static class From_table_specContext extends ParserRuleContext {
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
		public From_table_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFrom_table_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFrom_table_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFrom_table_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_specContext from_table_spec() throws RecognitionException {
		From_table_specContext _localctx = new From_table_specContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_from_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1426);
				database_name();
				setState(1427);
				match(DOT);
				}
				break;
			}
			setState(1431);
			table_name();
			setState(1436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1432);
					match(K_AS);
					}
					break;
				}
				setState(1435);
				table_alias();
				}
				break;
			}
			setState(1443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1438);
				match(K_INDEXED);
				setState(1439);
				match(K_BY);
				setState(1440);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1441);
				match(K_NOT);
				setState(1442);
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
			case K_MINUS:
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
		}
		catch (RecognitionException re) {
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
		public From_table_specContext from_table_spec() {
			return getRuleContext(From_table_specContext.class,0);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
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
		enterRule(_localctx, 120, RULE_table_or_subquery);
		int _la;
		try {
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1445);
				from_table_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1446);
				match(OPEN_PAR);
				setState(1456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1447);
					table_or_subquery();
					setState(1452);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1448);
						match(COMMA);
						setState(1449);
						table_or_subquery();
						}
						}
						setState(1454);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1455);
					join_clause();
					}
					break;
				}
				setState(1458);
				match(CLOSE_PAR);
				setState(1463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1460);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
					case 1:
						{
						setState(1459);
						match(K_AS);
						}
						break;
					}
					setState(1462);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1465);
				match(OPEN_PAR);
				setState(1466);
				select_stmt();
				setState(1467);
				match(CLOSE_PAR);
				setState(1472);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1469);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
					case 1:
						{
						setState(1468);
						match(K_AS);
						}
						break;
					}
					setState(1471);
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
		enterRule(_localctx, 122, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			table_or_subquery();
			setState(1483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (K_INNER - 91)) | (1L << (K_JOIN - 91)) | (1L << (K_LEFT - 91)) | (1L << (K_NATURAL - 91)))) != 0)) {
				{
				{
				setState(1477);
				join_operator();
				setState(1478);
				table_or_subquery();
				setState(1479);
				join_constraint();
				}
				}
				setState(1485);
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
		enterRule(_localctx, 124, RULE_join_operator);
		int _la;
		try {
			setState(1499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486);
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
				setState(1488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1487);
					match(K_NATURAL);
					}
				}

				setState(1496);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1490);
					match(K_LEFT);
					setState(1492);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1491);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1494);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1495);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1498);
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
		enterRule(_localctx, 126, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1501);
				match(K_ON);
				setState(1502);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1503);
				match(K_USING);
				setState(1504);
				match(OPEN_PAR);
				setState(1505);
				column_name();
				setState(1510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1506);
					match(COMMA);
					setState(1507);
					column_name();
					}
					}
					setState(1512);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1513);
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
			case K_MINUS:
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
		enterRule(_localctx, 128, RULE_select_core);
		int _la;
		try {
			setState(1580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1517);
				match(K_SELECT);
				setState(1519);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1518);
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
				setState(1521);
				result_column();
				setState(1526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1522);
					match(COMMA);
					setState(1523);
					result_column();
					}
					}
					setState(1528);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1529);
					multi_from_clause();
					}
				}

				setState(1534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1532);
					match(K_WHERE);
					setState(1533);
					expr(0);
					}
				}

				setState(1550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1536);
					match(K_GROUP);
					setState(1537);
					match(K_BY);
					setState(1538);
					expr(0);
					setState(1543);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1539);
						match(COMMA);
						setState(1540);
						expr(0);
						}
						}
						setState(1545);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1548);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1546);
						match(K_HAVING);
						setState(1547);
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
				setState(1552);
				match(K_VALUES);
				setState(1553);
				match(OPEN_PAR);
				setState(1554);
				expr(0);
				setState(1559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1555);
					match(COMMA);
					setState(1556);
					expr(0);
					}
					}
					setState(1561);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1562);
				match(CLOSE_PAR);
				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1563);
					match(COMMA);
					setState(1564);
					match(OPEN_PAR);
					setState(1565);
					expr(0);
					setState(1570);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1566);
						match(COMMA);
						setState(1567);
						expr(0);
						}
						}
						setState(1572);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1573);
					match(CLOSE_PAR);
					}
					}
					setState(1579);
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
		enterRule(_localctx, 130, RULE_multi_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			match(K_FROM);
			setState(1592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1583);
				table_or_subquery();
				setState(1588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1584);
					match(COMMA);
					setState(1585);
					table_or_subquery();
					}
					}
					setState(1590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1591);
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

	public static class Set_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public TerminalNode K_MINUS() { return getToken(SQLiteParser.K_MINUS, 0); }
		public Set_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSet_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSet_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSet_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_operatorContext set_operator() throws RecognitionException {
		Set_operatorContext _localctx = new Set_operatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_set_operator);
		try {
			setState(1600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1594);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1595);
				match(K_UNION);
				setState(1596);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1597);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1598);
				match(K_EXCEPT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1599);
				match(K_MINUS);
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
		enterRule(_localctx, 134, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			table_name();
			setState(1614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1603);
				match(OPEN_PAR);
				setState(1604);
				column_name();
				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1605);
					match(COMMA);
					setState(1606);
					column_name();
					}
					}
					setState(1611);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1612);
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
		enterRule(_localctx, 136, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1616);
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

			setState(1619);
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
		enterRule(_localctx, 138, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (K_NULL - 110)) | (1L << (NUMERIC_LITERAL - 110)) | (1L << (STRING_LITERAL - 110)) | (1L << (BLOB_LITERAL - 110)))) != 0)) ) {
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
		enterRule(_localctx, 140, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
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
		enterRule(_localctx, 142, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
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
		enterRule(_localctx, 144, RULE_module_argument);
		try {
			setState(1629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1627);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1628);
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
		enterRule(_localctx, 146, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
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
		public TerminalNode K_DATESHIFT() { return getToken(SQLiteParser.K_DATESHIFT, 0); }
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
		public TerminalNode K_FALSE() { return getToken(SQLiteParser.K_FALSE, 0); }
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLiteParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_IDENTIFIABLE() { return getToken(SQLiteParser.K_IDENTIFIABLE, 0); }
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
		public TerminalNode K_ISID() { return getToken(SQLiteParser.K_ISID, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_MINUS() { return getToken(SQLiteParser.K_MINUS, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLiteParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLiteParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public TerminalNode K_OFFUSCATE() { return getToken(SQLiteParser.K_OFFUSCATE, 0); }
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
		public TerminalNode K_TRACKED() { return getToken(SQLiteParser.K_TRACKED, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public TerminalNode K_TRUE() { return getToken(SQLiteParser.K_TRUE, 0); }
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
		enterRule(_localctx, 148, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRACKED - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) ) {
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
		enterRule(_localctx, 150, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
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
		public Result_column_exprContext result_column_expr() {
			return getRuleContext(Result_column_exprContext.class,0);
		}
		public Any_functionContext any_function() {
			return getRuleContext(Any_functionContext.class,0);
		}
		public Deid_tagContext deid_tag() {
			return getRuleContext(Deid_tagContext.class,0);
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
		enterRule(_localctx, 152, RULE_count_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			match(K_COUNT);
			setState(1638);
			match(OPEN_PAR);
			setState(1648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1639);
					distinct_keyword();
					}
					break;
				}
				setState(1642);
				result_column_expr();
				}
				break;
			case 2:
				{
				setState(1643);
				match(STAR);
				}
				break;
			case 3:
				{
				setState(1645);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1644);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1647);
				any_function();
				}
				break;
			}
			setState(1650);
			match(CLOSE_PAR);
			setState(1652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1651);
				deid_tag();
				}
				break;
			}
			setState(1658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1654);
					match(K_AS);
					}
				}

				setState(1657);
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
		public List<Result_column_exprContext> result_column_expr() {
			return getRuleContexts(Result_column_exprContext.class);
		}
		public Result_column_exprContext result_column_expr(int i) {
			return getRuleContext(Result_column_exprContext.class,i);
		}
		public Deid_tagContext deid_tag() {
			return getRuleContext(Deid_tagContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
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
		enterRule(_localctx, 154, RULE_any_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			function_name();
			setState(1661);
			match(OPEN_PAR);
			setState(1674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1663);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1662);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1665);
				result_column_expr();
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1666);
					match(COMMA);
					setState(1667);
					result_column_expr();
					}
					}
					setState(1672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1673);
				match(STAR);
				}
				break;
			}
			setState(1676);
			match(CLOSE_PAR);
			setState(1678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1677);
				deid_tag();
				}
				break;
			}
			setState(1684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1680);
					match(K_AS);
					}
				}

				setState(1683);
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
		enterRule(_localctx, 156, RULE_and_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
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
		enterRule(_localctx, 158, RULE_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
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
		enterRule(_localctx, 160, RULE_and_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690);
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
		enterRule(_localctx, 162, RULE_not_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
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
		enterRule(_localctx, 164, RULE_in_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
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
		enterRule(_localctx, 166, RULE_like_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
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
		enterRule(_localctx, 168, RULE_distinct_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
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
		enterRule(_localctx, 170, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
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
		enterRule(_localctx, 172, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
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
		enterRule(_localctx, 174, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
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
		enterRule(_localctx, 176, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
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
		enterRule(_localctx, 178, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
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
		enterRule(_localctx, 180, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
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
		enterRule(_localctx, 182, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
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
		enterRule(_localctx, 184, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
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
		enterRule(_localctx, 186, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
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
		enterRule(_localctx, 188, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
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
		enterRule(_localctx, 190, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
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
		enterRule(_localctx, 192, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
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
		enterRule(_localctx, 194, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
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
		enterRule(_localctx, 196, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
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
		enterRule(_localctx, 198, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
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
		enterRule(_localctx, 200, RULE_transaction_name);
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
		enterRule(_localctx, 202, RULE_any_name);
		try {
			setState(1739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1732);
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
			case K_DATESHIFT:
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
			case K_FALSE:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IDENTIFIABLE:
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
			case K_ISID:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_MINUS:
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
			case K_TRACKED:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_TRUE:
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
			case K_OFFUSCATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1733);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1734);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1735);
				match(OPEN_PAR);
				setState(1736);
				any_name();
				setState(1737);
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

	public static class Anything_at_allContext extends ParserRuleContext {
		public Anything_at_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anything_at_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAnything_at_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAnything_at_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAnything_at_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Anything_at_allContext anything_at_all() throws RecognitionException {
		Anything_at_allContext _localctx = new Anything_at_allContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_anything_at_all);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1742); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1741);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1744); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
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
		case 39:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a9\u06d5\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\3\2\3\2\7\2\u00d3"+
		"\n\2\f\2\16\2\u00d6\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4\u00df\n\4\f\4"+
		"\16\4\u00e2\13\4\3\4\7\4\u00e5\n\4\f\4\16\4\u00e8\13\4\3\5\3\5\3\5\5\5"+
		"\u00ed\n\5\5\5\u00ef\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u010e\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0119\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u0121\n\7\3\7\5\7\u0124\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u012d\n\b\3\t\3\t\5\t\u0131\n\t\3\t\3\t\3\t\3\t\3\n\3\n\5"+
		"\n\u0139\n\n\3\n\3\n\5\n\u013d\n\n\5\n\u013f\n\n\3\13\3\13\3\13\5\13\u0144"+
		"\n\13\5\13\u0146\n\13\3\f\3\f\5\f\u014a\n\f\3\f\3\f\3\f\7\f\u014f\n\f"+
		"\f\f\16\f\u0152\13\f\5\f\u0154\n\f\3\f\3\f\3\f\3\f\6\f\u015a\n\f\r\f\16"+
		"\f\u015b\3\f\3\f\3\f\3\f\3\f\7\f\u0163\n\f\f\f\16\f\u0166\13\f\5\f\u0168"+
		"\n\f\3\f\3\f\3\f\3\f\5\f\u016e\n\f\5\f\u0170\n\f\3\r\3\r\5\r\u0174\n\r"+
		"\3\r\3\r\3\r\3\r\5\r\u017a\n\r\3\r\3\r\3\r\5\r\u017f\n\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u0188\n\r\f\r\16\r\u018b\13\r\3\r\3\r\3\r\5\r\u0190"+
		"\n\r\3\16\3\16\5\16\u0194\n\16\3\16\3\16\3\16\3\16\5\16\u019a\n\16\3\16"+
		"\3\16\3\16\5\16\u019f\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u01a6\n\16\f"+
		"\16\16\16\u01a9\13\16\3\16\3\16\7\16\u01ad\n\16\f\16\16\16\u01b0\13\16"+
		"\3\16\3\16\3\16\5\16\u01b5\n\16\3\16\3\16\5\16\u01b9\n\16\3\17\3\17\5"+
		"\17\u01bd\n\17\3\17\3\17\3\17\3\17\5\17\u01c3\n\17\3\17\3\17\3\17\5\17"+
		"\u01c8\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u01cf\n\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u01d8\n\17\f\17\16\17\u01db\13\17\5\17\u01dd\n"+
		"\17\5\17\u01df\n\17\3\17\3\17\3\17\3\17\5\17\u01e5\n\17\3\17\3\17\3\17"+
		"\3\17\5\17\u01eb\n\17\3\17\3\17\5\17\u01ef\n\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u01f6\n\17\3\17\3\17\6\17\u01fa\n\17\r\17\16\17\u01fb\3\17\3"+
		"\17\3\20\3\20\5\20\u0202\n\20\3\20\3\20\3\20\3\20\5\20\u0208\n\20\3\20"+
		"\3\20\3\20\5\20\u020d\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0219\n\21\3\21\3\21\3\21\5\21\u021e\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u0227\n\21\f\21\16\21\u022a\13\21\3\21\3\21\5"+
		"\21\u022e\n\21\3\22\5\22\u0231\n\22\3\22\3\22\3\22\3\22\5\22\u0237\n\22"+
		"\3\23\5\23\u023a\n\23\3\23\3\23\3\23\3\23\5\23\u0240\n\23\3\23\3\23\3"+
		"\23\3\23\3\23\7\23\u0247\n\23\f\23\16\23\u024a\13\23\5\23\u024c\n\23\3"+
		"\23\3\23\3\23\3\23\5\23\u0252\n\23\5\23\u0254\n\23\3\24\3\24\3\24\3\25"+
		"\3\25\5\25\u025b\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0263\n\26\3"+
		"\26\3\26\3\26\5\26\u0268\n\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0270"+
		"\n\27\3\27\3\27\3\27\5\27\u0275\n\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30"+
		"\u027d\n\30\3\30\3\30\3\30\5\30\u0282\n\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\5\31\u028a\n\31\3\31\3\31\3\31\5\31\u028f\n\31\3\31\3\31\3\32\5\32"+
		"\u0294\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u02a7\n\32\3\32\3\32\3\32\3\32\5\32\u02ad"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\7\32\u02b4\n\32\f\32\16\32\u02b7\13\32"+
		"\3\32\3\32\5\32\u02bb\n\32\3\32\3\32\3\32\3\32\3\32\7\32\u02c2\n\32\f"+
		"\32\16\32\u02c5\13\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u02cd\n\32\f"+
		"\32\16\32\u02d0\13\32\3\32\3\32\7\32\u02d4\n\32\f\32\16\32\u02d7\13\32"+
		"\3\32\3\32\3\32\5\32\u02dc\n\32\3\33\3\33\3\33\3\33\5\33\u02e2\n\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02eb\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u02f2\n\34\3\34\3\34\5\34\u02f6\n\34\5\34\u02f8\n\34\3\35\3"+
		"\35\5\35\u02fc\n\35\3\35\3\35\3\36\3\36\3\36\5\36\u0303\n\36\5\36\u0305"+
		"\n\36\3\36\3\36\5\36\u0309\n\36\3\36\5\36\u030c\n\36\3\37\3\37\3\37\3"+
		" \3 \5 \u0313\n \3 \3 \3 \7 \u0318\n \f \16 \u031b\13 \5 \u031d\n \3 "+
		"\3 \3 \3 \3 \3 \7 \u0325\n \f \16 \u0328\13 \5 \u032a\n \3 \3 \3 \3 \5"+
		" \u0330\n \5 \u0332\n \3!\3!\3!\3!\3!\3!\7!\u033a\n!\f!\16!\u033d\13!"+
		"\5!\u033f\n!\3!\3!\3!\3!\5!\u0345\n!\5!\u0347\n!\3\"\5\"\u034a\n\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0357\n\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0363\n\"\f\"\16\"\u0366\13\"\3\"\3\"\5\""+
		"\u036a\n\"\3#\5#\u036d\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u037a\n"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0386\n#\f#\16#\u0389\13#\3#\3#\5#"+
		"\u038d\n#\3#\3#\3#\3#\3#\7#\u0394\n#\f#\16#\u0397\13#\5#\u0399\n#\3#\3"+
		"#\3#\3#\5#\u039f\n#\5#\u03a1\n#\3$\3$\3%\3%\5%\u03a7\n%\3%\7%\u03aa\n"+
		"%\f%\16%\u03ad\13%\3&\6&\u03b0\n&\r&\16&\u03b1\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\5&\u03be\n&\3\'\3\'\5\'\u03c2\n\'\3\'\3\'\3\'\5\'\u03c7\n\'\3"+
		"\'\3\'\5\'\u03cb\n\'\3\'\5\'\u03ce\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u03e0\n\'\3\'\3\'\3\'\5\'\u03e5\n"+
		"\'\3(\3(\3(\5(\u03ea\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\5)\u0401\n)\3)\5)\u0404\n)\3)\3)\3)\3)\3)\3)\5)\u040c"+
		"\n)\3)\3)\3)\3)\3)\6)\u0413\n)\r)\16)\u0414\3)\3)\5)\u0419\n)\3)\3)\3"+
		")\5)\u041e\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\5)\u043a\n)\3)\3)\3)\5)\u043f\n)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\5)\u044b\n)\3)\3)\3)\3)\5)\u0451\n)\3)\3)\3)\3)\3)\5"+
		")\u0458\n)\3)\3)\5)\u045c\n)\3)\3)\3)\3)\3)\3)\7)\u0464\n)\f)\16)\u0467"+
		"\13)\5)\u0469\n)\3)\3)\3)\3)\5)\u046f\n)\3)\5)\u0472\n)\7)\u0474\n)\f"+
		")\16)\u0477\13)\3*\3*\3*\3*\5*\u047d\n*\3*\3*\3*\5*\u0482\n*\3*\3*\5*"+
		"\u0486\n*\3*\5*\u0489\n*\5*\u048b\n*\3+\3+\3+\3+\5+\u0491\n+\3+\3+\3+"+
		"\5+\u0496\n+\3+\3+\5+\u049a\n+\3+\5+\u049d\n+\3+\5+\u04a0\n+\5+\u04a2"+
		"\n+\3,\3,\3,\3,\5,\u04a8\n,\3,\3,\3,\5,\u04ad\n,\3,\5,\u04b0\n,\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u04be\n-\3.\3.\3.\3.\3.\3.\7.\u04c6"+
		"\n.\f.\16.\u04c9\13.\3.\3.\5.\u04cd\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5"+
		".\u04d9\n.\3.\3.\5.\u04dd\n.\7.\u04df\n.\f.\16.\u04e2\13.\3.\5.\u04e5"+
		"\n.\3.\3.\3.\3.\3.\5.\u04ec\n.\5.\u04ee\n.\3/\3/\3/\3/\3/\3/\5/\u04f6"+
		"\n/\3/\3/\3\60\3\60\3\60\5\60\u04fd\n\60\3\60\5\60\u0500\n\60\3\61\3\61"+
		"\5\61\u0504\n\61\3\61\3\61\3\61\5\61\u0509\n\61\3\61\3\61\3\61\3\61\7"+
		"\61\u050f\n\61\f\61\16\61\u0512\13\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0522\n\61\f\61\16\61\u0525"+
		"\13\61\3\61\3\61\3\61\5\61\u052a\n\61\3\62\3\62\5\62\u052e\n\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u053c\n\62"+
		"\f\62\16\62\u053f\13\62\3\63\3\63\3\63\5\63\u0544\n\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u054c\n\63\3\64\3\64\3\64\5\64\u0551\n\64\3\64\5"+
		"\64\u0554\n\64\3\65\3\65\3\65\5\65\u0559\n\65\3\66\3\66\3\66\3\66\3\66"+
		"\7\66\u0560\n\66\f\66\16\66\u0563\13\66\3\66\3\66\5\66\u0567\n\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0576"+
		"\n\67\38\38\38\58\u057b\n8\38\38\39\59\u0580\n9\39\59\u0583\n9\39\59\u0586"+
		"\n9\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\5=\u0598\n=\3=\3="+
		"\5=\u059c\n=\3=\5=\u059f\n=\3=\3=\3=\3=\3=\5=\u05a6\n=\3>\3>\3>\3>\3>"+
		"\7>\u05ad\n>\f>\16>\u05b0\13>\3>\5>\u05b3\n>\3>\3>\5>\u05b7\n>\3>\5>\u05ba"+
		"\n>\3>\3>\3>\3>\5>\u05c0\n>\3>\5>\u05c3\n>\5>\u05c5\n>\3?\3?\3?\3?\3?"+
		"\7?\u05cc\n?\f?\16?\u05cf\13?\3@\3@\5@\u05d3\n@\3@\3@\5@\u05d7\n@\3@\3"+
		"@\5@\u05db\n@\3@\5@\u05de\n@\3A\3A\3A\3A\3A\3A\3A\7A\u05e7\nA\fA\16A\u05ea"+
		"\13A\3A\3A\5A\u05ee\nA\3B\3B\5B\u05f2\nB\3B\3B\3B\7B\u05f7\nB\fB\16B\u05fa"+
		"\13B\3B\5B\u05fd\nB\3B\3B\5B\u0601\nB\3B\3B\3B\3B\3B\7B\u0608\nB\fB\16"+
		"B\u060b\13B\3B\3B\5B\u060f\nB\5B\u0611\nB\3B\3B\3B\3B\3B\7B\u0618\nB\f"+
		"B\16B\u061b\13B\3B\3B\3B\3B\3B\3B\7B\u0623\nB\fB\16B\u0626\13B\3B\3B\7"+
		"B\u062a\nB\fB\16B\u062d\13B\5B\u062f\nB\3C\3C\3C\3C\7C\u0635\nC\fC\16"+
		"C\u0638\13C\3C\5C\u063b\nC\3D\3D\3D\3D\3D\3D\5D\u0643\nD\3E\3E\3E\3E\3"+
		"E\7E\u064a\nE\fE\16E\u064d\13E\3E\3E\5E\u0651\nE\3F\5F\u0654\nF\3F\3F"+
		"\3G\3G\3H\3H\3I\3I\3J\3J\5J\u0660\nJ\3K\3K\3L\3L\3M\3M\3N\3N\3N\5N\u066b"+
		"\nN\3N\3N\3N\5N\u0670\nN\3N\5N\u0673\nN\3N\3N\5N\u0677\nN\3N\5N\u067a"+
		"\nN\3N\5N\u067d\nN\3O\3O\3O\5O\u0682\nO\3O\3O\3O\7O\u0687\nO\fO\16O\u068a"+
		"\13O\3O\5O\u068d\nO\3O\3O\5O\u0691\nO\3O\5O\u0694\nO\3O\5O\u0697\nO\3"+
		"P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3"+
		"[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f"+
		"\3g\3g\3g\3g\3g\3g\3g\5g\u06ce\ng\3h\6h\u06d1\nh\rh\16h\u06d2\3h\2\3P"+
		"i\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\2\26\5\2>>IIXX"+
		"\4\2\61\61FF\4\2\7\7rr\3\2\u008c\u008d\4\2$$@@\7\2\33\33MMWW\u0083\u0083"+
		"\u0086\u0086\4\2\t\t\16\17\3\2\n\13\3\2\20\23\3\2\24\27\6\2RRhhjj\177"+
		"\177\4\2??\u0096\u0096\5\2\33\33MM\u0086\u0086\4\2LL\u0093\u0093\4\2\37"+
		"\37BB\6\2\679pp\u00a1\u00a1\u00a3\u00a4\4\2\n\fnn\4\2\u00a0\u00a0\u00a3"+
		"\u00a3\6\2\33\63\65rt\u009f\u00a9\u00a9\4\2\"\"uu\2\u07cb\2\u00d4\3\2"+
		"\2\2\4\u00d9\3\2\2\2\6\u00dc\3\2\2\2\b\u00ee\3\2\2\2\n\u0111\3\2\2\2\f"+
		"\u0113\3\2\2\2\16\u0125\3\2\2\2\20\u012e\3\2\2\2\22\u0136\3\2\2\2\24\u0140"+
		"\3\2\2\2\26\u0153\3\2\2\2\30\u0171\3\2\2\2\32\u0191\3\2\2\2\34\u01ba\3"+
		"\2\2\2\36\u01ff\3\2\2\2 \u0212\3\2\2\2\"\u0230\3\2\2\2$\u0239\3\2\2\2"+
		"&\u0255\3\2\2\2(\u0258\3\2\2\2*\u025e\3\2\2\2,\u026b\3\2\2\2.\u0278\3"+
		"\2\2\2\60\u0285\3\2\2\2\62\u0293\3\2\2\2\64\u02dd\3\2\2\2\66\u02ec\3\2"+
		"\2\28\u02f9\3\2\2\2:\u02ff\3\2\2\2<\u030d\3\2\2\2>\u031c\3\2\2\2@\u0333"+
		"\3\2\2\2B\u0349\3\2\2\2D\u036c\3\2\2\2F\u03a2\3\2\2\2H\u03a4\3\2\2\2J"+
		"\u03af\3\2\2\2L\u03c1\3\2\2\2N\u03e9\3\2\2\2P\u041d\3\2\2\2R\u048a\3\2"+
		"\2\2T\u04a1\3\2\2\2V\u04af\3\2\2\2X\u04bd\3\2\2\2Z\u04bf\3\2\2\2\\\u04ef"+
		"\3\2\2\2^\u04f9\3\2\2\2`\u0503\3\2\2\2b\u052b\3\2\2\2d\u0543\3\2\2\2f"+
		"\u054d\3\2\2\2h\u0558\3\2\2\2j\u055a\3\2\2\2l\u0575\3\2\2\2n\u0577\3\2"+
		"\2\2p\u057f\3\2\2\2r\u0587\3\2\2\2t\u058b\3\2\2\2v\u0590\3\2\2\2x\u0597"+
		"\3\2\2\2z\u05c4\3\2\2\2|\u05c6\3\2\2\2~\u05dd\3\2\2\2\u0080\u05ed\3\2"+
		"\2\2\u0082\u062e\3\2\2\2\u0084\u0630\3\2\2\2\u0086\u0642\3\2\2\2\u0088"+
		"\u0644\3\2\2\2\u008a\u0653\3\2\2\2\u008c\u0657\3\2\2\2\u008e\u0659\3\2"+
		"\2\2\u0090\u065b\3\2\2\2\u0092\u065f\3\2\2\2\u0094\u0661\3\2\2\2\u0096"+
		"\u0663\3\2\2\2\u0098\u0665\3\2\2\2\u009a\u0667\3\2\2\2\u009c\u067e\3\2"+
		"\2\2\u009e\u0698\3\2\2\2\u00a0\u069a\3\2\2\2\u00a2\u069c\3\2\2\2\u00a4"+
		"\u069e\3\2\2\2\u00a6\u06a0\3\2\2\2\u00a8\u06a2\3\2\2\2\u00aa\u06a4\3\2"+
		"\2\2\u00ac\u06a6\3\2\2\2\u00ae\u06a8\3\2\2\2\u00b0\u06aa\3\2\2\2\u00b2"+
		"\u06ac\3\2\2\2\u00b4\u06ae\3\2\2\2\u00b6\u06b0\3\2\2\2\u00b8\u06b2\3\2"+
		"\2\2\u00ba\u06b4\3\2\2\2\u00bc\u06b6\3\2\2\2\u00be\u06b8\3\2\2\2\u00c0"+
		"\u06ba\3\2\2\2\u00c2\u06bc\3\2\2\2\u00c4\u06be\3\2\2\2\u00c6\u06c0\3\2"+
		"\2\2\u00c8\u06c2\3\2\2\2\u00ca\u06c4\3\2\2\2\u00cc\u06cd\3\2\2\2\u00ce"+
		"\u06d0\3\2\2\2\u00d0\u00d3\5\6\4\2\u00d1\u00d3\5\4\3\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\2"+
		"\2\3\u00d8\3\3\2\2\2\u00d9\u00da\7\u00a8\2\2\u00da\u00db\b\3\1\2\u00db"+
		"\5\3\2\2\2\u00dc\u00e0\5\b\5\2\u00dd\u00df\5\b\5\2\u00de\u00dd\3\2\2\2"+
		"\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e6"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\5\u00ceh\2\u00e4\u00e3\3\2\2"+
		"\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\7"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\7K\2\2\u00ea\u00eb\7{\2\2\u00eb"+
		"\u00ed\7x\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2"+
		"\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u010d\3\2\2\2\u00f0"+
		"\u010e\5\f\7\2\u00f1\u010e\5\16\b\2\u00f2\u010e\5\20\t\2\u00f3\u010e\5"+
		"\22\n\2\u00f4\u010e\5\24\13\2\u00f5\u010e\5\30\r\2\u00f6\u010e\5\32\16"+
		"\2\u00f7\u010e\5\34\17\2\u00f8\u010e\5\36\20\2\u00f9\u010e\5 \21\2\u00fa"+
		"\u010e\5\"\22\2\u00fb\u010e\5$\23\2\u00fc\u010e\5(\25\2\u00fd\u010e\5"+
		"*\26\2\u00fe\u010e\5,\27\2\u00ff\u010e\5.\30\2\u0100\u010e\5\60\31\2\u0101"+
		"\u010e\5\62\32\2\u0102\u010e\5\64\33\2\u0103\u010e\5\66\34\2\u0104\u010e"+
		"\58\35\2\u0105\u010e\5:\36\2\u0106\u010e\5<\37\2\u0107\u010e\5\26\f\2"+
		"\u0108\u010e\5@!\2\u0109\u010e\5B\"\2\u010a\u010e\5D#\2\u010b\u010e\5"+
		"F$\2\u010c\u010e\5> \2\u010d\u00f0\3\2\2\2\u010d\u00f1\3\2\2\2\u010d\u00f2"+
		"\3\2\2\2\u010d\u00f3\3\2\2\2\u010d\u00f4\3\2\2\2\u010d\u00f5\3\2\2\2\u010d"+
		"\u00f6\3\2\2\2\u010d\u00f7\3\2\2\2\u010d\u00f8\3\2\2\2\u010d\u00f9\3\2"+
		"\2\2\u010d\u00fa\3\2\2\2\u010d\u00fb\3\2\2\2\u010d\u00fc\3\2\2\2\u010d"+
		"\u00fd\3\2\2\2\u010d\u00fe\3\2\2\2\u010d\u00ff\3\2\2\2\u010d\u0100\3\2"+
		"\2\2\u010d\u0101\3\2\2\2\u010d\u0102\3\2\2\2\u010d\u0103\3\2\2\2\u010d"+
		"\u0104\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u0106\3\2\2\2\u010d\u0107\3\2"+
		"\2\2\u010d\u0108\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\5\n"+
		"\6\2\u0110\t\3\2\2\2\u0111\u0112\7\3\2\2\u0112\13\3\2\2\2\u0113\u0114"+
		"\7 \2\2\u0114\u0118\7\u008b\2\2\u0115\u0116\5\u00aeX\2\u0116\u0117\7\4"+
		"\2\2\u0117\u0119\3\2\2\2\u0118\u0115\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u0123\5\u00b0Y\2\u011b\u011c\7\u0082\2\2\u011c\u011d"+
		"\7\u008f\2\2\u011d\u0124\5\u00b4[\2\u011e\u0120\7\35\2\2\u011f\u0121\7"+
		"\60\2\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0124\5H%\2\u0123\u011b\3\2\2\2\u0123\u011e\3\2\2\2\u0124\r\3\2\2\2\u0125"+
		"\u012c\7!\2\2\u0126\u012d\5\u00aeX\2\u0127\u012d\5\u00b2Z\2\u0128\u0129"+
		"\5\u00aeX\2\u0129\u012a\7\4\2\2\u012a\u012b\5\u00b2Z\2\u012b\u012d\3\2"+
		"\2\2\u012c\u0126\3\2\2\2\u012c\u0127\3\2\2\2\u012c\u0128\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\17\3\2\2\2\u012e\u0130\7%\2\2\u012f\u0131\7:\2\2"+
		"\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133"+
		"\5P)\2\u0133\u0134\7#\2\2\u0134\u0135\5\u00aeX\2\u0135\21\3\2\2\2\u0136"+
		"\u0138\7(\2\2\u0137\u0139\t\2\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013e\3\2\2\2\u013a\u013c\7\u0091\2\2\u013b\u013d\5\u00caf"+
		"\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013a"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\23\3\2\2\2\u0140\u0145\t\3\2\2\u0141"+
		"\u0143\7\u0091\2\2\u0142\u0144\5\u00caf\2\u0143\u0142\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0141\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\25\3\2\2\2\u0147\u0149\7\u009e\2\2\u0148\u014a\7}\2\2\u0149\u0148\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0150\5j\66\2\u014c"+
		"\u014d\7\7\2\2\u014d\u014f\5j\66\2\u014e\u014c\3\2\2\2\u014f\u0152\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0147\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0159\5\u0082B\2\u0156\u0157\5\u0086D\2\u0157\u0158\5\u0082"+
		"B\2\u0158\u015a\3\2\2\2\u0159\u0156\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0167\3\2\2\2\u015d\u015e\7v"+
		"\2\2\u015e\u015f\7*\2\2\u015f\u0164\5f\64\2\u0160\u0161\7\7\2\2\u0161"+
		"\u0163\5f\64\2\u0162\u0160\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0164\u0165\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"\u015d\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016f\3\2\2\2\u0169\u016a\7i"+
		"\2\2\u016a\u016d\5P)\2\u016b\u016c\t\4\2\2\u016c\u016e\5P)\2\u016d\u016b"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0169\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\27\3\2\2\2\u0171\u0173\7\65\2\2\u0172\u0174\7\u0095"+
		"\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0179\7Z\2\2\u0176\u0177\7U\2\2\u0177\u0178\7n\2\2\u0178\u017a\7J\2\2"+
		"\u0179\u0176\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017e\3\2\2\2\u017b\u017c"+
		"\5\u00aeX\2\u017c\u017d\7\4\2\2\u017d\u017f\3\2\2\2\u017e\u017b\3\2\2"+
		"\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\5\u00bc_\2\u0181"+
		"\u0182\7t\2\2\u0182\u0183\5\u00b0Y\2\u0183\u0184\7\5\2\2\u0184\u0189\5"+
		"^\60\2\u0185\u0186\7\7\2\2\u0186\u0188\5^\60\2\u0187\u0185\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018c\u018f\7\6\2\2\u018d\u018e\7\u009d\2\2\u018e"+
		"\u0190\5P)\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\31\3\2\2\2"+
		"\u0191\u0193\7\65\2\2\u0192\u0194\t\5\2\2\u0193\u0192\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0199\7\u008b\2\2\u0196\u0197\7U\2"+
		"\2\u0197\u0198\7n\2\2\u0198\u019a\7J\2\2\u0199\u0196\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u019e\3\2\2\2\u019b\u019c\5\u00aeX\2\u019c\u019d\7\4\2"+
		"\2\u019d\u019f\3\2\2\2\u019e\u019b\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0"+
		"\3\2\2\2\u01a0\u01b8\5\u00b0Y\2\u01a1\u01a2\7\5\2\2\u01a2\u01a7\5H%\2"+
		"\u01a3\u01a4\7\7\2\2\u01a4\u01a6\5H%\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9"+
		"\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ae\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01aa\u01ab\7\7\2\2\u01ab\u01ad\5`\61\2\u01ac\u01aa\3\2"+
		"\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\7\6\2\2\u01b2\u01b3\7\u009f"+
		"\2\2\u01b3\u01b5\7\u00a0\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b9\3\2\2\2\u01b6\u01b7\7#\2\2\u01b7\u01b9\5@!\2\u01b8\u01a1\3\2\2"+
		"\2\u01b8\u01b6\3\2\2\2\u01b9\33\3\2\2\2\u01ba\u01bc\7\65\2\2\u01bb\u01bd"+
		"\t\5\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01c2\7\u0092\2\2\u01bf\u01c0\7U\2\2\u01c0\u01c1\7n\2\2\u01c1\u01c3\7"+
		"J\2\2\u01c2\u01bf\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c7\3\2\2\2\u01c4"+
		"\u01c5\5\u00aeX\2\u01c5\u01c6\7\4\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c4"+
		"\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ce\5\u00be`"+
		"\2\u01ca\u01cf\7\'\2\2\u01cb\u01cf\7\36\2\2\u01cc\u01cd\7_\2\2\u01cd\u01cf"+
		"\7q\2\2\u01ce\u01ca\3\2\2\2\u01ce\u01cb\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01de\3\2\2\2\u01d0\u01df\7?\2\2\u01d1\u01df\7^\2"+
		"\2\u01d2\u01dc\7\u0096\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d9\5\u00b6\\\2"+
		"\u01d5\u01d6\7\7\2\2\u01d6\u01d8\5\u00b6\\\2\u01d7\u01d5\3\2\2\2\u01d8"+
		"\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dd\3\2"+
		"\2\2\u01db\u01d9\3\2\2\2\u01dc\u01d3\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01df\3\2\2\2\u01de\u01d0\3\2\2\2\u01de\u01d1\3\2\2\2\u01de\u01d2\3\2"+
		"\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e4\7t\2\2\u01e1\u01e2\5\u00aeX\2\u01e2"+
		"\u01e3\7\4\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01ea\5\u00b0Y\2\u01e7\u01e8\7N\2\2\u01e8"+
		"\u01e9\7D\2\2\u01e9\u01eb\7\u0087\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ed\7\u009c\2\2\u01ed\u01ef\5P)\2"+
		"\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f9"+
		"\7(\2\2\u01f1\u01f6\5B\"\2\u01f2\u01f6\5\62\32\2\u01f3\u01f6\5\"\22\2"+
		"\u01f4\u01f6\5@!\2\u01f5\u01f1\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f5\u01f3"+
		"\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\7\3\2\2\u01f8"+
		"\u01fa\3\2\2\2\u01f9\u01f5\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01f9\3\2"+
		"\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\7F\2\2\u01fe"+
		"\35\3\2\2\2\u01ff\u0201\7\65\2\2\u0200\u0202\t\5\2\2\u0201\u0200\3\2\2"+
		"\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0207\7\u009a\2\2\u0204"+
		"\u0205\7U\2\2\u0205\u0206\7n\2\2\u0206\u0208\7J\2\2\u0207\u0204\3\2\2"+
		"\2\u0207\u0208\3\2\2\2\u0208\u020c\3\2\2\2\u0209\u020a\5\u00aeX\2\u020a"+
		"\u020b\7\4\2\2\u020b\u020d\3\2\2\2\u020c\u0209\3\2\2\2\u020c\u020d\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u020f\5\u00c0a\2\u020f\u0210\7#\2\2\u0210"+
		"\u0211\5@!\2\u0211\37\3\2\2\2\u0212\u0213\7\65\2\2\u0213\u0214\7\u009b"+
		"\2\2\u0214\u0218\7\u008b\2\2\u0215\u0216\7U\2\2\u0216\u0217\7n\2\2\u0217"+
		"\u0219\7J\2\2\u0218\u0215\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021d\3\2"+
		"\2\2\u021a\u021b\5\u00aeX\2\u021b\u021c\7\4\2\2\u021c\u021e\3\2\2\2\u021d"+
		"\u021a\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\5\u00b0"+
		"Y\2\u0220\u0221\7\u0097\2\2\u0221\u022d\5\u00c2b\2\u0222\u0223\7\5\2\2"+
		"\u0223\u0228\5\u0092J\2\u0224\u0225\7\7\2\2\u0225\u0227\5\u0092J\2\u0226"+
		"\u0224\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2"+
		"\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022c\7\6\2\2\u022c"+
		"\u022e\3\2\2\2\u022d\u0222\3\2\2\2\u022d\u022e\3\2\2\2\u022e!\3\2\2\2"+
		"\u022f\u0231\5b\62\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232"+
		"\3\2\2\2\u0232\u0233\7?\2\2\u0233\u0236\5&\24\2\u0234\u0235\7\u009d\2"+
		"\2\u0235\u0237\5P)\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237#\3"+
		"\2\2\2\u0238\u023a\5b\62\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u023c\7?\2\2\u023c\u023f\5&\24\2\u023d\u023e\7\u009d"+
		"\2\2\u023e\u0240\5P)\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0253"+
		"\3\2\2\2\u0241\u0242\7v\2\2\u0242\u0243\7*\2\2\u0243\u0248\5f\64\2\u0244"+
		"\u0245\7\7\2\2\u0245\u0247\5f\64\2\u0246\u0244\3\2\2\2\u0247\u024a\3\2"+
		"\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024c\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024b\u0241\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u024e\7i\2\2\u024e\u0251\5P)\2\u024f\u0250\t\4\2\2\u0250\u0252"+
		"\5P)\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253"+
		"\u024b\3\2\2\2\u0253\u0254\3\2\2\2\u0254%\3\2\2\2\u0255\u0256\7P\2\2\u0256"+
		"\u0257\5d\63\2\u0257\'\3\2\2\2\u0258\u025a\7A\2\2\u0259\u025b\7:\2\2\u025a"+
		"\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\5\u00ae"+
		"X\2\u025d)\3\2\2\2\u025e\u025f\7C\2\2\u025f\u0262\7Z\2\2\u0260\u0261\7"+
		"U\2\2\u0261\u0263\7J\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263"+
		"\u0267\3\2\2\2\u0264\u0265\5\u00aeX\2\u0265\u0266\7\4\2\2\u0266\u0268"+
		"\3\2\2\2\u0267\u0264\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u026a\5\u00bc_\2\u026a+\3\2\2\2\u026b\u026c\7C\2\2\u026c\u026f\7\u008b"+
		"\2\2\u026d\u026e\7U\2\2\u026e\u0270\7J\2\2\u026f\u026d\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\u0274\3\2\2\2\u0271\u0272\5\u00aeX\2\u0272\u0273\7\4\2"+
		"\2\u0273\u0275\3\2\2\2\u0274\u0271\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276"+
		"\3\2\2\2\u0276\u0277\5\u00b0Y\2\u0277-\3\2\2\2\u0278\u0279\7C\2\2\u0279"+
		"\u027c\7\u0092\2\2\u027a\u027b\7U\2\2\u027b\u027d\7J\2\2\u027c\u027a\3"+
		"\2\2\2\u027c\u027d\3\2\2\2\u027d\u0281\3\2\2\2\u027e\u027f\5\u00aeX\2"+
		"\u027f\u0280\7\4\2\2\u0280\u0282\3\2\2\2\u0281\u027e\3\2\2\2\u0281\u0282"+
		"\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\5\u00be`\2\u0284/\3\2\2\2\u0285"+
		"\u0286\7C\2\2\u0286\u0289\7\u009a\2\2\u0287\u0288\7U\2\2\u0288\u028a\7"+
		"J\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028e\3\2\2\2\u028b"+
		"\u028c\5\u00aeX\2\u028c\u028d\7\4\2\2\u028d\u028f\3\2\2\2\u028e\u028b"+
		"\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\5\u00c0a"+
		"\2\u0291\61\3\2\2\2\u0292\u0294\5b\62\2\u0293\u0292\3\2\2\2\u0293\u0294"+
		"\3\2\2\2\u0294\u02a6\3\2\2\2\u0295\u02a7\7^\2\2\u0296\u02a7\7\u0083\2"+
		"\2\u0297\u0298\7^\2\2\u0298\u0299\7u\2\2\u0299\u02a7\7\u0083\2\2\u029a"+
		"\u029b\7^\2\2\u029b\u029c\7u\2\2\u029c\u02a7\7\u0086\2\2\u029d\u029e\7"+
		"^\2\2\u029e\u029f\7u\2\2\u029f\u02a7\7\33\2\2\u02a0\u02a1\7^\2\2\u02a1"+
		"\u02a2\7u\2\2\u02a2\u02a7\7M\2\2\u02a3\u02a4\7^\2\2\u02a4\u02a5\7u\2\2"+
		"\u02a5\u02a7\7W\2\2\u02a6\u0295\3\2\2\2\u02a6\u0296\3\2\2\2\u02a6\u0297"+
		"\3\2\2\2\u02a6\u029a\3\2\2\2\u02a6\u029d\3\2\2\2\u02a6\u02a0\3\2\2\2\u02a6"+
		"\u02a3\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02ac\7a\2\2\u02a9\u02aa\5\u00ae"+
		"X\2\u02aa\u02ab\7\4\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02a9\3\2\2\2\u02ac"+
		"\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02ba\5\u00b0Y\2\u02af\u02b0"+
		"\7\5\2\2\u02b0\u02b5\5\u00b6\\\2\u02b1\u02b2\7\7\2\2\u02b2\u02b4\5\u00b6"+
		"\\\2\u02b3\u02b1\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02b9\7\6"+
		"\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02af\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb"+
		"\u02db\3\2\2\2\u02bc\u02bd\7\u0099\2\2\u02bd\u02be\7\5\2\2\u02be\u02c3"+
		"\5P)\2\u02bf\u02c0\7\7\2\2\u02c0\u02c2\5P)\2\u02c1\u02bf\3\2\2\2\u02c2"+
		"\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c6\3\2"+
		"\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02d5\7\6\2\2\u02c7\u02c8\7\7\2\2\u02c8"+
		"\u02c9\7\5\2\2\u02c9\u02ce\5P)\2\u02ca\u02cb\7\7\2\2\u02cb\u02cd\5P)\2"+
		"\u02cc\u02ca\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf"+
		"\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2\7\6\2\2\u02d2"+
		"\u02d4\3\2\2\2\u02d3\u02c7\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2"+
		"\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02dc\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8"+
		"\u02dc\5@!\2\u02d9\u02da\7<\2\2\u02da\u02dc\7\u0099\2\2\u02db\u02bc\3"+
		"\2\2\2\u02db\u02d8\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\63\3\2\2\2\u02dd"+
		"\u02e1\7y\2\2\u02de\u02df\5\u00aeX\2\u02df\u02e0\7\4\2\2\u02e0\u02e2\3"+
		"\2\2\2\u02e1\u02de\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"\u02ea\5\u00c4c\2\u02e4\u02e5\7\b\2\2\u02e5\u02eb\5h\65\2\u02e6\u02e7"+
		"\7\5\2\2\u02e7\u02e8\5h\65\2\u02e8\u02e9\7\6\2\2\u02e9\u02eb\3\2\2\2\u02ea"+
		"\u02e4\3\2\2\2\u02ea\u02e6\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\65\3\2\2"+
		"\2\u02ec\u02f7\7\u0080\2\2\u02ed\u02f8\5\u00b8]\2\u02ee\u02ef\5\u00ae"+
		"X\2\u02ef\u02f0\7\4\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ee\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f6\5\u00b0Y\2\u02f4\u02f6"+
		"\5\u00bc_\2\u02f5\u02f3\3\2\2\2\u02f5\u02f4\3\2\2\2\u02f6\u02f8\3\2\2"+
		"\2\u02f7\u02ed\3\2\2\2\u02f7\u02f1\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\67"+
		"\3\2\2\2\u02f9\u02fb\7\u0081\2\2\u02fa\u02fc\7\u0088\2\2\u02fb\u02fa\3"+
		"\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\5\u00c6d\2"+
		"\u02fe9\3\2\2\2\u02ff\u0304\7\u0086\2\2\u0300\u0302\7\u0091\2\2\u0301"+
		"\u0303\5\u00caf\2\u0302\u0301\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0305"+
		"\3\2\2\2\u0304\u0300\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u030b\3\2\2\2\u0306"+
		"\u0308\7\u008f\2\2\u0307\u0309\7\u0088\2\2\u0308\u0307\3\2\2\2\u0308\u0309"+
		"\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\5\u00c6d\2\u030b\u0306\3\2\2"+
		"\2\u030b\u030c\3\2\2\2\u030c;\3\2\2\2\u030d\u030e\7\u0088\2\2\u030e\u030f"+
		"\5\u00c6d\2\u030f=\3\2\2\2\u0310\u0312\7\u009e\2\2\u0311\u0313\7}\2\2"+
		"\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0319"+
		"\5j\66\2\u0315\u0316\7\7\2\2\u0316\u0318\5j\66\2\u0317\u0315\3\2\2\2\u0318"+
		"\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031d\3\2"+
		"\2\2\u031b\u0319\3\2\2\2\u031c\u0310\3\2\2\2\u031c\u031d\3\2\2\2\u031d"+
		"\u031e\3\2\2\2\u031e\u0329\5\u0082B\2\u031f\u0320\7v\2\2\u0320\u0321\7"+
		"*\2\2\u0321\u0326\5f\64\2\u0322\u0323\7\7\2\2\u0323\u0325\5f\64\2\u0324"+
		"\u0322\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2"+
		"\2\2\u0327\u032a\3\2\2\2\u0328\u0326\3\2\2\2\u0329\u031f\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u0331\3\2\2\2\u032b\u032c\7i\2\2\u032c\u032f\5P)"+
		"\2\u032d\u032e\t\4\2\2\u032e\u0330\5P)\2\u032f\u032d\3\2\2\2\u032f\u0330"+
		"\3\2\2\2\u0330\u0332\3\2\2\2\u0331\u032b\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"?\3\2\2\2\u0333\u033e\5\u0082B\2\u0334\u0335\7v\2\2\u0335\u0336\7*\2\2"+
		"\u0336\u033b\5f\64\2\u0337\u0338\7\7\2\2\u0338\u033a\5f\64\2\u0339\u0337"+
		"\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c"+
		"\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u0334\3\2\2\2\u033e\u033f\3\2"+
		"\2\2\u033f\u0346\3\2\2\2\u0340\u0341\7i\2\2\u0341\u0344\5P)\2\u0342\u0343"+
		"\t\4\2\2\u0343\u0345\5P)\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345"+
		"\u0347\3\2\2\2\u0346\u0340\3\2\2\2\u0346\u0347\3\2\2\2\u0347A\3\2\2\2"+
		"\u0348\u034a\5b\62\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b"+
		"\3\2\2\2\u034b\u0356\7\u0096\2\2\u034c\u034d\7u\2\2\u034d\u0357\7\u0086"+
		"\2\2\u034e\u034f\7u\2\2\u034f\u0357\7\33\2\2\u0350\u0351\7u\2\2\u0351"+
		"\u0357\7\u0083\2\2\u0352\u0353\7u\2\2\u0353\u0357\7M\2\2\u0354\u0355\7"+
		"u\2\2\u0355\u0357\7W\2\2\u0356\u034c\3\2\2\2\u0356\u034e\3\2\2\2\u0356"+
		"\u0350\3\2\2\2\u0356\u0352\3\2\2\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2"+
		"\2\2\u0357\u0358\3\2\2\2\u0358\u0359\5d\63\2\u0359\u035a\7\u008a\2\2\u035a"+
		"\u035b\5\u00b6\\\2\u035b\u035c\7\b\2\2\u035c\u0364\5P)\2\u035d\u035e\7"+
		"\7\2\2\u035e\u035f\5\u00b6\\\2\u035f\u0360\7\b\2\2\u0360\u0361\5P)\2\u0361"+
		"\u0363\3\2\2\2\u0362\u035d\3\2\2\2\u0363\u0366\3\2\2\2\u0364\u0362\3\2"+
		"\2\2\u0364\u0365\3\2\2\2\u0365\u0369\3\2\2\2\u0366\u0364\3\2\2\2\u0367"+
		"\u0368\7\u009d\2\2\u0368\u036a\5P)\2\u0369\u0367\3\2\2\2\u0369\u036a\3"+
		"\2\2\2\u036aC\3\2\2\2\u036b\u036d\5b\62\2\u036c\u036b\3\2\2\2\u036c\u036d"+
		"\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0379\7\u0096\2\2\u036f\u0370\7u\2"+
		"\2\u0370\u037a\7\u0086\2\2\u0371\u0372\7u\2\2\u0372\u037a\7\33\2\2\u0373"+
		"\u0374\7u\2\2\u0374\u037a\7\u0083\2\2\u0375\u0376\7u\2\2\u0376\u037a\7"+
		"M\2\2\u0377\u0378\7u\2\2\u0378\u037a\7W\2\2\u0379\u036f\3\2\2\2\u0379"+
		"\u0371\3\2\2\2\u0379\u0373\3\2\2\2\u0379\u0375\3\2\2\2\u0379\u0377\3\2"+
		"\2\2\u0379\u037a\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c\5d\63\2\u037c"+
		"\u037d\7\u008a\2\2\u037d\u037e\5\u00b6\\\2\u037e\u037f\7\b\2\2\u037f\u0387"+
		"\5P)\2\u0380\u0381\7\7\2\2\u0381\u0382\5\u00b6\\\2\u0382\u0383\7\b\2\2"+
		"\u0383\u0384\5P)\2\u0384\u0386\3\2\2\2\u0385\u0380\3\2\2\2\u0386\u0389"+
		"\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038c\3\2\2\2\u0389"+
		"\u0387\3\2\2\2\u038a\u038b\7\u009d\2\2\u038b\u038d\5P)\2\u038c\u038a\3"+
		"\2\2\2\u038c\u038d\3\2\2\2\u038d\u03a0\3\2\2\2\u038e\u038f\7v\2\2\u038f"+
		"\u0390\7*\2\2\u0390\u0395\5f\64\2\u0391\u0392\7\7\2\2\u0392\u0394\5f\64"+
		"\2\u0393\u0391\3\2\2\2\u0394\u0397\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396"+
		"\3\2\2\2\u0396\u0399\3\2\2\2\u0397\u0395\3\2\2\2\u0398\u038e\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\7i\2\2\u039b\u039e\5P)"+
		"\2\u039c\u039d\t\4\2\2\u039d\u039f\5P)\2\u039e\u039c\3\2\2\2\u039e\u039f"+
		"\3\2\2\2\u039f\u03a1\3\2\2\2\u03a0\u0398\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"+
		"E\3\2\2\2\u03a2\u03a3\7\u0098\2\2\u03a3G\3\2\2\2\u03a4\u03a6\5\u00b6\\"+
		"\2\u03a5\u03a7\5J&\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03ab"+
		"\3\2\2\2\u03a8\u03aa\5L\'\2\u03a9\u03a8\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab"+
		"\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03acI\3\2\2\2\u03ad\u03ab\3\2\2\2"+
		"\u03ae\u03b0\5\u0098M\2\u03af\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1"+
		"\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03bd\3\2\2\2\u03b3\u03b4\7\5"+
		"\2\2\u03b4\u03b5\5\u008aF\2\u03b5\u03b6\7\6\2\2\u03b6\u03be\3\2\2\2\u03b7"+
		"\u03b8\7\5\2\2\u03b8\u03b9\5\u008aF\2\u03b9\u03ba\7\7\2\2\u03ba\u03bb"+
		"\5\u008aF\2\u03bb\u03bc\7\6\2\2\u03bc\u03be\3\2\2\2\u03bd\u03b3\3\2\2"+
		"\2\u03bd\u03b7\3\2\2\2\u03bd\u03be\3\2\2\2\u03beK\3\2\2\2\u03bf\u03c0"+
		"\7\63\2\2\u03c0\u03c2\5\u0098M\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2\2"+
		"\2\u03c2\u03e4\3\2\2\2\u03c3\u03c4\7z\2\2\u03c4\u03c6\7f\2\2\u03c5\u03c7"+
		"\t\6\2\2\u03c6\u03c5\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"\u03ca\5N(\2\u03c9\u03cb\7&\2\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2"+
		"\2\u03cb\u03e5\3\2\2\2\u03cc\u03ce\7n\2\2\u03cd\u03cc\3\2\2\2\u03cd\u03ce"+
		"\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\7p\2\2\u03d0\u03e5\5N(\2\u03d1"+
		"\u03d2\7\u0095\2\2\u03d2\u03e5\5N(\2\u03d3\u03d4\7.\2\2\u03d4\u03d5\7"+
		"\5\2\2\u03d5\u03d6\5P)\2\u03d6\u03d7\7\6\2\2\u03d7\u03e5\3\2\2\2\u03d8"+
		"\u03df\7<\2\2\u03d9\u03e0\5\u008aF\2\u03da\u03e0\5\u008cG\2\u03db\u03dc"+
		"\7\5\2\2\u03dc\u03dd\5P)\2\u03dd\u03de\7\6\2\2\u03de\u03e0\3\2\2\2\u03df"+
		"\u03d9\3\2\2\2\u03df\u03da\3\2\2\2\u03df\u03db\3\2\2\2\u03e0\u03e5\3\2"+
		"\2\2\u03e1\u03e2\7/\2\2\u03e2\u03e5\5\u00b8]\2\u03e3\u03e5\5Z.\2\u03e4"+
		"\u03c3\3\2\2\2\u03e4\u03cd\3\2\2\2\u03e4\u03d1\3\2\2\2\u03e4\u03d3\3\2"+
		"\2\2\u03e4\u03d8\3\2\2\2\u03e4\u03e1\3\2\2\2\u03e4\u03e3\3\2\2\2\u03e5"+
		"M\3\2\2\2\u03e6\u03e7\7t\2\2\u03e7\u03e8\7\62\2\2\u03e8\u03ea\t\7\2\2"+
		"\u03e9\u03e6\3\2\2\2\u03e9\u03ea\3\2\2\2\u03eaO\3\2\2\2\u03eb\u03ec\b"+
		")\1\2\u03ec\u041e\5\u008cG\2\u03ed\u041e\7\u00a2\2\2\u03ee\u041e\5R*\2"+
		"\u03ef\u03f0\5\u008eH\2\u03f0\u03f1\5P)\27\u03f1\u041e\3\2\2\2\u03f2\u041e"+
		"\5\u009aN\2\u03f3\u041e\5\u009cO\2\u03f4\u03f5\7\5\2\2\u03f5\u03f6\5P"+
		")\2\u03f6\u03f7\7\6\2\2\u03f7\u041e\3\2\2\2\u03f8\u03f9\7-\2\2\u03f9\u03fa"+
		"\7\5\2\2\u03fa\u03fb\5P)\2\u03fb\u03fc\7#\2\2\u03fc\u03fd\5J&\2\u03fd"+
		"\u03fe\7\6\2\2\u03fe\u041e\3\2\2\2\u03ff\u0401\7n\2\2\u0400\u03ff\3\2"+
		"\2\2\u0400\u0401\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0404\7J\2\2\u0403"+
		"\u0400\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\7\5"+
		"\2\2\u0406\u0407\5@!\2\u0407\u0408\7\6\2\2\u0408\u041e\3\2\2\2\u0409\u040b"+
		"\7,\2\2\u040a\u040c\5P)\2\u040b\u040a\3\2\2\2\u040b\u040c\3\2\2\2\u040c"+
		"\u0412\3\2\2\2\u040d\u040e\7\u009c\2\2\u040e\u040f\5P)\2\u040f\u0410\7"+
		"\u008e\2\2\u0410\u0411\5P)\2\u0411\u0413\3\2\2\2\u0412\u040d\3\2\2\2\u0413"+
		"\u0414\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0418\3\2"+
		"\2\2\u0416\u0417\7E\2\2\u0417\u0419\5P)\2\u0418\u0416\3\2\2\2\u0418\u0419"+
		"\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041b\7F\2\2\u041b\u041e\3\2\2\2\u041c"+
		"\u041e\5\\/\2\u041d\u03eb\3\2\2\2\u041d\u03ed\3\2\2\2\u041d\u03ee\3\2"+
		"\2\2\u041d\u03ef\3\2\2\2\u041d\u03f2\3\2\2\2\u041d\u03f3\3\2\2\2\u041d"+
		"\u03f4\3\2\2\2\u041d\u03f8\3\2\2\2\u041d\u0403\3\2\2\2\u041d\u0409\3\2"+
		"\2\2\u041d\u041c\3\2\2\2\u041e\u0475\3\2\2\2\u041f\u0420\f\26\2\2\u0420"+
		"\u0421\7\r\2\2\u0421\u0474\5P)\27\u0422\u0423\f\25\2\2\u0423\u0424\t\b"+
		"\2\2\u0424\u0474\5P)\26\u0425\u0426\f\24\2\2\u0426\u0427\t\t\2\2\u0427"+
		"\u0474\5P)\25\u0428\u0429\f\23\2\2\u0429\u042a\t\n\2\2\u042a\u0474\5P"+
		")\24\u042b\u042c\f\22\2\2\u042c\u042d\t\13\2\2\u042d\u0474\5P)\23\u042e"+
		"\u042f\f\21\2\2\u042f\u0430\5X-\2\u0430\u0431\5P)\22\u0431\u0474\3\2\2"+
		"\2\u0432\u0433\f\20\2\2\u0433\u0434\5\u00a2R\2\u0434\u0435\5P)\21\u0435"+
		"\u0474\3\2\2\2\u0436\u0437\f\b\2\2\u0437\u0439\7b\2\2\u0438\u043a\7n\2"+
		"\2\u0439\u0438\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u0474"+
		"\5P)\t\u043c\u043e\f\7\2\2\u043d\u043f\7n\2\2\u043e\u043d\3\2\2\2\u043e"+
		"\u043f\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\7)\2\2\u0441\u0442\5P)"+
		"\2\u0442\u0443\7\"\2\2\u0443\u0444\5P)\b\u0444\u0474\3\2\2\2\u0445\u0446"+
		"\f\13\2\2\u0446\u0447\7/\2\2\u0447\u0474\5\u00b8]\2\u0448\u044a\f\n\2"+
		"\2\u0449\u044b\7n\2\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c"+
		"\3\2\2\2\u044c\u044d\t\f\2\2\u044d\u0450\5P)\2\u044e\u044f\7G\2\2\u044f"+
		"\u0451\5P)\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0474\3\2\2"+
		"\2\u0452\u0457\f\t\2\2\u0453\u0458\7d\2\2\u0454\u0458\7o\2\2\u0455\u0456"+
		"\7n\2\2\u0456\u0458\7p\2\2\u0457\u0453\3\2\2\2\u0457\u0454\3\2\2\2\u0457"+
		"\u0455\3\2\2\2\u0458\u0474\3\2\2\2\u0459\u045b\f\6\2\2\u045a\u045c\7n"+
		"\2\2\u045b\u045a\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045d\3\2\2\2\u045d"+
		"\u0471\7Y\2\2\u045e\u0468\7\5\2\2\u045f\u0469\5@!\2\u0460\u0465\5P)\2"+
		"\u0461\u0462\7\7\2\2\u0462\u0464\5P)\2\u0463\u0461\3\2\2\2\u0464\u0467"+
		"\3\2\2\2\u0465\u0463\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0469\3\2\2\2\u0467"+
		"\u0465\3\2\2\2\u0468\u045f\3\2\2\2\u0468\u0460\3\2\2\2\u0468\u0469\3\2"+
		"\2\2\u0469\u046a\3\2\2\2\u046a\u0472\7\6\2\2\u046b\u046c\5\u00aeX\2\u046c"+
		"\u046d\7\4\2\2\u046d\u046f\3\2\2\2\u046e\u046b\3\2\2\2\u046e\u046f\3\2"+
		"\2\2\u046f\u0470\3\2\2\2\u0470\u0472\5\u00b0Y\2\u0471\u045e\3\2\2\2\u0471"+
		"\u046e\3\2\2\2\u0472\u0474\3\2\2\2\u0473\u041f\3\2\2\2\u0473\u0422\3\2"+
		"\2\2\u0473\u0425\3\2\2\2\u0473\u0428\3\2\2\2\u0473\u042b\3\2\2\2\u0473"+
		"\u042e\3\2\2\2\u0473\u0432\3\2\2\2\u0473\u0436\3\2\2\2\u0473\u043c\3\2"+
		"\2\2\u0473\u0445\3\2\2\2\u0473\u0448\3\2\2\2\u0473\u0452\3\2\2\2\u0473"+
		"\u0459\3\2\2\2\u0474\u0477\3\2\2\2\u0475\u0473\3\2\2\2\u0475\u0476\3\2"+
		"\2\2\u0476Q\3\2\2\2\u0477\u0475\3\2\2\2\u0478\u048b\3\2\2\2\u0479\u047a"+
		"\5\u00aeX\2\u047a\u047b\7\4\2\2\u047b\u047d\3\2\2\2\u047c\u0479\3\2\2"+
		"\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\5\u00b0Y\2\u047f"+
		"\u0480\7\4\2\2\u0480\u0482\3\2\2\2\u0481\u047c\3\2\2\2\u0481\u0482\3\2"+
		"\2\2\u0482\u0483\3\2\2\2\u0483\u0488\5\u00b6\\\2\u0484\u0486\7#\2\2\u0485"+
		"\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0489\5\u0094"+
		"K\2\u0488\u0485\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048b\3\2\2\2\u048a"+
		"\u0478\3\2\2\2\u048a\u0481\3\2\2\2\u048bS\3\2\2\2\u048c\u04a2\3\2\2\2"+
		"\u048d\u048e\5\u00aeX\2\u048e\u048f\7\4\2\2\u048f\u0491\3\2\2\2\u0490"+
		"\u048d\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\5\u00b0"+
		"Y\2\u0493\u0494\7\4\2\2\u0494\u0496\3\2\2\2\u0495\u0490\3\2\2\2\u0495"+
		"\u0496\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0499\5\u00b6\\\2\u0498\u049a"+
		"\5n8\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049f\3\2\2\2\u049b"+
		"\u049d\7#\2\2\u049c\u049b\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2"+
		"\2\2\u049e\u04a0\5\u0094K\2\u049f\u049c\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0"+
		"\u04a2\3\2\2\2\u04a1\u048c\3\2\2\2\u04a1\u0495\3\2\2\2\u04a2U\3\2\2\2"+
		"\u04a3\u04b0\3\2\2\2\u04a4\u04a5\5\u00aeX\2\u04a5\u04a6\7\4\2\2\u04a6"+
		"\u04a8\3\2\2\2\u04a7\u04a4\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\3\2"+
		"\2\2\u04a9\u04aa\5\u00b0Y\2\u04aa\u04ab\7\4\2\2\u04ab\u04ad\3\2\2\2\u04ac"+
		"\u04a7\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b0\5\u00b6"+
		"\\\2\u04af\u04a3\3\2\2\2\u04af\u04ac\3\2\2\2\u04b0W\3\2\2\2\u04b1\u04be"+
		"\7\b\2\2\u04b2\u04be\7\30\2\2\u04b3\u04be\7\31\2\2\u04b4\u04be\7\32\2"+
		"\2\u04b5\u04be\7b\2\2\u04b6\u04b7\7b\2\2\u04b7\u04be\7n\2\2\u04b8\u04be"+
		"\5\u00a6T\2\u04b9\u04be\5\u00a8U\2\u04ba\u04be\7R\2\2\u04bb\u04be\7j\2"+
		"\2\u04bc\u04be\7\177\2\2\u04bd\u04b1\3\2\2\2\u04bd\u04b2\3\2\2\2\u04bd"+
		"\u04b3\3\2\2\2\u04bd\u04b4\3\2\2\2\u04bd\u04b5\3\2\2\2\u04bd\u04b6\3\2"+
		"\2\2\u04bd\u04b8\3\2\2\2\u04bd\u04b9\3\2\2\2\u04bd\u04ba\3\2\2\2\u04bd"+
		"\u04bb\3\2\2\2\u04bd\u04bc\3\2\2\2\u04beY\3\2\2\2\u04bf\u04c0\7~\2\2\u04c0"+
		"\u04cc\5\u00ba^\2\u04c1\u04c2\7\5\2\2\u04c2\u04c7\5\u00b6\\\2\u04c3\u04c4"+
		"\7\7\2\2\u04c4\u04c6\5\u00b6\\\2\u04c5\u04c3\3\2\2\2\u04c6\u04c9\3\2\2"+
		"\2\u04c7\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04ca\3\2\2\2\u04c9\u04c7"+
		"\3\2\2\2\u04ca\u04cb\7\6\2\2\u04cb\u04cd\3\2\2\2\u04cc\u04c1\3\2\2\2\u04cc"+
		"\u04cd\3\2\2\2\u04cd\u04e0\3\2\2\2\u04ce\u04cf\7t\2\2\u04cf\u04d8\t\r"+
		"\2\2\u04d0\u04d1\7\u008a\2\2\u04d1\u04d9\7p\2\2\u04d2\u04d3\7\u008a\2"+
		"\2\u04d3\u04d9\7<\2\2\u04d4\u04d9\7+\2\2\u04d5\u04d9\7\u0084\2\2\u04d6"+
		"\u04d7\7m\2\2\u04d7\u04d9\7\34\2\2\u04d8\u04d0\3\2\2\2\u04d8\u04d2\3\2"+
		"\2\2\u04d8\u04d4\3\2\2\2\u04d8\u04d5\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d9"+
		"\u04dd\3\2\2\2\u04da\u04db\7j\2\2\u04db\u04dd\5\u0098M\2\u04dc\u04ce\3"+
		"\2\2\2\u04dc\u04da\3\2\2\2\u04dd\u04df\3\2\2\2\u04de\u04dc\3\2\2\2\u04df"+
		"\u04e2\3\2\2\2\u04e0\u04de\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04ed\3\2"+
		"\2\2\u04e2\u04e0\3\2\2\2\u04e3\u04e5\7n\2\2\u04e4\u04e3\3\2\2\2\u04e4"+
		"\u04e5\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04eb\7=\2\2\u04e7\u04e8\7\\"+
		"\2\2\u04e8\u04ec\7>\2\2\u04e9\u04ea\7\\\2\2\u04ea\u04ec\7X\2\2\u04eb\u04e7"+
		"\3\2\2\2\u04eb\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ee\3\2\2\2\u04ed"+
		"\u04e4\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee[\3\2\2\2\u04ef\u04f0\7|\2\2\u04f0"+
		"\u04f5\7\5\2\2\u04f1\u04f6\7W\2\2\u04f2\u04f3\t\16\2\2\u04f3\u04f4\7\7"+
		"\2\2\u04f4\u04f6\5\u0090I\2\u04f5\u04f1\3\2\2\2\u04f5\u04f2\3\2\2\2\u04f6"+
		"\u04f7\3\2\2\2\u04f7\u04f8\7\6\2\2\u04f8]\3\2\2\2\u04f9\u04fc\5\u00b6"+
		"\\\2\u04fa\u04fb\7/\2\2\u04fb\u04fd\5\u00b8]\2\u04fc\u04fa\3\2\2\2\u04fc"+
		"\u04fd\3\2\2\2\u04fd\u04ff\3\2\2\2\u04fe\u0500\t\6\2\2\u04ff\u04fe\3\2"+
		"\2\2\u04ff\u0500\3\2\2\2\u0500_\3\2\2\2\u0501\u0502\7\63\2\2\u0502\u0504"+
		"\5\u0098M\2\u0503\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0529\3\2\2"+
		"\2\u0505\u0506\7z\2\2\u0506\u0509\7f\2\2\u0507\u0509\7\u0095\2\2\u0508"+
		"\u0505\3\2\2\2\u0508\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\7\5"+
		"\2\2\u050b\u0510\5^\60\2\u050c\u050d\7\7\2\2\u050d\u050f\5^\60\2\u050e"+
		"\u050c\3\2\2\2\u050f\u0512\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2"+
		"\2\2\u0511\u0513\3\2\2\2\u0512\u0510\3\2\2\2\u0513\u0514\7\6\2\2\u0514"+
		"\u0515\5N(\2\u0515\u052a\3\2\2\2\u0516\u0517\7.\2\2\u0517\u0518\7\5\2"+
		"\2\u0518\u0519\5P)\2\u0519\u051a\7\6\2\2\u051a\u052a\3\2\2\2\u051b\u051c"+
		"\7O\2\2\u051c\u051d\7f\2\2\u051d\u051e\7\5\2\2\u051e\u0523\5\u00b6\\\2"+
		"\u051f\u0520\7\7\2\2\u0520\u0522\5\u00b6\\\2\u0521\u051f\3\2\2\2\u0522"+
		"\u0525\3\2\2\2\u0523\u0521\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0526\3\2"+
		"\2\2\u0525\u0523\3\2\2\2\u0526\u0527\7\6\2\2\u0527\u0528\5Z.\2\u0528\u052a"+
		"\3\2\2\2\u0529\u0508\3\2\2\2\u0529\u0516\3\2\2\2\u0529\u051b\3\2\2\2\u052a"+
		"a\3\2\2\2\u052b\u052d\7\u009e\2\2\u052c\u052e\7}\2\2\u052d\u052c\3\2\2"+
		"\2\u052d\u052e\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0530\5\u0088E\2\u0530"+
		"\u0531\7#\2\2\u0531\u0532\7\5\2\2\u0532\u0533\5@!\2\u0533\u053d\7\6\2"+
		"\2\u0534\u0535\7\7\2\2\u0535\u0536\5\u0088E\2\u0536\u0537\7#\2\2\u0537"+
		"\u0538\7\5\2\2\u0538\u0539\5@!\2\u0539\u053a\7\6\2\2\u053a\u053c\3\2\2"+
		"\2\u053b\u0534\3\2\2\2\u053c\u053f\3\2\2\2\u053d\u053b\3\2\2\2\u053d\u053e"+
		"\3\2\2\2\u053ec\3\2\2\2\u053f\u053d\3\2\2\2\u0540\u0541\5\u00aeX\2\u0541"+
		"\u0542\7\4\2\2\u0542\u0544\3\2\2\2\u0543\u0540\3\2\2\2\u0543\u0544\3\2"+
		"\2\2\u0544\u0545\3\2\2\2\u0545\u054b\5\u00b0Y\2\u0546\u0547\7[\2\2\u0547"+
		"\u0548\7*\2\2\u0548\u054c\5\u00bc_\2\u0549\u054a\7n\2\2\u054a\u054c\7"+
		"[\2\2\u054b\u0546\3\2\2\2\u054b\u0549\3\2\2\2\u054b\u054c\3\2\2\2\u054c"+
		"e\3\2\2\2\u054d\u0550\5P)\2\u054e\u054f\7/\2\2\u054f\u0551\5\u00b8]\2"+
		"\u0550\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0553\3\2\2\2\u0552\u0554"+
		"\t\6\2\2\u0553\u0552\3\2\2\2\u0553\u0554\3\2\2\2\u0554g\3\2\2\2\u0555"+
		"\u0559\5\u008aF\2\u0556\u0559\5\u0098M\2\u0557\u0559\7\u00a3\2\2\u0558"+
		"\u0555\3\2\2\2\u0558\u0556\3\2\2\2\u0558\u0557\3\2\2\2\u0559i\3\2\2\2"+
		"\u055a\u0566\5\u00b0Y\2\u055b\u055c\7\5\2\2\u055c\u0561\5\u00b6\\\2\u055d"+
		"\u055e\7\7\2\2\u055e\u0560\5\u00b6\\\2\u055f\u055d\3\2\2\2\u0560\u0563"+
		"\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0564\3\2\2\2\u0563"+
		"\u0561\3\2\2\2\u0564\u0565\7\6\2\2\u0565\u0567\3\2\2\2\u0566\u055b\3\2"+
		"\2\2\u0566\u0567\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u0569\7#\2\2\u0569"+
		"\u056a\7\5\2\2\u056a\u056b\5@!\2\u056b\u056c\7\6\2\2\u056ck\3\2\2\2\u056d"+
		"\u0576\7\t\2\2\u056e\u056f\5\u00b0Y\2\u056f\u0570\7\4\2\2\u0570\u0571"+
		"\7\t\2\2\u0571\u0576\3\2\2\2\u0572\u0576\5T+\2\u0573\u0576\5\u009aN\2"+
		"\u0574\u0576\5\u009cO\2\u0575\u056d\3\2\2\2\u0575\u056e\3\2\2\2\u0575"+
		"\u0572\3\2\2\2\u0575\u0573\3\2\2\2\u0575\u0574\3\2\2\2\u0576m\3\2\2\2"+
		"\u0577\u0578\7\24\2\2\u0578\u057a\7V\2\2\u0579\u057b\5p9\2\u057a\u0579"+
		"\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057d\7\26\2\2"+
		"\u057do\3\2\2\2\u057e\u0580\5r:\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2"+
		"\2\2\u0580\u0582\3\2\2\2\u0581\u0583\5t;\2\u0582\u0581\3\2\2\2\u0582\u0583"+
		"\3\2\2\2\u0583\u0585\3\2\2\2\u0584\u0586\5v<\2\u0585\u0584\3\2\2\2\u0585"+
		"\u0586\3\2\2\2\u0586q\3\2\2\2\u0587\u0588\7c\2\2\u0588\u0589\7\b\2\2\u0589"+
		"\u058a\t\17\2\2\u058as\3\2\2\2\u058b\u058c\7;\2\2\u058c\u058d\7\u0090"+
		"\2\2\u058d\u058e\7*\2\2\u058e\u058f\5V,\2\u058fu\3\2\2\2\u0590\u0591\7"+
		"s\2\2\u0591\u0592\7\b\2\2\u0592\u0593\t\17\2\2\u0593w\3\2\2\2\u0594\u0595"+
		"\5\u00aeX\2\u0595\u0596\7\4\2\2\u0596\u0598\3\2\2\2\u0597\u0594\3\2\2"+
		"\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059e\5\u00b0Y\2\u059a"+
		"\u059c\7#\2\2\u059b\u059a\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059d\3\2"+
		"\2\2\u059d\u059f\5\u00c8e\2\u059e\u059b\3\2\2\2\u059e\u059f\3\2\2\2\u059f"+
		"\u05a5\3\2\2\2\u05a0\u05a1\7[\2\2\u05a1\u05a2\7*\2\2\u05a2\u05a6\5\u00bc"+
		"_\2\u05a3\u05a4\7n\2\2\u05a4\u05a6\7[\2\2\u05a5\u05a0\3\2\2\2\u05a5\u05a3"+
		"\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6y\3\2\2\2\u05a7\u05c5\5x=\2\u05a8\u05b2"+
		"\7\5\2\2\u05a9\u05ae\5z>\2\u05aa\u05ab\7\7\2\2\u05ab\u05ad\5z>\2\u05ac"+
		"\u05aa\3\2\2\2\u05ad\u05b0\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2"+
		"\2\2\u05af\u05b3\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b1\u05b3\5|?\2\u05b2\u05a9"+
		"\3\2\2\2\u05b2\u05b1\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b9\7\6\2\2\u05b5"+
		"\u05b7\7#\2\2\u05b6\u05b5\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b8\3\2"+
		"\2\2\u05b8\u05ba\5\u00c8e\2\u05b9\u05b6\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba"+
		"\u05c5\3\2\2\2\u05bb\u05bc\7\5\2\2\u05bc\u05bd\5@!\2\u05bd\u05c2\7\6\2"+
		"\2\u05be\u05c0\7#\2\2\u05bf\u05be\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c1"+
		"\3\2\2\2\u05c1\u05c3\5\u00c8e\2\u05c2\u05bf\3\2\2\2\u05c2\u05c3\3\2\2"+
		"\2\u05c3\u05c5\3\2\2\2\u05c4\u05a7\3\2\2\2\u05c4\u05a8\3\2\2\2\u05c4\u05bb"+
		"\3\2\2\2\u05c5{\3\2\2\2\u05c6\u05cd\5z>\2\u05c7\u05c8\5~@\2\u05c8\u05c9"+
		"\5z>\2\u05c9\u05ca\5\u0080A\2\u05ca\u05cc\3\2\2\2\u05cb\u05c7\3\2\2\2"+
		"\u05cc\u05cf\3\2\2\2\u05cd\u05cb\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce}\3"+
		"\2\2\2\u05cf\u05cd\3\2\2\2\u05d0\u05de\7\7\2\2\u05d1\u05d3\7l\2\2\u05d2"+
		"\u05d1\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05da\3\2\2\2\u05d4\u05d6\7g"+
		"\2\2\u05d5\u05d7\7w\2\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7"+
		"\u05db\3\2\2\2\u05d8\u05db\7]\2\2\u05d9\u05db\7\66\2\2\u05da\u05d4\3\2"+
		"\2\2\u05da\u05d8\3\2\2\2\u05da\u05d9\3\2\2\2\u05da\u05db\3\2\2\2\u05db"+
		"\u05dc\3\2\2\2\u05dc\u05de\7e\2\2\u05dd\u05d0\3\2\2\2\u05dd\u05d2\3\2"+
		"\2\2\u05de\177\3\2\2\2\u05df\u05e0\7t\2\2\u05e0\u05ee\5P)\2\u05e1\u05e2"+
		"\7\u0097\2\2\u05e2\u05e3\7\5\2\2\u05e3\u05e8\5\u00b6\\\2\u05e4\u05e5\7"+
		"\7\2\2\u05e5\u05e7\5\u00b6\\\2\u05e6\u05e4\3\2\2\2\u05e7\u05ea\3\2\2\2"+
		"\u05e8\u05e6\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05eb\3\2\2\2\u05ea\u05e8"+
		"\3\2\2\2\u05eb\u05ec\7\6\2\2\u05ec\u05ee\3\2\2\2\u05ed\u05df\3\2\2\2\u05ed"+
		"\u05e1\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u0081\3\2\2\2\u05ef\u05f1\7\u0089"+
		"\2\2\u05f0\u05f2\t\20\2\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2"+
		"\u05f3\3\2\2\2\u05f3\u05f8\5l\67\2\u05f4\u05f5\7\7\2\2\u05f5\u05f7\5l"+
		"\67\2\u05f6\u05f4\3\2\2\2\u05f7\u05fa\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8"+
		"\u05f9\3\2\2\2\u05f9\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fb\u05fd\5\u0084"+
		"C\2\u05fc\u05fb\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u0600\3\2\2\2\u05fe"+
		"\u05ff\7\u009d\2\2\u05ff\u0601\5P)\2\u0600\u05fe\3\2\2\2\u0600\u0601\3"+
		"\2\2\2\u0601\u0610\3\2\2\2\u0602\u0603\7S\2\2\u0603\u0604\7*\2\2\u0604"+
		"\u0609\5P)\2\u0605\u0606\7\7\2\2\u0606\u0608\5P)\2\u0607\u0605\3\2\2\2"+
		"\u0608\u060b\3\2\2\2\u0609\u0607\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060e"+
		"\3\2\2\2\u060b\u0609\3\2\2\2\u060c\u060d\7T\2\2\u060d\u060f\5P)\2\u060e"+
		"\u060c\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0611\3\2\2\2\u0610\u0602\3\2"+
		"\2\2\u0610\u0611\3\2\2\2\u0611\u062f\3\2\2\2\u0612\u0613\7\u0099\2\2\u0613"+
		"\u0614\7\5\2\2\u0614\u0619\5P)\2\u0615\u0616\7\7\2\2\u0616\u0618\5P)\2"+
		"\u0617\u0615\3\2\2\2\u0618\u061b\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u061a"+
		"\3\2\2\2\u061a\u061c\3\2\2\2\u061b\u0619\3\2\2\2\u061c\u062b\7\6\2\2\u061d"+
		"\u061e\7\7\2\2\u061e\u061f\7\5\2\2\u061f\u0624\5P)\2\u0620\u0621\7\7\2"+
		"\2\u0621\u0623\5P)\2\u0622\u0620\3\2\2\2\u0623\u0626\3\2\2\2\u0624\u0622"+
		"\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u0627\3\2\2\2\u0626\u0624\3\2\2\2\u0627"+
		"\u0628\7\6\2\2\u0628\u062a\3\2\2\2\u0629\u061d\3\2\2\2\u062a\u062d\3\2"+
		"\2\2\u062b\u0629\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062f\3\2\2\2\u062d"+
		"\u062b\3\2\2\2\u062e\u05ef\3\2\2\2\u062e\u0612\3\2\2\2\u062f\u0083\3\2"+
		"\2\2\u0630\u063a\7P\2\2\u0631\u0636\5z>\2\u0632\u0633\7\7\2\2\u0633\u0635"+
		"\5z>\2\u0634\u0632\3\2\2\2\u0635\u0638\3\2\2\2\u0636\u0634\3\2\2\2\u0636"+
		"\u0637\3\2\2\2\u0637\u063b\3\2\2\2\u0638\u0636\3\2\2\2\u0639\u063b\5|"+
		"?\2\u063a\u0631\3\2\2\2\u063a\u0639\3\2\2\2\u063b\u0085\3\2\2\2\u063c"+
		"\u0643\7\u0094\2\2\u063d\u063e\7\u0094\2\2\u063e\u0643\7\37\2\2\u063f"+
		"\u0643\7`\2\2\u0640\u0643\7H\2\2\u0641\u0643\7k\2\2\u0642\u063c\3\2\2"+
		"\2\u0642\u063d\3\2\2\2\u0642\u063f\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0641"+
		"\3\2\2\2\u0643\u0087\3\2\2\2\u0644\u0650\5\u00b0Y\2\u0645\u0646\7\5\2"+
		"\2\u0646\u064b\5\u00b6\\\2\u0647\u0648\7\7\2\2\u0648\u064a\5\u00b6\\\2"+
		"\u0649\u0647\3\2\2\2\u064a\u064d\3\2\2\2\u064b\u0649\3\2\2\2\u064b\u064c"+
		"\3\2\2\2\u064c\u064e\3\2\2\2\u064d\u064b\3\2\2\2\u064e\u064f\7\6\2\2\u064f"+
		"\u0651\3\2\2\2\u0650\u0645\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0089\3\2"+
		"\2\2\u0652\u0654\t\t\2\2\u0653\u0652\3\2\2\2\u0653\u0654\3\2\2\2\u0654"+
		"\u0655\3\2\2\2\u0655\u0656\7\u00a1\2\2\u0656\u008b\3\2\2\2\u0657\u0658"+
		"\t\21\2\2\u0658\u008d\3\2\2\2\u0659\u065a\t\22\2\2\u065a\u008f\3\2\2\2"+
		"\u065b\u065c\7\u00a3\2\2\u065c\u0091\3\2\2\2\u065d\u0660\5P)\2\u065e\u0660"+
		"\5H%\2\u065f\u065d\3\2\2\2\u065f\u065e\3\2\2\2\u0660\u0093\3\2\2\2\u0661"+
		"\u0662\t\23\2\2\u0662\u0095\3\2\2\2\u0663\u0664\t\24\2\2\u0664\u0097\3"+
		"\2\2\2\u0665\u0666\5\u00ccg\2\u0666\u0099\3\2\2\2\u0667\u0668\7\64\2\2"+
		"\u0668\u0672\7\5\2\2\u0669\u066b\5\u00aaV\2\u066a\u0669\3\2\2\2\u066a"+
		"\u066b\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u0673\5T+\2\u066d\u0673\7\t\2"+
		"\2\u066e\u0670\7B\2\2\u066f\u066e\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0671"+
		"\3\2\2\2\u0671\u0673\5\u009cO\2\u0672\u066a\3\2\2\2\u0672\u066d\3\2\2"+
		"\2\u0672\u066f\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0676"+
		"\7\6\2\2\u0675\u0677\5n8\2\u0676\u0675\3\2\2\2\u0676\u0677\3\2\2\2\u0677"+
		"\u067c\3\2\2\2\u0678\u067a\7#\2\2\u0679\u0678\3\2\2\2\u0679\u067a\3\2"+
		"\2\2\u067a\u067b\3\2\2\2\u067b\u067d\5\u0094K\2\u067c\u0679\3\2\2\2\u067c"+
		"\u067d\3\2\2\2\u067d\u009b\3\2\2\2\u067e\u067f\5\u00acW\2\u067f\u068c"+
		"\7\5\2\2\u0680\u0682\7B\2\2\u0681\u0680\3\2\2\2\u0681\u0682\3\2\2\2\u0682"+
		"\u0683\3\2\2\2\u0683\u0688\5T+\2\u0684\u0685\7\7\2\2\u0685\u0687\5T+\2"+
		"\u0686\u0684\3\2\2\2\u0687\u068a\3\2\2\2\u0688\u0686\3\2\2\2\u0688\u0689"+
		"\3\2\2\2\u0689\u068d\3\2\2\2\u068a\u0688\3\2\2\2\u068b\u068d\7\t\2\2\u068c"+
		"\u0681\3\2\2\2\u068c\u068b\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068e\3\2"+
		"\2\2\u068e\u0690\7\6\2\2\u068f\u0691\5n8\2\u0690\u068f\3\2\2\2\u0690\u0691"+
		"\3\2\2\2\u0691\u0696\3\2\2\2\u0692\u0694\7#\2\2\u0693\u0692\3\2\2\2\u0693"+
		"\u0694\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0697\5\u0094K\2\u0696\u0693"+
		"\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u009d\3\2\2\2\u0698\u0699\7\"\2\2\u0699"+
		"\u009f\3\2\2\2\u069a\u069b\7u\2\2\u069b\u00a1\3\2\2\2\u069c\u069d\t\25"+
		"\2\2\u069d\u00a3\3\2\2\2\u069e\u069f\7n\2\2\u069f\u00a5\3\2\2\2\u06a0"+
		"\u06a1\7Y\2\2\u06a1\u00a7\3\2\2\2\u06a2\u06a3\7h\2\2\u06a3\u00a9\3\2\2"+
		"\2\u06a4\u06a5\7B\2\2\u06a5\u00ab\3\2\2\2\u06a6\u06a7\5\u00ccg\2\u06a7"+
		"\u00ad\3\2\2\2\u06a8\u06a9\5\u00ccg\2\u06a9\u00af\3\2\2\2\u06aa\u06ab"+
		"\5\u00ccg\2\u06ab\u00b1\3\2\2\2\u06ac\u06ad\5\u00ccg\2\u06ad\u00b3\3\2"+
		"\2\2\u06ae\u06af\5\u00ccg\2\u06af\u00b5\3\2\2\2\u06b0\u06b1\5\u00ccg\2"+
		"\u06b1\u00b7\3\2\2\2\u06b2\u06b3\5\u00ccg\2\u06b3\u00b9\3\2\2\2\u06b4"+
		"\u06b5\5\u00ccg\2\u06b5\u00bb\3\2\2\2\u06b6\u06b7\5\u00ccg\2\u06b7\u00bd"+
		"\3\2\2\2\u06b8\u06b9\5\u00ccg\2\u06b9\u00bf\3\2\2\2\u06ba\u06bb\5\u00cc"+
		"g\2\u06bb\u00c1\3\2\2\2\u06bc\u06bd\5\u00ccg\2\u06bd\u00c3\3\2\2\2\u06be"+
		"\u06bf\5\u00ccg\2\u06bf\u00c5\3\2\2\2\u06c0\u06c1\5\u00ccg\2\u06c1\u00c7"+
		"\3\2\2\2\u06c2\u06c3\5\u00ccg\2\u06c3\u00c9\3\2\2\2\u06c4\u06c5\5\u00cc"+
		"g\2\u06c5\u00cb\3\2\2\2\u06c6\u06ce\7\u00a0\2\2\u06c7\u06ce\5\u0096L\2"+
		"\u06c8\u06ce\7\u00a3\2\2\u06c9\u06ca\7\5\2\2\u06ca\u06cb\5\u00ccg\2\u06cb"+
		"\u06cc\7\6\2\2\u06cc\u06ce\3\2\2\2\u06cd\u06c6\3\2\2\2\u06cd\u06c7\3\2"+
		"\2\2\u06cd\u06c8\3\2\2\2\u06cd\u06c9\3\2\2\2\u06ce\u00cd\3\2\2\2\u06cf"+
		"\u06d1\13\2\2\2\u06d0\u06cf\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d0\3"+
		"\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u00cf\3\2\2\2\u00f1\u00d2\u00d4\u00e0"+
		"\u00e6\u00ec\u00ee\u010d\u0118\u0120\u0123\u012c\u0130\u0138\u013c\u013e"+
		"\u0143\u0145\u0149\u0150\u0153\u015b\u0164\u0167\u016d\u016f\u0173\u0179"+
		"\u017e\u0189\u018f\u0193\u0199\u019e\u01a7\u01ae\u01b4\u01b8\u01bc\u01c2"+
		"\u01c7\u01ce\u01d9\u01dc\u01de\u01e4\u01ea\u01ee\u01f5\u01fb\u0201\u0207"+
		"\u020c\u0218\u021d\u0228\u022d\u0230\u0236\u0239\u023f\u0248\u024b\u0251"+
		"\u0253\u025a\u0262\u0267\u026f\u0274\u027c\u0281\u0289\u028e\u0293\u02a6"+
		"\u02ac\u02b5\u02ba\u02c3\u02ce\u02d5\u02db\u02e1\u02ea\u02f1\u02f5\u02f7"+
		"\u02fb\u0302\u0304\u0308\u030b\u0312\u0319\u031c\u0326\u0329\u032f\u0331"+
		"\u033b\u033e\u0344\u0346\u0349\u0356\u0364\u0369\u036c\u0379\u0387\u038c"+
		"\u0395\u0398\u039e\u03a0\u03a6\u03ab\u03b1\u03bd\u03c1\u03c6\u03ca\u03cd"+
		"\u03df\u03e4\u03e9\u0400\u0403\u040b\u0414\u0418\u041d\u0439\u043e\u044a"+
		"\u0450\u0457\u045b\u0465\u0468\u046e\u0471\u0473\u0475\u047c\u0481\u0485"+
		"\u0488\u048a\u0490\u0495\u0499\u049c\u049f\u04a1\u04a7\u04ac\u04af\u04bd"+
		"\u04c7\u04cc\u04d8\u04dc\u04e0\u04e4\u04eb\u04ed\u04f5\u04fc\u04ff\u0503"+
		"\u0508\u0510\u0523\u0529\u052d\u053d\u0543\u054b\u0550\u0553\u0558\u0561"+
		"\u0566\u0575\u057a\u057f\u0582\u0585\u0597\u059b\u059e\u05a5\u05ae\u05b2"+
		"\u05b6\u05b9\u05bf\u05c2\u05c4\u05cd\u05d2\u05d6\u05da\u05dd\u05e8\u05ed"+
		"\u05f1\u05f8\u05fc\u0600\u0609\u060e\u0610\u0619\u0624\u062b\u062e\u0636"+
		"\u063a\u0642\u064b\u0650\u0653\u065f\u066a\u066f\u0672\u0676\u0679\u067c"+
		"\u0681\u0688\u068c\u0690\u0693\u0696\u06cd\u06d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}