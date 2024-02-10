package Design_Patterns.factoryDesignPattern.component.button;

public class AndroidButton implements Button{
    @Override
    public void clickButton() {
        System.out.println("Android Button");
    }
}
