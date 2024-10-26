package week1;
public class demoInteger {
    public static void main(String[] args) {
        //byte , short, int, long
        byte b1 = 3;
        System.out.println(b1);
        //byte is in the range between -128 and 127
        b1 = -128;
        b1 = 127;
        // b1 = -129; // cant convert from int to byte

        short s1 = -32768;
        short s2 = 32767;
        System.out.println(s1);
        System.out.println(s2);
        // s1 = -32769; // cant
        // s2 = 32768; // cant
        
        int i1 = -2_147_483_648; // -31 square
        int i2 = 2_147_483_647; // 31 square

        long l1 = Long.MAX_VALUE; // long 2 ^ 63 square
        System.out.println(l1); // 9223372036854775807

        // overflow
        System.out.println(i2 + 1); // -2147483648
        System.out.println(i1 - 1); // 2147483647
        System.out.println(b1 + 1); // b1 -> byte + int -> int + int -> 128


    }
}
