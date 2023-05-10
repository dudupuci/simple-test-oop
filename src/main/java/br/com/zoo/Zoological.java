package br.com.zoo;

import br.com.zoo.base.Animal;
import br.com.zoo.entities.*;
import br.com.zoo.enums.BeakColor;
import br.com.zoo.interfaces.DomesticAnimal;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Zoological {
    public static final Logger logger = Logger.getLogger(Zoological.class.getName());

    public Zoological() {
    }

    public static void start() {
        Zoological zoological = new Zoological();
        List<? super Animal> animalsList = new ArrayList<>();
        Set<DomesticAnimal> domesticAnimalSet = new HashSet<>();
        Map<String, Integer> animalsEaten = new HashMap<>();
        Dog dog = new Dog("ID","Golden Retriever", "Bolota", 250D, Set.of("Bolinha", "Corda"));
        Shark shark = new Shark("ID","Sword Shark", 1400D, animalsEaten);
        Bird bird = new Bird("ID","Beija-flor", 140D, BeakColor.GREEN);
        Lizard lizard = new Lizard("ID","Iguana", 240D);

        animalsEaten.put("Peixe-palhaco", 3);
        animalsEaten.put("Anchova", 6);
        animalsEaten.put("Sardinha", 2);

        zoological.addAnimal(dog, animalsList);
        zoological.addAnimal(new Cat("ID","Cat", 253D, "Eduardo", true), animalsList);
        zoological.addAnimal(shark, animalsList);
        zoological.addAnimal(bird, animalsList);
        zoological.addAnimal(lizard, animalsList);

        zoological.listAnimals(animalsList);
        zoological.deleteAnimal(lizard, animalsList);
        zoological.listAnimals(animalsList);

        // house = new House(domesticAnimalSet);

        // First option to filter DomesticAnimals from a generic AnimalsList
        var domestics = animalsList
                .stream()
                .filter(animal -> animal instanceof DomesticAnimal)
                .collect(Collectors.toList());
        for (Object domestic : domestics) {
            domesticAnimalSet.add((DomesticAnimal) domestic);
        }

        // Second option to filter DomesticAnimals from a generic AnimalsList
        /// var newSet = zoological.filterOnlyDomesticAnimals(animalsList);
        // System.out.println(newSet);

        System.out.println("House of Domestic Animals!");
        for (Object domesticAnimal : domestics) {
            System.out.println(domesticAnimal);
        }

    }

    public Set<DomesticAnimal> filterOnlyDomesticAnimals(List<? super Animal> animalsList) {
        Set<DomesticAnimal> domesticAnimalSet = new HashSet<>();
        for (Object animal : animalsList) {
            if (animal instanceof DomesticAnimal) {
                domesticAnimalSet.add((DomesticAnimal) animal);
            }
        }
        return domesticAnimalSet;
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
