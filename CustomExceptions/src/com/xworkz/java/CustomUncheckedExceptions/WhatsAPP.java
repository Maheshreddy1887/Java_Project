package com.xworkz.java.CustomUncheckedExceptions;

public class WhatsAPP {
	void createGroup(String[] Names) {
		if(Names.length >10) {
			throw new WhatsAPPException("cant create group with more 5 members");
		}
		else {
			System.out.println("your WhatsAPP group created successfully....,!");
		}
		
	}
	void sharefile(File file) {
	if(file.size > 1024) {
		throw new WhatsAPPException("invalid file size");
	}
	else {
		System.out.println("File is uploded successfully....!");
	}
	
}
       
}
