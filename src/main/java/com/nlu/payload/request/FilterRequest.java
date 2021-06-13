package com.nlu.payload.request;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class FilterRequest {
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date startDate;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date endDate;

	private Integer adult;

	private Integer children;

	private Integer roomNum;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getAdult() {
		return adult;
	}

	public void setAdult(int adult) {
		this.adult = adult;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public Integer getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

}
