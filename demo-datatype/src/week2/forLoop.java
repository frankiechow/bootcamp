package week2;

public class forLoop {
    public static void main(String[] args) {
        int x = 3;
        // x *= 3;
        // x *= 3;
        // x *= 3;
        // x *= 3;
        // System.out.println("x : " + x);
        //for (starting point; ending point; counting "++" / "--" / "*=" / "/=")
        for (int i = 0; i < 10; i++);{
            x *= 3;
        }
        System.out.println(x);
        //for loop
        //initialization (variable declaration & assignment) ; countinue criteria ; incremental operation
        //step 1 : i = 0
        //step 2 : check if i < 4 ? yes
        //step 3 : print "hello"
        //step 4 : i++ -> i become 1
        //step 5 : i = 1
        //loop 3 more times
        //step i = 4
        //check if i < 4 ? no
        //finally : exit the loop
        for (int i = 0; i < 4; i++) { //i = 0,1,2,3
            System.out.println("hello");
        }
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
            System.out.println("round : " + i + " , " + "sum : " + sum);
        }
        for (int i = 0; i < 11; i++) {
            if (i % 2 != 0);
            sum += i;
        }
        System.out.println("odd number , sum : " + sum);
        

        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0);
        }
        System.out.println("even number , sum : " + sum);

        //continue
        sum = 0;
        for (int i = 0; i < 11; i++) {
            if (i == 7)
            continue;
            sum += i;
        }
        System.out.println("how to use continue in for loop : " + sum); //sum = 48

        String str1 = "ABCDEFG";
        char ch1 = 'F';
        int index = 0;
        //find the index of 'F' within str1
        //step 1 : i = 0
        //step 2 : charAt(0)
        //step 3 : charAt(0) = A
        //condition : find 'F'
        //step 4 : A !=F
        //step 5 : i=1
        //step 6 : CharAt(1)
        //step 7 : charAt(1) = B
        //keep looping untill charAt() = F
        //str1.charAt(5) == F
        //str1.charAt(i) == ch1
        //index = i
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'F') {
                index = i;
            }
        }
        System.out.println("index = " + index);

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.println("i : " + i + " , j : " + j);
            }
        }

        //Nested Loop
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println();


        for (int i = 0; i < 5; i++) {
            continue;
        }
        System.out.println("*");

        // Must primitive
        //String method : length(), substring(), charAt(), equals(), indexOf()
        //if(condition is ture) { //括號後面冇;}

        //Optional
        //Loop
    }
}
