package com.nlu.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class RoleEntity extends BaseEntity {
	@Column(name = "code")
	private String code;

	@ManyToMany(mappedBy = "roles")
	private List<UserGroupEntity> userGroups = new ArrayList<UserGroupEntity>();

	@ManyToMany(mappedBy = "roless") 
	private Set<UserEntity> users = new HashSet<UserEntity>();
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<UserGroupEntity> getUserGroups() {
		return userGroups;
	}

	public void setUserGroups(List<UserGroupEntity> userGroups) {
		this.userGroups = userGroups;
	}

}
