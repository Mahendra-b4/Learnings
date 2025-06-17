package DesignPatterns.singletonDP.DoubleCheckLocking;

public class Laptop {

    private String name;

    public String getName(){
        return name;
    }
    private static Laptop laptop;

    private Laptop(String name){
        this.name = name;
    }

    public static Laptop getInstance(String name){
        if(laptop == null){
            synchronized (Laptop.class){
                if(laptop == null)
                    laptop = new Laptop(name);
            }
        }
        return laptop;
    }

}
