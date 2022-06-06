package com.andre.cursojava.aula85_100;

import java.util.Locale;

public class Aula90Locale {

	public static void main(String[] args) {
		
		Locale locale = Locale.getDefault();
		
		System.out.println(locale);
		
		Locale[] locales = Locale.getAvailableLocales();
		for(Locale loc: locales) {
			
			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("C�digo da l�ngua: " + loc.getLanguage());
			System.out.println("L�ngua: " + loc.getDisplayLanguage());
			System.out.println("Pa�s: " + loc.getDisplayCountry());
			
			System.out.println("******************");
		}
		
		Locale br = new Locale("pt", "Brazil");
		
		System.out.println(br);
		
		Locale.setDefault(br);
		
		System.out.println(Locale.getDefault());

	}

}
