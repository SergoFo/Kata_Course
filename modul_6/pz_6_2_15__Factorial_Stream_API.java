import java.math.BigInteger;
import java.util.stream.*;
public class pz_6_2_15__Factorial_Stream_API {
    public static BigInteger factorial(int value) {
        if (value < 2) {
            return BigInteger.valueOf(1);
        } else {
            return IntStream.rangeClosed(2, value).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
        }
    }

    public static void main(String[] args) {
        int value = 3;
        BigInteger result = factorial(value);
        System.out.println(result);
    }
}
