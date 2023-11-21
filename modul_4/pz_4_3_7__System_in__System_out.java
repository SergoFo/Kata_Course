// import java.util.Locale;

import java.util.Scanner;

public class pz_4_3_7__System_in__System_out {
    public static class ScannerDemo {
        public static void main(String[] args) {
            double sum = 0;
            Scanner scan = new Scanner(System.in);
            while (scan.hasNext()) {                                 // has.Next проверяет есть ли следующий элемент (пробел)
                if (scan.hasNextDouble()) {                          // hasNextDouble проверяет есть ли следующий элемент Double
                    sum += scan.nextDouble();                        // scan.next считывает String, можно так Double.parseDouble(scan.next()
                } else {
                    scan.next();
                }
            }
            System.out.printf("%.6f", sum);                         //System.out.printf("%.6f", 0);
            scan.close();
        }
    }
}

