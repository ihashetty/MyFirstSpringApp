package com.example.Usecase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class AppConfig {
    @Bean("Car1")
    public Car Car1()
    {
        return new Car();
    }

    @Bean("Car2")
    public Car Car2()
    {
        return new Car();
    }

}
