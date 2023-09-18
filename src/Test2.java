public class Test2 {
    public static void main(String[] args) {



        // Конструкция if/else
        int num1 = 6;
        int num2 = 4;
        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        } else {
            System.out.println("Первое число меньше второго");
        }



        // Конструкция switch
        int num = 8;
        switch(num) {
            case 1:
                System.out.println("число равно 1");
                break; // остановка, чтобы не шел код дальше
            case 8:
                System.out.println("число равно 8");
                num++;
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }



        // Тернарная операция
        int x = 3;
        int y = 2;
        int z = x < y ? (x + y) : (x - y);
        System.out.println(z);




    }

}
