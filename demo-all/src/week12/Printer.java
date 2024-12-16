package week12;

public class Printer<T> {
    private T value;

    public Printer(T value){
        this.value = value;
    }

    public void print(){
        System.out.println(this.value);

    }
    public static void main(String[] args) {
        Printer<String> stringPrinter = new Printer<>("hello");
        stringPrinter.print();
        Printer<Integer> integerPrinter = new Printer<>(10);
        integerPrinter.print();
        
    }
}
