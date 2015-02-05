package me.alterway.workaholic.control.util;

public class Wording
{
    // processing the wording of the deadline value in a job
    public static String getDeadlineString(int deadline)
    {
        try
        {
            if (deadline == 0)
            {
                return "Last day of month";
            }
            if ((deadline > 3 && deadline < 21) || (deadline > 23 && deadline < 29))
            {
                return deadline+"th day of month";
            }
            switch(deadline)
            {
                case 1: case 21:
                return deadline+"st day of month";
                case 2: case 22:
                return deadline+"nd day of month";
                case 3: case 23:
                return deadline+"rd day of month";
                case -1:
                    deadline*=-1;
                    return deadline+" day before the end of month";
            }
            if (deadline < -1)
            {
                deadline*=-1;
                return deadline+" days before the end of month";
            }
            return null;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

}
