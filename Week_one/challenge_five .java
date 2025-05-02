import java.util.Random;

public class Random {
    public static void main(String[] args) {
        Random random = new Random();

        int n;
        double x;

        n = random.nextInt(10);     
        x = random.nextDouble();     

        System.out.println("Random integer: " + n);
        System.out.println("Random double: " + x);
    }
}
