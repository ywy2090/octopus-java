// Generated from
// /Users/octopus/octo/code/my-first-java/src/main/resources/g4/spark/v2_4_3/SqlBase.g4 by ANTLR
// 4.13.1
package octopus.antlr.codegen.spark.v2_4_3;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SqlBaseParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int T__0 = 1,
            T__1 = 2,
            T__2 = 3,
            T__3 = 4,
            T__4 = 5,
            T__5 = 6,
            T__6 = 7,
            T__7 = 8,
            T__8 = 9,
            T__9 = 10,
            SELECT = 11,
            FROM = 12,
            ADD = 13,
            AS = 14,
            ALL = 15,
            ANY = 16,
            DISTINCT = 17,
            WHERE = 18,
            GROUP = 19,
            BY = 20,
            GROUPING = 21,
            SETS = 22,
            CUBE = 23,
            ROLLUP = 24,
            ORDER = 25,
            HAVING = 26,
            LIMIT = 27,
            AT = 28,
            OR = 29,
            AND = 30,
            IN = 31,
            NOT = 32,
            NO = 33,
            EXISTS = 34,
            BETWEEN = 35,
            LIKE = 36,
            RLIKE = 37,
            IS = 38,
            NULL = 39,
            TRUE = 40,
            FALSE = 41,
            NULLS = 42,
            ASC = 43,
            DESC = 44,
            FOR = 45,
            INTERVAL = 46,
            CASE = 47,
            WHEN = 48,
            THEN = 49,
            ELSE = 50,
            END = 51,
            JOIN = 52,
            CROSS = 53,
            OUTER = 54,
            INNER = 55,
            LEFT = 56,
            SEMI = 57,
            RIGHT = 58,
            FULL = 59,
            NATURAL = 60,
            ON = 61,
            PIVOT = 62,
            LATERAL = 63,
            WINDOW = 64,
            OVER = 65,
            PARTITION = 66,
            RANGE = 67,
            ROWS = 68,
            UNBOUNDED = 69,
            PRECEDING = 70,
            FOLLOWING = 71,
            CURRENT = 72,
            FIRST = 73,
            AFTER = 74,
            LAST = 75,
            ROW = 76,
            WITH = 77,
            VALUES = 78,
            CREATE = 79,
            TABLE = 80,
            DIRECTORY = 81,
            VIEW = 82,
            REPLACE = 83,
            INSERT = 84,
            DELETE = 85,
            INTO = 86,
            DESCRIBE = 87,
            EXPLAIN = 88,
            FORMAT = 89,
            LOGICAL = 90,
            CODEGEN = 91,
            COST = 92,
            CAST = 93,
            SHOW = 94,
            TABLES = 95,
            COLUMNS = 96,
            COLUMN = 97,
            USE = 98,
            PARTITIONS = 99,
            FUNCTIONS = 100,
            DROP = 101,
            UNION = 102,
            EXCEPT = 103,
            SETMINUS = 104,
            INTERSECT = 105,
            TO = 106,
            TABLESAMPLE = 107,
            STRATIFY = 108,
            ALTER = 109,
            RENAME = 110,
            ARRAY = 111,
            MAP = 112,
            STRUCT = 113,
            COMMENT = 114,
            SET = 115,
            RESET = 116,
            DATA = 117,
            START = 118,
            TRANSACTION = 119,
            COMMIT = 120,
            ROLLBACK = 121,
            MACRO = 122,
            IGNORE = 123,
            BOTH = 124,
            LEADING = 125,
            TRAILING = 126,
            IF = 127,
            POSITION = 128,
            EXTRACT = 129,
            EQ = 130,
            NSEQ = 131,
            NEQ = 132,
            NEQJ = 133,
            LT = 134,
            LTE = 135,
            GT = 136,
            GTE = 137,
            PLUS = 138,
            MINUS = 139,
            ASTERISK = 140,
            SLASH = 141,
            PERCENT = 142,
            DIV = 143,
            TILDE = 144,
            AMPERSAND = 145,
            PIPE = 146,
            CONCAT_PIPE = 147,
            HAT = 148,
            PERCENTLIT = 149,
            BUCKET = 150,
            OUT = 151,
            OF = 152,
            SORT = 153,
            CLUSTER = 154,
            DISTRIBUTE = 155,
            OVERWRITE = 156,
            TRANSFORM = 157,
            REDUCE = 158,
            USING = 159,
            SERDE = 160,
            SERDEPROPERTIES = 161,
            RECORDREADER = 162,
            RECORDWRITER = 163,
            DELIMITED = 164,
            FIELDS = 165,
            TERMINATED = 166,
            COLLECTION = 167,
            ITEMS = 168,
            KEYS = 169,
            ESCAPED = 170,
            LINES = 171,
            SEPARATED = 172,
            FUNCTION = 173,
            EXTENDED = 174,
            REFRESH = 175,
            CLEAR = 176,
            CACHE = 177,
            UNCACHE = 178,
            LAZY = 179,
            FORMATTED = 180,
            GLOBAL = 181,
            TEMPORARY = 182,
            OPTIONS = 183,
            UNSET = 184,
            TBLPROPERTIES = 185,
            DBPROPERTIES = 186,
            BUCKETS = 187,
            SKEWED = 188,
            STORED = 189,
            DIRECTORIES = 190,
            LOCATION = 191,
            EXCHANGE = 192,
            ARCHIVE = 193,
            UNARCHIVE = 194,
            FILEFORMAT = 195,
            TOUCH = 196,
            COMPACT = 197,
            CONCATENATE = 198,
            CHANGE = 199,
            CASCADE = 200,
            RESTRICT = 201,
            CLUSTERED = 202,
            SORTED = 203,
            PURGE = 204,
            INPUTFORMAT = 205,
            OUTPUTFORMAT = 206,
            DATABASE = 207,
            DATABASES = 208,
            DFS = 209,
            TRUNCATE = 210,
            ANALYZE = 211,
            COMPUTE = 212,
            LIST = 213,
            STATISTICS = 214,
            PARTITIONED = 215,
            EXTERNAL = 216,
            DEFINED = 217,
            REVOKE = 218,
            GRANT = 219,
            LOCK = 220,
            UNLOCK = 221,
            MSCK = 222,
            REPAIR = 223,
            RECOVER = 224,
            EXPORT = 225,
            IMPORT = 226,
            LOAD = 227,
            ROLE = 228,
            ROLES = 229,
            COMPACTIONS = 230,
            PRINCIPALS = 231,
            TRANSACTIONS = 232,
            INDEX = 233,
            INDEXES = 234,
            LOCKS = 235,
            OPTION = 236,
            ANTI = 237,
            LOCAL = 238,
            INPATH = 239,
            STRING = 240,
            BIGINT_LITERAL = 241,
            SMALLINT_LITERAL = 242,
            TINYINT_LITERAL = 243,
            INTEGER_VALUE = 244,
            DECIMAL_VALUE = 245,
            DOUBLE_LITERAL = 246,
            BIGDECIMAL_LITERAL = 247,
            IDENTIFIER = 248,
            BACKQUOTED_IDENTIFIER = 249,
            SIMPLE_COMMENT = 250,
            BRACKETED_EMPTY_COMMENT = 251,
            BRACKETED_COMMENT = 252,
            WS = 253,
            UNRECOGNIZED = 254;
    public static final int RULE_singleStatement = 0,
            RULE_singleExpression = 1,
            RULE_singleTableIdentifier = 2,
            RULE_singleFunctionIdentifier = 3,
            RULE_singleDataType = 4,
            RULE_singleTableSchema = 5,
            RULE_statement = 6,
            RULE_unsupportedHiveNativeCommands = 7,
            RULE_createTableHeader = 8,
            RULE_bucketSpec = 9,
            RULE_skewSpec = 10,
            RULE_locationSpec = 11,
            RULE_query = 12,
            RULE_insertInto = 13,
            RULE_partitionSpecLocation = 14,
            RULE_partitionSpec = 15,
            RULE_partitionVal = 16,
            RULE_describeFuncName = 17,
            RULE_describeColName = 18,
            RULE_ctes = 19,
            RULE_namedQuery = 20,
            RULE_tableProvider = 21,
            RULE_tablePropertyList = 22,
            RULE_tableProperty = 23,
            RULE_tablePropertyKey = 24,
            RULE_tablePropertyValue = 25,
            RULE_constantList = 26,
            RULE_nestedConstantList = 27,
            RULE_createFileFormat = 28,
            RULE_fileFormat = 29,
            RULE_storageHandler = 30,
            RULE_resource = 31,
            RULE_queryNoWith = 32,
            RULE_queryOrganization = 33,
            RULE_multiInsertQueryBody = 34,
            RULE_queryTerm = 35,
            RULE_queryPrimary = 36,
            RULE_sortItem = 37,
            RULE_querySpecification = 38,
            RULE_hint = 39,
            RULE_hintStatement = 40,
            RULE_fromClause = 41,
            RULE_aggregation = 42,
            RULE_groupingSet = 43,
            RULE_pivotClause = 44,
            RULE_pivotColumn = 45,
            RULE_pivotValue = 46,
            RULE_lateralView = 47,
            RULE_setQuantifier = 48,
            RULE_relation = 49,
            RULE_joinRelation = 50,
            RULE_joinType = 51,
            RULE_joinCriteria = 52,
            RULE_sample = 53,
            RULE_sampleMethod = 54,
            RULE_identifierList = 55,
            RULE_identifierSeq = 56,
            RULE_orderedIdentifierList = 57,
            RULE_orderedIdentifier = 58,
            RULE_identifierCommentList = 59,
            RULE_identifierComment = 60,
            RULE_relationPrimary = 61,
            RULE_inlineTable = 62,
            RULE_functionTable = 63,
            RULE_tableAlias = 64,
            RULE_rowFormat = 65,
            RULE_tableIdentifier = 66,
            RULE_functionIdentifier = 67,
            RULE_namedExpression = 68,
            RULE_namedExpressionSeq = 69,
            RULE_expression = 70,
            RULE_booleanExpression = 71,
            RULE_predicate = 72,
            RULE_valueExpression = 73,
            RULE_primaryExpression = 74,
            RULE_constant = 75,
            RULE_comparisonOperator = 76,
            RULE_arithmeticOperator = 77,
            RULE_predicateOperator = 78,
            RULE_booleanValue = 79,
            RULE_interval = 80,
            RULE_intervalField = 81,
            RULE_intervalValue = 82,
            RULE_colPosition = 83,
            RULE_dataType = 84,
            RULE_colTypeList = 85,
            RULE_colType = 86,
            RULE_complexColTypeList = 87,
            RULE_complexColType = 88,
            RULE_whenClause = 89,
            RULE_windows = 90,
            RULE_namedWindow = 91,
            RULE_windowSpec = 92,
            RULE_windowFrame = 93,
            RULE_frameBound = 94,
            RULE_qualifiedName = 95,
            RULE_identifier = 96,
            RULE_strictIdentifier = 97,
            RULE_quotedIdentifier = 98,
            RULE_number = 99,
            RULE_nonReserved = 100;

    private static String[] makeRuleNames() {
        return new String[] {
            "singleStatement",
            "singleExpression",
            "singleTableIdentifier",
            "singleFunctionIdentifier",
            "singleDataType",
            "singleTableSchema",
            "statement",
            "unsupportedHiveNativeCommands",
            "createTableHeader",
            "bucketSpec",
            "skewSpec",
            "locationSpec",
            "query",
            "insertInto",
            "partitionSpecLocation",
            "partitionSpec",
            "partitionVal",
            "describeFuncName",
            "describeColName",
            "ctes",
            "namedQuery",
            "tableProvider",
            "tablePropertyList",
            "tableProperty",
            "tablePropertyKey",
            "tablePropertyValue",
            "constantList",
            "nestedConstantList",
            "createFileFormat",
            "fileFormat",
            "storageHandler",
            "resource",
            "queryNoWith",
            "queryOrganization",
            "multiInsertQueryBody",
            "queryTerm",
            "queryPrimary",
            "sortItem",
            "querySpecification",
            "hint",
            "hintStatement",
            "fromClause",
            "aggregation",
            "groupingSet",
            "pivotClause",
            "pivotColumn",
            "pivotValue",
            "lateralView",
            "setQuantifier",
            "relation",
            "joinRelation",
            "joinType",
            "joinCriteria",
            "sample",
            "sampleMethod",
            "identifierList",
            "identifierSeq",
            "orderedIdentifierList",
            "orderedIdentifier",
            "identifierCommentList",
            "identifierComment",
            "relationPrimary",
            "inlineTable",
            "functionTable",
            "tableAlias",
            "rowFormat",
            "tableIdentifier",
            "functionIdentifier",
            "namedExpression",
            "namedExpressionSeq",
            "expression",
            "booleanExpression",
            "predicate",
            "valueExpression",
            "primaryExpression",
            "constant",
            "comparisonOperator",
            "arithmeticOperator",
            "predicateOperator",
            "booleanValue",
            "interval",
            "intervalField",
            "intervalValue",
            "colPosition",
            "dataType",
            "colTypeList",
            "colType",
            "complexColTypeList",
            "complexColType",
            "whenClause",
            "windows",
            "namedWindow",
            "windowSpec",
            "windowFrame",
            "frameBound",
            "qualifiedName",
            "identifier",
            "strictIdentifier",
            "quotedIdentifier",
            "number",
            "nonReserved"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[] {
            null,
            "'('",
            "')'",
            "','",
            "'.'",
            "'/*+'",
            "'*/'",
            "'->'",
            "'['",
            "']'",
            "':'",
            "'SELECT'",
            "'FROM'",
            "'ADD'",
            "'AS'",
            "'ALL'",
            "'ANY'",
            "'DISTINCT'",
            "'WHERE'",
            "'GROUP'",
            "'BY'",
            "'GROUPING'",
            "'SETS'",
            "'CUBE'",
            "'ROLLUP'",
            "'ORDER'",
            "'HAVING'",
            "'LIMIT'",
            "'AT'",
            "'OR'",
            "'AND'",
            "'IN'",
            null,
            "'NO'",
            "'EXISTS'",
            "'BETWEEN'",
            "'LIKE'",
            null,
            "'IS'",
            "'NULL'",
            "'TRUE'",
            "'FALSE'",
            "'NULLS'",
            "'ASC'",
            "'DESC'",
            "'FOR'",
            "'INTERVAL'",
            "'CASE'",
            "'WHEN'",
            "'THEN'",
            "'ELSE'",
            "'END'",
            "'JOIN'",
            "'CROSS'",
            "'OUTER'",
            "'INNER'",
            "'LEFT'",
            "'SEMI'",
            "'RIGHT'",
            "'FULL'",
            "'NATURAL'",
            "'ON'",
            "'PIVOT'",
            "'LATERAL'",
            "'WINDOW'",
            "'OVER'",
            "'PARTITION'",
            "'RANGE'",
            "'ROWS'",
            "'UNBOUNDED'",
            "'PRECEDING'",
            "'FOLLOWING'",
            "'CURRENT'",
            "'FIRST'",
            "'AFTER'",
            "'LAST'",
            "'ROW'",
            "'WITH'",
            "'VALUES'",
            "'CREATE'",
            "'TABLE'",
            "'DIRECTORY'",
            "'VIEW'",
            "'REPLACE'",
            "'INSERT'",
            "'DELETE'",
            "'INTO'",
            "'DESCRIBE'",
            "'EXPLAIN'",
            "'FORMAT'",
            "'LOGICAL'",
            "'CODEGEN'",
            "'COST'",
            "'CAST'",
            "'SHOW'",
            "'TABLES'",
            "'COLUMNS'",
            "'COLUMN'",
            "'USE'",
            "'PARTITIONS'",
            "'FUNCTIONS'",
            "'DROP'",
            "'UNION'",
            "'EXCEPT'",
            "'MINUS'",
            "'INTERSECT'",
            "'TO'",
            "'TABLESAMPLE'",
            "'STRATIFY'",
            "'ALTER'",
            "'RENAME'",
            "'ARRAY'",
            "'MAP'",
            "'STRUCT'",
            "'COMMENT'",
            "'SET'",
            "'RESET'",
            "'DATA'",
            "'START'",
            "'TRANSACTION'",
            "'COMMIT'",
            "'ROLLBACK'",
            "'MACRO'",
            "'IGNORE'",
            "'BOTH'",
            "'LEADING'",
            "'TRAILING'",
            "'IF'",
            "'POSITION'",
            "'EXTRACT'",
            null,
            "'<=>'",
            "'<>'",
            "'!='",
            "'<'",
            null,
            "'>'",
            null,
            "'+'",
            "'-'",
            "'*'",
            "'/'",
            "'%'",
            "'DIV'",
            "'~'",
            "'&'",
            "'|'",
            "'||'",
            "'^'",
            "'PERCENT'",
            "'BUCKET'",
            "'OUT'",
            "'OF'",
            "'SORT'",
            "'CLUSTER'",
            "'DISTRIBUTE'",
            "'OVERWRITE'",
            "'TRANSFORM'",
            "'REDUCE'",
            "'USING'",
            "'SERDE'",
            "'SERDEPROPERTIES'",
            "'RECORDREADER'",
            "'RECORDWRITER'",
            "'DELIMITED'",
            "'FIELDS'",
            "'TERMINATED'",
            "'COLLECTION'",
            "'ITEMS'",
            "'KEYS'",
            "'ESCAPED'",
            "'LINES'",
            "'SEPARATED'",
            "'FUNCTION'",
            "'EXTENDED'",
            "'REFRESH'",
            "'CLEAR'",
            "'CACHE'",
            "'UNCACHE'",
            "'LAZY'",
            "'FORMATTED'",
            "'GLOBAL'",
            null,
            "'OPTIONS'",
            "'UNSET'",
            "'TBLPROPERTIES'",
            "'DBPROPERTIES'",
            "'BUCKETS'",
            "'SKEWED'",
            "'STORED'",
            "'DIRECTORIES'",
            "'LOCATION'",
            "'EXCHANGE'",
            "'ARCHIVE'",
            "'UNARCHIVE'",
            "'FILEFORMAT'",
            "'TOUCH'",
            "'COMPACT'",
            "'CONCATENATE'",
            "'CHANGE'",
            "'CASCADE'",
            "'RESTRICT'",
            "'CLUSTERED'",
            "'SORTED'",
            "'PURGE'",
            "'INPUTFORMAT'",
            "'OUTPUTFORMAT'",
            null,
            null,
            "'DFS'",
            "'TRUNCATE'",
            "'ANALYZE'",
            "'COMPUTE'",
            "'LIST'",
            "'STATISTICS'",
            "'PARTITIONED'",
            "'EXTERNAL'",
            "'DEFINED'",
            "'REVOKE'",
            "'GRANT'",
            "'LOCK'",
            "'UNLOCK'",
            "'MSCK'",
            "'REPAIR'",
            "'RECOVER'",
            "'EXPORT'",
            "'IMPORT'",
            "'LOAD'",
            "'ROLE'",
            "'ROLES'",
            "'COMPACTIONS'",
            "'PRINCIPALS'",
            "'TRANSACTIONS'",
            "'INDEX'",
            "'INDEXES'",
            "'LOCKS'",
            "'OPTION'",
            "'ANTI'",
            "'LOCAL'",
            "'INPATH'",
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            "'/**/'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[] {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            "SELECT",
            "FROM",
            "ADD",
            "AS",
            "ALL",
            "ANY",
            "DISTINCT",
            "WHERE",
            "GROUP",
            "BY",
            "GROUPING",
            "SETS",
            "CUBE",
            "ROLLUP",
            "ORDER",
            "HAVING",
            "LIMIT",
            "AT",
            "OR",
            "AND",
            "IN",
            "NOT",
            "NO",
            "EXISTS",
            "BETWEEN",
            "LIKE",
            "RLIKE",
            "IS",
            "NULL",
            "TRUE",
            "FALSE",
            "NULLS",
            "ASC",
            "DESC",
            "FOR",
            "INTERVAL",
            "CASE",
            "WHEN",
            "THEN",
            "ELSE",
            "END",
            "JOIN",
            "CROSS",
            "OUTER",
            "INNER",
            "LEFT",
            "SEMI",
            "RIGHT",
            "FULL",
            "NATURAL",
            "ON",
            "PIVOT",
            "LATERAL",
            "WINDOW",
            "OVER",
            "PARTITION",
            "RANGE",
            "ROWS",
            "UNBOUNDED",
            "PRECEDING",
            "FOLLOWING",
            "CURRENT",
            "FIRST",
            "AFTER",
            "LAST",
            "ROW",
            "WITH",
            "VALUES",
            "CREATE",
            "TABLE",
            "DIRECTORY",
            "VIEW",
            "REPLACE",
            "INSERT",
            "DELETE",
            "INTO",
            "DESCRIBE",
            "EXPLAIN",
            "FORMAT",
            "LOGICAL",
            "CODEGEN",
            "COST",
            "CAST",
            "SHOW",
            "TABLES",
            "COLUMNS",
            "COLUMN",
            "USE",
            "PARTITIONS",
            "FUNCTIONS",
            "DROP",
            "UNION",
            "EXCEPT",
            "SETMINUS",
            "INTERSECT",
            "TO",
            "TABLESAMPLE",
            "STRATIFY",
            "ALTER",
            "RENAME",
            "ARRAY",
            "MAP",
            "STRUCT",
            "COMMENT",
            "SET",
            "RESET",
            "DATA",
            "START",
            "TRANSACTION",
            "COMMIT",
            "ROLLBACK",
            "MACRO",
            "IGNORE",
            "BOTH",
            "LEADING",
            "TRAILING",
            "IF",
            "POSITION",
            "EXTRACT",
            "EQ",
            "NSEQ",
            "NEQ",
            "NEQJ",
            "LT",
            "LTE",
            "GT",
            "GTE",
            "PLUS",
            "MINUS",
            "ASTERISK",
            "SLASH",
            "PERCENT",
            "DIV",
            "TILDE",
            "AMPERSAND",
            "PIPE",
            "CONCAT_PIPE",
            "HAT",
            "PERCENTLIT",
            "BUCKET",
            "OUT",
            "OF",
            "SORT",
            "CLUSTER",
            "DISTRIBUTE",
            "OVERWRITE",
            "TRANSFORM",
            "REDUCE",
            "USING",
            "SERDE",
            "SERDEPROPERTIES",
            "RECORDREADER",
            "RECORDWRITER",
            "DELIMITED",
            "FIELDS",
            "TERMINATED",
            "COLLECTION",
            "ITEMS",
            "KEYS",
            "ESCAPED",
            "LINES",
            "SEPARATED",
            "FUNCTION",
            "EXTENDED",
            "REFRESH",
            "CLEAR",
            "CACHE",
            "UNCACHE",
            "LAZY",
            "FORMATTED",
            "GLOBAL",
            "TEMPORARY",
            "OPTIONS",
            "UNSET",
            "TBLPROPERTIES",
            "DBPROPERTIES",
            "BUCKETS",
            "SKEWED",
            "STORED",
            "DIRECTORIES",
            "LOCATION",
            "EXCHANGE",
            "ARCHIVE",
            "UNARCHIVE",
            "FILEFORMAT",
            "TOUCH",
            "COMPACT",
            "CONCATENATE",
            "CHANGE",
            "CASCADE",
            "RESTRICT",
            "CLUSTERED",
            "SORTED",
            "PURGE",
            "INPUTFORMAT",
            "OUTPUTFORMAT",
            "DATABASE",
            "DATABASES",
            "DFS",
            "TRUNCATE",
            "ANALYZE",
            "COMPUTE",
            "LIST",
            "STATISTICS",
            "PARTITIONED",
            "EXTERNAL",
            "DEFINED",
            "REVOKE",
            "GRANT",
            "LOCK",
            "UNLOCK",
            "MSCK",
            "REPAIR",
            "RECOVER",
            "EXPORT",
            "IMPORT",
            "LOAD",
            "ROLE",
            "ROLES",
            "COMPACTIONS",
            "PRINCIPALS",
            "TRANSACTIONS",
            "INDEX",
            "INDEXES",
            "LOCKS",
            "OPTION",
            "ANTI",
            "LOCAL",
            "INPATH",
            "STRING",
            "BIGINT_LITERAL",
            "SMALLINT_LITERAL",
            "TINYINT_LITERAL",
            "INTEGER_VALUE",
            "DECIMAL_VALUE",
            "DOUBLE_LITERAL",
            "BIGDECIMAL_LITERAL",
            "IDENTIFIER",
            "BACKQUOTED_IDENTIFIER",
            "SIMPLE_COMMENT",
            "BRACKETED_EMPTY_COMMENT",
            "BRACKETED_COMMENT",
            "WS",
            "UNRECOGNIZED"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /** @deprecated Use {@link #VOCABULARY} instead. */
    @Deprecated public static final String[] tokenNames;

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
    public String getGrammarFileName() {
        return "SqlBase.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    /**
     * When false, INTERSECT is given the greater precedence over the other set operations (UNION,
     * EXCEPT and MINUS) as per the SQL standard.
     */
    public boolean legacy_setops_precedence_enbled = false;

    /**
     * Verify whether current token is a valid decimal token (which contains dot). Returns true if
     * the character that follows the token is not a digit or letter or underscore.
     *
     * <p>For example: For char stream "2.3", "2." is not a valid decimal token, because it is
     * followed by digit '3'. For char stream "2.3_", "2.3" is not a valid decimal token, because it
     * is followed by '_'. For char stream "2.3W", "2.3" is not a valid decimal token, because it is
     * followed by 'W'. For char stream "12.0D 34.E2+0.12 " 12.0D is a valid decimal token because
     * it is followed by a space. 34.E2 is a valid decimal token because it is followed by symbol
     * '+' which is not a digit or letter or underscore.
     */
    public boolean isValidDecimal() {
        int nextChar = _input.LA(1);
        if (nextChar >= 'A' && nextChar <= 'Z'
                || nextChar >= '0' && nextChar <= '9'
                || nextChar == '_') {
            return false;
        } else {
            return true;
        }
    }

    public SqlBaseParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SingleStatementContext extends ParserRuleContext {
        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(SqlBaseParser.EOF, 0);
        }

        public SingleStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_singleStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSingleStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSingleStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSingleStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SingleStatementContext singleStatement() throws RecognitionException {
        SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_singleStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(202);
                statement();
                setState(203);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SingleExpressionContext extends ParserRuleContext {
        public NamedExpressionContext namedExpression() {
            return getRuleContext(NamedExpressionContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(SqlBaseParser.EOF, 0);
        }

        public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_singleExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSingleExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSingleExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSingleExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SingleExpressionContext singleExpression() throws RecognitionException {
        SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_singleExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(205);
                namedExpression();
                setState(206);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SingleTableIdentifierContext extends ParserRuleContext {
        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(SqlBaseParser.EOF, 0);
        }

        public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_singleTableIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSingleTableIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSingleTableIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSingleTableIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
        SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_singleTableIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(208);
                tableIdentifier();
                setState(209);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SingleFunctionIdentifierContext extends ParserRuleContext {
        public FunctionIdentifierContext functionIdentifier() {
            return getRuleContext(FunctionIdentifierContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(SqlBaseParser.EOF, 0);
        }

        public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_singleFunctionIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSingleFunctionIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSingleFunctionIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSingleFunctionIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SingleFunctionIdentifierContext singleFunctionIdentifier()
            throws RecognitionException {
        SingleFunctionIdentifierContext _localctx =
                new SingleFunctionIdentifierContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_singleFunctionIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(211);
                functionIdentifier();
                setState(212);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SingleDataTypeContext extends ParserRuleContext {
        public DataTypeContext dataType() {
            return getRuleContext(DataTypeContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(SqlBaseParser.EOF, 0);
        }

        public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_singleDataType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSingleDataType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSingleDataType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSingleDataType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SingleDataTypeContext singleDataType() throws RecognitionException {
        SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_singleDataType);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(214);
                dataType();
                setState(215);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SingleTableSchemaContext extends ParserRuleContext {
        public ColTypeListContext colTypeList() {
            return getRuleContext(ColTypeListContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(SqlBaseParser.EOF, 0);
        }

        public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_singleTableSchema;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSingleTableSchema(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSingleTableSchema(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSingleTableSchema(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
        SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_singleTableSchema);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(217);
                colTypeList();
                setState(218);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StatementContext extends ParserRuleContext {
        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        public StatementContext() {}

        public void copyFrom(StatementContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExplainContext extends StatementContext {
        public TerminalNode EXPLAIN() {
            return getToken(SqlBaseParser.EXPLAIN, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public TerminalNode LOGICAL() {
            return getToken(SqlBaseParser.LOGICAL, 0);
        }

        public TerminalNode FORMATTED() {
            return getToken(SqlBaseParser.FORMATTED, 0);
        }

        public TerminalNode EXTENDED() {
            return getToken(SqlBaseParser.EXTENDED, 0);
        }

        public TerminalNode CODEGEN() {
            return getToken(SqlBaseParser.CODEGEN, 0);
        }

        public TerminalNode COST() {
            return getToken(SqlBaseParser.COST, 0);
        }

        public ExplainContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterExplain(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitExplain(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitExplain(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DropDatabaseContext extends StatementContext {
        public TerminalNode DROP() {
            return getToken(SqlBaseParser.DROP, 0);
        }

        public TerminalNode DATABASE() {
            return getToken(SqlBaseParser.DATABASE, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public TerminalNode RESTRICT() {
            return getToken(SqlBaseParser.RESTRICT, 0);
        }

        public TerminalNode CASCADE() {
            return getToken(SqlBaseParser.CASCADE, 0);
        }

        public DropDatabaseContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDropDatabase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDropDatabase(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDropDatabase(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ResetConfigurationContext extends StatementContext {
        public TerminalNode RESET() {
            return getToken(SqlBaseParser.RESET, 0);
        }

        public ResetConfigurationContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterResetConfiguration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitResetConfiguration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitResetConfiguration(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DescribeDatabaseContext extends StatementContext {
        public TerminalNode DATABASE() {
            return getToken(SqlBaseParser.DATABASE, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode DESC() {
            return getToken(SqlBaseParser.DESC, 0);
        }

        public TerminalNode DESCRIBE() {
            return getToken(SqlBaseParser.DESCRIBE, 0);
        }

        public TerminalNode EXTENDED() {
            return getToken(SqlBaseParser.EXTENDED, 0);
        }

        public DescribeDatabaseContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDescribeDatabase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDescribeDatabase(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDescribeDatabase(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AlterViewQueryContext extends StatementContext {
        public TerminalNode ALTER() {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SqlBaseParser.VIEW, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public AlterViewQueryContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterAlterViewQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitAlterViewQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitAlterViewQuery(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class UseContext extends StatementContext {
        public IdentifierContext db;

        public TerminalNode USE() {
            return getToken(SqlBaseParser.USE, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public UseContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).enterUse(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitUse(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitUse(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CreateTempViewUsingContext extends StatementContext {
        public TerminalNode CREATE() {
            return getToken(SqlBaseParser.CREATE, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(SqlBaseParser.TEMPORARY, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SqlBaseParser.VIEW, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TableProviderContext tableProvider() {
            return getRuleContext(TableProviderContext.class, 0);
        }

        public TerminalNode OR() {
            return getToken(SqlBaseParser.OR, 0);
        }

        public TerminalNode REPLACE() {
            return getToken(SqlBaseParser.REPLACE, 0);
        }

        public TerminalNode GLOBAL() {
            return getToken(SqlBaseParser.GLOBAL, 0);
        }

        public ColTypeListContext colTypeList() {
            return getRuleContext(ColTypeListContext.class, 0);
        }

        public TerminalNode OPTIONS() {
            return getToken(SqlBaseParser.OPTIONS, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        public CreateTempViewUsingContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCreateTempViewUsing(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCreateTempViewUsing(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCreateTempViewUsing(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RenameTableContext extends StatementContext {
        public TableIdentifierContext from;
        public TableIdentifierContext to;

        public TerminalNode ALTER() {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode RENAME() {
            return getToken(SqlBaseParser.RENAME, 0);
        }

        public TerminalNode TO() {
            return getToken(SqlBaseParser.TO, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SqlBaseParser.VIEW, 0);
        }

        public List<TableIdentifierContext> tableIdentifier() {
            return getRuleContexts(TableIdentifierContext.class);
        }

        public TableIdentifierContext tableIdentifier(int i) {
            return getRuleContext(TableIdentifierContext.class, i);
        }

        public RenameTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRenameTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRenameTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRenameTable(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FailNativeCommandContext extends StatementContext {
        public TerminalNode SET() {
            return getToken(SqlBaseParser.SET, 0);
        }

        public TerminalNode ROLE() {
            return getToken(SqlBaseParser.ROLE, 0);
        }

        public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
            return getRuleContext(UnsupportedHiveNativeCommandsContext.class, 0);
        }

        public FailNativeCommandContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterFailNativeCommand(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitFailNativeCommand(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitFailNativeCommand(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ClearCacheContext extends StatementContext {
        public TerminalNode CLEAR() {
            return getToken(SqlBaseParser.CLEAR, 0);
        }

        public TerminalNode CACHE() {
            return getToken(SqlBaseParser.CACHE, 0);
        }

        public ClearCacheContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterClearCache(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitClearCache(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitClearCache(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ShowTablesContext extends StatementContext {
        public IdentifierContext db;
        public Token pattern;

        public TerminalNode SHOW() {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode TABLES() {
            return getToken(SqlBaseParser.TABLES, 0);
        }

        public TerminalNode FROM() {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public TerminalNode IN() {
            return getToken(SqlBaseParser.IN, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public TerminalNode LIKE() {
            return getToken(SqlBaseParser.LIKE, 0);
        }

        public ShowTablesContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterShowTables(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitShowTables(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitShowTables(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RecoverPartitionsContext extends StatementContext {
        public TerminalNode ALTER() {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode RECOVER() {
            return getToken(SqlBaseParser.RECOVER, 0);
        }

        public TerminalNode PARTITIONS() {
            return getToken(SqlBaseParser.PARTITIONS, 0);
        }

        public RecoverPartitionsContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRecoverPartitions(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRecoverPartitions(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRecoverPartitions(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RenameTablePartitionContext extends StatementContext {
        public PartitionSpecContext from;
        public PartitionSpecContext to;

        public TerminalNode ALTER() {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode RENAME() {
            return getToken(SqlBaseParser.RENAME, 0);
        }

        public TerminalNode TO() {
            return getToken(SqlBaseParser.TO, 0);
        }

        public List<PartitionSpecContext> partitionSpec() {
            return getRuleContexts(PartitionSpecContext.class);
        }

        public PartitionSpecContext partitionSpec(int i) {
            return getRuleContext(PartitionSpecContext.class, i);
        }

        public RenameTablePartitionContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRenameTablePartition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRenameTablePartition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRenameTablePartition(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RepairTableContext extends StatementContext {
        public TerminalNode MSCK() {
            return getToken(SqlBaseParser.MSCK, 0);
        }

        public TerminalNode REPAIR() {
            return getToken(SqlBaseParser.REPAIR, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public RepairTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRepairTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRepairTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRepairTable(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RefreshResourceContext extends StatementContext {
        public TerminalNode REFRESH() {
            return getToken(SqlBaseParser.REFRESH, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public RefreshResourceContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRefreshResource(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRefreshResource(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRefreshResource(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ShowCreateTableContext extends StatementContext {
        public TerminalNode SHOW() {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode CREATE() {
            return getToken(SqlBaseParser.CREATE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public ShowCreateTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterShowCreateTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitShowCreateTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitShowCreateTable(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ShowColumnsContext extends StatementContext {
        public IdentifierContext db;

        public TerminalNode SHOW() {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode COLUMNS() {
            return getToken(SqlBaseParser.COLUMNS, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public List<TerminalNode> FROM() {
            return getTokens(SqlBaseParser.FROM);
        }

        public TerminalNode FROM(int i) {
            return getToken(SqlBaseParser.FROM, i);
        }

        public List<TerminalNode> IN() {
            return getTokens(SqlBaseParser.IN);
        }

        public TerminalNode IN(int i) {
            return getToken(SqlBaseParser.IN, i);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ShowColumnsContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterShowColumns(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitShowColumns(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitShowColumns(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AddTablePartitionContext extends StatementContext {
        public TerminalNode ALTER() {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode ADD() {
            return getToken(SqlBaseParser.ADD, 0);
        }

        public TerminalNode IF() {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public List<PartitionSpecLocationContext> partitionSpecLocation() {
            return getRuleContexts(PartitionSpecLocationContext.class);
        }

        public PartitionSpecLocationContext partitionSpecLocation(int i) {
            return getRuleContext(PartitionSpecLocationContext.class, i);
        }

        public TerminalNode VIEW() {
            return getToken(SqlBaseParser.VIEW, 0);
        }

        public List<PartitionSpecContext> partitionSpec() {
            return getRuleContexts(PartitionSpecContext.class);
        }

        public PartitionSpecContext partitionSpec(int i) {
            return getRuleContext(PartitionSpecContext.class, i);
        }

        public AddTablePartitionContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterAddTablePartition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitAddTablePartition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitAddTablePartition(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RefreshTableContext extends StatementContext {
        public TerminalNode REFRESH() {
            return getToken(SqlBaseParser.REFRESH, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public RefreshTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRefreshTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRefreshTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRefreshTable(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ManageResourceContext extends StatementContext {
        public Token op;

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode ADD() {
            return getToken(SqlBaseParser.ADD, 0);
        }

        public TerminalNode LIST() {
            return getToken(SqlBaseParser.LIST, 0);
        }

        public ManageResourceContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterManageResource(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitManageResource(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitManageResource(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CreateDatabaseContext extends StatementContext {
        public Token comment;

        public TerminalNode CREATE() {
            return getToken(SqlBaseParser.CREATE, 0);
        }

        public TerminalNode DATABASE() {
            return getToken(SqlBaseParser.DATABASE, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(SqlBaseParser.COMMENT, 0);
        }

        public LocationSpecContext locationSpec() {
            return getRuleContext(LocationSpecContext.class, 0);
        }

        public TerminalNode WITH() {
            return getToken(SqlBaseParser.WITH, 0);
        }

        public TerminalNode DBPROPERTIES() {
            return getToken(SqlBaseParser.DBPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public CreateDatabaseContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCreateDatabase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCreateDatabase(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCreateDatabase(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AnalyzeContext extends StatementContext {
        public TerminalNode ANALYZE() {
            return getToken(SqlBaseParser.ANALYZE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode COMPUTE() {
            return getToken(SqlBaseParser.COMPUTE, 0);
        }

        public TerminalNode STATISTICS() {
            return getToken(SqlBaseParser.STATISTICS, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode FOR() {
            return getToken(SqlBaseParser.FOR, 0);
        }

        public TerminalNode COLUMNS() {
            return getToken(SqlBaseParser.COLUMNS, 0);
        }

        public IdentifierSeqContext identifierSeq() {
            return getRuleContext(IdentifierSeqContext.class, 0);
        }

        public AnalyzeContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterAnalyze(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitAnalyze(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitAnalyze(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CreateHiveTableContext extends StatementContext {
        public ColTypeListContext columns;
        public Token comment;
        public ColTypeListContext partitionColumns;
        public TablePropertyListContext tableProps;

        public CreateTableHeaderContext createTableHeader() {
            return getRuleContext(CreateTableHeaderContext.class, 0);
        }

        public List<BucketSpecContext> bucketSpec() {
            return getRuleContexts(BucketSpecContext.class);
        }

        public BucketSpecContext bucketSpec(int i) {
            return getRuleContext(BucketSpecContext.class, i);
        }

        public List<SkewSpecContext> skewSpec() {
            return getRuleContexts(SkewSpecContext.class);
        }

        public SkewSpecContext skewSpec(int i) {
            return getRuleContext(SkewSpecContext.class, i);
        }

        public List<RowFormatContext> rowFormat() {
            return getRuleContexts(RowFormatContext.class);
        }

        public RowFormatContext rowFormat(int i) {
            return getRuleContext(RowFormatContext.class, i);
        }

        public List<CreateFileFormatContext> createFileFormat() {
            return getRuleContexts(CreateFileFormatContext.class);
        }

        public CreateFileFormatContext createFileFormat(int i) {
            return getRuleContext(CreateFileFormatContext.class, i);
        }

        public List<LocationSpecContext> locationSpec() {
            return getRuleContexts(LocationSpecContext.class);
        }

        public LocationSpecContext locationSpec(int i) {
            return getRuleContext(LocationSpecContext.class, i);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public List<ColTypeListContext> colTypeList() {
            return getRuleContexts(ColTypeListContext.class);
        }

        public ColTypeListContext colTypeList(int i) {
            return getRuleContext(ColTypeListContext.class, i);
        }

        public List<TerminalNode> COMMENT() {
            return getTokens(SqlBaseParser.COMMENT);
        }

        public TerminalNode COMMENT(int i) {
            return getToken(SqlBaseParser.COMMENT, i);
        }

        public List<TerminalNode> PARTITIONED() {
            return getTokens(SqlBaseParser.PARTITIONED);
        }

        public TerminalNode PARTITIONED(int i) {
            return getToken(SqlBaseParser.PARTITIONED, i);
        }

        public List<TerminalNode> BY() {
            return getTokens(SqlBaseParser.BY);
        }

        public TerminalNode BY(int i) {
            return getToken(SqlBaseParser.BY, i);
        }

        public List<TerminalNode> TBLPROPERTIES() {
            return getTokens(SqlBaseParser.TBLPROPERTIES);
        }

        public TerminalNode TBLPROPERTIES(int i) {
            return getToken(SqlBaseParser.TBLPROPERTIES, i);
        }

        public List<TerminalNode> STRING() {
            return getTokens(SqlBaseParser.STRING);
        }

        public TerminalNode STRING(int i) {
            return getToken(SqlBaseParser.STRING, i);
        }

        public List<TablePropertyListContext> tablePropertyList() {
            return getRuleContexts(TablePropertyListContext.class);
        }

        public TablePropertyListContext tablePropertyList(int i) {
            return getRuleContext(TablePropertyListContext.class, i);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public CreateHiveTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCreateHiveTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCreateHiveTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCreateHiveTable(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CreateFunctionContext extends StatementContext {
        public Token className;

        public TerminalNode CREATE() {
            return getToken(SqlBaseParser.CREATE, 0);
        }

        public TerminalNode FUNCTION() {
            return getToken(SqlBaseParser.FUNCTION, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public TerminalNode OR() {
            return getToken(SqlBaseParser.OR, 0);
        }

        public TerminalNode REPLACE() {
            return getToken(SqlBaseParser.REPLACE, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(SqlBaseParser.TEMPORARY, 0);
        }

        public TerminalNode IF() {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public TerminalNode USING() {
            return getToken(SqlBaseParser.USING, 0);
        }

        public List<ResourceContext> resource() {
            return getRuleContexts(ResourceContext.class);
        }

        public ResourceContext resource(int i) {
            return getRuleContext(ResourceContext.class, i);
        }

        public CreateFunctionContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCreateFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCreateFunction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCreateFunction(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ShowTableContext extends StatementContext {
        public IdentifierContext db;
        public Token pattern;

        public TerminalNode SHOW() {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TerminalNode EXTENDED() {
            return getToken(SqlBaseParser.EXTENDED, 0);
        }

        public TerminalNode LIKE() {
            return getToken(SqlBaseParser.LIKE, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public TerminalNode FROM() {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public TerminalNode IN() {
            return getToken(SqlBaseParser.IN, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ShowTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterShowTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitShowTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitShowTable(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SetDatabasePropertiesContext extends StatementContext {
        public TerminalNode ALTER() {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode DATABASE() {
            return getToken(SqlBaseParser.DATABASE, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode SET() {
            return getToken(SqlBaseParser.SET, 0);
        }

        public TerminalNode DBPROPERTIES() {
            return getToken(SqlBaseParser.DBPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        public SetDatabasePropertiesContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSetDatabaseProperties(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSetDatabaseProperties(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSetDatabaseProperties(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CreateTableContext extends StatementContext {
        public TablePropertyListContext options;
        public IdentifierListContext partitionColumnNames;
        public Token comment;
        public TablePropertyListContext tableProps;

        public CreateTableHeaderContext createTableHeader() {
            return getRuleContext(CreateTableHeaderContext.class, 0);
        }

        public TableProviderContext tableProvider() {
            return getRuleContext(TableProviderContext.class, 0);
        }

        public ColTypeListContext colTypeList() {
            return getRuleContext(ColTypeListContext.class, 0);
        }

        public List<BucketSpecContext> bucketSpec() {
            return getRuleContexts(BucketSpecContext.class);
        }

        public BucketSpecContext bucketSpec(int i) {
            return getRuleContext(BucketSpecContext.class, i);
        }

        public List<LocationSpecContext> locationSpec() {
            return getRuleContexts(LocationSpecContext.class);
        }

        public LocationSpecContext locationSpec(int i) {
            return getRuleContext(LocationSpecContext.class, i);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public List<TerminalNode> OPTIONS() {
            return getTokens(SqlBaseParser.OPTIONS);
        }

        public TerminalNode OPTIONS(int i) {
            return getToken(SqlBaseParser.OPTIONS, i);
        }

        public List<TerminalNode> PARTITIONED() {
            return getTokens(SqlBaseParser.PARTITIONED);
        }

        public TerminalNode PARTITIONED(int i) {
            return getToken(SqlBaseParser.PARTITIONED, i);
        }

        public List<TerminalNode> BY() {
            return getTokens(SqlBaseParser.BY);
        }

        public TerminalNode BY(int i) {
            return getToken(SqlBaseParser.BY, i);
        }

        public List<TerminalNode> COMMENT() {
            return getTokens(SqlBaseParser.COMMENT);
        }

        public TerminalNode COMMENT(int i) {
            return getToken(SqlBaseParser.COMMENT, i);
        }

        public List<TerminalNode> TBLPROPERTIES() {
            return getTokens(SqlBaseParser.TBLPROPERTIES);
        }

        public TerminalNode TBLPROPERTIES(int i) {
            return getToken(SqlBaseParser.TBLPROPERTIES, i);
        }

        public List<TablePropertyListContext> tablePropertyList() {
            return getRuleContexts(TablePropertyListContext.class);
        }

        public TablePropertyListContext tablePropertyList(int i) {
            return getRuleContext(TablePropertyListContext.class, i);
        }

        public List<IdentifierListContext> identifierList() {
            return getRuleContexts(IdentifierListContext.class);
        }

        public IdentifierListContext identifierList(int i) {
            return getRuleContext(IdentifierListContext.class, i);
        }

        public List<TerminalNode> STRING() {
            return getTokens(SqlBaseParser.STRING);
        }

        public TerminalNode STRING(int i) {
            return getToken(SqlBaseParser.STRING, i);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public CreateTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCreateTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCreateTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCreateTable(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DescribeTableContext extends StatementContext {
        public Token option;

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode DESC() {
            return getToken(SqlBaseParser.DESC, 0);
        }

        public TerminalNode DESCRIBE() {
            return getToken(SqlBaseParser.DESCRIBE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public DescribeColNameContext describeColName() {
            return getRuleContext(DescribeColNameContext.class, 0);
        }

        public TerminalNode EXTENDED() {
            return getToken(SqlBaseParser.EXTENDED, 0);
        }

        public TerminalNode FORMATTED() {
            return getToken(SqlBaseParser.FORMATTED, 0);
        }

        public DescribeTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDescribeTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDescribeTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDescribeTable(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CreateTableLikeContext extends StatementContext {
        public TableIdentifierContext target;
        public TableIdentifierContext source;

        public TerminalNode CREATE() {
            return getToken(SqlBaseParser.CREATE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TerminalNode LIKE() {
            return getToken(SqlBaseParser.LIKE, 0);
        }

        public List<TableIdentifierContext> tableIdentifier() {
            return getRuleContexts(TableIdentifierContext.class);
        }

        public TableIdentifierContext tableIdentifier(int i) {
            return getRuleContext(TableIdentifierContext.class, i);
        }

        public TerminalNode IF() {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public LocationSpecContext locationSpec() {
            return getRuleContext(LocationSpecContext.class, 0);
        }

        public CreateTableLikeContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCreateTableLike(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCreateTableLike(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCreateTableLike(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class UncacheTableContext extends StatementContext {
        public TerminalNode UNCACHE() {
            return getToken(SqlBaseParser.UNCACHE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public UncacheTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterUncacheTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitUncacheTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitUncacheTable(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DropFunctionContext extends StatementContext {
        public TerminalNode DROP() {
            return getToken(SqlBaseParser.DROP, 0);
        }

        public TerminalNode FUNCTION() {
            return getToken(SqlBaseParser.FUNCTION, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(SqlBaseParser.TEMPORARY, 0);
        }

        public TerminalNode IF() {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public DropFunctionContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDropFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDropFunction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDropFunction(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LoadDataContext extends StatementContext {
        public Token path;

        public TerminalNode LOAD() {
            return getToken(SqlBaseParser.LOAD, 0);
        }

        public TerminalNode DATA() {
            return getToken(SqlBaseParser.DATA, 0);
        }

        public TerminalNode INPATH() {
            return getToken(SqlBaseParser.INPATH, 0);
        }

        public TerminalNode INTO() {
            return getToken(SqlBaseParser.INTO, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public TerminalNode LOCAL() {
            return getToken(SqlBaseParser.LOCAL, 0);
        }

        public TerminalNode OVERWRITE() {
            return getToken(SqlBaseParser.OVERWRITE, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public LoadDataContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterLoadData(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitLoadData(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitLoadData(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ShowPartitionsContext extends StatementContext {
        public TerminalNode SHOW() {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode PARTITIONS() {
            return getToken(SqlBaseParser.PARTITIONS, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public ShowPartitionsContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterShowPartitions(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitShowPartitions(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitShowPartitions(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DescribeFunctionContext extends StatementContext {
        public TerminalNode FUNCTION() {
            return getToken(SqlBaseParser.FUNCTION, 0);
        }

        public DescribeFuncNameContext describeFuncName() {
            return getRuleContext(DescribeFuncNameContext.class, 0);
        }

        public TerminalNode DESC() {
            return getToken(SqlBaseParser.DESC, 0);
        }

        public TerminalNode DESCRIBE() {
            return getToken(SqlBaseParser.DESCRIBE, 0);
        }

        public TerminalNode EXTENDED() {
            return getToken(SqlBaseParser.EXTENDED, 0);
        }

        public DescribeFunctionContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDescribeFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDescribeFunction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDescribeFunction(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ChangeColumnContext extends StatementContext {
        public TerminalNode ALTER() {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode CHANGE() {
            return getToken(SqlBaseParser.CHANGE, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ColTypeContext colType() {
            return getRuleContext(ColTypeContext.class, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public TerminalNode COLUMN() {
            return getToken(SqlBaseParser.COLUMN, 0);
        }

        public ColPositionContext colPosition() {
            return getRuleContext(ColPositionContext.class, 0);
        }

        public ChangeColumnContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterChangeColumn(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitChangeColumn(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitChangeColumn(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StatementDefaultContext extends StatementContext {
        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public StatementDefaultContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterStatementDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitStatementDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitStatementDefault(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TruncateTableContext extends StatementContext {
        public TerminalNode TRUNCATE() {
            return getToken(SqlBaseParser.TRUNCATE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public TruncateTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTruncateTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTruncateTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTruncateTable(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SetTableSerDeContext extends StatementContext {
        public TerminalNode ALTER() {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode SET() {
            return getToken(SqlBaseParser.SET, 0);
        }

        public TerminalNode SERDE() {
            return getToken(SqlBaseParser.SERDE, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public TerminalNode WITH() {
            return getToken(SqlBaseParser.WITH, 0);
        }

        public TerminalNode SERDEPROPERTIES() {
            return getToken(SqlBaseParser.SERDEPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        public SetTableSerDeContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSetTableSerDe(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSetTableSerDe(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSetTableSerDe(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CreateViewContext extends StatementContext {
        public TerminalNode CREATE() {
            return getToken(SqlBaseParser.CREATE, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SqlBaseParser.VIEW, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public TerminalNode OR() {
            return getToken(SqlBaseParser.OR, 0);
        }

        public TerminalNode REPLACE() {
            return getToken(SqlBaseParser.REPLACE, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(SqlBaseParser.TEMPORARY, 0);
        }

        public TerminalNode IF() {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public IdentifierCommentListContext identifierCommentList() {
            return getRuleContext(IdentifierCommentListContext.class, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(SqlBaseParser.COMMENT, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public TerminalNode PARTITIONED() {
            return getToken(SqlBaseParser.PARTITIONED, 0);
        }

        public TerminalNode ON() {
            return getToken(SqlBaseParser.ON, 0);
        }

        public IdentifierListContext identifierList() {
            return getRuleContext(IdentifierListContext.class, 0);
        }

        public TerminalNode TBLPROPERTIES() {
            return getToken(SqlBaseParser.TBLPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        public TerminalNode GLOBAL() {
            return getToken(SqlBaseParser.GLOBAL, 0);
        }

        public CreateViewContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCreateView(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCreateView(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCreateView(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DropTablePartitionsContext extends StatementContext {
        public TerminalNode ALTER() {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode DROP() {
            return getToken(SqlBaseParser.DROP, 0);
        }

        public List<PartitionSpecContext> partitionSpec() {
            return getRuleContexts(PartitionSpecContext.class);
        }

        public PartitionSpecContext partitionSpec(int i) {
            return getRuleContext(PartitionSpecContext.class, i);
        }

        public TerminalNode IF() {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public TerminalNode PURGE() {
            return getToken(SqlBaseParser.PURGE, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SqlBaseParser.VIEW, 0);
        }

        public DropTablePartitionsContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDropTablePartitions(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDropTablePartitions(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDropTablePartitions(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SetConfigurationContext extends StatementContext {
        public TerminalNode SET() {
            return getToken(SqlBaseParser.SET, 0);
        }

        public SetConfigurationContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSetConfiguration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSetConfiguration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSetConfiguration(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DropTableContext extends StatementContext {
        public TerminalNode DROP() {
            return getToken(SqlBaseParser.DROP, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public TerminalNode PURGE() {
            return getToken(SqlBaseParser.PURGE, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SqlBaseParser.VIEW, 0);
        }

        public DropTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDropTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDropTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDropTable(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ShowDatabasesContext extends StatementContext {
        public Token pattern;

        public TerminalNode SHOW() {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode DATABASES() {
            return getToken(SqlBaseParser.DATABASES, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public TerminalNode LIKE() {
            return getToken(SqlBaseParser.LIKE, 0);
        }

        public ShowDatabasesContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterShowDatabases(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitShowDatabases(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitShowDatabases(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ShowTblPropertiesContext extends StatementContext {
        public TableIdentifierContext table;
        public TablePropertyKeyContext key;

        public TerminalNode SHOW() {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode TBLPROPERTIES() {
            return getToken(SqlBaseParser.TBLPROPERTIES, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TablePropertyKeyContext tablePropertyKey() {
            return getRuleContext(TablePropertyKeyContext.class, 0);
        }

        public ShowTblPropertiesContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterShowTblProperties(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitShowTblProperties(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitShowTblProperties(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class UnsetTablePropertiesContext extends StatementContext {
        public TerminalNode ALTER() {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode UNSET() {
            return getToken(SqlBaseParser.UNSET, 0);
        }

        public TerminalNode TBLPROPERTIES() {
            return getToken(SqlBaseParser.TBLPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SqlBaseParser.VIEW, 0);
        }

        public TerminalNode IF() {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public UnsetTablePropertiesContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterUnsetTableProperties(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitUnsetTableProperties(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitUnsetTableProperties(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SetTableLocationContext extends StatementContext {
        public TerminalNode ALTER() {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode SET() {
            return getToken(SqlBaseParser.SET, 0);
        }

        public LocationSpecContext locationSpec() {
            return getRuleContext(LocationSpecContext.class, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public SetTableLocationContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSetTableLocation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSetTableLocation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSetTableLocation(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ShowFunctionsContext extends StatementContext {
        public Token pattern;

        public TerminalNode SHOW() {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode FUNCTIONS() {
            return getToken(SqlBaseParser.FUNCTIONS, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode LIKE() {
            return getToken(SqlBaseParser.LIKE, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public ShowFunctionsContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterShowFunctions(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitShowFunctions(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitShowFunctions(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CacheTableContext extends StatementContext {
        public TerminalNode CACHE() {
            return getToken(SqlBaseParser.CACHE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode LAZY() {
            return getToken(SqlBaseParser.LAZY, 0);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public CacheTableContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCacheTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCacheTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCacheTable(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AddTableColumnsContext extends StatementContext {
        public ColTypeListContext columns;

        public TerminalNode ALTER() {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode ADD() {
            return getToken(SqlBaseParser.ADD, 0);
        }

        public TerminalNode COLUMNS() {
            return getToken(SqlBaseParser.COLUMNS, 0);
        }

        public ColTypeListContext colTypeList() {
            return getRuleContext(ColTypeListContext.class, 0);
        }

        public AddTableColumnsContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterAddTableColumns(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitAddTableColumns(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitAddTableColumns(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SetTablePropertiesContext extends StatementContext {
        public TerminalNode ALTER() {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode SET() {
            return getToken(SqlBaseParser.SET, 0);
        }

        public TerminalNode TBLPROPERTIES() {
            return getToken(SqlBaseParser.TBLPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SqlBaseParser.VIEW, 0);
        }

        public SetTablePropertiesContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSetTableProperties(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSetTableProperties(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSetTableProperties(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_statement);
        int _la;
        try {
            int _alt;
            setState(826);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 95, _ctx)) {
                case 1:
                    _localctx = new StatementDefaultContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(220);
                        query();
                    }
                    break;
                case 2:
                    _localctx = new UseContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(221);
                        match(USE);
                        setState(222);
                        ((UseContext) _localctx).db = identifier();
                    }
                    break;
                case 3:
                    _localctx = new CreateDatabaseContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(223);
                        match(CREATE);
                        setState(224);
                        match(DATABASE);
                        setState(228);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                            case 1:
                                {
                                    setState(225);
                                    match(IF);
                                    setState(226);
                                    match(NOT);
                                    setState(227);
                                    match(EXISTS);
                                }
                                break;
                        }
                        setState(230);
                        identifier();
                        setState(233);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == COMMENT) {
                            {
                                setState(231);
                                match(COMMENT);
                                setState(232);
                                ((CreateDatabaseContext) _localctx).comment = match(STRING);
                            }
                        }

                        setState(236);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == LOCATION) {
                            {
                                setState(235);
                                locationSpec();
                            }
                        }

                        setState(241);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == WITH) {
                            {
                                setState(238);
                                match(WITH);
                                setState(239);
                                match(DBPROPERTIES);
                                setState(240);
                                tablePropertyList();
                            }
                        }
                    }
                    break;
                case 4:
                    _localctx = new SetDatabasePropertiesContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(243);
                        match(ALTER);
                        setState(244);
                        match(DATABASE);
                        setState(245);
                        identifier();
                        setState(246);
                        match(SET);
                        setState(247);
                        match(DBPROPERTIES);
                        setState(248);
                        tablePropertyList();
                    }
                    break;
                case 5:
                    _localctx = new DropDatabaseContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                    {
                        setState(250);
                        match(DROP);
                        setState(251);
                        match(DATABASE);
                        setState(254);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                            case 1:
                                {
                                    setState(252);
                                    match(IF);
                                    setState(253);
                                    match(EXISTS);
                                }
                                break;
                        }
                        setState(256);
                        identifier();
                        setState(258);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == CASCADE || _la == RESTRICT) {
                            {
                                setState(257);
                                _la = _input.LA(1);
                                if (!(_la == CASCADE || _la == RESTRICT)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    _localctx = new CreateTableContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                    {
                        setState(260);
                        createTableHeader();
                        setState(265);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(261);
                                match(T__0);
                                setState(262);
                                colTypeList();
                                setState(263);
                                match(T__1);
                            }
                        }

                        setState(267);
                        tableProvider();
                        setState(281);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMENT
                                || ((((_la - 183)) & ~0x3f) == 0
                                        && ((1L << (_la - 183)) & 4295491845L) != 0)) {
                            {
                                setState(279);
                                _errHandler.sync(this);
                                switch (_input.LA(1)) {
                                    case OPTIONS:
                                        {
                                            {
                                                setState(268);
                                                match(OPTIONS);
                                                setState(269);
                                                ((CreateTableContext) _localctx).options =
                                                        tablePropertyList();
                                            }
                                        }
                                        break;
                                    case PARTITIONED:
                                        {
                                            {
                                                setState(270);
                                                match(PARTITIONED);
                                                setState(271);
                                                match(BY);
                                                setState(272);
                                                ((CreateTableContext) _localctx)
                                                                .partitionColumnNames =
                                                        identifierList();
                                            }
                                        }
                                        break;
                                    case CLUSTERED:
                                        {
                                            setState(273);
                                            bucketSpec();
                                        }
                                        break;
                                    case LOCATION:
                                        {
                                            setState(274);
                                            locationSpec();
                                        }
                                        break;
                                    case COMMENT:
                                        {
                                            {
                                                setState(275);
                                                match(COMMENT);
                                                setState(276);
                                                ((CreateTableContext) _localctx).comment =
                                                        match(STRING);
                                            }
                                        }
                                        break;
                                    case TBLPROPERTIES:
                                        {
                                            {
                                                setState(277);
                                                match(TBLPROPERTIES);
                                                setState(278);
                                                ((CreateTableContext) _localctx).tableProps =
                                                        tablePropertyList();
                                            }
                                        }
                                        break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                            }
                            setState(283);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(288);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22530L) != 0)
                                || ((((_la - 77)) & ~0x3f) == 0
                                        && ((1L << (_la - 77)) & 34359738507L) != 0)
                                || _la == REDUCE) {
                            {
                                setState(285);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == AS) {
                                    {
                                        setState(284);
                                        match(AS);
                                    }
                                }

                                setState(287);
                                query();
                            }
                        }
                    }
                    break;
                case 7:
                    _localctx = new CreateHiveTableContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                    {
                        setState(290);
                        createTableHeader();
                        setState(295);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                            case 1:
                                {
                                    setState(291);
                                    match(T__0);
                                    setState(292);
                                    ((CreateHiveTableContext) _localctx).columns = colTypeList();
                                    setState(293);
                                    match(T__1);
                                }
                                break;
                        }
                        setState(314);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == ROW
                                || _la == COMMENT
                                || ((((_la - 185)) & ~0x3f) == 0
                                        && ((1L << (_la - 185)) & 1073872985L) != 0)) {
                            {
                                setState(312);
                                _errHandler.sync(this);
                                switch (_input.LA(1)) {
                                    case COMMENT:
                                        {
                                            {
                                                setState(297);
                                                match(COMMENT);
                                                setState(298);
                                                ((CreateHiveTableContext) _localctx).comment =
                                                        match(STRING);
                                            }
                                        }
                                        break;
                                    case PARTITIONED:
                                        {
                                            {
                                                setState(299);
                                                match(PARTITIONED);
                                                setState(300);
                                                match(BY);
                                                setState(301);
                                                match(T__0);
                                                setState(302);
                                                ((CreateHiveTableContext) _localctx)
                                                                .partitionColumns =
                                                        colTypeList();
                                                setState(303);
                                                match(T__1);
                                            }
                                        }
                                        break;
                                    case CLUSTERED:
                                        {
                                            setState(305);
                                            bucketSpec();
                                        }
                                        break;
                                    case SKEWED:
                                        {
                                            setState(306);
                                            skewSpec();
                                        }
                                        break;
                                    case ROW:
                                        {
                                            setState(307);
                                            rowFormat();
                                        }
                                        break;
                                    case STORED:
                                        {
                                            setState(308);
                                            createFileFormat();
                                        }
                                        break;
                                    case LOCATION:
                                        {
                                            setState(309);
                                            locationSpec();
                                        }
                                        break;
                                    case TBLPROPERTIES:
                                        {
                                            {
                                                setState(310);
                                                match(TBLPROPERTIES);
                                                setState(311);
                                                ((CreateHiveTableContext) _localctx).tableProps =
                                                        tablePropertyList();
                                            }
                                        }
                                        break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                            }
                            setState(316);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(321);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22530L) != 0)
                                || ((((_la - 77)) & ~0x3f) == 0
                                        && ((1L << (_la - 77)) & 34359738507L) != 0)
                                || _la == REDUCE) {
                            {
                                setState(318);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == AS) {
                                    {
                                        setState(317);
                                        match(AS);
                                    }
                                }

                                setState(320);
                                query();
                            }
                        }
                    }
                    break;
                case 8:
                    _localctx = new CreateTableLikeContext(_localctx);
                    enterOuterAlt(_localctx, 8);
                    {
                        setState(323);
                        match(CREATE);
                        setState(324);
                        match(TABLE);
                        setState(328);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                            case 1:
                                {
                                    setState(325);
                                    match(IF);
                                    setState(326);
                                    match(NOT);
                                    setState(327);
                                    match(EXISTS);
                                }
                                break;
                        }
                        setState(330);
                        ((CreateTableLikeContext) _localctx).target = tableIdentifier();
                        setState(331);
                        match(LIKE);
                        setState(332);
                        ((CreateTableLikeContext) _localctx).source = tableIdentifier();
                        setState(334);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == LOCATION) {
                            {
                                setState(333);
                                locationSpec();
                            }
                        }
                    }
                    break;
                case 9:
                    _localctx = new AnalyzeContext(_localctx);
                    enterOuterAlt(_localctx, 9);
                    {
                        setState(336);
                        match(ANALYZE);
                        setState(337);
                        match(TABLE);
                        setState(338);
                        tableIdentifier();
                        setState(340);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITION) {
                            {
                                setState(339);
                                partitionSpec();
                            }
                        }

                        setState(342);
                        match(COMPUTE);
                        setState(343);
                        match(STATISTICS);
                        setState(348);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                            case 1:
                                {
                                    setState(344);
                                    identifier();
                                }
                                break;
                            case 2:
                                {
                                    setState(345);
                                    match(FOR);
                                    setState(346);
                                    match(COLUMNS);
                                    setState(347);
                                    identifierSeq();
                                }
                                break;
                        }
                    }
                    break;
                case 10:
                    _localctx = new AddTableColumnsContext(_localctx);
                    enterOuterAlt(_localctx, 10);
                    {
                        setState(350);
                        match(ALTER);
                        setState(351);
                        match(TABLE);
                        setState(352);
                        tableIdentifier();
                        setState(353);
                        match(ADD);
                        setState(354);
                        match(COLUMNS);
                        setState(355);
                        match(T__0);
                        setState(356);
                        ((AddTableColumnsContext) _localctx).columns = colTypeList();
                        setState(357);
                        match(T__1);
                    }
                    break;
                case 11:
                    _localctx = new RenameTableContext(_localctx);
                    enterOuterAlt(_localctx, 11);
                    {
                        setState(359);
                        match(ALTER);
                        setState(360);
                        _la = _input.LA(1);
                        if (!(_la == TABLE || _la == VIEW)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(361);
                        ((RenameTableContext) _localctx).from = tableIdentifier();
                        setState(362);
                        match(RENAME);
                        setState(363);
                        match(TO);
                        setState(364);
                        ((RenameTableContext) _localctx).to = tableIdentifier();
                    }
                    break;
                case 12:
                    _localctx = new SetTablePropertiesContext(_localctx);
                    enterOuterAlt(_localctx, 12);
                    {
                        setState(366);
                        match(ALTER);
                        setState(367);
                        _la = _input.LA(1);
                        if (!(_la == TABLE || _la == VIEW)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(368);
                        tableIdentifier();
                        setState(369);
                        match(SET);
                        setState(370);
                        match(TBLPROPERTIES);
                        setState(371);
                        tablePropertyList();
                    }
                    break;
                case 13:
                    _localctx = new UnsetTablePropertiesContext(_localctx);
                    enterOuterAlt(_localctx, 13);
                    {
                        setState(373);
                        match(ALTER);
                        setState(374);
                        _la = _input.LA(1);
                        if (!(_la == TABLE || _la == VIEW)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(375);
                        tableIdentifier();
                        setState(376);
                        match(UNSET);
                        setState(377);
                        match(TBLPROPERTIES);
                        setState(380);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == IF) {
                            {
                                setState(378);
                                match(IF);
                                setState(379);
                                match(EXISTS);
                            }
                        }

                        setState(382);
                        tablePropertyList();
                    }
                    break;
                case 14:
                    _localctx = new ChangeColumnContext(_localctx);
                    enterOuterAlt(_localctx, 14);
                    {
                        setState(384);
                        match(ALTER);
                        setState(385);
                        match(TABLE);
                        setState(386);
                        tableIdentifier();
                        setState(388);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITION) {
                            {
                                setState(387);
                                partitionSpec();
                            }
                        }

                        setState(390);
                        match(CHANGE);
                        setState(392);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                            case 1:
                                {
                                    setState(391);
                                    match(COLUMN);
                                }
                                break;
                        }
                        setState(394);
                        identifier();
                        setState(395);
                        colType();
                        setState(397);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == FIRST || _la == AFTER) {
                            {
                                setState(396);
                                colPosition();
                            }
                        }
                    }
                    break;
                case 15:
                    _localctx = new SetTableSerDeContext(_localctx);
                    enterOuterAlt(_localctx, 15);
                    {
                        setState(399);
                        match(ALTER);
                        setState(400);
                        match(TABLE);
                        setState(401);
                        tableIdentifier();
                        setState(403);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITION) {
                            {
                                setState(402);
                                partitionSpec();
                            }
                        }

                        setState(405);
                        match(SET);
                        setState(406);
                        match(SERDE);
                        setState(407);
                        match(STRING);
                        setState(411);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == WITH) {
                            {
                                setState(408);
                                match(WITH);
                                setState(409);
                                match(SERDEPROPERTIES);
                                setState(410);
                                tablePropertyList();
                            }
                        }
                    }
                    break;
                case 16:
                    _localctx = new SetTableSerDeContext(_localctx);
                    enterOuterAlt(_localctx, 16);
                    {
                        setState(413);
                        match(ALTER);
                        setState(414);
                        match(TABLE);
                        setState(415);
                        tableIdentifier();
                        setState(417);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITION) {
                            {
                                setState(416);
                                partitionSpec();
                            }
                        }

                        setState(419);
                        match(SET);
                        setState(420);
                        match(SERDEPROPERTIES);
                        setState(421);
                        tablePropertyList();
                    }
                    break;
                case 17:
                    _localctx = new AddTablePartitionContext(_localctx);
                    enterOuterAlt(_localctx, 17);
                    {
                        setState(423);
                        match(ALTER);
                        setState(424);
                        match(TABLE);
                        setState(425);
                        tableIdentifier();
                        setState(426);
                        match(ADD);
                        setState(430);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == IF) {
                            {
                                setState(427);
                                match(IF);
                                setState(428);
                                match(NOT);
                                setState(429);
                                match(EXISTS);
                            }
                        }

                        setState(433);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(432);
                                    partitionSpecLocation();
                                }
                            }
                            setState(435);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == PARTITION);
                    }
                    break;
                case 18:
                    _localctx = new AddTablePartitionContext(_localctx);
                    enterOuterAlt(_localctx, 18);
                    {
                        setState(437);
                        match(ALTER);
                        setState(438);
                        match(VIEW);
                        setState(439);
                        tableIdentifier();
                        setState(440);
                        match(ADD);
                        setState(444);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == IF) {
                            {
                                setState(441);
                                match(IF);
                                setState(442);
                                match(NOT);
                                setState(443);
                                match(EXISTS);
                            }
                        }

                        setState(447);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(446);
                                    partitionSpec();
                                }
                            }
                            setState(449);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == PARTITION);
                    }
                    break;
                case 19:
                    _localctx = new RenameTablePartitionContext(_localctx);
                    enterOuterAlt(_localctx, 19);
                    {
                        setState(451);
                        match(ALTER);
                        setState(452);
                        match(TABLE);
                        setState(453);
                        tableIdentifier();
                        setState(454);
                        ((RenameTablePartitionContext) _localctx).from = partitionSpec();
                        setState(455);
                        match(RENAME);
                        setState(456);
                        match(TO);
                        setState(457);
                        ((RenameTablePartitionContext) _localctx).to = partitionSpec();
                    }
                    break;
                case 20:
                    _localctx = new DropTablePartitionsContext(_localctx);
                    enterOuterAlt(_localctx, 20);
                    {
                        setState(459);
                        match(ALTER);
                        setState(460);
                        match(TABLE);
                        setState(461);
                        tableIdentifier();
                        setState(462);
                        match(DROP);
                        setState(465);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == IF) {
                            {
                                setState(463);
                                match(IF);
                                setState(464);
                                match(EXISTS);
                            }
                        }

                        setState(467);
                        partitionSpec();
                        setState(472);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(468);
                                    match(T__2);
                                    setState(469);
                                    partitionSpec();
                                }
                            }
                            setState(474);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(476);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PURGE) {
                            {
                                setState(475);
                                match(PURGE);
                            }
                        }
                    }
                    break;
                case 21:
                    _localctx = new DropTablePartitionsContext(_localctx);
                    enterOuterAlt(_localctx, 21);
                    {
                        setState(478);
                        match(ALTER);
                        setState(479);
                        match(VIEW);
                        setState(480);
                        tableIdentifier();
                        setState(481);
                        match(DROP);
                        setState(484);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == IF) {
                            {
                                setState(482);
                                match(IF);
                                setState(483);
                                match(EXISTS);
                            }
                        }

                        setState(486);
                        partitionSpec();
                        setState(491);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(487);
                                    match(T__2);
                                    setState(488);
                                    partitionSpec();
                                }
                            }
                            setState(493);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                    break;
                case 22:
                    _localctx = new SetTableLocationContext(_localctx);
                    enterOuterAlt(_localctx, 22);
                    {
                        setState(494);
                        match(ALTER);
                        setState(495);
                        match(TABLE);
                        setState(496);
                        tableIdentifier();
                        setState(498);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITION) {
                            {
                                setState(497);
                                partitionSpec();
                            }
                        }

                        setState(500);
                        match(SET);
                        setState(501);
                        locationSpec();
                    }
                    break;
                case 23:
                    _localctx = new RecoverPartitionsContext(_localctx);
                    enterOuterAlt(_localctx, 23);
                    {
                        setState(503);
                        match(ALTER);
                        setState(504);
                        match(TABLE);
                        setState(505);
                        tableIdentifier();
                        setState(506);
                        match(RECOVER);
                        setState(507);
                        match(PARTITIONS);
                    }
                    break;
                case 24:
                    _localctx = new DropTableContext(_localctx);
                    enterOuterAlt(_localctx, 24);
                    {
                        setState(509);
                        match(DROP);
                        setState(510);
                        match(TABLE);
                        setState(513);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
                            case 1:
                                {
                                    setState(511);
                                    match(IF);
                                    setState(512);
                                    match(EXISTS);
                                }
                                break;
                        }
                        setState(515);
                        tableIdentifier();
                        setState(517);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PURGE) {
                            {
                                setState(516);
                                match(PURGE);
                            }
                        }
                    }
                    break;
                case 25:
                    _localctx = new DropTableContext(_localctx);
                    enterOuterAlt(_localctx, 25);
                    {
                        setState(519);
                        match(DROP);
                        setState(520);
                        match(VIEW);
                        setState(523);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                            case 1:
                                {
                                    setState(521);
                                    match(IF);
                                    setState(522);
                                    match(EXISTS);
                                }
                                break;
                        }
                        setState(525);
                        tableIdentifier();
                    }
                    break;
                case 26:
                    _localctx = new CreateViewContext(_localctx);
                    enterOuterAlt(_localctx, 26);
                    {
                        setState(526);
                        match(CREATE);
                        setState(529);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == OR) {
                            {
                                setState(527);
                                match(OR);
                                setState(528);
                                match(REPLACE);
                            }
                        }

                        setState(535);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == GLOBAL || _la == TEMPORARY) {
                            {
                                setState(532);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == GLOBAL) {
                                    {
                                        setState(531);
                                        match(GLOBAL);
                                    }
                                }

                                setState(534);
                                match(TEMPORARY);
                            }
                        }

                        setState(537);
                        match(VIEW);
                        setState(541);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 43, _ctx)) {
                            case 1:
                                {
                                    setState(538);
                                    match(IF);
                                    setState(539);
                                    match(NOT);
                                    setState(540);
                                    match(EXISTS);
                                }
                                break;
                        }
                        setState(543);
                        tableIdentifier();
                        setState(545);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(544);
                                identifierCommentList();
                            }
                        }

                        setState(549);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == COMMENT) {
                            {
                                setState(547);
                                match(COMMENT);
                                setState(548);
                                match(STRING);
                            }
                        }

                        setState(554);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITIONED) {
                            {
                                setState(551);
                                match(PARTITIONED);
                                setState(552);
                                match(ON);
                                setState(553);
                                identifierList();
                            }
                        }

                        setState(558);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == TBLPROPERTIES) {
                            {
                                setState(556);
                                match(TBLPROPERTIES);
                                setState(557);
                                tablePropertyList();
                            }
                        }

                        setState(560);
                        match(AS);
                        setState(561);
                        query();
                    }
                    break;
                case 27:
                    _localctx = new CreateTempViewUsingContext(_localctx);
                    enterOuterAlt(_localctx, 27);
                    {
                        setState(563);
                        match(CREATE);
                        setState(566);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == OR) {
                            {
                                setState(564);
                                match(OR);
                                setState(565);
                                match(REPLACE);
                            }
                        }

                        setState(569);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == GLOBAL) {
                            {
                                setState(568);
                                match(GLOBAL);
                            }
                        }

                        setState(571);
                        match(TEMPORARY);
                        setState(572);
                        match(VIEW);
                        setState(573);
                        tableIdentifier();
                        setState(578);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(574);
                                match(T__0);
                                setState(575);
                                colTypeList();
                                setState(576);
                                match(T__1);
                            }
                        }

                        setState(580);
                        tableProvider();
                        setState(583);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == OPTIONS) {
                            {
                                setState(581);
                                match(OPTIONS);
                                setState(582);
                                tablePropertyList();
                            }
                        }
                    }
                    break;
                case 28:
                    _localctx = new AlterViewQueryContext(_localctx);
                    enterOuterAlt(_localctx, 28);
                    {
                        setState(585);
                        match(ALTER);
                        setState(586);
                        match(VIEW);
                        setState(587);
                        tableIdentifier();
                        setState(589);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == AS) {
                            {
                                setState(588);
                                match(AS);
                            }
                        }

                        setState(591);
                        query();
                    }
                    break;
                case 29:
                    _localctx = new CreateFunctionContext(_localctx);
                    enterOuterAlt(_localctx, 29);
                    {
                        setState(593);
                        match(CREATE);
                        setState(596);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == OR) {
                            {
                                setState(594);
                                match(OR);
                                setState(595);
                                match(REPLACE);
                            }
                        }

                        setState(599);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == TEMPORARY) {
                            {
                                setState(598);
                                match(TEMPORARY);
                            }
                        }

                        setState(601);
                        match(FUNCTION);
                        setState(605);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 55, _ctx)) {
                            case 1:
                                {
                                    setState(602);
                                    match(IF);
                                    setState(603);
                                    match(NOT);
                                    setState(604);
                                    match(EXISTS);
                                }
                                break;
                        }
                        setState(607);
                        qualifiedName();
                        setState(608);
                        match(AS);
                        setState(609);
                        ((CreateFunctionContext) _localctx).className = match(STRING);
                        setState(619);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == USING) {
                            {
                                setState(610);
                                match(USING);
                                setState(611);
                                resource();
                                setState(616);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == T__2) {
                                    {
                                        {
                                            setState(612);
                                            match(T__2);
                                            setState(613);
                                            resource();
                                        }
                                    }
                                    setState(618);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }
                    }
                    break;
                case 30:
                    _localctx = new DropFunctionContext(_localctx);
                    enterOuterAlt(_localctx, 30);
                    {
                        setState(621);
                        match(DROP);
                        setState(623);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == TEMPORARY) {
                            {
                                setState(622);
                                match(TEMPORARY);
                            }
                        }

                        setState(625);
                        match(FUNCTION);
                        setState(628);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 59, _ctx)) {
                            case 1:
                                {
                                    setState(626);
                                    match(IF);
                                    setState(627);
                                    match(EXISTS);
                                }
                                break;
                        }
                        setState(630);
                        qualifiedName();
                    }
                    break;
                case 31:
                    _localctx = new ExplainContext(_localctx);
                    enterOuterAlt(_localctx, 31);
                    {
                        setState(631);
                        match(EXPLAIN);
                        setState(633);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 7L) != 0)
                                || _la == EXTENDED
                                || _la == FORMATTED) {
                            {
                                setState(632);
                                _la = _input.LA(1);
                                if (!(((((_la - 90)) & ~0x3f) == 0
                                                && ((1L << (_la - 90)) & 7L) != 0)
                                        || _la == EXTENDED
                                        || _la == FORMATTED)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                            }
                        }

                        setState(635);
                        statement();
                    }
                    break;
                case 32:
                    _localctx = new ShowTablesContext(_localctx);
                    enterOuterAlt(_localctx, 32);
                    {
                        setState(636);
                        match(SHOW);
                        setState(637);
                        match(TABLES);
                        setState(640);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == FROM || _la == IN) {
                            {
                                setState(638);
                                _la = _input.LA(1);
                                if (!(_la == FROM || _la == IN)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(639);
                                ((ShowTablesContext) _localctx).db = identifier();
                            }
                        }

                        setState(646);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == LIKE || _la == STRING) {
                            {
                                setState(643);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == LIKE) {
                                    {
                                        setState(642);
                                        match(LIKE);
                                    }
                                }

                                setState(645);
                                ((ShowTablesContext) _localctx).pattern = match(STRING);
                            }
                        }
                    }
                    break;
                case 33:
                    _localctx = new ShowTableContext(_localctx);
                    enterOuterAlt(_localctx, 33);
                    {
                        setState(648);
                        match(SHOW);
                        setState(649);
                        match(TABLE);
                        setState(650);
                        match(EXTENDED);
                        setState(653);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == FROM || _la == IN) {
                            {
                                setState(651);
                                _la = _input.LA(1);
                                if (!(_la == FROM || _la == IN)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(652);
                                ((ShowTableContext) _localctx).db = identifier();
                            }
                        }

                        setState(655);
                        match(LIKE);
                        setState(656);
                        ((ShowTableContext) _localctx).pattern = match(STRING);
                        setState(658);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITION) {
                            {
                                setState(657);
                                partitionSpec();
                            }
                        }
                    }
                    break;
                case 34:
                    _localctx = new ShowDatabasesContext(_localctx);
                    enterOuterAlt(_localctx, 34);
                    {
                        setState(660);
                        match(SHOW);
                        setState(661);
                        match(DATABASES);
                        setState(666);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == LIKE || _la == STRING) {
                            {
                                setState(663);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == LIKE) {
                                    {
                                        setState(662);
                                        match(LIKE);
                                    }
                                }

                                setState(665);
                                ((ShowDatabasesContext) _localctx).pattern = match(STRING);
                            }
                        }
                    }
                    break;
                case 35:
                    _localctx = new ShowTblPropertiesContext(_localctx);
                    enterOuterAlt(_localctx, 35);
                    {
                        setState(668);
                        match(SHOW);
                        setState(669);
                        match(TBLPROPERTIES);
                        setState(670);
                        ((ShowTblPropertiesContext) _localctx).table = tableIdentifier();
                        setState(675);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(671);
                                match(T__0);
                                setState(672);
                                ((ShowTblPropertiesContext) _localctx).key = tablePropertyKey();
                                setState(673);
                                match(T__1);
                            }
                        }
                    }
                    break;
                case 36:
                    _localctx = new ShowColumnsContext(_localctx);
                    enterOuterAlt(_localctx, 36);
                    {
                        setState(677);
                        match(SHOW);
                        setState(678);
                        match(COLUMNS);
                        setState(679);
                        _la = _input.LA(1);
                        if (!(_la == FROM || _la == IN)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(680);
                        tableIdentifier();
                        setState(683);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == FROM || _la == IN) {
                            {
                                setState(681);
                                _la = _input.LA(1);
                                if (!(_la == FROM || _la == IN)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(682);
                                ((ShowColumnsContext) _localctx).db = identifier();
                            }
                        }
                    }
                    break;
                case 37:
                    _localctx = new ShowPartitionsContext(_localctx);
                    enterOuterAlt(_localctx, 37);
                    {
                        setState(685);
                        match(SHOW);
                        setState(686);
                        match(PARTITIONS);
                        setState(687);
                        tableIdentifier();
                        setState(689);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITION) {
                            {
                                setState(688);
                                partitionSpec();
                            }
                        }
                    }
                    break;
                case 38:
                    _localctx = new ShowFunctionsContext(_localctx);
                    enterOuterAlt(_localctx, 38);
                    {
                        setState(691);
                        match(SHOW);
                        setState(693);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 71, _ctx)) {
                            case 1:
                                {
                                    setState(692);
                                    identifier();
                                }
                                break;
                        }
                        setState(695);
                        match(FUNCTIONS);
                        setState(703);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2048L) != 0)
                                || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0)
                                || ((((_la - 128)) & ~0x3f) == 0
                                        && ((1L << (_la - 128)) & -2149548029L) != 0)
                                || ((((_la - 192)) & ~0x3f) == 0
                                        && ((1L << (_la - 192)) & 216735732067205119L) != 0)) {
                            {
                                setState(697);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 72, _ctx)) {
                                    case 1:
                                        {
                                            setState(696);
                                            match(LIKE);
                                        }
                                        break;
                                }
                                setState(701);
                                _errHandler.sync(this);
                                switch (_input.LA(1)) {
                                    case SELECT:
                                    case FROM:
                                    case ADD:
                                    case AS:
                                    case ALL:
                                    case ANY:
                                    case DISTINCT:
                                    case WHERE:
                                    case GROUP:
                                    case BY:
                                    case GROUPING:
                                    case SETS:
                                    case CUBE:
                                    case ROLLUP:
                                    case ORDER:
                                    case HAVING:
                                    case LIMIT:
                                    case AT:
                                    case OR:
                                    case AND:
                                    case IN:
                                    case NOT:
                                    case NO:
                                    case EXISTS:
                                    case BETWEEN:
                                    case LIKE:
                                    case RLIKE:
                                    case IS:
                                    case NULL:
                                    case TRUE:
                                    case FALSE:
                                    case NULLS:
                                    case ASC:
                                    case DESC:
                                    case FOR:
                                    case INTERVAL:
                                    case CASE:
                                    case WHEN:
                                    case THEN:
                                    case ELSE:
                                    case END:
                                    case JOIN:
                                    case CROSS:
                                    case OUTER:
                                    case INNER:
                                    case LEFT:
                                    case SEMI:
                                    case RIGHT:
                                    case FULL:
                                    case NATURAL:
                                    case ON:
                                    case PIVOT:
                                    case LATERAL:
                                    case WINDOW:
                                    case OVER:
                                    case PARTITION:
                                    case RANGE:
                                    case ROWS:
                                    case UNBOUNDED:
                                    case PRECEDING:
                                    case FOLLOWING:
                                    case CURRENT:
                                    case FIRST:
                                    case AFTER:
                                    case LAST:
                                    case ROW:
                                    case WITH:
                                    case VALUES:
                                    case CREATE:
                                    case TABLE:
                                    case DIRECTORY:
                                    case VIEW:
                                    case REPLACE:
                                    case INSERT:
                                    case DELETE:
                                    case INTO:
                                    case DESCRIBE:
                                    case EXPLAIN:
                                    case FORMAT:
                                    case LOGICAL:
                                    case CODEGEN:
                                    case COST:
                                    case CAST:
                                    case SHOW:
                                    case TABLES:
                                    case COLUMNS:
                                    case COLUMN:
                                    case USE:
                                    case PARTITIONS:
                                    case FUNCTIONS:
                                    case DROP:
                                    case UNION:
                                    case EXCEPT:
                                    case SETMINUS:
                                    case INTERSECT:
                                    case TO:
                                    case TABLESAMPLE:
                                    case STRATIFY:
                                    case ALTER:
                                    case RENAME:
                                    case ARRAY:
                                    case MAP:
                                    case STRUCT:
                                    case COMMENT:
                                    case SET:
                                    case RESET:
                                    case DATA:
                                    case START:
                                    case TRANSACTION:
                                    case COMMIT:
                                    case ROLLBACK:
                                    case MACRO:
                                    case IGNORE:
                                    case BOTH:
                                    case LEADING:
                                    case TRAILING:
                                    case IF:
                                    case POSITION:
                                    case EXTRACT:
                                    case DIV:
                                    case PERCENTLIT:
                                    case BUCKET:
                                    case OUT:
                                    case OF:
                                    case SORT:
                                    case CLUSTER:
                                    case DISTRIBUTE:
                                    case OVERWRITE:
                                    case TRANSFORM:
                                    case REDUCE:
                                    case SERDE:
                                    case SERDEPROPERTIES:
                                    case RECORDREADER:
                                    case RECORDWRITER:
                                    case DELIMITED:
                                    case FIELDS:
                                    case TERMINATED:
                                    case COLLECTION:
                                    case ITEMS:
                                    case KEYS:
                                    case ESCAPED:
                                    case LINES:
                                    case SEPARATED:
                                    case FUNCTION:
                                    case EXTENDED:
                                    case REFRESH:
                                    case CLEAR:
                                    case CACHE:
                                    case UNCACHE:
                                    case LAZY:
                                    case FORMATTED:
                                    case GLOBAL:
                                    case TEMPORARY:
                                    case OPTIONS:
                                    case UNSET:
                                    case TBLPROPERTIES:
                                    case DBPROPERTIES:
                                    case BUCKETS:
                                    case SKEWED:
                                    case STORED:
                                    case DIRECTORIES:
                                    case LOCATION:
                                    case EXCHANGE:
                                    case ARCHIVE:
                                    case UNARCHIVE:
                                    case FILEFORMAT:
                                    case TOUCH:
                                    case COMPACT:
                                    case CONCATENATE:
                                    case CHANGE:
                                    case CASCADE:
                                    case RESTRICT:
                                    case CLUSTERED:
                                    case SORTED:
                                    case PURGE:
                                    case INPUTFORMAT:
                                    case OUTPUTFORMAT:
                                    case DATABASE:
                                    case DATABASES:
                                    case DFS:
                                    case TRUNCATE:
                                    case ANALYZE:
                                    case COMPUTE:
                                    case LIST:
                                    case STATISTICS:
                                    case PARTITIONED:
                                    case EXTERNAL:
                                    case DEFINED:
                                    case REVOKE:
                                    case GRANT:
                                    case LOCK:
                                    case UNLOCK:
                                    case MSCK:
                                    case REPAIR:
                                    case RECOVER:
                                    case EXPORT:
                                    case IMPORT:
                                    case LOAD:
                                    case ROLE:
                                    case ROLES:
                                    case COMPACTIONS:
                                    case PRINCIPALS:
                                    case TRANSACTIONS:
                                    case INDEX:
                                    case INDEXES:
                                    case LOCKS:
                                    case OPTION:
                                    case ANTI:
                                    case LOCAL:
                                    case INPATH:
                                    case IDENTIFIER:
                                    case BACKQUOTED_IDENTIFIER:
                                        {
                                            setState(699);
                                            qualifiedName();
                                        }
                                        break;
                                    case STRING:
                                        {
                                            setState(700);
                                            ((ShowFunctionsContext) _localctx).pattern =
                                                    match(STRING);
                                        }
                                        break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                            }
                        }
                    }
                    break;
                case 39:
                    _localctx = new ShowCreateTableContext(_localctx);
                    enterOuterAlt(_localctx, 39);
                    {
                        setState(705);
                        match(SHOW);
                        setState(706);
                        match(CREATE);
                        setState(707);
                        match(TABLE);
                        setState(708);
                        tableIdentifier();
                    }
                    break;
                case 40:
                    _localctx = new DescribeFunctionContext(_localctx);
                    enterOuterAlt(_localctx, 40);
                    {
                        setState(709);
                        _la = _input.LA(1);
                        if (!(_la == DESC || _la == DESCRIBE)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(710);
                        match(FUNCTION);
                        setState(712);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 75, _ctx)) {
                            case 1:
                                {
                                    setState(711);
                                    match(EXTENDED);
                                }
                                break;
                        }
                        setState(714);
                        describeFuncName();
                    }
                    break;
                case 41:
                    _localctx = new DescribeDatabaseContext(_localctx);
                    enterOuterAlt(_localctx, 41);
                    {
                        setState(715);
                        _la = _input.LA(1);
                        if (!(_la == DESC || _la == DESCRIBE)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(716);
                        match(DATABASE);
                        setState(718);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 76, _ctx)) {
                            case 1:
                                {
                                    setState(717);
                                    match(EXTENDED);
                                }
                                break;
                        }
                        setState(720);
                        identifier();
                    }
                    break;
                case 42:
                    _localctx = new DescribeTableContext(_localctx);
                    enterOuterAlt(_localctx, 42);
                    {
                        setState(721);
                        _la = _input.LA(1);
                        if (!(_la == DESC || _la == DESCRIBE)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(723);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 77, _ctx)) {
                            case 1:
                                {
                                    setState(722);
                                    match(TABLE);
                                }
                                break;
                        }
                        setState(726);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 78, _ctx)) {
                            case 1:
                                {
                                    setState(725);
                                    ((DescribeTableContext) _localctx).option = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == EXTENDED || _la == FORMATTED)) {
                                        ((DescribeTableContext) _localctx).option =
                                                (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                }
                                break;
                        }
                        setState(728);
                        tableIdentifier();
                        setState(730);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 79, _ctx)) {
                            case 1:
                                {
                                    setState(729);
                                    partitionSpec();
                                }
                                break;
                        }
                        setState(733);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2048L) != 0)
                                || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0)
                                || ((((_la - 128)) & ~0x3f) == 0
                                        && ((1L << (_la - 128)) & -2149548029L) != 0)
                                || ((((_la - 192)) & ~0x3f) == 0
                                        && ((1L << (_la - 192)) & 216454257090494463L) != 0)) {
                            {
                                setState(732);
                                describeColName();
                            }
                        }
                    }
                    break;
                case 43:
                    _localctx = new RefreshTableContext(_localctx);
                    enterOuterAlt(_localctx, 43);
                    {
                        setState(735);
                        match(REFRESH);
                        setState(736);
                        match(TABLE);
                        setState(737);
                        tableIdentifier();
                    }
                    break;
                case 44:
                    _localctx = new RefreshResourceContext(_localctx);
                    enterOuterAlt(_localctx, 44);
                    {
                        setState(738);
                        match(REFRESH);
                        setState(746);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 82, _ctx)) {
                            case 1:
                                {
                                    setState(739);
                                    match(STRING);
                                }
                                break;
                            case 2:
                                {
                                    setState(743);
                                    _errHandler.sync(this);
                                    _alt = getInterpreter().adaptivePredict(_input, 81, _ctx);
                                    while (_alt != 1
                                            && _alt
                                                    != org.antlr
                                                            .v4
                                                            .runtime
                                                            .atn
                                                            .ATN
                                                            .INVALID_ALT_NUMBER) {
                                        if (_alt == 1 + 1) {
                                            {
                                                {
                                                    setState(740);
                                                    matchWildcard();
                                                }
                                            }
                                        }
                                        setState(745);
                                        _errHandler.sync(this);
                                        _alt = getInterpreter().adaptivePredict(_input, 81, _ctx);
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 45:
                    _localctx = new CacheTableContext(_localctx);
                    enterOuterAlt(_localctx, 45);
                    {
                        setState(748);
                        match(CACHE);
                        setState(750);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == LAZY) {
                            {
                                setState(749);
                                match(LAZY);
                            }
                        }

                        setState(752);
                        match(TABLE);
                        setState(753);
                        tableIdentifier();
                        setState(758);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22530L) != 0)
                                || ((((_la - 77)) & ~0x3f) == 0
                                        && ((1L << (_la - 77)) & 34359738507L) != 0)
                                || _la == REDUCE) {
                            {
                                setState(755);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == AS) {
                                    {
                                        setState(754);
                                        match(AS);
                                    }
                                }

                                setState(757);
                                query();
                            }
                        }
                    }
                    break;
                case 46:
                    _localctx = new UncacheTableContext(_localctx);
                    enterOuterAlt(_localctx, 46);
                    {
                        setState(760);
                        match(UNCACHE);
                        setState(761);
                        match(TABLE);
                        setState(764);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 86, _ctx)) {
                            case 1:
                                {
                                    setState(762);
                                    match(IF);
                                    setState(763);
                                    match(EXISTS);
                                }
                                break;
                        }
                        setState(766);
                        tableIdentifier();
                    }
                    break;
                case 47:
                    _localctx = new ClearCacheContext(_localctx);
                    enterOuterAlt(_localctx, 47);
                    {
                        setState(767);
                        match(CLEAR);
                        setState(768);
                        match(CACHE);
                    }
                    break;
                case 48:
                    _localctx = new LoadDataContext(_localctx);
                    enterOuterAlt(_localctx, 48);
                    {
                        setState(769);
                        match(LOAD);
                        setState(770);
                        match(DATA);
                        setState(772);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == LOCAL) {
                            {
                                setState(771);
                                match(LOCAL);
                            }
                        }

                        setState(774);
                        match(INPATH);
                        setState(775);
                        ((LoadDataContext) _localctx).path = match(STRING);
                        setState(777);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == OVERWRITE) {
                            {
                                setState(776);
                                match(OVERWRITE);
                            }
                        }

                        setState(779);
                        match(INTO);
                        setState(780);
                        match(TABLE);
                        setState(781);
                        tableIdentifier();
                        setState(783);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITION) {
                            {
                                setState(782);
                                partitionSpec();
                            }
                        }
                    }
                    break;
                case 49:
                    _localctx = new TruncateTableContext(_localctx);
                    enterOuterAlt(_localctx, 49);
                    {
                        setState(785);
                        match(TRUNCATE);
                        setState(786);
                        match(TABLE);
                        setState(787);
                        tableIdentifier();
                        setState(789);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITION) {
                            {
                                setState(788);
                                partitionSpec();
                            }
                        }
                    }
                    break;
                case 50:
                    _localctx = new RepairTableContext(_localctx);
                    enterOuterAlt(_localctx, 50);
                    {
                        setState(791);
                        match(MSCK);
                        setState(792);
                        match(REPAIR);
                        setState(793);
                        match(TABLE);
                        setState(794);
                        tableIdentifier();
                    }
                    break;
                case 51:
                    _localctx = new ManageResourceContext(_localctx);
                    enterOuterAlt(_localctx, 51);
                    {
                        setState(795);
                        ((ManageResourceContext) _localctx).op = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == ADD || _la == LIST)) {
                            ((ManageResourceContext) _localctx).op =
                                    (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(796);
                        identifier();
                        setState(800);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 91, _ctx);
                        while (_alt != 1
                                && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1 + 1) {
                                {
                                    {
                                        setState(797);
                                        matchWildcard();
                                    }
                                }
                            }
                            setState(802);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 91, _ctx);
                        }
                    }
                    break;
                case 52:
                    _localctx = new FailNativeCommandContext(_localctx);
                    enterOuterAlt(_localctx, 52);
                    {
                        setState(803);
                        match(SET);
                        setState(804);
                        match(ROLE);
                        setState(808);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 92, _ctx);
                        while (_alt != 1
                                && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1 + 1) {
                                {
                                    {
                                        setState(805);
                                        matchWildcard();
                                    }
                                }
                            }
                            setState(810);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 92, _ctx);
                        }
                    }
                    break;
                case 53:
                    _localctx = new SetConfigurationContext(_localctx);
                    enterOuterAlt(_localctx, 53);
                    {
                        setState(811);
                        match(SET);
                        setState(815);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 93, _ctx);
                        while (_alt != 1
                                && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1 + 1) {
                                {
                                    {
                                        setState(812);
                                        matchWildcard();
                                    }
                                }
                            }
                            setState(817);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 93, _ctx);
                        }
                    }
                    break;
                case 54:
                    _localctx = new ResetConfigurationContext(_localctx);
                    enterOuterAlt(_localctx, 54);
                    {
                        setState(818);
                        match(RESET);
                    }
                    break;
                case 55:
                    _localctx = new FailNativeCommandContext(_localctx);
                    enterOuterAlt(_localctx, 55);
                    {
                        setState(819);
                        unsupportedHiveNativeCommands();
                        setState(823);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 94, _ctx);
                        while (_alt != 1
                                && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1 + 1) {
                                {
                                    {
                                        setState(820);
                                        matchWildcard();
                                    }
                                }
                            }
                            setState(825);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 94, _ctx);
                        }
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
        public Token kw1;
        public Token kw2;
        public Token kw3;
        public Token kw4;
        public Token kw5;
        public Token kw6;

        public TerminalNode CREATE() {
            return getToken(SqlBaseParser.CREATE, 0);
        }

        public TerminalNode ROLE() {
            return getToken(SqlBaseParser.ROLE, 0);
        }

        public TerminalNode DROP() {
            return getToken(SqlBaseParser.DROP, 0);
        }

        public TerminalNode GRANT() {
            return getToken(SqlBaseParser.GRANT, 0);
        }

        public TerminalNode REVOKE() {
            return getToken(SqlBaseParser.REVOKE, 0);
        }

        public TerminalNode SHOW() {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode PRINCIPALS() {
            return getToken(SqlBaseParser.PRINCIPALS, 0);
        }

        public TerminalNode ROLES() {
            return getToken(SqlBaseParser.ROLES, 0);
        }

        public TerminalNode CURRENT() {
            return getToken(SqlBaseParser.CURRENT, 0);
        }

        public TerminalNode EXPORT() {
            return getToken(SqlBaseParser.EXPORT, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TerminalNode IMPORT() {
            return getToken(SqlBaseParser.IMPORT, 0);
        }

        public TerminalNode COMPACTIONS() {
            return getToken(SqlBaseParser.COMPACTIONS, 0);
        }

        public TerminalNode TRANSACTIONS() {
            return getToken(SqlBaseParser.TRANSACTIONS, 0);
        }

        public TerminalNode INDEXES() {
            return getToken(SqlBaseParser.INDEXES, 0);
        }

        public TerminalNode LOCKS() {
            return getToken(SqlBaseParser.LOCKS, 0);
        }

        public TerminalNode INDEX() {
            return getToken(SqlBaseParser.INDEX, 0);
        }

        public TerminalNode ALTER() {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode LOCK() {
            return getToken(SqlBaseParser.LOCK, 0);
        }

        public TerminalNode DATABASE() {
            return getToken(SqlBaseParser.DATABASE, 0);
        }

        public TerminalNode UNLOCK() {
            return getToken(SqlBaseParser.UNLOCK, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(SqlBaseParser.TEMPORARY, 0);
        }

        public TerminalNode MACRO() {
            return getToken(SqlBaseParser.MACRO, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode NOT() {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public TerminalNode CLUSTERED() {
            return getToken(SqlBaseParser.CLUSTERED, 0);
        }

        public TerminalNode BY() {
            return getToken(SqlBaseParser.BY, 0);
        }

        public TerminalNode SORTED() {
            return getToken(SqlBaseParser.SORTED, 0);
        }

        public TerminalNode SKEWED() {
            return getToken(SqlBaseParser.SKEWED, 0);
        }

        public TerminalNode STORED() {
            return getToken(SqlBaseParser.STORED, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public TerminalNode DIRECTORIES() {
            return getToken(SqlBaseParser.DIRECTORIES, 0);
        }

        public TerminalNode SET() {
            return getToken(SqlBaseParser.SET, 0);
        }

        public TerminalNode LOCATION() {
            return getToken(SqlBaseParser.LOCATION, 0);
        }

        public TerminalNode EXCHANGE() {
            return getToken(SqlBaseParser.EXCHANGE, 0);
        }

        public TerminalNode PARTITION() {
            return getToken(SqlBaseParser.PARTITION, 0);
        }

        public TerminalNode ARCHIVE() {
            return getToken(SqlBaseParser.ARCHIVE, 0);
        }

        public TerminalNode UNARCHIVE() {
            return getToken(SqlBaseParser.UNARCHIVE, 0);
        }

        public TerminalNode TOUCH() {
            return getToken(SqlBaseParser.TOUCH, 0);
        }

        public TerminalNode COMPACT() {
            return getToken(SqlBaseParser.COMPACT, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public TerminalNode CONCATENATE() {
            return getToken(SqlBaseParser.CONCATENATE, 0);
        }

        public TerminalNode FILEFORMAT() {
            return getToken(SqlBaseParser.FILEFORMAT, 0);
        }

        public TerminalNode REPLACE() {
            return getToken(SqlBaseParser.REPLACE, 0);
        }

        public TerminalNode COLUMNS() {
            return getToken(SqlBaseParser.COLUMNS, 0);
        }

        public TerminalNode START() {
            return getToken(SqlBaseParser.START, 0);
        }

        public TerminalNode TRANSACTION() {
            return getToken(SqlBaseParser.TRANSACTION, 0);
        }

        public TerminalNode COMMIT() {
            return getToken(SqlBaseParser.COMMIT, 0);
        }

        public TerminalNode ROLLBACK() {
            return getToken(SqlBaseParser.ROLLBACK, 0);
        }

        public TerminalNode DFS() {
            return getToken(SqlBaseParser.DFS, 0);
        }

        public TerminalNode DELETE() {
            return getToken(SqlBaseParser.DELETE, 0);
        }

        public TerminalNode FROM() {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_unsupportedHiveNativeCommands;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterUnsupportedHiveNativeCommands(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitUnsupportedHiveNativeCommands(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor)
                        .visitUnsupportedHiveNativeCommands(this);
            else return visitor.visitChildren(this);
        }
    }

    public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands()
            throws RecognitionException {
        UnsupportedHiveNativeCommandsContext _localctx =
                new UnsupportedHiveNativeCommandsContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_unsupportedHiveNativeCommands);
        int _la;
        try {
            setState(998);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 103, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(828);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(CREATE);
                        setState(829);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(ROLE);
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(830);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(DROP);
                        setState(831);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(ROLE);
                    }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(832);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(GRANT);
                        setState(834);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 96, _ctx)) {
                            case 1:
                                {
                                    setState(833);
                                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 =
                                            match(ROLE);
                                }
                                break;
                        }
                    }
                    break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(836);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(REVOKE);
                        setState(838);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 97, _ctx)) {
                            case 1:
                                {
                                    setState(837);
                                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 =
                                            match(ROLE);
                                }
                                break;
                        }
                    }
                    break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                    {
                        setState(840);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                        setState(841);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(GRANT);
                    }
                    break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                    {
                        setState(842);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                        setState(843);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(ROLE);
                        setState(845);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 98, _ctx)) {
                            case 1:
                                {
                                    setState(844);
                                    ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 =
                                            match(GRANT);
                                }
                                break;
                        }
                    }
                    break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                    {
                        setState(847);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                        setState(848);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(PRINCIPALS);
                    }
                    break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                    {
                        setState(849);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                        setState(850);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(ROLES);
                    }
                    break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                    {
                        setState(851);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                        setState(852);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(CURRENT);
                        setState(853);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(ROLES);
                    }
                    break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                    {
                        setState(854);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(EXPORT);
                        setState(855);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    }
                    break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                    {
                        setState(856);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(IMPORT);
                        setState(857);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    }
                    break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                    {
                        setState(858);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                        setState(859);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(COMPACTIONS);
                    }
                    break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                    {
                        setState(860);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                        setState(861);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(CREATE);
                        setState(862);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(TABLE);
                    }
                    break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                    {
                        setState(863);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                        setState(864);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 =
                                match(TRANSACTIONS);
                    }
                    break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                    {
                        setState(865);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                        setState(866);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(INDEXES);
                    }
                    break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                    {
                        setState(867);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(SHOW);
                        setState(868);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(LOCKS);
                    }
                    break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                    {
                        setState(869);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(CREATE);
                        setState(870);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(INDEX);
                    }
                    break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                    {
                        setState(871);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(DROP);
                        setState(872);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(INDEX);
                    }
                    break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                    {
                        setState(873);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(874);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(INDEX);
                    }
                    break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                    {
                        setState(875);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(LOCK);
                        setState(876);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    }
                    break;
                case 21:
                    enterOuterAlt(_localctx, 21);
                    {
                        setState(877);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(LOCK);
                        setState(878);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(DATABASE);
                    }
                    break;
                case 22:
                    enterOuterAlt(_localctx, 22);
                    {
                        setState(879);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(UNLOCK);
                        setState(880);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                    }
                    break;
                case 23:
                    enterOuterAlt(_localctx, 23);
                    {
                        setState(881);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(UNLOCK);
                        setState(882);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(DATABASE);
                    }
                    break;
                case 24:
                    enterOuterAlt(_localctx, 24);
                    {
                        setState(883);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(CREATE);
                        setState(884);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TEMPORARY);
                        setState(885);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(MACRO);
                    }
                    break;
                case 25:
                    enterOuterAlt(_localctx, 25);
                    {
                        setState(886);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(DROP);
                        setState(887);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TEMPORARY);
                        setState(888);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(MACRO);
                    }
                    break;
                case 26:
                    enterOuterAlt(_localctx, 26);
                    {
                        setState(889);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(890);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                        setState(891);
                        tableIdentifier();
                        setState(892);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(NOT);
                        setState(893);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(CLUSTERED);
                    }
                    break;
                case 27:
                    enterOuterAlt(_localctx, 27);
                    {
                        setState(895);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(896);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                        setState(897);
                        tableIdentifier();
                        setState(898);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(CLUSTERED);
                        setState(899);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(BY);
                    }
                    break;
                case 28:
                    enterOuterAlt(_localctx, 28);
                    {
                        setState(901);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(902);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                        setState(903);
                        tableIdentifier();
                        setState(904);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(NOT);
                        setState(905);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(SORTED);
                    }
                    break;
                case 29:
                    enterOuterAlt(_localctx, 29);
                    {
                        setState(907);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(908);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                        setState(909);
                        tableIdentifier();
                        setState(910);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(SKEWED);
                        setState(911);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(BY);
                    }
                    break;
                case 30:
                    enterOuterAlt(_localctx, 30);
                    {
                        setState(913);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(914);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                        setState(915);
                        tableIdentifier();
                        setState(916);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(NOT);
                        setState(917);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(SKEWED);
                    }
                    break;
                case 31:
                    enterOuterAlt(_localctx, 31);
                    {
                        setState(919);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(920);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                        setState(921);
                        tableIdentifier();
                        setState(922);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(NOT);
                        setState(923);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(STORED);
                        setState(924);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw5 = match(AS);
                        setState(925);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw6 = match(DIRECTORIES);
                    }
                    break;
                case 32:
                    enterOuterAlt(_localctx, 32);
                    {
                        setState(927);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(928);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                        setState(929);
                        tableIdentifier();
                        setState(930);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(SET);
                        setState(931);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(SKEWED);
                        setState(932);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw5 = match(LOCATION);
                    }
                    break;
                case 33:
                    enterOuterAlt(_localctx, 33);
                    {
                        setState(934);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(935);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                        setState(936);
                        tableIdentifier();
                        setState(937);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(EXCHANGE);
                        setState(938);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(PARTITION);
                    }
                    break;
                case 34:
                    enterOuterAlt(_localctx, 34);
                    {
                        setState(940);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(941);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                        setState(942);
                        tableIdentifier();
                        setState(943);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(ARCHIVE);
                        setState(944);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(PARTITION);
                    }
                    break;
                case 35:
                    enterOuterAlt(_localctx, 35);
                    {
                        setState(946);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(947);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                        setState(948);
                        tableIdentifier();
                        setState(949);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(UNARCHIVE);
                        setState(950);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(PARTITION);
                    }
                    break;
                case 36:
                    enterOuterAlt(_localctx, 36);
                    {
                        setState(952);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(953);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                        setState(954);
                        tableIdentifier();
                        setState(955);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(TOUCH);
                    }
                    break;
                case 37:
                    enterOuterAlt(_localctx, 37);
                    {
                        setState(957);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(958);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                        setState(959);
                        tableIdentifier();
                        setState(961);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITION) {
                            {
                                setState(960);
                                partitionSpec();
                            }
                        }

                        setState(963);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(COMPACT);
                    }
                    break;
                case 38:
                    enterOuterAlt(_localctx, 38);
                    {
                        setState(965);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(966);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                        setState(967);
                        tableIdentifier();
                        setState(969);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITION) {
                            {
                                setState(968);
                                partitionSpec();
                            }
                        }

                        setState(971);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(CONCATENATE);
                    }
                    break;
                case 39:
                    enterOuterAlt(_localctx, 39);
                    {
                        setState(973);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(974);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                        setState(975);
                        tableIdentifier();
                        setState(977);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITION) {
                            {
                                setState(976);
                                partitionSpec();
                            }
                        }

                        setState(979);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(SET);
                        setState(980);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(FILEFORMAT);
                    }
                    break;
                case 40:
                    enterOuterAlt(_localctx, 40);
                    {
                        setState(982);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ALTER);
                        setState(983);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TABLE);
                        setState(984);
                        tableIdentifier();
                        setState(986);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITION) {
                            {
                                setState(985);
                                partitionSpec();
                            }
                        }

                        setState(988);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw3 = match(REPLACE);
                        setState(989);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw4 = match(COLUMNS);
                    }
                    break;
                case 41:
                    enterOuterAlt(_localctx, 41);
                    {
                        setState(991);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(START);
                        setState(992);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(TRANSACTION);
                    }
                    break;
                case 42:
                    enterOuterAlt(_localctx, 42);
                    {
                        setState(993);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(COMMIT);
                    }
                    break;
                case 43:
                    enterOuterAlt(_localctx, 43);
                    {
                        setState(994);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(ROLLBACK);
                    }
                    break;
                case 44:
                    enterOuterAlt(_localctx, 44);
                    {
                        setState(995);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(DFS);
                    }
                    break;
                case 45:
                    enterOuterAlt(_localctx, 45);
                    {
                        setState(996);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw1 = match(DELETE);
                        setState(997);
                        ((UnsupportedHiveNativeCommandsContext) _localctx).kw2 = match(FROM);
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CreateTableHeaderContext extends ParserRuleContext {
        public TerminalNode CREATE() {
            return getToken(SqlBaseParser.CREATE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(SqlBaseParser.TEMPORARY, 0);
        }

        public TerminalNode EXTERNAL() {
            return getToken(SqlBaseParser.EXTERNAL, 0);
        }

        public TerminalNode IF() {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_createTableHeader;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCreateTableHeader(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCreateTableHeader(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCreateTableHeader(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
        CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_createTableHeader);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1000);
                match(CREATE);
                setState(1002);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == TEMPORARY) {
                    {
                        setState(1001);
                        match(TEMPORARY);
                    }
                }

                setState(1005);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EXTERNAL) {
                    {
                        setState(1004);
                        match(EXTERNAL);
                    }
                }

                setState(1007);
                match(TABLE);
                setState(1011);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 106, _ctx)) {
                    case 1:
                        {
                            setState(1008);
                            match(IF);
                            setState(1009);
                            match(NOT);
                            setState(1010);
                            match(EXISTS);
                        }
                        break;
                }
                setState(1013);
                tableIdentifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BucketSpecContext extends ParserRuleContext {
        public TerminalNode CLUSTERED() {
            return getToken(SqlBaseParser.CLUSTERED, 0);
        }

        public List<TerminalNode> BY() {
            return getTokens(SqlBaseParser.BY);
        }

        public TerminalNode BY(int i) {
            return getToken(SqlBaseParser.BY, i);
        }

        public IdentifierListContext identifierList() {
            return getRuleContext(IdentifierListContext.class, 0);
        }

        public TerminalNode INTO() {
            return getToken(SqlBaseParser.INTO, 0);
        }

        public TerminalNode INTEGER_VALUE() {
            return getToken(SqlBaseParser.INTEGER_VALUE, 0);
        }

        public TerminalNode BUCKETS() {
            return getToken(SqlBaseParser.BUCKETS, 0);
        }

        public TerminalNode SORTED() {
            return getToken(SqlBaseParser.SORTED, 0);
        }

        public OrderedIdentifierListContext orderedIdentifierList() {
            return getRuleContext(OrderedIdentifierListContext.class, 0);
        }

        public BucketSpecContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bucketSpec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterBucketSpec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitBucketSpec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitBucketSpec(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BucketSpecContext bucketSpec() throws RecognitionException {
        BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_bucketSpec);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1015);
                match(CLUSTERED);
                setState(1016);
                match(BY);
                setState(1017);
                identifierList();
                setState(1021);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == SORTED) {
                    {
                        setState(1018);
                        match(SORTED);
                        setState(1019);
                        match(BY);
                        setState(1020);
                        orderedIdentifierList();
                    }
                }

                setState(1023);
                match(INTO);
                setState(1024);
                match(INTEGER_VALUE);
                setState(1025);
                match(BUCKETS);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SkewSpecContext extends ParserRuleContext {
        public TerminalNode SKEWED() {
            return getToken(SqlBaseParser.SKEWED, 0);
        }

        public TerminalNode BY() {
            return getToken(SqlBaseParser.BY, 0);
        }

        public IdentifierListContext identifierList() {
            return getRuleContext(IdentifierListContext.class, 0);
        }

        public TerminalNode ON() {
            return getToken(SqlBaseParser.ON, 0);
        }

        public ConstantListContext constantList() {
            return getRuleContext(ConstantListContext.class, 0);
        }

        public NestedConstantListContext nestedConstantList() {
            return getRuleContext(NestedConstantListContext.class, 0);
        }

        public TerminalNode STORED() {
            return getToken(SqlBaseParser.STORED, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public TerminalNode DIRECTORIES() {
            return getToken(SqlBaseParser.DIRECTORIES, 0);
        }

        public SkewSpecContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_skewSpec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSkewSpec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSkewSpec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSkewSpec(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SkewSpecContext skewSpec() throws RecognitionException {
        SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_skewSpec);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1027);
                match(SKEWED);
                setState(1028);
                match(BY);
                setState(1029);
                identifierList();
                setState(1030);
                match(ON);
                setState(1033);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 108, _ctx)) {
                    case 1:
                        {
                            setState(1031);
                            constantList();
                        }
                        break;
                    case 2:
                        {
                            setState(1032);
                            nestedConstantList();
                        }
                        break;
                }
                setState(1038);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 109, _ctx)) {
                    case 1:
                        {
                            setState(1035);
                            match(STORED);
                            setState(1036);
                            match(AS);
                            setState(1037);
                            match(DIRECTORIES);
                        }
                        break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LocationSpecContext extends ParserRuleContext {
        public TerminalNode LOCATION() {
            return getToken(SqlBaseParser.LOCATION, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public LocationSpecContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_locationSpec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterLocationSpec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitLocationSpec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitLocationSpec(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LocationSpecContext locationSpec() throws RecognitionException {
        LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_locationSpec);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1040);
                match(LOCATION);
                setState(1041);
                match(STRING);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QueryContext extends ParserRuleContext {
        public QueryNoWithContext queryNoWith() {
            return getRuleContext(QueryNoWithContext.class, 0);
        }

        public CtesContext ctes() {
            return getRuleContext(CtesContext.class, 0);
        }

        public QueryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_query;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).enterQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitQuery(this);
            else return visitor.visitChildren(this);
        }
    }

    public final QueryContext query() throws RecognitionException {
        QueryContext _localctx = new QueryContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_query);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1044);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WITH) {
                    {
                        setState(1043);
                        ctes();
                    }
                }

                setState(1046);
                queryNoWith();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class InsertIntoContext extends ParserRuleContext {
        public InsertIntoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_insertInto;
        }

        public InsertIntoContext() {}

        public void copyFrom(InsertIntoContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
        public Token path;

        public TerminalNode INSERT() {
            return getToken(SqlBaseParser.INSERT, 0);
        }

        public TerminalNode OVERWRITE() {
            return getToken(SqlBaseParser.OVERWRITE, 0);
        }

        public TerminalNode DIRECTORY() {
            return getToken(SqlBaseParser.DIRECTORY, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public TerminalNode LOCAL() {
            return getToken(SqlBaseParser.LOCAL, 0);
        }

        public RowFormatContext rowFormat() {
            return getRuleContext(RowFormatContext.class, 0);
        }

        public CreateFileFormatContext createFileFormat() {
            return getRuleContext(CreateFileFormatContext.class, 0);
        }

        public InsertOverwriteHiveDirContext(InsertIntoContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterInsertOverwriteHiveDir(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitInsertOverwriteHiveDir(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitInsertOverwriteHiveDir(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class InsertOverwriteDirContext extends InsertIntoContext {
        public Token path;
        public TablePropertyListContext options;

        public TerminalNode INSERT() {
            return getToken(SqlBaseParser.INSERT, 0);
        }

        public TerminalNode OVERWRITE() {
            return getToken(SqlBaseParser.OVERWRITE, 0);
        }

        public TerminalNode DIRECTORY() {
            return getToken(SqlBaseParser.DIRECTORY, 0);
        }

        public TableProviderContext tableProvider() {
            return getRuleContext(TableProviderContext.class, 0);
        }

        public TerminalNode LOCAL() {
            return getToken(SqlBaseParser.LOCAL, 0);
        }

        public TerminalNode OPTIONS() {
            return getToken(SqlBaseParser.OPTIONS, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        public InsertOverwriteDirContext(InsertIntoContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterInsertOverwriteDir(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitInsertOverwriteDir(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitInsertOverwriteDir(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class InsertOverwriteTableContext extends InsertIntoContext {
        public TerminalNode INSERT() {
            return getToken(SqlBaseParser.INSERT, 0);
        }

        public TerminalNode OVERWRITE() {
            return getToken(SqlBaseParser.OVERWRITE, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode NOT() {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public InsertOverwriteTableContext(InsertIntoContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterInsertOverwriteTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitInsertOverwriteTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitInsertOverwriteTable(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class InsertIntoTableContext extends InsertIntoContext {
        public TerminalNode INSERT() {
            return getToken(SqlBaseParser.INSERT, 0);
        }

        public TerminalNode INTO() {
            return getToken(SqlBaseParser.INTO, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public InsertIntoTableContext(InsertIntoContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterInsertIntoTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitInsertIntoTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitInsertIntoTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public final InsertIntoContext insertInto() throws RecognitionException {
        InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_insertInto);
        int _la;
        try {
            setState(1096);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 121, _ctx)) {
                case 1:
                    _localctx = new InsertOverwriteTableContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1048);
                        match(INSERT);
                        setState(1049);
                        match(OVERWRITE);
                        setState(1050);
                        match(TABLE);
                        setState(1051);
                        tableIdentifier();
                        setState(1058);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITION) {
                            {
                                setState(1052);
                                partitionSpec();
                                setState(1056);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == IF) {
                                    {
                                        setState(1053);
                                        match(IF);
                                        setState(1054);
                                        match(NOT);
                                        setState(1055);
                                        match(EXISTS);
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    _localctx = new InsertIntoTableContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1060);
                        match(INSERT);
                        setState(1061);
                        match(INTO);
                        setState(1063);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 113, _ctx)) {
                            case 1:
                                {
                                    setState(1062);
                                    match(TABLE);
                                }
                                break;
                        }
                        setState(1065);
                        tableIdentifier();
                        setState(1067);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PARTITION) {
                            {
                                setState(1066);
                                partitionSpec();
                            }
                        }
                    }
                    break;
                case 3:
                    _localctx = new InsertOverwriteHiveDirContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(1069);
                        match(INSERT);
                        setState(1070);
                        match(OVERWRITE);
                        setState(1072);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == LOCAL) {
                            {
                                setState(1071);
                                match(LOCAL);
                            }
                        }

                        setState(1074);
                        match(DIRECTORY);
                        setState(1075);
                        ((InsertOverwriteHiveDirContext) _localctx).path = match(STRING);
                        setState(1077);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == ROW) {
                            {
                                setState(1076);
                                rowFormat();
                            }
                        }

                        setState(1080);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == STORED) {
                            {
                                setState(1079);
                                createFileFormat();
                            }
                        }
                    }
                    break;
                case 4:
                    _localctx = new InsertOverwriteDirContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(1082);
                        match(INSERT);
                        setState(1083);
                        match(OVERWRITE);
                        setState(1085);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == LOCAL) {
                            {
                                setState(1084);
                                match(LOCAL);
                            }
                        }

                        setState(1087);
                        match(DIRECTORY);
                        setState(1089);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == STRING) {
                            {
                                setState(1088);
                                ((InsertOverwriteDirContext) _localctx).path = match(STRING);
                            }
                        }

                        setState(1091);
                        tableProvider();
                        setState(1094);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == OPTIONS) {
                            {
                                setState(1092);
                                match(OPTIONS);
                                setState(1093);
                                ((InsertOverwriteDirContext) _localctx).options =
                                        tablePropertyList();
                            }
                        }
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PartitionSpecLocationContext extends ParserRuleContext {
        public PartitionSpecContext partitionSpec() {
            return getRuleContext(PartitionSpecContext.class, 0);
        }

        public LocationSpecContext locationSpec() {
            return getRuleContext(LocationSpecContext.class, 0);
        }

        public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_partitionSpecLocation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterPartitionSpecLocation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitPartitionSpecLocation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitPartitionSpecLocation(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
        PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_partitionSpecLocation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1098);
                partitionSpec();
                setState(1100);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LOCATION) {
                    {
                        setState(1099);
                        locationSpec();
                    }
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PartitionSpecContext extends ParserRuleContext {
        public TerminalNode PARTITION() {
            return getToken(SqlBaseParser.PARTITION, 0);
        }

        public List<PartitionValContext> partitionVal() {
            return getRuleContexts(PartitionValContext.class);
        }

        public PartitionValContext partitionVal(int i) {
            return getRuleContext(PartitionValContext.class, i);
        }

        public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_partitionSpec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterPartitionSpec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitPartitionSpec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitPartitionSpec(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PartitionSpecContext partitionSpec() throws RecognitionException {
        PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_partitionSpec);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1102);
                match(PARTITION);
                setState(1103);
                match(T__0);
                setState(1104);
                partitionVal();
                setState(1109);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(1105);
                            match(T__2);
                            setState(1106);
                            partitionVal();
                        }
                    }
                    setState(1111);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1112);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PartitionValContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode EQ() {
            return getToken(SqlBaseParser.EQ, 0);
        }

        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        public PartitionValContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_partitionVal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterPartitionVal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitPartitionVal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitPartitionVal(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PartitionValContext partitionVal() throws RecognitionException {
        PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_partitionVal);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1114);
                identifier();
                setState(1117);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EQ) {
                    {
                        setState(1115);
                        match(EQ);
                        setState(1116);
                        constant();
                    }
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DescribeFuncNameContext extends ParserRuleContext {
        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public ComparisonOperatorContext comparisonOperator() {
            return getRuleContext(ComparisonOperatorContext.class, 0);
        }

        public ArithmeticOperatorContext arithmeticOperator() {
            return getRuleContext(ArithmeticOperatorContext.class, 0);
        }

        public PredicateOperatorContext predicateOperator() {
            return getRuleContext(PredicateOperatorContext.class, 0);
        }

        public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_describeFuncName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDescribeFuncName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDescribeFuncName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDescribeFuncName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
        DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_describeFuncName);
        try {
            setState(1124);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 125, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1119);
                        qualifiedName();
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1120);
                        match(STRING);
                    }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(1121);
                        comparisonOperator();
                    }
                    break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(1122);
                        arithmeticOperator();
                    }
                    break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                    {
                        setState(1123);
                        predicateOperator();
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DescribeColNameContext extends ParserRuleContext {
        public IdentifierContext identifier;
        public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_describeColName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDescribeColName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDescribeColName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDescribeColName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DescribeColNameContext describeColName() throws RecognitionException {
        DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_describeColName);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1126);
                ((DescribeColNameContext) _localctx).identifier = identifier();
                ((DescribeColNameContext) _localctx)
                        .nameParts.add(((DescribeColNameContext) _localctx).identifier);
                setState(1131);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__3) {
                    {
                        {
                            setState(1127);
                            match(T__3);
                            setState(1128);
                            ((DescribeColNameContext) _localctx).identifier = identifier();
                            ((DescribeColNameContext) _localctx)
                                    .nameParts.add(((DescribeColNameContext) _localctx).identifier);
                        }
                    }
                    setState(1133);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CtesContext extends ParserRuleContext {
        public TerminalNode WITH() {
            return getToken(SqlBaseParser.WITH, 0);
        }

        public List<NamedQueryContext> namedQuery() {
            return getRuleContexts(NamedQueryContext.class);
        }

        public NamedQueryContext namedQuery(int i) {
            return getRuleContext(NamedQueryContext.class, i);
        }

        public CtesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ctes;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).enterCtes(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitCtes(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCtes(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CtesContext ctes() throws RecognitionException {
        CtesContext _localctx = new CtesContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_ctes);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1134);
                match(WITH);
                setState(1135);
                namedQuery();
                setState(1140);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(1136);
                            match(T__2);
                            setState(1137);
                            namedQuery();
                        }
                    }
                    setState(1142);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class NamedQueryContext extends ParserRuleContext {
        public IdentifierContext name;

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public NamedQueryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_namedQuery;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNamedQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNamedQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNamedQuery(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NamedQueryContext namedQuery() throws RecognitionException {
        NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_namedQuery);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1143);
                ((NamedQueryContext) _localctx).name = identifier();
                setState(1145);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == AS) {
                    {
                        setState(1144);
                        match(AS);
                    }
                }

                setState(1147);
                match(T__0);
                setState(1148);
                query();
                setState(1149);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TableProviderContext extends ParserRuleContext {
        public TerminalNode USING() {
            return getToken(SqlBaseParser.USING, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TableProviderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableProvider;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTableProvider(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTableProvider(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTableProvider(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TableProviderContext tableProvider() throws RecognitionException {
        TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_tableProvider);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1151);
                match(USING);
                setState(1152);
                qualifiedName();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TablePropertyListContext extends ParserRuleContext {
        public List<TablePropertyContext> tableProperty() {
            return getRuleContexts(TablePropertyContext.class);
        }

        public TablePropertyContext tableProperty(int i) {
            return getRuleContext(TablePropertyContext.class, i);
        }

        public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tablePropertyList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTablePropertyList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTablePropertyList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTablePropertyList(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TablePropertyListContext tablePropertyList() throws RecognitionException {
        TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_tablePropertyList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1154);
                match(T__0);
                setState(1155);
                tableProperty();
                setState(1160);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(1156);
                            match(T__2);
                            setState(1157);
                            tableProperty();
                        }
                    }
                    setState(1162);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1163);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TablePropertyContext extends ParserRuleContext {
        public TablePropertyKeyContext key;
        public TablePropertyValueContext value;

        public TablePropertyKeyContext tablePropertyKey() {
            return getRuleContext(TablePropertyKeyContext.class, 0);
        }

        public TablePropertyValueContext tablePropertyValue() {
            return getRuleContext(TablePropertyValueContext.class, 0);
        }

        public TerminalNode EQ() {
            return getToken(SqlBaseParser.EQ, 0);
        }

        public TablePropertyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableProperty;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTableProperty(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTableProperty(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTableProperty(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TablePropertyContext tableProperty() throws RecognitionException {
        TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_tableProperty);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1165);
                ((TablePropertyContext) _localctx).key = tablePropertyKey();
                setState(1170);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == TRUE
                        || _la == FALSE
                        || _la == EQ
                        || ((((_la - 240)) & ~0x3f) == 0 && ((1L << (_la - 240)) & 49L) != 0)) {
                    {
                        setState(1167);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == EQ) {
                            {
                                setState(1166);
                                match(EQ);
                            }
                        }

                        setState(1169);
                        ((TablePropertyContext) _localctx).value = tablePropertyValue();
                    }
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TablePropertyKeyContext extends ParserRuleContext {
        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tablePropertyKey;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTablePropertyKey(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTablePropertyKey(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTablePropertyKey(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
        TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_tablePropertyKey);
        int _la;
        try {
            setState(1181);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case SELECT:
                case FROM:
                case ADD:
                case AS:
                case ALL:
                case ANY:
                case DISTINCT:
                case WHERE:
                case GROUP:
                case BY:
                case GROUPING:
                case SETS:
                case CUBE:
                case ROLLUP:
                case ORDER:
                case HAVING:
                case LIMIT:
                case AT:
                case OR:
                case AND:
                case IN:
                case NOT:
                case NO:
                case EXISTS:
                case BETWEEN:
                case LIKE:
                case RLIKE:
                case IS:
                case NULL:
                case TRUE:
                case FALSE:
                case NULLS:
                case ASC:
                case DESC:
                case FOR:
                case INTERVAL:
                case CASE:
                case WHEN:
                case THEN:
                case ELSE:
                case END:
                case JOIN:
                case CROSS:
                case OUTER:
                case INNER:
                case LEFT:
                case SEMI:
                case RIGHT:
                case FULL:
                case NATURAL:
                case ON:
                case PIVOT:
                case LATERAL:
                case WINDOW:
                case OVER:
                case PARTITION:
                case RANGE:
                case ROWS:
                case UNBOUNDED:
                case PRECEDING:
                case FOLLOWING:
                case CURRENT:
                case FIRST:
                case AFTER:
                case LAST:
                case ROW:
                case WITH:
                case VALUES:
                case CREATE:
                case TABLE:
                case DIRECTORY:
                case VIEW:
                case REPLACE:
                case INSERT:
                case DELETE:
                case INTO:
                case DESCRIBE:
                case EXPLAIN:
                case FORMAT:
                case LOGICAL:
                case CODEGEN:
                case COST:
                case CAST:
                case SHOW:
                case TABLES:
                case COLUMNS:
                case COLUMN:
                case USE:
                case PARTITIONS:
                case FUNCTIONS:
                case DROP:
                case UNION:
                case EXCEPT:
                case SETMINUS:
                case INTERSECT:
                case TO:
                case TABLESAMPLE:
                case STRATIFY:
                case ALTER:
                case RENAME:
                case ARRAY:
                case MAP:
                case STRUCT:
                case COMMENT:
                case SET:
                case RESET:
                case DATA:
                case START:
                case TRANSACTION:
                case COMMIT:
                case ROLLBACK:
                case MACRO:
                case IGNORE:
                case BOTH:
                case LEADING:
                case TRAILING:
                case IF:
                case POSITION:
                case EXTRACT:
                case DIV:
                case PERCENTLIT:
                case BUCKET:
                case OUT:
                case OF:
                case SORT:
                case CLUSTER:
                case DISTRIBUTE:
                case OVERWRITE:
                case TRANSFORM:
                case REDUCE:
                case SERDE:
                case SERDEPROPERTIES:
                case RECORDREADER:
                case RECORDWRITER:
                case DELIMITED:
                case FIELDS:
                case TERMINATED:
                case COLLECTION:
                case ITEMS:
                case KEYS:
                case ESCAPED:
                case LINES:
                case SEPARATED:
                case FUNCTION:
                case EXTENDED:
                case REFRESH:
                case CLEAR:
                case CACHE:
                case UNCACHE:
                case LAZY:
                case FORMATTED:
                case GLOBAL:
                case TEMPORARY:
                case OPTIONS:
                case UNSET:
                case TBLPROPERTIES:
                case DBPROPERTIES:
                case BUCKETS:
                case SKEWED:
                case STORED:
                case DIRECTORIES:
                case LOCATION:
                case EXCHANGE:
                case ARCHIVE:
                case UNARCHIVE:
                case FILEFORMAT:
                case TOUCH:
                case COMPACT:
                case CONCATENATE:
                case CHANGE:
                case CASCADE:
                case RESTRICT:
                case CLUSTERED:
                case SORTED:
                case PURGE:
                case INPUTFORMAT:
                case OUTPUTFORMAT:
                case DATABASE:
                case DATABASES:
                case DFS:
                case TRUNCATE:
                case ANALYZE:
                case COMPUTE:
                case LIST:
                case STATISTICS:
                case PARTITIONED:
                case EXTERNAL:
                case DEFINED:
                case REVOKE:
                case GRANT:
                case LOCK:
                case UNLOCK:
                case MSCK:
                case REPAIR:
                case RECOVER:
                case EXPORT:
                case IMPORT:
                case LOAD:
                case ROLE:
                case ROLES:
                case COMPACTIONS:
                case PRINCIPALS:
                case TRANSACTIONS:
                case INDEX:
                case INDEXES:
                case LOCKS:
                case OPTION:
                case ANTI:
                case LOCAL:
                case INPATH:
                case IDENTIFIER:
                case BACKQUOTED_IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1172);
                        identifier();
                        setState(1177);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__3) {
                            {
                                {
                                    setState(1173);
                                    match(T__3);
                                    setState(1174);
                                    identifier();
                                }
                            }
                            setState(1179);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                    break;
                case STRING:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1180);
                        match(STRING);
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TablePropertyValueContext extends ParserRuleContext {
        public TerminalNode INTEGER_VALUE() {
            return getToken(SqlBaseParser.INTEGER_VALUE, 0);
        }

        public TerminalNode DECIMAL_VALUE() {
            return getToken(SqlBaseParser.DECIMAL_VALUE, 0);
        }

        public BooleanValueContext booleanValue() {
            return getRuleContext(BooleanValueContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tablePropertyValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTablePropertyValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTablePropertyValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTablePropertyValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
        TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_tablePropertyValue);
        try {
            setState(1187);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case INTEGER_VALUE:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1183);
                        match(INTEGER_VALUE);
                    }
                    break;
                case DECIMAL_VALUE:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1184);
                        match(DECIMAL_VALUE);
                    }
                    break;
                case TRUE:
                case FALSE:
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(1185);
                        booleanValue();
                    }
                    break;
                case STRING:
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(1186);
                        match(STRING);
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ConstantListContext extends ParserRuleContext {
        public List<ConstantContext> constant() {
            return getRuleContexts(ConstantContext.class);
        }

        public ConstantContext constant(int i) {
            return getRuleContext(ConstantContext.class, i);
        }

        public ConstantListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constantList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterConstantList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitConstantList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitConstantList(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ConstantListContext constantList() throws RecognitionException {
        ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_constantList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1189);
                match(T__0);
                setState(1190);
                constant();
                setState(1195);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(1191);
                            match(T__2);
                            setState(1192);
                            constant();
                        }
                    }
                    setState(1197);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1198);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class NestedConstantListContext extends ParserRuleContext {
        public List<ConstantListContext> constantList() {
            return getRuleContexts(ConstantListContext.class);
        }

        public ConstantListContext constantList(int i) {
            return getRuleContext(ConstantListContext.class, i);
        }

        public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nestedConstantList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNestedConstantList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNestedConstantList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNestedConstantList(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NestedConstantListContext nestedConstantList() throws RecognitionException {
        NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_nestedConstantList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1200);
                match(T__0);
                setState(1201);
                constantList();
                setState(1206);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(1202);
                            match(T__2);
                            setState(1203);
                            constantList();
                        }
                    }
                    setState(1208);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1209);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CreateFileFormatContext extends ParserRuleContext {
        public TerminalNode STORED() {
            return getToken(SqlBaseParser.STORED, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public FileFormatContext fileFormat() {
            return getRuleContext(FileFormatContext.class, 0);
        }

        public TerminalNode BY() {
            return getToken(SqlBaseParser.BY, 0);
        }

        public StorageHandlerContext storageHandler() {
            return getRuleContext(StorageHandlerContext.class, 0);
        }

        public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_createFileFormat;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCreateFileFormat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCreateFileFormat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCreateFileFormat(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CreateFileFormatContext createFileFormat() throws RecognitionException {
        CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_createFileFormat);
        try {
            setState(1217);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 137, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1211);
                        match(STORED);
                        setState(1212);
                        match(AS);
                        setState(1213);
                        fileFormat();
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1214);
                        match(STORED);
                        setState(1215);
                        match(BY);
                        setState(1216);
                        storageHandler();
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FileFormatContext extends ParserRuleContext {
        public FileFormatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fileFormat;
        }

        public FileFormatContext() {}

        public void copyFrom(FileFormatContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TableFileFormatContext extends FileFormatContext {
        public Token inFmt;
        public Token outFmt;

        public TerminalNode INPUTFORMAT() {
            return getToken(SqlBaseParser.INPUTFORMAT, 0);
        }

        public TerminalNode OUTPUTFORMAT() {
            return getToken(SqlBaseParser.OUTPUTFORMAT, 0);
        }

        public List<TerminalNode> STRING() {
            return getTokens(SqlBaseParser.STRING);
        }

        public TerminalNode STRING(int i) {
            return getToken(SqlBaseParser.STRING, i);
        }

        public TableFileFormatContext(FileFormatContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTableFileFormat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTableFileFormat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTableFileFormat(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class GenericFileFormatContext extends FileFormatContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public GenericFileFormatContext(FileFormatContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterGenericFileFormat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitGenericFileFormat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitGenericFileFormat(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FileFormatContext fileFormat() throws RecognitionException {
        FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_fileFormat);
        try {
            setState(1224);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 138, _ctx)) {
                case 1:
                    _localctx = new TableFileFormatContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1219);
                        match(INPUTFORMAT);
                        setState(1220);
                        ((TableFileFormatContext) _localctx).inFmt = match(STRING);
                        setState(1221);
                        match(OUTPUTFORMAT);
                        setState(1222);
                        ((TableFileFormatContext) _localctx).outFmt = match(STRING);
                    }
                    break;
                case 2:
                    _localctx = new GenericFileFormatContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1223);
                        identifier();
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StorageHandlerContext extends ParserRuleContext {
        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public TerminalNode WITH() {
            return getToken(SqlBaseParser.WITH, 0);
        }

        public TerminalNode SERDEPROPERTIES() {
            return getToken(SqlBaseParser.SERDEPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_storageHandler;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterStorageHandler(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitStorageHandler(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitStorageHandler(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StorageHandlerContext storageHandler() throws RecognitionException {
        StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_storageHandler);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1226);
                match(STRING);
                setState(1230);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 139, _ctx)) {
                    case 1:
                        {
                            setState(1227);
                            match(WITH);
                            setState(1228);
                            match(SERDEPROPERTIES);
                            setState(1229);
                            tablePropertyList();
                        }
                        break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ResourceContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public ResourceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_resource;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterResource(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitResource(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitResource(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ResourceContext resource() throws RecognitionException {
        ResourceContext _localctx = new ResourceContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_resource);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1232);
                identifier();
                setState(1233);
                match(STRING);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QueryNoWithContext extends ParserRuleContext {
        public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_queryNoWith;
        }

        public QueryNoWithContext() {}

        public void copyFrom(QueryNoWithContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SingleInsertQueryContext extends QueryNoWithContext {
        public QueryTermContext queryTerm() {
            return getRuleContext(QueryTermContext.class, 0);
        }

        public QueryOrganizationContext queryOrganization() {
            return getRuleContext(QueryOrganizationContext.class, 0);
        }

        public InsertIntoContext insertInto() {
            return getRuleContext(InsertIntoContext.class, 0);
        }

        public SingleInsertQueryContext(QueryNoWithContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSingleInsertQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSingleInsertQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSingleInsertQuery(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MultiInsertQueryContext extends QueryNoWithContext {
        public FromClauseContext fromClause() {
            return getRuleContext(FromClauseContext.class, 0);
        }

        public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
            return getRuleContexts(MultiInsertQueryBodyContext.class);
        }

        public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
            return getRuleContext(MultiInsertQueryBodyContext.class, i);
        }

        public MultiInsertQueryContext(QueryNoWithContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterMultiInsertQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitMultiInsertQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitMultiInsertQuery(this);
            else return visitor.visitChildren(this);
        }
    }

    public final QueryNoWithContext queryNoWith() throws RecognitionException {
        QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_queryNoWith);
        int _la;
        try {
            setState(1247);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 142, _ctx)) {
                case 1:
                    _localctx = new SingleInsertQueryContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1236);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == INSERT) {
                            {
                                setState(1235);
                                insertInto();
                            }
                        }

                        setState(1238);
                        queryTerm(0);
                        setState(1239);
                        queryOrganization();
                    }
                    break;
                case 2:
                    _localctx = new MultiInsertQueryContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1241);
                        fromClause();
                        setState(1243);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(1242);
                                    multiInsertQueryBody();
                                }
                            }
                            setState(1245);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == SELECT
                                || _la == FROM
                                || _la == INSERT
                                || _la == MAP
                                || _la == REDUCE);
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QueryOrganizationContext extends ParserRuleContext {
        public SortItemContext sortItem;
        public List<SortItemContext> order = new ArrayList<SortItemContext>();
        public ExpressionContext expression;
        public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
        public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
        public List<SortItemContext> sort = new ArrayList<SortItemContext>();
        public ExpressionContext limit;

        public TerminalNode ORDER() {
            return getToken(SqlBaseParser.ORDER, 0);
        }

        public List<TerminalNode> BY() {
            return getTokens(SqlBaseParser.BY);
        }

        public TerminalNode BY(int i) {
            return getToken(SqlBaseParser.BY, i);
        }

        public TerminalNode CLUSTER() {
            return getToken(SqlBaseParser.CLUSTER, 0);
        }

        public TerminalNode DISTRIBUTE() {
            return getToken(SqlBaseParser.DISTRIBUTE, 0);
        }

        public TerminalNode SORT() {
            return getToken(SqlBaseParser.SORT, 0);
        }

        public WindowsContext windows() {
            return getRuleContext(WindowsContext.class, 0);
        }

        public TerminalNode LIMIT() {
            return getToken(SqlBaseParser.LIMIT, 0);
        }

        public List<SortItemContext> sortItem() {
            return getRuleContexts(SortItemContext.class);
        }

        public SortItemContext sortItem(int i) {
            return getRuleContext(SortItemContext.class, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode ALL() {
            return getToken(SqlBaseParser.ALL, 0);
        }

        public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_queryOrganization;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterQueryOrganization(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitQueryOrganization(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitQueryOrganization(this);
            else return visitor.visitChildren(this);
        }
    }

    public final QueryOrganizationContext queryOrganization() throws RecognitionException {
        QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_queryOrganization);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1259);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ORDER) {
                    {
                        setState(1249);
                        match(ORDER);
                        setState(1250);
                        match(BY);
                        setState(1251);
                        ((QueryOrganizationContext) _localctx).sortItem = sortItem();
                        ((QueryOrganizationContext) _localctx)
                                .order.add(((QueryOrganizationContext) _localctx).sortItem);
                        setState(1256);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(1252);
                                    match(T__2);
                                    setState(1253);
                                    ((QueryOrganizationContext) _localctx).sortItem = sortItem();
                                    ((QueryOrganizationContext) _localctx)
                                            .order.add(
                                                    ((QueryOrganizationContext) _localctx)
                                                            .sortItem);
                                }
                            }
                            setState(1258);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(1271);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == CLUSTER) {
                    {
                        setState(1261);
                        match(CLUSTER);
                        setState(1262);
                        match(BY);
                        setState(1263);
                        ((QueryOrganizationContext) _localctx).expression = expression();
                        ((QueryOrganizationContext) _localctx)
                                .clusterBy.add(((QueryOrganizationContext) _localctx).expression);
                        setState(1268);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(1264);
                                    match(T__2);
                                    setState(1265);
                                    ((QueryOrganizationContext) _localctx).expression =
                                            expression();
                                    ((QueryOrganizationContext) _localctx)
                                            .clusterBy.add(
                                                    ((QueryOrganizationContext) _localctx)
                                                            .expression);
                                }
                            }
                            setState(1270);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(1283);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == DISTRIBUTE) {
                    {
                        setState(1273);
                        match(DISTRIBUTE);
                        setState(1274);
                        match(BY);
                        setState(1275);
                        ((QueryOrganizationContext) _localctx).expression = expression();
                        ((QueryOrganizationContext) _localctx)
                                .distributeBy.add(
                                        ((QueryOrganizationContext) _localctx).expression);
                        setState(1280);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(1276);
                                    match(T__2);
                                    setState(1277);
                                    ((QueryOrganizationContext) _localctx).expression =
                                            expression();
                                    ((QueryOrganizationContext) _localctx)
                                            .distributeBy.add(
                                                    ((QueryOrganizationContext) _localctx)
                                                            .expression);
                                }
                            }
                            setState(1282);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(1295);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == SORT) {
                    {
                        setState(1285);
                        match(SORT);
                        setState(1286);
                        match(BY);
                        setState(1287);
                        ((QueryOrganizationContext) _localctx).sortItem = sortItem();
                        ((QueryOrganizationContext) _localctx)
                                .sort.add(((QueryOrganizationContext) _localctx).sortItem);
                        setState(1292);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(1288);
                                    match(T__2);
                                    setState(1289);
                                    ((QueryOrganizationContext) _localctx).sortItem = sortItem();
                                    ((QueryOrganizationContext) _localctx)
                                            .sort.add(
                                                    ((QueryOrganizationContext) _localctx)
                                                            .sortItem);
                                }
                            }
                            setState(1294);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(1298);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == WINDOW) {
                    {
                        setState(1297);
                        windows();
                    }
                }

                setState(1305);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LIMIT) {
                    {
                        setState(1300);
                        match(LIMIT);
                        setState(1303);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 152, _ctx)) {
                            case 1:
                                {
                                    setState(1301);
                                    match(ALL);
                                }
                                break;
                            case 2:
                                {
                                    setState(1302);
                                    ((QueryOrganizationContext) _localctx).limit = expression();
                                }
                                break;
                        }
                    }
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MultiInsertQueryBodyContext extends ParserRuleContext {
        public QuerySpecificationContext querySpecification() {
            return getRuleContext(QuerySpecificationContext.class, 0);
        }

        public QueryOrganizationContext queryOrganization() {
            return getRuleContext(QueryOrganizationContext.class, 0);
        }

        public InsertIntoContext insertInto() {
            return getRuleContext(InsertIntoContext.class, 0);
        }

        public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_multiInsertQueryBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterMultiInsertQueryBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitMultiInsertQueryBody(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitMultiInsertQueryBody(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
        MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_multiInsertQueryBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1308);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == INSERT) {
                    {
                        setState(1307);
                        insertInto();
                    }
                }

                setState(1310);
                querySpecification();
                setState(1311);
                queryOrganization();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QueryTermContext extends ParserRuleContext {
        public QueryTermContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_queryTerm;
        }

        public QueryTermContext() {}

        public void copyFrom(QueryTermContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QueryTermDefaultContext extends QueryTermContext {
        public QueryPrimaryContext queryPrimary() {
            return getRuleContext(QueryPrimaryContext.class, 0);
        }

        public QueryTermDefaultContext(QueryTermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterQueryTermDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitQueryTermDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitQueryTermDefault(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SetOperationContext extends QueryTermContext {
        public QueryTermContext left;
        public Token operator;
        public QueryTermContext right;

        public List<QueryTermContext> queryTerm() {
            return getRuleContexts(QueryTermContext.class);
        }

        public QueryTermContext queryTerm(int i) {
            return getRuleContext(QueryTermContext.class, i);
        }

        public TerminalNode INTERSECT() {
            return getToken(SqlBaseParser.INTERSECT, 0);
        }

        public TerminalNode UNION() {
            return getToken(SqlBaseParser.UNION, 0);
        }

        public TerminalNode EXCEPT() {
            return getToken(SqlBaseParser.EXCEPT, 0);
        }

        public TerminalNode SETMINUS() {
            return getToken(SqlBaseParser.SETMINUS, 0);
        }

        public SetQuantifierContext setQuantifier() {
            return getRuleContext(SetQuantifierContext.class, 0);
        }

        public SetOperationContext(QueryTermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSetOperation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSetOperation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSetOperation(this);
            else return visitor.visitChildren(this);
        }
    }

    public final QueryTermContext queryTerm() throws RecognitionException {
        return queryTerm(0);
    }

    private QueryTermContext queryTerm(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
        QueryTermContext _prevctx = _localctx;
        int _startState = 70;
        enterRecursionRule(_localctx, 70, RULE_queryTerm, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    _localctx = new QueryTermDefaultContext(_localctx);
                    _ctx = _localctx;
                    _prevctx = _localctx;

                    setState(1314);
                    queryPrimary();
                }
                _ctx.stop = _input.LT(-1);
                setState(1339);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 159, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1337);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 158, _ctx)) {
                                case 1:
                                    {
                                        _localctx =
                                                new SetOperationContext(
                                                        new QueryTermContext(
                                                                _parentctx, _parentState));
                                        ((SetOperationContext) _localctx).left = _prevctx;
                                        pushNewRecursionContext(
                                                _localctx, _startState, RULE_queryTerm);
                                        setState(1316);
                                        if (!(precpred(_ctx, 3)))
                                            throw new FailedPredicateException(
                                                    this, "precpred(_ctx, 3)");
                                        setState(1317);
                                        if (!(legacy_setops_precedence_enbled))
                                            throw new FailedPredicateException(
                                                    this, "legacy_setops_precedence_enbled");
                                        setState(1318);
                                        ((SetOperationContext) _localctx).operator = _input.LT(1);
                                        _la = _input.LA(1);
                                        if (!(((((_la - 102)) & ~0x3f) == 0
                                                && ((1L << (_la - 102)) & 15L) != 0))) {
                                            ((SetOperationContext) _localctx).operator =
                                                    (Token) _errHandler.recoverInline(this);
                                        } else {
                                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                            _errHandler.reportMatch(this);
                                            consume();
                                        }
                                        setState(1320);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                        if (_la == ALL || _la == DISTINCT) {
                                            {
                                                setState(1319);
                                                setQuantifier();
                                            }
                                        }

                                        setState(1322);
                                        ((SetOperationContext) _localctx).right = queryTerm(4);
                                    }
                                    break;
                                case 2:
                                    {
                                        _localctx =
                                                new SetOperationContext(
                                                        new QueryTermContext(
                                                                _parentctx, _parentState));
                                        ((SetOperationContext) _localctx).left = _prevctx;
                                        pushNewRecursionContext(
                                                _localctx, _startState, RULE_queryTerm);
                                        setState(1323);
                                        if (!(precpred(_ctx, 2)))
                                            throw new FailedPredicateException(
                                                    this, "precpred(_ctx, 2)");
                                        setState(1324);
                                        if (!(!legacy_setops_precedence_enbled))
                                            throw new FailedPredicateException(
                                                    this, "!legacy_setops_precedence_enbled");
                                        setState(1325);
                                        ((SetOperationContext) _localctx).operator =
                                                match(INTERSECT);
                                        setState(1327);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                        if (_la == ALL || _la == DISTINCT) {
                                            {
                                                setState(1326);
                                                setQuantifier();
                                            }
                                        }

                                        setState(1329);
                                        ((SetOperationContext) _localctx).right = queryTerm(3);
                                    }
                                    break;
                                case 3:
                                    {
                                        _localctx =
                                                new SetOperationContext(
                                                        new QueryTermContext(
                                                                _parentctx, _parentState));
                                        ((SetOperationContext) _localctx).left = _prevctx;
                                        pushNewRecursionContext(
                                                _localctx, _startState, RULE_queryTerm);
                                        setState(1330);
                                        if (!(precpred(_ctx, 1)))
                                            throw new FailedPredicateException(
                                                    this, "precpred(_ctx, 1)");
                                        setState(1331);
                                        if (!(!legacy_setops_precedence_enbled))
                                            throw new FailedPredicateException(
                                                    this, "!legacy_setops_precedence_enbled");
                                        setState(1332);
                                        ((SetOperationContext) _localctx).operator = _input.LT(1);
                                        _la = _input.LA(1);
                                        if (!(((((_la - 102)) & ~0x3f) == 0
                                                && ((1L << (_la - 102)) & 7L) != 0))) {
                                            ((SetOperationContext) _localctx).operator =
                                                    (Token) _errHandler.recoverInline(this);
                                        } else {
                                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                            _errHandler.reportMatch(this);
                                            consume();
                                        }
                                        setState(1334);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                        if (_la == ALL || _la == DISTINCT) {
                                            {
                                                setState(1333);
                                                setQuantifier();
                                            }
                                        }

                                        setState(1336);
                                        ((SetOperationContext) _localctx).right = queryTerm(2);
                                    }
                                    break;
                            }
                        }
                    }
                    setState(1341);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 159, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QueryPrimaryContext extends ParserRuleContext {
        public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_queryPrimary;
        }

        public QueryPrimaryContext() {}

        public void copyFrom(QueryPrimaryContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SubqueryContext extends QueryPrimaryContext {
        public QueryNoWithContext queryNoWith() {
            return getRuleContext(QueryNoWithContext.class, 0);
        }

        public SubqueryContext(QueryPrimaryContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSubquery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSubquery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSubquery(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
        public QuerySpecificationContext querySpecification() {
            return getRuleContext(QuerySpecificationContext.class, 0);
        }

        public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterQueryPrimaryDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitQueryPrimaryDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitQueryPrimaryDefault(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class InlineTableDefault1Context extends QueryPrimaryContext {
        public InlineTableContext inlineTable() {
            return getRuleContext(InlineTableContext.class, 0);
        }

        public InlineTableDefault1Context(QueryPrimaryContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterInlineTableDefault1(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitInlineTableDefault1(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitInlineTableDefault1(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TableContext extends QueryPrimaryContext {
        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TableContext(QueryPrimaryContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).enterTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public final QueryPrimaryContext queryPrimary() throws RecognitionException {
        QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_queryPrimary);
        try {
            setState(1350);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case SELECT:
                case FROM:
                case MAP:
                case REDUCE:
                    _localctx = new QueryPrimaryDefaultContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1342);
                        querySpecification();
                    }
                    break;
                case TABLE:
                    _localctx = new TableContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1343);
                        match(TABLE);
                        setState(1344);
                        tableIdentifier();
                    }
                    break;
                case VALUES:
                    _localctx = new InlineTableDefault1Context(_localctx);
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(1345);
                        inlineTable();
                    }
                    break;
                case T__0:
                    _localctx = new SubqueryContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(1346);
                        match(T__0);
                        setState(1347);
                        queryNoWith();
                        setState(1348);
                        match(T__1);
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SortItemContext extends ParserRuleContext {
        public Token ordering;
        public Token nullOrder;

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode NULLS() {
            return getToken(SqlBaseParser.NULLS, 0);
        }

        public TerminalNode ASC() {
            return getToken(SqlBaseParser.ASC, 0);
        }

        public TerminalNode DESC() {
            return getToken(SqlBaseParser.DESC, 0);
        }

        public TerminalNode LAST() {
            return getToken(SqlBaseParser.LAST, 0);
        }

        public TerminalNode FIRST() {
            return getToken(SqlBaseParser.FIRST, 0);
        }

        public SortItemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sortItem;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSortItem(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSortItem(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSortItem(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SortItemContext sortItem() throws RecognitionException {
        SortItemContext _localctx = new SortItemContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_sortItem);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1352);
                expression();
                setState(1354);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ASC || _la == DESC) {
                    {
                        setState(1353);
                        ((SortItemContext) _localctx).ordering = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == ASC || _la == DESC)) {
                            ((SortItemContext) _localctx).ordering =
                                    (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(1358);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == NULLS) {
                    {
                        setState(1356);
                        match(NULLS);
                        setState(1357);
                        ((SortItemContext) _localctx).nullOrder = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == FIRST || _la == LAST)) {
                            ((SortItemContext) _localctx).nullOrder =
                                    (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QuerySpecificationContext extends ParserRuleContext {
        public Token kind;
        public RowFormatContext inRowFormat;
        public Token recordWriter;
        public Token script;
        public RowFormatContext outRowFormat;
        public Token recordReader;
        public BooleanExpressionContext where;
        public HintContext hint;
        public List<HintContext> hints = new ArrayList<HintContext>();
        public BooleanExpressionContext having;

        public TerminalNode USING() {
            return getToken(SqlBaseParser.USING, 0);
        }

        public List<TerminalNode> STRING() {
            return getTokens(SqlBaseParser.STRING);
        }

        public TerminalNode STRING(int i) {
            return getToken(SqlBaseParser.STRING, i);
        }

        public TerminalNode RECORDWRITER() {
            return getToken(SqlBaseParser.RECORDWRITER, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public TerminalNode RECORDREADER() {
            return getToken(SqlBaseParser.RECORDREADER, 0);
        }

        public FromClauseContext fromClause() {
            return getRuleContext(FromClauseContext.class, 0);
        }

        public TerminalNode WHERE() {
            return getToken(SqlBaseParser.WHERE, 0);
        }

        public TerminalNode SELECT() {
            return getToken(SqlBaseParser.SELECT, 0);
        }

        public NamedExpressionSeqContext namedExpressionSeq() {
            return getRuleContext(NamedExpressionSeqContext.class, 0);
        }

        public List<RowFormatContext> rowFormat() {
            return getRuleContexts(RowFormatContext.class);
        }

        public RowFormatContext rowFormat(int i) {
            return getRuleContext(RowFormatContext.class, i);
        }

        public List<BooleanExpressionContext> booleanExpression() {
            return getRuleContexts(BooleanExpressionContext.class);
        }

        public BooleanExpressionContext booleanExpression(int i) {
            return getRuleContext(BooleanExpressionContext.class, i);
        }

        public TerminalNode TRANSFORM() {
            return getToken(SqlBaseParser.TRANSFORM, 0);
        }

        public TerminalNode MAP() {
            return getToken(SqlBaseParser.MAP, 0);
        }

        public TerminalNode REDUCE() {
            return getToken(SqlBaseParser.REDUCE, 0);
        }

        public IdentifierSeqContext identifierSeq() {
            return getRuleContext(IdentifierSeqContext.class, 0);
        }

        public ColTypeListContext colTypeList() {
            return getRuleContext(ColTypeListContext.class, 0);
        }

        public List<LateralViewContext> lateralView() {
            return getRuleContexts(LateralViewContext.class);
        }

        public LateralViewContext lateralView(int i) {
            return getRuleContext(LateralViewContext.class, i);
        }

        public AggregationContext aggregation() {
            return getRuleContext(AggregationContext.class, 0);
        }

        public TerminalNode HAVING() {
            return getToken(SqlBaseParser.HAVING, 0);
        }

        public WindowsContext windows() {
            return getRuleContext(WindowsContext.class, 0);
        }

        public SetQuantifierContext setQuantifier() {
            return getRuleContext(SetQuantifierContext.class, 0);
        }

        public List<HintContext> hint() {
            return getRuleContexts(HintContext.class);
        }

        public HintContext hint(int i) {
            return getRuleContext(HintContext.class, i);
        }

        public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_querySpecification;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterQuerySpecification(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitQuerySpecification(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitQuerySpecification(this);
            else return visitor.visitChildren(this);
        }
    }

    public final QuerySpecificationContext querySpecification() throws RecognitionException {
        QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_querySpecification);
        int _la;
        try {
            int _alt;
            setState(1453);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 184, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        {
                            {
                                setState(1370);
                                _errHandler.sync(this);
                                switch (_input.LA(1)) {
                                    case SELECT:
                                        {
                                            setState(1360);
                                            match(SELECT);
                                            setState(1361);
                                            ((QuerySpecificationContext) _localctx).kind =
                                                    match(TRANSFORM);
                                            setState(1362);
                                            match(T__0);
                                            setState(1363);
                                            namedExpressionSeq();
                                            setState(1364);
                                            match(T__1);
                                        }
                                        break;
                                    case MAP:
                                        {
                                            setState(1366);
                                            ((QuerySpecificationContext) _localctx).kind =
                                                    match(MAP);
                                            setState(1367);
                                            namedExpressionSeq();
                                        }
                                        break;
                                    case REDUCE:
                                        {
                                            setState(1368);
                                            ((QuerySpecificationContext) _localctx).kind =
                                                    match(REDUCE);
                                            setState(1369);
                                            namedExpressionSeq();
                                        }
                                        break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                            }
                            setState(1373);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == ROW) {
                                {
                                    setState(1372);
                                    ((QuerySpecificationContext) _localctx).inRowFormat =
                                            rowFormat();
                                }
                            }

                            setState(1377);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == RECORDWRITER) {
                                {
                                    setState(1375);
                                    match(RECORDWRITER);
                                    setState(1376);
                                    ((QuerySpecificationContext) _localctx).recordWriter =
                                            match(STRING);
                                }
                            }

                            setState(1379);
                            match(USING);
                            setState(1380);
                            ((QuerySpecificationContext) _localctx).script = match(STRING);
                            setState(1393);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 168, _ctx)) {
                                case 1:
                                    {
                                        setState(1381);
                                        match(AS);
                                        setState(1391);
                                        _errHandler.sync(this);
                                        switch (getInterpreter()
                                                .adaptivePredict(_input, 167, _ctx)) {
                                            case 1:
                                                {
                                                    setState(1382);
                                                    identifierSeq();
                                                }
                                                break;
                                            case 2:
                                                {
                                                    setState(1383);
                                                    colTypeList();
                                                }
                                                break;
                                            case 3:
                                                {
                                                    {
                                                        setState(1384);
                                                        match(T__0);
                                                        setState(1387);
                                                        _errHandler.sync(this);
                                                        switch (getInterpreter()
                                                                .adaptivePredict(
                                                                        _input, 166, _ctx)) {
                                                            case 1:
                                                                {
                                                                    setState(1385);
                                                                    identifierSeq();
                                                                }
                                                                break;
                                                            case 2:
                                                                {
                                                                    setState(1386);
                                                                    colTypeList();
                                                                }
                                                                break;
                                                        }
                                                        setState(1389);
                                                        match(T__1);
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                            }
                            setState(1396);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 169, _ctx)) {
                                case 1:
                                    {
                                        setState(1395);
                                        ((QuerySpecificationContext) _localctx).outRowFormat =
                                                rowFormat();
                                    }
                                    break;
                            }
                            setState(1400);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 170, _ctx)) {
                                case 1:
                                    {
                                        setState(1398);
                                        match(RECORDREADER);
                                        setState(1399);
                                        ((QuerySpecificationContext) _localctx).recordReader =
                                                match(STRING);
                                    }
                                    break;
                            }
                            setState(1403);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 171, _ctx)) {
                                case 1:
                                    {
                                        setState(1402);
                                        fromClause();
                                    }
                                    break;
                            }
                            setState(1407);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 172, _ctx)) {
                                case 1:
                                    {
                                        setState(1405);
                                        match(WHERE);
                                        setState(1406);
                                        ((QuerySpecificationContext) _localctx).where =
                                                booleanExpression(0);
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        {
                            setState(1431);
                            _errHandler.sync(this);
                            switch (_input.LA(1)) {
                                case SELECT:
                                    {
                                        setState(1409);
                                        ((QuerySpecificationContext) _localctx).kind =
                                                match(SELECT);
                                        setState(1413);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                        while (_la == T__4) {
                                            {
                                                {
                                                    setState(1410);
                                                    ((QuerySpecificationContext) _localctx).hint =
                                                            hint();
                                                    ((QuerySpecificationContext) _localctx)
                                                            .hints.add(
                                                                    ((QuerySpecificationContext)
                                                                                    _localctx)
                                                                            .hint);
                                                }
                                            }
                                            setState(1415);
                                            _errHandler.sync(this);
                                            _la = _input.LA(1);
                                        }
                                        setState(1417);
                                        _errHandler.sync(this);
                                        switch (getInterpreter()
                                                .adaptivePredict(_input, 174, _ctx)) {
                                            case 1:
                                                {
                                                    setState(1416);
                                                    setQuantifier();
                                                }
                                                break;
                                        }
                                        setState(1419);
                                        namedExpressionSeq();
                                        setState(1421);
                                        _errHandler.sync(this);
                                        switch (getInterpreter()
                                                .adaptivePredict(_input, 175, _ctx)) {
                                            case 1:
                                                {
                                                    setState(1420);
                                                    fromClause();
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case FROM:
                                    {
                                        setState(1423);
                                        fromClause();
                                        setState(1429);
                                        _errHandler.sync(this);
                                        switch (getInterpreter()
                                                .adaptivePredict(_input, 177, _ctx)) {
                                            case 1:
                                                {
                                                    setState(1424);
                                                    ((QuerySpecificationContext) _localctx).kind =
                                                            match(SELECT);
                                                    setState(1426);
                                                    _errHandler.sync(this);
                                                    switch (getInterpreter()
                                                            .adaptivePredict(_input, 176, _ctx)) {
                                                        case 1:
                                                            {
                                                                setState(1425);
                                                                setQuantifier();
                                                            }
                                                            break;
                                                    }
                                                    setState(1428);
                                                    namedExpressionSeq();
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                            setState(1436);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 179, _ctx);
                            while (_alt != 2
                                    && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                                if (_alt == 1) {
                                    {
                                        {
                                            setState(1433);
                                            lateralView();
                                        }
                                    }
                                }
                                setState(1438);
                                _errHandler.sync(this);
                                _alt = getInterpreter().adaptivePredict(_input, 179, _ctx);
                            }
                            setState(1441);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 180, _ctx)) {
                                case 1:
                                    {
                                        setState(1439);
                                        match(WHERE);
                                        setState(1440);
                                        ((QuerySpecificationContext) _localctx).where =
                                                booleanExpression(0);
                                    }
                                    break;
                            }
                            setState(1444);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 181, _ctx)) {
                                case 1:
                                    {
                                        setState(1443);
                                        aggregation();
                                    }
                                    break;
                            }
                            setState(1448);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 182, _ctx)) {
                                case 1:
                                    {
                                        setState(1446);
                                        match(HAVING);
                                        setState(1447);
                                        ((QuerySpecificationContext) _localctx).having =
                                                booleanExpression(0);
                                    }
                                    break;
                            }
                            setState(1451);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 183, _ctx)) {
                                case 1:
                                    {
                                        setState(1450);
                                        windows();
                                    }
                                    break;
                            }
                        }
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class HintContext extends ParserRuleContext {
        public HintStatementContext hintStatement;
        public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();

        public List<HintStatementContext> hintStatement() {
            return getRuleContexts(HintStatementContext.class);
        }

        public HintStatementContext hintStatement(int i) {
            return getRuleContext(HintStatementContext.class, i);
        }

        public HintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_hint;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).enterHint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitHint(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitHint(this);
            else return visitor.visitChildren(this);
        }
    }

    public final HintContext hint() throws RecognitionException {
        HintContext _localctx = new HintContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_hint);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1455);
                match(T__4);
                setState(1456);
                ((HintContext) _localctx).hintStatement = hintStatement();
                ((HintContext) _localctx)
                        .hintStatements.add(((HintContext) _localctx).hintStatement);
                setState(1463);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2040L) != 0)
                        || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0)
                        || ((((_la - 128)) & ~0x3f) == 0
                                && ((1L << (_la - 128)) & -2149548029L) != 0)
                        || ((((_la - 192)) & ~0x3f) == 0
                                && ((1L << (_la - 192)) & 216454257090494463L) != 0)) {
                    {
                        {
                            setState(1458);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == T__2) {
                                {
                                    setState(1457);
                                    match(T__2);
                                }
                            }

                            setState(1460);
                            ((HintContext) _localctx).hintStatement = hintStatement();
                            ((HintContext) _localctx)
                                    .hintStatements.add(((HintContext) _localctx).hintStatement);
                        }
                    }
                    setState(1465);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1466);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class HintStatementContext extends ParserRuleContext {
        public IdentifierContext hintName;
        public PrimaryExpressionContext primaryExpression;
        public List<PrimaryExpressionContext> parameters =
                new ArrayList<PrimaryExpressionContext>();

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public List<PrimaryExpressionContext> primaryExpression() {
            return getRuleContexts(PrimaryExpressionContext.class);
        }

        public PrimaryExpressionContext primaryExpression(int i) {
            return getRuleContext(PrimaryExpressionContext.class, i);
        }

        public HintStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_hintStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterHintStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitHintStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitHintStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final HintStatementContext hintStatement() throws RecognitionException {
        HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_hintStatement);
        int _la;
        try {
            setState(1481);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 188, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1468);
                        ((HintStatementContext) _localctx).hintName = identifier();
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1469);
                        ((HintStatementContext) _localctx).hintName = identifier();
                        setState(1470);
                        match(T__0);
                        setState(1471);
                        ((HintStatementContext) _localctx).primaryExpression = primaryExpression(0);
                        ((HintStatementContext) _localctx)
                                .parameters.add(
                                        ((HintStatementContext) _localctx).primaryExpression);
                        setState(1476);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(1472);
                                    match(T__2);
                                    setState(1473);
                                    ((HintStatementContext) _localctx).primaryExpression =
                                            primaryExpression(0);
                                    ((HintStatementContext) _localctx)
                                            .parameters.add(
                                                    ((HintStatementContext) _localctx)
                                                            .primaryExpression);
                                }
                            }
                            setState(1478);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1479);
                        match(T__1);
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FromClauseContext extends ParserRuleContext {
        public TerminalNode FROM() {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public List<RelationContext> relation() {
            return getRuleContexts(RelationContext.class);
        }

        public RelationContext relation(int i) {
            return getRuleContext(RelationContext.class, i);
        }

        public List<LateralViewContext> lateralView() {
            return getRuleContexts(LateralViewContext.class);
        }

        public LateralViewContext lateralView(int i) {
            return getRuleContext(LateralViewContext.class, i);
        }

        public PivotClauseContext pivotClause() {
            return getRuleContext(PivotClauseContext.class, 0);
        }

        public FromClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fromClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterFromClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitFromClause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitFromClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FromClauseContext fromClause() throws RecognitionException {
        FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_fromClause);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1483);
                match(FROM);
                setState(1484);
                relation();
                setState(1489);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 189, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1485);
                                match(T__2);
                                setState(1486);
                                relation();
                            }
                        }
                    }
                    setState(1491);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 189, _ctx);
                }
                setState(1495);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 190, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1492);
                                lateralView();
                            }
                        }
                    }
                    setState(1497);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 190, _ctx);
                }
                setState(1499);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 191, _ctx)) {
                    case 1:
                        {
                            setState(1498);
                            pivotClause();
                        }
                        break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AggregationContext extends ParserRuleContext {
        public ExpressionContext expression;
        public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
        public Token kind;

        public TerminalNode GROUP() {
            return getToken(SqlBaseParser.GROUP, 0);
        }

        public TerminalNode BY() {
            return getToken(SqlBaseParser.BY, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode WITH() {
            return getToken(SqlBaseParser.WITH, 0);
        }

        public TerminalNode SETS() {
            return getToken(SqlBaseParser.SETS, 0);
        }

        public List<GroupingSetContext> groupingSet() {
            return getRuleContexts(GroupingSetContext.class);
        }

        public GroupingSetContext groupingSet(int i) {
            return getRuleContext(GroupingSetContext.class, i);
        }

        public TerminalNode ROLLUP() {
            return getToken(SqlBaseParser.ROLLUP, 0);
        }

        public TerminalNode CUBE() {
            return getToken(SqlBaseParser.CUBE, 0);
        }

        public TerminalNode GROUPING() {
            return getToken(SqlBaseParser.GROUPING, 0);
        }

        public AggregationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_aggregation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterAggregation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitAggregation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitAggregation(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AggregationContext aggregation() throws RecognitionException {
        AggregationContext _localctx = new AggregationContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_aggregation);
        int _la;
        try {
            int _alt;
            setState(1545);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 196, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1501);
                        match(GROUP);
                        setState(1502);
                        match(BY);
                        setState(1503);
                        ((AggregationContext) _localctx).expression = expression();
                        ((AggregationContext) _localctx)
                                .groupingExpressions.add(
                                        ((AggregationContext) _localctx).expression);
                        setState(1508);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 192, _ctx);
                        while (_alt != 2
                                && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(1504);
                                        match(T__2);
                                        setState(1505);
                                        ((AggregationContext) _localctx).expression = expression();
                                        ((AggregationContext) _localctx)
                                                .groupingExpressions.add(
                                                        ((AggregationContext) _localctx)
                                                                .expression);
                                    }
                                }
                            }
                            setState(1510);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 192, _ctx);
                        }
                        setState(1528);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 194, _ctx)) {
                            case 1:
                                {
                                    setState(1511);
                                    match(WITH);
                                    setState(1512);
                                    ((AggregationContext) _localctx).kind = match(ROLLUP);
                                }
                                break;
                            case 2:
                                {
                                    setState(1513);
                                    match(WITH);
                                    setState(1514);
                                    ((AggregationContext) _localctx).kind = match(CUBE);
                                }
                                break;
                            case 3:
                                {
                                    setState(1515);
                                    ((AggregationContext) _localctx).kind = match(GROUPING);
                                    setState(1516);
                                    match(SETS);
                                    setState(1517);
                                    match(T__0);
                                    setState(1518);
                                    groupingSet();
                                    setState(1523);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    while (_la == T__2) {
                                        {
                                            {
                                                setState(1519);
                                                match(T__2);
                                                setState(1520);
                                                groupingSet();
                                            }
                                        }
                                        setState(1525);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                    }
                                    setState(1526);
                                    match(T__1);
                                }
                                break;
                        }
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1530);
                        match(GROUP);
                        setState(1531);
                        match(BY);
                        setState(1532);
                        ((AggregationContext) _localctx).kind = match(GROUPING);
                        setState(1533);
                        match(SETS);
                        setState(1534);
                        match(T__0);
                        setState(1535);
                        groupingSet();
                        setState(1540);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(1536);
                                    match(T__2);
                                    setState(1537);
                                    groupingSet();
                                }
                            }
                            setState(1542);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1543);
                        match(T__1);
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class GroupingSetContext extends ParserRuleContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public GroupingSetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_groupingSet;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterGroupingSet(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitGroupingSet(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitGroupingSet(this);
            else return visitor.visitChildren(this);
        }
    }

    public final GroupingSetContext groupingSet() throws RecognitionException {
        GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_groupingSet);
        int _la;
        try {
            setState(1560);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 199, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1547);
                        match(T__0);
                        setState(1556);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2046L) != 0)
                                || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0)
                                || ((((_la - 128)) & ~0x3f) == 0
                                        && ((1L << (_la - 128)) & -2149475325L) != 0)
                                || ((((_la - 192)) & ~0x3f) == 0
                                        && ((1L << (_la - 192)) & 288230376151711743L) != 0)) {
                            {
                                setState(1548);
                                expression();
                                setState(1553);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == T__2) {
                                    {
                                        {
                                            setState(1549);
                                            match(T__2);
                                            setState(1550);
                                            expression();
                                        }
                                    }
                                    setState(1555);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }

                        setState(1558);
                        match(T__1);
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1559);
                        expression();
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PivotClauseContext extends ParserRuleContext {
        public NamedExpressionSeqContext aggregates;
        public PivotValueContext pivotValue;
        public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();

        public TerminalNode PIVOT() {
            return getToken(SqlBaseParser.PIVOT, 0);
        }

        public TerminalNode FOR() {
            return getToken(SqlBaseParser.FOR, 0);
        }

        public PivotColumnContext pivotColumn() {
            return getRuleContext(PivotColumnContext.class, 0);
        }

        public TerminalNode IN() {
            return getToken(SqlBaseParser.IN, 0);
        }

        public NamedExpressionSeqContext namedExpressionSeq() {
            return getRuleContext(NamedExpressionSeqContext.class, 0);
        }

        public List<PivotValueContext> pivotValue() {
            return getRuleContexts(PivotValueContext.class);
        }

        public PivotValueContext pivotValue(int i) {
            return getRuleContext(PivotValueContext.class, i);
        }

        public PivotClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pivotClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterPivotClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitPivotClause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitPivotClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PivotClauseContext pivotClause() throws RecognitionException {
        PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_pivotClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1562);
                match(PIVOT);
                setState(1563);
                match(T__0);
                setState(1564);
                ((PivotClauseContext) _localctx).aggregates = namedExpressionSeq();
                setState(1565);
                match(FOR);
                setState(1566);
                pivotColumn();
                setState(1567);
                match(IN);
                setState(1568);
                match(T__0);
                setState(1569);
                ((PivotClauseContext) _localctx).pivotValue = pivotValue();
                ((PivotClauseContext) _localctx)
                        .pivotValues.add(((PivotClauseContext) _localctx).pivotValue);
                setState(1574);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(1570);
                            match(T__2);
                            setState(1571);
                            ((PivotClauseContext) _localctx).pivotValue = pivotValue();
                            ((PivotClauseContext) _localctx)
                                    .pivotValues.add(((PivotClauseContext) _localctx).pivotValue);
                        }
                    }
                    setState(1576);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1577);
                match(T__1);
                setState(1578);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PivotColumnContext extends ParserRuleContext {
        public IdentifierContext identifier;
        public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public PivotColumnContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pivotColumn;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterPivotColumn(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitPivotColumn(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitPivotColumn(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PivotColumnContext pivotColumn() throws RecognitionException {
        PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_pivotColumn);
        int _la;
        try {
            setState(1592);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case SELECT:
                case FROM:
                case ADD:
                case AS:
                case ALL:
                case ANY:
                case DISTINCT:
                case WHERE:
                case GROUP:
                case BY:
                case GROUPING:
                case SETS:
                case CUBE:
                case ROLLUP:
                case ORDER:
                case HAVING:
                case LIMIT:
                case AT:
                case OR:
                case AND:
                case IN:
                case NOT:
                case NO:
                case EXISTS:
                case BETWEEN:
                case LIKE:
                case RLIKE:
                case IS:
                case NULL:
                case TRUE:
                case FALSE:
                case NULLS:
                case ASC:
                case DESC:
                case FOR:
                case INTERVAL:
                case CASE:
                case WHEN:
                case THEN:
                case ELSE:
                case END:
                case JOIN:
                case CROSS:
                case OUTER:
                case INNER:
                case LEFT:
                case SEMI:
                case RIGHT:
                case FULL:
                case NATURAL:
                case ON:
                case PIVOT:
                case LATERAL:
                case WINDOW:
                case OVER:
                case PARTITION:
                case RANGE:
                case ROWS:
                case UNBOUNDED:
                case PRECEDING:
                case FOLLOWING:
                case CURRENT:
                case FIRST:
                case AFTER:
                case LAST:
                case ROW:
                case WITH:
                case VALUES:
                case CREATE:
                case TABLE:
                case DIRECTORY:
                case VIEW:
                case REPLACE:
                case INSERT:
                case DELETE:
                case INTO:
                case DESCRIBE:
                case EXPLAIN:
                case FORMAT:
                case LOGICAL:
                case CODEGEN:
                case COST:
                case CAST:
                case SHOW:
                case TABLES:
                case COLUMNS:
                case COLUMN:
                case USE:
                case PARTITIONS:
                case FUNCTIONS:
                case DROP:
                case UNION:
                case EXCEPT:
                case SETMINUS:
                case INTERSECT:
                case TO:
                case TABLESAMPLE:
                case STRATIFY:
                case ALTER:
                case RENAME:
                case ARRAY:
                case MAP:
                case STRUCT:
                case COMMENT:
                case SET:
                case RESET:
                case DATA:
                case START:
                case TRANSACTION:
                case COMMIT:
                case ROLLBACK:
                case MACRO:
                case IGNORE:
                case BOTH:
                case LEADING:
                case TRAILING:
                case IF:
                case POSITION:
                case EXTRACT:
                case DIV:
                case PERCENTLIT:
                case BUCKET:
                case OUT:
                case OF:
                case SORT:
                case CLUSTER:
                case DISTRIBUTE:
                case OVERWRITE:
                case TRANSFORM:
                case REDUCE:
                case SERDE:
                case SERDEPROPERTIES:
                case RECORDREADER:
                case RECORDWRITER:
                case DELIMITED:
                case FIELDS:
                case TERMINATED:
                case COLLECTION:
                case ITEMS:
                case KEYS:
                case ESCAPED:
                case LINES:
                case SEPARATED:
                case FUNCTION:
                case EXTENDED:
                case REFRESH:
                case CLEAR:
                case CACHE:
                case UNCACHE:
                case LAZY:
                case FORMATTED:
                case GLOBAL:
                case TEMPORARY:
                case OPTIONS:
                case UNSET:
                case TBLPROPERTIES:
                case DBPROPERTIES:
                case BUCKETS:
                case SKEWED:
                case STORED:
                case DIRECTORIES:
                case LOCATION:
                case EXCHANGE:
                case ARCHIVE:
                case UNARCHIVE:
                case FILEFORMAT:
                case TOUCH:
                case COMPACT:
                case CONCATENATE:
                case CHANGE:
                case CASCADE:
                case RESTRICT:
                case CLUSTERED:
                case SORTED:
                case PURGE:
                case INPUTFORMAT:
                case OUTPUTFORMAT:
                case DATABASE:
                case DATABASES:
                case DFS:
                case TRUNCATE:
                case ANALYZE:
                case COMPUTE:
                case LIST:
                case STATISTICS:
                case PARTITIONED:
                case EXTERNAL:
                case DEFINED:
                case REVOKE:
                case GRANT:
                case LOCK:
                case UNLOCK:
                case MSCK:
                case REPAIR:
                case RECOVER:
                case EXPORT:
                case IMPORT:
                case LOAD:
                case ROLE:
                case ROLES:
                case COMPACTIONS:
                case PRINCIPALS:
                case TRANSACTIONS:
                case INDEX:
                case INDEXES:
                case LOCKS:
                case OPTION:
                case ANTI:
                case LOCAL:
                case INPATH:
                case IDENTIFIER:
                case BACKQUOTED_IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1580);
                        ((PivotColumnContext) _localctx).identifier = identifier();
                        ((PivotColumnContext) _localctx)
                                .identifiers.add(((PivotColumnContext) _localctx).identifier);
                    }
                    break;
                case T__0:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1581);
                        match(T__0);
                        setState(1582);
                        ((PivotColumnContext) _localctx).identifier = identifier();
                        ((PivotColumnContext) _localctx)
                                .identifiers.add(((PivotColumnContext) _localctx).identifier);
                        setState(1587);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(1583);
                                    match(T__2);
                                    setState(1584);
                                    ((PivotColumnContext) _localctx).identifier = identifier();
                                    ((PivotColumnContext) _localctx)
                                            .identifiers.add(
                                                    ((PivotColumnContext) _localctx).identifier);
                                }
                            }
                            setState(1589);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1590);
                        match(T__1);
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PivotValueContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public PivotValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pivotValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterPivotValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitPivotValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitPivotValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PivotValueContext pivotValue() throws RecognitionException {
        PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_pivotValue);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1594);
                expression();
                setState(1599);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2048L) != 0)
                        || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0)
                        || ((((_la - 128)) & ~0x3f) == 0
                                && ((1L << (_la - 128)) & -2149548029L) != 0)
                        || ((((_la - 192)) & ~0x3f) == 0
                                && ((1L << (_la - 192)) & 216454257090494463L) != 0)) {
                    {
                        setState(1596);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 203, _ctx)) {
                            case 1:
                                {
                                    setState(1595);
                                    match(AS);
                                }
                                break;
                        }
                        setState(1598);
                        identifier();
                    }
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LateralViewContext extends ParserRuleContext {
        public IdentifierContext tblName;
        public IdentifierContext identifier;
        public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();

        public TerminalNode LATERAL() {
            return getToken(SqlBaseParser.LATERAL, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SqlBaseParser.VIEW, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public TerminalNode OUTER() {
            return getToken(SqlBaseParser.OUTER, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public LateralViewContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lateralView;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterLateralView(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitLateralView(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitLateralView(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LateralViewContext lateralView() throws RecognitionException {
        LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_lateralView);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1601);
                match(LATERAL);
                setState(1602);
                match(VIEW);
                setState(1604);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 205, _ctx)) {
                    case 1:
                        {
                            setState(1603);
                            match(OUTER);
                        }
                        break;
                }
                setState(1606);
                qualifiedName();
                setState(1607);
                match(T__0);
                setState(1616);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2046L) != 0)
                        || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0)
                        || ((((_la - 128)) & ~0x3f) == 0
                                && ((1L << (_la - 128)) & -2149475325L) != 0)
                        || ((((_la - 192)) & ~0x3f) == 0
                                && ((1L << (_la - 192)) & 288230376151711743L) != 0)) {
                    {
                        setState(1608);
                        expression();
                        setState(1613);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(1609);
                                    match(T__2);
                                    setState(1610);
                                    expression();
                                }
                            }
                            setState(1615);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(1618);
                match(T__1);
                setState(1619);
                ((LateralViewContext) _localctx).tblName = identifier();
                setState(1631);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 210, _ctx)) {
                    case 1:
                        {
                            setState(1621);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 208, _ctx)) {
                                case 1:
                                    {
                                        setState(1620);
                                        match(AS);
                                    }
                                    break;
                            }
                            setState(1623);
                            ((LateralViewContext) _localctx).identifier = identifier();
                            ((LateralViewContext) _localctx)
                                    .colName.add(((LateralViewContext) _localctx).identifier);
                            setState(1628);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 209, _ctx);
                            while (_alt != 2
                                    && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                                if (_alt == 1) {
                                    {
                                        {
                                            setState(1624);
                                            match(T__2);
                                            setState(1625);
                                            ((LateralViewContext) _localctx).identifier =
                                                    identifier();
                                            ((LateralViewContext) _localctx)
                                                    .colName.add(
                                                            ((LateralViewContext) _localctx)
                                                                    .identifier);
                                        }
                                    }
                                }
                                setState(1630);
                                _errHandler.sync(this);
                                _alt = getInterpreter().adaptivePredict(_input, 209, _ctx);
                            }
                        }
                        break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SetQuantifierContext extends ParserRuleContext {
        public TerminalNode DISTINCT() {
            return getToken(SqlBaseParser.DISTINCT, 0);
        }

        public TerminalNode ALL() {
            return getToken(SqlBaseParser.ALL, 0);
        }

        public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_setQuantifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSetQuantifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSetQuantifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSetQuantifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SetQuantifierContext setQuantifier() throws RecognitionException {
        SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_setQuantifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1633);
                _la = _input.LA(1);
                if (!(_la == ALL || _la == DISTINCT)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RelationContext extends ParserRuleContext {
        public RelationPrimaryContext relationPrimary() {
            return getRuleContext(RelationPrimaryContext.class, 0);
        }

        public List<JoinRelationContext> joinRelation() {
            return getRuleContexts(JoinRelationContext.class);
        }

        public JoinRelationContext joinRelation(int i) {
            return getRuleContext(JoinRelationContext.class, i);
        }

        public RelationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_relation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRelation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRelation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRelation(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RelationContext relation() throws RecognitionException {
        RelationContext _localctx = new RelationContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_relation);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1635);
                relationPrimary();
                setState(1639);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 211, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1636);
                                joinRelation();
                            }
                        }
                    }
                    setState(1641);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 211, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class JoinRelationContext extends ParserRuleContext {
        public RelationPrimaryContext right;

        public TerminalNode JOIN() {
            return getToken(SqlBaseParser.JOIN, 0);
        }

        public RelationPrimaryContext relationPrimary() {
            return getRuleContext(RelationPrimaryContext.class, 0);
        }

        public JoinTypeContext joinType() {
            return getRuleContext(JoinTypeContext.class, 0);
        }

        public JoinCriteriaContext joinCriteria() {
            return getRuleContext(JoinCriteriaContext.class, 0);
        }

        public TerminalNode NATURAL() {
            return getToken(SqlBaseParser.NATURAL, 0);
        }

        public JoinRelationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_joinRelation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterJoinRelation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitJoinRelation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitJoinRelation(this);
            else return visitor.visitChildren(this);
        }
    }

    public final JoinRelationContext joinRelation() throws RecognitionException {
        JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_joinRelation);
        try {
            setState(1653);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case JOIN:
                case CROSS:
                case INNER:
                case LEFT:
                case RIGHT:
                case FULL:
                case ANTI:
                    enterOuterAlt(_localctx, 1);
                    {
                        {
                            setState(1642);
                            joinType();
                        }
                        setState(1643);
                        match(JOIN);
                        setState(1644);
                        ((JoinRelationContext) _localctx).right = relationPrimary();
                        setState(1646);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 212, _ctx)) {
                            case 1:
                                {
                                    setState(1645);
                                    joinCriteria();
                                }
                                break;
                        }
                    }
                    break;
                case NATURAL:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1648);
                        match(NATURAL);
                        setState(1649);
                        joinType();
                        setState(1650);
                        match(JOIN);
                        setState(1651);
                        ((JoinRelationContext) _localctx).right = relationPrimary();
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class JoinTypeContext extends ParserRuleContext {
        public TerminalNode INNER() {
            return getToken(SqlBaseParser.INNER, 0);
        }

        public TerminalNode CROSS() {
            return getToken(SqlBaseParser.CROSS, 0);
        }

        public TerminalNode LEFT() {
            return getToken(SqlBaseParser.LEFT, 0);
        }

        public TerminalNode OUTER() {
            return getToken(SqlBaseParser.OUTER, 0);
        }

        public TerminalNode SEMI() {
            return getToken(SqlBaseParser.SEMI, 0);
        }

        public TerminalNode RIGHT() {
            return getToken(SqlBaseParser.RIGHT, 0);
        }

        public TerminalNode FULL() {
            return getToken(SqlBaseParser.FULL, 0);
        }

        public TerminalNode ANTI() {
            return getToken(SqlBaseParser.ANTI, 0);
        }

        public JoinTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_joinType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterJoinType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitJoinType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitJoinType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final JoinTypeContext joinType() throws RecognitionException {
        JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_joinType);
        int _la;
        try {
            setState(1677);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 219, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1656);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == INNER) {
                            {
                                setState(1655);
                                match(INNER);
                            }
                        }
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1658);
                        match(CROSS);
                    }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(1659);
                        match(LEFT);
                        setState(1661);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == OUTER) {
                            {
                                setState(1660);
                                match(OUTER);
                            }
                        }
                    }
                    break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(1663);
                        match(LEFT);
                        setState(1664);
                        match(SEMI);
                    }
                    break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                    {
                        setState(1665);
                        match(RIGHT);
                        setState(1667);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == OUTER) {
                            {
                                setState(1666);
                                match(OUTER);
                            }
                        }
                    }
                    break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                    {
                        setState(1669);
                        match(FULL);
                        setState(1671);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == OUTER) {
                            {
                                setState(1670);
                                match(OUTER);
                            }
                        }
                    }
                    break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                    {
                        setState(1674);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == LEFT) {
                            {
                                setState(1673);
                                match(LEFT);
                            }
                        }

                        setState(1676);
                        match(ANTI);
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class JoinCriteriaContext extends ParserRuleContext {
        public TerminalNode ON() {
            return getToken(SqlBaseParser.ON, 0);
        }

        public BooleanExpressionContext booleanExpression() {
            return getRuleContext(BooleanExpressionContext.class, 0);
        }

        public TerminalNode USING() {
            return getToken(SqlBaseParser.USING, 0);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_joinCriteria;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterJoinCriteria(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitJoinCriteria(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitJoinCriteria(this);
            else return visitor.visitChildren(this);
        }
    }

    public final JoinCriteriaContext joinCriteria() throws RecognitionException {
        JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
        enterRule(_localctx, 104, RULE_joinCriteria);
        int _la;
        try {
            setState(1693);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ON:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1679);
                        match(ON);
                        setState(1680);
                        booleanExpression(0);
                    }
                    break;
                case USING:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1681);
                        match(USING);
                        setState(1682);
                        match(T__0);
                        setState(1683);
                        identifier();
                        setState(1688);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(1684);
                                    match(T__2);
                                    setState(1685);
                                    identifier();
                                }
                            }
                            setState(1690);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1691);
                        match(T__1);
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SampleContext extends ParserRuleContext {
        public TerminalNode TABLESAMPLE() {
            return getToken(SqlBaseParser.TABLESAMPLE, 0);
        }

        public SampleMethodContext sampleMethod() {
            return getRuleContext(SampleMethodContext.class, 0);
        }

        public SampleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sample;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).enterSample(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitSample(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSample(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SampleContext sample() throws RecognitionException {
        SampleContext _localctx = new SampleContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_sample);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1695);
                match(TABLESAMPLE);
                setState(1696);
                match(T__0);
                setState(1698);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2046L) != 0)
                        || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0)
                        || ((((_la - 128)) & ~0x3f) == 0
                                && ((1L << (_la - 128)) & -2149475325L) != 0)
                        || ((((_la - 192)) & ~0x3f) == 0
                                && ((1L << (_la - 192)) & 288230376151711743L) != 0)) {
                    {
                        setState(1697);
                        sampleMethod();
                    }
                }

                setState(1700);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SampleMethodContext extends ParserRuleContext {
        public SampleMethodContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sampleMethod;
        }

        public SampleMethodContext() {}

        public void copyFrom(SampleMethodContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SampleByRowsContext extends SampleMethodContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode ROWS() {
            return getToken(SqlBaseParser.ROWS, 0);
        }

        public SampleByRowsContext(SampleMethodContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSampleByRows(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSampleByRows(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSampleByRows(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SampleByPercentileContext extends SampleMethodContext {
        public Token negativeSign;
        public Token percentage;

        public TerminalNode PERCENTLIT() {
            return getToken(SqlBaseParser.PERCENTLIT, 0);
        }

        public TerminalNode INTEGER_VALUE() {
            return getToken(SqlBaseParser.INTEGER_VALUE, 0);
        }

        public TerminalNode DECIMAL_VALUE() {
            return getToken(SqlBaseParser.DECIMAL_VALUE, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SqlBaseParser.MINUS, 0);
        }

        public SampleByPercentileContext(SampleMethodContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSampleByPercentile(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSampleByPercentile(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSampleByPercentile(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SampleByBucketContext extends SampleMethodContext {
        public Token sampleType;
        public Token numerator;
        public Token denominator;

        public TerminalNode OUT() {
            return getToken(SqlBaseParser.OUT, 0);
        }

        public TerminalNode OF() {
            return getToken(SqlBaseParser.OF, 0);
        }

        public TerminalNode BUCKET() {
            return getToken(SqlBaseParser.BUCKET, 0);
        }

        public List<TerminalNode> INTEGER_VALUE() {
            return getTokens(SqlBaseParser.INTEGER_VALUE);
        }

        public TerminalNode INTEGER_VALUE(int i) {
            return getToken(SqlBaseParser.INTEGER_VALUE, i);
        }

        public TerminalNode ON() {
            return getToken(SqlBaseParser.ON, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public SampleByBucketContext(SampleMethodContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSampleByBucket(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSampleByBucket(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSampleByBucket(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SampleByBytesContext extends SampleMethodContext {
        public ExpressionContext bytes;

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public SampleByBytesContext(SampleMethodContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSampleByBytes(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSampleByBytes(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSampleByBytes(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SampleMethodContext sampleMethod() throws RecognitionException {
        SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_sampleMethod);
        int _la;
        try {
            setState(1726);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 226, _ctx)) {
                case 1:
                    _localctx = new SampleByPercentileContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1703);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(1702);
                                ((SampleByPercentileContext) _localctx).negativeSign = match(MINUS);
                            }
                        }

                        setState(1705);
                        ((SampleByPercentileContext) _localctx).percentage = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == INTEGER_VALUE || _la == DECIMAL_VALUE)) {
                            ((SampleByPercentileContext) _localctx).percentage =
                                    (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1706);
                        match(PERCENTLIT);
                    }
                    break;
                case 2:
                    _localctx = new SampleByRowsContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1707);
                        expression();
                        setState(1708);
                        match(ROWS);
                    }
                    break;
                case 3:
                    _localctx = new SampleByBucketContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(1710);
                        ((SampleByBucketContext) _localctx).sampleType = match(BUCKET);
                        setState(1711);
                        ((SampleByBucketContext) _localctx).numerator = match(INTEGER_VALUE);
                        setState(1712);
                        match(OUT);
                        setState(1713);
                        match(OF);
                        setState(1714);
                        ((SampleByBucketContext) _localctx).denominator = match(INTEGER_VALUE);
                        setState(1723);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == ON) {
                            {
                                setState(1715);
                                match(ON);
                                setState(1721);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 224, _ctx)) {
                                    case 1:
                                        {
                                            setState(1716);
                                            identifier();
                                        }
                                        break;
                                    case 2:
                                        {
                                            setState(1717);
                                            qualifiedName();
                                            setState(1718);
                                            match(T__0);
                                            setState(1719);
                                            match(T__1);
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    _localctx = new SampleByBytesContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(1725);
                        ((SampleByBytesContext) _localctx).bytes = expression();
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IdentifierListContext extends ParserRuleContext {
        public IdentifierSeqContext identifierSeq() {
            return getRuleContext(IdentifierSeqContext.class, 0);
        }

        public IdentifierListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifierList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterIdentifierList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitIdentifierList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitIdentifierList(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IdentifierListContext identifierList() throws RecognitionException {
        IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_identifierList);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1728);
                match(T__0);
                setState(1729);
                identifierSeq();
                setState(1730);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IdentifierSeqContext extends ParserRuleContext {
        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifierSeq;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterIdentifierSeq(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitIdentifierSeq(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitIdentifierSeq(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IdentifierSeqContext identifierSeq() throws RecognitionException {
        IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_identifierSeq);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1732);
                identifier();
                setState(1737);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 227, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1733);
                                match(T__2);
                                setState(1734);
                                identifier();
                            }
                        }
                    }
                    setState(1739);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 227, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class OrderedIdentifierListContext extends ParserRuleContext {
        public List<OrderedIdentifierContext> orderedIdentifier() {
            return getRuleContexts(OrderedIdentifierContext.class);
        }

        public OrderedIdentifierContext orderedIdentifier(int i) {
            return getRuleContext(OrderedIdentifierContext.class, i);
        }

        public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_orderedIdentifierList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterOrderedIdentifierList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitOrderedIdentifierList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitOrderedIdentifierList(this);
            else return visitor.visitChildren(this);
        }
    }

    public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
        OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_orderedIdentifierList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1740);
                match(T__0);
                setState(1741);
                orderedIdentifier();
                setState(1746);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(1742);
                            match(T__2);
                            setState(1743);
                            orderedIdentifier();
                        }
                    }
                    setState(1748);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1749);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class OrderedIdentifierContext extends ParserRuleContext {
        public Token ordering;

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode ASC() {
            return getToken(SqlBaseParser.ASC, 0);
        }

        public TerminalNode DESC() {
            return getToken(SqlBaseParser.DESC, 0);
        }

        public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_orderedIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterOrderedIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitOrderedIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitOrderedIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
        OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_orderedIdentifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1751);
                identifier();
                setState(1753);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ASC || _la == DESC) {
                    {
                        setState(1752);
                        ((OrderedIdentifierContext) _localctx).ordering = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == ASC || _la == DESC)) {
                            ((OrderedIdentifierContext) _localctx).ordering =
                                    (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IdentifierCommentListContext extends ParserRuleContext {
        public List<IdentifierCommentContext> identifierComment() {
            return getRuleContexts(IdentifierCommentContext.class);
        }

        public IdentifierCommentContext identifierComment(int i) {
            return getRuleContext(IdentifierCommentContext.class, i);
        }

        public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifierCommentList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterIdentifierCommentList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitIdentifierCommentList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitIdentifierCommentList(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
        IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_identifierCommentList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1755);
                match(T__0);
                setState(1756);
                identifierComment();
                setState(1761);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(1757);
                            match(T__2);
                            setState(1758);
                            identifierComment();
                        }
                    }
                    setState(1763);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1764);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IdentifierCommentContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(SqlBaseParser.COMMENT, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifierComment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterIdentifierComment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitIdentifierComment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitIdentifierComment(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IdentifierCommentContext identifierComment() throws RecognitionException {
        IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_identifierComment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1766);
                identifier();
                setState(1769);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == COMMENT) {
                    {
                        setState(1767);
                        match(COMMENT);
                        setState(1768);
                        match(STRING);
                    }
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RelationPrimaryContext extends ParserRuleContext {
        public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_relationPrimary;
        }

        public RelationPrimaryContext() {}

        public void copyFrom(RelationPrimaryContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TableValuedFunctionContext extends RelationPrimaryContext {
        public FunctionTableContext functionTable() {
            return getRuleContext(FunctionTableContext.class, 0);
        }

        public TableValuedFunctionContext(RelationPrimaryContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTableValuedFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTableValuedFunction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTableValuedFunction(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class InlineTableDefault2Context extends RelationPrimaryContext {
        public InlineTableContext inlineTable() {
            return getRuleContext(InlineTableContext.class, 0);
        }

        public InlineTableDefault2Context(RelationPrimaryContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterInlineTableDefault2(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitInlineTableDefault2(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitInlineTableDefault2(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AliasedRelationContext extends RelationPrimaryContext {
        public RelationContext relation() {
            return getRuleContext(RelationContext.class, 0);
        }

        public TableAliasContext tableAlias() {
            return getRuleContext(TableAliasContext.class, 0);
        }

        public SampleContext sample() {
            return getRuleContext(SampleContext.class, 0);
        }

        public AliasedRelationContext(RelationPrimaryContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterAliasedRelation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitAliasedRelation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitAliasedRelation(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AliasedQueryContext extends RelationPrimaryContext {
        public QueryNoWithContext queryNoWith() {
            return getRuleContext(QueryNoWithContext.class, 0);
        }

        public TableAliasContext tableAlias() {
            return getRuleContext(TableAliasContext.class, 0);
        }

        public SampleContext sample() {
            return getRuleContext(SampleContext.class, 0);
        }

        public AliasedQueryContext(RelationPrimaryContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterAliasedQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitAliasedQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitAliasedQuery(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TableNameContext extends RelationPrimaryContext {
        public TableIdentifierContext tableIdentifier() {
            return getRuleContext(TableIdentifierContext.class, 0);
        }

        public TableAliasContext tableAlias() {
            return getRuleContext(TableAliasContext.class, 0);
        }

        public SampleContext sample() {
            return getRuleContext(SampleContext.class, 0);
        }

        public TableNameContext(RelationPrimaryContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTableName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTableName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTableName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RelationPrimaryContext relationPrimary() throws RecognitionException {
        RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_relationPrimary);
        try {
            setState(1795);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 235, _ctx)) {
                case 1:
                    _localctx = new TableNameContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1771);
                        tableIdentifier();
                        setState(1773);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 232, _ctx)) {
                            case 1:
                                {
                                    setState(1772);
                                    sample();
                                }
                                break;
                        }
                        setState(1775);
                        tableAlias();
                    }
                    break;
                case 2:
                    _localctx = new AliasedQueryContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1777);
                        match(T__0);
                        setState(1778);
                        queryNoWith();
                        setState(1779);
                        match(T__1);
                        setState(1781);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 233, _ctx)) {
                            case 1:
                                {
                                    setState(1780);
                                    sample();
                                }
                                break;
                        }
                        setState(1783);
                        tableAlias();
                    }
                    break;
                case 3:
                    _localctx = new AliasedRelationContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(1785);
                        match(T__0);
                        setState(1786);
                        relation();
                        setState(1787);
                        match(T__1);
                        setState(1789);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 234, _ctx)) {
                            case 1:
                                {
                                    setState(1788);
                                    sample();
                                }
                                break;
                        }
                        setState(1791);
                        tableAlias();
                    }
                    break;
                case 4:
                    _localctx = new InlineTableDefault2Context(_localctx);
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(1793);
                        inlineTable();
                    }
                    break;
                case 5:
                    _localctx = new TableValuedFunctionContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                    {
                        setState(1794);
                        functionTable();
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class InlineTableContext extends ParserRuleContext {
        public TerminalNode VALUES() {
            return getToken(SqlBaseParser.VALUES, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TableAliasContext tableAlias() {
            return getRuleContext(TableAliasContext.class, 0);
        }

        public InlineTableContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_inlineTable;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterInlineTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitInlineTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitInlineTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public final InlineTableContext inlineTable() throws RecognitionException {
        InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_inlineTable);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1797);
                match(VALUES);
                setState(1798);
                expression();
                setState(1803);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 236, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1799);
                                match(T__2);
                                setState(1800);
                                expression();
                            }
                        }
                    }
                    setState(1805);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 236, _ctx);
                }
                setState(1806);
                tableAlias();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FunctionTableContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TableAliasContext tableAlias() {
            return getRuleContext(TableAliasContext.class, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public FunctionTableContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionTable;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterFunctionTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitFunctionTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitFunctionTable(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunctionTableContext functionTable() throws RecognitionException {
        FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_functionTable);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1808);
                identifier();
                setState(1809);
                match(T__0);
                setState(1818);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2046L) != 0)
                        || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0)
                        || ((((_la - 128)) & ~0x3f) == 0
                                && ((1L << (_la - 128)) & -2149475325L) != 0)
                        || ((((_la - 192)) & ~0x3f) == 0
                                && ((1L << (_la - 192)) & 288230376151711743L) != 0)) {
                    {
                        setState(1810);
                        expression();
                        setState(1815);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(1811);
                                    match(T__2);
                                    setState(1812);
                                    expression();
                                }
                            }
                            setState(1817);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(1820);
                match(T__1);
                setState(1821);
                tableAlias();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TableAliasContext extends ParserRuleContext {
        public StrictIdentifierContext strictIdentifier() {
            return getRuleContext(StrictIdentifierContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public IdentifierListContext identifierList() {
            return getRuleContext(IdentifierListContext.class, 0);
        }

        public TableAliasContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableAlias;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTableAlias(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTableAlias(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTableAlias(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TableAliasContext tableAlias() throws RecognitionException {
        TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_tableAlias);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1830);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 241, _ctx)) {
                    case 1:
                        {
                            setState(1824);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 239, _ctx)) {
                                case 1:
                                    {
                                        setState(1823);
                                        match(AS);
                                    }
                                    break;
                            }
                            setState(1826);
                            strictIdentifier();
                            setState(1828);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 240, _ctx)) {
                                case 1:
                                    {
                                        setState(1827);
                                        identifierList();
                                    }
                                    break;
                            }
                        }
                        break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RowFormatContext extends ParserRuleContext {
        public RowFormatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rowFormat;
        }

        public RowFormatContext() {}

        public void copyFrom(RowFormatContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RowFormatSerdeContext extends RowFormatContext {
        public Token name;
        public TablePropertyListContext props;

        public TerminalNode ROW() {
            return getToken(SqlBaseParser.ROW, 0);
        }

        public TerminalNode FORMAT() {
            return getToken(SqlBaseParser.FORMAT, 0);
        }

        public TerminalNode SERDE() {
            return getToken(SqlBaseParser.SERDE, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public TerminalNode WITH() {
            return getToken(SqlBaseParser.WITH, 0);
        }

        public TerminalNode SERDEPROPERTIES() {
            return getToken(SqlBaseParser.SERDEPROPERTIES, 0);
        }

        public TablePropertyListContext tablePropertyList() {
            return getRuleContext(TablePropertyListContext.class, 0);
        }

        public RowFormatSerdeContext(RowFormatContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRowFormatSerde(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRowFormatSerde(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRowFormatSerde(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RowFormatDelimitedContext extends RowFormatContext {
        public Token fieldsTerminatedBy;
        public Token escapedBy;
        public Token collectionItemsTerminatedBy;
        public Token keysTerminatedBy;
        public Token linesSeparatedBy;
        public Token nullDefinedAs;

        public TerminalNode ROW() {
            return getToken(SqlBaseParser.ROW, 0);
        }

        public TerminalNode FORMAT() {
            return getToken(SqlBaseParser.FORMAT, 0);
        }

        public TerminalNode DELIMITED() {
            return getToken(SqlBaseParser.DELIMITED, 0);
        }

        public TerminalNode FIELDS() {
            return getToken(SqlBaseParser.FIELDS, 0);
        }

        public List<TerminalNode> TERMINATED() {
            return getTokens(SqlBaseParser.TERMINATED);
        }

        public TerminalNode TERMINATED(int i) {
            return getToken(SqlBaseParser.TERMINATED, i);
        }

        public List<TerminalNode> BY() {
            return getTokens(SqlBaseParser.BY);
        }

        public TerminalNode BY(int i) {
            return getToken(SqlBaseParser.BY, i);
        }

        public TerminalNode COLLECTION() {
            return getToken(SqlBaseParser.COLLECTION, 0);
        }

        public TerminalNode ITEMS() {
            return getToken(SqlBaseParser.ITEMS, 0);
        }

        public TerminalNode MAP() {
            return getToken(SqlBaseParser.MAP, 0);
        }

        public TerminalNode KEYS() {
            return getToken(SqlBaseParser.KEYS, 0);
        }

        public TerminalNode LINES() {
            return getToken(SqlBaseParser.LINES, 0);
        }

        public TerminalNode NULL() {
            return getToken(SqlBaseParser.NULL, 0);
        }

        public TerminalNode DEFINED() {
            return getToken(SqlBaseParser.DEFINED, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public List<TerminalNode> STRING() {
            return getTokens(SqlBaseParser.STRING);
        }

        public TerminalNode STRING(int i) {
            return getToken(SqlBaseParser.STRING, i);
        }

        public TerminalNode ESCAPED() {
            return getToken(SqlBaseParser.ESCAPED, 0);
        }

        public RowFormatDelimitedContext(RowFormatContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRowFormatDelimited(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRowFormatDelimited(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRowFormatDelimited(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RowFormatContext rowFormat() throws RecognitionException {
        RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_rowFormat);
        try {
            setState(1881);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 249, _ctx)) {
                case 1:
                    _localctx = new RowFormatSerdeContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1832);
                        match(ROW);
                        setState(1833);
                        match(FORMAT);
                        setState(1834);
                        match(SERDE);
                        setState(1835);
                        ((RowFormatSerdeContext) _localctx).name = match(STRING);
                        setState(1839);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 242, _ctx)) {
                            case 1:
                                {
                                    setState(1836);
                                    match(WITH);
                                    setState(1837);
                                    match(SERDEPROPERTIES);
                                    setState(1838);
                                    ((RowFormatSerdeContext) _localctx).props = tablePropertyList();
                                }
                                break;
                        }
                    }
                    break;
                case 2:
                    _localctx = new RowFormatDelimitedContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1841);
                        match(ROW);
                        setState(1842);
                        match(FORMAT);
                        setState(1843);
                        match(DELIMITED);
                        setState(1853);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 244, _ctx)) {
                            case 1:
                                {
                                    setState(1844);
                                    match(FIELDS);
                                    setState(1845);
                                    match(TERMINATED);
                                    setState(1846);
                                    match(BY);
                                    setState(1847);
                                    ((RowFormatDelimitedContext) _localctx).fieldsTerminatedBy =
                                            match(STRING);
                                    setState(1851);
                                    _errHandler.sync(this);
                                    switch (getInterpreter().adaptivePredict(_input, 243, _ctx)) {
                                        case 1:
                                            {
                                                setState(1848);
                                                match(ESCAPED);
                                                setState(1849);
                                                match(BY);
                                                setState(1850);
                                                ((RowFormatDelimitedContext) _localctx).escapedBy =
                                                        match(STRING);
                                            }
                                            break;
                                    }
                                }
                                break;
                        }
                        setState(1860);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 245, _ctx)) {
                            case 1:
                                {
                                    setState(1855);
                                    match(COLLECTION);
                                    setState(1856);
                                    match(ITEMS);
                                    setState(1857);
                                    match(TERMINATED);
                                    setState(1858);
                                    match(BY);
                                    setState(1859);
                                    ((RowFormatDelimitedContext) _localctx)
                                                    .collectionItemsTerminatedBy =
                                            match(STRING);
                                }
                                break;
                        }
                        setState(1867);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 246, _ctx)) {
                            case 1:
                                {
                                    setState(1862);
                                    match(MAP);
                                    setState(1863);
                                    match(KEYS);
                                    setState(1864);
                                    match(TERMINATED);
                                    setState(1865);
                                    match(BY);
                                    setState(1866);
                                    ((RowFormatDelimitedContext) _localctx).keysTerminatedBy =
                                            match(STRING);
                                }
                                break;
                        }
                        setState(1873);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 247, _ctx)) {
                            case 1:
                                {
                                    setState(1869);
                                    match(LINES);
                                    setState(1870);
                                    match(TERMINATED);
                                    setState(1871);
                                    match(BY);
                                    setState(1872);
                                    ((RowFormatDelimitedContext) _localctx).linesSeparatedBy =
                                            match(STRING);
                                }
                                break;
                        }
                        setState(1879);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 248, _ctx)) {
                            case 1:
                                {
                                    setState(1875);
                                    match(NULL);
                                    setState(1876);
                                    match(DEFINED);
                                    setState(1877);
                                    match(AS);
                                    setState(1878);
                                    ((RowFormatDelimitedContext) _localctx).nullDefinedAs =
                                            match(STRING);
                                }
                                break;
                        }
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TableIdentifierContext extends ParserRuleContext {
        public IdentifierContext db;
        public IdentifierContext table;

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tableIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTableIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTableIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTableIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TableIdentifierContext tableIdentifier() throws RecognitionException {
        TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
        enterRule(_localctx, 132, RULE_tableIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1886);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 250, _ctx)) {
                    case 1:
                        {
                            setState(1883);
                            ((TableIdentifierContext) _localctx).db = identifier();
                            setState(1884);
                            match(T__3);
                        }
                        break;
                }
                setState(1888);
                ((TableIdentifierContext) _localctx).table = identifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FunctionIdentifierContext extends ParserRuleContext {
        public IdentifierContext db;
        public IdentifierContext function;

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterFunctionIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitFunctionIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitFunctionIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
        FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
        enterRule(_localctx, 134, RULE_functionIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1893);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 251, _ctx)) {
                    case 1:
                        {
                            setState(1890);
                            ((FunctionIdentifierContext) _localctx).db = identifier();
                            setState(1891);
                            match(T__3);
                        }
                        break;
                }
                setState(1895);
                ((FunctionIdentifierContext) _localctx).function = identifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class NamedExpressionContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public IdentifierListContext identifierList() {
            return getRuleContext(IdentifierListContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_namedExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNamedExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNamedExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNamedExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NamedExpressionContext namedExpression() throws RecognitionException {
        NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
        enterRule(_localctx, 136, RULE_namedExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1897);
                expression();
                setState(1905);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 254, _ctx)) {
                    case 1:
                        {
                            setState(1899);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 252, _ctx)) {
                                case 1:
                                    {
                                        setState(1898);
                                        match(AS);
                                    }
                                    break;
                            }
                            setState(1903);
                            _errHandler.sync(this);
                            switch (_input.LA(1)) {
                                case SELECT:
                                case FROM:
                                case ADD:
                                case AS:
                                case ALL:
                                case ANY:
                                case DISTINCT:
                                case WHERE:
                                case GROUP:
                                case BY:
                                case GROUPING:
                                case SETS:
                                case CUBE:
                                case ROLLUP:
                                case ORDER:
                                case HAVING:
                                case LIMIT:
                                case AT:
                                case OR:
                                case AND:
                                case IN:
                                case NOT:
                                case NO:
                                case EXISTS:
                                case BETWEEN:
                                case LIKE:
                                case RLIKE:
                                case IS:
                                case NULL:
                                case TRUE:
                                case FALSE:
                                case NULLS:
                                case ASC:
                                case DESC:
                                case FOR:
                                case INTERVAL:
                                case CASE:
                                case WHEN:
                                case THEN:
                                case ELSE:
                                case END:
                                case JOIN:
                                case CROSS:
                                case OUTER:
                                case INNER:
                                case LEFT:
                                case SEMI:
                                case RIGHT:
                                case FULL:
                                case NATURAL:
                                case ON:
                                case PIVOT:
                                case LATERAL:
                                case WINDOW:
                                case OVER:
                                case PARTITION:
                                case RANGE:
                                case ROWS:
                                case UNBOUNDED:
                                case PRECEDING:
                                case FOLLOWING:
                                case CURRENT:
                                case FIRST:
                                case AFTER:
                                case LAST:
                                case ROW:
                                case WITH:
                                case VALUES:
                                case CREATE:
                                case TABLE:
                                case DIRECTORY:
                                case VIEW:
                                case REPLACE:
                                case INSERT:
                                case DELETE:
                                case INTO:
                                case DESCRIBE:
                                case EXPLAIN:
                                case FORMAT:
                                case LOGICAL:
                                case CODEGEN:
                                case COST:
                                case CAST:
                                case SHOW:
                                case TABLES:
                                case COLUMNS:
                                case COLUMN:
                                case USE:
                                case PARTITIONS:
                                case FUNCTIONS:
                                case DROP:
                                case UNION:
                                case EXCEPT:
                                case SETMINUS:
                                case INTERSECT:
                                case TO:
                                case TABLESAMPLE:
                                case STRATIFY:
                                case ALTER:
                                case RENAME:
                                case ARRAY:
                                case MAP:
                                case STRUCT:
                                case COMMENT:
                                case SET:
                                case RESET:
                                case DATA:
                                case START:
                                case TRANSACTION:
                                case COMMIT:
                                case ROLLBACK:
                                case MACRO:
                                case IGNORE:
                                case BOTH:
                                case LEADING:
                                case TRAILING:
                                case IF:
                                case POSITION:
                                case EXTRACT:
                                case DIV:
                                case PERCENTLIT:
                                case BUCKET:
                                case OUT:
                                case OF:
                                case SORT:
                                case CLUSTER:
                                case DISTRIBUTE:
                                case OVERWRITE:
                                case TRANSFORM:
                                case REDUCE:
                                case SERDE:
                                case SERDEPROPERTIES:
                                case RECORDREADER:
                                case RECORDWRITER:
                                case DELIMITED:
                                case FIELDS:
                                case TERMINATED:
                                case COLLECTION:
                                case ITEMS:
                                case KEYS:
                                case ESCAPED:
                                case LINES:
                                case SEPARATED:
                                case FUNCTION:
                                case EXTENDED:
                                case REFRESH:
                                case CLEAR:
                                case CACHE:
                                case UNCACHE:
                                case LAZY:
                                case FORMATTED:
                                case GLOBAL:
                                case TEMPORARY:
                                case OPTIONS:
                                case UNSET:
                                case TBLPROPERTIES:
                                case DBPROPERTIES:
                                case BUCKETS:
                                case SKEWED:
                                case STORED:
                                case DIRECTORIES:
                                case LOCATION:
                                case EXCHANGE:
                                case ARCHIVE:
                                case UNARCHIVE:
                                case FILEFORMAT:
                                case TOUCH:
                                case COMPACT:
                                case CONCATENATE:
                                case CHANGE:
                                case CASCADE:
                                case RESTRICT:
                                case CLUSTERED:
                                case SORTED:
                                case PURGE:
                                case INPUTFORMAT:
                                case OUTPUTFORMAT:
                                case DATABASE:
                                case DATABASES:
                                case DFS:
                                case TRUNCATE:
                                case ANALYZE:
                                case COMPUTE:
                                case LIST:
                                case STATISTICS:
                                case PARTITIONED:
                                case EXTERNAL:
                                case DEFINED:
                                case REVOKE:
                                case GRANT:
                                case LOCK:
                                case UNLOCK:
                                case MSCK:
                                case REPAIR:
                                case RECOVER:
                                case EXPORT:
                                case IMPORT:
                                case LOAD:
                                case ROLE:
                                case ROLES:
                                case COMPACTIONS:
                                case PRINCIPALS:
                                case TRANSACTIONS:
                                case INDEX:
                                case INDEXES:
                                case LOCKS:
                                case OPTION:
                                case ANTI:
                                case LOCAL:
                                case INPATH:
                                case IDENTIFIER:
                                case BACKQUOTED_IDENTIFIER:
                                    {
                                        setState(1901);
                                        identifier();
                                    }
                                    break;
                                case T__0:
                                    {
                                        setState(1902);
                                        identifierList();
                                    }
                                    break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                        }
                        break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class NamedExpressionSeqContext extends ParserRuleContext {
        public List<NamedExpressionContext> namedExpression() {
            return getRuleContexts(NamedExpressionContext.class);
        }

        public NamedExpressionContext namedExpression(int i) {
            return getRuleContext(NamedExpressionContext.class, i);
        }

        public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_namedExpressionSeq;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNamedExpressionSeq(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNamedExpressionSeq(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNamedExpressionSeq(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
        NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
        enterRule(_localctx, 138, RULE_namedExpressionSeq);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1907);
                namedExpression();
                setState(1912);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 255, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1908);
                                match(T__2);
                                setState(1909);
                                namedExpression();
                            }
                        }
                    }
                    setState(1914);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 255, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExpressionContext extends ParserRuleContext {
        public BooleanExpressionContext booleanExpression() {
            return getRuleContext(BooleanExpressionContext.class, 0);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 140, RULE_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1915);
                booleanExpression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BooleanExpressionContext extends ParserRuleContext {
        public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_booleanExpression;
        }

        public BooleanExpressionContext() {}

        public void copyFrom(BooleanExpressionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LogicalNotContext extends BooleanExpressionContext {
        public TerminalNode NOT() {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public BooleanExpressionContext booleanExpression() {
            return getRuleContext(BooleanExpressionContext.class, 0);
        }

        public LogicalNotContext(BooleanExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterLogicalNot(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitLogicalNot(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitLogicalNot(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PredicatedContext extends BooleanExpressionContext {
        public ValueExpressionContext valueExpression() {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public PredicateContext predicate() {
            return getRuleContext(PredicateContext.class, 0);
        }

        public PredicatedContext(BooleanExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterPredicated(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitPredicated(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitPredicated(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExistsContext extends BooleanExpressionContext {
        public TerminalNode EXISTS() {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public ExistsContext(BooleanExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).enterExists(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitExists(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitExists(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LogicalBinaryContext extends BooleanExpressionContext {
        public BooleanExpressionContext left;
        public Token operator;
        public BooleanExpressionContext right;

        public List<BooleanExpressionContext> booleanExpression() {
            return getRuleContexts(BooleanExpressionContext.class);
        }

        public BooleanExpressionContext booleanExpression(int i) {
            return getRuleContext(BooleanExpressionContext.class, i);
        }

        public TerminalNode AND() {
            return getToken(SqlBaseParser.AND, 0);
        }

        public TerminalNode OR() {
            return getToken(SqlBaseParser.OR, 0);
        }

        public LogicalBinaryContext(BooleanExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterLogicalBinary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitLogicalBinary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitLogicalBinary(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BooleanExpressionContext booleanExpression() throws RecognitionException {
        return booleanExpression(0);
    }

    private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
        BooleanExpressionContext _prevctx = _localctx;
        int _startState = 142;
        enterRecursionRule(_localctx, 142, RULE_booleanExpression, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1929);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 257, _ctx)) {
                    case 1:
                        {
                            _localctx = new LogicalNotContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;

                            setState(1918);
                            match(NOT);
                            setState(1919);
                            booleanExpression(5);
                        }
                        break;
                    case 2:
                        {
                            _localctx = new ExistsContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(1920);
                            match(EXISTS);
                            setState(1921);
                            match(T__0);
                            setState(1922);
                            query();
                            setState(1923);
                            match(T__1);
                        }
                        break;
                    case 3:
                        {
                            _localctx = new PredicatedContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(1925);
                            valueExpression(0);
                            setState(1927);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 256, _ctx)) {
                                case 1:
                                    {
                                        setState(1926);
                                        predicate();
                                    }
                                    break;
                            }
                        }
                        break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1939);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 259, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1937);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 258, _ctx)) {
                                case 1:
                                    {
                                        _localctx =
                                                new LogicalBinaryContext(
                                                        new BooleanExpressionContext(
                                                                _parentctx, _parentState));
                                        ((LogicalBinaryContext) _localctx).left = _prevctx;
                                        pushNewRecursionContext(
                                                _localctx, _startState, RULE_booleanExpression);
                                        setState(1931);
                                        if (!(precpred(_ctx, 2)))
                                            throw new FailedPredicateException(
                                                    this, "precpred(_ctx, 2)");
                                        setState(1932);
                                        ((LogicalBinaryContext) _localctx).operator = match(AND);
                                        setState(1933);
                                        ((LogicalBinaryContext) _localctx).right =
                                                booleanExpression(3);
                                    }
                                    break;
                                case 2:
                                    {
                                        _localctx =
                                                new LogicalBinaryContext(
                                                        new BooleanExpressionContext(
                                                                _parentctx, _parentState));
                                        ((LogicalBinaryContext) _localctx).left = _prevctx;
                                        pushNewRecursionContext(
                                                _localctx, _startState, RULE_booleanExpression);
                                        setState(1934);
                                        if (!(precpred(_ctx, 1)))
                                            throw new FailedPredicateException(
                                                    this, "precpred(_ctx, 1)");
                                        setState(1935);
                                        ((LogicalBinaryContext) _localctx).operator = match(OR);
                                        setState(1936);
                                        ((LogicalBinaryContext) _localctx).right =
                                                booleanExpression(2);
                                    }
                                    break;
                            }
                        }
                    }
                    setState(1941);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 259, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PredicateContext extends ParserRuleContext {
        public Token kind;
        public ValueExpressionContext lower;
        public ValueExpressionContext upper;
        public ValueExpressionContext pattern;
        public ValueExpressionContext right;

        public TerminalNode AND() {
            return getToken(SqlBaseParser.AND, 0);
        }

        public TerminalNode BETWEEN() {
            return getToken(SqlBaseParser.BETWEEN, 0);
        }

        public List<ValueExpressionContext> valueExpression() {
            return getRuleContexts(ValueExpressionContext.class);
        }

        public ValueExpressionContext valueExpression(int i) {
            return getRuleContext(ValueExpressionContext.class, i);
        }

        public TerminalNode NOT() {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode IN() {
            return getToken(SqlBaseParser.IN, 0);
        }

        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public TerminalNode RLIKE() {
            return getToken(SqlBaseParser.RLIKE, 0);
        }

        public TerminalNode LIKE() {
            return getToken(SqlBaseParser.LIKE, 0);
        }

        public TerminalNode IS() {
            return getToken(SqlBaseParser.IS, 0);
        }

        public TerminalNode NULL() {
            return getToken(SqlBaseParser.NULL, 0);
        }

        public TerminalNode FROM() {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public TerminalNode DISTINCT() {
            return getToken(SqlBaseParser.DISTINCT, 0);
        }

        public PredicateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_predicate;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterPredicate(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitPredicate(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitPredicate(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PredicateContext predicate() throws RecognitionException {
        PredicateContext _localctx = new PredicateContext(_ctx, getState());
        enterRule(_localctx, 144, RULE_predicate);
        int _la;
        try {
            setState(1990);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 267, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1943);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == NOT) {
                            {
                                setState(1942);
                                match(NOT);
                            }
                        }

                        setState(1945);
                        ((PredicateContext) _localctx).kind = match(BETWEEN);
                        setState(1946);
                        ((PredicateContext) _localctx).lower = valueExpression(0);
                        setState(1947);
                        match(AND);
                        setState(1948);
                        ((PredicateContext) _localctx).upper = valueExpression(0);
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1951);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == NOT) {
                            {
                                setState(1950);
                                match(NOT);
                            }
                        }

                        setState(1953);
                        ((PredicateContext) _localctx).kind = match(IN);
                        setState(1954);
                        match(T__0);
                        setState(1955);
                        expression();
                        setState(1960);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(1956);
                                    match(T__2);
                                    setState(1957);
                                    expression();
                                }
                            }
                            setState(1962);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1963);
                        match(T__1);
                    }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(1966);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == NOT) {
                            {
                                setState(1965);
                                match(NOT);
                            }
                        }

                        setState(1968);
                        ((PredicateContext) _localctx).kind = match(IN);
                        setState(1969);
                        match(T__0);
                        setState(1970);
                        query();
                        setState(1971);
                        match(T__1);
                    }
                    break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(1974);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == NOT) {
                            {
                                setState(1973);
                                match(NOT);
                            }
                        }

                        setState(1976);
                        ((PredicateContext) _localctx).kind = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == LIKE || _la == RLIKE)) {
                            ((PredicateContext) _localctx).kind =
                                    (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1977);
                        ((PredicateContext) _localctx).pattern = valueExpression(0);
                    }
                    break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                    {
                        setState(1978);
                        match(IS);
                        setState(1980);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == NOT) {
                            {
                                setState(1979);
                                match(NOT);
                            }
                        }

                        setState(1982);
                        ((PredicateContext) _localctx).kind = match(NULL);
                    }
                    break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                    {
                        setState(1983);
                        match(IS);
                        setState(1985);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == NOT) {
                            {
                                setState(1984);
                                match(NOT);
                            }
                        }

                        setState(1987);
                        ((PredicateContext) _localctx).kind = match(DISTINCT);
                        setState(1988);
                        match(FROM);
                        setState(1989);
                        ((PredicateContext) _localctx).right = valueExpression(0);
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ValueExpressionContext extends ParserRuleContext {
        public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_valueExpression;
        }

        public ValueExpressionContext() {}

        public void copyFrom(ValueExpressionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ValueExpressionDefaultContext extends ValueExpressionContext {
        public PrimaryExpressionContext primaryExpression() {
            return getRuleContext(PrimaryExpressionContext.class, 0);
        }

        public ValueExpressionDefaultContext(ValueExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterValueExpressionDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitValueExpressionDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitValueExpressionDefault(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ComparisonContext extends ValueExpressionContext {
        public ValueExpressionContext left;
        public ValueExpressionContext right;

        public ComparisonOperatorContext comparisonOperator() {
            return getRuleContext(ComparisonOperatorContext.class, 0);
        }

        public List<ValueExpressionContext> valueExpression() {
            return getRuleContexts(ValueExpressionContext.class);
        }

        public ValueExpressionContext valueExpression(int i) {
            return getRuleContext(ValueExpressionContext.class, i);
        }

        public ComparisonContext(ValueExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterComparison(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitComparison(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitComparison(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ArithmeticBinaryContext extends ValueExpressionContext {
        public ValueExpressionContext left;
        public Token operator;
        public ValueExpressionContext right;

        public List<ValueExpressionContext> valueExpression() {
            return getRuleContexts(ValueExpressionContext.class);
        }

        public ValueExpressionContext valueExpression(int i) {
            return getRuleContext(ValueExpressionContext.class, i);
        }

        public TerminalNode ASTERISK() {
            return getToken(SqlBaseParser.ASTERISK, 0);
        }

        public TerminalNode SLASH() {
            return getToken(SqlBaseParser.SLASH, 0);
        }

        public TerminalNode PERCENT() {
            return getToken(SqlBaseParser.PERCENT, 0);
        }

        public TerminalNode DIV() {
            return getToken(SqlBaseParser.DIV, 0);
        }

        public TerminalNode PLUS() {
            return getToken(SqlBaseParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SqlBaseParser.MINUS, 0);
        }

        public TerminalNode CONCAT_PIPE() {
            return getToken(SqlBaseParser.CONCAT_PIPE, 0);
        }

        public TerminalNode AMPERSAND() {
            return getToken(SqlBaseParser.AMPERSAND, 0);
        }

        public TerminalNode HAT() {
            return getToken(SqlBaseParser.HAT, 0);
        }

        public TerminalNode PIPE() {
            return getToken(SqlBaseParser.PIPE, 0);
        }

        public ArithmeticBinaryContext(ValueExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterArithmeticBinary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitArithmeticBinary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitArithmeticBinary(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ArithmeticUnaryContext extends ValueExpressionContext {
        public Token operator;

        public ValueExpressionContext valueExpression() {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SqlBaseParser.MINUS, 0);
        }

        public TerminalNode PLUS() {
            return getToken(SqlBaseParser.PLUS, 0);
        }

        public TerminalNode TILDE() {
            return getToken(SqlBaseParser.TILDE, 0);
        }

        public ArithmeticUnaryContext(ValueExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterArithmeticUnary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitArithmeticUnary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitArithmeticUnary(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ValueExpressionContext valueExpression() throws RecognitionException {
        return valueExpression(0);
    }

    private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
        ValueExpressionContext _prevctx = _localctx;
        int _startState = 146;
        enterRecursionRule(_localctx, 146, RULE_valueExpression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1996);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 268, _ctx)) {
                    case 1:
                        {
                            _localctx = new ValueExpressionDefaultContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;

                            setState(1993);
                            primaryExpression(0);
                        }
                        break;
                    case 2:
                        {
                            _localctx = new ArithmeticUnaryContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(1994);
                            ((ArithmeticUnaryContext) _localctx).operator = _input.LT(1);
                            _la = _input.LA(1);
                            if (!(((((_la - 138)) & ~0x3f) == 0
                                    && ((1L << (_la - 138)) & 67L) != 0))) {
                                ((ArithmeticUnaryContext) _localctx).operator =
                                        (Token) _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(1995);
                            valueExpression(7);
                        }
                        break;
                }
                _ctx.stop = _input.LT(-1);
                setState(2019);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 270, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(2017);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 269, _ctx)) {
                                case 1:
                                    {
                                        _localctx =
                                                new ArithmeticBinaryContext(
                                                        new ValueExpressionContext(
                                                                _parentctx, _parentState));
                                        ((ArithmeticBinaryContext) _localctx).left = _prevctx;
                                        pushNewRecursionContext(
                                                _localctx, _startState, RULE_valueExpression);
                                        setState(1998);
                                        if (!(precpred(_ctx, 6)))
                                            throw new FailedPredicateException(
                                                    this, "precpred(_ctx, 6)");
                                        setState(1999);
                                        ((ArithmeticBinaryContext) _localctx).operator =
                                                _input.LT(1);
                                        _la = _input.LA(1);
                                        if (!(((((_la - 140)) & ~0x3f) == 0
                                                && ((1L << (_la - 140)) & 15L) != 0))) {
                                            ((ArithmeticBinaryContext) _localctx).operator =
                                                    (Token) _errHandler.recoverInline(this);
                                        } else {
                                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                            _errHandler.reportMatch(this);
                                            consume();
                                        }
                                        setState(2000);
                                        ((ArithmeticBinaryContext) _localctx).right =
                                                valueExpression(7);
                                    }
                                    break;
                                case 2:
                                    {
                                        _localctx =
                                                new ArithmeticBinaryContext(
                                                        new ValueExpressionContext(
                                                                _parentctx, _parentState));
                                        ((ArithmeticBinaryContext) _localctx).left = _prevctx;
                                        pushNewRecursionContext(
                                                _localctx, _startState, RULE_valueExpression);
                                        setState(2001);
                                        if (!(precpred(_ctx, 5)))
                                            throw new FailedPredicateException(
                                                    this, "precpred(_ctx, 5)");
                                        setState(2002);
                                        ((ArithmeticBinaryContext) _localctx).operator =
                                                _input.LT(1);
                                        _la = _input.LA(1);
                                        if (!(((((_la - 138)) & ~0x3f) == 0
                                                && ((1L << (_la - 138)) & 515L) != 0))) {
                                            ((ArithmeticBinaryContext) _localctx).operator =
                                                    (Token) _errHandler.recoverInline(this);
                                        } else {
                                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                            _errHandler.reportMatch(this);
                                            consume();
                                        }
                                        setState(2003);
                                        ((ArithmeticBinaryContext) _localctx).right =
                                                valueExpression(6);
                                    }
                                    break;
                                case 3:
                                    {
                                        _localctx =
                                                new ArithmeticBinaryContext(
                                                        new ValueExpressionContext(
                                                                _parentctx, _parentState));
                                        ((ArithmeticBinaryContext) _localctx).left = _prevctx;
                                        pushNewRecursionContext(
                                                _localctx, _startState, RULE_valueExpression);
                                        setState(2004);
                                        if (!(precpred(_ctx, 4)))
                                            throw new FailedPredicateException(
                                                    this, "precpred(_ctx, 4)");
                                        setState(2005);
                                        ((ArithmeticBinaryContext) _localctx).operator =
                                                match(AMPERSAND);
                                        setState(2006);
                                        ((ArithmeticBinaryContext) _localctx).right =
                                                valueExpression(5);
                                    }
                                    break;
                                case 4:
                                    {
                                        _localctx =
                                                new ArithmeticBinaryContext(
                                                        new ValueExpressionContext(
                                                                _parentctx, _parentState));
                                        ((ArithmeticBinaryContext) _localctx).left = _prevctx;
                                        pushNewRecursionContext(
                                                _localctx, _startState, RULE_valueExpression);
                                        setState(2007);
                                        if (!(precpred(_ctx, 3)))
                                            throw new FailedPredicateException(
                                                    this, "precpred(_ctx, 3)");
                                        setState(2008);
                                        ((ArithmeticBinaryContext) _localctx).operator = match(HAT);
                                        setState(2009);
                                        ((ArithmeticBinaryContext) _localctx).right =
                                                valueExpression(4);
                                    }
                                    break;
                                case 5:
                                    {
                                        _localctx =
                                                new ArithmeticBinaryContext(
                                                        new ValueExpressionContext(
                                                                _parentctx, _parentState));
                                        ((ArithmeticBinaryContext) _localctx).left = _prevctx;
                                        pushNewRecursionContext(
                                                _localctx, _startState, RULE_valueExpression);
                                        setState(2010);
                                        if (!(precpred(_ctx, 2)))
                                            throw new FailedPredicateException(
                                                    this, "precpred(_ctx, 2)");
                                        setState(2011);
                                        ((ArithmeticBinaryContext) _localctx).operator =
                                                match(PIPE);
                                        setState(2012);
                                        ((ArithmeticBinaryContext) _localctx).right =
                                                valueExpression(3);
                                    }
                                    break;
                                case 6:
                                    {
                                        _localctx =
                                                new ComparisonContext(
                                                        new ValueExpressionContext(
                                                                _parentctx, _parentState));
                                        ((ComparisonContext) _localctx).left = _prevctx;
                                        pushNewRecursionContext(
                                                _localctx, _startState, RULE_valueExpression);
                                        setState(2013);
                                        if (!(precpred(_ctx, 1)))
                                            throw new FailedPredicateException(
                                                    this, "precpred(_ctx, 1)");
                                        setState(2014);
                                        comparisonOperator();
                                        setState(2015);
                                        ((ComparisonContext) _localctx).right = valueExpression(2);
                                    }
                                    break;
                            }
                        }
                    }
                    setState(2021);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 270, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PrimaryExpressionContext extends ParserRuleContext {
        public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_primaryExpression;
        }

        public PrimaryExpressionContext() {}

        public void copyFrom(PrimaryExpressionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StructContext extends PrimaryExpressionContext {
        public NamedExpressionContext namedExpression;
        public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();

        public TerminalNode STRUCT() {
            return getToken(SqlBaseParser.STRUCT, 0);
        }

        public List<NamedExpressionContext> namedExpression() {
            return getRuleContexts(NamedExpressionContext.class);
        }

        public NamedExpressionContext namedExpression(int i) {
            return getRuleContext(NamedExpressionContext.class, i);
        }

        public StructContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).enterStruct(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitStruct(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitStruct(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DereferenceContext extends PrimaryExpressionContext {
        public PrimaryExpressionContext base;
        public IdentifierContext fieldName;

        public PrimaryExpressionContext primaryExpression() {
            return getRuleContext(PrimaryExpressionContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public DereferenceContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDereference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDereference(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDereference(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SimpleCaseContext extends PrimaryExpressionContext {
        public ExpressionContext value;
        public ExpressionContext elseExpression;

        public TerminalNode CASE() {
            return getToken(SqlBaseParser.CASE, 0);
        }

        public TerminalNode END() {
            return getToken(SqlBaseParser.END, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<WhenClauseContext> whenClause() {
            return getRuleContexts(WhenClauseContext.class);
        }

        public WhenClauseContext whenClause(int i) {
            return getRuleContext(WhenClauseContext.class, i);
        }

        public TerminalNode ELSE() {
            return getToken(SqlBaseParser.ELSE, 0);
        }

        public SimpleCaseContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSimpleCase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSimpleCase(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSimpleCase(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ColumnReferenceContext extends PrimaryExpressionContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ColumnReferenceContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterColumnReference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitColumnReference(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitColumnReference(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RowConstructorContext extends PrimaryExpressionContext {
        public List<NamedExpressionContext> namedExpression() {
            return getRuleContexts(NamedExpressionContext.class);
        }

        public NamedExpressionContext namedExpression(int i) {
            return getRuleContext(NamedExpressionContext.class, i);
        }

        public RowConstructorContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRowConstructor(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRowConstructor(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRowConstructor(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LastContext extends PrimaryExpressionContext {
        public TerminalNode LAST() {
            return getToken(SqlBaseParser.LAST, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode IGNORE() {
            return getToken(SqlBaseParser.IGNORE, 0);
        }

        public TerminalNode NULLS() {
            return getToken(SqlBaseParser.NULLS, 0);
        }

        public LastContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).enterLast(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitLast(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitLast(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StarContext extends PrimaryExpressionContext {
        public TerminalNode ASTERISK() {
            return getToken(SqlBaseParser.ASTERISK, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public StarContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).enterStar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitStar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitStar(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SubscriptContext extends PrimaryExpressionContext {
        public PrimaryExpressionContext value;
        public ValueExpressionContext index;

        public PrimaryExpressionContext primaryExpression() {
            return getRuleContext(PrimaryExpressionContext.class, 0);
        }

        public ValueExpressionContext valueExpression() {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public SubscriptContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSubscript(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSubscript(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSubscript(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SubqueryExpressionContext extends PrimaryExpressionContext {
        public QueryContext query() {
            return getRuleContext(QueryContext.class, 0);
        }

        public SubqueryExpressionContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSubqueryExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSubqueryExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSubqueryExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CastContext extends PrimaryExpressionContext {
        public TerminalNode CAST() {
            return getToken(SqlBaseParser.CAST, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public DataTypeContext dataType() {
            return getRuleContext(DataTypeContext.class, 0);
        }

        public CastContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).enterCast(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitCast(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCast(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ConstantDefaultContext extends PrimaryExpressionContext {
        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        public ConstantDefaultContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterConstantDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitConstantDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitConstantDefault(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LambdaContext extends PrimaryExpressionContext {
        public List<TerminalNode> IDENTIFIER() {
            return getTokens(SqlBaseParser.IDENTIFIER);
        }

        public TerminalNode IDENTIFIER(int i) {
            return getToken(SqlBaseParser.IDENTIFIER, i);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public LambdaContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).enterLambda(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitLambda(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitLambda(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterParenthesizedExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitParenthesizedExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitParenthesizedExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExtractContext extends PrimaryExpressionContext {
        public IdentifierContext field;
        public ValueExpressionContext source;

        public TerminalNode EXTRACT() {
            return getToken(SqlBaseParser.EXTRACT, 0);
        }

        public TerminalNode FROM() {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ValueExpressionContext valueExpression() {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public ExtractContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterExtract(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitExtract(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitExtract(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FunctionCallContext extends PrimaryExpressionContext {
        public ExpressionContext expression;
        public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
        public Token trimOption;

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode OVER() {
            return getToken(SqlBaseParser.OVER, 0);
        }

        public WindowSpecContext windowSpec() {
            return getRuleContext(WindowSpecContext.class, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public SetQuantifierContext setQuantifier() {
            return getRuleContext(SetQuantifierContext.class, 0);
        }

        public TerminalNode FROM() {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public TerminalNode BOTH() {
            return getToken(SqlBaseParser.BOTH, 0);
        }

        public TerminalNode LEADING() {
            return getToken(SqlBaseParser.LEADING, 0);
        }

        public TerminalNode TRAILING() {
            return getToken(SqlBaseParser.TRAILING, 0);
        }

        public FunctionCallContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SearchedCaseContext extends PrimaryExpressionContext {
        public ExpressionContext elseExpression;

        public TerminalNode CASE() {
            return getToken(SqlBaseParser.CASE, 0);
        }

        public TerminalNode END() {
            return getToken(SqlBaseParser.END, 0);
        }

        public List<WhenClauseContext> whenClause() {
            return getRuleContexts(WhenClauseContext.class);
        }

        public WhenClauseContext whenClause(int i) {
            return getRuleContext(WhenClauseContext.class, i);
        }

        public TerminalNode ELSE() {
            return getToken(SqlBaseParser.ELSE, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public SearchedCaseContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSearchedCase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSearchedCase(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSearchedCase(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PositionContext extends PrimaryExpressionContext {
        public ValueExpressionContext substr;
        public ValueExpressionContext str;

        public TerminalNode POSITION() {
            return getToken(SqlBaseParser.POSITION, 0);
        }

        public TerminalNode IN() {
            return getToken(SqlBaseParser.IN, 0);
        }

        public List<ValueExpressionContext> valueExpression() {
            return getRuleContexts(ValueExpressionContext.class);
        }

        public ValueExpressionContext valueExpression(int i) {
            return getRuleContext(ValueExpressionContext.class, i);
        }

        public PositionContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterPosition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitPosition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitPosition(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FirstContext extends PrimaryExpressionContext {
        public TerminalNode FIRST() {
            return getToken(SqlBaseParser.FIRST, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode IGNORE() {
            return getToken(SqlBaseParser.IGNORE, 0);
        }

        public TerminalNode NULLS() {
            return getToken(SqlBaseParser.NULLS, 0);
        }

        public FirstContext(PrimaryExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).enterFirst(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitFirst(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitFirst(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
        return primaryExpression(0);
    }

    private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
        PrimaryExpressionContext _prevctx = _localctx;
        int _startState = 148;
        enterRecursionRule(_localctx, 148, RULE_primaryExpression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(2167);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 285, _ctx)) {
                    case 1:
                        {
                            _localctx = new SearchedCaseContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;

                            setState(2023);
                            match(CASE);
                            setState(2025);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            do {
                                {
                                    {
                                        setState(2024);
                                        whenClause();
                                    }
                                }
                                setState(2027);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            } while (_la == WHEN);
                            setState(2031);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == ELSE) {
                                {
                                    setState(2029);
                                    match(ELSE);
                                    setState(2030);
                                    ((SearchedCaseContext) _localctx).elseExpression = expression();
                                }
                            }

                            setState(2033);
                            match(END);
                        }
                        break;
                    case 2:
                        {
                            _localctx = new SimpleCaseContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2035);
                            match(CASE);
                            setState(2036);
                            ((SimpleCaseContext) _localctx).value = expression();
                            setState(2038);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            do {
                                {
                                    {
                                        setState(2037);
                                        whenClause();
                                    }
                                }
                                setState(2040);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            } while (_la == WHEN);
                            setState(2044);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == ELSE) {
                                {
                                    setState(2042);
                                    match(ELSE);
                                    setState(2043);
                                    ((SimpleCaseContext) _localctx).elseExpression = expression();
                                }
                            }

                            setState(2046);
                            match(END);
                        }
                        break;
                    case 3:
                        {
                            _localctx = new CastContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2048);
                            match(CAST);
                            setState(2049);
                            match(T__0);
                            setState(2050);
                            expression();
                            setState(2051);
                            match(AS);
                            setState(2052);
                            dataType();
                            setState(2053);
                            match(T__1);
                        }
                        break;
                    case 4:
                        {
                            _localctx = new StructContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2055);
                            match(STRUCT);
                            setState(2056);
                            match(T__0);
                            setState(2065);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2046L) != 0)
                                    || ((((_la - 64)) & ~0x3f) == 0
                                            && ((1L << (_la - 64)) & -1L) != 0)
                                    || ((((_la - 128)) & ~0x3f) == 0
                                            && ((1L << (_la - 128)) & -2149475325L) != 0)
                                    || ((((_la - 192)) & ~0x3f) == 0
                                            && ((1L << (_la - 192)) & 288230376151711743L) != 0)) {
                                {
                                    setState(2057);
                                    ((StructContext) _localctx).namedExpression = namedExpression();
                                    ((StructContext) _localctx)
                                            .argument.add(
                                                    ((StructContext) _localctx).namedExpression);
                                    setState(2062);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    while (_la == T__2) {
                                        {
                                            {
                                                setState(2058);
                                                match(T__2);
                                                setState(2059);
                                                ((StructContext) _localctx).namedExpression =
                                                        namedExpression();
                                                ((StructContext) _localctx)
                                                        .argument.add(
                                                                ((StructContext) _localctx)
                                                                        .namedExpression);
                                            }
                                        }
                                        setState(2064);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                    }
                                }
                            }

                            setState(2067);
                            match(T__1);
                        }
                        break;
                    case 5:
                        {
                            _localctx = new FirstContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2068);
                            match(FIRST);
                            setState(2069);
                            match(T__0);
                            setState(2070);
                            expression();
                            setState(2073);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == IGNORE) {
                                {
                                    setState(2071);
                                    match(IGNORE);
                                    setState(2072);
                                    match(NULLS);
                                }
                            }

                            setState(2075);
                            match(T__1);
                        }
                        break;
                    case 6:
                        {
                            _localctx = new LastContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2077);
                            match(LAST);
                            setState(2078);
                            match(T__0);
                            setState(2079);
                            expression();
                            setState(2082);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == IGNORE) {
                                {
                                    setState(2080);
                                    match(IGNORE);
                                    setState(2081);
                                    match(NULLS);
                                }
                            }

                            setState(2084);
                            match(T__1);
                        }
                        break;
                    case 7:
                        {
                            _localctx = new PositionContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2086);
                            match(POSITION);
                            setState(2087);
                            match(T__0);
                            setState(2088);
                            ((PositionContext) _localctx).substr = valueExpression(0);
                            setState(2089);
                            match(IN);
                            setState(2090);
                            ((PositionContext) _localctx).str = valueExpression(0);
                            setState(2091);
                            match(T__1);
                        }
                        break;
                    case 8:
                        {
                            _localctx = new ConstantDefaultContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2093);
                            constant();
                        }
                        break;
                    case 9:
                        {
                            _localctx = new StarContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2094);
                            match(ASTERISK);
                        }
                        break;
                    case 10:
                        {
                            _localctx = new StarContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2095);
                            qualifiedName();
                            setState(2096);
                            match(T__3);
                            setState(2097);
                            match(ASTERISK);
                        }
                        break;
                    case 11:
                        {
                            _localctx = new RowConstructorContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2099);
                            match(T__0);
                            setState(2100);
                            namedExpression();
                            setState(2103);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            do {
                                {
                                    {
                                        setState(2101);
                                        match(T__2);
                                        setState(2102);
                                        namedExpression();
                                    }
                                }
                                setState(2105);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            } while (_la == T__2);
                            setState(2107);
                            match(T__1);
                        }
                        break;
                    case 12:
                        {
                            _localctx = new SubqueryExpressionContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2109);
                            match(T__0);
                            setState(2110);
                            query();
                            setState(2111);
                            match(T__1);
                        }
                        break;
                    case 13:
                        {
                            _localctx = new FunctionCallContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2113);
                            qualifiedName();
                            setState(2114);
                            match(T__0);
                            setState(2126);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2046L) != 0)
                                    || ((((_la - 64)) & ~0x3f) == 0
                                            && ((1L << (_la - 64)) & -1L) != 0)
                                    || ((((_la - 128)) & ~0x3f) == 0
                                            && ((1L << (_la - 128)) & -2149475325L) != 0)
                                    || ((((_la - 192)) & ~0x3f) == 0
                                            && ((1L << (_la - 192)) & 288230376151711743L) != 0)) {
                                {
                                    setState(2116);
                                    _errHandler.sync(this);
                                    switch (getInterpreter().adaptivePredict(_input, 280, _ctx)) {
                                        case 1:
                                            {
                                                setState(2115);
                                                setQuantifier();
                                            }
                                            break;
                                    }
                                    setState(2118);
                                    ((FunctionCallContext) _localctx).expression = expression();
                                    ((FunctionCallContext) _localctx)
                                            .argument.add(
                                                    ((FunctionCallContext) _localctx).expression);
                                    setState(2123);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    while (_la == T__2) {
                                        {
                                            {
                                                setState(2119);
                                                match(T__2);
                                                setState(2120);
                                                ((FunctionCallContext) _localctx).expression =
                                                        expression();
                                                ((FunctionCallContext) _localctx)
                                                        .argument.add(
                                                                ((FunctionCallContext) _localctx)
                                                                        .expression);
                                            }
                                        }
                                        setState(2125);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                    }
                                }
                            }

                            setState(2128);
                            match(T__1);
                            setState(2131);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 283, _ctx)) {
                                case 1:
                                    {
                                        setState(2129);
                                        match(OVER);
                                        setState(2130);
                                        windowSpec();
                                    }
                                    break;
                            }
                        }
                        break;
                    case 14:
                        {
                            _localctx = new FunctionCallContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2133);
                            qualifiedName();
                            setState(2134);
                            match(T__0);
                            setState(2135);
                            ((FunctionCallContext) _localctx).trimOption = _input.LT(1);
                            _la = _input.LA(1);
                            if (!(((((_la - 124)) & ~0x3f) == 0
                                    && ((1L << (_la - 124)) & 7L) != 0))) {
                                ((FunctionCallContext) _localctx).trimOption =
                                        (Token) _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(2136);
                            ((FunctionCallContext) _localctx).expression = expression();
                            ((FunctionCallContext) _localctx)
                                    .argument.add(((FunctionCallContext) _localctx).expression);
                            setState(2137);
                            match(FROM);
                            setState(2138);
                            ((FunctionCallContext) _localctx).expression = expression();
                            ((FunctionCallContext) _localctx)
                                    .argument.add(((FunctionCallContext) _localctx).expression);
                            setState(2139);
                            match(T__1);
                        }
                        break;
                    case 15:
                        {
                            _localctx = new LambdaContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2141);
                            match(IDENTIFIER);
                            setState(2142);
                            match(T__6);
                            setState(2143);
                            expression();
                        }
                        break;
                    case 16:
                        {
                            _localctx = new LambdaContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2144);
                            match(T__0);
                            setState(2145);
                            match(IDENTIFIER);
                            setState(2148);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            do {
                                {
                                    {
                                        setState(2146);
                                        match(T__2);
                                        setState(2147);
                                        match(IDENTIFIER);
                                    }
                                }
                                setState(2150);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            } while (_la == T__2);
                            setState(2152);
                            match(T__1);
                            setState(2153);
                            match(T__6);
                            setState(2154);
                            expression();
                        }
                        break;
                    case 17:
                        {
                            _localctx = new ColumnReferenceContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2155);
                            identifier();
                        }
                        break;
                    case 18:
                        {
                            _localctx = new ParenthesizedExpressionContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2156);
                            match(T__0);
                            setState(2157);
                            expression();
                            setState(2158);
                            match(T__1);
                        }
                        break;
                    case 19:
                        {
                            _localctx = new ExtractContext(_localctx);
                            _ctx = _localctx;
                            _prevctx = _localctx;
                            setState(2160);
                            match(EXTRACT);
                            setState(2161);
                            match(T__0);
                            setState(2162);
                            ((ExtractContext) _localctx).field = identifier();
                            setState(2163);
                            match(FROM);
                            setState(2164);
                            ((ExtractContext) _localctx).source = valueExpression(0);
                            setState(2165);
                            match(T__1);
                        }
                        break;
                }
                _ctx.stop = _input.LT(-1);
                setState(2179);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 287, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(2177);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 286, _ctx)) {
                                case 1:
                                    {
                                        _localctx =
                                                new SubscriptContext(
                                                        new PrimaryExpressionContext(
                                                                _parentctx, _parentState));
                                        ((SubscriptContext) _localctx).value = _prevctx;
                                        pushNewRecursionContext(
                                                _localctx, _startState, RULE_primaryExpression);
                                        setState(2169);
                                        if (!(precpred(_ctx, 5)))
                                            throw new FailedPredicateException(
                                                    this, "precpred(_ctx, 5)");
                                        setState(2170);
                                        match(T__7);
                                        setState(2171);
                                        ((SubscriptContext) _localctx).index = valueExpression(0);
                                        setState(2172);
                                        match(T__8);
                                    }
                                    break;
                                case 2:
                                    {
                                        _localctx =
                                                new DereferenceContext(
                                                        new PrimaryExpressionContext(
                                                                _parentctx, _parentState));
                                        ((DereferenceContext) _localctx).base = _prevctx;
                                        pushNewRecursionContext(
                                                _localctx, _startState, RULE_primaryExpression);
                                        setState(2174);
                                        if (!(precpred(_ctx, 3)))
                                            throw new FailedPredicateException(
                                                    this, "precpred(_ctx, 3)");
                                        setState(2175);
                                        match(T__3);
                                        setState(2176);
                                        ((DereferenceContext) _localctx).fieldName = identifier();
                                    }
                                    break;
                            }
                        }
                    }
                    setState(2181);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 287, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ConstantContext extends ParserRuleContext {
        public ConstantContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constant;
        }

        public ConstantContext() {}

        public void copyFrom(ConstantContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class NullLiteralContext extends ConstantContext {
        public TerminalNode NULL() {
            return getToken(SqlBaseParser.NULL, 0);
        }

        public NullLiteralContext(ConstantContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNullLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNullLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNullLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StringLiteralContext extends ConstantContext {
        public List<TerminalNode> STRING() {
            return getTokens(SqlBaseParser.STRING);
        }

        public TerminalNode STRING(int i) {
            return getToken(SqlBaseParser.STRING, i);
        }

        public StringLiteralContext(ConstantContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterStringLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitStringLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitStringLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TypeConstructorContext extends ConstantContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public TypeConstructorContext(ConstantContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTypeConstructor(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTypeConstructor(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTypeConstructor(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IntervalLiteralContext extends ConstantContext {
        public IntervalContext interval() {
            return getRuleContext(IntervalContext.class, 0);
        }

        public IntervalLiteralContext(ConstantContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterIntervalLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitIntervalLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitIntervalLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class NumericLiteralContext extends ConstantContext {
        public NumberContext number() {
            return getRuleContext(NumberContext.class, 0);
        }

        public NumericLiteralContext(ConstantContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNumericLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNumericLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNumericLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BooleanLiteralContext extends ConstantContext {
        public BooleanValueContext booleanValue() {
            return getRuleContext(BooleanValueContext.class, 0);
        }

        public BooleanLiteralContext(ConstantContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterBooleanLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitBooleanLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitBooleanLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ConstantContext constant() throws RecognitionException {
        ConstantContext _localctx = new ConstantContext(_ctx, getState());
        enterRule(_localctx, 150, RULE_constant);
        try {
            int _alt;
            setState(2194);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 289, _ctx)) {
                case 1:
                    _localctx = new NullLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(2182);
                        match(NULL);
                    }
                    break;
                case 2:
                    _localctx = new IntervalLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(2183);
                        interval();
                    }
                    break;
                case 3:
                    _localctx = new TypeConstructorContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(2184);
                        identifier();
                        setState(2185);
                        match(STRING);
                    }
                    break;
                case 4:
                    _localctx = new NumericLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(2187);
                        number();
                    }
                    break;
                case 5:
                    _localctx = new BooleanLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                    {
                        setState(2188);
                        booleanValue();
                    }
                    break;
                case 6:
                    _localctx = new StringLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                    {
                        setState(2190);
                        _errHandler.sync(this);
                        _alt = 1;
                        do {
                            switch (_alt) {
                                case 1:
                                    {
                                        {
                                            setState(2189);
                                            match(STRING);
                                        }
                                    }
                                    break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                            setState(2192);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 288, _ctx);
                        } while (_alt != 2
                                && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ComparisonOperatorContext extends ParserRuleContext {
        public TerminalNode EQ() {
            return getToken(SqlBaseParser.EQ, 0);
        }

        public TerminalNode NEQ() {
            return getToken(SqlBaseParser.NEQ, 0);
        }

        public TerminalNode NEQJ() {
            return getToken(SqlBaseParser.NEQJ, 0);
        }

        public TerminalNode LT() {
            return getToken(SqlBaseParser.LT, 0);
        }

        public TerminalNode LTE() {
            return getToken(SqlBaseParser.LTE, 0);
        }

        public TerminalNode GT() {
            return getToken(SqlBaseParser.GT, 0);
        }

        public TerminalNode GTE() {
            return getToken(SqlBaseParser.GTE, 0);
        }

        public TerminalNode NSEQ() {
            return getToken(SqlBaseParser.NSEQ, 0);
        }

        public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comparisonOperator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterComparisonOperator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitComparisonOperator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitComparisonOperator(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
        ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
        enterRule(_localctx, 152, RULE_comparisonOperator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2196);
                _la = _input.LA(1);
                if (!(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 255L) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ArithmeticOperatorContext extends ParserRuleContext {
        public TerminalNode PLUS() {
            return getToken(SqlBaseParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SqlBaseParser.MINUS, 0);
        }

        public TerminalNode ASTERISK() {
            return getToken(SqlBaseParser.ASTERISK, 0);
        }

        public TerminalNode SLASH() {
            return getToken(SqlBaseParser.SLASH, 0);
        }

        public TerminalNode PERCENT() {
            return getToken(SqlBaseParser.PERCENT, 0);
        }

        public TerminalNode DIV() {
            return getToken(SqlBaseParser.DIV, 0);
        }

        public TerminalNode TILDE() {
            return getToken(SqlBaseParser.TILDE, 0);
        }

        public TerminalNode AMPERSAND() {
            return getToken(SqlBaseParser.AMPERSAND, 0);
        }

        public TerminalNode PIPE() {
            return getToken(SqlBaseParser.PIPE, 0);
        }

        public TerminalNode CONCAT_PIPE() {
            return getToken(SqlBaseParser.CONCAT_PIPE, 0);
        }

        public TerminalNode HAT() {
            return getToken(SqlBaseParser.HAT, 0);
        }

        public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arithmeticOperator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterArithmeticOperator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitArithmeticOperator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitArithmeticOperator(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
        ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
        enterRule(_localctx, 154, RULE_arithmeticOperator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2198);
                _la = _input.LA(1);
                if (!(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & 2047L) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PredicateOperatorContext extends ParserRuleContext {
        public TerminalNode OR() {
            return getToken(SqlBaseParser.OR, 0);
        }

        public TerminalNode AND() {
            return getToken(SqlBaseParser.AND, 0);
        }

        public TerminalNode IN() {
            return getToken(SqlBaseParser.IN, 0);
        }

        public TerminalNode NOT() {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_predicateOperator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterPredicateOperator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitPredicateOperator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitPredicateOperator(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PredicateOperatorContext predicateOperator() throws RecognitionException {
        PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
        enterRule(_localctx, 156, RULE_predicateOperator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2200);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BooleanValueContext extends ParserRuleContext {
        public TerminalNode TRUE() {
            return getToken(SqlBaseParser.TRUE, 0);
        }

        public TerminalNode FALSE() {
            return getToken(SqlBaseParser.FALSE, 0);
        }

        public BooleanValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_booleanValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterBooleanValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitBooleanValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitBooleanValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BooleanValueContext booleanValue() throws RecognitionException {
        BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
        enterRule(_localctx, 158, RULE_booleanValue);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2202);
                _la = _input.LA(1);
                if (!(_la == TRUE || _la == FALSE)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IntervalContext extends ParserRuleContext {
        public TerminalNode INTERVAL() {
            return getToken(SqlBaseParser.INTERVAL, 0);
        }

        public List<IntervalFieldContext> intervalField() {
            return getRuleContexts(IntervalFieldContext.class);
        }

        public IntervalFieldContext intervalField(int i) {
            return getRuleContext(IntervalFieldContext.class, i);
        }

        public IntervalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interval;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterInterval(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitInterval(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitInterval(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IntervalContext interval() throws RecognitionException {
        IntervalContext _localctx = new IntervalContext(_ctx, getState());
        enterRule(_localctx, 160, RULE_interval);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(2204);
                match(INTERVAL);
                setState(2208);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 290, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(2205);
                                intervalField();
                            }
                        }
                    }
                    setState(2210);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 290, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IntervalFieldContext extends ParserRuleContext {
        public IntervalValueContext value;
        public IdentifierContext unit;
        public IdentifierContext to;

        public IntervalValueContext intervalValue() {
            return getRuleContext(IntervalValueContext.class, 0);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public TerminalNode TO() {
            return getToken(SqlBaseParser.TO, 0);
        }

        public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_intervalField;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterIntervalField(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitIntervalField(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitIntervalField(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IntervalFieldContext intervalField() throws RecognitionException {
        IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
        enterRule(_localctx, 162, RULE_intervalField);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2211);
                ((IntervalFieldContext) _localctx).value = intervalValue();
                setState(2212);
                ((IntervalFieldContext) _localctx).unit = identifier();
                setState(2215);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 291, _ctx)) {
                    case 1:
                        {
                            setState(2213);
                            match(TO);
                            setState(2214);
                            ((IntervalFieldContext) _localctx).to = identifier();
                        }
                        break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IntervalValueContext extends ParserRuleContext {
        public TerminalNode INTEGER_VALUE() {
            return getToken(SqlBaseParser.INTEGER_VALUE, 0);
        }

        public TerminalNode DECIMAL_VALUE() {
            return getToken(SqlBaseParser.DECIMAL_VALUE, 0);
        }

        public TerminalNode PLUS() {
            return getToken(SqlBaseParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SqlBaseParser.MINUS, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public IntervalValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_intervalValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterIntervalValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitIntervalValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitIntervalValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IntervalValueContext intervalValue() throws RecognitionException {
        IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
        enterRule(_localctx, 164, RULE_intervalValue);
        int _la;
        try {
            setState(2222);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case PLUS:
                case MINUS:
                case INTEGER_VALUE:
                case DECIMAL_VALUE:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(2218);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == PLUS || _la == MINUS) {
                            {
                                setState(2217);
                                _la = _input.LA(1);
                                if (!(_la == PLUS || _la == MINUS)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                            }
                        }

                        setState(2220);
                        _la = _input.LA(1);
                        if (!(_la == INTEGER_VALUE || _la == DECIMAL_VALUE)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                    break;
                case STRING:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(2221);
                        match(STRING);
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ColPositionContext extends ParserRuleContext {
        public TerminalNode FIRST() {
            return getToken(SqlBaseParser.FIRST, 0);
        }

        public TerminalNode AFTER() {
            return getToken(SqlBaseParser.AFTER, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ColPositionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_colPosition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterColPosition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitColPosition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitColPosition(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ColPositionContext colPosition() throws RecognitionException {
        ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
        enterRule(_localctx, 166, RULE_colPosition);
        try {
            setState(2227);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case FIRST:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(2224);
                        match(FIRST);
                    }
                    break;
                case AFTER:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(2225);
                        match(AFTER);
                        setState(2226);
                        identifier();
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DataTypeContext extends ParserRuleContext {
        public DataTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dataType;
        }

        public DataTypeContext() {}

        public void copyFrom(DataTypeContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ComplexDataTypeContext extends DataTypeContext {
        public Token complex;

        public TerminalNode LT() {
            return getToken(SqlBaseParser.LT, 0);
        }

        public List<DataTypeContext> dataType() {
            return getRuleContexts(DataTypeContext.class);
        }

        public DataTypeContext dataType(int i) {
            return getRuleContext(DataTypeContext.class, i);
        }

        public TerminalNode GT() {
            return getToken(SqlBaseParser.GT, 0);
        }

        public TerminalNode ARRAY() {
            return getToken(SqlBaseParser.ARRAY, 0);
        }

        public TerminalNode MAP() {
            return getToken(SqlBaseParser.MAP, 0);
        }

        public TerminalNode STRUCT() {
            return getToken(SqlBaseParser.STRUCT, 0);
        }

        public TerminalNode NEQ() {
            return getToken(SqlBaseParser.NEQ, 0);
        }

        public ComplexColTypeListContext complexColTypeList() {
            return getRuleContext(ComplexColTypeListContext.class, 0);
        }

        public ComplexDataTypeContext(DataTypeContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterComplexDataType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitComplexDataType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitComplexDataType(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PrimitiveDataTypeContext extends DataTypeContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public List<TerminalNode> INTEGER_VALUE() {
            return getTokens(SqlBaseParser.INTEGER_VALUE);
        }

        public TerminalNode INTEGER_VALUE(int i) {
            return getToken(SqlBaseParser.INTEGER_VALUE, i);
        }

        public PrimitiveDataTypeContext(DataTypeContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterPrimitiveDataType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitPrimitiveDataType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitPrimitiveDataType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DataTypeContext dataType() throws RecognitionException {
        DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
        enterRule(_localctx, 168, RULE_dataType);
        int _la;
        try {
            setState(2263);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 299, _ctx)) {
                case 1:
                    _localctx = new ComplexDataTypeContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(2229);
                        ((ComplexDataTypeContext) _localctx).complex = match(ARRAY);
                        setState(2230);
                        match(LT);
                        setState(2231);
                        dataType();
                        setState(2232);
                        match(GT);
                    }
                    break;
                case 2:
                    _localctx = new ComplexDataTypeContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(2234);
                        ((ComplexDataTypeContext) _localctx).complex = match(MAP);
                        setState(2235);
                        match(LT);
                        setState(2236);
                        dataType();
                        setState(2237);
                        match(T__2);
                        setState(2238);
                        dataType();
                        setState(2239);
                        match(GT);
                    }
                    break;
                case 3:
                    _localctx = new ComplexDataTypeContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(2241);
                        ((ComplexDataTypeContext) _localctx).complex = match(STRUCT);
                        setState(2248);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case LT:
                                {
                                    setState(2242);
                                    match(LT);
                                    setState(2244);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2048L) != 0)
                                            || ((((_la - 64)) & ~0x3f) == 0
                                                    && ((1L << (_la - 64)) & -1L) != 0)
                                            || ((((_la - 128)) & ~0x3f) == 0
                                                    && ((1L << (_la - 128)) & -2149548029L) != 0)
                                            || ((((_la - 192)) & ~0x3f) == 0
                                                    && ((1L << (_la - 192)) & 216454257090494463L)
                                                            != 0)) {
                                        {
                                            setState(2243);
                                            complexColTypeList();
                                        }
                                    }

                                    setState(2246);
                                    match(GT);
                                }
                                break;
                            case NEQ:
                                {
                                    setState(2247);
                                    match(NEQ);
                                }
                                break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    break;
                case 4:
                    _localctx = new PrimitiveDataTypeContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(2250);
                        identifier();
                        setState(2261);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 298, _ctx)) {
                            case 1:
                                {
                                    setState(2251);
                                    match(T__0);
                                    setState(2252);
                                    match(INTEGER_VALUE);
                                    setState(2257);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    while (_la == T__2) {
                                        {
                                            {
                                                setState(2253);
                                                match(T__2);
                                                setState(2254);
                                                match(INTEGER_VALUE);
                                            }
                                        }
                                        setState(2259);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                    }
                                    setState(2260);
                                    match(T__1);
                                }
                                break;
                        }
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ColTypeListContext extends ParserRuleContext {
        public List<ColTypeContext> colType() {
            return getRuleContexts(ColTypeContext.class);
        }

        public ColTypeContext colType(int i) {
            return getRuleContext(ColTypeContext.class, i);
        }

        public ColTypeListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_colTypeList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterColTypeList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitColTypeList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitColTypeList(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ColTypeListContext colTypeList() throws RecognitionException {
        ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
        enterRule(_localctx, 170, RULE_colTypeList);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(2265);
                colType();
                setState(2270);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 300, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(2266);
                                match(T__2);
                                setState(2267);
                                colType();
                            }
                        }
                    }
                    setState(2272);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 300, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ColTypeContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public DataTypeContext dataType() {
            return getRuleContext(DataTypeContext.class, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(SqlBaseParser.COMMENT, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public ColTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_colType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterColType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitColType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitColType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ColTypeContext colType() throws RecognitionException {
        ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
        enterRule(_localctx, 172, RULE_colType);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2273);
                identifier();
                setState(2274);
                dataType();
                setState(2277);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 301, _ctx)) {
                    case 1:
                        {
                            setState(2275);
                            match(COMMENT);
                            setState(2276);
                            match(STRING);
                        }
                        break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ComplexColTypeListContext extends ParserRuleContext {
        public List<ComplexColTypeContext> complexColType() {
            return getRuleContexts(ComplexColTypeContext.class);
        }

        public ComplexColTypeContext complexColType(int i) {
            return getRuleContext(ComplexColTypeContext.class, i);
        }

        public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_complexColTypeList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterComplexColTypeList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitComplexColTypeList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitComplexColTypeList(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
        ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
        enterRule(_localctx, 174, RULE_complexColTypeList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2279);
                complexColType();
                setState(2284);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(2280);
                            match(T__2);
                            setState(2281);
                            complexColType();
                        }
                    }
                    setState(2286);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ComplexColTypeContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public DataTypeContext dataType() {
            return getRuleContext(DataTypeContext.class, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(SqlBaseParser.COMMENT, 0);
        }

        public TerminalNode STRING() {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_complexColType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterComplexColType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitComplexColType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitComplexColType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ComplexColTypeContext complexColType() throws RecognitionException {
        ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
        enterRule(_localctx, 176, RULE_complexColType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2287);
                identifier();
                setState(2288);
                match(T__9);
                setState(2289);
                dataType();
                setState(2292);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == COMMENT) {
                    {
                        setState(2290);
                        match(COMMENT);
                        setState(2291);
                        match(STRING);
                    }
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class WhenClauseContext extends ParserRuleContext {
        public ExpressionContext condition;
        public ExpressionContext result;

        public TerminalNode WHEN() {
            return getToken(SqlBaseParser.WHEN, 0);
        }

        public TerminalNode THEN() {
            return getToken(SqlBaseParser.THEN, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public WhenClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_whenClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterWhenClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitWhenClause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitWhenClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final WhenClauseContext whenClause() throws RecognitionException {
        WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
        enterRule(_localctx, 178, RULE_whenClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2294);
                match(WHEN);
                setState(2295);
                ((WhenClauseContext) _localctx).condition = expression();
                setState(2296);
                match(THEN);
                setState(2297);
                ((WhenClauseContext) _localctx).result = expression();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class WindowsContext extends ParserRuleContext {
        public TerminalNode WINDOW() {
            return getToken(SqlBaseParser.WINDOW, 0);
        }

        public List<NamedWindowContext> namedWindow() {
            return getRuleContexts(NamedWindowContext.class);
        }

        public NamedWindowContext namedWindow(int i) {
            return getRuleContext(NamedWindowContext.class, i);
        }

        public WindowsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_windows;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterWindows(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener) ((SqlBaseListener) listener).exitWindows(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitWindows(this);
            else return visitor.visitChildren(this);
        }
    }

    public final WindowsContext windows() throws RecognitionException {
        WindowsContext _localctx = new WindowsContext(_ctx, getState());
        enterRule(_localctx, 180, RULE_windows);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(2299);
                match(WINDOW);
                setState(2300);
                namedWindow();
                setState(2305);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 304, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(2301);
                                match(T__2);
                                setState(2302);
                                namedWindow();
                            }
                        }
                    }
                    setState(2307);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 304, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class NamedWindowContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public WindowSpecContext windowSpec() {
            return getRuleContext(WindowSpecContext.class, 0);
        }

        public NamedWindowContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_namedWindow;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNamedWindow(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNamedWindow(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNamedWindow(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NamedWindowContext namedWindow() throws RecognitionException {
        NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
        enterRule(_localctx, 182, RULE_namedWindow);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2308);
                identifier();
                setState(2309);
                match(AS);
                setState(2310);
                windowSpec();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class WindowSpecContext extends ParserRuleContext {
        public WindowSpecContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_windowSpec;
        }

        public WindowSpecContext() {}

        public void copyFrom(WindowSpecContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class WindowRefContext extends WindowSpecContext {
        public IdentifierContext name;

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public WindowRefContext(WindowSpecContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterWindowRef(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitWindowRef(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitWindowRef(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class WindowDefContext extends WindowSpecContext {
        public ExpressionContext expression;
        public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();

        public TerminalNode CLUSTER() {
            return getToken(SqlBaseParser.CLUSTER, 0);
        }

        public List<TerminalNode> BY() {
            return getTokens(SqlBaseParser.BY);
        }

        public TerminalNode BY(int i) {
            return getToken(SqlBaseParser.BY, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public WindowFrameContext windowFrame() {
            return getRuleContext(WindowFrameContext.class, 0);
        }

        public List<SortItemContext> sortItem() {
            return getRuleContexts(SortItemContext.class);
        }

        public SortItemContext sortItem(int i) {
            return getRuleContext(SortItemContext.class, i);
        }

        public TerminalNode PARTITION() {
            return getToken(SqlBaseParser.PARTITION, 0);
        }

        public TerminalNode DISTRIBUTE() {
            return getToken(SqlBaseParser.DISTRIBUTE, 0);
        }

        public TerminalNode ORDER() {
            return getToken(SqlBaseParser.ORDER, 0);
        }

        public TerminalNode SORT() {
            return getToken(SqlBaseParser.SORT, 0);
        }

        public WindowDefContext(WindowSpecContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterWindowDef(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitWindowDef(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitWindowDef(this);
            else return visitor.visitChildren(this);
        }
    }

    public final WindowSpecContext windowSpec() throws RecognitionException {
        WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
        enterRule(_localctx, 184, RULE_windowSpec);
        int _la;
        try {
            setState(2358);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 312, _ctx)) {
                case 1:
                    _localctx = new WindowRefContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(2312);
                        ((WindowRefContext) _localctx).name = identifier();
                    }
                    break;
                case 2:
                    _localctx = new WindowRefContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(2313);
                        match(T__0);
                        setState(2314);
                        ((WindowRefContext) _localctx).name = identifier();
                        setState(2315);
                        match(T__1);
                    }
                    break;
                case 3:
                    _localctx = new WindowDefContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(2317);
                        match(T__0);
                        setState(2352);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case CLUSTER:
                                {
                                    setState(2318);
                                    match(CLUSTER);
                                    setState(2319);
                                    match(BY);
                                    setState(2320);
                                    ((WindowDefContext) _localctx).expression = expression();
                                    ((WindowDefContext) _localctx)
                                            .partition.add(
                                                    ((WindowDefContext) _localctx).expression);
                                    setState(2325);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    while (_la == T__2) {
                                        {
                                            {
                                                setState(2321);
                                                match(T__2);
                                                setState(2322);
                                                ((WindowDefContext) _localctx).expression =
                                                        expression();
                                                ((WindowDefContext) _localctx)
                                                        .partition.add(
                                                                ((WindowDefContext) _localctx)
                                                                        .expression);
                                            }
                                        }
                                        setState(2327);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                    }
                                }
                                break;
                            case T__1:
                            case ORDER:
                            case PARTITION:
                            case RANGE:
                            case ROWS:
                            case SORT:
                            case DISTRIBUTE:
                                {
                                    setState(2338);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == PARTITION || _la == DISTRIBUTE) {
                                        {
                                            setState(2328);
                                            _la = _input.LA(1);
                                            if (!(_la == PARTITION || _la == DISTRIBUTE)) {
                                                _errHandler.recoverInline(this);
                                            } else {
                                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                                _errHandler.reportMatch(this);
                                                consume();
                                            }
                                            setState(2329);
                                            match(BY);
                                            setState(2330);
                                            ((WindowDefContext) _localctx).expression =
                                                    expression();
                                            ((WindowDefContext) _localctx)
                                                    .partition.add(
                                                            ((WindowDefContext) _localctx)
                                                                    .expression);
                                            setState(2335);
                                            _errHandler.sync(this);
                                            _la = _input.LA(1);
                                            while (_la == T__2) {
                                                {
                                                    {
                                                        setState(2331);
                                                        match(T__2);
                                                        setState(2332);
                                                        ((WindowDefContext) _localctx).expression =
                                                                expression();
                                                        ((WindowDefContext) _localctx)
                                                                .partition.add(
                                                                        ((WindowDefContext)
                                                                                        _localctx)
                                                                                .expression);
                                                    }
                                                }
                                                setState(2337);
                                                _errHandler.sync(this);
                                                _la = _input.LA(1);
                                            }
                                        }
                                    }

                                    setState(2350);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == ORDER || _la == SORT) {
                                        {
                                            setState(2340);
                                            _la = _input.LA(1);
                                            if (!(_la == ORDER || _la == SORT)) {
                                                _errHandler.recoverInline(this);
                                            } else {
                                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                                _errHandler.reportMatch(this);
                                                consume();
                                            }
                                            setState(2341);
                                            match(BY);
                                            setState(2342);
                                            sortItem();
                                            setState(2347);
                                            _errHandler.sync(this);
                                            _la = _input.LA(1);
                                            while (_la == T__2) {
                                                {
                                                    {
                                                        setState(2343);
                                                        match(T__2);
                                                        setState(2344);
                                                        sortItem();
                                                    }
                                                }
                                                setState(2349);
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
                        setState(2355);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == RANGE || _la == ROWS) {
                            {
                                setState(2354);
                                windowFrame();
                            }
                        }

                        setState(2357);
                        match(T__1);
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class WindowFrameContext extends ParserRuleContext {
        public Token frameType;
        public FrameBoundContext start;
        public FrameBoundContext end;

        public TerminalNode RANGE() {
            return getToken(SqlBaseParser.RANGE, 0);
        }

        public List<FrameBoundContext> frameBound() {
            return getRuleContexts(FrameBoundContext.class);
        }

        public FrameBoundContext frameBound(int i) {
            return getRuleContext(FrameBoundContext.class, i);
        }

        public TerminalNode ROWS() {
            return getToken(SqlBaseParser.ROWS, 0);
        }

        public TerminalNode BETWEEN() {
            return getToken(SqlBaseParser.BETWEEN, 0);
        }

        public TerminalNode AND() {
            return getToken(SqlBaseParser.AND, 0);
        }

        public WindowFrameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_windowFrame;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterWindowFrame(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitWindowFrame(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitWindowFrame(this);
            else return visitor.visitChildren(this);
        }
    }

    public final WindowFrameContext windowFrame() throws RecognitionException {
        WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
        enterRule(_localctx, 186, RULE_windowFrame);
        try {
            setState(2376);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 313, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(2360);
                        ((WindowFrameContext) _localctx).frameType = match(RANGE);
                        setState(2361);
                        ((WindowFrameContext) _localctx).start = frameBound();
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(2362);
                        ((WindowFrameContext) _localctx).frameType = match(ROWS);
                        setState(2363);
                        ((WindowFrameContext) _localctx).start = frameBound();
                    }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(2364);
                        ((WindowFrameContext) _localctx).frameType = match(RANGE);
                        setState(2365);
                        match(BETWEEN);
                        setState(2366);
                        ((WindowFrameContext) _localctx).start = frameBound();
                        setState(2367);
                        match(AND);
                        setState(2368);
                        ((WindowFrameContext) _localctx).end = frameBound();
                    }
                    break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(2370);
                        ((WindowFrameContext) _localctx).frameType = match(ROWS);
                        setState(2371);
                        match(BETWEEN);
                        setState(2372);
                        ((WindowFrameContext) _localctx).start = frameBound();
                        setState(2373);
                        match(AND);
                        setState(2374);
                        ((WindowFrameContext) _localctx).end = frameBound();
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FrameBoundContext extends ParserRuleContext {
        public Token boundType;

        public TerminalNode UNBOUNDED() {
            return getToken(SqlBaseParser.UNBOUNDED, 0);
        }

        public TerminalNode PRECEDING() {
            return getToken(SqlBaseParser.PRECEDING, 0);
        }

        public TerminalNode FOLLOWING() {
            return getToken(SqlBaseParser.FOLLOWING, 0);
        }

        public TerminalNode ROW() {
            return getToken(SqlBaseParser.ROW, 0);
        }

        public TerminalNode CURRENT() {
            return getToken(SqlBaseParser.CURRENT, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public FrameBoundContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_frameBound;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterFrameBound(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitFrameBound(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitFrameBound(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FrameBoundContext frameBound() throws RecognitionException {
        FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
        enterRule(_localctx, 188, RULE_frameBound);
        int _la;
        try {
            setState(2385);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 314, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(2378);
                        match(UNBOUNDED);
                        setState(2379);
                        ((FrameBoundContext) _localctx).boundType = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == PRECEDING || _la == FOLLOWING)) {
                            ((FrameBoundContext) _localctx).boundType =
                                    (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(2380);
                        ((FrameBoundContext) _localctx).boundType = match(CURRENT);
                        setState(2381);
                        match(ROW);
                    }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(2382);
                        expression();
                        setState(2383);
                        ((FrameBoundContext) _localctx).boundType = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == PRECEDING || _la == FOLLOWING)) {
                            ((FrameBoundContext) _localctx).boundType =
                                    (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QualifiedNameContext extends ParserRuleContext {
        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_qualifiedName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterQualifiedName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitQualifiedName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitQualifiedName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final QualifiedNameContext qualifiedName() throws RecognitionException {
        QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
        enterRule(_localctx, 190, RULE_qualifiedName);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(2387);
                identifier();
                setState(2392);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 315, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(2388);
                                match(T__3);
                                setState(2389);
                                identifier();
                            }
                        }
                    }
                    setState(2394);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 315, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IdentifierContext extends ParserRuleContext {
        public StrictIdentifierContext strictIdentifier() {
            return getRuleContext(StrictIdentifierContext.class, 0);
        }

        public TerminalNode ANTI() {
            return getToken(SqlBaseParser.ANTI, 0);
        }

        public TerminalNode FULL() {
            return getToken(SqlBaseParser.FULL, 0);
        }

        public TerminalNode INNER() {
            return getToken(SqlBaseParser.INNER, 0);
        }

        public TerminalNode LEFT() {
            return getToken(SqlBaseParser.LEFT, 0);
        }

        public TerminalNode SEMI() {
            return getToken(SqlBaseParser.SEMI, 0);
        }

        public TerminalNode RIGHT() {
            return getToken(SqlBaseParser.RIGHT, 0);
        }

        public TerminalNode NATURAL() {
            return getToken(SqlBaseParser.NATURAL, 0);
        }

        public TerminalNode JOIN() {
            return getToken(SqlBaseParser.JOIN, 0);
        }

        public TerminalNode CROSS() {
            return getToken(SqlBaseParser.CROSS, 0);
        }

        public TerminalNode ON() {
            return getToken(SqlBaseParser.ON, 0);
        }

        public TerminalNode UNION() {
            return getToken(SqlBaseParser.UNION, 0);
        }

        public TerminalNode INTERSECT() {
            return getToken(SqlBaseParser.INTERSECT, 0);
        }

        public TerminalNode EXCEPT() {
            return getToken(SqlBaseParser.EXCEPT, 0);
        }

        public TerminalNode SETMINUS() {
            return getToken(SqlBaseParser.SETMINUS, 0);
        }

        public IdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IdentifierContext identifier() throws RecognitionException {
        IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
        enterRule(_localctx, 192, RULE_identifier);
        try {
            setState(2410);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case SELECT:
                case FROM:
                case ADD:
                case AS:
                case ALL:
                case ANY:
                case DISTINCT:
                case WHERE:
                case GROUP:
                case BY:
                case GROUPING:
                case SETS:
                case CUBE:
                case ROLLUP:
                case ORDER:
                case HAVING:
                case LIMIT:
                case AT:
                case OR:
                case AND:
                case IN:
                case NOT:
                case NO:
                case EXISTS:
                case BETWEEN:
                case LIKE:
                case RLIKE:
                case IS:
                case NULL:
                case TRUE:
                case FALSE:
                case NULLS:
                case ASC:
                case DESC:
                case FOR:
                case INTERVAL:
                case CASE:
                case WHEN:
                case THEN:
                case ELSE:
                case END:
                case OUTER:
                case PIVOT:
                case LATERAL:
                case WINDOW:
                case OVER:
                case PARTITION:
                case RANGE:
                case ROWS:
                case UNBOUNDED:
                case PRECEDING:
                case FOLLOWING:
                case CURRENT:
                case FIRST:
                case AFTER:
                case LAST:
                case ROW:
                case WITH:
                case VALUES:
                case CREATE:
                case TABLE:
                case DIRECTORY:
                case VIEW:
                case REPLACE:
                case INSERT:
                case DELETE:
                case INTO:
                case DESCRIBE:
                case EXPLAIN:
                case FORMAT:
                case LOGICAL:
                case CODEGEN:
                case COST:
                case CAST:
                case SHOW:
                case TABLES:
                case COLUMNS:
                case COLUMN:
                case USE:
                case PARTITIONS:
                case FUNCTIONS:
                case DROP:
                case TO:
                case TABLESAMPLE:
                case STRATIFY:
                case ALTER:
                case RENAME:
                case ARRAY:
                case MAP:
                case STRUCT:
                case COMMENT:
                case SET:
                case RESET:
                case DATA:
                case START:
                case TRANSACTION:
                case COMMIT:
                case ROLLBACK:
                case MACRO:
                case IGNORE:
                case BOTH:
                case LEADING:
                case TRAILING:
                case IF:
                case POSITION:
                case EXTRACT:
                case DIV:
                case PERCENTLIT:
                case BUCKET:
                case OUT:
                case OF:
                case SORT:
                case CLUSTER:
                case DISTRIBUTE:
                case OVERWRITE:
                case TRANSFORM:
                case REDUCE:
                case SERDE:
                case SERDEPROPERTIES:
                case RECORDREADER:
                case RECORDWRITER:
                case DELIMITED:
                case FIELDS:
                case TERMINATED:
                case COLLECTION:
                case ITEMS:
                case KEYS:
                case ESCAPED:
                case LINES:
                case SEPARATED:
                case FUNCTION:
                case EXTENDED:
                case REFRESH:
                case CLEAR:
                case CACHE:
                case UNCACHE:
                case LAZY:
                case FORMATTED:
                case GLOBAL:
                case TEMPORARY:
                case OPTIONS:
                case UNSET:
                case TBLPROPERTIES:
                case DBPROPERTIES:
                case BUCKETS:
                case SKEWED:
                case STORED:
                case DIRECTORIES:
                case LOCATION:
                case EXCHANGE:
                case ARCHIVE:
                case UNARCHIVE:
                case FILEFORMAT:
                case TOUCH:
                case COMPACT:
                case CONCATENATE:
                case CHANGE:
                case CASCADE:
                case RESTRICT:
                case CLUSTERED:
                case SORTED:
                case PURGE:
                case INPUTFORMAT:
                case OUTPUTFORMAT:
                case DATABASE:
                case DATABASES:
                case DFS:
                case TRUNCATE:
                case ANALYZE:
                case COMPUTE:
                case LIST:
                case STATISTICS:
                case PARTITIONED:
                case EXTERNAL:
                case DEFINED:
                case REVOKE:
                case GRANT:
                case LOCK:
                case UNLOCK:
                case MSCK:
                case REPAIR:
                case RECOVER:
                case EXPORT:
                case IMPORT:
                case LOAD:
                case ROLE:
                case ROLES:
                case COMPACTIONS:
                case PRINCIPALS:
                case TRANSACTIONS:
                case INDEX:
                case INDEXES:
                case LOCKS:
                case OPTION:
                case LOCAL:
                case INPATH:
                case IDENTIFIER:
                case BACKQUOTED_IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(2395);
                        strictIdentifier();
                    }
                    break;
                case ANTI:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(2396);
                        match(ANTI);
                    }
                    break;
                case FULL:
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(2397);
                        match(FULL);
                    }
                    break;
                case INNER:
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(2398);
                        match(INNER);
                    }
                    break;
                case LEFT:
                    enterOuterAlt(_localctx, 5);
                    {
                        setState(2399);
                        match(LEFT);
                    }
                    break;
                case SEMI:
                    enterOuterAlt(_localctx, 6);
                    {
                        setState(2400);
                        match(SEMI);
                    }
                    break;
                case RIGHT:
                    enterOuterAlt(_localctx, 7);
                    {
                        setState(2401);
                        match(RIGHT);
                    }
                    break;
                case NATURAL:
                    enterOuterAlt(_localctx, 8);
                    {
                        setState(2402);
                        match(NATURAL);
                    }
                    break;
                case JOIN:
                    enterOuterAlt(_localctx, 9);
                    {
                        setState(2403);
                        match(JOIN);
                    }
                    break;
                case CROSS:
                    enterOuterAlt(_localctx, 10);
                    {
                        setState(2404);
                        match(CROSS);
                    }
                    break;
                case ON:
                    enterOuterAlt(_localctx, 11);
                    {
                        setState(2405);
                        match(ON);
                    }
                    break;
                case UNION:
                    enterOuterAlt(_localctx, 12);
                    {
                        setState(2406);
                        match(UNION);
                    }
                    break;
                case INTERSECT:
                    enterOuterAlt(_localctx, 13);
                    {
                        setState(2407);
                        match(INTERSECT);
                    }
                    break;
                case EXCEPT:
                    enterOuterAlt(_localctx, 14);
                    {
                        setState(2408);
                        match(EXCEPT);
                    }
                    break;
                case SETMINUS:
                    enterOuterAlt(_localctx, 15);
                    {
                        setState(2409);
                        match(SETMINUS);
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StrictIdentifierContext extends ParserRuleContext {
        public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_strictIdentifier;
        }

        public StrictIdentifierContext() {}

        public void copyFrom(StrictIdentifierContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
        public QuotedIdentifierContext quotedIdentifier() {
            return getRuleContext(QuotedIdentifierContext.class, 0);
        }

        public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterQuotedIdentifierAlternative(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitQuotedIdentifierAlternative(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor)
                        .visitQuotedIdentifierAlternative(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class UnquotedIdentifierContext extends StrictIdentifierContext {
        public TerminalNode IDENTIFIER() {
            return getToken(SqlBaseParser.IDENTIFIER, 0);
        }

        public NonReservedContext nonReserved() {
            return getRuleContext(NonReservedContext.class, 0);
        }

        public UnquotedIdentifierContext(StrictIdentifierContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterUnquotedIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitUnquotedIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitUnquotedIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
        StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
        enterRule(_localctx, 194, RULE_strictIdentifier);
        try {
            setState(2415);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    _localctx = new UnquotedIdentifierContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(2412);
                        match(IDENTIFIER);
                    }
                    break;
                case BACKQUOTED_IDENTIFIER:
                    _localctx = new QuotedIdentifierAlternativeContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(2413);
                        quotedIdentifier();
                    }
                    break;
                case SELECT:
                case FROM:
                case ADD:
                case AS:
                case ALL:
                case ANY:
                case DISTINCT:
                case WHERE:
                case GROUP:
                case BY:
                case GROUPING:
                case SETS:
                case CUBE:
                case ROLLUP:
                case ORDER:
                case HAVING:
                case LIMIT:
                case AT:
                case OR:
                case AND:
                case IN:
                case NOT:
                case NO:
                case EXISTS:
                case BETWEEN:
                case LIKE:
                case RLIKE:
                case IS:
                case NULL:
                case TRUE:
                case FALSE:
                case NULLS:
                case ASC:
                case DESC:
                case FOR:
                case INTERVAL:
                case CASE:
                case WHEN:
                case THEN:
                case ELSE:
                case END:
                case OUTER:
                case PIVOT:
                case LATERAL:
                case WINDOW:
                case OVER:
                case PARTITION:
                case RANGE:
                case ROWS:
                case UNBOUNDED:
                case PRECEDING:
                case FOLLOWING:
                case CURRENT:
                case FIRST:
                case AFTER:
                case LAST:
                case ROW:
                case WITH:
                case VALUES:
                case CREATE:
                case TABLE:
                case DIRECTORY:
                case VIEW:
                case REPLACE:
                case INSERT:
                case DELETE:
                case INTO:
                case DESCRIBE:
                case EXPLAIN:
                case FORMAT:
                case LOGICAL:
                case CODEGEN:
                case COST:
                case CAST:
                case SHOW:
                case TABLES:
                case COLUMNS:
                case COLUMN:
                case USE:
                case PARTITIONS:
                case FUNCTIONS:
                case DROP:
                case TO:
                case TABLESAMPLE:
                case STRATIFY:
                case ALTER:
                case RENAME:
                case ARRAY:
                case MAP:
                case STRUCT:
                case COMMENT:
                case SET:
                case RESET:
                case DATA:
                case START:
                case TRANSACTION:
                case COMMIT:
                case ROLLBACK:
                case MACRO:
                case IGNORE:
                case BOTH:
                case LEADING:
                case TRAILING:
                case IF:
                case POSITION:
                case EXTRACT:
                case DIV:
                case PERCENTLIT:
                case BUCKET:
                case OUT:
                case OF:
                case SORT:
                case CLUSTER:
                case DISTRIBUTE:
                case OVERWRITE:
                case TRANSFORM:
                case REDUCE:
                case SERDE:
                case SERDEPROPERTIES:
                case RECORDREADER:
                case RECORDWRITER:
                case DELIMITED:
                case FIELDS:
                case TERMINATED:
                case COLLECTION:
                case ITEMS:
                case KEYS:
                case ESCAPED:
                case LINES:
                case SEPARATED:
                case FUNCTION:
                case EXTENDED:
                case REFRESH:
                case CLEAR:
                case CACHE:
                case UNCACHE:
                case LAZY:
                case FORMATTED:
                case GLOBAL:
                case TEMPORARY:
                case OPTIONS:
                case UNSET:
                case TBLPROPERTIES:
                case DBPROPERTIES:
                case BUCKETS:
                case SKEWED:
                case STORED:
                case DIRECTORIES:
                case LOCATION:
                case EXCHANGE:
                case ARCHIVE:
                case UNARCHIVE:
                case FILEFORMAT:
                case TOUCH:
                case COMPACT:
                case CONCATENATE:
                case CHANGE:
                case CASCADE:
                case RESTRICT:
                case CLUSTERED:
                case SORTED:
                case PURGE:
                case INPUTFORMAT:
                case OUTPUTFORMAT:
                case DATABASE:
                case DATABASES:
                case DFS:
                case TRUNCATE:
                case ANALYZE:
                case COMPUTE:
                case LIST:
                case STATISTICS:
                case PARTITIONED:
                case EXTERNAL:
                case DEFINED:
                case REVOKE:
                case GRANT:
                case LOCK:
                case UNLOCK:
                case MSCK:
                case REPAIR:
                case RECOVER:
                case EXPORT:
                case IMPORT:
                case LOAD:
                case ROLE:
                case ROLES:
                case COMPACTIONS:
                case PRINCIPALS:
                case TRANSACTIONS:
                case INDEX:
                case INDEXES:
                case LOCKS:
                case OPTION:
                case LOCAL:
                case INPATH:
                    _localctx = new UnquotedIdentifierContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(2414);
                        nonReserved();
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QuotedIdentifierContext extends ParserRuleContext {
        public TerminalNode BACKQUOTED_IDENTIFIER() {
            return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0);
        }

        public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_quotedIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterQuotedIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitQuotedIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitQuotedIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
        QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
        enterRule(_localctx, 196, RULE_quotedIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2417);
                match(BACKQUOTED_IDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class NumberContext extends ParserRuleContext {
        public NumberContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_number;
        }

        public NumberContext() {}

        public void copyFrom(NumberContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DecimalLiteralContext extends NumberContext {
        public TerminalNode DECIMAL_VALUE() {
            return getToken(SqlBaseParser.DECIMAL_VALUE, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SqlBaseParser.MINUS, 0);
        }

        public DecimalLiteralContext(NumberContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDecimalLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDecimalLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDecimalLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BigIntLiteralContext extends NumberContext {
        public TerminalNode BIGINT_LITERAL() {
            return getToken(SqlBaseParser.BIGINT_LITERAL, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SqlBaseParser.MINUS, 0);
        }

        public BigIntLiteralContext(NumberContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterBigIntLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitBigIntLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitBigIntLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TinyIntLiteralContext extends NumberContext {
        public TerminalNode TINYINT_LITERAL() {
            return getToken(SqlBaseParser.TINYINT_LITERAL, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SqlBaseParser.MINUS, 0);
        }

        public TinyIntLiteralContext(NumberContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTinyIntLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTinyIntLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTinyIntLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BigDecimalLiteralContext extends NumberContext {
        public TerminalNode BIGDECIMAL_LITERAL() {
            return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SqlBaseParser.MINUS, 0);
        }

        public BigDecimalLiteralContext(NumberContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterBigDecimalLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitBigDecimalLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitBigDecimalLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DoubleLiteralContext extends NumberContext {
        public TerminalNode DOUBLE_LITERAL() {
            return getToken(SqlBaseParser.DOUBLE_LITERAL, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SqlBaseParser.MINUS, 0);
        }

        public DoubleLiteralContext(NumberContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDoubleLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDoubleLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDoubleLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IntegerLiteralContext extends NumberContext {
        public TerminalNode INTEGER_VALUE() {
            return getToken(SqlBaseParser.INTEGER_VALUE, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SqlBaseParser.MINUS, 0);
        }

        public IntegerLiteralContext(NumberContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterIntegerLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitIntegerLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitIntegerLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SmallIntLiteralContext extends NumberContext {
        public TerminalNode SMALLINT_LITERAL() {
            return getToken(SqlBaseParser.SMALLINT_LITERAL, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SqlBaseParser.MINUS, 0);
        }

        public SmallIntLiteralContext(NumberContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSmallIntLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSmallIntLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSmallIntLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NumberContext number() throws RecognitionException {
        NumberContext _localctx = new NumberContext(_ctx, getState());
        enterRule(_localctx, 198, RULE_number);
        int _la;
        try {
            setState(2447);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 325, _ctx)) {
                case 1:
                    _localctx = new DecimalLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(2420);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(2419);
                                match(MINUS);
                            }
                        }

                        setState(2422);
                        match(DECIMAL_VALUE);
                    }
                    break;
                case 2:
                    _localctx = new IntegerLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(2424);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(2423);
                                match(MINUS);
                            }
                        }

                        setState(2426);
                        match(INTEGER_VALUE);
                    }
                    break;
                case 3:
                    _localctx = new BigIntLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(2428);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(2427);
                                match(MINUS);
                            }
                        }

                        setState(2430);
                        match(BIGINT_LITERAL);
                    }
                    break;
                case 4:
                    _localctx = new SmallIntLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(2432);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(2431);
                                match(MINUS);
                            }
                        }

                        setState(2434);
                        match(SMALLINT_LITERAL);
                    }
                    break;
                case 5:
                    _localctx = new TinyIntLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                    {
                        setState(2436);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(2435);
                                match(MINUS);
                            }
                        }

                        setState(2438);
                        match(TINYINT_LITERAL);
                    }
                    break;
                case 6:
                    _localctx = new DoubleLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                    {
                        setState(2440);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(2439);
                                match(MINUS);
                            }
                        }

                        setState(2442);
                        match(DOUBLE_LITERAL);
                    }
                    break;
                case 7:
                    _localctx = new BigDecimalLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                    {
                        setState(2444);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(2443);
                                match(MINUS);
                            }
                        }

                        setState(2446);
                        match(BIGDECIMAL_LITERAL);
                    }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class NonReservedContext extends ParserRuleContext {
        public TerminalNode SHOW() {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode TABLES() {
            return getToken(SqlBaseParser.TABLES, 0);
        }

        public TerminalNode COLUMNS() {
            return getToken(SqlBaseParser.COLUMNS, 0);
        }

        public TerminalNode COLUMN() {
            return getToken(SqlBaseParser.COLUMN, 0);
        }

        public TerminalNode PARTITIONS() {
            return getToken(SqlBaseParser.PARTITIONS, 0);
        }

        public TerminalNode FUNCTIONS() {
            return getToken(SqlBaseParser.FUNCTIONS, 0);
        }

        public TerminalNode DATABASES() {
            return getToken(SqlBaseParser.DATABASES, 0);
        }

        public TerminalNode ADD() {
            return getToken(SqlBaseParser.ADD, 0);
        }

        public TerminalNode OVER() {
            return getToken(SqlBaseParser.OVER, 0);
        }

        public TerminalNode PARTITION() {
            return getToken(SqlBaseParser.PARTITION, 0);
        }

        public TerminalNode RANGE() {
            return getToken(SqlBaseParser.RANGE, 0);
        }

        public TerminalNode ROWS() {
            return getToken(SqlBaseParser.ROWS, 0);
        }

        public TerminalNode PRECEDING() {
            return getToken(SqlBaseParser.PRECEDING, 0);
        }

        public TerminalNode FOLLOWING() {
            return getToken(SqlBaseParser.FOLLOWING, 0);
        }

        public TerminalNode CURRENT() {
            return getToken(SqlBaseParser.CURRENT, 0);
        }

        public TerminalNode ROW() {
            return getToken(SqlBaseParser.ROW, 0);
        }

        public TerminalNode LAST() {
            return getToken(SqlBaseParser.LAST, 0);
        }

        public TerminalNode FIRST() {
            return getToken(SqlBaseParser.FIRST, 0);
        }

        public TerminalNode AFTER() {
            return getToken(SqlBaseParser.AFTER, 0);
        }

        public TerminalNode MAP() {
            return getToken(SqlBaseParser.MAP, 0);
        }

        public TerminalNode ARRAY() {
            return getToken(SqlBaseParser.ARRAY, 0);
        }

        public TerminalNode STRUCT() {
            return getToken(SqlBaseParser.STRUCT, 0);
        }

        public TerminalNode PIVOT() {
            return getToken(SqlBaseParser.PIVOT, 0);
        }

        public TerminalNode LATERAL() {
            return getToken(SqlBaseParser.LATERAL, 0);
        }

        public TerminalNode WINDOW() {
            return getToken(SqlBaseParser.WINDOW, 0);
        }

        public TerminalNode REDUCE() {
            return getToken(SqlBaseParser.REDUCE, 0);
        }

        public TerminalNode TRANSFORM() {
            return getToken(SqlBaseParser.TRANSFORM, 0);
        }

        public TerminalNode SERDE() {
            return getToken(SqlBaseParser.SERDE, 0);
        }

        public TerminalNode SERDEPROPERTIES() {
            return getToken(SqlBaseParser.SERDEPROPERTIES, 0);
        }

        public TerminalNode RECORDREADER() {
            return getToken(SqlBaseParser.RECORDREADER, 0);
        }

        public TerminalNode DELIMITED() {
            return getToken(SqlBaseParser.DELIMITED, 0);
        }

        public TerminalNode FIELDS() {
            return getToken(SqlBaseParser.FIELDS, 0);
        }

        public TerminalNode TERMINATED() {
            return getToken(SqlBaseParser.TERMINATED, 0);
        }

        public TerminalNode COLLECTION() {
            return getToken(SqlBaseParser.COLLECTION, 0);
        }

        public TerminalNode ITEMS() {
            return getToken(SqlBaseParser.ITEMS, 0);
        }

        public TerminalNode KEYS() {
            return getToken(SqlBaseParser.KEYS, 0);
        }

        public TerminalNode ESCAPED() {
            return getToken(SqlBaseParser.ESCAPED, 0);
        }

        public TerminalNode LINES() {
            return getToken(SqlBaseParser.LINES, 0);
        }

        public TerminalNode SEPARATED() {
            return getToken(SqlBaseParser.SEPARATED, 0);
        }

        public TerminalNode EXTENDED() {
            return getToken(SqlBaseParser.EXTENDED, 0);
        }

        public TerminalNode REFRESH() {
            return getToken(SqlBaseParser.REFRESH, 0);
        }

        public TerminalNode CLEAR() {
            return getToken(SqlBaseParser.CLEAR, 0);
        }

        public TerminalNode CACHE() {
            return getToken(SqlBaseParser.CACHE, 0);
        }

        public TerminalNode UNCACHE() {
            return getToken(SqlBaseParser.UNCACHE, 0);
        }

        public TerminalNode LAZY() {
            return getToken(SqlBaseParser.LAZY, 0);
        }

        public TerminalNode GLOBAL() {
            return getToken(SqlBaseParser.GLOBAL, 0);
        }

        public TerminalNode TEMPORARY() {
            return getToken(SqlBaseParser.TEMPORARY, 0);
        }

        public TerminalNode OPTIONS() {
            return getToken(SqlBaseParser.OPTIONS, 0);
        }

        public TerminalNode GROUPING() {
            return getToken(SqlBaseParser.GROUPING, 0);
        }

        public TerminalNode CUBE() {
            return getToken(SqlBaseParser.CUBE, 0);
        }

        public TerminalNode ROLLUP() {
            return getToken(SqlBaseParser.ROLLUP, 0);
        }

        public TerminalNode EXPLAIN() {
            return getToken(SqlBaseParser.EXPLAIN, 0);
        }

        public TerminalNode FORMAT() {
            return getToken(SqlBaseParser.FORMAT, 0);
        }

        public TerminalNode LOGICAL() {
            return getToken(SqlBaseParser.LOGICAL, 0);
        }

        public TerminalNode FORMATTED() {
            return getToken(SqlBaseParser.FORMATTED, 0);
        }

        public TerminalNode CODEGEN() {
            return getToken(SqlBaseParser.CODEGEN, 0);
        }

        public TerminalNode COST() {
            return getToken(SqlBaseParser.COST, 0);
        }

        public TerminalNode TABLESAMPLE() {
            return getToken(SqlBaseParser.TABLESAMPLE, 0);
        }

        public TerminalNode USE() {
            return getToken(SqlBaseParser.USE, 0);
        }

        public TerminalNode TO() {
            return getToken(SqlBaseParser.TO, 0);
        }

        public TerminalNode BUCKET() {
            return getToken(SqlBaseParser.BUCKET, 0);
        }

        public TerminalNode PERCENTLIT() {
            return getToken(SqlBaseParser.PERCENTLIT, 0);
        }

        public TerminalNode OUT() {
            return getToken(SqlBaseParser.OUT, 0);
        }

        public TerminalNode OF() {
            return getToken(SqlBaseParser.OF, 0);
        }

        public TerminalNode SET() {
            return getToken(SqlBaseParser.SET, 0);
        }

        public TerminalNode RESET() {
            return getToken(SqlBaseParser.RESET, 0);
        }

        public TerminalNode VIEW() {
            return getToken(SqlBaseParser.VIEW, 0);
        }

        public TerminalNode REPLACE() {
            return getToken(SqlBaseParser.REPLACE, 0);
        }

        public TerminalNode IF() {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode POSITION() {
            return getToken(SqlBaseParser.POSITION, 0);
        }

        public TerminalNode EXTRACT() {
            return getToken(SqlBaseParser.EXTRACT, 0);
        }

        public TerminalNode NO() {
            return getToken(SqlBaseParser.NO, 0);
        }

        public TerminalNode DATA() {
            return getToken(SqlBaseParser.DATA, 0);
        }

        public TerminalNode START() {
            return getToken(SqlBaseParser.START, 0);
        }

        public TerminalNode TRANSACTION() {
            return getToken(SqlBaseParser.TRANSACTION, 0);
        }

        public TerminalNode COMMIT() {
            return getToken(SqlBaseParser.COMMIT, 0);
        }

        public TerminalNode ROLLBACK() {
            return getToken(SqlBaseParser.ROLLBACK, 0);
        }

        public TerminalNode IGNORE() {
            return getToken(SqlBaseParser.IGNORE, 0);
        }

        public TerminalNode SORT() {
            return getToken(SqlBaseParser.SORT, 0);
        }

        public TerminalNode CLUSTER() {
            return getToken(SqlBaseParser.CLUSTER, 0);
        }

        public TerminalNode DISTRIBUTE() {
            return getToken(SqlBaseParser.DISTRIBUTE, 0);
        }

        public TerminalNode UNSET() {
            return getToken(SqlBaseParser.UNSET, 0);
        }

        public TerminalNode TBLPROPERTIES() {
            return getToken(SqlBaseParser.TBLPROPERTIES, 0);
        }

        public TerminalNode SKEWED() {
            return getToken(SqlBaseParser.SKEWED, 0);
        }

        public TerminalNode STORED() {
            return getToken(SqlBaseParser.STORED, 0);
        }

        public TerminalNode DIRECTORIES() {
            return getToken(SqlBaseParser.DIRECTORIES, 0);
        }

        public TerminalNode LOCATION() {
            return getToken(SqlBaseParser.LOCATION, 0);
        }

        public TerminalNode EXCHANGE() {
            return getToken(SqlBaseParser.EXCHANGE, 0);
        }

        public TerminalNode ARCHIVE() {
            return getToken(SqlBaseParser.ARCHIVE, 0);
        }

        public TerminalNode UNARCHIVE() {
            return getToken(SqlBaseParser.UNARCHIVE, 0);
        }

        public TerminalNode FILEFORMAT() {
            return getToken(SqlBaseParser.FILEFORMAT, 0);
        }

        public TerminalNode TOUCH() {
            return getToken(SqlBaseParser.TOUCH, 0);
        }

        public TerminalNode COMPACT() {
            return getToken(SqlBaseParser.COMPACT, 0);
        }

        public TerminalNode CONCATENATE() {
            return getToken(SqlBaseParser.CONCATENATE, 0);
        }

        public TerminalNode CHANGE() {
            return getToken(SqlBaseParser.CHANGE, 0);
        }

        public TerminalNode CASCADE() {
            return getToken(SqlBaseParser.CASCADE, 0);
        }

        public TerminalNode RESTRICT() {
            return getToken(SqlBaseParser.RESTRICT, 0);
        }

        public TerminalNode BUCKETS() {
            return getToken(SqlBaseParser.BUCKETS, 0);
        }

        public TerminalNode CLUSTERED() {
            return getToken(SqlBaseParser.CLUSTERED, 0);
        }

        public TerminalNode SORTED() {
            return getToken(SqlBaseParser.SORTED, 0);
        }

        public TerminalNode PURGE() {
            return getToken(SqlBaseParser.PURGE, 0);
        }

        public TerminalNode INPUTFORMAT() {
            return getToken(SqlBaseParser.INPUTFORMAT, 0);
        }

        public TerminalNode OUTPUTFORMAT() {
            return getToken(SqlBaseParser.OUTPUTFORMAT, 0);
        }

        public TerminalNode DBPROPERTIES() {
            return getToken(SqlBaseParser.DBPROPERTIES, 0);
        }

        public TerminalNode DFS() {
            return getToken(SqlBaseParser.DFS, 0);
        }

        public TerminalNode TRUNCATE() {
            return getToken(SqlBaseParser.TRUNCATE, 0);
        }

        public TerminalNode COMPUTE() {
            return getToken(SqlBaseParser.COMPUTE, 0);
        }

        public TerminalNode LIST() {
            return getToken(SqlBaseParser.LIST, 0);
        }

        public TerminalNode STATISTICS() {
            return getToken(SqlBaseParser.STATISTICS, 0);
        }

        public TerminalNode ANALYZE() {
            return getToken(SqlBaseParser.ANALYZE, 0);
        }

        public TerminalNode PARTITIONED() {
            return getToken(SqlBaseParser.PARTITIONED, 0);
        }

        public TerminalNode EXTERNAL() {
            return getToken(SqlBaseParser.EXTERNAL, 0);
        }

        public TerminalNode DEFINED() {
            return getToken(SqlBaseParser.DEFINED, 0);
        }

        public TerminalNode RECORDWRITER() {
            return getToken(SqlBaseParser.RECORDWRITER, 0);
        }

        public TerminalNode REVOKE() {
            return getToken(SqlBaseParser.REVOKE, 0);
        }

        public TerminalNode GRANT() {
            return getToken(SqlBaseParser.GRANT, 0);
        }

        public TerminalNode LOCK() {
            return getToken(SqlBaseParser.LOCK, 0);
        }

        public TerminalNode UNLOCK() {
            return getToken(SqlBaseParser.UNLOCK, 0);
        }

        public TerminalNode MSCK() {
            return getToken(SqlBaseParser.MSCK, 0);
        }

        public TerminalNode REPAIR() {
            return getToken(SqlBaseParser.REPAIR, 0);
        }

        public TerminalNode RECOVER() {
            return getToken(SqlBaseParser.RECOVER, 0);
        }

        public TerminalNode EXPORT() {
            return getToken(SqlBaseParser.EXPORT, 0);
        }

        public TerminalNode IMPORT() {
            return getToken(SqlBaseParser.IMPORT, 0);
        }

        public TerminalNode LOAD() {
            return getToken(SqlBaseParser.LOAD, 0);
        }

        public TerminalNode VALUES() {
            return getToken(SqlBaseParser.VALUES, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(SqlBaseParser.COMMENT, 0);
        }

        public TerminalNode ROLE() {
            return getToken(SqlBaseParser.ROLE, 0);
        }

        public TerminalNode ROLES() {
            return getToken(SqlBaseParser.ROLES, 0);
        }

        public TerminalNode COMPACTIONS() {
            return getToken(SqlBaseParser.COMPACTIONS, 0);
        }

        public TerminalNode PRINCIPALS() {
            return getToken(SqlBaseParser.PRINCIPALS, 0);
        }

        public TerminalNode TRANSACTIONS() {
            return getToken(SqlBaseParser.TRANSACTIONS, 0);
        }

        public TerminalNode INDEX() {
            return getToken(SqlBaseParser.INDEX, 0);
        }

        public TerminalNode INDEXES() {
            return getToken(SqlBaseParser.INDEXES, 0);
        }

        public TerminalNode LOCKS() {
            return getToken(SqlBaseParser.LOCKS, 0);
        }

        public TerminalNode OPTION() {
            return getToken(SqlBaseParser.OPTION, 0);
        }

        public TerminalNode LOCAL() {
            return getToken(SqlBaseParser.LOCAL, 0);
        }

        public TerminalNode INPATH() {
            return getToken(SqlBaseParser.INPATH, 0);
        }

        public TerminalNode ASC() {
            return getToken(SqlBaseParser.ASC, 0);
        }

        public TerminalNode DESC() {
            return getToken(SqlBaseParser.DESC, 0);
        }

        public TerminalNode LIMIT() {
            return getToken(SqlBaseParser.LIMIT, 0);
        }

        public TerminalNode RENAME() {
            return getToken(SqlBaseParser.RENAME, 0);
        }

        public TerminalNode SETS() {
            return getToken(SqlBaseParser.SETS, 0);
        }

        public TerminalNode AT() {
            return getToken(SqlBaseParser.AT, 0);
        }

        public TerminalNode NULLS() {
            return getToken(SqlBaseParser.NULLS, 0);
        }

        public TerminalNode OVERWRITE() {
            return getToken(SqlBaseParser.OVERWRITE, 0);
        }

        public TerminalNode ALL() {
            return getToken(SqlBaseParser.ALL, 0);
        }

        public TerminalNode ANY() {
            return getToken(SqlBaseParser.ANY, 0);
        }

        public TerminalNode ALTER() {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode AS() {
            return getToken(SqlBaseParser.AS, 0);
        }

        public TerminalNode BETWEEN() {
            return getToken(SqlBaseParser.BETWEEN, 0);
        }

        public TerminalNode BY() {
            return getToken(SqlBaseParser.BY, 0);
        }

        public TerminalNode CREATE() {
            return getToken(SqlBaseParser.CREATE, 0);
        }

        public TerminalNode DELETE() {
            return getToken(SqlBaseParser.DELETE, 0);
        }

        public TerminalNode DESCRIBE() {
            return getToken(SqlBaseParser.DESCRIBE, 0);
        }

        public TerminalNode DROP() {
            return getToken(SqlBaseParser.DROP, 0);
        }

        public TerminalNode EXISTS() {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public TerminalNode FALSE() {
            return getToken(SqlBaseParser.FALSE, 0);
        }

        public TerminalNode FOR() {
            return getToken(SqlBaseParser.FOR, 0);
        }

        public TerminalNode GROUP() {
            return getToken(SqlBaseParser.GROUP, 0);
        }

        public TerminalNode IN() {
            return getToken(SqlBaseParser.IN, 0);
        }

        public TerminalNode INSERT() {
            return getToken(SqlBaseParser.INSERT, 0);
        }

        public TerminalNode INTO() {
            return getToken(SqlBaseParser.INTO, 0);
        }

        public TerminalNode IS() {
            return getToken(SqlBaseParser.IS, 0);
        }

        public TerminalNode LIKE() {
            return getToken(SqlBaseParser.LIKE, 0);
        }

        public TerminalNode NULL() {
            return getToken(SqlBaseParser.NULL, 0);
        }

        public TerminalNode ORDER() {
            return getToken(SqlBaseParser.ORDER, 0);
        }

        public TerminalNode OUTER() {
            return getToken(SqlBaseParser.OUTER, 0);
        }

        public TerminalNode TABLE() {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TerminalNode TRUE() {
            return getToken(SqlBaseParser.TRUE, 0);
        }

        public TerminalNode WITH() {
            return getToken(SqlBaseParser.WITH, 0);
        }

        public TerminalNode RLIKE() {
            return getToken(SqlBaseParser.RLIKE, 0);
        }

        public TerminalNode AND() {
            return getToken(SqlBaseParser.AND, 0);
        }

        public TerminalNode CASE() {
            return getToken(SqlBaseParser.CASE, 0);
        }

        public TerminalNode CAST() {
            return getToken(SqlBaseParser.CAST, 0);
        }

        public TerminalNode DISTINCT() {
            return getToken(SqlBaseParser.DISTINCT, 0);
        }

        public TerminalNode DIV() {
            return getToken(SqlBaseParser.DIV, 0);
        }

        public TerminalNode ELSE() {
            return getToken(SqlBaseParser.ELSE, 0);
        }

        public TerminalNode END() {
            return getToken(SqlBaseParser.END, 0);
        }

        public TerminalNode FUNCTION() {
            return getToken(SqlBaseParser.FUNCTION, 0);
        }

        public TerminalNode INTERVAL() {
            return getToken(SqlBaseParser.INTERVAL, 0);
        }

        public TerminalNode MACRO() {
            return getToken(SqlBaseParser.MACRO, 0);
        }

        public TerminalNode OR() {
            return getToken(SqlBaseParser.OR, 0);
        }

        public TerminalNode STRATIFY() {
            return getToken(SqlBaseParser.STRATIFY, 0);
        }

        public TerminalNode THEN() {
            return getToken(SqlBaseParser.THEN, 0);
        }

        public TerminalNode UNBOUNDED() {
            return getToken(SqlBaseParser.UNBOUNDED, 0);
        }

        public TerminalNode WHEN() {
            return getToken(SqlBaseParser.WHEN, 0);
        }

        public TerminalNode DATABASE() {
            return getToken(SqlBaseParser.DATABASE, 0);
        }

        public TerminalNode SELECT() {
            return getToken(SqlBaseParser.SELECT, 0);
        }

        public TerminalNode FROM() {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public TerminalNode WHERE() {
            return getToken(SqlBaseParser.WHERE, 0);
        }

        public TerminalNode HAVING() {
            return getToken(SqlBaseParser.HAVING, 0);
        }

        public TerminalNode NOT() {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public TerminalNode DIRECTORY() {
            return getToken(SqlBaseParser.DIRECTORY, 0);
        }

        public TerminalNode BOTH() {
            return getToken(SqlBaseParser.BOTH, 0);
        }

        public TerminalNode LEADING() {
            return getToken(SqlBaseParser.LEADING, 0);
        }

        public TerminalNode TRAILING() {
            return getToken(SqlBaseParser.TRAILING, 0);
        }

        public NonReservedContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nonReserved;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNonReserved(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNonReserved(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNonReserved(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NonReservedContext nonReserved() throws RecognitionException {
        NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
        enterRule(_localctx, 200, RULE_nonReserved);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2449);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & -4589168020290537472L) != 0)
                        || ((((_la - 64)) & ~0x3f) == 0
                                && ((1L << (_la - 64)) & -4123168604161L) != 0)
                        || ((((_la - 128)) & ~0x3f) == 0
                                && ((1L << (_la - 128)) & -2149548029L) != 0)
                        || ((((_la - 192)) & ~0x3f) == 0
                                && ((1L << (_la - 192)) & 246290604621823L) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 35:
                return queryTerm_sempred((QueryTermContext) _localctx, predIndex);
            case 71:
                return booleanExpression_sempred((BooleanExpressionContext) _localctx, predIndex);
            case 73:
                return valueExpression_sempred((ValueExpressionContext) _localctx, predIndex);
            case 74:
                return primaryExpression_sempred((PrimaryExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 3);
            case 1:
                return legacy_setops_precedence_enbled;
            case 2:
                return precpred(_ctx, 2);
            case 3:
                return !legacy_setops_precedence_enbled;
            case 4:
                return precpred(_ctx, 1);
            case 5:
                return !legacy_setops_precedence_enbled;
        }
        return true;
    }

    private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 6:
                return precpred(_ctx, 2);
            case 7:
                return precpred(_ctx, 1);
        }
        return true;
    }

    private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 8:
                return precpred(_ctx, 6);
            case 9:
                return precpred(_ctx, 5);
            case 10:
                return precpred(_ctx, 4);
            case 11:
                return precpred(_ctx, 3);
            case 12:
                return precpred(_ctx, 2);
            case 13:
                return precpred(_ctx, 1);
        }
        return true;
    }

    private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 14:
                return precpred(_ctx, 5);
            case 15:
                return precpred(_ctx, 3);
        }
        return true;
    }

    private static final String _serializedATNSegment0 =
            "\u0004\u0001\u00fe\u0994\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"
                    + "\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"
                    + "\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"
                    + "\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"
                    + "\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"
                    + "\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"
                    + "\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"
                    + "\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"
                    + "\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"
                    + "\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"
                    + "\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"
                    + "\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"
                    + "\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"
                    + ",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"
                    + "1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"
                    + "6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"
                    + ";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"
                    + "@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"
                    + "E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"
                    + "J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"
                    + "O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"
                    + "T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"
                    + "Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"
                    + "^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"
                    + "c\u0002d\u0007d\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"
                    + "\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"
                    + "\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"
                    + "\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00e5\b\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ea\b\u0006\u0001\u0006\u0003"
                    + "\u0006\u00ed\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00f2"
                    + "\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"
                    + "\u0006\u00ff\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0103\b\u0006"
                    + "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"
                    + "\u010a\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
                    + "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
                    + "\u0001\u0006\u0005\u0006\u0118\b\u0006\n\u0006\f\u0006\u011b\t\u0006\u0001"
                    + "\u0006\u0003\u0006\u011e\b\u0006\u0001\u0006\u0003\u0006\u0121\b\u0006"
                    + "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"
                    + "\u0128\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
                    + "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
                    + "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0139\b\u0006"
                    + "\n\u0006\f\u0006\u013c\t\u0006\u0001\u0006\u0003\u0006\u013f\b\u0006\u0001"
                    + "\u0006\u0003\u0006\u0142\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0003\u0006\u0149\b\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0003\u0006\u014f\b\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0003\u0006\u0155\b\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u015d\b\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"
                    + "\u0006\u017d\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0003\u0006\u0185\b\u0006\u0001\u0006\u0001\u0006\u0003"
                    + "\u0006\u0189\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u018e"
                    + "\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0194"
                    + "\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0003\u0006\u019c\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0003\u0006\u01a2\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0003\u0006\u01af\b\u0006\u0001\u0006\u0004\u0006\u01b2"
                    + "\b\u0006\u000b\u0006\f\u0006\u01b3\u0001\u0006\u0001\u0006\u0001\u0006"
                    + "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u01bd\b\u0006"
                    + "\u0001\u0006\u0004\u0006\u01c0\b\u0006\u000b\u0006\f\u0006\u01c1\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0003\u0006\u01d2\b\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0005\u0006\u01d7\b\u0006\n\u0006\f\u0006\u01da\t\u0006\u0001\u0006"
                    + "\u0003\u0006\u01dd\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
                    + "\u0001\u0006\u0001\u0006\u0003\u0006\u01e5\b\u0006\u0001\u0006\u0001\u0006"
                    + "\u0001\u0006\u0005\u0006\u01ea\b\u0006\n\u0006\f\u0006\u01ed\t\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u01f3\b\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0003\u0006\u0202\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0206"
                    + "\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u020c"
                    + "\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0212"
                    + "\b\u0006\u0001\u0006\u0003\u0006\u0215\b\u0006\u0001\u0006\u0003\u0006"
                    + "\u0218\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"
                    + "\u021e\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0222\b\u0006\u0001"
                    + "\u0006\u0001\u0006\u0003\u0006\u0226\b\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0003\u0006\u022b\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u022f"
                    + "\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0003\u0006\u0237\b\u0006\u0001\u0006\u0003\u0006\u023a\b\u0006"
                    + "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
                    + "\u0001\u0006\u0003\u0006\u0243\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
                    + "\u0003\u0006\u0248\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
                    + "\u0003\u0006\u024e\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
                    + "\u0001\u0006\u0003\u0006\u0255\b\u0006\u0001\u0006\u0003\u0006\u0258\b"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u025e"
                    + "\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0005\u0006\u0267\b\u0006\n\u0006\f\u0006\u026a\t\u0006"
                    + "\u0003\u0006\u026c\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0270\b"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0275\b\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u027a\b\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0281\b\u0006\u0001"
                    + "\u0006\u0003\u0006\u0284\b\u0006\u0001\u0006\u0003\u0006\u0287\b\u0006"
                    + "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"
                    + "\u028e\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0293\b"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0298\b\u0006\u0001"
                    + "\u0006\u0003\u0006\u029b\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u02a4\b\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"
                    + "\u0006\u02ac\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"
                    + "\u0006\u02b2\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u02b6\b\u0006"
                    + "\u0001\u0006\u0001\u0006\u0003\u0006\u02ba\b\u0006\u0001\u0006\u0001\u0006"
                    + "\u0003\u0006\u02be\b\u0006\u0003\u0006\u02c0\b\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"
                    + "\u0006\u02c9\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"
                    + "\u0006\u02cf\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u02d4"
                    + "\b\u0006\u0001\u0006\u0003\u0006\u02d7\b\u0006\u0001\u0006\u0001\u0006"
                    + "\u0003\u0006\u02db\b\u0006\u0001\u0006\u0003\u0006\u02de\b\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"
                    + "\u0006\u02e6\b\u0006\n\u0006\f\u0006\u02e9\t\u0006\u0003\u0006\u02eb\b"
                    + "\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u02ef\b\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0003\u0006\u02f4\b\u0006\u0001\u0006\u0003\u0006\u02f7"
                    + "\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u02fd"
                    + "\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0003\u0006\u0305\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"
                    + "\u0006\u030a\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"
                    + "\u0006\u0310\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"
                    + "\u0006\u0316\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u031f\b\u0006\n\u0006\f\u0006"
                    + "\u0322\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0327\b"
                    + "\u0006\n\u0006\f\u0006\u032a\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006"
                    + "\u032e\b\u0006\n\u0006\f\u0006\u0331\t\u0006\u0001\u0006\u0001\u0006\u0001"
                    + "\u0006\u0005\u0006\u0336\b\u0006\n\u0006\f\u0006\u0339\t\u0006\u0003\u0006"
                    + "\u033b\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0003\u0007\u0343\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007"
                    + "\u0347\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0003\u0007\u034e\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0003\u0007\u03c2\b\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03ca\b\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0003\u0007\u03d2\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03db\b\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
                    + "\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03e7\b\u0007\u0001\b"
                    + "\u0001\b\u0003\b\u03eb\b\b\u0001\b\u0003\b\u03ee\b\b\u0001\b\u0001\b\u0001"
                    + "\b\u0001\b\u0003\b\u03f4\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"
                    + "\t\u0001\t\u0001\t\u0003\t\u03fe\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"
                    + "\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u040a\b\n\u0001\n\u0001"
                    + "\n\u0001\n\u0003\n\u040f\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"
                    + "\f\u0003\f\u0415\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"
                    + "\r\u0001\r\u0001\r\u0001\r\u0003\r\u0421\b\r\u0003\r\u0423\b\r\u0001\r"
                    + "\u0001\r\u0001\r\u0003\r\u0428\b\r\u0001\r\u0001\r\u0003\r\u042c\b\r\u0001"
                    + "\r\u0001\r\u0001\r\u0003\r\u0431\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u0436"
                    + "\b\r\u0001\r\u0003\r\u0439\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u043e\b"
                    + "\r\u0001\r\u0001\r\u0003\r\u0442\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u0447"
                    + "\b\r\u0003\r\u0449\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u044d\b\u000e"
                    + "\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"
                    + "\u0454\b\u000f\n\u000f\f\u000f\u0457\t\u000f\u0001\u000f\u0001\u000f\u0001"
                    + "\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u045e\b\u0010\u0001\u0011\u0001"
                    + "\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0465\b\u0011\u0001"
                    + "\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u046a\b\u0012\n\u0012\f\u0012"
                    + "\u046d\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"
                    + "\u0473\b\u0013\n\u0013\f\u0013\u0476\t\u0013\u0001\u0014\u0001\u0014\u0003"
                    + "\u0014\u047a\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"
                    + "\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"
                    + "\u0016\u0005\u0016\u0487\b\u0016\n\u0016\f\u0016\u048a\t\u0016\u0001\u0016"
                    + "\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0490\b\u0017\u0001\u0017"
                    + "\u0003\u0017\u0493\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"
                    + "\u0498\b\u0018\n\u0018\f\u0018\u049b\t\u0018\u0001\u0018\u0003\u0018\u049e"
                    + "\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u04a4"
                    + "\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u04aa"
                    + "\b\u001a\n\u001a\f\u001a\u04ad\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b"
                    + "\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u04b5\b\u001b\n\u001b"
                    + "\f\u001b\u04b8\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"
                    + "\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u04c2\b\u001c"
                    + "\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"
                    + "\u04c9\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"
                    + "\u04cf\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0003 \u04d5"
                    + "\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0004 \u04dc\b \u000b \f \u04dd"
                    + "\u0003 \u04e0\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u04e7\b!\n"
                    + "!\f!\u04ea\t!\u0003!\u04ec\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005"
                    + "!\u04f3\b!\n!\f!\u04f6\t!\u0003!\u04f8\b!\u0001!\u0001!\u0001!\u0001!"
                    + "\u0001!\u0005!\u04ff\b!\n!\f!\u0502\t!\u0003!\u0504\b!\u0001!\u0001!\u0001"
                    + "!\u0001!\u0001!\u0005!\u050b\b!\n!\f!\u050e\t!\u0003!\u0510\b!\u0001!"
                    + "\u0003!\u0513\b!\u0001!\u0001!\u0001!\u0003!\u0518\b!\u0003!\u051a\b!"
                    + "\u0001\"\u0003\"\u051d\b\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"
                    + "#\u0001#\u0001#\u0001#\u0001#\u0003#\u0529\b#\u0001#\u0001#\u0001#\u0001"
                    + "#\u0001#\u0003#\u0530\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0537"
                    + "\b#\u0001#\u0005#\u053a\b#\n#\f#\u053d\t#\u0001$\u0001$\u0001$\u0001$"
                    + "\u0001$\u0001$\u0001$\u0001$\u0003$\u0547\b$\u0001%\u0001%\u0003%\u054b"
                    + "\b%\u0001%\u0001%\u0003%\u054f\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"
                    + "&\u0001&\u0001&\u0001&\u0001&\u0003&\u055b\b&\u0001&\u0003&\u055e\b&\u0001"
                    + "&\u0001&\u0003&\u0562\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"
                    + "&\u0001&\u0003&\u056c\b&\u0001&\u0001&\u0003&\u0570\b&\u0003&\u0572\b"
                    + "&\u0001&\u0003&\u0575\b&\u0001&\u0001&\u0003&\u0579\b&\u0001&\u0003&\u057c"
                    + "\b&\u0001&\u0001&\u0003&\u0580\b&\u0001&\u0001&\u0005&\u0584\b&\n&\f&"
                    + "\u0587\t&\u0001&\u0003&\u058a\b&\u0001&\u0001&\u0003&\u058e\b&\u0001&"
                    + "\u0001&\u0001&\u0003&\u0593\b&\u0001&\u0003&\u0596\b&\u0003&\u0598\b&"
                    + "\u0001&\u0005&\u059b\b&\n&\f&\u059e\t&\u0001&\u0001&\u0003&\u05a2\b&\u0001"
                    + "&\u0003&\u05a5\b&\u0001&\u0001&\u0003&\u05a9\b&\u0001&\u0003&\u05ac\b"
                    + "&\u0003&\u05ae\b&\u0001\'\u0001\'\u0001\'\u0003\'\u05b3\b\'\u0001\'\u0005"
                    + "\'\u05b6\b\'\n\'\f\'\u05b9\t\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"
                    + "(\u0001(\u0001(\u0005(\u05c3\b(\n(\f(\u05c6\t(\u0001(\u0001(\u0003(\u05ca"
                    + "\b(\u0001)\u0001)\u0001)\u0001)\u0005)\u05d0\b)\n)\f)\u05d3\t)\u0001)"
                    + "\u0005)\u05d6\b)\n)\f)\u05d9\t)\u0001)\u0003)\u05dc\b)\u0001*\u0001*\u0001"
                    + "*\u0001*\u0001*\u0005*\u05e3\b*\n*\f*\u05e6\t*\u0001*\u0001*\u0001*\u0001"
                    + "*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u05f2\b*\n*\f*\u05f5"
                    + "\t*\u0001*\u0001*\u0003*\u05f9\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"
                    + "*\u0001*\u0001*\u0005*\u0603\b*\n*\f*\u0606\t*\u0001*\u0001*\u0003*\u060a"
                    + "\b*\u0001+\u0001+\u0001+\u0001+\u0005+\u0610\b+\n+\f+\u0613\t+\u0003+"
                    + "\u0615\b+\u0001+\u0001+\u0003+\u0619\b+\u0001,\u0001,\u0001,\u0001,\u0001"
                    + ",\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u0625\b,\n,\f,\u0628\t,\u0001"
                    + ",\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u0632\b-\n-"
                    + "\f-\u0635\t-\u0001-\u0001-\u0003-\u0639\b-\u0001.\u0001.\u0003.\u063d"
                    + "\b.\u0001.\u0003.\u0640\b.\u0001/\u0001/\u0001/\u0003/\u0645\b/\u0001"
                    + "/\u0001/\u0001/\u0001/\u0001/\u0005/\u064c\b/\n/\f/\u064f\t/\u0003/\u0651"
                    + "\b/\u0001/\u0001/\u0001/\u0003/\u0656\b/\u0001/\u0001/\u0001/\u0005/\u065b"
                    + "\b/\n/\f/\u065e\t/\u0003/\u0660\b/\u00010\u00010\u00011\u00011\u00051"
                    + "\u0666\b1\n1\f1\u0669\t1\u00012\u00012\u00012\u00012\u00032\u066f\b2\u0001"
                    + "2\u00012\u00012\u00012\u00012\u00032\u0676\b2\u00013\u00033\u0679\b3\u0001"
                    + "3\u00013\u00013\u00033\u067e\b3\u00013\u00013\u00013\u00013\u00033\u0684"
                    + "\b3\u00013\u00013\u00033\u0688\b3\u00013\u00033\u068b\b3\u00013\u0003"
                    + "3\u068e\b3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00054\u0697"
                    + "\b4\n4\f4\u069a\t4\u00014\u00014\u00034\u069e\b4\u00015\u00015\u00015"
                    + "\u00035\u06a3\b5\u00015\u00015\u00016\u00036\u06a8\b6\u00016\u00016\u0001"
                    + "6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"
                    + "6\u00016\u00016\u00016\u00036\u06ba\b6\u00036\u06bc\b6\u00016\u00036\u06bf"
                    + "\b6\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00058\u06c8\b8\n"
                    + "8\f8\u06cb\t8\u00019\u00019\u00019\u00019\u00059\u06d1\b9\n9\f9\u06d4"
                    + "\t9\u00019\u00019\u0001:\u0001:\u0003:\u06da\b:\u0001;\u0001;\u0001;\u0001"
                    + ";\u0005;\u06e0\b;\n;\f;\u06e3\t;\u0001;\u0001;\u0001<\u0001<\u0001<\u0003"
                    + "<\u06ea\b<\u0001=\u0001=\u0003=\u06ee\b=\u0001=\u0001=\u0001=\u0001=\u0001"
                    + "=\u0001=\u0003=\u06f6\b=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003"
                    + "=\u06fe\b=\u0001=\u0001=\u0001=\u0001=\u0003=\u0704\b=\u0001>\u0001>\u0001"
                    + ">\u0001>\u0005>\u070a\b>\n>\f>\u070d\t>\u0001>\u0001>\u0001?\u0001?\u0001"
                    + "?\u0001?\u0001?\u0005?\u0716\b?\n?\f?\u0719\t?\u0003?\u071b\b?\u0001?"
                    + "\u0001?\u0001?\u0001@\u0003@\u0721\b@\u0001@\u0001@\u0003@\u0725\b@\u0003"
                    + "@\u0727\b@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u0730"
                    + "\bA\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"
                    + "A\u0003A\u073c\bA\u0003A\u073e\bA\u0001A\u0001A\u0001A\u0001A\u0001A\u0003"
                    + "A\u0745\bA\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u074c\bA\u0001A\u0001"
                    + "A\u0001A\u0001A\u0003A\u0752\bA\u0001A\u0001A\u0001A\u0001A\u0003A\u0758"
                    + "\bA\u0003A\u075a\bA\u0001B\u0001B\u0001B\u0003B\u075f\bB\u0001B\u0001"
                    + "B\u0001C\u0001C\u0001C\u0003C\u0766\bC\u0001C\u0001C\u0001D\u0001D\u0003"
                    + "D\u076c\bD\u0001D\u0001D\u0003D\u0770\bD\u0003D\u0772\bD\u0001E\u0001"
                    + "E\u0001E\u0005E\u0777\bE\nE\fE\u077a\tE\u0001F\u0001F\u0001G\u0001G\u0001"
                    + "G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u0788\bG\u0003"
                    + "G\u078a\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0005G\u0792\bG\n"
                    + "G\fG\u0795\tG\u0001H\u0003H\u0798\bH\u0001H\u0001H\u0001H\u0001H\u0001"
                    + "H\u0001H\u0003H\u07a0\bH\u0001H\u0001H\u0001H\u0001H\u0001H\u0005H\u07a7"
                    + "\bH\nH\fH\u07aa\tH\u0001H\u0001H\u0001H\u0003H\u07af\bH\u0001H\u0001H"
                    + "\u0001H\u0001H\u0001H\u0001H\u0003H\u07b7\bH\u0001H\u0001H\u0001H\u0001"
                    + "H\u0003H\u07bd\bH\u0001H\u0001H\u0001H\u0003H\u07c2\bH\u0001H\u0001H\u0001"
                    + "H\u0003H\u07c7\bH\u0001I\u0001I\u0001I\u0001I\u0003I\u07cd\bI\u0001I\u0001"
                    + "I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"
                    + "I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0005I\u07e2\bI\nI"
                    + "\fI\u07e5\tI\u0001J\u0001J\u0001J\u0004J\u07ea\bJ\u000bJ\fJ\u07eb\u0001"
                    + "J\u0001J\u0003J\u07f0\bJ\u0001J\u0001J\u0001J\u0001J\u0001J\u0004J\u07f7"
                    + "\bJ\u000bJ\fJ\u07f8\u0001J\u0001J\u0003J\u07fd\bJ\u0001J\u0001J\u0001"
                    + "J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"
                    + "J\u0001J\u0005J\u080d\bJ\nJ\fJ\u0810\tJ\u0003J\u0812\bJ\u0001J\u0001J"
                    + "\u0001J\u0001J\u0001J\u0001J\u0003J\u081a\bJ\u0001J\u0001J\u0001J\u0001"
                    + "J\u0001J\u0001J\u0001J\u0003J\u0823\bJ\u0001J\u0001J\u0001J\u0001J\u0001"
                    + "J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"
                    + "J\u0001J\u0001J\u0001J\u0001J\u0004J\u0838\bJ\u000bJ\fJ\u0839\u0001J\u0001"
                    + "J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0003J\u0845\bJ\u0001"
                    + "J\u0001J\u0001J\u0005J\u084a\bJ\nJ\fJ\u084d\tJ\u0003J\u084f\bJ\u0001J"
                    + "\u0001J\u0001J\u0003J\u0854\bJ\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"
                    + "J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0004"
                    + "J\u0865\bJ\u000bJ\fJ\u0866\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"
                    + "J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0003J\u0878"
                    + "\bJ\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0005J\u0882"
                    + "\bJ\nJ\fJ\u0885\tJ\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"
                    + "K\u0004K\u088f\bK\u000bK\fK\u0890\u0003K\u0893\bK\u0001L\u0001L\u0001"
                    + "M\u0001M\u0001N\u0001N\u0001O\u0001O\u0001P\u0001P\u0005P\u089f\bP\nP"
                    + "\fP\u08a2\tP\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u08a8\bQ\u0001R\u0003"
                    + "R\u08ab\bR\u0001R\u0001R\u0003R\u08af\bR\u0001S\u0001S\u0001S\u0003S\u08b4"
                    + "\bS\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001"
                    + "T\u0001T\u0001T\u0001T\u0001T\u0001T\u0003T\u08c5\bT\u0001T\u0001T\u0003"
                    + "T\u08c9\bT\u0001T\u0001T\u0001T\u0001T\u0001T\u0005T\u08d0\bT\nT\fT\u08d3"
                    + "\tT\u0001T\u0003T\u08d6\bT\u0003T\u08d8\bT\u0001U\u0001U\u0001U\u0005"
                    + "U\u08dd\bU\nU\fU\u08e0\tU\u0001V\u0001V\u0001V\u0001V\u0003V\u08e6\bV"
                    + "\u0001W\u0001W\u0001W\u0005W\u08eb\bW\nW\fW\u08ee\tW\u0001X\u0001X\u0001"
                    + "X\u0001X\u0001X\u0003X\u08f5\bX\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001"
                    + "Z\u0001Z\u0001Z\u0001Z\u0005Z\u0900\bZ\nZ\fZ\u0903\tZ\u0001[\u0001[\u0001"
                    + "[\u0001[\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"
                    + "\\\u0001\\\u0001\\\u0001\\\u0005\\\u0914\b\\\n\\\f\\\u0917\t\\\u0001\\"
                    + "\u0001\\\u0001\\\u0001\\\u0001\\\u0005\\\u091e\b\\\n\\\f\\\u0921\t\\\u0003"
                    + "\\\u0923\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0005\\\u092a\b\\"
                    + "\n\\\f\\\u092d\t\\\u0003\\\u092f\b\\\u0003\\\u0931\b\\\u0001\\\u0003\\"
                    + "\u0934\b\\\u0001\\\u0003\\\u0937\b\\\u0001]\u0001]\u0001]\u0001]\u0001"
                    + "]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"
                    + "]\u0001]\u0003]\u0949\b]\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"
                    + "^\u0003^\u0952\b^\u0001_\u0001_\u0001_\u0005_\u0957\b_\n_\f_\u095a\t_"
                    + "\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001"
                    + "`\u0001`\u0001`\u0001`\u0001`\u0001`\u0003`\u096b\b`\u0001a\u0001a\u0001"
                    + "a\u0003a\u0970\ba\u0001b\u0001b\u0001c\u0003c\u0975\bc\u0001c\u0001c\u0003"
                    + "c\u0979\bc\u0001c\u0001c\u0003c\u097d\bc\u0001c\u0001c\u0003c\u0981\b"
                    + "c\u0001c\u0001c\u0003c\u0985\bc\u0001c\u0001c\u0003c\u0989\bc\u0001c\u0001"
                    + "c\u0003c\u098d\bc\u0001c\u0003c\u0990\bc\u0001d\u0001d\u0001d\u0005\u02e7"
                    + "\u0320\u0328\u032f\u0337\u0004F\u008e\u0092\u0094e\u0000\u0002\u0004\u0006"
                    + "\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."
                    + "02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"
                    + "\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"
                    + "\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"
                    + "\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u0000\u001b\u0001\u0000"
                    + "\u00c8\u00c9\u0002\u0000PPRR\u0003\u0000Z\\\u00ae\u00ae\u00b4\u00b4\u0002"
                    + "\u0000\f\f\u001f\u001f\u0002\u0000,,WW\u0002\u0000\u00ae\u00ae\u00b4\u00b4"
                    + "\u0002\u0000\r\r\u00d5\u00d5\u0001\u0000fi\u0001\u0000fh\u0001\u0000+"
                    + ",\u0002\u0000IIKK\u0002\u0000\u000f\u000f\u0011\u0011\u0001\u0000\u00f4"
                    + "\u00f5\u0001\u0000$%\u0002\u0000\u008a\u008b\u0090\u0090\u0001\u0000\u008c"
                    + "\u008f\u0002\u0000\u008a\u008b\u0093\u0093\u0001\u0000|~\u0001\u0000\u0082"
                    + "\u0089\u0001\u0000\u008a\u0094\u0001\u0000\u001d \u0001\u0000()\u0001"
                    + "\u0000\u008a\u008b\u0002\u0000BB\u009b\u009b\u0002\u0000\u0019\u0019\u0099"
                    + "\u0099\u0001\u0000FG\b\u0000\u000b366>ej\u0081\u008f\u008f\u0095\u009e"
                    + "\u00a0\u00ec\u00ee\u00ef\u0b2e\u0000\u00ca\u0001\u0000\u0000\u0000\u0002"
                    + "\u00cd\u0001\u0000\u0000\u0000\u0004\u00d0\u0001\u0000\u0000\u0000\u0006"
                    + "\u00d3\u0001\u0000\u0000\u0000\b\u00d6\u0001\u0000\u0000\u0000\n\u00d9"
                    + "\u0001\u0000\u0000\u0000\f\u033a\u0001\u0000\u0000\u0000\u000e\u03e6\u0001"
                    + "\u0000\u0000\u0000\u0010\u03e8\u0001\u0000\u0000\u0000\u0012\u03f7\u0001"
                    + "\u0000\u0000\u0000\u0014\u0403\u0001\u0000\u0000\u0000\u0016\u0410\u0001"
                    + "\u0000\u0000\u0000\u0018\u0414\u0001\u0000\u0000\u0000\u001a\u0448\u0001"
                    + "\u0000\u0000\u0000\u001c\u044a\u0001\u0000\u0000\u0000\u001e\u044e\u0001"
                    + "\u0000\u0000\u0000 \u045a\u0001\u0000\u0000\u0000\"\u0464\u0001\u0000"
                    + "\u0000\u0000$\u0466\u0001\u0000\u0000\u0000&\u046e\u0001\u0000\u0000\u0000"
                    + "(\u0477\u0001\u0000\u0000\u0000*\u047f\u0001\u0000\u0000\u0000,\u0482"
                    + "\u0001\u0000\u0000\u0000.\u048d\u0001\u0000\u0000\u00000\u049d\u0001\u0000"
                    + "\u0000\u00002\u04a3\u0001\u0000\u0000\u00004\u04a5\u0001\u0000\u0000\u0000"
                    + "6\u04b0\u0001\u0000\u0000\u00008\u04c1\u0001\u0000\u0000\u0000:\u04c8"
                    + "\u0001\u0000\u0000\u0000<\u04ca\u0001\u0000\u0000\u0000>\u04d0\u0001\u0000"
                    + "\u0000\u0000@\u04df\u0001\u0000\u0000\u0000B\u04eb\u0001\u0000\u0000\u0000"
                    + "D\u051c\u0001\u0000\u0000\u0000F\u0521\u0001\u0000\u0000\u0000H\u0546"
                    + "\u0001\u0000\u0000\u0000J\u0548\u0001\u0000\u0000\u0000L\u05ad\u0001\u0000"
                    + "\u0000\u0000N\u05af\u0001\u0000\u0000\u0000P\u05c9\u0001\u0000\u0000\u0000"
                    + "R\u05cb\u0001\u0000\u0000\u0000T\u0609\u0001\u0000\u0000\u0000V\u0618"
                    + "\u0001\u0000\u0000\u0000X\u061a\u0001\u0000\u0000\u0000Z\u0638\u0001\u0000"
                    + "\u0000\u0000\\\u063a\u0001\u0000\u0000\u0000^\u0641\u0001\u0000\u0000"
                    + "\u0000`\u0661\u0001\u0000\u0000\u0000b\u0663\u0001\u0000\u0000\u0000d"
                    + "\u0675\u0001\u0000\u0000\u0000f\u068d\u0001\u0000\u0000\u0000h\u069d\u0001"
                    + "\u0000\u0000\u0000j\u069f\u0001\u0000\u0000\u0000l\u06be\u0001\u0000\u0000"
                    + "\u0000n\u06c0\u0001\u0000\u0000\u0000p\u06c4\u0001\u0000\u0000\u0000r"
                    + "\u06cc\u0001\u0000\u0000\u0000t\u06d7\u0001\u0000\u0000\u0000v\u06db\u0001"
                    + "\u0000\u0000\u0000x\u06e6\u0001\u0000\u0000\u0000z\u0703\u0001\u0000\u0000"
                    + "\u0000|\u0705\u0001\u0000\u0000\u0000~\u0710\u0001\u0000\u0000\u0000\u0080"
                    + "\u0726\u0001\u0000\u0000\u0000\u0082\u0759\u0001\u0000\u0000\u0000\u0084"
                    + "\u075e\u0001\u0000\u0000\u0000\u0086\u0765\u0001\u0000\u0000\u0000\u0088"
                    + "\u0769\u0001\u0000\u0000\u0000\u008a\u0773\u0001\u0000\u0000\u0000\u008c"
                    + "\u077b\u0001\u0000\u0000\u0000\u008e\u0789\u0001\u0000\u0000\u0000\u0090"
                    + "\u07c6\u0001\u0000\u0000\u0000\u0092\u07cc\u0001\u0000\u0000\u0000\u0094"
                    + "\u0877\u0001\u0000\u0000\u0000\u0096\u0892\u0001\u0000\u0000\u0000\u0098"
                    + "\u0894\u0001\u0000\u0000\u0000\u009a\u0896\u0001\u0000\u0000\u0000\u009c"
                    + "\u0898\u0001\u0000\u0000\u0000\u009e\u089a\u0001\u0000\u0000\u0000\u00a0"
                    + "\u089c\u0001\u0000\u0000\u0000\u00a2\u08a3\u0001\u0000\u0000\u0000\u00a4"
                    + "\u08ae\u0001\u0000\u0000\u0000\u00a6\u08b3\u0001\u0000\u0000\u0000\u00a8"
                    + "\u08d7\u0001\u0000\u0000\u0000\u00aa\u08d9\u0001\u0000\u0000\u0000\u00ac"
                    + "\u08e1\u0001\u0000\u0000\u0000\u00ae\u08e7\u0001\u0000\u0000\u0000\u00b0"
                    + "\u08ef\u0001\u0000\u0000\u0000\u00b2\u08f6\u0001\u0000\u0000\u0000\u00b4"
                    + "\u08fb\u0001\u0000\u0000\u0000\u00b6\u0904\u0001\u0000\u0000\u0000\u00b8"
                    + "\u0936\u0001\u0000\u0000\u0000\u00ba\u0948\u0001\u0000\u0000\u0000\u00bc"
                    + "\u0951\u0001\u0000\u0000\u0000\u00be\u0953\u0001\u0000\u0000\u0000\u00c0"
                    + "\u096a\u0001\u0000\u0000\u0000\u00c2\u096f\u0001\u0000\u0000\u0000\u00c4"
                    + "\u0971\u0001\u0000\u0000\u0000\u00c6\u098f\u0001\u0000\u0000\u0000\u00c8"
                    + "\u0991\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003\f\u0006\u0000\u00cb\u00cc"
                    + "\u0005\u0000\u0000\u0001\u00cc\u0001\u0001\u0000\u0000\u0000\u00cd\u00ce"
                    + "\u0003\u0088D\u0000\u00ce\u00cf\u0005\u0000\u0000\u0001\u00cf\u0003\u0001"
                    + "\u0000\u0000\u0000\u00d0\u00d1\u0003\u0084B\u0000\u00d1\u00d2\u0005\u0000"
                    + "\u0000\u0001\u00d2\u0005\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003\u0086"
                    + "C\u0000\u00d4\u00d5\u0005\u0000\u0000\u0001\u00d5\u0007\u0001\u0000\u0000"
                    + "\u0000\u00d6\u00d7\u0003\u00a8T\u0000\u00d7\u00d8\u0005\u0000\u0000\u0001"
                    + "\u00d8\t\u0001\u0000\u0000\u0000\u00d9\u00da\u0003\u00aaU\u0000\u00da"
                    + "\u00db\u0005\u0000\u0000\u0001\u00db\u000b\u0001\u0000\u0000\u0000\u00dc"
                    + "\u033b\u0003\u0018\f\u0000\u00dd\u00de\u0005b\u0000\u0000\u00de\u033b"
                    + "\u0003\u00c0`\u0000\u00df\u00e0\u0005O\u0000\u0000\u00e0\u00e4\u0005\u00cf"
                    + "\u0000\u0000\u00e1\u00e2\u0005\u007f\u0000\u0000\u00e2\u00e3\u0005 \u0000"
                    + "\u0000\u00e3\u00e5\u0005\"\u0000\u0000\u00e4\u00e1\u0001\u0000\u0000\u0000"
                    + "\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"
                    + "\u00e6\u00e9\u0003\u00c0`\u0000\u00e7\u00e8\u0005r\u0000\u0000\u00e8\u00ea"
                    + "\u0005\u00f0\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea"
                    + "\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00ed"
                    + "\u0003\u0016\u000b\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed"
                    + "\u0001\u0000\u0000\u0000\u00ed\u00f1\u0001\u0000\u0000\u0000\u00ee\u00ef"
                    + "\u0005M\u0000\u0000\u00ef\u00f0\u0005\u00ba\u0000\u0000\u00f0\u00f2\u0003"
                    + ",\u0016\u0000\u00f1\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"
                    + "\u0000\u0000\u00f2\u033b\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005m\u0000"
                    + "\u0000\u00f4\u00f5\u0005\u00cf\u0000\u0000\u00f5\u00f6\u0003\u00c0`\u0000"
                    + "\u00f6\u00f7\u0005s\u0000\u0000\u00f7\u00f8\u0005\u00ba\u0000\u0000\u00f8"
                    + "\u00f9\u0003,\u0016\u0000\u00f9\u033b\u0001\u0000\u0000\u0000\u00fa\u00fb"
                    + "\u0005e\u0000\u0000\u00fb\u00fe\u0005\u00cf\u0000\u0000\u00fc\u00fd\u0005"
                    + "\u007f\u0000\u0000\u00fd\u00ff\u0005\"\u0000\u0000\u00fe\u00fc\u0001\u0000"
                    + "\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000"
                    + "\u0000\u0000\u0100\u0102\u0003\u00c0`\u0000\u0101\u0103\u0007\u0000\u0000"
                    + "\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"
                    + "\u0000\u0103\u033b\u0001\u0000\u0000\u0000\u0104\u0109\u0003\u0010\b\u0000"
                    + "\u0105\u0106\u0005\u0001\u0000\u0000\u0106\u0107\u0003\u00aaU\u0000\u0107"
                    + "\u0108\u0005\u0002\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109"
                    + "\u0105\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"
                    + "\u010b\u0001\u0000\u0000\u0000\u010b\u0119\u0003*\u0015\u0000\u010c\u010d"
                    + "\u0005\u00b7\u0000\u0000\u010d\u0118\u0003,\u0016\u0000\u010e\u010f\u0005"
                    + "\u00d7\u0000\u0000\u010f\u0110\u0005\u0014\u0000\u0000\u0110\u0118\u0003"
                    + "n7\u0000\u0111\u0118\u0003\u0012\t\u0000\u0112\u0118\u0003\u0016\u000b"
                    + "\u0000\u0113\u0114\u0005r\u0000\u0000\u0114\u0118\u0005\u00f0\u0000\u0000"
                    + "\u0115\u0116\u0005\u00b9\u0000\u0000\u0116\u0118\u0003,\u0016\u0000\u0117"
                    + "\u010c\u0001\u0000\u0000\u0000\u0117\u010e\u0001\u0000\u0000\u0000\u0117"
                    + "\u0111\u0001\u0000\u0000\u0000\u0117\u0112\u0001\u0000\u0000\u0000\u0117"
                    + "\u0113\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118"
                    + "\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119"
                    + "\u011a\u0001\u0000\u0000\u0000\u011a\u0120\u0001\u0000\u0000\u0000\u011b"
                    + "\u0119\u0001\u0000\u0000\u0000\u011c\u011e\u0005\u000e\u0000\u0000\u011d"
                    + "\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e"
                    + "\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0003\u0018\f\u0000\u0120\u011d"
                    + "\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u033b"
                    + "\u0001\u0000\u0000\u0000\u0122\u0127\u0003\u0010\b\u0000\u0123\u0124\u0005"
                    + "\u0001\u0000\u0000\u0124\u0125\u0003\u00aaU\u0000\u0125\u0126\u0005\u0002"
                    + "\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0123\u0001\u0000"
                    + "\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u013a\u0001\u0000"
                    + "\u0000\u0000\u0129\u012a\u0005r\u0000\u0000\u012a\u0139\u0005\u00f0\u0000"
                    + "\u0000\u012b\u012c\u0005\u00d7\u0000\u0000\u012c\u012d\u0005\u0014\u0000"
                    + "\u0000\u012d\u012e\u0005\u0001\u0000\u0000\u012e\u012f\u0003\u00aaU\u0000"
                    + "\u012f\u0130\u0005\u0002\u0000\u0000\u0130\u0139\u0001\u0000\u0000\u0000"
                    + "\u0131\u0139\u0003\u0012\t\u0000\u0132\u0139\u0003\u0014\n\u0000\u0133"
                    + "\u0139\u0003\u0082A\u0000\u0134\u0139\u00038\u001c\u0000\u0135\u0139\u0003"
                    + "\u0016\u000b\u0000\u0136\u0137\u0005\u00b9\u0000\u0000\u0137\u0139\u0003"
                    + ",\u0016\u0000\u0138\u0129\u0001\u0000\u0000\u0000\u0138\u012b\u0001\u0000"
                    + "\u0000\u0000\u0138\u0131\u0001\u0000\u0000\u0000\u0138\u0132\u0001\u0000"
                    + "\u0000\u0000\u0138\u0133\u0001\u0000\u0000\u0000\u0138\u0134\u0001\u0000"
                    + "\u0000\u0000\u0138\u0135\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000"
                    + "\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000"
                    + "\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u0141\u0001\u0000"
                    + "\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u013f\u0005\u000e"
                    + "\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000"
                    + "\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0142\u0003\u0018"
                    + "\f\u0000\u0141\u013e\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000"
                    + "\u0000\u0142\u033b\u0001\u0000\u0000\u0000\u0143\u0144\u0005O\u0000\u0000"
                    + "\u0144\u0148\u0005P\u0000\u0000\u0145\u0146\u0005\u007f\u0000\u0000\u0146"
                    + "\u0147\u0005 \u0000\u0000\u0147\u0149\u0005\"\u0000\u0000\u0148\u0145"
                    + "\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a"
                    + "\u0001\u0000\u0000\u0000\u014a\u014b\u0003\u0084B\u0000\u014b\u014c\u0005"
                    + "$\u0000\u0000\u014c\u014e\u0003\u0084B\u0000\u014d\u014f\u0003\u0016\u000b"
                    + "\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000"
                    + "\u0000\u014f\u033b\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u00d3\u0000"
                    + "\u0000\u0151\u0152\u0005P\u0000\u0000\u0152\u0154\u0003\u0084B\u0000\u0153"
                    + "\u0155\u0003\u001e\u000f\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154"
                    + "\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156"
                    + "\u0157\u0005\u00d4\u0000\u0000\u0157\u015c\u0005\u00d6\u0000\u0000\u0158"
                    + "\u015d\u0003\u00c0`\u0000\u0159\u015a\u0005-\u0000\u0000\u015a\u015b\u0005"
                    + "`\u0000\u0000\u015b\u015d\u0003p8\u0000\u015c\u0158\u0001\u0000\u0000"
                    + "\u0000\u015c\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000"
                    + "\u0000\u015d\u033b\u0001\u0000\u0000\u0000\u015e\u015f\u0005m\u0000\u0000"
                    + "\u015f\u0160\u0005P\u0000\u0000\u0160\u0161\u0003\u0084B\u0000\u0161\u0162"
                    + "\u0005\r\u0000\u0000\u0162\u0163\u0005`\u0000\u0000\u0163\u0164\u0005"
                    + "\u0001\u0000\u0000\u0164\u0165\u0003\u00aaU\u0000\u0165\u0166\u0005\u0002"
                    + "\u0000\u0000\u0166\u033b\u0001\u0000\u0000\u0000\u0167\u0168\u0005m\u0000"
                    + "\u0000\u0168\u0169\u0007\u0001\u0000\u0000\u0169\u016a\u0003\u0084B\u0000"
                    + "\u016a\u016b\u0005n\u0000\u0000\u016b\u016c\u0005j\u0000\u0000\u016c\u016d"
                    + "\u0003\u0084B\u0000\u016d\u033b\u0001\u0000\u0000\u0000\u016e\u016f\u0005"
                    + "m\u0000\u0000\u016f\u0170\u0007\u0001\u0000\u0000\u0170\u0171\u0003\u0084"
                    + "B\u0000\u0171\u0172\u0005s\u0000\u0000\u0172\u0173\u0005\u00b9\u0000\u0000"
                    + "\u0173\u0174\u0003,\u0016\u0000\u0174\u033b\u0001\u0000\u0000\u0000\u0175"
                    + "\u0176\u0005m\u0000\u0000\u0176\u0177\u0007\u0001\u0000\u0000\u0177\u0178"
                    + "\u0003\u0084B\u0000\u0178\u0179\u0005\u00b8\u0000\u0000\u0179\u017c\u0005"
                    + "\u00b9\u0000\u0000\u017a\u017b\u0005\u007f\u0000\u0000\u017b\u017d\u0005"
                    + "\"\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000"
                    + "\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0003,\u0016"
                    + "\u0000\u017f\u033b\u0001\u0000\u0000\u0000\u0180\u0181\u0005m\u0000\u0000"
                    + "\u0181\u0182\u0005P\u0000\u0000\u0182\u0184\u0003\u0084B\u0000\u0183\u0185"
                    + "\u0003\u001e\u000f\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185"
                    + "\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0188"
                    + "\u0005\u00c7\u0000\u0000\u0187\u0189\u0005a\u0000\u0000\u0188\u0187\u0001"
                    + "\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0001"
                    + "\u0000\u0000\u0000\u018a\u018b\u0003\u00c0`\u0000\u018b\u018d\u0003\u00ac"
                    + "V\u0000\u018c\u018e\u0003\u00a6S\u0000\u018d\u018c\u0001\u0000\u0000\u0000"
                    + "\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u033b\u0001\u0000\u0000\u0000"
                    + "\u018f\u0190\u0005m\u0000\u0000\u0190\u0191\u0005P\u0000\u0000\u0191\u0193"
                    + "\u0003\u0084B\u0000\u0192\u0194\u0003\u001e\u000f\u0000\u0193\u0192\u0001"
                    + "\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0001"
                    + "\u0000\u0000\u0000\u0195\u0196\u0005s\u0000\u0000\u0196\u0197\u0005\u00a0"
                    + "\u0000\u0000\u0197\u019b\u0005\u00f0\u0000\u0000\u0198\u0199\u0005M\u0000"
                    + "\u0000\u0199\u019a\u0005\u00a1\u0000\u0000\u019a\u019c\u0003,\u0016\u0000"
                    + "\u019b\u0198\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000"
                    + "\u019c\u033b\u0001\u0000\u0000\u0000\u019d\u019e\u0005m\u0000\u0000\u019e"
                    + "\u019f\u0005P\u0000\u0000\u019f\u01a1\u0003\u0084B\u0000\u01a0\u01a2\u0003"
                    + "\u001e\u000f\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001"
                    + "\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005"
                    + "s\u0000\u0000\u01a4\u01a5\u0005\u00a1\u0000\u0000\u01a5\u01a6\u0003,\u0016"
                    + "\u0000\u01a6\u033b\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005m\u0000\u0000"
                    + "\u01a8\u01a9\u0005P\u0000\u0000\u01a9\u01aa\u0003\u0084B\u0000\u01aa\u01ae"
                    + "\u0005\r\u0000\u0000\u01ab\u01ac\u0005\u007f\u0000\u0000\u01ac\u01ad\u0005"
                    + " \u0000\u0000\u01ad\u01af\u0005\"\u0000\u0000\u01ae\u01ab\u0001\u0000"
                    + "\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1\u0001\u0000"
                    + "\u0000\u0000\u01b0\u01b2\u0003\u001c\u000e\u0000\u01b1\u01b0\u0001\u0000"
                    + "\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000"
                    + "\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u033b\u0001\u0000"
                    + "\u0000\u0000\u01b5\u01b6\u0005m\u0000\u0000\u01b6\u01b7\u0005R\u0000\u0000"
                    + "\u01b7\u01b8\u0003\u0084B\u0000\u01b8\u01bc\u0005\r\u0000\u0000\u01b9"
                    + "\u01ba\u0005\u007f\u0000\u0000\u01ba\u01bb\u0005 \u0000\u0000\u01bb\u01bd"
                    + "\u0005\"\u0000\u0000\u01bc\u01b9\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001"
                    + "\u0000\u0000\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be\u01c0\u0003"
                    + "\u001e\u000f\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001"
                    + "\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001"
                    + "\u0000\u0000\u0000\u01c2\u033b\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005"
                    + "m\u0000\u0000\u01c4\u01c5\u0005P\u0000\u0000\u01c5\u01c6\u0003\u0084B"
                    + "\u0000\u01c6\u01c7\u0003\u001e\u000f\u0000\u01c7\u01c8\u0005n\u0000\u0000"
                    + "\u01c8\u01c9\u0005j\u0000\u0000\u01c9\u01ca\u0003\u001e\u000f\u0000\u01ca"
                    + "\u033b\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005m\u0000\u0000\u01cc\u01cd"
                    + "\u0005P\u0000\u0000\u01cd\u01ce\u0003\u0084B\u0000\u01ce\u01d1\u0005e"
                    + "\u0000\u0000\u01cf\u01d0\u0005\u007f\u0000\u0000\u01d0\u01d2\u0005\"\u0000"
                    + "\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000"
                    + "\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d8\u0003\u001e\u000f"
                    + "\u0000\u01d4\u01d5\u0005\u0003\u0000\u0000\u01d5\u01d7\u0003\u001e\u000f"
                    + "\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000\u0000"
                    + "\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000"
                    + "\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000"
                    + "\u0000\u01db\u01dd\u0005\u00cc\u0000\u0000\u01dc\u01db\u0001\u0000\u0000"
                    + "\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u033b\u0001\u0000\u0000"
                    + "\u0000\u01de\u01df\u0005m\u0000\u0000\u01df\u01e0\u0005R\u0000\u0000\u01e0"
                    + "\u01e1\u0003\u0084B\u0000\u01e1\u01e4\u0005e\u0000\u0000\u01e2\u01e3\u0005"
                    + "\u007f\u0000\u0000\u01e3\u01e5\u0005\"\u0000\u0000\u01e4\u01e2\u0001\u0000"
                    + "\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000"
                    + "\u0000\u0000\u01e6\u01eb\u0003\u001e\u000f\u0000\u01e7\u01e8\u0005\u0003"
                    + "\u0000\u0000\u01e8\u01ea\u0003\u001e\u000f\u0000\u01e9\u01e7\u0001\u0000"
                    + "\u0000\u0000\u01ea\u01ed\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000"
                    + "\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u033b\u0001\u0000"
                    + "\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005m\u0000"
                    + "\u0000\u01ef\u01f0\u0005P\u0000\u0000\u01f0\u01f2\u0003\u0084B\u0000\u01f1"
                    + "\u01f3\u0003\u001e\u000f\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f2"
                    + "\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4"
                    + "\u01f5\u0005s\u0000\u0000\u01f5\u01f6\u0003\u0016\u000b\u0000\u01f6\u033b"
                    + "\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005m\u0000\u0000\u01f8\u01f9\u0005"
                    + "P\u0000\u0000\u01f9\u01fa\u0003\u0084B\u0000\u01fa\u01fb\u0005\u00e0\u0000"
                    + "\u0000\u01fb\u01fc\u0005c\u0000\u0000\u01fc\u033b\u0001\u0000\u0000\u0000"
                    + "\u01fd\u01fe\u0005e\u0000\u0000\u01fe\u0201\u0005P\u0000\u0000\u01ff\u0200"
                    + "\u0005\u007f\u0000\u0000\u0200\u0202\u0005\"\u0000\u0000\u0201\u01ff\u0001"
                    + "\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0001"
                    + "\u0000\u0000\u0000\u0203\u0205\u0003\u0084B\u0000\u0204\u0206\u0005\u00cc"
                    + "\u0000\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000"
                    + "\u0000\u0000\u0206\u033b\u0001\u0000\u0000\u0000\u0207\u0208\u0005e\u0000"
                    + "\u0000\u0208\u020b\u0005R\u0000\u0000\u0209\u020a\u0005\u007f\u0000\u0000"
                    + "\u020a\u020c\u0005\"\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b"
                    + "\u020c\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d"
                    + "\u033b\u0003\u0084B\u0000\u020e\u0211\u0005O\u0000\u0000\u020f\u0210\u0005"
                    + "\u001d\u0000\u0000\u0210\u0212\u0005S\u0000\u0000\u0211\u020f\u0001\u0000"
                    + "\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0217\u0001\u0000"
                    + "\u0000\u0000\u0213\u0215\u0005\u00b5\u0000\u0000\u0214\u0213\u0001\u0000"
                    + "\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000"
                    + "\u0000\u0000\u0216\u0218\u0005\u00b6\u0000\u0000\u0217\u0214\u0001\u0000"
                    + "\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000"
                    + "\u0000\u0000\u0219\u021d\u0005R\u0000\u0000\u021a\u021b\u0005\u007f\u0000"
                    + "\u0000\u021b\u021c\u0005 \u0000\u0000\u021c\u021e\u0005\"\u0000\u0000"
                    + "\u021d\u021a\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000"
                    + "\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0221\u0003\u0084B\u0000\u0220"
                    + "\u0222\u0003v;\u0000\u0221\u0220\u0001\u0000\u0000\u0000\u0221\u0222\u0001"
                    + "\u0000\u0000\u0000\u0222\u0225\u0001\u0000\u0000\u0000\u0223\u0224\u0005"
                    + "r\u0000\u0000\u0224\u0226\u0005\u00f0\u0000\u0000\u0225\u0223\u0001\u0000"
                    + "\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u022a\u0001\u0000"
                    + "\u0000\u0000\u0227\u0228\u0005\u00d7\u0000\u0000\u0228\u0229\u0005=\u0000"
                    + "\u0000\u0229\u022b\u0003n7\u0000\u022a\u0227\u0001\u0000\u0000\u0000\u022a"
                    + "\u022b\u0001\u0000\u0000\u0000\u022b\u022e\u0001\u0000\u0000\u0000\u022c"
                    + "\u022d\u0005\u00b9\u0000\u0000\u022d\u022f\u0003,\u0016\u0000\u022e\u022c"
                    + "\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0230"
                    + "\u0001\u0000\u0000\u0000\u0230\u0231\u0005\u000e\u0000\u0000\u0231\u0232"
                    + "\u0003\u0018\f\u0000\u0232\u033b\u0001\u0000\u0000\u0000\u0233\u0236\u0005"
                    + "O\u0000\u0000\u0234\u0235\u0005\u001d\u0000\u0000\u0235\u0237\u0005S\u0000"
                    + "\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000"
                    + "\u0000\u0237\u0239\u0001\u0000\u0000\u0000\u0238\u023a\u0005\u00b5\u0000"
                    + "\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000"
                    + "\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u0005\u00b6\u0000"
                    + "\u0000\u023c\u023d\u0005R\u0000\u0000\u023d\u0242\u0003\u0084B\u0000\u023e"
                    + "\u023f\u0005\u0001\u0000\u0000\u023f\u0240\u0003\u00aaU\u0000\u0240\u0241"
                    + "\u0005\u0002\u0000\u0000\u0241\u0243\u0001\u0000\u0000\u0000\u0242\u023e"
                    + "\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0244"
                    + "\u0001\u0000\u0000\u0000\u0244\u0247\u0003*\u0015\u0000\u0245\u0246\u0005"
                    + "\u00b7\u0000\u0000\u0246\u0248\u0003,\u0016\u0000\u0247\u0245\u0001\u0000"
                    + "\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u033b\u0001\u0000"
                    + "\u0000\u0000\u0249\u024a\u0005m\u0000\u0000\u024a\u024b\u0005R\u0000\u0000"
                    + "\u024b\u024d\u0003\u0084B\u0000\u024c\u024e\u0005\u000e\u0000\u0000\u024d"
                    + "\u024c\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e"
                    + "\u024f\u0001\u0000\u0000\u0000\u024f\u0250\u0003\u0018\f\u0000\u0250\u033b"
                    + "\u0001\u0000\u0000\u0000\u0251\u0254\u0005O\u0000\u0000\u0252\u0253\u0005"
                    + "\u001d\u0000\u0000\u0253\u0255\u0005S\u0000\u0000\u0254\u0252\u0001\u0000"
                    + "\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0257\u0001\u0000"
                    + "\u0000\u0000\u0256\u0258\u0005\u00b6\u0000\u0000\u0257\u0256\u0001\u0000"
                    + "\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000"
                    + "\u0000\u0000\u0259\u025d\u0005\u00ad\u0000\u0000\u025a\u025b\u0005\u007f"
                    + "\u0000\u0000\u025b\u025c\u0005 \u0000\u0000\u025c\u025e\u0005\"\u0000"
                    + "\u0000\u025d\u025a\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000"
                    + "\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0260\u0003\u00be_\u0000"
                    + "\u0260\u0261\u0005\u000e\u0000\u0000\u0261\u026b\u0005\u00f0\u0000\u0000"
                    + "\u0262\u0263\u0005\u009f\u0000\u0000\u0263\u0268\u0003>\u001f\u0000\u0264"
                    + "\u0265\u0005\u0003\u0000\u0000\u0265\u0267\u0003>\u001f\u0000\u0266\u0264"
                    + "\u0001\u0000\u0000\u0000\u0267\u026a\u0001\u0000\u0000\u0000\u0268\u0266"
                    + "\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u026c"
                    + "\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026b\u0262"
                    + "\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u033b"
                    + "\u0001\u0000\u0000\u0000\u026d\u026f\u0005e\u0000\u0000\u026e\u0270\u0005"
                    + "\u00b6\u0000\u0000\u026f\u026e\u0001\u0000\u0000\u0000\u026f\u0270\u0001"
                    + "\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0274\u0005"
                    + "\u00ad\u0000\u0000\u0272\u0273\u0005\u007f\u0000\u0000\u0273\u0275\u0005"
                    + "\"\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000"
                    + "\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u033b\u0003\u00be"
                    + "_\u0000\u0277\u0279\u0005X\u0000\u0000\u0278\u027a\u0007\u0002\u0000\u0000"
                    + "\u0279\u0278\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000"
                    + "\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u033b\u0003\f\u0006\u0000\u027c"
                    + "\u027d\u0005^\u0000\u0000\u027d\u0280\u0005_\u0000\u0000\u027e\u027f\u0007"
                    + "\u0003\u0000\u0000\u027f\u0281\u0003\u00c0`\u0000\u0280\u027e\u0001\u0000"
                    + "\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0286\u0001\u0000"
                    + "\u0000\u0000\u0282\u0284\u0005$\u0000\u0000\u0283\u0282\u0001\u0000\u0000"
                    + "\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000"
                    + "\u0000\u0285\u0287\u0005\u00f0\u0000\u0000\u0286\u0283\u0001\u0000\u0000"
                    + "\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u033b\u0001\u0000\u0000"
                    + "\u0000\u0288\u0289\u0005^\u0000\u0000\u0289\u028a\u0005P\u0000\u0000\u028a"
                    + "\u028d\u0005\u00ae\u0000\u0000\u028b\u028c\u0007\u0003\u0000\u0000\u028c"
                    + "\u028e\u0003\u00c0`\u0000\u028d\u028b\u0001\u0000\u0000\u0000\u028d\u028e"
                    + "\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0290"
                    + "\u0005$\u0000\u0000\u0290\u0292\u0005\u00f0\u0000\u0000\u0291\u0293\u0003"
                    + "\u001e\u000f\u0000\u0292\u0291\u0001\u0000\u0000\u0000\u0292\u0293\u0001"
                    + "\u0000\u0000\u0000\u0293\u033b\u0001\u0000\u0000\u0000\u0294\u0295\u0005"
                    + "^\u0000\u0000\u0295\u029a\u0005\u00d0\u0000\u0000\u0296\u0298\u0005$\u0000"
                    + "\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000"
                    + "\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029b\u0005\u00f0\u0000"
                    + "\u0000\u029a\u0297\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000"
                    + "\u0000\u029b\u033b\u0001\u0000\u0000\u0000\u029c\u029d\u0005^\u0000\u0000"
                    + "\u029d\u029e\u0005\u00b9\u0000\u0000\u029e\u02a3\u0003\u0084B\u0000\u029f"
                    + "\u02a0\u0005\u0001\u0000\u0000\u02a0\u02a1\u00030\u0018\u0000\u02a1\u02a2"
                    + "\u0005\u0002\u0000\u0000\u02a2\u02a4\u0001\u0000\u0000\u0000\u02a3\u029f"
                    + "\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u033b"
                    + "\u0001\u0000\u0000\u0000\u02a5\u02a6\u0005^\u0000\u0000\u02a6\u02a7\u0005"
                    + "`\u0000\u0000\u02a7\u02a8\u0007\u0003\u0000\u0000\u02a8\u02ab\u0003\u0084"
                    + "B\u0000\u02a9\u02aa\u0007\u0003\u0000\u0000\u02aa\u02ac\u0003\u00c0`\u0000"
                    + "\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000"
                    + "\u02ac\u033b\u0001\u0000\u0000\u0000\u02ad\u02ae\u0005^\u0000\u0000\u02ae"
                    + "\u02af\u0005c\u0000\u0000\u02af\u02b1\u0003\u0084B\u0000\u02b0\u02b2\u0003"
                    + "\u001e\u000f\u0000\u02b1\u02b0\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001"
                    + "\u0000\u0000\u0000\u02b2\u033b\u0001\u0000\u0000\u0000\u02b3\u02b5\u0005"
                    + "^\u0000\u0000\u02b4\u02b6\u0003\u00c0`\u0000\u02b5\u02b4\u0001\u0000\u0000"
                    + "\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000"
                    + "\u0000\u02b7\u02bf\u0005d\u0000\u0000\u02b8\u02ba\u0005$\u0000\u0000\u02b9"
                    + "\u02b8\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba"
                    + "\u02bd\u0001\u0000\u0000\u0000\u02bb\u02be\u0003\u00be_\u0000\u02bc\u02be"
                    + "\u0005\u00f0\u0000\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000\u02bd\u02bc"
                    + "\u0001\u0000\u0000\u0000\u02be\u02c0\u0001\u0000\u0000\u0000\u02bf\u02b9"
                    + "\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u033b"
                    + "\u0001\u0000\u0000\u0000\u02c1\u02c2\u0005^\u0000\u0000\u02c2\u02c3\u0005"
                    + "O\u0000\u0000\u02c3\u02c4\u0005P\u0000\u0000\u02c4\u033b\u0003\u0084B"
                    + "\u0000\u02c5\u02c6\u0007\u0004\u0000\u0000\u02c6\u02c8\u0005\u00ad\u0000"
                    + "\u0000\u02c7\u02c9\u0005\u00ae\u0000\u0000\u02c8\u02c7\u0001\u0000\u0000"
                    + "\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000"
                    + "\u0000\u02ca\u033b\u0003\"\u0011\u0000\u02cb\u02cc\u0007\u0004\u0000\u0000"
                    + "\u02cc\u02ce\u0005\u00cf\u0000\u0000\u02cd\u02cf\u0005\u00ae\u0000\u0000"
                    + "\u02ce\u02cd\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000"
                    + "\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0\u033b\u0003\u00c0`\u0000\u02d1"
                    + "\u02d3\u0007\u0004\u0000\u0000\u02d2\u02d4\u0005P\u0000\u0000\u02d3\u02d2"
                    + "\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d6"
                    + "\u0001\u0000\u0000\u0000\u02d5\u02d7\u0007\u0005\u0000\u0000\u02d6\u02d5"
                    + "\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u02d8"
                    + "\u0001\u0000\u0000\u0000\u02d8\u02da\u0003\u0084B\u0000\u02d9\u02db\u0003"
                    + "\u001e\u000f\u0000\u02da\u02d9\u0001\u0000\u0000\u0000\u02da\u02db\u0001"
                    + "\u0000\u0000\u0000\u02db\u02dd\u0001\u0000\u0000\u0000\u02dc\u02de\u0003"
                    + "$\u0012\u0000\u02dd\u02dc\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000"
                    + "\u0000\u0000\u02de\u033b\u0001\u0000\u0000\u0000\u02df\u02e0\u0005\u00af"
                    + "\u0000\u0000\u02e0\u02e1\u0005P\u0000\u0000\u02e1\u033b\u0003\u0084B\u0000"
                    + "\u02e2\u02ea\u0005\u00af\u0000\u0000\u02e3\u02eb\u0005\u00f0\u0000\u0000"
                    + "\u02e4\u02e6\t\u0000\u0000\u0000\u02e5\u02e4\u0001\u0000\u0000\u0000\u02e6"
                    + "\u02e9\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e7"
                    + "\u02e5\u0001\u0000\u0000\u0000\u02e8\u02eb\u0001\u0000\u0000\u0000\u02e9"
                    + "\u02e7\u0001\u0000\u0000\u0000\u02ea\u02e3\u0001\u0000\u0000\u0000\u02ea"
                    + "\u02e7\u0001\u0000\u0000\u0000\u02eb\u033b\u0001\u0000\u0000\u0000\u02ec"
                    + "\u02ee\u0005\u00b1\u0000\u0000\u02ed\u02ef\u0005\u00b3\u0000\u0000\u02ee"
                    + "\u02ed\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef"
                    + "\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f1\u0005P\u0000\u0000\u02f1\u02f6"
                    + "\u0003\u0084B\u0000\u02f2\u02f4\u0005\u000e\u0000\u0000\u02f3\u02f2\u0001"
                    + "\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001"
                    + "\u0000\u0000\u0000\u02f5\u02f7\u0003\u0018\f\u0000\u02f6\u02f3\u0001\u0000"
                    + "\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7\u033b\u0001\u0000"
                    + "\u0000\u0000\u02f8\u02f9\u0005\u00b2\u0000\u0000\u02f9\u02fc\u0005P\u0000"
                    + "\u0000\u02fa\u02fb\u0005\u007f\u0000\u0000\u02fb\u02fd\u0005\"\u0000\u0000"
                    + "\u02fc\u02fa\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000"
                    + "\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe\u033b\u0003\u0084B\u0000\u02ff"
                    + "\u0300\u0005\u00b0\u0000\u0000\u0300\u033b\u0005\u00b1\u0000\u0000\u0301"
                    + "\u0302\u0005\u00e3\u0000\u0000\u0302\u0304\u0005u\u0000\u0000\u0303\u0305"
                    + "\u0005\u00ee\u0000\u0000\u0304\u0303\u0001\u0000\u0000\u0000\u0304\u0305"
                    + "\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0307"
                    + "\u0005\u00ef\u0000\u0000\u0307\u0309\u0005\u00f0\u0000\u0000\u0308\u030a"
                    + "\u0005\u009c\u0000\u0000\u0309\u0308\u0001\u0000\u0000\u0000\u0309\u030a"
                    + "\u0001\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u030c"
                    + "\u0005V\u0000\u0000\u030c\u030d\u0005P\u0000\u0000\u030d\u030f\u0003\u0084"
                    + "B\u0000\u030e\u0310\u0003\u001e\u000f\u0000\u030f\u030e\u0001\u0000\u0000"
                    + "\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310\u033b\u0001\u0000\u0000"
                    + "\u0000\u0311\u0312\u0005\u00d2\u0000\u0000\u0312\u0313\u0005P\u0000\u0000"
                    + "\u0313\u0315\u0003\u0084B\u0000\u0314\u0316\u0003\u001e\u000f\u0000\u0315"
                    + "\u0314\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316"
                    + "\u033b\u0001\u0000\u0000\u0000\u0317\u0318\u0005\u00de\u0000\u0000\u0318"
                    + "\u0319\u0005\u00df\u0000\u0000\u0319\u031a\u0005P\u0000\u0000\u031a\u033b"
                    + "\u0003\u0084B\u0000\u031b\u031c\u0007\u0006\u0000\u0000\u031c\u0320\u0003"
                    + "\u00c0`\u0000\u031d\u031f\t\u0000\u0000\u0000\u031e\u031d\u0001\u0000"
                    + "\u0000\u0000\u031f\u0322\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000"
                    + "\u0000\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0321\u033b\u0001\u0000"
                    + "\u0000\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0323\u0324\u0005s\u0000"
                    + "\u0000\u0324\u0328\u0005\u00e4\u0000\u0000\u0325\u0327\t\u0000\u0000\u0000"
                    + "\u0326\u0325\u0001\u0000\u0000\u0000\u0327\u032a\u0001\u0000\u0000\u0000"
                    + "\u0328\u0329\u0001\u0000\u0000\u0000\u0328\u0326\u0001\u0000\u0000\u0000"
                    + "\u0329\u033b\u0001\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000\u0000"
                    + "\u032b\u032f\u0005s\u0000\u0000\u032c\u032e\t\u0000\u0000\u0000\u032d"
                    + "\u032c\u0001\u0000\u0000\u0000\u032e\u0331\u0001\u0000\u0000\u0000\u032f"
                    + "\u0330\u0001\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u0330"
                    + "\u033b\u0001\u0000\u0000\u0000\u0331\u032f\u0001\u0000\u0000\u0000\u0332"
                    + "\u033b\u0005t\u0000\u0000\u0333\u0337\u0003\u000e\u0007\u0000\u0334\u0336"
                    + "\t\u0000\u0000\u0000\u0335\u0334\u0001\u0000\u0000\u0000\u0336\u0339\u0001"
                    + "\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0337\u0335\u0001"
                    + "\u0000\u0000\u0000\u0338\u033b\u0001\u0000\u0000\u0000\u0339\u0337\u0001"
                    + "\u0000\u0000\u0000\u033a\u00dc\u0001\u0000\u0000\u0000\u033a\u00dd\u0001"
                    + "\u0000\u0000\u0000\u033a\u00df\u0001\u0000\u0000\u0000\u033a\u00f3\u0001"
                    + "\u0000\u0000\u0000\u033a\u00fa\u0001\u0000\u0000\u0000\u033a\u0104\u0001"
                    + "\u0000\u0000\u0000\u033a\u0122\u0001\u0000\u0000\u0000\u033a\u0143\u0001"
                    + "\u0000\u0000\u0000\u033a\u0150\u0001\u0000\u0000\u0000\u033a\u015e\u0001"
                    + "\u0000\u0000\u0000\u033a\u0167\u0001\u0000\u0000\u0000\u033a\u016e\u0001"
                    + "\u0000\u0000\u0000\u033a\u0175\u0001\u0000\u0000\u0000\u033a\u0180\u0001"
                    + "\u0000\u0000\u0000\u033a\u018f\u0001\u0000\u0000\u0000\u033a\u019d\u0001"
                    + "\u0000\u0000\u0000\u033a\u01a7\u0001\u0000\u0000\u0000\u033a\u01b5\u0001"
                    + "\u0000\u0000\u0000\u033a\u01c3\u0001\u0000\u0000\u0000\u033a\u01cb\u0001"
                    + "\u0000\u0000\u0000\u033a\u01de\u0001\u0000\u0000\u0000\u033a\u01ee\u0001"
                    + "\u0000\u0000\u0000\u033a\u01f7\u0001\u0000\u0000\u0000\u033a\u01fd\u0001"
                    + "\u0000\u0000\u0000\u033a\u0207\u0001\u0000\u0000\u0000\u033a\u020e\u0001"
                    + "\u0000\u0000\u0000\u033a\u0233\u0001\u0000\u0000\u0000\u033a\u0249\u0001"
                    + "\u0000\u0000\u0000\u033a\u0251\u0001\u0000\u0000\u0000\u033a\u026d\u0001"
                    + "\u0000\u0000\u0000\u033a\u0277\u0001\u0000\u0000\u0000\u033a\u027c\u0001"
                    + "\u0000\u0000\u0000\u033a\u0288\u0001\u0000\u0000\u0000\u033a\u0294\u0001"
                    + "\u0000\u0000\u0000\u033a\u029c\u0001\u0000\u0000\u0000\u033a\u02a5\u0001"
                    + "\u0000\u0000\u0000\u033a\u02ad\u0001\u0000\u0000\u0000\u033a\u02b3\u0001"
                    + "\u0000\u0000\u0000\u033a\u02c1\u0001\u0000\u0000\u0000\u033a\u02c5\u0001"
                    + "\u0000\u0000\u0000\u033a\u02cb\u0001\u0000\u0000\u0000\u033a\u02d1\u0001"
                    + "\u0000\u0000\u0000\u033a\u02df\u0001\u0000\u0000\u0000\u033a\u02e2\u0001"
                    + "\u0000\u0000\u0000\u033a\u02ec\u0001\u0000\u0000\u0000\u033a\u02f8\u0001"
                    + "\u0000\u0000\u0000\u033a\u02ff\u0001\u0000\u0000\u0000\u033a\u0301\u0001"
                    + "\u0000\u0000\u0000\u033a\u0311\u0001\u0000\u0000\u0000\u033a\u0317\u0001"
                    + "\u0000\u0000\u0000\u033a\u031b\u0001\u0000\u0000\u0000\u033a\u0323\u0001"
                    + "\u0000\u0000\u0000\u033a\u032b\u0001\u0000\u0000\u0000\u033a\u0332\u0001"
                    + "\u0000\u0000\u0000\u033a\u0333\u0001\u0000\u0000\u0000\u033b\r\u0001\u0000"
                    + "\u0000\u0000\u033c\u033d\u0005O\u0000\u0000\u033d\u03e7\u0005\u00e4\u0000"
                    + "\u0000\u033e\u033f\u0005e\u0000\u0000\u033f\u03e7\u0005\u00e4\u0000\u0000"
                    + "\u0340\u0342\u0005\u00db\u0000\u0000\u0341\u0343\u0005\u00e4\u0000\u0000"
                    + "\u0342\u0341\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000"
                    + "\u0343\u03e7\u0001\u0000\u0000\u0000\u0344\u0346\u0005\u00da\u0000\u0000"
                    + "\u0345\u0347\u0005\u00e4\u0000\u0000\u0346\u0345\u0001\u0000\u0000\u0000"
                    + "\u0346\u0347\u0001\u0000\u0000\u0000\u0347\u03e7\u0001\u0000\u0000\u0000"
                    + "\u0348\u0349\u0005^\u0000\u0000\u0349\u03e7\u0005\u00db\u0000\u0000\u034a"
                    + "\u034b\u0005^\u0000\u0000\u034b\u034d\u0005\u00e4\u0000\u0000\u034c\u034e"
                    + "\u0005\u00db\u0000\u0000\u034d\u034c\u0001\u0000\u0000\u0000\u034d\u034e"
                    + "\u0001\u0000\u0000\u0000\u034e\u03e7\u0001\u0000\u0000\u0000\u034f\u0350"
                    + "\u0005^\u0000\u0000\u0350\u03e7\u0005\u00e7\u0000\u0000\u0351\u0352\u0005"
                    + "^\u0000\u0000\u0352\u03e7\u0005\u00e5\u0000\u0000\u0353\u0354\u0005^\u0000"
                    + "\u0000\u0354\u0355\u0005H\u0000\u0000\u0355\u03e7\u0005\u00e5\u0000\u0000"
                    + "\u0356\u0357\u0005\u00e1\u0000\u0000\u0357\u03e7\u0005P\u0000\u0000\u0358"
                    + "\u0359\u0005\u00e2\u0000\u0000\u0359\u03e7\u0005P\u0000\u0000\u035a\u035b"
                    + "\u0005^\u0000\u0000\u035b\u03e7\u0005\u00e6\u0000\u0000\u035c\u035d\u0005"
                    + "^\u0000\u0000\u035d\u035e\u0005O\u0000\u0000\u035e\u03e7\u0005P\u0000"
                    + "\u0000\u035f\u0360\u0005^\u0000\u0000\u0360\u03e7\u0005\u00e8\u0000\u0000"
                    + "\u0361\u0362\u0005^\u0000\u0000\u0362\u03e7\u0005\u00ea\u0000\u0000\u0363"
                    + "\u0364\u0005^\u0000\u0000\u0364\u03e7\u0005\u00eb\u0000\u0000\u0365\u0366"
                    + "\u0005O\u0000\u0000\u0366\u03e7\u0005\u00e9\u0000\u0000\u0367\u0368\u0005"
                    + "e\u0000\u0000\u0368\u03e7\u0005\u00e9\u0000\u0000\u0369\u036a\u0005m\u0000"
                    + "\u0000\u036a\u03e7\u0005\u00e9\u0000\u0000\u036b\u036c\u0005\u00dc\u0000"
                    + "\u0000\u036c\u03e7\u0005P\u0000\u0000\u036d\u036e\u0005\u00dc\u0000\u0000"
                    + "\u036e\u03e7\u0005\u00cf\u0000\u0000\u036f\u0370\u0005\u00dd\u0000\u0000"
                    + "\u0370\u03e7\u0005P\u0000\u0000\u0371\u0372\u0005\u00dd\u0000\u0000\u0372"
                    + "\u03e7\u0005\u00cf\u0000\u0000\u0373\u0374\u0005O\u0000\u0000\u0374\u0375"
                    + "\u0005\u00b6\u0000\u0000\u0375\u03e7\u0005z\u0000\u0000\u0376\u0377\u0005"
                    + "e\u0000\u0000\u0377\u0378\u0005\u00b6\u0000\u0000\u0378\u03e7\u0005z\u0000"
                    + "\u0000\u0379\u037a\u0005m\u0000\u0000\u037a\u037b\u0005P\u0000\u0000\u037b"
                    + "\u037c\u0003\u0084B\u0000\u037c\u037d\u0005 \u0000\u0000\u037d\u037e\u0005"
                    + "\u00ca\u0000\u0000\u037e\u03e7\u0001\u0000\u0000\u0000\u037f\u0380\u0005"
                    + "m\u0000\u0000\u0380\u0381\u0005P\u0000\u0000\u0381\u0382\u0003\u0084B"
                    + "\u0000\u0382\u0383\u0005\u00ca\u0000\u0000\u0383\u0384\u0005\u0014\u0000"
                    + "\u0000\u0384\u03e7\u0001\u0000\u0000\u0000\u0385\u0386\u0005m\u0000\u0000"
                    + "\u0386\u0387\u0005P\u0000\u0000\u0387\u0388\u0003\u0084B\u0000\u0388\u0389"
                    + "\u0005 \u0000\u0000\u0389\u038a\u0005\u00cb\u0000\u0000\u038a\u03e7\u0001"
                    + "\u0000\u0000\u0000\u038b\u038c\u0005m\u0000\u0000\u038c\u038d\u0005P\u0000"
                    + "\u0000\u038d\u038e\u0003\u0084B\u0000\u038e\u038f\u0005\u00bc\u0000\u0000"
                    + "\u038f\u0390\u0005\u0014\u0000\u0000\u0390\u03e7\u0001\u0000\u0000\u0000"
                    + "\u0391\u0392\u0005m\u0000\u0000\u0392\u0393\u0005P\u0000\u0000\u0393\u0394"
                    + "\u0003\u0084B\u0000\u0394\u0395\u0005 \u0000\u0000\u0395\u0396\u0005\u00bc"
                    + "\u0000\u0000\u0396\u03e7\u0001\u0000\u0000\u0000\u0397\u0398\u0005m\u0000"
                    + "\u0000\u0398\u0399\u0005P\u0000\u0000\u0399\u039a\u0003\u0084B\u0000\u039a"
                    + "\u039b\u0005 \u0000\u0000\u039b\u039c\u0005\u00bd\u0000\u0000\u039c\u039d"
                    + "\u0005\u000e\u0000\u0000\u039d\u039e\u0005\u00be\u0000\u0000\u039e\u03e7"
                    + "\u0001\u0000\u0000\u0000\u039f\u03a0\u0005m\u0000\u0000\u03a0\u03a1\u0005"
                    + "P\u0000\u0000\u03a1\u03a2\u0003\u0084B\u0000\u03a2\u03a3\u0005s\u0000"
                    + "\u0000\u03a3\u03a4\u0005\u00bc\u0000\u0000\u03a4\u03a5\u0005\u00bf\u0000"
                    + "\u0000\u03a5\u03e7\u0001\u0000\u0000\u0000\u03a6\u03a7\u0005m\u0000\u0000"
                    + "\u03a7\u03a8\u0005P\u0000\u0000\u03a8\u03a9\u0003\u0084B\u0000\u03a9\u03aa"
                    + "\u0005\u00c0\u0000\u0000\u03aa\u03ab\u0005B\u0000\u0000\u03ab\u03e7\u0001"
                    + "\u0000\u0000\u0000\u03ac\u03ad\u0005m\u0000\u0000\u03ad\u03ae\u0005P\u0000"
                    + "\u0000\u03ae\u03af\u0003\u0084B\u0000\u03af\u03b0\u0005\u00c1\u0000\u0000"
                    + "\u03b0\u03b1\u0005B\u0000\u0000\u03b1\u03e7\u0001\u0000\u0000\u0000\u03b2"
                    + "\u03b3\u0005m\u0000\u0000\u03b3\u03b4\u0005P\u0000\u0000\u03b4\u03b5\u0003"
                    + "\u0084B\u0000\u03b5\u03b6\u0005\u00c2\u0000\u0000\u03b6\u03b7\u0005B\u0000"
                    + "\u0000\u03b7\u03e7\u0001\u0000\u0000\u0000\u03b8\u03b9\u0005m\u0000\u0000"
                    + "\u03b9\u03ba\u0005P\u0000\u0000\u03ba\u03bb\u0003\u0084B\u0000\u03bb\u03bc"
                    + "\u0005\u00c4\u0000\u0000\u03bc\u03e7\u0001\u0000\u0000\u0000\u03bd\u03be"
                    + "\u0005m\u0000\u0000\u03be\u03bf\u0005P\u0000\u0000\u03bf\u03c1\u0003\u0084"
                    + "B\u0000\u03c0\u03c2\u0003\u001e\u000f\u0000\u03c1\u03c0\u0001\u0000\u0000"
                    + "\u0000\u03c1\u03c2\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000"
                    + "\u0000\u03c3\u03c4\u0005\u00c5\u0000\u0000\u03c4\u03e7\u0001\u0000\u0000"
                    + "\u0000\u03c5\u03c6\u0005m\u0000\u0000\u03c6\u03c7\u0005P\u0000\u0000\u03c7"
                    + "\u03c9\u0003\u0084B\u0000\u03c8\u03ca\u0003\u001e\u000f\u0000\u03c9\u03c8"
                    + "\u0001\u0000\u0000\u0000\u03c9\u03ca\u0001\u0000\u0000\u0000\u03ca\u03cb"
                    + "\u0001\u0000\u0000\u0000\u03cb\u03cc\u0005\u00c6\u0000\u0000\u03cc\u03e7"
                    + "\u0001\u0000\u0000\u0000\u03cd\u03ce\u0005m\u0000\u0000\u03ce\u03cf\u0005"
                    + "P\u0000\u0000\u03cf\u03d1\u0003\u0084B\u0000\u03d0\u03d2\u0003\u001e\u000f"
                    + "\u0000\u03d1\u03d0\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000\u0000"
                    + "\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d4\u0005s\u0000\u0000"
                    + "\u03d4\u03d5\u0005\u00c3\u0000\u0000\u03d5\u03e7\u0001\u0000\u0000\u0000"
                    + "\u03d6\u03d7\u0005m\u0000\u0000\u03d7\u03d8\u0005P\u0000\u0000\u03d8\u03da"
                    + "\u0003\u0084B\u0000\u03d9\u03db\u0003\u001e\u000f\u0000\u03da\u03d9\u0001"
                    + "\u0000\u0000\u0000\u03da\u03db\u0001\u0000\u0000\u0000\u03db\u03dc\u0001"
                    + "\u0000\u0000\u0000\u03dc\u03dd\u0005S\u0000\u0000\u03dd\u03de\u0005`\u0000"
                    + "\u0000\u03de\u03e7\u0001\u0000\u0000\u0000\u03df\u03e0\u0005v\u0000\u0000"
                    + "\u03e0\u03e7\u0005w\u0000\u0000\u03e1\u03e7\u0005x\u0000\u0000\u03e2\u03e7"
                    + "\u0005y\u0000\u0000\u03e3\u03e7\u0005\u00d1\u0000\u0000\u03e4\u03e5\u0005"
                    + "U\u0000\u0000\u03e5\u03e7\u0005\f\u0000\u0000\u03e6\u033c\u0001\u0000"
                    + "\u0000\u0000\u03e6\u033e\u0001\u0000\u0000\u0000\u03e6\u0340\u0001\u0000"
                    + "\u0000\u0000\u03e6\u0344\u0001\u0000\u0000\u0000\u03e6\u0348\u0001\u0000"
                    + "\u0000\u0000\u03e6\u034a\u0001\u0000\u0000\u0000\u03e6\u034f\u0001\u0000"
                    + "\u0000\u0000\u03e6\u0351\u0001\u0000\u0000\u0000\u03e6\u0353\u0001\u0000"
                    + "\u0000\u0000\u03e6\u0356\u0001\u0000\u0000\u0000\u03e6\u0358\u0001\u0000"
                    + "\u0000\u0000\u03e6\u035a\u0001\u0000\u0000\u0000\u03e6\u035c\u0001\u0000"
                    + "\u0000\u0000\u03e6\u035f\u0001\u0000\u0000\u0000\u03e6\u0361\u0001\u0000"
                    + "\u0000\u0000\u03e6\u0363\u0001\u0000\u0000\u0000\u03e6\u0365\u0001\u0000"
                    + "\u0000\u0000\u03e6\u0367\u0001\u0000\u0000\u0000\u03e6\u0369\u0001\u0000"
                    + "\u0000\u0000\u03e6\u036b\u0001\u0000\u0000\u0000\u03e6\u036d\u0001\u0000"
                    + "\u0000\u0000\u03e6\u036f\u0001\u0000\u0000\u0000\u03e6\u0371\u0001\u0000"
                    + "\u0000\u0000\u03e6\u0373\u0001\u0000\u0000\u0000\u03e6\u0376\u0001\u0000"
                    + "\u0000\u0000\u03e6\u0379\u0001\u0000\u0000\u0000\u03e6\u037f\u0001\u0000"
                    + "\u0000\u0000\u03e6\u0385\u0001\u0000\u0000\u0000\u03e6\u038b\u0001\u0000"
                    + "\u0000\u0000\u03e6\u0391\u0001\u0000\u0000\u0000\u03e6\u0397\u0001\u0000"
                    + "\u0000\u0000\u03e6\u039f\u0001\u0000\u0000\u0000\u03e6\u03a6\u0001\u0000"
                    + "\u0000\u0000\u03e6\u03ac\u0001\u0000\u0000\u0000\u03e6\u03b2\u0001\u0000"
                    + "\u0000\u0000\u03e6\u03b8\u0001\u0000\u0000\u0000\u03e6\u03bd\u0001\u0000"
                    + "\u0000\u0000\u03e6\u03c5\u0001\u0000\u0000\u0000\u03e6\u03cd\u0001\u0000"
                    + "\u0000\u0000\u03e6\u03d6\u0001\u0000\u0000\u0000\u03e6\u03df\u0001\u0000"
                    + "\u0000\u0000\u03e6\u03e1\u0001\u0000\u0000\u0000\u03e6\u03e2\u0001\u0000"
                    + "\u0000\u0000\u03e6\u03e3\u0001\u0000\u0000\u0000\u03e6\u03e4\u0001\u0000"
                    + "\u0000\u0000\u03e7\u000f\u0001\u0000\u0000\u0000\u03e8\u03ea\u0005O\u0000"
                    + "\u0000\u03e9\u03eb\u0005\u00b6\u0000\u0000\u03ea\u03e9\u0001\u0000\u0000"
                    + "\u0000\u03ea\u03eb\u0001\u0000\u0000\u0000\u03eb\u03ed\u0001\u0000\u0000"
                    + "\u0000\u03ec\u03ee\u0005\u00d8\u0000\u0000\u03ed\u03ec\u0001\u0000\u0000"
                    + "\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000\u0000"
                    + "\u0000\u03ef\u03f3\u0005P\u0000\u0000\u03f0\u03f1\u0005\u007f\u0000\u0000"
                    + "\u03f1\u03f2\u0005 \u0000\u0000\u03f2\u03f4\u0005\"\u0000\u0000\u03f3"
                    + "\u03f0\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000\u03f4"
                    + "\u03f5\u0001\u0000\u0000\u0000\u03f5\u03f6\u0003\u0084B\u0000\u03f6\u0011"
                    + "\u0001\u0000\u0000\u0000\u03f7\u03f8\u0005\u00ca\u0000\u0000\u03f8\u03f9"
                    + "\u0005\u0014\u0000\u0000\u03f9\u03fd\u0003n7\u0000\u03fa\u03fb\u0005\u00cb"
                    + "\u0000\u0000\u03fb\u03fc\u0005\u0014\u0000\u0000\u03fc\u03fe\u0003r9\u0000"
                    + "\u03fd\u03fa\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000\u0000\u0000"
                    + "\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0400\u0005V\u0000\u0000\u0400"
                    + "\u0401\u0005\u00f4\u0000\u0000\u0401\u0402\u0005\u00bb\u0000\u0000\u0402"
                    + "\u0013\u0001\u0000\u0000\u0000\u0403\u0404\u0005\u00bc\u0000\u0000\u0404"
                    + "\u0405\u0005\u0014\u0000\u0000\u0405\u0406\u0003n7\u0000\u0406\u0409\u0005"
                    + "=\u0000\u0000\u0407\u040a\u00034\u001a\u0000\u0408\u040a\u00036\u001b"
                    + "\u0000\u0409\u0407\u0001\u0000\u0000\u0000\u0409\u0408\u0001\u0000\u0000"
                    + "\u0000\u040a\u040e\u0001\u0000\u0000\u0000\u040b\u040c\u0005\u00bd\u0000"
                    + "\u0000\u040c\u040d\u0005\u000e\u0000\u0000\u040d\u040f\u0005\u00be\u0000"
                    + "\u0000\u040e\u040b\u0001\u0000\u0000\u0000\u040e\u040f\u0001\u0000\u0000"
                    + "\u0000\u040f\u0015\u0001\u0000\u0000\u0000\u0410\u0411\u0005\u00bf\u0000"
                    + "\u0000\u0411\u0412\u0005\u00f0\u0000\u0000\u0412\u0017\u0001\u0000\u0000"
                    + "\u0000\u0413\u0415\u0003&\u0013\u0000\u0414\u0413\u0001\u0000\u0000\u0000"
                    + "\u0414\u0415\u0001\u0000\u0000\u0000\u0415\u0416\u0001\u0000\u0000\u0000"
                    + "\u0416\u0417\u0003@ \u0000\u0417\u0019\u0001\u0000\u0000\u0000\u0418\u0419"
                    + "\u0005T\u0000\u0000\u0419\u041a\u0005\u009c\u0000\u0000\u041a\u041b\u0005"
                    + "P\u0000\u0000\u041b\u0422\u0003\u0084B\u0000\u041c\u0420\u0003\u001e\u000f"
                    + "\u0000\u041d\u041e\u0005\u007f\u0000\u0000\u041e\u041f\u0005 \u0000\u0000"
                    + "\u041f\u0421\u0005\"\u0000\u0000\u0420\u041d\u0001\u0000\u0000\u0000\u0420"
                    + "\u0421\u0001\u0000\u0000\u0000\u0421\u0423\u0001\u0000\u0000\u0000\u0422"
                    + "\u041c\u0001\u0000\u0000\u0000\u0422\u0423\u0001\u0000\u0000\u0000\u0423"
                    + "\u0449\u0001\u0000\u0000\u0000\u0424\u0425\u0005T\u0000\u0000\u0425\u0427"
                    + "\u0005V\u0000\u0000\u0426\u0428\u0005P\u0000\u0000\u0427\u0426\u0001\u0000"
                    + "\u0000\u0000\u0427\u0428\u0001\u0000\u0000\u0000\u0428\u0429\u0001\u0000"
                    + "\u0000\u0000\u0429\u042b\u0003\u0084B\u0000\u042a\u042c\u0003\u001e\u000f"
                    + "\u0000\u042b\u042a\u0001\u0000\u0000\u0000\u042b\u042c\u0001\u0000\u0000"
                    + "\u0000\u042c\u0449\u0001\u0000\u0000\u0000\u042d\u042e\u0005T\u0000\u0000"
                    + "\u042e\u0430\u0005\u009c\u0000\u0000\u042f\u0431\u0005\u00ee\u0000\u0000"
                    + "\u0430\u042f\u0001\u0000\u0000\u0000\u0430\u0431\u0001\u0000\u0000\u0000"
                    + "\u0431\u0432\u0001\u0000\u0000\u0000\u0432\u0433\u0005Q\u0000\u0000\u0433"
                    + "\u0435\u0005\u00f0\u0000\u0000\u0434\u0436\u0003\u0082A\u0000\u0435\u0434"
                    + "\u0001\u0000\u0000\u0000\u0435\u0436\u0001\u0000\u0000\u0000\u0436\u0438"
                    + "\u0001\u0000\u0000\u0000\u0437\u0439\u00038\u001c\u0000\u0438\u0437\u0001"
                    + "\u0000\u0000\u0000\u0438\u0439\u0001\u0000\u0000\u0000\u0439\u0449\u0001"
                    + "\u0000\u0000\u0000\u043a\u043b\u0005T\u0000\u0000\u043b\u043d\u0005\u009c"
                    + "\u0000\u0000\u043c\u043e\u0005\u00ee\u0000\u0000\u043d\u043c\u0001\u0000"
                    + "\u0000\u0000\u043d\u043e\u0001\u0000\u0000\u0000\u043e\u043f\u0001\u0000"
                    + "\u0000\u0000\u043f\u0441\u0005Q\u0000\u0000\u0440\u0442\u0005\u00f0\u0000"
                    + "\u0000\u0441\u0440\u0001\u0000\u0000\u0000\u0441\u0442\u0001\u0000\u0000"
                    + "\u0000\u0442\u0443\u0001\u0000\u0000\u0000\u0443\u0446\u0003*\u0015\u0000"
                    + "\u0444\u0445\u0005\u00b7\u0000\u0000\u0445\u0447\u0003,\u0016\u0000\u0446"
                    + "\u0444\u0001\u0000\u0000\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447"
                    + "\u0449\u0001\u0000\u0000\u0000\u0448\u0418\u0001\u0000\u0000\u0000\u0448"
                    + "\u0424\u0001\u0000\u0000\u0000\u0448\u042d\u0001\u0000\u0000\u0000\u0448"
                    + "\u043a\u0001\u0000\u0000\u0000\u0449\u001b\u0001\u0000\u0000\u0000\u044a"
                    + "\u044c\u0003\u001e\u000f\u0000\u044b\u044d\u0003\u0016\u000b\u0000\u044c"
                    + "\u044b\u0001\u0000\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000\u044d"
                    + "\u001d\u0001\u0000\u0000\u0000\u044e\u044f\u0005B\u0000\u0000\u044f\u0450"
                    + "\u0005\u0001\u0000\u0000\u0450\u0455\u0003 \u0010\u0000\u0451\u0452\u0005"
                    + "\u0003\u0000\u0000\u0452\u0454\u0003 \u0010\u0000\u0453\u0451\u0001\u0000"
                    + "\u0000\u0000\u0454\u0457\u0001\u0000\u0000\u0000\u0455\u0453\u0001\u0000"
                    + "\u0000\u0000\u0455\u0456\u0001\u0000\u0000\u0000\u0456\u0458\u0001\u0000"
                    + "\u0000\u0000\u0457\u0455\u0001\u0000\u0000\u0000\u0458\u0459\u0005\u0002"
                    + "\u0000\u0000\u0459\u001f\u0001\u0000\u0000\u0000\u045a\u045d\u0003\u00c0"
                    + "`\u0000\u045b\u045c\u0005\u0082\u0000\u0000\u045c\u045e\u0003\u0096K\u0000"
                    + "\u045d\u045b\u0001\u0000\u0000\u0000\u045d\u045e\u0001\u0000\u0000\u0000"
                    + "\u045e!\u0001\u0000\u0000\u0000\u045f\u0465\u0003\u00be_\u0000\u0460\u0465"
                    + "\u0005\u00f0\u0000\u0000\u0461\u0465\u0003\u0098L\u0000\u0462\u0465\u0003"
                    + "\u009aM\u0000\u0463\u0465\u0003\u009cN\u0000\u0464\u045f\u0001\u0000\u0000"
                    + "\u0000\u0464\u0460\u0001\u0000\u0000\u0000\u0464\u0461\u0001\u0000\u0000"
                    + "\u0000\u0464\u0462\u0001\u0000\u0000\u0000\u0464\u0463\u0001\u0000\u0000"
                    + "\u0000\u0465#\u0001\u0000\u0000\u0000\u0466\u046b\u0003\u00c0`\u0000\u0467"
                    + "\u0468\u0005\u0004\u0000\u0000\u0468\u046a\u0003\u00c0`\u0000\u0469\u0467"
                    + "\u0001\u0000\u0000\u0000\u046a\u046d\u0001\u0000\u0000\u0000\u046b\u0469"
                    + "\u0001\u0000\u0000\u0000\u046b\u046c\u0001\u0000\u0000\u0000\u046c%\u0001"
                    + "\u0000\u0000\u0000\u046d\u046b\u0001\u0000\u0000\u0000\u046e\u046f\u0005"
                    + "M\u0000\u0000\u046f\u0474\u0003(\u0014\u0000\u0470\u0471\u0005\u0003\u0000"
                    + "\u0000\u0471\u0473\u0003(\u0014\u0000\u0472\u0470\u0001\u0000\u0000\u0000"
                    + "\u0473\u0476\u0001\u0000\u0000\u0000\u0474\u0472\u0001\u0000\u0000\u0000"
                    + "\u0474\u0475\u0001\u0000\u0000\u0000\u0475\'\u0001\u0000\u0000\u0000\u0476"
                    + "\u0474\u0001\u0000\u0000\u0000\u0477\u0479\u0003\u00c0`\u0000\u0478\u047a"
                    + "\u0005\u000e\u0000\u0000\u0479\u0478\u0001\u0000\u0000\u0000\u0479\u047a"
                    + "\u0001\u0000\u0000\u0000\u047a\u047b\u0001\u0000\u0000\u0000\u047b\u047c"
                    + "\u0005\u0001\u0000\u0000\u047c\u047d\u0003\u0018\f\u0000\u047d\u047e\u0005"
                    + "\u0002\u0000\u0000\u047e)\u0001\u0000\u0000\u0000\u047f\u0480\u0005\u009f"
                    + "\u0000\u0000\u0480\u0481\u0003\u00be_\u0000\u0481+\u0001\u0000\u0000\u0000"
                    + "\u0482\u0483\u0005\u0001\u0000\u0000\u0483\u0488\u0003.\u0017\u0000\u0484"
                    + "\u0485\u0005\u0003\u0000\u0000\u0485\u0487\u0003.\u0017\u0000\u0486\u0484"
                    + "\u0001\u0000\u0000\u0000\u0487\u048a\u0001\u0000\u0000\u0000\u0488\u0486"
                    + "\u0001\u0000\u0000\u0000\u0488\u0489\u0001\u0000\u0000\u0000\u0489\u048b"
                    + "\u0001\u0000\u0000\u0000\u048a\u0488\u0001\u0000\u0000\u0000\u048b\u048c"
                    + "\u0005\u0002\u0000\u0000\u048c-\u0001\u0000\u0000\u0000\u048d\u0492\u0003"
                    + "0\u0018\u0000\u048e\u0490\u0005\u0082\u0000\u0000\u048f\u048e\u0001\u0000"
                    + "\u0000\u0000\u048f\u0490\u0001\u0000\u0000\u0000\u0490\u0491\u0001\u0000"
                    + "\u0000\u0000\u0491\u0493\u00032\u0019\u0000\u0492\u048f\u0001\u0000\u0000"
                    + "\u0000\u0492\u0493\u0001\u0000\u0000\u0000\u0493/\u0001\u0000\u0000\u0000"
                    + "\u0494\u0499\u0003\u00c0`\u0000\u0495\u0496\u0005\u0004\u0000\u0000\u0496"
                    + "\u0498\u0003\u00c0`\u0000\u0497\u0495\u0001\u0000\u0000\u0000\u0498\u049b"
                    + "\u0001\u0000\u0000\u0000\u0499\u0497\u0001\u0000\u0000\u0000\u0499\u049a"
                    + "\u0001\u0000\u0000\u0000\u049a\u049e\u0001\u0000\u0000\u0000\u049b\u0499"
                    + "\u0001\u0000\u0000\u0000\u049c\u049e\u0005\u00f0\u0000\u0000\u049d\u0494"
                    + "\u0001\u0000\u0000\u0000\u049d\u049c\u0001\u0000\u0000\u0000\u049e1\u0001"
                    + "\u0000\u0000\u0000\u049f\u04a4\u0005\u00f4\u0000\u0000\u04a0\u04a4\u0005"
                    + "\u00f5\u0000\u0000\u04a1\u04a4\u0003\u009eO\u0000\u04a2\u04a4\u0005\u00f0"
                    + "\u0000\u0000\u04a3\u049f\u0001\u0000\u0000\u0000\u04a3\u04a0\u0001\u0000"
                    + "\u0000\u0000\u04a3\u04a1\u0001\u0000\u0000\u0000\u04a3\u04a2\u0001\u0000"
                    + "\u0000\u0000\u04a43\u0001\u0000\u0000\u0000\u04a5\u04a6\u0005\u0001\u0000"
                    + "\u0000\u04a6\u04ab\u0003\u0096K\u0000\u04a7\u04a8\u0005\u0003\u0000\u0000"
                    + "\u04a8\u04aa\u0003\u0096K\u0000\u04a9\u04a7\u0001\u0000\u0000\u0000\u04aa"
                    + "\u04ad\u0001\u0000\u0000\u0000\u04ab\u04a9\u0001\u0000\u0000\u0000\u04ab"
                    + "\u04ac\u0001\u0000\u0000\u0000\u04ac\u04ae\u0001\u0000\u0000\u0000\u04ad"
                    + "\u04ab\u0001\u0000\u0000\u0000\u04ae\u04af\u0005\u0002\u0000\u0000\u04af"
                    + "5\u0001\u0000\u0000\u0000\u04b0\u04b1\u0005\u0001\u0000\u0000\u04b1\u04b6"
                    + "\u00034\u001a\u0000\u04b2\u04b3\u0005\u0003\u0000\u0000\u04b3\u04b5\u0003"
                    + "4\u001a\u0000\u04b4\u04b2\u0001\u0000\u0000\u0000\u04b5\u04b8\u0001\u0000"
                    + "\u0000\u0000\u04b6\u04b4\u0001\u0000\u0000\u0000\u04b6\u04b7\u0001\u0000"
                    + "\u0000\u0000\u04b7\u04b9\u0001\u0000\u0000\u0000\u04b8\u04b6\u0001\u0000"
                    + "\u0000\u0000\u04b9\u04ba\u0005\u0002\u0000\u0000\u04ba7\u0001\u0000\u0000"
                    + "\u0000\u04bb\u04bc\u0005\u00bd\u0000\u0000\u04bc\u04bd\u0005\u000e\u0000"
                    + "\u0000\u04bd\u04c2\u0003:\u001d\u0000\u04be\u04bf\u0005\u00bd\u0000\u0000"
                    + "\u04bf\u04c0\u0005\u0014\u0000\u0000\u04c0\u04c2\u0003<\u001e\u0000\u04c1"
                    + "\u04bb\u0001\u0000\u0000\u0000\u04c1\u04be\u0001\u0000\u0000\u0000\u04c2"
                    + "9\u0001\u0000\u0000\u0000\u04c3\u04c4\u0005\u00cd\u0000\u0000\u04c4\u04c5"
                    + "\u0005\u00f0\u0000\u0000\u04c5\u04c6\u0005\u00ce\u0000\u0000\u04c6\u04c9"
                    + "\u0005\u00f0\u0000\u0000\u04c7\u04c9\u0003\u00c0`\u0000\u04c8\u04c3\u0001"
                    + "\u0000\u0000\u0000\u04c8\u04c7\u0001\u0000\u0000\u0000\u04c9;\u0001\u0000"
                    + "\u0000\u0000\u04ca\u04ce\u0005\u00f0\u0000\u0000\u04cb\u04cc\u0005M\u0000"
                    + "\u0000\u04cc\u04cd\u0005\u00a1\u0000\u0000\u04cd\u04cf\u0003,\u0016\u0000"
                    + "\u04ce\u04cb\u0001\u0000\u0000\u0000\u04ce\u04cf\u0001\u0000\u0000\u0000"
                    + "\u04cf=\u0001\u0000\u0000\u0000\u04d0\u04d1\u0003\u00c0`\u0000\u04d1\u04d2"
                    + "\u0005\u00f0\u0000\u0000\u04d2?\u0001\u0000\u0000\u0000\u04d3\u04d5\u0003"
                    + "\u001a\r\u0000\u04d4\u04d3\u0001\u0000\u0000\u0000\u04d4\u04d5\u0001\u0000"
                    + "\u0000\u0000\u04d5\u04d6\u0001\u0000\u0000\u0000\u04d6\u04d7\u0003F#\u0000"
                    + "\u04d7\u04d8\u0003B!\u0000\u04d8\u04e0\u0001\u0000\u0000\u0000\u04d9\u04db"
                    + "\u0003R)\u0000\u04da\u04dc\u0003D\"\u0000\u04db\u04da\u0001\u0000\u0000"
                    + "\u0000\u04dc\u04dd\u0001\u0000\u0000\u0000\u04dd\u04db\u0001\u0000\u0000"
                    + "\u0000\u04dd\u04de\u0001\u0000\u0000\u0000\u04de\u04e0\u0001\u0000\u0000"
                    + "\u0000\u04df\u04d4\u0001\u0000\u0000\u0000\u04df\u04d9\u0001\u0000\u0000"
                    + "\u0000\u04e0A\u0001\u0000\u0000\u0000\u04e1\u04e2\u0005\u0019\u0000\u0000"
                    + "\u04e2\u04e3\u0005\u0014\u0000\u0000\u04e3\u04e8\u0003J%\u0000\u04e4\u04e5"
                    + "\u0005\u0003\u0000\u0000\u04e5\u04e7\u0003J%\u0000\u04e6\u04e4\u0001\u0000"
                    + "\u0000\u0000\u04e7\u04ea\u0001\u0000\u0000\u0000\u04e8\u04e6\u0001\u0000"
                    + "\u0000\u0000\u04e8\u04e9\u0001\u0000\u0000\u0000\u04e9\u04ec\u0001\u0000"
                    + "\u0000\u0000\u04ea\u04e8\u0001\u0000\u0000\u0000\u04eb\u04e1\u0001\u0000"
                    + "\u0000\u0000\u04eb\u04ec\u0001\u0000\u0000\u0000\u04ec\u04f7\u0001\u0000"
                    + "\u0000\u0000\u04ed\u04ee\u0005\u009a\u0000\u0000\u04ee\u04ef\u0005\u0014"
                    + "\u0000\u0000\u04ef\u04f4\u0003\u008cF\u0000\u04f0\u04f1\u0005\u0003\u0000"
                    + "\u0000\u04f1\u04f3\u0003\u008cF\u0000\u04f2\u04f0\u0001\u0000\u0000\u0000"
                    + "\u04f3\u04f6\u0001\u0000\u0000\u0000\u04f4\u04f2\u0001\u0000\u0000\u0000"
                    + "\u04f4\u04f5\u0001\u0000\u0000\u0000\u04f5\u04f8\u0001\u0000\u0000\u0000"
                    + "\u04f6\u04f4\u0001\u0000\u0000\u0000\u04f7\u04ed\u0001\u0000\u0000\u0000"
                    + "\u04f7\u04f8\u0001\u0000\u0000\u0000\u04f8\u0503\u0001\u0000\u0000\u0000"
                    + "\u04f9\u04fa\u0005\u009b\u0000\u0000\u04fa\u04fb\u0005\u0014\u0000\u0000"
                    + "\u04fb\u0500\u0003\u008cF\u0000\u04fc\u04fd\u0005\u0003\u0000\u0000\u04fd"
                    + "\u04ff\u0003\u008cF\u0000\u04fe\u04fc\u0001\u0000\u0000\u0000\u04ff\u0502"
                    + "\u0001\u0000\u0000\u0000\u0500\u04fe\u0001\u0000\u0000\u0000\u0500\u0501"
                    + "\u0001\u0000\u0000\u0000\u0501\u0504\u0001\u0000\u0000\u0000\u0502\u0500"
                    + "\u0001\u0000\u0000\u0000\u0503\u04f9\u0001\u0000\u0000\u0000\u0503\u0504"
                    + "\u0001\u0000\u0000\u0000\u0504\u050f\u0001\u0000\u0000\u0000\u0505\u0506"
                    + "\u0005\u0099\u0000\u0000\u0506\u0507\u0005\u0014\u0000\u0000\u0507\u050c"
                    + "\u0003J%\u0000\u0508\u0509\u0005\u0003\u0000\u0000\u0509\u050b\u0003J"
                    + "%\u0000\u050a\u0508\u0001\u0000\u0000\u0000\u050b\u050e\u0001\u0000\u0000"
                    + "\u0000\u050c\u050a\u0001\u0000\u0000\u0000\u050c\u050d\u0001\u0000\u0000"
                    + "\u0000\u050d\u0510\u0001\u0000\u0000\u0000\u050e\u050c\u0001\u0000\u0000"
                    + "\u0000\u050f\u0505\u0001\u0000\u0000\u0000\u050f\u0510\u0001\u0000\u0000"
                    + "\u0000\u0510\u0512\u0001\u0000\u0000\u0000\u0511\u0513\u0003\u00b4Z\u0000"
                    + "\u0512\u0511\u0001\u0000\u0000\u0000\u0512\u0513\u0001\u0000\u0000\u0000"
                    + "\u0513\u0519\u0001\u0000\u0000\u0000\u0514\u0517\u0005\u001b\u0000\u0000"
                    + "\u0515\u0518\u0005\u000f\u0000\u0000\u0516\u0518\u0003\u008cF\u0000\u0517"
                    + "\u0515\u0001\u0000\u0000\u0000\u0517\u0516\u0001\u0000\u0000\u0000\u0518"
                    + "\u051a\u0001\u0000\u0000\u0000\u0519\u0514\u0001\u0000\u0000\u0000\u0519"
                    + "\u051a\u0001\u0000\u0000\u0000\u051aC\u0001\u0000\u0000\u0000\u051b\u051d"
                    + "\u0003\u001a\r\u0000\u051c\u051b\u0001\u0000\u0000\u0000\u051c\u051d\u0001"
                    + "\u0000\u0000\u0000\u051d\u051e\u0001\u0000\u0000\u0000\u051e\u051f\u0003"
                    + "L&\u0000\u051f\u0520\u0003B!\u0000\u0520E\u0001\u0000\u0000\u0000\u0521"
                    + "\u0522\u0006#\uffff\uffff\u0000\u0522\u0523\u0003H$\u0000\u0523\u053b"
                    + "\u0001\u0000\u0000\u0000\u0524\u0525\n\u0003\u0000\u0000\u0525\u0526\u0004"
                    + "#\u0001\u0000\u0526\u0528\u0007\u0007\u0000\u0000\u0527\u0529\u0003`0"
                    + "\u0000\u0528\u0527\u0001\u0000\u0000\u0000\u0528\u0529\u0001\u0000\u0000"
                    + "\u0000\u0529\u052a\u0001\u0000\u0000\u0000\u052a\u053a\u0003F#\u0004\u052b"
                    + "\u052c\n\u0002\u0000\u0000\u052c\u052d\u0004#\u0003\u0000\u052d\u052f"
                    + "\u0005i\u0000\u0000\u052e\u0530\u0003`0\u0000\u052f\u052e\u0001\u0000"
                    + "\u0000\u0000\u052f\u0530\u0001\u0000\u0000\u0000\u0530\u0531\u0001\u0000"
                    + "\u0000\u0000\u0531\u053a\u0003F#\u0003\u0532\u0533\n\u0001\u0000\u0000"
                    + "\u0533\u0534\u0004#\u0005\u0000\u0534\u0536\u0007\b\u0000\u0000\u0535"
                    + "\u0537\u0003`0\u0000\u0536\u0535\u0001\u0000\u0000\u0000\u0536\u0537\u0001"
                    + "\u0000\u0000\u0000\u0537\u0538\u0001\u0000\u0000\u0000\u0538\u053a\u0003"
                    + "F#\u0002\u0539\u0524\u0001\u0000\u0000\u0000\u0539\u052b\u0001\u0000\u0000"
                    + "\u0000\u0539\u0532\u0001\u0000\u0000\u0000\u053a\u053d\u0001\u0000\u0000"
                    + "\u0000\u053b\u0539\u0001\u0000\u0000\u0000\u053b\u053c\u0001\u0000\u0000"
                    + "\u0000\u053cG\u0001\u0000\u0000\u0000\u053d\u053b\u0001\u0000\u0000\u0000"
                    + "\u053e\u0547\u0003L&\u0000\u053f\u0540\u0005P\u0000\u0000\u0540\u0547"
                    + "\u0003\u0084B\u0000\u0541\u0547\u0003|>\u0000\u0542\u0543\u0005\u0001"
                    + "\u0000\u0000\u0543\u0544\u0003@ \u0000\u0544\u0545\u0005\u0002\u0000\u0000"
                    + "\u0545\u0547\u0001\u0000\u0000\u0000\u0546\u053e\u0001\u0000\u0000\u0000"
                    + "\u0546\u053f\u0001\u0000\u0000\u0000\u0546\u0541\u0001\u0000\u0000\u0000"
                    + "\u0546\u0542\u0001\u0000\u0000\u0000\u0547I\u0001\u0000\u0000\u0000\u0548"
                    + "\u054a\u0003\u008cF\u0000\u0549\u054b\u0007\t\u0000\u0000\u054a\u0549"
                    + "\u0001\u0000\u0000\u0000\u054a\u054b\u0001\u0000\u0000\u0000\u054b\u054e"
                    + "\u0001\u0000\u0000\u0000\u054c\u054d\u0005*\u0000\u0000\u054d\u054f\u0007"
                    + "\n\u0000\u0000\u054e\u054c\u0001\u0000\u0000\u0000\u054e\u054f\u0001\u0000"
                    + "\u0000\u0000\u054fK\u0001\u0000\u0000\u0000\u0550\u0551\u0005\u000b\u0000"
                    + "\u0000\u0551\u0552\u0005\u009d\u0000\u0000\u0552\u0553\u0005\u0001\u0000"
                    + "\u0000\u0553\u0554\u0003\u008aE\u0000\u0554\u0555\u0005\u0002\u0000\u0000"
                    + "\u0555\u055b\u0001\u0000\u0000\u0000\u0556\u0557\u0005p\u0000\u0000\u0557"
                    + "\u055b\u0003\u008aE\u0000\u0558\u0559\u0005\u009e\u0000\u0000\u0559\u055b"
                    + "\u0003\u008aE\u0000\u055a\u0550\u0001\u0000\u0000\u0000\u055a\u0556\u0001"
                    + "\u0000\u0000\u0000\u055a\u0558\u0001\u0000\u0000\u0000\u055b\u055d\u0001"
                    + "\u0000\u0000\u0000\u055c\u055e\u0003\u0082A\u0000\u055d\u055c\u0001\u0000"
                    + "\u0000\u0000\u055d\u055e\u0001\u0000\u0000\u0000\u055e\u0561\u0001\u0000"
                    + "\u0000\u0000\u055f\u0560\u0005\u00a3\u0000\u0000\u0560\u0562\u0005\u00f0"
                    + "\u0000\u0000\u0561\u055f\u0001\u0000\u0000\u0000\u0561\u0562\u0001\u0000"
                    + "\u0000\u0000\u0562\u0563\u0001\u0000\u0000\u0000\u0563\u0564\u0005\u009f"
                    + "\u0000\u0000\u0564\u0571\u0005\u00f0\u0000\u0000\u0565\u056f\u0005\u000e"
                    + "\u0000\u0000\u0566\u0570\u0003p8\u0000\u0567\u0570\u0003\u00aaU\u0000"
                    + "\u0568\u056b\u0005\u0001\u0000\u0000\u0569\u056c\u0003p8\u0000\u056a\u056c"
                    + "\u0003\u00aaU\u0000\u056b\u0569\u0001\u0000\u0000\u0000\u056b\u056a\u0001"
                    + "\u0000\u0000\u0000\u056c\u056d\u0001\u0000\u0000\u0000\u056d\u056e\u0005"
                    + "\u0002\u0000\u0000\u056e\u0570\u0001\u0000\u0000\u0000\u056f\u0566\u0001"
                    + "\u0000\u0000\u0000\u056f\u0567\u0001\u0000\u0000\u0000\u056f\u0568\u0001"
                    + "\u0000\u0000\u0000\u0570\u0572\u0001\u0000\u0000\u0000\u0571\u0565\u0001"
                    + "\u0000\u0000\u0000\u0571\u0572\u0001\u0000\u0000\u0000\u0572\u0574\u0001"
                    + "\u0000\u0000\u0000\u0573\u0575\u0003\u0082A\u0000\u0574\u0573\u0001\u0000"
                    + "\u0000\u0000\u0574\u0575\u0001\u0000\u0000\u0000\u0575\u0578\u0001\u0000"
                    + "\u0000\u0000\u0576\u0577\u0005\u00a2\u0000\u0000\u0577\u0579\u0005\u00f0"
                    + "\u0000\u0000\u0578\u0576\u0001\u0000\u0000\u0000\u0578\u0579\u0001\u0000"
                    + "\u0000\u0000\u0579\u057b\u0001\u0000\u0000\u0000\u057a\u057c\u0003R)\u0000"
                    + "\u057b\u057a\u0001\u0000\u0000\u0000\u057b\u057c\u0001\u0000\u0000\u0000"
                    + "\u057c\u057f\u0001\u0000\u0000\u0000\u057d\u057e\u0005\u0012\u0000\u0000"
                    + "\u057e\u0580\u0003\u008eG\u0000\u057f\u057d\u0001\u0000\u0000\u0000\u057f"
                    + "\u0580\u0001\u0000\u0000\u0000\u0580\u05ae\u0001\u0000\u0000\u0000\u0581"
                    + "\u0585\u0005\u000b\u0000\u0000\u0582\u0584\u0003N\'\u0000\u0583\u0582"
                    + "\u0001\u0000\u0000\u0000\u0584\u0587\u0001\u0000\u0000\u0000\u0585\u0583"
                    + "\u0001\u0000\u0000\u0000\u0585\u0586\u0001\u0000\u0000\u0000\u0586\u0589"
                    + "\u0001\u0000\u0000\u0000\u0587\u0585\u0001\u0000\u0000\u0000\u0588\u058a"
                    + "\u0003`0\u0000\u0589\u0588\u0001\u0000\u0000\u0000\u0589\u058a\u0001\u0000"
                    + "\u0000\u0000\u058a\u058b\u0001\u0000\u0000\u0000\u058b\u058d\u0003\u008a"
                    + "E\u0000\u058c\u058e\u0003R)\u0000\u058d\u058c\u0001\u0000\u0000\u0000"
                    + "\u058d\u058e\u0001\u0000\u0000\u0000\u058e\u0598\u0001\u0000\u0000\u0000"
                    + "\u058f\u0595\u0003R)\u0000\u0590\u0592\u0005\u000b\u0000\u0000\u0591\u0593"
                    + "\u0003`0\u0000\u0592\u0591\u0001\u0000\u0000\u0000\u0592\u0593\u0001\u0000"
                    + "\u0000\u0000\u0593\u0594\u0001\u0000\u0000\u0000\u0594\u0596\u0003\u008a"
                    + "E\u0000\u0595\u0590\u0001\u0000\u0000\u0000\u0595\u0596\u0001\u0000\u0000"
                    + "\u0000\u0596\u0598\u0001\u0000\u0000\u0000\u0597\u0581\u0001\u0000\u0000"
                    + "\u0000\u0597\u058f\u0001\u0000\u0000\u0000\u0598\u059c\u0001\u0000\u0000"
                    + "\u0000\u0599\u059b\u0003^/\u0000\u059a\u0599\u0001\u0000\u0000\u0000\u059b"
                    + "\u059e\u0001\u0000\u0000\u0000\u059c\u059a\u0001\u0000\u0000\u0000\u059c"
                    + "\u059d\u0001\u0000\u0000\u0000\u059d\u05a1\u0001\u0000\u0000\u0000\u059e"
                    + "\u059c\u0001\u0000\u0000\u0000\u059f\u05a0\u0005\u0012\u0000\u0000\u05a0"
                    + "\u05a2\u0003\u008eG\u0000\u05a1\u059f\u0001\u0000\u0000\u0000\u05a1\u05a2"
                    + "\u0001\u0000\u0000\u0000\u05a2\u05a4\u0001\u0000\u0000\u0000\u05a3\u05a5"
                    + "\u0003T*\u0000\u05a4\u05a3\u0001\u0000\u0000\u0000\u05a4\u05a5\u0001\u0000"
                    + "\u0000\u0000\u05a5\u05a8\u0001\u0000\u0000\u0000\u05a6\u05a7\u0005\u001a"
                    + "\u0000\u0000\u05a7\u05a9\u0003\u008eG\u0000\u05a8\u05a6\u0001\u0000\u0000"
                    + "\u0000\u05a8\u05a9\u0001\u0000\u0000\u0000\u05a9\u05ab\u0001\u0000\u0000"
                    + "\u0000\u05aa\u05ac\u0003\u00b4Z\u0000\u05ab\u05aa\u0001\u0000\u0000\u0000"
                    + "\u05ab\u05ac\u0001\u0000\u0000\u0000\u05ac\u05ae\u0001\u0000\u0000\u0000"
                    + "\u05ad\u055a\u0001\u0000\u0000\u0000\u05ad\u0597\u0001\u0000\u0000\u0000"
                    + "\u05aeM\u0001\u0000\u0000\u0000\u05af\u05b0\u0005\u0005\u0000\u0000\u05b0"
                    + "\u05b7\u0003P(\u0000\u05b1\u05b3\u0005\u0003\u0000\u0000\u05b2\u05b1\u0001"
                    + "\u0000\u0000\u0000\u05b2\u05b3\u0001\u0000\u0000\u0000\u05b3\u05b4\u0001"
                    + "\u0000\u0000\u0000\u05b4\u05b6\u0003P(\u0000\u05b5\u05b2\u0001\u0000\u0000"
                    + "\u0000\u05b6\u05b9\u0001\u0000\u0000\u0000\u05b7\u05b5\u0001\u0000\u0000"
                    + "\u0000\u05b7\u05b8\u0001\u0000\u0000\u0000\u05b8\u05ba\u0001\u0000\u0000"
                    + "\u0000\u05b9\u05b7\u0001\u0000\u0000\u0000\u05ba\u05bb\u0005\u0006\u0000"
                    + "\u0000\u05bbO\u0001\u0000\u0000\u0000\u05bc\u05ca\u0003\u00c0`\u0000\u05bd"
                    + "\u05be\u0003\u00c0`\u0000\u05be\u05bf\u0005\u0001\u0000\u0000\u05bf\u05c4"
                    + "\u0003\u0094J\u0000\u05c0\u05c1\u0005\u0003\u0000\u0000\u05c1\u05c3\u0003"
                    + "\u0094J\u0000\u05c2\u05c0\u0001\u0000\u0000\u0000\u05c3\u05c6\u0001\u0000"
                    + "\u0000\u0000\u05c4\u05c2\u0001\u0000\u0000\u0000\u05c4\u05c5\u0001\u0000"
                    + "\u0000\u0000\u05c5\u05c7\u0001\u0000\u0000\u0000\u05c6\u05c4\u0001\u0000"
                    + "\u0000\u0000\u05c7\u05c8\u0005\u0002\u0000\u0000\u05c8\u05ca\u0001\u0000"
                    + "\u0000\u0000\u05c9\u05bc\u0001\u0000\u0000\u0000\u05c9\u05bd\u0001\u0000"
                    + "\u0000\u0000\u05caQ\u0001\u0000\u0000\u0000\u05cb\u05cc\u0005\f\u0000"
                    + "\u0000\u05cc\u05d1\u0003b1\u0000\u05cd\u05ce\u0005\u0003\u0000\u0000\u05ce"
                    + "\u05d0\u0003b1\u0000\u05cf\u05cd\u0001\u0000\u0000\u0000\u05d0\u05d3\u0001"
                    + "\u0000\u0000\u0000\u05d1\u05cf\u0001\u0000\u0000\u0000\u05d1\u05d2\u0001"
                    + "\u0000\u0000\u0000\u05d2\u05d7\u0001\u0000\u0000\u0000\u05d3\u05d1\u0001"
                    + "\u0000\u0000\u0000\u05d4\u05d6\u0003^/\u0000\u05d5\u05d4\u0001\u0000\u0000"
                    + "\u0000\u05d6\u05d9\u0001\u0000\u0000\u0000\u05d7\u05d5\u0001\u0000\u0000"
                    + "\u0000\u05d7\u05d8\u0001\u0000\u0000\u0000\u05d8\u05db\u0001\u0000\u0000"
                    + "\u0000\u05d9\u05d7\u0001\u0000\u0000\u0000\u05da\u05dc\u0003X,\u0000\u05db"
                    + "\u05da\u0001\u0000\u0000\u0000\u05db\u05dc\u0001\u0000\u0000\u0000\u05dc"
                    + "S\u0001\u0000\u0000\u0000\u05dd\u05de\u0005\u0013\u0000\u0000\u05de\u05df"
                    + "\u0005\u0014\u0000\u0000\u05df\u05e4\u0003\u008cF\u0000\u05e0\u05e1\u0005"
                    + "\u0003\u0000\u0000\u05e1\u05e3\u0003\u008cF\u0000\u05e2\u05e0\u0001\u0000"
                    + "\u0000\u0000\u05e3\u05e6\u0001\u0000\u0000\u0000\u05e4\u05e2\u0001\u0000"
                    + "\u0000\u0000\u05e4\u05e5\u0001\u0000\u0000\u0000\u05e5\u05f8\u0001\u0000"
                    + "\u0000\u0000\u05e6\u05e4\u0001\u0000\u0000\u0000\u05e7\u05e8\u0005M\u0000"
                    + "\u0000\u05e8\u05f9\u0005\u0018\u0000\u0000\u05e9\u05ea\u0005M\u0000\u0000"
                    + "\u05ea\u05f9\u0005\u0017\u0000\u0000\u05eb\u05ec\u0005\u0015\u0000\u0000"
                    + "\u05ec\u05ed\u0005\u0016\u0000\u0000\u05ed\u05ee\u0005\u0001\u0000\u0000"
                    + "\u05ee\u05f3\u0003V+\u0000\u05ef\u05f0\u0005\u0003\u0000\u0000\u05f0\u05f2"
                    + "\u0003V+\u0000\u05f1\u05ef\u0001\u0000\u0000\u0000\u05f2\u05f5\u0001\u0000"
                    + "\u0000\u0000\u05f3\u05f1\u0001\u0000\u0000\u0000\u05f3\u05f4\u0001\u0000"
                    + "\u0000\u0000\u05f4\u05f6\u0001\u0000\u0000\u0000\u05f5\u05f3\u0001\u0000"
                    + "\u0000\u0000\u05f6\u05f7\u0005\u0002\u0000\u0000\u05f7\u05f9\u0001\u0000"
                    + "\u0000\u0000\u05f8\u05e7\u0001\u0000\u0000\u0000\u05f8\u05e9\u0001\u0000"
                    + "\u0000\u0000\u05f8\u05eb\u0001\u0000\u0000\u0000\u05f8\u05f9\u0001\u0000"
                    + "\u0000\u0000\u05f9\u060a\u0001\u0000\u0000\u0000\u05fa\u05fb\u0005\u0013"
                    + "\u0000\u0000\u05fb\u05fc\u0005\u0014\u0000\u0000\u05fc\u05fd\u0005\u0015"
                    + "\u0000\u0000\u05fd\u05fe\u0005\u0016\u0000\u0000\u05fe\u05ff\u0005\u0001"
                    + "\u0000\u0000\u05ff\u0604\u0003V+\u0000\u0600\u0601\u0005\u0003\u0000\u0000"
                    + "\u0601\u0603\u0003V+\u0000\u0602\u0600\u0001\u0000\u0000\u0000\u0603\u0606"
                    + "\u0001\u0000\u0000\u0000\u0604\u0602\u0001\u0000\u0000\u0000\u0604\u0605"
                    + "\u0001\u0000\u0000\u0000\u0605\u0607\u0001\u0000\u0000\u0000\u0606\u0604"
                    + "\u0001\u0000\u0000\u0000\u0607\u0608\u0005\u0002\u0000\u0000\u0608\u060a"
                    + "\u0001\u0000\u0000\u0000\u0609\u05dd\u0001\u0000\u0000\u0000\u0609\u05fa"
                    + "\u0001\u0000\u0000\u0000\u060aU\u0001\u0000\u0000\u0000\u060b\u0614\u0005"
                    + "\u0001\u0000\u0000\u060c\u0611\u0003\u008cF\u0000\u060d\u060e\u0005\u0003"
                    + "\u0000\u0000\u060e\u0610\u0003\u008cF\u0000\u060f\u060d\u0001\u0000\u0000"
                    + "\u0000\u0610\u0613\u0001\u0000\u0000\u0000\u0611\u060f\u0001\u0000\u0000"
                    + "\u0000\u0611\u0612\u0001\u0000\u0000\u0000\u0612\u0615\u0001\u0000\u0000"
                    + "\u0000\u0613\u0611\u0001\u0000\u0000\u0000\u0614\u060c\u0001\u0000\u0000"
                    + "\u0000\u0614\u0615\u0001\u0000\u0000\u0000\u0615\u0616\u0001\u0000\u0000"
                    + "\u0000\u0616\u0619\u0005\u0002\u0000\u0000\u0617\u0619\u0003\u008cF\u0000"
                    + "\u0618\u060b\u0001\u0000\u0000\u0000\u0618\u0617\u0001\u0000\u0000\u0000"
                    + "\u0619W\u0001\u0000\u0000\u0000\u061a\u061b\u0005>\u0000\u0000\u061b\u061c"
                    + "\u0005\u0001\u0000\u0000\u061c\u061d\u0003\u008aE\u0000\u061d\u061e\u0005"
                    + "-\u0000\u0000\u061e\u061f\u0003Z-\u0000\u061f\u0620\u0005\u001f\u0000"
                    + "\u0000\u0620\u0621\u0005\u0001\u0000\u0000\u0621\u0626\u0003\\.\u0000"
                    + "\u0622\u0623\u0005\u0003\u0000\u0000\u0623\u0625\u0003\\.\u0000\u0624"
                    + "\u0622\u0001\u0000\u0000\u0000\u0625\u0628\u0001\u0000\u0000\u0000\u0626"
                    + "\u0624\u0001\u0000\u0000\u0000\u0626\u0627\u0001\u0000\u0000\u0000\u0627"
                    + "\u0629\u0001\u0000\u0000\u0000\u0628\u0626\u0001\u0000\u0000\u0000\u0629"
                    + "\u062a\u0005\u0002\u0000\u0000\u062a\u062b\u0005\u0002\u0000\u0000\u062b"
                    + "Y\u0001\u0000\u0000\u0000\u062c\u0639\u0003\u00c0`\u0000\u062d\u062e\u0005"
                    + "\u0001\u0000\u0000\u062e\u0633\u0003\u00c0`\u0000\u062f\u0630\u0005\u0003"
                    + "\u0000\u0000\u0630\u0632\u0003\u00c0`\u0000\u0631\u062f\u0001\u0000\u0000"
                    + "\u0000\u0632\u0635\u0001\u0000\u0000\u0000\u0633\u0631\u0001\u0000\u0000"
                    + "\u0000\u0633\u0634\u0001\u0000\u0000\u0000\u0634\u0636\u0001\u0000\u0000"
                    + "\u0000\u0635\u0633\u0001\u0000\u0000\u0000\u0636\u0637\u0005\u0002\u0000"
                    + "\u0000\u0637\u0639\u0001\u0000\u0000\u0000\u0638\u062c\u0001\u0000\u0000"
                    + "\u0000\u0638\u062d\u0001\u0000\u0000\u0000\u0639[\u0001\u0000\u0000\u0000"
                    + "\u063a\u063f\u0003\u008cF\u0000\u063b\u063d\u0005\u000e\u0000\u0000\u063c"
                    + "\u063b\u0001\u0000\u0000\u0000\u063c\u063d\u0001\u0000\u0000\u0000\u063d"
                    + "\u063e\u0001\u0000\u0000\u0000\u063e\u0640\u0003\u00c0`\u0000\u063f\u063c"
                    + "\u0001\u0000\u0000\u0000\u063f\u0640\u0001\u0000\u0000\u0000\u0640]\u0001"
                    + "\u0000\u0000\u0000\u0641\u0642\u0005?\u0000\u0000\u0642\u0644\u0005R\u0000"
                    + "\u0000\u0643\u0645\u00056\u0000\u0000\u0644\u0643\u0001\u0000\u0000\u0000"
                    + "\u0644\u0645\u0001\u0000\u0000\u0000\u0645\u0646\u0001\u0000\u0000\u0000"
                    + "\u0646\u0647\u0003\u00be_\u0000\u0647\u0650\u0005\u0001\u0000\u0000\u0648"
                    + "\u064d\u0003\u008cF\u0000\u0649\u064a\u0005\u0003\u0000\u0000\u064a\u064c"
                    + "\u0003\u008cF\u0000\u064b\u0649\u0001\u0000\u0000\u0000\u064c\u064f\u0001"
                    + "\u0000\u0000\u0000\u064d\u064b\u0001\u0000\u0000\u0000\u064d\u064e\u0001"
                    + "\u0000\u0000\u0000\u064e\u0651\u0001\u0000\u0000\u0000\u064f\u064d\u0001"
                    + "\u0000\u0000\u0000\u0650\u0648\u0001\u0000\u0000\u0000\u0650\u0651\u0001"
                    + "\u0000\u0000\u0000\u0651\u0652\u0001\u0000\u0000\u0000\u0652\u0653\u0005"
                    + "\u0002\u0000\u0000\u0653\u065f\u0003\u00c0`\u0000\u0654\u0656\u0005\u000e"
                    + "\u0000\u0000\u0655\u0654\u0001\u0000\u0000\u0000\u0655\u0656\u0001\u0000"
                    + "\u0000\u0000\u0656\u0657\u0001\u0000\u0000\u0000\u0657\u065c\u0003\u00c0"
                    + "`\u0000\u0658\u0659\u0005\u0003\u0000\u0000\u0659\u065b\u0003\u00c0`\u0000"
                    + "\u065a\u0658\u0001\u0000\u0000\u0000\u065b\u065e\u0001\u0000\u0000\u0000"
                    + "\u065c\u065a\u0001\u0000\u0000\u0000\u065c\u065d\u0001\u0000\u0000\u0000"
                    + "\u065d\u0660\u0001\u0000\u0000\u0000\u065e\u065c\u0001\u0000\u0000\u0000"
                    + "\u065f\u0655\u0001\u0000\u0000\u0000\u065f\u0660\u0001\u0000\u0000\u0000"
                    + "\u0660_\u0001\u0000\u0000\u0000\u0661\u0662\u0007\u000b\u0000\u0000\u0662"
                    + "a\u0001\u0000\u0000\u0000\u0663\u0667\u0003z=\u0000\u0664\u0666\u0003"
                    + "d2\u0000\u0665\u0664\u0001\u0000\u0000\u0000\u0666\u0669\u0001\u0000\u0000"
                    + "\u0000\u0667\u0665\u0001\u0000\u0000\u0000\u0667\u0668\u0001\u0000\u0000"
                    + "\u0000\u0668c\u0001\u0000\u0000\u0000\u0669\u0667\u0001\u0000\u0000\u0000"
                    + "\u066a\u066b\u0003f3\u0000\u066b\u066c\u00054\u0000\u0000\u066c\u066e"
                    + "\u0003z=\u0000\u066d\u066f\u0003h4\u0000\u066e\u066d\u0001\u0000\u0000"
                    + "\u0000\u066e\u066f\u0001\u0000\u0000\u0000\u066f\u0676\u0001\u0000\u0000"
                    + "\u0000\u0670\u0671\u0005<\u0000\u0000\u0671\u0672\u0003f3\u0000\u0672"
                    + "\u0673\u00054\u0000\u0000\u0673\u0674\u0003z=\u0000\u0674\u0676\u0001"
                    + "\u0000\u0000\u0000\u0675\u066a\u0001\u0000\u0000\u0000\u0675\u0670\u0001"
                    + "\u0000\u0000\u0000\u0676e\u0001\u0000\u0000\u0000\u0677\u0679\u00057\u0000"
                    + "\u0000\u0678\u0677\u0001\u0000\u0000\u0000\u0678\u0679\u0001\u0000\u0000"
                    + "\u0000\u0679\u068e\u0001\u0000\u0000\u0000\u067a\u068e\u00055\u0000\u0000"
                    + "\u067b\u067d\u00058\u0000\u0000\u067c\u067e\u00056\u0000\u0000\u067d\u067c"
                    + "\u0001\u0000\u0000\u0000\u067d\u067e\u0001\u0000\u0000\u0000\u067e\u068e"
                    + "\u0001\u0000\u0000\u0000\u067f\u0680\u00058\u0000\u0000\u0680\u068e\u0005"
                    + "9\u0000\u0000\u0681\u0683\u0005:\u0000\u0000\u0682\u0684\u00056\u0000"
                    + "\u0000\u0683\u0682\u0001\u0000\u0000\u0000\u0683\u0684\u0001\u0000\u0000"
                    + "\u0000\u0684\u068e\u0001\u0000\u0000\u0000\u0685\u0687\u0005;\u0000\u0000"
                    + "\u0686\u0688\u00056\u0000\u0000\u0687\u0686\u0001\u0000\u0000\u0000\u0687"
                    + "\u0688\u0001\u0000\u0000\u0000\u0688\u068e\u0001\u0000\u0000\u0000\u0689"
                    + "\u068b\u00058\u0000\u0000\u068a\u0689\u0001\u0000\u0000\u0000\u068a\u068b"
                    + "\u0001\u0000\u0000\u0000\u068b\u068c\u0001\u0000\u0000\u0000\u068c\u068e"
                    + "\u0005\u00ed\u0000\u0000\u068d\u0678\u0001\u0000\u0000\u0000\u068d\u067a"
                    + "\u0001\u0000\u0000\u0000\u068d\u067b\u0001\u0000\u0000\u0000\u068d\u067f"
                    + "\u0001\u0000\u0000\u0000\u068d\u0681\u0001\u0000\u0000\u0000\u068d\u0685"
                    + "\u0001\u0000\u0000\u0000\u068d\u068a\u0001\u0000\u0000\u0000\u068eg\u0001"
                    + "\u0000\u0000\u0000\u068f\u0690\u0005=\u0000\u0000\u0690\u069e\u0003\u008e"
                    + "G\u0000\u0691\u0692\u0005\u009f\u0000\u0000\u0692\u0693\u0005\u0001\u0000"
                    + "\u0000\u0693\u0698\u0003\u00c0`\u0000\u0694\u0695\u0005\u0003\u0000\u0000"
                    + "\u0695\u0697\u0003\u00c0`\u0000\u0696\u0694\u0001\u0000\u0000\u0000\u0697"
                    + "\u069a\u0001\u0000\u0000\u0000\u0698\u0696\u0001\u0000\u0000\u0000\u0698"
                    + "\u0699\u0001\u0000\u0000\u0000\u0699\u069b\u0001\u0000\u0000\u0000\u069a"
                    + "\u0698\u0001\u0000\u0000\u0000\u069b\u069c\u0005\u0002\u0000\u0000\u069c"
                    + "\u069e\u0001\u0000\u0000\u0000\u069d\u068f\u0001\u0000\u0000\u0000\u069d"
                    + "\u0691\u0001\u0000\u0000\u0000\u069ei\u0001\u0000\u0000\u0000\u069f\u06a0"
                    + "\u0005k\u0000\u0000\u06a0\u06a2\u0005\u0001\u0000\u0000\u06a1\u06a3\u0003"
                    + "l6\u0000\u06a2\u06a1\u0001\u0000\u0000\u0000\u06a2\u06a3\u0001\u0000\u0000"
                    + "\u0000\u06a3\u06a4\u0001\u0000\u0000\u0000\u06a4\u06a5\u0005\u0002\u0000"
                    + "\u0000\u06a5k\u0001\u0000\u0000\u0000\u06a6\u06a8\u0005\u008b\u0000\u0000"
                    + "\u06a7\u06a6\u0001\u0000\u0000\u0000\u06a7\u06a8\u0001\u0000\u0000\u0000"
                    + "\u06a8\u06a9\u0001\u0000\u0000\u0000\u06a9\u06aa\u0007\f\u0000\u0000\u06aa"
                    + "\u06bf\u0005\u0095\u0000\u0000\u06ab\u06ac\u0003\u008cF\u0000\u06ac\u06ad"
                    + "\u0005D\u0000\u0000\u06ad\u06bf\u0001\u0000\u0000\u0000\u06ae\u06af\u0005"
                    + "\u0096\u0000\u0000\u06af\u06b0\u0005\u00f4\u0000\u0000\u06b0\u06b1\u0005"
                    + "\u0097\u0000\u0000\u06b1\u06b2\u0005\u0098\u0000\u0000\u06b2\u06bb\u0005"
                    + "\u00f4\u0000\u0000\u06b3\u06b9\u0005=\u0000\u0000\u06b4\u06ba\u0003\u00c0"
                    + "`\u0000\u06b5\u06b6\u0003\u00be_\u0000\u06b6\u06b7\u0005\u0001\u0000\u0000"
                    + "\u06b7\u06b8\u0005\u0002\u0000\u0000\u06b8\u06ba\u0001\u0000\u0000\u0000"
                    + "\u06b9\u06b4\u0001\u0000\u0000\u0000\u06b9\u06b5\u0001\u0000\u0000\u0000"
                    + "\u06ba\u06bc\u0001\u0000\u0000\u0000\u06bb\u06b3\u0001\u0000\u0000\u0000"
                    + "\u06bb\u06bc\u0001\u0000\u0000\u0000\u06bc\u06bf\u0001\u0000\u0000\u0000"
                    + "\u06bd\u06bf\u0003\u008cF\u0000\u06be\u06a7\u0001\u0000\u0000\u0000\u06be"
                    + "\u06ab\u0001\u0000\u0000\u0000\u06be\u06ae\u0001\u0000\u0000\u0000\u06be"
                    + "\u06bd\u0001\u0000\u0000\u0000\u06bfm\u0001\u0000\u0000\u0000\u06c0\u06c1"
                    + "\u0005\u0001\u0000\u0000\u06c1\u06c2\u0003p8\u0000\u06c2\u06c3\u0005\u0002"
                    + "\u0000\u0000\u06c3o\u0001\u0000\u0000\u0000\u06c4\u06c9\u0003\u00c0`\u0000"
                    + "\u06c5\u06c6\u0005\u0003\u0000\u0000\u06c6\u06c8\u0003\u00c0`\u0000\u06c7"
                    + "\u06c5\u0001\u0000\u0000\u0000\u06c8\u06cb\u0001\u0000\u0000\u0000\u06c9"
                    + "\u06c7\u0001\u0000\u0000\u0000\u06c9\u06ca\u0001\u0000\u0000\u0000\u06ca"
                    + "q\u0001\u0000\u0000\u0000\u06cb\u06c9\u0001\u0000\u0000\u0000\u06cc\u06cd"
                    + "\u0005\u0001\u0000\u0000\u06cd\u06d2\u0003t:\u0000\u06ce\u06cf\u0005\u0003"
                    + "\u0000\u0000\u06cf\u06d1\u0003t:\u0000\u06d0\u06ce\u0001\u0000\u0000\u0000"
                    + "\u06d1\u06d4\u0001\u0000\u0000\u0000\u06d2\u06d0\u0001\u0000\u0000\u0000"
                    + "\u06d2\u06d3\u0001\u0000\u0000\u0000\u06d3\u06d5\u0001\u0000\u0000\u0000"
                    + "\u06d4\u06d2\u0001\u0000\u0000\u0000\u06d5\u06d6\u0005\u0002\u0000\u0000"
                    + "\u06d6s\u0001\u0000\u0000\u0000\u06d7\u06d9\u0003\u00c0`\u0000\u06d8\u06da"
                    + "\u0007\t\u0000\u0000\u06d9\u06d8\u0001\u0000\u0000\u0000\u06d9\u06da\u0001"
                    + "\u0000\u0000\u0000\u06dau\u0001\u0000\u0000\u0000\u06db\u06dc\u0005\u0001"
                    + "\u0000\u0000\u06dc\u06e1\u0003x<\u0000\u06dd\u06de\u0005\u0003\u0000\u0000"
                    + "\u06de\u06e0\u0003x<\u0000\u06df\u06dd\u0001\u0000\u0000\u0000\u06e0\u06e3"
                    + "\u0001\u0000\u0000\u0000\u06e1\u06df\u0001\u0000\u0000\u0000\u06e1\u06e2"
                    + "\u0001\u0000\u0000\u0000\u06e2\u06e4\u0001\u0000\u0000\u0000\u06e3\u06e1"
                    + "\u0001\u0000\u0000\u0000\u06e4\u06e5\u0005\u0002\u0000\u0000\u06e5w\u0001"
                    + "\u0000\u0000\u0000\u06e6\u06e9\u0003\u00c0`\u0000\u06e7\u06e8\u0005r\u0000"
                    + "\u0000\u06e8\u06ea\u0005\u00f0\u0000\u0000\u06e9\u06e7\u0001\u0000\u0000"
                    + "\u0000\u06e9\u06ea\u0001\u0000\u0000\u0000\u06eay\u0001\u0000\u0000\u0000"
                    + "\u06eb\u06ed\u0003\u0084B\u0000\u06ec\u06ee\u0003j5\u0000\u06ed\u06ec"
                    + "\u0001\u0000\u0000\u0000\u06ed\u06ee\u0001\u0000\u0000\u0000\u06ee\u06ef"
                    + "\u0001\u0000\u0000\u0000\u06ef\u06f0\u0003\u0080@\u0000\u06f0\u0704\u0001"
                    + "\u0000\u0000\u0000\u06f1\u06f2\u0005\u0001\u0000\u0000\u06f2\u06f3\u0003"
                    + "@ \u0000\u06f3\u06f5\u0005\u0002\u0000\u0000\u06f4\u06f6\u0003j5\u0000"
                    + "\u06f5\u06f4\u0001\u0000\u0000\u0000\u06f5\u06f6\u0001\u0000\u0000\u0000"
                    + "\u06f6\u06f7\u0001\u0000\u0000\u0000\u06f7\u06f8\u0003\u0080@\u0000\u06f8"
                    + "\u0704\u0001\u0000\u0000\u0000\u06f9\u06fa\u0005\u0001\u0000\u0000\u06fa"
                    + "\u06fb\u0003b1\u0000\u06fb\u06fd\u0005\u0002\u0000\u0000\u06fc\u06fe\u0003"
                    + "j5\u0000\u06fd\u06fc\u0001\u0000\u0000\u0000\u06fd\u06fe\u0001\u0000\u0000"
                    + "\u0000\u06fe\u06ff\u0001\u0000\u0000\u0000\u06ff\u0700\u0003\u0080@\u0000"
                    + "\u0700\u0704\u0001\u0000\u0000\u0000\u0701\u0704\u0003|>\u0000\u0702\u0704"
                    + "\u0003~?\u0000\u0703\u06eb\u0001\u0000\u0000\u0000\u0703\u06f1\u0001\u0000"
                    + "\u0000\u0000\u0703\u06f9\u0001\u0000\u0000\u0000\u0703\u0701\u0001\u0000"
                    + "\u0000\u0000\u0703\u0702\u0001\u0000\u0000\u0000\u0704{\u0001\u0000\u0000"
                    + "\u0000\u0705\u0706\u0005N\u0000\u0000\u0706\u070b\u0003\u008cF\u0000\u0707"
                    + "\u0708\u0005\u0003\u0000\u0000\u0708\u070a\u0003\u008cF\u0000\u0709\u0707"
                    + "\u0001\u0000\u0000\u0000\u070a\u070d\u0001\u0000\u0000\u0000\u070b\u0709"
                    + "\u0001\u0000\u0000\u0000\u070b\u070c\u0001\u0000\u0000\u0000\u070c\u070e"
                    + "\u0001\u0000\u0000\u0000\u070d\u070b\u0001\u0000\u0000\u0000\u070e\u070f"
                    + "\u0003\u0080@\u0000\u070f}\u0001\u0000\u0000\u0000\u0710\u0711\u0003\u00c0"
                    + "`\u0000\u0711\u071a\u0005\u0001\u0000\u0000\u0712\u0717\u0003\u008cF\u0000"
                    + "\u0713\u0714\u0005\u0003\u0000\u0000\u0714\u0716\u0003\u008cF\u0000\u0715"
                    + "\u0713\u0001\u0000\u0000\u0000\u0716\u0719\u0001\u0000\u0000\u0000\u0717"
                    + "\u0715\u0001\u0000\u0000\u0000\u0717\u0718\u0001\u0000\u0000\u0000\u0718"
                    + "\u071b\u0001\u0000\u0000\u0000\u0719\u0717\u0001\u0000\u0000\u0000\u071a"
                    + "\u0712\u0001\u0000\u0000\u0000\u071a\u071b\u0001\u0000\u0000\u0000\u071b"
                    + "\u071c\u0001\u0000\u0000\u0000\u071c\u071d\u0005\u0002\u0000\u0000\u071d"
                    + "\u071e\u0003\u0080@\u0000\u071e\u007f\u0001\u0000\u0000\u0000\u071f\u0721"
                    + "\u0005\u000e\u0000\u0000\u0720\u071f\u0001\u0000\u0000\u0000\u0720\u0721"
                    + "\u0001\u0000\u0000\u0000\u0721\u0722\u0001\u0000\u0000\u0000\u0722\u0724"
                    + "\u0003\u00c2a\u0000\u0723\u0725\u0003n7\u0000\u0724\u0723\u0001\u0000"
                    + "\u0000\u0000\u0724\u0725\u0001\u0000\u0000\u0000\u0725\u0727\u0001\u0000"
                    + "\u0000\u0000\u0726\u0720\u0001\u0000\u0000\u0000\u0726\u0727\u0001\u0000"
                    + "\u0000\u0000\u0727\u0081\u0001\u0000\u0000\u0000\u0728\u0729\u0005L\u0000"
                    + "\u0000\u0729\u072a\u0005Y\u0000\u0000\u072a\u072b\u0005\u00a0\u0000\u0000"
                    + "\u072b\u072f\u0005\u00f0\u0000\u0000\u072c\u072d\u0005M\u0000\u0000\u072d"
                    + "\u072e\u0005\u00a1\u0000\u0000\u072e\u0730\u0003,\u0016\u0000\u072f\u072c"
                    + "\u0001\u0000\u0000\u0000\u072f\u0730\u0001\u0000\u0000\u0000\u0730\u075a"
                    + "\u0001\u0000\u0000\u0000\u0731\u0732\u0005L\u0000\u0000\u0732\u0733\u0005"
                    + "Y\u0000\u0000\u0733\u073d\u0005\u00a4\u0000\u0000\u0734\u0735\u0005\u00a5"
                    + "\u0000\u0000\u0735\u0736\u0005\u00a6\u0000\u0000\u0736\u0737\u0005\u0014"
                    + "\u0000\u0000\u0737\u073b\u0005\u00f0\u0000\u0000\u0738\u0739\u0005\u00aa"
                    + "\u0000\u0000\u0739\u073a\u0005\u0014\u0000\u0000\u073a\u073c\u0005\u00f0"
                    + "\u0000\u0000\u073b\u0738\u0001\u0000\u0000\u0000\u073b\u073c\u0001\u0000"
                    + "\u0000\u0000\u073c\u073e\u0001\u0000\u0000\u0000\u073d\u0734\u0001\u0000"
                    + "\u0000\u0000\u073d\u073e\u0001\u0000\u0000\u0000\u073e\u0744\u0001\u0000"
                    + "\u0000\u0000\u073f\u0740\u0005\u00a7\u0000\u0000\u0740\u0741\u0005\u00a8"
                    + "\u0000\u0000\u0741\u0742\u0005\u00a6\u0000\u0000\u0742\u0743\u0005\u0014"
                    + "\u0000\u0000\u0743\u0745\u0005\u00f0\u0000\u0000\u0744\u073f\u0001\u0000"
                    + "\u0000\u0000\u0744\u0745\u0001\u0000\u0000\u0000\u0745\u074b\u0001\u0000"
                    + "\u0000\u0000\u0746\u0747\u0005p\u0000\u0000\u0747\u0748\u0005\u00a9\u0000"
                    + "\u0000\u0748\u0749\u0005\u00a6\u0000\u0000\u0749\u074a\u0005\u0014\u0000"
                    + "\u0000\u074a\u074c\u0005\u00f0\u0000\u0000\u074b\u0746\u0001\u0000\u0000"
                    + "\u0000\u074b\u074c\u0001\u0000\u0000\u0000\u074c\u0751\u0001\u0000\u0000"
                    + "\u0000\u074d\u074e\u0005\u00ab\u0000\u0000\u074e\u074f\u0005\u00a6\u0000"
                    + "\u0000\u074f\u0750\u0005\u0014\u0000\u0000\u0750\u0752\u0005\u00f0\u0000"
                    + "\u0000\u0751\u074d\u0001\u0000\u0000\u0000\u0751\u0752\u0001\u0000\u0000"
                    + "\u0000\u0752\u0757\u0001\u0000\u0000\u0000\u0753\u0754\u0005\'\u0000\u0000"
                    + "\u0754\u0755\u0005\u00d9\u0000\u0000\u0755\u0756\u0005\u000e\u0000\u0000"
                    + "\u0756\u0758\u0005\u00f0\u0000\u0000\u0757\u0753\u0001\u0000\u0000\u0000"
                    + "\u0757\u0758\u0001\u0000\u0000\u0000\u0758\u075a\u0001\u0000\u0000\u0000"
                    + "\u0759\u0728\u0001\u0000\u0000\u0000\u0759\u0731\u0001\u0000\u0000\u0000"
                    + "\u075a\u0083\u0001\u0000\u0000\u0000\u075b\u075c\u0003\u00c0`\u0000\u075c"
                    + "\u075d\u0005\u0004\u0000\u0000\u075d\u075f\u0001\u0000\u0000\u0000\u075e"
                    + "\u075b\u0001\u0000\u0000\u0000\u075e\u075f\u0001\u0000\u0000\u0000\u075f"
                    + "\u0760\u0001\u0000\u0000\u0000\u0760\u0761\u0003\u00c0`\u0000\u0761\u0085"
                    + "\u0001\u0000\u0000\u0000\u0762\u0763\u0003\u00c0`\u0000\u0763\u0764\u0005"
                    + "\u0004\u0000\u0000\u0764\u0766\u0001\u0000\u0000\u0000\u0765\u0762\u0001"
                    + "\u0000\u0000\u0000\u0765\u0766\u0001\u0000\u0000\u0000\u0766\u0767\u0001"
                    + "\u0000\u0000\u0000\u0767\u0768\u0003\u00c0`\u0000\u0768\u0087\u0001\u0000"
                    + "\u0000\u0000\u0769\u0771\u0003\u008cF\u0000\u076a\u076c\u0005\u000e\u0000"
                    + "\u0000\u076b\u076a\u0001\u0000\u0000\u0000\u076b\u076c\u0001\u0000\u0000"
                    + "\u0000\u076c\u076f\u0001\u0000\u0000\u0000\u076d\u0770\u0003\u00c0`\u0000"
                    + "\u076e\u0770\u0003n7\u0000\u076f\u076d\u0001\u0000\u0000\u0000\u076f\u076e"
                    + "\u0001\u0000\u0000\u0000\u0770\u0772\u0001\u0000\u0000\u0000\u0771\u076b"
                    + "\u0001\u0000\u0000\u0000\u0771\u0772\u0001\u0000\u0000\u0000\u0772\u0089"
                    + "\u0001\u0000\u0000\u0000\u0773\u0778\u0003\u0088D\u0000\u0774\u0775\u0005"
                    + "\u0003\u0000\u0000\u0775\u0777\u0003\u0088D\u0000\u0776\u0774\u0001\u0000"
                    + "\u0000\u0000\u0777\u077a\u0001\u0000\u0000\u0000\u0778\u0776\u0001\u0000"
                    + "\u0000\u0000\u0778\u0779\u0001\u0000\u0000\u0000\u0779\u008b\u0001\u0000"
                    + "\u0000\u0000\u077a\u0778\u0001\u0000\u0000\u0000\u077b\u077c\u0003\u008e"
                    + "G\u0000\u077c\u008d\u0001\u0000\u0000\u0000\u077d\u077e\u0006G\uffff\uffff"
                    + "\u0000\u077e\u077f\u0005 \u0000\u0000\u077f\u078a\u0003\u008eG\u0005\u0780"
                    + "\u0781\u0005\"\u0000\u0000\u0781\u0782\u0005\u0001\u0000\u0000\u0782\u0783"
                    + "\u0003\u0018\f\u0000\u0783\u0784\u0005\u0002\u0000\u0000\u0784\u078a\u0001"
                    + "\u0000\u0000\u0000\u0785\u0787\u0003\u0092I\u0000\u0786\u0788\u0003\u0090"
                    + "H\u0000\u0787\u0786\u0001\u0000\u0000\u0000\u0787\u0788\u0001\u0000\u0000"
                    + "\u0000\u0788\u078a\u0001\u0000\u0000\u0000\u0789\u077d\u0001\u0000\u0000"
                    + "\u0000\u0789\u0780\u0001\u0000\u0000\u0000\u0789\u0785\u0001\u0000\u0000"
                    + "\u0000\u078a\u0793\u0001\u0000\u0000\u0000\u078b\u078c\n\u0002\u0000\u0000"
                    + "\u078c\u078d\u0005\u001e\u0000\u0000\u078d\u0792\u0003\u008eG\u0003\u078e"
                    + "\u078f\n\u0001\u0000\u0000\u078f\u0790\u0005\u001d\u0000\u0000\u0790\u0792"
                    + "\u0003\u008eG\u0002\u0791\u078b\u0001\u0000\u0000\u0000\u0791\u078e\u0001"
                    + "\u0000\u0000\u0000\u0792\u0795\u0001\u0000\u0000\u0000\u0793\u0791\u0001"
                    + "\u0000\u0000\u0000\u0793\u0794\u0001\u0000\u0000\u0000\u0794\u008f\u0001"
                    + "\u0000\u0000\u0000\u0795\u0793\u0001\u0000\u0000\u0000\u0796\u0798\u0005"
                    + " \u0000\u0000\u0797\u0796\u0001\u0000\u0000\u0000\u0797\u0798\u0001\u0000"
                    + "\u0000\u0000\u0798\u0799\u0001\u0000\u0000\u0000\u0799\u079a\u0005#\u0000"
                    + "\u0000\u079a\u079b\u0003\u0092I\u0000\u079b\u079c\u0005\u001e\u0000\u0000"
                    + "\u079c\u079d\u0003\u0092I\u0000\u079d\u07c7\u0001\u0000\u0000\u0000\u079e"
                    + "\u07a0\u0005 \u0000\u0000\u079f\u079e\u0001\u0000\u0000\u0000\u079f\u07a0"
                    + "\u0001\u0000\u0000\u0000\u07a0\u07a1\u0001\u0000\u0000\u0000\u07a1\u07a2"
                    + "\u0005\u001f\u0000\u0000\u07a2\u07a3\u0005\u0001\u0000\u0000\u07a3\u07a8"
                    + "\u0003\u008cF\u0000\u07a4\u07a5\u0005\u0003\u0000\u0000\u07a5\u07a7\u0003"
                    + "\u008cF\u0000\u07a6\u07a4\u0001\u0000\u0000\u0000\u07a7\u07aa\u0001\u0000"
                    + "\u0000\u0000\u07a8\u07a6\u0001\u0000\u0000\u0000\u07a8\u07a9\u0001\u0000"
                    + "\u0000\u0000\u07a9\u07ab\u0001\u0000\u0000\u0000\u07aa\u07a8\u0001\u0000"
                    + "\u0000\u0000\u07ab\u07ac\u0005\u0002\u0000\u0000\u07ac\u07c7\u0001\u0000"
                    + "\u0000\u0000\u07ad\u07af\u0005 \u0000\u0000\u07ae\u07ad\u0001\u0000\u0000"
                    + "\u0000\u07ae\u07af\u0001\u0000\u0000\u0000\u07af\u07b0\u0001\u0000\u0000"
                    + "\u0000\u07b0\u07b1\u0005\u001f\u0000\u0000\u07b1\u07b2\u0005\u0001\u0000"
                    + "\u0000\u07b2\u07b3\u0003\u0018\f\u0000\u07b3\u07b4\u0005\u0002\u0000\u0000"
                    + "\u07b4\u07c7\u0001\u0000\u0000\u0000\u07b5\u07b7\u0005 \u0000\u0000\u07b6"
                    + "\u07b5\u0001\u0000\u0000\u0000\u07b6\u07b7\u0001\u0000\u0000\u0000\u07b7"
                    + "\u07b8\u0001\u0000\u0000\u0000\u07b8\u07b9\u0007\r\u0000\u0000\u07b9\u07c7"
                    + "\u0003\u0092I\u0000\u07ba\u07bc\u0005&\u0000\u0000\u07bb\u07bd\u0005 "
                    + "\u0000\u0000\u07bc\u07bb\u0001\u0000\u0000\u0000\u07bc\u07bd\u0001\u0000"
                    + "\u0000\u0000\u07bd\u07be\u0001\u0000\u0000\u0000\u07be\u07c7\u0005\'\u0000"
                    + "\u0000\u07bf\u07c1\u0005&\u0000\u0000\u07c0\u07c2\u0005 \u0000\u0000\u07c1"
                    + "\u07c0\u0001\u0000\u0000\u0000\u07c1\u07c2\u0001\u0000\u0000\u0000\u07c2"
                    + "\u07c3\u0001\u0000\u0000\u0000\u07c3\u07c4\u0005\u0011\u0000\u0000\u07c4"
                    + "\u07c5\u0005\f\u0000\u0000\u07c5\u07c7\u0003\u0092I\u0000\u07c6\u0797"
                    + "\u0001\u0000\u0000\u0000\u07c6\u079f\u0001\u0000\u0000\u0000\u07c6\u07ae"
                    + "\u0001\u0000\u0000\u0000\u07c6\u07b6\u0001\u0000\u0000\u0000\u07c6\u07ba"
                    + "\u0001\u0000\u0000\u0000\u07c6\u07bf\u0001\u0000\u0000\u0000\u07c7\u0091"
                    + "\u0001\u0000\u0000\u0000\u07c8\u07c9\u0006I\uffff\uffff\u0000\u07c9\u07cd"
                    + "\u0003\u0094J\u0000\u07ca\u07cb\u0007\u000e\u0000\u0000\u07cb\u07cd\u0003"
                    + "\u0092I\u0007\u07cc\u07c8\u0001\u0000\u0000\u0000\u07cc\u07ca\u0001\u0000"
                    + "\u0000\u0000\u07cd\u07e3\u0001\u0000\u0000\u0000\u07ce\u07cf\n\u0006\u0000"
                    + "\u0000\u07cf\u07d0\u0007\u000f\u0000\u0000\u07d0\u07e2\u0003\u0092I\u0007"
                    + "\u07d1\u07d2\n\u0005\u0000\u0000\u07d2\u07d3\u0007\u0010\u0000\u0000\u07d3"
                    + "\u07e2\u0003\u0092I\u0006\u07d4\u07d5\n\u0004\u0000\u0000\u07d5\u07d6"
                    + "\u0005\u0091\u0000\u0000\u07d6\u07e2\u0003\u0092I\u0005\u07d7\u07d8\n"
                    + "\u0003\u0000\u0000\u07d8\u07d9\u0005\u0094\u0000\u0000\u07d9\u07e2\u0003"
                    + "\u0092I\u0004\u07da\u07db\n\u0002\u0000\u0000\u07db\u07dc\u0005\u0092"
                    + "\u0000\u0000\u07dc\u07e2\u0003\u0092I\u0003\u07dd\u07de\n\u0001\u0000"
                    + "\u0000\u07de\u07df\u0003\u0098L\u0000\u07df\u07e0\u0003\u0092I\u0002\u07e0"
                    + "\u07e2\u0001\u0000\u0000\u0000\u07e1\u07ce\u0001\u0000\u0000\u0000\u07e1"
                    + "\u07d1\u0001\u0000\u0000\u0000\u07e1\u07d4\u0001\u0000\u0000\u0000\u07e1"
                    + "\u07d7\u0001\u0000\u0000\u0000\u07e1\u07da\u0001\u0000\u0000\u0000\u07e1"
                    + "\u07dd\u0001\u0000\u0000\u0000\u07e2\u07e5\u0001\u0000\u0000\u0000\u07e3"
                    + "\u07e1\u0001\u0000\u0000\u0000\u07e3\u07e4\u0001\u0000\u0000\u0000\u07e4"
                    + "\u0093\u0001\u0000\u0000\u0000\u07e5\u07e3\u0001\u0000\u0000\u0000\u07e6"
                    + "\u07e7\u0006J\uffff\uffff\u0000\u07e7\u07e9\u0005/\u0000\u0000\u07e8\u07ea"
                    + "\u0003\u00b2Y\u0000\u07e9\u07e8\u0001\u0000\u0000\u0000\u07ea\u07eb\u0001"
                    + "\u0000\u0000\u0000\u07eb\u07e9\u0001\u0000\u0000\u0000\u07eb\u07ec\u0001"
                    + "\u0000\u0000\u0000\u07ec\u07ef\u0001\u0000\u0000\u0000\u07ed\u07ee\u0005"
                    + "2\u0000\u0000\u07ee\u07f0\u0003\u008cF\u0000\u07ef\u07ed\u0001\u0000\u0000"
                    + "\u0000\u07ef\u07f0\u0001\u0000\u0000\u0000\u07f0\u07f1\u0001\u0000\u0000"
                    + "\u0000\u07f1\u07f2\u00053\u0000\u0000\u07f2\u0878\u0001\u0000\u0000\u0000"
                    + "\u07f3\u07f4\u0005/\u0000\u0000\u07f4\u07f6\u0003\u008cF\u0000\u07f5\u07f7"
                    + "\u0003\u00b2Y\u0000\u07f6\u07f5\u0001\u0000\u0000\u0000\u07f7\u07f8\u0001"
                    + "\u0000\u0000\u0000\u07f8\u07f6\u0001\u0000\u0000\u0000\u07f8\u07f9\u0001"
                    + "\u0000\u0000\u0000\u07f9\u07fc\u0001\u0000\u0000\u0000\u07fa\u07fb\u0005"
                    + "2\u0000\u0000\u07fb\u07fd\u0003\u008cF\u0000\u07fc\u07fa\u0001\u0000\u0000"
                    + "\u0000\u07fc\u07fd\u0001\u0000\u0000\u0000\u07fd\u07fe\u0001\u0000\u0000"
                    + "\u0000\u07fe\u07ff\u00053\u0000\u0000\u07ff\u0878\u0001\u0000\u0000\u0000"
                    + "\u0800\u0801\u0005]\u0000\u0000\u0801\u0802\u0005\u0001\u0000\u0000\u0802"
                    + "\u0803\u0003\u008cF\u0000\u0803\u0804\u0005\u000e\u0000\u0000\u0804\u0805"
                    + "\u0003\u00a8T\u0000\u0805\u0806\u0005\u0002\u0000\u0000\u0806\u0878\u0001"
                    + "\u0000\u0000\u0000\u0807\u0808\u0005q\u0000\u0000\u0808\u0811\u0005\u0001"
                    + "\u0000\u0000\u0809\u080e\u0003\u0088D\u0000\u080a\u080b\u0005\u0003\u0000"
                    + "\u0000\u080b\u080d\u0003\u0088D\u0000\u080c\u080a\u0001\u0000\u0000\u0000"
                    + "\u080d\u0810\u0001\u0000\u0000\u0000\u080e\u080c\u0001\u0000\u0000\u0000"
                    + "\u080e\u080f\u0001\u0000\u0000\u0000\u080f\u0812\u0001\u0000\u0000\u0000"
                    + "\u0810\u080e\u0001\u0000\u0000\u0000\u0811\u0809\u0001\u0000\u0000\u0000"
                    + "\u0811\u0812\u0001\u0000\u0000\u0000\u0812\u0813\u0001\u0000\u0000\u0000"
                    + "\u0813\u0878\u0005\u0002\u0000\u0000\u0814\u0815\u0005I\u0000\u0000\u0815"
                    + "\u0816\u0005\u0001\u0000\u0000\u0816\u0819\u0003\u008cF\u0000\u0817\u0818"
                    + "\u0005{\u0000\u0000\u0818\u081a\u0005*\u0000\u0000\u0819\u0817\u0001\u0000"
                    + "\u0000\u0000\u0819\u081a\u0001\u0000\u0000\u0000\u081a\u081b\u0001\u0000"
                    + "\u0000\u0000\u081b\u081c\u0005\u0002\u0000\u0000\u081c\u0878\u0001\u0000"
                    + "\u0000\u0000\u081d\u081e\u0005K\u0000\u0000\u081e\u081f\u0005\u0001\u0000"
                    + "\u0000\u081f\u0822\u0003\u008cF\u0000\u0820\u0821\u0005{\u0000\u0000\u0821"
                    + "\u0823\u0005*\u0000\u0000\u0822\u0820\u0001\u0000\u0000\u0000\u0822\u0823"
                    + "\u0001\u0000\u0000\u0000\u0823\u0824\u0001\u0000\u0000\u0000\u0824\u0825"
                    + "\u0005\u0002\u0000\u0000\u0825\u0878\u0001\u0000\u0000\u0000\u0826\u0827"
                    + "\u0005\u0080\u0000\u0000\u0827\u0828\u0005\u0001\u0000\u0000\u0828\u0829"
                    + "\u0003\u0092I\u0000\u0829\u082a\u0005\u001f\u0000\u0000\u082a\u082b\u0003"
                    + "\u0092I\u0000\u082b\u082c\u0005\u0002\u0000\u0000\u082c\u0878\u0001\u0000"
                    + "\u0000\u0000\u082d\u0878\u0003\u0096K\u0000\u082e\u0878\u0005\u008c\u0000"
                    + "\u0000\u082f\u0830\u0003\u00be_\u0000\u0830\u0831\u0005\u0004\u0000\u0000"
                    + "\u0831\u0832\u0005\u008c\u0000\u0000\u0832\u0878\u0001\u0000\u0000\u0000"
                    + "\u0833\u0834\u0005\u0001\u0000\u0000\u0834\u0837\u0003\u0088D\u0000\u0835"
                    + "\u0836\u0005\u0003\u0000\u0000\u0836\u0838\u0003\u0088D\u0000\u0837\u0835"
                    + "\u0001\u0000\u0000\u0000\u0838\u0839\u0001\u0000\u0000\u0000\u0839\u0837"
                    + "\u0001\u0000\u0000\u0000\u0839\u083a\u0001\u0000\u0000\u0000\u083a\u083b"
                    + "\u0001\u0000\u0000\u0000\u083b\u083c\u0005\u0002\u0000\u0000\u083c\u0878"
                    + "\u0001\u0000\u0000\u0000\u083d\u083e\u0005\u0001\u0000\u0000\u083e\u083f"
                    + "\u0003\u0018\f\u0000\u083f\u0840\u0005\u0002\u0000\u0000\u0840\u0878\u0001"
                    + "\u0000\u0000\u0000\u0841\u0842\u0003\u00be_\u0000\u0842\u084e\u0005\u0001"
                    + "\u0000\u0000\u0843\u0845\u0003`0\u0000\u0844\u0843\u0001\u0000\u0000\u0000"
                    + "\u0844\u0845\u0001\u0000\u0000\u0000\u0845\u0846\u0001\u0000\u0000\u0000"
                    + "\u0846\u084b\u0003\u008cF\u0000\u0847\u0848\u0005\u0003\u0000\u0000\u0848"
                    + "\u084a\u0003\u008cF\u0000\u0849\u0847\u0001\u0000\u0000\u0000\u084a\u084d"
                    + "\u0001\u0000\u0000\u0000\u084b\u0849\u0001\u0000\u0000\u0000\u084b\u084c"
                    + "\u0001\u0000\u0000\u0000\u084c\u084f\u0001\u0000\u0000\u0000\u084d\u084b"
                    + "\u0001\u0000\u0000\u0000\u084e\u0844\u0001\u0000\u0000\u0000\u084e\u084f"
                    + "\u0001\u0000\u0000\u0000\u084f\u0850\u0001\u0000\u0000\u0000\u0850\u0853"
                    + "\u0005\u0002\u0000\u0000\u0851\u0852\u0005A\u0000\u0000\u0852\u0854\u0003"
                    + "\u00b8\\\u0000\u0853\u0851\u0001\u0000\u0000\u0000\u0853\u0854\u0001\u0000"
                    + "\u0000\u0000\u0854\u0878\u0001\u0000\u0000\u0000\u0855\u0856\u0003\u00be"
                    + "_\u0000\u0856\u0857\u0005\u0001\u0000\u0000\u0857\u0858\u0007\u0011\u0000"
                    + "\u0000\u0858\u0859\u0003\u008cF\u0000\u0859\u085a\u0005\f\u0000\u0000"
                    + "\u085a\u085b\u0003\u008cF\u0000\u085b\u085c\u0005\u0002\u0000\u0000\u085c"
                    + "\u0878\u0001\u0000\u0000\u0000\u085d\u085e\u0005\u00f8\u0000\u0000\u085e"
                    + "\u085f\u0005\u0007\u0000\u0000\u085f\u0878\u0003\u008cF\u0000\u0860\u0861"
                    + "\u0005\u0001\u0000\u0000\u0861\u0864\u0005\u00f8\u0000\u0000\u0862\u0863"
                    + "\u0005\u0003\u0000\u0000\u0863\u0865\u0005\u00f8\u0000\u0000\u0864\u0862"
                    + "\u0001\u0000\u0000\u0000\u0865\u0866\u0001\u0000\u0000\u0000\u0866\u0864"
                    + "\u0001\u0000\u0000\u0000\u0866\u0867\u0001\u0000\u0000\u0000\u0867\u0868"
                    + "\u0001\u0000\u0000\u0000\u0868\u0869\u0005\u0002\u0000\u0000\u0869\u086a"
                    + "\u0005\u0007\u0000\u0000\u086a\u0878\u0003\u008cF\u0000\u086b\u0878\u0003"
                    + "\u00c0`\u0000\u086c\u086d\u0005\u0001\u0000\u0000\u086d\u086e\u0003\u008c"
                    + "F\u0000\u086e\u086f\u0005\u0002\u0000\u0000\u086f\u0878\u0001\u0000\u0000"
                    + "\u0000\u0870\u0871\u0005\u0081\u0000\u0000\u0871\u0872\u0005\u0001\u0000"
                    + "\u0000\u0872\u0873\u0003\u00c0`\u0000\u0873\u0874\u0005\f\u0000\u0000"
                    + "\u0874\u0875\u0003\u0092I\u0000\u0875\u0876\u0005\u0002\u0000\u0000\u0876"
                    + "\u0878\u0001\u0000\u0000\u0000\u0877\u07e6\u0001\u0000\u0000\u0000\u0877"
                    + "\u07f3\u0001\u0000\u0000\u0000\u0877\u0800\u0001\u0000\u0000\u0000\u0877"
                    + "\u0807\u0001\u0000\u0000\u0000\u0877\u0814\u0001\u0000\u0000\u0000\u0877"
                    + "\u081d\u0001\u0000\u0000\u0000\u0877\u0826\u0001\u0000\u0000\u0000\u0877"
                    + "\u082d\u0001\u0000\u0000\u0000\u0877\u082e\u0001\u0000\u0000\u0000\u0877"
                    + "\u082f\u0001\u0000\u0000\u0000\u0877\u0833\u0001\u0000\u0000\u0000\u0877"
                    + "\u083d\u0001\u0000\u0000\u0000\u0877\u0841\u0001\u0000\u0000\u0000\u0877"
                    + "\u0855\u0001\u0000\u0000\u0000\u0877\u085d\u0001\u0000\u0000\u0000\u0877"
                    + "\u0860\u0001\u0000\u0000\u0000\u0877\u086b\u0001\u0000\u0000\u0000\u0877"
                    + "\u086c\u0001\u0000\u0000\u0000\u0877\u0870\u0001\u0000\u0000\u0000\u0878"
                    + "\u0883\u0001\u0000\u0000\u0000\u0879\u087a\n\u0005\u0000\u0000\u087a\u087b"
                    + "\u0005\b\u0000\u0000\u087b\u087c\u0003\u0092I\u0000\u087c\u087d\u0005"
                    + "\t\u0000\u0000\u087d\u0882\u0001\u0000\u0000\u0000\u087e\u087f\n\u0003"
                    + "\u0000\u0000\u087f\u0880\u0005\u0004\u0000\u0000\u0880\u0882\u0003\u00c0"
                    + "`\u0000\u0881\u0879\u0001\u0000\u0000\u0000\u0881\u087e\u0001\u0000\u0000"
                    + "\u0000\u0882\u0885\u0001\u0000\u0000\u0000\u0883\u0881\u0001\u0000\u0000"
                    + "\u0000\u0883\u0884\u0001\u0000\u0000\u0000\u0884\u0095\u0001\u0000\u0000"
                    + "\u0000\u0885\u0883\u0001\u0000\u0000\u0000\u0886\u0893\u0005\'\u0000\u0000"
                    + "\u0887\u0893\u0003\u00a0P\u0000\u0888\u0889\u0003\u00c0`\u0000\u0889\u088a"
                    + "\u0005\u00f0\u0000\u0000\u088a\u0893\u0001\u0000\u0000\u0000\u088b\u0893"
                    + "\u0003\u00c6c\u0000\u088c\u0893\u0003\u009eO\u0000\u088d\u088f\u0005\u00f0"
                    + "\u0000\u0000\u088e\u088d\u0001\u0000\u0000\u0000\u088f\u0890\u0001\u0000"
                    + "\u0000\u0000\u0890\u088e\u0001\u0000\u0000\u0000\u0890\u0891\u0001\u0000"
                    + "\u0000\u0000\u0891\u0893\u0001\u0000\u0000\u0000\u0892\u0886\u0001\u0000"
                    + "\u0000\u0000\u0892\u0887\u0001\u0000\u0000\u0000\u0892\u0888\u0001\u0000"
                    + "\u0000\u0000\u0892\u088b\u0001\u0000\u0000\u0000\u0892\u088c\u0001\u0000"
                    + "\u0000\u0000\u0892\u088e\u0001\u0000\u0000\u0000\u0893\u0097\u0001\u0000"
                    + "\u0000\u0000\u0894\u0895\u0007\u0012\u0000\u0000\u0895\u0099\u0001\u0000"
                    + "\u0000\u0000\u0896\u0897\u0007\u0013\u0000\u0000\u0897\u009b\u0001\u0000"
                    + "\u0000\u0000\u0898\u0899\u0007\u0014\u0000\u0000\u0899\u009d\u0001\u0000"
                    + "\u0000\u0000\u089a\u089b\u0007\u0015\u0000\u0000\u089b\u009f\u0001\u0000"
                    + "\u0000\u0000\u089c\u08a0\u0005.\u0000\u0000\u089d\u089f\u0003\u00a2Q\u0000"
                    + "\u089e\u089d\u0001\u0000\u0000\u0000\u089f\u08a2\u0001\u0000\u0000\u0000"
                    + "\u08a0\u089e\u0001\u0000\u0000\u0000\u08a0\u08a1\u0001\u0000\u0000\u0000"
                    + "\u08a1\u00a1\u0001\u0000\u0000\u0000\u08a2\u08a0\u0001\u0000\u0000\u0000"
                    + "\u08a3\u08a4\u0003\u00a4R\u0000\u08a4\u08a7\u0003\u00c0`\u0000\u08a5\u08a6"
                    + "\u0005j\u0000\u0000\u08a6\u08a8\u0003\u00c0`\u0000\u08a7\u08a5\u0001\u0000"
                    + "\u0000\u0000\u08a7\u08a8\u0001\u0000\u0000\u0000\u08a8\u00a3\u0001\u0000"
                    + "\u0000\u0000\u08a9\u08ab\u0007\u0016\u0000\u0000\u08aa\u08a9\u0001\u0000"
                    + "\u0000\u0000\u08aa\u08ab\u0001\u0000\u0000\u0000\u08ab\u08ac\u0001\u0000"
                    + "\u0000\u0000\u08ac\u08af\u0007\f\u0000\u0000\u08ad\u08af\u0005\u00f0\u0000"
                    + "\u0000\u08ae\u08aa\u0001\u0000\u0000\u0000\u08ae\u08ad\u0001\u0000\u0000"
                    + "\u0000\u08af\u00a5\u0001\u0000\u0000\u0000\u08b0\u08b4\u0005I\u0000\u0000"
                    + "\u08b1\u08b2\u0005J\u0000\u0000\u08b2\u08b4\u0003\u00c0`\u0000\u08b3\u08b0"
                    + "\u0001\u0000\u0000\u0000\u08b3\u08b1\u0001\u0000\u0000\u0000\u08b4\u00a7"
                    + "\u0001\u0000\u0000\u0000\u08b5\u08b6\u0005o\u0000\u0000\u08b6\u08b7\u0005"
                    + "\u0086\u0000\u0000\u08b7\u08b8\u0003\u00a8T\u0000\u08b8\u08b9\u0005\u0088"
                    + "\u0000\u0000\u08b9\u08d8\u0001\u0000\u0000\u0000\u08ba\u08bb\u0005p\u0000"
                    + "\u0000\u08bb\u08bc\u0005\u0086\u0000\u0000\u08bc\u08bd\u0003\u00a8T\u0000"
                    + "\u08bd\u08be\u0005\u0003\u0000\u0000\u08be\u08bf\u0003\u00a8T\u0000\u08bf"
                    + "\u08c0\u0005\u0088\u0000\u0000\u08c0\u08d8\u0001\u0000\u0000\u0000\u08c1"
                    + "\u08c8\u0005q\u0000\u0000\u08c2\u08c4\u0005\u0086\u0000\u0000\u08c3\u08c5"
                    + "\u0003\u00aeW\u0000\u08c4\u08c3\u0001\u0000\u0000\u0000\u08c4\u08c5\u0001"
                    + "\u0000\u0000\u0000\u08c5\u08c6\u0001\u0000\u0000\u0000\u08c6\u08c9\u0005"
                    + "\u0088\u0000\u0000\u08c7\u08c9\u0005\u0084\u0000\u0000\u08c8\u08c2\u0001"
                    + "\u0000\u0000\u0000\u08c8\u08c7\u0001\u0000\u0000\u0000\u08c9\u08d8\u0001"
                    + "\u0000\u0000\u0000\u08ca\u08d5\u0003\u00c0`\u0000\u08cb\u08cc\u0005\u0001"
                    + "\u0000\u0000\u08cc\u08d1\u0005\u00f4\u0000\u0000\u08cd\u08ce\u0005\u0003"
                    + "\u0000\u0000\u08ce\u08d0\u0005\u00f4\u0000\u0000\u08cf\u08cd\u0001\u0000"
                    + "\u0000\u0000\u08d0\u08d3\u0001\u0000\u0000\u0000\u08d1\u08cf\u0001\u0000"
                    + "\u0000\u0000\u08d1\u08d2\u0001\u0000\u0000\u0000\u08d2\u08d4\u0001\u0000"
                    + "\u0000\u0000\u08d3\u08d1\u0001\u0000\u0000\u0000\u08d4\u08d6\u0005\u0002"
                    + "\u0000\u0000\u08d5\u08cb\u0001\u0000\u0000\u0000\u08d5\u08d6\u0001\u0000"
                    + "\u0000\u0000\u08d6\u08d8\u0001\u0000\u0000\u0000\u08d7\u08b5\u0001\u0000"
                    + "\u0000\u0000\u08d7\u08ba\u0001\u0000\u0000\u0000\u08d7\u08c1\u0001\u0000"
                    + "\u0000\u0000\u08d7\u08ca\u0001\u0000\u0000\u0000\u08d8\u00a9\u0001\u0000"
                    + "\u0000\u0000\u08d9\u08de\u0003\u00acV\u0000\u08da\u08db\u0005\u0003\u0000"
                    + "\u0000\u08db\u08dd\u0003\u00acV\u0000\u08dc\u08da\u0001\u0000\u0000\u0000"
                    + "\u08dd\u08e0\u0001\u0000\u0000\u0000\u08de\u08dc\u0001\u0000\u0000\u0000"
                    + "\u08de\u08df\u0001\u0000\u0000\u0000\u08df\u00ab\u0001\u0000\u0000\u0000"
                    + "\u08e0\u08de\u0001\u0000\u0000\u0000\u08e1\u08e2\u0003\u00c0`\u0000\u08e2"
                    + "\u08e5\u0003\u00a8T\u0000\u08e3\u08e4\u0005r\u0000\u0000\u08e4\u08e6\u0005"
                    + "\u00f0\u0000\u0000\u08e5\u08e3\u0001\u0000\u0000\u0000\u08e5\u08e6\u0001"
                    + "\u0000\u0000\u0000\u08e6\u00ad\u0001\u0000\u0000\u0000\u08e7\u08ec\u0003"
                    + "\u00b0X\u0000\u08e8\u08e9\u0005\u0003\u0000\u0000\u08e9\u08eb\u0003\u00b0"
                    + "X\u0000\u08ea\u08e8\u0001\u0000\u0000\u0000\u08eb\u08ee\u0001\u0000\u0000"
                    + "\u0000\u08ec\u08ea\u0001\u0000\u0000\u0000\u08ec\u08ed\u0001\u0000\u0000"
                    + "\u0000\u08ed\u00af\u0001\u0000\u0000\u0000\u08ee\u08ec\u0001\u0000\u0000"
                    + "\u0000\u08ef\u08f0\u0003\u00c0`\u0000\u08f0\u08f1\u0005\n\u0000\u0000"
                    + "\u08f1\u08f4\u0003\u00a8T\u0000\u08f2\u08f3\u0005r\u0000\u0000\u08f3\u08f5"
                    + "\u0005\u00f0\u0000\u0000\u08f4\u08f2\u0001\u0000\u0000\u0000\u08f4\u08f5"
                    + "\u0001\u0000\u0000\u0000\u08f5\u00b1\u0001\u0000\u0000\u0000\u08f6\u08f7"
                    + "\u00050\u0000\u0000\u08f7\u08f8\u0003\u008cF\u0000\u08f8\u08f9\u00051"
                    + "\u0000\u0000\u08f9\u08fa\u0003\u008cF\u0000\u08fa\u00b3\u0001\u0000\u0000"
                    + "\u0000\u08fb\u08fc\u0005@\u0000\u0000\u08fc\u0901\u0003\u00b6[\u0000\u08fd"
                    + "\u08fe\u0005\u0003\u0000\u0000\u08fe\u0900\u0003\u00b6[\u0000\u08ff\u08fd"
                    + "\u0001\u0000\u0000\u0000\u0900\u0903\u0001\u0000\u0000\u0000\u0901\u08ff"
                    + "\u0001\u0000\u0000\u0000\u0901\u0902\u0001\u0000\u0000\u0000\u0902\u00b5"
                    + "\u0001\u0000\u0000\u0000\u0903\u0901\u0001\u0000\u0000\u0000\u0904\u0905"
                    + "\u0003\u00c0`\u0000\u0905\u0906\u0005\u000e\u0000\u0000\u0906\u0907\u0003"
                    + "\u00b8\\\u0000\u0907\u00b7\u0001\u0000\u0000\u0000\u0908\u0937\u0003\u00c0"
                    + "`\u0000\u0909\u090a\u0005\u0001\u0000\u0000\u090a\u090b\u0003\u00c0`\u0000"
                    + "\u090b\u090c\u0005\u0002\u0000\u0000\u090c\u0937\u0001\u0000\u0000\u0000"
                    + "\u090d\u0930\u0005\u0001\u0000\u0000\u090e\u090f\u0005\u009a\u0000\u0000"
                    + "\u090f\u0910\u0005\u0014\u0000\u0000\u0910\u0915\u0003\u008cF\u0000\u0911"
                    + "\u0912\u0005\u0003\u0000\u0000\u0912\u0914\u0003\u008cF\u0000\u0913\u0911"
                    + "\u0001\u0000\u0000\u0000\u0914\u0917\u0001\u0000\u0000\u0000\u0915\u0913"
                    + "\u0001\u0000\u0000\u0000\u0915\u0916\u0001\u0000\u0000\u0000\u0916\u0931"
                    + "\u0001\u0000\u0000\u0000\u0917\u0915\u0001\u0000\u0000\u0000\u0918\u0919"
                    + "\u0007\u0017\u0000\u0000\u0919\u091a\u0005\u0014\u0000\u0000\u091a\u091f"
                    + "\u0003\u008cF\u0000\u091b\u091c\u0005\u0003\u0000\u0000\u091c\u091e\u0003"
                    + "\u008cF\u0000\u091d\u091b\u0001\u0000\u0000\u0000\u091e\u0921\u0001\u0000"
                    + "\u0000\u0000\u091f\u091d\u0001\u0000\u0000\u0000\u091f\u0920\u0001\u0000"
                    + "\u0000\u0000\u0920\u0923\u0001\u0000\u0000\u0000\u0921\u091f\u0001\u0000"
                    + "\u0000\u0000\u0922\u0918\u0001\u0000\u0000\u0000\u0922\u0923\u0001\u0000"
                    + "\u0000\u0000\u0923\u092e\u0001\u0000\u0000\u0000\u0924\u0925\u0007\u0018"
                    + "\u0000\u0000\u0925\u0926\u0005\u0014\u0000\u0000\u0926\u092b\u0003J%\u0000"
                    + "\u0927\u0928\u0005\u0003";
    private static final String _serializedATNSegment1 =
            "\u0000\u0000\u0928\u092a\u0003J%\u0000\u0929\u0927\u0001\u0000\u0000\u0000"
                    + "\u092a\u092d\u0001\u0000\u0000\u0000\u092b\u0929\u0001\u0000\u0000\u0000"
                    + "\u092b\u092c\u0001\u0000\u0000\u0000\u092c\u092f\u0001\u0000\u0000\u0000"
                    + "\u092d\u092b\u0001\u0000\u0000\u0000\u092e\u0924\u0001\u0000\u0000\u0000"
                    + "\u092e\u092f\u0001\u0000\u0000\u0000\u092f\u0931\u0001\u0000\u0000\u0000"
                    + "\u0930\u090e\u0001\u0000\u0000\u0000\u0930\u0922\u0001\u0000\u0000\u0000"
                    + "\u0931\u0933\u0001\u0000\u0000\u0000\u0932\u0934\u0003\u00ba]\u0000\u0933"
                    + "\u0932\u0001\u0000\u0000\u0000\u0933\u0934\u0001\u0000\u0000\u0000\u0934"
                    + "\u0935\u0001\u0000\u0000\u0000\u0935\u0937\u0005\u0002\u0000\u0000\u0936"
                    + "\u0908\u0001\u0000\u0000\u0000\u0936\u0909\u0001\u0000\u0000\u0000\u0936"
                    + "\u090d\u0001\u0000\u0000\u0000\u0937\u00b9\u0001\u0000\u0000\u0000\u0938"
                    + "\u0939\u0005C\u0000\u0000\u0939\u0949\u0003\u00bc^\u0000\u093a\u093b\u0005"
                    + "D\u0000\u0000\u093b\u0949\u0003\u00bc^\u0000\u093c\u093d\u0005C\u0000"
                    + "\u0000\u093d\u093e\u0005#\u0000\u0000\u093e\u093f\u0003\u00bc^\u0000\u093f"
                    + "\u0940\u0005\u001e\u0000\u0000\u0940\u0941\u0003\u00bc^\u0000\u0941\u0949"
                    + "\u0001\u0000\u0000\u0000\u0942\u0943\u0005D\u0000\u0000\u0943\u0944\u0005"
                    + "#\u0000\u0000\u0944\u0945\u0003\u00bc^\u0000\u0945\u0946\u0005\u001e\u0000"
                    + "\u0000\u0946\u0947\u0003\u00bc^\u0000\u0947\u0949\u0001\u0000\u0000\u0000"
                    + "\u0948\u0938\u0001\u0000\u0000\u0000\u0948\u093a\u0001\u0000\u0000\u0000"
                    + "\u0948\u093c\u0001\u0000\u0000\u0000\u0948\u0942\u0001\u0000\u0000\u0000"
                    + "\u0949\u00bb\u0001\u0000\u0000\u0000\u094a\u094b\u0005E\u0000\u0000\u094b"
                    + "\u0952\u0007\u0019\u0000\u0000\u094c\u094d\u0005H\u0000\u0000\u094d\u0952"
                    + "\u0005L\u0000\u0000\u094e\u094f\u0003\u008cF\u0000\u094f\u0950\u0007\u0019"
                    + "\u0000\u0000\u0950\u0952\u0001\u0000\u0000\u0000\u0951\u094a\u0001\u0000"
                    + "\u0000\u0000\u0951\u094c\u0001\u0000\u0000\u0000\u0951\u094e\u0001\u0000"
                    + "\u0000\u0000\u0952\u00bd\u0001\u0000\u0000\u0000\u0953\u0958\u0003\u00c0"
                    + "`\u0000\u0954\u0955\u0005\u0004\u0000\u0000\u0955\u0957\u0003\u00c0`\u0000"
                    + "\u0956\u0954\u0001\u0000\u0000\u0000\u0957\u095a\u0001\u0000\u0000\u0000"
                    + "\u0958\u0956\u0001\u0000\u0000\u0000\u0958\u0959\u0001\u0000\u0000\u0000"
                    + "\u0959\u00bf\u0001\u0000\u0000\u0000\u095a\u0958\u0001\u0000\u0000\u0000"
                    + "\u095b\u096b\u0003\u00c2a\u0000\u095c\u096b\u0005\u00ed\u0000\u0000\u095d"
                    + "\u096b\u0005;\u0000\u0000\u095e\u096b\u00057\u0000\u0000\u095f\u096b\u0005"
                    + "8\u0000\u0000\u0960\u096b\u00059\u0000\u0000\u0961\u096b\u0005:\u0000"
                    + "\u0000\u0962\u096b\u0005<\u0000\u0000\u0963\u096b\u00054\u0000\u0000\u0964"
                    + "\u096b\u00055\u0000\u0000\u0965\u096b\u0005=\u0000\u0000\u0966\u096b\u0005"
                    + "f\u0000\u0000\u0967\u096b\u0005i\u0000\u0000\u0968\u096b\u0005g\u0000"
                    + "\u0000\u0969\u096b\u0005h\u0000\u0000\u096a\u095b\u0001\u0000\u0000\u0000"
                    + "\u096a\u095c\u0001\u0000\u0000\u0000\u096a\u095d\u0001\u0000\u0000\u0000"
                    + "\u096a\u095e\u0001\u0000\u0000\u0000\u096a\u095f\u0001\u0000\u0000\u0000"
                    + "\u096a\u0960\u0001\u0000\u0000\u0000\u096a\u0961\u0001\u0000\u0000\u0000"
                    + "\u096a\u0962\u0001\u0000\u0000\u0000\u096a\u0963\u0001\u0000\u0000\u0000"
                    + "\u096a\u0964\u0001\u0000\u0000\u0000\u096a\u0965\u0001\u0000\u0000\u0000"
                    + "\u096a\u0966\u0001\u0000\u0000\u0000\u096a\u0967\u0001\u0000\u0000\u0000"
                    + "\u096a\u0968\u0001\u0000\u0000\u0000\u096a\u0969\u0001\u0000\u0000\u0000"
                    + "\u096b\u00c1\u0001\u0000\u0000\u0000\u096c\u0970\u0005\u00f8\u0000\u0000"
                    + "\u096d\u0970\u0003\u00c4b\u0000\u096e\u0970\u0003\u00c8d\u0000\u096f\u096c"
                    + "\u0001\u0000\u0000\u0000\u096f\u096d\u0001\u0000\u0000\u0000\u096f\u096e"
                    + "\u0001\u0000\u0000\u0000\u0970\u00c3\u0001\u0000\u0000\u0000\u0971\u0972"
                    + "\u0005\u00f9\u0000\u0000\u0972\u00c5\u0001\u0000\u0000\u0000\u0973\u0975"
                    + "\u0005\u008b\u0000\u0000\u0974\u0973\u0001\u0000\u0000\u0000\u0974\u0975"
                    + "\u0001\u0000\u0000\u0000\u0975\u0976\u0001\u0000\u0000\u0000\u0976\u0990"
                    + "\u0005\u00f5\u0000\u0000\u0977\u0979\u0005\u008b\u0000\u0000\u0978\u0977"
                    + "\u0001\u0000\u0000\u0000\u0978\u0979\u0001\u0000\u0000\u0000\u0979\u097a"
                    + "\u0001\u0000\u0000\u0000\u097a\u0990\u0005\u00f4\u0000\u0000\u097b\u097d"
                    + "\u0005\u008b\u0000\u0000\u097c\u097b\u0001\u0000\u0000\u0000\u097c\u097d"
                    + "\u0001\u0000\u0000\u0000\u097d\u097e\u0001\u0000\u0000\u0000\u097e\u0990"
                    + "\u0005\u00f1\u0000\u0000\u097f\u0981\u0005\u008b\u0000\u0000\u0980\u097f"
                    + "\u0001\u0000\u0000\u0000\u0980\u0981\u0001\u0000\u0000\u0000\u0981\u0982"
                    + "\u0001\u0000\u0000\u0000\u0982\u0990\u0005\u00f2\u0000\u0000\u0983\u0985"
                    + "\u0005\u008b\u0000\u0000\u0984\u0983\u0001\u0000\u0000\u0000\u0984\u0985"
                    + "\u0001\u0000\u0000\u0000\u0985\u0986\u0001\u0000\u0000\u0000\u0986\u0990"
                    + "\u0005\u00f3\u0000\u0000\u0987\u0989\u0005\u008b\u0000\u0000\u0988\u0987"
                    + "\u0001\u0000\u0000\u0000\u0988\u0989\u0001\u0000\u0000\u0000\u0989\u098a"
                    + "\u0001\u0000\u0000\u0000\u098a\u0990\u0005\u00f6\u0000\u0000\u098b\u098d"
                    + "\u0005\u008b\u0000\u0000\u098c\u098b\u0001\u0000\u0000\u0000\u098c\u098d"
                    + "\u0001\u0000\u0000\u0000\u098d\u098e\u0001\u0000\u0000\u0000\u098e\u0990"
                    + "\u0005\u00f7\u0000\u0000\u098f\u0974\u0001\u0000\u0000\u0000\u098f\u0978"
                    + "\u0001\u0000\u0000\u0000\u098f\u097c\u0001\u0000\u0000\u0000\u098f\u0980"
                    + "\u0001\u0000\u0000\u0000\u098f\u0984\u0001\u0000\u0000\u0000\u098f\u0988"
                    + "\u0001\u0000\u0000\u0000\u098f\u098c\u0001\u0000\u0000\u0000\u0990\u00c7"
                    + "\u0001\u0000\u0000\u0000\u0991\u0992\u0007\u001a\u0000\u0000\u0992\u00c9"
                    + "\u0001\u0000\u0000\u0000\u0146\u00e4\u00e9\u00ec\u00f1\u00fe\u0102\u0109"
                    + "\u0117\u0119\u011d\u0120\u0127\u0138\u013a\u013e\u0141\u0148\u014e\u0154"
                    + "\u015c\u017c\u0184\u0188\u018d\u0193\u019b\u01a1\u01ae\u01b3\u01bc\u01c1"
                    + "\u01d1\u01d8\u01dc\u01e4\u01eb\u01f2\u0201\u0205\u020b\u0211\u0214\u0217"
                    + "\u021d\u0221\u0225\u022a\u022e\u0236\u0239\u0242\u0247\u024d\u0254\u0257"
                    + "\u025d\u0268\u026b\u026f\u0274\u0279\u0280\u0283\u0286\u028d\u0292\u0297"
                    + "\u029a\u02a3\u02ab\u02b1\u02b5\u02b9\u02bd\u02bf\u02c8\u02ce\u02d3\u02d6"
                    + "\u02da\u02dd\u02e7\u02ea\u02ee\u02f3\u02f6\u02fc\u0304\u0309\u030f\u0315"
                    + "\u0320\u0328\u032f\u0337\u033a\u0342\u0346\u034d\u03c1\u03c9\u03d1\u03da"
                    + "\u03e6\u03ea\u03ed\u03f3\u03fd\u0409\u040e\u0414\u0420\u0422\u0427\u042b"
                    + "\u0430\u0435\u0438\u043d\u0441\u0446\u0448\u044c\u0455\u045d\u0464\u046b"
                    + "\u0474\u0479\u0488\u048f\u0492\u0499\u049d\u04a3\u04ab\u04b6\u04c1\u04c8"
                    + "\u04ce\u04d4\u04dd\u04df\u04e8\u04eb\u04f4\u04f7\u0500\u0503\u050c\u050f"
                    + "\u0512\u0517\u0519\u051c\u0528\u052f\u0536\u0539\u053b\u0546\u054a\u054e"
                    + "\u055a\u055d\u0561\u056b\u056f\u0571\u0574\u0578\u057b\u057f\u0585\u0589"
                    + "\u058d\u0592\u0595\u0597\u059c\u05a1\u05a4\u05a8\u05ab\u05ad\u05b2\u05b7"
                    + "\u05c4\u05c9\u05d1\u05d7\u05db\u05e4\u05f3\u05f8\u0604\u0609\u0611\u0614"
                    + "\u0618\u0626\u0633\u0638\u063c\u063f\u0644\u064d\u0650\u0655\u065c\u065f"
                    + "\u0667\u066e\u0675\u0678\u067d\u0683\u0687\u068a\u068d\u0698\u069d\u06a2"
                    + "\u06a7\u06b9\u06bb\u06be\u06c9\u06d2\u06d9\u06e1\u06e9\u06ed\u06f5\u06fd"
                    + "\u0703\u070b\u0717\u071a\u0720\u0724\u0726\u072f\u073b\u073d\u0744\u074b"
                    + "\u0751\u0757\u0759\u075e\u0765\u076b\u076f\u0771\u0778\u0787\u0789\u0791"
                    + "\u0793\u0797\u079f\u07a8\u07ae\u07b6\u07bc\u07c1\u07c6\u07cc\u07e1\u07e3"
                    + "\u07eb\u07ef\u07f8\u07fc\u080e\u0811\u0819\u0822\u0839\u0844\u084b\u084e"
                    + "\u0853\u0866\u0877\u0881\u0883\u0890\u0892\u08a0\u08a7\u08aa\u08ae\u08b3"
                    + "\u08c4\u08c8\u08d1\u08d5\u08d7\u08de\u08e5\u08ec\u08f4\u0901\u0915\u091f"
                    + "\u0922\u092b\u092e\u0930\u0933\u0936\u0948\u0951\u0958\u096a\u096f\u0974"
                    + "\u0978\u097c\u0980\u0984\u0988\u098c\u098f";
    public static final String _serializedATN =
            Utils.join(new String[] {_serializedATNSegment0, _serializedATNSegment1}, "");
    public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
