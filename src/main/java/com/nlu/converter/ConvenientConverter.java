package com.nlu.converter;

import org.springframework.stereotype.Component;

import com.nlu.dto.ConvenientDTO;
import com.nlu.entity.ConvenientEntity;

@Component
public class ConvenientConverter {
	public ConvenientDTO toDTO(ConvenientEntity ce) {
		ConvenientDTO result = new ConvenientDTO();
		result.setId(ce.getId());
		result.setDesciption(ce.getDescription());
		result.setName(ce.getName());
		return result;
	}
}
