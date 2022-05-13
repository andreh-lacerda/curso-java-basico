package com.andre.cursojava.aula37ate43.labs.exer01;

public class Teste {
	
	public static void main(String[] args) {
		
		System.out.println("*** Teste ContaBancaria ***");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumConta("11111");
		
		contaSimples.depositar(100);
		
		realizarSaque(contaSimples, 50);
		
		realizarSaque(contaSimples, 70);
		
		System.out.println(contaSimples);
		
		System.out.println("*** Teste ContaPoupan�a ***");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente Conta Poupan�a");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setDiaRendimento(14);
		
		contaPoupanca.depositar(100);
		
		realizarSaque(contaPoupanca, 50);
		
		realizarSaque(contaPoupanca, 70);
		
		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo � de = " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje n�o � dia de rendimento, novo saldo n�o calculado");
		}
		
		System.out.println(contaPoupanca);
		
		System.out.println("*** Teste ContaEspecial ***");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Cliente Conta Especial");
		contaEspecial.setNumConta("33333");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);
		
		realizarSaque(contaEspecial, 50);
		
		realizarSaque(contaEspecial, 70);
		
		realizarSaque(contaEspecial, 80);
		
		System.out.println(contaEspecial);
	}
	
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de " + valor + ". Saldo atual de = " + conta.getSaldo());
		}
	}

}