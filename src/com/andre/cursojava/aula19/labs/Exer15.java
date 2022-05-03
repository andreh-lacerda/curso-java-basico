package com.andre.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for ( int i = 0; i < vetorA.length; i++) {
			System.out.println(" Insira o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		int impar = 0;
		for ( int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				impar++;
			}
		}
		
		int par = vetorA.length - impar;
		double porcentagemPar = ( par * 100) / vetorA.length;
		double porcentagemImpar = 100 - porcentagemPar;
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Porcentagem pares: " + porcentagemPar);
		System.out.println("Porcentagem ímpares: " + porcentagemImpar);
	}

}
