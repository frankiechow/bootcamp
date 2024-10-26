package week1;
public class demodouble {
    public static void main(String[] args) {
        //float, double
        // 10.3 -> 
        double d1 = 10.3;
        System.out.println(d1);
        // float f1 = 10.3; // cant convert from double to float

        // !! byte -> short -> int -> long -> float -> double !!
        float f2 = 71;
        double d2 = 71;
        long l2 = 71;
        System.out.println(f2);
        System.out.println(d2);
        System.out.println(l2);
        // no precision loss

        double d3 = 9876543210987654321.987654321;
        System.out.println(d3);
        double pi = Math.PI;
        System.out.println(pi);

        double x = 1.1;
        System.out.println(x);
        // float f = x; cant convert from double to float

        // 6 -> int value 例外可降級
        byte b3 = 6;
        System.out.println(b3);
        // 6 -> int value 例外可降級
        short s3 = 6;
        System.out.println(s3);
        int i3 = 6;
        System.out.println(i3);
        // b3 = i3; // cant convert from int to byte 
        // s3 = i3; // cant convert from int to short

        // 6L -> long value 
        long l3 = 6L;
        System.out.println(l3);
        float f3 = 6L;
        System.out.println(f3);
        double d4 = 6L;
        System.out.println(d4);
        // int i4 = 6L; cant convert
        float f4 = 6.5f;
        System.out.println(f4);
        double d5 = 6.5f;
        System.out.println(d5);
        //long l4 = 6.5f; // cant convert

    }
}
