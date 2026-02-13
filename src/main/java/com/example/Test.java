package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Movie m1 = context.getBean("Movie1",Movie.class);
        m1.setTitle("Troy");
        System.out.println(m1.getTitle());
        //Movie m =new Movie();
        Movie m2 = context.getBean("Movie2",Movie.class);
        m2.setTitle("Troy");
        System.out.println(m2.getTitle());
    }
}
