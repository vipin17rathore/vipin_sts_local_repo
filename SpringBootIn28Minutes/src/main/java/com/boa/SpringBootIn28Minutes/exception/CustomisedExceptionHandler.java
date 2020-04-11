package com.boa.SpringBootIn28Minutes.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomisedExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleAllException(Exception ex , WebRequest webreq){
	    ExceptionResponse response = new ExceptionResponse();
	    response.setMessage(ex.getMessage());
	    response.setDate(new Date());
	    response.setDetails(webreq.getDescription(false));
		return new ResponseEntity<ExceptionResponse>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

		ExceptionResponse response = new ExceptionResponse();
	    response.setMessage(ex.getMessage());
	    response.setDate(new Date());
	    response.setDetails(ex.getBindingResult().toString());
		return new ResponseEntity<Object>(response,HttpStatus.BAD_REQUEST);
		}

}
