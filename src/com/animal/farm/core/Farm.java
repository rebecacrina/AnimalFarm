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
		/*Animal a = new Arachnid(5);
		a.rawr();
		System.out.println();

		Insect b = new Dragonfly("Lily", 4, 5,3);
		b.rawr();

		Bird e = new Pigeon("Princess", 2, 56,5);
		e.rawr();

		Animal c = new Spider("Alex", 2,7);
		c.rawr();

		Arachnid d = new Spider();
		d.rawr();*/

		AnimalFactory factory = AnimalFactory.getInstance();

		Pigeon pigeon = (Pigeon)factory.createPigeon("Pricess", 2, 65.656f, 4);
		pigeon.rawr();

		Spider spider = (Spider) factory.createSpider("Alex", 2, 6);
		spider.rawr();
		
		Dragonfly dragonfly = (Dragonfly) factory.createDragonfly("Lily", 2, 5, 4);

	}

}
