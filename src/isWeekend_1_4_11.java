public class isWeekend_1_4_11 {
    public static boolean isWeekend(String weekday) {
/*
        if (weekday.equals("Saturday")) {
            return true;
        } else if (weekday.equals("Sunday")) {
            return true;
        } else {
            return false;
        }
*/

        if (weekday.equals("Saturday")) {
            return true;
        } else {
            return weekday.equals("Sunday");
        }

    }
}