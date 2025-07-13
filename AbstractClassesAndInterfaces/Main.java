package AbstractClassesAndInterfaces;

public class Main {
    public static void main(String[] args) {
        User user = new User(101, "Alice");
        Admin admin = new Admin(1, "Bob", "secure123");

        Datasource view = new View();
        Datasource update = new Update();
        Datasource delete = new Delete();

        user.performOperation(view);
        admin.performOperation(update);
        admin.performOperation(delete);
        admin.authorize();

    }
}