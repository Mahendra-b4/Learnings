package DesignPatterns.adapterDP;

public class Client {

    public static void main(String[] args) {
        AppleCharger appleCharger = new AdapterCharger(new NMCharger());

        Iphone15 iphone15 = new Iphone15(appleCharger);

        iphone15.chargeIphone();
    }
}
