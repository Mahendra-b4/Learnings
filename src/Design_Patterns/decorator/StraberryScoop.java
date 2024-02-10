package Design_Patterns.decorator;

public class StraberryScoop implements IceCreamConeConstitutes{
    private IceCreamConeConstitutes iceCreamConeConstitutes;

    public StraberryScoop(IceCreamConeConstitutes iceCreamConeConstitutes){
        this.iceCreamConeConstitutes = iceCreamConeConstitutes;
    }
    @Override
    public int getCost() {
        return iceCreamConeConstitutes.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstitutes.getDescription() + " + Straberry Scoop";
    }
}
