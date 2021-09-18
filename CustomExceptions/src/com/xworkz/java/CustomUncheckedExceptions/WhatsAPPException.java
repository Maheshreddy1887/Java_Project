package com.xworkz.java.CustomUncheckedExceptions;

public class WhatsAPPException extends RuntimeException {
	
	public WhatsAPPException() {
		// TODO Auto-generated constructor stub
	}
	public WhatsAPPException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}

	public String getMessage(String msg) {
		
		return "can't create group with more than 5 memmbers";
	}
	
	@Override
	public String toString() {
		
		return "can't uplode more than 1 Gb";
	}
	}


	