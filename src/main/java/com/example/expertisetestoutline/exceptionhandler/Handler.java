package com.example.expertisetestoutline.exceptionhandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@Component
public class Handler {

	@Autowired
	private Environment env;

	private static Logger logger = LoggerFactory.getLogger(Handler.class);

	@ExceptionHandler(value = GlobalException.class)
	public ResponseEntity<?> soulsticeClientException(GlobalException e) {
		e.printStackTrace();
		GenericResponse response = new GenericResponse();
		response.setResponseCode(e.getResponseCode());
		response.setResponseMessage(e.getResponseMessage());
		response.setDeveloperMessage(e.getDeveloperMessage());
		logger.info(".........Request Ending................... ");
		return new ResponseEntity<>(response, e.getStatusCode());
	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<?> Exception(Exception e) {
		e.printStackTrace();
		GenericResponse response = new GenericResponse();
		response.setResponseCode(HttpStatusEnum.SERVER_ERROR.getCode());
		response.setResponseMessage(this.env.getProperty(HttpStatusEnum.SERVER_ERROR.getKey()));
		response.setDeveloperMessage("exception : " + e + "");
		logger.info(".........Request Ending................... ");
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
//	@ExceptionHandler(value = GlobalExceptionWithResponse.class)
//	public ResponseEntity<?> GlobalExceptionWithResponse(GlobalExceptionWithResponse e) {
//		e.printStackTrace();
//		GlobalExceptionResponse response = new GlobalExceptionResponse();
//		response.setResponseCode(e.getResponseCode());
//		response.setResponseMessage(e.getResponseMessage());
//		response.setDeveloperMessage(e.getDeveloperMessage());
//		response.setData(e.getResponseObject());
//		logger.info(".........Request Ending................... ");
//		return new ResponseEntity<>(response, e.getStatusCode());
//	}

}
