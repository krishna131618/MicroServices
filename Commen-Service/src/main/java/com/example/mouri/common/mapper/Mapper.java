package com.example.mouri.common.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.mouri.common.dto.HodDto;
import com.example.mouri.common.dto.LectureDto;
import com.example.mouri.common.dto.StudentDto;
import com.example.mouri.common.entity.Hod;
import com.example.mouri.common.entity.Lecture;
import com.example.mouri.common.entity.Student;

@Component
public class Mapper {
	  @Autowired
	    private ModelMapper mapper;



	   public Student entityToDto(StudentDto studentDto) {
	        Student student = mapper.map(studentDto, Student.class);
	        return student;
	    }



	   public StudentDto dtoToEntity(Student student) {
	        StudentDto studentDto = mapper.map(student, StudentDto.class);
	        return studentDto;
	    }
	   
	   public Hod entityToDto(HodDto hodDto) {
		   Hod hod = mapper.map(hodDto, Hod.class);
	        return hod;
	    }



	   public HodDto dtoToEntity(Hod hod) {
		   HodDto hodDto = mapper.map(hod, HodDto.class);
	        return hodDto;
	    }
	   
	   public Lecture entityToDto(LectureDto lectureDto) {
		   Lecture lecture = mapper.map(lectureDto, Lecture.class);
	        return lecture;
	    }



	   public LectureDto dtoToEntity(Lecture lecture) {
		   LectureDto lectureDto = mapper.map(lecture, LectureDto.class);
	        return lectureDto;
	    }
}
