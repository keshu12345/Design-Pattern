package behavioral.ObserverDesignPattern.observable;

import behavioral.ObserverDesignPattern.observer.NotificationObserver;

public interface StocksObservable {
    public void add(NotificationObserver notificationObserver);
    public void remove(NotificationObserver notificationObserver);
    public void notifySubscriber();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
