package com.practice.demo.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobleExceptionHandler {

	@ExceptionHandler(CustomeException.NotFoundException.class)
	public ResponseEntity<ErrorResponse> productNotFoundException(CustomeException.NotFoundException exception)
	{
		return new ResponseEntity<ErrorResponse>(
				  new ErrorResponse()
				  .builder()
				  .errorCode(exception.getErrorCode())
                  .message(exception.getMessage())
                  .build()
                    ,HttpStatus.NOT_FOUND );
	}
	
	
}
