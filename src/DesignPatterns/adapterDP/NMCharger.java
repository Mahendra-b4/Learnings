package DesignPatterns.adapterDP;

public class NMCharger implements AndroidCharger{
    @Override
    public void chargeAndroidPhone() {
        System.out.println("Android Charger is plugged in");
    }
}
