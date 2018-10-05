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
		RULE_attach_stmt = 7, RULE_begin_stmt = 8, RULE_commit_stmt = 9, RULE_create_index_stmt = 10, 
		RULE_create_table_stmt = 11, RULE_create_trigger_stmt = 12, RULE_create_view_stmt = 13, 
		RULE_create_virtual_table_stmt = 14, RULE_delete_stmt = 15, RULE_delete_stmt_limited = 16, 
		RULE_single_from_clause = 17, RULE_detach_stmt = 18, RULE_drop_index_stmt = 19, 
		RULE_drop_table_stmt = 20, RULE_drop_trigger_stmt = 21, RULE_drop_view_stmt = 22, 
		RULE_insert_stmt = 23, RULE_pragma_stmt = 24, RULE_reindex_stmt = 25, 
		RULE_release_stmt = 26, RULE_rollback_stmt = 27, RULE_savepoint_stmt = 28, 
		RULE_update_stmt = 29, RULE_update_stmt_limited = 30, RULE_vacuum_stmt = 31, 
		RULE_column_def = 32, RULE_type_name = 33, RULE_column_constraint = 34, 
		RULE_conflict_clause = 35, RULE_any_result_column_expr = 36, RULE_expr = 37, 
		RULE_dbColumnExpr = 38, RULE_result_column_expr = 39, RULE_comparison_operator = 40, 
		RULE_foreign_key_clause = 41, RULE_raise_function = 42, RULE_indexed_column = 43, 
		RULE_table_constraint = 44, RULE_with_clause = 45, RULE_qualified_table_name = 46, 
		RULE_ordering_term = 47, RULE_pragma_value = 48, RULE_result_column = 49, 
		RULE_deid_tag = 50, RULE_ident_prop = 51, RULE_is_zip_prop = 52, RULE_id_field_prop = 53, 
		RULE_date_shift_field_prop = 54, RULE_tracking_column_expr = 55, RULE_is_birthdate_prop = 56, 
		RULE_obfuscate_field_prop = 57, RULE_from_table_spec = 58, RULE_table_or_subquery = 59, 
		RULE_join_clause = 60, RULE_join_operator = 61, RULE_join_constraint = 62, 
		RULE_compound_select_stmt = 63, RULE_compound_operator = 64, RULE_with_select_stmt = 65, 
		RULE_final_with_select_stmt = 66, RULE_select_stmt = 67, RULE_select_core = 68, 
		RULE_multi_from_clause = 69, RULE_cte_table_name = 70, RULE_signed_number = 71, 
		RULE_literal_value = 72, RULE_unary_operator = 73, RULE_error_message = 74, 
		RULE_module_argument = 75, RULE_column_alias = 76, RULE_keyword = 77, 
		RULE_name = 78, RULE_result_count_function = 79, RULE_count_funct = 80, 
		RULE_any_result_function = 81, RULE_any_funct = 82, RULE_math_expr = 83, 
		RULE_and_keyword = 84, RULE_or_keyword = 85, RULE_and_or = 86, RULE_not_keyword = 87, 
		RULE_in_keyword = 88, RULE_like_keyword = 89, RULE_distinct_keyword = 90, 
		RULE_function_name = 91, RULE_database_name = 92, RULE_with_name = 93, 
		RULE_table_name = 94, RULE_table_or_index_name = 95, RULE_new_table_name = 96, 
		RULE_column_name = 97, RULE_collation_name = 98, RULE_foreign_table = 99, 
		RULE_index_name = 100, RULE_trigger_name = 101, RULE_view_name = 102, 
		RULE_module_name = 103, RULE_pragma_name = 104, RULE_savepoint_name = 105, 
		RULE_table_alias = 106, RULE_transaction_name = 107, RULE_any_name = 108, 
		RULE_anything_at_all = 109;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "end_of_select", "alter_table_stmt", 
		"analyze_stmt", "attach_stmt", "begin_stmt", "commit_stmt", "create_index_stmt", 
		"create_table_stmt", "create_trigger_stmt", "create_view_stmt", "create_virtual_table_stmt", 
		"delete_stmt", "delete_stmt_limited", "single_from_clause", "detach_stmt", 
		"drop_index_stmt", "drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", 
		"insert_stmt", "pragma_stmt", "reindex_stmt", "release_stmt", "rollback_stmt", 
		"savepoint_stmt", "update_stmt", "update_stmt_limited", "vacuum_stmt", 
		"column_def", "type_name", "column_constraint", "conflict_clause", "any_result_column_expr", 
		"expr", "dbColumnExpr", "result_column_expr", "comparison_operator", "foreign_key_clause", 
		"raise_function", "indexed_column", "table_constraint", "with_clause", 
		"qualified_table_name", "ordering_term", "pragma_value", "result_column", 
		"deid_tag", "ident_prop", "is_zip_prop", "id_field_prop", "date_shift_field_prop", 
		"tracking_column_expr", "is_birthdate_prop", "obfuscate_field_prop", "from_table_spec", 
		"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
		"compound_select_stmt", "compound_operator", "with_select_stmt", "final_with_select_stmt", 
		"select_stmt", "select_core", "multi_from_clause", "cte_table_name", "signed_number", 
		"literal_value", "unary_operator", "error_message", "module_argument", 
		"column_alias", "keyword", "name", "result_count_function", "count_funct", 
		"any_result_function", "any_funct", "math_expr", "and_keyword", "or_keyword", 
		"and_or", "not_keyword", "in_keyword", "like_keyword", "distinct_keyword", 
		"function_name", "database_name", "with_name", "table_name", "table_or_index_name", 
		"new_table_name", "column_name", "collation_name", "foreign_table", "index_name", 
		"trigger_name", "view_name", "module_name", "pragma_name", "savepoint_name", 
		"table_alias", "transaction_name", "any_name", "anything_at_all"
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
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DETACH - 64)) | (1L << (K_DROP - 64)) | (1L << (K_END - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_PRAGMA - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (K_REINDEX - 134)) | (1L << (K_RELEASE - 134)) | (1L << (K_REPLACE - 134)) | (1L << (K_ROLLBACK - 134)) | (1L << (K_SAVEPOINT - 134)) | (1L << (K_SELECT - 134)) | (1L << (K_UPDATE - 134)) | (1L << (K_VACUUM - 134)) | (1L << (K_VALUES - 134)) | (1L << (K_WITH - 134)) | (1L << (UNEXPECTED_CHAR - 134)))) != 0)) {
				{
				setState(222);
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
					setState(220);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(221);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
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
			setState(229);
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
			setState(232);
			sql_stmt();
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					sql_stmt();
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(239);
					anything_at_all();
					}
					} 
				}
				setState(244);
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
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(245);
				match(K_EXPLAIN);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(246);
					match(K_QUERY);
					setState(247);
					match(K_PLAN);
					}
				}

				}
			}

			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(252);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(253);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(254);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(255);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(256);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(257);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(258);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(259);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(260);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(261);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(262);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(263);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(264);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(265);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(266);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(267);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(268);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(269);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(270);
				insert_stmt();
				}
				break;
			case 20:
				{
				setState(271);
				pragma_stmt();
				}
				break;
			case 21:
				{
				setState(272);
				reindex_stmt();
				}
				break;
			case 22:
				{
				setState(273);
				release_stmt();
				}
				break;
			case 23:
				{
				setState(274);
				rollback_stmt();
				}
				break;
			case 24:
				{
				setState(275);
				savepoint_stmt();
				}
				break;
			case 25:
				{
				setState(276);
				select_stmt();
				}
				break;
			case 26:
				{
				setState(277);
				update_stmt();
				}
				break;
			case 27:
				{
				setState(278);
				update_stmt_limited();
				}
				break;
			case 28:
				{
				setState(279);
				vacuum_stmt();
				}
				break;
			case 29:
				{
				setState(280);
				with_select_stmt();
				}
				break;
			}
			setState(283);
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
			setState(285);
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
			setState(287);
			match(K_ALTER);
			setState(288);
			match(K_TABLE);
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(289);
				database_name();
				setState(290);
				match(DOT);
				}
				break;
			}
			setState(294);
			table_name();
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(295);
				match(K_RENAME);
				setState(296);
				match(K_TO);
				setState(297);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(298);
				match(K_ADD);
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(299);
					match(K_COLUMN);
					}
					break;
				}
				setState(302);
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
			setState(305);
			match(K_ANALYZE);
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(306);
				database_name();
				}
				break;
			case 2:
				{
				setState(307);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(308);
				database_name();
				setState(309);
				match(DOT);
				setState(310);
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
			setState(314);
			match(K_ATTACH);
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(315);
				match(K_DATABASE);
				}
				break;
			}
			setState(318);
			expr(0);
			setState(319);
			match(K_AS);
			setState(320);
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
			setState(322);
			match(K_BEGIN);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (K_DEFERRED - 61)) | (1L << (K_EXCLUSIVE - 61)) | (1L << (K_IMMEDIATE - 61)))) != 0)) {
				{
				setState(323);
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

			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(326);
				match(K_TRANSACTION);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DAY) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_EXTRACT - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_HOUR - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISBIRTHDATE - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_ISZIPCODE - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_MINUTE - 64)) | (1L << (K_MONTH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTIDENTIFIABLE - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SECOND - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TIMEZONE_ABBR - 128)) | (1L << (K_TIMEZONE_HOUR - 128)) | (1L << (K_TIMEZONE_MINUTE - 128)) | (1L << (K_TIMEZONE_REGION - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRACKED - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_YEAR - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) {
					{
					setState(327);
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
			setState(332);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(333);
				match(K_TRANSACTION);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DAY) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_EXTRACT - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_HOUR - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISBIRTHDATE - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_ISZIPCODE - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_MINUTE - 64)) | (1L << (K_MONTH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTIDENTIFIABLE - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SECOND - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TIMEZONE_ABBR - 128)) | (1L << (K_TIMEZONE_HOUR - 128)) | (1L << (K_TIMEZONE_MINUTE - 128)) | (1L << (K_TIMEZONE_REGION - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRACKED - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_YEAR - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) {
					{
					setState(334);
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
		enterRule(_localctx, 20, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(K_CREATE);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(340);
				match(K_UNIQUE);
				}
			}

			setState(343);
			match(K_INDEX);
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(344);
				match(K_IF);
				setState(345);
				match(K_NOT);
				setState(346);
				match(K_EXISTS);
				}
				break;
			}
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(349);
				database_name();
				setState(350);
				match(DOT);
				}
				break;
			}
			setState(354);
			index_name();
			setState(355);
			match(K_ON);
			setState(356);
			table_name();
			setState(357);
			match(OPEN_PAR);
			setState(358);
			indexed_column();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(359);
				match(COMMA);
				setState(360);
				indexed_column();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			match(CLOSE_PAR);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(367);
				match(K_WHERE);
				setState(368);
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
		enterRule(_localctx, 22, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(K_CREATE);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(372);
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

			setState(375);
			match(K_TABLE);
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(376);
				match(K_IF);
				setState(377);
				match(K_NOT);
				setState(378);
				match(K_EXISTS);
				}
				break;
			}
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(381);
				database_name();
				setState(382);
				match(DOT);
				}
				break;
			}
			setState(386);
			table_name();
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(387);
				match(OPEN_PAR);
				setState(388);
				column_def();
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(389);
						match(COMMA);
						setState(390);
						column_def();
						}
						} 
					}
					setState(395);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(396);
					match(COMMA);
					setState(397);
					table_constraint();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				match(CLOSE_PAR);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(404);
					match(K_WITHOUT);
					setState(405);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(408);
				match(K_AS);
				setState(409);
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
		enterRule(_localctx, 24, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(K_CREATE);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(413);
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

			setState(416);
			match(K_TRIGGER);
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(417);
				match(K_IF);
				setState(418);
				match(K_NOT);
				setState(419);
				match(K_EXISTS);
				}
				break;
			}
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(422);
				database_name();
				setState(423);
				match(DOT);
				}
				break;
			}
			setState(427);
			trigger_name();
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(428);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(429);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(430);
				match(K_INSTEAD);
				setState(431);
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
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(434);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(435);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(436);
				match(K_UPDATE);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(437);
					match(K_OF);
					setState(438);
					column_name();
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(439);
						match(COMMA);
						setState(440);
						column_name();
						}
						}
						setState(445);
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
			setState(450);
			match(K_ON);
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(451);
				database_name();
				setState(452);
				match(DOT);
				}
				break;
			}
			setState(456);
			table_name();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(457);
				match(K_FOR);
				setState(458);
				match(K_EACH);
				setState(459);
				match(K_ROW);
				}
			}

			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(462);
				match(K_WHEN);
				setState(463);
				expr(0);
				}
			}

			setState(466);
			match(K_BEGIN);
			setState(475); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(467);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(468);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(469);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(470);
					select_stmt();
					}
					break;
				}
				setState(473);
				match(SCOL);
				}
				}
				setState(477); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || _la==K_INSERT || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_REPLACE - 137)) | (1L << (K_SELECT - 137)) | (1L << (K_UPDATE - 137)) | (1L << (K_VALUES - 137)) | (1L << (K_WITH - 137)))) != 0) );
			setState(479);
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
		enterRule(_localctx, 26, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(K_CREATE);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(482);
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

			setState(485);
			match(K_VIEW);
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(486);
				match(K_IF);
				setState(487);
				match(K_NOT);
				setState(488);
				match(K_EXISTS);
				}
				break;
			}
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(491);
				database_name();
				setState(492);
				match(DOT);
				}
				break;
			}
			setState(496);
			view_name();
			setState(497);
			match(K_AS);
			setState(498);
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
		enterRule(_localctx, 28, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(K_CREATE);
			setState(501);
			match(K_VIRTUAL);
			setState(502);
			match(K_TABLE);
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(503);
				match(K_IF);
				setState(504);
				match(K_NOT);
				setState(505);
				match(K_EXISTS);
				}
				break;
			}
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(508);
				database_name();
				setState(509);
				match(DOT);
				}
				break;
			}
			setState(513);
			table_name();
			setState(514);
			match(K_USING);
			setState(515);
			module_name();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(516);
				match(OPEN_PAR);
				setState(517);
				module_argument();
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(518);
					match(COMMA);
					setState(519);
					module_argument();
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(525);
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
		enterRule(_localctx, 30, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(529);
				with_clause();
				}
			}

			setState(532);
			match(K_DELETE);
			setState(533);
			single_from_clause();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(534);
				match(K_WHERE);
				setState(535);
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
		enterRule(_localctx, 32, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(538);
				with_clause();
				}
			}

			setState(541);
			match(K_DELETE);
			setState(542);
			single_from_clause();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(543);
				match(K_WHERE);
				setState(544);
				expr(0);
				}
			}

			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(547);
					match(K_ORDER);
					setState(548);
					match(K_BY);
					setState(549);
					ordering_term();
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(550);
						match(COMMA);
						setState(551);
						ordering_term();
						}
						}
						setState(556);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(559);
				match(K_LIMIT);
				setState(560);
				expr(0);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(561);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(562);
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
		enterRule(_localctx, 34, RULE_single_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(K_FROM);
			setState(568);
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
		enterRule(_localctx, 36, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(K_DETACH);
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(571);
				match(K_DATABASE);
				}
				break;
			}
			setState(574);
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
		enterRule(_localctx, 38, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(K_DROP);
			setState(577);
			match(K_INDEX);
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(578);
				match(K_IF);
				setState(579);
				match(K_EXISTS);
				}
				break;
			}
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(582);
				database_name();
				setState(583);
				match(DOT);
				}
				break;
			}
			setState(587);
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
		enterRule(_localctx, 40, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(K_DROP);
			setState(590);
			match(K_TABLE);
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
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
		enterRule(_localctx, 42, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(K_DROP);
			setState(603);
			match(K_TRIGGER);
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
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
		enterRule(_localctx, 44, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(K_DROP);
			setState(616);
			match(K_VIEW);
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
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
		enterRule(_localctx, 46, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(628);
				with_clause();
				}
			}

			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(631);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(632);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(633);
				match(K_INSERT);
				setState(634);
				match(K_OR);
				setState(635);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(636);
				match(K_INSERT);
				setState(637);
				match(K_OR);
				setState(638);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(639);
				match(K_INSERT);
				setState(640);
				match(K_OR);
				setState(641);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(642);
				match(K_INSERT);
				setState(643);
				match(K_OR);
				setState(644);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(645);
				match(K_INSERT);
				setState(646);
				match(K_OR);
				setState(647);
				match(K_IGNORE);
				}
				break;
			}
			setState(650);
			match(K_INTO);
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(651);
				database_name();
				setState(652);
				match(DOT);
				}
				break;
			}
			setState(656);
			table_name();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(657);
				match(OPEN_PAR);
				setState(658);
				column_name();
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(659);
					match(COMMA);
					setState(660);
					column_name();
					}
					}
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(666);
				match(CLOSE_PAR);
				}
			}

			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(670);
				match(K_VALUES);
				setState(671);
				match(OPEN_PAR);
				setState(672);
				expr(0);
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(673);
					match(COMMA);
					setState(674);
					expr(0);
					}
					}
					setState(679);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(680);
				match(CLOSE_PAR);
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(681);
					match(COMMA);
					setState(682);
					match(OPEN_PAR);
					setState(683);
					expr(0);
					setState(688);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(684);
						match(COMMA);
						setState(685);
						expr(0);
						}
						}
						setState(690);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(691);
					match(CLOSE_PAR);
					}
					}
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(698);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(699);
				match(K_DEFAULT);
				setState(700);
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
		enterRule(_localctx, 48, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(K_PRAGMA);
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(704);
				database_name();
				setState(705);
				match(DOT);
				}
				break;
			}
			setState(709);
			pragma_name();
			setState(716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(710);
				match(ASSIGN);
				setState(711);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(712);
				match(OPEN_PAR);
				setState(713);
				pragma_value();
				setState(714);
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
		enterRule(_localctx, 50, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(K_REINDEX);
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(719);
				collation_name();
				}
				break;
			case 2:
				{
				setState(723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(720);
					database_name();
					setState(721);
					match(DOT);
					}
					break;
				}
				setState(727);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(725);
					table_name();
					}
					break;
				case 2:
					{
					setState(726);
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
		enterRule(_localctx, 52, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(K_RELEASE);
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(732);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(735);
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
		enterRule(_localctx, 54, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(K_ROLLBACK);
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(738);
				match(K_TRANSACTION);
				setState(740);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(739);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(744);
				match(K_TO);
				setState(746);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(745);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(748);
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
		enterRule(_localctx, 56, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(K_SAVEPOINT);
			setState(752);
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
		enterRule(_localctx, 58, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(754);
				with_clause();
				}
			}

			setState(757);
			match(K_UPDATE);
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(758);
				match(K_OR);
				setState(759);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(760);
				match(K_OR);
				setState(761);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(762);
				match(K_OR);
				setState(763);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(764);
				match(K_OR);
				setState(765);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(766);
				match(K_OR);
				setState(767);
				match(K_IGNORE);
				}
				break;
			}
			setState(770);
			qualified_table_name();
			setState(771);
			match(K_SET);
			setState(772);
			column_name();
			setState(773);
			match(ASSIGN);
			setState(774);
			expr(0);
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(775);
				match(COMMA);
				setState(776);
				column_name();
				setState(777);
				match(ASSIGN);
				setState(778);
				expr(0);
				}
				}
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(785);
				match(K_WHERE);
				setState(786);
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
		enterRule(_localctx, 60, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(789);
				with_clause();
				}
			}

			setState(792);
			match(K_UPDATE);
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(793);
				match(K_OR);
				setState(794);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(795);
				match(K_OR);
				setState(796);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(797);
				match(K_OR);
				setState(798);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(799);
				match(K_OR);
				setState(800);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(801);
				match(K_OR);
				setState(802);
				match(K_IGNORE);
				}
				break;
			}
			setState(805);
			qualified_table_name();
			setState(806);
			match(K_SET);
			setState(807);
			column_name();
			setState(808);
			match(ASSIGN);
			setState(809);
			expr(0);
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(810);
				match(COMMA);
				setState(811);
				column_name();
				setState(812);
				match(ASSIGN);
				setState(813);
				expr(0);
				}
				}
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(820);
				match(K_WHERE);
				setState(821);
				expr(0);
				}
			}

			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
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
		enterRule(_localctx, 62, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
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
		enterRule(_localctx, 64, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			column_name();
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(847);
				type_name();
				}
				break;
			}
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (K_NOT - 115)) | (1L << (K_NULL - 115)) | (1L << (K_PRIMARY - 115)) | (1L << (K_REFERENCES - 115)) | (1L << (K_UNIQUE - 115)))) != 0)) {
				{
				{
				setState(850);
				column_constraint();
				}
				}
				setState(855);
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
		enterRule(_localctx, 66, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(857); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(856);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(859); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(861);
				match(OPEN_PAR);
				setState(862);
				signed_number();
				setState(863);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(865);
				match(OPEN_PAR);
				setState(866);
				signed_number();
				setState(867);
				match(COMMA);
				setState(868);
				signed_number();
				setState(869);
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
		enterRule(_localctx, 68, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(873);
				match(K_CONSTRAINT);
				setState(874);
				name();
				}
			}

			setState(910);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(877);
				match(K_PRIMARY);
				setState(878);
				match(K_KEY);
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(879);
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

				setState(882);
				conflict_clause();
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(883);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(886);
					match(K_NOT);
					}
				}

				setState(889);
				match(K_NULL);
				setState(890);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(891);
				match(K_UNIQUE);
				setState(892);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(893);
				match(K_CHECK);
				setState(894);
				match(OPEN_PAR);
				setState(895);
				expr(0);
				setState(896);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(898);
				match(K_DEFAULT);
				setState(905);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(899);
					signed_number();
					}
					break;
				case 2:
					{
					setState(900);
					literal_value();
					}
					break;
				case 3:
					{
					setState(901);
					match(OPEN_PAR);
					setState(902);
					expr(0);
					setState(903);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(907);
				match(K_COLLATE);
				setState(908);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(909);
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
		enterRule(_localctx, 70, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(912);
				match(K_ON);
				setState(913);
				match(K_CONFLICT);
				setState(914);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_any_result_column_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(918);
				literal_value();
				}
				break;
			case 2:
				{
				setState(919);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(920);
				dbColumnExpr();
				}
				break;
			case 4:
				{
				setState(921);
				unary_operator();
				setState(922);
				any_result_column_expr(19);
				}
				break;
			case 5:
				{
				setState(924);
				count_funct();
				}
				break;
			case 6:
				{
				setState(925);
				any_funct();
				}
				break;
			case 7:
				{
				setState(926);
				match(OPEN_PAR);
				setState(927);
				any_result_column_expr(0);
				setState(928);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(930);
				match(K_CAST);
				setState(931);
				match(OPEN_PAR);
				setState(932);
				any_result_column_expr(0);
				setState(933);
				match(K_AS);
				setState(934);
				type_name();
				setState(935);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(937);
				match(K_CASE);
				setState(939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(938);
					any_result_column_expr(0);
					}
					break;
				}
				setState(946); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(941);
					match(K_WHEN);
					setState(942);
					any_result_column_expr(0);
					setState(943);
					match(K_THEN);
					setState(944);
					any_result_column_expr(0);
					}
					}
					setState(948); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(950);
					match(K_ELSE);
					setState(951);
					any_result_column_expr(0);
					}
				}

				setState(954);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(956);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1019);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1017);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
					case 1:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(959);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(960);
						match(PIPE2);
						setState(961);
						any_result_column_expr(19);
						}
						break;
					case 2:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(962);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(963);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(964);
						any_result_column_expr(18);
						}
						break;
					case 3:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(965);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(966);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(967);
						any_result_column_expr(17);
						}
						break;
					case 4:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(968);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(969);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(970);
						any_result_column_expr(16);
						}
						break;
					case 5:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(971);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(972);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(973);
						any_result_column_expr(15);
						}
						break;
					case 6:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(974);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						{
						setState(975);
						comparison_operator();
						}
						setState(976);
						any_result_column_expr(14);
						}
						break;
					case 7:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(978);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(979);
						and_or();
						setState(980);
						any_result_column_expr(13);
						}
						break;
					case 8:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(982);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(983);
						match(K_IS);
						setState(985);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
						case 1:
							{
							setState(984);
							match(K_NOT);
							}
							break;
						}
						setState(987);
						any_result_column_expr(5);
						}
						break;
					case 9:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(988);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(990);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(989);
							match(K_NOT);
							}
						}

						setState(992);
						match(K_BETWEEN);
						setState(993);
						any_result_column_expr(0);
						setState(994);
						match(K_AND);
						setState(995);
						any_result_column_expr(4);
						}
						break;
					case 10:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(997);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(998);
						match(K_COLLATE);
						setState(999);
						collation_name();
						}
						break;
					case 11:
						{
						_localctx = new Any_result_column_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_any_result_column_expr);
						setState(1000);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1002);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1001);
							match(K_NOT);
							}
						}

						setState(1004);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (K_GLOB - 82)) | (1L << (K_LIKE - 82)) | (1L << (K_MATCH - 82)) | (1L << (K_REGEXP - 82)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1005);
						any_result_column_expr(0);
						setState(1008);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
						case 1:
							{
							setState(1006);
							match(K_ESCAPE);
							setState(1007);
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
						setState(1010);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1015);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1011);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1012);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1013);
							match(K_NOT);
							setState(1014);
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
				setState(1021);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1023);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1024);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1025);
				dbColumnExpr();
				}
				break;
			case 4:
				{
				setState(1026);
				unary_operator();
				setState(1027);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1029);
				count_funct();
				}
				break;
			case 6:
				{
				setState(1030);
				any_funct();
				}
				break;
			case 7:
				{
				setState(1031);
				match(OPEN_PAR);
				setState(1032);
				expr(0);
				setState(1033);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1035);
				match(K_CAST);
				setState(1036);
				match(OPEN_PAR);
				setState(1037);
				expr(0);
				setState(1038);
				match(K_AS);
				setState(1039);
				type_name();
				setState(1040);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1043);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1042);
						match(K_NOT);
						}
					}

					setState(1045);
					match(K_EXISTS);
					}
				}

				setState(1048);
				match(OPEN_PAR);
				setState(1051);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1049);
					select_stmt();
					}
					break;
				case 2:
					{
					setState(1050);
					compound_select_stmt();
					}
					break;
				}
				setState(1053);
				match(CLOSE_PAR);
				}
				break;
			case 10:
				{
				setState(1055);
				match(K_CASE);
				setState(1057);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1056);
					expr(0);
					}
					break;
				}
				setState(1064); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1059);
					match(K_WHEN);
					setState(1060);
					expr(0);
					setState(1061);
					match(K_THEN);
					setState(1062);
					expr(0);
					}
					}
					setState(1066); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1068);
					match(K_ELSE);
					setState(1069);
					expr(0);
					}
				}

				setState(1072);
				match(K_END);
				}
				break;
			case 11:
				{
				setState(1074);
				match(K_EXTRACT);
				setState(1075);
				match(OPEN_PAR);
				setState(1076);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DAY - 58)) | (1L << (K_HOUR - 58)) | (1L << (K_MINUTE - 58)) | (1L << (K_MONTH - 58)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (K_SECOND - 143)) | (1L << (K_TIMEZONE_ABBR - 143)) | (1L << (K_TIMEZONE_HOUR - 143)) | (1L << (K_TIMEZONE_MINUTE - 143)) | (1L << (K_TIMEZONE_REGION - 143)) | (1L << (K_YEAR - 143)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1077);
				match(K_FROM);
				setState(1078);
				expr(0);
				setState(1079);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1083);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1084);
						match(PIPE2);
						setState(1085);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1086);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1087);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1088);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1089);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1090);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1091);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1092);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1093);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1094);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1095);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1096);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1097);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1098);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						{
						setState(1099);
						comparison_operator();
						}
						setState(1100);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1102);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1103);
						and_or();
						setState(1104);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1106);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1107);
						match(K_IS);
						setState(1109);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
						case 1:
							{
							setState(1108);
							match(K_NOT);
							}
							break;
						}
						setState(1111);
						expr(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1112);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1114);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1113);
							match(K_NOT);
							}
						}

						setState(1116);
						match(K_BETWEEN);
						setState(1117);
						expr(0);
						setState(1118);
						match(K_AND);
						setState(1119);
						expr(6);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1121);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1122);
						match(K_COLLATE);
						setState(1123);
						collation_name();
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1124);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1126);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1125);
							match(K_NOT);
							}
						}

						setState(1128);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (K_GLOB - 82)) | (1L << (K_LIKE - 82)) | (1L << (K_MATCH - 82)) | (1L << (K_REGEXP - 82)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1129);
						expr(0);
						setState(1132);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
						case 1:
							{
							setState(1130);
							match(K_ESCAPE);
							setState(1131);
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
						setState(1134);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1139);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1135);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1136);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1137);
							match(K_NOT);
							setState(1138);
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
						setState(1141);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1143);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1142);
							match(K_NOT);
							}
						}

						setState(1145);
						match(K_IN);
						setState(1166);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
						case 1:
							{
							setState(1146);
							match(OPEN_PAR);
							setState(1157);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
							case 1:
								{
								setState(1147);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1148);
								compound_select_stmt();
								}
								break;
							case 3:
								{
								setState(1149);
								expr(0);
								setState(1154);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1150);
									match(COMMA);
									setState(1151);
									expr(0);
									}
									}
									setState(1156);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1159);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1163);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
							case 1:
								{
								setState(1160);
								database_name();
								setState(1161);
								match(DOT);
								}
								break;
							}
							setState(1165);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
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
		enterRule(_localctx, 76, RULE_dbColumnExpr);
		int _la;
		try {
			setState(1191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
					case 1:
						{
						setState(1174);
						database_name();
						setState(1175);
						match(DOT);
						}
						break;
					}
					setState(1179);
					table_name();
					setState(1180);
					match(DOT);
					}
					break;
				}
				setState(1184);
				column_name();
				setState(1189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1186);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1185);
						match(K_AS);
						}
					}

					setState(1188);
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
		enterRule(_localctx, 78, RULE_result_column_expr);
		int _la;
		try {
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
					case 1:
						{
						setState(1194);
						database_name();
						setState(1195);
						match(DOT);
						}
						break;
					}
					setState(1199);
					table_name();
					setState(1200);
					match(DOT);
					}
					break;
				}
				setState(1204);
				column_name();
				setState(1206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1205);
					deid_tag();
					}
				}

				setState(1212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1208);
						match(K_AS);
						}
					}

					setState(1211);
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
		enterRule(_localctx, 80, RULE_comparison_operator);
		try {
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1216);
				match(ASSIGN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1217);
				match(EQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1218);
				match(NOT_EQ1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1219);
				match(NOT_EQ2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1220);
				match(K_IS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1221);
				match(K_IS);
				setState(1222);
				match(K_NOT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1223);
				in_keyword();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1224);
				like_keyword();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1225);
				match(K_GLOB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1226);
				match(K_MATCH);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1227);
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
		enterRule(_localctx, 82, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			match(K_REFERENCES);
			setState(1231);
			foreign_table();
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1232);
				match(OPEN_PAR);
				setState(1233);
				column_name();
				setState(1238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1234);
					match(COMMA);
					setState(1235);
					column_name();
					}
					}
					setState(1240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1241);
				match(CLOSE_PAR);
				}
			}

			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1259);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1245);
					match(K_ON);
					setState(1246);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
					case 1:
						{
						setState(1247);
						match(K_SET);
						setState(1248);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1249);
						match(K_SET);
						setState(1250);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1251);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1252);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1253);
						match(K_NO);
						setState(1254);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1257);
					match(K_MATCH);
					setState(1258);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1266);
					match(K_NOT);
					}
				}

				setState(1269);
				match(K_DEFERRABLE);
				setState(1274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1270);
					match(K_INITIALLY);
					setState(1271);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1272);
					match(K_INITIALLY);
					setState(1273);
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
		enterRule(_localctx, 84, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			match(K_RAISE);
			setState(1279);
			match(OPEN_PAR);
			setState(1284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1280);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1281);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1282);
				match(COMMA);
				setState(1283);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1286);
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
		enterRule(_localctx, 86, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			column_name();
			setState(1291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1289);
				match(K_COLLATE);
				setState(1290);
				collation_name();
				}
			}

			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1293);
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
		enterRule(_localctx, 88, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1296);
				match(K_CONSTRAINT);
				setState(1297);
				name();
				}
			}

			setState(1336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1303);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1300);
					match(K_PRIMARY);
					setState(1301);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1302);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1305);
				match(OPEN_PAR);
				setState(1306);
				indexed_column();
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1307);
					match(COMMA);
					setState(1308);
					indexed_column();
					}
					}
					setState(1313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1314);
				match(CLOSE_PAR);
				setState(1315);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1317);
				match(K_CHECK);
				setState(1318);
				match(OPEN_PAR);
				setState(1319);
				expr(0);
				setState(1320);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1322);
				match(K_FOREIGN);
				setState(1323);
				match(K_KEY);
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
				setState(1334);
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
		public List<Compound_select_stmtContext> compound_select_stmt() {
			return getRuleContexts(Compound_select_stmtContext.class);
		}
		public Compound_select_stmtContext compound_select_stmt(int i) {
			return getRuleContext(Compound_select_stmtContext.class,i);
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
		enterRule(_localctx, 90, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			match(K_WITH);
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1339);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1342);
			cte_table_name();
			setState(1343);
			match(K_AS);
			setState(1344);
			match(OPEN_PAR);
			setState(1347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1345);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(1346);
				compound_select_stmt();
				}
				break;
			}
			setState(1349);
			match(CLOSE_PAR);
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1350);
				match(COMMA);
				setState(1351);
				cte_table_name();
				setState(1352);
				match(K_AS);
				setState(1353);
				match(OPEN_PAR);
				setState(1356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1354);
					select_stmt();
					}
					break;
				case 2:
					{
					setState(1355);
					compound_select_stmt();
					}
					break;
				}
				setState(1358);
				match(CLOSE_PAR);
				}
				}
				setState(1364);
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
		enterRule(_localctx, 92, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1365);
				database_name();
				setState(1366);
				match(DOT);
				}
				break;
			}
			setState(1370);
			table_name();
			setState(1376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1371);
				match(K_INDEXED);
				setState(1372);
				match(K_BY);
				setState(1373);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1374);
				match(K_NOT);
				setState(1375);
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
		enterRule(_localctx, 94, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			expr(0);
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1379);
				match(K_COLLATE);
				setState(1380);
				collation_name();
				}
			}

			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1383);
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
		enterRule(_localctx, 96, RULE_pragma_value);
		try {
			setState(1389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1386);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1387);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1388);
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
		enterRule(_localctx, 98, RULE_result_column);
		int _la;
		try {
			setState(1406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1391);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1392);
				table_name();
				setState(1393);
				match(DOT);
				setState(1394);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1396);
				result_column_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1397);
				result_count_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1398);
				any_result_function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1399);
				any_result_column_expr(0);
				setState(1404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1401);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1400);
						match(K_AS);
						}
					}

					setState(1403);
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
		enterRule(_localctx, 100, RULE_deid_tag);
		try {
			setState(1417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1408);
				match(LT);
				setState(1409);
				match(K_IDENTIFIABLE);
				setState(1411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1410);
					ident_prop();
					}
					break;
				}
				setState(1413);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1414);
				match(LT);
				setState(1415);
				match(K_NOTIDENTIFIABLE);
				setState(1416);
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
		enterRule(_localctx, 102, RULE_ident_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ISID) {
				{
				setState(1419);
				id_field_prop();
				}
			}

			setState(1423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DATESHIFT) {
				{
				setState(1422);
				date_shift_field_prop();
				}
			}

			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OBFUSCATE) {
				{
				setState(1425);
				obfuscate_field_prop();
				}
			}

			setState(1429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ISZIPCODE) {
				{
				setState(1428);
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
		enterRule(_localctx, 104, RULE_is_zip_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
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
		enterRule(_localctx, 106, RULE_id_field_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			match(K_ISID);
			setState(1434);
			match(ASSIGN);
			setState(1435);
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
		enterRule(_localctx, 108, RULE_date_shift_field_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			match(K_DATESHIFT);
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ISBIRTHDATE) {
				{
				setState(1438);
				is_birthdate_prop();
				}
			}

			setState(1444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRACKED) {
				{
				setState(1441);
				match(K_TRACKED);
				setState(1442);
				match(K_BY);
				setState(1443);
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
		enterRule(_localctx, 110, RULE_tracking_column_expr);
		try {
			setState(1458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1450);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						setState(1447);
						database_name();
						setState(1448);
						match(DOT);
						}
						break;
					}
					setState(1452);
					table_name();
					setState(1453);
					match(DOT);
					}
					break;
				}
				setState(1457);
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
		enterRule(_localctx, 112, RULE_is_birthdate_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
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
		enterRule(_localctx, 114, RULE_obfuscate_field_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			match(K_OBFUSCATE);
			setState(1465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1463);
				match(ASSIGN);
				setState(1464);
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
		enterRule(_localctx, 116, RULE_from_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1467);
				database_name();
				setState(1468);
				match(DOT);
				}
				break;
			}
			setState(1472);
			table_name();
			setState(1477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1474);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1473);
					match(K_AS);
					}
					break;
				}
				setState(1476);
				table_alias();
				}
				break;
			}
			setState(1484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1479);
				match(K_INDEXED);
				setState(1480);
				match(K_BY);
				setState(1481);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1482);
				match(K_NOT);
				setState(1483);
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
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
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
		enterRule(_localctx, 118, RULE_table_or_subquery);
		int _la;
		try {
			setState(1518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486);
				from_table_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1487);
				match(OPEN_PAR);
				setState(1497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1488);
					table_or_subquery();
					setState(1493);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1489);
						match(COMMA);
						setState(1490);
						table_or_subquery();
						}
						}
						setState(1495);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1496);
					join_clause();
					}
					break;
				}
				setState(1499);
				match(CLOSE_PAR);
				setState(1504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1501);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
					case 1:
						{
						setState(1500);
						match(K_AS);
						}
						break;
					}
					setState(1503);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1506);
				match(OPEN_PAR);
				setState(1509);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1507);
					select_stmt();
					}
					break;
				case 2:
					{
					setState(1508);
					compound_select_stmt();
					}
					break;
				}
				setState(1511);
				match(CLOSE_PAR);
				setState(1516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1513);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
					case 1:
						{
						setState(1512);
						match(K_AS);
						}
						break;
					}
					setState(1515);
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
		enterRule(_localctx, 120, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			table_or_subquery();
			setState(1527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (K_INNER - 94)) | (1L << (K_JOIN - 94)) | (1L << (K_LEFT - 94)) | (1L << (K_NATURAL - 94)))) != 0)) {
				{
				{
				setState(1521);
				join_operator();
				setState(1522);
				table_or_subquery();
				setState(1523);
				join_constraint();
				}
				}
				setState(1529);
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
		enterRule(_localctx, 122, RULE_join_operator);
		int _la;
		try {
			setState(1543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1530);
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
				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1531);
					match(K_NATURAL);
					}
				}

				setState(1540);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1534);
					match(K_LEFT);
					setState(1536);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1535);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1538);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1539);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1542);
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
		enterRule(_localctx, 124, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1545);
				match(K_ON);
				setState(1546);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1547);
				match(K_USING);
				setState(1548);
				match(OPEN_PAR);
				setState(1549);
				column_name();
				setState(1554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1550);
					match(COMMA);
					setState(1551);
					column_name();
					}
					}
					setState(1556);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1557);
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

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
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
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
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
		enterRule(_localctx, 126, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			select_core();
			setState(1562);
			compound_operator();
			setState(1563);
			select_core();
			setState(1569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_EXCEPT - 71)) | (1L << (K_INTERSECT - 71)) | (1L << (K_MINUS - 71)))) != 0) || _la==K_UNION) {
				{
				{
				setState(1564);
				compound_operator();
				setState(1565);
				select_core();
				}
				}
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1572);
				match(K_ORDER);
				setState(1573);
				match(K_BY);
				setState(1574);
				ordering_term();
				setState(1579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1575);
					match(COMMA);
					setState(1576);
					ordering_term();
					}
					}
					setState(1581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1584);
				match(K_LIMIT);
				setState(1585);
				expr(0);
				setState(1588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1586);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1587);
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
		public TerminalNode K_MINUS() { return getToken(SQLiteParser.K_MINUS, 0); }
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
		enterRule(_localctx, 128, RULE_compound_operator);
		try {
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1592);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1593);
				match(K_UNION);
				setState(1594);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1595);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1596);
				match(K_MINUS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1597);
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
		public Final_with_select_stmtContext final_with_select_stmt() {
			return getRuleContext(Final_with_select_stmtContext.class,0);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<Compound_select_stmtContext> compound_select_stmt() {
			return getRuleContexts(Compound_select_stmtContext.class);
		}
		public Compound_select_stmtContext compound_select_stmt(int i) {
			return getRuleContext(Compound_select_stmtContext.class,i);
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
		enterRule(_localctx, 130, RULE_with_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			match(K_WITH);
			setState(1602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1601);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1604);
			with_name();
			setState(1605);
			match(K_AS);
			setState(1606);
			match(OPEN_PAR);
			setState(1609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1607);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(1608);
				compound_select_stmt();
				}
				break;
			}
			setState(1611);
			match(CLOSE_PAR);
			setState(1624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1612);
				match(COMMA);
				setState(1613);
				with_name();
				setState(1614);
				match(K_AS);
				setState(1615);
				match(OPEN_PAR);
				setState(1618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1616);
					select_stmt();
					}
					break;
				case 2:
					{
					setState(1617);
					compound_select_stmt();
					}
					break;
				}
				setState(1620);
				match(CLOSE_PAR);
				}
				}
				setState(1626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1627);
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
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
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
		enterRule(_localctx, 132, RULE_final_with_select_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1629);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(1630);
				compound_select_stmt();
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
		enterRule(_localctx, 134, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			select_core();
			setState(1644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1634);
				match(K_ORDER);
				setState(1635);
				match(K_BY);
				setState(1636);
				ordering_term();
				setState(1641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1637);
					match(COMMA);
					setState(1638);
					ordering_term();
					}
					}
					setState(1643);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1646);
				match(K_LIMIT);
				setState(1647);
				expr(0);
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1648);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1649);
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
			setState(1723);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1654);
				match(K_SELECT);
				setState(1656);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1655);
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
				setState(1658);
				result_column();
				setState(1663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1659);
					match(COMMA);
					setState(1660);
					result_column();
					}
					}
					setState(1665);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1666);
					multi_from_clause();
					}
				}

				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1669);
					match(K_WHERE);
					setState(1670);
					expr(0);
					}
				}

				setState(1693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1673);
					match(K_GROUP);
					setState(1674);
					match(K_BY);
					setState(1677);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
					case 1:
						{
						setState(1675);
						dbColumnExpr();
						}
						break;
					case 2:
						{
						setState(1676);
						any_funct();
						}
						break;
					}
					setState(1686);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1679);
						match(COMMA);
						setState(1682);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
						case 1:
							{
							setState(1680);
							dbColumnExpr();
							}
							break;
						case 2:
							{
							setState(1681);
							any_funct();
							}
							break;
						}
						}
						}
						setState(1688);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1691);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1689);
						match(K_HAVING);
						setState(1690);
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
				setState(1695);
				match(K_VALUES);
				setState(1696);
				match(OPEN_PAR);
				setState(1697);
				expr(0);
				setState(1702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1698);
					match(COMMA);
					setState(1699);
					expr(0);
					}
					}
					setState(1704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1705);
				match(CLOSE_PAR);
				setState(1720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1706);
					match(COMMA);
					setState(1707);
					match(OPEN_PAR);
					setState(1708);
					expr(0);
					setState(1713);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1709);
						match(COMMA);
						setState(1710);
						expr(0);
						}
						}
						setState(1715);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1716);
					match(CLOSE_PAR);
					}
					}
					setState(1722);
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
			setState(1725);
			match(K_FROM);
			setState(1735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1726);
				table_or_subquery();
				setState(1731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1727);
					match(COMMA);
					setState(1728);
					table_or_subquery();
					}
					}
					setState(1733);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1734);
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
		enterRule(_localctx, 140, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			table_name();
			setState(1749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1738);
				match(OPEN_PAR);
				setState(1739);
				column_name();
				setState(1744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1740);
					match(COMMA);
					setState(1741);
					column_name();
					}
					}
					setState(1746);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1747);
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
		enterRule(_localctx, 142, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1751);
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

			setState(1754);
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
		enterRule(_localctx, 144, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
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
		enterRule(_localctx, 146, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
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
		enterRule(_localctx, 148, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
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
		enterRule(_localctx, 150, RULE_module_argument);
		try {
			setState(1764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1762);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1763);
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
		enterRule(_localctx, 152, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
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
		enterRule(_localctx, 154, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
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
		enterRule(_localctx, 156, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
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
		enterRule(_localctx, 158, RULE_result_count_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
			match(K_COUNT);
			setState(1773);
			match(OPEN_PAR);
			setState(1783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1774);
					distinct_keyword();
					}
					break;
				}
				setState(1777);
				result_column_expr();
				}
				break;
			case 2:
				{
				setState(1778);
				match(STAR);
				}
				break;
			case 3:
				{
				setState(1780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1779);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1782);
				any_funct();
				}
				break;
			}
			setState(1785);
			match(CLOSE_PAR);
			setState(1787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1786);
				deid_tag();
				}
			}

			setState(1793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(1790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1789);
					match(K_AS);
					}
				}

				setState(1792);
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
		enterRule(_localctx, 160, RULE_count_funct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			match(K_COUNT);
			setState(1796);
			match(OPEN_PAR);
			setState(1806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(1798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(1797);
					distinct_keyword();
					}
					break;
				}
				setState(1800);
				dbColumnExpr();
				}
				break;
			case 2:
				{
				setState(1801);
				match(STAR);
				}
				break;
			case 3:
				{
				setState(1803);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1802);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1805);
				any_funct();
				}
				break;
			}
			setState(1808);
			match(CLOSE_PAR);
			setState(1810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(1809);
				deid_tag();
				}
				break;
			}
			setState(1816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(1813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1812);
					match(K_AS);
					}
				}

				setState(1815);
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
		enterRule(_localctx, 162, RULE_any_result_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			function_name();
			setState(1819);
			match(OPEN_PAR);
			setState(1842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(1821);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(1820);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1827);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1823);
					result_column_expr();
					}
					break;
				case 2:
					{
					setState(1824);
					any_funct();
					}
					break;
				case 3:
					{
					setState(1825);
					math_expr(0);
					}
					break;
				case 4:
					{
					setState(1826);
					literal_value();
					}
					break;
				}
				setState(1839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1829);
					match(COMMA);
					setState(1835);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
					case 1:
						{
						setState(1830);
						result_column_expr();
						}
						break;
					case 2:
						{
						setState(1831);
						any_funct();
						}
						break;
					case 3:
						{
						setState(1832);
						math_expr(0);
						}
						break;
					case 4:
						{
						setState(1833);
						literal_value();
						}
						break;
					case 5:
						{
						setState(1834);
						match(STAR);
						}
						break;
					}
					}
					}
					setState(1841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1844);
			match(CLOSE_PAR);
			setState(1846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1845);
				deid_tag();
				}
			}

			setState(1852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(1849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1848);
					match(K_AS);
					}
				}

				setState(1851);
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
		enterRule(_localctx, 164, RULE_any_funct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			function_name();
			setState(1855);
			match(OPEN_PAR);
			setState(1878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(1857);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(1856);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1863);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(1859);
					dbColumnExpr();
					}
					break;
				case 2:
					{
					setState(1860);
					any_funct();
					}
					break;
				case 3:
					{
					setState(1861);
					math_expr(0);
					}
					break;
				case 4:
					{
					setState(1862);
					literal_value();
					}
					break;
				}
				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1865);
					match(COMMA);
					setState(1871);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
					case 1:
						{
						setState(1866);
						dbColumnExpr();
						}
						break;
					case 2:
						{
						setState(1867);
						any_funct();
						}
						break;
					case 3:
						{
						setState(1868);
						math_expr(0);
						}
						break;
					case 4:
						{
						setState(1869);
						literal_value();
						}
						break;
					case 5:
						{
						setState(1870);
						match(STAR);
						}
						break;
					}
					}
					}
					setState(1877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1880);
			match(CLOSE_PAR);
			setState(1882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(1881);
				deid_tag();
				}
				break;
			}
			setState(1888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				setState(1885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1884);
					match(K_AS);
					}
				}

				setState(1887);
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
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_math_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(1891);
				match(NUMERIC_LITERAL);
				}
				break;
			case 2:
				{
				setState(1892);
				dbColumnExpr();
				}
				break;
			case 3:
				{
				setState(1893);
				any_funct();
				}
				break;
			case 4:
				{
				setState(1894);
				match(OPEN_PAR);
				setState(1895);
				math_expr(0);
				setState(1896);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1908);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1906);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
					case 1:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(1900);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1901);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1902);
						math_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(1903);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1904);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1905);
						math_expr(3);
						}
						break;
					}
					} 
				}
				setState(1910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
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
		enterRule(_localctx, 168, RULE_and_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1911);
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
		enterRule(_localctx, 170, RULE_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1913);
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
		enterRule(_localctx, 172, RULE_and_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1915);
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
		enterRule(_localctx, 174, RULE_not_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
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
		enterRule(_localctx, 176, RULE_in_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
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
		enterRule(_localctx, 178, RULE_like_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
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
		enterRule(_localctx, 180, RULE_distinct_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
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
		enterRule(_localctx, 182, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
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
		enterRule(_localctx, 184, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
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
		enterRule(_localctx, 186, RULE_with_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
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
		enterRule(_localctx, 188, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1931);
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
		enterRule(_localctx, 190, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
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
		enterRule(_localctx, 192, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
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
		enterRule(_localctx, 194, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
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
		enterRule(_localctx, 196, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1939);
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
		enterRule(_localctx, 198, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
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
		enterRule(_localctx, 200, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
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
		enterRule(_localctx, 202, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1945);
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
		enterRule(_localctx, 204, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
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
		enterRule(_localctx, 206, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
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
		enterRule(_localctx, 208, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951);
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
		enterRule(_localctx, 210, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1953);
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
		enterRule(_localctx, 212, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
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
		enterRule(_localctx, 214, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
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
		enterRule(_localctx, 216, RULE_any_name);
		try {
			setState(1966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1959);
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
				setState(1960);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1961);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1962);
				match(OPEN_PAR);
				setState(1963);
				any_name();
				setState(1964);
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
		enterRule(_localctx, 218, RULE_anything_at_all);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1969); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1968);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1971); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
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
		case 36:
			return any_result_column_expr_sempred((Any_result_column_exprContext)_localctx, predIndex);
		case 37:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 83:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b7\u07b8\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\3\2\3\2\7\2\u00e1\n\2\f\2\16\2\u00e4\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4\u00ed\n\4\f\4\16\4\u00f0\13\4\3\4\7\4\u00f3"+
		"\n\4\f\4\16\4\u00f6\13\4\3\5\3\5\3\5\5\5\u00fb\n\5\5\5\u00fd\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u011c\n\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u0127\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u012f\n"+
		"\7\3\7\5\7\u0132\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u013b\n\b\3\t\3\t"+
		"\5\t\u013f\n\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u0147\n\n\3\n\3\n\5\n\u014b"+
		"\n\n\5\n\u014d\n\n\3\13\3\13\3\13\5\13\u0152\n\13\5\13\u0154\n\13\3\f"+
		"\3\f\5\f\u0158\n\f\3\f\3\f\3\f\3\f\5\f\u015e\n\f\3\f\3\f\3\f\5\f\u0163"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u016c\n\f\f\f\16\f\u016f\13\f\3\f"+
		"\3\f\3\f\5\f\u0174\n\f\3\r\3\r\5\r\u0178\n\r\3\r\3\r\3\r\3\r\5\r\u017e"+
		"\n\r\3\r\3\r\3\r\5\r\u0183\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u018a\n\r\f\r\16"+
		"\r\u018d\13\r\3\r\3\r\7\r\u0191\n\r\f\r\16\r\u0194\13\r\3\r\3\r\3\r\5"+
		"\r\u0199\n\r\3\r\3\r\5\r\u019d\n\r\3\16\3\16\5\16\u01a1\n\16\3\16\3\16"+
		"\3\16\3\16\5\16\u01a7\n\16\3\16\3\16\3\16\5\16\u01ac\n\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u01b3\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u01bc\n\16\f\16\16\16\u01bf\13\16\5\16\u01c1\n\16\5\16\u01c3\n\16\3\16"+
		"\3\16\3\16\3\16\5\16\u01c9\n\16\3\16\3\16\3\16\3\16\5\16\u01cf\n\16\3"+
		"\16\3\16\5\16\u01d3\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u01da\n\16\3\16"+
		"\3\16\6\16\u01de\n\16\r\16\16\16\u01df\3\16\3\16\3\17\3\17\5\17\u01e6"+
		"\n\17\3\17\3\17\3\17\3\17\5\17\u01ec\n\17\3\17\3\17\3\17\5\17\u01f1\n"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01fd\n\20"+
		"\3\20\3\20\3\20\5\20\u0202\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u020b\n\20\f\20\16\20\u020e\13\20\3\20\3\20\5\20\u0212\n\20\3\21\5\21"+
		"\u0215\n\21\3\21\3\21\3\21\3\21\5\21\u021b\n\21\3\22\5\22\u021e\n\22\3"+
		"\22\3\22\3\22\3\22\5\22\u0224\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u022b"+
		"\n\22\f\22\16\22\u022e\13\22\5\22\u0230\n\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0236\n\22\5\22\u0238\n\22\3\23\3\23\3\23\3\24\3\24\5\24\u023f\n\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\5\25\u0247\n\25\3\25\3\25\3\25\5\25\u024c"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0254\n\26\3\26\3\26\3\26\5\26"+
		"\u0259\n\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0261\n\27\3\27\3\27\3"+
		"\27\5\27\u0266\n\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u026e\n\30\3\30"+
		"\3\30\3\30\5\30\u0273\n\30\3\30\3\30\3\31\5\31\u0278\n\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u028b\n\31\3\31\3\31\3\31\3\31\5\31\u0291\n\31\3\31\3\31\3\31"+
		"\3\31\3\31\7\31\u0298\n\31\f\31\16\31\u029b\13\31\3\31\3\31\5\31\u029f"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\7\31\u02a6\n\31\f\31\16\31\u02a9\13\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u02b1\n\31\f\31\16\31\u02b4\13\31"+
		"\3\31\3\31\7\31\u02b8\n\31\f\31\16\31\u02bb\13\31\3\31\3\31\3\31\5\31"+
		"\u02c0\n\31\3\32\3\32\3\32\3\32\5\32\u02c6\n\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u02cf\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u02d6\n\33"+
		"\3\33\3\33\5\33\u02da\n\33\5\33\u02dc\n\33\3\34\3\34\5\34\u02e0\n\34\3"+
		"\34\3\34\3\35\3\35\3\35\5\35\u02e7\n\35\5\35\u02e9\n\35\3\35\3\35\5\35"+
		"\u02ed\n\35\3\35\5\35\u02f0\n\35\3\36\3\36\3\36\3\37\5\37\u02f6\n\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0303\n\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u030f\n\37\f\37"+
		"\16\37\u0312\13\37\3\37\3\37\5\37\u0316\n\37\3 \5 \u0319\n \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \5 \u0326\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0332"+
		"\n \f \16 \u0335\13 \3 \3 \5 \u0339\n \3 \3 \3 \3 \3 \7 \u0340\n \f \16"+
		" \u0343\13 \5 \u0345\n \3 \3 \3 \3 \5 \u034b\n \5 \u034d\n \3!\3!\3\""+
		"\3\"\5\"\u0353\n\"\3\"\7\"\u0356\n\"\f\"\16\"\u0359\13\"\3#\6#\u035c\n"+
		"#\r#\16#\u035d\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u036a\n#\3$\3$\5$\u036e"+
		"\n$\3$\3$\3$\5$\u0373\n$\3$\3$\5$\u0377\n$\3$\5$\u037a\n$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u038c\n$\3$\3$\3$\5$\u0391\n$"+
		"\3%\3%\3%\5%\u0396\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\5&\u03ae\n&\3&\3&\3&\3&\3&\6&\u03b5\n&\r&\16&\u03b6"+
		"\3&\3&\5&\u03bb\n&\3&\3&\3&\5&\u03c0\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u03dc\n&\3&\3&\3&"+
		"\5&\u03e1\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u03ed\n&\3&\3&\3&\3&\5&"+
		"\u03f3\n&\3&\3&\3&\3&\3&\5&\u03fa\n&\7&\u03fc\n&\f&\16&\u03ff\13&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u0416\n\'\3\'\5\'\u0419\n\'\3\'\3\'\3\'\5\'\u041e\n\'\3"+
		"\'\3\'\3\'\3\'\5\'\u0424\n\'\3\'\3\'\3\'\3\'\3\'\6\'\u042b\n\'\r\'\16"+
		"\'\u042c\3\'\3\'\5\'\u0431\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'"+
		"\u043c\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0458\n\'\3\'\3\'\3\'"+
		"\5\'\u045d\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0469\n\'\3"+
		"\'\3\'\3\'\3\'\5\'\u046f\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u0476\n\'\3\'\3\'"+
		"\5\'\u047a\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0483\n\'\f\'\16\'\u0486"+
		"\13\'\5\'\u0488\n\'\3\'\3\'\3\'\3\'\5\'\u048e\n\'\3\'\5\'\u0491\n\'\7"+
		"\'\u0493\n\'\f\'\16\'\u0496\13\'\3(\3(\3(\3(\5(\u049c\n(\3(\3(\3(\5(\u04a1"+
		"\n(\3(\3(\5(\u04a5\n(\3(\5(\u04a8\n(\5(\u04aa\n(\3)\3)\3)\3)\5)\u04b0"+
		"\n)\3)\3)\3)\5)\u04b5\n)\3)\3)\5)\u04b9\n)\3)\5)\u04bc\n)\3)\5)\u04bf"+
		"\n)\5)\u04c1\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u04cf\n*\3+\3+"+
		"\3+\3+\3+\3+\7+\u04d7\n+\f+\16+\u04da\13+\3+\3+\5+\u04de\n+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\5+\u04ea\n+\3+\3+\5+\u04ee\n+\7+\u04f0\n+\f+\16+\u04f3"+
		"\13+\3+\5+\u04f6\n+\3+\3+\3+\3+\3+\5+\u04fd\n+\5+\u04ff\n+\3,\3,\3,\3"+
		",\3,\3,\5,\u0507\n,\3,\3,\3-\3-\3-\5-\u050e\n-\3-\5-\u0511\n-\3.\3.\5"+
		".\u0515\n.\3.\3.\3.\5.\u051a\n.\3.\3.\3.\3.\7.\u0520\n.\f.\16.\u0523\13"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0533\n.\f.\16.\u0536\13"+
		".\3.\3.\3.\5.\u053b\n.\3/\3/\5/\u053f\n/\3/\3/\3/\3/\3/\5/\u0546\n/\3"+
		"/\3/\3/\3/\3/\3/\3/\5/\u054f\n/\3/\3/\7/\u0553\n/\f/\16/\u0556\13/\3\60"+
		"\3\60\3\60\5\60\u055b\n\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0563\n"+
		"\60\3\61\3\61\3\61\5\61\u0568\n\61\3\61\5\61\u056b\n\61\3\62\3\62\3\62"+
		"\5\62\u0570\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u057c\n\63\3\63\5\63\u057f\n\63\5\63\u0581\n\63\3\64\3\64\3\64\5\64\u0586"+
		"\n\64\3\64\3\64\3\64\3\64\5\64\u058c\n\64\3\65\5\65\u058f\n\65\3\65\5"+
		"\65\u0592\n\65\3\65\5\65\u0595\n\65\3\65\5\65\u0598\n\65\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\38\38\58\u05a2\n8\38\38\38\58\u05a7\n8\39\39\39\39\59"+
		"\u05ad\n9\39\39\39\59\u05b2\n9\39\59\u05b5\n9\3:\3:\3;\3;\3;\5;\u05bc"+
		"\n;\3<\3<\3<\5<\u05c1\n<\3<\3<\5<\u05c5\n<\3<\5<\u05c8\n<\3<\3<\3<\3<"+
		"\3<\5<\u05cf\n<\3=\3=\3=\3=\3=\7=\u05d6\n=\f=\16=\u05d9\13=\3=\5=\u05dc"+
		"\n=\3=\3=\5=\u05e0\n=\3=\5=\u05e3\n=\3=\3=\3=\5=\u05e8\n=\3=\3=\5=\u05ec"+
		"\n=\3=\5=\u05ef\n=\5=\u05f1\n=\3>\3>\3>\3>\3>\7>\u05f8\n>\f>\16>\u05fb"+
		"\13>\3?\3?\5?\u05ff\n?\3?\3?\5?\u0603\n?\3?\3?\5?\u0607\n?\3?\5?\u060a"+
		"\n?\3@\3@\3@\3@\3@\3@\3@\7@\u0613\n@\f@\16@\u0616\13@\3@\3@\5@\u061a\n"+
		"@\3A\3A\3A\3A\3A\3A\7A\u0622\nA\fA\16A\u0625\13A\3A\3A\3A\3A\3A\7A\u062c"+
		"\nA\fA\16A\u062f\13A\5A\u0631\nA\3A\3A\3A\3A\5A\u0637\nA\5A\u0639\nA\3"+
		"B\3B\3B\3B\3B\3B\5B\u0641\nB\3C\3C\5C\u0645\nC\3C\3C\3C\3C\3C\5C\u064c"+
		"\nC\3C\3C\3C\3C\3C\3C\3C\5C\u0655\nC\3C\3C\7C\u0659\nC\fC\16C\u065c\13"+
		"C\3C\3C\3D\3D\5D\u0662\nD\3E\3E\3E\3E\3E\3E\7E\u066a\nE\fE\16E\u066d\13"+
		"E\5E\u066f\nE\3E\3E\3E\3E\5E\u0675\nE\5E\u0677\nE\3F\3F\5F\u067b\nF\3"+
		"F\3F\3F\7F\u0680\nF\fF\16F\u0683\13F\3F\5F\u0686\nF\3F\3F\5F\u068a\nF"+
		"\3F\3F\3F\3F\5F\u0690\nF\3F\3F\3F\5F\u0695\nF\7F\u0697\nF\fF\16F\u069a"+
		"\13F\3F\3F\5F\u069e\nF\5F\u06a0\nF\3F\3F\3F\3F\3F\7F\u06a7\nF\fF\16F\u06aa"+
		"\13F\3F\3F\3F\3F\3F\3F\7F\u06b2\nF\fF\16F\u06b5\13F\3F\3F\7F\u06b9\nF"+
		"\fF\16F\u06bc\13F\5F\u06be\nF\3G\3G\3G\3G\7G\u06c4\nG\fG\16G\u06c7\13"+
		"G\3G\5G\u06ca\nG\3H\3H\3H\3H\3H\7H\u06d1\nH\fH\16H\u06d4\13H\3H\3H\5H"+
		"\u06d8\nH\3I\5I\u06db\nI\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\5M\u06e7\nM\3N"+
		"\3N\3O\3O\3P\3P\3Q\3Q\3Q\5Q\u06f2\nQ\3Q\3Q\3Q\5Q\u06f7\nQ\3Q\5Q\u06fa"+
		"\nQ\3Q\3Q\5Q\u06fe\nQ\3Q\5Q\u0701\nQ\3Q\5Q\u0704\nQ\3R\3R\3R\5R\u0709"+
		"\nR\3R\3R\3R\5R\u070e\nR\3R\5R\u0711\nR\3R\3R\5R\u0715\nR\3R\5R\u0718"+
		"\nR\3R\5R\u071b\nR\3S\3S\3S\5S\u0720\nS\3S\3S\3S\3S\5S\u0726\nS\3S\3S"+
		"\3S\3S\3S\3S\5S\u072e\nS\7S\u0730\nS\fS\16S\u0733\13S\5S\u0735\nS\3S\3"+
		"S\5S\u0739\nS\3S\5S\u073c\nS\3S\5S\u073f\nS\3T\3T\3T\5T\u0744\nT\3T\3"+
		"T\3T\3T\5T\u074a\nT\3T\3T\3T\3T\3T\3T\5T\u0752\nT\7T\u0754\nT\fT\16T\u0757"+
		"\13T\5T\u0759\nT\3T\3T\5T\u075d\nT\3T\5T\u0760\nT\3T\5T\u0763\nT\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\5U\u076d\nU\3U\3U\3U\3U\3U\3U\7U\u0775\nU\fU\16U\u0778"+
		"\13U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`"+
		"\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k"+
		"\3l\3l\3m\3m\3n\3n\3n\3n\3n\3n\3n\5n\u07b1\nn\3o\6o\u07b4\no\ro\16o\u07b5"+
		"\3o\2\5JL\u00a8p\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\2\27\5\2??JJ[[\4\2\61\61GG\3\2\u0095"+
		"\u0096\4\2\7\7zz\4\2$$AA\7\2\33\33OOZZ\u008b\u008b\u008e\u008e\4\2\t\t"+
		"\16\17\3\2\n\13\3\2\20\23\3\2\24\27\6\2TTmmoo\u0087\u0087\b\2<<WWqr\u0091"+
		"\u0091\u0098\u009b\u00ad\u00ad\4\2@@\u00a3\u00a3\5\2\33\33OO\u008e\u008e"+
		"\4\2NN\u00a0\u00a0\4\2\37\37CC\6\2\679xx\u00af\u00af\u00b1\u00b2\4\2\n"+
		"\fuu\4\2\u00ae\u00ae\u00b1\u00b1\6\2\33\63\65z|\u00ad\u00b7\u00b7\4\2"+
		"\"\"}}\2\u08ef\2\u00e2\3\2\2\2\4\u00e7\3\2\2\2\6\u00ea\3\2\2\2\b\u00fc"+
		"\3\2\2\2\n\u011f\3\2\2\2\f\u0121\3\2\2\2\16\u0133\3\2\2\2\20\u013c\3\2"+
		"\2\2\22\u0144\3\2\2\2\24\u014e\3\2\2\2\26\u0155\3\2\2\2\30\u0175\3\2\2"+
		"\2\32\u019e\3\2\2\2\34\u01e3\3\2\2\2\36\u01f6\3\2\2\2 \u0214\3\2\2\2\""+
		"\u021d\3\2\2\2$\u0239\3\2\2\2&\u023c\3\2\2\2(\u0242\3\2\2\2*\u024f\3\2"+
		"\2\2,\u025c\3\2\2\2.\u0269\3\2\2\2\60\u0277\3\2\2\2\62\u02c1\3\2\2\2\64"+
		"\u02d0\3\2\2\2\66\u02dd\3\2\2\28\u02e3\3\2\2\2:\u02f1\3\2\2\2<\u02f5\3"+
		"\2\2\2>\u0318\3\2\2\2@\u034e\3\2\2\2B\u0350\3\2\2\2D\u035b\3\2\2\2F\u036d"+
		"\3\2\2\2H\u0395\3\2\2\2J\u03bf\3\2\2\2L\u043b\3\2\2\2N\u04a9\3\2\2\2P"+
		"\u04c0\3\2\2\2R\u04ce\3\2\2\2T\u04d0\3\2\2\2V\u0500\3\2\2\2X\u050a\3\2"+
		"\2\2Z\u0514\3\2\2\2\\\u053c\3\2\2\2^\u055a\3\2\2\2`\u0564\3\2\2\2b\u056f"+
		"\3\2\2\2d\u0580\3\2\2\2f\u058b\3\2\2\2h\u058e\3\2\2\2j\u0599\3\2\2\2l"+
		"\u059b\3\2\2\2n\u059f\3\2\2\2p\u05b4\3\2\2\2r\u05b6\3\2\2\2t\u05b8\3\2"+
		"\2\2v\u05c0\3\2\2\2x\u05f0\3\2\2\2z\u05f2\3\2\2\2|\u0609\3\2\2\2~\u0619"+
		"\3\2\2\2\u0080\u061b\3\2\2\2\u0082\u0640\3\2\2\2\u0084\u0642\3\2\2\2\u0086"+
		"\u0661\3\2\2\2\u0088\u0663\3\2\2\2\u008a\u06bd\3\2\2\2\u008c\u06bf\3\2"+
		"\2\2\u008e\u06cb\3\2\2\2\u0090\u06da\3\2\2\2\u0092\u06de\3\2\2\2\u0094"+
		"\u06e0\3\2\2\2\u0096\u06e2\3\2\2\2\u0098\u06e6\3\2\2\2\u009a\u06e8\3\2"+
		"\2\2\u009c\u06ea\3\2\2\2\u009e\u06ec\3\2\2\2\u00a0\u06ee\3\2\2\2\u00a2"+
		"\u0705\3\2\2\2\u00a4\u071c\3\2\2\2\u00a6\u0740\3\2\2\2\u00a8\u076c\3\2"+
		"\2\2\u00aa\u0779\3\2\2\2\u00ac\u077b\3\2\2\2\u00ae\u077d\3\2\2\2\u00b0"+
		"\u077f\3\2\2\2\u00b2\u0781\3\2\2\2\u00b4\u0783\3\2\2\2\u00b6\u0785\3\2"+
		"\2\2\u00b8\u0787\3\2\2\2\u00ba\u0789\3\2\2\2\u00bc\u078b\3\2\2\2\u00be"+
		"\u078d\3\2\2\2\u00c0\u078f\3\2\2\2\u00c2\u0791\3\2\2\2\u00c4\u0793\3\2"+
		"\2\2\u00c6\u0795\3\2\2\2\u00c8\u0797\3\2\2\2\u00ca\u0799\3\2\2\2\u00cc"+
		"\u079b\3\2\2\2\u00ce\u079d\3\2\2\2\u00d0\u079f\3\2\2\2\u00d2\u07a1\3\2"+
		"\2\2\u00d4\u07a3\3\2\2\2\u00d6\u07a5\3\2\2\2\u00d8\u07a7\3\2\2\2\u00da"+
		"\u07b0\3\2\2\2\u00dc\u07b3\3\2\2\2\u00de\u00e1\5\6\4\2\u00df\u00e1\5\4"+
		"\3\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00e6\7\2\2\3\u00e6\3\3\2\2\2\u00e7\u00e8\7\u00b6\2\2\u00e8"+
		"\u00e9\b\3\1\2\u00e9\5\3\2\2\2\u00ea\u00ee\5\b\5\2\u00eb\u00ed\5\b\5\2"+
		"\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f4\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\5\u00dco"+
		"\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\7L\2\2\u00f8"+
		"\u00f9\7\u0083\2\2\u00f9\u00fb\7\u0080\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u011b\3\2\2\2\u00fe\u011c\5\f\7\2\u00ff\u011c\5\16\b\2\u0100\u011c\5"+
		"\20\t\2\u0101\u011c\5\22\n\2\u0102\u011c\5\24\13\2\u0103\u011c\5\u0080"+
		"A\2\u0104\u011c\5\26\f\2\u0105\u011c\5\30\r\2\u0106\u011c\5\32\16\2\u0107"+
		"\u011c\5\34\17\2\u0108\u011c\5\36\20\2\u0109\u011c\5 \21\2\u010a\u011c"+
		"\5\"\22\2\u010b\u011c\5&\24\2\u010c\u011c\5(\25\2\u010d\u011c\5*\26\2"+
		"\u010e\u011c\5,\27\2\u010f\u011c\5.\30\2\u0110\u011c\5\60\31\2\u0111\u011c"+
		"\5\62\32\2\u0112\u011c\5\64\33\2\u0113\u011c\5\66\34\2\u0114\u011c\58"+
		"\35\2\u0115\u011c\5:\36\2\u0116\u011c\5\u0088E\2\u0117\u011c\5<\37\2\u0118"+
		"\u011c\5> \2\u0119\u011c\5@!\2\u011a\u011c\5\u0084C\2\u011b\u00fe\3\2"+
		"\2\2\u011b\u00ff\3\2\2\2\u011b\u0100\3\2\2\2\u011b\u0101\3\2\2\2\u011b"+
		"\u0102\3\2\2\2\u011b\u0103\3\2\2\2\u011b\u0104\3\2\2\2\u011b\u0105\3\2"+
		"\2\2\u011b\u0106\3\2\2\2\u011b\u0107\3\2\2\2\u011b\u0108\3\2\2\2\u011b"+
		"\u0109\3\2\2\2\u011b\u010a\3\2\2\2\u011b\u010b\3\2\2\2\u011b\u010c\3\2"+
		"\2\2\u011b\u010d\3\2\2\2\u011b\u010e\3\2\2\2\u011b\u010f\3\2\2\2\u011b"+
		"\u0110\3\2\2\2\u011b\u0111\3\2\2\2\u011b\u0112\3\2\2\2\u011b\u0113\3\2"+
		"\2\2\u011b\u0114\3\2\2\2\u011b\u0115\3\2\2\2\u011b\u0116\3\2\2\2\u011b"+
		"\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011e\5\n\6\2\u011e\t\3\2\2\2\u011f\u0120"+
		"\7\3\2\2\u0120\13\3\2\2\2\u0121\u0122\7 \2\2\u0122\u0126\7\u0094\2\2\u0123"+
		"\u0124\5\u00ba^\2\u0124\u0125\7\4\2\2\u0125\u0127\3\2\2\2\u0126\u0123"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0131\5\u00be`"+
		"\2\u0129\u012a\7\u008a\2\2\u012a\u012b\7\u009c\2\2\u012b\u0132\5\u00c2"+
		"b\2\u012c\u012e\7\35\2\2\u012d\u012f\7\60\2\2\u012e\u012d\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\5B\"\2\u0131\u0129\3\2"+
		"\2\2\u0131\u012c\3\2\2\2\u0132\r\3\2\2\2\u0133\u013a\7!\2\2\u0134\u013b"+
		"\5\u00ba^\2\u0135\u013b\5\u00c0a\2\u0136\u0137\5\u00ba^\2\u0137\u0138"+
		"\7\4\2\2\u0138\u0139\5\u00c0a\2\u0139\u013b\3\2\2\2\u013a\u0134\3\2\2"+
		"\2\u013a\u0135\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u013b\3\2\2\2\u013b\17"+
		"\3\2\2\2\u013c\u013e\7%\2\2\u013d\u013f\7:\2\2\u013e\u013d\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\5L\'\2\u0141\u0142\7#\2"+
		"\2\u0142\u0143\5\u00ba^\2\u0143\21\3\2\2\2\u0144\u0146\7(\2\2\u0145\u0147"+
		"\t\2\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014c\3\2\2\2\u0148"+
		"\u014a\7\u009e\2\2\u0149\u014b\5\u00d8m\2\u014a\u0149\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u0148\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\23\3\2\2\2\u014e\u0153\t\3\2\2\u014f\u0151\7\u009e\2\2\u0150\u0152\5"+
		"\u00d8m\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2"+
		"\u0153\u014f\3\2\2\2\u0153\u0154\3\2\2\2\u0154\25\3\2\2\2\u0155\u0157"+
		"\7\65\2\2\u0156\u0158\7\u00a2\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015d\7]\2\2\u015a\u015b\7X\2\2\u015b\u015c"+
		"\7u\2\2\u015c\u015e\7K\2\2\u015d\u015a\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0162\3\2\2\2\u015f\u0160\5\u00ba^\2\u0160\u0161\7\4\2\2\u0161\u0163"+
		"\3\2\2\2\u0162\u015f\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\5\u00caf\2\u0165\u0166\7|\2\2\u0166\u0167\5\u00be`\2\u0167\u0168"+
		"\7\5\2\2\u0168\u016d\5X-\2\u0169\u016a\7\7\2\2\u016a\u016c\5X-\2\u016b"+
		"\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0173\7\6\2\2\u0171"+
		"\u0172\7\u00aa\2\2\u0172\u0174\5L\'\2\u0173\u0171\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\27\3\2\2\2\u0175\u0177\7\65\2\2\u0176\u0178\t\4\2\2\u0177"+
		"\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017d\7\u0094"+
		"\2\2\u017a\u017b\7X\2\2\u017b\u017c\7u\2\2\u017c\u017e\7K\2\2\u017d\u017a"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0182\3\2\2\2\u017f\u0180\5\u00ba^"+
		"\2\u0180\u0181\7\4\2\2\u0181\u0183\3\2\2\2\u0182\u017f\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u019c\5\u00be`\2\u0185\u0186\7\5\2"+
		"\2\u0186\u018b\5B\"\2\u0187\u0188\7\7\2\2\u0188\u018a\5B\"\2\u0189\u0187"+
		"\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u0192\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7\7\2\2\u018f\u0191\5Z"+
		".\2\u0190\u018e\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0198\7\6"+
		"\2\2\u0196\u0197\7\u00ac\2\2\u0197\u0199\7\u00ae\2\2\u0198\u0196\3\2\2"+
		"\2\u0198\u0199\3\2\2\2\u0199\u019d\3\2\2\2\u019a\u019b\7#\2\2\u019b\u019d"+
		"\5\u0088E\2\u019c\u0185\3\2\2\2\u019c\u019a\3\2\2\2\u019d\31\3\2\2\2\u019e"+
		"\u01a0\7\65\2\2\u019f\u01a1\t\4\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3"+
		"\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a6\7\u009f\2\2\u01a3\u01a4\7X\2\2"+
		"\u01a4\u01a5\7u\2\2\u01a5\u01a7\7K\2\2\u01a6\u01a3\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\u01ab\3\2\2\2\u01a8\u01a9\5\u00ba^\2\u01a9\u01aa\7\4\2"+
		"\2\u01aa\u01ac\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad"+
		"\3\2\2\2\u01ad\u01b2\5\u00ccg\2\u01ae\u01b3\7\'\2\2\u01af\u01b3\7\36\2"+
		"\2\u01b0\u01b1\7b\2\2\u01b1\u01b3\7y\2\2\u01b2\u01ae\3\2\2\2\u01b2\u01af"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01c2\3\2\2\2\u01b4"+
		"\u01c3\7@\2\2\u01b5\u01c3\7a\2\2\u01b6\u01c0\7\u00a3\2\2\u01b7\u01b8\7"+
		"y\2\2\u01b8\u01bd\5\u00c4c\2\u01b9\u01ba\7\7\2\2\u01ba\u01bc\5\u00c4c"+
		"\2\u01bb\u01b9\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be"+
		"\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01b7\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01b4\3\2\2\2\u01c2\u01b5\3\2"+
		"\2\2\u01c2\u01b6\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c8\7|\2\2\u01c5"+
		"\u01c6\5\u00ba^\2\u01c6\u01c7\7\4\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c5"+
		"\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01ce\5\u00be`"+
		"\2\u01cb\u01cc\7P\2\2\u01cc\u01cd\7E\2\2\u01cd\u01cf\7\u008f\2\2\u01ce"+
		"\u01cb\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01d1\7\u00a9"+
		"\2\2\u01d1\u01d3\5L\'\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01dd\7(\2\2\u01d5\u01da\5<\37\2\u01d6\u01da\5\60"+
		"\31\2\u01d7\u01da\5 \21\2\u01d8\u01da\5\u0088E\2\u01d9\u01d5\3\2\2\2\u01d9"+
		"\u01d6\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da\u01db\3\2"+
		"\2\2\u01db\u01dc\7\3\2\2\u01dc\u01de\3\2\2\2\u01dd\u01d9\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1\u01e2\7G\2\2\u01e2\33\3\2\2\2\u01e3\u01e5\7\65\2\2\u01e4\u01e6"+
		"\t\4\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01eb\7\u00a7\2\2\u01e8\u01e9\7X\2\2\u01e9\u01ea\7u\2\2\u01ea\u01ec\7"+
		"K\2\2\u01eb\u01e8\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01f0\3\2\2\2\u01ed"+
		"\u01ee\5\u00ba^\2\u01ee\u01ef\7\4\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ed"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\5\u00ceh"+
		"\2\u01f3\u01f4\7#\2\2\u01f4\u01f5\5\u0088E\2\u01f5\35\3\2\2\2\u01f6\u01f7"+
		"\7\65\2\2\u01f7\u01f8\7\u00a8\2\2\u01f8\u01fc\7\u0094\2\2\u01f9\u01fa"+
		"\7X\2\2\u01fa\u01fb\7u\2\2\u01fb\u01fd\7K\2\2\u01fc\u01f9\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u0201\3\2\2\2\u01fe\u01ff\5\u00ba^\2\u01ff\u0200"+
		"\7\4\2\2\u0200\u0202\3\2\2\2\u0201\u01fe\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0204\5\u00be`\2\u0204\u0205\7\u00a4\2\2\u0205\u0211"+
		"\5\u00d0i\2\u0206\u0207\7\5\2\2\u0207\u020c\5\u0098M\2\u0208\u0209\7\7"+
		"\2\2\u0209\u020b\5\u0098M\2\u020a\u0208\3\2\2\2\u020b\u020e\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u020c\3\2"+
		"\2\2\u020f\u0210\7\6\2\2\u0210\u0212\3\2\2\2\u0211\u0206\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\37\3\2\2\2\u0213\u0215\5\\/\2\u0214\u0213\3\2\2\2"+
		"\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\7@\2\2\u0217\u021a"+
		"\5$\23\2\u0218\u0219\7\u00aa\2\2\u0219\u021b\5L\'\2\u021a\u0218\3\2\2"+
		"\2\u021a\u021b\3\2\2\2\u021b!\3\2\2\2\u021c\u021e\5\\/\2\u021d\u021c\3"+
		"\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\7@\2\2\u0220"+
		"\u0223\5$\23\2\u0221\u0222\7\u00aa\2\2\u0222\u0224\5L\'\2\u0223\u0221"+
		"\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0237\3\2\2\2\u0225\u0226\7~\2\2\u0226"+
		"\u0227\7*\2\2\u0227\u022c\5`\61\2\u0228\u0229\7\7\2\2\u0229\u022b\5`\61"+
		"\2\u022a\u0228\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d"+
		"\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0225\3\2\2\2\u022f"+
		"\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\7n\2\2\u0232\u0235\5L\'"+
		"\2\u0233\u0234\t\5\2\2\u0234\u0236\5L\'\2\u0235\u0233\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u022f\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"#\3\2\2\2\u0239\u023a\7R\2\2\u023a\u023b\5^\60\2\u023b%\3\2\2\2\u023c"+
		"\u023e\7B\2\2\u023d\u023f\7:\2\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2"+
		"\2\u023f\u0240\3\2\2\2\u0240\u0241\5\u00ba^\2\u0241\'\3\2\2\2\u0242\u0243"+
		"\7D\2\2\u0243\u0246\7]\2\2\u0244\u0245\7X\2\2\u0245\u0247\7K\2\2\u0246"+
		"\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u024b\3\2\2\2\u0248\u0249\5\u00ba"+
		"^\2\u0249\u024a\7\4\2\2\u024a\u024c\3\2\2\2\u024b\u0248\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\5\u00caf\2\u024e)\3\2\2"+
		"\2\u024f\u0250\7D\2\2\u0250\u0253\7\u0094\2\2\u0251\u0252\7X\2\2\u0252"+
		"\u0254\7K\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0258\3\2"+
		"\2\2\u0255\u0256\5\u00ba^\2\u0256\u0257\7\4\2\2\u0257\u0259\3\2\2\2\u0258"+
		"\u0255\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\5\u00be"+
		"`\2\u025b+\3\2\2\2\u025c\u025d\7D\2\2\u025d\u0260\7\u009f\2\2\u025e\u025f"+
		"\7X\2\2\u025f\u0261\7K\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261"+
		"\u0265\3\2\2\2\u0262\u0263\5\u00ba^\2\u0263\u0264\7\4\2\2\u0264\u0266"+
		"\3\2\2\2\u0265\u0262\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"\u0268\5\u00ccg\2\u0268-\3\2\2\2\u0269\u026a\7D\2\2\u026a\u026d\7\u00a7"+
		"\2\2\u026b\u026c\7X\2\2\u026c\u026e\7K\2\2\u026d\u026b\3\2\2\2\u026d\u026e"+
		"\3\2\2\2\u026e\u0272\3\2\2\2\u026f\u0270\5\u00ba^\2\u0270\u0271\7\4\2"+
		"\2\u0271\u0273\3\2\2\2\u0272\u026f\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u0275\5\u00ceh\2\u0275/\3\2\2\2\u0276\u0278\5\\/\2\u0277"+
		"\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u028a\3\2\2\2\u0279\u028b\7a"+
		"\2\2\u027a\u028b\7\u008b\2\2\u027b\u027c\7a\2\2\u027c\u027d\7}\2\2\u027d"+
		"\u028b\7\u008b\2\2\u027e\u027f\7a\2\2\u027f\u0280\7}\2\2\u0280\u028b\7"+
		"\u008e\2\2\u0281\u0282\7a\2\2\u0282\u0283\7}\2\2\u0283\u028b\7\33\2\2"+
		"\u0284\u0285\7a\2\2\u0285\u0286\7}\2\2\u0286\u028b\7O\2\2\u0287\u0288"+
		"\7a\2\2\u0288\u0289\7}\2\2\u0289\u028b\7Z\2\2\u028a\u0279\3\2\2\2\u028a"+
		"\u027a\3\2\2\2\u028a\u027b\3\2\2\2\u028a\u027e\3\2\2\2\u028a\u0281\3\2"+
		"\2\2\u028a\u0284\3\2\2\2\u028a\u0287\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u0290\7d\2\2\u028d\u028e\5\u00ba^\2\u028e\u028f\7\4\2\2\u028f\u0291\3"+
		"\2\2\2\u0290\u028d\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u029e\5\u00be`\2\u0293\u0294\7\5\2\2\u0294\u0299\5\u00c4c\2\u0295\u0296"+
		"\7\7\2\2\u0296\u0298\5\u00c4c\2\u0297\u0295\3\2\2\2\u0298\u029b\3\2\2"+
		"\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299"+
		"\3\2\2\2\u029c\u029d\7\6\2\2\u029d\u029f\3\2\2\2\u029e\u0293\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u02bf\3\2\2\2\u02a0\u02a1\7\u00a6\2\2\u02a1\u02a2"+
		"\7\5\2\2\u02a2\u02a7\5L\'\2\u02a3\u02a4\7\7\2\2\u02a4\u02a6\5L\'\2\u02a5"+
		"\u02a3\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2"+
		"\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02b9\7\6\2\2\u02ab"+
		"\u02ac\7\7\2\2\u02ac\u02ad\7\5\2\2\u02ad\u02b2\5L\'\2\u02ae\u02af\7\7"+
		"\2\2\u02af\u02b1\5L\'\2\u02b0\u02ae\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b2\3\2"+
		"\2\2\u02b5\u02b6\7\6\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02ab\3\2\2\2\u02b8"+
		"\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02c0\3\2"+
		"\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02c0\5\u0088E\2\u02bd\u02be\7=\2\2\u02be"+
		"\u02c0\7\u00a6\2\2\u02bf\u02a0\3\2\2\2\u02bf\u02bc\3\2\2\2\u02bf\u02bd"+
		"\3\2\2\2\u02c0\61\3\2\2\2\u02c1\u02c5\7\u0081\2\2\u02c2\u02c3\5\u00ba"+
		"^\2\u02c3\u02c4\7\4\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02c2\3\2\2\2\u02c5"+
		"\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02ce\5\u00d2j\2\u02c8\u02c9"+
		"\7\b\2\2\u02c9\u02cf\5b\62\2\u02ca\u02cb\7\5\2\2\u02cb\u02cc\5b\62\2\u02cc"+
		"\u02cd\7\6\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02c8\3\2\2\2\u02ce\u02ca\3\2"+
		"\2\2\u02ce\u02cf\3\2\2\2\u02cf\63\3\2\2\2\u02d0\u02db\7\u0088\2\2\u02d1"+
		"\u02dc\5\u00c6d\2\u02d2\u02d3\5\u00ba^\2\u02d3\u02d4\7\4\2\2\u02d4\u02d6"+
		"\3\2\2\2\u02d5\u02d2\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7"+
		"\u02da\5\u00be`\2\u02d8\u02da\5\u00caf\2\u02d9\u02d7\3\2\2\2\u02d9\u02d8"+
		"\3\2\2\2\u02da\u02dc\3\2\2\2\u02db\u02d1\3\2\2\2\u02db\u02d5\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\65\3\2\2\2\u02dd\u02df\7\u0089\2\2\u02de\u02e0\7"+
		"\u0090\2\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2"+
		"\u02e1\u02e2\5\u00d4k\2\u02e2\67\3\2\2\2\u02e3\u02e8\7\u008e\2\2\u02e4"+
		"\u02e6\7\u009e\2\2\u02e5\u02e7\5\u00d8m\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7"+
		"\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02e4\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9"+
		"\u02ef\3\2\2\2\u02ea\u02ec\7\u009c\2\2\u02eb\u02ed\7\u0090\2\2\u02ec\u02eb"+
		"\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\5\u00d4k"+
		"\2\u02ef\u02ea\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f09\3\2\2\2\u02f1\u02f2"+
		"\7\u0090\2\2\u02f2\u02f3\5\u00d4k\2\u02f3;\3\2\2\2\u02f4\u02f6\5\\/\2"+
		"\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u0302"+
		"\7\u00a3\2\2\u02f8\u02f9\7}\2\2\u02f9\u0303\7\u008e\2\2\u02fa\u02fb\7"+
		"}\2\2\u02fb\u0303\7\33\2\2\u02fc\u02fd\7}\2\2\u02fd\u0303\7\u008b\2\2"+
		"\u02fe\u02ff\7}\2\2\u02ff\u0303\7O\2\2\u0300\u0301\7}\2\2\u0301\u0303"+
		"\7Z\2\2\u0302\u02f8\3\2\2\2\u0302\u02fa\3\2\2\2\u0302\u02fc\3\2\2\2\u0302"+
		"\u02fe\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\3\2"+
		"\2\2\u0304\u0305\5^\60\2\u0305\u0306\7\u0093\2\2\u0306\u0307\5\u00c4c"+
		"\2\u0307\u0308\7\b\2\2\u0308\u0310\5L\'\2\u0309\u030a\7\7\2\2\u030a\u030b"+
		"\5\u00c4c\2\u030b\u030c\7\b\2\2\u030c\u030d\5L\'\2\u030d\u030f\3\2\2\2"+
		"\u030e\u0309\3\2\2\2\u030f\u0312\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u0311"+
		"\3\2\2\2\u0311\u0315\3\2\2\2\u0312\u0310\3\2\2\2\u0313\u0314\7\u00aa\2"+
		"\2\u0314\u0316\5L\'\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316=\3"+
		"\2\2\2\u0317\u0319\5\\/\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319"+
		"\u031a\3\2\2\2\u031a\u0325\7\u00a3\2\2\u031b\u031c\7}\2\2\u031c\u0326"+
		"\7\u008e\2\2\u031d\u031e\7}\2\2\u031e\u0326\7\33\2\2\u031f\u0320\7}\2"+
		"\2\u0320\u0326\7\u008b\2\2\u0321\u0322\7}\2\2\u0322\u0326\7O\2\2\u0323"+
		"\u0324\7}\2\2\u0324\u0326\7Z\2\2\u0325\u031b\3\2\2\2\u0325\u031d\3\2\2"+
		"\2\u0325\u031f\3\2\2\2\u0325\u0321\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326"+
		"\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\5^\60\2\u0328\u0329\7\u0093\2"+
		"\2\u0329\u032a\5\u00c4c\2\u032a\u032b\7\b\2\2\u032b\u0333\5L\'\2\u032c"+
		"\u032d\7\7\2\2\u032d\u032e\5\u00c4c\2\u032e\u032f\7\b\2\2\u032f\u0330"+
		"\5L\'\2\u0330\u0332\3\2\2\2\u0331\u032c\3\2\2\2\u0332\u0335\3\2\2\2\u0333"+
		"\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0338\3\2\2\2\u0335\u0333\3\2"+
		"\2\2\u0336\u0337\7\u00aa\2\2\u0337\u0339\5L\'\2\u0338\u0336\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u034c\3\2\2\2\u033a\u033b\7~\2\2\u033b\u033c\7*\2"+
		"\2\u033c\u0341\5`\61\2\u033d\u033e\7\7\2\2\u033e\u0340\5`\61\2\u033f\u033d"+
		"\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0344\u033a\3\2\2\2\u0344\u0345\3\2"+
		"\2\2\u0345\u0346\3\2\2\2\u0346\u0347\7n\2\2\u0347\u034a\5L\'\2\u0348\u0349"+
		"\t\5\2\2\u0349\u034b\5L\'\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
		"\u034d\3\2\2\2\u034c\u0344\3\2\2\2\u034c\u034d\3\2\2\2\u034d?\3\2\2\2"+
		"\u034e\u034f\7\u00a5\2\2\u034fA\3\2\2\2\u0350\u0352\5\u00c4c\2\u0351\u0353"+
		"\5D#\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0357\3\2\2\2\u0354"+
		"\u0356\5F$\2\u0355\u0354\3\2\2\2\u0356\u0359\3\2\2\2\u0357\u0355\3\2\2"+
		"\2\u0357\u0358\3\2\2\2\u0358C\3\2\2\2\u0359\u0357\3\2\2\2\u035a\u035c"+
		"\5\u009eP\2\u035b\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035b\3\2\2"+
		"\2\u035d\u035e\3\2\2\2\u035e\u0369\3\2\2\2\u035f\u0360\7\5\2\2\u0360\u0361"+
		"\5\u0090I\2\u0361\u0362\7\6\2\2\u0362\u036a\3\2\2\2\u0363\u0364\7\5\2"+
		"\2\u0364\u0365\5\u0090I\2\u0365\u0366\7\7\2\2\u0366\u0367\5\u0090I\2\u0367"+
		"\u0368\7\6\2\2\u0368\u036a\3\2\2\2\u0369\u035f\3\2\2\2\u0369\u0363\3\2"+
		"\2\2\u0369\u036a\3\2\2\2\u036aE\3\2\2\2\u036b\u036c\7\63\2\2\u036c\u036e"+
		"\5\u009eP\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0390\3\2\2"+
		"\2\u036f\u0370\7\u0082\2\2\u0370\u0372\7k\2\2\u0371\u0373\t\6\2\2\u0372"+
		"\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0376\5H"+
		"%\2\u0375\u0377\7&\2\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0391"+
		"\3\2\2\2\u0378\u037a\7u\2\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u037b\3\2\2\2\u037b\u037c\7x\2\2\u037c\u0391\5H%\2\u037d\u037e\7\u00a2"+
		"\2\2\u037e\u0391\5H%\2\u037f\u0380\7.\2\2\u0380\u0381\7\5\2\2\u0381\u0382"+
		"\5L\'\2\u0382\u0383\7\6\2\2\u0383\u0391\3\2\2\2\u0384\u038b\7=\2\2\u0385"+
		"\u038c\5\u0090I\2\u0386\u038c\5\u0092J\2\u0387\u0388\7\5\2\2\u0388\u0389"+
		"\5L\'\2\u0389\u038a\7\6\2\2\u038a\u038c\3\2\2\2\u038b\u0385\3\2\2\2\u038b"+
		"\u0386\3\2\2\2\u038b\u0387\3\2\2\2\u038c\u0391\3\2\2\2\u038d\u038e\7/"+
		"\2\2\u038e\u0391\5\u00c6d\2\u038f\u0391\5T+\2\u0390\u036f\3\2\2\2\u0390"+
		"\u0379\3\2\2\2\u0390\u037d\3\2\2\2\u0390\u037f\3\2\2\2\u0390\u0384\3\2"+
		"\2\2\u0390\u038d\3\2\2\2\u0390\u038f\3\2\2\2\u0391G\3\2\2\2\u0392\u0393"+
		"\7|\2\2\u0393\u0394\7\62\2\2\u0394\u0396\t\7\2\2\u0395\u0392\3\2\2\2\u0395"+
		"\u0396\3\2\2\2\u0396I\3\2\2\2\u0397\u0398\b&\1\2\u0398\u03c0\5\u0092J"+
		"\2\u0399\u03c0\7\u00b0\2\2\u039a\u03c0\5N(\2\u039b\u039c\5\u0094K\2\u039c"+
		"\u039d\5J&\25\u039d\u03c0\3\2\2\2\u039e\u03c0\5\u00a2R\2\u039f\u03c0\5"+
		"\u00a6T\2\u03a0\u03a1\7\5\2\2\u03a1\u03a2\5J&\2\u03a2\u03a3\7\6\2\2\u03a3"+
		"\u03c0\3\2\2\2\u03a4\u03a5\7-\2\2\u03a5\u03a6\7\5\2\2\u03a6\u03a7\5J&"+
		"\2\u03a7\u03a8\7#\2\2\u03a8\u03a9\5D#\2\u03a9\u03aa\7\6\2\2\u03aa\u03c0"+
		"\3\2\2\2\u03ab\u03ad\7,\2\2\u03ac\u03ae\5J&\2\u03ad\u03ac\3\2\2\2\u03ad"+
		"\u03ae\3\2\2\2\u03ae\u03b4\3\2\2\2\u03af\u03b0\7\u00a9\2\2\u03b0\u03b1"+
		"\5J&\2\u03b1\u03b2\7\u0097\2\2\u03b2\u03b3\5J&\2\u03b3\u03b5\3\2\2\2\u03b4"+
		"\u03af\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2"+
		"\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b9\7F\2\2\u03b9\u03bb\5J&\2\u03ba\u03b8"+
		"\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd\7G\2\2\u03bd"+
		"\u03c0\3\2\2\2\u03be\u03c0\5V,\2\u03bf\u0397\3\2\2\2\u03bf\u0399\3\2\2"+
		"\2\u03bf\u039a\3\2\2\2\u03bf\u039b\3\2\2\2\u03bf\u039e\3\2\2\2\u03bf\u039f"+
		"\3\2\2\2\u03bf\u03a0\3\2\2\2\u03bf\u03a4\3\2\2\2\u03bf\u03ab\3\2\2\2\u03bf"+
		"\u03be\3\2\2\2\u03c0\u03fd\3\2\2\2\u03c1\u03c2\f\24\2\2\u03c2\u03c3\7"+
		"\r\2\2\u03c3\u03fc\5J&\25\u03c4\u03c5\f\23\2\2\u03c5\u03c6\t\b\2\2\u03c6"+
		"\u03fc\5J&\24\u03c7\u03c8\f\22\2\2\u03c8\u03c9\t\t\2\2\u03c9\u03fc\5J"+
		"&\23\u03ca\u03cb\f\21\2\2\u03cb\u03cc\t\n\2\2\u03cc\u03fc\5J&\22\u03cd"+
		"\u03ce\f\20\2\2\u03ce\u03cf\t\13\2\2\u03cf\u03fc\5J&\21\u03d0\u03d1\f"+
		"\17\2\2\u03d1\u03d2\5R*\2\u03d2\u03d3\5J&\20\u03d3\u03fc\3\2\2\2\u03d4"+
		"\u03d5\f\16\2\2\u03d5\u03d6\5\u00aeX\2\u03d6\u03d7\5J&\17\u03d7\u03fc"+
		"\3\2\2\2\u03d8\u03d9\f\6\2\2\u03d9\u03db\7e\2\2\u03da\u03dc\7u\2\2\u03db"+
		"\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03fc\5J"+
		"&\7\u03de\u03e0\f\5\2\2\u03df\u03e1\7u\2\2\u03e0\u03df\3\2\2\2\u03e0\u03e1"+
		"\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\7)\2\2\u03e3\u03e4\5J&\2\u03e4"+
		"\u03e5\7\"\2\2\u03e5\u03e6\5J&\6\u03e6\u03fc\3\2\2\2\u03e7\u03e8\f\t\2"+
		"\2\u03e8\u03e9\7/\2\2\u03e9\u03fc\5\u00c6d\2\u03ea\u03ec\f\b\2\2\u03eb"+
		"\u03ed\7u\2\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\3\2"+
		"\2\2\u03ee\u03ef\t\f\2\2\u03ef\u03f2\5J&\2\u03f0\u03f1\7H\2\2\u03f1\u03f3"+
		"\5J&\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03fc\3\2\2\2\u03f4"+
		"\u03f9\f\7\2\2\u03f5\u03fa\7h\2\2\u03f6\u03fa\7w\2\2\u03f7\u03f8\7u\2"+
		"\2\u03f8\u03fa\7x\2\2\u03f9\u03f5\3\2\2\2\u03f9\u03f6\3\2\2\2\u03f9\u03f7"+
		"\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb\u03c1\3\2\2\2\u03fb\u03c4\3\2\2\2\u03fb"+
		"\u03c7\3\2\2\2\u03fb\u03ca\3\2\2\2\u03fb\u03cd\3\2\2\2\u03fb\u03d0\3\2"+
		"\2\2\u03fb\u03d4\3\2\2\2\u03fb\u03d8\3\2\2\2\u03fb\u03de\3\2\2\2\u03fb"+
		"\u03e7\3\2\2\2\u03fb\u03ea\3\2\2\2\u03fb\u03f4\3\2\2\2\u03fc\u03ff\3\2"+
		"\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03feK\3\2\2\2\u03ff\u03fd"+
		"\3\2\2\2\u0400\u0401\b\'\1\2\u0401\u043c\5\u0092J\2\u0402\u043c\7\u00b0"+
		"\2\2\u0403\u043c\5N(\2\u0404\u0405\5\u0094K\2\u0405\u0406\5L\'\27\u0406"+
		"\u043c\3\2\2\2\u0407\u043c\5\u00a2R\2\u0408\u043c\5\u00a6T\2\u0409\u040a"+
		"\7\5\2\2\u040a\u040b\5L\'\2\u040b\u040c\7\6\2\2\u040c\u043c\3\2\2\2\u040d"+
		"\u040e\7-\2\2\u040e\u040f\7\5\2\2\u040f\u0410\5L\'\2\u0410\u0411\7#\2"+
		"\2\u0411\u0412\5D#\2\u0412\u0413\7\6\2\2\u0413\u043c\3\2\2\2\u0414\u0416"+
		"\7u\2\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\3\2\2\2\u0417"+
		"\u0419\7K\2\2\u0418\u0415\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\3\2"+
		"\2\2\u041a\u041d\7\5\2\2\u041b\u041e\5\u0088E\2\u041c\u041e\5\u0080A\2"+
		"\u041d\u041b\3\2\2\2\u041d\u041c\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0420"+
		"\7\6\2\2\u0420\u043c\3\2\2\2\u0421\u0423\7,\2\2\u0422\u0424\5L\'\2\u0423"+
		"\u0422\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u042a\3\2\2\2\u0425\u0426\7\u00a9"+
		"\2\2\u0426\u0427\5L\'\2\u0427\u0428\7\u0097\2\2\u0428\u0429\5L\'\2\u0429"+
		"\u042b\3\2\2\2\u042a\u0425\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042a\3\2"+
		"\2\2\u042c\u042d\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042f\7F\2\2\u042f"+
		"\u0431\5L\'\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432\3\2"+
		"\2\2\u0432\u0433\7G\2\2\u0433\u043c\3\2\2\2\u0434\u0435\7M\2\2\u0435\u0436"+
		"\7\5\2\2\u0436\u0437\t\r\2\2\u0437\u0438\7R\2\2\u0438\u0439\5L\'\2\u0439"+
		"\u043a\7\6\2\2\u043a\u043c\3\2\2\2\u043b\u0400\3\2\2\2\u043b\u0402\3\2"+
		"\2\2\u043b\u0403\3\2\2\2\u043b\u0404\3\2\2\2\u043b\u0407\3\2\2\2\u043b"+
		"\u0408\3\2\2\2\u043b\u0409\3\2\2\2\u043b\u040d\3\2\2\2\u043b\u0418\3\2"+
		"\2\2\u043b\u0421\3\2\2\2\u043b\u0434\3\2\2\2\u043c\u0494\3\2\2\2\u043d"+
		"\u043e\f\26\2\2\u043e\u043f\7\r\2\2\u043f\u0493\5L\'\27\u0440\u0441\f"+
		"\25\2\2\u0441\u0442\t\b\2\2\u0442\u0493\5L\'\26\u0443\u0444\f\24\2\2\u0444"+
		"\u0445\t\t\2\2\u0445\u0493\5L\'\25\u0446\u0447\f\23\2\2\u0447\u0448\t"+
		"\n\2\2\u0448\u0493\5L\'\24\u0449\u044a\f\22\2\2\u044a\u044b\t\13\2\2\u044b"+
		"\u0493\5L\'\23\u044c\u044d\f\21\2\2\u044d\u044e\5R*\2\u044e\u044f\5L\'"+
		"\22\u044f\u0493\3\2\2\2\u0450\u0451\f\20\2\2\u0451\u0452\5\u00aeX\2\u0452"+
		"\u0453\5L\'\21\u0453\u0493\3\2\2\2\u0454\u0455\f\b\2\2\u0455\u0457\7e"+
		"\2\2\u0456\u0458\7u\2\2\u0457\u0456\3\2\2\2\u0457\u0458\3\2\2\2\u0458"+
		"\u0459\3\2\2\2\u0459\u0493\5L\'\t\u045a\u045c\f\7\2\2\u045b\u045d\7u\2"+
		"\2\u045c\u045b\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u045f"+
		"\7)\2\2\u045f\u0460\5L\'\2\u0460\u0461\7\"\2\2\u0461\u0462\5L\'\b\u0462"+
		"\u0493\3\2\2\2\u0463\u0464\f\13\2\2\u0464\u0465\7/\2\2\u0465\u0493\5\u00c6"+
		"d\2\u0466\u0468\f\n\2\2\u0467\u0469\7u\2\2\u0468\u0467\3\2\2\2\u0468\u0469"+
		"\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046b\t\f\2\2\u046b\u046e\5L\'\2\u046c"+
		"\u046d\7H\2\2\u046d\u046f\5L\'\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2"+
		"\2\u046f\u0493\3\2\2\2\u0470\u0475\f\t\2\2\u0471\u0476\7h\2\2\u0472\u0476"+
		"\7w\2\2\u0473\u0474\7u\2\2\u0474\u0476\7x\2\2\u0475\u0471\3\2\2\2\u0475"+
		"\u0472\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u0493\3\2\2\2\u0477\u0479\f\6"+
		"\2\2\u0478\u047a\7u\2\2\u0479\u0478\3\2\2\2\u0479\u047a\3\2\2\2\u047a"+
		"\u047b\3\2\2\2\u047b\u0490\7\\\2\2\u047c\u0487\7\5\2\2\u047d\u0488\5\u0088"+
		"E\2\u047e\u0488\5\u0080A\2\u047f\u0484\5L\'\2\u0480\u0481\7\7\2\2\u0481"+
		"\u0483\5L\'\2\u0482\u0480\3\2\2\2\u0483\u0486\3\2\2\2\u0484\u0482\3\2"+
		"\2\2\u0484\u0485\3\2\2\2\u0485\u0488\3\2\2\2\u0486\u0484\3\2\2\2\u0487"+
		"\u047d\3\2\2\2\u0487\u047e\3\2\2\2\u0487\u047f\3\2\2\2\u0487\u0488\3\2"+
		"\2\2\u0488\u0489\3\2\2\2\u0489\u0491\7\6\2\2\u048a\u048b\5\u00ba^\2\u048b"+
		"\u048c\7\4\2\2\u048c\u048e\3\2\2\2\u048d\u048a\3\2\2\2\u048d\u048e\3\2"+
		"\2\2\u048e\u048f\3\2\2\2\u048f\u0491\5\u00be`\2\u0490\u047c\3\2\2\2\u0490"+
		"\u048d\3\2\2\2\u0491\u0493\3\2\2\2\u0492\u043d\3\2\2\2\u0492\u0440\3\2"+
		"\2\2\u0492\u0443\3\2\2\2\u0492\u0446\3\2\2\2\u0492\u0449\3\2\2\2\u0492"+
		"\u044c\3\2\2\2\u0492\u0450\3\2\2\2\u0492\u0454\3\2\2\2\u0492\u045a\3\2"+
		"\2\2\u0492\u0463\3\2\2\2\u0492\u0466\3\2\2\2\u0492\u0470\3\2\2\2\u0492"+
		"\u0477\3\2\2\2\u0493\u0496\3\2\2\2\u0494\u0492\3\2\2\2\u0494\u0495\3\2"+
		"\2\2\u0495M\3\2\2\2\u0496\u0494\3\2\2\2\u0497\u04aa\3\2\2\2\u0498\u0499"+
		"\5\u00ba^\2\u0499\u049a\7\4\2\2\u049a\u049c\3\2\2\2\u049b\u0498\3\2\2"+
		"\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\5\u00be`\2\u049e"+
		"\u049f\7\4\2\2\u049f\u04a1\3\2\2\2\u04a0\u049b\3\2\2\2\u04a0\u04a1\3\2"+
		"\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a7\5\u00c4c\2\u04a3\u04a5\7#\2\2\u04a4"+
		"\u04a3\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a8\5\u009a"+
		"N\2\u04a7\u04a4\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04aa\3\2\2\2\u04a9"+
		"\u0497\3\2\2\2\u04a9\u04a0\3\2\2\2\u04aaO\3\2\2\2\u04ab\u04c1\3\2\2\2"+
		"\u04ac\u04ad\5\u00ba^\2\u04ad\u04ae\7\4\2\2\u04ae\u04b0\3\2\2\2\u04af"+
		"\u04ac\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\5\u00be"+
		"`\2\u04b2\u04b3\7\4\2\2\u04b3\u04b5\3\2\2\2\u04b4\u04af\3\2\2\2\u04b4"+
		"\u04b5\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b8\5\u00c4c\2\u04b7\u04b9"+
		"\5f\64\2\u04b8\u04b7\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04be\3\2\2\2\u04ba"+
		"\u04bc\7#\2\2\u04bb\u04ba\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\3\2"+
		"\2\2\u04bd\u04bf\5\u009aN\2\u04be\u04bb\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf"+
		"\u04c1\3\2\2\2\u04c0\u04ab\3\2\2\2\u04c0\u04b4\3\2\2\2\u04c1Q\3\2\2\2"+
		"\u04c2\u04cf\7\b\2\2\u04c3\u04cf\7\30\2\2\u04c4\u04cf\7\31\2\2\u04c5\u04cf"+
		"\7\32\2\2\u04c6\u04cf\7e\2\2\u04c7\u04c8\7e\2\2\u04c8\u04cf\7u\2\2\u04c9"+
		"\u04cf\5\u00b2Z\2\u04ca\u04cf\5\u00b4[\2\u04cb\u04cf\7T\2\2\u04cc\u04cf"+
		"\7o\2\2\u04cd\u04cf\7\u0087\2\2\u04ce\u04c2\3\2\2\2\u04ce\u04c3\3\2\2"+
		"\2\u04ce\u04c4\3\2\2\2\u04ce\u04c5\3\2\2\2\u04ce\u04c6\3\2\2\2\u04ce\u04c7"+
		"\3\2\2\2\u04ce\u04c9\3\2\2\2\u04ce\u04ca\3\2\2\2\u04ce\u04cb\3\2\2\2\u04ce"+
		"\u04cc\3\2\2\2\u04ce\u04cd\3\2\2\2\u04cfS\3\2\2\2\u04d0\u04d1\7\u0086"+
		"\2\2\u04d1\u04dd\5\u00c8e\2\u04d2\u04d3\7\5\2\2\u04d3\u04d8\5\u00c4c\2"+
		"\u04d4\u04d5\7\7\2\2\u04d5\u04d7\5\u00c4c\2\u04d6\u04d4\3\2\2\2\u04d7"+
		"\u04da\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04db\3\2"+
		"\2\2\u04da\u04d8\3\2\2\2\u04db\u04dc\7\6\2\2\u04dc\u04de\3\2\2\2\u04dd"+
		"\u04d2\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04f1\3\2\2\2\u04df\u04e0\7|"+
		"\2\2\u04e0\u04e9\t\16\2\2\u04e1\u04e2\7\u0093\2\2\u04e2\u04ea\7x\2\2\u04e3"+
		"\u04e4\7\u0093\2\2\u04e4\u04ea\7=\2\2\u04e5\u04ea\7+\2\2\u04e6\u04ea\7"+
		"\u008c\2\2\u04e7\u04e8\7t\2\2\u04e8\u04ea\7\34\2\2\u04e9\u04e1\3\2\2\2"+
		"\u04e9\u04e3\3\2\2\2\u04e9\u04e5\3\2\2\2\u04e9\u04e6\3\2\2\2\u04e9\u04e7"+
		"\3\2\2\2\u04ea\u04ee\3\2\2\2\u04eb\u04ec\7o\2\2\u04ec\u04ee\5\u009eP\2"+
		"\u04ed\u04df\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ee\u04f0\3\2\2\2\u04ef\u04ed"+
		"\3\2\2\2\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2"+
		"\u04fe\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4\u04f6\7u\2\2\u04f5\u04f4\3\2"+
		"\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04fc\7>\2\2\u04f8"+
		"\u04f9\7_\2\2\u04f9\u04fd\7?\2\2\u04fa\u04fb\7_\2\2\u04fb\u04fd\7[\2\2"+
		"\u04fc\u04f8\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04ff"+
		"\3\2\2\2\u04fe\u04f5\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ffU\3\2\2\2\u0500"+
		"\u0501\7\u0084\2\2\u0501\u0506\7\5\2\2\u0502\u0507\7Z\2\2\u0503\u0504"+
		"\t\17\2\2\u0504\u0505\7\7\2\2\u0505\u0507\5\u0096L\2\u0506\u0502\3\2\2"+
		"\2\u0506\u0503\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0509\7\6\2\2\u0509W"+
		"\3\2\2\2\u050a\u050d\5\u00c4c\2\u050b\u050c\7/\2\2\u050c\u050e\5\u00c6"+
		"d\2\u050d\u050b\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0510\3\2\2\2\u050f"+
		"\u0511\t\6\2\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511Y\3\2\2\2"+
		"\u0512\u0513\7\63\2\2\u0513\u0515\5\u009eP\2\u0514\u0512\3\2\2\2\u0514"+
		"\u0515\3\2\2\2\u0515\u053a\3\2\2\2\u0516\u0517\7\u0082\2\2\u0517\u051a"+
		"\7k\2\2\u0518\u051a\7\u00a2\2\2\u0519\u0516\3\2\2\2\u0519\u0518\3\2\2"+
		"\2\u051a\u051b\3\2\2\2\u051b\u051c\7\5\2\2\u051c\u0521\5X-\2\u051d\u051e"+
		"\7\7\2\2\u051e\u0520\5X-\2\u051f\u051d\3\2\2\2\u0520\u0523\3\2\2\2\u0521"+
		"\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0524\3\2\2\2\u0523\u0521\3\2"+
		"\2\2\u0524\u0525\7\6\2\2\u0525\u0526\5H%\2\u0526\u053b\3\2\2\2\u0527\u0528"+
		"\7.\2\2\u0528\u0529\7\5\2\2\u0529\u052a\5L\'\2\u052a\u052b\7\6\2\2\u052b"+
		"\u053b\3\2\2\2\u052c\u052d\7Q\2\2\u052d\u052e\7k\2\2\u052e\u052f\7\5\2"+
		"\2\u052f\u0534\5\u00c4c\2\u0530\u0531\7\7\2\2\u0531\u0533\5\u00c4c\2\u0532"+
		"\u0530\3\2\2\2\u0533\u0536\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2"+
		"\2\2\u0535\u0537\3\2\2\2\u0536\u0534\3\2\2\2\u0537\u0538\7\6\2\2\u0538"+
		"\u0539\5T+\2\u0539\u053b\3\2\2\2\u053a\u0519\3\2\2\2\u053a\u0527\3\2\2"+
		"\2\u053a\u052c\3\2\2\2\u053b[\3\2\2\2\u053c\u053e\7\u00ab\2\2\u053d\u053f"+
		"\7\u0085\2\2\u053e\u053d\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0540\3\2\2"+
		"\2\u0540\u0541\5\u008eH\2\u0541\u0542\7#\2\2\u0542\u0545\7\5\2\2\u0543"+
		"\u0546\5\u0088E\2\u0544\u0546\5\u0080A\2\u0545\u0543\3\2\2\2\u0545\u0544"+
		"\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0554\7\6\2\2\u0548\u0549\7\7\2\2\u0549"+
		"\u054a\5\u008eH\2\u054a\u054b\7#\2\2\u054b\u054e\7\5\2\2\u054c\u054f\5"+
		"\u0088E\2\u054d\u054f\5\u0080A\2\u054e\u054c\3\2\2\2\u054e\u054d\3\2\2"+
		"\2\u054f\u0550\3\2\2\2\u0550\u0551\7\6\2\2\u0551\u0553\3\2\2\2\u0552\u0548"+
		"\3\2\2\2\u0553\u0556\3\2\2\2\u0554\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555"+
		"]\3\2\2\2\u0556\u0554\3\2\2\2\u0557\u0558\5\u00ba^\2\u0558\u0559\7\4\2"+
		"\2\u0559\u055b\3\2\2\2\u055a\u0557\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055c"+
		"\3\2\2\2\u055c\u0562\5\u00be`\2\u055d\u055e\7^\2\2\u055e\u055f\7*\2\2"+
		"\u055f\u0563\5\u00caf\2\u0560\u0561\7u\2\2\u0561\u0563\7^\2\2\u0562\u055d"+
		"\3\2\2\2\u0562\u0560\3\2\2\2\u0562\u0563\3\2\2\2\u0563_\3\2\2\2\u0564"+
		"\u0567\5L\'\2\u0565\u0566\7/\2\2\u0566\u0568\5\u00c6d\2\u0567\u0565\3"+
		"\2\2\2\u0567\u0568\3\2\2\2\u0568\u056a\3\2\2\2\u0569\u056b\t\6\2\2\u056a"+
		"\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056ba\3\2\2\2\u056c\u0570\5\u0090"+
		"I\2\u056d\u0570\5\u009eP\2\u056e\u0570\7\u00b1\2\2\u056f\u056c\3\2\2\2"+
		"\u056f\u056d\3\2\2\2\u056f\u056e\3\2\2\2\u0570c\3\2\2\2\u0571\u0581\7"+
		"\t\2\2\u0572\u0573\5\u00be`\2\u0573\u0574\7\4\2\2\u0574\u0575\7\t\2\2"+
		"\u0575\u0581\3\2\2\2\u0576\u0581\5P)\2\u0577\u0581\5\u00a0Q\2\u0578\u0581"+
		"\5\u00a4S\2\u0579\u057e\5J&\2\u057a\u057c\7#\2\2\u057b\u057a\3\2\2\2\u057b"+
		"\u057c\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057f\5\u009aN\2\u057e\u057b"+
		"\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0581\3\2\2\2\u0580\u0571\3\2\2\2\u0580"+
		"\u0572\3\2\2\2\u0580\u0576\3\2\2\2\u0580\u0577\3\2\2\2\u0580\u0578\3\2"+
		"\2\2\u0580\u0579\3\2\2\2\u0581e\3\2\2\2\u0582\u0583\7\24\2\2\u0583\u0585"+
		"\7Y\2\2\u0584\u0586\5h\65\2\u0585\u0584\3\2\2\2\u0585\u0586\3\2\2\2\u0586"+
		"\u0587\3\2\2\2\u0587\u058c\7\26\2\2\u0588\u0589\7\24\2\2\u0589\u058a\7"+
		"v\2\2\u058a\u058c\7\26\2\2\u058b\u0582\3\2\2\2\u058b\u0588\3\2\2\2\u058c"+
		"g\3\2\2\2\u058d\u058f\5l\67\2\u058e\u058d\3\2\2\2\u058e\u058f\3\2\2\2"+
		"\u058f\u0591\3\2\2\2\u0590\u0592\5n8\2\u0591\u0590\3\2\2\2\u0591\u0592"+
		"\3\2\2\2\u0592\u0594\3\2\2\2\u0593\u0595\5t;\2\u0594\u0593\3\2\2\2\u0594"+
		"\u0595\3\2\2\2\u0595\u0597\3\2\2\2\u0596\u0598\5j\66\2\u0597\u0596\3\2"+
		"\2\2\u0597\u0598\3\2\2\2\u0598i\3\2\2\2\u0599\u059a\7i\2\2\u059ak\3\2"+
		"\2\2\u059b\u059c\7g\2\2\u059c\u059d\7\b\2\2\u059d\u059e\t\20\2\2\u059e"+
		"m\3\2\2\2\u059f\u05a1\7;\2\2\u05a0\u05a2\5r:\2\u05a1\u05a0\3\2\2\2\u05a1"+
		"\u05a2\3\2\2\2\u05a2\u05a6\3\2\2\2\u05a3\u05a4\7\u009d\2\2\u05a4\u05a5"+
		"\7*\2\2\u05a5\u05a7\5p9\2\u05a6\u05a3\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7"+
		"o\3\2\2\2\u05a8\u05b5\3\2\2\2\u05a9\u05aa\5\u00ba^\2\u05aa\u05ab\7\4\2"+
		"\2\u05ab\u05ad\3\2\2\2\u05ac\u05a9\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05ae"+
		"\3\2\2\2\u05ae\u05af\5\u00be`\2\u05af\u05b0\7\4\2\2\u05b0\u05b2\3\2\2"+
		"\2\u05b1\u05ac\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b5"+
		"\5\u00c4c\2\u05b4\u05a8\3\2\2\2\u05b4\u05b1\3\2\2\2\u05b5q\3\2\2\2\u05b6"+
		"\u05b7\7f\2\2\u05b7s\3\2\2\2\u05b8\u05bb\7{\2\2\u05b9\u05ba\7\b\2\2\u05ba"+
		"\u05bc\t\20\2\2\u05bb\u05b9\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bcu\3\2\2\2"+
		"\u05bd\u05be\5\u00ba^\2\u05be\u05bf\7\4\2\2\u05bf\u05c1\3\2\2\2\u05c0"+
		"\u05bd\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c7\5\u00be"+
		"`\2\u05c3\u05c5\7#\2\2\u05c4\u05c3\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6"+
		"\3\2\2\2\u05c6\u05c8\5\u00d6l\2\u05c7\u05c4\3\2\2\2\u05c7\u05c8\3\2\2"+
		"\2\u05c8\u05ce\3\2\2\2\u05c9\u05ca\7^\2\2\u05ca\u05cb\7*\2\2\u05cb\u05cf"+
		"\5\u00caf\2\u05cc\u05cd\7u\2\2\u05cd\u05cf\7^\2\2\u05ce\u05c9\3\2\2\2"+
		"\u05ce\u05cc\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cfw\3\2\2\2\u05d0\u05f1\5"+
		"v<\2\u05d1\u05db\7\5\2\2\u05d2\u05d7\5x=\2\u05d3\u05d4\7\7\2\2\u05d4\u05d6"+
		"\5x=\2\u05d5\u05d3\3\2\2\2\u05d6\u05d9\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7"+
		"\u05d8\3\2\2\2\u05d8\u05dc\3\2\2\2\u05d9\u05d7\3\2\2\2\u05da\u05dc\5z"+
		">\2\u05db\u05d2\3\2\2\2\u05db\u05da\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd"+
		"\u05e2\7\6\2\2\u05de\u05e0\7#\2\2\u05df\u05de\3\2\2\2\u05df\u05e0\3\2"+
		"\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e3\5\u00d6l\2\u05e2\u05df\3\2\2\2\u05e2"+
		"\u05e3\3\2\2\2\u05e3\u05f1\3\2\2\2\u05e4\u05e7\7\5\2\2\u05e5\u05e8\5\u0088"+
		"E\2\u05e6\u05e8\5\u0080A\2\u05e7\u05e5\3\2\2\2\u05e7\u05e6\3\2\2\2\u05e8"+
		"\u05e9\3\2\2\2\u05e9\u05ee\7\6\2\2\u05ea\u05ec\7#\2\2\u05eb\u05ea\3\2"+
		"\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ef\5\u00d6l\2\u05ee"+
		"\u05eb\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f1\3\2\2\2\u05f0\u05d0\3\2"+
		"\2\2\u05f0\u05d1\3\2\2\2\u05f0\u05e4\3\2\2\2\u05f1y\3\2\2\2\u05f2\u05f9"+
		"\5x=\2\u05f3\u05f4\5|?\2\u05f4\u05f5\5x=\2\u05f5\u05f6\5~@\2\u05f6\u05f8"+
		"\3\2\2\2\u05f7\u05f3\3\2\2\2\u05f8\u05fb\3\2\2\2\u05f9\u05f7\3\2\2\2\u05f9"+
		"\u05fa\3\2\2\2\u05fa{\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fc\u060a\7\7\2\2"+
		"\u05fd\u05ff\7s\2\2\u05fe\u05fd\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0606"+
		"\3\2\2\2\u0600\u0602\7l\2\2\u0601\u0603\7\177\2\2\u0602\u0601\3\2\2\2"+
		"\u0602\u0603\3\2\2\2\u0603\u0607\3\2\2\2\u0604\u0607\7`\2\2\u0605\u0607"+
		"\7\66\2\2\u0606\u0600\3\2\2\2\u0606\u0604\3\2\2\2\u0606\u0605\3\2\2\2"+
		"\u0606\u0607\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u060a\7j\2\2\u0609\u05fc"+
		"\3\2\2\2\u0609\u05fe\3\2\2\2\u060a}\3\2\2\2\u060b\u060c\7|\2\2\u060c\u061a"+
		"\5L\'\2\u060d\u060e\7\u00a4\2\2\u060e\u060f\7\5\2\2\u060f\u0614\5\u00c4"+
		"c\2\u0610\u0611\7\7\2\2\u0611\u0613\5\u00c4c\2\u0612\u0610\3\2\2\2\u0613"+
		"\u0616\3\2\2\2\u0614\u0612\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0617\3\2"+
		"\2\2\u0616\u0614\3\2\2\2\u0617\u0618\7\6\2\2\u0618\u061a\3\2\2\2\u0619"+
		"\u060b\3\2\2\2\u0619\u060d\3\2\2\2\u0619\u061a\3\2\2\2\u061a\177\3\2\2"+
		"\2\u061b\u061c\5\u008aF\2\u061c\u061d\5\u0082B\2\u061d\u0623\5\u008aF"+
		"\2\u061e\u061f\5\u0082B\2\u061f\u0620\5\u008aF\2\u0620\u0622\3\2\2\2\u0621"+
		"\u061e\3\2\2\2\u0622\u0625\3\2\2\2\u0623\u0621\3\2\2\2\u0623\u0624\3\2"+
		"\2\2\u0624\u0630\3\2\2\2\u0625\u0623\3\2\2\2\u0626\u0627\7~\2\2\u0627"+
		"\u0628\7*\2\2\u0628\u062d\5`\61\2\u0629\u062a\7\7\2\2\u062a\u062c\5`\61"+
		"\2\u062b\u0629\3\2\2\2\u062c\u062f\3\2\2\2\u062d\u062b\3\2\2\2\u062d\u062e"+
		"\3\2\2\2\u062e\u0631\3\2\2\2\u062f\u062d\3\2\2\2\u0630\u0626\3\2\2\2\u0630"+
		"\u0631\3\2\2\2\u0631\u0638\3\2\2\2\u0632\u0633\7n\2\2\u0633\u0636\5L\'"+
		"\2\u0634\u0635\t\5\2\2\u0635\u0637\5L\'\2\u0636\u0634\3\2\2\2\u0636\u0637"+
		"\3\2\2\2\u0637\u0639\3\2\2\2\u0638\u0632\3\2\2\2\u0638\u0639\3\2\2\2\u0639"+
		"\u0081\3\2\2\2\u063a\u0641\7\u00a1\2\2\u063b\u063c\7\u00a1\2\2\u063c\u0641"+
		"\7\37\2\2\u063d\u0641\7c\2\2\u063e\u0641\7p\2\2\u063f\u0641\7I\2\2\u0640"+
		"\u063a\3\2\2\2\u0640\u063b\3\2\2\2\u0640\u063d\3\2\2\2\u0640\u063e\3\2"+
		"\2\2\u0640\u063f\3\2\2\2\u0641\u0083\3\2\2\2\u0642\u0644\7\u00ab\2\2\u0643"+
		"\u0645\7\u0085\2\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0646"+
		"\3\2\2\2\u0646\u0647\5\u00bc_\2\u0647\u0648\7#\2\2\u0648\u064b\7\5\2\2"+
		"\u0649\u064c\5\u0088E\2\u064a\u064c\5\u0080A\2\u064b\u0649\3\2\2\2\u064b"+
		"\u064a\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u065a\7\6\2\2\u064e\u064f\7\7"+
		"\2\2\u064f\u0650\5\u00bc_\2\u0650\u0651\7#\2\2\u0651\u0654\7\5\2\2\u0652"+
		"\u0655\5\u0088E\2\u0653\u0655\5\u0080A\2\u0654\u0652\3\2\2\2\u0654\u0653"+
		"\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u0657\7\6\2\2\u0657\u0659\3\2\2\2\u0658"+
		"\u064e\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u0658\3\2\2\2\u065a\u065b\3\2"+
		"\2\2\u065b\u065d\3\2\2\2\u065c\u065a\3\2\2\2\u065d\u065e\5\u0086D\2\u065e"+
		"\u0085\3\2\2\2\u065f\u0662\5\u0088E\2\u0660\u0662\5\u0080A\2\u0661\u065f"+
		"\3\2\2\2\u0661\u0660\3\2\2\2\u0662\u0087\3\2\2\2\u0663\u066e\5\u008aF"+
		"\2\u0664\u0665\7~\2\2\u0665\u0666\7*\2\2\u0666\u066b\5`\61\2\u0667\u0668"+
		"\7\7\2\2\u0668\u066a\5`\61\2\u0669\u0667\3\2\2\2\u066a\u066d\3\2\2\2\u066b"+
		"\u0669\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066f\3\2\2\2\u066d\u066b\3\2"+
		"\2\2\u066e\u0664\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0676\3\2\2\2\u0670"+
		"\u0671\7n\2\2\u0671\u0674\5L\'\2\u0672\u0673\t\5\2\2\u0673\u0675\5L\'"+
		"\2\u0674\u0672\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0677\3\2\2\2\u0676\u0670"+
		"\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0089\3\2\2\2\u0678\u067a\7\u0092\2"+
		"\2\u0679\u067b\t\21\2\2\u067a\u0679\3\2\2\2\u067a\u067b\3\2\2\2\u067b"+
		"\u067c\3\2\2\2\u067c\u0681\5d\63\2\u067d\u067e\7\7\2\2\u067e\u0680\5d"+
		"\63\2\u067f\u067d\3\2\2\2\u0680\u0683\3\2\2\2\u0681\u067f\3\2\2\2\u0681"+
		"\u0682\3\2\2\2\u0682\u0685\3\2\2\2\u0683\u0681\3\2\2\2\u0684\u0686\5\u008c"+
		"G\2\u0685\u0684\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0689\3\2\2\2\u0687"+
		"\u0688\7\u00aa\2\2\u0688\u068a\5L\'\2\u0689\u0687\3\2\2\2\u0689\u068a"+
		"\3\2\2\2\u068a\u069f\3\2\2\2\u068b\u068c\7U\2\2\u068c\u068f\7*\2\2\u068d"+
		"\u0690\5N(\2\u068e\u0690\5\u00a6T\2\u068f\u068d\3\2\2\2\u068f\u068e\3"+
		"\2\2\2\u0690\u0698\3\2\2\2\u0691\u0694\7\7\2\2\u0692\u0695\5N(\2\u0693"+
		"\u0695\5\u00a6T\2\u0694\u0692\3\2\2\2\u0694\u0693\3\2\2\2\u0695\u0697"+
		"\3\2\2\2\u0696\u0691\3\2\2\2\u0697\u069a\3\2\2\2\u0698\u0696\3\2\2\2\u0698"+
		"\u0699\3\2\2\2\u0699\u069d\3\2\2\2\u069a\u0698\3\2\2\2\u069b\u069c\7V"+
		"\2\2\u069c\u069e\5L\'\2\u069d\u069b\3\2\2\2\u069d\u069e\3\2\2\2\u069e"+
		"\u06a0\3\2\2\2\u069f\u068b\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06be\3\2"+
		"\2\2\u06a1\u06a2\7\u00a6\2\2\u06a2\u06a3\7\5\2\2\u06a3\u06a8\5L\'\2\u06a4"+
		"\u06a5\7\7\2\2\u06a5\u06a7\5L\'\2\u06a6\u06a4\3\2\2\2\u06a7\u06aa\3\2"+
		"\2\2\u06a8\u06a6\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab\3\2\2\2\u06aa"+
		"\u06a8\3\2\2\2\u06ab\u06ba\7\6\2\2\u06ac\u06ad\7\7\2\2\u06ad\u06ae\7\5"+
		"\2\2\u06ae\u06b3\5L\'\2\u06af\u06b0\7\7\2\2\u06b0\u06b2\5L\'\2\u06b1\u06af"+
		"\3\2\2\2\u06b2\u06b5\3\2\2\2\u06b3\u06b1\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4"+
		"\u06b6\3\2\2\2\u06b5\u06b3\3\2\2\2\u06b6\u06b7\7\6\2\2\u06b7\u06b9\3\2"+
		"\2\2\u06b8\u06ac\3\2\2\2\u06b9\u06bc\3\2\2\2\u06ba\u06b8\3\2\2\2\u06ba"+
		"\u06bb\3\2\2\2\u06bb\u06be\3\2\2\2\u06bc\u06ba\3\2\2\2\u06bd\u0678\3\2"+
		"\2\2\u06bd\u06a1\3\2\2\2\u06be\u008b\3\2\2\2\u06bf\u06c9\7R\2\2\u06c0"+
		"\u06c5\5x=\2\u06c1\u06c2\7\7\2\2\u06c2\u06c4\5x=\2\u06c3\u06c1\3\2\2\2"+
		"\u06c4\u06c7\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06ca"+
		"\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c8\u06ca\5z>\2\u06c9\u06c0\3\2\2\2\u06c9"+
		"\u06c8\3\2\2\2\u06ca\u008d\3\2\2\2\u06cb\u06d7\5\u00be`\2\u06cc\u06cd"+
		"\7\5\2\2\u06cd\u06d2\5\u00c4c\2\u06ce\u06cf\7\7\2\2\u06cf\u06d1\5\u00c4"+
		"c\2\u06d0\u06ce\3\2\2\2\u06d1\u06d4\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d2"+
		"\u06d3\3\2\2\2\u06d3\u06d5\3\2\2\2\u06d4\u06d2\3\2\2\2\u06d5\u06d6\7\6"+
		"\2\2\u06d6\u06d8\3\2\2\2\u06d7\u06cc\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8"+
		"\u008f\3\2\2\2\u06d9\u06db\t\t\2\2\u06da\u06d9\3\2\2\2\u06da\u06db\3\2"+
		"\2\2\u06db\u06dc\3\2\2\2\u06dc\u06dd\7\u00af\2\2\u06dd\u0091\3\2\2\2\u06de"+
		"\u06df\t\22\2\2\u06df\u0093\3\2\2\2\u06e0\u06e1\t\23\2\2\u06e1\u0095\3"+
		"\2\2\2\u06e2\u06e3\7\u00b1\2\2\u06e3\u0097\3\2\2\2\u06e4\u06e7\5L\'\2"+
		"\u06e5\u06e7\5B\"\2\u06e6\u06e4\3\2\2\2\u06e6\u06e5\3\2\2\2\u06e7\u0099"+
		"\3\2\2\2\u06e8\u06e9\t\24\2\2\u06e9\u009b\3\2\2\2\u06ea\u06eb\t\25\2\2"+
		"\u06eb\u009d\3\2\2\2\u06ec\u06ed\5\u00dan\2\u06ed\u009f\3\2\2\2\u06ee"+
		"\u06ef\7\64\2\2\u06ef\u06f9\7\5\2\2\u06f0\u06f2\5\u00b6\\\2\u06f1\u06f0"+
		"\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06fa\5P)\2\u06f4"+
		"\u06fa\7\t\2\2\u06f5\u06f7\7C\2\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7\3\2"+
		"\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06fa\5\u00a6T\2\u06f9\u06f1\3\2\2\2\u06f9"+
		"\u06f4\3\2\2\2\u06f9\u06f6\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06fb\3\2"+
		"\2\2\u06fb\u06fd\7\6\2\2\u06fc\u06fe\5f\64\2\u06fd\u06fc\3\2\2\2\u06fd"+
		"\u06fe\3\2\2\2\u06fe\u0703\3\2\2\2\u06ff\u0701\7#\2\2\u0700\u06ff\3\2"+
		"\2\2\u0700\u0701\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0704\5\u009aN\2\u0703"+
		"\u0700\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u00a1\3\2\2\2\u0705\u0706\7\64"+
		"\2\2\u0706\u0710\7\5\2\2\u0707\u0709\5\u00b6\\\2\u0708\u0707\3\2\2\2\u0708"+
		"\u0709\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u0711\5N(\2\u070b\u0711\7\t\2"+
		"\2\u070c\u070e\7C\2\2\u070d\u070c\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u070f"+
		"\3\2\2\2\u070f\u0711\5\u00a6T\2\u0710\u0708\3\2\2\2\u0710\u070b\3\2\2"+
		"\2\u0710\u070d\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0714"+
		"\7\6\2\2\u0713\u0715\5f\64\2\u0714\u0713\3\2\2\2\u0714\u0715\3\2\2\2\u0715"+
		"\u071a\3\2\2\2\u0716\u0718\7#\2\2\u0717\u0716\3\2\2\2\u0717\u0718\3\2"+
		"\2\2\u0718\u0719\3\2\2\2\u0719\u071b\5\u009aN\2\u071a\u0717\3\2\2\2\u071a"+
		"\u071b\3\2\2\2\u071b\u00a3\3\2\2\2\u071c\u071d\5\u00b8]\2\u071d\u0734"+
		"\7\5\2\2\u071e\u0720\7C\2\2\u071f\u071e\3\2\2\2\u071f\u0720\3\2\2\2\u0720"+
		"\u0725\3\2\2\2\u0721\u0726\5P)\2\u0722\u0726\5\u00a6T\2\u0723\u0726\5"+
		"\u00a8U\2\u0724\u0726\5\u0092J\2\u0725\u0721\3\2\2\2\u0725\u0722\3\2\2"+
		"\2\u0725\u0723\3\2\2\2\u0725\u0724\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u0731"+
		"\3\2\2\2\u0727\u072d\7\7\2\2\u0728\u072e\5P)\2\u0729\u072e\5\u00a6T\2"+
		"\u072a\u072e\5\u00a8U\2\u072b\u072e\5\u0092J\2\u072c\u072e\7\t\2\2\u072d"+
		"\u0728\3\2\2\2\u072d\u0729\3\2\2\2\u072d\u072a\3\2\2\2\u072d\u072b\3\2"+
		"\2\2\u072d\u072c\3\2\2\2\u072e\u0730\3\2\2\2\u072f\u0727\3\2\2\2\u0730"+
		"\u0733\3\2\2\2\u0731\u072f\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0735\3\2"+
		"\2\2\u0733\u0731\3\2\2\2\u0734\u071f\3\2\2\2\u0734\u0735\3\2\2\2\u0735"+
		"\u0736\3\2\2\2\u0736\u0738\7\6\2\2\u0737\u0739\5f\64\2\u0738\u0737\3\2"+
		"\2\2\u0738\u0739\3\2\2\2\u0739\u073e\3\2\2\2\u073a\u073c\7#\2\2\u073b"+
		"\u073a\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073f\5\u009a"+
		"N\2\u073e\u073b\3\2\2\2\u073e\u073f\3\2\2\2\u073f\u00a5\3\2\2\2\u0740"+
		"\u0741\5\u00b8]\2\u0741\u0758\7\5\2\2\u0742\u0744\7C\2\2\u0743\u0742\3"+
		"\2\2\2\u0743\u0744\3\2\2\2\u0744\u0749\3\2\2\2\u0745\u074a\5N(\2\u0746"+
		"\u074a\5\u00a6T\2\u0747\u074a\5\u00a8U\2\u0748\u074a\5\u0092J\2\u0749"+
		"\u0745\3\2\2\2\u0749\u0746\3\2\2\2\u0749\u0747\3\2\2\2\u0749\u0748\3\2"+
		"\2\2\u0749\u074a\3\2\2\2\u074a\u0755\3\2\2\2\u074b\u0751\7\7\2\2\u074c"+
		"\u0752\5N(\2\u074d\u0752\5\u00a6T\2\u074e\u0752\5\u00a8U\2\u074f\u0752"+
		"\5\u0092J\2\u0750\u0752\7\t\2\2\u0751\u074c\3\2\2\2\u0751\u074d\3\2\2"+
		"\2\u0751\u074e\3\2\2\2\u0751\u074f\3\2\2\2\u0751\u0750\3\2\2\2\u0752\u0754"+
		"\3\2\2\2\u0753\u074b\3\2\2\2\u0754\u0757\3\2\2\2\u0755\u0753\3\2\2\2\u0755"+
		"\u0756\3\2\2\2\u0756\u0759\3\2\2\2\u0757\u0755\3\2\2\2\u0758\u0743\3\2"+
		"\2\2\u0758\u0759\3\2\2\2\u0759\u075a\3\2\2\2\u075a\u075c\7\6\2\2\u075b"+
		"\u075d\5f\64\2\u075c\u075b\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u0762\3\2"+
		"\2\2\u075e\u0760\7#\2\2\u075f\u075e\3\2\2\2\u075f\u0760\3\2\2\2\u0760"+
		"\u0761\3\2\2\2\u0761\u0763\5\u009aN\2\u0762\u075f\3\2\2\2\u0762\u0763"+
		"\3\2\2\2\u0763\u00a7\3\2\2\2\u0764\u0765\bU\1\2\u0765\u076d\7\u00af\2"+
		"\2\u0766\u076d\5N(\2\u0767\u076d\5\u00a6T\2\u0768\u0769\7\5\2\2\u0769"+
		"\u076a\5\u00a8U\2\u076a\u076b\7\6\2\2\u076b\u076d\3\2\2\2\u076c\u0764"+
		"\3\2\2\2\u076c\u0766\3\2\2\2\u076c\u0767\3\2\2\2\u076c\u0768\3\2\2\2\u076d"+
		"\u0776\3\2\2\2\u076e\u076f\f\5\2\2\u076f\u0770\t\b\2\2\u0770\u0775\5\u00a8"+
		"U\6\u0771\u0772\f\4\2\2\u0772\u0773\t\t\2\2\u0773\u0775\5\u00a8U\5\u0774"+
		"\u076e\3\2\2\2\u0774\u0771\3\2\2\2\u0775\u0778\3\2\2\2\u0776\u0774\3\2"+
		"\2\2\u0776\u0777\3\2\2\2\u0777\u00a9\3\2\2\2\u0778\u0776\3\2\2\2\u0779"+
		"\u077a\7\"\2\2\u077a\u00ab\3\2\2\2\u077b\u077c\7}\2\2\u077c\u00ad\3\2"+
		"\2\2\u077d\u077e\t\26\2\2\u077e\u00af\3\2\2\2\u077f\u0780\7u\2\2\u0780"+
		"\u00b1\3\2\2\2\u0781\u0782\7\\\2\2\u0782\u00b3\3\2\2\2\u0783\u0784\7m"+
		"\2\2\u0784\u00b5\3\2\2\2\u0785\u0786\7C\2\2\u0786\u00b7\3\2\2\2\u0787"+
		"\u0788\5\u00dan\2\u0788\u00b9\3\2\2\2\u0789\u078a\5\u00dan\2\u078a\u00bb"+
		"\3\2\2\2\u078b\u078c\5\u00dan\2\u078c\u00bd\3\2\2\2\u078d\u078e\5\u00da"+
		"n\2\u078e\u00bf\3\2\2\2\u078f\u0790\5\u00dan\2\u0790\u00c1\3\2\2\2\u0791"+
		"\u0792\5\u00dan\2\u0792\u00c3\3\2\2\2\u0793\u0794\5\u00dan\2\u0794\u00c5"+
		"\3\2\2\2\u0795\u0796\5\u00dan\2\u0796\u00c7\3\2\2\2\u0797\u0798\5\u00da"+
		"n\2\u0798\u00c9\3\2\2\2\u0799\u079a\5\u00dan\2\u079a\u00cb\3\2\2\2\u079b"+
		"\u079c\5\u00dan\2\u079c\u00cd\3\2\2\2\u079d\u079e\5\u00dan\2\u079e\u00cf"+
		"\3\2\2\2\u079f\u07a0\5\u00dan\2\u07a0\u00d1\3\2\2\2\u07a1\u07a2\5\u00da"+
		"n\2\u07a2\u00d3\3\2\2\2\u07a3\u07a4\5\u00dan\2\u07a4\u00d5\3\2\2\2\u07a5"+
		"\u07a6\5\u00dan\2\u07a6\u00d7\3\2\2\2\u07a7\u07a8\5\u00dan\2\u07a8\u00d9"+
		"\3\2\2\2\u07a9\u07b1\7\u00ae\2\2\u07aa\u07b1\5\u009cO\2\u07ab\u07b1\7"+
		"\u00b1\2\2\u07ac\u07ad\7\5\2\2\u07ad\u07ae\5\u00dan\2\u07ae\u07af\7\6"+
		"\2\2\u07af\u07b1\3\2\2\2\u07b0\u07a9\3\2\2\2\u07b0\u07aa\3\2\2\2\u07b0"+
		"\u07ab\3\2\2\2\u07b0\u07ac\3\2\2\2\u07b1\u00db\3\2\2\2\u07b2\u07b4\13"+
		"\2\2\2\u07b3\u07b2\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b3\3\2\2\2\u07b5"+
		"\u07b6\3\2\2\2\u07b6\u00dd\3\2\2\2\u0115\u00e0\u00e2\u00ee\u00f4\u00fa"+
		"\u00fc\u011b\u0126\u012e\u0131\u013a\u013e\u0146\u014a\u014c\u0151\u0153"+
		"\u0157\u015d\u0162\u016d\u0173\u0177\u017d\u0182\u018b\u0192\u0198\u019c"+
		"\u01a0\u01a6\u01ab\u01b2\u01bd\u01c0\u01c2\u01c8\u01ce\u01d2\u01d9\u01df"+
		"\u01e5\u01eb\u01f0\u01fc\u0201\u020c\u0211\u0214\u021a\u021d\u0223\u022c"+
		"\u022f\u0235\u0237\u023e\u0246\u024b\u0253\u0258\u0260\u0265\u026d\u0272"+
		"\u0277\u028a\u0290\u0299\u029e\u02a7\u02b2\u02b9\u02bf\u02c5\u02ce\u02d5"+
		"\u02d9\u02db\u02df\u02e6\u02e8\u02ec\u02ef\u02f5\u0302\u0310\u0315\u0318"+
		"\u0325\u0333\u0338\u0341\u0344\u034a\u034c\u0352\u0357\u035d\u0369\u036d"+
		"\u0372\u0376\u0379\u038b\u0390\u0395\u03ad\u03b6\u03ba\u03bf\u03db\u03e0"+
		"\u03ec\u03f2\u03f9\u03fb\u03fd\u0415\u0418\u041d\u0423\u042c\u0430\u043b"+
		"\u0457\u045c\u0468\u046e\u0475\u0479\u0484\u0487\u048d\u0490\u0492\u0494"+
		"\u049b\u04a0\u04a4\u04a7\u04a9\u04af\u04b4\u04b8\u04bb\u04be\u04c0\u04ce"+
		"\u04d8\u04dd\u04e9\u04ed\u04f1\u04f5\u04fc\u04fe\u0506\u050d\u0510\u0514"+
		"\u0519\u0521\u0534\u053a\u053e\u0545\u054e\u0554\u055a\u0562\u0567\u056a"+
		"\u056f\u057b\u057e\u0580\u0585\u058b\u058e\u0591\u0594\u0597\u05a1\u05a6"+
		"\u05ac\u05b1\u05b4\u05bb\u05c0\u05c4\u05c7\u05ce\u05d7\u05db\u05df\u05e2"+
		"\u05e7\u05eb\u05ee\u05f0\u05f9\u05fe\u0602\u0606\u0609\u0614\u0619\u0623"+
		"\u062d\u0630\u0636\u0638\u0640\u0644\u064b\u0654\u065a\u0661\u066b\u066e"+
		"\u0674\u0676\u067a\u0681\u0685\u0689\u068f\u0694\u0698\u069d\u069f\u06a8"+
		"\u06b3\u06ba\u06bd\u06c5\u06c9\u06d2\u06d7\u06da\u06e6\u06f1\u06f6\u06f9"+
		"\u06fd\u0700\u0703\u0708\u070d\u0710\u0714\u0717\u071a\u071f\u0725\u072d"+
		"\u0731\u0734\u0738\u073b\u073e\u0743\u0749\u0751\u0755\u0758\u075c\u075f"+
		"\u0762\u076c\u0774\u0776\u07b0\u07b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}