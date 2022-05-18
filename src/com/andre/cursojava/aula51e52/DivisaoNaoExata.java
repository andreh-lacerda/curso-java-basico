package com.andre.cursojava.aula51e52;

public class DivisaoNaoExata extends Exception {

	private int numero;
	private int denominador;
	
	public DivisaoNaoExata(int numero, int denominador) {
		super();
		this.numero = numero;
		this.denominador = denominador;
	}
	
	@Override
	public String toString() {
		return "Resultado de  " + numero + "/" + denominador + " n�o � um inteiro!";
	}
	
	

}
