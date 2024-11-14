package week7;

import javax.swing.event.SwingPropertyChangeSupport;

public class Week {
    private static int counter = 0;
    private int number;
    // constant naming conversion -> block letter + underscore
    public static final int WEEK_OF_HOURS;

    public static final int WEEK_OF_DAYS = test();
    public static final int DAY_OF_HOURS = test2();

    public Week(){
        System.out.println("creating Week object");
        this.number = ++counter;
    }

    // Initializer block
    // everytime you create a new Week object, initializer block go first before constructor
    {
        System.out.println("Initalilizer block");
        // able to control object, so we can use "this" here
    }

    static{
        System.out.println("Static block"); // print 3rd
        // NO_OF_DAYS = 7;
        WEEK_OF_HOURS = WEEK_OF_DAYS * DAY_OF_HOURS;

    }

    public static int test(){
        System.out.println("static method"); // print 1st
        return 7; // print third
    }
    public static int test2(){
        System.out.println("static method test2"); //print 2nd
        return 24;
    }

    public int getNumber(){
        return this.number;
    }

    public static void main(String[] args) {
        System.out.println(Week.WEEK_OF_HOURS); // 168

        Week w1 = new Week();
        Week w2 = new Week();

    }
}
