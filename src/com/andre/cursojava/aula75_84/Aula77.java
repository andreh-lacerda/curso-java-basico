package com.andre.cursojava.aula75_84;

public class Aula77 {

	public static void main(String[] args) {

		String java = "Java";
		
		for (int i = 0; i < java.length(); i++) {
			System.out.println(java.charAt(i));
		}
		
		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0);
		System.out.println(jav);
		
	}

}
