package com.awp.collection;

import java.util.LinkedList;

///Duplicates are allowed, Insertion Order maintained, Good for Insertion and Deletion, null values are allowed

public class LinkedListConcept {
	
	public void llc() {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.addFirst("Benz");
		linkedList.add("Bmw");
		linkedList.add("Suzuki");
		linkedList.add(null);
		linkedList.add(null);
		linkedList.addLast("Tata");
		
		System.out.println(linkedList);
		
		linkedList.poll();

		System.out.println(linkedList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListConcept llconcept = new LinkedListConcept();
		llconcept.llc();
		

	}

}
