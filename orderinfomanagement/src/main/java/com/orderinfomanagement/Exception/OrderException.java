package com.orderinfomanagement.Exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public class OrderException extends RuntimeException{
	private final String message;
	private final Throwable throwable;
	private final HttpStatus httpStatus;
	private final ZonedDateTime dateTime;
	
	public OrderException(String message, Throwable throwable, HttpStatus httpStatus, ZonedDateTime dateTime) {
		this.message = message;
		this.throwable = throwable;
		this.httpStatus = httpStatus;
		this.dateTime = dateTime;
	}

	public String getMessage() {
		return message;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public ZonedDateTime getDateTime() {
		return dateTime;
	}
}