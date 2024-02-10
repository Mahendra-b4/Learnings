package OOPS.overloading;

public class A {

    void printHello(){
        System.out.println("Hello");
    }

    void printHello(String name){
        System.out.println("Hello "+name);
    }

    void  scaler(int x){
        System.out.println("hello int");
    }
    void scaler(Integer integer){
        System.out.println("hello integer");
    }
}
