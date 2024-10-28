package week5;

public class App3 {
    public static void main(String[] args) {
        int x = 3;
        int x2 = 6;
        if(x > x2){}

        Integer y = 4;
        String s = "hello";
        // y and x are both object in Java
        y = new Integer(4);
        Integer y2 = 8;
        if(y.compareTo(y2) < 0){
            System.out.println("y is smaller than y2");
        } else {
            System.out.println("y is bigger than y2");
        }
        // if(y.compareTo(new Integer(4) == 0)){
        //     System.out.println("y is equals to 4");
        // }
        //Avoid
        if(y == 4){
            System.out.println("y is equals to 4");
        }

        int x3 = y; // un-boxing
        long l1 = 10L; // auto-boxing (long to long)
        double d1 = y.doubleValue(); //Integer -> int -> double
        long l2 = new Integer(10).longValue(); // Integer -> long -> long
        // long l2 = new Integer(10); // Integer -> int -> long -> long (not ok)

        Double d3 = new Double(8.4);
        System.out.println(d3.shortValue()); // 8
        // similar to
        System.out.println((short) d3.doubleValue()); // Double -> double -> short

        boolean b1 = new Boolean(false); //unboxing
        Character c1 = 'c'; // auto-boxing char to Characrter
        c1 = new Character('a');

        Float f1 = 9.4f; // auto-boxing
        float f2 = new Float(9.4); //unboxing

        byte b2 = (byte) 8;
        byte b3 = new Byte((byte) 8); 

        Integer i5 = Integer.valueOf(8); //similar to new Integer(8)
        String s2 = String.valueOf("hello");
        String s3 = String.valueOf(9); // conversion
        System.out.println("s3 = " + s3);

    }
}
