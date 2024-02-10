package Design_Patterns.decorator;

public class ChocolateCone implements IceCreamConeConstitutes{
    private IceCreamConeConstitutes iceCreamConeConstitutes;

    public ChocolateCone(){}

    public ChocolateCone(IceCreamConeConstitutes iceCreamConeConstitutes){
        this.iceCreamConeConstitutes = iceCreamConeConstitutes;
    }
    @Override
    public int getCost() {
        if(iceCreamConeConstitutes == null)
            return 30;
        return iceCreamConeConstitutes.getCost()+30;
    }

    @Override
    public String getDescription() {
        if(iceCreamConeConstitutes != null)
            return iceCreamConeConstitutes.getDescription() + " + Chocolate Cone";
        return "Chocolate Cone";
    }
}
