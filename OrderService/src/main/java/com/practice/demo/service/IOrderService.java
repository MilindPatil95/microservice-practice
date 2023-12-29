package com.practice.demo.service;

import com.practice.demo.entity.Order;
import com.practice.demo.model.OrderRequest;

public interface IOrderService {

	public Order plceOrder(OrderRequest orderRequest);
}
