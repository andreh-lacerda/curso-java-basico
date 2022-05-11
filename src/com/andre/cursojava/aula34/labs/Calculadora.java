package com.andre.cursojava.aula34.labs;

public class Calculadora {
	
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double dividir(double num1, double num2) {
		return num1 / num2;
	}
	
	public static double potencia(double num1, double num2) {
		
		double total = 1;
		for (int i = 1; i <= num2; i++) {
			total *= num1;
		}
		return total;
	}
	
	public static int fatorial(int num) {
		
		if (num == 0) {
			return 1;
		}
		
		int total = 1;
		for (int i = num; i > 1; i--) {
			total *= i;
		}
		
		return total;
	}

}
