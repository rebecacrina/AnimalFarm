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

	public static Animal createPigeon(String name, int numberOfLegs,
			float flightSpeed) {
		Pigeon pigeon1 = new Pigeon(name, numberOfLegs, flightSpeed);
		return pigeon1;
	}

	public static Animal createSpider(String a, int b) {
		Spider spider1 = new Spider(a, b);
		return spider1;
	}

}
