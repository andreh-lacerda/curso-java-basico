package com.andre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite as 4 notas bimestrais");
		float nota1 = Float.parseFloat(scan.next());
		float nota2 = Float.parseFloat(scan.next());
		float nota3 = Float.parseFloat(scan.next());
		float nota4 = Float.parseFloat(scan.next());
		float resultado = nota1 + nota2 + nota3 + nota4;
		float media = resultado / 4;
		System.out.println("A sua média é: " + media);

	}

}
