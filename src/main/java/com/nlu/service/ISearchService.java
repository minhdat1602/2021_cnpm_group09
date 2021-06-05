package com.nlu.service;

import java.util.Date;
import java.util.List;

import com.nlu.entity.RoomEntity;

public interface ISearchService {
	List<RoomEntity> searchRoom(Date dateFrom,Date dateTo,Integer adult,Integer children,Integer roomCount,String locaion);
}
