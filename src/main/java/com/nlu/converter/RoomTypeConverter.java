package com.nlu.converter;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nlu.dto.ConvenientDTO;
import com.nlu.dto.RoomDTO;
import com.nlu.dto.RoomTypeDTO;
import com.nlu.entity.ConvenientEntity;
import com.nlu.entity.RoomTypeEntity;

@Component
public class RoomTypeConverter {

	@Autowired
	ConvenientConverter convenientConverter;

	public RoomTypeDTO toDTO(RoomTypeEntity e) {
		RoomTypeDTO result = new RoomTypeDTO();
		result.setId(e.getId());
		result.setCapacity(e.getCapacity());
		result.setName(e.getName());
		result.setPrice(e.getPrice());
		result.setImage(e.getImage());
		result.setDescription(e.getDescription());
		result.setConvenients(this.convert(e.getLikedConvenience()));
		return result;
	}

	public Set<ConvenientDTO> convert(Set<ConvenientEntity> ces) {
		Set<ConvenientDTO> result = new HashSet<ConvenientDTO>();
		for (ConvenientEntity ce : ces) {
			result.add(this.convenientConverter.toDTO(ce));
		}
		return result;
	}

}