package com.example.mouri.common.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mouri.common.entity.Hod;
import com.example.mouri.common.entity.Lecture;

public interface LectureRepository extends JpaRepository< Lecture,  Long> {
	Optional< Lecture> findById(Long lectureId);
}
