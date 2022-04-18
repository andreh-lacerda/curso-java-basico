package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		
		int numero = scan.nextInt();
		
		if( numero % 2 == 0) {
			System.out.println("É um número par");
		} else {
			System.out.println("É um número ímpar");
		}

	}

}
