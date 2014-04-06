package com.animal.farm.core;

import com.animal.farm.animals.Animal;
import com.animal.farm.animals.Insect;
import com.animal.farm.animals.Spider;
//had to import them in order to have animal a created

class Farm {

	public static void main(String[] args) {
	//	Animal puppy = new Animal();
	//is not working but no idea why. is it because Abstract classes cannot be instantiated, but they can be subclassed.?
		Animal a = new Insect();
		a.rawr();
		//Insect b = new Animal();
		//not working because abstract classes cannot be instantiated
		System.out.println();
		Animal c = new Spider();
		c.rawr();

		Insect d = new Spider("Alex", 2);
		d.rawr();
	}

}
