package Design_Patterns.B_Structural_Patterns.FlyweightPattern.Example_TextEditor.Solution;

public class Main {

        public static void main(String args[]){

            long startPoint = ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024);
            System.out.println("Started @ :: CONSUMED-MEMORY : "+ startPoint);
            // [0-9A-Za-z] repeating sequence =  10_000_000_0 / (10+26+26)  times => 1612903

            for (int i=0; i<10_000_000_0; i++) {
                LetterFactory.crateLetter('A').display(i,i+1);
            }

            long endPoint = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024;
            System.out.println("Stopped @ :: CONSUMED-MEMORY : "+ endPoint);

            System.out.println("Program Consumed :: "+(endPoint-startPoint));

        }
    }



