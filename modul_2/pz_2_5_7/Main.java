package pz_2_5_7;

public class Main {
    public static void main(String[] args) {
        // инициализация анализаторов для проверки в порядке данного набора анализаторов
        String[] Keywords = {"spam", "bad"};
        int MaxLength = 4;
        TextAnalyzer[] textAnalyzers1 = {
                new SpamAnalyzer(Keywords),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(MaxLength)
        };
        TextAnalyzer[] textAnalyzers2 = {
                new SpamAnalyzer(Keywords),
                new TooLongTextAnalyzer(MaxLength),
                new NegativeTextAnalyzer()
        };
        TextAnalyzer[] textAnalyzers3 = {
                new TooLongTextAnalyzer(MaxLength),
                new SpamAnalyzer(Keywords),
                new NegativeTextAnalyzer()
        };
        TextAnalyzer[] textAnalyzers4 = {
                new TooLongTextAnalyzer(MaxLength),
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(Keywords)
        };
        TextAnalyzer[] textAnalyzers5 = {
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(Keywords),
                new TooLongTextAnalyzer(MaxLength)
        };
        TextAnalyzer[] textAnalyzers6 = {
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(MaxLength),
                new SpamAnalyzer(Keywords)
        };
        // тестовые комментарии
        String[] tests = new String[8];
        tests[0] = "This comment is so good.";                            // OK
        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
        tests[4] = "This comment is so bad....";                          // SPAM
        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
        TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3,
                textAnalyzers4, textAnalyzers5, textAnalyzers6};
        Main testObject = new Main();
        int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
        int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев
        for (String test : tests) {
            numberOfAnalyzer = 1;
            System.out.print("test #" + numberOfTest + ": ");
            System.out.println(test);
            for (TextAnalyzer[] analyzers : textAnalyzers) {
                System.out.print(numberOfAnalyzer + ": ");
                System.out.println(testObject.checkLabels(analyzers, test));
                numberOfAnalyzer++;
            }
            numberOfTest++;
        }
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        //Последний штрих - написать метод checkLabels, который будет возвращать метку для комментария по набору анализаторов текста.
        // checkLabels должен возвращать первую не-OK метку в порядке данного набора анализаторов, и OK, если все анализаторы вернули OK.
        // Используйте, пожалуйста, самый открытый модификатор доступа для всех классов.
        // В итоге, реализуйте классы KeywordAnalyzer, SpamAnalyzer, NegativeTextAnalyzer и TooLongTextAnalyzer и метод checkLabels.
        // TextAnalyzer и Label уже подключены, лишние импорты вам не потребуются.
        for (TextAnalyzer textAnalyzer1 : analyzers) {
            Label result;
            if ((result = textAnalyzer1.processText(text)) != Label.OK) {
                return result;
            }
        }
        return Label.OK;
    }
}
