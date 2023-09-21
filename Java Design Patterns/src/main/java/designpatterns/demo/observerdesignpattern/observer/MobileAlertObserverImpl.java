package designpatterns.demo.observerdesignpattern.observer;

import designpatterns.demo.observerdesignpattern.observable.StocksObservable;
import org.springframework.lang.NonNull;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StocksObservable observable;
    public MobileAlertObserverImpl(String emailId, StocksObservable observable) {
        this.observable = observable;
        this.userName = emailId;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "Product is back in stock.");
    }
    private void sendMsgOnMobile(@NonNull String userName, @NonNull String msg){
        System.out.println("Message sent to: "+ userName);
    }
}
