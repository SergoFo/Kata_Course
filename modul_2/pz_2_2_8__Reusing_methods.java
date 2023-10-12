public class pz_2_2_8__Reusing_methods {
    public static void main(String[] args) {
        String[] days = new String[]{"Saturday", "SUNDAY", "Monday", "Friday", "tuesday", "saturday", "Wednesday", "Thursday", "sUNDAY"};
        System.out.println(weekendCount(days));
        System.out.println(weekdayCount(days));
        System.out.println(isWeekend("Sunday"));
    }

    public static boolean isWeekend(String dayName) {
        if (dayName.equalsIgnoreCase("Sunday") || dayName.equalsIgnoreCase("Saturday")) {
            return true;
        } else {
            return false;
        }
    }

    public static int weekendCount(String[] days) {
        int indexWeekendCount = 0;
        for (int i = 0; i < days.length; i++) {
            if (isWeekend(days[i])) {
                indexWeekendCount++;
            }
        }
        return indexWeekendCount;
    }

    public static int weekdayCount(String[] days) {
        return days.length - weekendCount(days);
    }
}
