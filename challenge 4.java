import java.util.Scanner;  // necessary to use Scanner

public class UserInfoExample {
    public void getUserInfo() {
        Scanner scanner = new Scanner(System.in);  // create scanner and connect to console

        String name;
        int age;

        System.out.print("Enter your name: ");  // read next word from input
        name = scanner.next();

        System.out.print("Enter your age: ");  // read an int from input
        age = scanner.nextInt();

        System.out.println("Hi " + name + ", you're " + age + " years wise!");
    }

    public static void main(String[] args) {
        new UserInfoExample().getUserInfo();
    }
}
