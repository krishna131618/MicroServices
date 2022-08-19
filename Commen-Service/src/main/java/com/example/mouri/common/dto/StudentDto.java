package com.example.mouri.common.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
	private  Long stdId;
	  private String StuName;
	  private String email;
	  private Integer phoneNumber;
	  private String department;
}
