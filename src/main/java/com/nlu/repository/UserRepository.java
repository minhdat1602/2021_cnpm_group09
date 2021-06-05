package com.nlu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nlu.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findOneByUsernameAndStatus(String username, int status);

	UserEntity findOneByUsername(String username);

	UserEntity findOneByEmail(String email);
}
