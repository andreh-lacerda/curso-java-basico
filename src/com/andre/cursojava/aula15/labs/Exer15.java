package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer15 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero de um lado do triângulo");
		double ladoTriangulo1 = scan.nextDouble();
		
		System.out.println("Digite o numero de outro lado do triângulo");
		double ladoTriangulo2 = scan.nextDouble();
		
		System.out.println("Digite o numero do último lado do triângulo");
		double ladoTriangulo3 = scan.nextDouble();
		
		
		if ((ladoTriangulo1 + ladoTriangulo2) > ladoTriangulo3 
				|| (ladoTriangulo1 + ladoTriangulo3) > ladoTriangulo2 
				|| (ladoTriangulo2 + ladoTriangulo3) > ladoTriangulo1) {
			if (ladoTriangulo1 == ladoTriangulo2 && ladoTriangulo1 == ladoTriangulo3 && ladoTriangulo2 == ladoTriangulo3) {
				System.out.println("Este é um triângulo Equilátero");
			} else if (ladoTriangulo1 == ladoTriangulo2 || ladoTriangulo1 == ladoTriangulo3 || ladoTriangulo2 == ladoTriangulo3) {
				System.out.println("Este é um triângulo Isóceles");
			} else if (ladoTriangulo1 != ladoTriangulo2 && ladoTriangulo1 != ladoTriangulo3 && ladoTriangulo2 != ladoTriangulo3) {
				System.out.println("Este é um triângulo Escaleno");
			}
		} else {
			System.out.println("Não forma um triângulo");
		}
		
	}

}
