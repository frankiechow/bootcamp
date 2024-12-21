package week12;

import java.util.EmptyStackException;
import java.util.Stack;

public class DemoUncheckException {
    public static void main(String[] args) {
        int y = 0;
        // int x = 10 / y; // java.lang.ArithmeticException: / by zero
    
        int[] arr = new int[3];
        // System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds
        // for length 3
    
        // System.out.println(Integer.valueOf("abc")); // java.lang.NumberFormatException: For input string:
        // "abc"
    
        // concat(null, "abc");
    
        int count = 0;
        // Solution: try-catch
        try {
          System.out.println("abc"); // print
          int p = 10 / count; // error, go to print hello
          System.out.println("world"); // skipped
        } catch (ArithmeticException e) {
          System.out.println("hello"); // print
        }
    
        String input = "123a"; // this is an unknown user input
        try {
          int j = Integer.valueOf(input);
        } catch (NumberFormatException e) {
          System.out.println(input + " is not a Integer value.");
          // send email to customer
        }
    
        // We should not use try-catch for some Exceptions
        // for example, 1) array index outbound, 2) Null pointer exception
    
        int[] arr2 = new int[4];
        // SHOULD NOT
        int idx = 4;
        try {
          arr2[idx] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Index of array should be >= 0 and < array length.");
        }
        // SHOULD
        if (idx >= 0 && idx < arr2.length) {
          arr2[idx] = 100;
        }
    
        String s = null;
        // SHOULD NOT
        try {
          int length = s.length();
        } catch (NullPointerException e) {
          System.out.println("s should not be null.");
        }
        // SHOULD -> AVOID
        int length = s != null ? s.length() : 0;
    
        // throw (similar to return, but "throw" is for exception object)
    
        try {
          concat(null, "abc"); // java.lang.IllegalArgumentException
        } catch (IllegalArgumentException e) {
    
        }
    
        // pop() method throw runtime exception if stack is empty
        Stack<String> stack1 = new Stack<>();
        try {
          String s7 = stack1.pop();
          s7.charAt(10);
        } catch (EmptyStackException e) {
    
        } catch (ArrayIndexOutOfBoundsException e) {
    
        }
    
        // Custom Exception
        // During compile time, compiler doesn't know the parameter is invalid
        // calculate(-1, 3);
    
        // finally
        int y2 = 1;
        // Happy flow: 
        // Unhappy flow:
        try {
          int answer = 10 / y2; // happy/ unhappy
          // happy ...
        } catch (ArithmeticException e) {
          // unhappy ...
        } finally {
          // happy/ unhappy
          System.out.println("end.");
        }
        // System.out.println("end."); // happy/ unhappy
        
      }
    
      // "throw" -> Exception class object
      public static String concat(String s1, String s2) { // Argument = Parameter
        if (s1 == null)
          throw new IllegalArgumentException(); // IAE
        return s1.concat(s2);
      }
    
      // throw Business Exception
      public static int calculate(int x, int y) {
        if (x < 0 || y < 0)
          throw new BusinessRuntimeException();
        return x + y;
      }
    }