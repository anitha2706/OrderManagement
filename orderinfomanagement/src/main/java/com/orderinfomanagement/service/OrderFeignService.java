package com.orderinfomanagement.service;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.orderinfomanagement.entity.OrderInfoDetails;


@FeignClient(name="orderitem",url="")
@RibbonClient(name="orderitem")
public interface OrderFeignService{

	@RequestMapping("/orderitemdetails/{product}")
	public List<OrderInfoDetails> getProductDetails(String productName);

	
}