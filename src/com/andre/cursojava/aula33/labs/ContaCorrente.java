package com.andre.cursojava.aula33.labs;

public class ContaCorrente {

	private String numero;
	private String agencia;
	private double saldo;
	private boolean especial;
	private double limiteEspecial;


	public ContaCorrente() {}

	public ContaCorrente(String numero, double saldo, boolean especial, double limiteEspecial) {
		this.numero = numero;
		this.saldo = saldo;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}


	public boolean realizarSaque(double quantiaASacar) {

		if ( saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else if (especial) {
			double limite = limiteEspecial + saldo;
			if ( limite >= quantiaASacar) {
				saldo -= quantiaASacar;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public void depositar(double valorDepositado) {

		saldo += valorDepositado;
	}

	public void consultarSaldo() {
		System.out.println("Saldo atual da conta = " + saldo);
	}

	public boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}


}
