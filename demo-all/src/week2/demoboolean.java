package week2;
public class demoboolean {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        a = false;
        b = true;
        System.out.println(a);
        System.out.println(b);

        int johnAge = 6;
         boolean isAdult = johnAge >= 18;
         System.out.println("john age is " + isAdult);


        // > , < , >= , <=
        boolean r1 = 10 > 3;
        System.out.println("r1:" + r1);
        boolean r2 = 10 > 11;
        System.out.println("r2:" + r2);
        
        // 8 primitive type + String (class) : 
        // int, double, String, boolean, +-*/%, >, <, >=, <=, ++, --
        // float, byte, char, long, short
    }
}
