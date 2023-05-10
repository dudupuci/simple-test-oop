package br.com.zoo.entities;

import br.com.zoo.interfaces.DomesticAnimal;

import java.util.HashSet;
import java.util.Set;

public final class House {

    private Set<DomesticAnimal> domesticAnimalSet = new HashSet<>();

    public House(Set<DomesticAnimal> domesticAnimalSet) {
        this.domesticAnimalSet = domesticAnimalSet;
    }

    public Set<DomesticAnimal> getDomesticAnimalSet() {
        return domesticAnimalSet;
    }

    public void setDomesticAnimalSet(Set<DomesticAnimal> domesticAnimalSet) {
        this.domesticAnimalSet = domesticAnimalSet;
    }


    public void addDomesticAnimal(final DomesticAnimal domesticAnimal) {
        try {
            if (!domesticAnimalSet.contains(domesticAnimal)) {
                domesticAnimalSet.add(domesticAnimal);
            }
        } catch (Exception err) {
            throw new RuntimeException("Animal already on domesticAnimal set");
        }
    }

    @Override
    public String toString() {
        return "House of DomesticAnimals {" +
                "domesticAnimalSet=" + domesticAnimalSet +
                '}';
    }
}
