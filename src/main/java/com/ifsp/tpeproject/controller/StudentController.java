package com.ifsp.tpeproject.controller;

import com.ifsp.tpeproject.entity.Student;
import com.ifsp.tpeproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/students")
public class StudentController {

  private StudentRepository studentRepository;

  public StudentController(final StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public ResponseEntity<Student> save(@RequestBody Student student) {
    studentRepository.save(student);
    return new ResponseEntity<>(student, HttpStatus.OK);
  }
}
