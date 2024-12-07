package week10;

import week6.Order;

public enum OrderStatus {
    PAID(1), PENDING_FOR_SHIP(2), SHIPPING(3), DELIVERED(4),;
  
    private int value;
  
    private OrderStatus(int value) {
      this.value = value;
    }
  
    public int getValue() {
      return this.value;
    }
  
    public OrderStatus next() {
      // for loop
      for (OrderStatus status : OrderStatus.values()) {
        if (status.getValue() == this.value + 1)
          return status;
      }
      return this;
    }
    
    public static void main(String[] args) {
      for (OrderStatus status : OrderStatus.values()) { // build-in method from Enum.class
        // Enum.toString()
        System.out.println(status); // toString()
        System.out.println(status.name()); // return String format for enum value
      }
  
      System.out.println(OrderStatus.PAID.next().name()); // PENDING_FOR_SHIP
      System.out.println(OrderStatus.PAID.next().next().name()); // SHIPPING
  
      // ! ordinal() -> ordering purpose
      // PAID(1), PENDING_FOR_SHIP(2), SHIPPING(3), DELIVERED(4),;
      System.out.println(OrderStatus.PAID.ordinal()); // 0
      System.out.println(OrderStatus.PENDING_FOR_SHIP.ordinal()); // 1
      System.out.println(OrderStatus.SHIPPING.ordinal()); // 2
      System.out.println(OrderStatus.DELIVERED.ordinal()); // 3
  
      System.out.println(OrderStatus.SHIPPING.compareTo(OrderStatus.SHIPPING)); // 0
      System.out.println(OrderStatus.SHIPPING.compareTo(OrderStatus.DELIVERED)); // -1
      System.out.println(OrderStatus.DELIVERED.compareTo(OrderStatus.SHIPPING)); // 1
      
      // valueOf() -> static method 
      // find the enum object, which has the same name you provided.
      System.out.println(OrderStatus.valueOf("PAID").name());
  
      // ! Runtime error
      System.out.println(OrderStatus.valueOf("paid").name());
    }
  
  }
