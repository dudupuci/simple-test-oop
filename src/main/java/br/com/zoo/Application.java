package br.com.zoo;

import br.com.zoo.base.Animal;
import br.com.zoo.entities.*;
import br.com.zoo.enums.BeakColor;
import br.com.zoo.services.impl.AnimalServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;

import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger logger = Logger.getLogger(Application.class.getName());

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
        this.animalService.create(new Cat(UUID.fromString("2b80c9b8-74de-4eb5-a78d-ead18ecf6f52"), "Carlos", 2500D, "Eduardo", true));
        this.animalService.create(new Bird(UUID.fromString("27a3996f-cabd-4fb3-823e-f7d542c994b7"), "Zezé", 500D, BeakColor.BLUE.toString()));
        this.animalService.create(new Dog(UUID.fromString("960bb760-acb9-4ae7-8aac-cdf19188234e"), "Border Collie", "Enzo", 28000D));
        this.animalService.create(new Lizard(UUID.fromString("b126de74-a9f9-47a8-8945-40000d47ff6b"), "Iguaninha", 100D));
        this.animalService.create(new Shark(UUID.fromString("3e0c1044-1cba-4f09-a797-a2b03f733d27"), "Tubarao Branco", 300000D, Map.of("Peixe", 2)));
        this.animalService.create(new Cat(UUID.fromString("5d4b08b1-3bf9-4eac-b9a5-8f06a24c16d1"), "Mimi", 3000D, "Luiz", true));
        this.animalService.create(new Bird(UUID.fromString("9c4151b5-7792-4b20-99c3-cedf04894f0b"), "Piu Piu", 750D, BeakColor.YELLOW.toString()));
        this.animalService.create(new Dog(UUID.fromString("1e0aa2f7-743c-4da8-9b96-29d4b4a8b09d"), "Poodle", "Nina", 18000D));
        this.animalService.create(new Lizard(UUID.fromString("be46b829-77f1-4c9e-9c13-cd8e4b960f84"), "Liz", 50D));
        this.animalService.create(new Shark(UUID.fromString("8e9f4bf4-2d09-4f07-93e7-6629c8d767fb"), "Tubarao Martelo", 400000D, Map.of("Lula", 3)));

        this.animalService.create(new Cat(UUID.fromString("9d068cb4-c444-4a34-aa3b-fd9988b0cf90"), "Mel", 3500D, "Fernanda", false));
        this.animalService.create(new Bird(UUID.fromString("eeef6d3b-8c70-44c8-b2db-91d5b3a6c94f"), "Pardal", 200D, BeakColor.YELLOW.toString()));
        this.animalService.create(new Dog(UUID.fromString("4c19aa7d-e56f-452f-9e99-212e9c1929a2"), "Labrador", "Max", 24000D));
        this.animalService.create(new Lizard(UUID.fromString("cc8e07fb-103f-4aef-9d06-32a9b31f5c34"), "Lenny", 80D));
        this.animalService.create(new Shark(UUID.fromString("c2153e4b-5bf1-45f3-b9f1-82fc1f5113b7"), "Tubarao Tigre", 350000D, Map.of("Sardinha", 5)));

        this.animalService.create(new Cat(UUID.fromString("7548c9b9-9fca-43d2-8d3f-0b91e8d8b3de"), "Gato", 2800D, "Henrique", true));
        this.animalService.create(new Bird(UUID.fromString("ea3c5c26-9c51-4f20-b73a-60158ad8e0a7"), "Canario", 400D, BeakColor.GREEN.toString()));
        this.animalService.create(new Dog(UUID.fromString("354cbb03-8c16-43a2-9de9-36db8e2a0871"), "Vira-Lata", "Luna", 22000D));
        this.animalService.create(new Lizard(UUID.fromString("ceea70d3-ea1d-42f8-a5c9-bc4df5f12a62"), "Lila", 120D));

        logger.info("Animais persistidos no banco de dados teste.");

        var list = this.animalService.findAll();
        for (Animal animal : list) {
            System.out.print(animal + "\n");
        }
    }
}