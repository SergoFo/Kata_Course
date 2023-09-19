public class checkWeekend_1_4_12 {
    public static String checkWeekend(String weekday) {

/*    if (weekday.equals("Saturday") || weekday.equals("Sunday")) {
        return "Ура, выходной!";
    } else {
        return "Надо еще поработать";
    }
    */
//Решение через тернарный оператор
        return weekday.equals("Saturday") || weekday.equals("Sunday") ? "Ура, выходной!" : "Надо еще поработать";
    }
}
