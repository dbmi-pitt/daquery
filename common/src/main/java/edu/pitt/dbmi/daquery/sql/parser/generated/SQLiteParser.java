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
		K_CURRENT_TIMESTAMP=55, K_DATABASE=56, K_DATESHIFT=57, K_DAY=58, K_DEFAULT=59, 
		K_DEFERRABLE=60, K_DEFERRED=61, K_DELETE=62, K_DESC=63, K_DETACH=64, K_DISTINCT=65, 
		K_DROP=66, K_EACH=67, K_ELSE=68, K_END=69, K_ESCAPE=70, K_EXCEPT=71, K_EXCLUSIVE=72, 
		K_EXISTS=73, K_EXPLAIN=74, K_EXTRACT=75, K_FALSE=76, K_FAIL=77, K_FOR=78, 
		K_FOREIGN=79, K_FROM=80, K_FULL=81, K_GLOB=82, K_GROUP=83, K_HAVING=84, 
		K_HOUR=85, K_IF=86, K_IDENTIFIABLE=87, K_IGNORE=88, K_IMMEDIATE=89, K_IN=90, 
		K_INDEX=91, K_INDEXED=92, K_INITIALLY=93, K_INNER=94, K_INSERT=95, K_INSTEAD=96, 
		K_INTERSECT=97, K_INTO=98, K_IS=99, K_ISBIRTHDATE=100, K_ISID=101, K_ISNULL=102, 
		K_ISZIPCODE=103, K_JOIN=104, K_KEY=105, K_LEFT=106, K_LIKE=107, K_LIMIT=108, 
		K_MATCH=109, K_MINUS=110, K_MINUTE=111, K_MONTH=112, K_NATURAL=113, K_NO=114, 
		K_NOT=115, K_NOTIDENTIFIABLE=116, K_NOTNULL=117, K_NULL=118, K_OF=119, 
		K_OFFSET=120, K_OBFUSCATE=121, K_ON=122, K_OR=123, K_ORDER=124, K_OUTER=125, 
		K_PLAN=126, K_PRAGMA=127, K_PRIMARY=128, K_QUERY=129, K_RAISE=130, K_RECURSIVE=131, 
		K_REFERENCES=132, K_REGEXP=133, K_REINDEX=134, K_RELEASE=135, K_RENAME=136, 
		K_REPLACE=137, K_RESTRICT=138, K_RIGHT=139, K_ROLLBACK=140, K_ROW=141, 
		K_SAVEPOINT=142, K_SECOND=143, K_SELECT=144, K_SET=145, K_TABLE=146, K_TEMP=147, 
		K_TEMPORARY=148, K_THEN=149, K_TIMEZONE_ABBR=150, K_TIMEZONE_HOUR=151, 
		K_TIMEZONE_MINUTE=152, K_TIMEZONE_REGION=153, K_TO=154, K_TRACKED=155, 
		K_TRANSACTION=156, K_TRIGGER=157, K_TRUE=158, K_UNION=159, K_UNIQUE=160, 
		K_UPDATE=161, K_USING=162, K_VACUUM=163, K_VALUES=164, K_VIEW=165, K_VIRTUAL=166, 
		K_WHEN=167, K_WHERE=168, K_WITH=169, K_WITHOUT=170, K_YEAR=171, IDENTIFIER=172, 
		NUMERIC_LITERAL=173, BIND_PARAMETER=174, STRING_LITERAL=175, BLOB_LITERAL=176, 
		SINGLE_LINE_COMMENT=177, MULTILINE_COMMENT=178, SPACES=179, UNEXPECTED_CHAR=180, 
		K_OFFUSCATE=181;
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
		RULE_savepoint_stmt = 29, RULE_with_select_stmt = 30, RULE_final_with_select_stmt = 31, 
		RULE_select_stmt = 32, RULE_update_stmt = 33, RULE_update_stmt_limited = 34, 
		RULE_vacuum_stmt = 35, RULE_column_def = 36, RULE_type_name = 37, RULE_column_constraint = 38, 
		RULE_conflict_clause = 39, RULE_any_result_column_expr = 40, RULE_expr = 41, 
		RULE_dbColumnExpr = 42, RULE_result_column_expr = 43, RULE_comparison_operator = 44, 
		RULE_foreign_key_clause = 45, RULE_raise_function = 46, RULE_indexed_column = 47, 
		RULE_table_constraint = 48, RULE_with_clause = 49, RULE_qualified_table_name = 50, 
		RULE_ordering_term = 51, RULE_pragma_value = 52, RULE_common_table_expression = 53, 
		RULE_result_column = 54, RULE_deid_tag = 55, RULE_ident_prop = 56, RULE_is_zip_prop = 57, 
		RULE_id_field_prop = 58, RULE_date_shift_field_prop = 59, RULE_tracking_column_expr = 60, 
		RULE_is_birthdate_prop = 61, RULE_obfuscate_field_prop = 62, RULE_from_table_spec = 63, 
		RULE_table_or_subquery = 64, RULE_join_clause = 65, RULE_join_operator = 66, 
		RULE_join_constraint = 67, RULE_select_core = 68, RULE_multi_from_clause = 69, 
		RULE_set_operator = 70, RULE_cte_table_name = 71, RULE_signed_number = 72, 
		RULE_literal_value = 73, RULE_unary_operator = 74, RULE_error_message = 75, 
		RULE_module_argument = 76, RULE_column_alias = 77, RULE_keyword = 78, 
		RULE_name = 79, RULE_result_count_function = 80, RULE_count_funct = 81, 
		RULE_any_result_function = 82, RULE_any_funct = 83, RULE_math_expr = 84, 
		RULE_and_keyword = 85, RULE_or_keyword = 86, RULE_and_or = 87, RULE_not_keyword = 88, 
		RULE_in_keyword = 89, RULE_like_keyword = 90, RULE_distinct_keyword = 91, 
		RULE_function_name = 92, RULE_database_name = 93, RULE_with_name = 94, 
		RULE_table_name = 95, RULE_table_or_index_name = 96, RULE_new_table_name = 97, 
		RULE_column_name = 98, RULE_collation_name = 99, RULE_foreign_table = 100, 
		RULE_index_name = 101, RULE_trigger_name = 102, RULE_view_name = 103, 
		RULE_module_name = 104, RULE_pragma_name = 105, RULE_savepoint_name = 106, 
		RULE_table_alias = 107, RULE_transaction_name = 108, RULE_any_name = 109, 
		RULE_anything_at_all = 110;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "end_of_select", "alter_table_stmt", 
		"analyze_stmt", "attach_stmt", "begin_stmt", "commit_stmt", "select_set", 
		"create_index_stmt", "create_table_stmt", "create_trigger_stmt", "create_view_stmt", 
		"create_virtual_table_stmt", "delete_stmt", "delete_stmt_limited", "single_from_clause", 
		"detach_stmt", "drop_index_stmt", "drop_table_stmt", "drop_trigger_stmt", 
		"drop_view_stmt", "insert_stmt", "pragma_stmt", "reindex_stmt", "release_stmt", 
		"rollback_stmt", "savepoint_stmt", "with_select_stmt", "final_with_select_stmt", 
		"select_stmt", "update_stmt", "update_stmt_limited", "vacuum_stmt", "column_def", 
		"type_name", "column_constraint", "conflict_clause", "any_result_column_expr", 
		"expr", "dbColumnExpr", "result_column_expr", "comparison_operator", "foreign_key_clause", 
		"raise_function", "indexed_column", "table_constraint", "with_clause", 
		"qualified_table_name", "ordering_term", "pragma_value", "common_table_expression", 
		"result_column", "deid_tag", "ident_prop", "is_zip_prop", "id_field_prop", 
		"date_shift_field_prop", "tracking_column_expr", "is_birthdate_prop", 
		"obfuscate_field_prop", "from_table_spec", "table_or_subquery", "join_clause", 
		"join_operator", "join_constraint", "select_core", "multi_from_clause", 
		"set_operator", "cte_table_name", "signed_number", "literal_value", "unary_operator", 
		"error_message", "module_argument", "column_alias", "keyword", "name", 
		"result_count_function", "count_funct", "any_result_function", "any_funct", 
		"math_expr", "and_keyword", "or_keyword", "and_or", "not_keyword", "in_keyword", 
		"like_keyword", "distinct_keyword", "function_name", "database_name", 
		"with_name", "table_name", "table_or_index_name", "new_table_name", "column_name", 
		"collation_name", "foreign_table", "index_name", "trigger_name", "view_name", 
		"module_name", "pragma_name", "savepoint_name", "table_alias", "transaction_name", 
		"any_name", "anything_at_all"
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
		"K_DATABASE", "K_DATESHIFT", "K_DAY", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", 
		"K_DELETE", "K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", 
		"K_END", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", 
		"K_EXTRACT", "K_FALSE", "K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", 
		"K_GLOB", "K_GROUP", "K_HAVING", "K_HOUR", "K_IF", "K_IDENTIFIABLE", "K_IGNORE", 
		"K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", 
		"K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISBIRTHDATE", 
		"K_ISID", "K_ISNULL", "K_ISZIPCODE", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", 
		"K_LIMIT", "K_MATCH", "K_MINUS", "K_MINUTE", "K_MONTH", "K_NATURAL", "K_NO", 
		"K_NOT", "K_NOTIDENTIFIABLE", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", 
		"K_OBFUSCATE", "K_ON", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", 
		"K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", "K_REGEXP", 
		"K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", "K_RIGHT", 
		"K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SECOND", "K_SELECT", "K_SET", 
		"K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TIMEZONE_ABBR", "K_TIMEZONE_HOUR", 
		"K_TIMEZONE_MINUTE", "K_TIMEZONE_REGION", "K_TO", "K_TRACKED", "K_TRANSACTION", 
		"K_TRIGGER", "K_TRUE", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", 
		"K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", 
		"K_YEAR", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
		"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
		"UNEXPECTED_CHAR", "K_OFFUSCATE"
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
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DETACH - 64)) | (1L << (K_DROP - 64)) | (1L << (K_END - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_PRAGMA - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (K_REINDEX - 134)) | (1L << (K_RELEASE - 134)) | (1L << (K_REPLACE - 134)) | (1L << (K_ROLLBACK - 134)) | (1L << (K_SAVEPOINT - 134)) | (1L << (K_SELECT - 134)) | (1L << (K_UPDATE - 134)) | (1L << (K_VACUUM - 134)) | (1L << (K_VALUES - 134)) | (1L << (K_WITH - 134)) | (1L << (UNEXPECTED_CHAR - 134)))) != 0)) {
				{
				setState(224);
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
					setState(222);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(223);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
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
			setState(231);
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
			setState(234);
			sql_stmt();
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(235);
					sql_stmt();
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					anything_at_all();
					}
					} 
				}
				setState(246);
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
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(247);
				match(K_EXPLAIN);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(248);
					match(K_QUERY);
					setState(249);
					match(K_PLAN);
					}
				}

				}
			}

			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(254);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(255);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(256);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(257);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(258);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(259);
				create_index_stmt();
				}
				break;
			case 7:
				{
				setState(260);
				create_table_stmt();
				}
				break;
			case 8:
				{
				setState(261);
				create_trigger_stmt();
				}
				break;
			case 9:
				{
				setState(262);
				create_view_stmt();
				}
				break;
			case 10:
				{
				setState(263);
				create_virtual_table_stmt();
				}
				break;
			case 11:
				{
				setState(264);
				delete_stmt();
				}
				break;
			case 12:
				{
				setState(265);
				delete_stmt_limited();
				}
				break;
			case 13:
				{
				setState(266);
				detach_stmt();
				}
				break;
			case 14:
				{
				setState(267);
				drop_index_stmt();
				}
				break;
			case 15:
				{
				setState(268);
				drop_table_stmt();
				}
				break;
			case 16:
				{
				setState(269);
				drop_trigger_stmt();
				}
				break;
			case 17:
				{
				setState(270);
				drop_view_stmt();
				}
				break;
			case 18:
				{
				setState(271);
				insert_stmt();
				}
				break;
			case 19:
				{
				setState(272);
				pragma_stmt();
				}
				break;
			case 20:
				{
				setState(273);
				reindex_stmt();
				}
				break;
			case 21:
				{
				setState(274);
				release_stmt();
				}
				break;
			case 22:
				{
				setState(275);
				rollback_stmt();
				}
				break;
			case 23:
				{
				setState(276);
				savepoint_stmt();
				}
				break;
			case 24:
				{
				setState(277);
				select_set();
				}
				break;
			case 25:
				{
				setState(278);
				select_stmt();
				}
				break;
			case 26:
				{
				setState(279);
				update_stmt();
				}
				break;
			case 27:
				{
				setState(280);
				update_stmt_limited();
				}
				break;
			case 28:
				{
				setState(281);
				vacuum_stmt();
				}
				break;
			case 29:
				{
				setState(282);
				with_select_stmt();
				}
				break;
			}
			setState(285);
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
			setState(287);
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
			setState(289);
			match(K_ALTER);
			setState(290);
			match(K_TABLE);
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(291);
				database_name();
				setState(292);
				match(DOT);
				}
				break;
			}
			setState(296);
			table_name();
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(297);
				match(K_RENAME);
				setState(298);
				match(K_TO);
				setState(299);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(300);
				match(K_ADD);
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(301);
					match(K_COLUMN);
					}
					break;
				}
				setState(304);
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
			setState(307);
			match(K_ANALYZE);
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(308);
				database_name();
				}
				break;
			case 2:
				{
				setState(309);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(310);
				database_name();
				setState(311);
				match(DOT);
				setState(312);
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
			setState(316);
			match(K_ATTACH);
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(317);
				match(K_DATABASE);
				}
				break;
			}
			setState(320);
			expr(0);
			setState(321);
			match(K_AS);
			setState(322);
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
			setState(324);
			match(K_BEGIN);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (K_DEFERRED - 61)) | (1L << (K_EXCLUSIVE - 61)) | (1L << (K_IMMEDIATE - 61)))) != 0)) {
				{
				setState(325);
				_la = _input.LA(1);
				if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (K_DEFERRED - 61)) | (1L << (K_EXCLUSIVE - 61)) | (1L << (K_IMMEDIATE - 61)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(328);
				match(K_TRANSACTION);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DAY) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_EXTRACT - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_HOUR - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISBIRTHDATE - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_ISZIPCODE - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_MINUTE - 64)) | (1L << (K_MONTH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTIDENTIFIABLE - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SECOND - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TIMEZONE_ABBR - 128)) | (1L << (K_TIMEZONE_HOUR - 128)) | (1L << (K_TIMEZONE_MINUTE - 128)) | (1L << (K_TIMEZONE_REGION - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRACKED - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_YEAR - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) {
					{
					setState(329);
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
			setState(334);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(335);
				match(K_TRANSACTION);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DAY) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_EXTRACT - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_HOUR - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISBIRTHDATE - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_ISZIPCODE - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_MINUTE - 64)) | (1L << (K_MONTH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTIDENTIFIABLE - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SECOND - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TIMEZONE_ABBR - 128)) | (1L << (K_TIMEZONE_HOUR - 128)) | (1L << (K_TIMEZONE_MINUTE - 128)) | (1L << (K_TIMEZONE_REGION - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRACKED - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_YEAR - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) {
					{
					setState(336);
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
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(341);
				match(K_WITH);
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(342);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(345);
				common_table_expression();
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(346);
					match(COMMA);
					setState(347);
					common_table_expression();
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(355);
			select_core();
			setState(359); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(356);
				set_operator();
				setState(357);
				select_core();
				}
				}
				setState(361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_EXCEPT - 71)) | (1L << (K_INTERSECT - 71)) | (1L << (K_MINUS - 71)))) != 0) || _la==K_UNION );
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(363);
				match(K_ORDER);
				setState(364);
				match(K_BY);
				setState(365);
				ordering_term();
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(366);
					match(COMMA);
					setState(367);
					ordering_term();
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(375);
				match(K_LIMIT);
				setState(376);
				expr(0);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(377);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(378);
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
			setState(383);
			match(K_CREATE);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(384);
				match(K_UNIQUE);
				}
			}

			setState(387);
			match(K_INDEX);
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(388);
				match(K_IF);
				setState(389);
				match(K_NOT);
				setState(390);
				match(K_EXISTS);
				}
				break;
			}
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(393);
				database_name();
				setState(394);
				match(DOT);
				}
				break;
			}
			setState(398);
			index_name();
			setState(399);
			match(K_ON);
			setState(400);
			table_name();
			setState(401);
			match(OPEN_PAR);
			setState(402);
			indexed_column();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(403);
				match(COMMA);
				setState(404);
				indexed_column();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			match(CLOSE_PAR);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(411);
				match(K_WHERE);
				setState(412);
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
			setState(415);
			match(K_CREATE);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(416);
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

			setState(419);
			match(K_TABLE);
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(420);
				match(K_IF);
				setState(421);
				match(K_NOT);
				setState(422);
				match(K_EXISTS);
				}
				break;
			}
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(425);
				database_name();
				setState(426);
				match(DOT);
				}
				break;
			}
			setState(430);
			table_name();
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(431);
				match(OPEN_PAR);
				setState(432);
				column_def();
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(433);
						match(COMMA);
						setState(434);
						column_def();
						}
						} 
					}
					setState(439);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(440);
					match(COMMA);
					setState(441);
					table_constraint();
					}
					}
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(447);
				match(CLOSE_PAR);
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(448);
					match(K_WITHOUT);
					setState(449);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(452);
				match(K_AS);
				setState(453);
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
			setState(456);
			match(K_CREATE);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(457);
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

			setState(460);
			match(K_TRIGGER);
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(461);
				match(K_IF);
				setState(462);
				match(K_NOT);
				setState(463);
				match(K_EXISTS);
				}
				break;
			}
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
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
			trigger_name();
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(472);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(473);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(474);
				match(K_INSTEAD);
				setState(475);
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
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(478);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(479);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(480);
				match(K_UPDATE);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(481);
					match(K_OF);
					setState(482);
					column_name();
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(483);
						match(COMMA);
						setState(484);
						column_name();
						}
						}
						setState(489);
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
			setState(494);
			match(K_ON);
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(495);
				database_name();
				setState(496);
				match(DOT);
				}
				break;
			}
			setState(500);
			table_name();
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(501);
				match(K_FOR);
				setState(502);
				match(K_EACH);
				setState(503);
				match(K_ROW);
				}
			}

			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(506);
				match(K_WHEN);
				setState(507);
				expr(0);
				}
			}

			setState(510);
			match(K_BEGIN);
			setState(519); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(511);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(512);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(513);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(514);
					select_stmt();
					}
					break;
				}
				setState(517);
				match(SCOL);
				}
				}
				setState(521); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || _la==K_INSERT || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_REPLACE - 137)) | (1L << (K_SELECT - 137)) | (1L << (K_UPDATE - 137)) | (1L << (K_VALUES - 137)) | (1L << (K_WITH - 137)))) != 0) );
			setState(523);
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
			setState(525);
			match(K_CREATE);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(526);
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

			setState(529);
			match(K_VIEW);
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(530);
				match(K_IF);
				setState(531);
				match(K_NOT);
				setState(532);
				match(K_EXISTS);
				}
				break;
			}
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(535);
				database_name();
				setState(536);
				match(DOT);
				}
				break;
			}
			setState(540);
			view_name();
			setState(541);
			match(K_AS);
			setState(542);
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
			setState(544);
			match(K_CREATE);
			setState(545);
			match(K_VIRTUAL);
			setState(546);
			match(K_TABLE);
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(547);
				match(K_IF);
				setState(548);
				match(K_NOT);
				setState(549);
				match(K_EXISTS);
				}
				break;
			}
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(552);
				database_name();
				setState(553);
				match(DOT);
				}
				break;
			}
			setState(557);
			table_name();
			setState(558);
			match(K_USING);
			setState(559);
			module_name();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(560);
				match(OPEN_PAR);
				setState(561);
				module_argument();
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(562);
					match(COMMA);
					setState(563);
					module_argument();
					}
					}
					setState(568);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(569);
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
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(573);
				with_clause();
				}
			}

			setState(576);
			match(K_DELETE);
			setState(577);
			single_from_clause();
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(578);
				match(K_WHERE);
				setState(579);
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
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(582);
				with_clause();
				}
			}

			setState(585);
			match(K_DELETE);
			setState(586);
			single_from_clause();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(587);
				match(K_WHERE);
				setState(588);
				expr(0);
				}
			}

			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(591);
					match(K_ORDER);
					setState(592);
					match(K_BY);
					setState(593);
					ordering_term();
					setState(598);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(594);
						match(COMMA);
						setState(595);
						ordering_term();
						}
						}
						setState(600);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(603);
				match(K_LIMIT);
				setState(604);
				expr(0);
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(605);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(606);
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
			setState(611);
			match(K_FROM);
			setState(612);
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
			setState(614);
			match(K_DETACH);
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(615);
				match(K_DATABASE);
				}
				break;
			}
			setState(618);
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
			setState(620);
			match(K_DROP);
			setState(621);
			match(K_INDEX);
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(622);
				match(K_IF);
				setState(623);
				match(K_EXISTS);
				}
				break;
			}
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(626);
				database_name();
				setState(627);
				match(DOT);
				}
				break;
			}
			setState(631);
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
			setState(633);
			match(K_DROP);
			setState(634);
			match(K_TABLE);
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(635);
				match(K_IF);
				setState(636);
				match(K_EXISTS);
				}
				break;
			}
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(639);
				database_name();
				setState(640);
				match(DOT);
				}
				break;
			}
			setState(644);
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
			setState(646);
			match(K_DROP);
			setState(647);
			match(K_TRIGGER);
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(648);
				match(K_IF);
				setState(649);
				match(K_EXISTS);
				}
				break;
			}
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(652);
				database_name();
				setState(653);
				match(DOT);
				}
				break;
			}
			setState(657);
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
			setState(659);
			match(K_DROP);
			setState(660);
			match(K_VIEW);
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(661);
				match(K_IF);
				setState(662);
				match(K_EXISTS);
				}
				break;
			}
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(665);
				database_name();
				setState(666);
				match(DOT);
				}
				break;
			}
			setState(670);
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
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(672);
				with_clause();
				}
			}

			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(675);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(676);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(677);
				match(K_INSERT);
				setState(678);
				match(K_OR);
				setState(679);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(680);
				match(K_INSERT);
				setState(681);
				match(K_OR);
				setState(682);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(683);
				match(K_INSERT);
				setState(684);
				match(K_OR);
				setState(685);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(686);
				match(K_INSERT);
				setState(687);
				match(K_OR);
				setState(688);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(689);
				match(K_INSERT);
				setState(690);
				match(K_OR);
				setState(691);
				match(K_IGNORE);
				}
				break;
			}
			setState(694);
			match(K_INTO);
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(695);
				database_name();
				setState(696);
				match(DOT);
				}
				break;
			}
			setState(700);
			table_name();
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(701);
				match(OPEN_PAR);
				setState(702);
				column_name();
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(703);
					match(COMMA);
					setState(704);
					column_name();
					}
					}
					setState(709);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(710);
				match(CLOSE_PAR);
				}
			}

			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(714);
				match(K_VALUES);
				setState(715);
				match(OPEN_PAR);
				setState(716);
				expr(0);
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(717);
					match(COMMA);
					setState(718);
					expr(0);
					}
					}
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(724);
				match(CLOSE_PAR);
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(725);
					match(COMMA);
					setState(726);
					match(OPEN_PAR);
					setState(727);
					expr(0);
					setState(732);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(728);
						match(COMMA);
						setState(729);
						expr(0);
						}
						}
						setState(734);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(735);
					match(CLOSE_PAR);
					}
					}
					setState(741);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(742);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(743);
				match(K_DEFAULT);
				setState(744);
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
			setState(747);
			match(K_PRAGMA);
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(748);
				database_name();
				setState(749);
				match(DOT);
				}
				break;
			}
			setState(753);
			pragma_name();
			setState(760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(754);
				match(ASSIGN);
				setState(755);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(756);
				match(OPEN_PAR);
				setState(757);
				pragma_value();
				setState(758);
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
			setState(762);
			match(K_REINDEX);
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(763);
				collation_name();
				}
				break;
			case 2:
				{
				setState(767);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(764);
					database_name();
					setState(765);
					match(DOT);
					}
					break;
				}
				setState(771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(769);
					table_name();
					}
					break;
				case 2:
					{
					setState(770);
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
			setState(775);
			match(K_RELEASE);
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(776);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(779);
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
			setState(781);
			match(K_ROLLBACK);
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(782);
				match(K_TRANSACTION);
				setState(784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(783);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(788);
				match(K_TO);
				setState(790);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(789);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(792);
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
			setState(795);
			match(K_SAVEPOINT);
			setState(796);
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
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<With_nameContext> with_name() {
			return getRuleContexts(With_nameContext.class);
		}
		public With_nameContext with_name(int i) {
			return getRuleContext(With_nameContext.class,i);
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
		public Final_with_select_stmtContext final_with_select_stmt() {
			return getRuleContext(Final_with_select_stmtContext.class,0);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
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
			setState(798);
			match(K_WITH);
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(799);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(802);
			with_name();
			setState(803);
			match(K_AS);
			setState(804);
			match(OPEN_PAR);
			setState(805);
			select_stmt();
			setState(806);
			match(CLOSE_PAR);
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(807);
				match(COMMA);
				setState(808);
				with_name();
				setState(809);
				match(K_AS);
				setState(810);
				match(OPEN_PAR);
				setState(811);
				select_stmt();
				setState(812);
				match(CLOSE_PAR);
				}
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(819);
			final_with_select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Final_with_select_stmtContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Final_with_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_final_with_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFinal_with_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFinal_with_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFinal_with_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Final_with_select_stmtContext final_with_select_stmt() throws RecognitionException {
		Final_with_select_stmtContext _localctx = new Final_with_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_final_with_select_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
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
		enterRule(_localctx, 64, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			select_core();
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(824);
				match(K_ORDER);
				setState(825);
				match(K_BY);
				setState(826);
				ordering_term();
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(827);
					match(COMMA);
					setState(828);
					ordering_term();
					}
					}
					setState(833);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(836);
				match(K_LIMIT);
				setState(837);
				expr(0);
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(838);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(839);
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
		enterRule(_localctx, 66, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(844);
				with_clause();
				}
			}

			setState(847);
			match(K_UPDATE);
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(848);
				match(K_OR);
				setState(849);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(850);
				match(K_OR);
				setState(851);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(852);
				match(K_OR);
				setState(853);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(854);
				match(K_OR);
				setState(855);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(856);
				match(K_OR);
				setState(857);
				match(K_IGNORE);
				}
				break;
			}
			setState(860);
			qualified_table_name();
			setState(861);
			match(K_SET);
			setState(862);
			column_name();
			setState(863);
			match(ASSIGN);
			setState(864);
			expr(0);
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(865);
				match(COMMA);
				setState(866);
				column_name();
				setState(867);
				match(ASSIGN);
				setState(868);
				expr(0);
				}
				}
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(875);
				match(K_WHERE);
				setState(876);
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
		enterRule(_localctx, 68, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(879);
				with_clause();
				}
			}

			setState(882);
			match(K_UPDATE);
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(883);
				match(K_OR);
				setState(884);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(885);
				match(K_OR);
				setState(886);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(887);
				match(K_OR);
				setState(888);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(889);
				match(K_OR);
				setState(890);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(891);
				match(K_OR);
				setState(892);
				match(K_IGNORE);
				}
				break;
			}
			setState(895);
			qualified_table_name();
			setState(896);
			match(K_SET);
			setState(897);
			column_name();
			setState(898);
			match(ASSIGN);
			setState(899);
			expr(0);
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(900);
				match(COMMA);
				setState(901);
				column_name();
				setState(902);
				match(ASSIGN);
				setState(903);
				expr(0);
				}
				}
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(910);
				match(K_WHERE);
				setState(911);
				expr(0);
				}
			}

			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(914);
					match(K_ORDER);
					setState(915);
					match(K_BY);
					setState(916);
					ordering_term();
					setState(921);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(917);
						match(COMMA);
						setState(918);
						ordering_term();
						}
						}
						setState(923);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(926);
				match(K_LIMIT);
				setState(927);
				expr(0);
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(928);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(929);
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
		enterRule(_localctx, 70, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
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
		enterRule(_localctx, 72, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			column_name();
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(937);
				type_name();
				}
				break;
			}
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (K_NOT - 115)) | (1L << (K_NULL - 115)) | (1L << (K_PRIMARY - 115)) | (1L << (K_REFERENCES - 115)) | (1L << (K_UNIQUE - 115)))) != 0)) {
				{
				{
				setState(940);
				column_constraint();
				}
				}
				setState(945);
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
		enterRule(_localctx, 74, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(947); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(946);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(949); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(951);
				match(OPEN_PAR);
				setState(952);
				signed_number();
				setState(953);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(955);
				match(OPEN_PAR);
				setState(956);
				signed_number();
				setState(957);
				match(COMMA);
				setState(958);
				signed_number();
				setState(959);
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
		enterRule(_localctx, 76, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(963);
				match(K_CONSTRAINT);
				setState(964);
				name();
				}
			}

			setState(1000);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(967);
				match(K_PRIMARY);
				setState(968);
				match(K_KEY);
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(969);
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

				setState(972);
				conflict_clause();
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(973);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(976);
					match(K_NOT);
					}
				}

				setState(979);
				match(K_NULL);
				setState(980);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(981);
				match(K_UNIQUE);
				setState(982);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(983);
				match(K_CHECK);
				setState(984);
				match(OPEN_PAR);
				setState(985);
				expr(0);
				setState(986);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(988);
				match(K_DEFAULT);
				setState(995);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(989);
					signed_number();
					}
					break;
				case 2:
					{
					setState(990);
					literal_value();
					}
					break;
				case 3:
					{
					setState(991);
					match(OPEN_PAR);
					setState(992);
					expr(0);
					setState(993);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(997);
				match(K_COLLATE);
				setState(998);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(999);
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
		enterRule(_localctx, 78, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1002);
				match(K_ON);
				setState(1003);
				match(K_CONFLICT);
				setState(1004);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_FAIL - 77)) | (1L << (K_IGNORE - 77)) | (1L << (K_REPLACE - 77)) | (1L << (K_ROLLBACK - 77)))) != 0)) ) {
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

	public static class Any_result_column_exprContext extends ParserRuleContext {
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
		public List<Any_result_column_exprContext> any_result_column_expr() {
			return getRuleContexts(Any_result_column_exprContext.class);
		}
		public Any_result_column_exprContext any_result_column_expr(int i) {
			return getRuleContext(Any_result_column_exprContext.class,i);
		}
		public Count_functContext count_funct() {
			return getRuleContext(Count_functContext.class,0);
		}
		public Any_functContext any_funct() {
			return getRuleContext(Any_functContext.class,0);
		}
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
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
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
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
		public Any_result_column_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_result_column_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAny_result_column_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAny_result_column_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAny_result_column_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_result_column_exprContext any_result_column_expr() throws RecognitionException {
		return any_result_column_expr(0);
	}

	private Any_result_column_exprContext any_result_column_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Any_result_column_exprContext _localctx = new Any_result_column_exprContext(_ctx, _parentState);
		Any_result_column_exprContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_any_result_column_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1008);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1009);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1010);
				dbColumnExpr();
				}
				break;
			case 4:
				{
				setState(1011);
				unary_operator();
				setState(1012);
				any_result_column_expr(19);
				}
				break;
			case 5:
				{
				setState(1014);
				count_funct();
				}
				break;
			case 6:
				{
				setState(1015);
				any_funct();
				}
				break;
			case 7:
				{
				setState(1016);
				match(OPEN_PAR);
				setState(1017);
				any_result_column_expr(0);
				setState(1018);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1020);
				match(K_CAST);
				setState(1021);
				match(OPEN_PAR);
				setState(1022);
				any_result_column_expr(0);
				setState(1023);
				match(K_AS);
				setState(1024);
				type_name();
				setState(1025);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1027);
				match(K_CASE);
				setState(1029);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1028);
					any_result_column_expr(0);
					}
					break;
				}
				setState(1036); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1031);
					match(K_WHEN);
					setState(1032);
					any_result_column_expr(0);
					setState(1033);
					match(K_THEN);
					setState(1034);
					any_result_column_expr(0);
					}
					}
					setState(1038); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1040);
					match(K_ELSE);
					setState(1041);
					any_result_column_expr(0);
					}
				}

				setState(1044);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(1046);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1049);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1050);
						match(PIPE2);
						setState(1051);
						any_result_column_expr(19);
						}
						break;
					case 2:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1052);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1053);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1054);
						any_result_column_expr(18);
						}
						break;
					case 3:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1055);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1056);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1057);
						any_result_column_expr(17);
						}
						break;
					case 4:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1058);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1059);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1060);
						any_result_column_expr(16);
						}
						break;
					case 5:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1061);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1062);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1063);
						any_result_column_expr(15);
						}
						break;
					case 6:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1064);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						{
						setState(1065);
						comparison_operator();
						}
						setState(1066);
						any_result_column_expr(14);
						}
						break;
					case 7:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1068);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1069);
						and_or();
						setState(1070);
						any_result_column_expr(13);
						}
						break;
					case 8:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1072);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1073);
						match(K_IS);
						setState(1075);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
						case 1:
							{
							setState(1074);
							match(K_NOT);
							}
							break;
						}
						setState(1077);
						any_result_column_expr(5);
						}
						break;
					case 9:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1078);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1080);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1079);
							match(K_NOT);
							}
						}

						setState(1082);
						match(K_BETWEEN);
						setState(1083);
						any_result_column_expr(0);
						setState(1084);
						match(K_AND);
						setState(1085);
						any_result_column_expr(4);
						}
						break;
					case 10:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1087);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1088);
						match(K_COLLATE);
						setState(1089);
						collation_name();
						}
						break;
					case 11:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1090);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1092);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1091);
							match(K_NOT);
							}
						}

						setState(1094);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (K_GLOB - 82)) | (1L << (K_LIKE - 82)) | (1L << (K_MATCH - 82)) | (1L << (K_REGEXP - 82)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1095);
						any_result_column_expr(0);
						setState(1098);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
						case 1:
							{
							setState(1096);
							match(K_ESCAPE);
							setState(1097);
							any_result_column_expr(0);
							}
							break;
						}
						}
						break;
					case 12:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1100);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1105);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1101);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1102);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1103);
							match(K_NOT);
							setState(1104);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(1111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
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
		public Count_functContext count_funct() {
			return getRuleContext(Count_functContext.class,0);
		}
		public Any_functContext any_funct() {
			return getRuleContext(Any_functContext.class,0);
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
		public TerminalNode K_EXTRACT() { return getToken(SQLiteParser.K_EXTRACT, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_YEAR() { return getToken(SQLiteParser.K_YEAR, 0); }
		public TerminalNode K_MONTH() { return getToken(SQLiteParser.K_MONTH, 0); }
		public TerminalNode K_DAY() { return getToken(SQLiteParser.K_DAY, 0); }
		public TerminalNode K_HOUR() { return getToken(SQLiteParser.K_HOUR, 0); }
		public TerminalNode K_MINUTE() { return getToken(SQLiteParser.K_MINUTE, 0); }
		public TerminalNode K_SECOND() { return getToken(SQLiteParser.K_SECOND, 0); }
		public TerminalNode K_TIMEZONE_HOUR() { return getToken(SQLiteParser.K_TIMEZONE_HOUR, 0); }
		public TerminalNode K_TIMEZONE_MINUTE() { return getToken(SQLiteParser.K_TIMEZONE_MINUTE, 0); }
		public TerminalNode K_TIMEZONE_REGION() { return getToken(SQLiteParser.K_TIMEZONE_REGION, 0); }
		public TerminalNode K_TIMEZONE_ABBR() { return getToken(SQLiteParser.K_TIMEZONE_ABBR, 0); }
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
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1113);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1114);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1115);
				dbColumnExpr();
				}
				break;
			case 4:
				{
				setState(1116);
				unary_operator();
				setState(1117);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1119);
				count_funct();
				}
				break;
			case 6:
				{
				setState(1120);
				any_funct();
				}
				break;
			case 7:
				{
				setState(1121);
				match(OPEN_PAR);
				setState(1122);
				expr(0);
				setState(1123);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1125);
				match(K_CAST);
				setState(1126);
				match(OPEN_PAR);
				setState(1127);
				expr(0);
				setState(1128);
				match(K_AS);
				setState(1129);
				type_name();
				setState(1130);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1132);
						match(K_NOT);
						}
					}

					setState(1135);
					match(K_EXISTS);
					}
				}

				setState(1138);
				match(OPEN_PAR);
				setState(1139);
				select_stmt();
				setState(1140);
				match(CLOSE_PAR);
				}
				break;
			case 10:
				{
				setState(1142);
				match(K_CASE);
				setState(1144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1143);
					expr(0);
					}
					break;
				}
				setState(1151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1146);
					match(K_WHEN);
					setState(1147);
					expr(0);
					setState(1148);
					match(K_THEN);
					setState(1149);
					expr(0);
					}
					}
					setState(1153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1155);
					match(K_ELSE);
					setState(1156);
					expr(0);
					}
				}

				setState(1159);
				match(K_END);
				}
				break;
			case 11:
				{
				setState(1161);
				match(K_EXTRACT);
				setState(1162);
				match(OPEN_PAR);
				setState(1163);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DAY - 58)) | (1L << (K_HOUR - 58)) | (1L << (K_MINUTE - 58)) | (1L << (K_MONTH - 58)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (K_SECOND - 143)) | (1L << (K_TIMEZONE_ABBR - 143)) | (1L << (K_TIMEZONE_HOUR - 143)) | (1L << (K_TIMEZONE_MINUTE - 143)) | (1L << (K_TIMEZONE_REGION - 143)) | (1L << (K_YEAR - 143)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1164);
				match(K_FROM);
				setState(1165);
				expr(0);
				setState(1166);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
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
						switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
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
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (K_GLOB - 82)) | (1L << (K_LIKE - 82)) | (1L << (K_MATCH - 82)) | (1L << (K_REGEXP - 82)))) != 0)) ) {
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
						switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
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
						switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
						case 1:
							{
							setState(1233);
							match(OPEN_PAR);
							setState(1243);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
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
							switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
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
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
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
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1263);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
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
		enterRule(_localctx, 86, RULE_result_column_expr);
		int _la;
		try {
			setState(1300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1283);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
					case 1:
						{
						setState(1280);
						database_name();
						setState(1281);
						match(DOT);
						}
						break;
					}
					setState(1285);
					table_name();
					setState(1286);
					match(DOT);
					}
					break;
				}
				setState(1290);
				column_name();
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1291);
					deid_tag();
					}
				}

				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1295);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1294);
						match(K_AS);
						}
					}

					setState(1297);
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
		enterRule(_localctx, 88, RULE_comparison_operator);
		try {
			setState(1314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1302);
				match(ASSIGN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1303);
				match(EQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1304);
				match(NOT_EQ1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1305);
				match(NOT_EQ2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1306);
				match(K_IS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1307);
				match(K_IS);
				setState(1308);
				match(K_NOT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1309);
				in_keyword();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1310);
				like_keyword();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1311);
				match(K_GLOB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1312);
				match(K_MATCH);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1313);
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
		enterRule(_localctx, 90, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			match(K_REFERENCES);
			setState(1317);
			foreign_table();
			setState(1329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1318);
				match(OPEN_PAR);
				setState(1319);
				column_name();
				setState(1324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1320);
					match(COMMA);
					setState(1321);
					column_name();
					}
					}
					setState(1326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1327);
				match(CLOSE_PAR);
				}
			}

			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1345);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1331);
					match(K_ON);
					setState(1332);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1341);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
					case 1:
						{
						setState(1333);
						match(K_SET);
						setState(1334);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1335);
						match(K_SET);
						setState(1336);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1337);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1338);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1339);
						match(K_NO);
						setState(1340);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1343);
					match(K_MATCH);
					setState(1344);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1352);
					match(K_NOT);
					}
				}

				setState(1355);
				match(K_DEFERRABLE);
				setState(1360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1356);
					match(K_INITIALLY);
					setState(1357);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1358);
					match(K_INITIALLY);
					setState(1359);
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
		enterRule(_localctx, 92, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			match(K_RAISE);
			setState(1365);
			match(OPEN_PAR);
			setState(1370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1366);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1367);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1368);
				match(COMMA);
				setState(1369);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1372);
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
		enterRule(_localctx, 94, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			column_name();
			setState(1377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1375);
				match(K_COLLATE);
				setState(1376);
				collation_name();
				}
			}

			setState(1380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1379);
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
		enterRule(_localctx, 96, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1382);
				match(K_CONSTRAINT);
				setState(1383);
				name();
				}
			}

			setState(1422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1389);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1386);
					match(K_PRIMARY);
					setState(1387);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1388);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1391);
				match(OPEN_PAR);
				setState(1392);
				indexed_column();
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1393);
					match(COMMA);
					setState(1394);
					indexed_column();
					}
					}
					setState(1399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1400);
				match(CLOSE_PAR);
				setState(1401);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1403);
				match(K_CHECK);
				setState(1404);
				match(OPEN_PAR);
				setState(1405);
				expr(0);
				setState(1406);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1408);
				match(K_FOREIGN);
				setState(1409);
				match(K_KEY);
				setState(1410);
				match(OPEN_PAR);
				setState(1411);
				column_name();
				setState(1416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1412);
					match(COMMA);
					setState(1413);
					column_name();
					}
					}
					setState(1418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1419);
				match(CLOSE_PAR);
				setState(1420);
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
		enterRule(_localctx, 98, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			match(K_WITH);
			setState(1426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1425);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1428);
			cte_table_name();
			setState(1429);
			match(K_AS);
			setState(1430);
			match(OPEN_PAR);
			setState(1431);
			select_stmt();
			setState(1432);
			match(CLOSE_PAR);
			setState(1442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1433);
				match(COMMA);
				setState(1434);
				cte_table_name();
				setState(1435);
				match(K_AS);
				setState(1436);
				match(OPEN_PAR);
				setState(1437);
				select_stmt();
				setState(1438);
				match(CLOSE_PAR);
				}
				}
				setState(1444);
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
		enterRule(_localctx, 100, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1445);
				database_name();
				setState(1446);
				match(DOT);
				}
				break;
			}
			setState(1450);
			table_name();
			setState(1456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1451);
				match(K_INDEXED);
				setState(1452);
				match(K_BY);
				setState(1453);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1454);
				match(K_NOT);
				setState(1455);
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
		enterRule(_localctx, 102, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			expr(0);
			setState(1461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1459);
				match(K_COLLATE);
				setState(1460);
				collation_name();
				}
			}

			setState(1464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1463);
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
		enterRule(_localctx, 104, RULE_pragma_value);
		try {
			setState(1469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1466);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1468);
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
		enterRule(_localctx, 106, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			table_name();
			setState(1483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1472);
				match(OPEN_PAR);
				setState(1473);
				column_name();
				setState(1478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1474);
					match(COMMA);
					setState(1475);
					column_name();
					}
					}
					setState(1480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1481);
				match(CLOSE_PAR);
				}
			}

			setState(1485);
			match(K_AS);
			setState(1486);
			match(OPEN_PAR);
			setState(1487);
			select_stmt();
			setState(1488);
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
		public Result_count_functionContext result_count_function() {
			return getRuleContext(Result_count_functionContext.class,0);
		}
		public Any_result_functionContext any_result_function() {
			return getRuleContext(Any_result_functionContext.class,0);
		}
		public Any_result_column_exprContext any_result_column_expr() {
			return getRuleContext(Any_result_column_exprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
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
		enterRule(_localctx, 108, RULE_result_column);
		int _la;
		try {
			setState(1505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1490);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1491);
				table_name();
				setState(1492);
				match(DOT);
				setState(1493);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1495);
				result_column_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1496);
				result_count_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1497);
				any_result_function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1498);
				any_result_column_expr(0);
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1500);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1499);
						match(K_AS);
						}
					}

					setState(1502);
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

	public static class Deid_tagContext extends ParserRuleContext {
		public TerminalNode K_IDENTIFIABLE() { return getToken(SQLiteParser.K_IDENTIFIABLE, 0); }
		public Ident_propContext ident_prop() {
			return getRuleContext(Ident_propContext.class,0);
		}
		public TerminalNode K_NOTIDENTIFIABLE() { return getToken(SQLiteParser.K_NOTIDENTIFIABLE, 0); }
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
		enterRule(_localctx, 110, RULE_deid_tag);
		try {
			setState(1516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1507);
				match(LT);
				setState(1508);
				match(K_IDENTIFIABLE);
				setState(1510);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1509);
					ident_prop();
					}
					break;
				}
				setState(1512);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1513);
				match(LT);
				setState(1514);
				match(K_NOTIDENTIFIABLE);
				setState(1515);
				match(GT);
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
		public Is_zip_propContext is_zip_prop() {
			return getRuleContext(Is_zip_propContext.class,0);
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
		enterRule(_localctx, 112, RULE_ident_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ISID) {
				{
				setState(1518);
				id_field_prop();
				}
			}

			setState(1522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DATESHIFT) {
				{
				setState(1521);
				date_shift_field_prop();
				}
			}

			setState(1525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OBFUSCATE) {
				{
				setState(1524);
				obfuscate_field_prop();
				}
			}

			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ISZIPCODE) {
				{
				setState(1527);
				is_zip_prop();
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

	public static class Is_zip_propContext extends ParserRuleContext {
		public TerminalNode K_ISZIPCODE() { return getToken(SQLiteParser.K_ISZIPCODE, 0); }
		public Is_zip_propContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_zip_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIs_zip_prop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIs_zip_prop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIs_zip_prop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_zip_propContext is_zip_prop() throws RecognitionException {
		Is_zip_propContext _localctx = new Is_zip_propContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_is_zip_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			match(K_ISZIPCODE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 116, RULE_id_field_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			match(K_ISID);
			setState(1533);
			match(ASSIGN);
			setState(1534);
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
		public Is_birthdate_propContext is_birthdate_prop() {
			return getRuleContext(Is_birthdate_propContext.class,0);
		}
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
		enterRule(_localctx, 118, RULE_date_shift_field_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(K_DATESHIFT);
			setState(1538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ISBIRTHDATE) {
				{
				setState(1537);
				is_birthdate_prop();
				}
			}

			setState(1543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRACKED) {
				{
				setState(1540);
				match(K_TRACKED);
				setState(1541);
				match(K_BY);
				setState(1542);
				tracking_column_expr();
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
		enterRule(_localctx, 120, RULE_tracking_column_expr);
		try {
			setState(1557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1549);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
					case 1:
						{
						setState(1546);
						database_name();
						setState(1547);
						match(DOT);
						}
						break;
					}
					setState(1551);
					table_name();
					setState(1552);
					match(DOT);
					}
					break;
				}
				setState(1556);
				column_name();
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

	public static class Is_birthdate_propContext extends ParserRuleContext {
		public TerminalNode K_ISBIRTHDATE() { return getToken(SQLiteParser.K_ISBIRTHDATE, 0); }
		public Is_birthdate_propContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_birthdate_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIs_birthdate_prop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIs_birthdate_prop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIs_birthdate_prop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_birthdate_propContext is_birthdate_prop() throws RecognitionException {
		Is_birthdate_propContext _localctx = new Is_birthdate_propContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_is_birthdate_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			match(K_ISBIRTHDATE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 124, RULE_obfuscate_field_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			match(K_OBFUSCATE);
			setState(1564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1562);
				match(ASSIGN);
				setState(1563);
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

			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 126, RULE_from_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1566);
				database_name();
				setState(1567);
				match(DOT);
				}
				break;
			}
			setState(1571);
			table_name();
			setState(1576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1572);
					match(K_AS);
					}
					break;
				}
				setState(1575);
				table_alias();
				}
				break;
			}
			setState(1583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1578);
				match(K_INDEXED);
				setState(1579);
				match(K_BY);
				setState(1580);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1581);
				match(K_NOT);
				setState(1582);
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
		enterRule(_localctx, 128, RULE_table_or_subquery);
		int _la;
		try {
			setState(1614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1585);
				from_table_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1586);
				match(OPEN_PAR);
				setState(1596);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1587);
					table_or_subquery();
					setState(1592);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1588);
						match(COMMA);
						setState(1589);
						table_or_subquery();
						}
						}
						setState(1594);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1595);
					join_clause();
					}
					break;
				}
				setState(1598);
				match(CLOSE_PAR);
				setState(1603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1600);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
					case 1:
						{
						setState(1599);
						match(K_AS);
						}
						break;
					}
					setState(1602);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1605);
				match(OPEN_PAR);
				setState(1606);
				select_stmt();
				setState(1607);
				match(CLOSE_PAR);
				setState(1612);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1609);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
					case 1:
						{
						setState(1608);
						match(K_AS);
						}
						break;
					}
					setState(1611);
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
		enterRule(_localctx, 130, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			table_or_subquery();
			setState(1623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (K_INNER - 94)) | (1L << (K_JOIN - 94)) | (1L << (K_LEFT - 94)) | (1L << (K_NATURAL - 94)))) != 0)) {
				{
				{
				setState(1617);
				join_operator();
				setState(1618);
				table_or_subquery();
				setState(1619);
				join_constraint();
				}
				}
				setState(1625);
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
		enterRule(_localctx, 132, RULE_join_operator);
		int _la;
		try {
			setState(1639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1626);
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
				setState(1628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1627);
					match(K_NATURAL);
					}
				}

				setState(1636);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1630);
					match(K_LEFT);
					setState(1632);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1631);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1634);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1635);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1638);
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
		enterRule(_localctx, 134, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1641);
				match(K_ON);
				setState(1642);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1643);
				match(K_USING);
				setState(1644);
				match(OPEN_PAR);
				setState(1645);
				column_name();
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1646);
					match(COMMA);
					setState(1647);
					column_name();
					}
					}
					setState(1652);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1653);
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
		public List<DbColumnExprContext> dbColumnExpr() {
			return getRuleContexts(DbColumnExprContext.class);
		}
		public DbColumnExprContext dbColumnExpr(int i) {
			return getRuleContext(DbColumnExprContext.class,i);
		}
		public List<Any_functContext> any_funct() {
			return getRuleContexts(Any_functContext.class);
		}
		public Any_functContext any_funct(int i) {
			return getRuleContext(Any_functContext.class,i);
		}
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
		enterRule(_localctx, 136, RULE_select_core);
		int _la;
		try {
			setState(1726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1657);
				match(K_SELECT);
				setState(1659);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1658);
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
				setState(1661);
				result_column();
				setState(1666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1662);
					match(COMMA);
					setState(1663);
					result_column();
					}
					}
					setState(1668);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1669);
					multi_from_clause();
					}
				}

				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1672);
					match(K_WHERE);
					setState(1673);
					expr(0);
					}
				}

				setState(1696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1676);
					match(K_GROUP);
					setState(1677);
					match(K_BY);
					setState(1680);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
					case 1:
						{
						setState(1678);
						dbColumnExpr();
						}
						break;
					case 2:
						{
						setState(1679);
						any_funct();
						}
						break;
					}
					setState(1689);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1682);
						match(COMMA);
						setState(1685);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
						case 1:
							{
							setState(1683);
							dbColumnExpr();
							}
							break;
						case 2:
							{
							setState(1684);
							any_funct();
							}
							break;
						}
						}
						}
						setState(1691);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1694);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1692);
						match(K_HAVING);
						setState(1693);
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
				setState(1698);
				match(K_VALUES);
				setState(1699);
				match(OPEN_PAR);
				setState(1700);
				expr(0);
				setState(1705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1701);
					match(COMMA);
					setState(1702);
					expr(0);
					}
					}
					setState(1707);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1708);
				match(CLOSE_PAR);
				setState(1723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1709);
					match(COMMA);
					setState(1710);
					match(OPEN_PAR);
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
					setState(1719);
					match(CLOSE_PAR);
					}
					}
					setState(1725);
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
		enterRule(_localctx, 138, RULE_multi_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			match(K_FROM);
			setState(1738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1729);
				table_or_subquery();
				setState(1734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1730);
					match(COMMA);
					setState(1731);
					table_or_subquery();
					}
					}
					setState(1736);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1737);
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
		enterRule(_localctx, 140, RULE_set_operator);
		try {
			setState(1746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1740);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1741);
				match(K_UNION);
				setState(1742);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1743);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1744);
				match(K_EXCEPT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1745);
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
		enterRule(_localctx, 142, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			table_name();
			setState(1760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1749);
				match(OPEN_PAR);
				setState(1750);
				column_name();
				setState(1755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1751);
					match(COMMA);
					setState(1752);
					column_name();
					}
					}
					setState(1757);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1758);
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
		enterRule(_localctx, 144, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1762);
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

			setState(1765);
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
		enterRule(_localctx, 146, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (K_NULL - 118)) | (1L << (NUMERIC_LITERAL - 118)) | (1L << (STRING_LITERAL - 118)) | (1L << (BLOB_LITERAL - 118)))) != 0)) ) {
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
		enterRule(_localctx, 148, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
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
		enterRule(_localctx, 150, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
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
		enterRule(_localctx, 152, RULE_module_argument);
		try {
			setState(1775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1773);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1774);
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
		enterRule(_localctx, 154, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
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
		public TerminalNode K_DAY() { return getToken(SQLiteParser.K_DAY, 0); }
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
		public TerminalNode K_EXTRACT() { return getToken(SQLiteParser.K_EXTRACT, 0); }
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
		public TerminalNode K_HOUR() { return getToken(SQLiteParser.K_HOUR, 0); }
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
		public TerminalNode K_ISBIRTHDATE() { return getToken(SQLiteParser.K_ISBIRTHDATE, 0); }
		public TerminalNode K_ISID() { return getToken(SQLiteParser.K_ISID, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_ISZIPCODE() { return getToken(SQLiteParser.K_ISZIPCODE, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_MINUS() { return getToken(SQLiteParser.K_MINUS, 0); }
		public TerminalNode K_MINUTE() { return getToken(SQLiteParser.K_MINUTE, 0); }
		public TerminalNode K_MONTH() { return getToken(SQLiteParser.K_MONTH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLiteParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_NOTIDENTIFIABLE() { return getToken(SQLiteParser.K_NOTIDENTIFIABLE, 0); }
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
		public TerminalNode K_SECOND() { return getToken(SQLiteParser.K_SECOND, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLiteParser.K_THEN, 0); }
		public TerminalNode K_TIMEZONE_ABBR() { return getToken(SQLiteParser.K_TIMEZONE_ABBR, 0); }
		public TerminalNode K_TIMEZONE_HOUR() { return getToken(SQLiteParser.K_TIMEZONE_HOUR, 0); }
		public TerminalNode K_TIMEZONE_MINUTE() { return getToken(SQLiteParser.K_TIMEZONE_MINUTE, 0); }
		public TerminalNode K_TIMEZONE_REGION() { return getToken(SQLiteParser.K_TIMEZONE_REGION, 0); }
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
		public TerminalNode K_YEAR() { return getToken(SQLiteParser.K_YEAR, 0); }
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
		enterRule(_localctx, 156, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DAY) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_EXTRACT - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_HOUR - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISBIRTHDATE - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_ISZIPCODE - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_MINUTE - 64)) | (1L << (K_MONTH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTIDENTIFIABLE - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SECOND - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TIMEZONE_ABBR - 128)) | (1L << (K_TIMEZONE_HOUR - 128)) | (1L << (K_TIMEZONE_MINUTE - 128)) | (1L << (K_TIMEZONE_REGION - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRACKED - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_YEAR - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) ) {
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
		enterRule(_localctx, 158, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
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

	public static class Result_count_functionContext extends ParserRuleContext {
		public TerminalNode K_COUNT() { return getToken(SQLiteParser.K_COUNT, 0); }
		public Result_column_exprContext result_column_expr() {
			return getRuleContext(Result_column_exprContext.class,0);
		}
		public Any_functContext any_funct() {
			return getRuleContext(Any_functContext.class,0);
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
		public Result_count_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_count_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterResult_count_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitResult_count_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitResult_count_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_count_functionContext result_count_function() throws RecognitionException {
		Result_count_functionContext _localctx = new Result_count_functionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_result_count_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			match(K_COUNT);
			setState(1784);
			match(OPEN_PAR);
			setState(1794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1786);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1785);
					distinct_keyword();
					}
					break;
				}
				setState(1788);
				result_column_expr();
				}
				break;
			case 2:
				{
				setState(1789);
				match(STAR);
				}
				break;
			case 3:
				{
				setState(1791);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1790);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1793);
				any_funct();
				}
				break;
			}
			setState(1796);
			match(CLOSE_PAR);
			setState(1798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1797);
				deid_tag();
				}
			}

			setState(1804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(1801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1800);
					match(K_AS);
					}
				}

				setState(1803);
				column_alias();
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

	public static class Count_functContext extends ParserRuleContext {
		public TerminalNode K_COUNT() { return getToken(SQLiteParser.K_COUNT, 0); }
		public DbColumnExprContext dbColumnExpr() {
			return getRuleContext(DbColumnExprContext.class,0);
		}
		public Any_functContext any_funct() {
			return getRuleContext(Any_functContext.class,0);
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
		public Count_functContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count_funct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCount_funct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCount_funct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCount_funct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Count_functContext count_funct() throws RecognitionException {
		Count_functContext _localctx = new Count_functContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_count_funct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			match(K_COUNT);
			setState(1807);
			match(OPEN_PAR);
			setState(1817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(1809);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1808);
					distinct_keyword();
					}
					break;
				}
				setState(1811);
				dbColumnExpr();
				}
				break;
			case 2:
				{
				setState(1812);
				match(STAR);
				}
				break;
			case 3:
				{
				setState(1814);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(1813);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1816);
				any_funct();
				}
				break;
			}
			setState(1819);
			match(CLOSE_PAR);
			setState(1821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(1820);
				deid_tag();
				}
				break;
			}
			setState(1827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(1824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1823);
					match(K_AS);
					}
				}

				setState(1826);
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

	public static class Any_result_functionContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Deid_tagContext deid_tag() {
			return getRuleContext(Deid_tagContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public List<Result_column_exprContext> result_column_expr() {
			return getRuleContexts(Result_column_exprContext.class);
		}
		public Result_column_exprContext result_column_expr(int i) {
			return getRuleContext(Result_column_exprContext.class,i);
		}
		public List<Any_functContext> any_funct() {
			return getRuleContexts(Any_functContext.class);
		}
		public Any_functContext any_funct(int i) {
			return getRuleContext(Any_functContext.class,i);
		}
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Any_result_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_result_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAny_result_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAny_result_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAny_result_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_result_functionContext any_result_function() throws RecognitionException {
		Any_result_functionContext _localctx = new Any_result_functionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_any_result_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			function_name();
			setState(1830);
			match(OPEN_PAR);
			setState(1853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(1832);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(1831);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(1834);
					result_column_expr();
					}
					break;
				case 2:
					{
					setState(1835);
					any_funct();
					}
					break;
				case 3:
					{
					setState(1836);
					math_expr(0);
					}
					break;
				case 4:
					{
					setState(1837);
					literal_value();
					}
					break;
				}
				setState(1850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1840);
					match(COMMA);
					setState(1846);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
					case 1:
						{
						setState(1841);
						result_column_expr();
						}
						break;
					case 2:
						{
						setState(1842);
						any_funct();
						}
						break;
					case 3:
						{
						setState(1843);
						math_expr(0);
						}
						break;
					case 4:
						{
						setState(1844);
						literal_value();
						}
						break;
					case 5:
						{
						setState(1845);
						match(STAR);
						}
						break;
					}
					}
					}
					setState(1852);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1855);
			match(CLOSE_PAR);
			setState(1857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1856);
				deid_tag();
				}
			}

			setState(1863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(1860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1859);
					match(K_AS);
					}
				}

				setState(1862);
				column_alias();
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

	public static class Any_functContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Deid_tagContext deid_tag() {
			return getRuleContext(Deid_tagContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public List<DbColumnExprContext> dbColumnExpr() {
			return getRuleContexts(DbColumnExprContext.class);
		}
		public DbColumnExprContext dbColumnExpr(int i) {
			return getRuleContext(DbColumnExprContext.class,i);
		}
		public List<Any_functContext> any_funct() {
			return getRuleContexts(Any_functContext.class);
		}
		public Any_functContext any_funct(int i) {
			return getRuleContext(Any_functContext.class,i);
		}
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Any_functContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_funct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAny_funct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAny_funct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAny_funct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_functContext any_funct() throws RecognitionException {
		Any_functContext _localctx = new Any_functContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_any_funct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			function_name();
			setState(1866);
			match(OPEN_PAR);
			setState(1889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(1868);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(1867);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1874);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(1870);
					dbColumnExpr();
					}
					break;
				case 2:
					{
					setState(1871);
					any_funct();
					}
					break;
				case 3:
					{
					setState(1872);
					math_expr(0);
					}
					break;
				case 4:
					{
					setState(1873);
					literal_value();
					}
					break;
				}
				setState(1886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1876);
					match(COMMA);
					setState(1882);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
					case 1:
						{
						setState(1877);
						dbColumnExpr();
						}
						break;
					case 2:
						{
						setState(1878);
						any_funct();
						}
						break;
					case 3:
						{
						setState(1879);
						math_expr(0);
						}
						break;
					case 4:
						{
						setState(1880);
						literal_value();
						}
						break;
					case 5:
						{
						setState(1881);
						match(STAR);
						}
						break;
					}
					}
					}
					setState(1888);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1891);
			match(CLOSE_PAR);
			setState(1893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(1892);
				deid_tag();
				}
				break;
			}
			setState(1899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(1896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1895);
					match(K_AS);
					}
				}

				setState(1898);
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

	public static class Math_exprContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public DbColumnExprContext dbColumnExpr() {
			return getRuleContext(DbColumnExprContext.class,0);
		}
		public Any_functContext any_funct() {
			return getRuleContext(Any_functContext.class,0);
		}
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public Math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterMath_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitMath_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitMath_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_exprContext math_expr() throws RecognitionException {
		return math_expr(0);
	}

	private Math_exprContext math_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_exprContext _localctx = new Math_exprContext(_ctx, _parentState);
		Math_exprContext _prevctx = _localctx;
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_math_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(1902);
				match(NUMERIC_LITERAL);
				}
				break;
			case 2:
				{
				setState(1903);
				dbColumnExpr();
				}
				break;
			case 3:
				{
				setState(1904);
				any_funct();
				}
				break;
			case 4:
				{
				setState(1905);
				match(OPEN_PAR);
				setState(1906);
				math_expr(0);
				setState(1907);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1919);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1917);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
					case 1:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(1911);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1912);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1913);
						math_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(1914);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1915);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1916);
						math_expr(3);
						}
						break;
					}
					} 
				}
				setState(1921);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
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
		enterRule(_localctx, 170, RULE_and_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1922);
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
		enterRule(_localctx, 172, RULE_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1924);
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
		enterRule(_localctx, 174, RULE_and_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1926);
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
		enterRule(_localctx, 176, RULE_not_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
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
		enterRule(_localctx, 178, RULE_in_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
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
		enterRule(_localctx, 180, RULE_like_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1932);
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
		enterRule(_localctx, 182, RULE_distinct_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1934);
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
		enterRule(_localctx, 184, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1936);
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
		enterRule(_localctx, 186, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1938);
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

	public static class With_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public With_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterWith_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitWith_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitWith_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_nameContext with_name() throws RecognitionException {
		With_nameContext _localctx = new With_nameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_with_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1940);
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
		enterRule(_localctx, 190, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1942);
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
		enterRule(_localctx, 192, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
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
		enterRule(_localctx, 194, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
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
		enterRule(_localctx, 196, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1948);
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
		enterRule(_localctx, 198, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1950);
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
		enterRule(_localctx, 200, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
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
		enterRule(_localctx, 202, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1954);
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
		enterRule(_localctx, 204, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956);
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
		enterRule(_localctx, 206, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
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
		enterRule(_localctx, 208, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1960);
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
		enterRule(_localctx, 210, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
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
		enterRule(_localctx, 212, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
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
		enterRule(_localctx, 214, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
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
		enterRule(_localctx, 216, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
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
		enterRule(_localctx, 218, RULE_any_name);
		try {
			setState(1977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1970);
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
			case K_DAY:
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
			case K_EXTRACT:
			case K_FALSE:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_HOUR:
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
			case K_ISBIRTHDATE:
			case K_ISID:
			case K_ISNULL:
			case K_ISZIPCODE:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_MINUS:
			case K_MINUTE:
			case K_MONTH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTIDENTIFIABLE:
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
			case K_SECOND:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TIMEZONE_ABBR:
			case K_TIMEZONE_HOUR:
			case K_TIMEZONE_MINUTE:
			case K_TIMEZONE_REGION:
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
			case K_YEAR:
			case K_OFFUSCATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1971);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1972);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1973);
				match(OPEN_PAR);
				setState(1974);
				any_name();
				setState(1975);
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
		enterRule(_localctx, 220, RULE_anything_at_all);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1980); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1979);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1982); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
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
		case 40:
			return any_result_column_expr_sempred((Any_result_column_exprContext)_localctx, predIndex);
		case 41:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 84:
			return math_expr_sempred((Math_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean any_result_column_expr_sempred(Any_result_column_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 20);
		case 13:
			return precpred(_ctx, 19);
		case 14:
			return precpred(_ctx, 18);
		case 15:
			return precpred(_ctx, 17);
		case 16:
			return precpred(_ctx, 16);
		case 17:
			return precpred(_ctx, 15);
		case 18:
			return precpred(_ctx, 14);
		case 19:
			return precpred(_ctx, 6);
		case 20:
			return precpred(_ctx, 5);
		case 21:
			return precpred(_ctx, 9);
		case 22:
			return precpred(_ctx, 8);
		case 23:
			return precpred(_ctx, 7);
		case 24:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean math_expr_sempred(Math_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 3);
		case 26:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b7\u07c3\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\3\2\3\2\7\2\u00e3\n\2\f\2\16\2\u00e6\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4\u00ef\n\4\f\4\16\4\u00f2\13\4\3\4\7"+
		"\4\u00f5\n\4\f\4\16\4\u00f8\13\4\3\5\3\5\3\5\5\5\u00fd\n\5\5\5\u00ff\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u011e\n\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0129\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u0131\n\7\3\7\5\7\u0134\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u013d\n\b"+
		"\3\t\3\t\5\t\u0141\n\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u0149\n\n\3\n\3\n\5"+
		"\n\u014d\n\n\5\n\u014f\n\n\3\13\3\13\3\13\5\13\u0154\n\13\5\13\u0156\n"+
		"\13\3\f\3\f\5\f\u015a\n\f\3\f\3\f\3\f\7\f\u015f\n\f\f\f\16\f\u0162\13"+
		"\f\5\f\u0164\n\f\3\f\3\f\3\f\3\f\6\f\u016a\n\f\r\f\16\f\u016b\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u0173\n\f\f\f\16\f\u0176\13\f\5\f\u0178\n\f\3\f\3\f\3"+
		"\f\3\f\5\f\u017e\n\f\5\f\u0180\n\f\3\r\3\r\5\r\u0184\n\r\3\r\3\r\3\r\3"+
		"\r\5\r\u018a\n\r\3\r\3\r\3\r\5\r\u018f\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u0198\n\r\f\r\16\r\u019b\13\r\3\r\3\r\3\r\5\r\u01a0\n\r\3\16\3\16"+
		"\5\16\u01a4\n\16\3\16\3\16\3\16\3\16\5\16\u01aa\n\16\3\16\3\16\3\16\5"+
		"\16\u01af\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u01b6\n\16\f\16\16\16\u01b9"+
		"\13\16\3\16\3\16\7\16\u01bd\n\16\f\16\16\16\u01c0\13\16\3\16\3\16\3\16"+
		"\5\16\u01c5\n\16\3\16\3\16\5\16\u01c9\n\16\3\17\3\17\5\17\u01cd\n\17\3"+
		"\17\3\17\3\17\3\17\5\17\u01d3\n\17\3\17\3\17\3\17\5\17\u01d8\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u01df\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u01e8\n\17\f\17\16\17\u01eb\13\17\5\17\u01ed\n\17\5\17\u01ef\n\17"+
		"\3\17\3\17\3\17\3\17\5\17\u01f5\n\17\3\17\3\17\3\17\3\17\5\17\u01fb\n"+
		"\17\3\17\3\17\5\17\u01ff\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u0206\n\17"+
		"\3\17\3\17\6\17\u020a\n\17\r\17\16\17\u020b\3\17\3\17\3\20\3\20\5\20\u0212"+
		"\n\20\3\20\3\20\3\20\3\20\5\20\u0218\n\20\3\20\3\20\3\20\5\20\u021d\n"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0229\n\21"+
		"\3\21\3\21\3\21\5\21\u022e\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u0237\n\21\f\21\16\21\u023a\13\21\3\21\3\21\5\21\u023e\n\21\3\22\5\22"+
		"\u0241\n\22\3\22\3\22\3\22\3\22\5\22\u0247\n\22\3\23\5\23\u024a\n\23\3"+
		"\23\3\23\3\23\3\23\5\23\u0250\n\23\3\23\3\23\3\23\3\23\3\23\7\23\u0257"+
		"\n\23\f\23\16\23\u025a\13\23\5\23\u025c\n\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0262\n\23\5\23\u0264\n\23\3\24\3\24\3\24\3\25\3\25\5\25\u026b\n\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\5\26\u0273\n\26\3\26\3\26\3\26\5\26\u0278"+
		"\n\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0280\n\27\3\27\3\27\3\27\5\27"+
		"\u0285\n\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u028d\n\30\3\30\3\30\3"+
		"\30\5\30\u0292\n\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u029a\n\31\3\31"+
		"\3\31\3\31\5\31\u029f\n\31\3\31\3\31\3\32\5\32\u02a4\n\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\5\32\u02b7\n\32\3\32\3\32\3\32\3\32\5\32\u02bd\n\32\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u02c4\n\32\f\32\16\32\u02c7\13\32\3\32\3\32\5\32\u02cb"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\7\32\u02d2\n\32\f\32\16\32\u02d5\13\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u02dd\n\32\f\32\16\32\u02e0\13\32"+
		"\3\32\3\32\7\32\u02e4\n\32\f\32\16\32\u02e7\13\32\3\32\3\32\3\32\5\32"+
		"\u02ec\n\32\3\33\3\33\3\33\3\33\5\33\u02f2\n\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u02fb\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u0302\n\34"+
		"\3\34\3\34\5\34\u0306\n\34\5\34\u0308\n\34\3\35\3\35\5\35\u030c\n\35\3"+
		"\35\3\35\3\36\3\36\3\36\5\36\u0313\n\36\5\36\u0315\n\36\3\36\3\36\5\36"+
		"\u0319\n\36\3\36\5\36\u031c\n\36\3\37\3\37\3\37\3 \3 \5 \u0323\n \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0331\n \f \16 \u0334\13 \3 \3 \3!"+
		"\3!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0340\n\"\f\"\16\"\u0343\13\"\5\"\u0345"+
		"\n\"\3\"\3\"\3\"\3\"\5\"\u034b\n\"\5\"\u034d\n\"\3#\5#\u0350\n#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u035d\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\7#\u0369\n#\f#\16#\u036c\13#\3#\3#\5#\u0370\n#\3$\5$\u0373\n$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0380\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7"+
		"$\u038c\n$\f$\16$\u038f\13$\3$\3$\5$\u0393\n$\3$\3$\3$\3$\3$\7$\u039a"+
		"\n$\f$\16$\u039d\13$\5$\u039f\n$\3$\3$\3$\3$\5$\u03a5\n$\5$\u03a7\n$\3"+
		"%\3%\3&\3&\5&\u03ad\n&\3&\7&\u03b0\n&\f&\16&\u03b3\13&\3\'\6\'\u03b6\n"+
		"\'\r\'\16\'\u03b7\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u03c4\n"+
		"\'\3(\3(\5(\u03c8\n(\3(\3(\3(\5(\u03cd\n(\3(\3(\5(\u03d1\n(\3(\5(\u03d4"+
		"\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u03e6\n(\3(\3("+
		"\3(\5(\u03eb\n(\3)\3)\3)\5)\u03f0\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0408\n*\3*\3*\3*\3*\3*\6*\u040f"+
		"\n*\r*\16*\u0410\3*\3*\5*\u0415\n*\3*\3*\3*\5*\u041a\n*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0436"+
		"\n*\3*\3*\3*\5*\u043b\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0447\n*\3*"+
		"\3*\3*\3*\5*\u044d\n*\3*\3*\3*\3*\3*\5*\u0454\n*\7*\u0456\n*\f*\16*\u0459"+
		"\13*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5"+
		"+\u0470\n+\3+\5+\u0473\n+\3+\3+\3+\3+\3+\3+\5+\u047b\n+\3+\3+\3+\3+\3"+
		"+\6+\u0482\n+\r+\16+\u0483\3+\3+\5+\u0488\n+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\5+\u0493\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\5+\u04af\n+\3+\3+\3+\5+\u04b4\n+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\5+\u04c0\n+\3+\3+\3+\3+\5+\u04c6\n+\3+\3+\3+\3+\3+\5"+
		"+\u04cd\n+\3+\3+\5+\u04d1\n+\3+\3+\3+\3+\3+\3+\7+\u04d9\n+\f+\16+\u04dc"+
		"\13+\5+\u04de\n+\3+\3+\3+\3+\5+\u04e4\n+\3+\5+\u04e7\n+\7+\u04e9\n+\f"+
		"+\16+\u04ec\13+\3,\3,\3,\3,\5,\u04f2\n,\3,\3,\3,\5,\u04f7\n,\3,\3,\5,"+
		"\u04fb\n,\3,\5,\u04fe\n,\5,\u0500\n,\3-\3-\3-\3-\5-\u0506\n-\3-\3-\3-"+
		"\5-\u050b\n-\3-\3-\5-\u050f\n-\3-\5-\u0512\n-\3-\5-\u0515\n-\5-\u0517"+
		"\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0525\n.\3/\3/\3/\3/\3/\3/"+
		"\7/\u052d\n/\f/\16/\u0530\13/\3/\3/\5/\u0534\n/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\5/\u0540\n/\3/\3/\5/\u0544\n/\7/\u0546\n/\f/\16/\u0549\13/\3/"+
		"\5/\u054c\n/\3/\3/\3/\3/\3/\5/\u0553\n/\5/\u0555\n/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u055d\n\60\3\60\3\60\3\61\3\61\3\61\5\61\u0564\n\61\3"+
		"\61\5\61\u0567\n\61\3\62\3\62\5\62\u056b\n\62\3\62\3\62\3\62\5\62\u0570"+
		"\n\62\3\62\3\62\3\62\3\62\7\62\u0576\n\62\f\62\16\62\u0579\13\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62"+
		"\u0589\n\62\f\62\16\62\u058c\13\62\3\62\3\62\3\62\5\62\u0591\n\62\3\63"+
		"\3\63\5\63\u0595\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\7\63\u05a3\n\63\f\63\16\63\u05a6\13\63\3\64\3\64\3\64\5\64"+
		"\u05ab\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u05b3\n\64\3\65\3\65\3"+
		"\65\5\65\u05b8\n\65\3\65\5\65\u05bb\n\65\3\66\3\66\3\66\5\66\u05c0\n\66"+
		"\3\67\3\67\3\67\3\67\3\67\7\67\u05c7\n\67\f\67\16\67\u05ca\13\67\3\67"+
		"\3\67\5\67\u05ce\n\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\3"+
		"8\38\38\58\u05df\n8\38\58\u05e2\n8\58\u05e4\n8\39\39\39\59\u05e9\n9\3"+
		"9\39\39\39\59\u05ef\n9\3:\5:\u05f2\n:\3:\5:\u05f5\n:\3:\5:\u05f8\n:\3"+
		":\5:\u05fb\n:\3;\3;\3<\3<\3<\3<\3=\3=\5=\u0605\n=\3=\3=\3=\5=\u060a\n"+
		"=\3>\3>\3>\3>\5>\u0610\n>\3>\3>\3>\5>\u0615\n>\3>\5>\u0618\n>\3?\3?\3"+
		"@\3@\3@\5@\u061f\n@\3A\3A\3A\5A\u0624\nA\3A\3A\5A\u0628\nA\3A\5A\u062b"+
		"\nA\3A\3A\3A\3A\3A\5A\u0632\nA\3B\3B\3B\3B\3B\7B\u0639\nB\fB\16B\u063c"+
		"\13B\3B\5B\u063f\nB\3B\3B\5B\u0643\nB\3B\5B\u0646\nB\3B\3B\3B\3B\5B\u064c"+
		"\nB\3B\5B\u064f\nB\5B\u0651\nB\3C\3C\3C\3C\3C\7C\u0658\nC\fC\16C\u065b"+
		"\13C\3D\3D\5D\u065f\nD\3D\3D\5D\u0663\nD\3D\3D\5D\u0667\nD\3D\5D\u066a"+
		"\nD\3E\3E\3E\3E\3E\3E\3E\7E\u0673\nE\fE\16E\u0676\13E\3E\3E\5E\u067a\n"+
		"E\3F\3F\5F\u067e\nF\3F\3F\3F\7F\u0683\nF\fF\16F\u0686\13F\3F\5F\u0689"+
		"\nF\3F\3F\5F\u068d\nF\3F\3F\3F\3F\5F\u0693\nF\3F\3F\3F\5F\u0698\nF\7F"+
		"\u069a\nF\fF\16F\u069d\13F\3F\3F\5F\u06a1\nF\5F\u06a3\nF\3F\3F\3F\3F\3"+
		"F\7F\u06aa\nF\fF\16F\u06ad\13F\3F\3F\3F\3F\3F\3F\7F\u06b5\nF\fF\16F\u06b8"+
		"\13F\3F\3F\7F\u06bc\nF\fF\16F\u06bf\13F\5F\u06c1\nF\3G\3G\3G\3G\7G\u06c7"+
		"\nG\fG\16G\u06ca\13G\3G\5G\u06cd\nG\3H\3H\3H\3H\3H\3H\5H\u06d5\nH\3I\3"+
		"I\3I\3I\3I\7I\u06dc\nI\fI\16I\u06df\13I\3I\3I\5I\u06e3\nI\3J\5J\u06e6"+
		"\nJ\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\5N\u06f2\nN\3O\3O\3P\3P\3Q\3Q\3R\3R"+
		"\3R\5R\u06fd\nR\3R\3R\3R\5R\u0702\nR\3R\5R\u0705\nR\3R\3R\5R\u0709\nR"+
		"\3R\5R\u070c\nR\3R\5R\u070f\nR\3S\3S\3S\5S\u0714\nS\3S\3S\3S\5S\u0719"+
		"\nS\3S\5S\u071c\nS\3S\3S\5S\u0720\nS\3S\5S\u0723\nS\3S\5S\u0726\nS\3T"+
		"\3T\3T\5T\u072b\nT\3T\3T\3T\3T\5T\u0731\nT\3T\3T\3T\3T\3T\3T\5T\u0739"+
		"\nT\7T\u073b\nT\fT\16T\u073e\13T\5T\u0740\nT\3T\3T\5T\u0744\nT\3T\5T\u0747"+
		"\nT\3T\5T\u074a\nT\3U\3U\3U\5U\u074f\nU\3U\3U\3U\3U\5U\u0755\nU\3U\3U"+
		"\3U\3U\3U\3U\5U\u075d\nU\7U\u075f\nU\fU\16U\u0762\13U\5U\u0764\nU\3U\3"+
		"U\5U\u0768\nU\3U\5U\u076b\nU\3U\5U\u076e\nU\3V\3V\3V\3V\3V\3V\3V\3V\5"+
		"V\u0778\nV\3V\3V\3V\3V\3V\3V\7V\u0780\nV\fV\16V\u0783\13V\3W\3W\3X\3X"+
		"\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3"+
		"d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3"+
		"o\3o\3o\3o\3o\3o\5o\u07bc\no\3p\6p\u07bf\np\rp\16p\u07c0\3p\2\5RT\u00aa"+
		"q\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\2\27\5\2??JJ[[\4\2\61\61GG\4\2\7\7zz\3"+
		"\2\u0095\u0096\4\2$$AA\7\2\33\33OOZZ\u008b\u008b\u008e\u008e\4\2\t\t\16"+
		"\17\3\2\n\13\3\2\20\23\3\2\24\27\6\2TTmmoo\u0087\u0087\b\2<<WWqr\u0091"+
		"\u0091\u0098\u009b\u00ad\u00ad\4\2@@\u00a3\u00a3\5\2\33\33OO\u008e\u008e"+
		"\4\2NN\u00a0\u00a0\4\2\37\37CC\6\2\679xx\u00af\u00af\u00b1\u00b2\4\2\n"+
		"\fuu\4\2\u00ae\u00ae\u00b1\u00b1\6\2\33\63\65z|\u00ad\u00b7\u00b7\4\2"+
		"\"\"}}\2\u08f6\2\u00e4\3\2\2\2\4\u00e9\3\2\2\2\6\u00ec\3\2\2\2\b\u00fe"+
		"\3\2\2\2\n\u0121\3\2\2\2\f\u0123\3\2\2\2\16\u0135\3\2\2\2\20\u013e\3\2"+
		"\2\2\22\u0146\3\2\2\2\24\u0150\3\2\2\2\26\u0163\3\2\2\2\30\u0181\3\2\2"+
		"\2\32\u01a1\3\2\2\2\34\u01ca\3\2\2\2\36\u020f\3\2\2\2 \u0222\3\2\2\2\""+
		"\u0240\3\2\2\2$\u0249\3\2\2\2&\u0265\3\2\2\2(\u0268\3\2\2\2*\u026e\3\2"+
		"\2\2,\u027b\3\2\2\2.\u0288\3\2\2\2\60\u0295\3\2\2\2\62\u02a3\3\2\2\2\64"+
		"\u02ed\3\2\2\2\66\u02fc\3\2\2\28\u0309\3\2\2\2:\u030f\3\2\2\2<\u031d\3"+
		"\2\2\2>\u0320\3\2\2\2@\u0337\3\2\2\2B\u0339\3\2\2\2D\u034f\3\2\2\2F\u0372"+
		"\3\2\2\2H\u03a8\3\2\2\2J\u03aa\3\2\2\2L\u03b5\3\2\2\2N\u03c7\3\2\2\2P"+
		"\u03ef\3\2\2\2R\u0419\3\2\2\2T\u0492\3\2\2\2V\u04ff\3\2\2\2X\u0516\3\2"+
		"\2\2Z\u0524\3\2\2\2\\\u0526\3\2\2\2^\u0556\3\2\2\2`\u0560\3\2\2\2b\u056a"+
		"\3\2\2\2d\u0592\3\2\2\2f\u05aa\3\2\2\2h\u05b4\3\2\2\2j\u05bf\3\2\2\2l"+
		"\u05c1\3\2\2\2n\u05e3\3\2\2\2p\u05ee\3\2\2\2r\u05f1\3\2\2\2t\u05fc\3\2"+
		"\2\2v\u05fe\3\2\2\2x\u0602\3\2\2\2z\u0617\3\2\2\2|\u0619\3\2\2\2~\u061b"+
		"\3\2\2\2\u0080\u0623\3\2\2\2\u0082\u0650\3\2\2\2\u0084\u0652\3\2\2\2\u0086"+
		"\u0669\3\2\2\2\u0088\u0679\3\2\2\2\u008a\u06c0\3\2\2\2\u008c\u06c2\3\2"+
		"\2\2\u008e\u06d4\3\2\2\2\u0090\u06d6\3\2\2\2\u0092\u06e5\3\2\2\2\u0094"+
		"\u06e9\3\2\2\2\u0096\u06eb\3\2\2\2\u0098\u06ed\3\2\2\2\u009a\u06f1\3\2"+
		"\2\2\u009c\u06f3\3\2\2\2\u009e\u06f5\3\2\2\2\u00a0\u06f7\3\2\2\2\u00a2"+
		"\u06f9\3\2\2\2\u00a4\u0710\3\2\2\2\u00a6\u0727\3\2\2\2\u00a8\u074b\3\2"+
		"\2\2\u00aa\u0777\3\2\2\2\u00ac\u0784\3\2\2\2\u00ae\u0786\3\2\2\2\u00b0"+
		"\u0788\3\2\2\2\u00b2\u078a\3\2\2\2\u00b4\u078c\3\2\2\2\u00b6\u078e\3\2"+
		"\2\2\u00b8\u0790\3\2\2\2\u00ba\u0792\3\2\2\2\u00bc\u0794\3\2\2\2\u00be"+
		"\u0796\3\2\2\2\u00c0\u0798\3\2\2\2\u00c2\u079a\3\2\2\2\u00c4\u079c\3\2"+
		"\2\2\u00c6\u079e\3\2\2\2\u00c8\u07a0\3\2\2\2\u00ca\u07a2\3\2\2\2\u00cc"+
		"\u07a4\3\2\2\2\u00ce\u07a6\3\2\2\2\u00d0\u07a8\3\2\2\2\u00d2\u07aa\3\2"+
		"\2\2\u00d4\u07ac\3\2\2\2\u00d6\u07ae\3\2\2\2\u00d8\u07b0\3\2\2\2\u00da"+
		"\u07b2\3\2\2\2\u00dc\u07bb\3\2\2\2\u00de\u07be\3\2\2\2\u00e0\u00e3\5\6"+
		"\4\2\u00e1\u00e3\5\4\3\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\2\2\3\u00e8\3\3\2\2\2\u00e9\u00ea"+
		"\7\u00b6\2\2\u00ea\u00eb\b\3\1\2\u00eb\5\3\2\2\2\u00ec\u00f0\5\b\5\2\u00ed"+
		"\u00ef\5\b\5\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f6\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f5\5\u00dep\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\7\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fc\7L\2\2\u00fa\u00fb\7\u0083\2\2\u00fb\u00fd\7\u0080\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u011d\3\2\2\2\u0100\u011e\5\f\7\2\u0101\u011e\5\16"+
		"\b\2\u0102\u011e\5\20\t\2\u0103\u011e\5\22\n\2\u0104\u011e\5\24\13\2\u0105"+
		"\u011e\5\30\r\2\u0106\u011e\5\32\16\2\u0107\u011e\5\34\17\2\u0108\u011e"+
		"\5\36\20\2\u0109\u011e\5 \21\2\u010a\u011e\5\"\22\2\u010b\u011e\5$\23"+
		"\2\u010c\u011e\5(\25\2\u010d\u011e\5*\26\2\u010e\u011e\5,\27\2\u010f\u011e"+
		"\5.\30\2\u0110\u011e\5\60\31\2\u0111\u011e\5\62\32\2\u0112\u011e\5\64"+
		"\33\2\u0113\u011e\5\66\34\2\u0114\u011e\58\35\2\u0115\u011e\5:\36\2\u0116"+
		"\u011e\5<\37\2\u0117\u011e\5\26\f\2\u0118\u011e\5B\"\2\u0119\u011e\5D"+
		"#\2\u011a\u011e\5F$\2\u011b\u011e\5H%\2\u011c\u011e\5> \2\u011d\u0100"+
		"\3\2\2\2\u011d\u0101\3\2\2\2\u011d\u0102\3\2\2\2\u011d\u0103\3\2\2\2\u011d"+
		"\u0104\3\2\2\2\u011d\u0105\3\2\2\2\u011d\u0106\3\2\2\2\u011d\u0107\3\2"+
		"\2\2\u011d\u0108\3\2\2\2\u011d\u0109\3\2\2\2\u011d\u010a\3\2\2\2\u011d"+
		"\u010b\3\2\2\2\u011d\u010c\3\2\2\2\u011d\u010d\3\2\2\2\u011d\u010e\3\2"+
		"\2\2\u011d\u010f\3\2\2\2\u011d\u0110\3\2\2\2\u011d\u0111\3\2\2\2\u011d"+
		"\u0112\3\2\2\2\u011d\u0113\3\2\2\2\u011d\u0114\3\2\2\2\u011d\u0115\3\2"+
		"\2\2\u011d\u0116\3\2\2\2\u011d\u0117\3\2\2\2\u011d\u0118\3\2\2\2\u011d"+
		"\u0119\3\2\2\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0120\5\n\6\2\u0120\t\3\2\2\2\u0121\u0122"+
		"\7\3\2\2\u0122\13\3\2\2\2\u0123\u0124\7 \2\2\u0124\u0128\7\u0094\2\2\u0125"+
		"\u0126\5\u00bc_\2\u0126\u0127\7\4\2\2\u0127\u0129\3\2\2\2\u0128\u0125"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0133\5\u00c0a"+
		"\2\u012b\u012c\7\u008a\2\2\u012c\u012d\7\u009c\2\2\u012d\u0134\5\u00c4"+
		"c\2\u012e\u0130\7\35\2\2\u012f\u0131\7\60\2\2\u0130\u012f\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\5J&\2\u0133\u012b\3\2\2"+
		"\2\u0133\u012e\3\2\2\2\u0134\r\3\2\2\2\u0135\u013c\7!\2\2\u0136\u013d"+
		"\5\u00bc_\2\u0137\u013d\5\u00c2b\2\u0138\u0139\5\u00bc_\2\u0139\u013a"+
		"\7\4\2\2\u013a\u013b\5\u00c2b\2\u013b\u013d\3\2\2\2\u013c\u0136\3\2\2"+
		"\2\u013c\u0137\3\2\2\2\u013c\u0138\3\2\2\2\u013c\u013d\3\2\2\2\u013d\17"+
		"\3\2\2\2\u013e\u0140\7%\2\2\u013f\u0141\7:\2\2\u0140\u013f\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\5T+\2\u0143\u0144\7#\2"+
		"\2\u0144\u0145\5\u00bc_\2\u0145\21\3\2\2\2\u0146\u0148\7(\2\2\u0147\u0149"+
		"\t\2\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014e\3\2\2\2\u014a"+
		"\u014c\7\u009e\2\2\u014b\u014d\5\u00dan\2\u014c\u014b\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014a\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\23\3\2\2\2\u0150\u0155\t\3\2\2\u0151\u0153\7\u009e\2\2\u0152\u0154\5"+
		"\u00dan\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2"+
		"\u0155\u0151\3\2\2\2\u0155\u0156\3\2\2\2\u0156\25\3\2\2\2\u0157\u0159"+
		"\7\u00ab\2\2\u0158\u015a\7\u0085\2\2\u0159\u0158\3\2\2\2\u0159\u015a\3"+
		"\2\2\2\u015a\u015b\3\2\2\2\u015b\u0160\5l\67\2\u015c\u015d\7\7\2\2\u015d"+
		"\u015f\5l\67\2\u015e\u015c\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0157\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0169\5\u008a"+
		"F\2\u0166\u0167\5\u008eH\2\u0167\u0168\5\u008aF\2\u0168\u016a\3\2\2\2"+
		"\u0169\u0166\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u0177\3\2\2\2\u016d\u016e\7~\2\2\u016e\u016f\7*\2\2\u016f"+
		"\u0174\5h\65\2\u0170\u0171\7\7\2\2\u0171\u0173\5h\65\2\u0172\u0170\3\2"+
		"\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u016d\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u017f\3\2\2\2\u0179\u017a\7n\2\2\u017a\u017d\5T+\2\u017b\u017c"+
		"\t\4\2\2\u017c\u017e\5T+\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u0180\3\2\2\2\u017f\u0179\3\2\2\2\u017f\u0180\3\2\2\2\u0180\27\3\2\2"+
		"\2\u0181\u0183\7\65\2\2\u0182\u0184\7\u00a2\2\2\u0183\u0182\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0189\7]\2\2\u0186\u0187\7X\2"+
		"\2\u0187\u0188\7u\2\2\u0188\u018a\7K\2\2\u0189\u0186\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018e\3\2\2\2\u018b\u018c\5\u00bc_\2\u018c\u018d\7\4\2"+
		"\2\u018d\u018f\3\2\2\2\u018e\u018b\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0191\5\u00ccg\2\u0191\u0192\7|\2\2\u0192\u0193\5\u00c0"+
		"a\2\u0193\u0194\7\5\2\2\u0194\u0199\5`\61\2\u0195\u0196\7\7\2\2\u0196"+
		"\u0198\5`\61\2\u0197\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2"+
		"\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c"+
		"\u019f\7\6\2\2\u019d\u019e\7\u00aa\2\2\u019e\u01a0\5T+\2\u019f\u019d\3"+
		"\2\2\2\u019f\u01a0\3\2\2\2\u01a0\31\3\2\2\2\u01a1\u01a3\7\65\2\2\u01a2"+
		"\u01a4\t\5\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a9\7\u0094\2\2\u01a6\u01a7\7X\2\2\u01a7\u01a8\7u\2\2\u01a8"+
		"\u01aa\7K\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ae\3\2"+
		"\2\2\u01ab\u01ac\5\u00bc_\2\u01ac\u01ad\7\4\2\2\u01ad\u01af\3\2\2\2\u01ae"+
		"\u01ab\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01c8\5\u00c0"+
		"a\2\u01b1\u01b2\7\5\2\2\u01b2\u01b7\5J&\2\u01b3\u01b4\7\7\2\2\u01b4\u01b6"+
		"\5J&\2\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01be\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\7\7"+
		"\2\2\u01bb\u01bd\5b\62\2\u01bc\u01ba\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01be\3\2"+
		"\2\2\u01c1\u01c4\7\6\2\2\u01c2\u01c3\7\u00ac\2\2\u01c3\u01c5\7\u00ae\2"+
		"\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c9\3\2\2\2\u01c6\u01c7"+
		"\7#\2\2\u01c7\u01c9\5B\"\2\u01c8\u01b1\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9"+
		"\33\3\2\2\2\u01ca\u01cc\7\65\2\2\u01cb\u01cd\t\5\2\2\u01cc\u01cb\3\2\2"+
		"\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d2\7\u009f\2\2\u01cf"+
		"\u01d0\7X\2\2\u01d0\u01d1\7u\2\2\u01d1\u01d3\7K\2\2\u01d2\u01cf\3\2\2"+
		"\2\u01d2\u01d3\3\2\2\2\u01d3\u01d7\3\2\2\2\u01d4\u01d5\5\u00bc_\2\u01d5"+
		"\u01d6\7\4\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01de\5\u00ceh\2\u01da\u01df\7\'\2\2\u01db"+
		"\u01df\7\36\2\2\u01dc\u01dd\7b\2\2\u01dd\u01df\7y\2\2\u01de\u01da\3\2"+
		"\2\2\u01de\u01db\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01ee\3\2\2\2\u01e0\u01ef\7@\2\2\u01e1\u01ef\7a\2\2\u01e2\u01ec\7\u00a3"+
		"\2\2\u01e3\u01e4\7y\2\2\u01e4\u01e9\5\u00c6d\2\u01e5\u01e6\7\7\2\2\u01e6"+
		"\u01e8\5\u00c6d\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7"+
		"\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec"+
		"\u01e3\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01e0\3\2"+
		"\2\2\u01ee\u01e1\3\2\2\2\u01ee\u01e2\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f4\7|\2\2\u01f1\u01f2\5\u00bc_\2\u01f2\u01f3\7\4\2\2\u01f3\u01f5\3"+
		"\2\2\2\u01f4\u01f1\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01fa\5\u00c0a\2\u01f7\u01f8\7P\2\2\u01f8\u01f9\7E\2\2\u01f9\u01fb\7"+
		"\u008f\2\2\u01fa\u01f7\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fe\3\2\2\2"+
		"\u01fc\u01fd\7\u00a9\2\2\u01fd\u01ff\5T+\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff"+
		"\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0209\7(\2\2\u0201\u0206\5D#\2\u0202"+
		"\u0206\5\62\32\2\u0203\u0206\5\"\22\2\u0204\u0206\5B\"\2\u0205\u0201\3"+
		"\2\2\2\u0205\u0202\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0208\7\3\2\2\u0208\u020a\3\2\2\2\u0209\u0205\3\2"+
		"\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020e\7G\2\2\u020e\35\3\2\2\2\u020f\u0211\7\65\2"+
		"\2\u0210\u0212\t\5\2\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213"+
		"\3\2\2\2\u0213\u0217\7\u00a7\2\2\u0214\u0215\7X\2\2\u0215\u0216\7u\2\2"+
		"\u0216\u0218\7K\2\2\u0217\u0214\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021c"+
		"\3\2\2\2\u0219\u021a\5\u00bc_\2\u021a\u021b\7\4\2\2\u021b\u021d\3\2\2"+
		"\2\u021c\u0219\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f"+
		"\5\u00d0i\2\u021f\u0220\7#\2\2\u0220\u0221\5B\"\2\u0221\37\3\2\2\2\u0222"+
		"\u0223\7\65\2\2\u0223\u0224\7\u00a8\2\2\u0224\u0228\7\u0094\2\2\u0225"+
		"\u0226\7X\2\2\u0226\u0227\7u\2\2\u0227\u0229\7K\2\2\u0228\u0225\3\2\2"+
		"\2\u0228\u0229\3\2\2\2\u0229\u022d\3\2\2\2\u022a\u022b\5\u00bc_\2\u022b"+
		"\u022c\7\4\2\2\u022c\u022e\3\2\2\2\u022d\u022a\3\2\2\2\u022d\u022e\3\2"+
		"\2\2\u022e\u022f\3\2\2\2\u022f\u0230\5\u00c0a\2\u0230\u0231\7\u00a4\2"+
		"\2\u0231\u023d\5\u00d2j\2\u0232\u0233\7\5\2\2\u0233\u0238\5\u009aN\2\u0234"+
		"\u0235\7\7\2\2\u0235\u0237\5\u009aN\2\u0236\u0234\3\2\2\2\u0237\u023a"+
		"\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a"+
		"\u0238\3\2\2\2\u023b\u023c\7\6\2\2\u023c\u023e\3\2\2\2\u023d\u0232\3\2"+
		"\2\2\u023d\u023e\3\2\2\2\u023e!\3\2\2\2\u023f\u0241\5d\63\2\u0240\u023f"+
		"\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\7@\2\2\u0243"+
		"\u0246\5&\24\2\u0244\u0245\7\u00aa\2\2\u0245\u0247\5T+\2\u0246\u0244\3"+
		"\2\2\2\u0246\u0247\3\2\2\2\u0247#\3\2\2\2\u0248\u024a\5d\63\2\u0249\u0248"+
		"\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\7@\2\2\u024c"+
		"\u024f\5&\24\2\u024d\u024e\7\u00aa\2\2\u024e\u0250\5T+\2\u024f\u024d\3"+
		"\2\2\2\u024f\u0250\3\2\2\2\u0250\u0263\3\2\2\2\u0251\u0252\7~\2\2\u0252"+
		"\u0253\7*\2\2\u0253\u0258\5h\65\2\u0254\u0255\7\7\2\2\u0255\u0257\5h\65"+
		"\2\u0256\u0254\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259"+
		"\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u0251\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\7n\2\2\u025e\u0261\5T+"+
		"\2\u025f\u0260\t\4\2\2\u0260\u0262\5T+\2\u0261\u025f\3\2\2\2\u0261\u0262"+
		"\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u025b\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"%\3\2\2\2\u0265\u0266\7R\2\2\u0266\u0267\5f\64\2\u0267\'\3\2\2\2\u0268"+
		"\u026a\7B\2\2\u0269\u026b\7:\2\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2"+
		"\2\u026b\u026c\3\2\2\2\u026c\u026d\5\u00bc_\2\u026d)\3\2\2\2\u026e\u026f"+
		"\7D\2\2\u026f\u0272\7]\2\2\u0270\u0271\7X\2\2\u0271\u0273\7K\2\2\u0272"+
		"\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0277\3\2\2\2\u0274\u0275\5\u00bc"+
		"_\2\u0275\u0276\7\4\2\2\u0276\u0278\3\2\2\2\u0277\u0274\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\5\u00ccg\2\u027a+\3\2\2"+
		"\2\u027b\u027c\7D\2\2\u027c\u027f\7\u0094\2\2\u027d\u027e\7X\2\2\u027e"+
		"\u0280\7K\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0284\3\2"+
		"\2\2\u0281\u0282\5\u00bc_\2\u0282\u0283\7\4\2\2\u0283\u0285\3\2\2\2\u0284"+
		"\u0281\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\5\u00c0"+
		"a\2\u0287-\3\2\2\2\u0288\u0289\7D\2\2\u0289\u028c\7\u009f\2\2\u028a\u028b"+
		"\7X\2\2\u028b\u028d\7K\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\u0291\3\2\2\2\u028e\u028f\5\u00bc_\2\u028f\u0290\7\4\2\2\u0290\u0292"+
		"\3\2\2\2\u0291\u028e\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0294\5\u00ceh\2\u0294/\3\2\2\2\u0295\u0296\7D\2\2\u0296\u0299\7\u00a7"+
		"\2\2\u0297\u0298\7X\2\2\u0298\u029a\7K\2\2\u0299\u0297\3\2\2\2\u0299\u029a"+
		"\3\2\2\2\u029a\u029e\3\2\2\2\u029b\u029c\5\u00bc_\2\u029c\u029d\7\4\2"+
		"\2\u029d\u029f\3\2\2\2\u029e\u029b\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0"+
		"\3\2\2\2\u02a0\u02a1\5\u00d0i\2\u02a1\61\3\2\2\2\u02a2\u02a4\5d\63\2\u02a3"+
		"\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02b6\3\2\2\2\u02a5\u02b7\7a"+
		"\2\2\u02a6\u02b7\7\u008b\2\2\u02a7\u02a8\7a\2\2\u02a8\u02a9\7}\2\2\u02a9"+
		"\u02b7\7\u008b\2\2\u02aa\u02ab\7a\2\2\u02ab\u02ac\7}\2\2\u02ac\u02b7\7"+
		"\u008e\2\2\u02ad\u02ae\7a\2\2\u02ae\u02af\7}\2\2\u02af\u02b7\7\33\2\2"+
		"\u02b0\u02b1\7a\2\2\u02b1\u02b2\7}\2\2\u02b2\u02b7\7O\2\2\u02b3\u02b4"+
		"\7a\2\2\u02b4\u02b5\7}\2\2\u02b5\u02b7\7Z\2\2\u02b6\u02a5\3\2\2\2\u02b6"+
		"\u02a6\3\2\2\2\u02b6\u02a7\3\2\2\2\u02b6\u02aa\3\2\2\2\u02b6\u02ad\3\2"+
		"\2\2\u02b6\u02b0\3\2\2\2\u02b6\u02b3\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"\u02bc\7d\2\2\u02b9\u02ba\5\u00bc_\2\u02ba\u02bb\7\4\2\2\u02bb\u02bd\3"+
		"\2\2\2\u02bc\u02b9\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02ca\5\u00c0a\2\u02bf\u02c0\7\5\2\2\u02c0\u02c5\5\u00c6d\2\u02c1\u02c2"+
		"\7\7\2\2\u02c2\u02c4\5\u00c6d\2\u02c3\u02c1\3\2\2\2\u02c4\u02c7\3\2\2"+
		"\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5"+
		"\3\2\2\2\u02c8\u02c9\7\6\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02bf\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02eb\3\2\2\2\u02cc\u02cd\7\u00a6\2\2\u02cd\u02ce"+
		"\7\5\2\2\u02ce\u02d3\5T+\2\u02cf\u02d0\7\7\2\2\u02d0\u02d2\5T+\2\u02d1"+
		"\u02cf\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2"+
		"\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02e5\7\6\2\2\u02d7"+
		"\u02d8\7\7\2\2\u02d8\u02d9\7\5\2\2\u02d9\u02de\5T+\2\u02da\u02db\7\7\2"+
		"\2\u02db\u02dd\5T+\2\u02dc\u02da\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc"+
		"\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1"+
		"\u02e2\7\6\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02d7\3\2\2\2\u02e4\u02e7\3\2"+
		"\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02ec\3\2\2\2\u02e7"+
		"\u02e5\3\2\2\2\u02e8\u02ec\5B\"\2\u02e9\u02ea\7=\2\2\u02ea\u02ec\7\u00a6"+
		"\2\2\u02eb\u02cc\3\2\2\2\u02eb\u02e8\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec"+
		"\63\3\2\2\2\u02ed\u02f1\7\u0081\2\2\u02ee\u02ef\5\u00bc_\2\u02ef\u02f0"+
		"\7\4\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ee\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2"+
		"\u02f3\3\2\2\2\u02f3\u02fa\5\u00d4k\2\u02f4\u02f5\7\b\2\2\u02f5\u02fb"+
		"\5j\66\2\u02f6\u02f7\7\5\2\2\u02f7\u02f8\5j\66\2\u02f8\u02f9\7\6\2\2\u02f9"+
		"\u02fb\3\2\2\2\u02fa\u02f4\3\2\2\2\u02fa\u02f6\3\2\2\2\u02fa\u02fb\3\2"+
		"\2\2\u02fb\65\3\2\2\2\u02fc\u0307\7\u0088\2\2\u02fd\u0308\5\u00c8e\2\u02fe"+
		"\u02ff\5\u00bc_\2\u02ff\u0300\7\4\2\2\u0300\u0302\3\2\2\2\u0301\u02fe"+
		"\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0306\5\u00c0a"+
		"\2\u0304\u0306\5\u00ccg\2\u0305\u0303\3\2\2\2\u0305\u0304\3\2\2\2\u0306"+
		"\u0308\3\2\2\2\u0307\u02fd\3\2\2\2\u0307\u0301\3\2\2\2\u0307\u0308\3\2"+
		"\2\2\u0308\67\3\2\2\2\u0309\u030b\7\u0089\2\2\u030a\u030c\7\u0090\2\2"+
		"\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e"+
		"\5\u00d6l\2\u030e9\3\2\2\2\u030f\u0314\7\u008e\2\2\u0310\u0312\7\u009e"+
		"\2\2\u0311\u0313\5\u00dan\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313"+
		"\u0315\3\2\2\2\u0314\u0310\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u031b\3\2"+
		"\2\2\u0316\u0318\7\u009c\2\2\u0317\u0319\7\u0090\2\2\u0318\u0317\3\2\2"+
		"\2\u0318\u0319\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031c\5\u00d6l\2\u031b"+
		"\u0316\3\2\2\2\u031b\u031c\3\2\2\2\u031c;\3\2\2\2\u031d\u031e\7\u0090"+
		"\2\2\u031e\u031f\5\u00d6l\2\u031f=\3\2\2\2\u0320\u0322\7\u00ab\2\2\u0321"+
		"\u0323\7\u0085\2\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324"+
		"\3\2\2\2\u0324\u0325\5\u00be`\2\u0325\u0326\7#\2\2\u0326\u0327\7\5\2\2"+
		"\u0327\u0328\5B\"\2\u0328\u0332\7\6\2\2\u0329\u032a\7\7\2\2\u032a\u032b"+
		"\5\u00be`\2\u032b\u032c\7#\2\2\u032c\u032d\7\5\2\2\u032d\u032e\5B\"\2"+
		"\u032e\u032f\7\6\2\2\u032f\u0331\3\2\2\2\u0330\u0329\3\2\2\2\u0331\u0334"+
		"\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0335\3\2\2\2\u0334"+
		"\u0332\3\2\2\2\u0335\u0336\5@!\2\u0336?\3\2\2\2\u0337\u0338\5B\"\2\u0338"+
		"A\3\2\2\2\u0339\u0344\5\u008aF\2\u033a\u033b\7~\2\2\u033b\u033c\7*\2\2"+
		"\u033c\u0341\5h\65\2\u033d\u033e\7\7\2\2\u033e\u0340\5h\65\2\u033f\u033d"+
		"\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0344\u033a\3\2\2\2\u0344\u0345\3\2"+
		"\2\2\u0345\u034c\3\2\2\2\u0346\u0347\7n\2\2\u0347\u034a\5T+\2\u0348\u0349"+
		"\t\4\2\2\u0349\u034b\5T+\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
		"\u034d\3\2\2\2\u034c\u0346\3\2\2\2\u034c\u034d\3\2\2\2\u034dC\3\2\2\2"+
		"\u034e\u0350\5d\63\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351"+
		"\3\2\2\2\u0351\u035c\7\u00a3\2\2\u0352\u0353\7}\2\2\u0353\u035d\7\u008e"+
		"\2\2\u0354\u0355\7}\2\2\u0355\u035d\7\33\2\2\u0356\u0357\7}\2\2\u0357"+
		"\u035d\7\u008b\2\2\u0358\u0359\7}\2\2\u0359\u035d\7O\2\2\u035a\u035b\7"+
		"}\2\2\u035b\u035d\7Z\2\2\u035c\u0352\3\2\2\2\u035c\u0354\3\2\2\2\u035c"+
		"\u0356\3\2\2\2\u035c\u0358\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2"+
		"\2\2\u035d\u035e\3\2\2\2\u035e\u035f\5f\64\2\u035f\u0360\7\u0093\2\2\u0360"+
		"\u0361\5\u00c6d\2\u0361\u0362\7\b\2\2\u0362\u036a\5T+\2\u0363\u0364\7"+
		"\7\2\2\u0364\u0365\5\u00c6d\2\u0365\u0366\7\b\2\2\u0366\u0367\5T+\2\u0367"+
		"\u0369\3\2\2\2\u0368\u0363\3\2\2\2\u0369\u036c\3\2\2\2\u036a\u0368\3\2"+
		"\2\2\u036a\u036b\3\2\2\2\u036b\u036f\3\2\2\2\u036c\u036a\3\2\2\2\u036d"+
		"\u036e\7\u00aa\2\2\u036e\u0370\5T+\2\u036f\u036d\3\2\2\2\u036f\u0370\3"+
		"\2\2\2\u0370E\3\2\2\2\u0371\u0373\5d\63\2\u0372\u0371\3\2\2\2\u0372\u0373"+
		"\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u037f\7\u00a3\2\2\u0375\u0376\7}\2"+
		"\2\u0376\u0380\7\u008e\2\2\u0377\u0378\7}\2\2\u0378\u0380\7\33\2\2\u0379"+
		"\u037a\7}\2\2\u037a\u0380\7\u008b\2\2\u037b\u037c\7}\2\2\u037c\u0380\7"+
		"O\2\2\u037d\u037e\7}\2\2\u037e\u0380\7Z\2\2\u037f\u0375\3\2\2\2\u037f"+
		"\u0377\3\2\2\2\u037f\u0379\3\2\2\2\u037f\u037b\3\2\2\2\u037f\u037d\3\2"+
		"\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\5f\64\2\u0382"+
		"\u0383\7\u0093\2\2\u0383\u0384\5\u00c6d\2\u0384\u0385\7\b\2\2\u0385\u038d"+
		"\5T+\2\u0386\u0387\7\7\2\2\u0387\u0388\5\u00c6d\2\u0388\u0389\7\b\2\2"+
		"\u0389\u038a\5T+\2\u038a\u038c\3\2\2\2\u038b\u0386\3\2\2\2\u038c\u038f"+
		"\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0392\3\2\2\2\u038f"+
		"\u038d\3\2\2\2\u0390\u0391\7\u00aa\2\2\u0391\u0393\5T+\2\u0392\u0390\3"+
		"\2\2\2\u0392\u0393\3\2\2\2\u0393\u03a6\3\2\2\2\u0394\u0395\7~\2\2\u0395"+
		"\u0396\7*\2\2\u0396\u039b\5h\65\2\u0397\u0398\7\7\2\2\u0398\u039a\5h\65"+
		"\2\u0399\u0397\3\2\2\2\u039a\u039d\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039c"+
		"\3\2\2\2\u039c\u039f\3\2\2\2\u039d\u039b\3\2\2\2\u039e\u0394\3\2\2\2\u039e"+
		"\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\7n\2\2\u03a1\u03a4\5T+"+
		"\2\u03a2\u03a3\t\4\2\2\u03a3\u03a5\5T+\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5"+
		"\3\2\2\2\u03a5\u03a7\3\2\2\2\u03a6\u039e\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"G\3\2\2\2\u03a8\u03a9\7\u00a5\2\2\u03a9I\3\2\2\2\u03aa\u03ac\5\u00c6d"+
		"\2\u03ab\u03ad\5L\'\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03b1"+
		"\3\2\2\2\u03ae\u03b0\5N(\2\u03af\u03ae\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1"+
		"\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2K\3\2\2\2\u03b3\u03b1\3\2\2\2"+
		"\u03b4\u03b6\5\u00a0Q\2\u03b5\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7"+
		"\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03c3\3\2\2\2\u03b9\u03ba\7\5"+
		"\2\2\u03ba\u03bb\5\u0092J\2\u03bb\u03bc\7\6\2\2\u03bc\u03c4\3\2\2\2\u03bd"+
		"\u03be\7\5\2\2\u03be\u03bf\5\u0092J\2\u03bf\u03c0\7\7\2\2\u03c0\u03c1"+
		"\5\u0092J\2\u03c1\u03c2\7\6\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03b9\3\2\2"+
		"\2\u03c3\u03bd\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4M\3\2\2\2\u03c5\u03c6"+
		"\7\63\2\2\u03c6\u03c8\5\u00a0Q\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2"+
		"\2\u03c8\u03ea\3\2\2\2\u03c9\u03ca\7\u0082\2\2\u03ca\u03cc\7k\2\2\u03cb"+
		"\u03cd\t\6\2\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2"+
		"\2\2\u03ce\u03d0\5P)\2\u03cf\u03d1\7&\2\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1"+
		"\3\2\2\2\u03d1\u03eb\3\2\2\2\u03d2\u03d4\7u\2\2\u03d3\u03d2\3\2\2\2\u03d3"+
		"\u03d4\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\7x\2\2\u03d6\u03eb\5P)"+
		"\2\u03d7\u03d8\7\u00a2\2\2\u03d8\u03eb\5P)\2\u03d9\u03da\7.\2\2\u03da"+
		"\u03db\7\5\2\2\u03db\u03dc\5T+\2\u03dc\u03dd\7\6\2\2\u03dd\u03eb\3\2\2"+
		"\2\u03de\u03e5\7=\2\2\u03df\u03e6\5\u0092J\2\u03e0\u03e6\5\u0094K\2\u03e1"+
		"\u03e2\7\5\2\2\u03e2\u03e3\5T+\2\u03e3\u03e4\7\6\2\2\u03e4\u03e6\3\2\2"+
		"\2\u03e5\u03df\3\2\2\2\u03e5\u03e0\3\2\2\2\u03e5\u03e1\3\2\2\2\u03e6\u03eb"+
		"\3\2\2\2\u03e7\u03e8\7/\2\2\u03e8\u03eb\5\u00c8e\2\u03e9\u03eb\5\\/\2"+
		"\u03ea\u03c9\3\2\2\2\u03ea\u03d3\3\2\2\2\u03ea\u03d7\3\2\2\2\u03ea\u03d9"+
		"\3\2\2\2\u03ea\u03de\3\2\2\2\u03ea\u03e7\3\2\2\2\u03ea\u03e9\3\2\2\2\u03eb"+
		"O\3\2\2\2\u03ec\u03ed\7|\2\2\u03ed\u03ee\7\62\2\2\u03ee\u03f0\t\7\2\2"+
		"\u03ef\u03ec\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0Q\3\2\2\2\u03f1\u03f2\b"+
		"*\1\2\u03f2\u041a\5\u0094K\2\u03f3\u041a\7\u00b0\2\2\u03f4\u041a\5V,\2"+
		"\u03f5\u03f6\5\u0096L\2\u03f6\u03f7\5R*\25\u03f7\u041a\3\2\2\2\u03f8\u041a"+
		"\5\u00a4S\2\u03f9\u041a\5\u00a8U\2\u03fa\u03fb\7\5\2\2\u03fb\u03fc\5R"+
		"*\2\u03fc\u03fd\7\6\2\2\u03fd\u041a\3\2\2\2\u03fe\u03ff\7-\2\2\u03ff\u0400"+
		"\7\5\2\2\u0400\u0401\5R*\2\u0401\u0402\7#\2\2\u0402\u0403\5L\'\2\u0403"+
		"\u0404\7\6\2\2\u0404\u041a\3\2\2\2\u0405\u0407\7,\2\2\u0406\u0408\5R*"+
		"\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040e\3\2\2\2\u0409\u040a"+
		"\7\u00a9\2\2\u040a\u040b\5R*\2\u040b\u040c\7\u0097\2\2\u040c\u040d\5R"+
		"*\2\u040d\u040f\3\2\2\2\u040e\u0409\3\2\2\2\u040f\u0410\3\2\2\2\u0410"+
		"\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0414\3\2\2\2\u0412\u0413\7F"+
		"\2\2\u0413\u0415\5R*\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416"+
		"\3\2\2\2\u0416\u0417\7G\2\2\u0417\u041a\3\2\2\2\u0418\u041a\5^\60\2\u0419"+
		"\u03f1\3\2\2\2\u0419\u03f3\3\2\2\2\u0419\u03f4\3\2\2\2\u0419\u03f5\3\2"+
		"\2\2\u0419\u03f8\3\2\2\2\u0419\u03f9\3\2\2\2\u0419\u03fa\3\2\2\2\u0419"+
		"\u03fe\3\2\2\2\u0419\u0405\3\2\2\2\u0419\u0418\3\2\2\2\u041a\u0457\3\2"+
		"\2\2\u041b\u041c\f\24\2\2\u041c\u041d\7\r\2\2\u041d\u0456\5R*\25\u041e"+
		"\u041f\f\23\2\2\u041f\u0420\t\b\2\2\u0420\u0456\5R*\24\u0421\u0422\f\22"+
		"\2\2\u0422\u0423\t\t\2\2\u0423\u0456\5R*\23\u0424\u0425\f\21\2\2\u0425"+
		"\u0426\t\n\2\2\u0426\u0456\5R*\22\u0427\u0428\f\20\2\2\u0428\u0429\t\13"+
		"\2\2\u0429\u0456\5R*\21\u042a\u042b\f\17\2\2\u042b\u042c\5Z.\2\u042c\u042d"+
		"\5R*\20\u042d\u0456\3\2\2\2\u042e\u042f\f\16\2\2\u042f\u0430\5\u00b0Y"+
		"\2\u0430\u0431\5R*\17\u0431\u0456\3\2\2\2\u0432\u0433\f\6\2\2\u0433\u0435"+
		"\7e\2\2\u0434\u0436\7u\2\2\u0435\u0434\3\2\2\2\u0435\u0436\3\2\2\2\u0436"+
		"\u0437\3\2\2\2\u0437\u0456\5R*\7\u0438\u043a\f\5\2\2\u0439\u043b\7u\2"+
		"\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d"+
		"\7)\2\2\u043d\u043e\5R*\2\u043e\u043f\7\"\2\2\u043f\u0440\5R*\6\u0440"+
		"\u0456\3\2\2\2\u0441\u0442\f\t\2\2\u0442\u0443\7/\2\2\u0443\u0456\5\u00c8"+
		"e\2\u0444\u0446\f\b\2\2\u0445\u0447\7u\2\2\u0446\u0445\3\2\2\2\u0446\u0447"+
		"\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\t\f\2\2\u0449\u044c\5R*\2\u044a"+
		"\u044b\7H\2\2\u044b\u044d\5R*\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2"+
		"\2\u044d\u0456\3\2\2\2\u044e\u0453\f\7\2\2\u044f\u0454\7h\2\2\u0450\u0454"+
		"\7w\2\2\u0451\u0452\7u\2\2\u0452\u0454\7x\2\2\u0453\u044f\3\2\2\2\u0453"+
		"\u0450\3\2\2\2\u0453\u0451\3\2\2\2\u0454\u0456\3\2\2\2\u0455\u041b\3\2"+
		"\2\2\u0455\u041e\3\2\2\2\u0455\u0421\3\2\2\2\u0455\u0424\3\2\2\2\u0455"+
		"\u0427\3\2\2\2\u0455\u042a\3\2\2\2\u0455\u042e\3\2\2\2\u0455\u0432\3\2"+
		"\2\2\u0455\u0438\3\2\2\2\u0455\u0441\3\2\2\2\u0455\u0444\3\2\2\2\u0455"+
		"\u044e\3\2\2\2\u0456\u0459\3\2\2\2\u0457\u0455\3\2\2\2\u0457\u0458\3\2"+
		"\2\2\u0458S\3\2\2\2\u0459\u0457\3\2\2\2\u045a\u045b\b+\1\2\u045b\u0493"+
		"\5\u0094K\2\u045c\u0493\7\u00b0\2\2\u045d\u0493\5V,\2\u045e\u045f\5\u0096"+
		"L\2\u045f\u0460\5T+\27\u0460\u0493\3\2\2\2\u0461\u0493\5\u00a4S\2\u0462"+
		"\u0493\5\u00a8U\2\u0463\u0464\7\5\2\2\u0464\u0465\5T+\2\u0465\u0466\7"+
		"\6\2\2\u0466\u0493\3\2\2\2\u0467\u0468\7-\2\2\u0468\u0469\7\5\2\2\u0469"+
		"\u046a\5T+\2\u046a\u046b\7#\2\2\u046b\u046c\5L\'\2\u046c\u046d\7\6\2\2"+
		"\u046d\u0493\3\2\2\2\u046e\u0470\7u\2\2\u046f\u046e\3\2\2\2\u046f\u0470"+
		"\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0473\7K\2\2\u0472\u046f\3\2\2\2\u0472"+
		"\u0473\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\7\5\2\2\u0475\u0476\5B"+
		"\"\2\u0476\u0477\7\6\2\2\u0477\u0493\3\2\2\2\u0478\u047a\7,\2\2\u0479"+
		"\u047b\5T+\2\u047a\u0479\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u0481\3\2\2"+
		"\2\u047c\u047d\7\u00a9\2\2\u047d\u047e\5T+\2\u047e\u047f\7\u0097\2\2\u047f"+
		"\u0480\5T+\2\u0480\u0482\3\2\2\2\u0481\u047c\3\2\2\2\u0482\u0483\3\2\2"+
		"\2\u0483\u0481\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0487\3\2\2\2\u0485\u0486"+
		"\7F\2\2\u0486\u0488\5T+\2\u0487\u0485\3\2\2\2\u0487\u0488\3\2\2\2\u0488"+
		"\u0489\3\2\2\2\u0489\u048a\7G\2\2\u048a\u0493\3\2\2\2\u048b\u048c\7M\2"+
		"\2\u048c\u048d\7\5\2\2\u048d\u048e\t\r\2\2\u048e\u048f\7R\2\2\u048f\u0490"+
		"\5T+\2\u0490\u0491\7\6\2\2\u0491\u0493\3\2\2\2\u0492\u045a\3\2\2\2\u0492"+
		"\u045c\3\2\2\2\u0492\u045d\3\2\2\2\u0492\u045e\3\2\2\2\u0492\u0461\3\2"+
		"\2\2\u0492\u0462\3\2\2\2\u0492\u0463\3\2\2\2\u0492\u0467\3\2\2\2\u0492"+
		"\u0472\3\2\2\2\u0492\u0478\3\2\2\2\u0492\u048b\3\2\2\2\u0493\u04ea\3\2"+
		"\2\2\u0494\u0495\f\26\2\2\u0495\u0496\7\r\2\2\u0496\u04e9\5T+\27\u0497"+
		"\u0498\f\25\2\2\u0498\u0499\t\b\2\2\u0499\u04e9\5T+\26\u049a\u049b\f\24"+
		"\2\2\u049b\u049c\t\t\2\2\u049c\u04e9\5T+\25\u049d\u049e\f\23\2\2\u049e"+
		"\u049f\t\n\2\2\u049f\u04e9\5T+\24\u04a0\u04a1\f\22\2\2\u04a1\u04a2\t\13"+
		"\2\2\u04a2\u04e9\5T+\23\u04a3\u04a4\f\21\2\2\u04a4\u04a5\5Z.\2\u04a5\u04a6"+
		"\5T+\22\u04a6\u04e9\3\2\2\2\u04a7\u04a8\f\20\2\2\u04a8\u04a9\5\u00b0Y"+
		"\2\u04a9\u04aa\5T+\21\u04aa\u04e9\3\2\2\2\u04ab\u04ac\f\b\2\2\u04ac\u04ae"+
		"\7e\2\2\u04ad\u04af\7u\2\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af"+
		"\u04b0\3\2\2\2\u04b0\u04e9\5T+\t\u04b1\u04b3\f\7\2\2\u04b2\u04b4\7u\2"+
		"\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6"+
		"\7)\2\2\u04b6\u04b7\5T+\2\u04b7\u04b8\7\"\2\2\u04b8\u04b9\5T+\b\u04b9"+
		"\u04e9\3\2\2\2\u04ba\u04bb\f\13\2\2\u04bb\u04bc\7/\2\2\u04bc\u04e9\5\u00c8"+
		"e\2\u04bd\u04bf\f\n\2\2\u04be\u04c0\7u\2\2\u04bf\u04be\3\2\2\2\u04bf\u04c0"+
		"\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\t\f\2\2\u04c2\u04c5\5T+\2\u04c3"+
		"\u04c4\7H\2\2\u04c4\u04c6\5T+\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2"+
		"\2\u04c6\u04e9\3\2\2\2\u04c7\u04cc\f\t\2\2\u04c8\u04cd\7h\2\2\u04c9\u04cd"+
		"\7w\2\2\u04ca\u04cb\7u\2\2\u04cb\u04cd\7x\2\2\u04cc\u04c8\3\2\2\2\u04cc"+
		"\u04c9\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cd\u04e9\3\2\2\2\u04ce\u04d0\f\6"+
		"\2\2\u04cf\u04d1\7u\2\2\u04d0\u04cf\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1"+
		"\u04d2\3\2\2\2\u04d2\u04e6\7\\\2\2\u04d3\u04dd\7\5\2\2\u04d4\u04de\5B"+
		"\"\2\u04d5\u04da\5T+\2\u04d6\u04d7\7\7\2\2\u04d7\u04d9\5T+\2\u04d8\u04d6"+
		"\3\2\2\2\u04d9\u04dc\3\2\2\2\u04da\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db"+
		"\u04de\3\2\2\2\u04dc\u04da\3\2\2\2\u04dd\u04d4\3\2\2\2\u04dd\u04d5\3\2"+
		"\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e7\7\6\2\2\u04e0"+
		"\u04e1\5\u00bc_\2\u04e1\u04e2\7\4\2\2\u04e2\u04e4\3\2\2\2\u04e3\u04e0"+
		"\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e7\5\u00c0a"+
		"\2\u04e6\u04d3\3\2\2\2\u04e6\u04e3\3\2\2\2\u04e7\u04e9\3\2\2\2\u04e8\u0494"+
		"\3\2\2\2\u04e8\u0497\3\2\2\2\u04e8\u049a\3\2\2\2\u04e8\u049d\3\2\2\2\u04e8"+
		"\u04a0\3\2\2\2\u04e8\u04a3\3\2\2\2\u04e8\u04a7\3\2\2\2\u04e8\u04ab\3\2"+
		"\2\2\u04e8\u04b1\3\2\2\2\u04e8\u04ba\3\2\2\2\u04e8\u04bd\3\2\2\2\u04e8"+
		"\u04c7\3\2\2\2\u04e8\u04ce\3\2\2\2\u04e9\u04ec\3\2\2\2\u04ea\u04e8\3\2"+
		"\2\2\u04ea\u04eb\3\2\2\2\u04ebU\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ed\u0500"+
		"\3\2\2\2\u04ee\u04ef\5\u00bc_\2\u04ef\u04f0\7\4\2\2\u04f0\u04f2\3\2\2"+
		"\2\u04f1\u04ee\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4"+
		"\5\u00c0a\2\u04f4\u04f5\7\4\2\2\u04f5\u04f7\3\2\2\2\u04f6\u04f1\3\2\2"+
		"\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fd\5\u00c6d\2\u04f9"+
		"\u04fb\7#\2\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\3\2"+
		"\2\2\u04fc\u04fe\5\u009cO\2\u04fd\u04fa\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe"+
		"\u0500\3\2\2\2\u04ff\u04ed\3\2\2\2\u04ff\u04f6\3\2\2\2\u0500W\3\2\2\2"+
		"\u0501\u0517\3\2\2\2\u0502\u0503\5\u00bc_\2\u0503\u0504\7\4\2\2\u0504"+
		"\u0506\3\2\2\2\u0505\u0502\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507\3\2"+
		"\2\2\u0507\u0508\5\u00c0a\2\u0508\u0509\7\4\2\2\u0509\u050b\3\2\2\2\u050a"+
		"\u0505\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050e\5\u00c6"+
		"d\2\u050d\u050f\5p9\2\u050e\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0514"+
		"\3\2\2\2\u0510\u0512\7#\2\2\u0511\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512"+
		"\u0513\3\2\2\2\u0513\u0515\5\u009cO\2\u0514\u0511\3\2\2\2\u0514\u0515"+
		"\3\2\2\2\u0515\u0517\3\2\2\2\u0516\u0501\3\2\2\2\u0516\u050a\3\2\2\2\u0517"+
		"Y\3\2\2\2\u0518\u0525\7\b\2\2\u0519\u0525\7\30\2\2\u051a\u0525\7\31\2"+
		"\2\u051b\u0525\7\32\2\2\u051c\u0525\7e\2\2\u051d\u051e\7e\2\2\u051e\u0525"+
		"\7u\2\2\u051f\u0525\5\u00b4[\2\u0520\u0525\5\u00b6\\\2\u0521\u0525\7T"+
		"\2\2\u0522\u0525\7o\2\2\u0523\u0525\7\u0087\2\2\u0524\u0518\3\2\2\2\u0524"+
		"\u0519\3\2\2\2\u0524\u051a\3\2\2\2\u0524\u051b\3\2\2\2\u0524\u051c\3\2"+
		"\2\2\u0524\u051d\3\2\2\2\u0524\u051f\3\2\2\2\u0524\u0520\3\2\2\2\u0524"+
		"\u0521\3\2\2\2\u0524\u0522\3\2\2\2\u0524\u0523\3\2\2\2\u0525[\3\2\2\2"+
		"\u0526\u0527\7\u0086\2\2\u0527\u0533\5\u00caf\2\u0528\u0529\7\5\2\2\u0529"+
		"\u052e\5\u00c6d\2\u052a\u052b\7\7\2\2\u052b\u052d\5\u00c6d\2\u052c\u052a"+
		"\3\2\2\2\u052d\u0530\3\2\2\2\u052e\u052c\3\2\2\2\u052e\u052f\3\2\2\2\u052f"+
		"\u0531\3\2\2\2\u0530\u052e\3\2\2\2\u0531\u0532\7\6\2\2\u0532\u0534\3\2"+
		"\2\2\u0533\u0528\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0547\3\2\2\2\u0535"+
		"\u0536\7|\2\2\u0536\u053f\t\16\2\2\u0537\u0538\7\u0093\2\2\u0538\u0540"+
		"\7x\2\2\u0539\u053a\7\u0093\2\2\u053a\u0540\7=\2\2\u053b\u0540\7+\2\2"+
		"\u053c\u0540\7\u008c\2\2\u053d\u053e\7t\2\2\u053e\u0540\7\34\2\2\u053f"+
		"\u0537\3\2\2\2\u053f\u0539\3\2\2\2\u053f\u053b\3\2\2\2\u053f\u053c\3\2"+
		"\2\2\u053f\u053d\3\2\2\2\u0540\u0544\3\2\2\2\u0541\u0542\7o\2\2\u0542"+
		"\u0544\5\u00a0Q\2\u0543\u0535\3\2\2\2\u0543\u0541\3\2\2\2\u0544\u0546"+
		"\3\2\2\2\u0545\u0543\3\2\2\2\u0546\u0549\3\2\2\2\u0547\u0545\3\2\2\2\u0547"+
		"\u0548\3\2\2\2\u0548\u0554\3\2\2\2\u0549\u0547\3\2\2\2\u054a\u054c\7u"+
		"\2\2\u054b\u054a\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054d\3\2\2\2\u054d"+
		"\u0552\7>\2\2\u054e\u054f\7_\2\2\u054f\u0553\7?\2\2\u0550\u0551\7_\2\2"+
		"\u0551\u0553\7[\2\2\u0552\u054e\3\2\2\2\u0552\u0550\3\2\2\2\u0552\u0553"+
		"\3\2\2\2\u0553\u0555\3\2\2\2\u0554\u054b\3\2\2\2\u0554\u0555\3\2\2\2\u0555"+
		"]\3\2\2\2\u0556\u0557\7\u0084\2\2\u0557\u055c\7\5\2\2\u0558\u055d\7Z\2"+
		"\2\u0559\u055a\t\17\2\2\u055a\u055b\7\7\2\2\u055b\u055d\5\u0098M\2\u055c"+
		"\u0558\3\2\2\2\u055c\u0559\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f\7\6"+
		"\2\2\u055f_\3\2\2\2\u0560\u0563\5\u00c6d\2\u0561\u0562\7/\2\2\u0562\u0564"+
		"\5\u00c8e\2\u0563\u0561\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0566\3\2\2"+
		"\2\u0565\u0567\t\6\2\2\u0566\u0565\3\2\2\2\u0566\u0567\3\2\2\2\u0567a"+
		"\3\2\2\2\u0568\u0569\7\63\2\2\u0569\u056b\5\u00a0Q\2\u056a\u0568\3\2\2"+
		"\2\u056a\u056b\3\2\2\2\u056b\u0590\3\2\2\2\u056c\u056d\7\u0082\2\2\u056d"+
		"\u0570\7k\2\2\u056e\u0570\7\u00a2\2\2\u056f\u056c\3\2\2\2\u056f\u056e"+
		"\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572\7\5\2\2\u0572\u0577\5`\61\2\u0573"+
		"\u0574\7\7\2\2\u0574\u0576\5`\61\2\u0575\u0573\3\2\2\2\u0576\u0579\3\2"+
		"\2\2\u0577\u0575\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u057a\3\2\2\2\u0579"+
		"\u0577\3\2\2\2\u057a\u057b\7\6\2\2\u057b\u057c\5P)\2\u057c\u0591\3\2\2"+
		"\2\u057d\u057e\7.\2\2\u057e\u057f\7\5\2\2\u057f\u0580\5T+\2\u0580\u0581"+
		"\7\6\2\2\u0581\u0591\3\2\2\2\u0582\u0583\7Q\2\2\u0583\u0584\7k\2\2\u0584"+
		"\u0585\7\5\2\2\u0585\u058a\5\u00c6d\2\u0586\u0587\7\7\2\2\u0587\u0589"+
		"\5\u00c6d\2\u0588\u0586\3\2\2\2\u0589\u058c\3\2\2\2\u058a\u0588\3\2\2"+
		"\2\u058a\u058b\3\2\2\2\u058b\u058d\3\2\2\2\u058c\u058a\3\2\2\2\u058d\u058e"+
		"\7\6\2\2\u058e\u058f\5\\/\2\u058f\u0591\3\2\2\2\u0590\u056f\3\2\2\2\u0590"+
		"\u057d\3\2\2\2\u0590\u0582\3\2\2\2\u0591c\3\2\2\2\u0592\u0594\7\u00ab"+
		"\2\2\u0593\u0595\7\u0085\2\2\u0594\u0593\3\2\2\2\u0594\u0595\3\2\2\2\u0595"+
		"\u0596\3\2\2\2\u0596\u0597\5\u0090I\2\u0597\u0598\7#\2\2\u0598\u0599\7"+
		"\5\2\2\u0599\u059a\5B\"\2\u059a\u05a4\7\6\2\2\u059b\u059c\7\7\2\2\u059c"+
		"\u059d\5\u0090I\2\u059d\u059e\7#\2\2\u059e\u059f\7\5\2\2\u059f\u05a0\5"+
		"B\"\2\u05a0\u05a1\7\6\2\2\u05a1\u05a3\3\2\2\2\u05a2\u059b\3\2\2\2\u05a3"+
		"\u05a6\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5e\3\2\2\2"+
		"\u05a6\u05a4\3\2\2\2\u05a7\u05a8\5\u00bc_\2\u05a8\u05a9\7\4\2\2\u05a9"+
		"\u05ab\3\2\2\2\u05aa\u05a7\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ac\3\2"+
		"\2\2\u05ac\u05b2\5\u00c0a\2\u05ad\u05ae\7^\2\2\u05ae\u05af\7*\2\2\u05af"+
		"\u05b3\5\u00ccg\2\u05b0\u05b1\7u\2\2\u05b1\u05b3\7^\2\2\u05b2\u05ad\3"+
		"\2\2\2\u05b2\u05b0\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3g\3\2\2\2\u05b4\u05b7"+
		"\5T+\2\u05b5\u05b6\7/\2\2\u05b6\u05b8\5\u00c8e\2\u05b7\u05b5\3\2\2\2\u05b7"+
		"\u05b8\3\2\2\2\u05b8\u05ba\3\2\2\2\u05b9\u05bb\t\6\2\2\u05ba\u05b9\3\2"+
		"\2\2\u05ba\u05bb\3\2\2\2\u05bbi\3\2\2\2\u05bc\u05c0\5\u0092J\2\u05bd\u05c0"+
		"\5\u00a0Q\2\u05be\u05c0\7\u00b1\2\2\u05bf\u05bc\3\2\2\2\u05bf\u05bd\3"+
		"\2\2\2\u05bf\u05be\3\2\2\2\u05c0k\3\2\2\2\u05c1\u05cd\5\u00c0a\2\u05c2"+
		"\u05c3\7\5\2\2\u05c3\u05c8\5\u00c6d\2\u05c4\u05c5\7\7\2\2\u05c5\u05c7"+
		"\5\u00c6d\2\u05c6\u05c4\3\2\2\2\u05c7\u05ca\3\2\2\2\u05c8\u05c6\3\2\2"+
		"\2\u05c8\u05c9\3\2\2\2\u05c9\u05cb\3\2\2\2\u05ca\u05c8\3\2\2\2\u05cb\u05cc"+
		"\7\6\2\2\u05cc\u05ce\3\2\2\2\u05cd\u05c2\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce"+
		"\u05cf\3\2\2\2\u05cf\u05d0\7#\2\2\u05d0\u05d1\7\5\2\2\u05d1\u05d2\5B\""+
		"\2\u05d2\u05d3\7\6\2\2\u05d3m\3\2\2\2\u05d4\u05e4\7\t\2\2\u05d5\u05d6"+
		"\5\u00c0a\2\u05d6\u05d7\7\4\2\2\u05d7\u05d8\7\t\2\2\u05d8\u05e4\3\2\2"+
		"\2\u05d9\u05e4\5X-\2\u05da\u05e4\5\u00a2R\2\u05db\u05e4\5\u00a6T\2\u05dc"+
		"\u05e1\5R*\2\u05dd\u05df\7#\2\2\u05de\u05dd\3\2\2\2\u05de\u05df\3\2\2"+
		"\2\u05df\u05e0\3\2\2\2\u05e0\u05e2\5\u009cO\2\u05e1\u05de\3\2\2\2\u05e1"+
		"\u05e2\3\2\2\2\u05e2\u05e4\3\2\2\2\u05e3\u05d4\3\2\2\2\u05e3\u05d5\3\2"+
		"\2\2\u05e3\u05d9\3\2\2\2\u05e3\u05da\3\2\2\2\u05e3\u05db\3\2\2\2\u05e3"+
		"\u05dc\3\2\2\2\u05e4o\3\2\2\2\u05e5\u05e6\7\24\2\2\u05e6\u05e8\7Y\2\2"+
		"\u05e7\u05e9\5r:\2\u05e8\u05e7\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05ea"+
		"\3\2\2\2\u05ea\u05ef\7\26\2\2\u05eb\u05ec\7\24\2\2\u05ec\u05ed\7v\2\2"+
		"\u05ed\u05ef\7\26\2\2\u05ee\u05e5\3\2\2\2\u05ee\u05eb\3\2\2\2\u05efq\3"+
		"\2\2\2\u05f0\u05f2\5v<\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2"+
		"\u05f4\3\2\2\2\u05f3\u05f5\5x=\2\u05f4\u05f3\3\2\2\2\u05f4\u05f5\3\2\2"+
		"\2\u05f5\u05f7\3\2\2\2\u05f6\u05f8\5~@\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8"+
		"\3\2\2\2\u05f8\u05fa\3\2\2\2\u05f9\u05fb\5t;\2\u05fa\u05f9\3\2\2\2\u05fa"+
		"\u05fb\3\2\2\2\u05fbs\3\2\2\2\u05fc\u05fd\7i\2\2\u05fdu\3\2\2\2\u05fe"+
		"\u05ff\7g\2\2\u05ff\u0600\7\b\2\2\u0600\u0601\t\20\2\2\u0601w\3\2\2\2"+
		"\u0602\u0604\7;\2\2\u0603\u0605\5|?\2\u0604\u0603\3\2\2\2\u0604\u0605"+
		"\3\2\2\2\u0605\u0609\3\2\2\2\u0606\u0607\7\u009d\2\2\u0607\u0608\7*\2"+
		"\2\u0608\u060a\5z>\2\u0609\u0606\3\2\2\2\u0609\u060a\3\2\2\2\u060ay\3"+
		"\2\2\2\u060b\u0618\3\2\2\2\u060c\u060d\5\u00bc_\2\u060d\u060e\7\4\2\2"+
		"\u060e\u0610\3\2\2\2\u060f\u060c\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0611"+
		"\3\2\2\2\u0611\u0612\5\u00c0a\2\u0612\u0613\7\4\2\2\u0613\u0615\3\2\2"+
		"\2\u0614\u060f\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0618"+
		"\5\u00c6d\2\u0617\u060b\3\2\2\2\u0617\u0614\3\2\2\2\u0618{\3\2\2\2\u0619"+
		"\u061a\7f\2\2\u061a}\3\2\2\2\u061b\u061e\7{\2\2\u061c\u061d\7\b\2\2\u061d"+
		"\u061f\t\20\2\2\u061e\u061c\3\2\2\2\u061e\u061f\3\2\2\2\u061f\177\3\2"+
		"\2\2\u0620\u0621\5\u00bc_\2\u0621\u0622\7\4\2\2\u0622\u0624\3\2\2\2\u0623"+
		"\u0620\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u062a\5\u00c0"+
		"a\2\u0626\u0628\7#\2\2\u0627\u0626\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0629"+
		"\3\2\2\2\u0629\u062b\5\u00d8m\2\u062a\u0627\3\2\2\2\u062a\u062b\3\2\2"+
		"\2\u062b\u0631\3\2\2\2\u062c\u062d\7^\2\2\u062d\u062e\7*\2\2\u062e\u0632"+
		"\5\u00ccg\2\u062f\u0630\7u\2\2\u0630\u0632\7^\2\2\u0631\u062c\3\2\2\2"+
		"\u0631\u062f\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0081\3\2\2\2\u0633\u0651"+
		"\5\u0080A\2\u0634\u063e\7\5\2\2\u0635\u063a\5\u0082B\2\u0636\u0637\7\7"+
		"\2\2\u0637\u0639\5\u0082B\2\u0638\u0636\3\2\2\2\u0639\u063c\3\2\2\2\u063a"+
		"\u0638\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u063f\3\2\2\2\u063c\u063a\3\2"+
		"\2\2\u063d\u063f\5\u0084C\2\u063e\u0635\3\2\2\2\u063e\u063d\3\2\2\2\u063f"+
		"\u0640\3\2\2\2\u0640\u0645\7\6\2\2\u0641\u0643\7#\2\2\u0642\u0641\3\2"+
		"\2\2\u0642\u0643\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0646\5\u00d8m\2\u0645"+
		"\u0642\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0651\3\2\2\2\u0647\u0648\7\5"+
		"\2\2\u0648\u0649\5B\"\2\u0649\u064e\7\6\2\2\u064a\u064c\7#\2\2\u064b\u064a"+
		"\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064f\5\u00d8m"+
		"\2\u064e\u064b\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0651\3\2\2\2\u0650\u0633"+
		"\3\2\2\2\u0650\u0634\3\2\2\2\u0650\u0647\3\2\2\2\u0651\u0083\3\2\2\2\u0652"+
		"\u0659\5\u0082B\2\u0653\u0654\5\u0086D\2\u0654\u0655\5\u0082B\2\u0655"+
		"\u0656\5\u0088E\2\u0656\u0658\3\2\2\2\u0657\u0653\3\2\2\2\u0658\u065b"+
		"\3\2\2\2\u0659\u0657\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u0085\3\2\2\2\u065b"+
		"\u0659\3\2\2\2\u065c\u066a\7\7\2\2\u065d\u065f\7s\2\2\u065e\u065d\3\2"+
		"\2\2\u065e\u065f\3\2\2\2\u065f\u0666\3\2\2\2\u0660\u0662\7l\2\2\u0661"+
		"\u0663\7\177\2\2\u0662\u0661\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0667\3"+
		"\2\2\2\u0664\u0667\7`\2\2\u0665\u0667\7\66\2\2\u0666\u0660\3\2\2\2\u0666"+
		"\u0664\3\2\2\2\u0666\u0665\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u0668\3\2"+
		"\2\2\u0668\u066a\7j\2\2\u0669\u065c\3\2\2\2\u0669\u065e\3\2\2\2\u066a"+
		"\u0087\3\2\2\2\u066b\u066c\7|\2\2\u066c\u067a\5T+\2\u066d\u066e\7\u00a4"+
		"\2\2\u066e\u066f\7\5\2\2\u066f\u0674\5\u00c6d\2\u0670\u0671\7\7\2\2\u0671"+
		"\u0673\5\u00c6d\2\u0672\u0670\3\2\2\2\u0673\u0676\3\2\2\2\u0674\u0672"+
		"\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0677\3\2\2\2\u0676\u0674\3\2\2\2\u0677"+
		"\u0678\7\6\2\2\u0678\u067a\3\2\2\2\u0679\u066b\3\2\2\2\u0679\u066d\3\2"+
		"\2\2\u0679\u067a\3\2\2\2\u067a\u0089\3\2\2\2\u067b\u067d\7\u0092\2\2\u067c"+
		"\u067e\t\21\2\2\u067d\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u067f\3"+
		"\2\2\2\u067f\u0684\5n8\2\u0680\u0681\7\7\2\2\u0681\u0683\5n8\2\u0682\u0680"+
		"\3\2\2\2\u0683\u0686\3\2\2\2\u0684\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685"+
		"\u0688\3\2\2\2\u0686\u0684\3\2\2\2\u0687\u0689\5\u008cG\2\u0688\u0687"+
		"\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068c\3\2\2\2\u068a\u068b\7\u00aa\2"+
		"\2\u068b\u068d\5T+\2\u068c\u068a\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u06a2"+
		"\3\2\2\2\u068e\u068f\7U\2\2\u068f\u0692\7*\2\2\u0690\u0693\5V,\2\u0691"+
		"\u0693\5\u00a8U\2\u0692\u0690\3\2\2\2\u0692\u0691\3\2\2\2\u0693\u069b"+
		"\3\2\2\2\u0694\u0697\7\7\2\2\u0695\u0698\5V,\2\u0696\u0698\5\u00a8U\2"+
		"\u0697\u0695\3\2\2\2\u0697\u0696\3\2\2\2\u0698\u069a\3\2\2\2\u0699\u0694"+
		"\3\2\2\2\u069a\u069d\3\2\2\2\u069b\u0699\3\2\2\2\u069b\u069c\3\2\2\2\u069c"+
		"\u06a0\3\2\2\2\u069d\u069b\3\2\2\2\u069e\u069f\7V\2\2\u069f\u06a1\5T+"+
		"\2\u06a0\u069e\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a3\3\2\2\2\u06a2\u068e"+
		"\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06c1\3\2\2\2\u06a4\u06a5\7\u00a6\2"+
		"\2\u06a5\u06a6\7\5\2\2\u06a6\u06ab\5T+\2\u06a7\u06a8\7\7\2\2\u06a8\u06aa"+
		"\5T+\2\u06a9\u06a7\3\2\2\2\u06aa\u06ad\3\2\2\2\u06ab\u06a9\3\2\2\2\u06ab"+
		"\u06ac\3\2\2\2\u06ac\u06ae\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ae\u06bd\7\6"+
		"\2\2\u06af\u06b0\7\7\2\2\u06b0\u06b1\7\5\2\2\u06b1\u06b6\5T+\2\u06b2\u06b3"+
		"\7\7\2\2\u06b3\u06b5\5T+\2\u06b4\u06b2\3\2\2\2\u06b5\u06b8\3\2\2\2\u06b6"+
		"\u06b4\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b9\3\2\2\2\u06b8\u06b6\3\2"+
		"\2\2\u06b9\u06ba\7\6\2\2\u06ba\u06bc\3\2\2\2\u06bb\u06af\3\2\2\2\u06bc"+
		"\u06bf\3\2\2\2\u06bd\u06bb\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06c1\3\2"+
		"\2\2\u06bf\u06bd\3\2\2\2\u06c0\u067b\3\2\2\2\u06c0\u06a4\3\2\2\2\u06c1"+
		"\u008b\3\2\2\2\u06c2\u06cc\7R\2\2\u06c3\u06c8\5\u0082B\2\u06c4\u06c5\7"+
		"\7\2\2\u06c5\u06c7\5\u0082B\2\u06c6\u06c4\3\2\2\2\u06c7\u06ca\3\2\2\2"+
		"\u06c8\u06c6\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06cd\3\2\2\2\u06ca\u06c8"+
		"\3\2\2\2\u06cb\u06cd\5\u0084C\2\u06cc\u06c3\3\2\2\2\u06cc\u06cb\3\2\2"+
		"\2\u06cd\u008d\3\2\2\2\u06ce\u06d5\7\u00a1\2\2\u06cf\u06d0\7\u00a1\2\2"+
		"\u06d0\u06d5\7\37\2\2\u06d1\u06d5\7c\2\2\u06d2\u06d5\7I\2\2\u06d3\u06d5"+
		"\7p\2\2\u06d4\u06ce\3\2\2\2\u06d4\u06cf\3\2\2\2\u06d4\u06d1\3\2\2\2\u06d4"+
		"\u06d2\3\2\2\2\u06d4\u06d3\3\2\2\2\u06d5\u008f\3\2\2\2\u06d6\u06e2\5\u00c0"+
		"a\2\u06d7\u06d8\7\5\2\2\u06d8\u06dd\5\u00c6d\2\u06d9\u06da\7\7\2\2\u06da"+
		"\u06dc\5\u00c6d\2\u06db\u06d9\3\2\2\2\u06dc\u06df\3\2\2\2\u06dd\u06db"+
		"\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06e0\3\2\2\2\u06df\u06dd\3\2\2\2\u06e0"+
		"\u06e1\7\6\2\2\u06e1\u06e3\3\2\2\2\u06e2\u06d7\3\2\2\2\u06e2\u06e3\3\2"+
		"\2\2\u06e3\u0091\3\2\2\2\u06e4\u06e6\t\t\2\2\u06e5\u06e4\3\2\2\2\u06e5"+
		"\u06e6\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e8\7\u00af\2\2\u06e8\u0093"+
		"\3\2\2\2\u06e9\u06ea\t\22\2\2\u06ea\u0095\3\2\2\2\u06eb\u06ec\t\23\2\2"+
		"\u06ec\u0097\3\2\2\2\u06ed\u06ee\7\u00b1\2\2\u06ee\u0099\3\2\2\2\u06ef"+
		"\u06f2\5T+\2\u06f0\u06f2\5J&\2\u06f1\u06ef\3\2\2\2\u06f1\u06f0\3\2\2\2"+
		"\u06f2\u009b\3\2\2\2\u06f3\u06f4\t\24\2\2\u06f4\u009d\3\2\2\2\u06f5\u06f6"+
		"\t\25\2\2\u06f6\u009f\3\2\2\2\u06f7\u06f8\5\u00dco\2\u06f8\u00a1\3\2\2"+
		"\2\u06f9\u06fa\7\64\2\2\u06fa\u0704\7\5\2\2\u06fb\u06fd\5\u00b8]\2\u06fc"+
		"\u06fb\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0705\5X"+
		"-\2\u06ff\u0705\7\t\2\2\u0700\u0702\7C\2\2\u0701\u0700\3\2\2\2\u0701\u0702"+
		"\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0705\5\u00a8U\2\u0704\u06fc\3\2\2"+
		"\2\u0704\u06ff\3\2\2\2\u0704\u0701\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0706"+
		"\3\2\2\2\u0706\u0708\7\6\2\2\u0707\u0709\5p9\2\u0708\u0707\3\2\2\2\u0708"+
		"\u0709\3\2\2\2\u0709\u070e\3\2\2\2\u070a\u070c\7#\2\2\u070b\u070a\3\2"+
		"\2\2\u070b\u070c\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u070f\5\u009cO\2\u070e"+
		"\u070b\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u00a3\3\2\2\2\u0710\u0711\7\64"+
		"\2\2\u0711\u071b\7\5\2\2\u0712\u0714\5\u00b8]\2\u0713\u0712\3\2\2\2\u0713"+
		"\u0714\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u071c\5V,\2\u0716\u071c\7\t\2"+
		"\2\u0717\u0719\7C\2\2\u0718\u0717\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u071a"+
		"\3\2\2\2\u071a\u071c\5\u00a8U\2\u071b\u0713\3\2\2\2\u071b\u0716\3\2\2"+
		"\2\u071b\u0718\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u071f"+
		"\7\6\2\2\u071e\u0720\5p9\2\u071f\u071e\3\2\2\2\u071f\u0720\3\2\2\2\u0720"+
		"\u0725\3\2\2\2\u0721\u0723\7#\2\2\u0722\u0721\3\2\2\2\u0722\u0723\3\2"+
		"\2\2\u0723\u0724\3\2\2\2\u0724\u0726\5\u009cO\2\u0725\u0722\3\2\2\2\u0725"+
		"\u0726\3\2\2\2\u0726\u00a5\3\2\2\2\u0727\u0728\5\u00ba^\2\u0728\u073f"+
		"\7\5\2\2\u0729\u072b\7C\2\2\u072a\u0729\3\2\2\2\u072a\u072b\3\2\2\2\u072b"+
		"\u0730\3\2\2\2\u072c\u0731\5X-\2\u072d\u0731\5\u00a8U\2\u072e\u0731\5"+
		"\u00aaV\2\u072f\u0731\5\u0094K\2\u0730\u072c\3\2\2\2\u0730\u072d\3\2\2"+
		"\2\u0730\u072e\3\2\2\2\u0730\u072f\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u073c"+
		"\3\2\2\2\u0732\u0738\7\7\2\2\u0733\u0739\5X-\2\u0734\u0739\5\u00a8U\2"+
		"\u0735\u0739\5\u00aaV\2\u0736\u0739\5\u0094K\2\u0737\u0739\7\t\2\2\u0738"+
		"\u0733\3\2\2\2\u0738\u0734\3\2\2\2\u0738\u0735\3\2\2\2\u0738\u0736\3\2"+
		"\2\2\u0738\u0737\3\2\2\2\u0739\u073b\3\2\2\2\u073a\u0732\3\2\2\2\u073b"+
		"\u073e\3\2\2\2\u073c\u073a\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u0740\3\2"+
		"\2\2\u073e\u073c\3\2\2\2\u073f\u072a\3\2\2\2\u073f\u0740\3\2\2\2\u0740"+
		"\u0741\3\2\2\2\u0741\u0743\7\6\2\2\u0742\u0744\5p9\2\u0743\u0742\3\2\2"+
		"\2\u0743\u0744\3\2\2\2\u0744\u0749\3\2\2\2\u0745\u0747\7#\2\2\u0746\u0745"+
		"\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u074a\5\u009cO"+
		"\2\u0749\u0746\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u00a7\3\2\2\2\u074b\u074c"+
		"\5\u00ba^\2\u074c\u0763\7\5\2\2\u074d\u074f\7C\2\2\u074e\u074d\3\2\2\2"+
		"\u074e\u074f\3\2\2\2\u074f\u0754\3\2\2\2\u0750\u0755\5V,\2\u0751\u0755"+
		"\5\u00a8U\2\u0752\u0755\5\u00aaV\2\u0753\u0755\5\u0094K\2\u0754\u0750"+
		"\3\2\2\2\u0754\u0751\3\2\2\2\u0754\u0752\3\2\2\2\u0754\u0753\3\2\2\2\u0754"+
		"\u0755\3\2\2\2\u0755\u0760\3\2\2\2\u0756\u075c\7\7\2\2\u0757\u075d\5V"+
		",\2\u0758\u075d\5\u00a8U\2\u0759\u075d\5\u00aaV\2\u075a\u075d\5\u0094"+
		"K\2\u075b\u075d\7\t\2\2\u075c\u0757\3\2\2\2\u075c\u0758\3\2\2\2\u075c"+
		"\u0759\3\2\2\2\u075c\u075a\3\2\2\2\u075c\u075b\3\2\2\2\u075d\u075f\3\2"+
		"\2\2\u075e\u0756\3\2\2\2\u075f\u0762\3\2\2\2\u0760\u075e\3\2\2\2\u0760"+
		"\u0761\3\2\2\2\u0761\u0764\3\2\2\2\u0762\u0760\3\2\2\2\u0763\u074e\3\2"+
		"\2\2\u0763\u0764\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0767\7\6\2\2\u0766"+
		"\u0768\5p9\2\u0767\u0766\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u076d\3\2\2"+
		"\2\u0769\u076b\7#\2\2\u076a\u0769\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076c"+
		"\3\2\2\2\u076c\u076e\5\u009cO\2\u076d\u076a\3\2\2\2\u076d\u076e\3\2\2"+
		"\2\u076e\u00a9\3\2\2\2\u076f\u0770\bV\1\2\u0770\u0778\7\u00af\2\2\u0771"+
		"\u0778\5V,\2\u0772\u0778\5\u00a8U\2\u0773\u0774\7\5\2\2\u0774\u0775\5"+
		"\u00aaV\2\u0775\u0776\7\6\2\2\u0776\u0778\3\2\2\2\u0777\u076f\3\2\2\2"+
		"\u0777\u0771\3\2\2\2\u0777\u0772\3\2\2\2\u0777\u0773\3\2\2\2\u0778\u0781"+
		"\3\2\2\2\u0779\u077a\f\5\2\2\u077a\u077b\t\b\2\2\u077b\u0780\5\u00aaV"+
		"\6\u077c\u077d\f\4\2\2\u077d\u077e\t\t\2\2\u077e\u0780\5\u00aaV\5\u077f"+
		"\u0779\3\2\2\2\u077f\u077c\3\2\2\2\u0780\u0783\3\2\2\2\u0781\u077f\3\2"+
		"\2\2\u0781\u0782\3\2\2\2\u0782\u00ab\3\2\2\2\u0783\u0781\3\2\2\2\u0784"+
		"\u0785\7\"\2\2\u0785\u00ad\3\2\2\2\u0786\u0787\7}\2\2\u0787\u00af\3\2"+
		"\2\2\u0788\u0789\t\26\2\2\u0789\u00b1\3\2\2\2\u078a\u078b\7u\2\2\u078b"+
		"\u00b3\3\2\2\2\u078c\u078d\7\\\2\2\u078d\u00b5\3\2\2\2\u078e\u078f\7m"+
		"\2\2\u078f\u00b7\3\2\2\2\u0790\u0791\7C\2\2\u0791\u00b9\3\2\2\2\u0792"+
		"\u0793\5\u00dco\2\u0793\u00bb\3\2\2\2\u0794\u0795\5\u00dco\2\u0795\u00bd"+
		"\3\2\2\2\u0796\u0797\5\u00dco\2\u0797\u00bf\3\2\2\2\u0798\u0799\5\u00dc"+
		"o\2\u0799\u00c1\3\2\2\2\u079a\u079b\5\u00dco\2\u079b\u00c3\3\2\2\2\u079c"+
		"\u079d\5\u00dco\2\u079d\u00c5\3\2\2\2\u079e\u079f\5\u00dco\2\u079f\u00c7"+
		"\3\2\2\2\u07a0\u07a1\5\u00dco\2\u07a1\u00c9\3\2\2\2\u07a2\u07a3\5\u00dc"+
		"o\2\u07a3\u00cb\3\2\2\2\u07a4\u07a5\5\u00dco\2\u07a5\u00cd\3\2\2\2\u07a6"+
		"\u07a7\5\u00dco\2\u07a7\u00cf\3\2\2\2\u07a8\u07a9\5\u00dco\2\u07a9\u00d1"+
		"\3\2\2\2\u07aa\u07ab\5\u00dco\2\u07ab\u00d3\3\2\2\2\u07ac\u07ad\5\u00dc"+
		"o\2\u07ad\u00d5\3\2\2\2\u07ae\u07af\5\u00dco\2\u07af\u00d7\3\2\2\2\u07b0"+
		"\u07b1\5\u00dco\2\u07b1\u00d9\3\2\2\2\u07b2\u07b3\5\u00dco\2\u07b3\u00db"+
		"\3\2\2\2\u07b4\u07bc\7\u00ae\2\2\u07b5\u07bc\5\u009eP\2\u07b6\u07bc\7"+
		"\u00b1\2\2\u07b7\u07b8\7\5\2\2\u07b8\u07b9\5\u00dco\2\u07b9\u07ba\7\6"+
		"\2\2\u07ba\u07bc\3\2\2\2\u07bb\u07b4\3\2\2\2\u07bb\u07b5\3\2\2\2\u07bb"+
		"\u07b6\3\2\2\2\u07bb\u07b7\3\2\2\2\u07bc\u00dd\3\2\2\2\u07bd\u07bf\13"+
		"\2\2\2\u07be\u07bd\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0\u07be\3\2\2\2\u07c0"+
		"\u07c1\3\2\2\2\u07c1\u00df\3\2\2\2\u0113\u00e2\u00e4\u00f0\u00f6\u00fc"+
		"\u00fe\u011d\u0128\u0130\u0133\u013c\u0140\u0148\u014c\u014e\u0153\u0155"+
		"\u0159\u0160\u0163\u016b\u0174\u0177\u017d\u017f\u0183\u0189\u018e\u0199"+
		"\u019f\u01a3\u01a9\u01ae\u01b7\u01be\u01c4\u01c8\u01cc\u01d2\u01d7\u01de"+
		"\u01e9\u01ec\u01ee\u01f4\u01fa\u01fe\u0205\u020b\u0211\u0217\u021c\u0228"+
		"\u022d\u0238\u023d\u0240\u0246\u0249\u024f\u0258\u025b\u0261\u0263\u026a"+
		"\u0272\u0277\u027f\u0284\u028c\u0291\u0299\u029e\u02a3\u02b6\u02bc\u02c5"+
		"\u02ca\u02d3\u02de\u02e5\u02eb\u02f1\u02fa\u0301\u0305\u0307\u030b\u0312"+
		"\u0314\u0318\u031b\u0322\u0332\u0341\u0344\u034a\u034c\u034f\u035c\u036a"+
		"\u036f\u0372\u037f\u038d\u0392\u039b\u039e\u03a4\u03a6\u03ac\u03b1\u03b7"+
		"\u03c3\u03c7\u03cc\u03d0\u03d3\u03e5\u03ea\u03ef\u0407\u0410\u0414\u0419"+
		"\u0435\u043a\u0446\u044c\u0453\u0455\u0457\u046f\u0472\u047a\u0483\u0487"+
		"\u0492\u04ae\u04b3\u04bf\u04c5\u04cc\u04d0\u04da\u04dd\u04e3\u04e6\u04e8"+
		"\u04ea\u04f1\u04f6\u04fa\u04fd\u04ff\u0505\u050a\u050e\u0511\u0514\u0516"+
		"\u0524\u052e\u0533\u053f\u0543\u0547\u054b\u0552\u0554\u055c\u0563\u0566"+
		"\u056a\u056f\u0577\u058a\u0590\u0594\u05a4\u05aa\u05b2\u05b7\u05ba\u05bf"+
		"\u05c8\u05cd\u05de\u05e1\u05e3\u05e8\u05ee\u05f1\u05f4\u05f7\u05fa\u0604"+
		"\u0609\u060f\u0614\u0617\u061e\u0623\u0627\u062a\u0631\u063a\u063e\u0642"+
		"\u0645\u064b\u064e\u0650\u0659\u065e\u0662\u0666\u0669\u0674\u0679\u067d"+
		"\u0684\u0688\u068c\u0692\u0697\u069b\u06a0\u06a2\u06ab\u06b6\u06bd\u06c0"+
		"\u06c8\u06cc\u06d4\u06dd\u06e2\u06e5\u06f1\u06fc\u0701\u0704\u0708\u070b"+
		"\u070e\u0713\u0718\u071b\u071f\u0722\u0725\u072a\u0730\u0738\u073c\u073f"+
		"\u0743\u0746\u0749\u074e\u0754\u075c\u0760\u0763\u0767\u076a\u076d\u0777"+
		"\u077f\u0781\u07bb\u07c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}