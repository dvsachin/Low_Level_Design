package Design_Patterns.B_Structural_Patterns.FlyweightPattern.Example_Gaming.Problem;
// list of Robots
public class Robot {
    int coordinateX;
    int coordinateY;
    String type; //
    Sprites body; // graphic element - image = 50B

    // object Size ~= 4B + 4B + (11*2B char) +  50B => 80B
    public Robot(int coordinateX, int coordinateY, String type, Sprites body) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.type = type;
        this.body = body;
    }
    // getters and setters
}
