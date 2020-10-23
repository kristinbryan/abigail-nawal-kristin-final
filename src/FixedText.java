/**
*  FixedText represents the text in a MadLib that the user does not interact with. It is displayed after the 
* substitution is performed.
*/
public class FixedText implements MadLibElement {
    public final String text;

    public FixedText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}

