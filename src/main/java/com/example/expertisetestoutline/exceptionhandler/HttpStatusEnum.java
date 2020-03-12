package com.example.expertisetestoutline.exceptionhandler;

public enum HttpStatusEnum {

	SUCCESSFUL("200", "request.successful", "Success", "200"),
	SERVER_ERROR("500", "server.error", "Failed","500"), 
	MANDETORY_FIELD_EXCEPTION("400", "mandetory.field", "Mandetory fields are missing or not in proper way","400"), 
	RECORDS_NOT_FIND("200", "empty.records", "No Records", "200"),
	SERVICE_UNAVAILABLE("503", "error.service.unavailable", "No Records", "503");
	

	private String responseCode;
	private String responseMessageKey;
	private String developerMessage;
	private String httpStatus;

	/**
	 * @param responseCode
	 * @param responseMessageKey
	 */
	private HttpStatusEnum(String responseCode, String responseMessageKey, String developerMessage, String httpStatus) {
		this.responseCode = responseCode;
		this.responseMessageKey = responseMessageKey;
		this.httpStatus = httpStatus;
		this.setDeveloperMessage(developerMessage);
	}

	/**
	 * @return String
	 */
	public String getCode() {
		return this.responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	/**
	 * @return String
	 */
	public String getKey() {
		return this.responseMessageKey;
	}

	/**
	 * @param responseMessageKey
	 */
	public void setResponseMessageKey(String responseMessageKey) {
		this.responseMessageKey = responseMessageKey;
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
	 * @param httpStatus
	 */
	public void setHttpStatus(String httpStatus) {
		this.httpStatus = httpStatus;
	}

	/**
	 * @return String
	 */
	public String getHttpStatus() {
		return this.httpStatus;
	}

}
