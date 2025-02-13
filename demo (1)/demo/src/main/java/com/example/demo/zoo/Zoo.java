package com.example.demo.zoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
    private Animal favoriteAnimal;

    @Autowired
    public Zoo(@Qualifier("duck") Animal favoriteAnimal) {
        this.favoriteAnimal = favoriteAnimal;
    }

    public void displayFavoriteAnimalSound() {
        System.out.println("В зоопарке есть любимый питомец: " + favoriteAnimal.getName());
        System.out.println(favoriteAnimal.getName() + " говорит: " + favoriteAnimal.makeSound());
    }
}
