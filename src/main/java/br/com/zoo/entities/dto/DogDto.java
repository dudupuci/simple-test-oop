package br.com.zoo.entities.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;


public class DogDto extends AnimalDto {
    private String dogBread;
    @JsonProperty("toys")
    private Set<String> toys = new HashSet<>();

    public DogDto() {
    }

    public DogDto(UUID id, String name, Double weight, String dogBread, Set<String> toys) {
        super(id, name, weight);
        this.dogBread = dogBread;
        this.toys = toys;
    }

    public String getDogBread() {
        return dogBread;
    }

    public Set<String> getToys() {
        return toys;
    }

    public void setToys(Set<String> toys) {
        this.toys = toys;
    }
}