package SingletonPattern;

// Database Connection class with Double Check Locking
public class DatabaseConnectionDoubleLocking {
    private static DatabaseConnectionDoubleLocking instance = null;

    String url;
    String username;
    String password;

    private DatabaseConnectionDoubleLocking(){}

    public static DatabaseConnectionDoubleLocking getInstance(){
        if(instance == null){
            synchronized (instance) {
                if(instance == null){
                    instance = new DatabaseConnectionDoubleLocking();
                }
            }
        }

        return instance;
    }
}