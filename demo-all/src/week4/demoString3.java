package week4;
import java.util.Arrays;
public class demoString3 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "apple";
        System.out.println(s1.compareTo(s2)); // 7 -> 'h' - 'a'

        String s3 = "abbbbb";
        System.out.println(s3.compareTo(s2)); // -14 -> 'b' - 'a'

        String s4 = "hello!";
        System.out.println(s1.compareTo(s4)); // -1

        String s5 = "";
        if(!s5.isEmpty()){
            System.out.println("s5 is not empty");
        }
        String s6 = " ";
        System.out.println(s6.isBlank()); // true
        System.out.println(s6.isEmpty()); // false
        System.out.println(s5.isBlank()); // true
        System.out.println(s5.isEmpty()); // true

        String s7 = "hello world !!!";
        String s8 = s7.replace("o", "x");
        System.out.println(s8); // hellx wxrld !!!

        // given a String (s7), convert to target String
        // which the character is in even index & it is a character, make it become BlOCK leter.
        // i.e. "hello world !!!" -> "HeLlO WoRlD"
        // Tip: You have to construct a new string by characters

        //char vs String
        char[] chs = s7.toCharArray();
        System.out.println(Arrays.toString(chs)); //[h, e, l, l, o,  , w, o, r, l, d,  , !, !, !]

        //Searching Alogorithm
        // -> String + for loop + charAt

        //Revise the String Algorithm
        //String -> toCharArray() -> char[] -> edit the value in char[] -> String
        String a = "apple";
        char[] ch2 = a.toCharArray();
        for(int i = 0; i < a.length(); i++){
            
        }

    }
}
