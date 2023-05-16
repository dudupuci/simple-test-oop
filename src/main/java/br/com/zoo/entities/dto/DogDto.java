package br.com.zoo.entities.dto;

import javax.persistence.Transient;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public record DogDto(
        UUID id,
        String name,
        Double weight,
        String dogBread,
        Set<String> toys
) {


}
