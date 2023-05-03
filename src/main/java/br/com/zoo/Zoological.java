package br.com.zoo;

import br.com.zoo.base.Animal;

import java.util.Arrays;
import java.util.List;

public class Zoological {
    public Zoological() {
    }

    public void listAnimals(List<? super Animal> animalsList) {
        System.out.println(Arrays.toString(animalsList.toArray()));
    }

    public String addAnimal(final Animal animal, List<? super Animal> animalsList) {
        try {
            animalsList.add(animal);
        } catch (Exception err) {
            throw new RuntimeException("Error trying to add animal at the animalsList.");
        }
        return "The animal " + animal.getName() + " was successfully added.";
    }


    public String deleteAnimal(final Animal animal, List<? super Animal> animalsList) {
        try {
            animalsList.remove(animal);
        } catch (Exception err) {
            throw new RuntimeException("Error trying to remove animal at the animalsList.");
        }
        return "The animal " + animal.getName() + " was successfully removed.";
    }
}
