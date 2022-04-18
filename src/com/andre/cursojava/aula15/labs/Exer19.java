package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero");
		double primeiroNumero = scan.nextDouble();
		
		System.out.println("Digite o segundo n�mero");
		double segundoNumero = scan.nextDouble();
		
		System.out.println("Qual opera��o deseja ? ( + - * /)");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(operacao) {
		case "+": resultado = primeiroNumero + segundoNumero; break;
		case "-": resultado = primeiroNumero - segundoNumero; break;
		case "*": resultado = primeiroNumero * segundoNumero; break;
		case "/": resultado = primeiroNumero / segundoNumero; break;
		default: 
			System.out.println("Opera��o inv�lida"); 
				valida = false; 
		}
		
		if (valida) {
			System.out.println("O resultado da opera��o escolhida � " + resultado);
			
			if (resultado % 2 == 0) {
				System.out.println("� um n�mero par");
			} else {
				System.out.println("� um n�mero �mpar");
			}
			
			if (resultado >= 0 ) {
				System.out.println("� um n�mero positivo");
			} else {
				System.out.println("� um n�mero negativo");
			}
		}
						
	}

}
