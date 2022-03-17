package com.basic;

public class Parrot extends Birds implements Flyable {
	
	public Parrot(String id) {
		 this.id = id;
		 name = "parrot";
		 color = Color.GREEN;
	}

	@Override
	public void fly() {
		System.out.println("Parrot can fly");
	}	
}
