package com.example.mouri.common.services;

import java.util.List;

import com.example.mouri.common.dto.StudentDto;

public interface StudentService {

	StudentDto saveStudent(StudentDto dto);

	List<StudentDto> getAllStudents();

	StudentDto getStudentDetailByStudentId(Long stdId);

	StudentDto updateStudentDetails(StudentDto studentDto, Long stdId);

	void deleteStudentDetails(Long stdId);

}
