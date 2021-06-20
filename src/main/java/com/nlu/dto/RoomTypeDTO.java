package com.nlu.dto;

import java.util.Set;

import com.nlu.entity.ConvenientEntity;
import com.nlu.entity.RoomTypeEntity;

public class RoomTypeDTO {

	private long id;

	private String name;

	private String description;

	private double price;

	private String image;

	private int capacity;

	private Set<ConvenientDTO> convenients;

	public static RoomTypeDTO fromEntity(RoomTypeEntity roomTypeEntity) {
		RoomTypeDTO result = new RoomTypeDTO();

		result.setId(roomTypeEntity.getId());
		result.setName(roomTypeEntity.getName());
		result.setDescription(roomTypeEntity.getDescription());
		result.setPrice(roomTypeEntity.getPrice());
		result.setImage(roomTypeEntity.getImage());
		result.setCapacity(roomTypeEntity.getCapacity());

		return result;
	}

	public Set<ConvenientDTO> getConvenients() {
		return convenients;
	}

	public void setConvenients(Set<ConvenientDTO> convenients) {
		this.convenients = convenients;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
