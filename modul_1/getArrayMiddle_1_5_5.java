public class getArrayMiddle_1_5_5 {
    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length > 0) {
            System.out.print("[");
            if (numbers.length % 2 == 0) {                           //Четные
                int a = numbers[numbers.length / 2];
                int b = numbers[numbers.length / 2 - 1];
                System.out.println(b + ", " + a + "]");
                return new int[]{b, a};
            } else {
                int c = numbers[numbers.length / 2];                 //Нечетные
                System.out.println(c + "]");
                return new int[]{c};
            }
        } else {
            System.out.println("[]");
            return new int[0];
        }
    }
}

