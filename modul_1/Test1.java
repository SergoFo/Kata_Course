public class Test1 {
    public static void main(String[] args) {

        chek_1_2_7 itog = new chek_1_2_7();
        System.out.println(itog.chekOstatok(8.5, 2));

        Math_1_2_10 ABS = new Math_1_2_10();
        System.out.println(ABS.doubleExpression(2, 3, 5));



/*
        System.out.println(0x0bp3);
        char c1 = 92;
        System.out.println(c1);
        System.out.println("\n\u005B\n");

        char ch = '\'';
        System.out.println(ch);
*/


        calcCircleRadius_1_2_13 R = new calcCircleRadius_1_2_13();
        calcCircleRadius_1_2_13.calcCircleRadius(123);
        System.out.println();

        BigInteger_1_2_14 Big = new BigInteger_1_2_14();
        BigInteger_1_2_14.maxLongSqr();

        charExpression_1_3_2 ch5 = new charExpression_1_3_2();
        System.out.println(charExpression_1_3_2.charExpression(1));

        getAgeDiff_1_3_3 difference = new getAgeDiff_1_3_3();
        System.out.println(getAgeDiff_1_3_3.getAgeDiff((byte) 2, (byte) 5));

/*
        int number = -1234;
        String str = String.format("%d", number);
        System.out.println("With format method: string = " + str);
*/

        isPowerOfTwo_1_3_8 degree = new isPowerOfTwo_1_3_8();
        System.out.println(isPowerOfTwo_1_3_8.isPowerOfTwo(-2));

        BigInteger_factorial_1_4_7 fac = new BigInteger_factorial_1_4_7();
        System.out.println(BigInteger_factorial_1_4_7.factorial(3));

        BigInteger_factorial_1_4_8 fac1 = new BigInteger_factorial_1_4_8();
        System.out.println(BigInteger_factorial_1_4_8.factorial(4));

        determineGroup_1_4_9 det = new determineGroup_1_4_9();
        System.out.println(det.determineGroup(17));

        isWeekend_1_4_10 wek = new isWeekend_1_4_10();
        System.out.println(isWeekend_1_4_10.isWeekend("Saturday"));

        isWeekend_1_4_11 wek1 = new isWeekend_1_4_11();
        System.out.println(isWeekend_1_4_11.isWeekend("Sunday"));

        checkWeekend_1_4_12 wek2 = new checkWeekend_1_4_12();
        System.out.println(checkWeekend_1_4_12.checkWeekend("Saturday"));

        printArray_1_5_3 pr = new printArray_1_5_3();
        printArray_1_5_3.printArray(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 7});

        getSubArrayBetween_1_5_4 sub = new getSubArrayBetween_1_5_4();
        getSubArrayBetween_1_5_4.getSubArrayBetween(new int[]{1, 3, 5, 6, 9, 11, 24}, 4, 10);

        getArrayMiddle_1_5_5 arr = new getArrayMiddle_1_5_5();
        getArrayMiddle_1_5_5.getArrayMiddle(new int[]{1, 5, 2, 17});

        inverseArray_1_5_6 inv = new inverseArray_1_5_6();
        inverseArray_1_5_6.inverseArray(new int[]{1, 4, 6, 7});

        mergeAndSort_1_5_7 merge = new mergeAndSort_1_5_7();
        mergeAndSort_1_5_7.mergeAndSort(new int[]{1, 3, 7, 5}, new int[]{8, 4, 2, 4});

        printArray_1_5_9 pA = new printArray_1_5_9();
        printArray_1_5_9.printArray(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 7});

        getArrayMiddle_1_5_10 get = new getArrayMiddle_1_5_10();
        getArrayMiddle_1_5_10.getArrayMiddle(new int[]{1, 5, 2, 17, 18});

        mergeAndSort_1_5_11 mer = new mergeAndSort_1_5_11();
        mergeAndSort_1_5_11.mergeAndSort(new int[]{1, 3, 7, 5}, new int[]{8, 4, 2, 4});

        printOddNumbers_1_5_12 print = new printOddNumbers_1_5_12();
        printOddNumbers_1_5_12.printOddNumbers(new int[]{3, 5, 20, 8, 7, 3, 100});

        parseAndPrintNumber_1_6_8 parse = new parseAndPrintNumber_1_6_8();
        parse.parseAndPrintNumber("1200");

        isPalindrome_1_6_9 pal = new isPalindrome_1_6_9();
        isPalindrome_1_6_9.isPalindrome("Was it a cat I saw?");

        parseAndSqrt_1_6_10 sqr = new parseAndSqrt_1_6_10();
        sqr.parseAndSqrt("64");

        isGmailOrOutlook_1_6_11 mail = new isGmailOrOutlook_1_6_11();
        isGmailOrOutlook_1_6_11.isGmailOrOutlook("@outlook.com");

        printTextPerRole_1_6_12 PerRole = new printTextPerRole_1_6_12();
        String[] roles = new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        printTextPerRole_1_6_12.printTextPerRole(roles, textLines);

    }
}