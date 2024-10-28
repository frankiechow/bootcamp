package week5;

public class demoForEach {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 2, 4, 9, -3};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        // for-each
        // disadvantage: only access the element of that iteration
        for(int x : arr) {
            System.out.println(x);
        }

        //do-while loop
        //at least do once
        int x = 10;
        do{
            System.out.println("x = " + x);
            x++;
        } while(x < 14); // when x < 14, loop continues...
        //x=10
        //x=11
        //x=12
        //x=13

        String[] arr2 = new String[] {"hello", "xxx", "apple"};
        for(String s : arr2){
            System.out.println(s);
        }

        String str1 = "abaababbbyabrs";
        // Find out which character appear the most number of times
        // result: b

    }
}
