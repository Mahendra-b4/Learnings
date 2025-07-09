package DesignPatterns.adapterDP;

public class Iphone15 {
    private AppleCharger appleCharger;

    public Iphone15(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargeIphone() {
        System.out.println("Iphone is charging");
        appleCharger.chargePhone();
    }
}
