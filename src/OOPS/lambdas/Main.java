package OOPS.lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
//        We can't create an object f interface
//        So we need to create class implement interface and create object of thet class

        // Way1 -> by new class
        DemoClass dm1 = new DemoClass();

        // Way2 -> Anonimous method, creating object of interface by implementing the abstract method
        demointerface dm2 = new demointerface() {
            @Override
            public void fun() {
                System.out.println("by Anonimous method, directly creating object of interface");
            }
        };

        // Way3 -> lambda
        demointerface dm3 = () -> {
            // Provide implementation of abstract method
            // It directly refers to abstract method as we've only 1 abstact method in functional interface
            System.out.println("Lambda method of implemntation of interface");
        };

        dm1.fun();
        dm2.fun();
        dm3.fun();

        // Anonimous way of implementation for Predicate Functional Interface
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 10;
            }
        };
        System.out.println(predicate.test("Mahendra Babu"));

        // lambda
        // () -> Input Parameters
        // {} -> Method/Function implemntation
        // without {} and return also we can use lambda
        Predicate<String> predicate1 = (str) -> str.length() > 10;
        System.out.println(predicate1.test("Mahendra Babu"));

        // BinaryOperator with lambda
        BinaryOperator<String> binaryOperator = (s1, s2) -> s1 + s2;
        System.out.println(binaryOperator.apply("Mahendra ","Babu"));


    }
}
