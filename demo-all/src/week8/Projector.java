package week8;

public class Projector extends Machine {
  private double size;

  public Projector(double size) {
    // ! super()
    this.size = size;
  }

  public Projector(double size, String color) {
    super(color); // !
    this.size = size;
  }

  @Override
  public void start() {
    System.out.println("Projector is starting ...");
  }

  @Override
  public void stop() {
    System.out.println("Projector is stoping ...");
  }

  @Override
  public String getColor() {
    return "Orange";
  }

  public static void main(String[] args) {
    Projector p1 = new Projector(3.4);
    System.out.println(p1.getColor()); // BLACK

    Projector p2 = new Projector(9.1, "RED");
    System.out.println(p2.getColor()); // RED
  }

  
}