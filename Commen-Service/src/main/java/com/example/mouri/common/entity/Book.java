package com.example.mouri.common.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long bookId;
	  private String bookName;
	  private String bookAuthor;

	    @ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "hod_Id")
		private Hod hod;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "student_Id")
		private Student student;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "lecture_Id")
		private Lecture lecture;
}
