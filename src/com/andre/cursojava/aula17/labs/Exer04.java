package com.andre.cursojava.aula17.labs;

public class Exer04 {

	public static void main(String[] args) {
		
		int populacaoA = 80000;
		int populacaoB = 200000;
		int cont = 0;
	
		while ( populacaoA <= populacaoB ) {
			
			populacaoA += (populacaoA / 100) * 3;
			populacaoB += (populacaoB / 100) * 1.5;
			cont++;
		}
		
		System.out.println("Levará " + cont + " anos para população A passar a B");

	}

}
