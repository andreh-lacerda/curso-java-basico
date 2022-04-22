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
			System.out.println("Insira o número da população A");
			populacaoA = scan.nextInt();
			
			if (populacaoA > 0) {
				valido = true;
			} else {
				System.out.println("A população deve ser maior que 0");
			}
		
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Insira o valor da taxa de crescimento da população A");
			taxaCrescimentoA = scan.nextDouble();
			
			if (taxaCrescimentoA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa da população deve ser maior que 0");
			}
		
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Insira o número da população B");
			populacaoB = scan.nextInt();
			
			if (populacaoB > 0) {
				valido = true;
			} else {
				System.out.println("A população deve ser maior que 0");
			}
		
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Insira o valor da taxa de crescimento da população B");
			taxaCrescimentoB = scan.nextDouble();
			
			if (taxaCrescimentoB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa da população deve ser maior que 0");
			}
		
		} while (!valido);
		

		int cont = 0;
	
		while ( populacaoA <= populacaoB ) {
			
			populacaoA += (populacaoA / 100) * taxaCrescimentoA;
			populacaoB += (populacaoB / 100) * taxaCrescimentoB;
			cont++;
		}
		
		System.out.println("Levará " + cont + " anos para população A passar a B");

	}

}
