package week12.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Animal> {
    private List<T> animals;

    public Zoo(){
        this.animals = new ArrayList<>();
    }

    public void add(T animal){
        this.animals.add(animal);
    }

    public static void main(String[] args) {
        Zoo<Tiger> tigerZoo = new Zoo<>();
        tigerZoo.add(new Tiger());

        Zoo<Panda> pandaZoo = new Zoo<>();
        pandaZoo.add(new Panda());

        Zoo zoo = new Zoo();
        zoo.add(new Tiger());
        zoo.add(new Panda());
        
    }
}
