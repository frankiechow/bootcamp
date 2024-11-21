package week8;

public abstract class Machine {
    private String color;
  
    public Machine() {
      this.color = "BLACK";
    }
  
    public Machine(String color) {
      this.color = color;
    }
  
    // ! abstract method implicitly public
    abstract void start();
  
    abstract void stop();
  
    public String getColor() {
      return this.color;
    }
  
    // ! "final" method cannot be Overriden by child class
    // ! Projector.class can access abc() method, but it cannot override it.
    public final int abc() {
      return 3;
    }
  
    // public void setColor(String color) {
    // this.color = color;
    // }
  }