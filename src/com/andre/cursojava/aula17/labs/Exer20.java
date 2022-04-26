package com.andre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número de pessoas");
		int pessoas = scan.nextInt();
		
		int soma = 0;
		double media;
		int idade;
		
		for (int i = 0; i < pessoas; i++) {
			System.out.println("Insira a idade a partir de 0 anos: " + (i+1));
			idade = scan.nextInt();
			
			soma += idade;
		}
		
		media = soma / pessoas;
		
		System.out.println("Média de idade: " + media);
		
		if ( media >=0 && media <=25) {
			System.out.println("A turma é jovem");
		} else if ( media >=26 && media <=60) {
			System.out.println("A turma é adulta");
		} else if ( media > 60) {
			System.out.println("A turma é idosa");
		}

	}

}
