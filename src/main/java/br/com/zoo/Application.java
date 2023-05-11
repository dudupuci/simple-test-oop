package br.com.zoo;

import br.com.zoo.entities.*;
import br.com.zoo.enums.BeakColor;
import br.com.zoo.services.impl.AnimalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;

import java.util.Map;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private final AnimalServiceImpl animalService;

    public Application(AnimalServiceImpl animalService) {
        this.animalService = animalService;
    }

    public static void main(String[] args) {
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "test");
        SpringApplication.run(WebConfiguration.class, args);


        //System.out.println("----ZOOLOGICAL CENTER----");
        //Zoological.start();

    }

    @Override
    public void run(String... args) throws Exception {
        this.animalService.create(new Cat("2b80c9b8-74de-4eb5-a78d-ead18ecf6f52", "Carlos", 250D, "Eduardo", true));
        this.animalService.create(new Bird("27a3996f-cabd-4fb3-823e-f7d542c994b7", "Zezé", 240D, BeakColor.BLUE.toString()));
        this.animalService.create(new Dog("960bb760-acb9-4ae7-8aac-cdf19188234e", "Border Collie", "Enzo", 240D));
        this.animalService.create(new Lizard("b126de74-a9f9-47a8-8945-40000d47ff6b", "Iguaninha", 100D));
        this.animalService.create(new Shark("3e0c1044-1cba-4f09-a797-a2b03f733d27", "Tubarao Branco", 900D, Map.of("Peixe", 2)));
        System.out.println("Animais persistidos com sucesso!");
    }
}