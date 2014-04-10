package com.animal.farm.animals;

public class Dragonfly extends Insect {

	public Dragonfly(String name, int numberOfLegs, int n) {
		setName(name);
		setNumberOfLegs(numberOfLegs);
		setLifeTime(n);
	}

	private int LifeTime;

	public void rawr() {
		super.rawr();

		System.out.println(" I am also a Dragonfly! My name is " + getName()
				+ " and I have " + getNumberOfLegs()
				+ " legs! I also can live up to " + getLifeTime() + " months!");

	}

	public int getLifeTime() {
		return LifeTime;
	}

	public void setLifeTime(int lifeTime) {
		LifeTime = lifeTime;
	}
}
