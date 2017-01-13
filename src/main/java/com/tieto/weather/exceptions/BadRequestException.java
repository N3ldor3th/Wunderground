package com.tieto.weather.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Incorrect or unsupported city request specified!")
public class BadRequestException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = -1437221660047904791L;

}
