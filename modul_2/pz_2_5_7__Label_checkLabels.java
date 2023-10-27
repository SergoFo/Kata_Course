
public class pz_2_5_7__Label_checkLabels {
    // тесты
    public static class Main {
        public static void main(String[] args) {
            // инициализация анализаторов для проверки в порядке данного набора анализаторов
            String[] Keywords = {"spam", "bad"};
            int MaxLength = 40;
            TextAnalyzer[] textAnalyzers1 = {
                    new SpamAnalyzer(Keywords),
                    new NegativeTextAnalyzer(),
                    new TooLongTextAnalyzer(MaxLength)};
            TextAnalyzer[] textAnalyzers2 = {
                    new SpamAnalyzer(Keywords),
                    new TooLongTextAnalyzer(MaxLength),
                    new NegativeTextAnalyzer()};
            TextAnalyzer[] textAnalyzers3 = {
                    new TooLongTextAnalyzer(MaxLength),
                    new SpamAnalyzer(Keywords),
                    new NegativeTextAnalyzer()};
            TextAnalyzer[] textAnalyzers4 = {
                    new TooLongTextAnalyzer(MaxLength),
                    new NegativeTextAnalyzer(),
                    new SpamAnalyzer(Keywords)};
            TextAnalyzer[] textAnalyzers5 = {
                    new NegativeTextAnalyzer(),
                    new SpamAnalyzer(Keywords),
                    new TooLongTextAnalyzer(MaxLength)};
            TextAnalyzer[] textAnalyzers6 = {
                    new NegativeTextAnalyzer(),
                    new TooLongTextAnalyzer(MaxLength),
                    new SpamAnalyzer(Keywords)};
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
            TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3, textAnalyzers4, textAnalyzers5, textAnalyzers6};
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


/*    Вот что должно появится на выходе :

    test #0: This comment is so good.
1: OK
2: OK
3: OK
4: OK
5: OK
6: OK
    test #1: This comment is so Loooooooooooooooooooooooooooong.
1: TOO_LONG
2: TOO_LONG
3: TOO_LONG
4: TOO_LONG
5: TOO_LONG
6: TOO_LONG
    test #2: Very negative comment !!!!=(!!!!;
1: NEGATIVE_TEXT
2: NEGATIVE_TEXT
3: NEGATIVE_TEXT
4: NEGATIVE_TEXT
5: NEGATIVE_TEXT
6: NEGATIVE_TEXT
    test #3: Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;
1: NEGATIVE_TEXT
2: TOO_LONG
3: TOO_LONG
4: TOO_LONG
5: NEGATIVE_TEXT
6: NEGATIVE_TEXT
    test #4: This comment is so bad....
1: SPAM
2: SPAM
3: SPAM
4: SPAM
5: SPAM
6: SPAM
    test #5: The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!
1: SPAM
2: SPAM
3: TOO_LONG
4: TOO_LONG
5: SPAM
6: TOO_LONG
    test #6: Negative bad :( spam.
1: SPAM
2: SPAM
3: SPAM
4: NEGATIVE_TEXT
5: NEGATIVE_TEXT
6: NEGATIVE_TEXT
    test #7: Very bad, very neg =(, very ..................
1: SPAM
2: SPAM
3: TOO_LONG
4: TOO_LONG
5: NEGATIVE_TEXT
6: NEGATIVE_TEXT*/

        public Label checkLabels(TextAnalyzer[] analyzers, String text) {
            for (TextAnalyzer analyzer : analyzers) {
                Label result;
                if ((result = analyzer.processText(text)) != Label.OK) {
                    return result;
                }
            }
            return Label.OK;
        }
    }

    interface TextAnalyzer {
        Label processText(String text);
    }

    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }

    static class TooLongTextAnalyzer implements TextAnalyzer {
        private final int MaxLength;

        public TooLongTextAnalyzer(int MaxLength) {
            this.MaxLength = MaxLength;
        }

        @Override
        public Label processText(String text) {
            if (text.length() < MaxLength) {
                return Label.OK;
            } else {
                return Label.TOO_LONG;
            }
        }
    }

    abstract static class KeywordAnalyzer implements TextAnalyzer {
        abstract protected String[] getKeywords();

        abstract protected Label getLabel();

        @Override
        public Label processText(String text) {
            for (String keyword : getKeywords()) {
                if (text.contains(keyword)) return getLabel();
            }
            return Label.OK;
        }
    }

    static class SpamAnalyzer extends KeywordAnalyzer {

        private final String[] keywords;
        private final Label label;

        public SpamAnalyzer(String[] keywords) {
            this.keywords = keywords.clone();
            label = Label.SPAM;
        }

        @Override
        protected String[] getKeywords() {
            return keywords;
        }

        @Override
        protected Label getLabel() {
            return label;
        }
    }

    static class NegativeTextAnalyzer extends KeywordAnalyzer {

        private final String[] keywords;
        private final Label label;

        public NegativeTextAnalyzer() {
            this.keywords = new String[3];
            this.keywords[0] = ":(";
            this.keywords[1] = "=(";
            this.keywords[2] = ":|";
            label = Label.NEGATIVE_TEXT;
        }

        @Override
        public String[] getKeywords() {
            return keywords;
        }

        @Override
        public Label getLabel() {
            return label;
        }
    }
}
