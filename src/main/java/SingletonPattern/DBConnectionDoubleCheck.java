package SingletonPattern;

// Database Connection class with Double Check Locking
//
public class DBConnectionDoubleCheck {
    private static DBConnectionDoubleCheck instance = null;

    String url;
    String username;
    String password;

    private DBConnectionDoubleCheck(){}

    public static DBConnectionDoubleCheck getInstance(){
        if(instance == null){
            synchronized (instance) {
                if(instance == null){
                    instance = new DBConnectionDoubleCheck();
                }
            }
        }

        return instance;
    }
}