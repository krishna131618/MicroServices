package com.example.mouri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mouri.common.dto.StudentDto;
import com.example.mouri.common.services.StudentService;



import io.swagger.annotations.Api;

@RestController
@Api(value = "LMS", description = "Operations pertaining to LMS")
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping
	public ResponseEntity<StudentDto> createUser(@RequestBody StudentDto dto) {
		return new ResponseEntity<StudentDto>(studentService.saveStudent(dto), HttpStatus.CREATED);

	}
	@GetMapping()
	public List<StudentDto> getAllUsers() {
		return studentService.getAllStudents();
	}
	@GetMapping("{stdId}")
	public ResponseEntity<StudentDto> getDetailById(@PathVariable("stdId") Long stdId) {
		StudentDto studentDto = studentService.getStudentDetailByStudentId(stdId);
		return new ResponseEntity<StudentDto>(studentDto, HttpStatus.OK);

	}

	@PutMapping("{id}")
	public ResponseEntity<StudentDto> updatedetails(@RequestBody StudentDto studentDto, @PathVariable("id") Long stdId) {
		StudentDto UpdateUserValue = studentService.updateStudentDetails(studentDto, stdId);
		return new ResponseEntity<StudentDto>(UpdateUserValue, HttpStatus.OK);

	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteValue(@PathVariable("id") Long stdId) {
		studentService.deleteStudentDetails(stdId);
		return new ResponseEntity<String>("User Details Successfully Deleted", HttpStatus.OK);
	}
}


