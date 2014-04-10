package com.animal.farm.core;

import com.animal.farm.animals.Animal;
import com.animal.farm.animals.Arachnid;
import com.animal.farm.animals.Spider;
import com.animal.farm.animals.Insect;
import com.animal.farm.animals.Dragonfly;
import com.animal.farm.animals.Bird;
import com.animal.farm.animals.Pigeon;
import com.animal.farm.core.AnimalFactory;

class Farm {

	public static void main(String[] args) {
		// Animal puppy = new Animal();
		// is not working but no idea why. is it because Abstract classes cannot
		// be instantiated, but they can be subclassed.?
		Animal a = new Arachnid();
		a.rawr();
		System.out.println();

		Insect b = new Dragonfly("Lily", 4, 5);
		b.rawr();

		Bird e = new Pigeon("Princess", 2, 56);
		e.rawr();

		Animal c = new Spider("Alex", 2);
		c.rawr();

		Arachnid d = new Spider();
		d.rawr();

		AnimalFactory animal1 = AnimalFactory.getInstance();

		Pigeon animal2 = (Pigeon) AnimalFactory.createPigeon("Pricess", 2,
				65.656f);
		animal2.rawr();

		Spider animal3 = (Spider) AnimalFactory.createSpider("Alex", 2);
		animal3.rawr();

	}

}
