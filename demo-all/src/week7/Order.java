package week7;

public class Order {
    // ...
    public static final int STATUS_PAID = 1;
    public static final int STATUS_PENDING_FOR_SHIP = 2;
    public static final int STATUS_SHIPPING = 3;
    public static final int STATUS_DELIVERED = 4;
  
    private int orderStatus;
    // ! Best design for status (enum)
    // private OrderStatus orderStatus;
  
    public Order(int orderStatus) {
      this.orderStatus = orderStatus;
    }
  
    // public void setOrderStatus(int orderStatus) { // ! Big Problem
    //   this.orderStatus = orderStatus;
    // }
  
    // ! Encapsulation
    public void nextStatus() {
      this.orderStatus++;
    }
  
    public static void main(String[] args) {
      
      Order order1 = new Order(STATUS_PAID);
      // after checking the inventory -> available
      // order1.setOrderStatus(STATUS_PENDING_FOR_SHIP); // ! 1 -> 3 ??
  
      // order1.setOrderStatus(100); // so, we should use enum
      order1.nextStatus();
  
    }
  }