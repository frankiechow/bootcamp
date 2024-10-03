public class demodatatype {
    public static void main(String[] args) {
        // hihihi嗨嗨嗨.
        // automatic and accurate
        //data type
        //"int" -> Integer 整數 (both postive & negetive)
        //x -> variable 變量
        //from right to left -> assign value integer 1 to a varable x
        int x = 2;
        int y = 10;
        int a = x + y;
        // Tool: System.out.println()
        System.out.println(a);// click run
        
        //Math Operation: +, -, *, /
        int result = a - y * x;
        System.out.println(result);// Run
        //Math Operation: %
        int reaminder = 10 % 3;
        System.out.println(reaminder);// 1

        //double (a number with decimal places)
        double w = 10.5;
        // shortcut: sysout
        System.out.println(w);// 10.5
        // ! what is 10?
        // 10 is an int value
        // ! what is w2?
        // w2 is an int variable
        // Assign an int value to a double variable
        // int value -> double value
        // assign double value to double variable
        double w2 = 10;
        System.out.print(w2);// 10.0

        // Naming convention: camel case
        int englishScore = 70;
        int historyScore = 85;
        int mathScore = 90;

        // averageScore
        // int + int = int
        // int + double = double + double = double
        // step 1: int + int + int = int
        // step 2: int / int = int
        // step 3: assign int value to double variable
        double averageScore = (englishScore + historyScore + mathScore) / 3;
        System.out.println(averageScore); //81.0

        // Re-assignment
        x = 20;
        a = -40;
        // code block: main(String[] args) {}
        // ! int x = 9; // we cannot reuse the same variable name within a code block
        int x2 = 9;

        // how to backup a value
        int backup = x;
        x = 25;
        
        // Operatiors: +=, -=, *=, /=
        int e = 9;
        e = e + 1;
        System.out.println("e=" + e);
        e += 1;
        System.out.print("e=" + e);
        e -= 1;
        System.out.println("e=" + e);
        e *= 2;
        System.out.println("e=" + e);
        e /= 3;
        System.out.println("e=" + e);

        // ++
        e++; // increment by 1
        System.out.println("e=" + e);
        // --
        e--; // decrement by 1
        System.out.println("e=" + e);

    }
}