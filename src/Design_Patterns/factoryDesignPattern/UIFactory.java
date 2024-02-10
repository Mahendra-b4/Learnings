package Design_Patterns.factoryDesignPattern;

import Design_Patterns.factoryDesignPattern.component.button.Button;
import Design_Patterns.factoryDesignPattern.component.menu.Menu;

// Abstract Factory
public interface UIFactory {

    Button createButton();
    Menu createMenu();
}
