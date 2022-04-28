package com.andre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de temperaturas");
		int qtdTemperaturas = scan.nextInt();
		
		double temperatura;
		double soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		for (int i = 1; i <= qtdTemperaturas; i++) {
			
			System.out.println("Informe a temperatura " + i);
			temperatura = scan.nextDouble();
			
			soma += temperatura;
			
			if (temperatura > maior) {
				maior = temperatura;
			}
			
			if (temperatura < menor) {
				menor = temperatura;
			}
		}
		
		System.out.println("Média: " + (soma / qtdTemperaturas));
		System.out.println("Menor temperatura: " + menor);
		System.out.println("Maior temperatura: " + maior);

	}

}
