package com.nlu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlu.entity.OrderEntity;
import com.nlu.repository.OrderRepository;
import com.nlu.service.IOrderService;

@Service
public class OrderService implements IOrderService {
	@Autowired
	OrderRepository orderRepos;

	@Override
	public OrderEntity saveAndFush(OrderEntity orderEnttiy) {
		// TODO Auto-generated method stub
		return this.orderRepos.saveAndFlush(orderEnttiy);
	}

	@Override
	public OrderEntity findOneById(Long orderId) {
		// TODO Auto-generated method stub
		return this.orderRepos.findOne(orderId);
	}

}
