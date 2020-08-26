package com.orderinfomanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.orderinfomanagement.entity.OrderInfoDetails;



public interface OrderInfoRepository extends JpaRepository<OrderInfoDetails, String>{

	List<OrderInfoDetails> findByCustomerName(String customerName);

}