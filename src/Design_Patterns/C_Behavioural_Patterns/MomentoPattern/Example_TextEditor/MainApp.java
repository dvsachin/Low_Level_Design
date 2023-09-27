package Design_Patterns.C_Behavioural_Patterns.MomentoPattern.Example_TextEditor;

public class MainApp {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("If at first you don’t succeed, try, try again.");
        editor.printText();
        System.out.println();
        editor.write("The only thing we have to fear is fear itself.");
        editor.printText();
        System.out.println();
        editor.write("Keep your friends close, but your enemies closer.");
        editor.printText();
        System.out.println("------------------------------------------------");
        editor.undo();
        editor.printText();
        System.out.println();
        editor.undo();
        editor.printText();
        System.out.println();
        editor.undo();
        editor.printText();
    }
}
