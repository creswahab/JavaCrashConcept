package com.awp.string;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Jupiter";
		int number =3;
		String name1 = new String(" Venus ");
		
		System.out.println(name);
		
		System.out.println(name1);
		
		//Character At
		System.out.println(name.charAt(1));
		
		//Length
		System.out.println(name.length());
		
		//equals
		System.out.println(name.equals("Mars"));
		
		//equalsIgnoreCase
		System.out.println(name.equalsIgnoreCase("JUPITER"));
		
		//isEmpty
		System.out.println(name.isEmpty());
		
		//contains
		System.out.println(name.contains("up"));
		
		//substring
		System.out.println(name.substring(3));
		
		System.out.println(name.substring(3, 6));
		
		//concat
		System.out.println(name.concat("Planet"));
		
		//replace
		System.out.println(name.replace("J", "j"));
		
		//indexOf
		System.out.println(name.indexOf("i"));
		
		System.out.println(name.indexOf("t", 2));
		
		//trim
		System.out.println(name1.trim());
		
		//converToString
		System.out.println(String.valueOf(number));
		
		//lowercase
		String case1 = "NEPTUNE";
		System.out.println(case1.toLowerCase());
		
		//uppercase
		String case2 = "pluto";
		System.out.println(case2.toUpperCase());
		
		//join
		System.out.println(String.join("-", "Learning", "Java", "with", "Selenium"));
		
		//split
		String word = "I,am,from,India";
		String[] splitThis = word.split(",");
		
		for (String string : splitThis) 
		{ System.out.println(string); 
		}
		 
		
	}

}
