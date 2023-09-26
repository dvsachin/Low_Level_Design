package Design_Patterns.B_Structural_Patterns.FlyweightPattern.Example_Gaming.Problem;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        long startPoint = ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024);
        System.out.println("Started @ :: CONSUMED-MEMORY : "+ startPoint);
        for(int i=0; i<10_000_000_0; i++) {
            Sprites humanSprite = new Sprites();
            Robot humanRobotObj = new Robot(x+i, y+i, "Robot_Human",humanSprite);
            // 80B * 500000 = 2_50_00_000 Bytes ~= 24MB
        }
        for(int i=0; i<10_000_000_0; i++) {
            Sprites dogSprite = new Sprites();
            Robot dogRobotObj = new Robot(x+i, y+i, "Robot_Dog",dogSprite);
        }
        long endPoint = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024;
        System.out.println("Stopped @ :: CONSUMED-MEMORY : "+ endPoint);

        System.out.println("Program Consumed :: "+(endPoint-startPoint));
    }
}
