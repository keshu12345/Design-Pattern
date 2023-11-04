package ObserverDesignPattern.observer;

import ObserverDesignPattern.observable.StocksObservable;

public class MobileObserverAlertImpl implements NotificationObserver {
    String userName;
    StocksObservable stocksObservable;
    MobileObserverAlertImpl(String emailId,  StocksObservable stocksObservable){
        this.userName=emailId;
        this.stocksObservable=stocksObservable;
    }

    @Override
    public void update() {
        System.out.println("product in stock hurry up!!"+userName);
        sendMail(userName,"product in stock hurry up!!");
    }

    private void sendMail(String userName,String msg) {
        System.out.println("message sent to ::"+userName);
    }
}
