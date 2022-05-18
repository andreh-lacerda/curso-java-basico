package com.andre.cursojava.aula49;

public class TestandoFinally {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denominador = {2, 0, 4, 8, 0};
		
		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominador[i] + " = " + (numeros[i] / denominador[i]));
			}
			catch(ArithmeticException exception1) {
				System.out.println("Erro ao dividir por zero");
			}
			catch(ArrayIndexOutOfBoundsException expection2) {
				System.out.println("Posi��o do array inv�lida");
			}
			finally {
				System.out.println("Esta linha � impressa sempre ap�s o try ou catch");
			}
		}

	}

}
