package Threads.creating1stThread;

import java.util.Scanner;

public class ClientAdder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Adder ad = new Adder(a, b);

        Thread t = new Thread(ad);

        t.start();
    }
}
