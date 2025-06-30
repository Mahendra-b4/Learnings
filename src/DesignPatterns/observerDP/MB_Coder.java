package DesignPatterns.observerDP;

import java.util.ArrayList;
import java.util.List;

public class MB_Coder implements YoutubeChannel{
    List<User> subscribersList;
    String channelName;

    public MB_Coder(String channelName) {
        this.subscribersList = new ArrayList<>();
        this.channelName = channelName;
    }

    @Override
    public void subscribe(User userSubscriber) {
        subscribersList.add(userSubscriber);
    }

    @Override
    public void unSubscribe(String name) {
        for(User user:subscribersList) {
            if(user.getName().matches(name))
                subscribersList.remove(user);
        }
    }

    @Override
    public void notifySubscribers(String title) {
        for(User subscriber:subscribersList){
            subscriber.notified(title, channelName);
        }
    }
}
