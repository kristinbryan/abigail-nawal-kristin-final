import java.util.ArrayList;
import java.util.List;

public class MadLib {
    private List<MadLibElement> elements;

    public MadLib(List<MadLibElement> elements) {
        this.elements = elements;
    }

/**
 * Returns a list od the MadLibElements in the list elements
 */
    public List<MadLibElement> getElements() {
        return elements;
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


