package com.teacherapi.teacherapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.teacherapi.teacherapi.model.Teacher;
import com.teacherapi.teacherapi.service.TeacherService;

@RestController
public class TeacherController {
	@Autowired
	private TeacherService teacherService;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/teachers")
	public List<Teacher> getAll() {
		return teacherService.getAll();
	}
	
	@GetMapping("/students")
	public List<Object> getStudent() {
		Object[] students = restTemplate.getForObject("http://student-microservice/students", Object[].class);
		return Arrays.asList(students);
	}
}
