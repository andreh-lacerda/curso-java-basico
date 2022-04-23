package com.andre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número para cálculo de tabuada:");
		int numero = scan.nextInt();
		
		System.out.println("Tabuada do " + numero + ":");
		
		for (int i = 1; i <= 10; i++ ) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}

	}

}
