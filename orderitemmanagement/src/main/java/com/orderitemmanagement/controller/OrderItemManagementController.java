package com.orderitemmanagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.orderitemmanagement.exception.ProductNotFoundException;
import com.orderitemmanagement.entity.OrderItemDetails;
import com.orderitemmanagement.service.OrderItemService;




@RestController
@RequestMapping(path = "/orderitem")
public class OrderItemManagementController {

	@Autowired
	OrderItemService orderItemService;

	@RequestMapping(value= "/orderitem", method=RequestMethod.GET)
	public List<OrderItemDetails> getAllOrderInfo(){
		List<OrderItemDetails> orderItemList = orderItemService.getAllOrderItems();
		if(orderItemList.isEmpty()) {
			throw new ProductNotFoundException("Product Not Found");
		}
		return orderItemList;
	}

	@RequestMapping(value ="/orderitemdetails/{product}", method=RequestMethod.GET)
	public List<OrderItemDetails> getCustomerOrdersdetails(@Valid@PathVariable("product") String productName){
		List<OrderItemDetails> myProductList = orderItemService.getProductdetails(productName); 
		if(myProductList.isEmpty()) {
			throw new ProductNotFoundException("The Specified Product Order Not Found");
		}
		return myProductList;
	}
	@RequestMapping(value= "/mycart/save", method=RequestMethod.POST)
	public void saveToCart(){
		OrderItemDetails orderItemDetails= new OrderItemDetails(1, "p1","Product1", 100);
		orderItemService.addToCart(orderItemDetails);
		System.out.println(" Saved Order Item List"+orderItemDetails);
	}



}
