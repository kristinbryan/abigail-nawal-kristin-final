import java.util.List;

public class MadLib {
    private List<MadLibElement> elements;

    public MadLib(List<MadLibElement> elements) {
        this.elements = elements;
    }

    public static void main(String[] args) {
        MadLib testMadLib0 = new MadLib(List.of(
            new FixedText("worlds smartest"),
            new Substitution("noun"),
            new FixedText("GOES TO"),
            new Substitution("place")));

        // MadLib testMadLib1 = new MadLib(List.of(
        //     new Substitution("person"),
        //     new FixedText("enrolls in"),
        //     new Substitution("class at a college"),
        //     new FixedText("for credit")));
    }
}
        
// public List<String> createOutputOrSomethingWhoKnows() {
//     List<String> result = new ArrayList<>();
//     for (each game element) {
//         result.add(output text from that element);
//     }
//     return result;
// }

// Heart of the class that is/has a GraphicsGroup that lets you fill in the blanks:
//
//  for each element {
//     if (someElementFromAMadLib instanceof Substitution) {
//         Substitution subst = (Subsitution) someElementFromAMadLib;
//         subst.getPrompt()  →  put this in a GraphicsText
//         Make a TextField (I think that's the name?) that calls subst.setText(…) when it's changed
//     }
// }


// FAR (MAYBE NOT THIS TERM) FUTURE: "[person] enrolls in [class at a college] for credit"

//fixedText
//
// List<GameElements> Madlib = [ FixedText "WORLD'S SMARTEST", Substitution "[noun]", FixedText "GOES TO",  Substitution "[place]"]
//
//for i in madlib if i == subsitution, repalce with input
//
// List <Strings> userInput = [] when the user inputs a string in the console, it is put in this list



//TODO:
// make class for graphics groups

// ok