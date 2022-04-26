package com.andre.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de turmas");
		int turmas = scan.nextInt();
		
		int soma = 0;
		int media;
		int alunos;
		boolean invalida = true;
		
		for (int i = 1; i <= turmas; i++) {
			
			
			invalida = true;		
			do {
				System.out.println("Insira a quantidade de alunos da turma " + i);
				alunos = scan.nextInt();
				
				if ( alunos <= 40) {
					invalida = false;
				} else {
					System.out.println("A quantidade de alunos deve ser no máximo de 40");
				}
			} while (invalida);
			
				
			soma += alunos;	
		}
		
		media = soma / turmas; 
		
		System.out.println("Média de alunos por turma é: " + media);
	}	

}
