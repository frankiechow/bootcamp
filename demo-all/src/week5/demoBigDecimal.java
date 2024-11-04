package week5;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class demoBigDecimal {
  public static void main(String[] args) {
    // 0.2 + 0.1
    System.out.println(0.1 + 0.1); // 0.2
    System.out.println(0.2 + 0.1); // 0.30000000000000004

    // Java Solution: Built-in Java Class
    BigDecimal bd = new BigDecimal(10d);
    BigDecimal bd2 = new BigDecimal("10");

    System.out.println(bd.doubleValue()); // 10.0
    long result = bd.longValue(); // 10L

    int x = bd2.intValue();
    System.out.println(x); // 10

    // ! You should perform the calculation by valueOf()
    BigDecimal result2 = BigDecimal.valueOf(0.2).add(BigDecimal.valueOf(0.1));
    System.out.println(result2.doubleValue()); // 0.3

    // ! be careful, you should use String as parameter for new BigDecimal()
    BigDecimal result3 = new BigDecimal("0.2").add(new BigDecimal("0.1"));
    System.out.println(result3.doubleValue()); // 0.3

    System.out.println(BigDecimal.valueOf(0.34) //
        .multiply(BigDecimal.valueOf(0.34)) //
        .setScale(3, RoundingMode.UP).doubleValue());
    // 0.1156 -> 0.116

    System.out.println(
        BigDecimal.valueOf(9).divide(BigDecimal.valueOf(3)).doubleValue()); // 3.0

    System.out.println(
        BigDecimal.valueOf(9).divide(BigDecimal.valueOf(2)).doubleValue()); // 4.5

    System.out.println(BigDecimal.valueOf(10) //
        .divide(BigDecimal.valueOf(3), 1, RoundingMode.UP) //
        .doubleValue()); // 3.3334

        Boolean b = true; // true -> primitive value -> Boolean(auto-box)

        String s1 = "hello";
        String s2 = "hello";
        s1 = s1+"!"; // s1 = "hello!"
        String s3 = "abc";
        String s4 = "123";
        s3 = s4; // s3 = "abc" -> "123"
        s4 = "def"; // s4 = "123" -> "def"
        String s5 = new String("hello");
        System.out.println(s1 == s5); // false
        
  }
}
