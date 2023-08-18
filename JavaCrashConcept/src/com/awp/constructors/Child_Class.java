package com.awp.constructors;

public class Child_Class extends Parent_Class  {

	Child_Class() {
		//Super() --It will be used in Inheritance. Super keyword will be used to get the values from Parent Class.
		System.out.println("Child Constructor");
	}
	
	public static void main(String[] args) {
		Child_Class child = new Child_Class();

	}

}
