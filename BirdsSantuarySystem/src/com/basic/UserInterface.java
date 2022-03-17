package com.basic;

import java.util.List;
import java.util.Set;

public class UserInterface {
	
	void print(Set birdList) {
		for (Object bird : birdList) {
			System.out.println(bird);
		}
	}

	void printFlyable(Set<Birds> birdList) {
		for (Birds bird : birdList) {
			if(bird instanceof Flyable) {
				((Flyable)bird).fly();
			}
		}
	}

	void printSwimable(Set<Birds> birdList) {
		for (Birds bird : birdList) {
			if(bird instanceof Swimmable) {
//				((Swimmable)bird).swim();
				Swimmable swimmableBird = (Swimmable)bird;
				swimmableBird.swim();
			}
		}
	}

	void printEatable(Set<Birds> birdList) {
		for (Birds bird : birdList) {
			bird.eat();
		}
	}
}
