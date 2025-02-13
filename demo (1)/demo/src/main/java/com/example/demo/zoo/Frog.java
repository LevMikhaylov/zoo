package com.example.demo.zoo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Frog implements Animal{
    @Override
    public String makeSound(){
        return "Ква-ква!";
    }
    @Value("${frog.name}")
    private String name;
    @Override
    public String getName(){
        return name;
    }
}
