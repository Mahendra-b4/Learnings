package OOPS.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoOnStreams {

    public static class Car{
        int price;
        int speed;
        String brand;

        Car(int price, int speed, String brand){
            this.price = price;
            this.speed = speed;
            this.brand = brand;
        }

        @Override
        public String toString(){
            return "[Speed : " + this.speed + " , Price : " + this.price + " , Brand : " + this.brand + "]\n";
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // Print Odd numbers from the above list
        Stream<Integer> stream = list.stream();
        // Anonimous way of object creation for predicate
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2 == 1;
            }
        };
        // filter take predicate as parameter
        System.out.println(stream.filter(predicate).collect(Collectors.toList()));

        Stream<Integer> stream1 = list.stream();
        // Creating predicate object using lambda
        // Filter take Predicate as parameter
        Predicate<Integer> predicate1 = (num) -> num%2 == 1;
        System.out.println(stream1.filter(predicate1).collect(Collectors.toList()));

        // with 1 line -> combining all togeather
        System.out.println(list.stream().filter((num) -> num%2 == 1).collect(Collectors.toList()));
        /*
        Steps : How Stream Filter works

            1. Create a Stream.
            2. Stream will loop over elements over the list
            3. Pass every value to the list of Filter method
            4. Apply the Predicate function on every list value
            5. If the output of function on a value is true then take it or leave it.

         */

        List<Car> cars = Arrays.asList(
                new Car(100, 80, "abc"),
                new Car(1090, 100, "def"),
                new Car(500, 180, "ghi"),
                new Car(700, 280, "jkl"),
                new Car(900, 380, "mno")
        );

        // Q. Get the price of each Car
        // Will use Map method of Stream
        // Map take Function (Functional Interface) as parameter
        List<Integer> ans_price = cars.stream().map((car) -> car.price).collect(Collectors.toList());
        System.out.println("prices : "+ans_price);


        // Interview Problems
        System.out.println(cars.stream().filter((car) -> car.price > 600).collect(Collectors.toList()));

        System.out.println(cars.stream().map((car) -> car.price > 600).collect(Collectors.toList()));
    }
}
