package com.awp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


///Duplicates are allowed, Insertion Order maintained, Good for Search Operation, null values are allowed

public class ArrayListConcept {
	
	public void arraylistlearn() {
		
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("BMW");
		arrayList.add("Benz");
		arrayList.add("Suzuki");
		arrayList.add("Audi");
		arrayList.add("Benz");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(3));
		System.out.println(arrayList.indexOf("Suzuki"));
		System.out.println(arrayList.lastIndexOf("Benz"));
		
		List<String> duplicateList = new ArrayList<String>();
		duplicateList.addAll(arrayList);
		System.out.println(duplicateList);
		
		duplicateList.clear();
		System.out.println(duplicateList);
 		
		arrayList.remove(1);
		arrayList.add(null);
		System.out.println(arrayList);
		
		arrayList.set(0, "TATA");
		System.out.println(arrayList);
		
		System.out.println(arrayList.isEmpty());
		
	}
	
	
	public void foreach() {
		
		List<String> arrayList1 = new ArrayList<String>();
		
		arrayList1.add("BMW");
		arrayList1.add("Benz");
		arrayList1.add("Suzuki");
		arrayList1.add("Audi");
		arrayList1.add("Benz");
		
		System.out.println("Iteration using For each");
		
		for (String string : arrayList1) {
			System.out.println(string);
		}
		
	}
	
	public void forConcept() {
		
		List<String> arrayList2 = new ArrayList<String>();
		
		arrayList2.add("BMW");
		arrayList2.add("Benz");
		arrayList2.add("Suzuki");
		arrayList2.add("Audi");
		arrayList2.add("Benz");
		
		System.out.println("Iteration using For Concept");
		
		for (int i = 0; i < arrayList2.size(); i++) {
			System.out.println(arrayList2.get(i));
		}
		
	}
	
	public void listIteratorConcept() {
		
		List<String> arrayList3 = new ArrayList<String>();
		
		arrayList3.add("BMW");
		arrayList3.add("Benz");
		arrayList3.add("Suzuki");
		arrayList3.add("Audi");
		arrayList3.add("Benz");
		
		ListIterator<String> listIterator = arrayList3.listIterator();
		
		
		System.out.println("Iteration using List Iterator");
		
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
			
		}
		
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
			
		}
		
	}
	
	public void iteratorCOncept() {
		List<String> arrayList4 = new ArrayList<String>();
		
		arrayList4.add("BMW");
		arrayList4.add("Benz");
		arrayList4.add("Suzuki");
		arrayList4.add("Audi");
		arrayList4.add("Benz");
		
		System.out.println("Iteration using Iterator");
		
		Iterator<String> iterator = arrayList4.iterator();
		
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

	public static void main(String[] args) {
		
		ArrayListConcept listConcept = new ArrayListConcept();
		listConcept.arraylistlearn();
		listConcept.foreach();
		listConcept.forConcept();
		listConcept.listIteratorConcept();
		listConcept.iteratorCOncept();

	}

}
