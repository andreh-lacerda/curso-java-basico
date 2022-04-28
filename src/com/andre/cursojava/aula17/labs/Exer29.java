package com.andre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para c�lculo de tabuada:");
		int numero = scan.nextInt();
		
		boolean invalido = true;
		int inicioTabuada, finalTabuada;
		
		do {
			
			System.out.println("Digite um n�mero inicial da tabuada:");
			inicioTabuada = scan.nextInt();
			
			System.out.println("Digite um n�mero final da tabuada:");
			finalTabuada = scan.nextInt();
			
			if ( finalTabuada > inicioTabuada) {
				invalido = false;
			}
			
		} while (invalido);
				
		
		System.out.println("Tabuada do " + numero + ":");
		System.out.println("Come�ando por " + inicioTabuada);
		System.out.println("Terminando por " + finalTabuada);
		System.out.println();
		
		for (int i = inicioTabuada; i <= finalTabuada; i++ ) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}

	}

}
