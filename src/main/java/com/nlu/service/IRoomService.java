package com.nlu.service;

import java.util.List;

import com.nlu.dto.RoomDTO;

public interface IRoomService {
	public RoomDTO findOne(Long id);

	public List<RoomDTO> findAll();
}
