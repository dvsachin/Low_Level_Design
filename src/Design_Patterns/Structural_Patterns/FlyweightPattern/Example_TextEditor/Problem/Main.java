package Design_Patterns.Structural_Patterns.FlyweightPattern.Example_TextEditor.Problem;

public class Main {
    public static void main(String[] args) {

        long startPoint = ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024);
        System.out.println("Started @ :: CONSUMED-MEMORY : "+ startPoint);
        // [0-9A-Za-z] repeating sequence =  10_000_000_0 / (10+26+26)  times => 1612903

        for (int i=0; i<10_000_000_0; i++) {
            new Character('A',"Aerial",10,i+1,i+2);

        }

        long endPoint = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024;
        System.out.println("Stopped @ :: CONSUMED-MEMORY : "+ endPoint);

        System.out.println("Program Consumed :: "+(endPoint-startPoint));
    }
}
