package Design_Patterns.factoryDesignPattern;

public class Flutter {
    public void setTheame(){
        System.out.println("Setting Theame  ");
    }


    public UIFactory createUIFactory(String platform){
        return UIFactoryFactory.getUIFactorybyPlatform(platform);
    }
}
