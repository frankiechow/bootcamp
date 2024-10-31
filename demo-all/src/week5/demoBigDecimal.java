package week5;
import java.math.BigDecimal;

public class demoBigDecimal {
    public static void main(String[] args) {
        // 0.2 + 0.1
        System.out.println(0.1+0.1); //0.2
        System.out.println(0.2+0.1); //0.30000000000000004
        // Java solution: Built-in java class
        BigDecimal bd = new BigDecimal(10d);
        BigDecimal bd2 = new BigDecimal("10");
        System.out.println(bd.doubleValue()); // 10.0

        long result = bd.longValue(); //10L
        int x = bd2.intValue();
        System.out.println(x); //10

        BigDecimal result2 = BigDecimal.valueOf(0.2).add(BigDecimal.valueOf(0.1));
        System.out.println(result2.doubleValue()); //0.3

        BigDecimal result3 = new BigDecimal("0.2").add(new BigDecimal("0.1"));
        System.out.println(result3.doubleValue()); // 0.3

        // BigDecimal sum = num1.add(num2);
        // BigDecimal difference = num1.subtract(num2);
        // BigDecimal product = num1.multiply(num2);
        // BigDecimal quotient = num1.divide(num2);
        System.out.println(
            BigDecimal.valueOf(9).divide(result3)
        );

    }
}
