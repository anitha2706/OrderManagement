package com.orderinfomanagement.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OrderNotFoundExceptionHandler {

	HttpStatus badRequest= HttpStatus.BAD_REQUEST;

	@ExceptionHandler(value= {OrderNotFoundException.class})
	public ResponseEntity<Object> exceptionhandle(OrderNotFoundException exception) {
		OrderException o= new OrderException(exception.getMessage(),exception,badRequest,ZonedDateTime.now(ZoneId.of("Z")));
		return new ResponseEntity<>(o,badRequest); 
	}
}