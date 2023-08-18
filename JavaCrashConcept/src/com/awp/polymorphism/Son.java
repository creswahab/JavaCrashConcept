package com.awp.polymorphism;

public class Son extends Parents{

	@Override
	public void marriage() {
		System.out.println("My Rules");
	}
	
	
	public static void main(String[] args) {
		Parents parents = new Son();
		parents.propeties();
		parents.marriage();

	}

}
