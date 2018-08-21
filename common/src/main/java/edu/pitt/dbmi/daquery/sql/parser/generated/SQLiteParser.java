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
		K_ISBIRTHDATE=97, K_ISID=98, K_ISNULL=99, K_ISZIPCODE=100, K_JOIN=101, 
		K_KEY=102, K_LEFT=103, K_LIKE=104, K_LIMIT=105, K_MATCH=106, K_MINUS=107, 
		K_NATURAL=108, K_NO=109, K_NOT=110, K_NOTIDENTIFIABLE=111, K_NOTNULL=112, 
		K_NULL=113, K_OF=114, K_OFFSET=115, K_OBFUSCATE=116, K_ON=117, K_OR=118, 
		K_ORDER=119, K_OUTER=120, K_PLAN=121, K_PRAGMA=122, K_PRIMARY=123, K_QUERY=124, 
		K_RAISE=125, K_RECURSIVE=126, K_REFERENCES=127, K_REGEXP=128, K_REINDEX=129, 
		K_RELEASE=130, K_RENAME=131, K_REPLACE=132, K_RESTRICT=133, K_RIGHT=134, 
		K_ROLLBACK=135, K_ROW=136, K_SAVEPOINT=137, K_SELECT=138, K_SET=139, K_TABLE=140, 
		K_TEMP=141, K_TEMPORARY=142, K_THEN=143, K_TO=144, K_TRACKED=145, K_TRANSACTION=146, 
		K_TRIGGER=147, K_TRUE=148, K_UNION=149, K_UNIQUE=150, K_UPDATE=151, K_USING=152, 
		K_VACUUM=153, K_VALUES=154, K_VIEW=155, K_VIRTUAL=156, K_WHEN=157, K_WHERE=158, 
		K_WITH=159, K_WITHOUT=160, IDENTIFIER=161, NUMERIC_LITERAL=162, BIND_PARAMETER=163, 
		STRING_LITERAL=164, BLOB_LITERAL=165, SINGLE_LINE_COMMENT=166, MULTILINE_COMMENT=167, 
		SPACES=168, UNEXPECTED_CHAR=169, K_OFFUSCATE=170;
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
		RULE_comparison_operator = 42, RULE_foreign_key_clause = 43, RULE_raise_function = 44, 
		RULE_indexed_column = 45, RULE_table_constraint = 46, RULE_with_clause = 47, 
		RULE_qualified_table_name = 48, RULE_ordering_term = 49, RULE_pragma_value = 50, 
		RULE_common_table_expression = 51, RULE_result_column = 52, RULE_deid_tag = 53, 
		RULE_ident_prop = 54, RULE_is_zip_prop = 55, RULE_id_field_prop = 56, 
		RULE_date_shift_field_prop = 57, RULE_tracking_column_expr = 58, RULE_is_birthdate_prop = 59, 
		RULE_obfuscate_field_prop = 60, RULE_from_table_spec = 61, RULE_table_or_subquery = 62, 
		RULE_join_clause = 63, RULE_join_operator = 64, RULE_join_constraint = 65, 
		RULE_select_core = 66, RULE_multi_from_clause = 67, RULE_set_operator = 68, 
		RULE_cte_table_name = 69, RULE_signed_number = 70, RULE_literal_value = 71, 
		RULE_unary_operator = 72, RULE_error_message = 73, RULE_module_argument = 74, 
		RULE_column_alias = 75, RULE_keyword = 76, RULE_name = 77, RULE_count_function = 78, 
		RULE_any_function = 79, RULE_and_keyword = 80, RULE_or_keyword = 81, RULE_and_or = 82, 
		RULE_not_keyword = 83, RULE_in_keyword = 84, RULE_like_keyword = 85, RULE_distinct_keyword = 86, 
		RULE_function_name = 87, RULE_database_name = 88, RULE_table_name = 89, 
		RULE_table_or_index_name = 90, RULE_new_table_name = 91, RULE_column_name = 92, 
		RULE_collation_name = 93, RULE_foreign_table = 94, RULE_index_name = 95, 
		RULE_trigger_name = 96, RULE_view_name = 97, RULE_module_name = 98, RULE_pragma_name = 99, 
		RULE_savepoint_name = 100, RULE_table_alias = 101, RULE_transaction_name = 102, 
		RULE_any_name = 103, RULE_anything_at_all = 104;
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
		"comparison_operator", "foreign_key_clause", "raise_function", "indexed_column", 
		"table_constraint", "with_clause", "qualified_table_name", "ordering_term", 
		"pragma_value", "common_table_expression", "result_column", "deid_tag", 
		"ident_prop", "is_zip_prop", "id_field_prop", "date_shift_field_prop", 
		"tracking_column_expr", "is_birthdate_prop", "obfuscate_field_prop", "from_table_spec", 
		"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
		"select_core", "multi_from_clause", "set_operator", "cte_table_name", 
		"signed_number", "literal_value", "unary_operator", "error_message", "module_argument", 
		"column_alias", "keyword", "name", "count_function", "any_function", "and_keyword", 
		"or_keyword", "and_or", "not_keyword", "in_keyword", "like_keyword", "distinct_keyword", 
		"function_name", "database_name", "table_name", "table_or_index_name", 
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
		"K_DATABASE", "K_DATESHIFT", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", 
		"K_DELETE", "K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", 
		"K_END", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", 
		"K_FALSE", "K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", 
		"K_GROUP", "K_HAVING", "K_IF", "K_IDENTIFIABLE", "K_IGNORE", "K_IMMEDIATE", 
		"K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", "K_INSERT", 
		"K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISBIRTHDATE", "K_ISID", 
		"K_ISNULL", "K_ISZIPCODE", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", 
		"K_MATCH", "K_MINUS", "K_NATURAL", "K_NO", "K_NOT", "K_NOTIDENTIFIABLE", 
		"K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_OBFUSCATE", "K_ON", "K_OR", 
		"K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", 
		"K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", 
		"K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", 
		"K_SELECT", "K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", 
		"K_TRACKED", "K_TRANSACTION", "K_TRIGGER", "K_TRUE", "K_UNION", "K_UNIQUE", 
		"K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", 
		"K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL", 
		"BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", 
		"MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR", "K_OFFUSCATE"
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
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (K_ALTER - 30)) | (1L << (K_ANALYZE - 30)) | (1L << (K_ATTACH - 30)) | (1L << (K_BEGIN - 30)) | (1L << (K_COMMIT - 30)) | (1L << (K_CREATE - 30)) | (1L << (K_DELETE - 30)) | (1L << (K_DETACH - 30)) | (1L << (K_DROP - 30)) | (1L << (K_END - 30)) | (1L << (K_EXPLAIN - 30)) | (1L << (K_INSERT - 30)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (K_PRAGMA - 122)) | (1L << (K_REINDEX - 122)) | (1L << (K_RELEASE - 122)) | (1L << (K_REPLACE - 122)) | (1L << (K_ROLLBACK - 122)) | (1L << (K_SAVEPOINT - 122)) | (1L << (K_SELECT - 122)) | (1L << (K_UPDATE - 122)) | (1L << (K_VACUUM - 122)) | (1L << (K_VALUES - 122)) | (1L << (K_WITH - 122)) | (1L << (UNEXPECTED_CHAR - 122)))) != 0)) {
				{
				setState(212);
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
					setState(210);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(211);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
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
			setState(219);
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
			setState(222);
			sql_stmt();
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(223);
					sql_stmt();
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(229);
					anything_at_all();
					}
					} 
				}
				setState(234);
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
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(235);
				match(K_EXPLAIN);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(236);
					match(K_QUERY);
					setState(237);
					match(K_PLAN);
					}
				}

				}
			}

			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(242);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(243);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(244);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(245);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(246);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(247);
				create_index_stmt();
				}
				break;
			case 7:
				{
				setState(248);
				create_table_stmt();
				}
				break;
			case 8:
				{
				setState(249);
				create_trigger_stmt();
				}
				break;
			case 9:
				{
				setState(250);
				create_view_stmt();
				}
				break;
			case 10:
				{
				setState(251);
				create_virtual_table_stmt();
				}
				break;
			case 11:
				{
				setState(252);
				delete_stmt();
				}
				break;
			case 12:
				{
				setState(253);
				delete_stmt_limited();
				}
				break;
			case 13:
				{
				setState(254);
				detach_stmt();
				}
				break;
			case 14:
				{
				setState(255);
				drop_index_stmt();
				}
				break;
			case 15:
				{
				setState(256);
				drop_table_stmt();
				}
				break;
			case 16:
				{
				setState(257);
				drop_trigger_stmt();
				}
				break;
			case 17:
				{
				setState(258);
				drop_view_stmt();
				}
				break;
			case 18:
				{
				setState(259);
				insert_stmt();
				}
				break;
			case 19:
				{
				setState(260);
				pragma_stmt();
				}
				break;
			case 20:
				{
				setState(261);
				reindex_stmt();
				}
				break;
			case 21:
				{
				setState(262);
				release_stmt();
				}
				break;
			case 22:
				{
				setState(263);
				rollback_stmt();
				}
				break;
			case 23:
				{
				setState(264);
				savepoint_stmt();
				}
				break;
			case 24:
				{
				setState(265);
				select_set();
				}
				break;
			case 25:
				{
				setState(266);
				select_stmt();
				}
				break;
			case 26:
				{
				setState(267);
				update_stmt();
				}
				break;
			case 27:
				{
				setState(268);
				update_stmt_limited();
				}
				break;
			case 28:
				{
				setState(269);
				vacuum_stmt();
				}
				break;
			case 29:
				{
				setState(270);
				with_select_stmt();
				}
				break;
			}
			setState(273);
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
			setState(275);
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
			setState(277);
			match(K_ALTER);
			setState(278);
			match(K_TABLE);
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(279);
				database_name();
				setState(280);
				match(DOT);
				}
				break;
			}
			setState(284);
			table_name();
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(285);
				match(K_RENAME);
				setState(286);
				match(K_TO);
				setState(287);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(288);
				match(K_ADD);
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(289);
					match(K_COLUMN);
					}
					break;
				}
				setState(292);
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
			setState(295);
			match(K_ANALYZE);
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(296);
				database_name();
				}
				break;
			case 2:
				{
				setState(297);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(298);
				database_name();
				setState(299);
				match(DOT);
				setState(300);
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
			setState(304);
			match(K_ATTACH);
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(305);
				match(K_DATABASE);
				}
				break;
			}
			setState(308);
			expr(0);
			setState(309);
			match(K_AS);
			setState(310);
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
			setState(312);
			match(K_BEGIN);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (K_DEFERRED - 60)) | (1L << (K_EXCLUSIVE - 60)) | (1L << (K_IMMEDIATE - 60)))) != 0)) {
				{
				setState(313);
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

			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(316);
				match(K_TRANSACTION);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISBIRTHDATE - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_ISZIPCODE - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTIDENTIFIABLE - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRACKED - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) {
					{
					setState(317);
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
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(323);
				match(K_TRANSACTION);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISBIRTHDATE - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_ISZIPCODE - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTIDENTIFIABLE - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRACKED - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) {
					{
					setState(324);
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
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(329);
				match(K_WITH);
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(330);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(333);
				common_table_expression();
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(334);
					match(COMMA);
					setState(335);
					common_table_expression();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(343);
			select_core();
			setState(347); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(344);
				set_operator();
				setState(345);
				select_core();
				}
				}
				setState(349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_EXCEPT - 70)) | (1L << (K_INTERSECT - 70)) | (1L << (K_MINUS - 70)))) != 0) || _la==K_UNION );
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(351);
				match(K_ORDER);
				setState(352);
				match(K_BY);
				setState(353);
				ordering_term();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(354);
					match(COMMA);
					setState(355);
					ordering_term();
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(363);
				match(K_LIMIT);
				setState(364);
				expr(0);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(365);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(366);
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
			setState(371);
			match(K_CREATE);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(372);
				match(K_UNIQUE);
				}
			}

			setState(375);
			match(K_INDEX);
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
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
			index_name();
			setState(387);
			match(K_ON);
			setState(388);
			table_name();
			setState(389);
			match(OPEN_PAR);
			setState(390);
			indexed_column();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(391);
				match(COMMA);
				setState(392);
				indexed_column();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			match(CLOSE_PAR);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(399);
				match(K_WHERE);
				setState(400);
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
			setState(403);
			match(K_CREATE);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(404);
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

			setState(407);
			match(K_TABLE);
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(408);
				match(K_IF);
				setState(409);
				match(K_NOT);
				setState(410);
				match(K_EXISTS);
				}
				break;
			}
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(413);
				database_name();
				setState(414);
				match(DOT);
				}
				break;
			}
			setState(418);
			table_name();
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(419);
				match(OPEN_PAR);
				setState(420);
				column_def();
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(421);
						match(COMMA);
						setState(422);
						column_def();
						}
						} 
					}
					setState(427);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(428);
					match(COMMA);
					setState(429);
					table_constraint();
					}
					}
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(435);
				match(CLOSE_PAR);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(436);
					match(K_WITHOUT);
					setState(437);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(440);
				match(K_AS);
				setState(441);
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
			setState(444);
			match(K_CREATE);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(445);
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

			setState(448);
			match(K_TRIGGER);
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(449);
				match(K_IF);
				setState(450);
				match(K_NOT);
				setState(451);
				match(K_EXISTS);
				}
				break;
			}
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(454);
				database_name();
				setState(455);
				match(DOT);
				}
				break;
			}
			setState(459);
			trigger_name();
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(460);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(461);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(462);
				match(K_INSTEAD);
				setState(463);
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
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(466);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(467);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(468);
				match(K_UPDATE);
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(469);
					match(K_OF);
					setState(470);
					column_name();
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(471);
						match(COMMA);
						setState(472);
						column_name();
						}
						}
						setState(477);
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
			setState(482);
			match(K_ON);
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(483);
				database_name();
				setState(484);
				match(DOT);
				}
				break;
			}
			setState(488);
			table_name();
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(489);
				match(K_FOR);
				setState(490);
				match(K_EACH);
				setState(491);
				match(K_ROW);
				}
			}

			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(494);
				match(K_WHEN);
				setState(495);
				expr(0);
				}
			}

			setState(498);
			match(K_BEGIN);
			setState(507); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(499);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(500);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(501);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(502);
					select_stmt();
					}
					break;
				}
				setState(505);
				match(SCOL);
				}
				}
				setState(509); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || _la==K_INSERT || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (K_REPLACE - 132)) | (1L << (K_SELECT - 132)) | (1L << (K_UPDATE - 132)) | (1L << (K_VALUES - 132)) | (1L << (K_WITH - 132)))) != 0) );
			setState(511);
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
			setState(513);
			match(K_CREATE);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(514);
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

			setState(517);
			match(K_VIEW);
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
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
			view_name();
			setState(529);
			match(K_AS);
			setState(530);
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
			setState(532);
			match(K_CREATE);
			setState(533);
			match(K_VIRTUAL);
			setState(534);
			match(K_TABLE);
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(535);
				match(K_IF);
				setState(536);
				match(K_NOT);
				setState(537);
				match(K_EXISTS);
				}
				break;
			}
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(540);
				database_name();
				setState(541);
				match(DOT);
				}
				break;
			}
			setState(545);
			table_name();
			setState(546);
			match(K_USING);
			setState(547);
			module_name();
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(548);
				match(OPEN_PAR);
				setState(549);
				module_argument();
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(550);
					match(COMMA);
					setState(551);
					module_argument();
					}
					}
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(557);
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
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(561);
				with_clause();
				}
			}

			setState(564);
			match(K_DELETE);
			setState(565);
			single_from_clause();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(566);
				match(K_WHERE);
				setState(567);
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
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(570);
				with_clause();
				}
			}

			setState(573);
			match(K_DELETE);
			setState(574);
			single_from_clause();
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(575);
				match(K_WHERE);
				setState(576);
				expr(0);
				}
			}

			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(579);
					match(K_ORDER);
					setState(580);
					match(K_BY);
					setState(581);
					ordering_term();
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(582);
						match(COMMA);
						setState(583);
						ordering_term();
						}
						}
						setState(588);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(591);
				match(K_LIMIT);
				setState(592);
				expr(0);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(593);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(594);
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
			setState(599);
			match(K_FROM);
			setState(600);
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
			setState(602);
			match(K_DETACH);
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(603);
				match(K_DATABASE);
				}
				break;
			}
			setState(606);
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
			setState(608);
			match(K_DROP);
			setState(609);
			match(K_INDEX);
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(610);
				match(K_IF);
				setState(611);
				match(K_EXISTS);
				}
				break;
			}
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(614);
				database_name();
				setState(615);
				match(DOT);
				}
				break;
			}
			setState(619);
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
			setState(621);
			match(K_DROP);
			setState(622);
			match(K_TABLE);
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(623);
				match(K_IF);
				setState(624);
				match(K_EXISTS);
				}
				break;
			}
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(627);
				database_name();
				setState(628);
				match(DOT);
				}
				break;
			}
			setState(632);
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
			setState(634);
			match(K_DROP);
			setState(635);
			match(K_TRIGGER);
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(636);
				match(K_IF);
				setState(637);
				match(K_EXISTS);
				}
				break;
			}
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(640);
				database_name();
				setState(641);
				match(DOT);
				}
				break;
			}
			setState(645);
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
			setState(647);
			match(K_DROP);
			setState(648);
			match(K_VIEW);
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(649);
				match(K_IF);
				setState(650);
				match(K_EXISTS);
				}
				break;
			}
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(653);
				database_name();
				setState(654);
				match(DOT);
				}
				break;
			}
			setState(658);
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
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(660);
				with_clause();
				}
			}

			setState(680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(663);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(664);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(665);
				match(K_INSERT);
				setState(666);
				match(K_OR);
				setState(667);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(668);
				match(K_INSERT);
				setState(669);
				match(K_OR);
				setState(670);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(671);
				match(K_INSERT);
				setState(672);
				match(K_OR);
				setState(673);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(674);
				match(K_INSERT);
				setState(675);
				match(K_OR);
				setState(676);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(677);
				match(K_INSERT);
				setState(678);
				match(K_OR);
				setState(679);
				match(K_IGNORE);
				}
				break;
			}
			setState(682);
			match(K_INTO);
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(683);
				database_name();
				setState(684);
				match(DOT);
				}
				break;
			}
			setState(688);
			table_name();
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(689);
				match(OPEN_PAR);
				setState(690);
				column_name();
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(691);
					match(COMMA);
					setState(692);
					column_name();
					}
					}
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(698);
				match(CLOSE_PAR);
				}
			}

			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(702);
				match(K_VALUES);
				setState(703);
				match(OPEN_PAR);
				setState(704);
				expr(0);
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(705);
					match(COMMA);
					setState(706);
					expr(0);
					}
					}
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(712);
				match(CLOSE_PAR);
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(713);
					match(COMMA);
					setState(714);
					match(OPEN_PAR);
					setState(715);
					expr(0);
					setState(720);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(716);
						match(COMMA);
						setState(717);
						expr(0);
						}
						}
						setState(722);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(723);
					match(CLOSE_PAR);
					}
					}
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(730);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(731);
				match(K_DEFAULT);
				setState(732);
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
			setState(735);
			match(K_PRAGMA);
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(736);
				database_name();
				setState(737);
				match(DOT);
				}
				break;
			}
			setState(741);
			pragma_name();
			setState(748);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(742);
				match(ASSIGN);
				setState(743);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(744);
				match(OPEN_PAR);
				setState(745);
				pragma_value();
				setState(746);
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
			setState(750);
			match(K_REINDEX);
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(751);
				collation_name();
				}
				break;
			case 2:
				{
				setState(755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(752);
					database_name();
					setState(753);
					match(DOT);
					}
					break;
				}
				setState(759);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(757);
					table_name();
					}
					break;
				case 2:
					{
					setState(758);
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
			setState(763);
			match(K_RELEASE);
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(764);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(767);
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
			setState(769);
			match(K_ROLLBACK);
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(770);
				match(K_TRANSACTION);
				setState(772);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(771);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(776);
				match(K_TO);
				setState(778);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(777);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(780);
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
			setState(783);
			match(K_SAVEPOINT);
			setState(784);
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
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(786);
				match(K_WITH);
				setState(788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(787);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(790);
				common_table_expression();
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(791);
					match(COMMA);
					setState(792);
					common_table_expression();
					}
					}
					setState(797);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(800);
			select_core();
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(801);
				match(K_ORDER);
				setState(802);
				match(K_BY);
				setState(803);
				ordering_term();
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(804);
					match(COMMA);
					setState(805);
					ordering_term();
					}
					}
					setState(810);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(813);
				match(K_LIMIT);
				setState(814);
				expr(0);
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(815);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(816);
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
			setState(821);
			select_core();
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(822);
				match(K_ORDER);
				setState(823);
				match(K_BY);
				setState(824);
				ordering_term();
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(825);
					match(COMMA);
					setState(826);
					ordering_term();
					}
					}
					setState(831);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(834);
				match(K_LIMIT);
				setState(835);
				expr(0);
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(836);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(837);
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
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(842);
				with_clause();
				}
			}

			setState(845);
			match(K_UPDATE);
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(846);
				match(K_OR);
				setState(847);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(848);
				match(K_OR);
				setState(849);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(850);
				match(K_OR);
				setState(851);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(852);
				match(K_OR);
				setState(853);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(854);
				match(K_OR);
				setState(855);
				match(K_IGNORE);
				}
				break;
			}
			setState(858);
			qualified_table_name();
			setState(859);
			match(K_SET);
			setState(860);
			column_name();
			setState(861);
			match(ASSIGN);
			setState(862);
			expr(0);
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(863);
				match(COMMA);
				setState(864);
				column_name();
				setState(865);
				match(ASSIGN);
				setState(866);
				expr(0);
				}
				}
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(873);
				match(K_WHERE);
				setState(874);
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
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(877);
				with_clause();
				}
			}

			setState(880);
			match(K_UPDATE);
			setState(891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(881);
				match(K_OR);
				setState(882);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(883);
				match(K_OR);
				setState(884);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(885);
				match(K_OR);
				setState(886);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(887);
				match(K_OR);
				setState(888);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(889);
				match(K_OR);
				setState(890);
				match(K_IGNORE);
				}
				break;
			}
			setState(893);
			qualified_table_name();
			setState(894);
			match(K_SET);
			setState(895);
			column_name();
			setState(896);
			match(ASSIGN);
			setState(897);
			expr(0);
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(898);
				match(COMMA);
				setState(899);
				column_name();
				setState(900);
				match(ASSIGN);
				setState(901);
				expr(0);
				}
				}
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(908);
				match(K_WHERE);
				setState(909);
				expr(0);
				}
			}

			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(912);
					match(K_ORDER);
					setState(913);
					match(K_BY);
					setState(914);
					ordering_term();
					setState(919);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(915);
						match(COMMA);
						setState(916);
						ordering_term();
						}
						}
						setState(921);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(924);
				match(K_LIMIT);
				setState(925);
				expr(0);
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(926);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(927);
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
			setState(932);
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
			setState(934);
			column_name();
			setState(936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(935);
				type_name();
				}
				break;
			}
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (K_NOT - 110)) | (1L << (K_NULL - 110)) | (1L << (K_PRIMARY - 110)) | (1L << (K_REFERENCES - 110)) | (1L << (K_UNIQUE - 110)))) != 0)) {
				{
				{
				setState(938);
				column_constraint();
				}
				}
				setState(943);
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
			setState(945); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(944);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(947); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(949);
				match(OPEN_PAR);
				setState(950);
				signed_number();
				setState(951);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(953);
				match(OPEN_PAR);
				setState(954);
				signed_number();
				setState(955);
				match(COMMA);
				setState(956);
				signed_number();
				setState(957);
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
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(961);
				match(K_CONSTRAINT);
				setState(962);
				name();
				}
			}

			setState(998);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(965);
				match(K_PRIMARY);
				setState(966);
				match(K_KEY);
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(967);
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

				setState(970);
				conflict_clause();
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(971);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(974);
					match(K_NOT);
					}
				}

				setState(977);
				match(K_NULL);
				setState(978);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(979);
				match(K_UNIQUE);
				setState(980);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(981);
				match(K_CHECK);
				setState(982);
				match(OPEN_PAR);
				setState(983);
				expr(0);
				setState(984);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(986);
				match(K_DEFAULT);
				setState(993);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(987);
					signed_number();
					}
					break;
				case 2:
					{
					setState(988);
					literal_value();
					}
					break;
				case 3:
					{
					setState(989);
					match(OPEN_PAR);
					setState(990);
					expr(0);
					setState(991);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(995);
				match(K_COLLATE);
				setState(996);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(997);
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
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1000);
				match(K_ON);
				setState(1001);
				match(K_CONFLICT);
				setState(1002);
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
			setState(1055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1006);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1007);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1008);
				dbColumnExpr();
				}
				break;
			case 4:
				{
				setState(1009);
				unary_operator();
				setState(1010);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1012);
				count_function();
				}
				break;
			case 6:
				{
				setState(1013);
				any_function();
				}
				break;
			case 7:
				{
				setState(1014);
				match(OPEN_PAR);
				setState(1015);
				expr(0);
				setState(1016);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1018);
				match(K_CAST);
				setState(1019);
				match(OPEN_PAR);
				setState(1020);
				expr(0);
				setState(1021);
				match(K_AS);
				setState(1022);
				type_name();
				setState(1023);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1026);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1025);
						match(K_NOT);
						}
					}

					setState(1028);
					match(K_EXISTS);
					}
				}

				setState(1031);
				match(OPEN_PAR);
				setState(1032);
				select_stmt();
				setState(1033);
				match(CLOSE_PAR);
				}
				break;
			case 10:
				{
				setState(1035);
				match(K_CASE);
				setState(1037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1036);
					expr(0);
					}
					break;
				}
				setState(1044); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1039);
					match(K_WHEN);
					setState(1040);
					expr(0);
					setState(1041);
					match(K_THEN);
					setState(1042);
					expr(0);
					}
					}
					setState(1046); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1048);
					match(K_ELSE);
					setState(1049);
					expr(0);
					}
				}

				setState(1052);
				match(K_END);
				}
				break;
			case 11:
				{
				setState(1054);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1141);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1057);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1058);
						match(PIPE2);
						setState(1059);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1060);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1061);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1062);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1063);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1064);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1065);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1066);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1067);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1068);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1069);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1070);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1071);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1072);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						{
						setState(1073);
						comparison_operator();
						}
						setState(1074);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1076);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1077);
						and_or();
						setState(1078);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1080);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1081);
						match(K_IS);
						setState(1083);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
						case 1:
							{
							setState(1082);
							match(K_NOT);
							}
							break;
						}
						setState(1085);
						expr(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1086);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
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
						match(K_BETWEEN);
						setState(1091);
						expr(0);
						setState(1092);
						match(K_AND);
						setState(1093);
						expr(6);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1095);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1096);
						match(K_COLLATE);
						setState(1097);
						collation_name();
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1098);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1100);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1099);
							match(K_NOT);
							}
						}

						setState(1102);
						_la = _input.LA(1);
						if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (K_GLOB - 80)) | (1L << (K_LIKE - 80)) | (1L << (K_MATCH - 80)) | (1L << (K_REGEXP - 80)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1103);
						expr(0);
						setState(1106);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
						case 1:
							{
							setState(1104);
							match(K_ESCAPE);
							setState(1105);
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
						setState(1108);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1113);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1109);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1110);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1111);
							match(K_NOT);
							setState(1112);
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
						setState(1115);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1117);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1116);
							match(K_NOT);
							}
						}

						setState(1119);
						match(K_IN);
						setState(1139);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
						case 1:
							{
							setState(1120);
							match(OPEN_PAR);
							setState(1130);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
							case 1:
								{
								setState(1121);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1122);
								expr(0);
								setState(1127);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1123);
									match(COMMA);
									setState(1124);
									expr(0);
									}
									}
									setState(1129);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1132);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1136);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
							case 1:
								{
								setState(1133);
								database_name();
								setState(1134);
								match(DOT);
								}
								break;
							}
							setState(1138);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1145);
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
			setState(1164);
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
				setState(1155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
					case 1:
						{
						setState(1147);
						database_name();
						setState(1148);
						match(DOT);
						}
						break;
					}
					setState(1152);
					table_name();
					setState(1153);
					match(DOT);
					}
					break;
				}
				setState(1157);
				column_name();
				setState(1162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1158);
						match(K_AS);
						}
					}

					setState(1161);
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
			setState(1187);
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
				setState(1175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
					case 1:
						{
						setState(1167);
						database_name();
						setState(1168);
						match(DOT);
						}
						break;
					}
					setState(1172);
					table_name();
					setState(1173);
					match(DOT);
					}
					break;
				}
				setState(1177);
				column_name();
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1178);
					deid_tag();
					}
				}

				setState(1185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1182);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1181);
						match(K_AS);
						}
					}

					setState(1184);
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
		enterRule(_localctx, 84, RULE_comparison_operator);
		try {
			setState(1201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1189);
				match(ASSIGN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
				match(EQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1191);
				match(NOT_EQ1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1192);
				match(NOT_EQ2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1193);
				match(K_IS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1194);
				match(K_IS);
				setState(1195);
				match(K_NOT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1196);
				in_keyword();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1197);
				like_keyword();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1198);
				match(K_GLOB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1199);
				match(K_MATCH);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1200);
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
		enterRule(_localctx, 86, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			match(K_REFERENCES);
			setState(1204);
			foreign_table();
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1205);
				match(OPEN_PAR);
				setState(1206);
				column_name();
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1207);
					match(COMMA);
					setState(1208);
					column_name();
					}
					}
					setState(1213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1214);
				match(CLOSE_PAR);
				}
			}

			setState(1236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1232);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1218);
					match(K_ON);
					setState(1219);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
					case 1:
						{
						setState(1220);
						match(K_SET);
						setState(1221);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1222);
						match(K_SET);
						setState(1223);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1224);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1225);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1226);
						match(K_NO);
						setState(1227);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1230);
					match(K_MATCH);
					setState(1231);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1239);
					match(K_NOT);
					}
				}

				setState(1242);
				match(K_DEFERRABLE);
				setState(1247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1243);
					match(K_INITIALLY);
					setState(1244);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1245);
					match(K_INITIALLY);
					setState(1246);
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
		enterRule(_localctx, 88, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			match(K_RAISE);
			setState(1252);
			match(OPEN_PAR);
			setState(1257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1253);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1254);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1255);
				match(COMMA);
				setState(1256);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1259);
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
		enterRule(_localctx, 90, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			column_name();
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1262);
				match(K_COLLATE);
				setState(1263);
				collation_name();
				}
			}

			setState(1267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1266);
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
		enterRule(_localctx, 92, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1269);
				match(K_CONSTRAINT);
				setState(1270);
				name();
				}
			}

			setState(1309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1276);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1273);
					match(K_PRIMARY);
					setState(1274);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1275);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1278);
				match(OPEN_PAR);
				setState(1279);
				indexed_column();
				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1280);
					match(COMMA);
					setState(1281);
					indexed_column();
					}
					}
					setState(1286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1287);
				match(CLOSE_PAR);
				setState(1288);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1290);
				match(K_CHECK);
				setState(1291);
				match(OPEN_PAR);
				setState(1292);
				expr(0);
				setState(1293);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1295);
				match(K_FOREIGN);
				setState(1296);
				match(K_KEY);
				setState(1297);
				match(OPEN_PAR);
				setState(1298);
				column_name();
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1299);
					match(COMMA);
					setState(1300);
					column_name();
					}
					}
					setState(1305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1306);
				match(CLOSE_PAR);
				setState(1307);
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
		enterRule(_localctx, 94, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			match(K_WITH);
			setState(1313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1312);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1315);
			cte_table_name();
			setState(1316);
			match(K_AS);
			setState(1317);
			match(OPEN_PAR);
			setState(1318);
			select_stmt();
			setState(1319);
			match(CLOSE_PAR);
			setState(1329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1320);
				match(COMMA);
				setState(1321);
				cte_table_name();
				setState(1322);
				match(K_AS);
				setState(1323);
				match(OPEN_PAR);
				setState(1324);
				select_stmt();
				setState(1325);
				match(CLOSE_PAR);
				}
				}
				setState(1331);
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
		enterRule(_localctx, 96, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1332);
				database_name();
				setState(1333);
				match(DOT);
				}
				break;
			}
			setState(1337);
			table_name();
			setState(1343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1338);
				match(K_INDEXED);
				setState(1339);
				match(K_BY);
				setState(1340);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1341);
				match(K_NOT);
				setState(1342);
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
		enterRule(_localctx, 98, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			expr(0);
			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1346);
				match(K_COLLATE);
				setState(1347);
				collation_name();
				}
			}

			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1350);
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
		enterRule(_localctx, 100, RULE_pragma_value);
		try {
			setState(1356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1353);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1354);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1355);
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
		enterRule(_localctx, 102, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			table_name();
			setState(1370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1359);
				match(OPEN_PAR);
				setState(1360);
				column_name();
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1361);
					match(COMMA);
					setState(1362);
					column_name();
					}
					}
					setState(1367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1368);
				match(CLOSE_PAR);
				}
			}

			setState(1372);
			match(K_AS);
			setState(1373);
			match(OPEN_PAR);
			setState(1374);
			select_stmt();
			setState(1375);
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
		enterRule(_localctx, 104, RULE_result_column);
		try {
			setState(1385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1377);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1378);
				table_name();
				setState(1379);
				match(DOT);
				setState(1380);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1382);
				result_column_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1383);
				count_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1384);
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
		enterRule(_localctx, 106, RULE_deid_tag);
		try {
			setState(1396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1387);
				match(LT);
				setState(1388);
				match(K_IDENTIFIABLE);
				setState(1390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1389);
					ident_prop();
					}
					break;
				}
				setState(1392);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1393);
				match(LT);
				setState(1394);
				match(K_NOTIDENTIFIABLE);
				setState(1395);
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
		enterRule(_localctx, 108, RULE_ident_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ISID) {
				{
				setState(1398);
				id_field_prop();
				}
			}

			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DATESHIFT) {
				{
				setState(1401);
				date_shift_field_prop();
				}
			}

			setState(1405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OBFUSCATE) {
				{
				setState(1404);
				obfuscate_field_prop();
				}
			}

			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ISZIPCODE) {
				{
				setState(1407);
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
		enterRule(_localctx, 110, RULE_is_zip_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
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
		enterRule(_localctx, 112, RULE_id_field_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(K_ISID);
			setState(1413);
			match(ASSIGN);
			setState(1414);
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
		enterRule(_localctx, 114, RULE_date_shift_field_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			match(K_DATESHIFT);
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ISBIRTHDATE) {
				{
				setState(1417);
				is_birthdate_prop();
				}
			}

			setState(1423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRACKED) {
				{
				setState(1420);
				match(K_TRACKED);
				setState(1421);
				match(K_BY);
				setState(1422);
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
		enterRule(_localctx, 116, RULE_tracking_column_expr);
		try {
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1429);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
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
					setState(1432);
					match(DOT);
					}
					break;
				}
				setState(1436);
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
		enterRule(_localctx, 118, RULE_is_birthdate_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
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
		enterRule(_localctx, 120, RULE_obfuscate_field_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(K_OBFUSCATE);
			setState(1444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1442);
				match(ASSIGN);
				setState(1443);
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
		enterRule(_localctx, 122, RULE_from_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1446);
				database_name();
				setState(1447);
				match(DOT);
				}
				break;
			}
			setState(1451);
			table_name();
			setState(1456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1452);
					match(K_AS);
					}
					break;
				}
				setState(1455);
				table_alias();
				}
				break;
			}
			setState(1463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1458);
				match(K_INDEXED);
				setState(1459);
				match(K_BY);
				setState(1460);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1461);
				match(K_NOT);
				setState(1462);
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
		enterRule(_localctx, 124, RULE_table_or_subquery);
		int _la;
		try {
			setState(1494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				from_table_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1466);
				match(OPEN_PAR);
				setState(1476);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1467);
					table_or_subquery();
					setState(1472);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1468);
						match(COMMA);
						setState(1469);
						table_or_subquery();
						}
						}
						setState(1474);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1475);
					join_clause();
					}
					break;
				}
				setState(1478);
				match(CLOSE_PAR);
				setState(1483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1480);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
					case 1:
						{
						setState(1479);
						match(K_AS);
						}
						break;
					}
					setState(1482);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1485);
				match(OPEN_PAR);
				setState(1486);
				select_stmt();
				setState(1487);
				match(CLOSE_PAR);
				setState(1492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1489);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
					case 1:
						{
						setState(1488);
						match(K_AS);
						}
						break;
					}
					setState(1491);
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
		enterRule(_localctx, 126, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			table_or_subquery();
			setState(1503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (K_INNER - 91)) | (1L << (K_JOIN - 91)) | (1L << (K_LEFT - 91)) | (1L << (K_NATURAL - 91)))) != 0)) {
				{
				{
				setState(1497);
				join_operator();
				setState(1498);
				table_or_subquery();
				setState(1499);
				join_constraint();
				}
				}
				setState(1505);
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
		enterRule(_localctx, 128, RULE_join_operator);
		int _la;
		try {
			setState(1519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506);
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
				setState(1508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1507);
					match(K_NATURAL);
					}
				}

				setState(1516);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1510);
					match(K_LEFT);
					setState(1512);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1511);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1514);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1515);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1518);
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
		enterRule(_localctx, 130, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1521);
				match(K_ON);
				setState(1522);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1523);
				match(K_USING);
				setState(1524);
				match(OPEN_PAR);
				setState(1525);
				column_name();
				setState(1530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1526);
					match(COMMA);
					setState(1527);
					column_name();
					}
					}
					setState(1532);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1533);
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
		enterRule(_localctx, 132, RULE_select_core);
		int _la;
		try {
			setState(1600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1537);
				match(K_SELECT);
				setState(1539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1538);
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
				setState(1541);
				result_column();
				setState(1546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1542);
					match(COMMA);
					setState(1543);
					result_column();
					}
					}
					setState(1548);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1549);
					multi_from_clause();
					}
				}

				setState(1554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1552);
					match(K_WHERE);
					setState(1553);
					expr(0);
					}
				}

				setState(1570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1556);
					match(K_GROUP);
					setState(1557);
					match(K_BY);
					setState(1558);
					expr(0);
					setState(1563);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1559);
						match(COMMA);
						setState(1560);
						expr(0);
						}
						}
						setState(1565);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1568);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1566);
						match(K_HAVING);
						setState(1567);
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
				setState(1572);
				match(K_VALUES);
				setState(1573);
				match(OPEN_PAR);
				setState(1574);
				expr(0);
				setState(1579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1575);
					match(COMMA);
					setState(1576);
					expr(0);
					}
					}
					setState(1581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1582);
				match(CLOSE_PAR);
				setState(1597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1583);
					match(COMMA);
					setState(1584);
					match(OPEN_PAR);
					setState(1585);
					expr(0);
					setState(1590);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1586);
						match(COMMA);
						setState(1587);
						expr(0);
						}
						}
						setState(1592);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1593);
					match(CLOSE_PAR);
					}
					}
					setState(1599);
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
		enterRule(_localctx, 134, RULE_multi_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			match(K_FROM);
			setState(1612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1603);
				table_or_subquery();
				setState(1608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1604);
					match(COMMA);
					setState(1605);
					table_or_subquery();
					}
					}
					setState(1610);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1611);
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
		enterRule(_localctx, 136, RULE_set_operator);
		try {
			setState(1620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1614);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1615);
				match(K_UNION);
				setState(1616);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1617);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1618);
				match(K_EXCEPT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1619);
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
		enterRule(_localctx, 138, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			table_name();
			setState(1634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1623);
				match(OPEN_PAR);
				setState(1624);
				column_name();
				setState(1629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1625);
					match(COMMA);
					setState(1626);
					column_name();
					}
					}
					setState(1631);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1632);
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
		enterRule(_localctx, 140, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1636);
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

			setState(1639);
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
		enterRule(_localctx, 142, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (K_NULL - 113)) | (1L << (NUMERIC_LITERAL - 113)) | (1L << (STRING_LITERAL - 113)) | (1L << (BLOB_LITERAL - 113)))) != 0)) ) {
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
		enterRule(_localctx, 144, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
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
		enterRule(_localctx, 146, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
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
		enterRule(_localctx, 148, RULE_module_argument);
		try {
			setState(1649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1647);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1648);
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
		enterRule(_localctx, 150, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
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
		enterRule(_localctx, 152, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISBIRTHDATE - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_ISZIPCODE - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTIDENTIFIABLE - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRACKED - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) ) {
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
		enterRule(_localctx, 154, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
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
		enterRule(_localctx, 156, RULE_count_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			match(K_COUNT);
			setState(1658);
			match(OPEN_PAR);
			setState(1668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1660);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1659);
					distinct_keyword();
					}
					break;
				}
				setState(1662);
				result_column_expr();
				}
				break;
			case 2:
				{
				setState(1663);
				match(STAR);
				}
				break;
			case 3:
				{
				setState(1665);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1664);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1667);
				any_function();
				}
				break;
			}
			setState(1670);
			match(CLOSE_PAR);
			setState(1672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1671);
				deid_tag();
				}
				break;
			}
			setState(1678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1674);
					match(K_AS);
					}
				}

				setState(1677);
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
		enterRule(_localctx, 158, RULE_any_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			function_name();
			setState(1681);
			match(OPEN_PAR);
			setState(1694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1683);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1682);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1685);
				result_column_expr();
				setState(1690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1686);
					match(COMMA);
					setState(1687);
					result_column_expr();
					}
					}
					setState(1692);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1693);
				match(STAR);
				}
				break;
			}
			setState(1696);
			match(CLOSE_PAR);
			setState(1698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1697);
				deid_tag();
				}
				break;
			}
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
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
		enterRule(_localctx, 160, RULE_and_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
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
		enterRule(_localctx, 162, RULE_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
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
		enterRule(_localctx, 164, RULE_and_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
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
		enterRule(_localctx, 166, RULE_not_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
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
		enterRule(_localctx, 168, RULE_in_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
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
		enterRule(_localctx, 170, RULE_like_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
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
		enterRule(_localctx, 172, RULE_distinct_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
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
		enterRule(_localctx, 174, RULE_function_name);
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
		enterRule(_localctx, 176, RULE_database_name);
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
		enterRule(_localctx, 178, RULE_table_name);
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
		enterRule(_localctx, 180, RULE_table_or_index_name);
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
		enterRule(_localctx, 182, RULE_new_table_name);
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
		enterRule(_localctx, 184, RULE_column_name);
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
		enterRule(_localctx, 186, RULE_collation_name);
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
		enterRule(_localctx, 188, RULE_foreign_table);
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
		enterRule(_localctx, 190, RULE_index_name);
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
		enterRule(_localctx, 192, RULE_trigger_name);
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
		enterRule(_localctx, 194, RULE_view_name);
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
		enterRule(_localctx, 196, RULE_module_name);
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
		enterRule(_localctx, 198, RULE_pragma_name);
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
		enterRule(_localctx, 200, RULE_savepoint_name);
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
		enterRule(_localctx, 202, RULE_table_alias);
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
		enterRule(_localctx, 204, RULE_transaction_name);
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
		enterRule(_localctx, 206, RULE_any_name);
		try {
			setState(1759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1752);
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
				setState(1753);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1754);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1755);
				match(OPEN_PAR);
				setState(1756);
				any_name();
				setState(1757);
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
		enterRule(_localctx, 208, RULE_anything_at_all);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1762); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1761);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1764); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ac\u06e9\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\3\2\3"+
		"\2\7\2\u00d7\n\2\f\2\16\2\u00da\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4\u00e3"+
		"\n\4\f\4\16\4\u00e6\13\4\3\4\7\4\u00e9\n\4\f\4\16\4\u00ec\13\4\3\5\3\5"+
		"\3\5\5\5\u00f1\n\5\5\5\u00f3\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0112\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u011d\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0125\n\7\3\7\5\7\u0128\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0131\n\b\3\t\3\t\5\t\u0135\n\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\5\n\u013d\n\n\3\n\3\n\5\n\u0141\n\n\5\n\u0143\n\n\3\13\3\13\3\13"+
		"\5\13\u0148\n\13\5\13\u014a\n\13\3\f\3\f\5\f\u014e\n\f\3\f\3\f\3\f\7\f"+
		"\u0153\n\f\f\f\16\f\u0156\13\f\5\f\u0158\n\f\3\f\3\f\3\f\3\f\6\f\u015e"+
		"\n\f\r\f\16\f\u015f\3\f\3\f\3\f\3\f\3\f\7\f\u0167\n\f\f\f\16\f\u016a\13"+
		"\f\5\f\u016c\n\f\3\f\3\f\3\f\3\f\5\f\u0172\n\f\5\f\u0174\n\f\3\r\3\r\5"+
		"\r\u0178\n\r\3\r\3\r\3\r\3\r\5\r\u017e\n\r\3\r\3\r\3\r\5\r\u0183\n\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u018c\n\r\f\r\16\r\u018f\13\r\3\r\3\r\3"+
		"\r\5\r\u0194\n\r\3\16\3\16\5\16\u0198\n\16\3\16\3\16\3\16\3\16\5\16\u019e"+
		"\n\16\3\16\3\16\3\16\5\16\u01a3\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u01aa"+
		"\n\16\f\16\16\16\u01ad\13\16\3\16\3\16\7\16\u01b1\n\16\f\16\16\16\u01b4"+
		"\13\16\3\16\3\16\3\16\5\16\u01b9\n\16\3\16\3\16\5\16\u01bd\n\16\3\17\3"+
		"\17\5\17\u01c1\n\17\3\17\3\17\3\17\3\17\5\17\u01c7\n\17\3\17\3\17\3\17"+
		"\5\17\u01cc\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u01d3\n\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u01dc\n\17\f\17\16\17\u01df\13\17\5\17\u01e1"+
		"\n\17\5\17\u01e3\n\17\3\17\3\17\3\17\3\17\5\17\u01e9\n\17\3\17\3\17\3"+
		"\17\3\17\5\17\u01ef\n\17\3\17\3\17\5\17\u01f3\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u01fa\n\17\3\17\3\17\6\17\u01fe\n\17\r\17\16\17\u01ff\3\17"+
		"\3\17\3\20\3\20\5\20\u0206\n\20\3\20\3\20\3\20\3\20\5\20\u020c\n\20\3"+
		"\20\3\20\3\20\5\20\u0211\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u021d\n\21\3\21\3\21\3\21\5\21\u0222\n\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u022b\n\21\f\21\16\21\u022e\13\21\3\21\3"+
		"\21\5\21\u0232\n\21\3\22\5\22\u0235\n\22\3\22\3\22\3\22\3\22\5\22\u023b"+
		"\n\22\3\23\5\23\u023e\n\23\3\23\3\23\3\23\3\23\5\23\u0244\n\23\3\23\3"+
		"\23\3\23\3\23\3\23\7\23\u024b\n\23\f\23\16\23\u024e\13\23\5\23\u0250\n"+
		"\23\3\23\3\23\3\23\3\23\5\23\u0256\n\23\5\23\u0258\n\23\3\24\3\24\3\24"+
		"\3\25\3\25\5\25\u025f\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0267\n"+
		"\26\3\26\3\26\3\26\5\26\u026c\n\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27"+
		"\u0274\n\27\3\27\3\27\3\27\5\27\u0279\n\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\5\30\u0281\n\30\3\30\3\30\3\30\5\30\u0286\n\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\5\31\u028e\n\31\3\31\3\31\3\31\5\31\u0293\n\31\3\31\3\31\3"+
		"\32\5\32\u0298\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u02ab\n\32\3\32\3\32\3\32\3\32"+
		"\5\32\u02b1\n\32\3\32\3\32\3\32\3\32\3\32\7\32\u02b8\n\32\f\32\16\32\u02bb"+
		"\13\32\3\32\3\32\5\32\u02bf\n\32\3\32\3\32\3\32\3\32\3\32\7\32\u02c6\n"+
		"\32\f\32\16\32\u02c9\13\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u02d1\n"+
		"\32\f\32\16\32\u02d4\13\32\3\32\3\32\7\32\u02d8\n\32\f\32\16\32\u02db"+
		"\13\32\3\32\3\32\3\32\5\32\u02e0\n\32\3\33\3\33\3\33\3\33\5\33\u02e6\n"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02ef\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u02f6\n\34\3\34\3\34\5\34\u02fa\n\34\5\34\u02fc\n\34\3"+
		"\35\3\35\5\35\u0300\n\35\3\35\3\35\3\36\3\36\3\36\5\36\u0307\n\36\5\36"+
		"\u0309\n\36\3\36\3\36\5\36\u030d\n\36\3\36\5\36\u0310\n\36\3\37\3\37\3"+
		"\37\3 \3 \5 \u0317\n \3 \3 \3 \7 \u031c\n \f \16 \u031f\13 \5 \u0321\n"+
		" \3 \3 \3 \3 \3 \3 \7 \u0329\n \f \16 \u032c\13 \5 \u032e\n \3 \3 \3 "+
		"\3 \5 \u0334\n \5 \u0336\n \3!\3!\3!\3!\3!\3!\7!\u033e\n!\f!\16!\u0341"+
		"\13!\5!\u0343\n!\3!\3!\3!\3!\5!\u0349\n!\5!\u034b\n!\3\"\5\"\u034e\n\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u035b\n\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0367\n\"\f\"\16\"\u036a\13\"\3\"\3\""+
		"\5\"\u036e\n\"\3#\5#\u0371\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u037e"+
		"\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u038a\n#\f#\16#\u038d\13#\3#\3#\5"+
		"#\u0391\n#\3#\3#\3#\3#\3#\7#\u0398\n#\f#\16#\u039b\13#\5#\u039d\n#\3#"+
		"\3#\3#\3#\5#\u03a3\n#\5#\u03a5\n#\3$\3$\3%\3%\5%\u03ab\n%\3%\7%\u03ae"+
		"\n%\f%\16%\u03b1\13%\3&\6&\u03b4\n&\r&\16&\u03b5\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\5&\u03c2\n&\3\'\3\'\5\'\u03c6\n\'\3\'\3\'\3\'\5\'\u03cb\n\'"+
		"\3\'\3\'\5\'\u03cf\n\'\3\'\5\'\u03d2\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u03e4\n\'\3\'\3\'\3\'\5\'\u03e9"+
		"\n\'\3(\3(\3(\5(\u03ee\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\5)\u0405\n)\3)\5)\u0408\n)\3)\3)\3)\3)\3)\3)\5)\u0410"+
		"\n)\3)\3)\3)\3)\3)\6)\u0417\n)\r)\16)\u0418\3)\3)\5)\u041d\n)\3)\3)\3"+
		")\5)\u0422\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\5)\u043e\n)\3)\3)\3)\5)\u0443\n)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\5)\u044f\n)\3)\3)\3)\3)\5)\u0455\n)\3)\3)\3)\3)\3)\5"+
		")\u045c\n)\3)\3)\5)\u0460\n)\3)\3)\3)\3)\3)\3)\7)\u0468\n)\f)\16)\u046b"+
		"\13)\5)\u046d\n)\3)\3)\3)\3)\5)\u0473\n)\3)\5)\u0476\n)\7)\u0478\n)\f"+
		")\16)\u047b\13)\3*\3*\3*\3*\5*\u0481\n*\3*\3*\3*\5*\u0486\n*\3*\3*\5*"+
		"\u048a\n*\3*\5*\u048d\n*\5*\u048f\n*\3+\3+\3+\3+\5+\u0495\n+\3+\3+\3+"+
		"\5+\u049a\n+\3+\3+\5+\u049e\n+\3+\5+\u04a1\n+\3+\5+\u04a4\n+\5+\u04a6"+
		"\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u04b4\n,\3-\3-\3-\3-\3-\3-"+
		"\7-\u04bc\n-\f-\16-\u04bf\13-\3-\3-\5-\u04c3\n-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\5-\u04cf\n-\3-\3-\5-\u04d3\n-\7-\u04d5\n-\f-\16-\u04d8\13-\3-"+
		"\5-\u04db\n-\3-\3-\3-\3-\3-\5-\u04e2\n-\5-\u04e4\n-\3.\3.\3.\3.\3.\3."+
		"\5.\u04ec\n.\3.\3.\3/\3/\3/\5/\u04f3\n/\3/\5/\u04f6\n/\3\60\3\60\5\60"+
		"\u04fa\n\60\3\60\3\60\3\60\5\60\u04ff\n\60\3\60\3\60\3\60\3\60\7\60\u0505"+
		"\n\60\f\60\16\60\u0508\13\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\7\60\u0518\n\60\f\60\16\60\u051b\13\60\3"+
		"\60\3\60\3\60\5\60\u0520\n\60\3\61\3\61\5\61\u0524\n\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0532\n\61\f\61\16"+
		"\61\u0535\13\61\3\62\3\62\3\62\5\62\u053a\n\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u0542\n\62\3\63\3\63\3\63\5\63\u0547\n\63\3\63\5\63\u054a\n"+
		"\63\3\64\3\64\3\64\5\64\u054f\n\64\3\65\3\65\3\65\3\65\3\65\7\65\u0556"+
		"\n\65\f\65\16\65\u0559\13\65\3\65\3\65\5\65\u055d\n\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u056c\n\66\3\67"+
		"\3\67\3\67\5\67\u0571\n\67\3\67\3\67\3\67\3\67\5\67\u0577\n\67\38\58\u057a"+
		"\n8\38\58\u057d\n8\38\58\u0580\n8\38\58\u0583\n8\39\39\3:\3:\3:\3:\3;"+
		"\3;\5;\u058d\n;\3;\3;\3;\5;\u0592\n;\3<\3<\3<\3<\5<\u0598\n<\3<\3<\3<"+
		"\5<\u059d\n<\3<\5<\u05a0\n<\3=\3=\3>\3>\3>\5>\u05a7\n>\3?\3?\3?\5?\u05ac"+
		"\n?\3?\3?\5?\u05b0\n?\3?\5?\u05b3\n?\3?\3?\3?\3?\3?\5?\u05ba\n?\3@\3@"+
		"\3@\3@\3@\7@\u05c1\n@\f@\16@\u05c4\13@\3@\5@\u05c7\n@\3@\3@\5@\u05cb\n"+
		"@\3@\5@\u05ce\n@\3@\3@\3@\3@\5@\u05d4\n@\3@\5@\u05d7\n@\5@\u05d9\n@\3"+
		"A\3A\3A\3A\3A\7A\u05e0\nA\fA\16A\u05e3\13A\3B\3B\5B\u05e7\nB\3B\3B\5B"+
		"\u05eb\nB\3B\3B\5B\u05ef\nB\3B\5B\u05f2\nB\3C\3C\3C\3C\3C\3C\3C\7C\u05fb"+
		"\nC\fC\16C\u05fe\13C\3C\3C\5C\u0602\nC\3D\3D\5D\u0606\nD\3D\3D\3D\7D\u060b"+
		"\nD\fD\16D\u060e\13D\3D\5D\u0611\nD\3D\3D\5D\u0615\nD\3D\3D\3D\3D\3D\7"+
		"D\u061c\nD\fD\16D\u061f\13D\3D\3D\5D\u0623\nD\5D\u0625\nD\3D\3D\3D\3D"+
		"\3D\7D\u062c\nD\fD\16D\u062f\13D\3D\3D\3D\3D\3D\3D\7D\u0637\nD\fD\16D"+
		"\u063a\13D\3D\3D\7D\u063e\nD\fD\16D\u0641\13D\5D\u0643\nD\3E\3E\3E\3E"+
		"\7E\u0649\nE\fE\16E\u064c\13E\3E\5E\u064f\nE\3F\3F\3F\3F\3F\3F\5F\u0657"+
		"\nF\3G\3G\3G\3G\3G\7G\u065e\nG\fG\16G\u0661\13G\3G\3G\5G\u0665\nG\3H\5"+
		"H\u0668\nH\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\5L\u0674\nL\3M\3M\3N\3N\3O\3"+
		"O\3P\3P\3P\5P\u067f\nP\3P\3P\3P\5P\u0684\nP\3P\5P\u0687\nP\3P\3P\5P\u068b"+
		"\nP\3P\5P\u068e\nP\3P\5P\u0691\nP\3Q\3Q\3Q\5Q\u0696\nQ\3Q\3Q\3Q\7Q\u069b"+
		"\nQ\fQ\16Q\u069e\13Q\3Q\5Q\u06a1\nQ\3Q\3Q\5Q\u06a5\nQ\3Q\5Q\u06a8\nQ\3"+
		"Q\5Q\u06ab\nQ\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3"+
		"[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f"+
		"\3f\3g\3g\3h\3h\3i\3i\3i\3i\3i\3i\3i\5i\u06e2\ni\3j\6j\u06e5\nj\rj\16"+
		"j\u06e6\3j\2\3Pk\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\2\26\5\2>>IIXX\4\2\61\61FF\4\2\7\7uu\3\2\u008f\u0090\4\2$$@@\7"+
		"\2\33\33MMWW\u0086\u0086\u0089\u0089\4\2\t\t\16\17\3\2\n\13\3\2\20\23"+
		"\3\2\24\27\6\2RRjjll\u0082\u0082\4\2??\u0099\u0099\5\2\33\33MM\u0089\u0089"+
		"\4\2LL\u0096\u0096\4\2\37\37BB\6\2\679ss\u00a4\u00a4\u00a6\u00a7\4\2\n"+
		"\fpp\4\2\u00a3\u00a3\u00a6\u00a6\6\2\33\63\65uw\u00a2\u00ac\u00ac\4\2"+
		"\"\"xx\2\u07e2\2\u00d8\3\2\2\2\4\u00dd\3\2\2\2\6\u00e0\3\2\2\2\b\u00f2"+
		"\3\2\2\2\n\u0115\3\2\2\2\f\u0117\3\2\2\2\16\u0129\3\2\2\2\20\u0132\3\2"+
		"\2\2\22\u013a\3\2\2\2\24\u0144\3\2\2\2\26\u0157\3\2\2\2\30\u0175\3\2\2"+
		"\2\32\u0195\3\2\2\2\34\u01be\3\2\2\2\36\u0203\3\2\2\2 \u0216\3\2\2\2\""+
		"\u0234\3\2\2\2$\u023d\3\2\2\2&\u0259\3\2\2\2(\u025c\3\2\2\2*\u0262\3\2"+
		"\2\2,\u026f\3\2\2\2.\u027c\3\2\2\2\60\u0289\3\2\2\2\62\u0297\3\2\2\2\64"+
		"\u02e1\3\2\2\2\66\u02f0\3\2\2\28\u02fd\3\2\2\2:\u0303\3\2\2\2<\u0311\3"+
		"\2\2\2>\u0320\3\2\2\2@\u0337\3\2\2\2B\u034d\3\2\2\2D\u0370\3\2\2\2F\u03a6"+
		"\3\2\2\2H\u03a8\3\2\2\2J\u03b3\3\2\2\2L\u03c5\3\2\2\2N\u03ed\3\2\2\2P"+
		"\u0421\3\2\2\2R\u048e\3\2\2\2T\u04a5\3\2\2\2V\u04b3\3\2\2\2X\u04b5\3\2"+
		"\2\2Z\u04e5\3\2\2\2\\\u04ef\3\2\2\2^\u04f9\3\2\2\2`\u0521\3\2\2\2b\u0539"+
		"\3\2\2\2d\u0543\3\2\2\2f\u054e\3\2\2\2h\u0550\3\2\2\2j\u056b\3\2\2\2l"+
		"\u0576\3\2\2\2n\u0579\3\2\2\2p\u0584\3\2\2\2r\u0586\3\2\2\2t\u058a\3\2"+
		"\2\2v\u059f\3\2\2\2x\u05a1\3\2\2\2z\u05a3\3\2\2\2|\u05ab\3\2\2\2~\u05d8"+
		"\3\2\2\2\u0080\u05da\3\2\2\2\u0082\u05f1\3\2\2\2\u0084\u0601\3\2\2\2\u0086"+
		"\u0642\3\2\2\2\u0088\u0644\3\2\2\2\u008a\u0656\3\2\2\2\u008c\u0658\3\2"+
		"\2\2\u008e\u0667\3\2\2\2\u0090\u066b\3\2\2\2\u0092\u066d\3\2\2\2\u0094"+
		"\u066f\3\2\2\2\u0096\u0673\3\2\2\2\u0098\u0675\3\2\2\2\u009a\u0677\3\2"+
		"\2\2\u009c\u0679\3\2\2\2\u009e\u067b\3\2\2\2\u00a0\u0692\3\2\2\2\u00a2"+
		"\u06ac\3\2\2\2\u00a4\u06ae\3\2\2\2\u00a6\u06b0\3\2\2\2\u00a8\u06b2\3\2"+
		"\2\2\u00aa\u06b4\3\2\2\2\u00ac\u06b6\3\2\2\2\u00ae\u06b8\3\2\2\2\u00b0"+
		"\u06ba\3\2\2\2\u00b2\u06bc\3\2\2\2\u00b4\u06be\3\2\2\2\u00b6\u06c0\3\2"+
		"\2\2\u00b8\u06c2\3\2\2\2\u00ba\u06c4\3\2\2\2\u00bc\u06c6\3\2\2\2\u00be"+
		"\u06c8\3\2\2\2\u00c0\u06ca\3\2\2\2\u00c2\u06cc\3\2\2\2\u00c4\u06ce\3\2"+
		"\2\2\u00c6\u06d0\3\2\2\2\u00c8\u06d2\3\2\2\2\u00ca\u06d4\3\2\2\2\u00cc"+
		"\u06d6\3\2\2\2\u00ce\u06d8\3\2\2\2\u00d0\u06e1\3\2\2\2\u00d2\u06e4\3\2"+
		"\2\2\u00d4\u00d7\5\6\4\2\u00d5\u00d7\5\4\3\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\2\2\3\u00dc"+
		"\3\3\2\2\2\u00dd\u00de\7\u00ab\2\2\u00de\u00df\b\3\1\2\u00df\5\3\2\2\2"+
		"\u00e0\u00e4\5\b\5\2\u00e1\u00e3\5\b\5\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ea\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e9\5\u00d2j\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\7\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00f0\7K\2\2\u00ee\u00ef\7~\2\2\u00ef\u00f1\7{\2"+
		"\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00ed"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u0111\3\2\2\2\u00f4\u0112\5\f\7\2\u00f5"+
		"\u0112\5\16\b\2\u00f6\u0112\5\20\t\2\u00f7\u0112\5\22\n\2\u00f8\u0112"+
		"\5\24\13\2\u00f9\u0112\5\30\r\2\u00fa\u0112\5\32\16\2\u00fb\u0112\5\34"+
		"\17\2\u00fc\u0112\5\36\20\2\u00fd\u0112\5 \21\2\u00fe\u0112\5\"\22\2\u00ff"+
		"\u0112\5$\23\2\u0100\u0112\5(\25\2\u0101\u0112\5*\26\2\u0102\u0112\5,"+
		"\27\2\u0103\u0112\5.\30\2\u0104\u0112\5\60\31\2\u0105\u0112\5\62\32\2"+
		"\u0106\u0112\5\64\33\2\u0107\u0112\5\66\34\2\u0108\u0112\58\35\2\u0109"+
		"\u0112\5:\36\2\u010a\u0112\5<\37\2\u010b\u0112\5\26\f\2\u010c\u0112\5"+
		"@!\2\u010d\u0112\5B\"\2\u010e\u0112\5D#\2\u010f\u0112\5F$\2\u0110\u0112"+
		"\5> \2\u0111\u00f4\3\2\2\2\u0111\u00f5\3\2\2\2\u0111\u00f6\3\2\2\2\u0111"+
		"\u00f7\3\2\2\2\u0111\u00f8\3\2\2\2\u0111\u00f9\3\2\2\2\u0111\u00fa\3\2"+
		"\2\2\u0111\u00fb\3\2\2\2\u0111\u00fc\3\2\2\2\u0111\u00fd\3\2\2\2\u0111"+
		"\u00fe\3\2\2\2\u0111\u00ff\3\2\2\2\u0111\u0100\3\2\2\2\u0111\u0101\3\2"+
		"\2\2\u0111\u0102\3\2\2\2\u0111\u0103\3\2\2\2\u0111\u0104\3\2\2\2\u0111"+
		"\u0105\3\2\2\2\u0111\u0106\3\2\2\2\u0111\u0107\3\2\2\2\u0111\u0108\3\2"+
		"\2\2\u0111\u0109\3\2\2\2\u0111\u010a\3\2\2\2\u0111\u010b\3\2\2\2\u0111"+
		"\u010c\3\2\2\2\u0111\u010d\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\5\n\6\2\u0114"+
		"\t\3\2\2\2\u0115\u0116\7\3\2\2\u0116\13\3\2\2\2\u0117\u0118\7 \2\2\u0118"+
		"\u011c\7\u008e\2\2\u0119\u011a\5\u00b2Z\2\u011a\u011b\7\4\2\2\u011b\u011d"+
		"\3\2\2\2\u011c\u0119\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0127\5\u00b4[\2\u011f\u0120\7\u0085\2\2\u0120\u0121\7\u0092\2\2\u0121"+
		"\u0128\5\u00b8]\2\u0122\u0124\7\35\2\2\u0123\u0125\7\60\2\2\u0124\u0123"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\5H%\2\u0127"+
		"\u011f\3\2\2\2\u0127\u0122\3\2\2\2\u0128\r\3\2\2\2\u0129\u0130\7!\2\2"+
		"\u012a\u0131\5\u00b2Z\2\u012b\u0131\5\u00b6\\\2\u012c\u012d\5\u00b2Z\2"+
		"\u012d\u012e\7\4\2\2\u012e\u012f\5\u00b6\\\2\u012f\u0131\3\2\2\2\u0130"+
		"\u012a\3\2\2\2\u0130\u012b\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\17\3\2\2\2\u0132\u0134\7%\2\2\u0133\u0135\7:\2\2\u0134\u0133"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\5P)\2\u0137"+
		"\u0138\7#\2\2\u0138\u0139\5\u00b2Z\2\u0139\21\3\2\2\2\u013a\u013c\7(\2"+
		"\2\u013b\u013d\t\2\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0142"+
		"\3\2\2\2\u013e\u0140\7\u0094\2\2\u013f\u0141\5\u00ceh\2\u0140\u013f\3"+
		"\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u013e\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\23\3\2\2\2\u0144\u0149\t\3\2\2\u0145\u0147\7\u0094"+
		"\2\2\u0146\u0148\5\u00ceh\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u0145\3\2\2\2\u0149\u014a\3\2\2\2\u014a\25\3\2\2"+
		"\2\u014b\u014d\7\u00a1\2\2\u014c\u014e\7\u0080\2\2\u014d\u014c\3\2\2\2"+
		"\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0154\5h\65\2\u0150\u0151"+
		"\7\7\2\2\u0151\u0153\5h\65\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0157\u014b\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015d\5\u0086D\2\u015a\u015b\5\u008aF\2\u015b\u015c\5\u0086D\2\u015c"+
		"\u015e\3\2\2\2\u015d\u015a\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u016b\3\2\2\2\u0161\u0162\7y\2\2\u0162"+
		"\u0163\7*\2\2\u0163\u0168\5d\63\2\u0164\u0165\7\7\2\2\u0165\u0167\5d\63"+
		"\2\u0166\u0164\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u0161\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u0173\3\2\2\2\u016d\u016e\7k\2\2\u016e\u0171\5P)"+
		"\2\u016f\u0170\t\4\2\2\u0170\u0172\5P)\2\u0171\u016f\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u016d\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\27\3\2\2\2\u0175\u0177\7\65\2\2\u0176\u0178\7\u0098\2\2\u0177\u0176\3"+
		"\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017d\7Z\2\2\u017a"+
		"\u017b\7U\2\2\u017b\u017c\7p\2\2\u017c\u017e\7J\2\2\u017d\u017a\3\2\2"+
		"\2\u017d\u017e\3\2\2\2\u017e\u0182\3\2\2\2\u017f\u0180\5\u00b2Z\2\u0180"+
		"\u0181\7\4\2\2\u0181\u0183\3\2\2\2\u0182\u017f\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0185\5\u00c0a\2\u0185\u0186\7w\2\2\u0186"+
		"\u0187\5\u00b4[\2\u0187\u0188\7\5\2\2\u0188\u018d\5\\/\2\u0189\u018a\7"+
		"\7\2\2\u018a\u018c\5\\/\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u018d\3\2"+
		"\2\2\u0190\u0193\7\6\2\2\u0191\u0192\7\u00a0\2\2\u0192\u0194\5P)\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\31\3\2\2\2\u0195\u0197\7\65\2"+
		"\2\u0196\u0198\t\5\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u019d\7\u008e\2\2\u019a\u019b\7U\2\2\u019b\u019c\7p\2\2"+
		"\u019c\u019e\7J\2\2\u019d\u019a\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a2"+
		"\3\2\2\2\u019f\u01a0\5\u00b2Z\2\u01a0\u01a1\7\4\2\2\u01a1\u01a3\3\2\2"+
		"\2\u01a2\u019f\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01bc"+
		"\5\u00b4[\2\u01a5\u01a6\7\5\2\2\u01a6\u01ab\5H%\2\u01a7\u01a8\7\7\2\2"+
		"\u01a8\u01aa\5H%\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01b2\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae"+
		"\u01af\7\7\2\2\u01af\u01b1\5^\60\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2"+
		"\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b5\u01b8\7\6\2\2\u01b6\u01b7\7\u00a2\2\2\u01b7\u01b9"+
		"\7\u00a3\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bd\3\2\2"+
		"\2\u01ba\u01bb\7#\2\2\u01bb\u01bd\5@!\2\u01bc\u01a5\3\2\2\2\u01bc\u01ba"+
		"\3\2\2\2\u01bd\33\3\2\2\2\u01be\u01c0\7\65\2\2\u01bf\u01c1\t\5\2\2\u01c0"+
		"\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c6\7\u0095"+
		"\2\2\u01c3\u01c4\7U\2\2\u01c4\u01c5\7p\2\2\u01c5\u01c7\7J\2\2\u01c6\u01c3"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01cb\3\2\2\2\u01c8\u01c9\5\u00b2Z"+
		"\2\u01c9\u01ca\7\4\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c8\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d2\5\u00c2b\2\u01ce\u01d3\7\'\2"+
		"\2\u01cf\u01d3\7\36\2\2\u01d0\u01d1\7_\2\2\u01d1\u01d3\7t\2\2\u01d2\u01ce"+
		"\3\2\2\2\u01d2\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01e2\3\2\2\2\u01d4\u01e3\7?\2\2\u01d5\u01e3\7^\2\2\u01d6\u01e0\7\u0099"+
		"\2\2\u01d7\u01d8\7t\2\2\u01d8\u01dd\5\u00ba^\2\u01d9\u01da\7\7\2\2\u01da"+
		"\u01dc\5\u00ba^\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\u01d7\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01d4\3\2"+
		"\2\2\u01e2\u01d5\3\2\2\2\u01e2\u01d6\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e8\7w\2\2\u01e5\u01e6\5\u00b2Z\2\u01e6\u01e7\7\4\2\2\u01e7\u01e9\3"+
		"\2\2\2\u01e8\u01e5\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01ee\5\u00b4[\2\u01eb\u01ec\7N\2\2\u01ec\u01ed\7D\2\2\u01ed\u01ef\7"+
		"\u008a\2\2\u01ee\u01eb\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f2\3\2\2\2"+
		"\u01f0\u01f1\7\u009f\2\2\u01f1\u01f3\5P)\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01fd\7(\2\2\u01f5\u01fa\5B\"\2\u01f6"+
		"\u01fa\5\62\32\2\u01f7\u01fa\5\"\22\2\u01f8\u01fa\5@!\2\u01f9\u01f5\3"+
		"\2\2\2\u01f9\u01f6\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01fc\7\3\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01f9\3\2"+
		"\2\2\u01fe\u01ff\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\u0202\7F\2\2\u0202\35\3\2\2\2\u0203\u0205\7\65\2"+
		"\2\u0204\u0206\t\5\2\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207"+
		"\3\2\2\2\u0207\u020b\7\u009d\2\2\u0208\u0209\7U\2\2\u0209\u020a\7p\2\2"+
		"\u020a\u020c\7J\2\2\u020b\u0208\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u0210"+
		"\3\2\2\2\u020d\u020e\5\u00b2Z\2\u020e\u020f\7\4\2\2\u020f\u0211\3\2\2"+
		"\2\u0210\u020d\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213"+
		"\5\u00c4c\2\u0213\u0214\7#\2\2\u0214\u0215\5@!\2\u0215\37\3\2\2\2\u0216"+
		"\u0217\7\65\2\2\u0217\u0218\7\u009e\2\2\u0218\u021c\7\u008e\2\2\u0219"+
		"\u021a\7U\2\2\u021a\u021b\7p\2\2\u021b\u021d\7J\2\2\u021c\u0219\3\2\2"+
		"\2\u021c\u021d\3\2\2\2\u021d\u0221\3\2\2\2\u021e\u021f\5\u00b2Z\2\u021f"+
		"\u0220\7\4\2\2\u0220\u0222\3\2\2\2\u0221\u021e\3\2\2\2\u0221\u0222\3\2"+
		"\2\2\u0222\u0223\3\2\2\2\u0223\u0224\5\u00b4[\2\u0224\u0225\7\u009a\2"+
		"\2\u0225\u0231\5\u00c6d\2\u0226\u0227\7\5\2\2\u0227\u022c\5\u0096L\2\u0228"+
		"\u0229\7\7\2\2\u0229\u022b\5\u0096L\2\u022a\u0228\3\2\2\2\u022b\u022e"+
		"\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022f\u0230\7\6\2\2\u0230\u0232\3\2\2\2\u0231\u0226\3\2"+
		"\2\2\u0231\u0232\3\2\2\2\u0232!\3\2\2\2\u0233\u0235\5`\61\2\u0234\u0233"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\7?\2\2\u0237"+
		"\u023a\5&\24\2\u0238\u0239\7\u00a0\2\2\u0239\u023b\5P)\2\u023a\u0238\3"+
		"\2\2\2\u023a\u023b\3\2\2\2\u023b#\3\2\2\2\u023c\u023e\5`\61\2\u023d\u023c"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\7?\2\2\u0240"+
		"\u0243\5&\24\2\u0241\u0242\7\u00a0\2\2\u0242\u0244\5P)\2\u0243\u0241\3"+
		"\2\2\2\u0243\u0244\3\2\2\2\u0244\u0257\3\2\2\2\u0245\u0246\7y\2\2\u0246"+
		"\u0247\7*\2\2\u0247\u024c\5d\63\2\u0248\u0249\7\7\2\2\u0249\u024b\5d\63"+
		"\2\u024a\u0248\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d"+
		"\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0245\3\2\2\2\u024f"+
		"\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\7k\2\2\u0252\u0255\5P)"+
		"\2\u0253\u0254\t\4\2\2\u0254\u0256\5P)\2\u0255\u0253\3\2\2\2\u0255\u0256"+
		"\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u024f\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"%\3\2\2\2\u0259\u025a\7P\2\2\u025a\u025b\5b\62\2\u025b\'\3\2\2\2\u025c"+
		"\u025e\7A\2\2\u025d\u025f\7:\2\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2"+
		"\2\u025f\u0260\3\2\2\2\u0260\u0261\5\u00b2Z\2\u0261)\3\2\2\2\u0262\u0263"+
		"\7C\2\2\u0263\u0266\7Z\2\2\u0264\u0265\7U\2\2\u0265\u0267\7J\2\2\u0266"+
		"\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u026b\3\2\2\2\u0268\u0269\5\u00b2"+
		"Z\2\u0269\u026a\7\4\2\2\u026a\u026c\3\2\2\2\u026b\u0268\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\5\u00c0a\2\u026e+\3\2\2"+
		"\2\u026f\u0270\7C\2\2\u0270\u0273\7\u008e\2\2\u0271\u0272\7U\2\2\u0272"+
		"\u0274\7J\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0278\3\2"+
		"\2\2\u0275\u0276\5\u00b2Z\2\u0276\u0277\7\4\2\2\u0277\u0279\3\2\2\2\u0278"+
		"\u0275\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\5\u00b4"+
		"[\2\u027b-\3\2\2\2\u027c\u027d\7C\2\2\u027d\u0280\7\u0095\2\2\u027e\u027f"+
		"\7U\2\2\u027f\u0281\7J\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0285\3\2\2\2\u0282\u0283\5\u00b2Z\2\u0283\u0284\7\4\2\2\u0284\u0286"+
		"\3\2\2\2\u0285\u0282\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u0288\5\u00c2b\2\u0288/\3\2\2\2\u0289\u028a\7C\2\2\u028a\u028d\7\u009d"+
		"\2\2\u028b\u028c\7U\2\2\u028c\u028e\7J\2\2\u028d\u028b\3\2\2\2\u028d\u028e"+
		"\3\2\2\2\u028e\u0292\3\2\2\2\u028f\u0290\5\u00b2Z\2\u0290\u0291\7\4\2"+
		"\2\u0291\u0293\3\2\2\2\u0292\u028f\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294"+
		"\3\2\2\2\u0294\u0295\5\u00c4c\2\u0295\61\3\2\2\2\u0296\u0298\5`\61\2\u0297"+
		"\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u02aa\3\2\2\2\u0299\u02ab\7^"+
		"\2\2\u029a\u02ab\7\u0086\2\2\u029b\u029c\7^\2\2\u029c\u029d\7x\2\2\u029d"+
		"\u02ab\7\u0086\2\2\u029e\u029f\7^\2\2\u029f\u02a0\7x\2\2\u02a0\u02ab\7"+
		"\u0089\2\2\u02a1\u02a2\7^\2\2\u02a2\u02a3\7x\2\2\u02a3\u02ab\7\33\2\2"+
		"\u02a4\u02a5\7^\2\2\u02a5\u02a6\7x\2\2\u02a6\u02ab\7M\2\2\u02a7\u02a8"+
		"\7^\2\2\u02a8\u02a9\7x\2\2\u02a9\u02ab\7W\2\2\u02aa\u0299\3\2\2\2\u02aa"+
		"\u029a\3\2\2\2\u02aa\u029b\3\2\2\2\u02aa\u029e\3\2\2\2\u02aa\u02a1\3\2"+
		"\2\2\u02aa\u02a4\3\2\2\2\u02aa\u02a7\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02b0\7a\2\2\u02ad\u02ae\5\u00b2Z\2\u02ae\u02af\7\4\2\2\u02af\u02b1\3"+
		"\2\2\2\u02b0\u02ad\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"\u02be\5\u00b4[\2\u02b3\u02b4\7\5\2\2\u02b4\u02b9\5\u00ba^\2\u02b5\u02b6"+
		"\7\7\2\2\u02b6\u02b8\5\u00ba^\2\u02b7\u02b5\3\2\2\2\u02b8\u02bb\3\2\2"+
		"\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02b9"+
		"\3\2\2\2\u02bc\u02bd\7\6\2\2\u02bd\u02bf\3\2\2\2\u02be\u02b3\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02df\3\2\2\2\u02c0\u02c1\7\u009c\2\2\u02c1\u02c2"+
		"\7\5\2\2\u02c2\u02c7\5P)\2\u02c3\u02c4\7\7\2\2\u02c4\u02c6\5P)\2\u02c5"+
		"\u02c3\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2"+
		"\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02d9\7\6\2\2\u02cb"+
		"\u02cc\7\7\2\2\u02cc\u02cd\7\5\2\2\u02cd\u02d2\5P)\2\u02ce\u02cf\7\7\2"+
		"\2\u02cf\u02d1\5P)\2\u02d0\u02ce\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0"+
		"\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5"+
		"\u02d6\7\6\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02cb\3\2\2\2\u02d8\u02db\3\2"+
		"\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02e0\3\2\2\2\u02db"+
		"\u02d9\3\2\2\2\u02dc\u02e0\5@!\2\u02dd\u02de\7<\2\2\u02de\u02e0\7\u009c"+
		"\2\2\u02df\u02c0\3\2\2\2\u02df\u02dc\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0"+
		"\63\3\2\2\2\u02e1\u02e5\7|\2\2\u02e2\u02e3\5\u00b2Z\2\u02e3\u02e4\7\4"+
		"\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02e2\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02ee\5\u00c8e\2\u02e8\u02e9\7\b\2\2\u02e9\u02ef"+
		"\5f\64\2\u02ea\u02eb\7\5\2\2\u02eb\u02ec\5f\64\2\u02ec\u02ed\7\6\2\2\u02ed"+
		"\u02ef\3\2\2\2\u02ee\u02e8\3\2\2\2\u02ee\u02ea\3\2\2\2\u02ee\u02ef\3\2"+
		"\2\2\u02ef\65\3\2\2\2\u02f0\u02fb\7\u0083\2\2\u02f1\u02fc\5\u00bc_\2\u02f2"+
		"\u02f3\5\u00b2Z\2\u02f3\u02f4\7\4\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02f2"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02fa\5\u00b4["+
		"\2\u02f8\u02fa\5\u00c0a\2\u02f9\u02f7\3\2\2\2\u02f9\u02f8\3\2\2\2\u02fa"+
		"\u02fc\3\2\2\2\u02fb\u02f1\3\2\2\2\u02fb\u02f5\3\2\2\2\u02fb\u02fc\3\2"+
		"\2\2\u02fc\67\3\2\2\2\u02fd\u02ff\7\u0084\2\2\u02fe\u0300\7\u008b\2\2"+
		"\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302"+
		"\5\u00caf\2\u03029\3\2\2\2\u0303\u0308\7\u0089\2\2\u0304\u0306\7\u0094"+
		"\2\2\u0305\u0307\5\u00ceh\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\u0309\3\2\2\2\u0308\u0304\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030f\3\2"+
		"\2\2\u030a\u030c\7\u0092\2\2\u030b\u030d\7\u008b\2\2\u030c\u030b\3\2\2"+
		"\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0310\5\u00caf\2\u030f"+
		"\u030a\3\2\2\2\u030f\u0310\3\2\2\2\u0310;\3\2\2\2\u0311\u0312\7\u008b"+
		"\2\2\u0312\u0313\5\u00caf\2\u0313=\3\2\2\2\u0314\u0316\7\u00a1\2\2\u0315"+
		"\u0317\7\u0080\2\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318"+
		"\3\2\2\2\u0318\u031d\5h\65\2\u0319\u031a\7\7\2\2\u031a\u031c\5h\65\2\u031b"+
		"\u0319\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2"+
		"\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0314\3\2\2\2\u0320"+
		"\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u032d\5\u0086D\2\u0323\u0324"+
		"\7y\2\2\u0324\u0325\7*\2\2\u0325\u032a\5d\63\2\u0326\u0327\7\7\2\2\u0327"+
		"\u0329\5d\63\2\u0328\u0326\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2"+
		"\2\2\u032a\u032b\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032d"+
		"\u0323\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0335\3\2\2\2\u032f\u0330\7k"+
		"\2\2\u0330\u0333\5P)\2\u0331\u0332\t\4\2\2\u0332\u0334\5P)\2\u0333\u0331"+
		"\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335\u032f\3\2\2\2\u0335"+
		"\u0336\3\2\2\2\u0336?\3\2\2\2\u0337\u0342\5\u0086D\2\u0338\u0339\7y\2"+
		"\2\u0339\u033a\7*\2\2\u033a\u033f\5d\63\2\u033b\u033c\7\7\2\2\u033c\u033e"+
		"\5d\63\2\u033d\u033b\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f"+
		"\u0340\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0338\3\2"+
		"\2\2\u0342\u0343\3\2\2\2\u0343\u034a\3\2\2\2\u0344\u0345\7k\2\2\u0345"+
		"\u0348\5P)\2\u0346\u0347\t\4\2\2\u0347\u0349\5P)\2\u0348\u0346\3\2\2\2"+
		"\u0348\u0349\3\2\2\2\u0349\u034b\3\2\2\2\u034a\u0344\3\2\2\2\u034a\u034b"+
		"\3\2\2\2\u034bA\3\2\2\2\u034c\u034e\5`\61\2\u034d\u034c\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u035a\7\u0099\2\2\u0350\u0351"+
		"\7x\2\2\u0351\u035b\7\u0089\2\2\u0352\u0353\7x\2\2\u0353\u035b\7\33\2"+
		"\2\u0354\u0355\7x\2\2\u0355\u035b\7\u0086\2\2\u0356\u0357\7x\2\2\u0357"+
		"\u035b\7M\2\2\u0358\u0359\7x\2\2\u0359\u035b\7W\2\2\u035a\u0350\3\2\2"+
		"\2\u035a\u0352\3\2\2\2\u035a\u0354\3\2\2\2\u035a\u0356\3\2\2\2\u035a\u0358"+
		"\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\5b\62\2\u035d"+
		"\u035e\7\u008d\2\2\u035e\u035f\5\u00ba^\2\u035f\u0360\7\b\2\2\u0360\u0368"+
		"\5P)\2\u0361\u0362\7\7\2\2\u0362\u0363\5\u00ba^\2\u0363\u0364\7\b\2\2"+
		"\u0364\u0365\5P)\2\u0365\u0367\3\2\2\2\u0366\u0361\3\2\2\2\u0367\u036a"+
		"\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036d\3\2\2\2\u036a"+
		"\u0368\3\2\2\2\u036b\u036c\7\u00a0\2\2\u036c\u036e\5P)\2\u036d\u036b\3"+
		"\2\2\2\u036d\u036e\3\2\2\2\u036eC\3\2\2\2\u036f\u0371\5`\61\2\u0370\u036f"+
		"\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u037d\7\u0099\2"+
		"\2\u0373\u0374\7x\2\2\u0374\u037e\7\u0089\2\2\u0375\u0376\7x\2\2\u0376"+
		"\u037e\7\33\2\2\u0377\u0378\7x\2\2\u0378\u037e\7\u0086\2\2\u0379\u037a"+
		"\7x\2\2\u037a\u037e\7M\2\2\u037b\u037c\7x\2\2\u037c\u037e\7W\2\2\u037d"+
		"\u0373\3\2\2\2\u037d\u0375\3\2\2\2\u037d\u0377\3\2\2\2\u037d\u0379\3\2"+
		"\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f\3\2\2\2\u037f"+
		"\u0380\5b\62\2\u0380\u0381\7\u008d\2\2\u0381\u0382\5\u00ba^\2\u0382\u0383"+
		"\7\b\2\2\u0383\u038b\5P)\2\u0384\u0385\7\7\2\2\u0385\u0386\5\u00ba^\2"+
		"\u0386\u0387\7\b\2\2\u0387\u0388\5P)\2\u0388\u038a\3\2\2\2\u0389\u0384"+
		"\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u0390\3\2\2\2\u038d\u038b\3\2\2\2\u038e\u038f\7\u00a0\2\2\u038f\u0391"+
		"\5P)\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u03a4\3\2\2\2\u0392"+
		"\u0393\7y\2\2\u0393\u0394\7*\2\2\u0394\u0399\5d\63\2\u0395\u0396\7\7\2"+
		"\2\u0396\u0398\5d\63\2\u0397\u0395\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397"+
		"\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039d\3\2\2\2\u039b\u0399\3\2\2\2\u039c"+
		"\u0392\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\7k"+
		"\2\2\u039f\u03a2\5P)\2\u03a0\u03a1\t\4\2\2\u03a1\u03a3\5P)\2\u03a2\u03a0"+
		"\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u039c\3\2\2\2\u03a4"+
		"\u03a5\3\2\2\2\u03a5E\3\2\2\2\u03a6\u03a7\7\u009b\2\2\u03a7G\3\2\2\2\u03a8"+
		"\u03aa\5\u00ba^\2\u03a9\u03ab\5J&\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3"+
		"\2\2\2\u03ab\u03af\3\2\2\2\u03ac\u03ae\5L\'\2\u03ad\u03ac\3\2\2\2\u03ae"+
		"\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0I\3\2\2\2"+
		"\u03b1\u03af\3\2\2\2\u03b2\u03b4\5\u009cO\2\u03b3\u03b2\3\2\2\2\u03b4"+
		"\u03b5\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03c1\3\2"+
		"\2\2\u03b7\u03b8\7\5\2\2\u03b8\u03b9\5\u008eH\2\u03b9\u03ba\7\6\2\2\u03ba"+
		"\u03c2\3\2\2\2\u03bb\u03bc\7\5\2\2\u03bc\u03bd\5\u008eH\2\u03bd\u03be"+
		"\7\7\2\2\u03be\u03bf\5\u008eH\2\u03bf\u03c0\7\6\2\2\u03c0\u03c2\3\2\2"+
		"\2\u03c1\u03b7\3\2\2\2\u03c1\u03bb\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2K"+
		"\3\2\2\2\u03c3\u03c4\7\63\2\2\u03c4\u03c6\5\u009cO\2\u03c5\u03c3\3\2\2"+
		"\2\u03c5\u03c6\3\2\2\2\u03c6\u03e8\3\2\2\2\u03c7\u03c8\7}\2\2\u03c8\u03ca"+
		"\7h\2\2\u03c9\u03cb\t\6\2\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc\u03ce\5N(\2\u03cd\u03cf\7&\2\2\u03ce\u03cd\3\2\2"+
		"\2\u03ce\u03cf\3\2\2\2\u03cf\u03e9\3\2\2\2\u03d0\u03d2\7p\2\2\u03d1\u03d0"+
		"\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\7s\2\2\u03d4"+
		"\u03e9\5N(\2\u03d5\u03d6\7\u0098\2\2\u03d6\u03e9\5N(\2\u03d7\u03d8\7."+
		"\2\2\u03d8\u03d9\7\5\2\2\u03d9\u03da\5P)\2\u03da\u03db\7\6\2\2\u03db\u03e9"+
		"\3\2\2\2\u03dc\u03e3\7<\2\2\u03dd\u03e4\5\u008eH\2\u03de\u03e4\5\u0090"+
		"I\2\u03df\u03e0\7\5\2\2\u03e0\u03e1\5P)\2\u03e1\u03e2\7\6\2\2\u03e2\u03e4"+
		"\3\2\2\2\u03e3\u03dd\3\2\2\2\u03e3\u03de\3\2\2\2\u03e3\u03df\3\2\2\2\u03e4"+
		"\u03e9\3\2\2\2\u03e5\u03e6\7/\2\2\u03e6\u03e9\5\u00bc_\2\u03e7\u03e9\5"+
		"X-\2\u03e8\u03c7\3\2\2\2\u03e8\u03d1\3\2\2\2\u03e8\u03d5\3\2\2\2\u03e8"+
		"\u03d7\3\2\2\2\u03e8\u03dc\3\2\2\2\u03e8\u03e5\3\2\2\2\u03e8\u03e7\3\2"+
		"\2\2\u03e9M\3\2\2\2\u03ea\u03eb\7w\2\2\u03eb\u03ec\7\62\2\2\u03ec\u03ee"+
		"\t\7\2\2\u03ed\u03ea\3\2\2\2\u03ed\u03ee\3\2\2\2\u03eeO\3\2\2\2\u03ef"+
		"\u03f0\b)\1\2\u03f0\u0422\5\u0090I\2\u03f1\u0422\7\u00a5\2\2\u03f2\u0422"+
		"\5R*\2\u03f3\u03f4\5\u0092J\2\u03f4\u03f5\5P)\27\u03f5\u0422\3\2\2\2\u03f6"+
		"\u0422\5\u009eP\2\u03f7\u0422\5\u00a0Q\2\u03f8\u03f9\7\5\2\2\u03f9\u03fa"+
		"\5P)\2\u03fa\u03fb\7\6\2\2\u03fb\u0422\3\2\2\2\u03fc\u03fd\7-\2\2\u03fd"+
		"\u03fe\7\5\2\2\u03fe\u03ff\5P)\2\u03ff\u0400\7#\2\2\u0400\u0401\5J&\2"+
		"\u0401\u0402\7\6\2\2\u0402\u0422\3\2\2\2\u0403\u0405\7p\2\2\u0404\u0403"+
		"\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0408\7J\2\2\u0407"+
		"\u0404\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\7\5"+
		"\2\2\u040a\u040b\5@!\2\u040b\u040c\7\6\2\2\u040c\u0422\3\2\2\2\u040d\u040f"+
		"\7,\2\2\u040e\u0410\5P)\2\u040f\u040e\3\2\2\2\u040f\u0410\3\2\2\2\u0410"+
		"\u0416\3\2\2\2\u0411\u0412\7\u009f\2\2\u0412\u0413\5P)\2\u0413\u0414\7"+
		"\u0091\2\2\u0414\u0415\5P)\2\u0415\u0417\3\2\2\2\u0416\u0411\3\2\2\2\u0417"+
		"\u0418\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041c\3\2"+
		"\2\2\u041a\u041b\7E\2\2\u041b\u041d\5P)\2\u041c\u041a\3\2\2\2\u041c\u041d"+
		"\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\7F\2\2\u041f\u0422\3\2\2\2\u0420"+
		"\u0422\5Z.\2\u0421\u03ef\3\2\2\2\u0421\u03f1\3\2\2\2\u0421\u03f2\3\2\2"+
		"\2\u0421\u03f3\3\2\2\2\u0421\u03f6\3\2\2\2\u0421\u03f7\3\2\2\2\u0421\u03f8"+
		"\3\2\2\2\u0421\u03fc\3\2\2\2\u0421\u0407\3\2\2\2\u0421\u040d\3\2\2\2\u0421"+
		"\u0420\3\2\2\2\u0422\u0479\3\2\2\2\u0423\u0424\f\26\2\2\u0424\u0425\7"+
		"\r\2\2\u0425\u0478\5P)\27\u0426\u0427\f\25\2\2\u0427\u0428\t\b\2\2\u0428"+
		"\u0478\5P)\26\u0429\u042a\f\24\2\2\u042a\u042b\t\t\2\2\u042b\u0478\5P"+
		")\25\u042c\u042d\f\23\2\2\u042d\u042e\t\n\2\2\u042e\u0478\5P)\24\u042f"+
		"\u0430\f\22\2\2\u0430\u0431\t\13\2\2\u0431\u0478\5P)\23\u0432\u0433\f"+
		"\21\2\2\u0433\u0434\5V,\2\u0434\u0435\5P)\22\u0435\u0478\3\2\2\2\u0436"+
		"\u0437\f\20\2\2\u0437\u0438\5\u00a6T\2\u0438\u0439\5P)\21\u0439\u0478"+
		"\3\2\2\2\u043a\u043b\f\b\2\2\u043b\u043d\7b\2\2\u043c\u043e\7p\2\2\u043d"+
		"\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0478\5P"+
		")\t\u0440\u0442\f\7\2\2\u0441\u0443\7p\2\2\u0442\u0441\3\2\2\2\u0442\u0443"+
		"\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445\7)\2\2\u0445\u0446\5P)\2\u0446"+
		"\u0447\7\"\2\2\u0447\u0448\5P)\b\u0448\u0478\3\2\2\2\u0449\u044a\f\13"+
		"\2\2\u044a\u044b\7/\2\2\u044b\u0478\5\u00bc_\2\u044c\u044e\f\n\2\2\u044d"+
		"\u044f\7p\2\2\u044e\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0450\3\2"+
		"\2\2\u0450\u0451\t\f\2\2\u0451\u0454\5P)\2\u0452\u0453\7G\2\2\u0453\u0455"+
		"\5P)\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0478\3\2\2\2\u0456"+
		"\u045b\f\t\2\2\u0457\u045c\7e\2\2\u0458\u045c\7r\2\2\u0459\u045a\7p\2"+
		"\2\u045a\u045c\7s\2\2\u045b\u0457\3\2\2\2\u045b\u0458\3\2\2\2\u045b\u0459"+
		"\3\2\2\2\u045c\u0478\3\2\2\2\u045d\u045f\f\6\2\2\u045e\u0460\7p\2\2\u045f"+
		"\u045e\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0475\7Y"+
		"\2\2\u0462\u046c\7\5\2\2\u0463\u046d\5@!\2\u0464\u0469\5P)\2\u0465\u0466"+
		"\7\7\2\2\u0466\u0468\5P)\2\u0467\u0465\3\2\2\2\u0468\u046b\3\2\2\2\u0469"+
		"\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046d\3\2\2\2\u046b\u0469\3\2"+
		"\2\2\u046c\u0463\3\2\2\2\u046c\u0464\3\2\2\2\u046c\u046d\3\2\2\2\u046d"+
		"\u046e\3\2\2\2\u046e\u0476\7\6\2\2\u046f\u0470\5\u00b2Z\2\u0470\u0471"+
		"\7\4\2\2\u0471\u0473\3\2\2\2\u0472\u046f\3\2\2\2\u0472\u0473\3\2\2\2\u0473"+
		"\u0474\3\2\2\2\u0474\u0476\5\u00b4[\2\u0475\u0462\3\2\2\2\u0475\u0472"+
		"\3\2\2\2\u0476\u0478\3\2\2\2\u0477\u0423\3\2\2\2\u0477\u0426\3\2\2\2\u0477"+
		"\u0429\3\2\2\2\u0477\u042c\3\2\2\2\u0477\u042f\3\2\2\2\u0477\u0432\3\2"+
		"\2\2\u0477\u0436\3\2\2\2\u0477\u043a\3\2\2\2\u0477\u0440\3\2\2\2\u0477"+
		"\u0449\3\2\2\2\u0477\u044c\3\2\2\2\u0477\u0456\3\2\2\2\u0477\u045d\3\2"+
		"\2\2\u0478\u047b\3\2\2\2\u0479\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047a"+
		"Q\3\2\2\2\u047b\u0479\3\2\2\2\u047c\u048f\3\2\2\2\u047d\u047e\5\u00b2"+
		"Z\2\u047e\u047f\7\4\2\2\u047f\u0481\3\2\2\2\u0480\u047d\3\2\2\2\u0480"+
		"\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\5\u00b4[\2\u0483\u0484"+
		"\7\4\2\2\u0484\u0486\3\2\2\2\u0485\u0480\3\2\2\2\u0485\u0486\3\2\2\2\u0486"+
		"\u0487\3\2\2\2\u0487\u048c\5\u00ba^\2\u0488\u048a\7#\2\2\u0489\u0488\3"+
		"\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048d\5\u0098M\2"+
		"\u048c\u0489\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048f\3\2\2\2\u048e\u047c"+
		"\3\2\2\2\u048e\u0485\3\2\2\2\u048fS\3\2\2\2\u0490\u04a6\3\2\2\2\u0491"+
		"\u0492\5\u00b2Z\2\u0492\u0493\7\4\2\2\u0493\u0495\3\2\2\2\u0494\u0491"+
		"\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0497\5\u00b4["+
		"\2\u0497\u0498\7\4\2\2\u0498\u049a\3\2\2\2\u0499\u0494\3\2\2\2\u0499\u049a"+
		"\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049d\5\u00ba^\2\u049c\u049e\5l\67"+
		"\2\u049d\u049c\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a3\3\2\2\2\u049f\u04a1"+
		"\7#\2\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u04a4\5\u0098M\2\u04a3\u04a0\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a6"+
		"\3\2\2\2\u04a5\u0490\3\2\2\2\u04a5\u0499\3\2\2\2\u04a6U\3\2\2\2\u04a7"+
		"\u04b4\7\b\2\2\u04a8\u04b4\7\30\2\2\u04a9\u04b4\7\31\2\2\u04aa\u04b4\7"+
		"\32\2\2\u04ab\u04b4\7b\2\2\u04ac\u04ad\7b\2\2\u04ad\u04b4\7p\2\2\u04ae"+
		"\u04b4\5\u00aaV\2\u04af\u04b4\5\u00acW\2\u04b0\u04b4\7R\2\2\u04b1\u04b4"+
		"\7l\2\2\u04b2\u04b4\7\u0082\2\2\u04b3\u04a7\3\2\2\2\u04b3\u04a8\3\2\2"+
		"\2\u04b3\u04a9\3\2\2\2\u04b3\u04aa\3\2\2\2\u04b3\u04ab\3\2\2\2\u04b3\u04ac"+
		"\3\2\2\2\u04b3\u04ae\3\2\2\2\u04b3\u04af\3\2\2\2\u04b3\u04b0\3\2\2\2\u04b3"+
		"\u04b1\3\2\2\2\u04b3\u04b2\3\2\2\2\u04b4W\3\2\2\2\u04b5\u04b6\7\u0081"+
		"\2\2\u04b6\u04c2\5\u00be`\2\u04b7\u04b8\7\5\2\2\u04b8\u04bd\5\u00ba^\2"+
		"\u04b9\u04ba\7\7\2\2\u04ba\u04bc\5\u00ba^\2\u04bb\u04b9\3\2\2\2\u04bc"+
		"\u04bf\3\2\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c0\3\2"+
		"\2\2\u04bf\u04bd\3\2\2\2\u04c0\u04c1\7\6\2\2\u04c1\u04c3\3\2\2\2\u04c2"+
		"\u04b7\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04d6\3\2\2\2\u04c4\u04c5\7w"+
		"\2\2\u04c5\u04ce\t\r\2\2\u04c6\u04c7\7\u008d\2\2\u04c7\u04cf\7s\2\2\u04c8"+
		"\u04c9\7\u008d\2\2\u04c9\u04cf\7<\2\2\u04ca\u04cf\7+\2\2\u04cb\u04cf\7"+
		"\u0087\2\2\u04cc\u04cd\7o\2\2\u04cd\u04cf\7\34\2\2\u04ce\u04c6\3\2\2\2"+
		"\u04ce\u04c8\3\2\2\2\u04ce\u04ca\3\2\2\2\u04ce\u04cb\3\2\2\2\u04ce\u04cc"+
		"\3\2\2\2\u04cf\u04d3\3\2\2\2\u04d0\u04d1\7l\2\2\u04d1\u04d3\5\u009cO\2"+
		"\u04d2\u04c4\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d3\u04d5\3\2\2\2\u04d4\u04d2"+
		"\3\2\2\2\u04d5\u04d8\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7"+
		"\u04e3\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d9\u04db\7p\2\2\u04da\u04d9\3\2"+
		"\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04e1\7=\2\2\u04dd"+
		"\u04de\7\\\2\2\u04de\u04e2\7>\2\2\u04df\u04e0\7\\\2\2\u04e0\u04e2\7X\2"+
		"\2\u04e1\u04dd\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e4"+
		"\3\2\2\2\u04e3\u04da\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4Y\3\2\2\2\u04e5"+
		"\u04e6\7\177\2\2\u04e6\u04eb\7\5\2\2\u04e7\u04ec\7W\2\2\u04e8\u04e9\t"+
		"\16\2\2\u04e9\u04ea\7\7\2\2\u04ea\u04ec\5\u0094K\2\u04eb\u04e7\3\2\2\2"+
		"\u04eb\u04e8\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee\7\6\2\2\u04ee[\3"+
		"\2\2\2\u04ef\u04f2\5\u00ba^\2\u04f0\u04f1\7/\2\2\u04f1\u04f3\5\u00bc_"+
		"\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f5\3\2\2\2\u04f4\u04f6"+
		"\t\6\2\2\u04f5\u04f4\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6]\3\2\2\2\u04f7"+
		"\u04f8\7\63\2\2\u04f8\u04fa\5\u009cO\2\u04f9\u04f7\3\2\2\2\u04f9\u04fa"+
		"\3\2\2\2\u04fa\u051f\3\2\2\2\u04fb\u04fc\7}\2\2\u04fc\u04ff\7h\2\2\u04fd"+
		"\u04ff\7\u0098\2\2\u04fe\u04fb\3\2\2\2\u04fe\u04fd\3\2\2\2\u04ff\u0500"+
		"\3\2\2\2\u0500\u0501\7\5\2\2\u0501\u0506\5\\/\2\u0502\u0503\7\7\2\2\u0503"+
		"\u0505\5\\/\2\u0504\u0502\3\2\2\2\u0505\u0508\3\2\2\2\u0506\u0504\3\2"+
		"\2\2\u0506\u0507\3\2\2\2\u0507\u0509\3\2\2\2\u0508\u0506\3\2\2\2\u0509"+
		"\u050a\7\6\2\2\u050a\u050b\5N(\2\u050b\u0520\3\2\2\2\u050c\u050d\7.\2"+
		"\2\u050d\u050e\7\5\2\2\u050e\u050f\5P)\2\u050f\u0510\7\6\2\2\u0510\u0520"+
		"\3\2\2\2\u0511\u0512\7O\2\2\u0512\u0513\7h\2\2\u0513\u0514\7\5\2\2\u0514"+
		"\u0519\5\u00ba^\2\u0515\u0516\7\7\2\2\u0516\u0518\5\u00ba^\2\u0517\u0515"+
		"\3\2\2\2\u0518\u051b\3\2\2\2\u0519\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a"+
		"\u051c\3\2\2\2\u051b\u0519\3\2\2\2\u051c\u051d\7\6\2\2\u051d\u051e\5X"+
		"-\2\u051e\u0520\3\2\2\2\u051f\u04fe\3\2\2\2\u051f\u050c\3\2\2\2\u051f"+
		"\u0511\3\2\2\2\u0520_\3\2\2\2\u0521\u0523\7\u00a1\2\2\u0522\u0524\7\u0080"+
		"\2\2\u0523\u0522\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0525\3\2\2\2\u0525"+
		"\u0526\5\u008cG\2\u0526\u0527\7#\2\2\u0527\u0528\7\5\2\2\u0528\u0529\5"+
		"@!\2\u0529\u0533\7\6\2\2\u052a\u052b\7\7\2\2\u052b\u052c\5\u008cG\2\u052c"+
		"\u052d\7#\2\2\u052d\u052e\7\5\2\2\u052e\u052f\5@!\2\u052f\u0530\7\6\2"+
		"\2\u0530\u0532\3\2\2\2\u0531\u052a\3\2\2\2\u0532\u0535\3\2\2\2\u0533\u0531"+
		"\3\2\2\2\u0533\u0534\3\2\2\2\u0534a\3\2\2\2\u0535\u0533\3\2\2\2\u0536"+
		"\u0537\5\u00b2Z\2\u0537\u0538\7\4\2\2\u0538\u053a\3\2\2\2\u0539\u0536"+
		"\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u0541\5\u00b4["+
		"\2\u053c\u053d\7[\2\2\u053d\u053e\7*\2\2\u053e\u0542\5\u00c0a\2\u053f"+
		"\u0540\7p\2\2\u0540\u0542\7[\2\2\u0541\u053c\3\2\2\2\u0541\u053f\3\2\2"+
		"\2\u0541\u0542\3\2\2\2\u0542c\3\2\2\2\u0543\u0546\5P)\2\u0544\u0545\7"+
		"/\2\2\u0545\u0547\5\u00bc_\2\u0546\u0544\3\2\2\2\u0546\u0547\3\2\2\2\u0547"+
		"\u0549\3\2\2\2\u0548\u054a\t\6\2\2\u0549\u0548\3\2\2\2\u0549\u054a\3\2"+
		"\2\2\u054ae\3\2\2\2\u054b\u054f\5\u008eH\2\u054c\u054f\5\u009cO\2\u054d"+
		"\u054f\7\u00a6\2\2\u054e\u054b\3\2\2\2\u054e\u054c\3\2\2\2\u054e\u054d"+
		"\3\2\2\2\u054fg\3\2\2\2\u0550\u055c\5\u00b4[\2\u0551\u0552\7\5\2\2\u0552"+
		"\u0557\5\u00ba^\2\u0553\u0554\7\7\2\2\u0554\u0556\5\u00ba^\2\u0555\u0553"+
		"\3\2\2\2\u0556\u0559\3\2\2\2\u0557\u0555\3\2\2\2\u0557\u0558\3\2\2\2\u0558"+
		"\u055a\3\2\2\2\u0559\u0557\3\2\2\2\u055a\u055b\7\6\2\2\u055b\u055d\3\2"+
		"\2\2\u055c\u0551\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\3\2\2\2\u055e"+
		"\u055f\7#\2\2\u055f\u0560\7\5\2\2\u0560\u0561\5@!\2\u0561\u0562\7\6\2"+
		"\2\u0562i\3\2\2\2\u0563\u056c\7\t\2\2\u0564\u0565\5\u00b4[\2\u0565\u0566"+
		"\7\4\2\2\u0566\u0567\7\t\2\2\u0567\u056c\3\2\2\2\u0568\u056c\5T+\2\u0569"+
		"\u056c\5\u009eP\2\u056a\u056c\5\u00a0Q\2\u056b\u0563\3\2\2\2\u056b\u0564"+
		"\3\2\2\2\u056b\u0568\3\2\2\2\u056b\u0569\3\2\2\2\u056b\u056a\3\2\2\2\u056c"+
		"k\3\2\2\2\u056d\u056e\7\24\2\2\u056e\u0570\7V\2\2\u056f\u0571\5n8\2\u0570"+
		"\u056f\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0577\7\26"+
		"\2\2\u0573\u0574\7\24\2\2\u0574\u0575\7q\2\2\u0575\u0577\7\26\2\2\u0576"+
		"\u056d\3\2\2\2\u0576\u0573\3\2\2\2\u0577m\3\2\2\2\u0578\u057a\5r:\2\u0579"+
		"\u0578\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057c\3\2\2\2\u057b\u057d\5t"+
		";\2\u057c\u057b\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057f\3\2\2\2\u057e"+
		"\u0580\5z>\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0582\3\2\2"+
		"\2\u0581\u0583\5p9\2\u0582\u0581\3\2\2\2\u0582\u0583\3\2\2\2\u0583o\3"+
		"\2\2\2\u0584\u0585\7f\2\2\u0585q\3\2\2\2\u0586\u0587\7d\2\2\u0587\u0588"+
		"\7\b\2\2\u0588\u0589\t\17\2\2\u0589s\3\2\2\2\u058a\u058c\7;\2\2\u058b"+
		"\u058d\5x=\2\u058c\u058b\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u0591\3\2\2"+
		"\2\u058e\u058f\7\u0093\2\2\u058f\u0590\7*\2\2\u0590\u0592\5v<\2\u0591"+
		"\u058e\3\2\2\2\u0591\u0592\3\2\2\2\u0592u\3\2\2\2\u0593\u05a0\3\2\2\2"+
		"\u0594\u0595\5\u00b2Z\2\u0595\u0596\7\4\2\2\u0596\u0598\3\2\2\2\u0597"+
		"\u0594\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059a\5\u00b4"+
		"[\2\u059a\u059b\7\4\2\2\u059b\u059d\3\2\2\2\u059c\u0597\3\2\2\2\u059c"+
		"\u059d\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u05a0\5\u00ba^\2\u059f\u0593"+
		"\3\2\2\2\u059f\u059c\3\2\2\2\u05a0w\3\2\2\2\u05a1\u05a2\7c\2\2\u05a2y"+
		"\3\2\2\2\u05a3\u05a6\7v\2\2\u05a4\u05a5\7\b\2\2\u05a5\u05a7\t\17\2\2\u05a6"+
		"\u05a4\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7{\3\2\2\2\u05a8\u05a9\5\u00b2"+
		"Z\2\u05a9\u05aa\7\4\2\2\u05aa\u05ac\3\2\2\2\u05ab\u05a8\3\2\2\2\u05ab"+
		"\u05ac\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05b2\5\u00b4[\2\u05ae\u05b0"+
		"\7#\2\2\u05af\u05ae\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1"+
		"\u05b3\5\u00ccg\2\u05b2\u05af\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b9"+
		"\3\2\2\2\u05b4\u05b5\7[\2\2\u05b5\u05b6\7*\2\2\u05b6\u05ba\5\u00c0a\2"+
		"\u05b7\u05b8\7p\2\2\u05b8\u05ba\7[\2\2\u05b9\u05b4\3\2\2\2\u05b9\u05b7"+
		"\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba}\3\2\2\2\u05bb\u05d9\5|?\2\u05bc\u05c6"+
		"\7\5\2\2\u05bd\u05c2\5~@\2\u05be\u05bf\7\7\2\2\u05bf\u05c1\5~@\2\u05c0"+
		"\u05be\3\2\2\2\u05c1\u05c4\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c2\u05c3\3\2"+
		"\2\2\u05c3\u05c7\3\2\2\2\u05c4\u05c2\3\2\2\2\u05c5\u05c7\5\u0080A\2\u05c6"+
		"\u05bd\3\2\2\2\u05c6\u05c5\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05cd\7\6"+
		"\2\2\u05c9\u05cb\7#\2\2\u05ca\u05c9\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb"+
		"\u05cc\3\2\2\2\u05cc\u05ce\5\u00ccg\2\u05cd\u05ca\3\2\2\2\u05cd\u05ce"+
		"\3\2\2\2\u05ce\u05d9\3\2\2\2\u05cf\u05d0\7\5\2\2\u05d0\u05d1\5@!\2\u05d1"+
		"\u05d6\7\6\2\2\u05d2\u05d4\7#\2\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4\3\2"+
		"\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d7\5\u00ccg\2\u05d6\u05d3\3\2\2\2\u05d6"+
		"\u05d7\3\2\2\2\u05d7\u05d9\3\2\2\2\u05d8\u05bb\3\2\2\2\u05d8\u05bc\3\2"+
		"\2\2\u05d8\u05cf\3\2\2\2\u05d9\177\3\2\2\2\u05da\u05e1\5~@\2\u05db\u05dc"+
		"\5\u0082B\2\u05dc\u05dd\5~@\2\u05dd\u05de\5\u0084C\2\u05de\u05e0\3\2\2"+
		"\2\u05df\u05db\3\2\2\2\u05e0\u05e3\3\2\2\2\u05e1\u05df\3\2\2\2\u05e1\u05e2"+
		"\3\2\2\2\u05e2\u0081\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e4\u05f2\7\7\2\2\u05e5"+
		"\u05e7\7n\2\2\u05e6\u05e5\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05ee\3\2"+
		"\2\2\u05e8\u05ea\7i\2\2\u05e9\u05eb\7z\2\2\u05ea\u05e9\3\2\2\2\u05ea\u05eb"+
		"\3\2\2\2\u05eb\u05ef\3\2\2\2\u05ec\u05ef\7]\2\2\u05ed\u05ef\7\66\2\2\u05ee"+
		"\u05e8\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee\u05ed\3\2\2\2\u05ee\u05ef\3\2"+
		"\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f2\7g\2\2\u05f1\u05e4\3\2\2\2\u05f1"+
		"\u05e6\3\2\2\2\u05f2\u0083\3\2\2\2\u05f3\u05f4\7w\2\2\u05f4\u0602\5P)"+
		"\2\u05f5\u05f6\7\u009a\2\2\u05f6\u05f7\7\5\2\2\u05f7\u05fc\5\u00ba^\2"+
		"\u05f8\u05f9\7\7\2\2\u05f9\u05fb\5\u00ba^\2\u05fa\u05f8\3\2\2\2\u05fb"+
		"\u05fe\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05ff\3\2"+
		"\2\2\u05fe\u05fc\3\2\2\2\u05ff\u0600\7\6\2\2\u0600\u0602\3\2\2\2\u0601"+
		"\u05f3\3\2\2\2\u0601\u05f5\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0085\3\2"+
		"\2\2\u0603\u0605\7\u008c\2\2\u0604\u0606\t\20\2\2\u0605\u0604\3\2\2\2"+
		"\u0605\u0606\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u060c\5j\66\2\u0608\u0609"+
		"\7\7\2\2\u0609\u060b\5j\66\2\u060a\u0608\3\2\2\2\u060b\u060e\3\2\2\2\u060c"+
		"\u060a\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u0610\3\2\2\2\u060e\u060c\3\2"+
		"\2\2\u060f\u0611\5\u0088E\2\u0610\u060f\3\2\2\2\u0610\u0611\3\2\2\2\u0611"+
		"\u0614\3\2\2\2\u0612\u0613\7\u00a0\2\2\u0613\u0615\5P)\2\u0614\u0612\3"+
		"\2\2\2\u0614\u0615\3\2\2\2\u0615\u0624\3\2\2\2\u0616\u0617\7S\2\2\u0617"+
		"\u0618\7*\2\2\u0618\u061d\5P)\2\u0619\u061a\7\7\2\2\u061a\u061c\5P)\2"+
		"\u061b\u0619\3\2\2\2\u061c\u061f\3\2\2\2\u061d\u061b\3\2\2\2\u061d\u061e"+
		"\3\2\2\2\u061e\u0622\3\2\2\2\u061f\u061d\3\2\2\2\u0620\u0621\7T\2\2\u0621"+
		"\u0623\5P)\2\u0622\u0620\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0625\3\2\2"+
		"\2\u0624\u0616\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u0643\3\2\2\2\u0626\u0627"+
		"\7\u009c\2\2\u0627\u0628\7\5\2\2\u0628\u062d\5P)\2\u0629\u062a\7\7\2\2"+
		"\u062a\u062c\5P)\2\u062b\u0629\3\2\2\2\u062c\u062f\3\2\2\2\u062d\u062b"+
		"\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u0630\3\2\2\2\u062f\u062d\3\2\2\2\u0630"+
		"\u063f\7\6\2\2\u0631\u0632\7\7\2\2\u0632\u0633\7\5\2\2\u0633\u0638\5P"+
		")\2\u0634\u0635\7\7\2\2\u0635\u0637\5P)\2\u0636\u0634\3\2\2\2\u0637\u063a"+
		"\3\2\2\2\u0638\u0636\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063b\3\2\2\2\u063a"+
		"\u0638\3\2\2\2\u063b\u063c\7\6\2\2\u063c\u063e\3\2\2\2\u063d\u0631\3\2"+
		"\2\2\u063e\u0641\3\2\2\2\u063f\u063d\3\2\2\2\u063f\u0640\3\2\2\2\u0640"+
		"\u0643\3\2\2\2\u0641\u063f\3\2\2\2\u0642\u0603\3\2\2\2\u0642\u0626\3\2"+
		"\2\2\u0643\u0087\3\2\2\2\u0644\u064e\7P\2\2\u0645\u064a\5~@\2\u0646\u0647"+
		"\7\7\2\2\u0647\u0649\5~@\2\u0648\u0646\3\2\2\2\u0649\u064c\3\2\2\2\u064a"+
		"\u0648\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064f\3\2\2\2\u064c\u064a\3\2"+
		"\2\2\u064d\u064f\5\u0080A\2\u064e\u0645\3\2\2\2\u064e\u064d\3\2\2\2\u064f"+
		"\u0089\3\2\2\2\u0650\u0657\7\u0097\2\2\u0651\u0652\7\u0097\2\2\u0652\u0657"+
		"\7\37\2\2\u0653\u0657\7`\2\2\u0654\u0657\7H\2\2\u0655\u0657\7m\2\2\u0656"+
		"\u0650\3\2\2\2\u0656\u0651\3\2\2\2\u0656\u0653\3\2\2\2\u0656\u0654\3\2"+
		"\2\2\u0656\u0655\3\2\2\2\u0657\u008b\3\2\2\2\u0658\u0664\5\u00b4[\2\u0659"+
		"\u065a\7\5\2\2\u065a\u065f\5\u00ba^\2\u065b\u065c\7\7\2\2\u065c\u065e"+
		"\5\u00ba^\2\u065d\u065b\3\2\2\2\u065e\u0661\3\2\2\2\u065f\u065d\3\2\2"+
		"\2\u065f\u0660\3\2\2\2\u0660\u0662\3\2\2\2\u0661\u065f\3\2\2\2\u0662\u0663"+
		"\7\6\2\2\u0663\u0665\3\2\2\2\u0664\u0659\3\2\2\2\u0664\u0665\3\2\2\2\u0665"+
		"\u008d\3\2\2\2\u0666\u0668\t\t\2\2\u0667\u0666\3\2\2\2\u0667\u0668\3\2"+
		"\2\2\u0668\u0669\3\2\2\2\u0669\u066a\7\u00a4\2\2\u066a\u008f\3\2\2\2\u066b"+
		"\u066c\t\21\2\2\u066c\u0091\3\2\2\2\u066d\u066e\t\22\2\2\u066e\u0093\3"+
		"\2\2\2\u066f\u0670\7\u00a6\2\2\u0670\u0095\3\2\2\2\u0671\u0674\5P)\2\u0672"+
		"\u0674\5H%\2\u0673\u0671\3\2\2\2\u0673\u0672\3\2\2\2\u0674\u0097\3\2\2"+
		"\2\u0675\u0676\t\23\2\2\u0676\u0099\3\2\2\2\u0677\u0678\t\24\2\2\u0678"+
		"\u009b\3\2\2\2\u0679\u067a\5\u00d0i\2\u067a\u009d\3\2\2\2\u067b\u067c"+
		"\7\64\2\2\u067c\u0686\7\5\2\2\u067d\u067f\5\u00aeX\2\u067e\u067d\3\2\2"+
		"\2\u067e\u067f\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u0687\5T+\2\u0681\u0687"+
		"\7\t\2\2\u0682\u0684\7B\2\2\u0683\u0682\3\2\2\2\u0683\u0684\3\2\2\2\u0684"+
		"\u0685\3\2\2\2\u0685\u0687\5\u00a0Q\2\u0686\u067e\3\2\2\2\u0686\u0681"+
		"\3\2\2\2\u0686\u0683\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u0688\3\2\2\2\u0688"+
		"\u068a\7\6\2\2\u0689\u068b\5l\67\2\u068a\u0689\3\2\2\2\u068a\u068b\3\2"+
		"\2\2\u068b\u0690\3\2\2\2\u068c\u068e\7#\2\2\u068d\u068c\3\2\2\2\u068d"+
		"\u068e\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0691\5\u0098M\2\u0690\u068d"+
		"\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u009f\3\2\2\2\u0692\u0693\5\u00b0Y"+
		"\2\u0693\u06a0\7\5\2\2\u0694\u0696\7B\2\2\u0695\u0694\3\2\2\2\u0695\u0696"+
		"\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u069c\5T+\2\u0698\u0699\7\7\2\2\u0699"+
		"\u069b\5T+\2\u069a\u0698\3\2\2\2\u069b\u069e\3\2\2\2\u069c\u069a\3\2\2"+
		"\2\u069c\u069d\3\2\2\2\u069d\u06a1\3\2\2\2\u069e\u069c\3\2\2\2\u069f\u06a1"+
		"\7\t\2\2\u06a0\u0695\3\2\2\2\u06a0\u069f\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1"+
		"\u06a2\3\2\2\2\u06a2\u06a4\7\6\2\2\u06a3\u06a5\5l\67\2\u06a4\u06a3\3\2"+
		"\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06aa\3\2\2\2\u06a6\u06a8\7#\2\2\u06a7"+
		"\u06a6\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab\5\u0098"+
		"M\2\u06aa\u06a7\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u00a1\3\2\2\2\u06ac"+
		"\u06ad\7\"\2\2\u06ad\u00a3\3\2\2\2\u06ae\u06af\7x\2\2\u06af\u00a5\3\2"+
		"\2\2\u06b0\u06b1\t\25\2\2\u06b1\u00a7\3\2\2\2\u06b2\u06b3\7p\2\2\u06b3"+
		"\u00a9\3\2\2\2\u06b4\u06b5\7Y\2\2\u06b5\u00ab\3\2\2\2\u06b6\u06b7\7j\2"+
		"\2\u06b7\u00ad\3\2\2\2\u06b8\u06b9\7B\2\2\u06b9\u00af\3\2\2\2\u06ba\u06bb"+
		"\5\u00d0i\2\u06bb\u00b1\3\2\2\2\u06bc\u06bd\5\u00d0i\2\u06bd\u00b3\3\2"+
		"\2\2\u06be\u06bf\5\u00d0i\2\u06bf\u00b5\3\2\2\2\u06c0\u06c1\5\u00d0i\2"+
		"\u06c1\u00b7\3\2\2\2\u06c2\u06c3\5\u00d0i\2\u06c3\u00b9\3\2\2\2\u06c4"+
		"\u06c5\5\u00d0i\2\u06c5\u00bb\3\2\2\2\u06c6\u06c7\5\u00d0i\2\u06c7\u00bd"+
		"\3\2\2\2\u06c8\u06c9\5\u00d0i\2\u06c9\u00bf\3\2\2\2\u06ca\u06cb\5\u00d0"+
		"i\2\u06cb\u00c1\3\2\2\2\u06cc\u06cd\5\u00d0i\2\u06cd\u00c3\3\2\2\2\u06ce"+
		"\u06cf\5\u00d0i\2\u06cf\u00c5\3\2\2\2\u06d0\u06d1\5\u00d0i\2\u06d1\u00c7"+
		"\3\2\2\2\u06d2\u06d3\5\u00d0i\2\u06d3\u00c9\3\2\2\2\u06d4\u06d5\5\u00d0"+
		"i\2\u06d5\u00cb\3\2\2\2\u06d6\u06d7\5\u00d0i\2\u06d7\u00cd\3\2\2\2\u06d8"+
		"\u06d9\5\u00d0i\2\u06d9\u00cf\3\2\2\2\u06da\u06e2\7\u00a3\2\2\u06db\u06e2"+
		"\5\u009aN\2\u06dc\u06e2\7\u00a6\2\2\u06dd\u06de\7\5\2\2\u06de\u06df\5"+
		"\u00d0i\2\u06df\u06e0\7\6\2\2\u06e0\u06e2\3\2\2\2\u06e1\u06da\3\2\2\2"+
		"\u06e1\u06db\3\2\2\2\u06e1\u06dc\3\2\2\2\u06e1\u06dd\3\2\2\2\u06e2\u00d1"+
		"\3\2\2\2\u06e3\u06e5\13\2\2\2\u06e4\u06e3\3\2\2\2\u06e5\u06e6\3\2\2\2"+
		"\u06e6\u06e4\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u00d3\3\2\2\2\u00f6\u00d6"+
		"\u00d8\u00e4\u00ea\u00f0\u00f2\u0111\u011c\u0124\u0127\u0130\u0134\u013c"+
		"\u0140\u0142\u0147\u0149\u014d\u0154\u0157\u015f\u0168\u016b\u0171\u0173"+
		"\u0177\u017d\u0182\u018d\u0193\u0197\u019d\u01a2\u01ab\u01b2\u01b8\u01bc"+
		"\u01c0\u01c6\u01cb\u01d2\u01dd\u01e0\u01e2\u01e8\u01ee\u01f2\u01f9\u01ff"+
		"\u0205\u020b\u0210\u021c\u0221\u022c\u0231\u0234\u023a\u023d\u0243\u024c"+
		"\u024f\u0255\u0257\u025e\u0266\u026b\u0273\u0278\u0280\u0285\u028d\u0292"+
		"\u0297\u02aa\u02b0\u02b9\u02be\u02c7\u02d2\u02d9\u02df\u02e5\u02ee\u02f5"+
		"\u02f9\u02fb\u02ff\u0306\u0308\u030c\u030f\u0316\u031d\u0320\u032a\u032d"+
		"\u0333\u0335\u033f\u0342\u0348\u034a\u034d\u035a\u0368\u036d\u0370\u037d"+
		"\u038b\u0390\u0399\u039c\u03a2\u03a4\u03aa\u03af\u03b5\u03c1\u03c5\u03ca"+
		"\u03ce\u03d1\u03e3\u03e8\u03ed\u0404\u0407\u040f\u0418\u041c\u0421\u043d"+
		"\u0442\u044e\u0454\u045b\u045f\u0469\u046c\u0472\u0475\u0477\u0479\u0480"+
		"\u0485\u0489\u048c\u048e\u0494\u0499\u049d\u04a0\u04a3\u04a5\u04b3\u04bd"+
		"\u04c2\u04ce\u04d2\u04d6\u04da\u04e1\u04e3\u04eb\u04f2\u04f5\u04f9\u04fe"+
		"\u0506\u0519\u051f\u0523\u0533\u0539\u0541\u0546\u0549\u054e\u0557\u055c"+
		"\u056b\u0570\u0576\u0579\u057c\u057f\u0582\u058c\u0591\u0597\u059c\u059f"+
		"\u05a6\u05ab\u05af\u05b2\u05b9\u05c2\u05c6\u05ca\u05cd\u05d3\u05d6\u05d8"+
		"\u05e1\u05e6\u05ea\u05ee\u05f1\u05fc\u0601\u0605\u060c\u0610\u0614\u061d"+
		"\u0622\u0624\u062d\u0638\u063f\u0642\u064a\u064e\u0656\u065f\u0664\u0667"+
		"\u0673\u067e\u0683\u0686\u068a\u068d\u0690\u0695\u069c\u06a0\u06a4\u06a7"+
		"\u06aa\u06e1\u06e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}