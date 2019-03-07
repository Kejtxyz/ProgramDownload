package ZooKolekcje;

import java.util.ArrayList;
import java.util.Collection;

public class Zoo {
    private Collection<Animal> animals;
    Zoo() {
        animals = new ArrayList<>();
    }
    void add(Animal animal) {
        animals.add(animal);
    }
    void feed() {
        for (Animal animal : animals) {
            animal.eat();
        }
    }
    int countAllAnimals(){
        return animals.size();
        }
    }

