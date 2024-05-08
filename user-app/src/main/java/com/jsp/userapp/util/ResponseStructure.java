package com.jsp.userapp.util;

public class ResponseStructure<T> {
			
	private int statusCode;
	private String message;
	private T data;
	
	public int getStatusCode() {
		return statusCode;
	}
	public String getMessage() {
		return message;
	}
	public T getData() {
		return data;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setData(T data) {
		this.data = data;
	}
		
	
}
