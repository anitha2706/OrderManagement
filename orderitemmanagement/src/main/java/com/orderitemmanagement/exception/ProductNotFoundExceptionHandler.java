package com.orderitemmanagement.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductNotFoundExceptionHandler {
	HttpStatus badRequest= HttpStatus.BAD_REQUEST;
	@ExceptionHandler(value= {ProductNotFoundException.class})
	public ResponseEntity<Object> exceptionhandle(ProductNotFoundException exception) {
		ProductException productException= new ProductException(exception.getMessage(),exception,badRequest,ZonedDateTime.now(ZoneId.of("Z")));
		return new ResponseEntity<>(productException,badRequest); 
	}
}