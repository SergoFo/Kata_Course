public class pz_6_1_9__sqrt {
    public interface UnaryOperator<T> {
        T apply(T t);
    }

    public static class LambdaApp {
        public UnaryOperator<Integer> sqrt() {
            return x -> x * x;
        }

        public static void main(String[] args) {
            LambdaApp sqrt = new LambdaApp();
            System.out.println(sqrt.sqrt().apply(5)); // 25
        }
    }
}
