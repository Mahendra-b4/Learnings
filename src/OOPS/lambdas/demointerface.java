package OOPS.lambdas;

@FunctionalInterface
public interface demointerface {
    void fun();

    default void fun1(){
        System.out.println("This is default method in functional interface");
    }
}