package com.andre.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor do vetorA na posi��o: " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] % 2;
		}
		
		System.out.print("vetor A = ");
		for( int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("vetor B = ");
		for( int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();

	}

}
