package SingletonPattern;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;

    String url;
    String username;
    String password;

    // make it private, so that there is no other way to create instance of DatabaseConnection
    private DatabaseConnection(){}

    public static synchronized DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }

        return instance;
    }

}
