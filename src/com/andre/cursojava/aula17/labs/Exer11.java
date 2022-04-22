package com.andre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número");
		int num1 = scan.nextInt();

		System.out.println("Digite outro número");
		int num2 = scan.nextInt();
		
		int soma = 0;

		for ( int i = num1; i <= num2; i++) {
			soma += i;
		}
		
		System.out.println("Soma é: " + soma);

	}

}
