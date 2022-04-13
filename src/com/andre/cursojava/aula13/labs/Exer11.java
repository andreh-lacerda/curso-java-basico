package com.andre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 2 números inteiros e 1 número real");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		double numero3 = scan.nextDouble();
		int resultadoA = (numero1 * 2) + (numero2 / 2);
		double resultadoB = (numero1 * 3) + numero3;
		double resultadoC = numero3 * numero3 * numero3;
		System.out.println(resultadoA);
		System.out.println(resultadoB);
		System.out.println(resultadoC);

	}

}
