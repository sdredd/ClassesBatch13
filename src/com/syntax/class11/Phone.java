package com.syntax.class11;

public class Phone {
	
	String make;
	String model;
	int memory;
	String color;
	
	void doCall() {
		System.out.println("My phone "+make+" is calling");
	}
	
	void getSms() {
		System.out.println("SMS is coming");
	}
	
	void sendSms() {
		System.out.println("Sending SMS");
	}
	
	void getInfo() {
		System.out.println("make: "+make+", model: "+model+", memory: "+memory+", color: "+color);
	}
	
	public static void main(String[] args) {
		
		Phone phone1=new Phone();
		
		phone1.make="Iphone";
		phone1.model="12";
		phone1.memory=256;
		phone1.color="Pink";
		
		phone1.getInfo();
		phone1.doCall();
		
		Phone phone2=new Phone();
		
		phone2.make="Pixel";
		phone2.model="6 pro";
		phone2.memory=256;
		phone2.color="Black";
		
		phone2.getInfo();
		
		Phone phone3=new Phone();
		
		phone3.make="Samsung";
		phone3.model="Galaxy S22 Ultra";
		phone3.memory=512;
		phone3.color="Blue";
		
		phone3.getInfo();
		
	}

}
