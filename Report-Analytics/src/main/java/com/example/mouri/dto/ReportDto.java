package com.example.mouri.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportDto {
	private Integer reportId;

	private Integer studentreportId;
	private Integer  lectureReportId;
	private Integer hodReportId;
}
