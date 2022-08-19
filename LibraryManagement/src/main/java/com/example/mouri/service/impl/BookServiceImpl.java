//package com.example.mouri.service.impl;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.mouri.Exception.Exception;
//import com.example.mouri.dto.BookDto;
//import com.example.mouri.entity.Book;
//import com.example.mouri.mappers.BookMappers;
//import com.example.mouri.repository.BookRepository;
//import com.example.mouri.service.BookService;
//
//@Service
//public class BookServiceImpl implements BookService {
//	@Autowired
//	private BookMappers mappers;
//
//	@Autowired
//	private BookRepository bookRepository;
//
//	@Override
//	public BookDto saveBook(BookDto dto) {
//
//		Book hod = mappers.entityToDto(dto);
//		bookRepository.save(hod);
//
//		return mappers.dtoToEntity(hod);
//	}
//
//	@Override
//	public List<BookDto> getAllBook() {
//		List<Book> hods = bookRepository.findAll();
//		return hods.stream().map(map -> mappers.dtoToEntity(map)).collect(Collectors.toList());
//	}
//
//	@Override
//	public BookDto getBookDetailByBookId(long id) {
//		Book hod = bookRepository.findById(id).orElseThrow(()-> new Exception("Book", "book", id));
//		return mappers.dtoToEntity(hod);
//	}
//
//	@Override
//	public BookDto updateBookDetails(BookDto bookDto, long id) {
//		Book book = bookRepository.findById(id).orElseThrow(()-> new Exception("Book", "book", id));
//		book.setBookName(bookDto.getBookName());
//		book.setBookAuthor(bookDto.getBookAuthor());
//		book.setCreateTime(bookDto.getCreateTime());
//		book.setUpdateTime(bookDto.getUpdateTime());
// 		Book updateBook = bookRepository.save(book);
//		return mappers.dtoToEntity(updateBook);
//	}
//
//	@Override
//	public void deleteBookDetails(long id) {
//		 bookRepository.findById(id).orElseThrow(()-> new Exception("Book", "book", id));
//
//		bookRepository.deleteById(id);
//
//	}
//
//}
