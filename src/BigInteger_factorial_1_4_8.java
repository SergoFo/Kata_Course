import java.math.BigInteger;

public class BigInteger_factorial_1_4_8 {
    public static BigInteger factorial(int value) {
        if (value <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(value).multiply(factorial(value - 1));
        }
    }
}
