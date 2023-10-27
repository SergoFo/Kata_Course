package pz_2_5_7;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    //NegativeTextAnalyzer должен конструироваться конструктором по-умолчанию
    //Нужно передать массив смайлов в keywords.
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
