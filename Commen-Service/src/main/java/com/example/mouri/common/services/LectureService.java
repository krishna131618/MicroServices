package com.example.mouri.common.services;

import java.util.List;

import com.example.mouri.common.dto.HodDto;
import com.example.mouri.common.dto.LectureDto;

public interface LectureService {

	LectureDto saveLecture(LectureDto dto);

	List<LectureDto> getAllLecture();

	LectureDto getLectureDetailByLectureId(Long lectureId);

	LectureDto updateLectureDetails(LectureDto lectureDto, Long lectureId);

	void deleteLectureDetails(Long lectureId);
}
