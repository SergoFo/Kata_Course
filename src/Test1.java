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




    }

}