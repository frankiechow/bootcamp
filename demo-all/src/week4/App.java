package week4;
import java.util.Arrays;
public class App {
    private static int i;

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        // Task: write a  program that swaps the first and last elements of an integer array.
        // expect result: [5,4,3,2,1]
        // String.length()
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[arr.length - i - 1];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
        System.out.println(Arrays.toString(arr));

        //example 2
        // indexOf()
        // finding all occurrences of a substring using indexOf() and a while-Loop
        String str = "abracadabra";
        String target = "";

        //example 3
        // objective: split a sentence into words and process each word.
        String sentence = "Learning Java is fun";
        String[] strArr = sentence.split(" "); // input param of .split(String regex)
        // approch 1
        System.out.println(Arrays.toString(strArr)); // [Learning, Java, is, fun]
        // approch 2
        for(int i = 0; i < strArr.length; i++);
        System.out.println(
            "word : " + strArr[i] + ", Length : " + strArr[i].length());

        //
        String stock = "QQQ,VOO,TSLA,SQQQ,TQQQ";
        String[] splitstock = stock.split(",");
        System.out.println("stock list : " + Arrays.toString(splitstock));
        for(int i = 0; i < splitstock.length; i++){
            System.out.println(
                "Fetch API by splitstock : " + splitstock[i]);
        }

        // other syntax of for-loop
        for(String arr2 : splitstock){
            System.out.println("arr2 : " + arr2);
        }
        int[] arr3 = new int[]{1,2,3,45,7};
        for(int i : arr3){
            System.out.println("for each loop : " + i);
        }
        for(int i : arr3){
            System.out.println("before break : " + i);
            if(i % 2 == 0)
            // break;
            // if(i % 2 != 0)
            // continue;
            System.out.println("Testing A");
            System.out.println("Testing B");
        }
    }
}
