
public class FixedText implements MadLibElement {
    public final String text;

    public FixedText(String text) {
        this.text = text;
    }

/**
 * Gets the text from the FixedText
 */
    @Override
    public String getText() {
        return text;
    }
}

