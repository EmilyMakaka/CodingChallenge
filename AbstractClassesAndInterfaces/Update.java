package AbstractClassesAndInterfaces;

public class Update implements Datasource {
    @Override
    public void execute() {
        System.out.println("Updating record...");
    }
}