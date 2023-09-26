package Design_Patterns.B_Structural_Patterns.FlyweightPattern.Example_Gaming.Solution;

public class Main {

    public static void main(String args[]){
        long startPoint = ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024);
        System.out.println("Started @ :: CONSUMED-MEMORY : "+ startPoint);

        for (int i=0; i<10_000_000_0; i++) {  // robot Type is cached and IRobot Type
            RoboticFactory.createRobot("HUMANOID").display(i+1,i+2);
            RoboticFactory.createRobot("ROBOTICDOG").display(i,i+2);
        }

        long endPoint = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024;
        System.out.println("Stopped @ :: CONSUMED-MEMORY : "+ endPoint);

        System.out.println("Program Consumed :: "+(endPoint-startPoint));
    }
}


