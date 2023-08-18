package com.awp.exceptionHandiling;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Inside try method");
			System.out.println(2/0);
		} catch (Exception e) {
			System.out.println("Inside catch method");
		} finally {
			System.out.println("Inside finally method");
		}
		

	}

}
