package com.teacherapi.teacherapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacherapi.teacherapi.model.Teacher;
import com.teacherapi.teacherapi.repository.TeacherRepository;

@Service
public class TeacherService {
	@Autowired
	private TeacherRepository teacherRepository;

	public List<Teacher> getAll() {
		return (List<Teacher>) teacherRepository.findAll();
	}

}
