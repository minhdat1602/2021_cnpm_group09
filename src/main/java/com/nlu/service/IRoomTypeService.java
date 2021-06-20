package com.nlu.service;

import java.util.Date;
import java.util.List;

import com.nlu.dto.RoomTypeDTO;
import com.nlu.entity.RoomTypeEntity;

public interface IRoomTypeService {
	List<RoomTypeDTO> getByFilter(int capacity, int roomNum, Date startDate, Date endDate);

	RoomTypeEntity findById(long id);
	RoomTypeDTO findOne(long id);
}
