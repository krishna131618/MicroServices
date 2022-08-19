package com.example.mouri.common.services;

import java.util.List;

import com.example.mouri.common.dto.HodDto;

public interface HodService {

	HodDto saveHod(HodDto dto);

	List<HodDto> getAllHod();

	HodDto getHodDetailByHodId(Long hodId);

	HodDto updateHodDetails(HodDto hodDto, Long hodId);

	void deleteHodDetails(Long hodId);

}
