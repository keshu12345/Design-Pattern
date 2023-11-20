package behavioral.ObserverDesignPattern.observer;

import behavioral.ObserverDesignPattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationObserver{
    String emailId;
    private StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable){
        this.emailId=emailId;
        this.stocksObservable=stocksObservable;
    }
//    public EmailAlertObserverImpl(String emailId){
//        this.emailId=emailId;
//    }


    @Override
    public void update() {
        System.out.println("Product in stock hurry up!!"+emailId);
        sendMail(emailId,"Product in stock hurry up!!");
    }
    private void sendMail(String emailId,String msg) {
        System.out.println("mail sent to ::"+emailId);
    }
}
