package com.andre.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++ ) {
			System.out.println("Insira o valor do vetorA na posi��o: " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Insira o valor do vetorB na posi��o: " + i);
			vetorB[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
		}
		
		System.out.print("Valor vetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Valor vetorB = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		System.out.print("Valor vetorC = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();
	}

}
