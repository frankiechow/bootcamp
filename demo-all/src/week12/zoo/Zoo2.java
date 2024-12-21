package week12.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo2 {
    private List<Animal> animals; // Polymorphism

  public Zoo2() {
    this.animals = new ArrayList<>();
  }

  public void add(Animal animal) {
    this.animals.add(animal);
  }

  public List<Animal> getAnimals() {
    return this.animals;
  }

  public static void main(String[] args) {
    // Zoo vs Zoo2
    Zoo<Tiger> tigerZoo = new Zoo<>();
    tigerZoo.add(new Tiger());
    tigerZoo.getAnimals().get(0).run();
    // tigerZoo.add(new Panda());

    Zoo<Panda> pandaZoo = new Zoo<>();
    pandaZoo.add(new Panda());
    pandaZoo.getAnimals().get(0).sleep();
    // pandaZoo.add(new Tiger());

    Zoo2 zoo = new Zoo2();
    zoo.add(new Tiger());
    zoo.add(new Panda());
    // zoo.getAnimals().get(0).sleep();
    // zoo.getAnimals().get(0).run();
    zoo.getAnimals().get(0).eat();
  }
}
