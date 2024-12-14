package com.springBootMVC_tutorial.tutorial.MVC.Spring.boot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

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
         Optional<Student> studentOptimal = studentrepository.findStudentByEmail(student.getEmail());
         if(studentOptimal.isPresent()){
             throw new IllegalStateException("email taken");
         }
         studentrepository.save(student);
        System.out.println(student);

    }

    public void deleteStudent(Long id){
boolean exists = studentrepository.existsById(id);
if(!exists){
    throw new IllegalStateException("Student with id "+id+" does not exsist");
}else{
 studentrepository.deleteById(id);
}
    }

    public void updateStudent(Student student) {
        System.out.println(student +" to be updated");
        boolean exists = studentrepository.existsById(student.getId());
        if(!exists){
            throw new IllegalStateException("Student with id "+student.getId()+" does not exsist");
        }else{
            System.out.println("now updateing the student");
            studentrepository.save(student);
        }
    }
}
