public class pz_2_1_7__Enum {
    public static void main(String[] args) {
        Day current = Day.SUNDAY;
        System.out.println(current.isWeekend());
    }

    public enum Day {
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");
        private final String name;

        Day(String name) {           // Конструктор
            this.name = name;
        }

        public String getRusName() {
            return name;
        }

        public boolean isWeekend() {
            return getRusName().equals("Суббота") || getRusName().equals("Воскресенье");
        }
    }
}


