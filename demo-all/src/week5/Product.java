package week5;

public class Product {
    private String name;
    private double price;

    public String getProduct(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setProduct(String ProductName){
        this.name = ProductName;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String toString(){
        return "Product name: " + this.name + //
        " , price: " + this.price;
    }

}
