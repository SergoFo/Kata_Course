public class pz_6_1_9__sqrt {
    public interface UnaryOperator<T> {
        T apply(T t);
    }

    public static class LambdaApp {
        public UnaryOperator<Integer> sqrt() {
            return x -> x * x;
        }

        public static void main(String[] args) {

            UnaryOperator<Integer> square = x -> x*x;
            System.out.println(square.apply(5)); // 25
        }
    }
}
