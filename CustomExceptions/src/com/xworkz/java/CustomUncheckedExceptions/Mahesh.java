package com.xworkz.java.CustomUncheckedExceptions;

public class Mahesh {

	public static void main(String[] args) {
		
    String[]name= { "mahesh","taniver","rajesh","ram","Ravi","Srikanth"};
    
    File file =new File();
    
    WhatsAPP whatsapp= new WhatsAPP();
    try {
    	whatsapp.createGroup(name);
    	whatsapp.sharefile(file);
    }
    catch(WhatsAPPException e) {
    	if(name.length>5) {
    	System.out.println(e.getMessage());
    }
    	else {
    		System.out.println(e);
    	}
    

	}

}
}
