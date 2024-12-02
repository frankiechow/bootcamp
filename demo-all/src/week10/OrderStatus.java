package week10;

import week6.Order;

public enum OrderStatus {
    PAID(1), PENDING_FOR_SHIP(2), SHIPPING(3), DELIVERED(4);

    private final int value;
    private OrderStatus(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
    public OrderStatus next(){
        // for loop
        for(OrderStatus status : OrderStatus.values()){
            if(status.getValue() == this.value + 1)
            return status;
        }
        return this;
    }

    public static void main(String[] args) {
       OrderStatus.PAID.next();

       for(OrderStatus status : OrderStatus.values()){ // build-in method from Enum.class
        // Enum.toString()
        System.out.println(status); // toString()
        System.out.println(status.name()); // return String format for enum value
       }
       System.out.println(OrderStatus.PAID.next().name()); // PENDING_FOR_SHIP
       System.out.println(OrderStatus.PAID.next().next().name()); // SHIPPING

       System.out.println(OrderStatus.SHIPPING.compareTo(PENDING_FOR_SHIP));
       System.out.println(OrderStatus.SHIPPING.compareTo(SHIPPING));
       System.out.println(OrderStatus.SHIPPING.compareTo(PAID));
       System.out.println(OrderStatus.SHIPPING.compareTo(DELIVERED));

       System.out.println(OrderStatus.valueOf("PAID").name());

       // Runtime error
       System.out.println(OrderStatus.valueOf("PAI").name());
       
    }
}
