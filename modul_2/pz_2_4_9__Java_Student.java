public class pz_2_4_9__Java_Student {
    public static void main(String[] args) {
        Student id1 = new Student();
        JavaStudent id2 = new JavaStudent();
        id1.study();
        id2.study();
    }

    public static class Student {
        protected final String studying;

        protected Student(String work) {
            this.studying = work;
        }

        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }

        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }

    public static class JavaStudent extends Student {
        public JavaStudent() {
            super("Прохожу курс по Java.");

        }
    }
}
