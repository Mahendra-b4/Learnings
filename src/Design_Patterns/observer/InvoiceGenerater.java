package Design_Patterns.observer;

public class InvoiceGenerater implements OrderPlacedSubscriber{
    public InvoiceGenerater(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        generateBill();
    }

    private void generateBill() {
        System.out.println("Generated Invoice");
    }
}
