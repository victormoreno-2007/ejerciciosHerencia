package tenth;

import sixth.Bird;
import third.Animal;
import third.Cat;
import third.Dog;

import java.util.ArrayList;

public class Tenth {
    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(new Cat());
        animal.add(new Dog());
        animal.add(new Bird());

        for (Animal a : animal) {
            a.makeSound();
        }
    }
}
