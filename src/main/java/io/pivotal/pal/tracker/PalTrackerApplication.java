package io.pivotal.pal.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// What are Spring Boot Features
// - handles the creation of boiler plate code
// - Auto Configuration
// - dependency management
// - web container added to "fat jar"


@SpringBootApplication
public class PalTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
    }
}