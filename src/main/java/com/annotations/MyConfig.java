package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
@ComponentScan(basePackages = {"MyPack"})
public class MyConfig {
    void add()
    {
        System.out.println("Hello");
    }
    @Bean("st1")
    public Student getstudent()
    {
        System.out.println("Creating Student Object.......");
        return new Student("Student1");
    }
    @Bean("st2")
    public Student createSecondStudent()
    {
        System.out.println("creating new student object............");
        return new Student("Student2");

    }
    @Bean
    public Date getdate()
    {
        System.out.println("new date created.........");
        return new Date();
    }
}
