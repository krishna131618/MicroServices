package com.example.mouri.common.dto;

import java.util.List;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookHodDto {

	private Long hodId;
	List<BookDto> books;
}
