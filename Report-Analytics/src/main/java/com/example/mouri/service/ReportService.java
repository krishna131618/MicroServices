package com.example.mouri.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mouri.dto.ReportDto;

public interface ReportService {
	ReportDto saveReport(ReportDto reportDto);

    List<ReportDto> getAllReportDetails ();

    ReportDto  getDetailByReportId( long id);

    //ReportDto updateReportDetails(ReportDto reportDto , long id );

    void  deleteReportDetails(long id);
}
