package com.example.expertisetestoutline.exceptionhandler;

import org.springframework.http.HttpStatus;

public class GlobalExceptionWithResponse extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String responseCode;
	private String responseMessage;
	private String developerMessage;
	private HttpStatus statusCode;
	private Object responseObject;
	
	public GlobalExceptionWithResponse(String responseCode, String responseMessage, String developerMessage, Object responseObject,
			HttpStatus statusCode) {
		super();
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.developerMessage = developerMessage;
		this.statusCode = statusCode;
		this.responseObject = responseObject;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}

	public Object getResponseObject() {
		return responseObject;
	}

	public void setResponseObject(Object responseObject) {
		this.responseObject = responseObject;
	}
	
	
}
