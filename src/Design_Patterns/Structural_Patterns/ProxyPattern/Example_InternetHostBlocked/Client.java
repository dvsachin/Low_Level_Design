package Design_Patterns.Structural_Patterns.ProxyPattern.Example_InternetHostBlocked;

public class Client {
    public static void main(String[] args) {
        /*
       Internet internet = new RealInternet();
       internet.connectTO("google.com");
       This way No-One can access a particular website in the world if we block some websites
         */
        Internet internet = new ProxyInternet();
        internet.connectTO("google.com");
        internet.connectTO("banned.com");

    }
}
