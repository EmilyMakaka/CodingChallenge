package ExceptionHandling;

class Division {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero.");
        } finally {
            System.out.println("This always runs.");
        }
    }
}
