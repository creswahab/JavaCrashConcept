package com.awp.collection;

import java.util.LinkedHashSet;

///Duplicates are not allowed, Insertion Order is maintained, null values are allowed

public class LinkedHashSetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> setSection = new LinkedHashSet<String>();
		
		setSection.add("BMW");
		setSection.add("Benz");
		setSection.add("Suzuki");
		setSection.add("Audi");
		setSection.add("Benz");
		setSection.add(null);
		
		System.out.println(setSection);

	}

}
