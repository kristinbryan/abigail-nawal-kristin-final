
/**
*  A substitution is a MadLibElement that holds a prompt that can be replaced 
*/
public class Substitution implements MadLibElement {
    public String prompt, text;

    public Substitution(String prompt) {
        this.prompt = prompt;
    }

    public String getPrompt() {
        return prompt;
    }

    @Override
    public String getText() {
        return this.text; 
    }

    public void setText(String text) {
        this.text = text;
    }
}
