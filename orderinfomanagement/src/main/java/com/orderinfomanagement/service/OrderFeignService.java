package com.orderinfomanagement.service;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;



@FeignClient(name="orderitem")
@RibbonClient(name="orderitem")
public interface OrderFeignService{

	@RequestMapping("/orderitemdetails/{product}")
	public  void getProductDetails(String productName);

	
}