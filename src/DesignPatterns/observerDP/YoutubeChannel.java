package DesignPatterns.observerDP;

public interface YoutubeChannel {
    public void subscribe(User userSubscriber);

    public void unSubscribe(String name);

    public void notifySubscribers(String title);
}
