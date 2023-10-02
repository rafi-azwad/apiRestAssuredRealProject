package core.Helper;

import java.util.Random;

public class RandomStringHelper {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final int LENGTH = 5;

    public static String generateRandomString() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }

        return sb.toString();
    }


}
