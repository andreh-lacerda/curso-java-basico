package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um ano com os 4 d�gitos(Ex.: 1999)");
		
		int ano = scan.nextInt();
		
		if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("� ano bisexto");
		} else {
			System.out.println("N�o � ano bisexto");
		}

	}

}
