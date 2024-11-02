package week5;

public class Order {
    private Product product;
    private int quantity;

    public void setProduct(Product product){
        this.product = product;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public Product getProduct(){
        return this.product;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public String toString(){
        return "[Product: " + this.product + //
        " , quantity: " + this.quantity;
    }

}
