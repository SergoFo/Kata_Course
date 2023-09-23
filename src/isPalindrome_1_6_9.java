public class isPalindrome_1_6_9 {
    public static boolean isPalindrome(String text) {

        //Убираем пробелы и знаки, оставляя только буквы и цифры, с помощью регулярного выражения
        String text1 = text.replaceAll("[^a-zA-Z0-9]", "");
        //   System.out.println(text1);

        //Переворачивам, делаем реверс, через StringBuffer и засовываем снова в String
        StringBuilder text2 = new StringBuilder(text1);
        String textEnd = text2.reverse().toString();
        //  System.out.println(textEnd);

        //Сравниваем строки без учета регистра
        boolean result = text1.equalsIgnoreCase(textEnd);
        System.out.println(text1.equalsIgnoreCase(textEnd));

        return result;
    }
}
