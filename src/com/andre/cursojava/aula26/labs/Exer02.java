package com.andre.cursojava.aula26.labs;

public class Exer02 {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaCorrente.agencia = "1234";
		contaCorrente.numero = "123456";
		contaCorrente.especial = true;
		contaCorrente.limiteEspecial = 500;
		contaCorrente.valorEspecialUsado = 0;
		contaCorrente.saldo = -10;
		
		boolean saqueEfetuado = contaCorrente.realizarSaque(10);
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			contaCorrente.consultarSaldo();
		} else {
			System.out.println("N�o foi poss�vel realizar saque. Saldo insuficiente");
		}
		
		saqueEfetuado = contaCorrente.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			contaCorrente.consultarSaldo();
		} else {
			System.out.println("N�o foi poss�vel realizar saque. Saldo insuficiente");
		}
		
		System.out.println("Dep�sito de 500 reais");
		contaCorrente.depositar(500);
		contaCorrente.consultarSaldo();
		
		if (contaCorrente.verificarUsoChequeEspecial()) {
			System.out.println("Est� utilizando cheque especial");
		} else {
			System.out.println("N�o est� utilizando cheque especial");
		}
		
		contaCorrente.realizarSaque(600);
		contaCorrente.consultarSaldo();
		if (contaCorrente.verificarUsoChequeEspecial()) {
			System.out.println("Est� utilizando cheque especial");
		} else {
			System.out.println("N�o est� utilizando cheque especial");
		}

	}

}
