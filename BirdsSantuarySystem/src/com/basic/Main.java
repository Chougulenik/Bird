package com.basic;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("welcome to Bird Sanctuary System");
		
		Pigeon pigeon = new Pigeon("d001");
		Ostrich ostrich = new Ostrich("d002");
		Duck duck = new Duck("d003");
		Penguin penguin = new Penguin("d004");
		Penguin penguin2 = new Penguin("d004");
		Parrot parrot = new Parrot("d005");
		
		BirdRepository birdRepository = new BirdRepository();
		
		birdRepository.add(duck);
		birdRepository.add(ostrich);
		birdRepository.add(parrot);
		birdRepository.add(penguin);
		birdRepository.add(penguin2);
		birdRepository.add(pigeon);
		
		UserInterface user = new UserInterface();
		user.print(birdRepository.getBirdList());
		System.out.println("---------------------");
		user.printFlyable(birdRepository.getBirdList());
		System.out.println("---------------------");
		user.printSwimable(birdRepository.getBirdList());
		System.out.println("---------------------");
		user.printEatable(birdRepository.getBirdList());
		
		birdRepository.remove(parrot);
		birdRepository.remove(penguin);
		System.out.println("After remove 2 birds");
		
		user.print(birdRepository.getBirdList());
		
		
	}
}
