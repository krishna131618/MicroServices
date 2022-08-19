package com.example.mouri.common.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mouri.common.entity.Book;
import com.example.mouri.common.entity.Hod;
import com.example.mouri.common.entity.Lecture;
import com.example.mouri.common.entity.Student;


@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	 List<Book> findByHod(Hod hod);
	 List<Book> findByStudent(Student student);
	 List<Book> findByLecture(Lecture lecture);
}
