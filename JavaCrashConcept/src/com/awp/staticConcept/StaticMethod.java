package com.awp.staticConcept;

public class StaticMethod {
	
	public static void method1() {
		System.out.println("This is the Method 1");
	}
	
	public void method2() {
		method1();
		System.out.println("This is the Method 2");
	}
	
	public static void main(String[] args) {
			method1();
			StaticMethod method = new StaticMethod();
			method.method2();

	}

}
