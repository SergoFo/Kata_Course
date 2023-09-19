public class isWeekend_1_4_10 {
    public static boolean isWeekend(String weekday) {
        switch (weekday) {
            case "Saturday", "Sunday":
                return true;
            default:
                return false;
        }
    }
}
