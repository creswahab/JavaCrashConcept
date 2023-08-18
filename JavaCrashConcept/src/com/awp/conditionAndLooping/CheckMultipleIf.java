package com.awp.conditionAndLooping;

public class CheckMultipleIf {

	
	String hero="Super Man";
	
	public void whoIsHero() {
		if (hero.equals("Spider Man")) {
			System.out.println("You are thinking Spider Man");
		} else if (hero.equals("Thor")) {
			System.out.println("You are thinking Thor");
		} else if (hero.equals("Bat Man")) {
			System.out.println("You are thinking Bat Man");
		} else if (hero.equals("Super Man")) {
			System.out.println("You are thinking Super Man");
		} else {
			System.err.println("No Super Hero");
		}
	}
	
	
	
	public static void main(String[] args) {
		CheckMultipleIf check = new CheckMultipleIf();
		check.whoIsHero();
		
		
	}

}
