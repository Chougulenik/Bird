package com.basic;

import java.util.HashSet;
import java.util.Set;

public class BirdRepository {
	
	//private List birdList = new ArrayList<>();
	
	private Set<Birds> birdList = new HashSet();
	
	Set getBirdList() {
		return birdList;	
	}
	
	void add(Birds bird) {
		birdList.add(bird);
	}
	
	void remove(Birds bird) {
		birdList.remove(bird);
	}	
}
