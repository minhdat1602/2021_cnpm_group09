package com.nlu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nlu.entity.RoomEntity;

public interface RoomRepository extends JpaRepository<RoomEntity, Long> {
	RoomEntity findById(long id);
}
