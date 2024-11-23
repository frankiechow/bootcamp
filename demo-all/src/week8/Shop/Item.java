package week8.Shop;

public abstract class Item extends Category {
    protected String subCategory;
  
    public Item(String name, double price, String category, String subCategory) {
      super(subCategory, 0, subCategory);
      this.subCategory = subCategory;
    }
  
    public String getSubCategory() {
      return this.subCategory;
    }
  }
