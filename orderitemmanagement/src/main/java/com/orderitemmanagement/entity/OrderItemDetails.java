package com.orderitemmanagement.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "orderitemdetails")
public class OrderItemDetails{

	@Id
	@Column(name = "product_id")
	private int ProductId;

	@Column(name = "product_code")
	private String productCode;

	@NotNull()
	@Column(name = "product_name")
	private String productName;

	@Column(name = "quantity")
	private int quantity;

	public OrderItemDetails() {

	}
	public OrderItemDetails(int productId, String productCode, String productName, int quantity) {

		this.ProductId=productId;

		this.productCode=productCode;

		this.productName=productName;

		this.quantity=quantity;
	}
	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}