package com.awp.string;

public class StringBufferConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//immutable
		System.out.println("Original Name for String");
		String name = new String("Jupiter");
		System.out.println(name.concat("Planet"));
		System.out.println("After Update for String: "+name);
		
		//mutable
		System.out.println("Original Name for String Buffer");
		StringBuffer name1 = new StringBuffer("Pluto");
		System.out.println(name1.append("Planet"));
		System.out.println("After Update for String Buffer: "+name1);
		
		//reverse
		StringBuffer reverseName = new StringBuffer("Pluto");
		System.out.println(reverseName.reverse());
		//replace
		StringBuffer replaceName = new StringBuffer("Pluto");
		System.out.println(replaceName.replace(0, 4, "Mars"));
		//delete
		StringBuffer deleteName = new StringBuffer("Pluto");
		System.out.println(deleteName.delete(0, 2));
		//insert
		StringBuffer insertName = new StringBuffer("Pluto");
		System.out.println(insertName.insert(5, "Planet"));
		//capacity
		System.out.println(insertName.capacity());

	}

}
