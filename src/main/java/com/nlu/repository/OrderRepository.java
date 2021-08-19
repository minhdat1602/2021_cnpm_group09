package com.nlu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nlu.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

}
