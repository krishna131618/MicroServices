package com.example.mouri.common.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mouri.common.dto.BookDto;
import com.example.mouri.common.dto.LectureDto;
import com.example.mouri.common.entity.Book;
import com.example.mouri.common.entity.Hod;
import com.example.mouri.common.entity.Lecture;
import com.example.mouri.common.entity.Student;
import com.example.mouri.common.repository.BookRepository;
import com.example.mouri.common.repository.HodRepository;
import com.example.mouri.common.repository.LectureRepository;
import com.example.mouri.common.repository.StudentRepository;
import com.example.mouri.common.services.BookService;
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private HodRepository hodRepository;
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private LectureRepository lectureRepository;
	@Override
	public List<BookDto> getAllBooksByHodId(Long hodId) {
		Optional<Hod> hod = hodRepository.findById(hodId);
		List<Book> foundBooks = bookRepository.findByHod(hod.get());
		
		return foundBooks.stream().map(book->{
			BookDto bookDto= new BookDto();
			bookDto.setBookName(book.getBookName());
			bookDto.setBookId(book.getBookId());
			bookDto.setBookAuthor(book.getBookAuthor());
			
			return bookDto;
			
		}).collect(Collectors.toList());
	}

	@Override
	public List<BookDto> getAllBooksByStudentId(Long studentId) {
		Optional<Student> student = studentRepository.findById(studentId);
		List<Book> foundBooks = bookRepository.findByStudent(student.get());
		
		return foundBooks.stream().map(book->{
			BookDto bookDto= new BookDto();
			bookDto.setBookName(book.getBookName());
			bookDto.setBookId(book.getBookId());
			bookDto.setBookAuthor(book.getBookAuthor());
			
			return bookDto;
			
		}).collect(Collectors.toList());
	}
//	@Override 
//	public List<BookDto> getAllBooksByHodId(Long hodId) {
//		
//		Optional<Hod> hod = hodRepository.findById(hodId);
//		List<Book> foundBooks = bookRepository.findByHod(hod.get());
//		
//		return foundBooks.stream().map(book->{
//			BookDto bookDto= new BookDto();
//			bookDto.setBookName(book.getBookName());
//			bookDto.setBookId(book.getBookId());
//			bookDto.setBookAuthor(book.getBookAuthor());
//			
//			return bookDto;
//			
//		}).collect(Collectors.toList());
//	}

	@Override
	public List<BookDto> getAllBooksByLectureId(Long lectureId) {
		Optional<Lecture> lecture = lectureRepository.findById(lectureId);
		List<Book> foundBooks = bookRepository.findByLecture(lecture.get());
		
		return foundBooks.stream().map(book->{
			BookDto bookDto= new BookDto();
			bookDto.setBookName(book.getBookName());
			bookDto.setBookId(book.getBookId());
			bookDto.setBookAuthor(book.getBookAuthor());
			
			return bookDto;
			
		}).collect(Collectors.toList());
	}
}
