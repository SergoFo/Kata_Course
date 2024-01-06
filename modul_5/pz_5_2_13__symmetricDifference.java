import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class pz_5_2_13__symmetricDifference {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);

        HashSet<Integer> s2 = new HashSet<>();
        s2.add(0);
        s2.add(1);
        s2.add(2);

        Set<Integer> result = symmetricDifference(s1, s2);
        System.out.println(result);
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
/*        Set<T> s1 = new HashSet<>(set1);
        Set<T> s2 = new HashSet<>(set2);
        s1.removeAll(s2);  // 3
        Set<T> s11 = new HashSet<>(set1);
        s2.removeAll(s11); // 0
        s1.addAll(s2);     // 0, 3
        return s1;*/


/*        Set<T> s1 = new HashSet<>(set1);
        s1.removeAll(set2);
        s1.addAll(set2);
        Set<T> s2 = new HashSet<>(set1);
        s2.retainAll(set2);
        s1.removeAll(s2);
        return s1;*/

        Set<T> result = new HashSet<T>(set1);
        for (T element : set2) {
            if (!result.add(element)) {
                result.remove(element);
            }
        }
        return result;
    }

    }


