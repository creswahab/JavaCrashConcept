package com.awp.polymorphism;

public class TheWayWeTalk {
	
	public void talk(Parents styleOfTalking) {
		System.out.println("Polite and Respectfull");
	}

	public void talk(Boss styleOfTalking) {
		System.out.println("Offical Purpose");
	}
	public void talk(Partner styleOfTalking) {
		System.out.println("Family and Care");
	}
	
	public static void main(String[] args) {
		TheWayWeTalk talk = new TheWayWeTalk();
		Parents parents = new Parents();
		talk.talk(parents);
		
		Boss boss = new Boss();
		talk.talk(boss);
		
		Partner partner = new Partner();
		talk.talk(partner);

	}

}
