package com.andre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de CDs da cole��o");
		int quantidadeCds = scan.nextInt();
		
		double soma = 0;
		double media;
		double valorCd;
		
		for (int i = 0; i < quantidadeCds; i++) {
			System.out.println("Insira o valor do CD " + (i+1));
			valorCd = scan.nextDouble();
			
			soma += valorCd;
		}
		
		media = soma / quantidadeCds;
		
		System.out.println("O valor total investido em CDs � de R$: " + soma);
		System.out.println("O valor m�dio gasto em cada um deles �: " + media);

	}

}
