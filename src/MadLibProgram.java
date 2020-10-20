import edu.macalester.graphics.CanvasWindow;
import java.util.ArrayList;
import java.util.List;

public class MadLibProgram {

    public int numOfButtons;


    public MadLibProgram(CanvasWindow canvas) {

        numOfButtons = 6;

        MadLib testMadLib0 = new MadLib(List.of(
            new FixedText("worlds smartest"),
            new Substitution("noun"),
            new FixedText("GOES TO"),
            new Substitution("place")));

        int madlib0Subs = testMadLib0.getNumberOfSubstitutions();

        TextFieldManager textManager = new TextFieldManager(madlib0Subs, canvas);

        ButtonManager buttonManager = new ButtonManager(numOfButtons, canvas);


        textManager.listOfTextBoxes.get(1); // we ned to get the list from textfieldmanager 
        //and then individual text boxes (that are holding the updating textfeild text)
        //and then we will try and use that text to change the Substitution String to whatever the user has typed
        //NOTE:Weather program has interesting use of clicking and screen changing

        // FINAL RESULT: We will have a button that declares the changing finished
        //and when it is clicked, the mad lib will be displayed on the screen

    }
}
