import java.util.stream.IntStream;

public class pz_6_2_11__IntStream {
    public static void main(String[] args) {
        IntStream i = pseudoRandomStream(13);
        i.limit(20).forEach(System.out::println);
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ((n * n) / 10) % 1000);
    }

}
