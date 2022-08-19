package com.example.mouri.mapings;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.mouri.dto.ReportDto;
import com.example.mouri.entity.Report;

@Component
public class ReportMapping {
	@Autowired
    private ModelMapper mapper;



    public Report entityToDto(ReportDto dto) {
        Report hod = mapper.map(dto, Report.class);
        return hod;
    }

    public ReportDto dtoToEntity(Report hod) {
    	ReportDto dto = mapper.map(hod, ReportDto.class);
        return dto;
    }
}
