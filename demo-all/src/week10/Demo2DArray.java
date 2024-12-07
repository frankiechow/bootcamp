package week10;

public class Demo2DArray { public static int finalPosition(int n, String[] commands) {
    int x = 0, y = 0; // Starting at the top left corner

    for (String cmd : commands) {
        switch (cmd) {
            case "UP":
                y = Math.max(0, y - 1); // Don't go above the grid!
                break;
            case "RIGHT":
                x = Math.min(n - 1, x + 1); // No slipping off the right edge!
                break;
            case "DOWN":
                y = Math.min(n - 1, y + 1); // Keep the snake from diving underground!
                break;
            case "LEFT":
                x = Math.max(0, x - 1); // Don't slide out left!
                break;
        }
    }

    // Convert 2D coordinates to 1D position
    return (y * n) + x;
}

public static void main(String[] args) {
    // Example 1
    System.out.println("Example 1: " + finalPosition(2, new String[]{"RIGHT", "DOWN"})); // Should print 3

    // Example 2
    System.out.println("Example 2: " + finalPosition(3, new String[]{"DOWN", "RIGHT", "UP"})); // Should print 1

    // Let's see if our snake can follow dance moves!
    System.out.println("Dance move: " + finalPosition(4, new String[]{"UP", "RIGHT", "DOWN", "LEFT"}));
}
}
