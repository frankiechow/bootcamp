package week9;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    // public void setname(String name){
    //     this.name = name;
    // }
    // public void setAge(int age){
    //     this.age = age;
    // }

    @Override
    public boolean equals(Object obj){
        // early return
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Person)){
            return false;
        }
        Person person = (Person) obj;
        // person definition
        // return person.getAge() == this.age && person.getName().equals(this.name);
        return Objects.equals(person.getAge(), this.age) //
        && Objects.equals(person.getName(), this.name);
    }

    @Override
    public String toString(){
        return "Person[" //
        + "Name: " + this.name //
        + ", Age: " + this.age //
        + "]";
    }

    public static void main(String[] args) {
        Person p1 = new Person("Frankie", 18);
        Object o1 = new Object();
        System.out.println(o1.toString());
        Person p2 = new Person("Frankie", 18);
        System.out.println(p1.equals(p2));
    }
}
