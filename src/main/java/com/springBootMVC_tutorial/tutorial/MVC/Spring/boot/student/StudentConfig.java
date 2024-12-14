package com.springBootMVC_tutorial.tutorial.MVC.Spring.boot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.FEBRUARY;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student marion = new Student("Marion","marion@gmail.com", LocalDate.of(2015,JANUARY,5));
           Student alex = new Student("Alex","alex@gmail.com", LocalDate.of(2020,FEBRUARY,20));
repository.saveAll(List.of(marion,alex));
        };
    }
}
