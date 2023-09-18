public class isPowerOfTwo_1_3_8 {
    public static boolean isPowerOfTwo(int value) {
        int bitCount = Integer.bitCount(Math.abs(value));
        return bitCount == 1;
    }
}
