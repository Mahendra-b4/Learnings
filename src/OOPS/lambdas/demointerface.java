package OOPS.lambdas;

@FunctionalInterface
public interface demointerface {
    void fun();

//    void fun4();

    default void fun1(){
        System.out.println("This is default method in functional interface");
    }
}