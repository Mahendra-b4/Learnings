package Design_Patterns.decorator;

public class Client {
    public static void main(String[] args) {
        IceCreamConeConstitutes iceCreamConeConstitutes = new ChocoChips(
                                                            new VenillaScoop(
                                                            new StraberryScoop(
                                                            new OrangeCone(
                                                            new ChocoChips(
                                                            new ChocolateCone())))));

        System.out.println("Cost = "+iceCreamConeConstitutes.getCost());
        System.out.println("Description = "+iceCreamConeConstitutes.getDescription());
        System.out.println("Debug");
    }
}
