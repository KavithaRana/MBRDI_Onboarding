package com.teacherapi.teacherapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.teacherapi.teacherapi.model.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, Integer>{

}
