import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.ui.Button;
import java.util.ArrayList;
import java.util.List;

public class MadLibProgram {

    public int numOfButtons;


    public MadLibProgram(CanvasWindow canvas) {

        numOfButtons = 1; //increase with every MadLib added

        ButtonManager buttonManager = new ButtonManager(numOfButtons, canvas);

        // buttonManager.onclick(triggers which madLib to select depending on which is clicked)

        MadLib MadLib1 = new MadLib(List.of(
            new FixedText("worlds smartest"),
            new Substitution("noun"),
            new FixedText("GOES TO"),
            new Substitution("place")));

        MadLib MadLib2 = new MadLib(List.of(
            new FixedText("worlds smartest"),
            new Substitution("noun"),
            new FixedText("GOES TO"),
            new Substitution("place")));   

        SubstitutionsInput substInput = new SubstitutionsInput(MadLib1, canvas.getHeight());
        canvas.add(substInput);
        substInput.setCenter(canvas.getCenter());


        Button go = new Button("GO");
        canvas.add(go, 400, 400);
        go.onClick(() -> {
            for (MadLibElement element : MadLib1.getElements()) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();
        });

        // here we will repeat the process with new mad libs


        // THE PROCESS: we ned to get the list from textfieldmanager 
        // textManager.listOfTextBoxes.get(1); 
        //and then individual text boxes (that are holding the updating textfeild text)
        //and then we will try and use that text to change the Substitution String to whatever the user has typed
        //NOTE:Weather program has interesting use of clicking and screen changing

        // SOME THOUGHTS: it might be useful if the text and button manager took in a mad lib?
        // - we can set up methods for each screen
        // example: public void homeScreen(){
        // buttons that select which Mad Lib to use
        //}
        // public void textInputScreen(){
        // textfeilds that substitute different parts of the Mad Lib
        //}
        //
        // public void finalResultScreen(){
        // displays the final, completed Mad Lib
        //} 


        // FINAL RESULT: We will have a button that declares the changing finished
        //and when it is clicked, the mad lib will be displayed on the screen

    }


    //AN ATTEMPT AT WHAT THE MAIN METHOD MIGHT LOOK LIKE
    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("Mad Lib Game", 500, 500);
        MadLibProgram madLibProgram = new MadLibProgram(canvas);
    }
}
