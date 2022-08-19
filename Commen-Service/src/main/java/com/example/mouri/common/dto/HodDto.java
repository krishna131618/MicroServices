package com.example.mouri.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HodDto {
	private  Long hodId;
	  private String hodName;
	  private String hodEmail;
	  private Integer phoneNumber;
	  private String department;
}
