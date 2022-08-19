package com.example.mouri.common.dto;

import com.example.mouri.common.entity.Lecture;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LectureDto {

	 private  Long lectureId;
	  private String lectureName;
	  private String lectureEmail;
	  private Integer phoneNumber;
	  private String department;
}
