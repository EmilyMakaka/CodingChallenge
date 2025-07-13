package AbstractClassesAndInterfaces;

public class View implements Datasource {
    @Override
    public void execute() {
        System.out.println("Viewing record...");
    }
}
