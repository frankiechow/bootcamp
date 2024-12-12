package week10;
import java.util.Arrays;

public class Demo2DArray {
  public static void main(String[] args) {
    int[] arr = new int[] {2, 100, 1}; //
    // 2d array
    int[][] arr2 = new int[][] {{1, 2, 3}, {4, 5, 6}, {0, 0, 0}};
    // 1 2 3, i = 0, when j = 0 -> 1; when j = 1 -> 2
    // 4 5 6, i = 1
    // 0 0 0, i = 2

    System.out.println(arr2[1][2]); // 6, 2nd row, 3rd column
    for (int row = 0; row < arr2.length; row++) { // how many row
      for (int col = 0; col < arr2[row].length; col++) { // how many column
        System.out.println(arr2[row][col]);
      }
    }
    // String[][]
    String[][] strings = new String[][] {{"abc", "def"}, {"vincent", "oscar"}};
    String[][] strings2 = new String[0][0]; // 0 x 0
    String[] strings3 = new String[0];

    String[][] strings4 = new String[2][2]; // 2 x 2
    System.out.println(strings4[1][1]); // null

    int[][] integers = new int[2][2];
    System.out.println(integers[1][1]); // 0

    System.out.println(strings); // Object.toString()
    System.out.println(Arrays.toString(arr)); // 1d array
    System.out.println(Arrays.deepToString(strings)); // 2d array

    System.out.println(square(sum(3, 4))); // 49
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  public static int square(int num) {
    return num * num;
  }

}