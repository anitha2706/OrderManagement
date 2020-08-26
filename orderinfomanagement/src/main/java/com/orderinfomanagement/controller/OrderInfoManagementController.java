package com.orderinfomanagement.controller;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.orderinfomanagement.Exception.OrderNotFoundException;
import com.orderinfomanagement.entity.OrderInfoDetails;
import com.orderinfomanagement.service.OrderFeignService;
import com.orderinfomanagement.service.OrderInfoService;




@RestController
@RequestMapping(path = "/orderinfo")
public class OrderInfoManagementController {
	
	@Autowired
	OrderInfoService OrderInfoService;
	
	@Autowired
	OrderFeignService orderFeignService;
	
	@RequestMapping(value= "/orderinfo", method=RequestMethod.GET)
	public List<OrderInfoDetails> getAllOrderInfo(){
		List<OrderInfoDetails> orderInfoList = OrderInfoService.getAllOrderInfo();
		if(orderInfoList.isEmpty()) {
			 throw new OrderNotFoundException("Order Not Found");
		}
		else {
		return orderInfoList;
		}
	}
	
	@RequestMapping(value ="/orderinfodetails/{customer}", method=RequestMethod.GET)
	public List<OrderInfoDetails> getCustomerOrdersdetails(@PathVariable("customer") String customerName){
		List<OrderInfoDetails> myOrdersList = OrderInfoService.getCustomerOrdersdetails(customerName); 
		if(myOrdersList.isEmpty()) {
			 throw new OrderNotFoundException("The Specified Customer Order Not Found");
		}
		return myOrdersList;
	}
	
	@RequestMapping(value ="/orderProductitem/{product}", method=RequestMethod.GET)
	public List<OrderInfoDetails> getProductdetails(@PathVariable("product") String productName){
		return orderFeignService.getProductDetails(productName);
	}
	@RequestMapping(value= "/mycart/save", method=RequestMethod.POST)
	public void saveToCart(){
		OrderInfoDetails o= new OrderInfoDetails(1, "U1","P1","2020/03/05", "gg", "ggg", 100);
		OrderInfoService.addToCart(o);
		System.out.println("Created Order Info"+o);
	}
	

	
}
