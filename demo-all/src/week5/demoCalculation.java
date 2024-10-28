package week5;

public class demoCalculation {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(127); // create an object of 127
        Integer num2 = Integer.valueOf(127); // within -128 to 127, reuse the same object of 127
        System.out.println(num1 == num2); // true
        System.out.println(num1.compareTo(num2)); // 0

        Integer num3 = Integer.valueOf(128); // create an object of 128
        Integer num4 = Integer.valueOf(128); // create an object of 128
        System.out.println(num3 == num4); // false
        System.out.println(num3.compareTo(num4)); // 0
        // In java, for object, "==" is to checck if they are same object
        // For no. (byte, short, integer, long), -128 to 127
        Integer num5 = new Integer(127); // create an object by developer
        System.out.println(num1 == num5); // false
        Integer num6 = 127;
        System.out.println(num1 == num6); // true
        num5 = num6;
        System.out.println(num5 == num6); // true
        num6 = 190;
        System.out.println(num6 == num5); // false
        

    }
}
