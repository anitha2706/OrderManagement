package com.orderitemmanagement.service;

import java.util.List;

import com.orderitemmanagement.entity.OrderItemDetails;


public interface OrderItemService{

	

	public List<OrderItemDetails> getAllOrderItems();

	public List<OrderItemDetails> getProductdetails(String productName);

	public void addToCart(OrderItemDetails orderItemDetails);
}