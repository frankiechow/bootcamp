package week9.Interface;

public interface Swimable { // contract

    // Interface
    //1. all method are without implementation(abstract method)
    //2. no instance variable
    //3. no constructor

    // implicitly public static
    int x = 10;

    void swim();

    static int sum(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }
}
