package com.syntax.class12;

public class Phone {

	String model;
	String make;
	double screenSize;
	int RAM;
	int storage;
	int camera;

	void call() {
		System.out.println("colling someone");
	}

	void takePicture() {
		System.out.println("use my camera app to take pictires");
	}

	public static void main(String[] args) {

		Phone s22Ultra = new Phone();

		s22Ultra.make = "Samsung";
		s22Ultra.model = "Samsung galaxy s22 ultra";
		s22Ultra.screenSize = 6.8;
		s22Ultra.RAM = 12;
		s22Ultra.storage = 512;
		s22Ultra.call();
		System.out.println(s22Ultra.make);
		
		
	}

}
