package com.nlu.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nlu.entity.RoomTypeEntity;

public interface RoomTypeRepository extends JpaRepository<RoomTypeEntity, Long> {

	@Query(value = "select rt.* from room_type rt "
			+ "					left join rooms r on rt.id = r.room_type_id "
			+ "					left join booking b on r.id = b.room_id "
			+ "		where rt.max_capacity >= :capacity and r.id NOT IN (SELECT b.room_id "
			+ "															FROM booking b "
			+ "															WHERE NOT ("
			+ "															b.end_date < :endDate "
			+ "															 OR\r\n"
			+ "															b.start_date > :startDate)) "
			+ "		group by rt.id having count(r.id) >= :roomNum", nativeQuery = true)
	List<RoomTypeEntity> findByFilter(@Param("capacity") int capacity, @Param("roomNum") int roomNum,
			@Param("startDate") Date startDate, @Param("endDate") Date endDate);
	
	RoomTypeEntity findById(long id);
}
