package com.granpree.utils;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

/**
 * Created by psmkab on 2018. 1. 2..
 */

// TODO : add javax.annoation.nullable api.
@Getter
@Setter(AccessLevel.PRIVATE)
public class ResponseWrapper<T> {

	private static final String EMPTY_STRING = "";

	private T result;
	private boolean success;
	private HttpStatus httpStatus;
	private String errorMsg;

	public static <T> ResponseWrapper<T> success(@NonNull T result) {
		return success(result, HttpStatus.OK);
	}

	public static <T>ResponseWrapper<T> success(@NonNull T result, HttpStatus httpStatus) {
		ResponseWrapper<T> responseWrapper = new ResponseWrapper<>();
		responseWrapper.setSuccess(true);
		responseWrapper.setResult(result);
		responseWrapper.setHttpStatus(httpStatus);

		return responseWrapper;
	}

	public static <T>ResponseWrapper<T> fail(@NonNull HttpStatus httpStatus) {
		return fail(httpStatus, EMPTY_STRING);
	}

	public static <T>ResponseWrapper<T> fail(@NonNull HttpStatus httpStatus, String errorMsg) {
		ResponseWrapper<T> responseWrapper = new ResponseWrapper<>();
		responseWrapper.setSuccess(false);
		responseWrapper.setHttpStatus(httpStatus);
		responseWrapper.setErrorMsg(errorMsg);

		return responseWrapper;
	}
}
