package Design_Patterns.C_Behavioural_Patterns.ObserverPattern.Example_StoreNotifyService;

import static Design_Patterns.C_Behavioural_Patterns.ObserverPattern.Example_StoreNotifyService.Event.NEW_ITEM;
import static Design_Patterns.C_Behavioural_Patterns.ObserverPattern.Example_StoreNotifyService.Event.SALE;

public class MainApp {
    public static void main(String[] args) {

        Store store = new Store();
        store.getService().subscribe(NEW_ITEM, new EmailMsgListener("JohnWick@killer.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("Transformers@robot.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("marvels@scifi.com"));
        store.getService().subscribe(NEW_ITEM, new MobileAppListener("DCComics"));

        store.newItemPromotion();

        System.out.println("==========================================");

        store.salePromotion();

        System.out.println("==========================================");

        store.getService().unsubscribe(SALE, new EmailMsgListener("JohnWick@killer.com"));
        store.salePromotion();

    }

}
