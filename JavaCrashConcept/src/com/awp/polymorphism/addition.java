package com.awp.polymorphism;

public class addition {
	
	int add(int n1, int n2) {
		return n1+n2;
	}
	
	int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	
	float add(float n1, float n2) {
		return n1+n2;
	}

	public static void main(String[] args) {
		addition obj = new addition();
		System.out.println("Sum of Two Numbers "+obj.add(20, 21));
		System.out.println("Sum of Three Numbers "+obj.add(20, 21, 22));

	}

}
