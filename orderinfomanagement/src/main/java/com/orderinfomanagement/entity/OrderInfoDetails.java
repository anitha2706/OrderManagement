package com.orderinfomanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;

@Entity
@Table(name = "orderinfodetails")
public class OrderInfoDetails{

	@Id
	@Column(name = "customer_id")
	private int customerId;
	
 
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "order_date")
	private String orderDate;

	@Column(name = "order_items")
	private String orderItems;

	@Column(name = "shipping_address")
	private String shippingAddress;

	@Column(name = "total_price")
	private double totalPrice;
	public OrderInfoDetails() {
		
	}

public OrderInfoDetails(int customerId,String customerName,String productName,String orderDate,String orderItems,String shippingAddress,double totalPrice) {
this.customerId=customerId;
this.customerName = customerName;
this.orderDate = orderDate;
this.orderItems = orderItems;
this.shippingAddress= shippingAddress;
this.totalPrice = totalPrice;
this.productName = productName;
	}

	
	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(String orderItems) {
		this.orderItems = orderItems;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}