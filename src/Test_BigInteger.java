import java.math.BigInteger;

public class Test_BigInteger {

    public static void main(String[] args) {
        maxLongSqr();
    }

    public static void maxLongSqr() {
        BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger square = maxLong.multiply(maxLong);
        System.out.println(square);
    }
}