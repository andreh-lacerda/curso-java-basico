package com.andre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius");
		float temperaturaCelsius = Float.parseFloat(scan.next());
		float temperaturaFarenheit = ((temperaturaCelsius * 9) / 5) + 32;
		System.out.println("A temperatura em Farenheit é " + temperaturaFarenheit);

	}

}
