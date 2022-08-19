package com.example.mouri.common.dto;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookStudentDto {

	private Long studentId;
	List<BookDto> books;
}
