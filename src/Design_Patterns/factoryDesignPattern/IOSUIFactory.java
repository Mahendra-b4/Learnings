package Design_Patterns.factoryDesignPattern;

import Design_Patterns.factoryDesignPattern.component.button.IOSButton;
import Design_Patterns.factoryDesignPattern.component.menu.IOSMenu;

public class IOSUIFactory implements UIFactory{
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }
}
