package Design_Patterns.C_Behavioural_Patterns.StatePattern.Example_PhoneStates;

public class MainApp {
    public static void main(String[] args) {

        Phone phone = new Phone();
        simulatePhoneClicks(phone);

    }
    private static void simulatePhoneClicks(Phone phone) {
        System.out.println("--------------------------------------");
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
        System.out.println("--------------------------------------");
    }

}