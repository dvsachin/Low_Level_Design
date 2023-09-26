package Design_Patterns.B_Structural_Patterns.DecoratorPattern.Example_NotificationService.Solution;

public class DatabaseService {
    public String getMailFromUsername(String username) {
        return username + "@Mail";
    }
    public String getPhoneNumberFromUsername(String username) {
        return "@Phone";
    }
    public String getFBNameFromUsername(String username) {
        return "@FBName";
    }
}
