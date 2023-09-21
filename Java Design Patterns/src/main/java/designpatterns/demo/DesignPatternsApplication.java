package designpatterns.demo;

import designpatterns.demo.observerdesignpattern.observable.IphoneObservableImpl;
import designpatterns.demo.observerdesignpattern.observable.StocksObservable;
import designpatterns.demo.observerdesignpattern.observer.EmailAlertObserverImpl;
import designpatterns.demo.observerdesignpattern.observer.MobileAlertObserverImpl;
import designpatterns.demo.observerdesignpattern.observer.NotificationAlertObserver;
import designpatterns.demo.strategydesignpattern.GoodsVehicle;
import designpatterns.demo.strategydesignpattern.SportsVehicle;
import designpatterns.demo.strategydesignpattern.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
		// strategy design pattern
		Vehicle vehicle = new GoodsVehicle();
//		vehicle.drive();

		// observer design pattern
		StocksObservable iphoneStockObservable = new IphoneObservableImpl();

		// registering the observer .
		NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer3 = new MobileAlertObserverImpl("pqr@gmail.com", iphoneStockObservable);

		//telling the observable who all are observing it
		iphoneStockObservable.add(observer1);
		iphoneStockObservable.add(observer2);
		iphoneStockObservable.add(observer3);

		iphoneStockObservable.setStockCount(10);
	}

}
