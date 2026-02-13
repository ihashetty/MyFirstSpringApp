package com.example.Usecase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car c1 = context.getBean("Car1", Car.class);
        c1.setModel("S class");
        System.out.println(c1.getModel());

        Car c2 = context.getBean("Car2", Car.class);
        c2.setModel("C class");
        System.out.println(c2.getModel());

        Book b1=context.getBean(Book.class);
        System.out.println("Success");
    }
}
