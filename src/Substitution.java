import edu.macalester.graphics.GraphicsGroup;

//Substitution has a prompt (ex: celebrity) and text (ex: user unputs Taylor Swift)
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
        return setText(); 
    }

    public String setText() {
        return text;
    }
}
