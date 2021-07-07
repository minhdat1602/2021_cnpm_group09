package com.nlu.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "payment_method")
public class PaymentMethodEntity extends BaseEntity {
	@Column(name = "name")
	private String name;
	@Column(name = "code")
	private String code;
	@Column(name = "description")
	private String description;

	@ManyToMany(mappedBy = "paymentMethods")
	private Set<RoomTypeEntity> roomTypes = new HashSet<RoomTypeEntity>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
