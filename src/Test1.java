public class Test1 {
    public static void main(String[] args) {

        Test_chek itog = new Test_chek();
        System.out.println(itog.chekOstatok(8.5, 2));

        Test_Math ABS = new Test_Math();
        System.out.println(ABS.doubleExpression(2, 3, 5));

        System.out.println(0x0bp3);
        char c1 = 92;
        System.out.println(c1);
        System.out.println("\n\u005B\n");

        char ch = '\'';
        System.out.println(ch);



        Test_calcCircleRadius R = new Test_calcCircleRadius();
        Test_calcCircleRadius.calcCircleRadius(123);

        Test_BigInteger Big = new Test_BigInteger();
        Test_BigInteger.maxLongSqr();

        Test_charExpression ch5 = new Test_charExpression();
        System.out.println(Test_charExpression.charExpression(1));





    }

}