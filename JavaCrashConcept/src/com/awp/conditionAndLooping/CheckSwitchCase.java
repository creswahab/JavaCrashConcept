package com.awp.conditionAndLooping;

public class CheckSwitchCase {

	
	String hero="Thor";
	
	public void myHero() {
		switch (hero) {
		case "Spider Man":
			System.out.println("You are thinking Spider Man");
			break;
		case "Super Man":
			System.out.println("You are thinking Super Man");
			break;
		case "Thor":
			System.out.println("You are thinking Thor");
			break;
		case "Bat Man":
			System.out.println("You are thinking Bat Man");
			break;
		default:
			System.out.println("No Super Hero");
			break;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckSwitchCase heroes = new CheckSwitchCase();
		heroes.myHero();
	}

}
