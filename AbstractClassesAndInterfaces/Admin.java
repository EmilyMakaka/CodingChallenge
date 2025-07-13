package AbstractClassesAndInterfaces;

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
