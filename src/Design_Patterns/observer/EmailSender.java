package Design_Patterns.observer;

public class EmailSender implements OrderPlacedSubscriber{
    public EmailSender() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Order Placed");
    }
}
