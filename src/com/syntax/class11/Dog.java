package com.syntax.class11;

public class Dog {
	
	String name;
	int age;
	double weight;
	String color;
	double height;
	String breed;
	
	void bark() {
		System.out.println("Dog barks");
	}
	
	void walks() {
		System.out.println("Dog walks");
	}
	
	void eat() {
		System.out.println("Dogs like to eat bone");
	}
	
	public static void main (String[] args) {
		
		Dog jimmy=new Dog();
		jimmy.name="Jimmy";
		jimmy.age=6;
		jimmy.weight=16;
		jimmy.color="Pink";
		jimmy.height=2.6;
		jimmy.breed="German";
		jimmy.bark();
	}

}
