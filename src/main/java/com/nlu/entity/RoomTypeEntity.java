package com.nlu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "room_type")
public class RoomTypeEntity extends BaseEntity {

	@Column
	private String name;

	@Column
	private String description;

	@Column
	private double price;

	@Column
	private String image;
	
	@Column
	private int active;

	@Column(name = "max_capacity")
	private int capacity;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "type", targetEntity = RoomEntity.class)
	private List<RoomEntity> rooms;

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

	public List<RoomEntity> getRooms() {
		return rooms;
	}

	public void setRooms(List<RoomEntity> rooms) {
		this.rooms = rooms;
	}

}
