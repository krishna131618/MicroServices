package com.example.mouri.common.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookLectureDto {
	private  Long lectureId;
	List<BookDto> books;
}
