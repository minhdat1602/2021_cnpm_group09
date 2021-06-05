package com.nlu.payload.response;

import java.util.List;

import com.nlu.dto.RoomTypeDTO;

public class SearchResponse {

	private List<RoomTypeDTO> listRoomType;

	public List<RoomTypeDTO> getListRoomType() {
		return listRoomType;
	}

	public void setListRoomType(List<RoomTypeDTO> listRoomType) {
		this.listRoomType = listRoomType;
	}

}
