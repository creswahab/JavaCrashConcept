package com.awp.collection;

import java.util.HashMap;

///Duplicates key are not allowed, Duplicate values are allowed ,Insertion Order not maintained, one null key is allowed

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Delhi");
		hashMap.put(2, "Chennai");
		hashMap.put(4, "Mumbai");
		hashMap.put(3, "Bangalore");
		hashMap.put(null, "Bangalore");
		hashMap.put(null, "Chennai");
		
		System.out.println(hashMap);
		

	}

}
