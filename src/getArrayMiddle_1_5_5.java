public class getArrayMiddle_1_5_5 {
    public static int[] getArrayMiddle(int[] numbers) {
        int elementsCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers.length % 2 == 0) {
                elementsCount++;
            } else {
                return numbers.length / 2;
            }
        }
        System.out.println(elementsCount);
        return numbers;
    }
}
