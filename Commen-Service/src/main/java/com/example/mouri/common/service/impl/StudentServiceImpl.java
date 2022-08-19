package com.example.mouri.common.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mouri.common.dto.StudentDto;
import com.example.mouri.common.entity.Hod;
import com.example.mouri.common.entity.Student;
import com.example.mouri.common.exception.CException;
import com.example.mouri.common.mapper.Mapper;
import com.example.mouri.common.repository.StudentRepository;
import com.example.mouri.common.services.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
	private StudentRepository studentRepository;
    
    @Autowired
    private Mapper mappers;
	@Override
	public StudentDto saveStudent(StudentDto dto) {
		Student student = mappers.entityToDto(dto);
	      studentRepository.save(student);

	      return mappers.dtoToEntity(student);
	}

	@Override
	public List<StudentDto> getAllStudents() {
		List<Student> student = studentRepository.findAll();
	      return student.stream().map(map -> mappers.dtoToEntity(map)).collect(Collectors.toList());
	}

	@Override
	public StudentDto getStudentDetailByStudentId(Long stdId) {
		Student student = studentRepository.findById(stdId).orElseThrow(()-> new CException("Student", "student", stdId));
	      return mappers.dtoToEntity(student);
	}

	@Override
	public StudentDto updateStudentDetails(StudentDto studentDto, Long stdId) {
		Student student = studentRepository.findById(stdId).orElseThrow(()-> new CException("Student", "student", stdId));
		student.setStuName(studentDto.getStuName());
		student.setEmail(studentDto.getEmail());
		student.setPhoneNumber(studentDto.getPhoneNumber());
		student.setDepartment(studentDto.getDepartment());
		Student updateStudent = studentRepository.save(student);
	      return mappers.dtoToEntity(updateStudent);
	}

	@Override
	public void deleteStudentDetails(Long stdId) {
		studentRepository.findById(stdId).orElseThrow(()-> new CException("Student", "student", stdId));
		studentRepository.deleteById(stdId);
		
	}

}
