package com.awp.collection;

import java.util.TreeSet;

///Duplicates are not allowed, Natural Sorting(Ascending) Order maintained, null values are not allowed

public class TreeSetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> setSection = new TreeSet<String>();
		setSection.add("BMW");
		setSection.add("Benz");
		setSection.add("Suzuki");
		setSection.add("Audi");
		setSection.add("Benz");
		//setSection.add(null);
		
		System.out.println(setSection);
	}

}
