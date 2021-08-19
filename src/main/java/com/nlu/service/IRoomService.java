package com.nlu.service;

import java.util.List;

import com.nlu.dto.RoomDTO;
import com.nlu.entity.RoomEntity;

public interface IRoomService {
	public RoomDTO findOne(Long id);

	public RoomEntity findOneEnttiy(Long id);

	public List<RoomDTO> findAll();
}
