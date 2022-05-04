package com.andre.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for ( int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor para a posi��o " + i);
			vetorA[i] = scan.nextInt();
		}
		
		boolean palindromo = true;
		for ( int i = 0; i < (vetorA.length / 2); i++) {
			if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromo = false;
				break;
			}
		}
		
		System.out.print("Vetor A = ");
		for ( int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		if (palindromo) {
			System.out.println("Palindromo");
		} else {
			System.out.println("N�o � palindromo");
		}
	}

}
