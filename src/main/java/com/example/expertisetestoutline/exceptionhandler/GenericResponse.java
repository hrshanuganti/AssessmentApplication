package com.example.expertisetestoutline.exceptionhandler;


public class GenericResponse {

	private String responseMessage;
	private String developerMessage;
	private String responseCode;

	/**
	 * @return String
	 */
	public String getResponseMessage() {
		return this.responseMessage;
	}

	/**
	 * @param responseMessage
	 */
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	/**
	 * @return String
	 */
	public String getDeveloperMessage() {
		return this.developerMessage;
	}

	/**
	 * @param developerMessage
	 */
	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

	/**
	 * @return String
	 */
	public String getResponseCode() {
		return this.responseCode;
	}

	/**
	 * @param responseCode
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public GenericResponse(String responseMessage, String developerMessage, String responseCode) {
		super();
		this.responseMessage = responseMessage;
		this.developerMessage = developerMessage;
		this.responseCode = responseCode;
	}

	public GenericResponse() {
		super();
	}
	

}
