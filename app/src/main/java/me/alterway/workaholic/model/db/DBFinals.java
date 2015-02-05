package me.alterway.workaholic.model.db;

public interface DBFinals
{
    // Database Info
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "workaholicManager";

    // Table Names
    public static final String TABLE_USER = "user";
    public static final String TABLE_JOB = "jobs";
    public static final String TABLE_SHIFT = "shifts";

    // Common column names
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";

    // USER Table - column names
    public static final String USER_FIRST_NAME = "first_name";
    public static final String USER_EMAIL = "email";
    public static final String USER_PASSWORD = "password";

    // JOB Table - column names
    public static final String JOB_WORKPLACE = "workplace";
    public static final String JOB_POSITION = "position";
    public static final String JOB_DESCRIPTION = "description";
    public static final String JOB_SALARY = "salary";
    public static final String JOB_TAX = "tax";
    public static final String JOB_DEADLINE = "deadline";
    public static final String JOB_ACTIVE = "active";

    // SHIFT Table - column names
    public static final String SHIFT_START = "start";
    public static final String SHIFT_END = "end";
    public static final String SHIFT_PAUSE = "pause";
    public static final String KEY_JOB_ID = "job_id";

    // Table CREATE Statements
    public static final String CREATE_TABLE_JOB = "CREATE TABLE "+TABLE_JOB+
            "("+KEY_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"
            +JOB_WORKPLACE+" TEXT,"
            +JOB_POSITION+" TEXT,"
            +JOB_SALARY+" REAL,"
            +JOB_TAX+" REAL,"
            +JOB_DEADLINE+" INTEGER,"
            +JOB_ACTIVE+" INTEGER,"
            +JOB_DESCRIPTION+" TEXT)";

    public static final String CREATE_TABLE_SHIFT = "CREATE TABLE "+TABLE_SHIFT+
            "("+KEY_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"
            +KEY_JOB_ID+" INTEGER,"
            +SHIFT_START+" INTEGER,"
            +SHIFT_END+" INTEGER,"
            +SHIFT_PAUSE+" INTEGER)";
}
