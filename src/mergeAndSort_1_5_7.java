public class mergeAndSort_1_5_7 {
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] thirdArray = new int[firstArray.length + secondArray.length];
        int fl = firstArray.length;
        int sl = secondArray.length;
        int fi = 0, si = 0, ti = 0;

/*        while (fi < fl && si < sl) {                          // уже для отсортированных массивов + ниже два while
        if (firstArray[fi] <= secondArray[si]) {
            thirdArray[ti] = firstArray[fi];
            fi++;
        } else {
            thirdArray[ti] = secondArray[si];
            si++;
        }
        ti++;
    }*/

        while (fi < fl) {
            thirdArray[ti] = firstArray[fi];
            ti++;
            fi++;
        }
        while (si < sl) {
            thirdArray[ti] = secondArray[si];
            ti++;
            si++;
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < thirdArray.length; i++) {
                if (thirdArray[i] < thirdArray[i - 1]) {
                    int temp = thirdArray[i];
                    thirdArray[i] = thirdArray[i - 1];
                    thirdArray[i - 1] = temp;
                    isSorted = false;
                }
            }
        }

        System.out.print("[");
        for (int i = 0; i < thirdArray.length; i++) {
            if (i < thirdArray.length - 1) {
                System.out.print(thirdArray[i] + ", ");
            } else {
                System.out.println(thirdArray[i] + "]");
            }

        }
        return thirdArray;
    }
}
