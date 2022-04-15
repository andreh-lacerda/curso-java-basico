package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor do produto 1");
		double produto1 = scan.nextDouble();
		
		System.out.println("Insira o valor do produto 2");
		double produto2 = scan.nextDouble();

		System.out.println("Insira o valor do produto 3");
		double produto3 = scan.nextDouble();
		
		if( produto1 <= produto2 && produto1 <= produto3) {
			System.out.println("O produto mais barato é o produto 1");
		} else if ( produto2 <= produto1 && produto2 <= produto3 ) {
			System.out.println("O produto mais barato é o produto 2");
		} else if ( produto3 <= produto1 && produto3 <= produto2) {
			System.out.println("O produto mais barato é o produto 3");
		}


	}

}
