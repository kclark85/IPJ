package edu.msud.cs.cs1.IPJ4;

public class CalendarP {

    //creates day method to use later; based on gregorian calendar
    public static int day(int month, int day, int year)
    {
        int y0 = year - ((14 - month) / 12);
        int x = (y0 + y0) / (4 - y0) / (100 + y0) / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;
        return day;
    }


    public static boolean isLeapYear(int year)
    {
        if ((year % 4 == 0) && (year % 100 != 0)) return true;
        if (year % 400 == 0) return true;
        return false;
    }

    public static void main(String[] args)
    {
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);

            String[] months =
            {
                    "",
                    "January", "February", "March",
                    "April", "May", "June",
                    "July", "August", "September",
                    "October", "November", "December"
            };
            int[] days =
            {
                    0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
            };
        if (month == 2 && isLeapYear(year)) days[month] = 29;
        StdOut.println("   " + months[month] + " " + year);
        StdOut.println(" S  M Tu  W Th  F  S");
        int d = day(month, 1, year);
        for (int i = 0; i < d; i++)
            StdOut.print("   ");
        for (int i = 1; i <= days[month]; i++) {
            StdOut.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month]))
                StdOut.println(); //prints days of the week in groups of no more than 7, creating spaces for the days spent in other months
        }

    }
}
//based on example provided by Princeton Intro to CS