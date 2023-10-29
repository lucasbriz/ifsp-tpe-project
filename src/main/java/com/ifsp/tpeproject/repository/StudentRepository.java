package com.ifsp.tpeproject.repository;

import com.ifsp.tpeproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
