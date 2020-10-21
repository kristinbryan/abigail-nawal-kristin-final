
import edu.macalester.graphics.ui.Button;
import edu.macalester.graphics.CanvasWindow;
import java.util.ArrayList;


//Consider turning into a MadLibs selection class
public class ButtonManager {
    
CanvasWindow canvas;
    public int numberOfButtons;
    private ArrayList<Button> listOfButtons;

    public ButtonManager(int numberOfButtons, CanvasWindow canvas, String name){

        double canvasWidth = canvas.getWidth();
        double canvasHeight = canvas.getHeight();

        this.numberOfButtons = numberOfButtons;
        this.listOfButtons = new ArrayList<Button>();


        for (int i = 0; i <= numberOfButtons; i++){

            listOfButtons.add(new Button(name));

            Button buttoni = listOfButtons.get(i);

            buttoni.setCenter(canvasWidth/2 , (i + 1 ) * canvasHeight/10);

            canvas.add(buttoni);

            // buttoni.onClick((click) -> call a method that removeobjects from the window then add texfeild manager which will allow us to type in the replacement values);
        }
    }

//  public static void main(String[] args) {
//         CanvasWindow canvas = new CanvasWindow("madLibs", 500, 500);

//         ButtonManager testButton = new ButtonManager(6, canvas);
//     }

}
