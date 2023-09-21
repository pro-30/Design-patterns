package designpatterns.demo.observerdesignpattern.observer;

import designpatterns.demo.observerdesignpattern.observable.StocksObservable;
import org.springframework.lang.NonNull;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    StocksObservable observable;
    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update(){
        sendMail(emailId, "Product is back in stock");
    }
    private void sendMail(@NonNull String emailId,@NonNull String msg) {
        System.out.println("Mail sent to: " + emailId);
    }

}
