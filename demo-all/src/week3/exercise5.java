package week3;

public class exercise5 {
    public static void main(String[] args) {
        // When target = 'c', the expected output: Found 3 character c in the String.
        // When target = 'z', the excepted output: Not Found.
        //Count the target of character in a String.
        String str = "Welcome to the coding bootcamp"; // should not change
        char target = 'c'; // update this target to test the logic
        // use a loop to count the target of character in a String
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target);{
                count++;
            }
        }
        if(count > 0){
            System.out.println("\nFound " + count + " character c in the String.\n");
        } else {
            System.out.println("Not Found");
        }

        String ori = "Programming";
        String rev = "";
        //expect output = gnimmargorP
        //charAt()
        //String + char = String
        for(int i = ori.length() - 1; i >= 0; i--){
            char chr = ori.charAt(i);
            rev += chr;
            //round 1: "" + g = g
            //round 2: g + n = gn
            //round 3: gn + i = gni
            //round 4: looping...

        }
        System.out.println("rev String : " + rev);
    
    }
}
