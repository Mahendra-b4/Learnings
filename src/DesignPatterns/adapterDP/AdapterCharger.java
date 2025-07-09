package DesignPatterns.adapterDP;

public class AdapterCharger implements AppleCharger {

    private AndroidCharger androidCharger;

    public AdapterCharger(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargePhone() {
        androidCharger.chargeAndroidPhone();
        System.out.println("Adapter is plugged in to charge Iphone using Android Charger");
    }
}
