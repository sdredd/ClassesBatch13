package com.syntax.class14;

public class HW4 {
	//Create a method that will say Hello in different 
	//language based on the country that will passed when method is executed
	
	void hello (String a) {
		String w;
		switch (a) {
		case "Russia":
			w = "Privet";
			break;
		case "USA":
			w= "Hi";
			break;
		case "Georgia":
			w="Gamarjoba";
			break;
		case "Spain":
			w="Hola";
			break;
			default:
				w="Unknown";
		}
		System.out.println(w);;
	}

	public static void main(String[] args) {
		HW4 out=new HW4();
		out.hello("Georgia");
	}

}
