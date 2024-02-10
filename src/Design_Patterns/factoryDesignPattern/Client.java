package Design_Patterns.factoryDesignPattern;

import Design_Patterns.factoryDesignPattern.component.button.Button;
import Design_Patterns.factoryDesignPattern.component.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory androidUIFactory = flutter.createUIFactory("android");

        Button button = androidUIFactory.createButton();
        button.clickButton();

        UIFactory iosUIFactory = flutter.createUIFactory("ios");
        Menu menu = iosUIFactory.createMenu();
        menu.clickMenu();
    }
}
