package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationsSpringBootApplication implements CommandLineRunner {
    @Autowired
    private Student student;

    public static void main(String[] args) {
        SpringApplication.run(AnnotationsSpringBootApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        this.student.studying();

    }
}
