package com.ifsp.tpeproject.controller;

import com.ifsp.tpeproject.entity.Student;
import com.ifsp.tpeproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/student")
public class StudentController {

  @Autowired
  private StudentRepository studentRepository;

  @PostMapping
  public Student saveStudent(@RequestBody Student student) {
    return studentRepository.save(student);
  }
}
