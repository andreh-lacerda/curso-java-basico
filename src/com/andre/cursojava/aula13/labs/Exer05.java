package com.andre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero em metros e ser� convertido para cent�metros");
		float metro = Float.parseFloat(scan.next());
		float centimetro = metro * 100;
		System.out.println("O resultado em cent�metros �: " + centimetro);

	}

}
