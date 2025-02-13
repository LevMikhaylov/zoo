package com.example.demo.zoo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
    private List<Animal> animals;
    private Animal favoriteAnimal;
    public Zoo(List<Animal> animals, @Qualifier("duck") Animal favoriteAnimal) {
        this.animals = animals;
        this.favoriteAnimal = favoriteAnimal;
    }
    public void displayAnimalSounds() {
        System.out.println("В зоопарке есть следующие животные:");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " говорит: ");
            animal.makeSound();
        }
    }
    public void displayFavoriteAnimalSound() {
        System.out.println("В зоопарке есть любимый питомец: " + favoriteAnimal.getName());
        System.out.println(favoriteAnimal.getName() + " говорит: ");
        favoriteAnimal.makeSound();
    }
}

