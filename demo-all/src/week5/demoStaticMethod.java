package week5;

public class demoStaticMethod {
    public static void main(String[] args) {
        int result = sum(3, 2);
        System.out.println(result); //5
        System.out.println(sum(4, 9)); //13

        System.out.println(concat("hello", " world"));

        System.out.println(rectangleArea(result, result)); //25

        System.out.println(findMax(new int[] {10, -3, 9, 11, -100})); // 11

        System.out.println(circleArea(2.0)); // 12.566370614359172

        System.out.println(0.1 + 0.1); // 0.2
        System.out.println(0.2 + 0.1); // 0.30000000000000004
        System.out.println(0.7 + 0.8); // 1.5

    }
    //definition of method signature: method name + input parameters ("sum(int a, int b)")
    //public static int sum(int a, int b){
    //return a + b;

 // public static + return type + method name + parameter list { method body, method signature}
    public static int sum(int a, int b){
        return a+b;
    }

    public static double circleArea(double radius){
        return Math.pow(radius, 2.0) * Math.PI; // square -> 2.0
    }

    public static int rectangleArea(int length, int width){
        return length * width;
    }

    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i]; 
            }
        }
        return max;
    }

    public static String concat(String a, String b){
        return a.concat(b); // create a new String
    }
    public static void sayHello(){
        System.out.println("hello"); // print out the terminal/ server
    }
    public static String sayHello2(){
        System.out.println("hello");
        return sayHello2();
    }
    public static char lastChar(String s){
        return s.charAt(s.length() - 1);
    }
    // public static substring 
    
}
