package com.studentapi.studentapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.studentapi.studentapi.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
