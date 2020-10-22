
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.ui.TextField;

/**
 * Represents a list of a certain number of TestFeilds with corresponding Textboxes that hold their values
 */
//Mad Lib filler outer thing (rename something)
public class SubstitutionsInput extends GraphicsGroup {
    /**
    * Constructs a group of TextFields and places them on a given canvas according to the number of elements declared
    * also creates a set of Graphics Text boxes that hold that values of the TextFields
    */
    public SubstitutionsInput(MadLib madLib, int totalHeight)  {
        int y = 0;
        for (Substitution substitution : madLib.getSubstitutions()){
            GraphicsText prompt = new GraphicsText(substitution.getPrompt());
            TextField substitutionText = new TextField();
            substitutionText.setText(substitution.getText());

            prompt.setPosition(0, y + 15);
            substitutionText.setPosition(100, y);

            add(substitutionText);
            add(prompt);

            substitutionText.onChange(text -> substitution.setText(text));
            y += totalHeight / 10;
        }
    }
}