public class Test1 {
    public static void main(String[] args) {
        double b = 5;
        int c = 5;
        double a = b % c;
        System.out.println(a);
        System.out.println(chekOstatok(5,5));
    }

    public static double chekOstatok(double a, int b) {
        return a % b;
    }
}