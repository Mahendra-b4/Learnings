package Design_Patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance;
    private List<OrderPlacedSubscriber> orderPlacedSubscriberList = new ArrayList<>();

    public static Flipkart getInstance(){
        if(instance == null)
            return instance = new Flipkart();
        return instance;
    }
    void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscriberList.add(orderPlacedSubscriber);
    }
    public void orderPlaced(){
        for(OrderPlacedSubscriber list:orderPlacedSubscriberList){
            list.announceOrderPlaced();
        }
    }
    void unregisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscriberList.remove(orderPlacedSubscriber);
    }
}
