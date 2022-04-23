package com.andre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número base");
		int base = scan.nextInt();
		
		System.out.println("Digite outro número expoente");
		int expoente = scan.nextInt();
		
		int resultado = base;
		
		for (int i=1; i<expoente; i++) {
			resultado *= base;
		}
		
		System.out.println("Resultado: " + resultado);

	}

}
