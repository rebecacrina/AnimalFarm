package com.animal.farm.animals;

public class Spider extends Arachnid {

	public Spider(String a, int b, int cleaningTime) {
		super(cleaningTime);
		setName(a);
		setNumberOfLegs(b);
		// if animal was public we could've use this.name = a;
		// and this.numberOfLegs = b; (I think, not sure)

	}

	public Spider() {
		super(0);
		setName("Default");
		setNumberOfLegs(0);
	}

	public void rawr() {
		super.rawr();

		System.out.println(" I am also a spider! My name is " + getName()
				+ " and I have " + getNumberOfLegs() + " legs!");

	}
}
