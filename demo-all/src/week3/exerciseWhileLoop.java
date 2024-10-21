package week3;
import java.util.Arrays;
public class exerciseWhileLoop {
    public static void main(String[] args) {
        // Exercise 1
    String inputString = "programming";
    char targetChar = 'm';

    // Objective : Practice : indexOf() , while-loop , if-else

    // Task: Write a program that takes a string and a character as input,
    // and counts how many times the character occurs in the string using indexOf()
    // and a while-loop. Make sure to handle cases where
    // the character is not found.
    int count = 0;
        int index = inputString.indexOf(targetChar);

        // The eternal while-loop, our trusty steed in the realm of logic
        while (index != -1) {
            count++;
            // Move past the found character to avoid counting it again
            index = inputString.indexOf(targetChar, index + 1);
        }

        // Time for some dramatic flair!
        if (count > 0) {
            System.out.println("The character '" + targetChar + "' appears " + count + " time" + (count == 1 ? "" : "s") + " in '" + inputString + "'.");
        } else {
            System.out.println("Alas, the character '" + targetChar + "' was not found in '" + inputString + "'. Perhaps it's on vacation?");
        }

        //exercise 2
        // Print Vowels in a String
        // Objective: Practice for-loop, charAt() , if-else, and String manipulation
    // Task: Write a program that takes a string input from the user
    // and prints all the vowels (a, e, i, o, u) present in the string using a for-loop
    // and if-else. Ensure both uppercase and lowercase
    // vowels are considered.

    // Example: Input string: "Java Programming". Output: a a o a i

    String inpuString2 = "Java Programming";
     // The sacred vowels, in both their upper and lower case forms
     String vowels = "aeiouAEIOU";
    for(int i = 0; i < inpuString2.length(); i++){
        char c = inpuString2.charAt(i);
            
        // If the character is a vowel, shout it from the digital rooftops
        if (vowels.indexOf(c) != -1) {
            System.out.print(c + " ");
        }
    }
    System.out.println();
    
    //exercise 3
    String str = "I am a boy";
    // substring()
    System.out.println("substring 1,3 : " + str.substring(1, 3));
    System.out.println("substring 2,4 : " + str.substring(2, 4));

    //exercise 4 
    //charAt(), indexOf()
    String str2 = "Java , Python , javaScript , typeScript";
    char target = 'P';
    for(int i = 0; i < str2.length(); i++){
        if(str2.charAt(i) == target){
            System.out.println("charAt() : " + i);
        }
    }
    System.out.println("indexOf() : " + str2.indexOf(target));

    //exercise 5
    // Nested Loop
    // 1 2 3 4 5
    // 2 4 6 8 10
    //3 6 9 12 15
    // 4 8 12 16 20
    // 5 10 15 20 25
        
    // Outer loop for rows
    for (int i = 1; i <= 5; i++) {
        // Inner loop for columns
        for (int j = 1; j <= 5; j++) {
            if (j == 1) {
                // If it's the first element in row, no space before
                System.out.print(i * j + " ");
            } else {
                // For all others, add a space
                System.out.print(i * j + " ");
            }
        } System.out.println();
    }
    //exercise 6
    int[] intArr = new int[4];
    int a = 1;
    int b = 3;
    int c = 5;
    int d = 7;
    intArr[0] = a;
    intArr[1] = b;
    intArr[2] = c;
    intArr[3] = d;
    System.out.println("print Array : " + Arrays.toString(intArr));
    for(int i = 0; i < intArr.length; i++){
        System.out.println("looping array : " + intArr[i]);
    }
    //exercise 7
    // String[] strArr = {"elel", "elel2"}; // not suggest
    // String[] strArr2 = new String[] {"elel", "elel2"};
    String[] strArr3 = new String[4];
    String[] strArr4 = new String[] {"a","b","c","d"};
    for(int i = 0; i < strArr3.length; i++){
        strArr3[i] = strArr4[strArr4.length - i - 1]; // "d, c, b, a"
        // when i = 0, strArr4[strArr4.length - i - 1] = strArr4[4 - 0 - 1] = strArr4[3]
        // when i = 1, strArr4[4 - 1 - 1] = strArr4[2]
        // when i = 2, strArr4[4 - 2 - 1] = strArr4[1]
        // when i = 3, strArr4[4 - 3 - 1] = strArr4[0]
    }
    System.out.println("exercise 7 : " + Arrays.toString(strArr3));
    // exercise 8 
    String[] arr = new String[]{"sad", "but", "ture"};
    System.out.println("exercise 8 : " + arr[0].charAt(0) + arr[1].charAt(1) + arr[2].charAt(2) + arr[2].charAt(3));
    //exercise 9
    // expect output: a b c d e f i j k x y z
    System.out.println("exercise 9 :");
    String[] arr1 = new String[]{"abc","def","ijk","xyz"};
    for(int i = 0; i < arr1.length; i++){
        // System.out.println(arr1[i]);
        // String str1 = arr1[i];
        //for (int j = 0; j < str.length; j++){
            String str1 = arr1[i];
            // For each string in the array, print each character
            for (int j = 0; j < str1.length(); j++) {
                System.out.print(str1.charAt(j) + " ");
            }
    }
    System.out.println();

        // exercise 10
        String[] arr2 = new String[]{"abc","def","ijk","xyz"};
        // swap , expect output : "xyz","ijk","def","abc"
        String[] arr3 = new String[arr2.length];
        for(int i = 0; i < arr2.length; i++){
            arr3[i] = arr2[arr2.length - i - 1];
        }
        System.out.println("exercise 10 : " + Arrays.toString(arr3));
    
    }
}
