package com.andre.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Informe a idade de uma pessoa " + (i + 1));
			idades[i] = scan.nextInt();
		}
		
		int idadeMaior35 = 0;
		
		for (int i = 0; i < idades.length; i++) {
			if(idades[i] > 35) {
				idadeMaior35++;
			}
		}
		
		System.out.print("Vetor de idades = ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		
		System.out.println("A quantidade de pessoas acima dos 35 anos são: " + idadeMaior35);

	}

}
