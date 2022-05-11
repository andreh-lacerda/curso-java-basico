package com.andre.cursojava.aula34.labs;

public class Exer02 {

	public static void main(String[] args) {
		
		imprimirTela(Calculadora.soma(1, 2));
		
		imprimirTela(Calculadora.subtrair(2, 1));
		
		imprimirTela(Calculadora.multiplicar(2, 2));
		
		imprimirTela(Calculadora.dividir(4, 2));
		
		imprimirTela(Calculadora.potencia(2, 3));
	}
	
	static void imprimirTela(double num) {
		System.out.println(num);
	}

}
