package com.nlu.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlu.converter.RoomTypeConverter;
import com.nlu.dto.RoomTypeDTO;
import com.nlu.entity.RoomTypeEntity;
import com.nlu.repository.RoomTypeRepository;
import com.nlu.service.IRoomTypeService;

@Service
public class RoomTypeService implements IRoomTypeService {

	@Autowired
	private RoomTypeRepository roomTypeRepository;
	@Autowired
	private RoomTypeConverter roomTypeConverter;

	@Override
	public List<RoomTypeDTO> getByFilter(int capacity, int roomNum, Date startDate, Date endDate) {
		List<RoomTypeEntity> roomTypeEntitys;
		try {
			roomTypeEntitys = roomTypeRepository.findByFilter(capacity, roomNum, startDate, endDate);
		} catch (Exception e) {
			roomTypeEntitys = null;
			System.out.println(e.getMessage());
		}
		List<RoomTypeDTO> roomTypeDTOs = new ArrayList<RoomTypeDTO>();
		for (RoomTypeEntity rte : roomTypeEntitys) {
			roomTypeDTOs.add(RoomTypeDTO.fromEntity(rte));
		}
		return roomTypeDTOs;
	}
	
	@Override
	public List<RoomTypeEntity> findByKey(String key){
		List<RoomTypeEntity> result = roomTypeRepository.findByKey(key);
		return result;
	}

	@Override
	public RoomTypeEntity findById(long id) {
		return roomTypeRepository.findById(id);
	}

	@Override
	public RoomTypeDTO findOne(long id) {
		// TODO Auto-generated method stub
		RoomTypeEntity rte = this.roomTypeRepository.findOne(id);
		return this.roomTypeConverter.toDTO(rte);
	}

}
