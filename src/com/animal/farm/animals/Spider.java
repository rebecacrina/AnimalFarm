package com.animal.farm.animals;

public class Spider extends Insect{
	
	public void setName(String name){
		this.name = name;
		}
	public void setNumberOfLegs(int numberOfLegs){
		this.numberOfLegs = numberOfLegs;
	}
	
	public Spider(String a, int b){
		setName(a);
		setNumberOfLegs(b);
		//if animal was public we could've use this.name = a;
		//and this.numberOfLegs = b; (I think, not sure)
		
	}
	
	public Spider(){
		setName("Default"); 
		setNumberOfLegs(0); 
	}
	
	public String getName(){
		return name;
	}
	public int getNumberOfLegs(){
		return numberOfLegs;
	}
	
	public void rawr(){
	//super.rawr();
		//because you cannot be both insect and spider :))
		System.out.println("I am also a spider! My name is " + getName() + " and I have " + getNumberOfLegs() + " legs!");
	
	}
}
