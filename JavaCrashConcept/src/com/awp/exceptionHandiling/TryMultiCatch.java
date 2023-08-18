package com.awp.exceptionHandiling;

public class TryMultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String name =null;
			System.out.println("Before Exception");
			System.out.println(name.length());
			System.out.println("After Exception");
			
		} catch (ArithmeticException e) {
			System.out.println("Don't divide by Zero");
		}
		catch (NullPointerException e) {
			System.out.println("This is null Pointer Exception");
		}
		catch (Exception e) {
			System.out.println("This is Main Exception");
		}

	}

}
