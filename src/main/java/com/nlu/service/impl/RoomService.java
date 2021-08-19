package com.nlu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlu.converter.RoomConverter;
import com.nlu.dto.RoomDTO;
import com.nlu.entity.RoomEntity;
import com.nlu.entity.RoomTypeEntity;
import com.nlu.repository.RoomRepository;
import com.nlu.repository.RoomTypeRepository;
import com.nlu.service.IRoomService;

@Service
public class RoomService implements IRoomService {
	@Autowired
	RoomRepository roomRepository;
	@Autowired
	RoomTypeRepository roomTypeRepository;
	@Autowired
	RoomConverter roomConverter;

	public RoomDTO findOne(Long id) {
		RoomEntity roomEntity = this.roomRepository.findOne(id);
		RoomTypeEntity roomTypeEntity = roomEntity.getType();
		RoomDTO result = this.roomConverter.toDTO(roomEntity, roomTypeEntity);
		return result;
	}

	@Override
	public List<RoomDTO> findAll() {
		// TODO Auto-generated method stub
		List<RoomDTO> result = new ArrayList<RoomDTO>();
		List<RoomEntity> roomsEntity = this.roomRepository.findAll();
		for (RoomEntity roomEntity : roomsEntity) {
			RoomTypeEntity roomTypeEntity = roomEntity.getType();
			RoomDTO roomDTO = this.roomConverter.toDTO(roomEntity, roomTypeEntity);
			result.add(roomDTO);
		}

		return result;
	}

	@Override
	public RoomEntity findOneEnttiy(Long id) {
		// TODO Auto-generated method stub
		return this.roomRepository.findById(id);
	}
}
