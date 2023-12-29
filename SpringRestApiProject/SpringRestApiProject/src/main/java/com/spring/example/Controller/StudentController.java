package com.spring.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.example.Service.StudentService;
import com.spring.example.model.Student;
@RestController
public class StudentController {
	@Autowired
	private StudentService service;
    @PostMapping("/create")
	public Student createStudent(@RequestBody Student stu) {
		
		Student createStudent = this.service.createStudent(stu);
		return createStudent;

	}

}
