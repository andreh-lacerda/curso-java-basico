package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		double primeiroNumero = scan.nextDouble();
		
		System.out.println("Digite o segundo número");
		double segundoNumero = scan.nextDouble();
		
		System.out.println("Qual operação deseja ? ( + - * /)");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(operacao) {
		case "+": resultado = primeiroNumero + segundoNumero; break;
		case "-": resultado = primeiroNumero - segundoNumero; break;
		case "*": resultado = primeiroNumero * segundoNumero; break;
		case "/": resultado = primeiroNumero / segundoNumero; break;
		default: 
			System.out.println("Operação inválida"); 
				valida = false; 
		}
		
		if (valida) {
			System.out.println("O resultado da operação escolhida é " + resultado);
			
			if (resultado % 2 == 0) {
				System.out.println("É um número par");
			} else {
				System.out.println("É um número ímpar");
			}
			
			if (resultado >= 0 ) {
				System.out.println("É um número positivo");
			} else {
				System.out.println("É um número negativo");
			}
		}
						
	}

}
