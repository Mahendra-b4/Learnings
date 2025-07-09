package DesignPatterns.iteratorDP;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {
    private List<User> userList = new ArrayList<>();

    public void addUser(User user){
        userList.add(user);
    }

    public MyIterator getIterator(){
        return new MyIteratorImplementor(userList);
    }
}
