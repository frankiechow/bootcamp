package week7;

public class Person {
    private String firstName;
    private String lastName;

    // Constructor: Constructor Name = Class Name, No return type, Stat with Capital letter
    // public static Person(String firstName, String lastName){
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    // }

    public String getFullName(){
        return this.lastName + " " + this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    @Override
    public String toString(){
        return "Person[" //
        + "First Name: " + this.firstName //
        + ", Last Name: " + this.lastName //
        + "]";
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setFirstName("Frankie");
        p1.setLastName("Chow");
        System.out.println(p1.toString()); // Person[First Name: FrankieLast Name: Chow]
        System.out.println(p1); //same result

        Person p2 = new Person();
        System.out.println(p2);
    }
}
