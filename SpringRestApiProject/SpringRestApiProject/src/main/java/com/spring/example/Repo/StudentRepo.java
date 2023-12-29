package com.spring.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.example.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
   
}
