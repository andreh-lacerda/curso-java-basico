package com.andre.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade em kilos que deseja comprar morangos. Exemplo: 5");
		double kiloMorango = scan.nextInt();
		
		System.out.println("Digite a quantidade em kilos que deseja comprar maçãs. Exemplo: 3");
		double kiloMaca = scan.nextInt();
		
		double valorMorangoKg = 0;
		double valorMacaKg = 0;
		double totalKilos = kiloMorango + kiloMaca;
						
		if ( kiloMorango <= 5) {
			valorMorangoKg = 2.5;
		} else if (kiloMorango > 5) {
			valorMorangoKg = 2.2;
		}
		
		double precoTotalMorango = kiloMorango * valorMorangoKg;
		
		if ( kiloMaca <= 5) {
			valorMacaKg = 1.8;
		} else if (kiloMaca > 5) {
			valorMacaKg = 1.5;
		}
		
		double precoTotalMaca = kiloMaca * valorMacaKg;
		
		double precoTotalSemDesconto = precoTotalMorango + precoTotalMaca;
		
		double valorDesconto = (precoTotalSemDesconto / 100) * 10;
		
		double precoTotalComDesconto = precoTotalSemDesconto - valorDesconto;
		
		if ( totalKilos > 8 || precoTotalSemDesconto > 25) {
			System.out.println("O valor total das compras com desconto é R$ " + precoTotalComDesconto);
		} else {
			System.out.println("O valor total das compras é R$ " + precoTotalSemDesconto);
		}
		

	}

}
