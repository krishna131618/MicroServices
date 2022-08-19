package com.example.mouri.common.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mouri.common.dto.HodDto;
import com.example.mouri.common.entity.Hod;
import com.example.mouri.common.exception.CException;
import com.example.mouri.common.mapper.Mapper;
import com.example.mouri.common.repository.BookRepository;
import com.example.mouri.common.repository.HodRepository;
import com.example.mouri.common.services.HodService;
@Service
public class HodServiceImpl implements HodService{

  @Autowired
  private BookRepository bookRepository;
	@Autowired
	private HodRepository hodRepository;
	@Autowired
	private Mapper mappers;
	//private ModelMapper modelMapper = new ModelMapper();
	
  @Override
  public HodDto saveHod(HodDto dto) {

      Hod hod = mappers.entityToDto(dto);
      hodRepository.save(hod);

      return mappers.dtoToEntity(hod);
  }

	@Override
	public List<HodDto> getAllHod() {
      List<Hod> hods = hodRepository.findAll();
      return hods.stream().map(map -> mappers.dtoToEntity(map)).collect(Collectors.toList());
	}

	@Override
	public HodDto getHodDetailByHodId(Long hodId) {
      Hod hod = hodRepository.findById(hodId).orElseThrow(()-> new CException("Hod", "hod", hodId));
      return mappers.dtoToEntity(hod);
	}

  @Override
  public HodDto updateHodDetails(HodDto hodDto, Long hodId) {
      Hod hod = hodRepository.findById(hodId).orElseThrow(()-> new CException("Hod", "hod", hodId));
      hod.setHodName(hodDto.getHodName());
      hod.setHodEmail(hodDto.getHodEmail());
      hod.setPhoneNumber(hodDto.getPhoneNumber());
      hod.setDepartment(hodDto.getDepartment());
      Hod updateHod = hodRepository.save(hod);
      return mappers.dtoToEntity(updateHod);
  }

	@Override
	public void deleteHodDetails(Long hodId) {
      hodRepository.findById(hodId).orElseThrow(()-> new CException("Hod", "hod", hodId));

     hodRepository.deleteById(hodId);
		
	}

}
