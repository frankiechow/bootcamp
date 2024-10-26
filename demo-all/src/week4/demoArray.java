package week4;
import java.util.Arrays;
public class demoArray {
    public static void main(String[] args) {
        int x = 10;
        // ! Why do we need array?
        // ! Store a set of same type of values

        int[] arr = new int[5];
        // "new" create an array object
        // int[5] an int array object able to store 5 int values
        
        // index starts from 0
        // so int[5] -> index from 0 to 4
        System.out.print(arr[0] + " , ");
        System.out.print(arr[1] + " , ");
        System.out.print(arr[2] + " , ");
        System.out.print(arr[3] + " , ");
        System.out.print(arr[4]);
        System.out.println();
        // Bug
        // System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        
        // edit values
        arr[2] = 99;
        arr[4] = 1;
        System.out.println(arr[2] + arr[4]); // 100
        // read array by loop
        for (int i = 0; i < arr.length; i++){ // i < 5, i = 0,1,2,3,4
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //for loop to sum up all values in the int array
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
            System.out.println("sum = " + sum);
            
            arr[1] = 8;
            arr[3] = 14;
            // sum up all even no. 
            int sum2 = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] % 2 == 0){
                    sum2 += arr[i];
                }
            }
            System.out.println("sum2 = " + sum2);

            //swap -> exchange the value for the arr[head] and arr[tail]
            int backup = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = backup;
            System.out.println(arr[0]); // arr[0] swap to arr[4] -> 1
            // move the head value to the tail
            // 0 , 8 , 99 , 14 , 1
            // result: 8 99 14 1 0
            for(int i = 0; i < arr.length - 1; i++){
                backup = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = backup;
            }
            System.out.println(Arrays.toString(arr)); // [8, 99, 14, 0, 1]

            // find max value
            // result: 99
            int max = Integer.MIN_VALUE; // the min value of int
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > max)
                max = arr[i];
            }
            System.out.println("max = " + max);

            // find mix value
            // result: 0
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] < min)
                min = arr[i];
            }
            System.out.println("min = " + min);

            // create long array
            long[] arr2 = new long[4];
            arr2[0] = -100;
            arr2[1] = -9;
            arr2[2] = 50;
            arr2[3] = 14;
            // copy all even no. from arr2 to arr3

            //counting
            int c = 0;
            for(int i = 0; i < arr.length; i++){
                if(i % 2 == 0){
                    c++;
                }
            }
            long[] arr3 = new long[c];
            int index = 0;
            for (long num : arr2) {
                if (num % 2 == 0) {
                    arr3[index++] = num;
    }
}
            System.out.println(Arrays.toString(arr3));

            // move the max value to the tail
            
    }
}
