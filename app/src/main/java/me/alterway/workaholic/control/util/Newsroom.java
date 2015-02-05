package me.alterway.workaholic.control.util;

import me.alterway.workaholic.control.util.Wording;

public interface Newsroom
{
    // fields:
    public static final String SUCCESSFUL_REGISTRATION_TITLE = "Registration Successful";
    public static final String ERROR_REGISTRATION_TITLE = "Registration Cancelled";
    public static final String PASSWORD_CHANGED_TITLE = "Account Info Changed";

    public static final String RECOVER_PASSWORD = "In order to recover your password, please enter the email address in your Workaholic account!";
    public static final String EXISTING_USER = "There is already an <b>existing account</b>, in order to register again, enter the password to delete it.";
    public static final String SUCCESSFUL_REGISTRATION = "Registration has been <b>successfully completed</b>! Continue with signing in.";
    public static final String ERROR_REGISTRATION = "Error has occured. Registration has been <b>cancelled</b>!";
    public static final String INCORRECT_PASSWORD = "The password you have entered was <b>incorrect</b>!";
    public static final String NO_EMAIL_FOUND = "The email you have entered has <b>not</b> been registered!";
    public static final String PASSWORD_CHANGED = "Password has been <b>successfully changed</b>! Any other changes have been accepted as well.";

    public static final String CREATE_NEW_PASSWORD = "Create New Password";
    public static final String DISMISS = "Dismiss";
    public static final String CANCEL = "Cancel";
    public static final String DELETE_OLD = "Delete Old Account";

    public static final String SIGNED_USER = "SIGNED_USER";
    public static final String SELECTED_JOB = "SELECTED_JOB";
    public static final String SELECTED_SHIFT = "SELECTED_SHIFT";
    public static final String SELECTED_VALUE = "SELECTED_VALUE";
    public static final String SELECTED_TO_DELETE = "SELECTED_TO_DELETE";

    public static final String NOTHING = "";

    public static final int NEW_JOB = 0;
    public static final int EDIT_JOB = 1;

    public static final int WORKPLACE = 0;
    public static final int POSITION = 1;
    public static final int SALARY = 2;
    public static final int TAX = 3;
    public static final int DEADLINE = 4;
    public static final int DESCRIPTION = 5;

    public static final int NEW_SHIFT = 0;
    public static final int EDIT_SHIFT = 1;

    public static final String JOB_LABEL = "Job:";
    public static final String START_DAY_LABEL = "Starting Day of the Shift:";
    public static final String START_TIME_LABEL = "Starting at:";
    public static final String END_TIME_LABEL = "Finishing at:";
    public static final String PAUSE_TIME_LABEL = "Break for:";

    public static final String WORKPLACE_LABEL = "Workplace:";
    public static final String POSITION_LABEL = "Position:";
    public static final String DESCRIPTION_LABEL = "Description:";
    public static final String SALARY_LABEL = "Salary:";
    public static final String TAX_LABEL = "Tax:";
    public static final String DEADLINE_LABEL = "Last counting day of salary:";

    public static String deadlines[] =   {  Wording.getDeadlineString(-2),
            Wording.getDeadlineString(-1),
            Wording.getDeadlineString(0),
            Wording.getDeadlineString(1),
            Wording.getDeadlineString(2),
            Wording.getDeadlineString(3),
            Wording.getDeadlineString(4),
            Wording.getDeadlineString(5),
            Wording.getDeadlineString(6),
            Wording.getDeadlineString(7),
            Wording.getDeadlineString(8),
            Wording.getDeadlineString(9),
            Wording.getDeadlineString(10),
            Wording.getDeadlineString(11),
            Wording.getDeadlineString(12),
            Wording.getDeadlineString(13),
            Wording.getDeadlineString(14),
            Wording.getDeadlineString(15),
            Wording.getDeadlineString(16),
            Wording.getDeadlineString(17),
            Wording.getDeadlineString(18),
            Wording.getDeadlineString(19),
            Wording.getDeadlineString(20),
            Wording.getDeadlineString(21),
            Wording.getDeadlineString(22),
            Wording.getDeadlineString(23),
            Wording.getDeadlineString(24),
            Wording.getDeadlineString(25),
            Wording.getDeadlineString(26),
            Wording.getDeadlineString(27),
            Wording.getDeadlineString(28)  };

    public static String pauses[] = {"No break","15 minutes","30 minutes","45 minutes","1 hour","1 hour 30 minutes","2 hours"};



}
