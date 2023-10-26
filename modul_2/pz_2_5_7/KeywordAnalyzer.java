package pz_2_5_7;

abstract class KeywordAnalyzer implements TextAnalyzer{
    //Наверняка вы уже заметили, что SpamAnalyzer и NegativeTextAnalyzer во многом похожи: они оба проверяют текст на наличие каких-либо ключевых слов (в случае спама мы получаем их из конструктора, в случае негативного текста мы заранее знаем набор грустных смайликов) и в случае нахождения одного из ключевых слов возвращают Label (SPAM и NEGATIVE_TEXT соответственно), а если ничего не нашлось возвращают OK.
    //Давайте эту логику абстрагируем в абстрактный класс KeywordAnalyzer следующим образом:
    //Выделим два абстрактных метода getKeywords и getLabel, один из которых будет возвращать набор ключевых слов, а второй метку, которой необходимо пометить положительные срабатывания.
    //Нам незачем показывать эти методы потребителям классов, поэтому оставим доступ к ним только для наследников. Реализуем processText таким образом, чтобы он зависел только от getKeywords и getLabel.
    //Сделаем SpamAnalyzer и NegativeTextAnalyzer наследниками KeywordAnalyzer и реализуем абстрактные методы.

    private String[] Keywords;
    protected String[] getKeywords() {
        return Keywords;
    }

    protected Label getLabel() {
        return Label.SPAM;
    }
    public Label processText(String text) {
        

        }
    }

