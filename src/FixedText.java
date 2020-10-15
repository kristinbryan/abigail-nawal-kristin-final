public class FixedText implements GameElement {
    public String sentence; 

    public String fixedText() {
        sentence = "Hello, my name is ";
        return sentence;
    }

    public String getText() {
        return fixedText();
    }

}
