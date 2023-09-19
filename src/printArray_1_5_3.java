public class printArray_1_5_3 {
    public static void printArray(int[] numbers) {
        System.out.print("[");
        if (numbers.length == 0) {
            System.out.println("]");
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println("]");
            }
        }
    }
}
