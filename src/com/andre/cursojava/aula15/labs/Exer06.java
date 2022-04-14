package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite um número");
		double numero1 = scan.nextDouble();
		
		System.out.println("digite outro número");
		double numero2 = scan.nextDouble();
		
		System.out.println("digite mais um número");
		double numero3 = scan.nextDouble();
		
		if( numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("O maior número é o " + numero1);
		} else if ( numero2 >= numero1 && numero2 >= numero3 ) {
			System.out.println("O maior número é o " + numero2);
		} else if ( numero3 >= numero1 && numero3 >= numero2) {
			System.out.println("O maior número é o " + numero3);
		} 

	}

}
