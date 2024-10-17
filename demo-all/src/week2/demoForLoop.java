package week2;

public class demoForLoop {
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
        //loop 3 more times -> i = 2 -> i = 3...
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
        sum = 0;
        for (int i = 0; i < 11; i++) {
            if (i % 2 != 0){
            sum += i;
            } else {
            sum -= i;
            }
        System.out.println("odd number , sum : " + sum);
        }

        sum = 0;
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0);
            sum += i;
        System.out.println("even number , sum : " + sum);
    }
    // print out 10, 8, 6, 4 ,2
    for(int i = 10; i > 0; i--){
        if(i % 2 == 0){
            System.out.println(i);
        }
    }
    for(int i = 0; i < 10; i++){
        if (i % 2 == 0){
            System.out.println(10 - i);
        }
    }
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
        System.out.println("F = " + index);

        //output:aceg
        String str2 = "abcdefg";
        char output = 0;
        for(int i = 0; i < str2.length(); i++){
            if(i % 2 == 0){
            output += str2.charAt(i);
            }
        }
        System.out.println(output);

        //counting
        String str3 = "aaabbbcccdef";
        char target = 'c';
        int count = 0;
        for(int i = 0; i < str3.length(); i++){
            if(str3.charAt(i) == target){
            count++;
            }
        }
        System.out.println(count);

        count = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 3 ==0 || 1 % 4 == 0){
                count++;
            }
        }
        System.out.println(count);

        String str4 = "abcdabcdabcd";
        int index1 = -1;
        for(int i = 0; i < str4.length(); i++){
             if(str4.charAt(i) == 'c'){
                index1 = i;
             }
        }
        System.out.println(index1); // 10

        // Alternative: lastIndexOf
        System.out.println(str4.lastIndexOf('c')); // 10
        System.out.println(str4.indexOf('c')); // 2
        System.out.println(str4.indexOf("cda")); // 2

        // contains -> find petten is the fastest
        System.out.println(str4.contains("dab")); //true

        //substring(fromIndex, toIndex - 1)
        System.out.println(str4.substring(1, 3)); // bc

        //substring -> print the last 2 
        System.out.println(str4.substring(str4.length() - 2, str4.length())); // cd
        System.out.println(str4.substring(str4.length() - 2)); // cd




        //break: exit nearest code block
        for (int i = 0; i < 5; i++){
            System.out.println("i = " + i);
            if(i > 2){
                break; // break usually out on the  bottom
            }
        }

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                continue; // skip the rest, and back to i++
            }
        System.out.println("i = " + i);
        }
        
        for(int i = 0; i < 10; i++){
        if (i % 2 == 1 && (i < 3 || i > 7)){
            continue;
        }
        System.out.println("i2 = " + i);
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.println("i : " + i + " , j : " + j);
        }
    }

    //Nested Loop
    
    for (int i = 0; i < 3; i++) {
        for(int j = 0; j < 2; j++){
            System.out.println("*" + i + j); 
        }
    
    }
    

        // Must primitive
        //String method : length(), substring(), charAt(), equals(), indexOf()
        //if(condition is ture) { //括號後面冇;}

        //Optional
        //for Loop

    }
}
