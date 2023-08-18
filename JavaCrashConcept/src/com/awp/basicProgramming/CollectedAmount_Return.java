package com.awp.basicProgramming;

public class CollectedAmount_Return {
	
	Integer amount = 3000;
	
	public Integer collectTheAmount() {
		System.out.println("Amount Collected is "+ amount + " and sent it to you");
		return amount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollectedAmount_Return collectedAmount = new CollectedAmount_Return();
		Integer total = collectedAmount.collectTheAmount();
		System.out.println("Received the Amount " + total);
	}

}
