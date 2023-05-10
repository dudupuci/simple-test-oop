package br.com.zoo.repositories;

import br.com.zoo.base.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, String> {
}
