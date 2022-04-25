package com.andre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int numero = scan.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < numero; i++ ) {
			if (numero % i == 0) {
				System.out.println("Este n�o � um n�mero primo");
				primo = false;
			}
			
		}
		
		if (primo) {
			System.out.println("Este � um n�mero primo");
		}
		
	}

}
