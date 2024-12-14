package com.springBootMVC_tutorial.tutorial.MVC.Spring.boot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentrepository;

    @Autowired
    public StudentService(StudentRepository studentrepository) {
        this.studentrepository = studentrepository;
    }

    public List<Student> getStudents(){
    return studentrepository.findAll();
    }

    public void addNewStudent(Student student) {
        System.out.println(student);
    }
}
