package com.orderitemmanagement.exception;

public class ProductNotFoundException extends RuntimeException{
	public ProductNotFoundException(String exception) {
		super(exception);
	}
	public ProductNotFoundException(String exception,Throwable cause) {
		super(exception,cause);
	}
}