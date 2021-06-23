package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    List<User> subscriptions;

    public String getName() {
        return name;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public User(String name) {
        this.name = name;
        this.subscriptions = new ArrayList<>();
    }
    public void subscribe(User user){
        this.subscriptions.add(user);
    }
    public boolean isSubscribed(User user){
        for (User userName : subscriptions) {
           if (user.getName().equals(user.getName()))
               return true;
        }
        return false;
    }
    public boolean isFriend(User user){
       return this.isSubscribed(user) && user.isSubscribed(this);
    }
    public void sendMessage(User user, String text){
        MessageDataBase.addNewMessage(this, user ,text);

    }

    @Override
    public String toString() {
        return "User " + name;
    }
}
