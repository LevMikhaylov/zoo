package com.example.demo.zoo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Lion implements Animal{
    @Override
    public String makeSound(){
         return "Рррррррррр!";   
    }
    @Value("${lion.name}")
    private String name;
    @Override
    public String getName(){
        return name;
    }
}
