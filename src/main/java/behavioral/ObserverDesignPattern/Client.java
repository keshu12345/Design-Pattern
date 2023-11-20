package behavioral.ObserverDesignPattern;

import behavioral.ObserverDesignPattern.observable.IphoneObservableImpl;
import behavioral.ObserverDesignPattern.observable.StocksObservable;
import behavioral.ObserverDesignPattern.observer.EmailAlertObserverImpl;
import behavioral.ObserverDesignPattern.observer.NotificationObserver;

public class Client {
    public static  void  main(String []args){
        StocksObservable iphoneObservable=new IphoneObservableImpl();
        NotificationObserver observer1=new EmailAlertObserverImpl("xyz@gmail.com",iphoneObservable);
        NotificationObserver observer2=new EmailAlertObserverImpl("xyz123@gmail.com",iphoneObservable);
        NotificationObserver observer3=new EmailAlertObserverImpl("keshav.rajput",iphoneObservable);
//        NotificationObserver observer1=new EmailAlertObserverImpl("xyz@gmail.com");
//        NotificationObserver observer2=new EmailAlertObserverImpl("xyz123@gmail.com");
//        NotificationObserver observer3=new EmailAlertObserverImpl("keshav.rajput");
        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);
        iphoneObservable.remove(observer2);
        iphoneObservable.setStockCount(10);
       int stockCount=iphoneObservable.getStockCount();
        System.out.println("Stock count : "+stockCount);
    }
}
