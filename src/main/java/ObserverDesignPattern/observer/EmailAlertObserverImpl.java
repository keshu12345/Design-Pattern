package ObserverDesignPattern.observer;

import ObserverDesignPattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationObserver{
    String emailId;
    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable){
        this.emailId=emailId;
        this.stocksObservable=stocksObservable;
    }

    @Override
    public void update() {
        System.out.println("Product in stock hurry up!!"+emailId);
        sendMail(emailId,"Product in stock hurry up!!");
    }
    private void sendMail(String emailId,String msg) {
        System.out.println("mail sent to ::"+emailId);
    }
}
