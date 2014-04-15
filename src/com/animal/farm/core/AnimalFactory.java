package com.animal.farm.core;

import java.util.Random;

import com.animal.farm.animals.*;

public class AnimalFactory {

	private static AnimalFactory instance = null;

	private AnimalFactory() {
	}

	public static AnimalFactory getInstance() {
		if (instance == null) {
			instance = new AnimalFactory();
		}
		return instance;

	}

	public Animal generateRandomAnimal(String name, int numberOfLegs,
			int cleaningTime) {
		Random r = new Random();
		int x = r.nextInt(2);
		switch (x) {
		case 0:
			return createPigeon(name, numberOfLegs, 50 + r.nextInt(50),
					cleaningTime);

		case 1:
			return createSpider(name, numberOfLegs, cleaningTime);

		case 2:
			return createDragonfly(name, numberOfLegs, 1 + r.nextInt(7),
					cleaningTime);

		default:
			return null;
		}

	}

	public Animal createPigeon(String name, int numberOfLegs,
			float flightSpeed, int cleaningTime) {
		Pigeon pigeon1 = new Pigeon(name, numberOfLegs, flightSpeed,
				cleaningTime);
		return pigeon1;
	}

	public Animal createSpider(String a, int b, int cleaningTime) {
		Spider spider1 = new Spider(a, b, cleaningTime);
		return spider1;
	}

	public Animal createDragonfly(String a, int b, int lifeTime,
			int cleaningTime) {
		Dragonfly dragonfly1 = new Dragonfly(a, b, lifeTime, cleaningTime);
		return dragonfly1;
	}

}
