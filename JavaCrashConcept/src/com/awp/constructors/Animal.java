package com.awp.constructors;

import com.awp.Inheritance.Car;

public class Animal {
	
	String animal_Name;
	String animal_Type;
	
	Animal(String name, String type){
		this.animal_Name=name;
		this.animal_Type=type;
		
	}
	

	
	public void sayAboutAnimal() {
		System.out.println("Animal Name is "+animal_Name);
		System.out.println("Animal Type is "+animal_Type);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("Goat", "Herbivores");
		animal.sayAboutAnimal();
		
		Animal animal2 = new Animal("Lion", "Carnivores");
		animal2.sayAboutAnimal();

	
	}

}
