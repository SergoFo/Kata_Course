import java.util.Arrays;

public class Per {
    static class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Person[] person = new Person[] {
                new Person("Alice"),
                new Person("Bob"),
                new Person("Charlie")};
        System.out.println(Arrays.toString(person));
        }
    }
