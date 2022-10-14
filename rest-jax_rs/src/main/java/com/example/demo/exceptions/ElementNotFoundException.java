package com.example.demo.exceptions;

import jakarta.ws.rs.ext.Provider;
@Provider
public class ElementNotFoundException  {
private String ErrorCode;
private String ErrorMessage;

public ElementNotFoundException(String errorCode, String errorMessage) {
	super();
	ErrorCode = errorCode;
	ErrorMessage = errorMessage;
}
public String getErrorCode() {
	return ErrorCode;
}
public void setErrorCode(String errorCode) {
	ErrorCode = errorCode;
}
public String getErrorMessage() {
	return ErrorMessage;
}
public void setErrorMessage(String errorMessage) {
	ErrorMessage = errorMessage;
}
}
