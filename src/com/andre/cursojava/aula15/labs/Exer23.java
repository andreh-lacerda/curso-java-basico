package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o tipo de carne que deseja:");
		System.out.println("1 - Filé Duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		int tipoCarne = scan.nextInt();

		System.out.println("Digite a quantidade em kgs. Exemplo 3");
		double quantidadeKg = scan.nextDouble();

		double valorKilo = 0;


		if ( tipoCarne == 1) {

			System.out.println(quantidadeKg + "kg - Filé Duplo");

			if ( quantidadeKg <= 5) {
				valorKilo = 4.9;
			} else if( quantidadeKg > 5) {
				valorKilo = 5.8;
			}
		} else if ( tipoCarne == 2) {

			System.out.println(quantidadeKg + "kg - Alcatra");

			if ( quantidadeKg <= 5) {
				valorKilo = 5.9;
			} else if( quantidadeKg > 5) {
				valorKilo = 6.8;
			}		
		} else if ( tipoCarne == 3) {

			System.out.println(quantidadeKg + "kg - Picanha");

			if ( quantidadeKg <= 5) {
				valorKilo = 6.9;
			} else if( quantidadeKg > 5) {
				valorKilo = 7.8;
			}
		}

		double valorTotal = quantidadeKg * valorKilo;
		
		System.out.println(quantidadeKg + "kg " + "Valor do kilo R$: " + valorKilo + " = R$: " + valorTotal);
		
		System.out.println("Compra no cartão ? digite 1 para sim:");
		int cartao = scan.nextInt();
		
		if (cartao == 1) {
			double desconto = (valorTotal / 100) * 5;
			System.out.println("Desconto de: " + desconto);
			System.out.println("Valor a pagar: " + (valorTotal - desconto));
		} else {
			System.out.println("Valor a pagar: " + valorTotal);
		}
	}

}
