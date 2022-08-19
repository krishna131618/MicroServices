//package com.example.mouri.service.impl;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import com.example.mouri.Exception.Exception;
//import com.example.mouri.dto.StudentDto;
//import com.example.mouri.entity.Student;
//import com.example.mouri.mappers.StudentMappers;
//import com.example.mouri.repository.StudentRepository;
//import com.example.mouri.service.StudentService;
//@Service
//public class StudentServiceImpl implements StudentService {
//	@Autowired
//	private StudentMappers mappers;
//	
//	@Autowired
//	private StudentRepository  repository;
//	
//	@Autowired
//	private RestTemplate restTemplate;
//	@Override
//	public StudentDto saveStudent(StudentDto userDto) {
//		Student user= mappers.entityToDto(userDto);
//		repository.save(user);
//		
//		return mappers.dtoToEntity(user);
//	}
//
//	@Override
//	public List<StudentDto> getAllStudents() {
//		List<Student> users = repository.findAll();
//		return users.stream().map(map->mappers.dtoToEntity(map))
//				                            .collect(Collectors.toList());
//	}
//
//	@Override
//	public StudentDto getStudentDetailByStudentId(long id) {
//		Student user = repository.findById(id).
//				orElseThrow(()-> new Exception("User", "user", id));
//		return mappers.dtoToEntity(user);
//	}
//
//	@Override
//	public StudentDto updateStudentDetails(StudentDto studentDto, long id) {
//		Student student = repository.findById(id).
//				orElseThrow(()-> new Exception("User", "user", id));
//		student.setStuName(studentDto.getStuName());
//		student.setDepartment(studentDto.getDepartment());
//		student.setPhoneNumber(studentDto.getPhoneNumber());
//		student.setEmail(studentDto.getEmail());
//		
//		Student updateStudent  = repository.save(student);
//		return mappers.dtoToEntity(updateStudent);
//	}
//
//	@Override
//	public void deleteStudentDetails(long id) {
//		Student student = repository.findById(id).
//				orElseThrow(()-> new Exception("User", "user", id));
//		repository.deleteById(id);
//		
//	}
//
////	@Override
////	public ResponceTemplate getByStudentWithBook(Long id) {
////		
////	}
//
//}
