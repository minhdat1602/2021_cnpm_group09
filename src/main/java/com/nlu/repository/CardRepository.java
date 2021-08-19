package com.nlu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nlu.entity.CardEntity;

public interface CardRepository extends JpaRepository<CardEntity, Long>{

}
