import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isGmailOrOutlook_1_6_11 {
    public static boolean isGmailOrOutlook(String email) {

        //Принимаем регулярное выражение в шаблон Pattern для поиска
        Pattern regEx = Pattern.compile("[a-zA-Z0-9]+(@gmail.com|@outlook.com)");

        //Сопоставлем с нашим регулярным выражением, ищем совпадения
        Matcher check = regEx.matcher(email);

        //Проверяем
        boolean result = check.matches();
        System.out.println(result);
        return result;
    }
}