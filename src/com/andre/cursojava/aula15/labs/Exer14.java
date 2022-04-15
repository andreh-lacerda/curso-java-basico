package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		String conceito = "";
		
		if( media > 9 ) {
			conceito = "A";
		} else if ( media > 7.5 && media <= 9 ) {
			conceito = "B";
		} else if ( media > 6 && media <= 7.5) {
			conceito = "C";
		} else if ( media > 4 && media <= 6) {
			conceito = "D";
		} else if ( media <= 4) {
			conceito = "E";
		}
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Media: " + media);
		System.out.println("Conceito: " + conceito);
		
		switch(conceito) {
		case "A":
		case "B":
		case "C": System.out.println("Aprovado"); break;
		case "D":
		case "E": System.out.println("Reprovado"); break;
		}

	}

}
