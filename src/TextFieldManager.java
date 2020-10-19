

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.ui.TextField;
import java.util.ArrayList;

//to talk about with group on Monday:
//Should we make a UI interface that contains each UI element?
//Change Title of Class to TextElements or another agreed upon item

/**
 * Represents a list of a certain number of TestFeilds with corresponding Textboxes that hold their values
 */
public class TextFieldManager {
    CanvasWindow canvas;
    public int numOfElements;
    private ArrayList<TextField> listOfTextFields;
    private ArrayList<GraphicsText> listOfTextBoxes;

    /**
    * Constructs a group of TextFields and places them on a given canvas according to the number of elements declared
    * also creates a set of Graphics Text boxes that hold that values of the TextFields
    */
    public TextFieldManager(int numOfElements, CanvasWindow canvas)  {

        this.numOfElements = numOfElements;
        this.listOfTextFields = new ArrayList<TextField>();
        this.listOfTextBoxes = new ArrayList<GraphicsText>();
        double canvasWidth = canvas.getWidth();
        double canvasHeight = canvas.getHeight();

    for (int i = 0; i <= numOfElements; i++){

            listOfTextFields.add(new TextField());
            listOfTextBoxes.add(new GraphicsText());

            TextField textFieldi = listOfTextFields.get(i);
            GraphicsText textBoxi = listOfTextBoxes.get(i);

            textFieldi.setCenter(canvasWidth/2 , (i + 1 ) * canvasHeight/10);
            textBoxi.setCenter(canvasWidth/2 + 50 , (i + 1 ) * canvasHeight/10);


            canvas.add(textFieldi);
            canvas.add(textBoxi);


            textFieldi.onChange((text) -> textBoxi.setText(textFieldi.getText()));

        }
    }

    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("madLibs", 500, 500);
        TextFieldManager testText = new TextFieldManager(4, canvas);
    }

}