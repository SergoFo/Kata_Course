public class pz_2_4_11__Lazy_Student {
    public static void main(String[] args) {
        Student id1 = new Student();
        LazyStudent id2 = new LazyStudent();
        id1.study();
        id2.study();
    }

    public static class Student {
        String studying;

        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }

        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }

    public static class LazyStudent extends Student {
        @Override
        public void study() {
            System.out.println("Сегодня не учусь, мне лень.");
        }
    }
}
