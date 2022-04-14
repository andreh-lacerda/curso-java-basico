package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		double numero1 = scan.nextDouble();
		System.out.println("Digite outro número");
		double numero2 = scan.nextDouble();
		
		if(numero1 > numero2) {
			System.out.println("O número maior é " + numero1);
		} else {
			System.out.println("O número maior é " + numero2);
		}

	}

}
