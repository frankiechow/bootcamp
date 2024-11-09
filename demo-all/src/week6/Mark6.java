package week6;

import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class Mark6 {

    private static final int NUMBERS_TO_CHOOSE = 6;
    private static final int MAX_NUMBER = 49;
    private static final Random RANDOM = new Random();

    public static int[] generateLuckyNumbers() {
        Integer[] numbers = new Integer[NUMBERS_TO_CHOOSE];
        
        // Generate unique numbers
        for (int i = 0; i < NUMBERS_TO_CHOOSE; i++) {
            int number;
            do {
                number = RANDOM.nextInt(MAX_NUMBER) + 1;
            } while (Arrays.asList(numbers).contains(number));
            numbers[i] = number;
        }

        // Shuffle for good measure
        Collections.shuffle(Arrays.asList(numbers), RANDOM);
        
        // Convert back to int array for return
        return Arrays.stream(numbers).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println("Greetings, Earthling! Welcome to the Galactic Lottery Simulator 3000!");
        System.out.println("Your lucky numbers for today are:");
        
        int[] luckyNumbers = generateLuckyNumbers();
        for (int i = 0; i < luckyNumbers.length; i++) {
            System.out.print(luckyNumbers[i]);
            if (i < luckyNumbers.length - 1) System.out.print(", ");
        }
        System.out.println("\nMay the odds be ever in your favor... or at least slightly better than average!");
    }
}
