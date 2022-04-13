package com.andre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para o cálculo ideal do seu peso, digite sua altura: ");
		float altura = Float.parseFloat(scan.next());
		float pesoIdeal = (72.7f * altura) - 58;
		System.out.println("Seu peso ideal é " + pesoIdeal);

	}

}
