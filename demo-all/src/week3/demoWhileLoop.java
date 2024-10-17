package week3;

public class demoWhileLoop {
    public static void main(String[] args) {
        //While
        //step 1: check if < 4
        //step 2: print 1
        //step 3: i++ -> 2
        //step 4: check if < 4
        //step 5: print 2
        //step 6: i++
        //step 7: check if < 4
        //step 8: print 3
        //until print i = 4
        int i = 0;
        while(i < 4){
            System.out.println(i);
            i++;
            System.out.println("hello");
        }
        System.out.println("finally = " + i);

        //counting
        String s = "abcdabcdabcd";
        //while loop, how many b inside the string
        int c = 0;
        while(i < s.length()){
            if(s.charAt(i) == 'b'){
                c++;
            }
        i++;
        }
        System.out.println(c);
    }
}
