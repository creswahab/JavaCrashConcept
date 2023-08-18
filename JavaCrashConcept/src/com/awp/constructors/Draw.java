package com.awp.constructors;

public class Draw {
	
	String toDraw;
	
	Draw() {
		System.out.println("Ready to Draw");
	}

	Draw(String draw){
		draw=toDraw;
		System.out.println("Draw the "+toDraw);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Draw draw = new Draw();
		Draw draw2 = new Draw("Circle");
	}

}
