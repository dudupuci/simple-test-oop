package br.com.zoo.repositories;

import br.com.zoo.base.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, UUID> {
    @Query("SELECT a FROM Animal a WHERE a.name = :name")
    List<Animal> findAllByName(@Param("name") String name);
}
