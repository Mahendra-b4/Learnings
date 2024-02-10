package Design_Patterns.AdaptorDesignPattern;

import Design_Patterns.AdaptorDesignPattern.thirdparty.ICICIBank.IciciBankAPI;

public class ICICIBankAPIAdaptor implements BankAPIAdaptor{
    private IciciBankAPI iciciBankAPI = new IciciBankAPI();

//    @Override
    public double getBalance(String accountNumber) {
//        String balance = iciciBankAPI.getBalance();
//        double doubleBalance = Double.parseDouble(balance);
//        return doubleBalance;
        return 0;
    }

//    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
