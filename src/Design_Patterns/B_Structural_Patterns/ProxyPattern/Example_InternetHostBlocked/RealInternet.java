package Design_Patterns.B_Structural_Patterns.ProxyPattern.Example_InternetHostBlocked;

public class RealInternet implements Internet {

    @Override
    public void connectTO(String host) {
        System.out.println("Opened Connection to : "+host);
    }
}
