package com.vips.edu.emp;

public class EmployeeException extends Exception{

	private String excMsg = "";
	public EmployeeException() {
		super();
	}
	public EmployeeException(String message) {
		super(message);
		this.excMsg = message;
	}
	
	@Override
	public String toString() {
		return "Employee Exception :- "+excMsg;
	}

}
