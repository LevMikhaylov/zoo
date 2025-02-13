package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.zoo.Zoo;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        Zoo zoo = context.getBean(Zoo.class);
        zoo.displayAnimalSounds();
		zoo.displayFavoriteAnimalSound();
	}

}
