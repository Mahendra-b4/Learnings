package Design_Patterns.singleton.Synchnorized;

public class DatabaseConnection {
    public static DatabaseConnection instance = null;
    private DatabaseConnection(){}

    public static synchronized DatabaseConnection getInstance(){
        if(instance == null)
            instance = new DatabaseConnection();
        return instance;
    }
}
