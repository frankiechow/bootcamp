package week6;

import java.math.BigDecimal;

public class Wine {
    private String type;
    private double price;
    private String country;
    private int year;

    public Wine(String type, double price, String country, int year){
        this.type = type;
        this.price = price;
        this.country = country;
        this.year = year;
    }

    public String getType(){
        return this.type;
    }
    public double getPrice(){
        return this.price;
    }
    public String getCountry(){
        return this.country;
    }
    public int getYear(){
        return this.year;
    }
    public String toString(){
        return "[type: " + this.type + //
        ", price: " + this.price + //
        ", country: " + this.country + //
        ", year: " + this.year + //
        "]";
    }

    public static void main(String[] args) {
        Wine lafite = new Wine("red", 10000.0, "French", 1986);
        System.out.println(lafite);
        System.out.println(lafite.getPrice());

        Wine montrachet = new Wine("white", 9599.5, "Franch", 2004);
        System.out.println(montrachet);

        Wine[] wineList = new Wine[]{lafite, montrachet};
        // Calculating the total price. Because when you're dealing with wine this pricey, 
        // make sure your math is right!
        double total = 0;
        for (int i = 0; i < wineList.length; i++) {
        // Use BigDecimal for precision, because with wine this expensive, every penny counts!
        BigDecimal price = BigDecimal.valueOf(wineList[i].getPrice());
        total += price.doubleValue();
        }

        System.out.println("Total value of our wine collection: $" + total);

        // Just for kicks, let's do it again with a loop, because Java loves redundancy
        total = 0;
        for(int i = 0; i < wineList.length; i++){
        total += wineList[i].getPrice(); // Simplified because we're already using doubles
        }
        System.out.println("Count total by using for-loop: $" + total);
    }
}
