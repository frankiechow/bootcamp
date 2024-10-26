package week4;

public class demoPrimitiveConversion {
    public static void main(String[] args) {
        int i1 = 3;
        double d1 = 9.3;
        System.out.println(i1 + d1);
        // float f1 = 3.4; // double value
        float f2 = 3.4f; // 3.4f is a float value
        double d2 = 3.4f; // lower level to higher level is ok
        //byte -> short -> int -> long -> float -> double
        //char -> int -> long -> float -> double

        int i2 = 10;
        long l1 = 10L;
        long l2 = 10; // lower level to higher level is ok
        float f3 = 20L; // 20.0
        double d3 = 3.4d;

        double d4 = 3.4;
        // float f1 = d4; // Java : not safe -> incorrect syntax
        // not safe -> because d4 may contain a value with high precisions.
        // As a java developer, you have a right to make it happen (take the risk)
        float f1 = (float) d4;
        System.out.println("f1 = " + f1);
        int i3 = 32768;
        short s1 = (short) i3; // short: -32768 to 32767
        System.out.println("s1 = " + s1); // s1 = -32768, overflow
        int i4 = -32769;
        short s2 = (short) i4;
        System.out.println("s2 = " + s2); // 32767
        double d5 = 6.7;
        int i5 = (int)d5;
        System.out.println("i5 = " + i5); // i5 = 6, loss precision

        char c1 = 'a';
        int i6 = c1;
        System.out.println(i6); // 97
        int i7 = 97;
        // char c2 = i7; // cannot down type
        char c3 = 97;
        byte b1 = 127;
        short s3 = 97;

        // Implicit Conversion (not ok -> from float to lower level)
        // int i8 = 1.9f;
        // short s4 = 1.9f;
        short s5 = 32767;
        short s6 = 10;
        // int + short = int + int = int
        int result = (s5 + s6);
        System.out.println(result); // 32777
        
        byte b2 = 127;
        byte b3 = 1;
        byte b4 = (byte) (b2 + b3);
        System.out.println(b4); // -128(overflow)

    }
}
