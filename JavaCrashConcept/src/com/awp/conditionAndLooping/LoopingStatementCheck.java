package com.awp.conditionAndLooping;

public class LoopingStatementCheck {
	
	int times=0;
	
	public void repeat() {
		
		/*
		 * for (int times=0;times<25;times++) { System.out.println("Happy Learning"); }
		 * 
		 * 
		 */
		
		/*
		 * while (times<25) { System.out.println("Happy Learning"); times++; }
		 */
		
		do {
			System.out.println("Happy Learning");
			times++;
		} while (times<25);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopingStatementCheck loop = new LoopingStatementCheck();
		loop.repeat();
		

	}

}
