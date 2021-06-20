package com.nlu.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "convenience")
public class ConvenientEntity extends BaseEntity {
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;

	@ManyToMany(mappedBy = "likedConvenience")
	Set<RoomTypeEntity> likesRoomType;

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

	public Set<RoomTypeEntity> getLikesRoomType() {
		return likesRoomType;
	}

	public void setLikesRoomType(Set<RoomTypeEntity> likesRoomType) {
		this.likesRoomType = likesRoomType;
	}
	
}
