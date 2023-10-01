public class getAgeDiff_1_3_3 {
    public static byte getAgeDiff(byte age1, byte age2){
        byte result = (byte) (age2 - age1);
        return (byte) Math.abs(result);
    }
}
