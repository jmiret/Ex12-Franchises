package com.franchises.Exceptions;

public class ToDoException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ToDoException(String msg) {
		super(msg);		
	}
	
}
