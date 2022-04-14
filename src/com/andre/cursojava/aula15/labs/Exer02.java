package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor e direi se é positivo ou negativo");
		double valor = scan.nextDouble();
		
		if( valor < 0) {
			System.out.println("o valor " + valor + " é negativo");
		} else {
			System.out.println("o valor " + valor + " é positivo");
		}

	}

}
