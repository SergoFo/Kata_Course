import java.math.BigInteger;

public class BigInteger_factorial_1_4_7 {
    public static BigInteger factorial(int value) {
        BigInteger one = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            one = one.multiply(BigInteger.valueOf(i));
        }
        return one;
    }
}
