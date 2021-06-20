package com.nlu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlu.converter.RoomConverter;
import com.nlu.dto.RoomDTO;
import com.nlu.entity.RoomEntity;
import com.nlu.repository.RoomRepository;
import com.nlu.service.IRoomService;

@Service
public class RoomService implements IRoomService {
	@Autowired
	RoomRepository roomRepository;
	@Autowired
	RoomConverter roomConverter;
	
	
	public RoomDTO findOne(Long id) {
		RoomEntity roomEntity = this.roomRepository.findOne(id);
		return roomConverter.toDTO(roomEntity);
	}
}
