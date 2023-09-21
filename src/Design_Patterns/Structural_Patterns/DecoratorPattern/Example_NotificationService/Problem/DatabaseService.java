package Design_Patterns.Structural_Patterns.DecoratorPattern.Example_NotificationService.Problem;

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
