package com.awp.abstraction;

import com.awp.polymorphism.Interface2;
import com.awp.polymorphism.UpcomingProjects;

public class Bmw extends Car implements UpcomingProjects, Interface2{
	
	@Override
	public void engineSecret() {
		System.out.println("Bmw Engine Secret");
	}
	
	@Override
	public void companyVault() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		Car car = new Bmw();
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
