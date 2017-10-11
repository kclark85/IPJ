public class Calendar {

    public static void main(String[] args) {
        int year = Integer.parseInt(args[1]);
        int month = Integer.parseInt(args[0]);
//        StdOut.print(monthsOfYear(10));
        Calendar test = new Calendar(month, year);
        StdOut.print(test);



    }
    private static boolean isLeapYear (int checkYear){ //checks to see if given year is a leap year

        boolean leapYear = false;
        if (checkYear % 100 != 0)
            leapYear = true;
        if(checkYear % 400 == 0)
            leapYear = true;
        return leapYear;
    }
    private static String daysOfWeek (int m, int d, int y) {
        String retDay = new String();
        int y0 = y - ((14 - m) / 12);
        int x = (y0 + y0) / (4 - y0) / (100 + y0) / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        if (d0 == 1) {
            retDay = "Mon";
        }
        if (d0 == 2) {
            retDay = "Tues";
        }
        if (d0 == 3) {
            retDay = "Wed";
        }
        if (d0 == 4) {
            retDay = "Thurs";
        }
        if (d0 == 5) {
            retDay = "Fri";
        }
        if (d0 == 6) {
            retDay = "Sat";
        }
        if (d0 == 7) {
            retDay = "Sun";
        }
        return retDay;
    }
    private static String monthsOfYear (int m)
    {
        String retMon = new String();
        if (m == 1) {
            retMon = "January";
        }
        if (m == 2) {
            retMon = "February";
        }
        if (m == 3) {
            retMon = "March";
        }
        if (m == 4) {
            retMon = "April";
        }
        if (m == 5) {
            retMon = "May";
        }
        if (m == 6) {
            retMon = "June";
        }
        if (m == 7) {
            retMon = "July";
        }
        if (m == 8) {
            retMon = "August";
        }
        if (m == 9) {
            retMon = "September";
        }
        if (m == 10) {
            retMon = "October";
        }
        if (m == 11) {
            retMon = "November";
        }
        if (m == 12) {
            retMon = "December";
        }

        return retMon;
    }


//Nov(10),Sep(9),Jun(6),Apr(4) have 30 days
    private static int daysInMonth (int m, int y)
    {
        int days = 0;
        if(m == 10|| m == 9|| m == 6|| m==4)
        {
            days = 30;
        }
        else if(m == 2 && isLeapYear(y)) {
            days = 29;
        } else if(m == 2 && !isLeapYear(y)) {
            days = 28;
        }
        else {
            days = 31;
        }
        return days;
    }
    public Calendar ( int m, int y)
    {
        System.out.println(monthsOfYear(m) + " " + y );
        System.out.println("Mo Tu We Th Fr Sa Su");

        for(int i = 0; i <= daysInMonth(m,y); i++)
        {
            String format = "%7s \n";
            StdOut.printf(format, i);

        }

    }


}