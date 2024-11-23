package week8.Shop;

public abstract class Category extends Product {
    private String category;
  
    public Category(String name, double price, String category) {
      super(name, price);
      this.category = category;
    }
  
    public String getCategory() {
      return this.category;
    }
    
  }
