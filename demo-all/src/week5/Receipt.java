package week5;

public class Receipt {
    private Order[] orders;

    public Order[] getOrders(){
        return this.orders;
    }
    public void setOrders(Order[] orders){
        this.orders = orders;
    }
    public double getTotalPrice(){
        double totalPrice = 0.0;
        int count = 0;
        for(int i = 0; i < this.getTotalPrice(); i++){
            return totalPrice;
        }
    }
    public static void main(String[] args) {
        
        Product p1 = new Product();
        p1.setProduct("Rabbit");
        p1.setPrice(478.9998);
        // p1.setQuantity(12);
        System.out.println("Product 1: " + p1.getProduct() + " $" + p1.getPrice());

        Product p2 = new Product();
        p2.setProduct("Dog");
        p2.setPrice(99.876);
        // p1.setQuantity(12);
        System.out.println("Product 2: " + p2.getProduct() + " $" + p2.getPrice());

        Order order1 = new Order();
        order1.setProduct(p1);
        order1.setQuantity(3);

        Order order2 = new Order();
        order2.setProduct(p2);
        order2.setQuantity(5);
        System.out.println(order1.getProduct() + " , Qty:" + order1.getQuantity());

        Order[] orderList = new Order[5];
        Receipt receipt1 = new Receipt();
        receipt1.setOrders(orderList);
        receipt1.addOrder(order1);
        
        
    }
}
