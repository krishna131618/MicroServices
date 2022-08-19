package com.example.mouri.common.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mouri.common.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	Optional<Student> findById(Long studentId);

}
