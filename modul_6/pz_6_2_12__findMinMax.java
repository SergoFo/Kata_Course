import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class pz_6_2_12__findMinMax {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        stream.collect(Collectors.teeing(
                Collectors.minBy(order),
                Collectors.maxBy(order),
                (min, max) -> {
                    minMaxConsumer.accept(min.orElse(null), max.orElse(null));
                    return minMaxConsumer;
                }
        ));

        //Твой код здесь
    }

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(123, 54325, 456, 567, 768, 7689, 78, 35, 132);
        Comparator<? super Integer> comparator = Integer::compare;
        BiConsumer<? super Integer, ? super Integer> biConsumer = (x1, x2) -> System.out.println("min: " + x1 + "\nmax: " + x2);
        findMinMax(stream, comparator, biConsumer);
    }
}
