public class pz_6_1_9__sqrt {
    public interface UnaryOperator<T> {                       // Функциональный интерфейс
        T apply(T t);
    }

    public static class LambdaApp {
        public UnaryOperator <Integer> sqrt() {                 // Реализация функционального интерфейса
            return x -> x * x;
        }

        public static void main(String[] args) {
            LambdaApp sqrt = new LambdaApp();
            System.out.println(sqrt.sqrt().apply(5)); // 25

            LambdaApp sum = new LambdaApp() {
                public UnaryOperator <Integer> sqrt() {                    // анонимныый класс, переопределенный
                    return x -> x + x;
                }
            };
            System.out.println(sum.sqrt().apply(5)); // 10
        }
    }
}
