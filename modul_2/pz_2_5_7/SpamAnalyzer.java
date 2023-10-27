package pz_2_5_7;

public class SpamAnalyzer extends KeywordAnalyzer {
    //SpamAnalyzer должен конструироваться от массива строк с ключевыми словами.
    //Объект этого класса должен сохранять в своем состоянии этот массив строк в приватном поле keywords.

    private final String[] keywords;


    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
