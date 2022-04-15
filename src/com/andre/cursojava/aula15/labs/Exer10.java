package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu salário. (exemplo: 1500.00)");
		
		double salarioAtual = scan.nextDouble();
		double aumento20 = salarioAtual * 0.20;
		double aumento15 = salarioAtual * 0.15;
		double aumento10 = salarioAtual * 0.10;
		double aumento5 = salarioAtual * 0.05;
		
		if( salarioAtual <= 280) {
			System.out.println("Salário antes do reajuste R$ " + salarioAtual);
			System.out.println("Aumento de 20%");
			System.out.println("Valor do aumento R$ " + aumento20);
			System.out.println("Novo salário R$ " + (salarioAtual + aumento20));
		} else if ( salarioAtual > 280 && salarioAtual <= 700) {
			System.out.println("Salário antes do reajuste R$ " + salarioAtual);
			System.out.println("Aumento de 15%");
			System.out.println("Valor do aumento R$ " + aumento15);
			System.out.println("Novo salário R$ " + (salarioAtual + aumento15));
		} else if ( salarioAtual > 700 && salarioAtual <= 1500) {
			System.out.println("Salário antes do reajuste R$ " + salarioAtual);
			System.out.println("Aumento de 10%");
			System.out.println("Valor do aumento R$ " + aumento10);
			System.out.println("Novo salário R$ " + (salarioAtual + aumento10));
		} else if ( salarioAtual > 1500) {
			System.out.println("Salário antes do reajuste R$ " + salarioAtual);
			System.out.println("Aumento de 5%");
			System.out.println("Valor do aumento R$ " + aumento5);
			System.out.println("Novo salário R$ " + (salarioAtual + aumento5));
		}

	}

}
