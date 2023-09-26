package Design_Patterns.B_Structural_Patterns.ProxyPattern.Example_InternetHostBlocked;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private static final List<String> bannedSites;
    private final Internet internet = new RealInternet();

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("banned.com");
    }
    @Override
    public void connectTO(String host) {
        if (bannedSites.contains(host)) {
            System.out.println("Access Denied");
            return;
        }
        internet.connectTO(host);
    }
}