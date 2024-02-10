package Design_Patterns.factoryDesignPattern;

/*
    Practical Factory, generally called as factory
 */
public class UIFactoryFactory {
    public static UIFactory getUIFactorybyPlatform(String platform){
        if(platform.equals("android"))
            return new AndroidUIFactory();
        else if(platform.equals("ios"))
            return new IOSUIFactory();
        return null;
    }
}
