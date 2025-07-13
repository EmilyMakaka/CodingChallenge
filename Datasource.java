interface Datasource {
    void execute();
}

class Update implements Datasource {
    @Override
    public void execute() {
        System.out.println("Updating record...");
    }
}

class View implements Datasource {
    @Override
    public void execute() {
        System.out.println("Viewing record...");
    }
}

class Delete implements Datasource {
    @Override
    public void execute() {
        System.out.println("Deleting record...");
    }
}

class Account {
    protected int id;
    protected String name;
    protected Datasource myData;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void performOperation(Datasource myData) {
        this.myData = myData;
        System.out.print(name + " performs operation: ");
        myData.execute();
    }
}

class Admin extends Account {
    private String authPassword;

    public Admin(int id, String name, String password) {
        super(id, name);
        this.authPassword = password;
    }

    public void authorize() {
        if (authPassword != null && !authPassword.isEmpty()) {
            System.out.println("Admin " + name + " authorized using password: " + authPassword);
        } else {
            System.out.println("Authorization failed for Admin " + name);
        }
    }
}

class User extends Account {
    public User(int id, String name) {
        super(id, name);
    }
}

class Main {
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
