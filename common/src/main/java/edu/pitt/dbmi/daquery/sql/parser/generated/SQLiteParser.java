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
		RULE_join_constraint = 67, RULE_compound_select_stmt = 68, RULE_factored_select_stmt = 69, 
		RULE_compound_operator = 70, RULE_select_core = 71, RULE_multi_from_clause = 72, 
		RULE_set_operator = 73, RULE_cte_table_name = 74, RULE_signed_number = 75, 
		RULE_literal_value = 76, RULE_unary_operator = 77, RULE_error_message = 78, 
		RULE_module_argument = 79, RULE_column_alias = 80, RULE_keyword = 81, 
		RULE_name = 82, RULE_result_count_function = 83, RULE_count_funct = 84, 
		RULE_any_result_function = 85, RULE_any_funct = 86, RULE_math_expr = 87, 
		RULE_and_keyword = 88, RULE_or_keyword = 89, RULE_and_or = 90, RULE_not_keyword = 91, 
		RULE_in_keyword = 92, RULE_like_keyword = 93, RULE_distinct_keyword = 94, 
		RULE_function_name = 95, RULE_database_name = 96, RULE_with_name = 97, 
		RULE_table_name = 98, RULE_table_or_index_name = 99, RULE_new_table_name = 100, 
		RULE_column_name = 101, RULE_collation_name = 102, RULE_foreign_table = 103, 
		RULE_index_name = 104, RULE_trigger_name = 105, RULE_view_name = 106, 
		RULE_module_name = 107, RULE_pragma_name = 108, RULE_savepoint_name = 109, 
		RULE_table_alias = 110, RULE_transaction_name = 111, RULE_any_name = 112, 
		RULE_anything_at_all = 113;
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
		"join_operator", "join_constraint", "compound_select_stmt", "factored_select_stmt", 
		"compound_operator", "select_core", "multi_from_clause", "set_operator", 
		"cte_table_name", "signed_number", "literal_value", "unary_operator", 
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
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DETACH - 64)) | (1L << (K_DROP - 64)) | (1L << (K_END - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_PRAGMA - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (K_REINDEX - 134)) | (1L << (K_RELEASE - 134)) | (1L << (K_REPLACE - 134)) | (1L << (K_ROLLBACK - 134)) | (1L << (K_SAVEPOINT - 134)) | (1L << (K_SELECT - 134)) | (1L << (K_UPDATE - 134)) | (1L << (K_VACUUM - 134)) | (1L << (K_VALUES - 134)) | (1L << (K_WITH - 134)) | (1L << (UNEXPECTED_CHAR - 134)))) != 0)) {
				{
				setState(230);
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
					setState(228);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(229);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
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
			setState(237);
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
			setState(240);
			sql_stmt();
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					sql_stmt();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					anything_at_all();
					}
					} 
				}
				setState(252);
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
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(253);
				match(K_EXPLAIN);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(254);
					match(K_QUERY);
					setState(255);
					match(K_PLAN);
					}
				}

				}
			}

			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(260);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(261);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(262);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(263);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(264);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(265);
				create_index_stmt();
				}
				break;
			case 7:
				{
				setState(266);
				create_table_stmt();
				}
				break;
			case 8:
				{
				setState(267);
				create_trigger_stmt();
				}
				break;
			case 9:
				{
				setState(268);
				create_view_stmt();
				}
				break;
			case 10:
				{
				setState(269);
				create_virtual_table_stmt();
				}
				break;
			case 11:
				{
				setState(270);
				delete_stmt();
				}
				break;
			case 12:
				{
				setState(271);
				delete_stmt_limited();
				}
				break;
			case 13:
				{
				setState(272);
				detach_stmt();
				}
				break;
			case 14:
				{
				setState(273);
				drop_index_stmt();
				}
				break;
			case 15:
				{
				setState(274);
				drop_table_stmt();
				}
				break;
			case 16:
				{
				setState(275);
				drop_trigger_stmt();
				}
				break;
			case 17:
				{
				setState(276);
				drop_view_stmt();
				}
				break;
			case 18:
				{
				setState(277);
				insert_stmt();
				}
				break;
			case 19:
				{
				setState(278);
				pragma_stmt();
				}
				break;
			case 20:
				{
				setState(279);
				reindex_stmt();
				}
				break;
			case 21:
				{
				setState(280);
				release_stmt();
				}
				break;
			case 22:
				{
				setState(281);
				rollback_stmt();
				}
				break;
			case 23:
				{
				setState(282);
				savepoint_stmt();
				}
				break;
			case 24:
				{
				setState(283);
				select_set();
				}
				break;
			case 25:
				{
				setState(284);
				select_stmt();
				}
				break;
			case 26:
				{
				setState(285);
				update_stmt();
				}
				break;
			case 27:
				{
				setState(286);
				update_stmt_limited();
				}
				break;
			case 28:
				{
				setState(287);
				vacuum_stmt();
				}
				break;
			case 29:
				{
				setState(288);
				with_select_stmt();
				}
				break;
			}
			setState(291);
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
			setState(293);
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
			setState(295);
			match(K_ALTER);
			setState(296);
			match(K_TABLE);
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(297);
				database_name();
				setState(298);
				match(DOT);
				}
				break;
			}
			setState(302);
			table_name();
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(303);
				match(K_RENAME);
				setState(304);
				match(K_TO);
				setState(305);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(306);
				match(K_ADD);
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(307);
					match(K_COLUMN);
					}
					break;
				}
				setState(310);
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
			setState(313);
			match(K_ANALYZE);
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(314);
				database_name();
				}
				break;
			case 2:
				{
				setState(315);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(316);
				database_name();
				setState(317);
				match(DOT);
				setState(318);
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
			setState(322);
			match(K_ATTACH);
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(323);
				match(K_DATABASE);
				}
				break;
			}
			setState(326);
			expr(0);
			setState(327);
			match(K_AS);
			setState(328);
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
			setState(330);
			match(K_BEGIN);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (K_DEFERRED - 61)) | (1L << (K_EXCLUSIVE - 61)) | (1L << (K_IMMEDIATE - 61)))) != 0)) {
				{
				setState(331);
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

			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(334);
				match(K_TRANSACTION);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DAY) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_EXTRACT - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_HOUR - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISBIRTHDATE - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_ISZIPCODE - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_MINUTE - 64)) | (1L << (K_MONTH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTIDENTIFIABLE - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SECOND - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TIMEZONE_ABBR - 128)) | (1L << (K_TIMEZONE_HOUR - 128)) | (1L << (K_TIMEZONE_MINUTE - 128)) | (1L << (K_TIMEZONE_REGION - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRACKED - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_YEAR - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) {
					{
					setState(335);
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
			setState(340);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(341);
				match(K_TRANSACTION);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DAY) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_EXTRACT - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_HOUR - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISBIRTHDATE - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_ISZIPCODE - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_MINUTE - 64)) | (1L << (K_MONTH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTIDENTIFIABLE - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SECOND - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TIMEZONE_ABBR - 128)) | (1L << (K_TIMEZONE_HOUR - 128)) | (1L << (K_TIMEZONE_MINUTE - 128)) | (1L << (K_TIMEZONE_REGION - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRACKED - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_YEAR - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) {
					{
					setState(342);
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
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(347);
				match(K_WITH);
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(348);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(351);
				common_table_expression();
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(352);
					match(COMMA);
					setState(353);
					common_table_expression();
					}
					}
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(361);
			select_core();
			setState(365); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(362);
				set_operator();
				setState(363);
				select_core();
				}
				}
				setState(367); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_EXCEPT - 71)) | (1L << (K_INTERSECT - 71)) | (1L << (K_MINUS - 71)))) != 0) || _la==K_UNION );
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(369);
				match(K_ORDER);
				setState(370);
				match(K_BY);
				setState(371);
				ordering_term();
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(372);
					match(COMMA);
					setState(373);
					ordering_term();
					}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(381);
				match(K_LIMIT);
				setState(382);
				expr(0);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(383);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(384);
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
			setState(389);
			match(K_CREATE);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(390);
				match(K_UNIQUE);
				}
			}

			setState(393);
			match(K_INDEX);
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(394);
				match(K_IF);
				setState(395);
				match(K_NOT);
				setState(396);
				match(K_EXISTS);
				}
				break;
			}
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(399);
				database_name();
				setState(400);
				match(DOT);
				}
				break;
			}
			setState(404);
			index_name();
			setState(405);
			match(K_ON);
			setState(406);
			table_name();
			setState(407);
			match(OPEN_PAR);
			setState(408);
			indexed_column();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(409);
				match(COMMA);
				setState(410);
				indexed_column();
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
			if (_la==K_WHERE) {
				{
				setState(417);
				match(K_WHERE);
				setState(418);
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
			setState(421);
			match(K_CREATE);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(422);
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

			setState(425);
			match(K_TABLE);
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(426);
				match(K_IF);
				setState(427);
				match(K_NOT);
				setState(428);
				match(K_EXISTS);
				}
				break;
			}
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(431);
				database_name();
				setState(432);
				match(DOT);
				}
				break;
			}
			setState(436);
			table_name();
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(437);
				match(OPEN_PAR);
				setState(438);
				column_def();
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(439);
						match(COMMA);
						setState(440);
						column_def();
						}
						} 
					}
					setState(445);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(446);
					match(COMMA);
					setState(447);
					table_constraint();
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(453);
				match(CLOSE_PAR);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(454);
					match(K_WITHOUT);
					setState(455);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(458);
				match(K_AS);
				setState(459);
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
			setState(462);
			match(K_CREATE);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(463);
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

			setState(466);
			match(K_TRIGGER);
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(467);
				match(K_IF);
				setState(468);
				match(K_NOT);
				setState(469);
				match(K_EXISTS);
				}
				break;
			}
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(472);
				database_name();
				setState(473);
				match(DOT);
				}
				break;
			}
			setState(477);
			trigger_name();
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(478);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(479);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(480);
				match(K_INSTEAD);
				setState(481);
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
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(484);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(485);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(486);
				match(K_UPDATE);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(487);
					match(K_OF);
					setState(488);
					column_name();
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(489);
						match(COMMA);
						setState(490);
						column_name();
						}
						}
						setState(495);
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
			setState(500);
			match(K_ON);
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(501);
				database_name();
				setState(502);
				match(DOT);
				}
				break;
			}
			setState(506);
			table_name();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(507);
				match(K_FOR);
				setState(508);
				match(K_EACH);
				setState(509);
				match(K_ROW);
				}
			}

			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(512);
				match(K_WHEN);
				setState(513);
				expr(0);
				}
			}

			setState(516);
			match(K_BEGIN);
			setState(525); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(517);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(518);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(519);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(520);
					select_stmt();
					}
					break;
				}
				setState(523);
				match(SCOL);
				}
				}
				setState(527); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || _la==K_INSERT || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_REPLACE - 137)) | (1L << (K_SELECT - 137)) | (1L << (K_UPDATE - 137)) | (1L << (K_VALUES - 137)) | (1L << (K_WITH - 137)))) != 0) );
			setState(529);
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
			setState(531);
			match(K_CREATE);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(532);
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

			setState(535);
			match(K_VIEW);
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(536);
				match(K_IF);
				setState(537);
				match(K_NOT);
				setState(538);
				match(K_EXISTS);
				}
				break;
			}
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(541);
				database_name();
				setState(542);
				match(DOT);
				}
				break;
			}
			setState(546);
			view_name();
			setState(547);
			match(K_AS);
			setState(548);
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
			setState(550);
			match(K_CREATE);
			setState(551);
			match(K_VIRTUAL);
			setState(552);
			match(K_TABLE);
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(553);
				match(K_IF);
				setState(554);
				match(K_NOT);
				setState(555);
				match(K_EXISTS);
				}
				break;
			}
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(558);
				database_name();
				setState(559);
				match(DOT);
				}
				break;
			}
			setState(563);
			table_name();
			setState(564);
			match(K_USING);
			setState(565);
			module_name();
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(566);
				match(OPEN_PAR);
				setState(567);
				module_argument();
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(568);
					match(COMMA);
					setState(569);
					module_argument();
					}
					}
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(575);
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
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(579);
				with_clause();
				}
			}

			setState(582);
			match(K_DELETE);
			setState(583);
			single_from_clause();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(584);
				match(K_WHERE);
				setState(585);
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
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(588);
				with_clause();
				}
			}

			setState(591);
			match(K_DELETE);
			setState(592);
			single_from_clause();
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(593);
				match(K_WHERE);
				setState(594);
				expr(0);
				}
			}

			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(597);
					match(K_ORDER);
					setState(598);
					match(K_BY);
					setState(599);
					ordering_term();
					setState(604);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(600);
						match(COMMA);
						setState(601);
						ordering_term();
						}
						}
						setState(606);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(609);
				match(K_LIMIT);
				setState(610);
				expr(0);
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(611);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(612);
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
			setState(617);
			match(K_FROM);
			setState(618);
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
			setState(620);
			match(K_DETACH);
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(621);
				match(K_DATABASE);
				}
				break;
			}
			setState(624);
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
			setState(626);
			match(K_DROP);
			setState(627);
			match(K_INDEX);
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(628);
				match(K_IF);
				setState(629);
				match(K_EXISTS);
				}
				break;
			}
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(632);
				database_name();
				setState(633);
				match(DOT);
				}
				break;
			}
			setState(637);
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
			setState(639);
			match(K_DROP);
			setState(640);
			match(K_TABLE);
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(641);
				match(K_IF);
				setState(642);
				match(K_EXISTS);
				}
				break;
			}
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(645);
				database_name();
				setState(646);
				match(DOT);
				}
				break;
			}
			setState(650);
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
			setState(652);
			match(K_DROP);
			setState(653);
			match(K_TRIGGER);
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(654);
				match(K_IF);
				setState(655);
				match(K_EXISTS);
				}
				break;
			}
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(658);
				database_name();
				setState(659);
				match(DOT);
				}
				break;
			}
			setState(663);
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
			setState(665);
			match(K_DROP);
			setState(666);
			match(K_VIEW);
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(667);
				match(K_IF);
				setState(668);
				match(K_EXISTS);
				}
				break;
			}
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(671);
				database_name();
				setState(672);
				match(DOT);
				}
				break;
			}
			setState(676);
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
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(678);
				with_clause();
				}
			}

			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(681);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(682);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(683);
				match(K_INSERT);
				setState(684);
				match(K_OR);
				setState(685);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(686);
				match(K_INSERT);
				setState(687);
				match(K_OR);
				setState(688);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(689);
				match(K_INSERT);
				setState(690);
				match(K_OR);
				setState(691);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(692);
				match(K_INSERT);
				setState(693);
				match(K_OR);
				setState(694);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(695);
				match(K_INSERT);
				setState(696);
				match(K_OR);
				setState(697);
				match(K_IGNORE);
				}
				break;
			}
			setState(700);
			match(K_INTO);
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(701);
				database_name();
				setState(702);
				match(DOT);
				}
				break;
			}
			setState(706);
			table_name();
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(707);
				match(OPEN_PAR);
				setState(708);
				column_name();
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(709);
					match(COMMA);
					setState(710);
					column_name();
					}
					}
					setState(715);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(716);
				match(CLOSE_PAR);
				}
			}

			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(720);
				match(K_VALUES);
				setState(721);
				match(OPEN_PAR);
				setState(722);
				expr(0);
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(723);
					match(COMMA);
					setState(724);
					expr(0);
					}
					}
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(730);
				match(CLOSE_PAR);
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(731);
					match(COMMA);
					setState(732);
					match(OPEN_PAR);
					setState(733);
					expr(0);
					setState(738);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(734);
						match(COMMA);
						setState(735);
						expr(0);
						}
						}
						setState(740);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(741);
					match(CLOSE_PAR);
					}
					}
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(748);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(749);
				match(K_DEFAULT);
				setState(750);
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
			setState(753);
			match(K_PRAGMA);
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(754);
				database_name();
				setState(755);
				match(DOT);
				}
				break;
			}
			setState(759);
			pragma_name();
			setState(766);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(760);
				match(ASSIGN);
				setState(761);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(762);
				match(OPEN_PAR);
				setState(763);
				pragma_value();
				setState(764);
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
			setState(768);
			match(K_REINDEX);
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(769);
				collation_name();
				}
				break;
			case 2:
				{
				setState(773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(770);
					database_name();
					setState(771);
					match(DOT);
					}
					break;
				}
				setState(777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(775);
					table_name();
					}
					break;
				case 2:
					{
					setState(776);
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
			setState(781);
			match(K_RELEASE);
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(782);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(785);
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
			setState(787);
			match(K_ROLLBACK);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(788);
				match(K_TRANSACTION);
				setState(790);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(789);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(794);
				match(K_TO);
				setState(796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(795);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(798);
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
			setState(801);
			match(K_SAVEPOINT);
			setState(802);
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
			setState(804);
			match(K_WITH);
			setState(806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(805);
				match(K_RECURSIVE);
				}
				break;
			}
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
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(813);
				match(COMMA);
				setState(814);
				with_name();
				setState(815);
				match(K_AS);
				setState(816);
				match(OPEN_PAR);
				setState(817);
				select_stmt();
				setState(818);
				match(CLOSE_PAR);
				}
				}
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(825);
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
			setState(827);
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
			setState(829);
			select_core();
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(830);
				match(K_ORDER);
				setState(831);
				match(K_BY);
				setState(832);
				ordering_term();
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(833);
					match(COMMA);
					setState(834);
					ordering_term();
					}
					}
					setState(839);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(842);
				match(K_LIMIT);
				setState(843);
				expr(0);
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(844);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(845);
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
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(850);
				with_clause();
				}
			}

			setState(853);
			match(K_UPDATE);
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(854);
				match(K_OR);
				setState(855);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(856);
				match(K_OR);
				setState(857);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(858);
				match(K_OR);
				setState(859);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(860);
				match(K_OR);
				setState(861);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(862);
				match(K_OR);
				setState(863);
				match(K_IGNORE);
				}
				break;
			}
			setState(866);
			qualified_table_name();
			setState(867);
			match(K_SET);
			setState(868);
			column_name();
			setState(869);
			match(ASSIGN);
			setState(870);
			expr(0);
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(871);
				match(COMMA);
				setState(872);
				column_name();
				setState(873);
				match(ASSIGN);
				setState(874);
				expr(0);
				}
				}
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(881);
				match(K_WHERE);
				setState(882);
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
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(885);
				with_clause();
				}
			}

			setState(888);
			match(K_UPDATE);
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(889);
				match(K_OR);
				setState(890);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(891);
				match(K_OR);
				setState(892);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(893);
				match(K_OR);
				setState(894);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(895);
				match(K_OR);
				setState(896);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(897);
				match(K_OR);
				setState(898);
				match(K_IGNORE);
				}
				break;
			}
			setState(901);
			qualified_table_name();
			setState(902);
			match(K_SET);
			setState(903);
			column_name();
			setState(904);
			match(ASSIGN);
			setState(905);
			expr(0);
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(906);
				match(COMMA);
				setState(907);
				column_name();
				setState(908);
				match(ASSIGN);
				setState(909);
				expr(0);
				}
				}
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(916);
				match(K_WHERE);
				setState(917);
				expr(0);
				}
			}

			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(920);
					match(K_ORDER);
					setState(921);
					match(K_BY);
					setState(922);
					ordering_term();
					setState(927);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(923);
						match(COMMA);
						setState(924);
						ordering_term();
						}
						}
						setState(929);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(932);
				match(K_LIMIT);
				setState(933);
				expr(0);
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(934);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(935);
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
			setState(940);
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
			setState(942);
			column_name();
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(943);
				type_name();
				}
				break;
			}
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (K_NOT - 115)) | (1L << (K_NULL - 115)) | (1L << (K_PRIMARY - 115)) | (1L << (K_REFERENCES - 115)) | (1L << (K_UNIQUE - 115)))) != 0)) {
				{
				{
				setState(946);
				column_constraint();
				}
				}
				setState(951);
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
			setState(953); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(952);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(955); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(957);
				match(OPEN_PAR);
				setState(958);
				signed_number();
				setState(959);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(961);
				match(OPEN_PAR);
				setState(962);
				signed_number();
				setState(963);
				match(COMMA);
				setState(964);
				signed_number();
				setState(965);
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
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(969);
				match(K_CONSTRAINT);
				setState(970);
				name();
				}
			}

			setState(1006);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(973);
				match(K_PRIMARY);
				setState(974);
				match(K_KEY);
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(975);
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

				setState(978);
				conflict_clause();
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(979);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(982);
					match(K_NOT);
					}
				}

				setState(985);
				match(K_NULL);
				setState(986);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(987);
				match(K_UNIQUE);
				setState(988);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(989);
				match(K_CHECK);
				setState(990);
				match(OPEN_PAR);
				setState(991);
				expr(0);
				setState(992);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(994);
				match(K_DEFAULT);
				setState(1001);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(995);
					signed_number();
					}
					break;
				case 2:
					{
					setState(996);
					literal_value();
					}
					break;
				case 3:
					{
					setState(997);
					match(OPEN_PAR);
					setState(998);
					expr(0);
					setState(999);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1003);
				match(K_COLLATE);
				setState(1004);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1005);
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
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1008);
				match(K_ON);
				setState(1009);
				match(K_CONFLICT);
				setState(1010);
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
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1014);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1015);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1016);
				dbColumnExpr();
				}
				break;
			case 4:
				{
				setState(1017);
				unary_operator();
				setState(1018);
				any_result_column_expr(19);
				}
				break;
			case 5:
				{
				setState(1020);
				count_funct();
				}
				break;
			case 6:
				{
				setState(1021);
				any_funct();
				}
				break;
			case 7:
				{
				setState(1022);
				match(OPEN_PAR);
				setState(1023);
				any_result_column_expr(0);
				setState(1024);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1026);
				match(K_CAST);
				setState(1027);
				match(OPEN_PAR);
				setState(1028);
				any_result_column_expr(0);
				setState(1029);
				match(K_AS);
				setState(1030);
				type_name();
				setState(1031);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1033);
				match(K_CASE);
				setState(1035);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1034);
					any_result_column_expr(0);
					}
					break;
				}
				setState(1042); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1037);
					match(K_WHEN);
					setState(1038);
					any_result_column_expr(0);
					setState(1039);
					match(K_THEN);
					setState(1040);
					any_result_column_expr(0);
					}
					}
					setState(1044); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1046);
					match(K_ELSE);
					setState(1047);
					any_result_column_expr(0);
					}
				}

				setState(1050);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(1052);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1055);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1056);
						match(PIPE2);
						setState(1057);
						any_result_column_expr(19);
						}
						break;
					case 2:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1058);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1059);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1060);
						any_result_column_expr(18);
						}
						break;
					case 3:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1061);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1062);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1063);
						any_result_column_expr(17);
						}
						break;
					case 4:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1064);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1065);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1066);
						any_result_column_expr(16);
						}
						break;
					case 5:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1067);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1068);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1069);
						any_result_column_expr(15);
						}
						break;
					case 6:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1070);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						{
						setState(1071);
						comparison_operator();
						}
						setState(1072);
						any_result_column_expr(14);
						}
						break;
					case 7:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1074);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1075);
						and_or();
						setState(1076);
						any_result_column_expr(13);
						}
						break;
					case 8:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1078);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1079);
						match(K_IS);
						setState(1081);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
						case 1:
							{
							setState(1080);
							match(K_NOT);
							}
							break;
						}
						setState(1083);
						any_result_column_expr(5);
						}
						break;
					case 9:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1084);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
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
						match(K_BETWEEN);
						setState(1089);
						any_result_column_expr(0);
						setState(1090);
						match(K_AND);
						setState(1091);
						any_result_column_expr(4);
						}
						break;
					case 10:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1093);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1094);
						match(K_COLLATE);
						setState(1095);
						collation_name();
						}
						break;
					case 11:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1096);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1098);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1097);
							match(K_NOT);
							}
						}

						setState(1100);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (K_GLOB - 82)) | (1L << (K_LIKE - 82)) | (1L << (K_MATCH - 82)) | (1L << (K_REGEXP - 82)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1101);
						any_result_column_expr(0);
						setState(1104);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
						case 1:
							{
							setState(1102);
							match(K_ESCAPE);
							setState(1103);
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
						setState(1106);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1111);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1107);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1108);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1109);
							match(K_NOT);
							setState(1110);
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
				setState(1117);
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
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
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
				count_funct();
				}
				break;
			case 6:
				{
				setState(1126);
				any_funct();
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
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
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
				match(K_EXTRACT);
				setState(1168);
				match(OPEN_PAR);
				setState(1169);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DAY - 58)) | (1L << (K_HOUR - 58)) | (1L << (K_MINUTE - 58)) | (1L << (K_MONTH - 58)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (K_SECOND - 143)) | (1L << (K_TIMEZONE_ABBR - 143)) | (1L << (K_TIMEZONE_HOUR - 143)) | (1L << (K_TIMEZONE_MINUTE - 143)) | (1L << (K_TIMEZONE_REGION - 143)) | (1L << (K_YEAR - 143)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1170);
				match(K_FROM);
				setState(1171);
				expr(0);
				setState(1172);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1176);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1177);
						match(PIPE2);
						setState(1178);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1179);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1180);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1181);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1182);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1183);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1184);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1185);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1186);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1187);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1188);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1189);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1190);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1191);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						{
						setState(1192);
						comparison_operator();
						}
						setState(1193);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1195);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1196);
						and_or();
						setState(1197);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1199);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1200);
						match(K_IS);
						setState(1202);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
						case 1:
							{
							setState(1201);
							match(K_NOT);
							}
							break;
						}
						setState(1204);
						expr(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1205);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1207);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1206);
							match(K_NOT);
							}
						}

						setState(1209);
						match(K_BETWEEN);
						setState(1210);
						expr(0);
						setState(1211);
						match(K_AND);
						setState(1212);
						expr(6);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1214);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1215);
						match(K_COLLATE);
						setState(1216);
						collation_name();
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1217);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1219);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1218);
							match(K_NOT);
							}
						}

						setState(1221);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (K_GLOB - 82)) | (1L << (K_LIKE - 82)) | (1L << (K_MATCH - 82)) | (1L << (K_REGEXP - 82)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1222);
						expr(0);
						setState(1225);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
						case 1:
							{
							setState(1223);
							match(K_ESCAPE);
							setState(1224);
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
						setState(1227);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1232);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1228);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1229);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1230);
							match(K_NOT);
							setState(1231);
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
						setState(1234);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1236);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1235);
							match(K_NOT);
							}
						}

						setState(1238);
						match(K_IN);
						setState(1258);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
						case 1:
							{
							setState(1239);
							match(OPEN_PAR);
							setState(1249);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
							case 1:
								{
								setState(1240);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1241);
								expr(0);
								setState(1246);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1242);
									match(COMMA);
									setState(1243);
									expr(0);
									}
									}
									setState(1248);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1251);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1255);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
							case 1:
								{
								setState(1252);
								database_name();
								setState(1253);
								match(DOT);
								}
								break;
							}
							setState(1257);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1264);
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
			setState(1283);
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
				setState(1274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
					case 1:
						{
						setState(1266);
						database_name();
						setState(1267);
						match(DOT);
						}
						break;
					}
					setState(1271);
					table_name();
					setState(1272);
					match(DOT);
					}
					break;
				}
				setState(1276);
				column_name();
				setState(1281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1277);
						match(K_AS);
						}
					}

					setState(1280);
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
			setState(1306);
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
				setState(1294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
					case 1:
						{
						setState(1286);
						database_name();
						setState(1287);
						match(DOT);
						}
						break;
					}
					setState(1291);
					table_name();
					setState(1292);
					match(DOT);
					}
					break;
				}
				setState(1296);
				column_name();
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1297);
					deid_tag();
					}
				}

				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1301);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1300);
						match(K_AS);
						}
					}

					setState(1303);
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
			setState(1320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1308);
				match(ASSIGN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1309);
				match(EQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1310);
				match(NOT_EQ1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1311);
				match(NOT_EQ2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1312);
				match(K_IS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1313);
				match(K_IS);
				setState(1314);
				match(K_NOT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1315);
				in_keyword();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1316);
				like_keyword();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1317);
				match(K_GLOB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1318);
				match(K_MATCH);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1319);
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
			setState(1322);
			match(K_REFERENCES);
			setState(1323);
			foreign_table();
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1324);
				match(OPEN_PAR);
				setState(1325);
				column_name();
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1326);
					match(COMMA);
					setState(1327);
					column_name();
					}
					}
					setState(1332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1333);
				match(CLOSE_PAR);
				}
			}

			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1351);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1337);
					match(K_ON);
					setState(1338);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1347);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
					case 1:
						{
						setState(1339);
						match(K_SET);
						setState(1340);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1341);
						match(K_SET);
						setState(1342);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1343);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1344);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1345);
						match(K_NO);
						setState(1346);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1349);
					match(K_MATCH);
					setState(1350);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1358);
					match(K_NOT);
					}
				}

				setState(1361);
				match(K_DEFERRABLE);
				setState(1366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1362);
					match(K_INITIALLY);
					setState(1363);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1364);
					match(K_INITIALLY);
					setState(1365);
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
			setState(1370);
			match(K_RAISE);
			setState(1371);
			match(OPEN_PAR);
			setState(1376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1372);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1373);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1374);
				match(COMMA);
				setState(1375);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1378);
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
			setState(1380);
			column_name();
			setState(1383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1381);
				match(K_COLLATE);
				setState(1382);
				collation_name();
				}
			}

			setState(1386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1385);
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
			setState(1390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1388);
				match(K_CONSTRAINT);
				setState(1389);
				name();
				}
			}

			setState(1428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1395);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1392);
					match(K_PRIMARY);
					setState(1393);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1394);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1397);
				match(OPEN_PAR);
				setState(1398);
				indexed_column();
				setState(1403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1399);
					match(COMMA);
					setState(1400);
					indexed_column();
					}
					}
					setState(1405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1406);
				match(CLOSE_PAR);
				setState(1407);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1409);
				match(K_CHECK);
				setState(1410);
				match(OPEN_PAR);
				setState(1411);
				expr(0);
				setState(1412);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1414);
				match(K_FOREIGN);
				setState(1415);
				match(K_KEY);
				setState(1416);
				match(OPEN_PAR);
				setState(1417);
				column_name();
				setState(1422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1418);
					match(COMMA);
					setState(1419);
					column_name();
					}
					}
					setState(1424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1425);
				match(CLOSE_PAR);
				setState(1426);
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
			setState(1430);
			match(K_WITH);
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1431);
				match(K_RECURSIVE);
				}
				break;
			}
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
			setState(1448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1439);
				match(COMMA);
				setState(1440);
				cte_table_name();
				setState(1441);
				match(K_AS);
				setState(1442);
				match(OPEN_PAR);
				setState(1443);
				select_stmt();
				setState(1444);
				match(CLOSE_PAR);
				}
				}
				setState(1450);
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
			setState(1454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1451);
				database_name();
				setState(1452);
				match(DOT);
				}
				break;
			}
			setState(1456);
			table_name();
			setState(1462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1457);
				match(K_INDEXED);
				setState(1458);
				match(K_BY);
				setState(1459);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1460);
				match(K_NOT);
				setState(1461);
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
			setState(1464);
			expr(0);
			setState(1467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1465);
				match(K_COLLATE);
				setState(1466);
				collation_name();
				}
			}

			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1469);
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
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1472);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1474);
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
			setState(1477);
			table_name();
			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1478);
				match(OPEN_PAR);
				setState(1479);
				column_name();
				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1480);
					match(COMMA);
					setState(1481);
					column_name();
					}
					}
					setState(1486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1487);
				match(CLOSE_PAR);
				}
			}

			setState(1491);
			match(K_AS);
			setState(1492);
			match(OPEN_PAR);
			setState(1493);
			select_stmt();
			setState(1494);
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
			setState(1511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1496);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1497);
				table_name();
				setState(1498);
				match(DOT);
				setState(1499);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1501);
				result_column_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1502);
				result_count_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1503);
				any_result_function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1504);
				any_result_column_expr(0);
				setState(1509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1506);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1505);
						match(K_AS);
						}
					}

					setState(1508);
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
			setState(1522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1513);
				match(LT);
				setState(1514);
				match(K_IDENTIFIABLE);
				setState(1516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1515);
					ident_prop();
					}
					break;
				}
				setState(1518);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1519);
				match(LT);
				setState(1520);
				match(K_NOTIDENTIFIABLE);
				setState(1521);
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
			setState(1525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ISID) {
				{
				setState(1524);
				id_field_prop();
				}
			}

			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DATESHIFT) {
				{
				setState(1527);
				date_shift_field_prop();
				}
			}

			setState(1531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OBFUSCATE) {
				{
				setState(1530);
				obfuscate_field_prop();
				}
			}

			setState(1534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ISZIPCODE) {
				{
				setState(1533);
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
			setState(1536);
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
			setState(1538);
			match(K_ISID);
			setState(1539);
			match(ASSIGN);
			setState(1540);
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
			setState(1542);
			match(K_DATESHIFT);
			setState(1544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ISBIRTHDATE) {
				{
				setState(1543);
				is_birthdate_prop();
				}
			}

			setState(1549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRACKED) {
				{
				setState(1546);
				match(K_TRACKED);
				setState(1547);
				match(K_BY);
				setState(1548);
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
			setState(1563);
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
				setState(1560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1555);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
					case 1:
						{
						setState(1552);
						database_name();
						setState(1553);
						match(DOT);
						}
						break;
					}
					setState(1557);
					table_name();
					setState(1558);
					match(DOT);
					}
					break;
				}
				setState(1562);
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
			setState(1565);
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
			setState(1567);
			match(K_OBFUSCATE);
			setState(1570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1568);
				match(ASSIGN);
				setState(1569);
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
			setState(1575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1572);
				database_name();
				setState(1573);
				match(DOT);
				}
				break;
			}
			setState(1577);
			table_name();
			setState(1582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1579);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1578);
					match(K_AS);
					}
					break;
				}
				setState(1581);
				table_alias();
				}
				break;
			}
			setState(1589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1584);
				match(K_INDEXED);
				setState(1585);
				match(K_BY);
				setState(1586);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1587);
				match(K_NOT);
				setState(1588);
				match(K_INDEXED);
				}
				break;
			case EOF:
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
			setState(1620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1591);
				from_table_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1592);
				match(OPEN_PAR);
				setState(1602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1593);
					table_or_subquery();
					setState(1598);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1594);
						match(COMMA);
						setState(1595);
						table_or_subquery();
						}
						}
						setState(1600);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1601);
					join_clause();
					}
					break;
				}
				setState(1604);
				match(CLOSE_PAR);
				setState(1609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1606);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
					case 1:
						{
						setState(1605);
						match(K_AS);
						}
						break;
					}
					setState(1608);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1611);
				match(OPEN_PAR);
				setState(1612);
				select_stmt();
				setState(1613);
				match(CLOSE_PAR);
				setState(1618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1615);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
					case 1:
						{
						setState(1614);
						match(K_AS);
						}
						break;
					}
					setState(1617);
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
			setState(1622);
			table_or_subquery();
			setState(1629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (K_INNER - 94)) | (1L << (K_JOIN - 94)) | (1L << (K_LEFT - 94)) | (1L << (K_NATURAL - 94)))) != 0)) {
				{
				{
				setState(1623);
				join_operator();
				setState(1624);
				table_or_subquery();
				setState(1625);
				join_constraint();
				}
				}
				setState(1631);
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
			setState(1645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1632);
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
				setState(1634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1633);
					match(K_NATURAL);
					}
				}

				setState(1642);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1636);
					match(K_LEFT);
					setState(1638);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1637);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1640);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1641);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1644);
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
			setState(1661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1647);
				match(K_ON);
				setState(1648);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1649);
				match(K_USING);
				setState(1650);
				match(OPEN_PAR);
				setState(1651);
				column_name();
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1652);
					match(COMMA);
					setState(1653);
					column_name();
					}
					}
					setState(1658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1659);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
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
		enterRule(_localctx, 136, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1663);
				match(K_WITH);
				setState(1665);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1664);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(1667);
				common_table_expression();
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1668);
					match(COMMA);
					setState(1669);
					common_table_expression();
					}
					}
					setState(1674);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1677);
			select_core();
			setState(1687); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1684);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(1678);
					match(K_UNION);
					setState(1680);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(1679);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(1682);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(1683);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1686);
				select_core();
				}
				}
				setState(1689); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(1701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1691);
				match(K_ORDER);
				setState(1692);
				match(K_BY);
				setState(1693);
				ordering_term();
				setState(1698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1694);
					match(COMMA);
					setState(1695);
					ordering_term();
					}
					}
					setState(1700);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1703);
				match(K_LIMIT);
				setState(1704);
				expr(0);
				setState(1707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1705);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1706);
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
		enterRule(_localctx, 138, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1711);
				match(K_WITH);
				setState(1713);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1712);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(1715);
				common_table_expression();
				setState(1720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1716);
					match(COMMA);
					setState(1717);
					common_table_expression();
					}
					}
					setState(1722);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1725);
			select_core();
			setState(1731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(1726);
				compound_operator();
				setState(1727);
				select_core();
				}
				}
				setState(1733);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1734);
				match(K_ORDER);
				setState(1735);
				match(K_BY);
				setState(1736);
				ordering_term();
				setState(1741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1737);
					match(COMMA);
					setState(1738);
					ordering_term();
					}
					}
					setState(1743);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1746);
				match(K_LIMIT);
				setState(1747);
				expr(0);
				setState(1750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1748);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1749);
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
		enterRule(_localctx, 140, RULE_compound_operator);
		try {
			setState(1759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1754);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1755);
				match(K_UNION);
				setState(1756);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1757);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1758);
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
		enterRule(_localctx, 142, RULE_select_core);
		int _la;
		try {
			setState(1830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1761);
				match(K_SELECT);
				setState(1763);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1762);
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
				setState(1765);
				result_column();
				setState(1770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1766);
					match(COMMA);
					setState(1767);
					result_column();
					}
					}
					setState(1772);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1773);
					multi_from_clause();
					}
				}

				setState(1778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1776);
					match(K_WHERE);
					setState(1777);
					expr(0);
					}
				}

				setState(1800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1780);
					match(K_GROUP);
					setState(1781);
					match(K_BY);
					setState(1784);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
					case 1:
						{
						setState(1782);
						dbColumnExpr();
						}
						break;
					case 2:
						{
						setState(1783);
						any_funct();
						}
						break;
					}
					setState(1793);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1786);
						match(COMMA);
						setState(1789);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
						case 1:
							{
							setState(1787);
							dbColumnExpr();
							}
							break;
						case 2:
							{
							setState(1788);
							any_funct();
							}
							break;
						}
						}
						}
						setState(1795);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1798);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1796);
						match(K_HAVING);
						setState(1797);
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
				setState(1802);
				match(K_VALUES);
				setState(1803);
				match(OPEN_PAR);
				setState(1804);
				expr(0);
				setState(1809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1805);
					match(COMMA);
					setState(1806);
					expr(0);
					}
					}
					setState(1811);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1812);
				match(CLOSE_PAR);
				setState(1827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1813);
					match(COMMA);
					setState(1814);
					match(OPEN_PAR);
					setState(1815);
					expr(0);
					setState(1820);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1816);
						match(COMMA);
						setState(1817);
						expr(0);
						}
						}
						setState(1822);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1823);
					match(CLOSE_PAR);
					}
					}
					setState(1829);
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
		enterRule(_localctx, 144, RULE_multi_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832);
			match(K_FROM);
			setState(1842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(1833);
				table_or_subquery();
				setState(1838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1834);
					match(COMMA);
					setState(1835);
					table_or_subquery();
					}
					}
					setState(1840);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1841);
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
		enterRule(_localctx, 146, RULE_set_operator);
		try {
			setState(1850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1844);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1845);
				match(K_UNION);
				setState(1846);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1847);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1848);
				match(K_EXCEPT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1849);
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
		enterRule(_localctx, 148, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			table_name();
			setState(1864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1853);
				match(OPEN_PAR);
				setState(1854);
				column_name();
				setState(1859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1855);
					match(COMMA);
					setState(1856);
					column_name();
					}
					}
					setState(1861);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1862);
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
		enterRule(_localctx, 150, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1866);
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

			setState(1869);
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
		enterRule(_localctx, 152, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
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
		enterRule(_localctx, 154, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
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
		enterRule(_localctx, 156, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
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
		enterRule(_localctx, 158, RULE_module_argument);
		try {
			setState(1879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1877);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1878);
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
		enterRule(_localctx, 160, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1881);
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
		enterRule(_localctx, 162, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
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
		enterRule(_localctx, 164, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
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
		enterRule(_localctx, 166, RULE_result_count_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
			match(K_COUNT);
			setState(1888);
			match(OPEN_PAR);
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(1890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(1889);
					distinct_keyword();
					}
					break;
				}
				setState(1892);
				result_column_expr();
				}
				break;
			case 2:
				{
				setState(1893);
				match(STAR);
				}
				break;
			case 3:
				{
				setState(1895);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(1894);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1897);
				any_funct();
				}
				break;
			}
			setState(1900);
			match(CLOSE_PAR);
			setState(1902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1901);
				deid_tag();
				}
			}

			setState(1908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(1905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1904);
					match(K_AS);
					}
				}

				setState(1907);
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
		enterRule(_localctx, 168, RULE_count_funct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1910);
			match(K_COUNT);
			setState(1911);
			match(OPEN_PAR);
			setState(1921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(1913);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(1912);
					distinct_keyword();
					}
					break;
				}
				setState(1915);
				dbColumnExpr();
				}
				break;
			case 2:
				{
				setState(1916);
				match(STAR);
				}
				break;
			case 3:
				{
				setState(1918);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(1917);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1920);
				any_funct();
				}
				break;
			}
			setState(1923);
			match(CLOSE_PAR);
			setState(1925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(1924);
				deid_tag();
				}
				break;
			}
			setState(1931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(1928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1927);
					match(K_AS);
					}
				}

				setState(1930);
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
		enterRule(_localctx, 170, RULE_any_result_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
			function_name();
			setState(1934);
			match(OPEN_PAR);
			setState(1957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(1936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(1935);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1942);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
				case 1:
					{
					setState(1938);
					result_column_expr();
					}
					break;
				case 2:
					{
					setState(1939);
					any_funct();
					}
					break;
				case 3:
					{
					setState(1940);
					math_expr(0);
					}
					break;
				case 4:
					{
					setState(1941);
					literal_value();
					}
					break;
				}
				setState(1954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1944);
					match(COMMA);
					setState(1950);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
					case 1:
						{
						setState(1945);
						result_column_expr();
						}
						break;
					case 2:
						{
						setState(1946);
						any_funct();
						}
						break;
					case 3:
						{
						setState(1947);
						math_expr(0);
						}
						break;
					case 4:
						{
						setState(1948);
						literal_value();
						}
						break;
					case 5:
						{
						setState(1949);
						match(STAR);
						}
						break;
					}
					}
					}
					setState(1956);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1959);
			match(CLOSE_PAR);
			setState(1961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1960);
				deid_tag();
				}
			}

			setState(1967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(1964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1963);
					match(K_AS);
					}
				}

				setState(1966);
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
		enterRule(_localctx, 172, RULE_any_funct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			function_name();
			setState(1970);
			match(OPEN_PAR);
			setState(1993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(1972);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(1971);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(1974);
					dbColumnExpr();
					}
					break;
				case 2:
					{
					setState(1975);
					any_funct();
					}
					break;
				case 3:
					{
					setState(1976);
					math_expr(0);
					}
					break;
				case 4:
					{
					setState(1977);
					literal_value();
					}
					break;
				}
				setState(1990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1980);
					match(COMMA);
					setState(1986);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
					case 1:
						{
						setState(1981);
						dbColumnExpr();
						}
						break;
					case 2:
						{
						setState(1982);
						any_funct();
						}
						break;
					case 3:
						{
						setState(1983);
						math_expr(0);
						}
						break;
					case 4:
						{
						setState(1984);
						literal_value();
						}
						break;
					case 5:
						{
						setState(1985);
						match(STAR);
						}
						break;
					}
					}
					}
					setState(1992);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1995);
			match(CLOSE_PAR);
			setState(1997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(1996);
				deid_tag();
				}
				break;
			}
			setState(2003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1999);
					match(K_AS);
					}
				}

				setState(2002);
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
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_math_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2006);
				match(NUMERIC_LITERAL);
				}
				break;
			case 2:
				{
				setState(2007);
				dbColumnExpr();
				}
				break;
			case 3:
				{
				setState(2008);
				any_funct();
				}
				break;
			case 4:
				{
				setState(2009);
				match(OPEN_PAR);
				setState(2010);
				math_expr(0);
				setState(2011);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2023);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2021);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
					case 1:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(2015);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2016);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2017);
						math_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(2018);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2019);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2020);
						math_expr(3);
						}
						break;
					}
					} 
				}
				setState(2025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
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
		enterRule(_localctx, 176, RULE_and_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
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
		enterRule(_localctx, 178, RULE_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
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
		enterRule(_localctx, 180, RULE_and_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2030);
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
		enterRule(_localctx, 182, RULE_not_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2032);
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
		enterRule(_localctx, 184, RULE_in_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2034);
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
		enterRule(_localctx, 186, RULE_like_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2036);
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
		enterRule(_localctx, 188, RULE_distinct_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2038);
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
		enterRule(_localctx, 190, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
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
		enterRule(_localctx, 192, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
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
		enterRule(_localctx, 194, RULE_with_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2044);
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
		enterRule(_localctx, 196, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2046);
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
		enterRule(_localctx, 198, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2048);
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
		enterRule(_localctx, 200, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2050);
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
		enterRule(_localctx, 202, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2052);
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
		enterRule(_localctx, 204, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2054);
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
		enterRule(_localctx, 206, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
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
		enterRule(_localctx, 208, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2058);
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
		enterRule(_localctx, 210, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
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
		enterRule(_localctx, 212, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2062);
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
		enterRule(_localctx, 214, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
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
		enterRule(_localctx, 216, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
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
		enterRule(_localctx, 218, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2068);
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
		enterRule(_localctx, 220, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2070);
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
		enterRule(_localctx, 222, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2072);
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
		enterRule(_localctx, 224, RULE_any_name);
		try {
			setState(2081);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2074);
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
				setState(2075);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2076);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(2077);
				match(OPEN_PAR);
				setState(2078);
				any_name();
				setState(2079);
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
		enterRule(_localctx, 226, RULE_anything_at_all);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2084); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2083);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2086); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
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
		case 87:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b7\u082b\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\3\2\3\2\7\2\u00e9\n"+
		"\2\f\2\16\2\u00ec\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4\u00f5\n\4\f\4\16"+
		"\4\u00f8\13\4\3\4\7\4\u00fb\n\4\f\4\16\4\u00fe\13\4\3\5\3\5\3\5\5\5\u0103"+
		"\n\5\5\5\u0105\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0124"+
		"\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u012f\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u0137\n\7\3\7\5\7\u013a\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0143\n\b\3\t\3\t\5\t\u0147\n\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u014f\n"+
		"\n\3\n\3\n\5\n\u0153\n\n\5\n\u0155\n\n\3\13\3\13\3\13\5\13\u015a\n\13"+
		"\5\13\u015c\n\13\3\f\3\f\5\f\u0160\n\f\3\f\3\f\3\f\7\f\u0165\n\f\f\f\16"+
		"\f\u0168\13\f\5\f\u016a\n\f\3\f\3\f\3\f\3\f\6\f\u0170\n\f\r\f\16\f\u0171"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u0179\n\f\f\f\16\f\u017c\13\f\5\f\u017e\n\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0184\n\f\5\f\u0186\n\f\3\r\3\r\5\r\u018a\n\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0190\n\r\3\r\3\r\3\r\5\r\u0195\n\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u019e\n\r\f\r\16\r\u01a1\13\r\3\r\3\r\3\r\5\r\u01a6\n\r\3"+
		"\16\3\16\5\16\u01aa\n\16\3\16\3\16\3\16\3\16\5\16\u01b0\n\16\3\16\3\16"+
		"\3\16\5\16\u01b5\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u01bc\n\16\f\16\16"+
		"\16\u01bf\13\16\3\16\3\16\7\16\u01c3\n\16\f\16\16\16\u01c6\13\16\3\16"+
		"\3\16\3\16\5\16\u01cb\n\16\3\16\3\16\5\16\u01cf\n\16\3\17\3\17\5\17\u01d3"+
		"\n\17\3\17\3\17\3\17\3\17\5\17\u01d9\n\17\3\17\3\17\3\17\5\17\u01de\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u01e5\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u01ee\n\17\f\17\16\17\u01f1\13\17\5\17\u01f3\n\17\5\17"+
		"\u01f5\n\17\3\17\3\17\3\17\3\17\5\17\u01fb\n\17\3\17\3\17\3\17\3\17\5"+
		"\17\u0201\n\17\3\17\3\17\5\17\u0205\n\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u020c\n\17\3\17\3\17\6\17\u0210\n\17\r\17\16\17\u0211\3\17\3\17\3\20"+
		"\3\20\5\20\u0218\n\20\3\20\3\20\3\20\3\20\5\20\u021e\n\20\3\20\3\20\3"+
		"\20\5\20\u0223\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u022f\n\21\3\21\3\21\3\21\5\21\u0234\n\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u023d\n\21\f\21\16\21\u0240\13\21\3\21\3\21\5\21\u0244"+
		"\n\21\3\22\5\22\u0247\n\22\3\22\3\22\3\22\3\22\5\22\u024d\n\22\3\23\5"+
		"\23\u0250\n\23\3\23\3\23\3\23\3\23\5\23\u0256\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u025d\n\23\f\23\16\23\u0260\13\23\5\23\u0262\n\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0268\n\23\5\23\u026a\n\23\3\24\3\24\3\24\3\25\3\25\5"+
		"\25\u0271\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0279\n\26\3\26\3\26"+
		"\3\26\5\26\u027e\n\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0286\n\27\3"+
		"\27\3\27\3\27\5\27\u028b\n\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0293"+
		"\n\30\3\30\3\30\3\30\5\30\u0298\n\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31"+
		"\u02a0\n\31\3\31\3\31\3\31\5\31\u02a5\n\31\3\31\3\31\3\32\5\32\u02aa\n"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u02bd\n\32\3\32\3\32\3\32\3\32\5\32\u02c3\n\32"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u02ca\n\32\f\32\16\32\u02cd\13\32\3\32"+
		"\3\32\5\32\u02d1\n\32\3\32\3\32\3\32\3\32\3\32\7\32\u02d8\n\32\f\32\16"+
		"\32\u02db\13\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u02e3\n\32\f\32\16"+
		"\32\u02e6\13\32\3\32\3\32\7\32\u02ea\n\32\f\32\16\32\u02ed\13\32\3\32"+
		"\3\32\3\32\5\32\u02f2\n\32\3\33\3\33\3\33\3\33\5\33\u02f8\n\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u0301\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0308\n\34\3\34\3\34\5\34\u030c\n\34\5\34\u030e\n\34\3\35\3\35\5"+
		"\35\u0312\n\35\3\35\3\35\3\36\3\36\3\36\5\36\u0319\n\36\5\36\u031b\n\36"+
		"\3\36\3\36\5\36\u031f\n\36\3\36\5\36\u0322\n\36\3\37\3\37\3\37\3 \3 \5"+
		" \u0329\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0337\n \f \16 \u033a"+
		"\13 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0346\n\"\f\"\16\"\u0349"+
		"\13\"\5\"\u034b\n\"\3\"\3\"\3\"\3\"\5\"\u0351\n\"\5\"\u0353\n\"\3#\5#"+
		"\u0356\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0363\n#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\7#\u036f\n#\f#\16#\u0372\13#\3#\3#\5#\u0376\n#\3$\5$\u0379"+
		"\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0386\n$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\7$\u0392\n$\f$\16$\u0395\13$\3$\3$\5$\u0399\n$\3$\3$\3$\3$\3"+
		"$\7$\u03a0\n$\f$\16$\u03a3\13$\5$\u03a5\n$\3$\3$\3$\3$\5$\u03ab\n$\5$"+
		"\u03ad\n$\3%\3%\3&\3&\5&\u03b3\n&\3&\7&\u03b6\n&\f&\16&\u03b9\13&\3\'"+
		"\6\'\u03bc\n\'\r\'\16\'\u03bd\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\5\'\u03ca\n\'\3(\3(\5(\u03ce\n(\3(\3(\3(\5(\u03d3\n(\3(\3(\5(\u03d7\n"+
		"(\3(\5(\u03da\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u03ec"+
		"\n(\3(\3(\3(\5(\u03f1\n(\3)\3)\3)\5)\u03f6\n)\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u040e\n*\3*\3*\3*\3*\3*"+
		"\6*\u0415\n*\r*\16*\u0416\3*\3*\5*\u041b\n*\3*\3*\3*\5*\u0420\n*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\5*\u043c\n*\3*\3*\3*\5*\u0441\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5"+
		"*\u044d\n*\3*\3*\3*\3*\5*\u0453\n*\3*\3*\3*\3*\3*\5*\u045a\n*\7*\u045c"+
		"\n*\f*\16*\u045f\13*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\5+\u0476\n+\3+\5+\u0479\n+\3+\3+\3+\3+\3+\3+\5+\u0481\n"+
		"+\3+\3+\3+\3+\3+\6+\u0488\n+\r+\16+\u0489\3+\3+\5+\u048e\n+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\5+\u0499\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u04b5\n+\3+\3+\3+\5+\u04ba\n"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u04c6\n+\3+\3+\3+\3+\5+\u04cc\n+\3"+
		"+\3+\3+\3+\3+\5+\u04d3\n+\3+\3+\5+\u04d7\n+\3+\3+\3+\3+\3+\3+\7+\u04df"+
		"\n+\f+\16+\u04e2\13+\5+\u04e4\n+\3+\3+\3+\3+\5+\u04ea\n+\3+\5+\u04ed\n"+
		"+\7+\u04ef\n+\f+\16+\u04f2\13+\3,\3,\3,\3,\5,\u04f8\n,\3,\3,\3,\5,\u04fd"+
		"\n,\3,\3,\5,\u0501\n,\3,\5,\u0504\n,\5,\u0506\n,\3-\3-\3-\3-\5-\u050c"+
		"\n-\3-\3-\3-\5-\u0511\n-\3-\3-\5-\u0515\n-\3-\5-\u0518\n-\3-\5-\u051b"+
		"\n-\5-\u051d\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u052b\n.\3/\3/"+
		"\3/\3/\3/\3/\7/\u0533\n/\f/\16/\u0536\13/\3/\3/\5/\u053a\n/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\5/\u0546\n/\3/\3/\5/\u054a\n/\7/\u054c\n/\f/\16/\u054f"+
		"\13/\3/\5/\u0552\n/\3/\3/\3/\3/\3/\5/\u0559\n/\5/\u055b\n/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\5\60\u0563\n\60\3\60\3\60\3\61\3\61\3\61\5\61\u056a"+
		"\n\61\3\61\5\61\u056d\n\61\3\62\3\62\5\62\u0571\n\62\3\62\3\62\3\62\5"+
		"\62\u0576\n\62\3\62\3\62\3\62\3\62\7\62\u057c\n\62\f\62\16\62\u057f\13"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\7\62\u058f\n\62\f\62\16\62\u0592\13\62\3\62\3\62\3\62\5\62\u0597\n"+
		"\62\3\63\3\63\5\63\u059b\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\7\63\u05a9\n\63\f\63\16\63\u05ac\13\63\3\64\3\64"+
		"\3\64\5\64\u05b1\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u05b9\n\64\3"+
		"\65\3\65\3\65\5\65\u05be\n\65\3\65\5\65\u05c1\n\65\3\66\3\66\3\66\5\66"+
		"\u05c6\n\66\3\67\3\67\3\67\3\67\3\67\7\67\u05cd\n\67\f\67\16\67\u05d0"+
		"\13\67\3\67\3\67\5\67\u05d4\n\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38"+
		"\38\38\38\38\38\38\58\u05e5\n8\38\58\u05e8\n8\58\u05ea\n8\39\39\39\59"+
		"\u05ef\n9\39\39\39\39\59\u05f5\n9\3:\5:\u05f8\n:\3:\5:\u05fb\n:\3:\5:"+
		"\u05fe\n:\3:\5:\u0601\n:\3;\3;\3<\3<\3<\3<\3=\3=\5=\u060b\n=\3=\3=\3="+
		"\5=\u0610\n=\3>\3>\3>\3>\5>\u0616\n>\3>\3>\3>\5>\u061b\n>\3>\5>\u061e"+
		"\n>\3?\3?\3@\3@\3@\5@\u0625\n@\3A\3A\3A\5A\u062a\nA\3A\3A\5A\u062e\nA"+
		"\3A\5A\u0631\nA\3A\3A\3A\3A\3A\5A\u0638\nA\3B\3B\3B\3B\3B\7B\u063f\nB"+
		"\fB\16B\u0642\13B\3B\5B\u0645\nB\3B\3B\5B\u0649\nB\3B\5B\u064c\nB\3B\3"+
		"B\3B\3B\5B\u0652\nB\3B\5B\u0655\nB\5B\u0657\nB\3C\3C\3C\3C\3C\7C\u065e"+
		"\nC\fC\16C\u0661\13C\3D\3D\5D\u0665\nD\3D\3D\5D\u0669\nD\3D\3D\5D\u066d"+
		"\nD\3D\5D\u0670\nD\3E\3E\3E\3E\3E\3E\3E\7E\u0679\nE\fE\16E\u067c\13E\3"+
		"E\3E\5E\u0680\nE\3F\3F\5F\u0684\nF\3F\3F\3F\7F\u0689\nF\fF\16F\u068c\13"+
		"F\5F\u068e\nF\3F\3F\3F\5F\u0693\nF\3F\3F\5F\u0697\nF\3F\6F\u069a\nF\r"+
		"F\16F\u069b\3F\3F\3F\3F\3F\7F\u06a3\nF\fF\16F\u06a6\13F\5F\u06a8\nF\3"+
		"F\3F\3F\3F\5F\u06ae\nF\5F\u06b0\nF\3G\3G\5G\u06b4\nG\3G\3G\3G\7G\u06b9"+
		"\nG\fG\16G\u06bc\13G\5G\u06be\nG\3G\3G\3G\3G\7G\u06c4\nG\fG\16G\u06c7"+
		"\13G\3G\3G\3G\3G\3G\7G\u06ce\nG\fG\16G\u06d1\13G\5G\u06d3\nG\3G\3G\3G"+
		"\3G\5G\u06d9\nG\5G\u06db\nG\3H\3H\3H\3H\3H\5H\u06e2\nH\3I\3I\5I\u06e6"+
		"\nI\3I\3I\3I\7I\u06eb\nI\fI\16I\u06ee\13I\3I\5I\u06f1\nI\3I\3I\5I\u06f5"+
		"\nI\3I\3I\3I\3I\5I\u06fb\nI\3I\3I\3I\5I\u0700\nI\7I\u0702\nI\fI\16I\u0705"+
		"\13I\3I\3I\5I\u0709\nI\5I\u070b\nI\3I\3I\3I\3I\3I\7I\u0712\nI\fI\16I\u0715"+
		"\13I\3I\3I\3I\3I\3I\3I\7I\u071d\nI\fI\16I\u0720\13I\3I\3I\7I\u0724\nI"+
		"\fI\16I\u0727\13I\5I\u0729\nI\3J\3J\3J\3J\7J\u072f\nJ\fJ\16J\u0732\13"+
		"J\3J\5J\u0735\nJ\3K\3K\3K\3K\3K\3K\5K\u073d\nK\3L\3L\3L\3L\3L\7L\u0744"+
		"\nL\fL\16L\u0747\13L\3L\3L\5L\u074b\nL\3M\5M\u074e\nM\3M\3M\3N\3N\3O\3"+
		"O\3P\3P\3Q\3Q\5Q\u075a\nQ\3R\3R\3S\3S\3T\3T\3U\3U\3U\5U\u0765\nU\3U\3"+
		"U\3U\5U\u076a\nU\3U\5U\u076d\nU\3U\3U\5U\u0771\nU\3U\5U\u0774\nU\3U\5"+
		"U\u0777\nU\3V\3V\3V\5V\u077c\nV\3V\3V\3V\5V\u0781\nV\3V\5V\u0784\nV\3"+
		"V\3V\5V\u0788\nV\3V\5V\u078b\nV\3V\5V\u078e\nV\3W\3W\3W\5W\u0793\nW\3"+
		"W\3W\3W\3W\5W\u0799\nW\3W\3W\3W\3W\3W\3W\5W\u07a1\nW\7W\u07a3\nW\fW\16"+
		"W\u07a6\13W\5W\u07a8\nW\3W\3W\5W\u07ac\nW\3W\5W\u07af\nW\3W\5W\u07b2\n"+
		"W\3X\3X\3X\5X\u07b7\nX\3X\3X\3X\3X\5X\u07bd\nX\3X\3X\3X\3X\3X\3X\5X\u07c5"+
		"\nX\7X\u07c7\nX\fX\16X\u07ca\13X\5X\u07cc\nX\3X\3X\5X\u07d0\nX\3X\5X\u07d3"+
		"\nX\3X\5X\u07d6\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u07e0\nY\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\7Y\u07e8\nY\fY\16Y\u07eb\13Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3"+
		"_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3"+
		"k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3r\3r\3r\3r\3r\5r\u0824"+
		"\nr\3s\6s\u0827\ns\rs\16s\u0828\3s\2\5RT\u00b0t\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\2\27\5\2??JJ[[\4\2\61\61GG\4\2\7\7zz\3\2\u0095"+
		"\u0096\4\2$$AA\7\2\33\33OOZZ\u008b\u008b\u008e\u008e\4\2\t\t\16\17\3\2"+
		"\n\13\3\2\20\23\3\2\24\27\6\2TTmmoo\u0087\u0087\b\2<<WWqr\u0091\u0091"+
		"\u0098\u009b\u00ad\u00ad\4\2@@\u00a3\u00a3\5\2\33\33OO\u008e\u008e\4\2"+
		"NN\u00a0\u00a0\4\2\37\37CC\6\2\679xx\u00af\u00af\u00b1\u00b2\4\2\n\fu"+
		"u\4\2\u00ae\u00ae\u00b1\u00b1\6\2\33\63\65z|\u00ad\u00b7\u00b7\4\2\"\""+
		"}}\2\u0971\2\u00ea\3\2\2\2\4\u00ef\3\2\2\2\6\u00f2\3\2\2\2\b\u0104\3\2"+
		"\2\2\n\u0127\3\2\2\2\f\u0129\3\2\2\2\16\u013b\3\2\2\2\20\u0144\3\2\2\2"+
		"\22\u014c\3\2\2\2\24\u0156\3\2\2\2\26\u0169\3\2\2\2\30\u0187\3\2\2\2\32"+
		"\u01a7\3\2\2\2\34\u01d0\3\2\2\2\36\u0215\3\2\2\2 \u0228\3\2\2\2\"\u0246"+
		"\3\2\2\2$\u024f\3\2\2\2&\u026b\3\2\2\2(\u026e\3\2\2\2*\u0274\3\2\2\2,"+
		"\u0281\3\2\2\2.\u028e\3\2\2\2\60\u029b\3\2\2\2\62\u02a9\3\2\2\2\64\u02f3"+
		"\3\2\2\2\66\u0302\3\2\2\28\u030f\3\2\2\2:\u0315\3\2\2\2<\u0323\3\2\2\2"+
		">\u0326\3\2\2\2@\u033d\3\2\2\2B\u033f\3\2\2\2D\u0355\3\2\2\2F\u0378\3"+
		"\2\2\2H\u03ae\3\2\2\2J\u03b0\3\2\2\2L\u03bb\3\2\2\2N\u03cd\3\2\2\2P\u03f5"+
		"\3\2\2\2R\u041f\3\2\2\2T\u0498\3\2\2\2V\u0505\3\2\2\2X\u051c\3\2\2\2Z"+
		"\u052a\3\2\2\2\\\u052c\3\2\2\2^\u055c\3\2\2\2`\u0566\3\2\2\2b\u0570\3"+
		"\2\2\2d\u0598\3\2\2\2f\u05b0\3\2\2\2h\u05ba\3\2\2\2j\u05c5\3\2\2\2l\u05c7"+
		"\3\2\2\2n\u05e9\3\2\2\2p\u05f4\3\2\2\2r\u05f7\3\2\2\2t\u0602\3\2\2\2v"+
		"\u0604\3\2\2\2x\u0608\3\2\2\2z\u061d\3\2\2\2|\u061f\3\2\2\2~\u0621\3\2"+
		"\2\2\u0080\u0629\3\2\2\2\u0082\u0656\3\2\2\2\u0084\u0658\3\2\2\2\u0086"+
		"\u066f\3\2\2\2\u0088\u067f\3\2\2\2\u008a\u068d\3\2\2\2\u008c\u06bd\3\2"+
		"\2\2\u008e\u06e1\3\2\2\2\u0090\u0728\3\2\2\2\u0092\u072a\3\2\2\2\u0094"+
		"\u073c\3\2\2\2\u0096\u073e\3\2\2\2\u0098\u074d\3\2\2\2\u009a\u0751\3\2"+
		"\2\2\u009c\u0753\3\2\2\2\u009e\u0755\3\2\2\2\u00a0\u0759\3\2\2\2\u00a2"+
		"\u075b\3\2\2\2\u00a4\u075d\3\2\2\2\u00a6\u075f\3\2\2\2\u00a8\u0761\3\2"+
		"\2\2\u00aa\u0778\3\2\2\2\u00ac\u078f\3\2\2\2\u00ae\u07b3\3\2\2\2\u00b0"+
		"\u07df\3\2\2\2\u00b2\u07ec\3\2\2\2\u00b4\u07ee\3\2\2\2\u00b6\u07f0\3\2"+
		"\2\2\u00b8\u07f2\3\2\2\2\u00ba\u07f4\3\2\2\2\u00bc\u07f6\3\2\2\2\u00be"+
		"\u07f8\3\2\2\2\u00c0\u07fa\3\2\2\2\u00c2\u07fc\3\2\2\2\u00c4\u07fe\3\2"+
		"\2\2\u00c6\u0800\3\2\2\2\u00c8\u0802\3\2\2\2\u00ca\u0804\3\2\2\2\u00cc"+
		"\u0806\3\2\2\2\u00ce\u0808\3\2\2\2\u00d0\u080a\3\2\2\2\u00d2\u080c\3\2"+
		"\2\2\u00d4\u080e\3\2\2\2\u00d6\u0810\3\2\2\2\u00d8\u0812\3\2\2\2\u00da"+
		"\u0814\3\2\2\2\u00dc\u0816\3\2\2\2\u00de\u0818\3\2\2\2\u00e0\u081a\3\2"+
		"\2\2\u00e2\u0823\3\2\2\2\u00e4\u0826\3\2\2\2\u00e6\u00e9\5\6\4\2\u00e7"+
		"\u00e9\5\4\3\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ee\7\2\2\3\u00ee\3\3\2\2\2\u00ef\u00f0\7\u00b6"+
		"\2\2\u00f0\u00f1\b\3\1\2\u00f1\5\3\2\2\2\u00f2\u00f6\5\b\5\2\u00f3\u00f5"+
		"\5\b\5\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00fc\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fb\5\u00e4"+
		"s\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\7\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\7L\2\2"+
		"\u0100\u0101\7\u0083\2\2\u0101\u0103\7\u0080\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0123\3\2\2\2\u0106\u0124\5\f\7\2\u0107\u0124\5\16\b\2\u0108"+
		"\u0124\5\20\t\2\u0109\u0124\5\22\n\2\u010a\u0124\5\24\13\2\u010b\u0124"+
		"\5\30\r\2\u010c\u0124\5\32\16\2\u010d\u0124\5\34\17\2\u010e\u0124\5\36"+
		"\20\2\u010f\u0124\5 \21\2\u0110\u0124\5\"\22\2\u0111\u0124\5$\23\2\u0112"+
		"\u0124\5(\25\2\u0113\u0124\5*\26\2\u0114\u0124\5,\27\2\u0115\u0124\5."+
		"\30\2\u0116\u0124\5\60\31\2\u0117\u0124\5\62\32\2\u0118\u0124\5\64\33"+
		"\2\u0119\u0124\5\66\34\2\u011a\u0124\58\35\2\u011b\u0124\5:\36\2\u011c"+
		"\u0124\5<\37\2\u011d\u0124\5\26\f\2\u011e\u0124\5B\"\2\u011f\u0124\5D"+
		"#\2\u0120\u0124\5F$\2\u0121\u0124\5H%\2\u0122\u0124\5> \2\u0123\u0106"+
		"\3\2\2\2\u0123\u0107\3\2\2\2\u0123\u0108\3\2\2\2\u0123\u0109\3\2\2\2\u0123"+
		"\u010a\3\2\2\2\u0123\u010b\3\2\2\2\u0123\u010c\3\2\2\2\u0123\u010d\3\2"+
		"\2\2\u0123\u010e\3\2\2\2\u0123\u010f\3\2\2\2\u0123\u0110\3\2\2\2\u0123"+
		"\u0111\3\2\2\2\u0123\u0112\3\2\2\2\u0123\u0113\3\2\2\2\u0123\u0114\3\2"+
		"\2\2\u0123\u0115\3\2\2\2\u0123\u0116\3\2\2\2\u0123\u0117\3\2\2\2\u0123"+
		"\u0118\3\2\2\2\u0123\u0119\3\2\2\2\u0123\u011a\3\2\2\2\u0123\u011b\3\2"+
		"\2\2\u0123\u011c\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u011e\3\2\2\2\u0123"+
		"\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0126\5\n\6\2\u0126\t\3\2\2\2\u0127\u0128"+
		"\7\3\2\2\u0128\13\3\2\2\2\u0129\u012a\7 \2\2\u012a\u012e\7\u0094\2\2\u012b"+
		"\u012c\5\u00c2b\2\u012c\u012d\7\4\2\2\u012d\u012f\3\2\2\2\u012e\u012b"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0139\5\u00c6d"+
		"\2\u0131\u0132\7\u008a\2\2\u0132\u0133\7\u009c\2\2\u0133\u013a\5\u00ca"+
		"f\2\u0134\u0136\7\35\2\2\u0135\u0137\7\60\2\2\u0136\u0135\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\5J&\2\u0139\u0131\3\2\2"+
		"\2\u0139\u0134\3\2\2\2\u013a\r\3\2\2\2\u013b\u0142\7!\2\2\u013c\u0143"+
		"\5\u00c2b\2\u013d\u0143\5\u00c8e\2\u013e\u013f\5\u00c2b\2\u013f\u0140"+
		"\7\4\2\2\u0140\u0141\5\u00c8e\2\u0141\u0143\3\2\2\2\u0142\u013c\3\2\2"+
		"\2\u0142\u013d\3\2\2\2\u0142\u013e\3\2\2\2\u0142\u0143\3\2\2\2\u0143\17"+
		"\3\2\2\2\u0144\u0146\7%\2\2\u0145\u0147\7:\2\2\u0146\u0145\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\5T+\2\u0149\u014a\7#\2"+
		"\2\u014a\u014b\5\u00c2b\2\u014b\21\3\2\2\2\u014c\u014e\7(\2\2\u014d\u014f"+
		"\t\2\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0154\3\2\2\2\u0150"+
		"\u0152\7\u009e\2\2\u0151\u0153\5\u00e0q\2\u0152\u0151\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0150\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\23\3\2\2\2\u0156\u015b\t\3\2\2\u0157\u0159\7\u009e\2\2\u0158\u015a\5"+
		"\u00e0q\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2"+
		"\u015b\u0157\3\2\2\2\u015b\u015c\3\2\2\2\u015c\25\3\2\2\2\u015d\u015f"+
		"\7\u00ab\2\2\u015e\u0160\7\u0085\2\2\u015f\u015e\3\2\2\2\u015f\u0160\3"+
		"\2\2\2\u0160\u0161\3\2\2\2\u0161\u0166\5l\67\2\u0162\u0163\7\7\2\2\u0163"+
		"\u0165\5l\67\2\u0164\u0162\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u015d\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016f\5\u0090"+
		"I\2\u016c\u016d\5\u0094K\2\u016d\u016e\5\u0090I\2\u016e\u0170\3\2\2\2"+
		"\u016f\u016c\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u017d\3\2\2\2\u0173\u0174\7~\2\2\u0174\u0175\7*\2\2\u0175"+
		"\u017a\5h\65\2\u0176\u0177\7\7\2\2\u0177\u0179\5h\65\2\u0178\u0176\3\2"+
		"\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u0173\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u0185\3\2\2\2\u017f\u0180\7n\2\2\u0180\u0183\5T+\2\u0181\u0182"+
		"\t\4\2\2\u0182\u0184\5T+\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0186\3\2\2\2\u0185\u017f\3\2\2\2\u0185\u0186\3\2\2\2\u0186\27\3\2\2"+
		"\2\u0187\u0189\7\65\2\2\u0188\u018a\7\u00a2\2\2\u0189\u0188\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018f\7]\2\2\u018c\u018d\7X\2"+
		"\2\u018d\u018e\7u\2\2\u018e\u0190\7K\2\2\u018f\u018c\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0194\3\2\2\2\u0191\u0192\5\u00c2b\2\u0192\u0193\7\4\2"+
		"\2\u0193\u0195\3\2\2\2\u0194\u0191\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0197\5\u00d2j\2\u0197\u0198\7|\2\2\u0198\u0199\5\u00c6"+
		"d\2\u0199\u019a\7\5\2\2\u019a\u019f\5`\61\2\u019b\u019c\7\7\2\2\u019c"+
		"\u019e\5`\61\2\u019d\u019b\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a5\7\6\2\2\u01a3\u01a4\7\u00aa\2\2\u01a4\u01a6\5T+\2\u01a5\u01a3\3"+
		"\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\31\3\2\2\2\u01a7\u01a9\7\65\2\2\u01a8"+
		"\u01aa\t\5\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01af\7\u0094\2\2\u01ac\u01ad\7X\2\2\u01ad\u01ae\7u\2\2\u01ae"+
		"\u01b0\7K\2\2\u01af\u01ac\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b4\3\2"+
		"\2\2\u01b1\u01b2\5\u00c2b\2\u01b2\u01b3\7\4\2\2\u01b3\u01b5\3\2\2\2\u01b4"+
		"\u01b1\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01ce\5\u00c6"+
		"d\2\u01b7\u01b8\7\5\2\2\u01b8\u01bd\5J&\2\u01b9\u01ba\7\7\2\2\u01ba\u01bc"+
		"\5J&\2\u01bb\u01b9\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01c4\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\7\7"+
		"\2\2\u01c1\u01c3\5b\62\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2"+
		"\2\2\u01c7\u01ca\7\6\2\2\u01c8\u01c9\7\u00ac\2\2\u01c9\u01cb\7\u00ae\2"+
		"\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cf\3\2\2\2\u01cc\u01cd"+
		"\7#\2\2\u01cd\u01cf\5B\"\2\u01ce\u01b7\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf"+
		"\33\3\2\2\2\u01d0\u01d2\7\65\2\2\u01d1\u01d3\t\5\2\2\u01d2\u01d1\3\2\2"+
		"\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d8\7\u009f\2\2\u01d5"+
		"\u01d6\7X\2\2\u01d6\u01d7\7u\2\2\u01d7\u01d9\7K\2\2\u01d8\u01d5\3\2\2"+
		"\2\u01d8\u01d9\3\2\2\2\u01d9\u01dd\3\2\2\2\u01da\u01db\5\u00c2b\2\u01db"+
		"\u01dc\7\4\2\2\u01dc\u01de\3\2\2\2\u01dd\u01da\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01df\3\2\2\2\u01df\u01e4\5\u00d4k\2\u01e0\u01e5\7\'\2\2\u01e1"+
		"\u01e5\7\36\2\2\u01e2\u01e3\7b\2\2\u01e3\u01e5\7y\2\2\u01e4\u01e0\3\2"+
		"\2\2\u01e4\u01e1\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01f4\3\2\2\2\u01e6\u01f5\7@\2\2\u01e7\u01f5\7a\2\2\u01e8\u01f2\7\u00a3"+
		"\2\2\u01e9\u01ea\7y\2\2\u01ea\u01ef\5\u00ccg\2\u01eb\u01ec\7\7\2\2\u01ec"+
		"\u01ee\5\u00ccg\2\u01ed\u01eb\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed"+
		"\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2"+
		"\u01e9\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01e6\3\2"+
		"\2\2\u01f4\u01e7\3\2\2\2\u01f4\u01e8\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01fa\7|\2\2\u01f7\u01f8\5\u00c2b\2\u01f8\u01f9\7\4\2\2\u01f9\u01fb\3"+
		"\2\2\2\u01fa\u01f7\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u0200\5\u00c6d\2\u01fd\u01fe\7P\2\2\u01fe\u01ff\7E\2\2\u01ff\u0201\7"+
		"\u008f\2\2\u0200\u01fd\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0204\3\2\2\2"+
		"\u0202\u0203\7\u00a9\2\2\u0203\u0205\5T+\2\u0204\u0202\3\2\2\2\u0204\u0205"+
		"\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u020f\7(\2\2\u0207\u020c\5D#\2\u0208"+
		"\u020c\5\62\32\2\u0209\u020c\5\"\22\2\u020a\u020c\5B\"\2\u020b\u0207\3"+
		"\2\2\2\u020b\u0208\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020e\7\3\2\2\u020e\u0210\3\2\2\2\u020f\u020b\3\2"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0214\7G\2\2\u0214\35\3\2\2\2\u0215\u0217\7\65\2"+
		"\2\u0216\u0218\t\5\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219"+
		"\3\2\2\2\u0219\u021d\7\u00a7\2\2\u021a\u021b\7X\2\2\u021b\u021c\7u\2\2"+
		"\u021c\u021e\7K\2\2\u021d\u021a\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0222"+
		"\3\2\2\2\u021f\u0220\5\u00c2b\2\u0220\u0221\7\4\2\2\u0221\u0223\3\2\2"+
		"\2\u0222\u021f\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225"+
		"\5\u00d6l\2\u0225\u0226\7#\2\2\u0226\u0227\5B\"\2\u0227\37\3\2\2\2\u0228"+
		"\u0229\7\65\2\2\u0229\u022a\7\u00a8\2\2\u022a\u022e\7\u0094\2\2\u022b"+
		"\u022c\7X\2\2\u022c\u022d\7u\2\2\u022d\u022f\7K\2\2\u022e\u022b\3\2\2"+
		"\2\u022e\u022f\3\2\2\2\u022f\u0233\3\2\2\2\u0230\u0231\5\u00c2b\2\u0231"+
		"\u0232\7\4\2\2\u0232\u0234\3\2\2\2\u0233\u0230\3\2\2\2\u0233\u0234\3\2"+
		"\2\2\u0234\u0235\3\2\2\2\u0235\u0236\5\u00c6d\2\u0236\u0237\7\u00a4\2"+
		"\2\u0237\u0243\5\u00d8m\2\u0238\u0239\7\5\2\2\u0239\u023e\5\u00a0Q\2\u023a"+
		"\u023b\7\7\2\2\u023b\u023d\5\u00a0Q\2\u023c\u023a\3\2\2\2\u023d\u0240"+
		"\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240"+
		"\u023e\3\2\2\2\u0241\u0242\7\6\2\2\u0242\u0244\3\2\2\2\u0243\u0238\3\2"+
		"\2\2\u0243\u0244\3\2\2\2\u0244!\3\2\2\2\u0245\u0247\5d\63\2\u0246\u0245"+
		"\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\7@\2\2\u0249"+
		"\u024c\5&\24\2\u024a\u024b\7\u00aa\2\2\u024b\u024d\5T+\2\u024c\u024a\3"+
		"\2\2\2\u024c\u024d\3\2\2\2\u024d#\3\2\2\2\u024e\u0250\5d\63\2\u024f\u024e"+
		"\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\7@\2\2\u0252"+
		"\u0255\5&\24\2\u0253\u0254\7\u00aa\2\2\u0254\u0256\5T+\2\u0255\u0253\3"+
		"\2\2\2\u0255\u0256\3\2\2\2\u0256\u0269\3\2\2\2\u0257\u0258\7~\2\2\u0258"+
		"\u0259\7*\2\2\u0259\u025e\5h\65\2\u025a\u025b\7\7\2\2\u025b\u025d\5h\65"+
		"\2\u025c\u025a\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f"+
		"\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0257\3\2\2\2\u0261"+
		"\u0262\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\7n\2\2\u0264\u0267\5T+"+
		"\2\u0265\u0266\t\4\2\2\u0266\u0268\5T+\2\u0267\u0265\3\2\2\2\u0267\u0268"+
		"\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u0261\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"%\3\2\2\2\u026b\u026c\7R\2\2\u026c\u026d\5f\64\2\u026d\'\3\2\2\2\u026e"+
		"\u0270\7B\2\2\u026f\u0271\7:\2\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2"+
		"\2\u0271\u0272\3\2\2\2\u0272\u0273\5\u00c2b\2\u0273)\3\2\2\2\u0274\u0275"+
		"\7D\2\2\u0275\u0278\7]\2\2\u0276\u0277\7X\2\2\u0277\u0279\7K\2\2\u0278"+
		"\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027d\3\2\2\2\u027a\u027b\5\u00c2"+
		"b\2\u027b\u027c\7\4\2\2\u027c\u027e\3\2\2\2\u027d\u027a\3\2\2\2\u027d"+
		"\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\5\u00d2j\2\u0280+\3\2\2"+
		"\2\u0281\u0282\7D\2\2\u0282\u0285\7\u0094\2\2\u0283\u0284\7X\2\2\u0284"+
		"\u0286\7K\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u028a\3\2"+
		"\2\2\u0287\u0288\5\u00c2b\2\u0288\u0289\7\4\2\2\u0289\u028b\3\2\2\2\u028a"+
		"\u0287\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\5\u00c6"+
		"d\2\u028d-\3\2\2\2\u028e\u028f\7D\2\2\u028f\u0292\7\u009f\2\2\u0290\u0291"+
		"\7X\2\2\u0291\u0293\7K\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0297\3\2\2\2\u0294\u0295\5\u00c2b\2\u0295\u0296\7\4\2\2\u0296\u0298"+
		"\3\2\2\2\u0297\u0294\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029a\5\u00d4k\2\u029a/\3\2\2\2\u029b\u029c\7D\2\2\u029c\u029f\7\u00a7"+
		"\2\2\u029d\u029e\7X\2\2\u029e\u02a0\7K\2\2\u029f\u029d\3\2\2\2\u029f\u02a0"+
		"\3\2\2\2\u02a0\u02a4\3\2\2\2\u02a1\u02a2\5\u00c2b\2\u02a2\u02a3\7\4\2"+
		"\2\u02a3\u02a5\3\2\2\2\u02a4\u02a1\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6"+
		"\3\2\2\2\u02a6\u02a7\5\u00d6l\2\u02a7\61\3\2\2\2\u02a8\u02aa\5d\63\2\u02a9"+
		"\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02bc\3\2\2\2\u02ab\u02bd\7a"+
		"\2\2\u02ac\u02bd\7\u008b\2\2\u02ad\u02ae\7a\2\2\u02ae\u02af\7}\2\2\u02af"+
		"\u02bd\7\u008b\2\2\u02b0\u02b1\7a\2\2\u02b1\u02b2\7}\2\2\u02b2\u02bd\7"+
		"\u008e\2\2\u02b3\u02b4\7a\2\2\u02b4\u02b5\7}\2\2\u02b5\u02bd\7\33\2\2"+
		"\u02b6\u02b7\7a\2\2\u02b7\u02b8\7}\2\2\u02b8\u02bd\7O\2\2\u02b9\u02ba"+
		"\7a\2\2\u02ba\u02bb\7}\2\2\u02bb\u02bd\7Z\2\2\u02bc\u02ab\3\2\2\2\u02bc"+
		"\u02ac\3\2\2\2\u02bc\u02ad\3\2\2\2\u02bc\u02b0\3\2\2\2\u02bc\u02b3\3\2"+
		"\2\2\u02bc\u02b6\3\2\2\2\u02bc\u02b9\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c2\7d\2\2\u02bf\u02c0\5\u00c2b\2\u02c0\u02c1\7\4\2\2\u02c1\u02c3\3"+
		"\2\2\2\u02c2\u02bf\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02d0\5\u00c6d\2\u02c5\u02c6\7\5\2\2\u02c6\u02cb\5\u00ccg\2\u02c7\u02c8"+
		"\7\7\2\2\u02c8\u02ca\5\u00ccg\2\u02c9\u02c7\3\2\2\2\u02ca\u02cd\3\2\2"+
		"\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02cb"+
		"\3\2\2\2\u02ce\u02cf\7\6\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02c5\3\2\2\2\u02d0"+
		"\u02d1\3\2\2\2\u02d1\u02f1\3\2\2\2\u02d2\u02d3\7\u00a6\2\2\u02d3\u02d4"+
		"\7\5\2\2\u02d4\u02d9\5T+\2\u02d5\u02d6\7\7\2\2\u02d6\u02d8\5T+\2\u02d7"+
		"\u02d5\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2"+
		"\2\2\u02da\u02dc\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02eb\7\6\2\2\u02dd"+
		"\u02de\7\7\2\2\u02de\u02df\7\5\2\2\u02df\u02e4\5T+\2\u02e0\u02e1\7\7\2"+
		"\2\u02e1\u02e3\5T+\2\u02e2\u02e0\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2"+
		"\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7"+
		"\u02e8\7\6\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02dd\3\2\2\2\u02ea\u02ed\3\2"+
		"\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02f2\3\2\2\2\u02ed"+
		"\u02eb\3\2\2\2\u02ee\u02f2\5B\"\2\u02ef\u02f0\7=\2\2\u02f0\u02f2\7\u00a6"+
		"\2\2\u02f1\u02d2\3\2\2\2\u02f1\u02ee\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2"+
		"\63\3\2\2\2\u02f3\u02f7\7\u0081\2\2\u02f4\u02f5\5\u00c2b\2\u02f5\u02f6"+
		"\7\4\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02f4\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"+
		"\u02f9\3\2\2\2\u02f9\u0300\5\u00dan\2\u02fa\u02fb\7\b\2\2\u02fb\u0301"+
		"\5j\66\2\u02fc\u02fd\7\5\2\2\u02fd\u02fe\5j\66\2\u02fe\u02ff\7\6\2\2\u02ff"+
		"\u0301\3\2\2\2\u0300\u02fa\3\2\2\2\u0300\u02fc\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301\65\3\2\2\2\u0302\u030d\7\u0088\2\2\u0303\u030e\5\u00ceh\2\u0304"+
		"\u0305\5\u00c2b\2\u0305\u0306\7\4\2\2\u0306\u0308\3\2\2\2\u0307\u0304"+
		"\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u030c\5\u00c6d"+
		"\2\u030a\u030c\5\u00d2j\2\u030b\u0309\3\2\2\2\u030b\u030a\3\2\2\2\u030c"+
		"\u030e\3\2\2\2\u030d\u0303\3\2\2\2\u030d\u0307\3\2\2\2\u030d\u030e\3\2"+
		"\2\2\u030e\67\3\2\2\2\u030f\u0311\7\u0089\2\2\u0310\u0312\7\u0090\2\2"+
		"\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314"+
		"\5\u00dco\2\u03149\3\2\2\2\u0315\u031a\7\u008e\2\2\u0316\u0318\7\u009e"+
		"\2\2\u0317\u0319\5\u00e0q\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319"+
		"\u031b\3\2\2\2\u031a\u0316\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u0321\3\2"+
		"\2\2\u031c\u031e\7\u009c\2\2\u031d\u031f\7\u0090\2\2\u031e\u031d\3\2\2"+
		"\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\5\u00dco\2\u0321"+
		"\u031c\3\2\2\2\u0321\u0322\3\2\2\2\u0322;\3\2\2\2\u0323\u0324\7\u0090"+
		"\2\2\u0324\u0325\5\u00dco\2\u0325=\3\2\2\2\u0326\u0328\7\u00ab\2\2\u0327"+
		"\u0329\7\u0085\2\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a"+
		"\3\2\2\2\u032a\u032b\5\u00c4c\2\u032b\u032c\7#\2\2\u032c\u032d\7\5\2\2"+
		"\u032d\u032e\5B\"\2\u032e\u0338\7\6\2\2\u032f\u0330\7\7\2\2\u0330\u0331"+
		"\5\u00c4c\2\u0331\u0332\7#\2\2\u0332\u0333\7\5\2\2\u0333\u0334\5B\"\2"+
		"\u0334\u0335\7\6\2\2\u0335\u0337\3\2\2\2\u0336\u032f\3\2\2\2\u0337\u033a"+
		"\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b\3\2\2\2\u033a"+
		"\u0338\3\2\2\2\u033b\u033c\5@!\2\u033c?\3\2\2\2\u033d\u033e\5B\"\2\u033e"+
		"A\3\2\2\2\u033f\u034a\5\u0090I\2\u0340\u0341\7~\2\2\u0341\u0342\7*\2\2"+
		"\u0342\u0347\5h\65\2\u0343\u0344\7\7\2\2\u0344\u0346\5h\65\2\u0345\u0343"+
		"\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u034a\u0340\3\2\2\2\u034a\u034b\3\2"+
		"\2\2\u034b\u0352\3\2\2\2\u034c\u034d\7n\2\2\u034d\u0350\5T+\2\u034e\u034f"+
		"\t\4\2\2\u034f\u0351\5T+\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351"+
		"\u0353\3\2\2\2\u0352\u034c\3\2\2\2\u0352\u0353\3\2\2\2\u0353C\3\2\2\2"+
		"\u0354\u0356\5d\63\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357"+
		"\3\2\2\2\u0357\u0362\7\u00a3\2\2\u0358\u0359\7}\2\2\u0359\u0363\7\u008e"+
		"\2\2\u035a\u035b\7}\2\2\u035b\u0363\7\33\2\2\u035c\u035d\7}\2\2\u035d"+
		"\u0363\7\u008b\2\2\u035e\u035f\7}\2\2\u035f\u0363\7O\2\2\u0360\u0361\7"+
		"}\2\2\u0361\u0363\7Z\2\2\u0362\u0358\3\2\2\2\u0362\u035a\3\2\2\2\u0362"+
		"\u035c\3\2\2\2\u0362\u035e\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2"+
		"\2\2\u0363\u0364\3\2\2\2\u0364\u0365\5f\64\2\u0365\u0366\7\u0093\2\2\u0366"+
		"\u0367\5\u00ccg\2\u0367\u0368\7\b\2\2\u0368\u0370\5T+\2\u0369\u036a\7"+
		"\7\2\2\u036a\u036b\5\u00ccg\2\u036b\u036c\7\b\2\2\u036c\u036d\5T+\2\u036d"+
		"\u036f\3\2\2\2\u036e\u0369\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2"+
		"\2\2\u0370\u0371\3\2\2\2\u0371\u0375\3\2\2\2\u0372\u0370\3\2\2\2\u0373"+
		"\u0374\7\u00aa\2\2\u0374\u0376\5T+\2\u0375\u0373\3\2\2\2\u0375\u0376\3"+
		"\2\2\2\u0376E\3\2\2\2\u0377\u0379\5d\63\2\u0378\u0377\3\2\2\2\u0378\u0379"+
		"\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u0385\7\u00a3\2\2\u037b\u037c\7}\2"+
		"\2\u037c\u0386\7\u008e\2\2\u037d\u037e\7}\2\2\u037e\u0386\7\33\2\2\u037f"+
		"\u0380\7}\2\2\u0380\u0386\7\u008b\2\2\u0381\u0382\7}\2\2\u0382\u0386\7"+
		"O\2\2\u0383\u0384\7}\2\2\u0384\u0386\7Z\2\2\u0385\u037b\3\2\2\2\u0385"+
		"\u037d\3\2\2\2\u0385\u037f\3\2\2\2\u0385\u0381\3\2\2\2\u0385\u0383\3\2"+
		"\2\2\u0385\u0386\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388\5f\64\2\u0388"+
		"\u0389\7\u0093\2\2\u0389\u038a\5\u00ccg\2\u038a\u038b\7\b\2\2\u038b\u0393"+
		"\5T+\2\u038c\u038d\7\7\2\2\u038d\u038e\5\u00ccg\2\u038e\u038f\7\b\2\2"+
		"\u038f\u0390\5T+\2\u0390\u0392\3\2\2\2\u0391\u038c\3\2\2\2\u0392\u0395"+
		"\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0398\3\2\2\2\u0395"+
		"\u0393\3\2\2\2\u0396\u0397\7\u00aa\2\2\u0397\u0399\5T+\2\u0398\u0396\3"+
		"\2\2\2\u0398\u0399\3\2\2\2\u0399\u03ac\3\2\2\2\u039a\u039b\7~\2\2\u039b"+
		"\u039c\7*\2\2\u039c\u03a1\5h\65\2\u039d\u039e\7\7\2\2\u039e\u03a0\5h\65"+
		"\2\u039f\u039d\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2"+
		"\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a4\u039a\3\2\2\2\u03a4"+
		"\u03a5\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\7n\2\2\u03a7\u03aa\5T+"+
		"\2\u03a8\u03a9\t\4\2\2\u03a9\u03ab\5T+\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab"+
		"\3\2\2\2\u03ab\u03ad\3\2\2\2\u03ac\u03a4\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad"+
		"G\3\2\2\2\u03ae\u03af\7\u00a5\2\2\u03afI\3\2\2\2\u03b0\u03b2\5\u00ccg"+
		"\2\u03b1\u03b3\5L\'\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b7"+
		"\3\2\2\2\u03b4\u03b6\5N(\2\u03b5\u03b4\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7"+
		"\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8K\3\2\2\2\u03b9\u03b7\3\2\2\2"+
		"\u03ba\u03bc\5\u00a6T\2\u03bb\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c9\3\2\2\2\u03bf\u03c0\7\5"+
		"\2\2\u03c0\u03c1\5\u0098M\2\u03c1\u03c2\7\6\2\2\u03c2\u03ca\3\2\2\2\u03c3"+
		"\u03c4\7\5\2\2\u03c4\u03c5\5\u0098M\2\u03c5\u03c6\7\7\2\2\u03c6\u03c7"+
		"\5\u0098M\2\u03c7\u03c8\7\6\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03bf\3\2\2"+
		"\2\u03c9\u03c3\3\2\2\2\u03c9\u03ca\3\2\2\2\u03caM\3\2\2\2\u03cb\u03cc"+
		"\7\63\2\2\u03cc\u03ce\5\u00a6T\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2\2"+
		"\2\u03ce\u03f0\3\2\2\2\u03cf\u03d0\7\u0082\2\2\u03d0\u03d2\7k\2\2\u03d1"+
		"\u03d3\t\6\2\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3\2"+
		"\2\2\u03d4\u03d6\5P)\2\u03d5\u03d7\7&\2\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7"+
		"\3\2\2\2\u03d7\u03f1\3\2\2\2\u03d8\u03da\7u\2\2\u03d9\u03d8\3\2\2\2\u03d9"+
		"\u03da\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dc\7x\2\2\u03dc\u03f1\5P)"+
		"\2\u03dd\u03de\7\u00a2\2\2\u03de\u03f1\5P)\2\u03df\u03e0\7.\2\2\u03e0"+
		"\u03e1\7\5\2\2\u03e1\u03e2\5T+\2\u03e2\u03e3\7\6\2\2\u03e3\u03f1\3\2\2"+
		"\2\u03e4\u03eb\7=\2\2\u03e5\u03ec\5\u0098M\2\u03e6\u03ec\5\u009aN\2\u03e7"+
		"\u03e8\7\5\2\2\u03e8\u03e9\5T+\2\u03e9\u03ea\7\6\2\2\u03ea\u03ec\3\2\2"+
		"\2\u03eb\u03e5\3\2\2\2\u03eb\u03e6\3\2\2\2\u03eb\u03e7\3\2\2\2\u03ec\u03f1"+
		"\3\2\2\2\u03ed\u03ee\7/\2\2\u03ee\u03f1\5\u00ceh\2\u03ef\u03f1\5\\/\2"+
		"\u03f0\u03cf\3\2\2\2\u03f0\u03d9\3\2\2\2\u03f0\u03dd\3\2\2\2\u03f0\u03df"+
		"\3\2\2\2\u03f0\u03e4\3\2\2\2\u03f0\u03ed\3\2\2\2\u03f0\u03ef\3\2\2\2\u03f1"+
		"O\3\2\2\2\u03f2\u03f3\7|\2\2\u03f3\u03f4\7\62\2\2\u03f4\u03f6\t\7\2\2"+
		"\u03f5\u03f2\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6Q\3\2\2\2\u03f7\u03f8\b"+
		"*\1\2\u03f8\u0420\5\u009aN\2\u03f9\u0420\7\u00b0\2\2\u03fa\u0420\5V,\2"+
		"\u03fb\u03fc\5\u009cO\2\u03fc\u03fd\5R*\25\u03fd\u0420\3\2\2\2\u03fe\u0420"+
		"\5\u00aaV\2\u03ff\u0420\5\u00aeX\2\u0400\u0401\7\5\2\2\u0401\u0402\5R"+
		"*\2\u0402\u0403\7\6\2\2\u0403\u0420\3\2\2\2\u0404\u0405\7-\2\2\u0405\u0406"+
		"\7\5\2\2\u0406\u0407\5R*\2\u0407\u0408\7#\2\2\u0408\u0409\5L\'\2\u0409"+
		"\u040a\7\6\2\2\u040a\u0420\3\2\2\2\u040b\u040d\7,\2\2\u040c\u040e\5R*"+
		"\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0414\3\2\2\2\u040f\u0410"+
		"\7\u00a9\2\2\u0410\u0411\5R*\2\u0411\u0412\7\u0097\2\2\u0412\u0413\5R"+
		"*\2\u0413\u0415\3\2\2\2\u0414\u040f\3\2\2\2\u0415\u0416\3\2\2\2\u0416"+
		"\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u041a\3\2\2\2\u0418\u0419\7F"+
		"\2\2\u0419\u041b\5R*\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c"+
		"\3\2\2\2\u041c\u041d\7G\2\2\u041d\u0420\3\2\2\2\u041e\u0420\5^\60\2\u041f"+
		"\u03f7\3\2\2\2\u041f\u03f9\3\2\2\2\u041f\u03fa\3\2\2\2\u041f\u03fb\3\2"+
		"\2\2\u041f\u03fe\3\2\2\2\u041f\u03ff\3\2\2\2\u041f\u0400\3\2\2\2\u041f"+
		"\u0404\3\2\2\2\u041f\u040b\3\2\2\2\u041f\u041e\3\2\2\2\u0420\u045d\3\2"+
		"\2\2\u0421\u0422\f\24\2\2\u0422\u0423\7\r\2\2\u0423\u045c\5R*\25\u0424"+
		"\u0425\f\23\2\2\u0425\u0426\t\b\2\2\u0426\u045c\5R*\24\u0427\u0428\f\22"+
		"\2\2\u0428\u0429\t\t\2\2\u0429\u045c\5R*\23\u042a\u042b\f\21\2\2\u042b"+
		"\u042c\t\n\2\2\u042c\u045c\5R*\22\u042d\u042e\f\20\2\2\u042e\u042f\t\13"+
		"\2\2\u042f\u045c\5R*\21\u0430\u0431\f\17\2\2\u0431\u0432\5Z.\2\u0432\u0433"+
		"\5R*\20\u0433\u045c\3\2\2\2\u0434\u0435\f\16\2\2\u0435\u0436\5\u00b6\\"+
		"\2\u0436\u0437\5R*\17\u0437\u045c\3\2\2\2\u0438\u0439\f\6\2\2\u0439\u043b"+
		"\7e\2\2\u043a\u043c\7u\2\2\u043b\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c"+
		"\u043d\3\2\2\2\u043d\u045c\5R*\7\u043e\u0440\f\5\2\2\u043f\u0441\7u\2"+
		"\2\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443"+
		"\7)\2\2\u0443\u0444\5R*\2\u0444\u0445\7\"\2\2\u0445\u0446\5R*\6\u0446"+
		"\u045c\3\2\2\2\u0447\u0448\f\t\2\2\u0448\u0449\7/\2\2\u0449\u045c\5\u00ce"+
		"h\2\u044a\u044c\f\b\2\2\u044b\u044d\7u\2\2\u044c\u044b\3\2\2\2\u044c\u044d"+
		"\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044f\t\f\2\2\u044f\u0452\5R*\2\u0450"+
		"\u0451\7H\2\2\u0451\u0453\5R*\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2"+
		"\2\u0453\u045c\3\2\2\2\u0454\u0459\f\7\2\2\u0455\u045a\7h\2\2\u0456\u045a"+
		"\7w\2\2\u0457\u0458\7u\2\2\u0458\u045a\7x\2\2\u0459\u0455\3\2\2\2\u0459"+
		"\u0456\3\2\2\2\u0459\u0457\3\2\2\2\u045a\u045c\3\2\2\2\u045b\u0421\3\2"+
		"\2\2\u045b\u0424\3\2\2\2\u045b\u0427\3\2\2\2\u045b\u042a\3\2\2\2\u045b"+
		"\u042d\3\2\2\2\u045b\u0430\3\2\2\2\u045b\u0434\3\2\2\2\u045b\u0438\3\2"+
		"\2\2\u045b\u043e\3\2\2\2\u045b\u0447\3\2\2\2\u045b\u044a\3\2\2\2\u045b"+
		"\u0454\3\2\2\2\u045c\u045f\3\2\2\2\u045d\u045b\3\2\2\2\u045d\u045e\3\2"+
		"\2\2\u045eS\3\2\2\2\u045f\u045d\3\2\2\2\u0460\u0461\b+\1\2\u0461\u0499"+
		"\5\u009aN\2\u0462\u0499\7\u00b0\2\2\u0463\u0499\5V,\2\u0464\u0465\5\u009c"+
		"O\2\u0465\u0466\5T+\27\u0466\u0499\3\2\2\2\u0467\u0499\5\u00aaV\2\u0468"+
		"\u0499\5\u00aeX\2\u0469\u046a\7\5\2\2\u046a\u046b\5T+\2\u046b\u046c\7"+
		"\6\2\2\u046c\u0499\3\2\2\2\u046d\u046e\7-\2\2\u046e\u046f\7\5\2\2\u046f"+
		"\u0470\5T+\2\u0470\u0471\7#\2\2\u0471\u0472\5L\'\2\u0472\u0473\7\6\2\2"+
		"\u0473\u0499\3\2\2\2\u0474\u0476\7u\2\2\u0475\u0474\3\2\2\2\u0475\u0476"+
		"\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0479\7K\2\2\u0478\u0475\3\2\2\2\u0478"+
		"\u0479\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\7\5\2\2\u047b\u047c\5B"+
		"\"\2\u047c\u047d\7\6\2\2\u047d\u0499\3\2\2\2\u047e\u0480\7,\2\2\u047f"+
		"\u0481\5T+\2\u0480\u047f\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0487\3\2\2"+
		"\2\u0482\u0483\7\u00a9\2\2\u0483\u0484\5T+\2\u0484\u0485\7\u0097\2\2\u0485"+
		"\u0486\5T+\2\u0486\u0488\3\2\2\2\u0487\u0482\3\2\2\2\u0488\u0489\3\2\2"+
		"\2\u0489\u0487\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048d\3\2\2\2\u048b\u048c"+
		"\7F\2\2\u048c\u048e\5T+\2\u048d\u048b\3\2\2\2\u048d\u048e\3\2\2\2\u048e"+
		"\u048f\3\2\2\2\u048f\u0490\7G\2\2\u0490\u0499\3\2\2\2\u0491\u0492\7M\2"+
		"\2\u0492\u0493\7\5\2\2\u0493\u0494\t\r\2\2\u0494\u0495\7R\2\2\u0495\u0496"+
		"\5T+\2\u0496\u0497\7\6\2\2\u0497\u0499\3\2\2\2\u0498\u0460\3\2\2\2\u0498"+
		"\u0462\3\2\2\2\u0498\u0463\3\2\2\2\u0498\u0464\3\2\2\2\u0498\u0467\3\2"+
		"\2\2\u0498\u0468\3\2\2\2\u0498\u0469\3\2\2\2\u0498\u046d\3\2\2\2\u0498"+
		"\u0478\3\2\2\2\u0498\u047e\3\2\2\2\u0498\u0491\3\2\2\2\u0499\u04f0\3\2"+
		"\2\2\u049a\u049b\f\26\2\2\u049b\u049c\7\r\2\2\u049c\u04ef\5T+\27\u049d"+
		"\u049e\f\25\2\2\u049e\u049f\t\b\2\2\u049f\u04ef\5T+\26\u04a0\u04a1\f\24"+
		"\2\2\u04a1\u04a2\t\t\2\2\u04a2\u04ef\5T+\25\u04a3\u04a4\f\23\2\2\u04a4"+
		"\u04a5\t\n\2\2\u04a5\u04ef\5T+\24\u04a6\u04a7\f\22\2\2\u04a7\u04a8\t\13"+
		"\2\2\u04a8\u04ef\5T+\23\u04a9\u04aa\f\21\2\2\u04aa\u04ab\5Z.\2\u04ab\u04ac"+
		"\5T+\22\u04ac\u04ef\3\2\2\2\u04ad\u04ae\f\20\2\2\u04ae\u04af\5\u00b6\\"+
		"\2\u04af\u04b0\5T+\21\u04b0\u04ef\3\2\2\2\u04b1\u04b2\f\b\2\2\u04b2\u04b4"+
		"\7e\2\2\u04b3\u04b5\7u\2\2\u04b4\u04b3\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5"+
		"\u04b6\3\2\2\2\u04b6\u04ef\5T+\t\u04b7\u04b9\f\7\2\2\u04b8\u04ba\7u\2"+
		"\2\u04b9\u04b8\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc"+
		"\7)\2\2\u04bc\u04bd\5T+\2\u04bd\u04be\7\"\2\2\u04be\u04bf\5T+\b\u04bf"+
		"\u04ef\3\2\2\2\u04c0\u04c1\f\13\2\2\u04c1\u04c2\7/\2\2\u04c2\u04ef\5\u00ce"+
		"h\2\u04c3\u04c5\f\n\2\2\u04c4\u04c6\7u\2\2\u04c5\u04c4\3\2\2\2\u04c5\u04c6"+
		"\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\t\f\2\2\u04c8\u04cb\5T+\2\u04c9"+
		"\u04ca\7H\2\2\u04ca\u04cc\5T+\2\u04cb\u04c9\3\2\2\2\u04cb\u04cc\3\2\2"+
		"\2\u04cc\u04ef\3\2\2\2\u04cd\u04d2\f\t\2\2\u04ce\u04d3\7h\2\2\u04cf\u04d3"+
		"\7w\2\2\u04d0\u04d1\7u\2\2\u04d1\u04d3\7x\2\2\u04d2\u04ce\3\2\2\2\u04d2"+
		"\u04cf\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d3\u04ef\3\2\2\2\u04d4\u04d6\f\6"+
		"\2\2\u04d5\u04d7\7u\2\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7"+
		"\u04d8\3\2\2\2\u04d8\u04ec\7\\\2\2\u04d9\u04e3\7\5\2\2\u04da\u04e4\5B"+
		"\"\2\u04db\u04e0\5T+\2\u04dc\u04dd\7\7\2\2\u04dd\u04df\5T+\2\u04de\u04dc"+
		"\3\2\2\2\u04df\u04e2\3\2\2\2\u04e0\u04de\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1"+
		"\u04e4\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e3\u04da\3\2\2\2\u04e3\u04db\3\2"+
		"\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04ed\7\6\2\2\u04e6"+
		"\u04e7\5\u00c2b\2\u04e7\u04e8\7\4\2\2\u04e8\u04ea\3\2\2\2\u04e9\u04e6"+
		"\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ed\5\u00c6d"+
		"\2\u04ec\u04d9\3\2\2\2\u04ec\u04e9\3\2\2\2\u04ed\u04ef\3\2\2\2\u04ee\u049a"+
		"\3\2\2\2\u04ee\u049d\3\2\2\2\u04ee\u04a0\3\2\2\2\u04ee\u04a3\3\2\2\2\u04ee"+
		"\u04a6\3\2\2\2\u04ee\u04a9\3\2\2\2\u04ee\u04ad\3\2\2\2\u04ee\u04b1\3\2"+
		"\2\2\u04ee\u04b7\3\2\2\2\u04ee\u04c0\3\2\2\2\u04ee\u04c3\3\2\2\2\u04ee"+
		"\u04cd\3\2\2\2\u04ee\u04d4\3\2\2\2\u04ef\u04f2\3\2\2\2\u04f0\u04ee\3\2"+
		"\2\2\u04f0\u04f1\3\2\2\2\u04f1U\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f3\u0506"+
		"\3\2\2\2\u04f4\u04f5\5\u00c2b\2\u04f5\u04f6\7\4\2\2\u04f6\u04f8\3\2\2"+
		"\2\u04f7\u04f4\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa"+
		"\5\u00c6d\2\u04fa\u04fb\7\4\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04f7\3\2\2"+
		"\2\u04fc\u04fd\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0503\5\u00ccg\2\u04ff"+
		"\u0501\7#\2\2\u0500\u04ff\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\3\2"+
		"\2\2\u0502\u0504\5\u00a2R\2\u0503\u0500\3\2\2\2\u0503\u0504\3\2\2\2\u0504"+
		"\u0506\3\2\2\2\u0505\u04f3\3\2\2\2\u0505\u04fc\3\2\2\2\u0506W\3\2\2\2"+
		"\u0507\u051d\3\2\2\2\u0508\u0509\5\u00c2b\2\u0509\u050a\7\4\2\2\u050a"+
		"\u050c\3\2\2\2\u050b\u0508\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050d\3\2"+
		"\2\2\u050d\u050e\5\u00c6d\2\u050e\u050f\7\4\2\2\u050f\u0511\3\2\2\2\u0510"+
		"\u050b\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0514\5\u00cc"+
		"g\2\u0513\u0515\5p9\2\u0514\u0513\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u051a"+
		"\3\2\2\2\u0516\u0518\7#\2\2\u0517\u0516\3\2\2\2\u0517\u0518\3\2\2\2\u0518"+
		"\u0519\3\2\2\2\u0519\u051b\5\u00a2R\2\u051a\u0517\3\2\2\2\u051a\u051b"+
		"\3\2\2\2\u051b\u051d\3\2\2\2\u051c\u0507\3\2\2\2\u051c\u0510\3\2\2\2\u051d"+
		"Y\3\2\2\2\u051e\u052b\7\b\2\2\u051f\u052b\7\30\2\2\u0520\u052b\7\31\2"+
		"\2\u0521\u052b\7\32\2\2\u0522\u052b\7e\2\2\u0523\u0524\7e\2\2\u0524\u052b"+
		"\7u\2\2\u0525\u052b\5\u00ba^\2\u0526\u052b\5\u00bc_\2\u0527\u052b\7T\2"+
		"\2\u0528\u052b\7o\2\2\u0529\u052b\7\u0087\2\2\u052a\u051e\3\2\2\2\u052a"+
		"\u051f\3\2\2\2\u052a\u0520\3\2\2\2\u052a\u0521\3\2\2\2\u052a\u0522\3\2"+
		"\2\2\u052a\u0523\3\2\2\2\u052a\u0525\3\2\2\2\u052a\u0526\3\2\2\2\u052a"+
		"\u0527\3\2\2\2\u052a\u0528\3\2\2\2\u052a\u0529\3\2\2\2\u052b[\3\2\2\2"+
		"\u052c\u052d\7\u0086\2\2\u052d\u0539\5\u00d0i\2\u052e\u052f\7\5\2\2\u052f"+
		"\u0534\5\u00ccg\2\u0530\u0531\7\7\2\2\u0531\u0533\5\u00ccg\2\u0532\u0530"+
		"\3\2\2\2\u0533\u0536\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0537\3\2\2\2\u0536\u0534\3\2\2\2\u0537\u0538\7\6\2\2\u0538\u053a\3\2"+
		"\2\2\u0539\u052e\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u054d\3\2\2\2\u053b"+
		"\u053c\7|\2\2\u053c\u0545\t\16\2\2\u053d\u053e\7\u0093\2\2\u053e\u0546"+
		"\7x\2\2\u053f\u0540\7\u0093\2\2\u0540\u0546\7=\2\2\u0541\u0546\7+\2\2"+
		"\u0542\u0546\7\u008c\2\2\u0543\u0544\7t\2\2\u0544\u0546\7\34\2\2\u0545"+
		"\u053d\3\2\2\2\u0545\u053f\3\2\2\2\u0545\u0541\3\2\2\2\u0545\u0542\3\2"+
		"\2\2\u0545\u0543\3\2\2\2\u0546\u054a\3\2\2\2\u0547\u0548\7o\2\2\u0548"+
		"\u054a\5\u00a6T\2\u0549\u053b\3\2\2\2\u0549\u0547\3\2\2\2\u054a\u054c"+
		"\3\2\2\2\u054b\u0549\3\2\2\2\u054c\u054f\3\2\2\2\u054d\u054b\3\2\2\2\u054d"+
		"\u054e\3\2\2\2\u054e\u055a\3\2\2\2\u054f\u054d\3\2\2\2\u0550\u0552\7u"+
		"\2\2\u0551\u0550\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0553\3\2\2\2\u0553"+
		"\u0558\7>\2\2\u0554\u0555\7_\2\2\u0555\u0559\7?\2\2\u0556\u0557\7_\2\2"+
		"\u0557\u0559\7[\2\2\u0558\u0554\3\2\2\2\u0558\u0556\3\2\2\2\u0558\u0559"+
		"\3\2\2\2\u0559\u055b\3\2\2\2\u055a\u0551\3\2\2\2\u055a\u055b\3\2\2\2\u055b"+
		"]\3\2\2\2\u055c\u055d\7\u0084\2\2\u055d\u0562\7\5\2\2\u055e\u0563\7Z\2"+
		"\2\u055f\u0560\t\17\2\2\u0560\u0561\7\7\2\2\u0561\u0563\5\u009eP\2\u0562"+
		"\u055e\3\2\2\2\u0562\u055f\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0565\7\6"+
		"\2\2\u0565_\3\2\2\2\u0566\u0569\5\u00ccg\2\u0567\u0568\7/\2\2\u0568\u056a"+
		"\5\u00ceh\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056c\3\2\2"+
		"\2\u056b\u056d\t\6\2\2\u056c\u056b\3\2\2\2\u056c\u056d\3\2\2\2\u056da"+
		"\3\2\2\2\u056e\u056f\7\63\2\2\u056f\u0571\5\u00a6T\2\u0570\u056e\3\2\2"+
		"\2\u0570\u0571\3\2\2\2\u0571\u0596\3\2\2\2\u0572\u0573\7\u0082\2\2\u0573"+
		"\u0576\7k\2\2\u0574\u0576\7\u00a2\2\2\u0575\u0572\3\2\2\2\u0575\u0574"+
		"\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0578\7\5\2\2\u0578\u057d\5`\61\2\u0579"+
		"\u057a\7\7\2\2\u057a\u057c\5`\61\2\u057b\u0579\3\2\2\2\u057c\u057f\3\2"+
		"\2\2\u057d\u057b\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0580\3\2\2\2\u057f"+
		"\u057d\3\2\2\2\u0580\u0581\7\6\2\2\u0581\u0582\5P)\2\u0582\u0597\3\2\2"+
		"\2\u0583\u0584\7.\2\2\u0584\u0585\7\5\2\2\u0585\u0586\5T+\2\u0586\u0587"+
		"\7\6\2\2\u0587\u0597\3\2\2\2\u0588\u0589\7Q\2\2\u0589\u058a\7k\2\2\u058a"+
		"\u058b\7\5\2\2\u058b\u0590\5\u00ccg\2\u058c\u058d\7\7\2\2\u058d\u058f"+
		"\5\u00ccg\2\u058e\u058c\3\2\2\2\u058f\u0592\3\2\2\2\u0590\u058e\3\2\2"+
		"\2\u0590\u0591\3\2\2\2\u0591\u0593\3\2\2\2\u0592\u0590\3\2\2\2\u0593\u0594"+
		"\7\6\2\2\u0594\u0595\5\\/\2\u0595\u0597\3\2\2\2\u0596\u0575\3\2\2\2\u0596"+
		"\u0583\3\2\2\2\u0596\u0588\3\2\2\2\u0597c\3\2\2\2\u0598\u059a\7\u00ab"+
		"\2\2\u0599\u059b\7\u0085\2\2\u059a\u0599\3\2\2\2\u059a\u059b\3\2\2\2\u059b"+
		"\u059c\3\2\2\2\u059c\u059d\5\u0096L\2\u059d\u059e\7#\2\2\u059e\u059f\7"+
		"\5\2\2\u059f\u05a0\5B\"\2\u05a0\u05aa\7\6\2\2\u05a1\u05a2\7\7\2\2\u05a2"+
		"\u05a3\5\u0096L\2\u05a3\u05a4\7#\2\2\u05a4\u05a5\7\5\2\2\u05a5\u05a6\5"+
		"B\"\2\u05a6\u05a7\7\6\2\2\u05a7\u05a9\3\2\2\2\u05a8\u05a1\3\2\2\2\u05a9"+
		"\u05ac\3\2\2\2\u05aa\u05a8\3\2\2\2\u05aa\u05ab\3\2\2\2\u05abe\3\2\2\2"+
		"\u05ac\u05aa\3\2\2\2\u05ad\u05ae\5\u00c2b\2\u05ae\u05af\7\4\2\2\u05af"+
		"\u05b1\3\2\2\2\u05b0\u05ad\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b2\3\2"+
		"\2\2\u05b2\u05b8\5\u00c6d\2\u05b3\u05b4\7^\2\2\u05b4\u05b5\7*\2\2\u05b5"+
		"\u05b9\5\u00d2j\2\u05b6\u05b7\7u\2\2\u05b7\u05b9\7^\2\2\u05b8\u05b3\3"+
		"\2\2\2\u05b8\u05b6\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9g\3\2\2\2\u05ba\u05bd"+
		"\5T+\2\u05bb\u05bc\7/\2\2\u05bc\u05be\5\u00ceh\2\u05bd\u05bb\3\2\2\2\u05bd"+
		"\u05be\3\2\2\2\u05be\u05c0\3\2\2\2\u05bf\u05c1\t\6\2\2\u05c0\u05bf\3\2"+
		"\2\2\u05c0\u05c1\3\2\2\2\u05c1i\3\2\2\2\u05c2\u05c6\5\u0098M\2\u05c3\u05c6"+
		"\5\u00a6T\2\u05c4\u05c6\7\u00b1\2\2\u05c5\u05c2\3\2\2\2\u05c5\u05c3\3"+
		"\2\2\2\u05c5\u05c4\3\2\2\2\u05c6k\3\2\2\2\u05c7\u05d3\5\u00c6d\2\u05c8"+
		"\u05c9\7\5\2\2\u05c9\u05ce\5\u00ccg\2\u05ca\u05cb\7\7\2\2\u05cb\u05cd"+
		"\5\u00ccg\2\u05cc\u05ca\3\2\2\2\u05cd\u05d0\3\2\2\2\u05ce\u05cc\3\2\2"+
		"\2\u05ce\u05cf\3\2\2\2\u05cf\u05d1\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d1\u05d2"+
		"\7\6\2\2\u05d2\u05d4\3\2\2\2\u05d3\u05c8\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4"+
		"\u05d5\3\2\2\2\u05d5\u05d6\7#\2\2\u05d6\u05d7\7\5\2\2\u05d7\u05d8\5B\""+
		"\2\u05d8\u05d9\7\6\2\2\u05d9m\3\2\2\2\u05da\u05ea\7\t\2\2\u05db\u05dc"+
		"\5\u00c6d\2\u05dc\u05dd\7\4\2\2\u05dd\u05de\7\t\2\2\u05de\u05ea\3\2\2"+
		"\2\u05df\u05ea\5X-\2\u05e0\u05ea\5\u00a8U\2\u05e1\u05ea\5\u00acW\2\u05e2"+
		"\u05e7\5R*\2\u05e3\u05e5\7#\2\2\u05e4\u05e3\3\2\2\2\u05e4\u05e5\3\2\2"+
		"\2\u05e5\u05e6\3\2\2\2\u05e6\u05e8\5\u00a2R\2\u05e7\u05e4\3\2\2\2\u05e7"+
		"\u05e8\3\2\2\2\u05e8\u05ea\3\2\2\2\u05e9\u05da\3\2\2\2\u05e9\u05db\3\2"+
		"\2\2\u05e9\u05df\3\2\2\2\u05e9\u05e0\3\2\2\2\u05e9\u05e1\3\2\2\2\u05e9"+
		"\u05e2\3\2\2\2\u05eao\3\2\2\2\u05eb\u05ec\7\24\2\2\u05ec\u05ee\7Y\2\2"+
		"\u05ed\u05ef\5r:\2\u05ee\u05ed\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0"+
		"\3\2\2\2\u05f0\u05f5\7\26\2\2\u05f1\u05f2\7\24\2\2\u05f2\u05f3\7v\2\2"+
		"\u05f3\u05f5\7\26\2\2\u05f4\u05eb\3\2\2\2\u05f4\u05f1\3\2\2\2\u05f5q\3"+
		"\2\2\2\u05f6\u05f8\5v<\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8"+
		"\u05fa\3\2\2\2\u05f9\u05fb\5x=\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2"+
		"\2\u05fb\u05fd\3\2\2\2\u05fc\u05fe\5~@\2\u05fd\u05fc\3\2\2\2\u05fd\u05fe"+
		"\3\2\2\2\u05fe\u0600\3\2\2\2\u05ff\u0601\5t;\2\u0600\u05ff\3\2\2\2\u0600"+
		"\u0601\3\2\2\2\u0601s\3\2\2\2\u0602\u0603\7i\2\2\u0603u\3\2\2\2\u0604"+
		"\u0605\7g\2\2\u0605\u0606\7\b\2\2\u0606\u0607\t\20\2\2\u0607w\3\2\2\2"+
		"\u0608\u060a\7;\2\2\u0609\u060b\5|?\2\u060a\u0609\3\2\2\2\u060a\u060b"+
		"\3\2\2\2\u060b\u060f\3\2\2\2\u060c\u060d\7\u009d\2\2\u060d\u060e\7*\2"+
		"\2\u060e\u0610\5z>\2\u060f\u060c\3\2\2\2\u060f\u0610\3\2\2\2\u0610y\3"+
		"\2\2\2\u0611\u061e\3\2\2\2\u0612\u0613\5\u00c2b\2\u0613\u0614\7\4\2\2"+
		"\u0614\u0616\3\2\2\2\u0615\u0612\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0617"+
		"\3\2\2\2\u0617\u0618\5\u00c6d\2\u0618\u0619\7\4\2\2\u0619\u061b\3\2\2"+
		"\2\u061a\u0615\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061e"+
		"\5\u00ccg\2\u061d\u0611\3\2\2\2\u061d\u061a\3\2\2\2\u061e{\3\2\2\2\u061f"+
		"\u0620\7f\2\2\u0620}\3\2\2\2\u0621\u0624\7{\2\2\u0622\u0623\7\b\2\2\u0623"+
		"\u0625\t\20\2\2\u0624\u0622\3\2\2\2\u0624\u0625\3\2\2\2\u0625\177\3\2"+
		"\2\2\u0626\u0627\5\u00c2b\2\u0627\u0628\7\4\2\2\u0628\u062a\3\2\2\2\u0629"+
		"\u0626\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u0630\5\u00c6"+
		"d\2\u062c\u062e\7#\2\2\u062d\u062c\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f"+
		"\3\2\2\2\u062f\u0631\5\u00dep\2\u0630\u062d\3\2\2\2\u0630\u0631\3\2\2"+
		"\2\u0631\u0637\3\2\2\2\u0632\u0633\7^\2\2\u0633\u0634\7*\2\2\u0634\u0638"+
		"\5\u00d2j\2\u0635\u0636\7u\2\2\u0636\u0638\7^\2\2\u0637\u0632\3\2\2\2"+
		"\u0637\u0635\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u0081\3\2\2\2\u0639\u0657"+
		"\5\u0080A\2\u063a\u0644\7\5\2\2\u063b\u0640\5\u0082B\2\u063c\u063d\7\7"+
		"\2\2\u063d\u063f\5\u0082B\2\u063e\u063c\3\2\2\2\u063f\u0642\3\2\2\2\u0640"+
		"\u063e\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0645\3\2\2\2\u0642\u0640\3\2"+
		"\2\2\u0643\u0645\5\u0084C\2\u0644\u063b\3\2\2\2\u0644\u0643\3\2\2\2\u0645"+
		"\u0646\3\2\2\2\u0646\u064b\7\6\2\2\u0647\u0649\7#\2\2\u0648\u0647\3\2"+
		"\2\2\u0648\u0649\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064c\5\u00dep\2\u064b"+
		"\u0648\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u0657\3\2\2\2\u064d\u064e\7\5"+
		"\2\2\u064e\u064f\5B\"\2\u064f\u0654\7\6\2\2\u0650\u0652\7#\2\2\u0651\u0650"+
		"\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0655\5\u00dep"+
		"\2\u0654\u0651\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0657\3\2\2\2\u0656\u0639"+
		"\3\2\2\2\u0656\u063a\3\2\2\2\u0656\u064d\3\2\2\2\u0657\u0083\3\2\2\2\u0658"+
		"\u065f\5\u0082B\2\u0659\u065a\5\u0086D\2\u065a\u065b\5\u0082B\2\u065b"+
		"\u065c\5\u0088E\2\u065c\u065e\3\2\2\2\u065d\u0659\3\2\2\2\u065e\u0661"+
		"\3\2\2\2\u065f\u065d\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u0085\3\2\2\2\u0661"+
		"\u065f\3\2\2\2\u0662\u0670\7\7\2\2\u0663\u0665\7s\2\2\u0664\u0663\3\2"+
		"\2\2\u0664\u0665\3\2\2\2\u0665\u066c\3\2\2\2\u0666\u0668\7l\2\2\u0667"+
		"\u0669\7\177\2\2\u0668\u0667\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066d\3"+
		"\2\2\2\u066a\u066d\7`\2\2\u066b\u066d\7\66\2\2\u066c\u0666\3\2\2\2\u066c"+
		"\u066a\3\2\2\2\u066c\u066b\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066e\3\2"+
		"\2\2\u066e\u0670\7j\2\2\u066f\u0662\3\2\2\2\u066f\u0664\3\2\2\2\u0670"+
		"\u0087\3\2\2\2\u0671\u0672\7|\2\2\u0672\u0680\5T+\2\u0673\u0674\7\u00a4"+
		"\2\2\u0674\u0675\7\5\2\2\u0675\u067a\5\u00ccg\2\u0676\u0677\7\7\2\2\u0677"+
		"\u0679\5\u00ccg\2\u0678\u0676\3\2\2\2\u0679\u067c\3\2\2\2\u067a\u0678"+
		"\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067d\3\2\2\2\u067c\u067a\3\2\2\2\u067d"+
		"\u067e\7\6\2\2\u067e\u0680\3\2\2\2\u067f\u0671\3\2\2\2\u067f\u0673\3\2"+
		"\2\2\u067f\u0680\3\2\2\2\u0680\u0089\3\2\2\2\u0681\u0683\7\u00ab\2\2\u0682"+
		"\u0684\7\u0085\2\2\u0683\u0682\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0685"+
		"\3\2\2\2\u0685\u068a\5l\67\2\u0686\u0687\7\7\2\2\u0687\u0689\5l\67\2\u0688"+
		"\u0686\3\2\2\2\u0689\u068c\3\2\2\2\u068a\u0688\3\2\2\2\u068a\u068b\3\2"+
		"\2\2\u068b\u068e\3\2\2\2\u068c\u068a\3\2\2\2\u068d\u0681\3\2\2\2\u068d"+
		"\u068e\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0699\5\u0090I\2\u0690\u0692"+
		"\7\u00a1\2\2\u0691\u0693\7\37\2\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2"+
		"\2\2\u0693\u0697\3\2\2\2\u0694\u0697\7c\2\2\u0695\u0697\7I\2\2\u0696\u0690"+
		"\3\2\2\2\u0696\u0694\3\2\2\2\u0696\u0695\3\2\2\2\u0697\u0698\3\2\2\2\u0698"+
		"\u069a\5\u0090I\2\u0699\u0696\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u0699"+
		"\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u06a7\3\2\2\2\u069d\u069e\7~\2\2\u069e"+
		"\u069f\7*\2\2\u069f\u06a4\5h\65\2\u06a0\u06a1\7\7\2\2\u06a1\u06a3\5h\65"+
		"\2\u06a2\u06a0\3\2\2\2\u06a3\u06a6\3\2\2\2\u06a4\u06a2\3\2\2\2\u06a4\u06a5"+
		"\3\2\2\2\u06a5\u06a8\3\2\2\2\u06a6\u06a4\3\2\2\2\u06a7\u069d\3\2\2\2\u06a7"+
		"\u06a8\3\2\2\2\u06a8\u06af\3\2\2\2\u06a9\u06aa\7n\2\2\u06aa\u06ad\5T+"+
		"\2\u06ab\u06ac\t\4\2\2\u06ac\u06ae\5T+\2\u06ad\u06ab\3\2\2\2\u06ad\u06ae"+
		"\3\2\2\2\u06ae\u06b0\3\2\2\2\u06af\u06a9\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0"+
		"\u008b\3\2\2\2\u06b1\u06b3\7\u00ab\2\2\u06b2\u06b4\7\u0085\2\2\u06b3\u06b2"+
		"\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06ba\5l\67\2\u06b6"+
		"\u06b7\7\7\2\2\u06b7\u06b9\5l\67\2\u06b8\u06b6\3\2\2\2\u06b9\u06bc\3\2"+
		"\2\2\u06ba\u06b8\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06be\3\2\2\2\u06bc"+
		"\u06ba\3\2\2\2\u06bd\u06b1\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06bf\3\2"+
		"\2\2\u06bf\u06c5\5\u0090I\2\u06c0\u06c1\5\u008eH\2\u06c1\u06c2\5\u0090"+
		"I\2\u06c2\u06c4\3\2\2\2\u06c3\u06c0\3\2\2\2\u06c4\u06c7\3\2\2\2\u06c5"+
		"\u06c3\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06d2\3\2\2\2\u06c7\u06c5\3\2"+
		"\2\2\u06c8\u06c9\7~\2\2\u06c9\u06ca\7*\2\2\u06ca\u06cf\5h\65\2\u06cb\u06cc"+
		"\7\7\2\2\u06cc\u06ce\5h\65\2\u06cd\u06cb\3\2\2\2\u06ce\u06d1\3\2\2\2\u06cf"+
		"\u06cd\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d3\3\2\2\2\u06d1\u06cf\3\2"+
		"\2\2\u06d2\u06c8\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06da\3\2\2\2\u06d4"+
		"\u06d5\7n\2\2\u06d5\u06d8\5T+\2\u06d6\u06d7\t\4\2\2\u06d7\u06d9\5T+\2"+
		"\u06d8\u06d6\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06db\3\2\2\2\u06da\u06d4"+
		"\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u008d\3\2\2\2\u06dc\u06e2\7\u00a1\2"+
		"\2\u06dd\u06de\7\u00a1\2\2\u06de\u06e2\7\37\2\2\u06df\u06e2\7c\2\2\u06e0"+
		"\u06e2\7I\2\2\u06e1\u06dc\3\2\2\2\u06e1\u06dd\3\2\2\2\u06e1\u06df\3\2"+
		"\2\2\u06e1\u06e0\3\2\2\2\u06e2\u008f\3\2\2\2\u06e3\u06e5\7\u0092\2\2\u06e4"+
		"\u06e6\t\21\2\2\u06e5\u06e4\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e7\3"+
		"\2\2\2\u06e7\u06ec\5n8\2\u06e8\u06e9\7\7\2\2\u06e9\u06eb\5n8\2\u06ea\u06e8"+
		"\3\2\2\2\u06eb\u06ee\3\2\2\2\u06ec\u06ea\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed"+
		"\u06f0\3\2\2\2\u06ee\u06ec\3\2\2\2\u06ef\u06f1\5\u0092J\2\u06f0\u06ef"+
		"\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1\u06f4\3\2\2\2\u06f2\u06f3\7\u00aa\2"+
		"\2\u06f3\u06f5\5T+\2\u06f4\u06f2\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u070a"+
		"\3\2\2\2\u06f6\u06f7\7U\2\2\u06f7\u06fa\7*\2\2\u06f8\u06fb\5V,\2\u06f9"+
		"\u06fb\5\u00aeX\2\u06fa\u06f8\3\2\2\2\u06fa\u06f9\3\2\2\2\u06fb\u0703"+
		"\3\2\2\2\u06fc\u06ff\7\7\2\2\u06fd\u0700\5V,\2\u06fe\u0700\5\u00aeX\2"+
		"\u06ff\u06fd\3\2\2\2\u06ff\u06fe\3\2\2\2\u0700\u0702\3\2\2\2\u0701\u06fc"+
		"\3\2\2\2\u0702\u0705\3\2\2\2\u0703\u0701\3\2\2\2\u0703\u0704\3\2\2\2\u0704"+
		"\u0708\3\2\2\2\u0705\u0703\3\2\2\2\u0706\u0707\7V\2\2\u0707\u0709\5T+"+
		"\2\u0708\u0706\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070b\3\2\2\2\u070a\u06f6"+
		"\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u0729\3\2\2\2\u070c\u070d\7\u00a6\2"+
		"\2\u070d\u070e\7\5\2\2\u070e\u0713\5T+\2\u070f\u0710\7\7\2\2\u0710\u0712"+
		"\5T+\2\u0711\u070f\3\2\2\2\u0712\u0715\3\2\2\2\u0713\u0711\3\2\2\2\u0713"+
		"\u0714\3\2\2\2\u0714\u0716\3\2\2\2\u0715\u0713\3\2\2\2\u0716\u0725\7\6"+
		"\2\2\u0717\u0718\7\7\2\2\u0718\u0719\7\5\2\2\u0719\u071e\5T+\2\u071a\u071b"+
		"\7\7\2\2\u071b\u071d\5T+\2\u071c\u071a\3\2\2\2\u071d\u0720\3\2\2\2\u071e"+
		"\u071c\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0721\3\2\2\2\u0720\u071e\3\2"+
		"\2\2\u0721\u0722\7\6\2\2\u0722\u0724\3\2\2\2\u0723\u0717\3\2\2\2\u0724"+
		"\u0727\3\2\2\2\u0725\u0723\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u0729\3\2"+
		"\2\2\u0727\u0725\3\2\2\2\u0728\u06e3\3\2\2\2\u0728\u070c\3\2\2\2\u0729"+
		"\u0091\3\2\2\2\u072a\u0734\7R\2\2\u072b\u0730\5\u0082B\2\u072c\u072d\7"+
		"\7\2\2\u072d\u072f\5\u0082B\2\u072e\u072c\3\2\2\2\u072f\u0732\3\2\2\2"+
		"\u0730\u072e\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0735\3\2\2\2\u0732\u0730"+
		"\3\2\2\2\u0733\u0735\5\u0084C\2\u0734\u072b\3\2\2\2\u0734\u0733\3\2\2"+
		"\2\u0735\u0093\3\2\2\2\u0736\u073d\7\u00a1\2\2\u0737\u0738\7\u00a1\2\2"+
		"\u0738\u073d\7\37\2\2\u0739\u073d\7c\2\2\u073a\u073d\7I\2\2\u073b\u073d"+
		"\7p\2\2\u073c\u0736\3\2\2\2\u073c\u0737\3\2\2\2\u073c\u0739\3\2\2\2\u073c"+
		"\u073a\3\2\2\2\u073c\u073b\3\2\2\2\u073d\u0095\3\2\2\2\u073e\u074a\5\u00c6"+
		"d\2\u073f\u0740\7\5\2\2\u0740\u0745\5\u00ccg\2\u0741\u0742\7\7\2\2\u0742"+
		"\u0744\5\u00ccg\2\u0743\u0741\3\2\2\2\u0744\u0747\3\2\2\2\u0745\u0743"+
		"\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0748\3\2\2\2\u0747\u0745\3\2\2\2\u0748"+
		"\u0749\7\6\2\2\u0749\u074b\3\2\2\2\u074a\u073f\3\2\2\2\u074a\u074b\3\2"+
		"\2\2\u074b\u0097\3\2\2\2\u074c\u074e\t\t\2\2\u074d\u074c\3\2\2\2\u074d"+
		"\u074e\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u0750\7\u00af\2\2\u0750\u0099"+
		"\3\2\2\2\u0751\u0752\t\22\2\2\u0752\u009b\3\2\2\2\u0753\u0754\t\23\2\2"+
		"\u0754\u009d\3\2\2\2\u0755\u0756\7\u00b1\2\2\u0756\u009f\3\2\2\2\u0757"+
		"\u075a\5T+\2\u0758\u075a\5J&\2\u0759\u0757\3\2\2\2\u0759\u0758\3\2\2\2"+
		"\u075a\u00a1\3\2\2\2\u075b\u075c\t\24\2\2\u075c\u00a3\3\2\2\2\u075d\u075e"+
		"\t\25\2\2\u075e\u00a5\3\2\2\2\u075f\u0760\5\u00e2r\2\u0760\u00a7\3\2\2"+
		"\2\u0761\u0762\7\64\2\2\u0762\u076c\7\5\2\2\u0763\u0765\5\u00be`\2\u0764"+
		"\u0763\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u076d\5X"+
		"-\2\u0767\u076d\7\t\2\2\u0768\u076a\7C\2\2\u0769\u0768\3\2\2\2\u0769\u076a"+
		"\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076d\5\u00aeX\2\u076c\u0764\3\2\2"+
		"\2\u076c\u0767\3\2\2\2\u076c\u0769\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u076e"+
		"\3\2\2\2\u076e\u0770\7\6\2\2\u076f\u0771\5p9\2\u0770\u076f\3\2\2\2\u0770"+
		"\u0771\3\2\2\2\u0771\u0776\3\2\2\2\u0772\u0774\7#\2\2\u0773\u0772\3\2"+
		"\2\2\u0773\u0774\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0777\5\u00a2R\2\u0776"+
		"\u0773\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u00a9\3\2\2\2\u0778\u0779\7\64"+
		"\2\2\u0779\u0783\7\5\2\2\u077a\u077c\5\u00be`\2\u077b\u077a\3\2\2\2\u077b"+
		"\u077c\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u0784\5V,\2\u077e\u0784\7\t\2"+
		"\2\u077f\u0781\7C\2\2\u0780\u077f\3\2\2\2\u0780\u0781\3\2\2\2\u0781\u0782"+
		"\3\2\2\2\u0782\u0784\5\u00aeX\2\u0783\u077b\3\2\2\2\u0783\u077e\3\2\2"+
		"\2\u0783\u0780\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0787"+
		"\7\6\2\2\u0786\u0788\5p9\2\u0787\u0786\3\2\2\2\u0787\u0788\3\2\2\2\u0788"+
		"\u078d\3\2\2\2\u0789\u078b\7#\2\2\u078a\u0789\3\2\2\2\u078a\u078b\3\2"+
		"\2\2\u078b\u078c\3\2\2\2\u078c\u078e\5\u00a2R\2\u078d\u078a\3\2\2\2\u078d"+
		"\u078e\3\2\2\2\u078e\u00ab\3\2\2\2\u078f\u0790\5\u00c0a\2\u0790\u07a7"+
		"\7\5\2\2\u0791\u0793\7C\2\2\u0792\u0791\3\2\2\2\u0792\u0793\3\2\2\2\u0793"+
		"\u0798\3\2\2\2\u0794\u0799\5X-\2\u0795\u0799\5\u00aeX\2\u0796\u0799\5"+
		"\u00b0Y\2\u0797\u0799\5\u009aN\2\u0798\u0794\3\2\2\2\u0798\u0795\3\2\2"+
		"\2\u0798\u0796\3\2\2\2\u0798\u0797\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u07a4"+
		"\3\2\2\2\u079a\u07a0\7\7\2\2\u079b\u07a1\5X-\2\u079c\u07a1\5\u00aeX\2"+
		"\u079d\u07a1\5\u00b0Y\2\u079e\u07a1\5\u009aN\2\u079f\u07a1\7\t\2\2\u07a0"+
		"\u079b\3\2\2\2\u07a0\u079c\3\2\2\2\u07a0\u079d\3\2\2\2\u07a0\u079e\3\2"+
		"\2\2\u07a0\u079f\3\2\2\2\u07a1\u07a3\3\2\2\2\u07a2\u079a\3\2\2\2\u07a3"+
		"\u07a6\3\2\2\2\u07a4\u07a2\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07a8\3\2"+
		"\2\2\u07a6\u07a4\3\2\2\2\u07a7\u0792\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8"+
		"\u07a9\3\2\2\2\u07a9\u07ab\7\6\2\2\u07aa\u07ac\5p9\2\u07ab\u07aa\3\2\2"+
		"\2\u07ab\u07ac\3\2\2\2\u07ac\u07b1\3\2\2\2\u07ad\u07af\7#\2\2\u07ae\u07ad"+
		"\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b2\5\u00a2R"+
		"\2\u07b1\u07ae\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u00ad\3\2\2\2\u07b3\u07b4"+
		"\5\u00c0a\2\u07b4\u07cb\7\5\2\2\u07b5\u07b7\7C\2\2\u07b6\u07b5\3\2\2\2"+
		"\u07b6\u07b7\3\2\2\2\u07b7\u07bc\3\2\2\2\u07b8\u07bd\5V,\2\u07b9\u07bd"+
		"\5\u00aeX\2\u07ba\u07bd\5\u00b0Y\2\u07bb\u07bd\5\u009aN\2\u07bc\u07b8"+
		"\3\2\2\2\u07bc\u07b9\3\2\2\2\u07bc\u07ba\3\2\2\2\u07bc\u07bb\3\2\2\2\u07bc"+
		"\u07bd\3\2\2\2\u07bd\u07c8\3\2\2\2\u07be\u07c4\7\7\2\2\u07bf\u07c5\5V"+
		",\2\u07c0\u07c5\5\u00aeX\2\u07c1\u07c5\5\u00b0Y\2\u07c2\u07c5\5\u009a"+
		"N\2\u07c3\u07c5\7\t\2\2\u07c4\u07bf\3\2\2\2\u07c4\u07c0\3\2\2\2\u07c4"+
		"\u07c1\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c4\u07c3\3\2\2\2\u07c5\u07c7\3\2"+
		"\2\2\u07c6\u07be\3\2\2\2\u07c7\u07ca\3\2\2\2\u07c8\u07c6\3\2\2\2\u07c8"+
		"\u07c9\3\2\2\2\u07c9\u07cc\3\2\2\2\u07ca\u07c8\3\2\2\2\u07cb\u07b6\3\2"+
		"\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07cf\7\6\2\2\u07ce"+
		"\u07d0\5p9\2\u07cf\u07ce\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0\u07d5\3\2\2"+
		"\2\u07d1\u07d3\7#\2\2\u07d2\u07d1\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d4"+
		"\3\2\2\2\u07d4\u07d6\5\u00a2R\2\u07d5\u07d2\3\2\2\2\u07d5\u07d6\3\2\2"+
		"\2\u07d6\u00af\3\2\2\2\u07d7\u07d8\bY\1\2\u07d8\u07e0\7\u00af\2\2\u07d9"+
		"\u07e0\5V,\2\u07da\u07e0\5\u00aeX\2\u07db\u07dc\7\5\2\2\u07dc\u07dd\5"+
		"\u00b0Y\2\u07dd\u07de\7\6\2\2\u07de\u07e0\3\2\2\2\u07df\u07d7\3\2\2\2"+
		"\u07df\u07d9\3\2\2\2\u07df\u07da\3\2\2\2\u07df\u07db\3\2\2\2\u07e0\u07e9"+
		"\3\2\2\2\u07e1\u07e2\f\5\2\2\u07e2\u07e3\t\b\2\2\u07e3\u07e8\5\u00b0Y"+
		"\6\u07e4\u07e5\f\4\2\2\u07e5\u07e6\t\t\2\2\u07e6\u07e8\5\u00b0Y\5\u07e7"+
		"\u07e1\3\2\2\2\u07e7\u07e4\3\2\2\2\u07e8\u07eb\3\2\2\2\u07e9\u07e7\3\2"+
		"\2\2\u07e9\u07ea\3\2\2\2\u07ea\u00b1\3\2\2\2\u07eb\u07e9\3\2\2\2\u07ec"+
		"\u07ed\7\"\2\2\u07ed\u00b3\3\2\2\2\u07ee\u07ef\7}\2\2\u07ef\u00b5\3\2"+
		"\2\2\u07f0\u07f1\t\26\2\2\u07f1\u00b7\3\2\2\2\u07f2\u07f3\7u\2\2\u07f3"+
		"\u00b9\3\2\2\2\u07f4\u07f5\7\\\2\2\u07f5\u00bb\3\2\2\2\u07f6\u07f7\7m"+
		"\2\2\u07f7\u00bd\3\2\2\2\u07f8\u07f9\7C\2\2\u07f9\u00bf\3\2\2\2\u07fa"+
		"\u07fb\5\u00e2r\2\u07fb\u00c1\3\2\2\2\u07fc\u07fd\5\u00e2r\2\u07fd\u00c3"+
		"\3\2\2\2\u07fe\u07ff\5\u00e2r\2\u07ff\u00c5\3\2\2\2\u0800\u0801\5\u00e2"+
		"r\2\u0801\u00c7\3\2\2\2\u0802\u0803\5\u00e2r\2\u0803\u00c9\3\2\2\2\u0804"+
		"\u0805\5\u00e2r\2\u0805\u00cb\3\2\2\2\u0806\u0807\5\u00e2r\2\u0807\u00cd"+
		"\3\2\2\2\u0808\u0809\5\u00e2r\2\u0809\u00cf\3\2\2\2\u080a\u080b\5\u00e2"+
		"r\2\u080b\u00d1\3\2\2\2\u080c\u080d\5\u00e2r\2\u080d\u00d3\3\2\2\2\u080e"+
		"\u080f\5\u00e2r\2\u080f\u00d5\3\2\2\2\u0810\u0811\5\u00e2r\2\u0811\u00d7"+
		"\3\2\2\2\u0812\u0813\5\u00e2r\2\u0813\u00d9\3\2\2\2\u0814\u0815\5\u00e2"+
		"r\2\u0815\u00db\3\2\2\2\u0816\u0817\5\u00e2r\2\u0817\u00dd\3\2\2\2\u0818"+
		"\u0819\5\u00e2r\2\u0819\u00df\3\2\2\2\u081a\u081b\5\u00e2r\2\u081b\u00e1"+
		"\3\2\2\2\u081c\u0824\7\u00ae\2\2\u081d\u0824\5\u00a4S\2\u081e\u0824\7"+
		"\u00b1\2\2\u081f\u0820\7\5\2\2\u0820\u0821\5\u00e2r\2\u0821\u0822\7\6"+
		"\2\2\u0822\u0824\3\2\2\2\u0823\u081c\3\2\2\2\u0823\u081d\3\2\2\2\u0823"+
		"\u081e\3\2\2\2\u0823\u081f\3\2\2\2\u0824\u00e3\3\2\2\2\u0825\u0827\13"+
		"\2\2\2\u0826\u0825\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u0826\3\2\2\2\u0828"+
		"\u0829\3\2\2\2\u0829\u00e5\3\2\2\2\u0126\u00e8\u00ea\u00f6\u00fc\u0102"+
		"\u0104\u0123\u012e\u0136\u0139\u0142\u0146\u014e\u0152\u0154\u0159\u015b"+
		"\u015f\u0166\u0169\u0171\u017a\u017d\u0183\u0185\u0189\u018f\u0194\u019f"+
		"\u01a5\u01a9\u01af\u01b4\u01bd\u01c4\u01ca\u01ce\u01d2\u01d8\u01dd\u01e4"+
		"\u01ef\u01f2\u01f4\u01fa\u0200\u0204\u020b\u0211\u0217\u021d\u0222\u022e"+
		"\u0233\u023e\u0243\u0246\u024c\u024f\u0255\u025e\u0261\u0267\u0269\u0270"+
		"\u0278\u027d\u0285\u028a\u0292\u0297\u029f\u02a4\u02a9\u02bc\u02c2\u02cb"+
		"\u02d0\u02d9\u02e4\u02eb\u02f1\u02f7\u0300\u0307\u030b\u030d\u0311\u0318"+
		"\u031a\u031e\u0321\u0328\u0338\u0347\u034a\u0350\u0352\u0355\u0362\u0370"+
		"\u0375\u0378\u0385\u0393\u0398\u03a1\u03a4\u03aa\u03ac\u03b2\u03b7\u03bd"+
		"\u03c9\u03cd\u03d2\u03d6\u03d9\u03eb\u03f0\u03f5\u040d\u0416\u041a\u041f"+
		"\u043b\u0440\u044c\u0452\u0459\u045b\u045d\u0475\u0478\u0480\u0489\u048d"+
		"\u0498\u04b4\u04b9\u04c5\u04cb\u04d2\u04d6\u04e0\u04e3\u04e9\u04ec\u04ee"+
		"\u04f0\u04f7\u04fc\u0500\u0503\u0505\u050b\u0510\u0514\u0517\u051a\u051c"+
		"\u052a\u0534\u0539\u0545\u0549\u054d\u0551\u0558\u055a\u0562\u0569\u056c"+
		"\u0570\u0575\u057d\u0590\u0596\u059a\u05aa\u05b0\u05b8\u05bd\u05c0\u05c5"+
		"\u05ce\u05d3\u05e4\u05e7\u05e9\u05ee\u05f4\u05f7\u05fa\u05fd\u0600\u060a"+
		"\u060f\u0615\u061a\u061d\u0624\u0629\u062d\u0630\u0637\u0640\u0644\u0648"+
		"\u064b\u0651\u0654\u0656\u065f\u0664\u0668\u066c\u066f\u067a\u067f\u0683"+
		"\u068a\u068d\u0692\u0696\u069b\u06a4\u06a7\u06ad\u06af\u06b3\u06ba\u06bd"+
		"\u06c5\u06cf\u06d2\u06d8\u06da\u06e1\u06e5\u06ec\u06f0\u06f4\u06fa\u06ff"+
		"\u0703\u0708\u070a\u0713\u071e\u0725\u0728\u0730\u0734\u073c\u0745\u074a"+
		"\u074d\u0759\u0764\u0769\u076c\u0770\u0773\u0776\u077b\u0780\u0783\u0787"+
		"\u078a\u078d\u0792\u0798\u07a0\u07a4\u07a7\u07ab\u07ae\u07b1\u07b6\u07bc"+
		"\u07c4\u07c8\u07cb\u07cf\u07d2\u07d5\u07df\u07e7\u07e9\u0823\u0828";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}