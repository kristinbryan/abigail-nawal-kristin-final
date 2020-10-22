import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.FontStyle;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.ui.Button;

public class MadLibProgram {
    private MadLib currentMadLib;

    private CanvasWindow canvas;
    private final GraphicsText titleText = new GraphicsText("MADLIB GAME");
    private final Button goButton = new Button("GO");
    private GraphicsText madLibName = new GraphicsText();
    private String buttonName;
    private Button changeMadLib;
    private SubstitutionsInput substInput;

    private double x;

    public MadLibProgram() {
        canvas = new CanvasWindow("Mad Lib Game", 500, 1000);

        titleText.setCenter(200, 50);
        titleText.setFont(FontStyle.BOLD, 30);

        goButton.setCenter(canvas.getWidth() * 0.5, canvas.getHeight() * 0.9);
        canvas.add(goButton);

        // when GO_BUTTON is clicked, remove all from canvas and add the substitution screen
        goButton.onClick(() -> {
            substInput = null;
            showCompletedMadLib();
        });
    }

    private void buildHomeScreen() {
        canvas.add(titleText);
        canvas.add(goButton);
        x = 100;
        for (MadLib m : MadLibs.ALL) {
            addMadLibButton(m, x);
            x += 150;
        }
    }

    /**
     * Creates a button at the top of the screen for each MadLib option
     */
    private void addMadLibButton(MadLib madLib, double x) {
        buttonName = madLib.getTitle();
        changeMadLib = new Button(buttonName);
        changeMadLib.setCenter(x, 100);
        changeMadLib.onClick(() -> setCurrentMadLib(madLib));
        canvas.add(changeMadLib);
    }

    private void setCurrentMadLib(MadLib madLib) {
        currentMadLib = madLib;

        madLibName.setText(currentMadLib.getTitle());

        if(substInput != null){
            canvas.remove(substInput);
        }
        substInput = new SubstitutionsInput(madLib, canvas.getHeight() / 4);
        canvas.add(substInput);
        substInput.setCenter(canvas.getCenter());
    }

    private void showCompletedMadLib() {
        canvas.removeAll();

        madLibName.setCenter(canvas.getWidth() * 0.5, canvas.getHeight() * 0.05);
        canvas.add(madLibName);

        Button playAgain = new Button("PLAY AGAIN");
        playAgain.onClick(() -> {
            canvas.removeAll();
            // Maybe clear all the substitutions the user entered in the current mad lib?
            buildHomeScreen();
        });
        canvas.add(playAgain);

        // Take this:
        // for (MadLibElement element : currentMadLib.getElements()) {
        //     System.out.print(element.getText() + " ");
        // }
        //...and make it a method of MadLib that returns a single String so that you can do this instead:
        // System.out.println(madLib.getText);
    }

    public static void main(String[] args) {
        new MadLibProgram().buildHomeScreen();
    }
}
