package com.example.mouri.common.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Lecture {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private  Long lectureId;
	  private String lectureName;
	  private String lectureEmail;
	  private Integer phoneNumber;
	  private String department;
	  

	  @OneToMany(mappedBy = "lecture",cascade = CascadeType.ALL)
	  private Set<Book> books;
}
