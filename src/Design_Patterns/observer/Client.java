package Design_Patterns.observer;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = Flipkart.getInstance();
        EmailSender emailSender = new EmailSender();
        InvoiceGenerater invoiceGenerater = new InvoiceGenerater();
        AnalyticSender analyticSender = new AnalyticSender();

        flipkart.orderPlaced();
        System.out.println("Debug");
    }
}
