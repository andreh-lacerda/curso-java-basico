package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		double numero1 = scan.nextDouble();
		System.out.println("Digite outro n�mero");
		double numero2 = scan.nextDouble();
		
		if(numero1 > numero2) {
			System.out.println("O n�mero maior � " + numero1);
		} else {
			System.out.println("O n�mero maior � " + numero2);
		}

	}

}
