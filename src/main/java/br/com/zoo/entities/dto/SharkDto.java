package br.com.zoo.entities.dto;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class SharkDto extends AnimalDto {

    public Map<String, Integer> animalsEaten = new HashMap<>();

    public SharkDto() {
    }

    public SharkDto(UUID id, String name, Double weight, Map<String, Integer> animalsEaten) {
        super(id, name, weight);
        this.animalsEaten = animalsEaten;
    }


    public Map<String, Integer> getAnimalsEaten() {
        return animalsEaten;
    }

    public void setAnimalsEaten(Map<String, Integer> animalsEaten) {
        this.animalsEaten = animalsEaten;
    }

    @Override
    public String toString() {
        return "SharkDto{" +
                "animalsEaten=" + animalsEaten +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                "} ";
    }
}
