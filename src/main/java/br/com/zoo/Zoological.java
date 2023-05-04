package br.com.zoo;

import br.com.zoo.base.Animal;
import br.com.zoo.entities.*;
import br.com.zoo.enums.BeakColor;

import java.util.*;

public class Zoological {
    public Zoological() {
    }

    public static void start() {
        Zoological zoological = new Zoological();
        List<? super Animal> animalsList = new ArrayList<>();
        Map<String, Integer> animalsEaten = new HashMap<>();
        Dog dog = new Dog("Golden Retriever", "Bolota", 250D, Set.of("Bolinha", "Corda"));
        Shark shark = new Shark("Sword Shark", 1400D, animalsEaten);
        Bird bird = new Bird("Beija-flor", 140D, BeakColor.GREEN);
        Lizard lizard = new Lizard("Iguana", 240D);

        animalsEaten.put("Peixe-palhaco", 3);
        animalsEaten.put("Anchova", 6);
        animalsEaten.put("Sardinha", 2);

        zoological.addAnimal(dog, animalsList);
        zoological.addAnimal(new Cat("Cat", 253D, "Eduardo", true), animalsList);
        zoological.addAnimal(shark, animalsList);
        zoological.addAnimal(bird, animalsList);
        zoological.addAnimal(lizard, animalsList);

        zoological.listAnimals(animalsList);
        zoological.deleteAnimal(lizard, animalsList);
        zoological.listAnimals(animalsList);

    }

    public void listAnimals(List<? super Animal> animalsList) {
        int i = 0;
        for (Object animal : animalsList) {
            System.out.print("#" + (i + 1) + " " + animal + "\n");
            i++;
        }
        if (i >= 1) {
            System.out.println("-------------||-------------");
            System.out.println("End of list! Zoo have now " + (i) + " animals.");
            System.out.println("-------------||-------------");
        } else {
            System.out.println("-------------||-------------");
            System.out.println("End of list! Zoo have no animals! :(");
            System.out.println("-------------||-------------");
        }

    }

    public void addAnimal(final Animal animal, List<? super Animal> animalsList) {
        try {
            animalsList.add(animal);
        } catch (Exception err) {
            throw new RuntimeException("Error trying to add animal at the animalsList.");
        }
    }

    public void deleteAnimal(final Animal animal, List<? super Animal> animalsList) {
        try {
            animalsList.remove(animal);
        } catch (Exception err) {
            throw new RuntimeException("Error trying to remove animal at the animalsList.");
        }
    }
}
