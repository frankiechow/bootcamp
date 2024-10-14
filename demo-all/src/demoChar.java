public class demoChar { 
    public static void main(String[] args) {
        String s = "hello";
        String s2 = "h";
        // data type: char, which stores single charactor ONLY.
        // char range 0 -> 65535

         //ASCII
         System.out.println((char)48);
         System.out.println((char)65);
         
        char c = 'h';
        // char c2 = "h";
        System.out.println(c); // h
        c = 'a'; // re-assignment
        System.out.println(c); // a
        c = '1';
        System.out.println(c); // 1
        c = '嗨';
        System.out.println(c); 
        c = ' ';
        System.out.println(c); // support space but not empty

        // int vs char
        // ! char -> int -> long -> float -> double
        char x = 'p';
        System.out.println(x + 1); // char + int -> int + int -> 113
        char x2 = '0';
        System.out.println(x2 + 0); // 48
        char x3 = 'A';
        System.out.println(x3 + 0); // 65
        char x4 = 'a';
        System.out.println(x4 + 0); // 97
        int i10 = x3 + 5;
        System.out.println(i10); // 70
        long l5 = x4 + 9; // char + int -> int + int -> long
        System.out.println(l5); //106
        char n = '你';
        System.out.println(n + 0); // 20320
        int y = 40000;
        char n2 = (char) y;
        System.out.println(n2); //鱀


    }
}
