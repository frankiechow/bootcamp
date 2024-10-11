public class day3Exercise {
    public static void main(String[] args) {
        /**
 * Expected Output:
 * 
 * I am going to add two numbers together: 
 * The first one: 31
 * The second one: 42
 * The sum is 73
 * The subtraction reuslt is 11
 * The another sum result is 130
 * The variable varB is false
 * The variable varC is true
 * The variable fnumber is -130.2
 * The variable dnumber is -20.5
 * The variable reminder is 1
 * The variable result is 3
 */

    int x = 31;
    System.out.println("The first one: " + x);
    int b = 42;
    System.out.println("the second:" + b);
    int sum = b - x;
    System.out.println("b - x =" + sum);
    int sum2 = x * b / 10;
    System.out.println("x * b / 10 =" + sum2);
    boolean varB = true;
    System.out.println("varB =" + varB);
    boolean varC = false;
    System.out.println("varC =" + varC);
    double fnumber = -130.2;
    System.out.println("variable fnumber =" + fnumber);
    double dnumber = -20.5;
    System.out.println("variable dnumber =" + dnumber);
    int reminder1 = 10;
    int reminder2 = 3;
    int asn1 = reminder1 / reminder2;
    int asn2 = reminder1 % reminder2;
    System.out.println("variable reminder =" + asn2);
    System.out.println("variable result =" + asn1);
    //grok2:
    int firstNum = 31;
        int secondNum = 42;
        int sum01 = firstNum + secondNum;
        int subtraction = firstNum - secondNum;
        int anotherSum = firstNum * secondNum + firstNum + secondNum;
        
        boolean varB1 = false;
        boolean varC1 = true;
        float f1number = -130.2f;
        double d1number = -20.5;
        int reminder = firstNum % secondNum;
        int result = (int) Math.round(Math.random() * 3); // Because why not?

        System.out.println("I am going to add two numbers together: ");
        System.out.println("The first one: " + firstNum);
        System.out.println("The second one: " + secondNum);
        System.out.println("The sum01 is " + sum01 + " - because when you add life, the universe, and everything, you get a rather large number.");
        System.out.println("The subtraction result is " + subtraction + " - which is the number of angry cats if you wake them up.");
        System.out.println("The another sum result is " + anotherSum + " - because when you multiply your original numbers and add them, you get into spooky territory.");
        System.out.println("The variable varB1 is " + varB1 + " - much like my understanding of human fashion trends.");
        System.out.println("The variable varC1 is " + varC1 + " - just like the fact that pizza is the best food.");
        System.out.println("The variable f1number is " + f1number + " - that's how much my battery life feels after a marathon of calculating.");
        System.out.println("The variable d1number is " + d1number + " - the temperature outside my server room, in Celsius, during a power outage.");
        System.out.println("The variable reminder is " + reminder + " - reminding you there's always one more thing to remember.");
        System.out.println("The variable result is " + result + " - because that's how many times I've had to regenerate today.");
        //
    int q = 100;
    int w = 300;
    if (q > w) { // ture or false
        System.out.println("q > w");
    } else {
        System.out.println("q not > w");

    }
    // Question : Determine whether year n is a leap year.
    /*
     * Definiton of a leap year:
     * If a year is divisible by 4 and not divisible by 100 or divisible by 400,
     * then, it is a leap year.
     */
    int year1 = 2008; //2020 , 2400
    if(year1 % 4 == 0 && (year1 % 100 != 0 || year1 % 400 == 0)) {
        System.out.println("It is a leap year");
    } else {
        System.out.println("It is not a leap year");}
        //Grok2 answer:
    {
    boolean LeapYear = (year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0);
        
        String result1 = LeapYear ? "It's a leap year - time for an extra day of shenanigans!" 
                                    : "Nope, not a leap year - just the usual 365 days of chaos.";
        
        System.out.println(year1 + ": " + result1);
    }
    //

}

}
