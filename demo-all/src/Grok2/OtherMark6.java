package Grok2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class OtherMark6 {

    // Method to draw 6 unique numbers from 1 to 49
    public static List<Integer> drawNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers, new Random());
        return numbers.subList(0, 6);
    }

    public static void main(String[] args) {
        List<Integer> lotteryNumbers = drawNumbers();
        System.out.println("Mark Six Draw Numbers:");
        System.out.println(Arrays.toString(lotteryNumbers.toArray()));
        
        // Sorting is not required for the actual draw but might be for display purposes
        Collections.sort(lotteryNumbers);
        System.out.println("Sorted Numbers: " + lotteryNumbers);
    }
}
