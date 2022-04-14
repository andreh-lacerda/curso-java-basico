package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra e direi se é vogal ou consoante");
		
		String letra = scan.next();
		
		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida");
		} else {
			switch(letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("A letra digitada é uma vogal"); break;
			default: System.out.println("A letra digitada é uma consoante");
			}
		}
	}

}
