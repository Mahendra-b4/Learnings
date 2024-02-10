package Design_Patterns.singleton.EagerLoading;

public class DatabaseConnection {
//    public static DatabaseConnection instance = null;
//    private DatabaseConnection(){}
//
////    Below is a Singleton
////    But only works for Single Threaded
//    public static DatabaseConnection getInstance(){
//        if(instance == null)
//            instance = new DatabaseConnection();
//        return instance;
//    }
//

//    For Multi-Threaded

    public static DatabaseConnection instance = new DatabaseConnection();

    public static  DatabaseConnection getInstance(){
        return instance;
    }
}
