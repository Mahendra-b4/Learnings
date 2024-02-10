package Design_Patterns.decorator;

public class VenillaScoop implements IceCreamConeConstitutes{
    private IceCreamConeConstitutes iceCreamConeConstitutes;
    public VenillaScoop(IceCreamConeConstitutes iceCreamConeConstitutes){
        this.iceCreamConeConstitutes = iceCreamConeConstitutes;
    }
    @Override
    public int getCost() {
        return iceCreamConeConstitutes.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstitutes.getDescription() + " + Venilla Scoop";
    }
}
