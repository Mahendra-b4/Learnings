package Design_Patterns.singleton.DoubleCheckLocking;

public class DatabaseConnection {
    public static DatabaseConnection instance = null;

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null)
                    instance = new DatabaseConnection();
            }
        }
        return instance;
    }
}
