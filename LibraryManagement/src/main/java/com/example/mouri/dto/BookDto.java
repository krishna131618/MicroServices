package com.example.mouri.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BookDto {
	
	  private  long bookId;
	  private String bookName;
	  private String bookAuthor;
	  private LocalDateTime createTime;
	  private LocalDateTime updateTime;
	  
}
