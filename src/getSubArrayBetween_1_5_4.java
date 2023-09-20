public class getSubArrayBetween_1_5_4 {
public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
    int[] podnumbers = new int[5];
    System.out.print("[");
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] >= start && numbers[i] <= end) {
            podnumbers[i] = numbers[i];
            if (numbers[i] < 9) {
                System.out.print(podnumbers[i] + ", ");
            } else {
                System.out.println(podnumbers[i] + "]");
            }
        }
    }
    return podnumbers;


/*        int[] podnumders = new int[3];
        for (int i = 0; i < podnumders.length; i++) {
            podnumders[i] = numbers[start + i];
            System.out.println(podnumders[i]);
        }
        return podnumders;*/
    }
}

