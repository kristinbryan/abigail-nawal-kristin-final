
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

