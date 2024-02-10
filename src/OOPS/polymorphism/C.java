package OOPS.polymorphism;

public class C extends A{
    String compName;

    void changeCompName(C c, String newCompName){
        c.compName = newCompName;
    }
}
