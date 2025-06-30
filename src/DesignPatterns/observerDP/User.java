package DesignPatterns.observerDP;

public interface User {

    public void notified(String title, String channelName);
    public String getName();
}
