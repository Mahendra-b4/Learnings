package Design_Patterns.factoryDesignPattern.component.menu;

public class IOSMenu implements Menu{
    @Override
    public void clickMenu() {
        System.out.println("IOS Menu");
    }
}
