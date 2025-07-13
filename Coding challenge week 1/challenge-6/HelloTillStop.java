import java.util.Scanner;
public class HelloTillStop{
    static Scanner sc = new Scanner(System.in);

    static void showHello() {
        String choice;

        System.out.println("For Hello type go, anything else to stop");
        choice = sc.next();

                while ("go".equals(choice)){
                    System.out.println("Hello");
                    choice = sc.next();
                }
    }
    public static void main(String[]args) {
        HelloTillStop.showHello();
    }
}
