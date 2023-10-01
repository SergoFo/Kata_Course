import java.util.Arrays;

public class mergeAndSort_1_5_11 {
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] thirdArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, thirdArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, thirdArray, firstArray.length, secondArray.length);
        Arrays.sort(thirdArray);
        System.out.println(Arrays.toString(thirdArray));
        return thirdArray;
    }
}
