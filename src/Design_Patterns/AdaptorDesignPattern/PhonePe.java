package Design_Patterns.AdaptorDesignPattern;

public class PhonePe {
    private BankAPIAdaptor bankAPI;

    public PhonePe(BankAPIAdaptor bankAPI) {
        this.bankAPI = bankAPI;
    }

    double doSomething() throws InterruptedException {
        double currentBalance = bankAPI.getBalance("accountNumber");
        Thread.sleep(25 * 24 * 60 * 60 * 1000);
        return currentBalance * 2;
    }
}
