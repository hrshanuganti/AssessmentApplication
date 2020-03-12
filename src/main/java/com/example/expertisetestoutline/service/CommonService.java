package com.example.expertisetestoutline.service;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;

import com.example.expertisetestoutline.exceptionhandler.GlobalException;
import com.example.expertisetestoutline.exceptionhandler.HttpStatusEnum;

public interface CommonService {
	
	public void validate(BindingResult bindingResult) throws GlobalException;

	HttpStatus convertStringToHttpStatus(HttpStatusEnum enums);
	
	public void validate(String param) throws GlobalException;


}
