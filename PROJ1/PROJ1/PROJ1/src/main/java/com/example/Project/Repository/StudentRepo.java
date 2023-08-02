package com.example.Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Project.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
    
}
