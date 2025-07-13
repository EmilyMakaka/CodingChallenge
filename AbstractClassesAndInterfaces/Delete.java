package AbstractClassesAndInterfaces;

public class Delete implements Datasource {
    @Override
    public void execute() {
        System.out.println("Deleting record...");
    }
}
