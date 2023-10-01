import java.util.Arrays;

public class getArrayMiddle_1_5_10 {
    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length > 0) {
            if (numbers.length % 2 == 0) {
                int[] even = Arrays.copyOfRange(numbers, numbers.length / 2 - 1, numbers.length / 2 + 1);
                System.out.println(Arrays.toString(even));
                return even;
            } else {
                int[] odd = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length / 2 + 1);
                System.out.println(Arrays.toString(odd));
                return odd;
            }
        } else {
            int[] nul = new int[0];
            System.out.println(Arrays.toString(nul));
            return nul;
        }
    }
}