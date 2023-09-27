package Design_Patterns.C_Behavioural_Patterns.TemplateMethodPattern.Example_GameLoader;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("==========================================");
        BaseGameLoader wowLoader = new WorldOfWarcraftLoader();
        wowLoader.load();

        System.out.println("==========================================");

        BaseGameLoader diabloLoader = new DiabloLoader();
        diabloLoader.load();

    }
}
