package com.awp.collection;

import java.util.HashSet;

///Duplicates are not allowed, Insertion Order not maintained, null values are allowed

public class HashSetConcept {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> setSection = new HashSet<String>();
		
		
		setSection.add("BMW");
		setSection.add("Benz");
		setSection.add("Suzuki");
		setSection.add("Audi");
		setSection.add("Benz");
		setSection.add(null);
		
		System.out.println(setSection);
	
	}

}
