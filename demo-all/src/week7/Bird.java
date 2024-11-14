package week7;

public class Bird extends Animal{
    // private int age;
    private String name;

    // implicitly empty constructor
    // public Bird(){
        // super(); // call the parent constructor
    // }

    public Bird(int age, String name){
        // this.age = age;
        super(age); // call the parent constructor
        // ! super() go first
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public static void main(String[] args) {
        //1. constructor
        // call the parent constructor to create Animal object,
        // and then associate the Bird object with the Animal object

        //2. setter

        Bird b1 = new Bird(5, "Sally");
        System.out.println(b1);

        b1.setAge(10);
        // b1.age; // Error, because age is Private attribute in parent class
        System.out.println(b1.getAge()); // 10
    }
}
