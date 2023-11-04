package ObserverDesignPattern.observable;

import ObserverDesignPattern.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    public List<NotificationObserver>observersList=new ArrayList<>();
    public int stockCount=0;
    @Override
    public void add(NotificationObserver notificationObserver){
        observersList.add(notificationObserver);
    }
    @Override
    public void remove(NotificationObserver notificationObserver){
        observersList.remove(notificationObserver);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationObserver observer:observersList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount==0){
            notifySubscriber();
        }
        stockCount=stockCount+newStockAdded;

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

}
