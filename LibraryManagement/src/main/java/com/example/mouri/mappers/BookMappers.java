//package com.example.mouri.mappers;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.example.mouri.dto.BookDto;
//import com.example.mouri.entity.Book;
//
//@Component
//public class BookMappers {
//	@Autowired
//	private ModelMapper mapper;
//
//	public Book entityToDto(BookDto dto) {
//		Book hod = mapper.map(dto, Book.class);
//		return hod;
//	}
//
//	public BookDto dtoToEntity(Book hod) {
//		BookDto dto = mapper.map(hod, BookDto.class);
//		return dto;
//	}
//	}