package week9.Interface;

public class Father extends Family implements Swimable, Walkable{
    private String name;

    public Father(String name){
        // super();
        this.name = name;
    }

    public Father(String name, double weight, double height){
        super(height, weight);
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    // If you write @Override here
    //1. Compiler will help check the parent class, ensure there is same method for overriden
    //2. Readability 
    @Override
    public void swim(){
        System.out.println("Father can swim");
    }
    @Override
    public void walk(){
        System.out.println("Father can walk");
    }

    public static void main(String[] args) {
        Father f1 = new Father("Frankie");
        System.out.println(Swimable.x); // 10(public static)

        // Poly
        Swimable father = new Father("Ching");
        // during compile time, only swim() method is visible for father object.
        father.swim();
        // father.walk();
        Walkable father2 = new Father("smy");
        father2.walk();
        // father2.swim();
        // Father & Walkable has relationship
        // Father & Swimable has relationship
        // Walkable & Swimable has NO relationship
        // Walkable father3 = father;
        // Father father4 = father; // compiler this "father" may not be a Father object
        // if you insist and comfirm the "father" is a Father Object, and you want to convert its type.
        Father father4 = (Father) father;
        father4.swim();
        father4.walk();
        Walkable father5 = father4;
        father5.walk();
        // father5.swim();
        
        Swimable father6 = (Father) father5;
        System.out.println(Swimable.sum(10, 2));

        Father father7 = new Father("Maddy");

        new Father("Bitchy").eat();

            }
            private void eat() {
            }
}
