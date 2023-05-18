package br.com.zoo;

import br.com.zoo.base.Animal;
import br.com.zoo.entities.*;
import br.com.zoo.entities.dto.BirdDto;
import br.com.zoo.entities.dto.CatDto;
import br.com.zoo.entities.dto.DogDto;
import br.com.zoo.entities.dto.LizardDto;
import br.com.zoo.enums.BeakColor;
import br.com.zoo.services.impl.AnimalServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Map;
import java.util.Set;
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
        /*this.animalService.create(new CatDto(UUID.fromString("2b80c9b8-74de-4eb5-a78d-ead18ecf6f52"), "Carlos", 2500D, "Eduardo", true));
        this.animalService.create(new CatDto(UUID.fromString("5d4b08b1-3bf9-4eac-b9a5-8f06a24c16d1"), "Mimi", 3000D, "Luiz", true));
        this.animalService.create(new CatDto(UUID.fromString("7548c9b9-9fca-43d2-8d3f-0b91e8d8b3de"), "Gato", 2800D, "Henrique", true));
        this.animalService.create(new BirdDto(UUID.fromString("ea3c5c26-9c51-4f20-b73a-60158ad8e0a7"), "Canario", 400D, BeakColor.GREEN.toString()));
        this.animalService.create(new DogDto(UUID.fromString("354cbb03-8c16-43a2-9de9-36db8e2a0871"), "Catiorro", 2500D, "Vira Lata", Set.of("Toy")));
        this.animalService.create(new LizardDto(UUID.fromString("ceea70d3-ea1d-42f8-a5c9-bc4df5f12a62"), "Lila", 120D));
         */
        animalService.clear();
    }
}