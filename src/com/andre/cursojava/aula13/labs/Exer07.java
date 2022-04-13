package com.andre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número para o cálculo da área do quadrado");
		float numero = Float.parseFloat(scan.next());
		float areaQuadrado = numero * numero;
		float dobroAreaQuadrado = areaQuadrado * 2;
		System.out.println("O dobro da área é: " + dobroAreaQuadrado);

	}

}
