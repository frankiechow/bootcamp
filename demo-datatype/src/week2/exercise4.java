package week2;

public class exercise4 {
    public static void main(String[] args) {
        //Expected output
        //The first 10 nature numbers are, except 6:
        //12345678910
        //use System.out.print()
        
        System.out.println("The first 10 nature numbers are, except 6:");
        for (int i = 0; i < 11; i++) {
            if (i == 6)
            continue;
            
        System.out.print(i);
        }
        System.out.println();

        //example : counting
        // 1- 100 how many numbers can be divided by 3 or 4?
        int c = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 || i % 4 == 0) 
                c++;
                // System.out.println(c + " can be dividing by 3 or 4");
        }
        System.out.println(c + " numbers can be dividing by 3 or 4");

        //example 2
        // 1- 50 find the total number , which sum all odd number and subtract all even number
        int total = 0;
        for (int i = 1; i < 51; i++) {
            if (i % 2 != 0) {
                total += i;
            } else {
                total -= i;
            }
        }
        System.out.println("total = " + total);

    }
}
