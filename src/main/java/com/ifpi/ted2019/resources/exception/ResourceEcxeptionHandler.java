package com.ifpi.ted2019.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.ifpi.ted2019.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceEcxeptionHandler {
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, 
			HttpServletRequest request){
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(),
				e.getMessage(), System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}

}
