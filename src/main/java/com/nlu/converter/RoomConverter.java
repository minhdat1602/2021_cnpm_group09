package com.nlu.converter;

import org.springframework.stereotype.Component;

import com.nlu.dto.RoomDTO;
import com.nlu.entity.RoomEntity;

@Component
public class RoomConverter {
	public RoomDTO toDTO(RoomEntity e) {
		RoomDTO result = new RoomDTO();
		result.setId(e.getId());
		result.setNumber(e.getNumber());
		result.setActive(e.getActive());
		result.setRoomTypeId(e.getType().getId());
		return result;
	}
}
