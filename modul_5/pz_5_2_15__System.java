import java.util.ArrayDeque;
import java.util.Scanner;

public class pz_5_2_15__System {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayDeque<Object> deque = new ArrayDeque<>();
        while (s.hasNext()) {
            s.next();
            if (s.hasNext()) {
                deque.addFirst(s.next());
            }
        }
      //  deque.forEach(System.out::print);                // Ввод: 1 2 3 4 5 6 7 8 9 10
        int size = deque.size();
        for (int i = 0; i < size; i++) {
            System.out.print(deque.removeFirst() + " ");
        }                                                    // Вывод: 10 8 6 4 2
    }
}