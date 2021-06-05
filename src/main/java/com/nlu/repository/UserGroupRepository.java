package com.nlu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nlu.entity.UserGroupEntity;

public interface UserGroupRepository extends JpaRepository<UserGroupEntity, Long>{
	UserGroupEntity findOneById(Long groupId);
}
