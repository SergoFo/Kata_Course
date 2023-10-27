package pz_2_5_7;

public class TooLongTextAnalyzer implements TextAnalyzer {
    //TooLongTextAnalyzer должен конструироваться от int-а с максимальной допустимой длиной комментария.
    //Объект этого класса должен сохранять в своем состоянии это число в приватном поле maxLength.

    private final int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if(text.length() < maxLength){
            return Label.OK;
        } else {
            return Label.TOO_LONG;
        }
    }
}
