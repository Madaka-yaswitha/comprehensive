package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class DoctorErrorException {
	@ResponseBody
	@ExceptionHandler(DoctorNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String doctorNotFoundHandler(DoctorNotFoundException ex ) {
		return ex.getMessage();
		
	}
	@ResponseBody
	@ExceptionHandler(DoctorNotFoundException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	String doctorExisted(DoctorExistedException ex ) {
		return ex.getMessage();
	
}
}
