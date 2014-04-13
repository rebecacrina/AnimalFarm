package com.animal.farm.animals;

public class Pigeon extends Bird {

	public Pigeon(String s, int n, float a, int cleaningTime) {
		super(cleaningTime);
		setName(s);
		setNumberOfLegs(n);
		setFlightSpeed(a);
	}

	private float flightSpeed;

	public void rawr() {
		super.rawr();


		System.out.println(" I am also a Pigeon! My name is " + getName()
						+ " and I have "
						+ getNumberOfLegs()
						+ " legs! Another thing you should know about me, is that can reach "
						+ getFlightSpeed() + " miles per hour!");
	}

	public float getFlightSpeed() {
		return flightSpeed;
	}

	public void setFlightSpeed(float flightSpeed) {
		this.flightSpeed = flightSpeed;
	}

}
