import java.util.Scanner;
 public class Nationality {
    Scanner input = new Scanner(System.in);

    public void askUserDetails() {
        String Name;
        String Nationality;
     System.out.println("Name:");
        Name= input.next();
     System.out.println("Nationality:");
        Nationality= input.next();

        System.out.println("Hello, " + Name + "! " + "It is nice to meet someone who is "+Nationality+".");
    }
        public static void main(String[] args) {
            new Nationality().askUserDetails();
        }
 }
