package com.nlu.converter;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nlu.dto.ConvenientDTO;
import com.nlu.dto.RoomDTO;
import com.nlu.dto.RoomTypeDTO;
import com.nlu.entity.RoomEntity;
import com.nlu.entity.RoomTypeEntity;

@Component
public class RoomConverter {
	@Autowired
	RoomTypeConverter roomTypeConverter;

	public RoomDTO toDTO(RoomEntity roomEntity, RoomTypeEntity roomTypeEntity) {
		RoomDTO result = new RoomDTO();
		result.setId(roomEntity.getId());
		result.setActive(roomEntity.getActive());
		result.setMaxCapacity(roomTypeEntity.getCapacity());
		result.setDescription(roomTypeEntity.getDescription());
		result.setImage(roomTypeEntity.getImage());
		String roomname = roomTypeEntity.getName() + roomEntity.getNumber();
		result.setRoomName(roomname);
		result.setPrice(roomTypeEntity.getPrice());
		RoomTypeDTO roomTypeDTO = this.roomTypeConverter.toDTO(roomTypeEntity);
		Set<ConvenientDTO> convenients = roomTypeDTO.getConvenients();
		result.setConvenients(convenients);
		return result;
	}
}
