package com.packing.util;

public class ParkingException extends Exception {

	private String errorMessage;

	public ParkingException(String message) {
		super();
		this.errorMessage = message;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
	
	
}
