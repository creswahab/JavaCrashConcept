package com.awp.basicProgramming;

public class BankAccount_WrapperClass {
	
	Long accountNumber = 1242453555l;
	String accountName = "Jupiter";
	Integer accountBalance = 1000;
	
	public void getAccountBalance() {
		System.out.println("Account Balance is "+accountBalance);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount_WrapperClass bankAccount = new BankAccount_WrapperClass();
		bankAccount.getAccountBalance();
	}

}
