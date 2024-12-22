package SingletonPattern;

public class Client {
    public static void main(String[] args){
        DatabaseConnection db = DatabaseConnection.getInstance();
        System.out.println("DB Connection 1: " + db);

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println("DB Connection 2: " + db);
    }
}
