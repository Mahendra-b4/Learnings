package DesignPatterns.observerDP;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        YoutubeChannel mb_coder = new MB_Coder("MB_Coder");

        User m = new Subscriber("m");
        User b = new Subscriber("b");

        mb_coder.subscribe(m);
        mb_coder.notifySubscribers("Java Learning");
        mb_coder.subscribe(b);
        mb_coder.notifySubscribers("Java OOPS");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Select one from below options");
            System.out.println("Enter: 1, for adding new subscriber");
            System.out.println("Enter: 2, for unsubscribing");
            System.out.println("Enter: 3, uploading new video");
            System.out.println("Enter: 4, for exiting");

            String input = br.readLine();
            System.out.println("sout = "+input);
            if(input.matches("1")){
                System.out.println("sout = "+input);
                System.out.println("Enter subscriber name: ");
                String name = br.readLine();
                User user = new Subscriber(name);
                mb_coder.subscribe(user);
            }
            else if(input.matches("2")){
                System.out.println("Enter subscriber name: ");
                String name = br.readLine();
                mb_coder.unSubscribe(name);
            }
            else if(input.matches("3")){
                System.out.println("Enter video title: ");
                String title = br.readLine();
                mb_coder.notifySubscribers(title);
            }
            else if(input.matches("4")){
                System.out.println("Thank You!!!");
                break;
            }
            else{
                System.out.println("Enter correct input");
            }
        }
    }
}
