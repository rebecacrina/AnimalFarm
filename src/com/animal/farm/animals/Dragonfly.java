package com.animal.farm.animals;

public class Dragonfly extends Insect {

	public Dragonfly(String name, int numberOfLegs, int n, int x) {
		super(x);
		setName(name);
		setNumberOfLegs(numberOfLegs);
		setLifeTime(n);
		
		
	}

	private int lifeTime;
	//private final int cleaningTime;
	

	public void rawr() {
		super.rawr();

		System.out.println(" I am also a Dragonfly! My name is " + getName()
				+ " and I have " + getNumberOfLegs()
				+ " legs! I also can live up to " + getLifeTime() + " months! I wash myselt in "+ getCleaningTime() +" minutes");

	}

	public int getLifeTime() {
		return lifeTime;
	}

	public void setLifeTime(int x) {
		lifeTime = x;
	}
}
