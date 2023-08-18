package com.awp.abstraction;

import com.awp.polymorphism.UpcomingProjects;

public class Benz extends Car implements UpcomingProjects{

	@Override
	public void engineSecret() {
		System.out.println("Benz Engine Secret");
	}
	
	@Override
	public void companyVault() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Car car = new Benz();
		car.engineSecret();
		car.companyVault();

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	

}
