package com.awp.exceptionHandiling;

public class SingleTryCatchBlock {

	public static void main(String[] args) {

		try {
			int a=3;
			int b=0;
			int c=a/b;
			
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Don't divide by Zero");
		}
		

	}

}
