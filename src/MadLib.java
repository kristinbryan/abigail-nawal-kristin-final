import java.util.ArrayList;
import java.util.List;

/**
*  MadLib  holds a list of MadLibElements (a given mix of Substitutions and Fixed Test )and a title 
* that can be manipulated using substitutions
*/
public class MadLib {
    private String title;
    private List<MadLibElement> elements;

    public MadLib(String title, List<MadLibElement> elements) {
        this.title = title;
        this.elements = elements;
    }

    public String getTitle() {
        return title;
    }

    /**
     * Returns a list of the MadLibElements in the list elements
     */
    public List<MadLibElement> getElements() {
        return elements;
    }


    public String getText(){
        String madLibString = new String();
        for (MadLibElement element : elements) {
            madLibString += element.getText() + " ";
        }
        return madLibString;

  }

    /**
     *Takes the list of elements and returns a new list including every item that is a Substitution
    */
    public List<Substitution> getSubstitutions() {
        List<Substitution> listOfSubstitutions = new ArrayList<>();
        for (MadLibElement element : elements) {
            if (element instanceof Substitution) {
                listOfSubstitutions.add((Substitution) element);
            }
        }
        return listOfSubstitutions;
    }

}
