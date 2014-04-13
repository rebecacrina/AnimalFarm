package com.animal.farm.core;

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

	public Animal createPigeon(String name, int numberOfLegs,
			float flightSpeed, int cleaningTime) {
		Pigeon pigeon1 = new Pigeon(name, numberOfLegs, flightSpeed, cleaningTime);
		return pigeon1;
	}

	public  Animal createSpider(String a, int b, int cleaningTime) {
		Spider spider1 = new Spider(a, b, cleaningTime);
		return spider1;
	}

	public  Animal createDragonfly(String a, int b, int lifeTime, int cleaningTime) {
		Dragonfly dragonfly1 = new Dragonfly(a, b, lifeTime,cleaningTime);
		return dragonfly1;
	}

}
