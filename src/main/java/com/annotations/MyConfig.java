package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    void add()
    {
        System.out.println("Hello");
    }
    @Bean
    public Student getstudent()
    {
        System.out.println("Creating Student Object.......");
        return new Student();
    }
}
