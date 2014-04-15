package com.animal.farm.core;

import java.util.ArrayList;
import java.util.Random;

import com.animal.farm.animals.Animal;
import com.animal.farm.animals.Arachnid;
import com.animal.farm.animals.Spider;
import com.animal.farm.animals.Insect;
import com.animal.farm.animals.Dragonfly;
import com.animal.farm.animals.Bird;
import com.animal.farm.animals.Pigeon;
import com.animal.farm.core.AnimalFactory;
import com.animal.farm.employees.Farmer;

class Farm {

	public static void main(String[] args) {
		// Animal puppy = new Animal();
		// is not working but no idea why. is it because Abstract classes cannot
		// be instantiated, but they can be subclassed.?
		/*
		 * Animal a = new Arachnid(5); a.rawr(); System.out.println();
		 * 
		 * Insect b = new Dragonfly("Lily", 4, 5,3); b.rawr();
		 * 
		 * Bird e = new Pigeon("Princess", 2, 56,5); e.rawr();
		 * 
		 * Animal c = new Spider("Alex", 2,7); c.rawr();
		 * 
		 * Arachnid d = new Spider(); d.rawr();
		 */

		AnimalFactory factory = AnimalFactory.getInstance();

		/*
		 * Pigeon pigeon = (Pigeon)factory.createPigeon("Pricess", 2, 65.656f,
		 * 4); pigeon.rawr();
		 * 
		 * Spider spider = (Spider) factory.createSpider("Alex", 2, 6);
		 * spider.rawr();
		 * 
		 * Dragonfly dragonfly = (Dragonfly) factory.createDragonfly("Lily", 2,
		 * 5, 4);
		 */
		ArrayList<Animal> animals = new ArrayList<Animal>();
		String[] names = new String[] { "Billy", "Joey", "Romeo", "Tom",
				"Rachel", "Mike", "Puffy", "Alex", "Daniel", "Kiara" };
		Random r = new Random();
		int totalCleaningTime = 0;
		for (int x = 0; x < 10; x++) {
			int cleaningTime = 2 + r.nextInt(8);
			totalCleaningTime += cleaningTime;
			Animal animal = factory.generateRandomAnimal(names[x],
					2 + r.nextInt(6), cleaningTime);
			animal.rawr();
			animals.add(animal);
		}

		System.out.println(totalCleaningTime);

		Farmer farmer = new Farmer(totalCleaningTime / 2
				+ r.nextInt(totalCleaningTime));// the farmer has at least half
												// of the time necessary to
												// clean all the animals

		for (Animal eachAnimal : animals){
			farmer.cleanUp(eachAnimal);
		}
	}

}
