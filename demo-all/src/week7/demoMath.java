package week7;

public class demoMath {
    public static void main(String[] args){
        System.out.println(Math.PI); // 3.141592653589793
        double cubeVolume = Math.pow(9.0, 3.0);
        System.out.println(cubeVolume); // 729.0

        //Math.max()
        int[] arr = new int[]{2,3,10,1};
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(arr[i], max);
            }
            System.out.println("max: " + max); // 2147483647

        //Math.mix()

        System.out.println(Math.sqrt(25)); // 5.0
        System.out.println(Math.sqrt(-25)); // NaN
       
        //  absolute value
        System.out.println(Math.abs(-3)); // 3
        System.out.println(Math.abs(3)); // 3
        System.out.println(Math.round(3.14159)); // 3
        System.out.println(Math.round(3.51234)); // 4

        System.out.println(Math.random()); // 0.0 - 1.0

    }
}
