package ObserverDesignPattern;

import ObserverDesignPattern.observable.IphoneObservableImpl;
import ObserverDesignPattern.observable.StocksObservable;
import ObserverDesignPattern.observer.EmailAlertObserverImpl;
import ObserverDesignPattern.observer.NotificationObserver;

public class Client {
    public static  void  main(String []args){
        StocksObservable iphoneObservable=new IphoneObservableImpl();
        NotificationObserver observer1=new EmailAlertObserverImpl("xyz@gmail.com",iphoneObservable);
        NotificationObserver observer2=new EmailAlertObserverImpl("xyz123@gmail.com",iphoneObservable);
        NotificationObserver observer3=new EmailAlertObserverImpl("keshav.rajput",iphoneObservable);
        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);
        iphoneObservable.setStockCount(10);
    }
}
