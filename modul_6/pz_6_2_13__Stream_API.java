import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class pz_6_2_13__Stream_API {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("(?U)[^\\p{L}\\p{Digit}]+")
                .tokens()
                .map(String::toLowerCase)
                .collect(Collectors.toMap(Function.identity(),
                        word -> 1,
                        Integer::sum))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new))

          //      .sorted((a, b) -> a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue())
                // Тоже рабочая сортировка

                .forEach((key, value) -> System.out.println(key));
    }
}
