package com.example.mouri.common.services;

import java.util.List;

import com.example.mouri.common.dto.BookDto;
import com.example.mouri.common.dto.LectureDto;

public interface BookService {
	 public List<BookDto> getAllBooksByHodId(Long hodId);
	 public List<BookDto> getAllBooksByStudentId(Long studentId);
	 public List<BookDto> getAllBooksByLectureId(Long lectureId);
}
