package com.spring.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.example.Repo.StudentRepo;
import com.spring.example.model.Student;
@Service
public class StudnentServiceImpl implements StudentService{
	

@Autowired
   private StudentRepo repo;
	@Override
	public Student createStudent(Student s) {
		Student save = this.repo.save(s);
		
		return save;
	}

}
