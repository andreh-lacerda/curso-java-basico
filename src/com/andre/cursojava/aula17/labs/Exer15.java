package com.andre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o enésimo termo da série de Fibonacci");
		int numero = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		for ( int i = 3; i <= numero; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}

	}

}
