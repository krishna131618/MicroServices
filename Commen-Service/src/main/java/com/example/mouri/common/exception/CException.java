package com.example.mouri.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fildName;
	long fildValue;

	public CException(String resourceName, String fildName, long fildValue) {
		super(String.format("%s  not found with %s : '%s'", resourceName, fildName, fildValue));
		this.resourceName = resourceName;
		this.fildName = fildName;
		this.fildValue = fildValue;
	}

	public String getFildName() {
		return fildName;
	}

	public long getFildValue() {
		return fildValue;
	}

	public String getResourceName() {
		return resourceName;
	}
}
