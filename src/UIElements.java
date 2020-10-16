

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.ui.TextField;

public class UIElements {
    CanvasWindow canvas;
    public UIElements(CanvasWindow canvas, int numOfElements)  {

        //for (int i : numOfelements){
        // add text feild 
        //
        //

    }

    public TextField createTextField(MadLibElement element) {
        TextField textField = new TextField(){};

        return textField;

    }

    public void addToCanvas(TextField hello) {
        
        canvas.add(hello);
    }

    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("Madlibs", 500, 500);
        // Substitution newSub = new Substitution("hello");
        TextField textField = new TextField(){};
        textField.setCenter(250, 250);
        canvas.add(textField);

    }
}

