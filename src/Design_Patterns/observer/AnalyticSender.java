package Design_Patterns.observer;

public class AnalyticSender implements OrderPlacedSubscriber, OrderCancelledSubscriber{
    public AnalyticSender(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announceOrderCancelled() {

    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Analytics done");
//        return null;
    }
}
