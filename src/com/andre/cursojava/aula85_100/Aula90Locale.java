package com.andre.cursojava.aula85_100;

import java.util.Locale;

public class Aula90Locale {

	public static void main(String[] args) {
		
		Locale locale = Locale.getDefault();
		
		System.out.println(locale);
		
		Locale[] locales = Locale.getAvailableLocales();
		for(Locale loc: locales) {
			
			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("Código da língua: " + loc.getLanguage());
			System.out.println("Língua: " + loc.getDisplayLanguage());
			System.out.println("País: " + loc.getDisplayCountry());
			
			System.out.println("******************");
		}
		
		Locale br = new Locale("pt", "Brazil");
		
		System.out.println(br);
		
		Locale.setDefault(br);
		
		System.out.println(Locale.getDefault());

	}

}
