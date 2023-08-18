package com.awp.collection;

import java.util.LinkedHashMap;
import java.util.TreeMap;

///Duplicates key are not allowed, Duplicate values are allowed , Natural Sorting(Ascending) Order is maintained,  null key is not allowed

public class TreeMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, String> hashMap = new TreeMap<String, String>();
		
		hashMap.put("Delhi", "India");
		hashMap.put("Chennai", "India");
		hashMap.put("Mumbai", "India" );
		hashMap.put("Bangalore", "India");
		hashMap.put("Mumbai", null );
		hashMap.put("Bangalore", null);
		hashMap.put(null,"Bangalore");
		
		System.out.println(hashMap);
	}

}
