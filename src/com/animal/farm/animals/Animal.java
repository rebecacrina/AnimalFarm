package com.animal.farm.animals;

public abstract class Animal {
	protected String name;
	protected int numberOfLegs;
	protected final int cleaningTime;
	
	public Animal(int x){
		cleaningTime = x;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	public String getName() {
		return name;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public abstract void rawr();
}
