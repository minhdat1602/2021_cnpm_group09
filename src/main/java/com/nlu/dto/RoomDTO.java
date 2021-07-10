package com.nlu.dto;

import java.util.Set;

public class RoomDTO extends AbstractDTO<RoomDTO> {
	private int active;
	private int maxCapacity;
	private String description;
	private String image;
	private String roomName;
	private double price;
	private Set<ConvenientDTO> convenients;

	public Set<ConvenientDTO> getConvenients() {
		return convenients;
	}

	public void setConvenients(Set<ConvenientDTO> convenients) {
		this.convenients = convenients;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

}
