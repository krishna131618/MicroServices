package com.example.mouri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mouri.dto.ReportDto;
import com.example.mouri.service.ReportService;
import com.example.mouri.serviceImpl.ReportServiceImpl;


@RestController
@RequestMapping("/api/report")
public class ReportController {
	
	@Autowired
	private ReportServiceImpl service;

	@PostMapping
	public ResponseEntity<ReportDto> createLecture(@RequestBody ReportDto dto) {
		return new ResponseEntity<ReportDto>(service.saveReport(dto), HttpStatus.CREATED);

	}

	@GetMapping()
	public List<ReportDto> getAllLectures() {
		return service.getAllReportDetails();
	}

	@GetMapping("{idd}")
	public ResponseEntity<ReportDto> getDetailById(@PathVariable("idd") long id) {
		ReportDto reportDto = service.getDetailByReportId(id);
		return new ResponseEntity<ReportDto>(reportDto, HttpStatus.OK);

	}

//	@PutMapping("{id}")
//	public ResponseEntity<LectureDto> updatedetails(@RequestBody LectureDto lectureDto, @PathVariable("id") long id) {
//		LectureDto UpdateUserLecture = service.updateLectureDetails(lectureDto, id);
//		return new ResponseEntity<LectureDto>(UpdateUserLecture, HttpStatus.OK);
//
//	}

	@DeleteMapping("{idd}")
	public ResponseEntity<String> deleteValue(@PathVariable("idd") long id) {
		service.deleteReportDetails(id);
		return new ResponseEntity<String>("Hod Details Successfully Deleted", HttpStatus.OK);
	}
}
