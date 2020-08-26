package com.orderitemmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderitemmanagement.entity.OrderItemDetails;


public interface OrderItemRepository extends JpaRepository<OrderItemDetails, String>{
	
	List<OrderItemDetails> findByProductName(String productName);
}