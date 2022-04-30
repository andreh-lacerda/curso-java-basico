package com.andre.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.print("Valor de vetor A: ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println(" ");
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.print("Valor de vetor B: ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
		}
		System.out.println(" ");
	}

}
