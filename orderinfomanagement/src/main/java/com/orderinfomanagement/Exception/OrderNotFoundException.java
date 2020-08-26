package com.orderinfomanagement.Exception;

public class OrderNotFoundException extends RuntimeException{
	public OrderNotFoundException(String exception) {
		super(exception);
	}
	public OrderNotFoundException(String exception,Throwable cause) {
		super(exception,cause);
	}
}