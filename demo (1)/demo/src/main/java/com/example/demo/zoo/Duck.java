package com.example.demo.zoo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Duck implements Animal{
    @Override
    public String makeSound(){
        return "Кря-кря!";
    }
    @Value("${duck.name}")
    private String name;
    @Override
    public String getName(){
        return name;
    }
}
