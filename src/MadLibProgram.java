import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.FontStyle;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.ui.Button;

import java.util.List;

public class MadLibProgram {
    private static final GraphicsText TITLE_TEXT = new GraphicsText("MADLIB GAME");
    public List<MadLib> madLibList;
    public MadLib currentMadLib;

    private CanvasWindow canvas;
    private GraphicsText madLibName = new GraphicsText("test");
    private String buttonName;
    private Button changeMadLib;
    private double x;

    public MadLibProgram() {
        canvas = new CanvasWindow("Mad Lib Game", 500, 1000);

        TITLE_TEXT.setCenter(200, 50);
        TITLE_TEXT.setFont(FontStyle.BOLD, 30);

        // ButtonManager buttonManager = new ButtonManager(2, canvas, "test");

        // buttonManager.onclick(triggers which madLib to select depending on which is clicked)


        //Sets up madLibs

        // From VACATION FUN MAD LIBS® • Copyright © 1988 by Price Stern Sloan, a division of Penguin Putnam Books for Young Readers, New York.
        MadLib madLib1 = new MadLib(List.of(
            new FixedText("A vacation is when you take a trip to some"),
            new Substitution("adjective"),
            new FixedText("place with your"),
            new Substitution("adjective"),
            new FixedText("family. Usually you go to some place that is near a/an"),
            new Substitution("noun"), 
            new FixedText("or up on a/an"), 
            new Substitution("noun"), 
            new FixedText(". A good vacation place is one where you can ride"), 
            new Substitution("plural noun"), 
            new FixedText("or play"), 
            new Substitution("game"), 
            new FixedText("or go hunting for"), 
            new Substitution("plural noun"),
            new FixedText(". I like to spend my time"), 
            new Substitution("-ing verb"), 
            new FixedText("or"), 
            new Substitution("-ing verb"), 
            new FixedText("When parents go on a vacation, they spend their time eating three"), 
            new Substitution("plural noun"), 
            new FixedText("a day, and fathers play golf, and mothers sit around"),
            new Substitution("-ing verb"), 
            new FixedText(". Last summer, my little brother fell in a/an"), 
            new Substitution("noun"), 
            new FixedText("and got poison"), 
            new Substitution("plant"),
            new FixedText("all over his"),
            new Substitution("body part"),
            new FixedText(". My family is going to (the)"), 
            new Substitution("place "), 
            new FixedText(". and I will practice"),
            new Substitution("-ing verb"), 
            new FixedText(". arents need vacations more than kids because parents are always very"),
            new Substitution("adjective"),
            new FixedText("and because they haveto work"),
            new Substitution("number"),
            new FixedText("hours every day all year making enough"),
            new Substitution("plural noun"),
            new FixedText("to pay for the vacation.")));

        // From MAD, MAD, MAD LIBS® • Copyright © 1998 by Price Stern Sloan, a division of Penguin Putnam Books for Young Readers, New York.
        MadLib madLib2 = new MadLib(List.of(
            new FixedText("My"),
            new Substitution("adjective"),
            new FixedText("darling, I love you more than"),
            new Substitution("noun"), 
            new FixedText("itself. Each minute away from you is a/an"),
            new Substitution("noun"),
            new FixedText("each hour a/an"),
            new Substitution("adjective"),
            new FixedText("eternity. Without you, life if dull, doring, and"),
            new Substitution("adjective"),
            new FixedText("I feel like a baby without my"),
            new Substitution("noun"),
            new FixedText(", a toddle without my teddy"),
            new Substitution("noun"),
            new FixedText(", a dog without its"),
            new Substitution("noun"),
            new FixedText(". I can't get you out of my"),
            new Substitution("body part"),
            new FixedText(". I can't stop thinking about the color of your"),
            new Substitution("noun"),
            new FixedText(", the way you wear your"),
            new Substitution("noun"), 
            new FixedText(", the way you toss your"),
            new Substitution("noun"),
            new FixedText(", your"),
            new Substitution("adjective"),
            new FixedText("laugh, they way you"),
            new Substitution("verb"),
            new FixedText("a joke. This morning, when the mail"),
            new Substitution("noun"),
            new FixedText("brought your special delivery"),
            new Substitution("plural noun"),
            new FixedText(", my"),
            new Substitution("body part"),
            new FixedText("skipped a beat, my"), 
            new Substitution("body part"), 
            new FixedText("was in my throat, and my"),
            new Substitution("noun"),
            new FixedText("trembled so much, I could hardly"),
            new Substitution("verb"),
            new FixedText("your"),
            new Substitution("noun"),
            new FixedText(". What you said set my"),
            new Substitution("noun"),
            new FixedText("on fire. Do write again. Until then, I love you from the bottom of my"),
            new Substitution("body part"),
            new FixedText(". I will"),
            new Substitution("verb"), 
            new FixedText("you always, "), 
            new Substitution("your name")));   

        // From MAD LIBS® FROM OUTER SPACE • Copyright © 1989 by Price Stern Sloan, a division of Penguin Putnam Books for Young Readers, New York.
        MadLib madLib3 = new MadLib((List.of(
            new FixedText("When we look up into the sky on a/an"),
            new Substitution("adjective"),
            new FixedText("summer night, we see millions of tiny spots of light. Each one represents a/an"),
            new Substitution("noun"), 
            new FixedText("which is the center of a/an"),
            new Substitution("adjective"),
            new FixedText("solar system with dozens of"),
            new Substitution("plural noun"),
            new FixedText("reolving"),
            new Substitution("adjective"),
            new FixedText("around a distant sun. Sometimes these suns expand and begin"), 
            new Substitution("-ing verb"),
            new FixedText("their neighbors. Soon they will become so big, they will turn into"),
            new Substitution("silly word (plural)"),
            new FixedText(". Eventually they subside and become"),
            new Substitution("adjective"),
            new FixedText("giants or perhaps black"),
            new Substitution("plural noun"),
            new FixedText(". Our own planet, which we call"),
            new Substitution("first name"), 
            new FixedText(", circles around our"),
            new Substitution("adjective"),
            new FixedText("sun"), 
            new Substitution("number"), 
            new FixedText("times every year. There are eight other planets in our solar system. They are named"),
            new Substitution("first name"),
            new FixedText(", "),
            new Substitution("first name"),
            new FixedText(", "),
            new Substitution("first name"),
            new FixedText(", "),
            new Substitution("first name"),
            new FixedText(", "),
            new Substitution("first name"),
            new FixedText(", "),
            new Substitution("first name"),
            new FixedText(", Jupiter, and Mars. Scientists who study these planets are called"),
            new Substitution("plural noun"),
            new FixedText("."))));
        
        madLibList = List.of(madLib1, madLib2, madLib3);
        
        

        

        //creates SubstitutionsInput boxes
        SubstitutionsInput substInput = new SubstitutionsInput(madLib2, canvas.getHeight()/4);
        canvas.add(substInput);
        substInput.setCenter(canvas.getCenter());


        //creates back button
        Button back = new Button("BACK");
        back.onClick(() ->{
            canvas.removeAll();
            buildHomeScreen();
            SubstitutionsInput newInput = new SubstitutionsInput(madLib1, canvas.getHeight()/4);
            canvas.add(newInput);
            newInput.setCenter(canvas.getCenter());

        });

        //creates go button
        Button go = new Button("GO");
        go.setCenter(canvas.getWidth() * 0.5, canvas.getHeight() * 0.9);
        canvas.add(go); 

        // when go is clicked, remove all from canvas and add the substitution screen
        go.onClick(() -> {
            canvas.removeAll();
            madLibName.setCenter(canvas.getWidth() * 0.5, canvas.getHeight() * 0.05);
            canvas.add(madLibName);
            canvas.add(back);

            for (MadLibElement element : madLib1.getElements()) {
                System.out.print(element.getText() + " ");
            }
            System.out.println();
        });
        }

        public String getTitle(MadLib madLib) {
            String title = new String();
            if (madLib == madLibList.get(0)) {
                title += "Vacation Fun";
            }
            if (madLib == madLibList.get(1)) {                    
                title += "Love Letter";
            }
            if (madLib == madLibList.get(2)) {                    
                title += "Our Solar System";
            }

            return title; 
        }

        /* adds button for each MadLib option */

        public void addMadLibButton(MadLib madLib, double x) {
            buttonName = getTitle(madLib);
            changeMadLib = new Button(buttonName);
            changeMadLib.setCenter(x, 100);
            changeMadLib.onClick(() -> currentMadLib = madLib);
            canvas.add(changeMadLib);

        }

        public void buildHomeScreen() {
            canvas.add(TITLE_TEXT);
            x = 100;
            for (MadLib m : madLibList) {
            addMadLibButton(m, x);
            x += 150;
        }

        }
        

        // here we will repeat the process with new mad libs

        public static void main(String[] args) {
            new MadLibProgram().buildHomeScreen();
            
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
