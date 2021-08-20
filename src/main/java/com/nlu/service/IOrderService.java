package com.nlu.service;

import com.nlu.entity.OrderEntity;

public interface IOrderService {
	OrderEntity saveAndFush(OrderEntity orderEnttiy);

	OrderEntity findOneById(Long orderId);
}
