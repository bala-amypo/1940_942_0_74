//repository->StudentRepository.java

package com.example.PracticeProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Student;
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}