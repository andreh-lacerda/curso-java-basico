package com.andre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int populacaoA;
		int populacaoB;
		double taxaCrescimentoA;
		double taxaCrescimentoB;
		
		boolean valido = false;
		
		do {
			System.out.println("Insira o n�mero da popula��o A");
			populacaoA = scan.nextInt();
			
			if (populacaoA > 0) {
				valido = true;
			} else {
				System.out.println("A popula��o deve ser maior que 0");
			}
		
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Insira o valor da taxa de crescimento da popula��o A");
			taxaCrescimentoA = scan.nextDouble();
			
			if (taxaCrescimentoA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa da popula��o deve ser maior que 0");
			}
		
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Insira o n�mero da popula��o B");
			populacaoB = scan.nextInt();
			
			if (populacaoB > 0) {
				valido = true;
			} else {
				System.out.println("A popula��o deve ser maior que 0");
			}
		
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Insira o valor da taxa de crescimento da popula��o B");
			taxaCrescimentoB = scan.nextDouble();
			
			if (taxaCrescimentoB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa da popula��o deve ser maior que 0");
			}
		
		} while (!valido);
		

		int cont = 0;
	
		while ( populacaoA <= populacaoB ) {
			
			populacaoA += (populacaoA / 100) * taxaCrescimentoA;
			populacaoB += (populacaoB / 100) * taxaCrescimentoB;
			cont++;
		}
		
		System.out.println("Levar� " + cont + " anos para popula��o A passar a B");

	}

}
