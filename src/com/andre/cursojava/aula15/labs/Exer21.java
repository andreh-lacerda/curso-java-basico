package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de litros que deseja abastecer. Ex. 10");
		double litros = scan.nextDouble();
		
		System.out.println("Digite a letra do combustível que deseja. G para gasolina e A para álcool");
		String combustivel = scan.next();
		
		double valorGasolina = 2.50;
		double valorAlcool = 1.90;
		
		double porcentagemDesconto = 0;
		double valorDesconto = 0;
		double valorPagoSemDesconto = 0;
	
						
		if (combustivel.equalsIgnoreCase("G")) {
			
			if (litros <= 20 ) {
				porcentagemDesconto = 4;
			} else if (litros > 20) {
				porcentagemDesconto = 6;
			}

			valorPagoSemDesconto = litros * valorGasolina;
				
		} else if (combustivel.equalsIgnoreCase("A")) {
			if (litros <= 20 ) {
				porcentagemDesconto = 3;
			} else if (litros > 20) {
				porcentagemDesconto = 5;
			}
			
			valorPagoSemDesconto = litros * valorAlcool;
		}
		
		valorDesconto = (valorPagoSemDesconto / 100) * porcentagemDesconto;
		
		double valorPagoComDesconto = valorPagoSemDesconto - valorDesconto;
		
			
				
		System.out.println("O valor do combustivel sem desconto é R$: " + valorPagoSemDesconto);
		System.out.println("O valor do desconto total é R$: " + valorDesconto);
		System.out.println("O valor do combustivel com desconto é R$: " + valorPagoComDesconto);

	}

}
