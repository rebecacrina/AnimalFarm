package com.animal.farm.animals;

public class Spider extends Arachnid {

	public Spider(String a, int b) {
		setName(a);
		setNumberOfLegs(b);
		// if animal was public we could've use this.name = a;
		// and this.numberOfLegs = b; (I think, not sure)

	}

	public Spider() {
		setName("Default");
		setNumberOfLegs(0);
	}

	public void rawr() {
		super.rawr();

		System.out.println(" I am also a spider! My name is " + getName()
				+ " and I have " + getNumberOfLegs() + " legs!");

	}
}
