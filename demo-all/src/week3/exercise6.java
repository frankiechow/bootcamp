package week3;

public class exercise6 {
    public static void main(String[] args) {
        // Expected output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
        // count the target of character in a String
        // for loop to print first 15 number in Fibonacci Sequence
        int count = 0;
        int firstNum = 0;
        int secNum = 1;
        for(int i = 0; i < 500; i++){
            int nextNum = firstNum + secNum;
            System.out.println("NextNum: " + nextNum);
            firstNum = secNum;
            secNum = nextNum;
            count++;
            if(count == 15) break;
        }
        count = 15;
        firstNum = 0;
        secNum = 1;
        int i = 0;
        System.out.println();
        System.out.print(firstNum + " " + secNum + " ");
        while(i < 16){
            int nextNum = firstNum + secNum;
            System.out.println(nextNum + " ");
            firstNum = secNum;
            secNum = nextNum;
            i++;
        }
    }
}
