package com.animal.farm.core;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

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

public class Farm extends JFrame {

	public Farm() {
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

		final Animal[] array = animals.toArray(new Animal[animals.size()]);

		System.out.println(totalCleaningTime);

		Farmer farmer = new Farmer(totalCleaningTime / 2
				+ r.nextInt(totalCleaningTime));// the farmer has at least half
												// of the time necessary to
												// clean all the animals
		Farmer farmer1 = new Farmer(23);
		Farmer farmer2 = new Farmer(8);
		Farmer farmer3 = new Farmer(17);
		Farmer farmer4 = new Farmer(3);
		Farmer farmer5 = new Farmer(10);
		Farmer farmer6 = new Farmer(5);
		Farmer farmer7 = new Farmer(14);
		final Farmer[] array2 = { farmer1, farmer2, farmer3, farmer4, farmer5,
				farmer6, farmer7 };
		final String[] farmers = {"farmer1","farmer2","farmer3","farmer4","farmer5","farmer6","farmer7"};

		for (Animal eachAnimal : animals) {
			farmer.cleanUp(eachAnimal);

		}

		String[] thename = new String[array.length];

		int counter = 0;
		for (Animal a : array) {
			thename[counter] = new String(a.getName());
			counter++;
		}

		JButton clean = new JButton("clean");
		setLayout(new FlowLayout());

		final JComboBox<String> box1 = new JComboBox<>(thename);
		final JComboBox<String> box2 = new JComboBox<>(farmers);
		add(box1);

		add(box2);

		add(clean);

		final int index1, index2;
		index1 = box1.getSelectedIndex();
		index2 = box1.getSelectedIndex();
		final int selectedAnimalCleaningTime, selectedFarmerAvailableTime;

		clean.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (array2[index2].cleanUp(array[index1])) {
					JOptionPane.showMessageDialog(null,
							"The animal was cleaned!");
				} else {
					JOptionPane.showMessageDialog(null,
							"The animal couldn't be cleaned!");
				}

			}
		}

		);
	}

	public static void main(String[] args) {
		// practic aici se apeleaza constructorul, deci tot ce ai scris mai sus
		Farm f = new Farm();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 300);
		f.setVisible(true);
	}
}
