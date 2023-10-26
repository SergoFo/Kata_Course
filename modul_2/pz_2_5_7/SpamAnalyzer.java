package pz_2_5_7;

class SpamAnalyzer extends KeywordAnalyzer {
    //SpamAnalyzer должен конструироваться от массива строк с ключевыми словами.
    //Объект этого класса должен сохранять в своем состоянии этот массив строк в приватном поле keywords.

    private final String[] Keywords;

    public SpamAnalyzer(String[] Keywords) {
        this.Keywords = Keywords;
    }

    protected String[] getKeywords() {
        return Keywords;
    }

    protected Label getLabel(){
        return Label.SPAM;
    }
}
