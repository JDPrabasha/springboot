package com.example.springboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student miriam = new Student("Mariam", LocalDate.of(2000,12,21),"04@gmail.com");
            Student alex = new Student("Alex",LocalDate.of(2001,5,23),"ale4@gmail.com");
            repository.saveAll(List.of(miriam,alex));
        };
    }
}
