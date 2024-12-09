package com.springBootMVC_tutorial.tutorial.MVC.Spring.boot;

import com.springBootMVC_tutorial.tutorial.MVC.Spring.boot.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class TutorialMvcSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialMvcSpringBootApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(new Student(1L,"Peter","Peter@gmail.com", LocalDate.of(2024,10,25),21));
	}

}
