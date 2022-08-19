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

import com.example.mouri.common.dto.LectureDto;
import com.example.mouri.common.services.LectureService;


@RestController
//@Api(value = "LMS", description = "Operations pertaining to LMS")
@RequestMapping("/api/Lecture")
public class LectureController {
	@Autowired
	private LectureService lectureService;

	@PostMapping
	public ResponseEntity<LectureDto> createLecture(@RequestBody LectureDto dto) {
		return new ResponseEntity<LectureDto>(lectureService.saveLecture(dto), HttpStatus.CREATED);

	}

	@GetMapping()
	public List<LectureDto> getAllLectures() {
		return lectureService.getAllLecture();
	}

	@GetMapping("{id}")
	public ResponseEntity<LectureDto> getDetailById(@PathVariable("id") Long lectureId) {
		LectureDto lectureDto = lectureService.getLectureDetailByLectureId(lectureId);
		return new ResponseEntity<LectureDto>(lectureDto, HttpStatus.OK);

	}

	@PutMapping("{id}")
	public ResponseEntity<LectureDto> updatedetails(@RequestBody LectureDto lectureDto, @PathVariable("id") Long lectureId) {
		LectureDto UpdateUserLecture = lectureService.updateLectureDetails(lectureDto, lectureId);
		return new ResponseEntity<LectureDto>(UpdateUserLecture, HttpStatus.OK);

	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteValue(@PathVariable("id") Long lectureId) {
		lectureService.deleteLectureDetails(lectureId);
		return new ResponseEntity<String>("Lecture Details Successfully Deleted", HttpStatus.OK);
	}
}
