import java.util.Objects;
import java.util.function.Supplier;

public class pz_5_1_14__generic_Pair {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");

        Integer i = pair.getFirst(); // 1
        System.out.println(i);

        String s = pair.getSecond(); // "hello"
        System.out.println(s);

        Pair<Integer, String> pair2 = Pair.of(1, "hello");

        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println(mustBeTrue);

        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustAlsoBeTrue);

    }

    public static class Pair<T, U> {
        private final T value;
        private final U val;

        private Pair(T value, U val) {
            this.value = value;
            this.val = val;
        }

        public static <T, U> Pair<T, U> of(T value, U val) {
            return new Pair<>(value, val);
        }

        public T getFirst() {
            return value;
        }

        public U getSecond() {
            return val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(value, pair.value) && Objects.equals(val, pair.val);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, val);
        }
    }
}
