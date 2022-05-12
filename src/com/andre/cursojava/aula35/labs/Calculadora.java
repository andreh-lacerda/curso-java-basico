package com.andre.cursojava.aula35.labs;

public class Calculadora {
	
	public static int fibonacci(int num) {
		
		if (num < 2) {
			return num;
		}
		
		return fibonacci(num - 1) + fibonacci(num - 2);
	}
	
	public static int somatorio(int num) {
		
		if (num == 1) {
			return 1;
		}
		return num + somatorio(num - 1);
	}

}
