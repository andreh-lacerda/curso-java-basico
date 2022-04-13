package com.andre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite a temperatura em Farenheit");
		float temperaturaFarenheit = Float.parseFloat(scan.next());
		float temperaturaCelsius = (temperaturaFarenheit - 32) / 1.8f;
		System.out.println("A temperatura em Celsius é " + temperaturaCelsius);

	}

}
