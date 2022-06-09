package com.syntax.class11;

public class Dogs {
	
	String breed;
	String size;
	double weight;
	double height;
	
	void whatFeed() {
		System.out.println("Royal Canin");
	}
	
	void whatPlay() {
		System.out.println("Active outdoor games");
	}
	
	void getInfo() {
		System.out.println("The breed dog: "+breed+", size: "+size+", weight:"+weight+", height: "+height);
	}
	
	public static void main(String[] args) {
		
		Dogs dog1=new Dogs();
		
		dog1.breed="Husky";
		dog1.size="big";
		dog1.weight=15.5;
		dog1.height=2.1;
		
		dog1.getInfo();
		
		Dogs dog2=new Dogs();
		
		dog2.breed="Bulldog";
		dog2.size="average";
		dog2.height=1.5;
		dog2.weight=12;
		
		dog2.getInfo();
		
		
		
	}

}
