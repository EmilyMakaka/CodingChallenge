package AbstractClassesAndInterfaces;

public class Account {
    protected int id;
    protected String name;
    protected Datasource myData;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void performOperation(Datasource _myData) {
        this.myData = _myData;
        System.out.print(name + " performs operation: ");
        myData.execute();
    }
}