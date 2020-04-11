package com.boa.SpringBootIn28Minutes.exception;

import java.util.Date;

public class ExceptionResponse {

	private String message;
	private String details;
	private Date date;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ExceptionResponse [message=" + message + ", details=" + details + ", date=" + date + "]";
	}

}
