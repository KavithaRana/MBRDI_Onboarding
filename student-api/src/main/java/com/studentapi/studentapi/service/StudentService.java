package com.studentapi.studentapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapi.studentapi.model.Student;
import com.studentapi.studentapi.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAll() {
		return (List<Student>) studentRepository.findAll();
	}

}
