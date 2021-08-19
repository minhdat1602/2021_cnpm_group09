package com.nlu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nlu.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
//	 @Query(value = "select u from User u where u.username = :username and u.status = :status")
	UserEntity findOneByUsernameAndStatus(String username,int status);

	UserEntity findOneByUsername(String username);

	UserEntity findOneByEmail(String email);
}
