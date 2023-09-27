package Design_Patterns.C_Behavioural_Patterns.ObserverPattern.Example_StoreNotifyService;

import static Design_Patterns.C_Behavioural_Patterns.ObserverPattern.Example_StoreNotifyService.Event.NEW_ITEM;
import static Design_Patterns.C_Behavioural_Patterns.ObserverPattern.Example_StoreNotifyService.Event.SALE;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notifyCustomers(NEW_ITEM);
    }

    public void salePromotion() {
        notificationService.notifyCustomers(SALE);
    }

    public NotificationService getService() {
        return notificationService;
    }

}