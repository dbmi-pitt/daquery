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
		K_TRANSACTION=142, K_TRIGGER=143, K_TRUE=144, K_UNION=145, K_UNIQUE=146, 
		K_UPDATE=147, K_USING=148, K_VACUUM=149, K_VALUES=150, K_VIEW=151, K_VIRTUAL=152, 
		K_WHEN=153, K_WHERE=154, K_WITH=155, K_WITHOUT=156, IDENTIFIER=157, NUMERIC_LITERAL=158, 
		BIND_PARAMETER=159, STRING_LITERAL=160, BLOB_LITERAL=161, SINGLE_LINE_COMMENT=162, 
		MULTILINE_COMMENT=163, SPACES=164, UNEXPECTED_CHAR=165, K_OFFUSCATE=166;
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
		RULE_ident_prop = 54, RULE_id_field_prop = 55, RULE_date_shift_field_prop = 56, 
		RULE_obfuscate_field_prop = 57, RULE_from_table_spec = 58, RULE_table_or_subquery = 59, 
		RULE_join_clause = 60, RULE_join_operator = 61, RULE_join_constraint = 62, 
		RULE_select_core = 63, RULE_multi_from_clause = 64, RULE_set_operator = 65, 
		RULE_cte_table_name = 66, RULE_signed_number = 67, RULE_literal_value = 68, 
		RULE_unary_operator = 69, RULE_error_message = 70, RULE_module_argument = 71, 
		RULE_column_alias = 72, RULE_keyword = 73, RULE_name = 74, RULE_count_function = 75, 
		RULE_any_function = 76, RULE_and_keyword = 77, RULE_or_keyword = 78, RULE_and_or = 79, 
		RULE_not_keyword = 80, RULE_in_keyword = 81, RULE_like_keyword = 82, RULE_distinct_keyword = 83, 
		RULE_function_name = 84, RULE_database_name = 85, RULE_table_name = 86, 
		RULE_table_or_index_name = 87, RULE_new_table_name = 88, RULE_column_name = 89, 
		RULE_collation_name = 90, RULE_foreign_table = 91, RULE_index_name = 92, 
		RULE_trigger_name = 93, RULE_view_name = 94, RULE_module_name = 95, RULE_pragma_name = 96, 
		RULE_savepoint_name = 97, RULE_table_alias = 98, RULE_transaction_name = 99, 
		RULE_any_name = 100, RULE_anything_at_all = 101;
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
		"ident_prop", "id_field_prop", "date_shift_field_prop", "obfuscate_field_prop", 
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
		"K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", "K_TRUE", "K_UNION", "K_UNIQUE", 
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
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (K_ALTER - 30)) | (1L << (K_ANALYZE - 30)) | (1L << (K_ATTACH - 30)) | (1L << (K_BEGIN - 30)) | (1L << (K_COMMIT - 30)) | (1L << (K_CREATE - 30)) | (1L << (K_DELETE - 30)) | (1L << (K_DETACH - 30)) | (1L << (K_DROP - 30)) | (1L << (K_END - 30)) | (1L << (K_EXPLAIN - 30)) | (1L << (K_INSERT - 30)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (K_PRAGMA - 119)) | (1L << (K_REINDEX - 119)) | (1L << (K_RELEASE - 119)) | (1L << (K_REPLACE - 119)) | (1L << (K_ROLLBACK - 119)) | (1L << (K_SAVEPOINT - 119)) | (1L << (K_SELECT - 119)) | (1L << (K_UPDATE - 119)) | (1L << (K_VACUUM - 119)) | (1L << (K_VALUES - 119)) | (1L << (K_WITH - 119)) | (1L << (UNEXPECTED_CHAR - 119)))) != 0)) {
				{
				setState(206);
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
					setState(204);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(205);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
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
			setState(213);
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
			setState(216);
			sql_stmt();
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					sql_stmt();
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(223);
					anything_at_all();
					}
					} 
				}
				setState(228);
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
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(229);
				match(K_EXPLAIN);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(230);
					match(K_QUERY);
					setState(231);
					match(K_PLAN);
					}
				}

				}
			}

			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(236);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(237);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(238);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(239);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(240);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(241);
				create_index_stmt();
				}
				break;
			case 7:
				{
				setState(242);
				create_table_stmt();
				}
				break;
			case 8:
				{
				setState(243);
				create_trigger_stmt();
				}
				break;
			case 9:
				{
				setState(244);
				create_view_stmt();
				}
				break;
			case 10:
				{
				setState(245);
				create_virtual_table_stmt();
				}
				break;
			case 11:
				{
				setState(246);
				delete_stmt();
				}
				break;
			case 12:
				{
				setState(247);
				delete_stmt_limited();
				}
				break;
			case 13:
				{
				setState(248);
				detach_stmt();
				}
				break;
			case 14:
				{
				setState(249);
				drop_index_stmt();
				}
				break;
			case 15:
				{
				setState(250);
				drop_table_stmt();
				}
				break;
			case 16:
				{
				setState(251);
				drop_trigger_stmt();
				}
				break;
			case 17:
				{
				setState(252);
				drop_view_stmt();
				}
				break;
			case 18:
				{
				setState(253);
				insert_stmt();
				}
				break;
			case 19:
				{
				setState(254);
				pragma_stmt();
				}
				break;
			case 20:
				{
				setState(255);
				reindex_stmt();
				}
				break;
			case 21:
				{
				setState(256);
				release_stmt();
				}
				break;
			case 22:
				{
				setState(257);
				rollback_stmt();
				}
				break;
			case 23:
				{
				setState(258);
				savepoint_stmt();
				}
				break;
			case 24:
				{
				setState(259);
				select_set();
				}
				break;
			case 25:
				{
				setState(260);
				select_stmt();
				}
				break;
			case 26:
				{
				setState(261);
				update_stmt();
				}
				break;
			case 27:
				{
				setState(262);
				update_stmt_limited();
				}
				break;
			case 28:
				{
				setState(263);
				vacuum_stmt();
				}
				break;
			case 29:
				{
				setState(264);
				with_select_stmt();
				}
				break;
			}
			setState(267);
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
			setState(269);
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
			setState(271);
			match(K_ALTER);
			setState(272);
			match(K_TABLE);
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(273);
				database_name();
				setState(274);
				match(DOT);
				}
				break;
			}
			setState(278);
			table_name();
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(279);
				match(K_RENAME);
				setState(280);
				match(K_TO);
				setState(281);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(282);
				match(K_ADD);
				setState(284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(283);
					match(K_COLUMN);
					}
					break;
				}
				setState(286);
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
			setState(289);
			match(K_ANALYZE);
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(290);
				database_name();
				}
				break;
			case 2:
				{
				setState(291);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(292);
				database_name();
				setState(293);
				match(DOT);
				setState(294);
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
			setState(298);
			match(K_ATTACH);
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(299);
				match(K_DATABASE);
				}
				break;
			}
			setState(302);
			expr(0);
			setState(303);
			match(K_AS);
			setState(304);
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
			setState(306);
			match(K_BEGIN);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (K_DEFERRED - 60)) | (1L << (K_EXCLUSIVE - 60)) | (1L << (K_IMMEDIATE - 60)))) != 0)) {
				{
				setState(307);
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

			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(310);
				match(K_TRANSACTION);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) {
					{
					setState(311);
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
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(317);
				match(K_TRANSACTION);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) {
					{
					setState(318);
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
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(323);
				match(K_WITH);
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(324);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(327);
				common_table_expression();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(328);
					match(COMMA);
					setState(329);
					common_table_expression();
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(337);
			select_core();
			setState(341); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(338);
				set_operator();
				setState(339);
				select_core();
				}
				}
				setState(343); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_EXCEPT - 70)) | (1L << (K_INTERSECT - 70)) | (1L << (K_MINUS - 70)))) != 0) || _la==K_UNION );
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(345);
				match(K_ORDER);
				setState(346);
				match(K_BY);
				setState(347);
				ordering_term();
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(348);
					match(COMMA);
					setState(349);
					ordering_term();
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(357);
				match(K_LIMIT);
				setState(358);
				expr(0);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(359);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(360);
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
			setState(365);
			match(K_CREATE);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(366);
				match(K_UNIQUE);
				}
			}

			setState(369);
			match(K_INDEX);
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(370);
				match(K_IF);
				setState(371);
				match(K_NOT);
				setState(372);
				match(K_EXISTS);
				}
				break;
			}
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(375);
				database_name();
				setState(376);
				match(DOT);
				}
				break;
			}
			setState(380);
			index_name();
			setState(381);
			match(K_ON);
			setState(382);
			table_name();
			setState(383);
			match(OPEN_PAR);
			setState(384);
			indexed_column();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(385);
				match(COMMA);
				setState(386);
				indexed_column();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			match(CLOSE_PAR);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(393);
				match(K_WHERE);
				setState(394);
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
			setState(397);
			match(K_CREATE);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(398);
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

			setState(401);
			match(K_TABLE);
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(402);
				match(K_IF);
				setState(403);
				match(K_NOT);
				setState(404);
				match(K_EXISTS);
				}
				break;
			}
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(407);
				database_name();
				setState(408);
				match(DOT);
				}
				break;
			}
			setState(412);
			table_name();
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(413);
				match(OPEN_PAR);
				setState(414);
				column_def();
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(415);
						match(COMMA);
						setState(416);
						column_def();
						}
						} 
					}
					setState(421);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(422);
					match(COMMA);
					setState(423);
					table_constraint();
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(429);
				match(CLOSE_PAR);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(430);
					match(K_WITHOUT);
					setState(431);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(434);
				match(K_AS);
				setState(435);
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
			setState(438);
			match(K_CREATE);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(439);
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

			setState(442);
			match(K_TRIGGER);
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(443);
				match(K_IF);
				setState(444);
				match(K_NOT);
				setState(445);
				match(K_EXISTS);
				}
				break;
			}
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(448);
				database_name();
				setState(449);
				match(DOT);
				}
				break;
			}
			setState(453);
			trigger_name();
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(454);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(455);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(456);
				match(K_INSTEAD);
				setState(457);
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
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(460);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(461);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(462);
				match(K_UPDATE);
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(463);
					match(K_OF);
					setState(464);
					column_name();
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(465);
						match(COMMA);
						setState(466);
						column_name();
						}
						}
						setState(471);
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
			setState(476);
			match(K_ON);
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(477);
				database_name();
				setState(478);
				match(DOT);
				}
				break;
			}
			setState(482);
			table_name();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(483);
				match(K_FOR);
				setState(484);
				match(K_EACH);
				setState(485);
				match(K_ROW);
				}
			}

			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(488);
				match(K_WHEN);
				setState(489);
				expr(0);
				}
			}

			setState(492);
			match(K_BEGIN);
			setState(501); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(493);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(494);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(495);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(496);
					select_stmt();
					}
					break;
				}
				setState(499);
				match(SCOL);
				}
				}
				setState(503); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (K_INSERT - 92)) | (1L << (K_REPLACE - 92)) | (1L << (K_SELECT - 92)) | (1L << (K_UPDATE - 92)) | (1L << (K_VALUES - 92)) | (1L << (K_WITH - 92)))) != 0) );
			setState(505);
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
			setState(507);
			match(K_CREATE);
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(508);
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

			setState(511);
			match(K_VIEW);
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(512);
				match(K_IF);
				setState(513);
				match(K_NOT);
				setState(514);
				match(K_EXISTS);
				}
				break;
			}
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(517);
				database_name();
				setState(518);
				match(DOT);
				}
				break;
			}
			setState(522);
			view_name();
			setState(523);
			match(K_AS);
			setState(524);
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
			setState(526);
			match(K_CREATE);
			setState(527);
			match(K_VIRTUAL);
			setState(528);
			match(K_TABLE);
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(529);
				match(K_IF);
				setState(530);
				match(K_NOT);
				setState(531);
				match(K_EXISTS);
				}
				break;
			}
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(534);
				database_name();
				setState(535);
				match(DOT);
				}
				break;
			}
			setState(539);
			table_name();
			setState(540);
			match(K_USING);
			setState(541);
			module_name();
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(542);
				match(OPEN_PAR);
				setState(543);
				module_argument();
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(544);
					match(COMMA);
					setState(545);
					module_argument();
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(551);
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
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(555);
				with_clause();
				}
			}

			setState(558);
			match(K_DELETE);
			setState(559);
			single_from_clause();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(560);
				match(K_WHERE);
				setState(561);
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
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(564);
				with_clause();
				}
			}

			setState(567);
			match(K_DELETE);
			setState(568);
			single_from_clause();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(569);
				match(K_WHERE);
				setState(570);
				expr(0);
				}
			}

			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(573);
					match(K_ORDER);
					setState(574);
					match(K_BY);
					setState(575);
					ordering_term();
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(576);
						match(COMMA);
						setState(577);
						ordering_term();
						}
						}
						setState(582);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(585);
				match(K_LIMIT);
				setState(586);
				expr(0);
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(587);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(588);
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
			setState(593);
			match(K_FROM);
			setState(594);
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
			setState(596);
			match(K_DETACH);
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(597);
				match(K_DATABASE);
				}
				break;
			}
			setState(600);
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
			setState(602);
			match(K_DROP);
			setState(603);
			match(K_INDEX);
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
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
			setState(615);
			match(K_DROP);
			setState(616);
			match(K_TABLE);
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
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
			setState(628);
			match(K_DROP);
			setState(629);
			match(K_TRIGGER);
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
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
			setState(641);
			match(K_DROP);
			setState(642);
			match(K_VIEW);
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(643);
				match(K_IF);
				setState(644);
				match(K_EXISTS);
				}
				break;
			}
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(647);
				database_name();
				setState(648);
				match(DOT);
				}
				break;
			}
			setState(652);
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
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(654);
				with_clause();
				}
			}

			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(657);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(658);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(659);
				match(K_INSERT);
				setState(660);
				match(K_OR);
				setState(661);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(662);
				match(K_INSERT);
				setState(663);
				match(K_OR);
				setState(664);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(665);
				match(K_INSERT);
				setState(666);
				match(K_OR);
				setState(667);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(668);
				match(K_INSERT);
				setState(669);
				match(K_OR);
				setState(670);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(671);
				match(K_INSERT);
				setState(672);
				match(K_OR);
				setState(673);
				match(K_IGNORE);
				}
				break;
			}
			setState(676);
			match(K_INTO);
			setState(680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(677);
				database_name();
				setState(678);
				match(DOT);
				}
				break;
			}
			setState(682);
			table_name();
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(683);
				match(OPEN_PAR);
				setState(684);
				column_name();
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(685);
					match(COMMA);
					setState(686);
					column_name();
					}
					}
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(692);
				match(CLOSE_PAR);
				}
			}

			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(696);
				match(K_VALUES);
				setState(697);
				match(OPEN_PAR);
				setState(698);
				expr(0);
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(699);
					match(COMMA);
					setState(700);
					expr(0);
					}
					}
					setState(705);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(706);
				match(CLOSE_PAR);
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(707);
					match(COMMA);
					setState(708);
					match(OPEN_PAR);
					setState(709);
					expr(0);
					setState(714);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(710);
						match(COMMA);
						setState(711);
						expr(0);
						}
						}
						setState(716);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(717);
					match(CLOSE_PAR);
					}
					}
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(724);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(725);
				match(K_DEFAULT);
				setState(726);
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
			setState(729);
			match(K_PRAGMA);
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(730);
				database_name();
				setState(731);
				match(DOT);
				}
				break;
			}
			setState(735);
			pragma_name();
			setState(742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(736);
				match(ASSIGN);
				setState(737);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(738);
				match(OPEN_PAR);
				setState(739);
				pragma_value();
				setState(740);
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
			setState(744);
			match(K_REINDEX);
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(745);
				collation_name();
				}
				break;
			case 2:
				{
				setState(749);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(746);
					database_name();
					setState(747);
					match(DOT);
					}
					break;
				}
				setState(753);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(751);
					table_name();
					}
					break;
				case 2:
					{
					setState(752);
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
			setState(757);
			match(K_RELEASE);
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(758);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(761);
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
			setState(763);
			match(K_ROLLBACK);
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(764);
				match(K_TRANSACTION);
				setState(766);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(765);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(770);
				match(K_TO);
				setState(772);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(771);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(774);
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
			setState(777);
			match(K_SAVEPOINT);
			setState(778);
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
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(780);
				match(K_WITH);
				setState(782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(781);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(784);
				common_table_expression();
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(785);
					match(COMMA);
					setState(786);
					common_table_expression();
					}
					}
					setState(791);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(794);
			select_core();
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(795);
				match(K_ORDER);
				setState(796);
				match(K_BY);
				setState(797);
				ordering_term();
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(798);
					match(COMMA);
					setState(799);
					ordering_term();
					}
					}
					setState(804);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(807);
				match(K_LIMIT);
				setState(808);
				expr(0);
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(809);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(810);
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
			setState(815);
			select_core();
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(816);
				match(K_ORDER);
				setState(817);
				match(K_BY);
				setState(818);
				ordering_term();
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(819);
					match(COMMA);
					setState(820);
					ordering_term();
					}
					}
					setState(825);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(828);
				match(K_LIMIT);
				setState(829);
				expr(0);
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(830);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(831);
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
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(836);
				with_clause();
				}
			}

			setState(839);
			match(K_UPDATE);
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(840);
				match(K_OR);
				setState(841);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(842);
				match(K_OR);
				setState(843);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(844);
				match(K_OR);
				setState(845);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(846);
				match(K_OR);
				setState(847);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(848);
				match(K_OR);
				setState(849);
				match(K_IGNORE);
				}
				break;
			}
			setState(852);
			qualified_table_name();
			setState(853);
			match(K_SET);
			setState(854);
			column_name();
			setState(855);
			match(ASSIGN);
			setState(856);
			expr(0);
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(857);
				match(COMMA);
				setState(858);
				column_name();
				setState(859);
				match(ASSIGN);
				setState(860);
				expr(0);
				}
				}
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(867);
				match(K_WHERE);
				setState(868);
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
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(871);
				with_clause();
				}
			}

			setState(874);
			match(K_UPDATE);
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(875);
				match(K_OR);
				setState(876);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(877);
				match(K_OR);
				setState(878);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(879);
				match(K_OR);
				setState(880);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(881);
				match(K_OR);
				setState(882);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(883);
				match(K_OR);
				setState(884);
				match(K_IGNORE);
				}
				break;
			}
			setState(887);
			qualified_table_name();
			setState(888);
			match(K_SET);
			setState(889);
			column_name();
			setState(890);
			match(ASSIGN);
			setState(891);
			expr(0);
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(892);
				match(COMMA);
				setState(893);
				column_name();
				setState(894);
				match(ASSIGN);
				setState(895);
				expr(0);
				}
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(902);
				match(K_WHERE);
				setState(903);
				expr(0);
				}
			}

			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(906);
					match(K_ORDER);
					setState(907);
					match(K_BY);
					setState(908);
					ordering_term();
					setState(913);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(909);
						match(COMMA);
						setState(910);
						ordering_term();
						}
						}
						setState(915);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(918);
				match(K_LIMIT);
				setState(919);
				expr(0);
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(920);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(921);
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
			setState(926);
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
			setState(928);
			column_name();
			setState(930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(929);
				type_name();
				}
				break;
			}
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (K_NOT - 108)) | (1L << (K_NULL - 108)) | (1L << (K_PRIMARY - 108)) | (1L << (K_REFERENCES - 108)) | (1L << (K_UNIQUE - 108)))) != 0)) {
				{
				{
				setState(932);
				column_constraint();
				}
				}
				setState(937);
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
			setState(939); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(938);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(941); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(943);
				match(OPEN_PAR);
				setState(944);
				signed_number();
				setState(945);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(947);
				match(OPEN_PAR);
				setState(948);
				signed_number();
				setState(949);
				match(COMMA);
				setState(950);
				signed_number();
				setState(951);
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
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(955);
				match(K_CONSTRAINT);
				setState(956);
				name();
				}
			}

			setState(992);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(959);
				match(K_PRIMARY);
				setState(960);
				match(K_KEY);
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(961);
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

				setState(964);
				conflict_clause();
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(965);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(968);
					match(K_NOT);
					}
				}

				setState(971);
				match(K_NULL);
				setState(972);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(973);
				match(K_UNIQUE);
				setState(974);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(975);
				match(K_CHECK);
				setState(976);
				match(OPEN_PAR);
				setState(977);
				expr(0);
				setState(978);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(980);
				match(K_DEFAULT);
				setState(987);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(981);
					signed_number();
					}
					break;
				case 2:
					{
					setState(982);
					literal_value();
					}
					break;
				case 3:
					{
					setState(983);
					match(OPEN_PAR);
					setState(984);
					expr(0);
					setState(985);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(989);
				match(K_COLLATE);
				setState(990);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(991);
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
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(994);
				match(K_ON);
				setState(995);
				match(K_CONFLICT);
				setState(996);
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
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1000);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1001);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1002);
				dbColumnExpr();
				}
				break;
			case 4:
				{
				setState(1003);
				unary_operator();
				setState(1004);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1006);
				count_function();
				}
				break;
			case 6:
				{
				setState(1007);
				any_function();
				}
				break;
			case 7:
				{
				setState(1008);
				match(OPEN_PAR);
				setState(1009);
				expr(0);
				setState(1010);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1012);
				match(K_CAST);
				setState(1013);
				match(OPEN_PAR);
				setState(1014);
				expr(0);
				setState(1015);
				match(K_AS);
				setState(1016);
				type_name();
				setState(1017);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1020);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1019);
						match(K_NOT);
						}
					}

					setState(1022);
					match(K_EXISTS);
					}
				}

				setState(1025);
				match(OPEN_PAR);
				setState(1026);
				select_stmt();
				setState(1027);
				match(CLOSE_PAR);
				}
				break;
			case 10:
				{
				setState(1029);
				match(K_CASE);
				setState(1031);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1030);
					expr(0);
					}
					break;
				}
				setState(1038); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1033);
					match(K_WHEN);
					setState(1034);
					expr(0);
					setState(1035);
					match(K_THEN);
					setState(1036);
					expr(0);
					}
					}
					setState(1040); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1042);
					match(K_ELSE);
					setState(1043);
					expr(0);
					}
				}

				setState(1046);
				match(K_END);
				}
				break;
			case 11:
				{
				setState(1048);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1051);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1052);
						match(PIPE2);
						setState(1053);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1054);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1055);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1056);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1057);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1058);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1059);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1060);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1061);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1062);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1063);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1064);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1065);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1066);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						{
						setState(1067);
						comparison_operator();
						}
						setState(1068);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1070);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1071);
						and_or();
						setState(1072);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1074);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1075);
						match(K_IS);
						setState(1077);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
						case 1:
							{
							setState(1076);
							match(K_NOT);
							}
							break;
						}
						setState(1079);
						expr(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1080);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1082);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1081);
							match(K_NOT);
							}
						}

						setState(1084);
						match(K_BETWEEN);
						setState(1085);
						expr(0);
						setState(1086);
						match(K_AND);
						setState(1087);
						expr(6);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1089);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1090);
						match(K_COLLATE);
						setState(1091);
						collation_name();
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1092);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1094);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1093);
							match(K_NOT);
							}
						}

						setState(1096);
						_la = _input.LA(1);
						if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (K_GLOB - 80)) | (1L << (K_LIKE - 80)) | (1L << (K_MATCH - 80)) | (1L << (K_REGEXP - 80)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1097);
						expr(0);
						setState(1100);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
						case 1:
							{
							setState(1098);
							match(K_ESCAPE);
							setState(1099);
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
						setState(1102);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1107);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1103);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1104);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1105);
							match(K_NOT);
							setState(1106);
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
						setState(1109);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1111);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1110);
							match(K_NOT);
							}
						}

						setState(1113);
						match(K_IN);
						setState(1133);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
						case 1:
							{
							setState(1114);
							match(OPEN_PAR);
							setState(1124);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
							case 1:
								{
								setState(1115);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1116);
								expr(0);
								setState(1121);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1117);
									match(COMMA);
									setState(1118);
									expr(0);
									}
									}
									setState(1123);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1126);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1130);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
							case 1:
								{
								setState(1127);
								database_name();
								setState(1128);
								match(DOT);
								}
								break;
							}
							setState(1132);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1139);
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
			setState(1158);
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
				setState(1149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
					case 1:
						{
						setState(1141);
						database_name();
						setState(1142);
						match(DOT);
						}
						break;
					}
					setState(1146);
					table_name();
					setState(1147);
					match(DOT);
					}
					break;
				}
				setState(1151);
				column_name();
				setState(1156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1152);
						match(K_AS);
						}
					}

					setState(1155);
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
			setState(1181);
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
				setState(1169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
					case 1:
						{
						setState(1161);
						database_name();
						setState(1162);
						match(DOT);
						}
						break;
					}
					setState(1166);
					table_name();
					setState(1167);
					match(DOT);
					}
					break;
				}
				setState(1171);
				column_name();
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1172);
					deid_tag();
					}
				}

				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1175);
						match(K_AS);
						}
					}

					setState(1178);
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
			setState(1195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183);
				match(ASSIGN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1184);
				match(EQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1185);
				match(NOT_EQ1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1186);
				match(NOT_EQ2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1187);
				match(K_IS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1188);
				match(K_IS);
				setState(1189);
				match(K_NOT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1190);
				in_keyword();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1191);
				like_keyword();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1192);
				match(K_GLOB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1193);
				match(K_MATCH);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1194);
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
			setState(1197);
			match(K_REFERENCES);
			setState(1198);
			foreign_table();
			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1199);
				match(OPEN_PAR);
				setState(1200);
				column_name();
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1201);
					match(COMMA);
					setState(1202);
					column_name();
					}
					}
					setState(1207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1208);
				match(CLOSE_PAR);
				}
			}

			setState(1230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1226);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1212);
					match(K_ON);
					setState(1213);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1222);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
					case 1:
						{
						setState(1214);
						match(K_SET);
						setState(1215);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1216);
						match(K_SET);
						setState(1217);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1218);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1219);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1220);
						match(K_NO);
						setState(1221);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1224);
					match(K_MATCH);
					setState(1225);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1233);
					match(K_NOT);
					}
				}

				setState(1236);
				match(K_DEFERRABLE);
				setState(1241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1237);
					match(K_INITIALLY);
					setState(1238);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1239);
					match(K_INITIALLY);
					setState(1240);
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
			setState(1245);
			match(K_RAISE);
			setState(1246);
			match(OPEN_PAR);
			setState(1251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1247);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1248);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1249);
				match(COMMA);
				setState(1250);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1253);
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
			setState(1255);
			column_name();
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1256);
				match(K_COLLATE);
				setState(1257);
				collation_name();
				}
			}

			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1260);
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
			setState(1265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1263);
				match(K_CONSTRAINT);
				setState(1264);
				name();
				}
			}

			setState(1303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1270);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1267);
					match(K_PRIMARY);
					setState(1268);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1269);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1272);
				match(OPEN_PAR);
				setState(1273);
				indexed_column();
				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1274);
					match(COMMA);
					setState(1275);
					indexed_column();
					}
					}
					setState(1280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1281);
				match(CLOSE_PAR);
				setState(1282);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1284);
				match(K_CHECK);
				setState(1285);
				match(OPEN_PAR);
				setState(1286);
				expr(0);
				setState(1287);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1289);
				match(K_FOREIGN);
				setState(1290);
				match(K_KEY);
				setState(1291);
				match(OPEN_PAR);
				setState(1292);
				column_name();
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1293);
					match(COMMA);
					setState(1294);
					column_name();
					}
					}
					setState(1299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1300);
				match(CLOSE_PAR);
				setState(1301);
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
			setState(1305);
			match(K_WITH);
			setState(1307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1306);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1309);
			cte_table_name();
			setState(1310);
			match(K_AS);
			setState(1311);
			match(OPEN_PAR);
			setState(1312);
			select_stmt();
			setState(1313);
			match(CLOSE_PAR);
			setState(1323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1314);
				match(COMMA);
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
				}
				}
				setState(1325);
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
			setState(1329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1326);
				database_name();
				setState(1327);
				match(DOT);
				}
				break;
			}
			setState(1331);
			table_name();
			setState(1337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1332);
				match(K_INDEXED);
				setState(1333);
				match(K_BY);
				setState(1334);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1335);
				match(K_NOT);
				setState(1336);
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
			setState(1339);
			expr(0);
			setState(1342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1340);
				match(K_COLLATE);
				setState(1341);
				collation_name();
				}
			}

			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1344);
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
			setState(1350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1347);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1348);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1349);
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
			setState(1352);
			table_name();
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1353);
				match(OPEN_PAR);
				setState(1354);
				column_name();
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1355);
					match(COMMA);
					setState(1356);
					column_name();
					}
					}
					setState(1361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1362);
				match(CLOSE_PAR);
				}
			}

			setState(1366);
			match(K_AS);
			setState(1367);
			match(OPEN_PAR);
			setState(1368);
			select_stmt();
			setState(1369);
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
			setState(1379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1371);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1372);
				table_name();
				setState(1373);
				match(DOT);
				setState(1374);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1376);
				result_column_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1377);
				count_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1378);
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
		enterRule(_localctx, 106, RULE_deid_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			match(LT);
			setState(1382);
			match(K_IDENTIFIABLE);
			setState(1384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1383);
				ident_prop();
				}
				break;
			}
			setState(1386);
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
		enterRule(_localctx, 108, RULE_ident_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ISID) {
				{
				setState(1388);
				id_field_prop();
				}
			}

			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DATESHIFT) {
				{
				setState(1391);
				date_shift_field_prop();
				}
			}

			setState(1395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OBFUSCATE) {
				{
				setState(1394);
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
		enterRule(_localctx, 110, RULE_id_field_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			match(K_ISID);
			setState(1398);
			match(ASSIGN);
			setState(1399);
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
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public Result_column_exprContext result_column_expr() {
			return getRuleContext(Result_column_exprContext.class,0);
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
		enterRule(_localctx, 112, RULE_date_shift_field_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			match(K_DATESHIFT);
			setState(1402);
			match(K_ON);
			setState(1403);
			result_column_expr();
			}
		}
		catch (RecognitionException re) {
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
			setState(1405);
			match(K_OBFUSCATE);
			setState(1406);
			match(ASSIGN);
			setState(1407);
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
		enterRule(_localctx, 116, RULE_from_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1409);
				database_name();
				setState(1410);
				match(DOT);
				}
				break;
			}
			setState(1414);
			table_name();
			setState(1419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1415);
					match(K_AS);
					}
					break;
				}
				setState(1418);
				table_alias();
				}
				break;
			}
			setState(1426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1421);
				match(K_INDEXED);
				setState(1422);
				match(K_BY);
				setState(1423);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1424);
				match(K_NOT);
				setState(1425);
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
		enterRule(_localctx, 118, RULE_table_or_subquery);
		int _la;
		try {
			setState(1457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1428);
				from_table_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1429);
				match(OPEN_PAR);
				setState(1439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1430);
					table_or_subquery();
					setState(1435);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1431);
						match(COMMA);
						setState(1432);
						table_or_subquery();
						}
						}
						setState(1437);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1438);
					join_clause();
					}
					break;
				}
				setState(1441);
				match(CLOSE_PAR);
				setState(1446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1443);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
					case 1:
						{
						setState(1442);
						match(K_AS);
						}
						break;
					}
					setState(1445);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1448);
				match(OPEN_PAR);
				setState(1449);
				select_stmt();
				setState(1450);
				match(CLOSE_PAR);
				setState(1455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1452);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
					case 1:
						{
						setState(1451);
						match(K_AS);
						}
						break;
					}
					setState(1454);
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
			setState(1459);
			table_or_subquery();
			setState(1466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (K_INNER - 91)) | (1L << (K_JOIN - 91)) | (1L << (K_LEFT - 91)) | (1L << (K_NATURAL - 91)))) != 0)) {
				{
				{
				setState(1460);
				join_operator();
				setState(1461);
				table_or_subquery();
				setState(1462);
				join_constraint();
				}
				}
				setState(1468);
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
			setState(1482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1469);
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
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1470);
					match(K_NATURAL);
					}
				}

				setState(1479);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1473);
					match(K_LEFT);
					setState(1475);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1474);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1477);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1478);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1481);
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
			setState(1498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1484);
				match(K_ON);
				setState(1485);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1486);
				match(K_USING);
				setState(1487);
				match(OPEN_PAR);
				setState(1488);
				column_name();
				setState(1493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1489);
					match(COMMA);
					setState(1490);
					column_name();
					}
					}
					setState(1495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1496);
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
		enterRule(_localctx, 126, RULE_select_core);
		int _la;
		try {
			setState(1563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1500);
				match(K_SELECT);
				setState(1502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1501);
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
				setState(1504);
				result_column();
				setState(1509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1505);
					match(COMMA);
					setState(1506);
					result_column();
					}
					}
					setState(1511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1512);
					multi_from_clause();
					}
				}

				setState(1517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1515);
					match(K_WHERE);
					setState(1516);
					expr(0);
					}
				}

				setState(1533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1519);
					match(K_GROUP);
					setState(1520);
					match(K_BY);
					setState(1521);
					expr(0);
					setState(1526);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1522);
						match(COMMA);
						setState(1523);
						expr(0);
						}
						}
						setState(1528);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1531);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1529);
						match(K_HAVING);
						setState(1530);
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
				setState(1535);
				match(K_VALUES);
				setState(1536);
				match(OPEN_PAR);
				setState(1537);
				expr(0);
				setState(1542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1538);
					match(COMMA);
					setState(1539);
					expr(0);
					}
					}
					setState(1544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1545);
				match(CLOSE_PAR);
				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1546);
					match(COMMA);
					setState(1547);
					match(OPEN_PAR);
					setState(1548);
					expr(0);
					setState(1553);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1549);
						match(COMMA);
						setState(1550);
						expr(0);
						}
						}
						setState(1555);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1556);
					match(CLOSE_PAR);
					}
					}
					setState(1562);
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
		enterRule(_localctx, 128, RULE_multi_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			match(K_FROM);
			setState(1575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1566);
				table_or_subquery();
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1567);
					match(COMMA);
					setState(1568);
					table_or_subquery();
					}
					}
					setState(1573);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1574);
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
		enterRule(_localctx, 130, RULE_set_operator);
		try {
			setState(1583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1577);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1578);
				match(K_UNION);
				setState(1579);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1580);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1581);
				match(K_EXCEPT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1582);
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
		enterRule(_localctx, 132, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			table_name();
			setState(1597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1586);
				match(OPEN_PAR);
				setState(1587);
				column_name();
				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1588);
					match(COMMA);
					setState(1589);
					column_name();
					}
					}
					setState(1594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1595);
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
		enterRule(_localctx, 134, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1599);
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

			setState(1602);
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
		enterRule(_localctx, 136, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
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
		enterRule(_localctx, 138, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
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
		enterRule(_localctx, 140, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
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
		enterRule(_localctx, 142, RULE_module_argument);
		try {
			setState(1612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1610);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1611);
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
		enterRule(_localctx, 144, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
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
		enterRule(_localctx, 146, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DATESHIFT) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IDENTIFIABLE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISID - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_MINUS - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_OFFUSCATE - 128)))) != 0)) ) {
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
		enterRule(_localctx, 148, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
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
		enterRule(_localctx, 150, RULE_count_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			match(K_COUNT);
			setState(1621);
			match(OPEN_PAR);
			setState(1631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1622);
					distinct_keyword();
					}
					break;
				}
				setState(1625);
				result_column_expr();
				}
				break;
			case 2:
				{
				setState(1626);
				match(STAR);
				}
				break;
			case 3:
				{
				setState(1628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1627);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1630);
				any_function();
				}
				break;
			}
			setState(1633);
			match(CLOSE_PAR);
			setState(1635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1634);
				deid_tag();
				}
				break;
			}
			setState(1641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1637);
					match(K_AS);
					}
				}

				setState(1640);
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
		enterRule(_localctx, 152, RULE_any_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
			function_name();
			setState(1644);
			match(OPEN_PAR);
			setState(1657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1646);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1645);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1648);
				result_column_expr();
				setState(1653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1649);
					match(COMMA);
					setState(1650);
					result_column_expr();
					}
					}
					setState(1655);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1656);
				match(STAR);
				}
				break;
			}
			setState(1659);
			match(CLOSE_PAR);
			setState(1661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1660);
				deid_tag();
				}
				break;
			}
			setState(1667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1663);
					match(K_AS);
					}
				}

				setState(1666);
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
		enterRule(_localctx, 154, RULE_and_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
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
		enterRule(_localctx, 156, RULE_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
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
		enterRule(_localctx, 158, RULE_and_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
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
		enterRule(_localctx, 160, RULE_not_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
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
		enterRule(_localctx, 162, RULE_in_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
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
		enterRule(_localctx, 164, RULE_like_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
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
		enterRule(_localctx, 166, RULE_distinct_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1681);
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
		enterRule(_localctx, 168, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
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
		enterRule(_localctx, 170, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
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
		enterRule(_localctx, 172, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
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
		enterRule(_localctx, 174, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
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
		enterRule(_localctx, 176, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
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
		enterRule(_localctx, 178, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
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
		enterRule(_localctx, 180, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
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
		enterRule(_localctx, 182, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
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
		enterRule(_localctx, 184, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1699);
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
		enterRule(_localctx, 186, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
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
		enterRule(_localctx, 188, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
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
		enterRule(_localctx, 190, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1705);
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
		enterRule(_localctx, 192, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
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
		enterRule(_localctx, 194, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
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
		enterRule(_localctx, 196, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
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
		enterRule(_localctx, 198, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1713);
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
		enterRule(_localctx, 200, RULE_any_name);
		try {
			setState(1722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1715);
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
				setState(1716);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1717);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1718);
				match(OPEN_PAR);
				setState(1719);
				any_name();
				setState(1720);
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
		enterRule(_localctx, 202, RULE_anything_at_all);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1725); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1724);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1727); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a8\u06c4\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\7\2\u00d1\n\2\f"+
		"\2\16\2\u00d4\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4\u00dd\n\4\f\4\16\4"+
		"\u00e0\13\4\3\4\7\4\u00e3\n\4\f\4\16\4\u00e6\13\4\3\5\3\5\3\5\5\5\u00eb"+
		"\n\5\5\5\u00ed\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u010c"+
		"\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0117\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u011f\n\7\3\7\5\7\u0122\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u012b\n\b\3\t\3\t\5\t\u012f\n\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u0137\n"+
		"\n\3\n\3\n\5\n\u013b\n\n\5\n\u013d\n\n\3\13\3\13\3\13\5\13\u0142\n\13"+
		"\5\13\u0144\n\13\3\f\3\f\5\f\u0148\n\f\3\f\3\f\3\f\7\f\u014d\n\f\f\f\16"+
		"\f\u0150\13\f\5\f\u0152\n\f\3\f\3\f\3\f\3\f\6\f\u0158\n\f\r\f\16\f\u0159"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u0161\n\f\f\f\16\f\u0164\13\f\5\f\u0166\n\f\3"+
		"\f\3\f\3\f\3\f\5\f\u016c\n\f\5\f\u016e\n\f\3\r\3\r\5\r\u0172\n\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0178\n\r\3\r\3\r\3\r\5\r\u017d\n\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u0186\n\r\f\r\16\r\u0189\13\r\3\r\3\r\3\r\5\r\u018e\n\r\3"+
		"\16\3\16\5\16\u0192\n\16\3\16\3\16\3\16\3\16\5\16\u0198\n\16\3\16\3\16"+
		"\3\16\5\16\u019d\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u01a4\n\16\f\16\16"+
		"\16\u01a7\13\16\3\16\3\16\7\16\u01ab\n\16\f\16\16\16\u01ae\13\16\3\16"+
		"\3\16\3\16\5\16\u01b3\n\16\3\16\3\16\5\16\u01b7\n\16\3\17\3\17\5\17\u01bb"+
		"\n\17\3\17\3\17\3\17\3\17\5\17\u01c1\n\17\3\17\3\17\3\17\5\17\u01c6\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u01cd\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u01d6\n\17\f\17\16\17\u01d9\13\17\5\17\u01db\n\17\5\17"+
		"\u01dd\n\17\3\17\3\17\3\17\3\17\5\17\u01e3\n\17\3\17\3\17\3\17\3\17\5"+
		"\17\u01e9\n\17\3\17\3\17\5\17\u01ed\n\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u01f4\n\17\3\17\3\17\6\17\u01f8\n\17\r\17\16\17\u01f9\3\17\3\17\3\20"+
		"\3\20\5\20\u0200\n\20\3\20\3\20\3\20\3\20\5\20\u0206\n\20\3\20\3\20\3"+
		"\20\5\20\u020b\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0217\n\21\3\21\3\21\3\21\5\21\u021c\n\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u0225\n\21\f\21\16\21\u0228\13\21\3\21\3\21\5\21\u022c"+
		"\n\21\3\22\5\22\u022f\n\22\3\22\3\22\3\22\3\22\5\22\u0235\n\22\3\23\5"+
		"\23\u0238\n\23\3\23\3\23\3\23\3\23\5\23\u023e\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u0245\n\23\f\23\16\23\u0248\13\23\5\23\u024a\n\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0250\n\23\5\23\u0252\n\23\3\24\3\24\3\24\3\25\3\25\5"+
		"\25\u0259\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0261\n\26\3\26\3\26"+
		"\3\26\5\26\u0266\n\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u026e\n\27\3"+
		"\27\3\27\3\27\5\27\u0273\n\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u027b"+
		"\n\30\3\30\3\30\3\30\5\30\u0280\n\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31"+
		"\u0288\n\31\3\31\3\31\3\31\5\31\u028d\n\31\3\31\3\31\3\32\5\32\u0292\n"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u02a5\n\32\3\32\3\32\3\32\3\32\5\32\u02ab\n\32"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u02b2\n\32\f\32\16\32\u02b5\13\32\3\32"+
		"\3\32\5\32\u02b9\n\32\3\32\3\32\3\32\3\32\3\32\7\32\u02c0\n\32\f\32\16"+
		"\32\u02c3\13\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u02cb\n\32\f\32\16"+
		"\32\u02ce\13\32\3\32\3\32\7\32\u02d2\n\32\f\32\16\32\u02d5\13\32\3\32"+
		"\3\32\3\32\5\32\u02da\n\32\3\33\3\33\3\33\3\33\5\33\u02e0\n\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u02e9\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u02f0\n\34\3\34\3\34\5\34\u02f4\n\34\5\34\u02f6\n\34\3\35\3\35\5"+
		"\35\u02fa\n\35\3\35\3\35\3\36\3\36\3\36\5\36\u0301\n\36\5\36\u0303\n\36"+
		"\3\36\3\36\5\36\u0307\n\36\3\36\5\36\u030a\n\36\3\37\3\37\3\37\3 \3 \5"+
		" \u0311\n \3 \3 \3 \7 \u0316\n \f \16 \u0319\13 \5 \u031b\n \3 \3 \3 "+
		"\3 \3 \3 \7 \u0323\n \f \16 \u0326\13 \5 \u0328\n \3 \3 \3 \3 \5 \u032e"+
		"\n \5 \u0330\n \3!\3!\3!\3!\3!\3!\7!\u0338\n!\f!\16!\u033b\13!\5!\u033d"+
		"\n!\3!\3!\3!\3!\5!\u0343\n!\5!\u0345\n!\3\"\5\"\u0348\n\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0355\n\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\7\"\u0361\n\"\f\"\16\"\u0364\13\"\3\"\3\"\5\"\u0368\n"+
		"\"\3#\5#\u036b\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0378\n#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\7#\u0384\n#\f#\16#\u0387\13#\3#\3#\5#\u038b\n#"+
		"\3#\3#\3#\3#\3#\7#\u0392\n#\f#\16#\u0395\13#\5#\u0397\n#\3#\3#\3#\3#\5"+
		"#\u039d\n#\5#\u039f\n#\3$\3$\3%\3%\5%\u03a5\n%\3%\7%\u03a8\n%\f%\16%\u03ab"+
		"\13%\3&\6&\u03ae\n&\r&\16&\u03af\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u03bc"+
		"\n&\3\'\3\'\5\'\u03c0\n\'\3\'\3\'\3\'\5\'\u03c5\n\'\3\'\3\'\5\'\u03c9"+
		"\n\'\3\'\5\'\u03cc\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u03de\n\'\3\'\3\'\3\'\5\'\u03e3\n\'\3(\3(\3(\5(\u03e8"+
		"\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)"+
		"\u03ff\n)\3)\5)\u0402\n)\3)\3)\3)\3)\3)\3)\5)\u040a\n)\3)\3)\3)\3)\3)"+
		"\6)\u0411\n)\r)\16)\u0412\3)\3)\5)\u0417\n)\3)\3)\3)\5)\u041c\n)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\5)\u0438\n)\3)\3)\3)\5)\u043d\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5"+
		")\u0449\n)\3)\3)\3)\3)\5)\u044f\n)\3)\3)\3)\3)\3)\5)\u0456\n)\3)\3)\5"+
		")\u045a\n)\3)\3)\3)\3)\3)\3)\7)\u0462\n)\f)\16)\u0465\13)\5)\u0467\n)"+
		"\3)\3)\3)\3)\5)\u046d\n)\3)\5)\u0470\n)\7)\u0472\n)\f)\16)\u0475\13)\3"+
		"*\3*\3*\3*\5*\u047b\n*\3*\3*\3*\5*\u0480\n*\3*\3*\5*\u0484\n*\3*\5*\u0487"+
		"\n*\5*\u0489\n*\3+\3+\3+\3+\5+\u048f\n+\3+\3+\3+\5+\u0494\n+\3+\3+\5+"+
		"\u0498\n+\3+\5+\u049b\n+\3+\5+\u049e\n+\5+\u04a0\n+\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\5,\u04ae\n,\3-\3-\3-\3-\3-\3-\7-\u04b6\n-\f-\16-\u04b9"+
		"\13-\3-\3-\5-\u04bd\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u04c9\n-\3-\3"+
		"-\5-\u04cd\n-\7-\u04cf\n-\f-\16-\u04d2\13-\3-\5-\u04d5\n-\3-\3-\3-\3-"+
		"\3-\5-\u04dc\n-\5-\u04de\n-\3.\3.\3.\3.\3.\3.\5.\u04e6\n.\3.\3.\3/\3/"+
		"\3/\5/\u04ed\n/\3/\5/\u04f0\n/\3\60\3\60\5\60\u04f4\n\60\3\60\3\60\3\60"+
		"\5\60\u04f9\n\60\3\60\3\60\3\60\3\60\7\60\u04ff\n\60\f\60\16\60\u0502"+
		"\13\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\7\60\u0512\n\60\f\60\16\60\u0515\13\60\3\60\3\60\3\60\5\60\u051a"+
		"\n\60\3\61\3\61\5\61\u051e\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\7\61\u052c\n\61\f\61\16\61\u052f\13\61\3\62\3\62"+
		"\3\62\5\62\u0534\n\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u053c\n\62\3"+
		"\63\3\63\3\63\5\63\u0541\n\63\3\63\5\63\u0544\n\63\3\64\3\64\3\64\5\64"+
		"\u0549\n\64\3\65\3\65\3\65\3\65\3\65\7\65\u0550\n\65\f\65\16\65\u0553"+
		"\13\65\3\65\3\65\5\65\u0557\n\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\5\66\u0566\n\66\3\67\3\67\3\67\5\67\u056b"+
		"\n\67\3\67\3\67\38\58\u0570\n8\38\58\u0573\n8\38\58\u0576\n8\39\39\39"+
		"\39\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\5<\u0587\n<\3<\3<\5<\u058b\n<\3<"+
		"\5<\u058e\n<\3<\3<\3<\3<\3<\5<\u0595\n<\3=\3=\3=\3=\3=\7=\u059c\n=\f="+
		"\16=\u059f\13=\3=\5=\u05a2\n=\3=\3=\5=\u05a6\n=\3=\5=\u05a9\n=\3=\3=\3"+
		"=\3=\5=\u05af\n=\3=\5=\u05b2\n=\5=\u05b4\n=\3>\3>\3>\3>\3>\7>\u05bb\n"+
		">\f>\16>\u05be\13>\3?\3?\5?\u05c2\n?\3?\3?\5?\u05c6\n?\3?\3?\5?\u05ca"+
		"\n?\3?\5?\u05cd\n?\3@\3@\3@\3@\3@\3@\3@\7@\u05d6\n@\f@\16@\u05d9\13@\3"+
		"@\3@\5@\u05dd\n@\3A\3A\5A\u05e1\nA\3A\3A\3A\7A\u05e6\nA\fA\16A\u05e9\13"+
		"A\3A\5A\u05ec\nA\3A\3A\5A\u05f0\nA\3A\3A\3A\3A\3A\7A\u05f7\nA\fA\16A\u05fa"+
		"\13A\3A\3A\5A\u05fe\nA\5A\u0600\nA\3A\3A\3A\3A\3A\7A\u0607\nA\fA\16A\u060a"+
		"\13A\3A\3A\3A\3A\3A\3A\7A\u0612\nA\fA\16A\u0615\13A\3A\3A\7A\u0619\nA"+
		"\fA\16A\u061c\13A\5A\u061e\nA\3B\3B\3B\3B\7B\u0624\nB\fB\16B\u0627\13"+
		"B\3B\5B\u062a\nB\3C\3C\3C\3C\3C\3C\5C\u0632\nC\3D\3D\3D\3D\3D\7D\u0639"+
		"\nD\fD\16D\u063c\13D\3D\3D\5D\u0640\nD\3E\5E\u0643\nE\3E\3E\3F\3F\3G\3"+
		"G\3H\3H\3I\3I\5I\u064f\nI\3J\3J\3K\3K\3L\3L\3M\3M\3M\5M\u065a\nM\3M\3"+
		"M\3M\5M\u065f\nM\3M\5M\u0662\nM\3M\3M\5M\u0666\nM\3M\5M\u0669\nM\3M\5"+
		"M\u066c\nM\3N\3N\3N\5N\u0671\nN\3N\3N\3N\7N\u0676\nN\fN\16N\u0679\13N"+
		"\3N\5N\u067c\nN\3N\3N\5N\u0680\nN\3N\5N\u0683\nN\3N\5N\u0686\nN\3O\3O"+
		"\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3["+
		"\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3"+
		"f\3f\3f\3f\3f\3f\5f\u06bd\nf\3g\6g\u06c0\ng\rg\16g\u06c1\3g\2\3Ph\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\2\26\5\2>>IIXX\4\2\61\61FF"+
		"\4\2\7\7rr\3\2\u008c\u008d\4\2$$@@\7\2\33\33MMWW\u0083\u0083\u0086\u0086"+
		"\4\2\t\t\16\17\3\2\n\13\3\2\20\23\3\2\24\27\6\2RRhhjj\177\177\4\2??\u0095"+
		"\u0095\5\2\33\33MM\u0086\u0086\4\2LL\u0092\u0092\4\2\37\37BB\6\2\679p"+
		"p\u00a0\u00a0\u00a2\u00a3\4\2\n\fnn\4\2\u009f\u009f\u00a2\u00a2\6\2\33"+
		"\63\65rt\u009e\u00a8\u00a8\4\2\"\"uu\2\u07b8\2\u00d2\3\2\2\2\4\u00d7\3"+
		"\2\2\2\6\u00da\3\2\2\2\b\u00ec\3\2\2\2\n\u010f\3\2\2\2\f\u0111\3\2\2\2"+
		"\16\u0123\3\2\2\2\20\u012c\3\2\2\2\22\u0134\3\2\2\2\24\u013e\3\2\2\2\26"+
		"\u0151\3\2\2\2\30\u016f\3\2\2\2\32\u018f\3\2\2\2\34\u01b8\3\2\2\2\36\u01fd"+
		"\3\2\2\2 \u0210\3\2\2\2\"\u022e\3\2\2\2$\u0237\3\2\2\2&\u0253\3\2\2\2"+
		"(\u0256\3\2\2\2*\u025c\3\2\2\2,\u0269\3\2\2\2.\u0276\3\2\2\2\60\u0283"+
		"\3\2\2\2\62\u0291\3\2\2\2\64\u02db\3\2\2\2\66\u02ea\3\2\2\28\u02f7\3\2"+
		"\2\2:\u02fd\3\2\2\2<\u030b\3\2\2\2>\u031a\3\2\2\2@\u0331\3\2\2\2B\u0347"+
		"\3\2\2\2D\u036a\3\2\2\2F\u03a0\3\2\2\2H\u03a2\3\2\2\2J\u03ad\3\2\2\2L"+
		"\u03bf\3\2\2\2N\u03e7\3\2\2\2P\u041b\3\2\2\2R\u0488\3\2\2\2T\u049f\3\2"+
		"\2\2V\u04ad\3\2\2\2X\u04af\3\2\2\2Z\u04df\3\2\2\2\\\u04e9\3\2\2\2^\u04f3"+
		"\3\2\2\2`\u051b\3\2\2\2b\u0533\3\2\2\2d\u053d\3\2\2\2f\u0548\3\2\2\2h"+
		"\u054a\3\2\2\2j\u0565\3\2\2\2l\u0567\3\2\2\2n\u056f\3\2\2\2p\u0577\3\2"+
		"\2\2r\u057b\3\2\2\2t\u057f\3\2\2\2v\u0586\3\2\2\2x\u05b3\3\2\2\2z\u05b5"+
		"\3\2\2\2|\u05cc\3\2\2\2~\u05dc\3\2\2\2\u0080\u061d\3\2\2\2\u0082\u061f"+
		"\3\2\2\2\u0084\u0631\3\2\2\2\u0086\u0633\3\2\2\2\u0088\u0642\3\2\2\2\u008a"+
		"\u0646\3\2\2\2\u008c\u0648\3\2\2\2\u008e\u064a\3\2\2\2\u0090\u064e\3\2"+
		"\2\2\u0092\u0650\3\2\2\2\u0094\u0652\3\2\2\2\u0096\u0654\3\2\2\2\u0098"+
		"\u0656\3\2\2\2\u009a\u066d\3\2\2\2\u009c\u0687\3\2\2\2\u009e\u0689\3\2"+
		"\2\2\u00a0\u068b\3\2\2\2\u00a2\u068d\3\2\2\2\u00a4\u068f\3\2\2\2\u00a6"+
		"\u0691\3\2\2\2\u00a8\u0693\3\2\2\2\u00aa\u0695\3\2\2\2\u00ac\u0697\3\2"+
		"\2\2\u00ae\u0699\3\2\2\2\u00b0\u069b\3\2\2\2\u00b2\u069d\3\2\2\2\u00b4"+
		"\u069f\3\2\2\2\u00b6\u06a1\3\2\2\2\u00b8\u06a3\3\2\2\2\u00ba\u06a5\3\2"+
		"\2\2\u00bc\u06a7\3\2\2\2\u00be\u06a9\3\2\2\2\u00c0\u06ab\3\2\2\2\u00c2"+
		"\u06ad\3\2\2\2\u00c4\u06af\3\2\2\2\u00c6\u06b1\3\2\2\2\u00c8\u06b3\3\2"+
		"\2\2\u00ca\u06bc\3\2\2\2\u00cc\u06bf\3\2\2\2\u00ce\u00d1\5\6\4\2\u00cf"+
		"\u00d1\5\4\3\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\7\2\2\3\u00d6\3\3\2\2\2\u00d7\u00d8\7\u00a7"+
		"\2\2\u00d8\u00d9\b\3\1\2\u00d9\5\3\2\2\2\u00da\u00de\5\b\5\2\u00db\u00dd"+
		"\5\b\5\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e4\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\5\u00cc"+
		"g\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\7K\2\2"+
		"\u00e8\u00e9\7{\2\2\u00e9\u00eb\7x\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u010b\3\2\2\2\u00ee\u010c\5\f\7\2\u00ef\u010c\5\16\b\2\u00f0\u010c\5"+
		"\20\t\2\u00f1\u010c\5\22\n\2\u00f2\u010c\5\24\13\2\u00f3\u010c\5\30\r"+
		"\2\u00f4\u010c\5\32\16\2\u00f5\u010c\5\34\17\2\u00f6\u010c\5\36\20\2\u00f7"+
		"\u010c\5 \21\2\u00f8\u010c\5\"\22\2\u00f9\u010c\5$\23\2\u00fa\u010c\5"+
		"(\25\2\u00fb\u010c\5*\26\2\u00fc\u010c\5,\27\2\u00fd\u010c\5.\30\2\u00fe"+
		"\u010c\5\60\31\2\u00ff\u010c\5\62\32\2\u0100\u010c\5\64\33\2\u0101\u010c"+
		"\5\66\34\2\u0102\u010c\58\35\2\u0103\u010c\5:\36\2\u0104\u010c\5<\37\2"+
		"\u0105\u010c\5\26\f\2\u0106\u010c\5@!\2\u0107\u010c\5B\"\2\u0108\u010c"+
		"\5D#\2\u0109\u010c\5F$\2\u010a\u010c\5> \2\u010b\u00ee\3\2\2\2\u010b\u00ef"+
		"\3\2\2\2\u010b\u00f0\3\2\2\2\u010b\u00f1\3\2\2\2\u010b\u00f2\3\2\2\2\u010b"+
		"\u00f3\3\2\2\2\u010b\u00f4\3\2\2\2\u010b\u00f5\3\2\2\2\u010b\u00f6\3\2"+
		"\2\2\u010b\u00f7\3\2\2\2\u010b\u00f8\3\2\2\2\u010b\u00f9\3\2\2\2\u010b"+
		"\u00fa\3\2\2\2\u010b\u00fb\3\2\2\2\u010b\u00fc\3\2\2\2\u010b\u00fd\3\2"+
		"\2\2\u010b\u00fe\3\2\2\2\u010b\u00ff\3\2\2\2\u010b\u0100\3\2\2\2\u010b"+
		"\u0101\3\2\2\2\u010b\u0102\3\2\2\2\u010b\u0103\3\2\2\2\u010b\u0104\3\2"+
		"\2\2\u010b\u0105\3\2\2\2\u010b\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010b"+
		"\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010e\5\n\6\2\u010e\t\3\2\2\2\u010f\u0110\7\3\2\2\u0110\13"+
		"\3\2\2\2\u0111\u0112\7 \2\2\u0112\u0116\7\u008b\2\2\u0113\u0114\5\u00ac"+
		"W\2\u0114\u0115\7\4\2\2\u0115\u0117\3\2\2\2\u0116\u0113\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0121\5\u00aeX\2\u0119\u011a"+
		"\7\u0082\2\2\u011a\u011b\7\u008f\2\2\u011b\u0122\5\u00b2Z\2\u011c\u011e"+
		"\7\35\2\2\u011d\u011f\7\60\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2"+
		"\u011f\u0120\3\2\2\2\u0120\u0122\5H%\2\u0121\u0119\3\2\2\2\u0121\u011c"+
		"\3\2\2\2\u0122\r\3\2\2\2\u0123\u012a\7!\2\2\u0124\u012b\5\u00acW\2\u0125"+
		"\u012b\5\u00b0Y\2\u0126\u0127\5\u00acW\2\u0127\u0128\7\4\2\2\u0128\u0129"+
		"\5\u00b0Y\2\u0129\u012b\3\2\2\2\u012a\u0124\3\2\2\2\u012a\u0125\3\2\2"+
		"\2\u012a\u0126\3\2\2\2\u012a\u012b\3\2\2\2\u012b\17\3\2\2\2\u012c\u012e"+
		"\7%\2\2\u012d\u012f\7:\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\5P)\2\u0131\u0132\7#\2\2\u0132\u0133\5\u00ac"+
		"W\2\u0133\21\3\2\2\2\u0134\u0136\7(\2\2\u0135\u0137\t\2\2\2\u0136\u0135"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013c\3\2\2\2\u0138\u013a\7\u0090\2"+
		"\2\u0139\u013b\5\u00c8e\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u0138\3\2\2\2\u013c\u013d\3\2\2\2\u013d\23\3\2\2"+
		"\2\u013e\u0143\t\3\2\2\u013f\u0141\7\u0090\2\2\u0140\u0142\5\u00c8e\2"+
		"\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u013f"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\25\3\2\2\2\u0145\u0147\7\u009d\2\2"+
		"\u0146\u0148\7}\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\u014e\5h\65\2\u014a\u014b\7\7\2\2\u014b\u014d\5h\65\2\u014c"+
		"\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0145\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0157\5\u0080A\2\u0154\u0155"+
		"\5\u0084C\2\u0155\u0156\5\u0080A\2\u0156\u0158\3\2\2\2\u0157\u0154\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u0165\3\2\2\2\u015b\u015c\7v\2\2\u015c\u015d\7*\2\2\u015d\u0162\5d\63"+
		"\2\u015e\u015f\7\7\2\2\u015f\u0161\5d\63\2\u0160\u015e\3\2\2\2\u0161\u0164"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0166\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u015b\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016d\3\2"+
		"\2\2\u0167\u0168\7i\2\2\u0168\u016b\5P)\2\u0169\u016a\t\4\2\2\u016a\u016c"+
		"\5P)\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d"+
		"\u0167\3\2\2\2\u016d\u016e\3\2\2\2\u016e\27\3\2\2\2\u016f\u0171\7\65\2"+
		"\2\u0170\u0172\7\u0094\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0177\7Z\2\2\u0174\u0175\7U\2\2\u0175\u0176\7n\2"+
		"\2\u0176\u0178\7J\2\2\u0177\u0174\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017c"+
		"\3\2\2\2\u0179\u017a\5\u00acW\2\u017a\u017b\7\4\2\2\u017b\u017d\3\2\2"+
		"\2\u017c\u0179\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f"+
		"\5\u00ba^\2\u017f\u0180\7t\2\2\u0180\u0181\5\u00aeX\2\u0181\u0182\7\5"+
		"\2\2\u0182\u0187\5\\/\2\u0183\u0184\7\7\2\2\u0184\u0186\5\\/\2\u0185\u0183"+
		"\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018d\7\6\2\2\u018b\u018c\7\u009c"+
		"\2\2\u018c\u018e\5P)\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\31"+
		"\3\2\2\2\u018f\u0191\7\65\2\2\u0190\u0192\t\5\2\2\u0191\u0190\3\2\2\2"+
		"\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0197\7\u008b\2\2\u0194"+
		"\u0195\7U\2\2\u0195\u0196\7n\2\2\u0196\u0198\7J\2\2\u0197\u0194\3\2\2"+
		"\2\u0197\u0198\3\2\2\2\u0198\u019c\3\2\2\2\u0199\u019a\5\u00acW\2\u019a"+
		"\u019b\7\4\2\2\u019b\u019d\3\2\2\2\u019c\u0199\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u01b6\5\u00aeX\2\u019f\u01a0\7\5\2\2\u01a0"+
		"\u01a5\5H%\2\u01a1\u01a2\7\7\2\2\u01a2\u01a4\5H%\2\u01a3\u01a1\3\2\2\2"+
		"\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01ac"+
		"\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7\7\2\2\u01a9\u01ab\5^\60\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01ad\u01af\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\7\6\2\2\u01b0"+
		"\u01b1\7\u009e\2\2\u01b1\u01b3\7\u009f\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b7\3\2\2\2\u01b4\u01b5\7#\2\2\u01b5\u01b7\5@!\2\u01b6"+
		"\u019f\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\33\3\2\2\2\u01b8\u01ba\7\65\2"+
		"\2\u01b9\u01bb\t\5\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01c0\7\u0091\2\2\u01bd\u01be\7U\2\2\u01be\u01bf\7n\2\2"+
		"\u01bf\u01c1\7J\2\2\u01c0\u01bd\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c5"+
		"\3\2\2\2\u01c2\u01c3\5\u00acW\2\u01c3\u01c4\7\4\2\2\u01c4\u01c6\3\2\2"+
		"\2\u01c5\u01c2\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01cc"+
		"\5\u00bc_\2\u01c8\u01cd\7\'\2\2\u01c9\u01cd\7\36\2\2\u01ca\u01cb\7_\2"+
		"\2\u01cb\u01cd\7q\2\2\u01cc\u01c8\3\2\2\2\u01cc\u01c9\3\2\2\2\u01cc\u01ca"+
		"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01dc\3\2\2\2\u01ce\u01dd\7?\2\2\u01cf"+
		"\u01dd\7^\2\2\u01d0\u01da\7\u0095\2\2\u01d1\u01d2\7q\2\2\u01d2\u01d7\5"+
		"\u00b4[\2\u01d3\u01d4\7\7\2\2\u01d4\u01d6\5\u00b4[\2\u01d5\u01d3\3\2\2"+
		"\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01db"+
		"\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01d1\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01dd\3\2\2\2\u01dc\u01ce\3\2\2\2\u01dc\u01cf\3\2\2\2\u01dc\u01d0\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u01e2\7t\2\2\u01df\u01e0\5\u00acW\2\u01e0"+
		"\u01e1\7\4\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01df\3\2\2\2\u01e2\u01e3\3\2"+
		"\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e8\5\u00aeX\2\u01e5\u01e6\7N\2\2\u01e6"+
		"\u01e7\7D\2\2\u01e7\u01e9\7\u0087\2\2\u01e8\u01e5\3\2\2\2\u01e8\u01e9"+
		"\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01eb\7\u009b\2\2\u01eb\u01ed\5P)\2"+
		"\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f7"+
		"\7(\2\2\u01ef\u01f4\5B\"\2\u01f0\u01f4\5\62\32\2\u01f1\u01f4\5\"\22\2"+
		"\u01f2\u01f4\5@!\2\u01f3\u01ef\3\2\2\2\u01f3\u01f0\3\2\2\2\u01f3\u01f1"+
		"\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\7\3\2\2\u01f6"+
		"\u01f8\3\2\2\2\u01f7\u01f3\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01f7\3\2"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\7F\2\2\u01fc"+
		"\35\3\2\2\2\u01fd\u01ff\7\65\2\2\u01fe\u0200\t\5\2\2\u01ff\u01fe\3\2\2"+
		"\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0205\7\u0099\2\2\u0202"+
		"\u0203\7U\2\2\u0203\u0204\7n\2\2\u0204\u0206\7J\2\2\u0205\u0202\3\2\2"+
		"\2\u0205\u0206\3\2\2\2\u0206\u020a\3\2\2\2\u0207\u0208\5\u00acW\2\u0208"+
		"\u0209\7\4\2\2\u0209\u020b\3\2\2\2\u020a\u0207\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020c\u020d\5\u00be`\2\u020d\u020e\7#\2\2\u020e"+
		"\u020f\5@!\2\u020f\37\3\2\2\2\u0210\u0211\7\65\2\2\u0211\u0212\7\u009a"+
		"\2\2\u0212\u0216\7\u008b\2\2\u0213\u0214\7U\2\2\u0214\u0215\7n\2\2\u0215"+
		"\u0217\7J\2\2\u0216\u0213\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u021b\3\2"+
		"\2\2\u0218\u0219\5\u00acW\2\u0219\u021a\7\4\2\2\u021a\u021c\3\2\2\2\u021b"+
		"\u0218\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\5\u00ae"+
		"X\2\u021e\u021f\7\u0096\2\2\u021f\u022b\5\u00c0a\2\u0220\u0221\7\5\2\2"+
		"\u0221\u0226\5\u0090I\2\u0222\u0223\7\7\2\2\u0223\u0225\5\u0090I\2\u0224"+
		"\u0222\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227\u0229\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\7\6\2\2\u022a"+
		"\u022c\3\2\2\2\u022b\u0220\3\2\2\2\u022b\u022c\3\2\2\2\u022c!\3\2\2\2"+
		"\u022d\u022f\5`\61\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230"+
		"\3\2\2\2\u0230\u0231\7?\2\2\u0231\u0234\5&\24\2\u0232\u0233\7\u009c\2"+
		"\2\u0233\u0235\5P)\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235#\3"+
		"\2\2\2\u0236\u0238\5`\61\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239\u023a\7?\2\2\u023a\u023d\5&\24\2\u023b\u023c\7\u009c"+
		"\2\2\u023c\u023e\5P)\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0251"+
		"\3\2\2\2\u023f\u0240\7v\2\2\u0240\u0241\7*\2\2\u0241\u0246\5d\63\2\u0242"+
		"\u0243\7\7\2\2\u0243\u0245\5d\63\2\u0244\u0242\3\2\2\2\u0245\u0248\3\2"+
		"\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u024a\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0249\u023f\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2"+
		"\2\2\u024b\u024c\7i\2\2\u024c\u024f\5P)\2\u024d\u024e\t\4\2\2\u024e\u0250"+
		"\5P)\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\3\2\2\2\u0251"+
		"\u0249\3\2\2\2\u0251\u0252\3\2\2\2\u0252%\3\2\2\2\u0253\u0254\7P\2\2\u0254"+
		"\u0255\5b\62\2\u0255\'\3\2\2\2\u0256\u0258\7A\2\2\u0257\u0259\7:\2\2\u0258"+
		"\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\5\u00ac"+
		"W\2\u025b)\3\2\2\2\u025c\u025d\7C\2\2\u025d\u0260\7Z\2\2\u025e\u025f\7"+
		"U\2\2\u025f\u0261\7J\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261"+
		"\u0265\3\2\2\2\u0262\u0263\5\u00acW\2\u0263\u0264\7\4\2\2\u0264\u0266"+
		"\3\2\2\2\u0265\u0262\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"\u0268\5\u00ba^\2\u0268+\3\2\2\2\u0269\u026a\7C\2\2\u026a\u026d\7\u008b"+
		"\2\2\u026b\u026c\7U\2\2\u026c\u026e\7J\2\2\u026d\u026b\3\2\2\2\u026d\u026e"+
		"\3\2\2\2\u026e\u0272\3\2\2\2\u026f\u0270\5\u00acW\2\u0270\u0271\7\4\2"+
		"\2\u0271\u0273\3\2\2\2\u0272\u026f\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u0275\5\u00aeX\2\u0275-\3\2\2\2\u0276\u0277\7C\2\2\u0277"+
		"\u027a\7\u0091\2\2\u0278\u0279\7U\2\2\u0279\u027b\7J\2\2\u027a\u0278\3"+
		"\2\2\2\u027a\u027b\3\2\2\2\u027b\u027f\3\2\2\2\u027c\u027d\5\u00acW\2"+
		"\u027d\u027e\7\4\2\2\u027e\u0280\3\2\2\2\u027f\u027c\3\2\2\2\u027f\u0280"+
		"\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\5\u00bc_\2\u0282/\3\2\2\2\u0283"+
		"\u0284\7C\2\2\u0284\u0287\7\u0099\2\2\u0285\u0286\7U\2\2\u0286\u0288\7"+
		"J\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028c\3\2\2\2\u0289"+
		"\u028a\5\u00acW\2\u028a\u028b\7\4\2\2\u028b\u028d\3\2\2\2\u028c\u0289"+
		"\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\5\u00be`"+
		"\2\u028f\61\3\2\2\2\u0290\u0292\5`\61\2\u0291\u0290\3\2\2\2\u0291\u0292"+
		"\3\2\2\2\u0292\u02a4\3\2\2\2\u0293\u02a5\7^\2\2\u0294\u02a5\7\u0083\2"+
		"\2\u0295\u0296\7^\2\2\u0296\u0297\7u\2\2\u0297\u02a5\7\u0083\2\2\u0298"+
		"\u0299\7^\2\2\u0299\u029a\7u\2\2\u029a\u02a5\7\u0086\2\2\u029b\u029c\7"+
		"^\2\2\u029c\u029d\7u\2\2\u029d\u02a5\7\33\2\2\u029e\u029f\7^\2\2\u029f"+
		"\u02a0\7u\2\2\u02a0\u02a5\7M\2\2\u02a1\u02a2\7^\2\2\u02a2\u02a3\7u\2\2"+
		"\u02a3\u02a5\7W\2\2\u02a4\u0293\3\2\2\2\u02a4\u0294\3\2\2\2\u02a4\u0295"+
		"\3\2\2\2\u02a4\u0298\3\2\2\2\u02a4\u029b\3\2\2\2\u02a4\u029e\3\2\2\2\u02a4"+
		"\u02a1\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02aa\7a\2\2\u02a7\u02a8\5\u00ac"+
		"W\2\u02a8\u02a9\7\4\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a7\3\2\2\2\u02aa"+
		"\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02b8\5\u00aeX\2\u02ad\u02ae"+
		"\7\5\2\2\u02ae\u02b3\5\u00b4[\2\u02af\u02b0\7\7\2\2\u02b0\u02b2\5\u00b4"+
		"[\2\u02b1\u02af\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b7\7\6"+
		"\2\2\u02b7\u02b9\3\2\2\2\u02b8\u02ad\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9"+
		"\u02d9\3\2\2\2\u02ba\u02bb\7\u0098\2\2\u02bb\u02bc\7\5\2\2\u02bc\u02c1"+
		"\5P)\2\u02bd\u02be\7\7\2\2\u02be\u02c0\5P)\2\u02bf\u02bd\3\2\2\2\u02c0"+
		"\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\3\2"+
		"\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02d3\7\6\2\2\u02c5\u02c6\7\7\2\2\u02c6"+
		"\u02c7\7\5\2\2\u02c7\u02cc\5P)\2\u02c8\u02c9\7\7\2\2\u02c9\u02cb\5P)\2"+
		"\u02ca\u02c8\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd"+
		"\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d0\7\6\2\2\u02d0"+
		"\u02d2\3\2\2\2\u02d1\u02c5\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2"+
		"\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02da\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6"+
		"\u02da\5@!\2\u02d7\u02d8\7<\2\2\u02d8\u02da\7\u0098\2\2\u02d9\u02ba\3"+
		"\2\2\2\u02d9\u02d6\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\63\3\2\2\2\u02db"+
		"\u02df\7y\2\2\u02dc\u02dd\5\u00acW\2\u02dd\u02de\7\4\2\2\u02de\u02e0\3"+
		"\2\2\2\u02df\u02dc\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1"+
		"\u02e8\5\u00c2b\2\u02e2\u02e3\7\b\2\2\u02e3\u02e9\5f\64\2\u02e4\u02e5"+
		"\7\5\2\2\u02e5\u02e6\5f\64\2\u02e6\u02e7\7\6\2\2\u02e7\u02e9\3\2\2\2\u02e8"+
		"\u02e2\3\2\2\2\u02e8\u02e4\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\65\3\2\2"+
		"\2\u02ea\u02f5\7\u0080\2\2\u02eb\u02f6\5\u00b6\\\2\u02ec\u02ed\5\u00ac"+
		"W\2\u02ed\u02ee\7\4\2\2\u02ee\u02f0\3\2\2\2\u02ef\u02ec\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02f4\5\u00aeX\2\u02f2\u02f4"+
		"\5\u00ba^\2\u02f3\u02f1\3\2\2\2\u02f3\u02f2\3\2\2\2\u02f4\u02f6\3\2\2"+
		"\2\u02f5\u02eb\3\2\2\2\u02f5\u02ef\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\67"+
		"\3\2\2\2\u02f7\u02f9\7\u0081\2\2\u02f8\u02fa\7\u0088\2\2\u02f9\u02f8\3"+
		"\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\5\u00c4c\2"+
		"\u02fc9\3\2\2\2\u02fd\u0302\7\u0086\2\2\u02fe\u0300\7\u0090\2\2\u02ff"+
		"\u0301\5\u00c8e\2\u0300\u02ff\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303"+
		"\3\2\2\2\u0302\u02fe\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0309\3\2\2\2\u0304"+
		"\u0306\7\u008f\2\2\u0305\u0307\7\u0088\2\2\u0306\u0305\3\2\2\2\u0306\u0307"+
		"\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030a\5\u00c4c\2\u0309\u0304\3\2\2"+
		"\2\u0309\u030a\3\2\2\2\u030a;\3\2\2\2\u030b\u030c\7\u0088\2\2\u030c\u030d"+
		"\5\u00c4c\2\u030d=\3\2\2\2\u030e\u0310\7\u009d\2\2\u030f\u0311\7}\2\2"+
		"\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0317"+
		"\5h\65\2\u0313\u0314\7\7\2\2\u0314\u0316\5h\65\2\u0315\u0313\3\2\2\2\u0316"+
		"\u0319\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031b\3\2"+
		"\2\2\u0319\u0317\3\2\2\2\u031a\u030e\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u031c\3\2\2\2\u031c\u0327\5\u0080A\2\u031d\u031e\7v\2\2\u031e\u031f\7"+
		"*\2\2\u031f\u0324\5d\63\2\u0320\u0321\7\7\2\2\u0321\u0323\5d\63\2\u0322"+
		"\u0320\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2"+
		"\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0327\u031d\3\2\2\2\u0327"+
		"\u0328\3\2\2\2\u0328\u032f\3\2\2\2\u0329\u032a\7i\2\2\u032a\u032d\5P)"+
		"\2\u032b\u032c\t\4\2\2\u032c\u032e\5P)\2\u032d\u032b\3\2\2\2\u032d\u032e"+
		"\3\2\2\2\u032e\u0330\3\2\2\2\u032f\u0329\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"?\3\2\2\2\u0331\u033c\5\u0080A\2\u0332\u0333\7v\2\2\u0333\u0334\7*\2\2"+
		"\u0334\u0339\5d\63\2\u0335\u0336\7\7\2\2\u0336\u0338\5d\63\2\u0337\u0335"+
		"\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a"+
		"\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u0332\3\2\2\2\u033c\u033d\3\2"+
		"\2\2\u033d\u0344\3\2\2\2\u033e\u033f\7i\2\2\u033f\u0342\5P)\2\u0340\u0341"+
		"\t\4\2\2\u0341\u0343\5P)\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343"+
		"\u0345\3\2\2\2\u0344\u033e\3\2\2\2\u0344\u0345\3\2\2\2\u0345A\3\2\2\2"+
		"\u0346\u0348\5`\61\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349"+
		"\3\2\2\2\u0349\u0354\7\u0095\2\2\u034a\u034b\7u\2\2\u034b\u0355\7\u0086"+
		"\2\2\u034c\u034d\7u\2\2\u034d\u0355\7\33\2\2\u034e\u034f\7u\2\2\u034f"+
		"\u0355\7\u0083\2\2\u0350\u0351\7u\2\2\u0351\u0355\7M\2\2\u0352\u0353\7"+
		"u\2\2\u0353\u0355\7W\2\2\u0354\u034a\3\2\2\2\u0354\u034c\3\2\2\2\u0354"+
		"\u034e\3\2\2\2\u0354\u0350\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2"+
		"\2\2\u0355\u0356\3\2\2\2\u0356\u0357\5b\62\2\u0357\u0358\7\u008a\2\2\u0358"+
		"\u0359\5\u00b4[\2\u0359\u035a\7\b\2\2\u035a\u0362\5P)\2\u035b\u035c\7"+
		"\7\2\2\u035c\u035d\5\u00b4[\2\u035d\u035e\7\b\2\2\u035e\u035f\5P)\2\u035f"+
		"\u0361\3\2\2\2\u0360\u035b\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2"+
		"\2\2\u0362\u0363\3\2\2\2\u0363\u0367\3\2\2\2\u0364\u0362\3\2\2\2\u0365"+
		"\u0366\7\u009c\2\2\u0366\u0368\5P)\2\u0367\u0365\3\2\2\2\u0367\u0368\3"+
		"\2\2\2\u0368C\3\2\2\2\u0369\u036b\5`\61\2\u036a\u0369\3\2\2\2\u036a\u036b"+
		"\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u0377\7\u0095\2\2\u036d\u036e\7u\2"+
		"\2\u036e\u0378\7\u0086\2\2\u036f\u0370\7u\2\2\u0370\u0378\7\33\2\2\u0371"+
		"\u0372\7u\2\2\u0372\u0378\7\u0083\2\2\u0373\u0374\7u\2\2\u0374\u0378\7"+
		"M\2\2\u0375\u0376\7u\2\2\u0376\u0378\7W\2\2\u0377\u036d\3\2\2\2\u0377"+
		"\u036f\3\2\2\2\u0377\u0371\3\2\2\2\u0377\u0373\3\2\2\2\u0377\u0375\3\2"+
		"\2\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\5b\62\2\u037a"+
		"\u037b\7\u008a\2\2\u037b\u037c\5\u00b4[\2\u037c\u037d\7\b\2\2\u037d\u0385"+
		"\5P)\2\u037e\u037f\7\7\2\2\u037f\u0380\5\u00b4[\2\u0380\u0381\7\b\2\2"+
		"\u0381\u0382\5P)\2\u0382\u0384\3\2\2\2\u0383\u037e\3\2\2\2\u0384\u0387"+
		"\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u038a\3\2\2\2\u0387"+
		"\u0385\3\2\2\2\u0388\u0389\7\u009c\2\2\u0389\u038b\5P)\2\u038a\u0388\3"+
		"\2\2\2\u038a\u038b\3\2\2\2\u038b\u039e\3\2\2\2\u038c\u038d\7v\2\2\u038d"+
		"\u038e\7*\2\2\u038e\u0393\5d\63\2\u038f\u0390\7\7\2\2\u0390\u0392\5d\63"+
		"\2\u0391\u038f\3\2\2\2\u0392\u0395\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394"+
		"\3\2\2\2\u0394\u0397\3\2\2\2\u0395\u0393\3\2\2\2\u0396\u038c\3\2\2\2\u0396"+
		"\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\7i\2\2\u0399\u039c\5P)"+
		"\2\u039a\u039b\t\4\2\2\u039b\u039d\5P)\2\u039c\u039a\3\2\2\2\u039c\u039d"+
		"\3\2\2\2\u039d\u039f\3\2\2\2\u039e\u0396\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"E\3\2\2\2\u03a0\u03a1\7\u0097\2\2\u03a1G\3\2\2\2\u03a2\u03a4\5\u00b4["+
		"\2\u03a3\u03a5\5J&\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a9"+
		"\3\2\2\2\u03a6\u03a8\5L\'\2\u03a7\u03a6\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9"+
		"\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aaI\3\2\2\2\u03ab\u03a9\3\2\2\2"+
		"\u03ac\u03ae\5\u0096L\2\u03ad\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af"+
		"\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03bb\3\2\2\2\u03b1\u03b2\7\5"+
		"\2\2\u03b2\u03b3\5\u0088E\2\u03b3\u03b4\7\6\2\2\u03b4\u03bc\3\2\2\2\u03b5"+
		"\u03b6\7\5\2\2\u03b6\u03b7\5\u0088E\2\u03b7\u03b8\7\7\2\2\u03b8\u03b9"+
		"\5\u0088E\2\u03b9\u03ba\7\6\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03b1\3\2\2"+
		"\2\u03bb\u03b5\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bcK\3\2\2\2\u03bd\u03be"+
		"\7\63\2\2\u03be\u03c0\5\u0096L\2\u03bf\u03bd\3\2\2\2\u03bf\u03c0\3\2\2"+
		"\2\u03c0\u03e2\3\2\2\2\u03c1\u03c2\7z\2\2\u03c2\u03c4\7f\2\2\u03c3\u03c5"+
		"\t\6\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6"+
		"\u03c8\5N(\2\u03c7\u03c9\7&\2\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2"+
		"\2\u03c9\u03e3\3\2\2\2\u03ca\u03cc\7n\2\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc"+
		"\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\7p\2\2\u03ce\u03e3\5N(\2\u03cf"+
		"\u03d0\7\u0094\2\2\u03d0\u03e3\5N(\2\u03d1\u03d2\7.\2\2\u03d2\u03d3\7"+
		"\5\2\2\u03d3\u03d4\5P)\2\u03d4\u03d5\7\6\2\2\u03d5\u03e3\3\2\2\2\u03d6"+
		"\u03dd\7<\2\2\u03d7\u03de\5\u0088E\2\u03d8\u03de\5\u008aF\2\u03d9\u03da"+
		"\7\5\2\2\u03da\u03db\5P)\2\u03db\u03dc\7\6\2\2\u03dc\u03de\3\2\2\2\u03dd"+
		"\u03d7\3\2\2\2\u03dd\u03d8\3\2\2\2\u03dd\u03d9\3\2\2\2\u03de\u03e3\3\2"+
		"\2\2\u03df\u03e0\7/\2\2\u03e0\u03e3\5\u00b6\\\2\u03e1\u03e3\5X-\2\u03e2"+
		"\u03c1\3\2\2\2\u03e2\u03cb\3\2\2\2\u03e2\u03cf\3\2\2\2\u03e2\u03d1\3\2"+
		"\2\2\u03e2\u03d6\3\2\2\2\u03e2\u03df\3\2\2\2\u03e2\u03e1\3\2\2\2\u03e3"+
		"M\3\2\2\2\u03e4\u03e5\7t\2\2\u03e5\u03e6\7\62\2\2\u03e6\u03e8\t\7\2\2"+
		"\u03e7\u03e4\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8O\3\2\2\2\u03e9\u03ea\b"+
		")\1\2\u03ea\u041c\5\u008aF\2\u03eb\u041c\7\u00a1\2\2\u03ec\u041c\5R*\2"+
		"\u03ed\u03ee\5\u008cG\2\u03ee\u03ef\5P)\27\u03ef\u041c\3\2\2\2\u03f0\u041c"+
		"\5\u0098M\2\u03f1\u041c\5\u009aN\2\u03f2\u03f3\7\5\2\2\u03f3\u03f4\5P"+
		")\2\u03f4\u03f5\7\6\2\2\u03f5\u041c\3\2\2\2\u03f6\u03f7\7-\2\2\u03f7\u03f8"+
		"\7\5\2\2\u03f8\u03f9\5P)\2\u03f9\u03fa\7#\2\2\u03fa\u03fb\5J&\2\u03fb"+
		"\u03fc\7\6\2\2\u03fc\u041c\3\2\2\2\u03fd\u03ff\7n\2\2\u03fe\u03fd\3\2"+
		"\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0402\7J\2\2\u0401"+
		"\u03fe\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\7\5"+
		"\2\2\u0404\u0405\5@!\2\u0405\u0406\7\6\2\2\u0406\u041c\3\2\2\2\u0407\u0409"+
		"\7,\2\2\u0408\u040a\5P)\2\u0409\u0408\3\2\2\2\u0409\u040a\3\2\2\2\u040a"+
		"\u0410\3\2\2\2\u040b\u040c\7\u009b\2\2\u040c\u040d\5P)\2\u040d\u040e\7"+
		"\u008e\2\2\u040e\u040f\5P)\2\u040f\u0411\3\2\2\2\u0410\u040b\3\2\2\2\u0411"+
		"\u0412\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0416\3\2"+
		"\2\2\u0414\u0415\7E\2\2\u0415\u0417\5P)\2\u0416\u0414\3\2\2\2\u0416\u0417"+
		"\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419\7F\2\2\u0419\u041c\3\2\2\2\u041a"+
		"\u041c\5Z.\2\u041b\u03e9\3\2\2\2\u041b\u03eb\3\2\2\2\u041b\u03ec\3\2\2"+
		"\2\u041b\u03ed\3\2\2\2\u041b\u03f0\3\2\2\2\u041b\u03f1\3\2\2\2\u041b\u03f2"+
		"\3\2\2\2\u041b\u03f6\3\2\2\2\u041b\u0401\3\2\2\2\u041b\u0407\3\2\2\2\u041b"+
		"\u041a\3\2\2\2\u041c\u0473\3\2\2\2\u041d\u041e\f\26\2\2\u041e\u041f\7"+
		"\r\2\2\u041f\u0472\5P)\27\u0420\u0421\f\25\2\2\u0421\u0422\t\b\2\2\u0422"+
		"\u0472\5P)\26\u0423\u0424\f\24\2\2\u0424\u0425\t\t\2\2\u0425\u0472\5P"+
		")\25\u0426\u0427\f\23\2\2\u0427\u0428\t\n\2\2\u0428\u0472\5P)\24\u0429"+
		"\u042a\f\22\2\2\u042a\u042b\t\13\2\2\u042b\u0472\5P)\23\u042c\u042d\f"+
		"\21\2\2\u042d\u042e\5V,\2\u042e\u042f\5P)\22\u042f\u0472\3\2\2\2\u0430"+
		"\u0431\f\20\2\2\u0431\u0432\5\u00a0Q\2\u0432\u0433\5P)\21\u0433\u0472"+
		"\3\2\2\2\u0434\u0435\f\b\2\2\u0435\u0437\7b\2\2\u0436\u0438\7n\2\2\u0437"+
		"\u0436\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u0472\5P"+
		")\t\u043a\u043c\f\7\2\2\u043b\u043d\7n\2\2\u043c\u043b\3\2\2\2\u043c\u043d"+
		"\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\7)\2\2\u043f\u0440\5P)\2\u0440"+
		"\u0441\7\"\2\2\u0441\u0442\5P)\b\u0442\u0472\3\2\2\2\u0443\u0444\f\13"+
		"\2\2\u0444\u0445\7/\2\2\u0445\u0472\5\u00b6\\\2\u0446\u0448\f\n\2\2\u0447"+
		"\u0449\7n\2\2\u0448\u0447\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a\3\2"+
		"\2\2\u044a\u044b\t\f\2\2\u044b\u044e\5P)\2\u044c\u044d\7G\2\2\u044d\u044f"+
		"\5P)\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0472\3\2\2\2\u0450"+
		"\u0455\f\t\2\2\u0451\u0456\7d\2\2\u0452\u0456\7o\2\2\u0453\u0454\7n\2"+
		"\2\u0454\u0456\7p\2\2\u0455\u0451\3\2\2\2\u0455\u0452\3\2\2\2\u0455\u0453"+
		"\3\2\2\2\u0456\u0472\3\2\2\2\u0457\u0459\f\6\2\2\u0458\u045a\7n\2\2\u0459"+
		"\u0458\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u046f\7Y"+
		"\2\2\u045c\u0466\7\5\2\2\u045d\u0467\5@!\2\u045e\u0463\5P)\2\u045f\u0460"+
		"\7\7\2\2\u0460\u0462\5P)\2\u0461\u045f\3\2\2\2\u0462\u0465\3\2\2\2\u0463"+
		"\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0467\3\2\2\2\u0465\u0463\3\2"+
		"\2\2\u0466\u045d\3\2\2\2\u0466\u045e\3\2\2\2\u0466\u0467\3\2\2\2\u0467"+
		"\u0468\3\2\2\2\u0468\u0470\7\6\2\2\u0469\u046a\5\u00acW\2\u046a\u046b"+
		"\7\4\2\2\u046b\u046d\3\2\2\2\u046c\u0469\3\2\2\2\u046c\u046d\3\2\2\2\u046d"+
		"\u046e\3\2\2\2\u046e\u0470\5\u00aeX\2\u046f\u045c\3\2\2\2\u046f\u046c"+
		"\3\2\2\2\u0470\u0472\3\2\2\2\u0471\u041d\3\2\2\2\u0471\u0420\3\2\2\2\u0471"+
		"\u0423\3\2\2\2\u0471\u0426\3\2\2\2\u0471\u0429\3\2\2\2\u0471\u042c\3\2"+
		"\2\2\u0471\u0430\3\2\2\2\u0471\u0434\3\2\2\2\u0471\u043a\3\2\2\2\u0471"+
		"\u0443\3\2\2\2\u0471\u0446\3\2\2\2\u0471\u0450\3\2\2\2\u0471\u0457\3\2"+
		"\2\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474"+
		"Q\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u0489\3\2\2\2\u0477\u0478\5\u00ac"+
		"W\2\u0478\u0479\7\4\2\2\u0479\u047b\3\2\2\2\u047a\u0477\3\2\2\2\u047a"+
		"\u047b\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047d\5\u00aeX\2\u047d\u047e"+
		"\7\4\2\2\u047e\u0480\3\2\2\2\u047f\u047a\3\2\2\2\u047f\u0480\3\2\2\2\u0480"+
		"\u0481\3\2\2\2\u0481\u0486\5\u00b4[\2\u0482\u0484\7#\2\2\u0483\u0482\3"+
		"\2\2\2\u0483\u0484\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0487\5\u0092J\2"+
		"\u0486\u0483\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0489\3\2\2\2\u0488\u0476"+
		"\3\2\2\2\u0488\u047f\3\2\2\2\u0489S\3\2\2\2\u048a\u04a0\3\2\2\2\u048b"+
		"\u048c\5\u00acW\2\u048c\u048d\7\4\2\2\u048d\u048f\3\2\2\2\u048e\u048b"+
		"\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\5\u00aeX"+
		"\2\u0491\u0492\7\4\2\2\u0492\u0494\3\2\2\2\u0493\u048e\3\2\2\2\u0493\u0494"+
		"\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0497\5\u00b4[\2\u0496\u0498\5l\67"+
		"\2\u0497\u0496\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049d\3\2\2\2\u0499\u049b"+
		"\7#\2\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\3\2\2\2\u049c"+
		"\u049e\5\u0092J\2\u049d\u049a\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a0"+
		"\3\2\2\2\u049f\u048a\3\2\2\2\u049f\u0493\3\2\2\2\u04a0U\3\2\2\2\u04a1"+
		"\u04ae\7\b\2\2\u04a2\u04ae\7\30\2\2\u04a3\u04ae\7\31\2\2\u04a4\u04ae\7"+
		"\32\2\2\u04a5\u04ae\7b\2\2\u04a6\u04a7\7b\2\2\u04a7\u04ae\7n\2\2\u04a8"+
		"\u04ae\5\u00a4S\2\u04a9\u04ae\5\u00a6T\2\u04aa\u04ae\7R\2\2\u04ab\u04ae"+
		"\7j\2\2\u04ac\u04ae\7\177\2\2\u04ad\u04a1\3\2\2\2\u04ad\u04a2\3\2\2\2"+
		"\u04ad\u04a3\3\2\2\2\u04ad\u04a4\3\2\2\2\u04ad\u04a5\3\2\2\2\u04ad\u04a6"+
		"\3\2\2\2\u04ad\u04a8\3\2\2\2\u04ad\u04a9\3\2\2\2\u04ad\u04aa\3\2\2\2\u04ad"+
		"\u04ab\3\2\2\2\u04ad\u04ac\3\2\2\2\u04aeW\3\2\2\2\u04af\u04b0\7~\2\2\u04b0"+
		"\u04bc\5\u00b8]\2\u04b1\u04b2\7\5\2\2\u04b2\u04b7\5\u00b4[\2\u04b3\u04b4"+
		"\7\7\2\2\u04b4\u04b6\5\u00b4[\2\u04b5\u04b3\3\2\2\2\u04b6\u04b9\3\2\2"+
		"\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04ba\3\2\2\2\u04b9\u04b7"+
		"\3\2\2\2\u04ba\u04bb\7\6\2\2\u04bb\u04bd\3\2\2\2\u04bc\u04b1\3\2\2\2\u04bc"+
		"\u04bd\3\2\2\2\u04bd\u04d0\3\2\2\2\u04be\u04bf\7t\2\2\u04bf\u04c8\t\r"+
		"\2\2\u04c0\u04c1\7\u008a\2\2\u04c1\u04c9\7p\2\2\u04c2\u04c3\7\u008a\2"+
		"\2\u04c3\u04c9\7<\2\2\u04c4\u04c9\7+\2\2\u04c5\u04c9\7\u0084\2\2\u04c6"+
		"\u04c7\7m\2\2\u04c7\u04c9\7\34\2\2\u04c8\u04c0\3\2\2\2\u04c8\u04c2\3\2"+
		"\2\2\u04c8\u04c4\3\2\2\2\u04c8\u04c5\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9"+
		"\u04cd\3\2\2\2\u04ca\u04cb\7j\2\2\u04cb\u04cd\5\u0096L\2\u04cc\u04be\3"+
		"\2\2\2\u04cc\u04ca\3\2\2\2\u04cd\u04cf\3\2\2\2\u04ce\u04cc\3\2\2\2\u04cf"+
		"\u04d2\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04dd\3\2"+
		"\2\2\u04d2\u04d0\3\2\2\2\u04d3\u04d5\7n\2\2\u04d4\u04d3\3\2\2\2\u04d4"+
		"\u04d5\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04db\7=\2\2\u04d7\u04d8\7\\"+
		"\2\2\u04d8\u04dc\7>\2\2\u04d9\u04da\7\\\2\2\u04da\u04dc\7X\2\2\u04db\u04d7"+
		"\3\2\2\2\u04db\u04d9\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04de\3\2\2\2\u04dd"+
		"\u04d4\3\2\2\2\u04dd\u04de\3\2\2\2\u04deY\3\2\2\2\u04df\u04e0\7|\2\2\u04e0"+
		"\u04e5\7\5\2\2\u04e1\u04e6\7W\2\2\u04e2\u04e3\t\16\2\2\u04e3\u04e4\7\7"+
		"\2\2\u04e4\u04e6\5\u008eH\2\u04e5\u04e1\3\2\2\2\u04e5\u04e2\3\2\2\2\u04e6"+
		"\u04e7\3\2\2\2\u04e7\u04e8\7\6\2\2\u04e8[\3\2\2\2\u04e9\u04ec\5\u00b4"+
		"[\2\u04ea\u04eb\7/\2\2\u04eb\u04ed\5\u00b6\\\2\u04ec\u04ea\3\2\2\2\u04ec"+
		"\u04ed\3\2\2\2\u04ed\u04ef\3\2\2\2\u04ee\u04f0\t\6\2\2\u04ef\u04ee\3\2"+
		"\2\2\u04ef\u04f0\3\2\2\2\u04f0]\3\2\2\2\u04f1\u04f2\7\63\2\2\u04f2\u04f4"+
		"\5\u0096L\2\u04f3\u04f1\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u0519\3\2\2"+
		"\2\u04f5\u04f6\7z\2\2\u04f6\u04f9\7f\2\2\u04f7\u04f9\7\u0094\2\2\u04f8"+
		"\u04f5\3\2\2\2\u04f8\u04f7\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fb\7\5"+
		"\2\2\u04fb\u0500\5\\/\2\u04fc\u04fd\7\7\2\2\u04fd\u04ff\5\\/\2\u04fe\u04fc"+
		"\3\2\2\2\u04ff\u0502\3\2\2\2\u0500\u04fe\3\2\2\2\u0500\u0501\3\2\2\2\u0501"+
		"\u0503\3\2\2\2\u0502\u0500\3\2\2\2\u0503\u0504\7\6\2\2\u0504\u0505\5N"+
		"(\2\u0505\u051a\3\2\2\2\u0506\u0507\7.\2\2\u0507\u0508\7\5\2\2\u0508\u0509"+
		"\5P)\2\u0509\u050a\7\6\2\2\u050a\u051a\3\2\2\2\u050b\u050c\7O\2\2\u050c"+
		"\u050d\7f\2\2\u050d\u050e\7\5\2\2\u050e\u0513\5\u00b4[\2\u050f\u0510\7"+
		"\7\2\2\u0510\u0512\5\u00b4[\2\u0511\u050f\3\2\2\2\u0512\u0515\3\2\2\2"+
		"\u0513\u0511\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0516\3\2\2\2\u0515\u0513"+
		"\3\2\2\2\u0516\u0517\7\6\2\2\u0517\u0518\5X-\2\u0518\u051a\3\2\2\2\u0519"+
		"\u04f8\3\2\2\2\u0519\u0506\3\2\2\2\u0519\u050b\3\2\2\2\u051a_\3\2\2\2"+
		"\u051b\u051d\7\u009d\2\2\u051c\u051e\7}\2\2\u051d\u051c\3\2\2\2\u051d"+
		"\u051e\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520\5\u0086D\2\u0520\u0521"+
		"\7#\2\2\u0521\u0522\7\5\2\2\u0522\u0523\5@!\2\u0523\u052d\7\6\2\2\u0524"+
		"\u0525\7\7\2\2\u0525\u0526\5\u0086D\2\u0526\u0527\7#\2\2\u0527\u0528\7"+
		"\5\2\2\u0528\u0529\5@!\2\u0529\u052a\7\6\2\2\u052a\u052c\3\2\2\2\u052b"+
		"\u0524\3\2\2\2\u052c\u052f\3\2\2\2\u052d\u052b\3\2\2\2\u052d\u052e\3\2"+
		"\2\2\u052ea\3\2\2\2\u052f\u052d\3\2\2\2\u0530\u0531\5\u00acW\2\u0531\u0532"+
		"\7\4\2\2\u0532\u0534\3\2\2\2\u0533\u0530\3\2\2\2\u0533\u0534\3\2\2\2\u0534"+
		"\u0535\3\2\2\2\u0535\u053b\5\u00aeX\2\u0536\u0537\7[\2\2\u0537\u0538\7"+
		"*\2\2\u0538\u053c\5\u00ba^\2\u0539\u053a\7n\2\2\u053a\u053c\7[\2\2\u053b"+
		"\u0536\3\2\2\2\u053b\u0539\3\2\2\2\u053b\u053c\3\2\2\2\u053cc\3\2\2\2"+
		"\u053d\u0540\5P)\2\u053e\u053f\7/\2\2\u053f\u0541\5\u00b6\\\2\u0540\u053e"+
		"\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543\3\2\2\2\u0542\u0544\t\6\2\2\u0543"+
		"\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544e\3\2\2\2\u0545\u0549\5\u0088"+
		"E\2\u0546\u0549\5\u0096L\2\u0547\u0549\7\u00a2\2\2\u0548\u0545\3\2\2\2"+
		"\u0548\u0546\3\2\2\2\u0548\u0547\3\2\2\2\u0549g\3\2\2\2\u054a\u0556\5"+
		"\u00aeX\2\u054b\u054c\7\5\2\2\u054c\u0551\5\u00b4[\2\u054d\u054e\7\7\2"+
		"\2\u054e\u0550\5\u00b4[\2\u054f\u054d\3\2\2\2\u0550\u0553\3\2\2\2\u0551"+
		"\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0554\3\2\2\2\u0553\u0551\3\2"+
		"\2\2\u0554\u0555\7\6\2\2\u0555\u0557\3\2\2\2\u0556\u054b\3\2\2\2\u0556"+
		"\u0557\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u0559\7#\2\2\u0559\u055a\7\5"+
		"\2\2\u055a\u055b\5@!\2\u055b\u055c\7\6\2\2\u055ci\3\2\2\2\u055d\u0566"+
		"\7\t\2\2\u055e\u055f\5\u00aeX\2\u055f\u0560\7\4\2\2\u0560\u0561\7\t\2"+
		"\2\u0561\u0566\3\2\2\2\u0562\u0566\5T+\2\u0563\u0566\5\u0098M\2\u0564"+
		"\u0566\5\u009aN\2\u0565\u055d\3\2\2\2\u0565\u055e\3\2\2\2\u0565\u0562"+
		"\3\2\2\2\u0565\u0563\3\2\2\2\u0565\u0564\3\2\2\2\u0566k\3\2\2\2\u0567"+
		"\u0568\7\24\2\2\u0568\u056a\7V\2\2\u0569\u056b\5n8\2\u056a\u0569\3\2\2"+
		"\2\u056a\u056b\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056d\7\26\2\2\u056d"+
		"m\3\2\2\2\u056e\u0570\5p9\2\u056f\u056e\3\2\2\2\u056f\u0570\3\2\2\2\u0570"+
		"\u0572\3\2\2\2\u0571\u0573\5r:\2\u0572\u0571\3\2\2\2\u0572\u0573\3\2\2"+
		"\2\u0573\u0575\3\2\2\2\u0574\u0576\5t;\2\u0575\u0574\3\2\2\2\u0575\u0576"+
		"\3\2\2\2\u0576o\3\2\2\2\u0577\u0578\7c\2\2\u0578\u0579\7\b\2\2\u0579\u057a"+
		"\t\17\2\2\u057aq\3\2\2\2\u057b\u057c\7;\2\2\u057c\u057d\7t\2\2\u057d\u057e"+
		"\5T+\2\u057es\3\2\2\2\u057f\u0580\7s\2\2\u0580\u0581\7\b\2\2\u0581\u0582"+
		"\t\17\2\2\u0582u\3\2\2\2\u0583\u0584\5\u00acW\2\u0584\u0585\7\4\2\2\u0585"+
		"\u0587\3\2\2\2\u0586\u0583\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588\3\2"+
		"\2\2\u0588\u058d\5\u00aeX\2\u0589\u058b\7#\2\2\u058a\u0589\3\2\2\2\u058a"+
		"\u058b\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058e\5\u00c6d\2\u058d\u058a"+
		"\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u0594\3\2\2\2\u058f\u0590\7[\2\2\u0590"+
		"\u0591\7*\2\2\u0591\u0595\5\u00ba^\2\u0592\u0593\7n\2\2\u0593\u0595\7"+
		"[\2\2\u0594\u058f\3\2\2\2\u0594\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595"+
		"w\3\2\2\2\u0596\u05b4\5v<\2\u0597\u05a1\7\5\2\2\u0598\u059d\5x=\2\u0599"+
		"\u059a\7\7\2\2\u059a\u059c\5x=\2\u059b\u0599\3\2\2\2\u059c\u059f\3\2\2"+
		"\2\u059d\u059b\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u05a2\3\2\2\2\u059f\u059d"+
		"\3\2\2\2\u05a0\u05a2\5z>\2\u05a1\u0598\3\2\2\2\u05a1\u05a0\3\2\2\2\u05a2"+
		"\u05a3\3\2\2\2\u05a3\u05a8\7\6\2\2\u05a4\u05a6\7#\2\2\u05a5\u05a4\3\2"+
		"\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a9\5\u00c6d\2\u05a8"+
		"\u05a5\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05b4\3\2\2\2\u05aa\u05ab\7\5"+
		"\2\2\u05ab\u05ac\5@!\2\u05ac\u05b1\7\6\2\2\u05ad\u05af\7#\2\2\u05ae\u05ad"+
		"\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b2\5\u00c6d"+
		"\2\u05b1\u05ae\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b4\3\2\2\2\u05b3\u0596"+
		"\3\2\2\2\u05b3\u0597\3\2\2\2\u05b3\u05aa\3\2\2\2\u05b4y\3\2\2\2\u05b5"+
		"\u05bc\5x=\2\u05b6\u05b7\5|?\2\u05b7\u05b8\5x=\2\u05b8\u05b9\5~@\2\u05b9"+
		"\u05bb\3\2\2\2\u05ba\u05b6\3\2\2\2\u05bb\u05be\3\2\2\2\u05bc\u05ba\3\2"+
		"\2\2\u05bc\u05bd\3\2\2\2\u05bd{\3\2\2\2\u05be\u05bc\3\2\2\2\u05bf\u05cd"+
		"\7\7\2\2\u05c0\u05c2\7l\2\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2"+
		"\u05c9\3\2\2\2\u05c3\u05c5\7g\2\2\u05c4\u05c6\7w\2\2\u05c5\u05c4\3\2\2"+
		"\2\u05c5\u05c6\3\2\2\2\u05c6\u05ca\3\2\2\2\u05c7\u05ca\7]\2\2\u05c8\u05ca"+
		"\7\66\2\2\u05c9\u05c3\3\2\2\2\u05c9\u05c7\3\2\2\2\u05c9\u05c8\3\2\2\2"+
		"\u05c9\u05ca\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cd\7e\2\2\u05cc\u05bf"+
		"\3\2\2\2\u05cc\u05c1\3\2\2\2\u05cd}\3\2\2\2\u05ce\u05cf\7t\2\2\u05cf\u05dd"+
		"\5P)\2\u05d0\u05d1\7\u0096\2\2\u05d1\u05d2\7\5\2\2\u05d2\u05d7\5\u00b4"+
		"[\2\u05d3\u05d4\7\7\2\2\u05d4\u05d6\5\u00b4[\2\u05d5\u05d3\3\2\2\2\u05d6"+
		"\u05d9\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05da\3\2"+
		"\2\2\u05d9\u05d7\3\2\2\2\u05da\u05db\7\6\2\2\u05db\u05dd\3\2\2\2\u05dc"+
		"\u05ce\3\2\2\2\u05dc\u05d0\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\177\3\2\2"+
		"\2\u05de\u05e0\7\u0089\2\2\u05df\u05e1\t\20\2\2\u05e0\u05df\3\2\2\2\u05e0"+
		"\u05e1\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e7\5j\66\2\u05e3\u05e4\7\7"+
		"\2\2\u05e4\u05e6\5j\66\2\u05e5\u05e3\3\2\2\2\u05e6\u05e9\3\2\2\2\u05e7"+
		"\u05e5\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05eb\3\2\2\2\u05e9\u05e7\3\2"+
		"\2\2\u05ea\u05ec\5\u0082B\2\u05eb\u05ea\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec"+
		"\u05ef\3\2\2\2\u05ed\u05ee\7\u009c\2\2\u05ee\u05f0\5P)\2\u05ef\u05ed\3"+
		"\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05ff\3\2\2\2\u05f1\u05f2\7S\2\2\u05f2"+
		"\u05f3\7*\2\2\u05f3\u05f8\5P)\2\u05f4\u05f5\7\7\2\2\u05f5\u05f7\5P)\2"+
		"\u05f6\u05f4\3\2\2\2\u05f7\u05fa\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9"+
		"\3\2\2\2\u05f9\u05fd\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fb\u05fc\7T\2\2\u05fc"+
		"\u05fe\5P)\2\u05fd\u05fb\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u0600\3\2\2"+
		"\2\u05ff\u05f1\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u061e\3\2\2\2\u0601\u0602"+
		"\7\u0098\2\2\u0602\u0603\7\5\2\2\u0603\u0608\5P)\2\u0604\u0605\7\7\2\2"+
		"\u0605\u0607\5P)\2\u0606\u0604\3\2\2\2\u0607\u060a\3\2\2\2\u0608\u0606"+
		"\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060b\3\2\2\2\u060a\u0608\3\2\2\2\u060b"+
		"\u061a\7\6\2\2\u060c\u060d\7\7\2\2\u060d\u060e\7\5\2\2\u060e\u0613\5P"+
		")\2\u060f\u0610\7\7\2\2\u0610\u0612\5P)\2\u0611\u060f\3\2\2\2\u0612\u0615"+
		"\3\2\2\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0616\3\2\2\2\u0615"+
		"\u0613\3\2\2\2\u0616\u0617\7\6\2\2\u0617\u0619\3\2\2\2\u0618\u060c\3\2"+
		"\2\2\u0619\u061c\3\2\2\2\u061a\u0618\3\2\2\2\u061a\u061b\3\2\2\2\u061b"+
		"\u061e\3\2\2\2\u061c\u061a\3\2\2\2\u061d\u05de\3\2\2\2\u061d\u0601\3\2"+
		"\2\2\u061e\u0081\3\2\2\2\u061f\u0629\7P\2\2\u0620\u0625\5x=\2\u0621\u0622"+
		"\7\7\2\2\u0622\u0624\5x=\2\u0623\u0621\3\2\2\2\u0624\u0627\3\2\2\2\u0625"+
		"\u0623\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u062a\3\2\2\2\u0627\u0625\3\2"+
		"\2\2\u0628\u062a\5z>\2\u0629\u0620\3\2\2\2\u0629\u0628\3\2\2\2\u062a\u0083"+
		"\3\2\2\2\u062b\u0632\7\u0093\2\2\u062c\u062d\7\u0093\2\2\u062d\u0632\7"+
		"\37\2\2\u062e\u0632\7`\2\2\u062f\u0632\7H\2\2\u0630\u0632\7k\2\2\u0631"+
		"\u062b\3\2\2\2\u0631\u062c\3\2\2\2\u0631\u062e\3\2\2\2\u0631\u062f\3\2"+
		"\2\2\u0631\u0630\3\2\2\2\u0632\u0085\3\2\2\2\u0633\u063f\5\u00aeX\2\u0634"+
		"\u0635\7\5\2\2\u0635\u063a\5\u00b4[\2\u0636\u0637\7\7\2\2\u0637\u0639"+
		"\5\u00b4[\2\u0638\u0636\3\2\2\2\u0639\u063c\3\2\2\2\u063a\u0638\3\2\2"+
		"\2\u063a\u063b\3\2\2\2\u063b\u063d\3\2\2\2\u063c\u063a\3\2\2\2\u063d\u063e"+
		"\7\6\2\2\u063e\u0640\3\2\2\2\u063f\u0634\3\2\2\2\u063f\u0640\3\2\2\2\u0640"+
		"\u0087\3\2\2\2\u0641\u0643\t\t\2\2\u0642\u0641\3\2\2\2\u0642\u0643\3\2"+
		"\2\2\u0643\u0644\3\2\2\2\u0644\u0645\7\u00a0\2\2\u0645\u0089\3\2\2\2\u0646"+
		"\u0647\t\21\2\2\u0647\u008b\3\2\2\2\u0648\u0649\t\22\2\2\u0649\u008d\3"+
		"\2\2\2\u064a\u064b\7\u00a2\2\2\u064b\u008f\3\2\2\2\u064c\u064f\5P)\2\u064d"+
		"\u064f\5H%\2\u064e\u064c\3\2\2\2\u064e\u064d\3\2\2\2\u064f\u0091\3\2\2"+
		"\2\u0650\u0651\t\23\2\2\u0651\u0093\3\2\2\2\u0652\u0653\t\24\2\2\u0653"+
		"\u0095\3\2\2\2\u0654\u0655\5\u00caf\2\u0655\u0097\3\2\2\2\u0656\u0657"+
		"\7\64\2\2\u0657\u0661\7\5\2\2\u0658\u065a\5\u00a8U\2\u0659\u0658\3\2\2"+
		"\2\u0659\u065a\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u0662\5T+\2\u065c\u0662"+
		"\7\t\2\2\u065d\u065f\7B\2\2\u065e\u065d\3\2\2\2\u065e\u065f\3\2\2\2\u065f"+
		"\u0660\3\2\2\2\u0660\u0662\5\u009aN\2\u0661\u0659\3\2\2\2\u0661\u065c"+
		"\3\2\2\2\u0661\u065e\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0663\3\2\2\2\u0663"+
		"\u0665\7\6\2\2\u0664\u0666\5l\67\2\u0665\u0664\3\2\2\2\u0665\u0666\3\2"+
		"\2\2\u0666\u066b\3\2\2\2\u0667\u0669\7#\2\2\u0668\u0667\3\2\2\2\u0668"+
		"\u0669\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u066c\5\u0092J\2\u066b\u0668"+
		"\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u0099\3\2\2\2\u066d\u066e\5\u00aaV"+
		"\2\u066e\u067b\7\5\2\2\u066f\u0671\7B\2\2\u0670\u066f\3\2\2\2\u0670\u0671"+
		"\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0677\5T+\2\u0673\u0674\7\7\2\2\u0674"+
		"\u0676\5T+\2\u0675\u0673\3\2\2\2\u0676\u0679\3\2\2\2\u0677\u0675\3\2\2"+
		"\2\u0677\u0678\3\2\2\2\u0678\u067c\3\2\2\2\u0679\u0677\3\2\2\2\u067a\u067c"+
		"\7\t\2\2\u067b\u0670\3\2\2\2\u067b\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c"+
		"\u067d\3\2\2\2\u067d\u067f\7\6\2\2\u067e\u0680\5l\67\2\u067f\u067e\3\2"+
		"\2\2\u067f\u0680\3\2\2\2\u0680\u0685\3\2\2\2\u0681\u0683\7#\2\2\u0682"+
		"\u0681\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0686\5\u0092"+
		"J\2\u0685\u0682\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u009b\3\2\2\2\u0687"+
		"\u0688\7\"\2\2\u0688\u009d\3\2\2\2\u0689\u068a\7u\2\2\u068a\u009f\3\2"+
		"\2\2\u068b\u068c\t\25\2\2\u068c\u00a1\3\2\2\2\u068d\u068e\7n\2\2\u068e"+
		"\u00a3\3\2\2\2\u068f\u0690\7Y\2\2\u0690\u00a5\3\2\2\2\u0691\u0692\7h\2"+
		"\2\u0692\u00a7\3\2\2\2\u0693\u0694\7B\2\2\u0694\u00a9\3\2\2\2\u0695\u0696"+
		"\5\u00caf\2\u0696\u00ab\3\2\2\2\u0697\u0698\5\u00caf\2\u0698\u00ad\3\2"+
		"\2\2\u0699\u069a\5\u00caf\2\u069a\u00af\3\2\2\2\u069b\u069c\5\u00caf\2"+
		"\u069c\u00b1\3\2\2\2\u069d\u069e\5\u00caf\2\u069e\u00b3\3\2\2\2\u069f"+
		"\u06a0\5\u00caf\2\u06a0\u00b5\3\2\2\2\u06a1\u06a2\5\u00caf\2\u06a2\u00b7"+
		"\3\2\2\2\u06a3\u06a4\5\u00caf\2\u06a4\u00b9\3\2\2\2\u06a5\u06a6\5\u00ca"+
		"f\2\u06a6\u00bb\3\2\2\2\u06a7\u06a8\5\u00caf\2\u06a8\u00bd\3\2\2\2\u06a9"+
		"\u06aa\5\u00caf\2\u06aa\u00bf\3\2\2\2\u06ab\u06ac\5\u00caf\2\u06ac\u00c1"+
		"\3\2\2\2\u06ad\u06ae\5\u00caf\2\u06ae\u00c3\3\2\2\2\u06af\u06b0\5\u00ca"+
		"f\2\u06b0\u00c5\3\2\2\2\u06b1\u06b2\5\u00caf\2\u06b2\u00c7\3\2\2\2\u06b3"+
		"\u06b4\5\u00caf\2\u06b4\u00c9\3\2\2\2\u06b5\u06bd\7\u009f\2\2\u06b6\u06bd"+
		"\5\u0094K\2\u06b7\u06bd\7\u00a2\2\2\u06b8\u06b9\7\5\2\2\u06b9\u06ba\5"+
		"\u00caf\2\u06ba\u06bb\7\6\2\2\u06bb\u06bd\3\2\2\2\u06bc\u06b5\3\2\2\2"+
		"\u06bc\u06b6\3\2\2\2\u06bc\u06b7\3\2\2\2\u06bc\u06b8\3\2\2\2\u06bd\u00cb"+
		"\3\2\2\2\u06be\u06c0\13\2\2\2\u06bf\u06be\3\2\2\2\u06c0\u06c1\3\2\2\2"+
		"\u06c1\u06bf\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u00cd\3\2\2\2\u00ee\u00d0"+
		"\u00d2\u00de\u00e4\u00ea\u00ec\u010b\u0116\u011e\u0121\u012a\u012e\u0136"+
		"\u013a\u013c\u0141\u0143\u0147\u014e\u0151\u0159\u0162\u0165\u016b\u016d"+
		"\u0171\u0177\u017c\u0187\u018d\u0191\u0197\u019c\u01a5\u01ac\u01b2\u01b6"+
		"\u01ba\u01c0\u01c5\u01cc\u01d7\u01da\u01dc\u01e2\u01e8\u01ec\u01f3\u01f9"+
		"\u01ff\u0205\u020a\u0216\u021b\u0226\u022b\u022e\u0234\u0237\u023d\u0246"+
		"\u0249\u024f\u0251\u0258\u0260\u0265\u026d\u0272\u027a\u027f\u0287\u028c"+
		"\u0291\u02a4\u02aa\u02b3\u02b8\u02c1\u02cc\u02d3\u02d9\u02df\u02e8\u02ef"+
		"\u02f3\u02f5\u02f9\u0300\u0302\u0306\u0309\u0310\u0317\u031a\u0324\u0327"+
		"\u032d\u032f\u0339\u033c\u0342\u0344\u0347\u0354\u0362\u0367\u036a\u0377"+
		"\u0385\u038a\u0393\u0396\u039c\u039e\u03a4\u03a9\u03af\u03bb\u03bf\u03c4"+
		"\u03c8\u03cb\u03dd\u03e2\u03e7\u03fe\u0401\u0409\u0412\u0416\u041b\u0437"+
		"\u043c\u0448\u044e\u0455\u0459\u0463\u0466\u046c\u046f\u0471\u0473\u047a"+
		"\u047f\u0483\u0486\u0488\u048e\u0493\u0497\u049a\u049d\u049f\u04ad\u04b7"+
		"\u04bc\u04c8\u04cc\u04d0\u04d4\u04db\u04dd\u04e5\u04ec\u04ef\u04f3\u04f8"+
		"\u0500\u0513\u0519\u051d\u052d\u0533\u053b\u0540\u0543\u0548\u0551\u0556"+
		"\u0565\u056a\u056f\u0572\u0575\u0586\u058a\u058d\u0594\u059d\u05a1\u05a5"+
		"\u05a8\u05ae\u05b1\u05b3\u05bc\u05c1\u05c5\u05c9\u05cc\u05d7\u05dc\u05e0"+
		"\u05e7\u05eb\u05ef\u05f8\u05fd\u05ff\u0608\u0613\u061a\u061d\u0625\u0629"+
		"\u0631\u063a\u063f\u0642\u064e\u0659\u065e\u0661\u0665\u0668\u066b\u0670"+
		"\u0677\u067b\u067f\u0682\u0685\u06bc\u06c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}