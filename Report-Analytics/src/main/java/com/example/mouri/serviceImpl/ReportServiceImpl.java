package com.example.mouri.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mouri.Exception.Exception;
import com.example.mouri.dto.ReportDto;
import com.example.mouri.entity.Report;
import com.example.mouri.mapings.ReportMapping;
import com.example.mouri.repository.ReportRepository;
import com.example.mouri.service.ReportService;
@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportRepository reportRepository;
	
	@Autowired
	private ReportMapping mapping;
	
	
	@Override
	public ReportDto saveReport(ReportDto reportDto) {
		
		Report report = mapping.entityToDto(reportDto);
		reportRepository.save(report);
		return mapping.dtoToEntity(report);
	}

	@Override
	public List<ReportDto> getAllReportDetails() {
		List<Report> list= reportRepository.findAll();
		return list.stream().map(map ->mapping.dtoToEntity(map)).collect(Collectors.toList());
	}

	@Override
	public ReportDto getDetailByReportId(long id) {
		Report report = reportRepository.findById(id).orElseThrow(()-> new Exception("User", "user", id));
		return mapping.dtoToEntity(report);
	}


	@Override
	public void deleteReportDetails(long id) {
		reportRepository.findById(id).orElseThrow(()-> new Exception("User", "user", id));
		reportRepository.deleteById(id);
	}

}
