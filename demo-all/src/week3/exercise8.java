package week3;
import java.util.Scanner;
import java.util.Random;
public class exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        int guess;

        System.out.println("Guess a number between 1 to 100.");
        
        do {
            guess = scanner.nextInt();

            if (guess < target) {
                System.out.println("Too low.");
            } else if (guess > target) {
                System.out.println("Too high.");
            } else {
                System.out.println("Bingo! It's " + target);
            }

            // Allow another guess if not correct
            if (guess != target) {
                System.out.println("Guess again.");
            }

        } while (guess != target);

        scanner.close();
    }
}