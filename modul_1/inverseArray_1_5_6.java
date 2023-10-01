public class inverseArray_1_5_6 {
    public static int[] inverseArray(int[] numbers) {
        int indexToInsert = 0;
        int[] result = new int[numbers.length];
        if (numbers.length > 0) {
            System.out.print("[");
            for (int i = numbers.length - 1; i >= 0; i--) {
                result[indexToInsert] = numbers[i];
                if (indexToInsert + 1 < numbers.length) {
                    System.out.print(result[indexToInsert] + ", ");
                } else {
                    System.out.println(result[indexToInsert] + "]");
                }
                indexToInsert++;
            }
            return result;
        } else {
            System.out.println("[]");
            return new int[0];
        }
    }
}