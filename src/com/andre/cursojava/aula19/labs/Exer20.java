package com.andre.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Informe a cotação a dólar:");
		cotacao = scan.nextDouble();
		
		for ( int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i+1);
		}
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.print("Vetor A = ");
		for ( int i = 0; i < vetorA.length; i++) {
			System.out.print(df.format(vetorA[i]) + " ");
		}
		System.out.println();

	}

}
