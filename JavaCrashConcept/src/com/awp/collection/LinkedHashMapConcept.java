package com.awp.collection;

import java.util.LinkedHashMap;

///Duplicates key are not allowed, Duplicate values are allowed ,Insertion Order is maintained, one null key is allowed

public class LinkedHashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, String> hashMap = new LinkedHashMap<String, String>();
		hashMap.put("Delhi", "India");
		hashMap.put("Chennai", "India");
		hashMap.put("Mumbai", "India" );
		hashMap.put("Bangalore", "India");
		hashMap.put("Mumbai", null );
		hashMap.put("Bangalore", null);
		
		System.out.println(hashMap);

	}

}
