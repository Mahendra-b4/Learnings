package Design_Patterns.decorator;

public class ChocoChips implements IceCreamConeConstitutes{
    private IceCreamConeConstitutes iceCreamConeConstitutes;
    public ChocoChips(IceCreamConeConstitutes iceCreamConeConstitutes){
        this.iceCreamConeConstitutes = iceCreamConeConstitutes;
    }
    @Override
    public int getCost() {
        return iceCreamConeConstitutes.getCost() + 35;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstitutes.getDescription() + " + Choco Chips";
    }
}
