package com.awp.staticConcept;

public class StaticVariable {
	
	static int balanceAmount=0;
	String name;
	
	public static void main(String[] args) {
		
		StaticVariable object1 = new StaticVariable();
		object1.balanceAmount=1000;
		object1.name="Arya";
		
		StaticVariable object2 = new StaticVariable();
		object2.balanceAmount=2000;
		object2.name="Jupiter";
		
		System.out.println("Object1 Integer: "+object1.balanceAmount);
		System.out.println("Object1 String: "+object1.name);
		System.out.println("Object2 Integer: "+object2.balanceAmount);
		System.out.println("Object2 String: "+object2.name);
		
		
	}

}
