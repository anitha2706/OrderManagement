package com.orderinfomanagement.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;

import com.orderinfomanagement.entity.OrderInfoDetails;


public interface OrderInfoService{

	public List<OrderInfoDetails> getAllOrderInfo();

	public List<OrderInfoDetails> getCustomerOrdersdetails(String customerName);
	

	public void addToCart(OrderInfoDetails asList);
	
}