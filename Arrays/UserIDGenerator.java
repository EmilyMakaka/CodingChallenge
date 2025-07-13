package Arrays;

import java.util.Random;

public class UserIDGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        String[] userIDs = new String[5];

        for (int i = 0; i < userIDs.length; i++) {

            char prefix = (char) (random.nextInt(5) + 'a');

            int number = random.nextInt(100);
            String suffix = String.format("%02d", number);

            userIDs[i] = prefix + suffix;
        }

        for (String id : userIDs) {
            System.out.println(id);
        }
    }
}
