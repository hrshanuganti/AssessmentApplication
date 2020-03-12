package com.example.expertisetestoutline.exceptionhandler;

import org.springframework.http.HttpStatus;

public class GlobalException  extends Exception{
	
	private static final long serialVersionUID = 1L;

	private String responseCode;
	private String responseMessage;
	private String developerMessage;
	private HttpStatus statusCode;
	private Object responseObject;
	public GlobalException() {
	}

	public GlobalException(String message) {
		super(message);
	}

	public GlobalException(String message, Throwable cause) {
		super(message, cause);
	}

	public GlobalException(String responseCode, String responseMessage, String developerMessage) {
		super();
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.developerMessage = developerMessage;
	}

	public GlobalException(String responseCode, String responseMessage, String developerMessage,
			HttpStatus statusCode) {
		super();
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.developerMessage = developerMessage;
		this.statusCode = statusCode;
	}
	
	public GlobalException(String responseCode, String responseMessage, String developerMessage, Object responseObject,
			HttpStatus statusCode) {
		super();
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.developerMessage = developerMessage;
		this.statusCode = statusCode;
		this.responseObject = responseObject;
	}

	public String getResponseCode() {
		return this.responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return this.responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getDeveloperMessage() {
		return this.developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

	public GlobalException(String responseCode, String responseMessage) {
		super();
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
	}

	public HttpStatus getStatusCode() {
		return this.statusCode;
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
