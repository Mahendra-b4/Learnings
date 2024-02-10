package Design_Patterns.decorator;

public class OrangeCone implements IceCreamConeConstitutes{
    private IceCreamConeConstitutes iceCreamConeConstitutes;

    public OrangeCone(){};
    public OrangeCone(IceCreamConeConstitutes iceCreamConeConstitutes){
        this.iceCreamConeConstitutes = iceCreamConeConstitutes;
    }
    @Override
    public int getCost() {
        if(iceCreamConeConstitutes == null) return 25;
        return iceCreamConeConstitutes.getCost()+25;
    }

    @Override
    public String getDescription() {
        if(iceCreamConeConstitutes == null) return "Orange Cone";
        return iceCreamConeConstitutes.getDescription()+" + Orange Cone";
    }
}
