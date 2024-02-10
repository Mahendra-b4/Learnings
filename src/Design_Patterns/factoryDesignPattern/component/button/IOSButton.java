package Design_Patterns.factoryDesignPattern.component.button;

public class IOSButton implements Button{
    @Override
    public void clickButton() {
        System.out.println("IOS Button");
    }
}
