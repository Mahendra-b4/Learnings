package DesignPatterns.observerDP;

public class Subscriber implements User{

    String name;

    public String getName() {
        return name;
    }

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified(String title, String channelName) {
        System.out.println("Hi "+this.name+", "+ channelName +" has uploaded a new video, title: "+title);
    }

}
