package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o sexo F ou M");
		
		String sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("f")) {
			System.out.println("F - feminino");
		} else if (sexo.equalsIgnoreCase("m")) {
			System.out.println("M - masculino");
		} else {
			System.out.println("Sexo inválido");
		}

	}

}
