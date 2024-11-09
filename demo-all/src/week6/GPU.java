package week6;

public class GPU {
    private String brand;
    private double price;
    private int rtx;
    private int memory;
    private int power;

    public GPU(String brand, double price, int rtx, int memory, int power){
        this.brand = brand;
        this.price = price;
        this.rtx = rtx;
        this.memory = memory;
        this.power = power;
    }

    public String getBrand(){
        return this.brand;
    }
}
