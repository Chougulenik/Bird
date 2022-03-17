package com.basic;

public class Duck extends Birds implements Flyable, Swimmable {
	
	public Duck(String id) {
		this.id = id;
		name = "duck";
		color = Color.WHITE;
	}

	@Override
	public void fly() {
		System.out.println("Duck can fly");	
	}

	@Override
	public void swim() {
		System.out.println("Duck can swim");	
		
	}	
}
