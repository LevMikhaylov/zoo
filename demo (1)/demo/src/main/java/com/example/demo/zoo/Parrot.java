package com.example.demo.zoo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot implements Animal{
    @Override
    public String makeSound(){
        return "Чирик-чирик!";
    }
    @Value("${parrot.name}")
    private String name;
    @Override
    public String getName(){
        return name;
    }
}
