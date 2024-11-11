package week5;

public class Calculator {
    private int x;
    private int y;

    // static method vs instance method

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    // static method
    public static int add1(int x, int y){
        return x + y;
    }

    // instance method
    public int add2(int x, int y){
        return x + y;
    }

    // 
    public int add3(){
        return this.x + this.y;
    }

    public static void main(String[] args) {
        
        //Static method call: Class.methodName()
        System.out.println(Calculator.add1(1, 2)); // 3
        //Instance method call: (Wrong Design)
        Calculator c1 = new Calculator();
        System.out.println(c1.add2(2, 1)); // 3
        //Instance method call: (Correct Design)
        Calculator c2 = new Calculator();
        c2.setX(2);
        c2.setY(1);
        System.out.println(c2.add3()); // 3
    }
    
}
