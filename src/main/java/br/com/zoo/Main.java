package br.com.zoo;

import br.com.zoo.base.Animal;
import br.com.zoo.entities.Cat;
import br.com.zoo.entities.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Dog dog = new Dog("", "", 250D);
        Zoological zoological = new Zoological();
        List<? super Animal> animalsList = new ArrayList<>();
        zoological.addAnimal(dog, animalsList);
        zoological.addAnimal(new Cat("Cat", 253D, "Eduardo"), animalsList);
        zoological.listAnimals(animalsList);
    }
}