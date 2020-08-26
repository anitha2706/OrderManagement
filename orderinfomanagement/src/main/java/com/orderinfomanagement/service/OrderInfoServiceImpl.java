package com.orderinfomanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.orderinfomanagement.entity.OrderInfoDetails;
import com.orderinfomanagement.repository.OrderInfoRepository;



@Service
public class OrderInfoServiceImpl implements OrderInfoService{
	
	@Autowired
	OrderInfoRepository orderInfoRepository;

	@Override
	
	public List<OrderInfoDetails> getAllOrderInfo() {
		return orderInfoRepository.findAll();
	}

	@Override
	public List<OrderInfoDetails> getCustomerOrdersdetails(String customerName) {
		return orderInfoRepository.findByCustomerName(customerName);
	}

	@Override
	public void addToCart(OrderInfoDetails asList) {
		orderInfoRepository.save(asList);
		
	}
}