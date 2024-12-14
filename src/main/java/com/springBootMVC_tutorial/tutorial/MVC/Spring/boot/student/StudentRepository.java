package com.springBootMVC_tutorial.tutorial.MVC.Spring.boot.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student,Long> {

}
