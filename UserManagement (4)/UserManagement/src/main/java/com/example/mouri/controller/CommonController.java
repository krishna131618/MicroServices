package com.example.mouri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mouri.common.dto.BookDto;
import com.example.mouri.common.dto.BookHodDto;
import com.example.mouri.common.dto.BookStudentDto;
import com.example.mouri.common.services.BookService;

import io.swagger.annotations.Api;
@RestController
@Api(value = "LMS", description = "Operations pertaining to LMS")
@RequestMapping("/api/common")
public class CommonController {
    @Autowired
	private BookService bookService;
    
	@GetMapping("/hod/{hodId}")
	public ResponseEntity<BookHodDto> getAllBooksByHodId(@PathVariable(value = "hodId", required = true) Long hodId) {
     List<BookDto> bookDtos = bookService.getAllBooksByHodId(hodId);
     BookHodDto bookhodDto = new BookHodDto();
		bookhodDto.setHodId(hodId);
		bookhodDto.setBooks(bookDtos);
       return ResponseEntity.ok(bookhodDto);
	}
	@GetMapping("/student/{studentId}")
	public ResponseEntity<BookStudentDto> getAllBooksByStudentId(@PathVariable(value = "studentId", required = true) Long studentId) {
     List<BookDto> bookDtos = bookService.getAllBooksByStudentId(studentId);
     BookStudentDto bookStudentDto = new BookStudentDto();
     bookStudentDto.setStudentId(studentId);
     bookStudentDto.setBooks(bookDtos);
       return ResponseEntity.ok(bookStudentDto);
	}

}
