package com.orderitemmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderitemmanagement.entity.OrderItemDetails;
import com.orderitemmanagement.repository.OrderItemRepository;


@Service
public class OrderItemServiceImpl implements OrderItemService{
	
	@Autowired
	OrderItemRepository orderItemRepository;

	@Override
	public List<OrderItemDetails> getAllOrderItems() {
		return orderItemRepository.findAll();
	}

	@Override
	public List<OrderItemDetails> getProductdetails(String productName) {
		return orderItemRepository.findByProductName(productName);
	}

	@Override
	public void addToCart(OrderItemDetails orderItemDetails) {
		orderItemRepository.save(orderItemDetails);
		
	}
}