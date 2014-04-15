package com.animal.farm.employees;

import com.animal.farm.animals.Animal;

public class Farmer implements Farmer_I {
	private int availableTime;
	private final int initialTime;

	public Farmer(int x) {
		availableTime = x;
		initialTime = x;
	}

	public boolean cleanUp(Animal animal) {
		int cleaningTime;
		cleaningTime = animal.getCleaningTime();
		if (availableTime >= cleaningTime) {
			availableTime -= cleaningTime;
			System.out.println("The animal " + animal.getName()
					+ " was cleaned, and its bath took" + cleaningTime
					+ " minutes!");
			return true;
		} else {
			System.out.println("The animal " + animal.getName()
					+ " could not be cleaned!");
			return false;
		}
	}

	public void resetTime() {
		availableTime = getInitialTime();
	}

	public int getInitialTime() {
		return initialTime;
	}
}
