import java.math.BigInteger;

public class BigInteger_1_2_14 {
    public static void maxLongSqr() {
        BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger square = maxLong.multiply(maxLong);
        System.out.println(square);
    }
}