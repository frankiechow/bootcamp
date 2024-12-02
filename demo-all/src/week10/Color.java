package week10;

public enum Color {
    
    RED('R'), //
    YELLOW('Y'), // 
    BLACK('B'), //
    ;
    
    // Usually we use final for enum
    private final char value;
    private Color(char value){
        this.value = value;
    }

    public char getValue(){
        return this.value;
    }
    // public void setValue(char value){
    //     this.value = value;
    // }

    // everytime pass the "Run" button:
    // 1. Load the classes to the memory
    // For enum, JVM will help create an unique object before executing the main method 
    // In memory, there are only 3 color objects, RED, YELLOW and BLACK

    public static void main(String[] args) {
        String red1 = "RED";
        String red2 = "red";
        String red3 = "Red";
        String red4 = new String("RED");
        System.out.println(red1.equals(red3)); //false
        System.out.println(red1.equals(red4)); //true, because Override Object.equals()
        System.out.println(red1 == red4); // false, because they are not the same address
        //String.class extends Object.class
        // ! What if String.class did not Override equals()? -> Object.equals()

        //Never to create enum object by yourself
        // new Color()
        Color r1 = Color.RED;
        Color r2 = Color.RED;
        System.out.println(r1 == r2); // true

        if(r2 == Color.BLACK){
            System.out.println("its black.");
        } else {
            System.out.println("its not black.");
        }
        System.out.println(r2.getValue()); // R
        System.out.println(Color.YELLOW.getValue()); // Y

        // Color.BLACK.setValue('A');
        // System.out.println(Color.BLACK.getValue()); // A
    }
}
