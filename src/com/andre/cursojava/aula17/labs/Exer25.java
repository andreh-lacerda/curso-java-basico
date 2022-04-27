package com.andre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double valorProduto;
		double totalCompra;
		double dinheiroCliente;
		double troco;
		int qtdeProdutos;
		String prosseguirCompra;
		String output;
		boolean fechaConta = false;


		do {

			System.out.println("Deseja inserir nova compra? S/N");
			prosseguirCompra = scan.next();

			if (prosseguirCompra.equalsIgnoreCase("s")) {

				output = "Lojas Tabajara\n";

				System.out.println("Insira a quantidade de produtos: ");
				qtdeProdutos = scan.nextInt();

				totalCompra = 0;

				for ( int i = 1; i <= qtdeProdutos; i++) {
					System.out.println("Insira o valor do Produto " + i + ": R$ ");
					valorProduto = scan.nextDouble();
					totalCompra += valorProduto;
					output += "Produto " + i + ": R$ " + valorProduto + "\n";
				}

				output += "Total: R$ " + totalCompra + "\n";

				System.out.println("Total: R$ " + totalCompra);

				System.out.println("Insira o valor em dinheiro recebido pelo cliente");
				dinheiroCliente = scan.nextDouble();

				output += "Dinheiro: R$ " + dinheiroCliente + "\n";

				troco = dinheiroCliente - totalCompra;

				output += "Troco: R$ " + troco;

				System.out.println(output);

			} else {
				fechaConta = true;
			}

		} while (!fechaConta);

	}

}
