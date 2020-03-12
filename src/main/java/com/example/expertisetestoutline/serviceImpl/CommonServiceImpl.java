package com.example.expertisetestoutline.serviceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import com.example.expertisetestoutline.exceptionhandler.GlobalException;
import com.example.expertisetestoutline.exceptionhandler.HttpStatusEnum;
import com.example.expertisetestoutline.service.CommonService;

@Service
public class CommonServiceImpl implements CommonService {

	@Override
	public void validate(BindingResult bindingResult) throws GlobalException {
		if (bindingResult.hasErrors()) {
			String message = "";
			for (FieldError error : bindingResult.getFieldErrors()) {
				message = error.getDefaultMessage();
				throw new GlobalException(HttpStatusEnum.MANDETORY_FIELD_EXCEPTION.getCode(), message,
						HttpStatusEnum.MANDETORY_FIELD_EXCEPTION.getKey(),
						convertStringToHttpStatus(HttpStatusEnum.MANDETORY_FIELD_EXCEPTION));
			}
		}
	}

	@Override
	public void validate(String param) throws GlobalException {

		if (param == null || param.isEmpty() == true) {
			String message = "Field must not be empty";
			throw new GlobalException(HttpStatusEnum.MANDETORY_FIELD_EXCEPTION.getCode(), message,
					HttpStatusEnum.MANDETORY_FIELD_EXCEPTION.getKey(),
					convertStringToHttpStatus(HttpStatusEnum.MANDETORY_FIELD_EXCEPTION));
		}
	}

	@Override
	public HttpStatus convertStringToHttpStatus(HttpStatusEnum enums) {
		HttpStatus valueOf = null;
		try {
			valueOf = HttpStatus.valueOf(Integer.parseInt(enums.getHttpStatus()));
			return valueOf;
		} catch (Exception e) {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
	}


}
