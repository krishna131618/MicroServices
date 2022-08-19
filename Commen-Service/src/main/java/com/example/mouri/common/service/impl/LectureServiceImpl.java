package com.example.mouri.common.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mouri.common.dto.LectureDto;
import com.example.mouri.common.entity.Lecture;
import com.example.mouri.common.exception.CException;
import com.example.mouri.common.mapper.Mapper;
import com.example.mouri.common.repository.LectureRepository;
import com.example.mouri.common.services.LectureService;

@Service
public class LectureServiceImpl implements LectureService {
	
	@Autowired
	private LectureRepository lectureRepository;
	@Autowired
	private Mapper mappers;

	@Override
	public LectureDto saveLecture(LectureDto dto) {
		 Lecture  lecture = mappers.entityToDto(dto);
		 lectureRepository.save(lecture);

	      return mappers.dtoToEntity(lecture);
	}

	@Override
	public List<LectureDto> getAllLecture() {
		 List<Lecture> lecture = lectureRepository.findAll();
	      return lecture.stream().map(map -> mappers.dtoToEntity(map)).collect(Collectors.toList());
	}

	@Override
	public LectureDto getLectureDetailByLectureId(Long lectureId) {
		Lecture lecture = lectureRepository.findById(lectureId).orElseThrow(()-> new CException("Lecture", "lecture", lectureId));
	      return mappers.dtoToEntity(lecture);
	}

	@Override
	public LectureDto updateLectureDetails(LectureDto lectureDto, Long lectureId) {
		Lecture lecture = lectureRepository.findById(lectureId).orElseThrow(()-> new CException("Lecture", "lecture", lectureId));
		lecture.setLectureName(lectureDto.getLectureName());
		lecture.setLectureEmail(lectureDto.getLectureEmail());
		lecture.setPhoneNumber(lectureDto.getPhoneNumber());
		lecture.setDepartment(lectureDto.getDepartment());
		
		Lecture updateLecture = lectureRepository.save(lecture);
	      return mappers.dtoToEntity(updateLecture);
	}

	@Override
	public void deleteLectureDetails(Long lectureId) {
		lectureRepository.findById(lectureId).orElseThrow(()-> new CException("Lecture", "lecture", lectureId));
		lectureRepository.deleteById(lectureId);
		
	}

}
