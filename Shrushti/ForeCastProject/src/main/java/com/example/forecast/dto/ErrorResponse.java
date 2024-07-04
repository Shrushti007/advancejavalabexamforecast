package com.example.forecast.dto;

import java.time.LocalDateTime;

public class ErrorResponse {

	private String msg;
	private String errDetails;
	private LocalDateTime timeStamp;
	
	public ErrorResponse() {
		
	}

	public ErrorResponse(String msg, String errDetails) {
		super();
		this.msg = msg;
		this.errDetails = errDetails;
		this.timeStamp = LocalDateTime.now();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getErrDetails() {
		return errDetails;
	}

	public void setErrDetails(String errDetails) {
		this.errDetails = errDetails;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "ErrorResponse [msg=" + msg + ", errDetails=" + errDetails + ", timeStamp=" + timeStamp + "]";
	}
	
	
	
}
