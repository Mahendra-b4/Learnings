package Design_Patterns.AdaptorDesignPattern;

import Design_Patterns.AdaptorDesignPattern.thirdparty.YESBank.YesBankAPI;

public class YESBankAPIAdaptor implements BankAPIAdaptor{
    private YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
