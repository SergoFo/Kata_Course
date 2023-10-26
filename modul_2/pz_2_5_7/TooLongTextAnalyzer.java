package pz_2_5_7;

class TooLongTextAnalyzer implements TextAnalyzer {
    //TooLongTextAnalyzer должен конструироваться от int-а с максимальной допустимой длиной комментария.
    //Объект этого класса должен сохранять в своем состоянии это число в приватном поле maxLength.

    private final int MaxLength;

    public TooLongTextAnalyzer(int commentMaxLength) {
        this.MaxLength = commentMaxLength;
    }

    @Override
    public Label processText(String text) {
        if(text.length() < MaxLength){
            return Label.OK;
        } else {
            return Label.TOO_LONG;
        }
    }
}
