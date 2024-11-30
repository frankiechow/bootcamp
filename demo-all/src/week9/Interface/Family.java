package week9.Interface;

public abstract class Family {
    private double height;
    private double weight;
  
    public Family() {
  
    }
  
    public Family(double height, double weight) {
      this.weight = weight;
      this.height = height;
    }
  
    public double getHeight() {
      return this.height;
    }
  
    public double getWeight() {
      return this.weight;
    }
  }
