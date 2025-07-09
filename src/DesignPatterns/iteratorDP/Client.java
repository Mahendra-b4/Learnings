package DesignPatterns.iteratorDP;

public class Client {

    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();

        userManagement.addUser(new User("Mahe", "12"));
        userManagement.addUser(new User("Kiki", "89"));
        userManagement.addUser(new User("Dhanu", "09"));
        userManagement.addUser(new User("zack", "78"));;

        MyIterator myIterator = userManagement.getIterator();

        while (myIterator.hasNext()){
            System.out.println(myIterator.next().toString());
        }
    }
}
