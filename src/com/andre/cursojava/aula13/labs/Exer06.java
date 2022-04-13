package com.andre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio de um círculo");
		float raio = Float.parseFloat(scan.next());
		float pi = 3.14f;
		float areaDoCirculo = pi * raio * raio;
		System.out.println("A área do círculo é:" + areaDoCirculo);

	}

}
