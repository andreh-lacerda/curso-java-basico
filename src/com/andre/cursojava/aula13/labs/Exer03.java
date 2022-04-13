package com.andre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 2 números");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int resultado = numero1 + numero2;
		System.out.println("A soma dos 2 númeors é " + resultado);
	}

}
