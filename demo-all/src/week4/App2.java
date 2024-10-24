package week4;
import java.util.Arrays;
public class App2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        for(int i : arr){
            if(i % 2 == 0){
                System.out.println(i + " is even no.");
            } else {
                System.out.println(i + " is odd no.");
            }
        }

        String str = "Java , Python , JavaScript , TypeScript , R , C++ , C#";
        //exercise 1
        // swap : expect output : String arr = [C#,C++,R,TypeScript,JavaScript,Python,Java]
        String[] langs = str.split(", ");

// Here comes the magic of array reversal with a rebellious twist
for (int i = 0; i < langs.length / 2; i++) {
    String temp = langs[i];
    langs[i] = langs[langs.length - 1 - i];
    langs[langs.length - 1 - i] = temp;
}

// Voilà, your array now reads like a rebel's manifesto!
String arr1 = Arrays.toString(langs);
System.out.println("String arr = " + arr1);

        // exercise 2
        // expect output : String str1 = "Java,Python,JavaScript,TypeScript,R,C++,C#"
        String str1 = str.replace(" " , "");
        System.out.println("exercise 2 = " + str1);
        
        // exercise 3
        // expect output : ava,ython,avascript,ypecript,++,#

        char[] charArr = str.toCharArray();
        char[] charArr2 = str.replace(" ", "").toCharArray();


        // if( == 'J' || == 'P')...
        String result = "";
        for(int i = 0; i < charArr2.length; i++){
            if(charArr2[i] >= 'A' && charArr2[i] <= 'Z'){
                continue;
            }
            result += charArr2[i];
        }
        System.out.println("exercise 3 : " + result);

    }
}
