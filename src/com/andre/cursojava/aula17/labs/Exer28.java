package com.andre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um númeor");
		int numero = scan.nextInt();
		
		boolean primo;
		
		for (int i = 1; i <= numero; i++) {
			
			primo = true;
			
			for (int j = 2; j < i; j++) {
				if( i % j == 0) {
					primo = false;
				}
			}
			
			if ( primo ) {
				System.out.println(i);
			}
		}

	}

}
