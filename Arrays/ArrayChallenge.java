package Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        String[] productCodes = { "X105", "A220", "B555", "C15", "X285", "M505", "P215", "X005" };

        for (String code : productCodes) {
            if (code.endsWith("5")) {
                System.out.println(code);
            }
        }
    }
}
