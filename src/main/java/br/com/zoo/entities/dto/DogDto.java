package br.com.zoo.entities.dto;

import java.util.Set;
import java.util.UUID;


public class DogDto extends AnimalDto {
    private String dogBread;

    private Set<String> toys;

    public DogDto() {}

    public DogDto(UUID id, String name, Double weight, String dogBread, Set<String> toys) {
        super(id, name, weight);
        this.dogBread = dogBread;
        this.toys = toys;
    }

    public String getDogBread() {
        return dogBread;
    }

    public void setDogBread(String dogBread) {
        this.dogBread = dogBread;
    }

    public Set<String> getToys() {
        return toys;
    }

    public void setToys(Set<String> toys) {
        this.toys = toys;
    }
}