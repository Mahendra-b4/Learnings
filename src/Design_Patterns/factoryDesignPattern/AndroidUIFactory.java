package Design_Patterns.factoryDesignPattern;

import Design_Patterns.factoryDesignPattern.component.button.AndroidButton;
import Design_Patterns.factoryDesignPattern.component.menu.AndroidMenu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }
}
