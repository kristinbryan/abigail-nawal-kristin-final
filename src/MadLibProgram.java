import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.ui.Button;
import java.util.List;

public class MadLibProgram {
    public MadLib madLib1, madLib2;
    public List<MadLib> madLibList = List.of(madLib1, madLib2);

    private GraphicsText madLibName;
    public int numOfButtons;

    public MadLibProgram(CanvasWindow canvas) {
        numOfButtons = 0; //increase with every MadLib added

        ButtonManager buttonManager = new ButtonManager(numOfButtons, canvas, getMadLibName());

        // buttonManager.onclick(triggers which madLib to select depending on which is clicked)

        MadLib madLib1 = new MadLib(List.of(
            new FixedText("worlds smartest"),
            new Substitution("noun"),
            new FixedText("goes to"),
            new Substitution("place")));

        MadLib madLib2 = new MadLib(List.of(
            new FixedText("look! that"),
            new Substitution("noun"),
            new FixedText("is"),
            new Substitution("verb")));   

        System.out.println(madLibList);


        SubstitutionsInput substInput = new SubstitutionsInput(madLib1, canvas.getHeight());
        
        canvas.add(substInput);
        substInput.setCenter(canvas.getCenter());

        Button back = new Button("BACK");

        // creates go button 
        Button go = new Button("GO");
        canvas.add(go, canvas.getWidth() * 0.8, canvas.getHeight() * 0.9); 

        // when go is clicked, remove all from canvas and add the substitution screen
        go.onClick(() -> {
            canvas.removeAll();
            madLibName.setCenter(canvas.getWidth() * 0.5, canvas.getHeight() * 0.05);
            canvas.add(madLibName);

            for (MadLibElement element : madLib1.getElements()) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();
        });
        }
        
    /**
    * Adds a Button for each MadLib in the program
    */
        public int getNumOfButtons() {
            for (MadLib madLib : madLibList){
                numOfButtons++;
                return numOfButtons;
            }
            System.out.println(numOfButtons);

            return numOfButtons;
        }

        public String getMadLibName() {
            String name = new String();
            for (MadLib madLib : madLibList) {
                if (madLib == madLib1) {
                    name += "MadLib 1";
                }
                if (madLib == madLib2) {
                    name += "MadLib 2";
                }
            }
            return name;
        }


        // here we will repeat the process with new mad libs

        public static void main(String[] args) {
            CanvasWindow canvas = new CanvasWindow("Mad Lib Game", 500, 500);
            MadLibProgram madLibProgram = new MadLibProgram(canvas);
        }
       


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
